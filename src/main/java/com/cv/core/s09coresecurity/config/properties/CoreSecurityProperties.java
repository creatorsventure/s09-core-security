package com.cv.core.s09coresecurity.config.properties;

import com.cv.core.s09coresecurity.dto.KeyAliasConfigDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "security")
public class CoreSecurityProperties {
    private String keystorePath;
    private String keystorePassword;
    private KeyAliasConfigDto keystoreCurrentAlias;
    private List<KeyAliasConfigDto> keystoreOldAliases;
    private String JWTSecret;
    private Long JWTAccessTokenExpirationMins;
    private Long JWTRefreshTokenExpirationMins;
    private Integer emailLinkExpiryHrs;
    private Integer otpExpiryMins;
    private Integer defaultCacheExpiryMins;
    private Integer feignCacheExpiryMins;
    private Integer contextCacheExpiryHrs;
}
