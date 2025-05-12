package com.cv.core.s09coresecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeyAliasConfigDto {
    private String name;
    private String keyPassword;
}
