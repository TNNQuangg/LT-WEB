package com.example.WEB_SHOP.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
    private String status;  // Ví dụ: "SUCCESS", "ERROR"
    private String message; // Ví dụ: "Đăng nhập thành công"
    private T data;         // Dữ liệu kèm theo (Ví dụ: thông tin Customer), có thể null
}
