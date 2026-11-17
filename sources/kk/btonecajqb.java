package kk;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb {
    public static String iobyxmoadg(String source) {
        MessageDigest messageDigest;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        try {
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e13) {
                e13.printStackTrace();
                messageDigest = null;
            }
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(messageDigest);
            messageDigest.reset();
            byte[] bytes = source.getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bArrDigest, "digest.digest(source.toByteArray())");
            return zoijcleaow(bArrDigest);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String zoijcleaow(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder(bArr.length * 2);
        for (byte b13 : bArr) {
            kotlin.jvm.internal.tzroggbefp tzroggbefpVar = kotlin.jvm.internal.tzroggbefp.f60034iobyxmoadg;
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b13 & 255)}, 1));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str, "format(format, *args)");
            sb3.append(str);
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "hex.toString()");
        return string;
    }
}
