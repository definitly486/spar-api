package rl;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {
    public static String eablkybsjg(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException unused) {
            throw wkgbmnqykc(str);
        }
    }

    public static String gxszxtbevo(byte[] bArr) {
        return eablkybsjg(bArr, "UTF-8");
    }

    public static byte[] iobyxmoadg(String str) {
        return zoijcleaow(str, "US-ASCII");
    }

    public static byte[] ppxfxbqfkf(String str) {
        return zoijcleaow(str, "UTF-8");
    }

    private static IllegalStateException wkgbmnqykc(String str) {
        return new IllegalStateException("Unknown or unsupported character set name: " + str);
    }

    public static byte[] zoijcleaow(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            throw wkgbmnqykc(str2);
        }
    }
}
