package com.fastcampus.boardserver.dto.response;

import com.example.blog.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserInfoResponse {
    private UserDTO userDTO;
}