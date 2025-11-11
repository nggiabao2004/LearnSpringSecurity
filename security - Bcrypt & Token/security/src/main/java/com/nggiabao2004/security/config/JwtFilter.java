package com.nggiabao2004.security.config;

import com.nggiabao2004.security.service.JwtService;
import com.nggiabao2004.security.service.MyUserDetailsService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {
    @Autowired
    private JwtService jwtService;

    @Autowired
    ApplicationContext context;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // 1. Lấy header "Authorization"
        String authHeader = request.getHeader("Authorization");
        String token = null;
        String username = null;

        // 2. Kiểm tra header có hợp lệ không
        if(authHeader != null && authHeader.startsWith("Bearer ")){
            // 3. Lấy phần token (bỏ 7 ký tự "Bearer ")
            token = authHeader.substring(7);
            // 4. Lấy username từ token
            username = jwtService.extractUserName(token);
        }

        // 5. Kiểm tra username và xác thực
        if(username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            // Lấy UserDetails từ CSDL
            UserDetails userDetails = context.getBean(MyUserDetailsService.class).loadUserByUsername(username);
            // 6. Kiểm tra xem token có hợp lệ không
            if(jwtService.validateToken(token, userDetails)) {
                // 7. Nếu hợp lệ, tạo đối tượng Authentication
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                        userDetails,
                        null, // Không cần credentials
                        userDetails.getAuthorities()
                );
                // Gắn thêm chi tiết của request
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                // 8. CẬP NHẬT SecurityContextHolder (Báo cho Spring Security biết là người này đã được xác thực)
                SecurityContextHolder.getContext().setAuthentication(authToken);
            }
        }
        // 9. Tiếp tục chuỗi bộ lọc
        filterChain.doFilter(request, response);
    }
}
