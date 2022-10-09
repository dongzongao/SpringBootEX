package org.dongBootEx.dto;

import lombok.Data;

import java.util.List;
@Data
public class TokenUserDTO {

    private Long id;

    private String username;

    private String email;

    private String avatar;

    private List<String> roles;
}