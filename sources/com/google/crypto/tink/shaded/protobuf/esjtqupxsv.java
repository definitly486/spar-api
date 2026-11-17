package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class esjtqupxsv {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final ByteBuffer f23923eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final dxjokdxxww f23924gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final byte[] f23927wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final Charset f23925iobyxmoadg = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final Charset f23928zoijcleaow = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final Charset f23926ppxfxbqfkf = Charset.forName("ISO-8859-1");

    public interface iobyxmoadg {
    }

    public interface ppxfxbqfkf {
        boolean isInRange(int i13);
    }

    public interface wkgbmnqykc extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        wkgbmnqykc mutableCopyWithCapacity(int i13);
    }

    public interface zoijcleaow {
    }

    static {
        byte[] bArr = new byte[0];
        f23927wkgbmnqykc = bArr;
        f23923eablkybsjg = ByteBuffer.wrap(bArr);
        f23924gxszxtbevo = dxjokdxxww.nufgyqmvbu(bArr);
    }

    public static String dxjokdxxww(byte[] bArr) {
        return new String(bArr, f23928zoijcleaow);
    }

    static int eablkybsjg(byte[] bArr, int i13, int i14) {
        int iNufgyqmvbu = nufgyqmvbu(i14, bArr, i13, i14);
        if (iNufgyqmvbu == 0) {
            return 1;
        }
        return iNufgyqmvbu;
    }

    public static int gxszxtbevo(long j13) {
        return (int) (j13 ^ (j13 >>> 32));
    }

    static Object iobyxmoadg(Object obj) {
        obj.getClass();
        return obj;
    }

    public static boolean lqeggnwhkg(byte[] bArr) {
        return ydmasvzmpa.wflxmlrfwp(bArr);
    }

    static int nufgyqmvbu(int i13, byte[] bArr, int i14, int i15) {
        for (int i16 = i14; i16 < i14 + i15; i16++) {
            i13 = (i13 * 31) + bArr[i16];
        }
        return i13;
    }

    public static int ppxfxbqfkf(boolean z13) {
        return z13 ? 1231 : 1237;
    }

    public static int wkgbmnqykc(byte[] bArr) {
        return eablkybsjg(bArr, 0, bArr.length);
    }

    static Object zoijcleaow(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
