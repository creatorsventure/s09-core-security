package com.cv.core.s09coresecurity.util;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.Security;

public class CoreSecurityUtil {

    private static boolean initialized = false;

    public static synchronized boolean registerBouncyCastle() {
        if (!initialized && Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
            initialized = true;
        }
        return initialized;
    }
}
