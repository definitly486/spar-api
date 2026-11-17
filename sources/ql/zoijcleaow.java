package ql;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    public static byte[] eablkybsjg(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            byte[] byteArray = bigInteger.toByteArray();
            return (bigInteger.bitLength() % 8 == 0 && byteArray[0] == 0 && byteArray.length > 1) ? rl.iobyxmoadg.ojitshcjhn(byteArray, 1, byteArray.length - 1) : byteArray;
        }
        throw new IllegalArgumentException("Cannot convert negative values to an unsigned magnitude byte array: " + bigInteger);
    }

    public static byte[] gxszxtbevo(BigInteger bigInteger, int i13) {
        byte[] bArrEablkybsjg = eablkybsjg(bigInteger);
        return i13 > bArrEablkybsjg.length ? rl.iobyxmoadg.wkgbmnqykc(new byte[i13 - bArrEablkybsjg.length], bArrEablkybsjg) : bArrEablkybsjg;
    }

    public static BigInteger iobyxmoadg(String str) {
        return zoijcleaow(new el.zoijcleaow().iobyxmoadg(str));
    }

    public static String ppxfxbqfkf(BigInteger bigInteger) {
        return new el.zoijcleaow().eablkybsjg(eablkybsjg(bigInteger));
    }

    public static String wkgbmnqykc(BigInteger bigInteger, int i13) {
        return new el.zoijcleaow().eablkybsjg(gxszxtbevo(bigInteger, i13));
    }

    public static BigInteger zoijcleaow(byte[] bArr) {
        return new BigInteger(1, bArr);
    }
}
