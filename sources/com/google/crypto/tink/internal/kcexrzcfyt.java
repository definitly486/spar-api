package com.google.crypto.tink.internal;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final Charset f23839iobyxmoadg = Charset.forName("UTF-8");

    public static final pb.iobyxmoadg eablkybsjg(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i13 = 0; i13 < str.length(); i13++) {
            bArr[i13] = wkgbmnqykc(str.charAt(i13));
        }
        return pb.iobyxmoadg.iobyxmoadg(bArr);
    }

    public static Integer iobyxmoadg() {
        if (zoijcleaow()) {
            return iobyxmoadg.iobyxmoadg();
        }
        return null;
    }

    public static int ppxfxbqfkf() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i13 = 0;
        while (i13 == 0) {
            secureRandom.nextBytes(bArr);
            i13 = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i13;
    }

    private static final byte wkgbmnqykc(char c13) {
        if (c13 >= '!' && c13 <= '~') {
            return (byte) c13;
        }
        throw new TinkBugException("Not a printable ASCII character: " + c13);
    }

    public static boolean zoijcleaow() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }
}
