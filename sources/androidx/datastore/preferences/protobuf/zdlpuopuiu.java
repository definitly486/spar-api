package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class zdlpuopuiu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final lqeggnwhkg f8901eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final byte[] f8903ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final ByteBuffer f8904wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final Charset f8902iobyxmoadg = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final Charset f8905zoijcleaow = Charset.forName("ISO-8859-1");

    public interface iobyxmoadg {
        boolean isInRange(int i13);
    }

    public interface zoijcleaow extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        zoijcleaow mutableCopyWithCapacity(int i13);
    }

    static {
        byte[] bArr = new byte[0];
        f8903ppxfxbqfkf = bArr;
        f8904wkgbmnqykc = ByteBuffer.wrap(bArr);
        f8901eablkybsjg = lqeggnwhkg.nufgyqmvbu(bArr);
    }

    public static String btonecajqb(byte[] bArr) {
        return new String(bArr, f8902iobyxmoadg);
    }

    static int dxjokdxxww(int i13, byte[] bArr, int i14, int i15) {
        for (int i16 = i14; i16 < i14 + i15; i16++) {
            i13 = (i13 * 31) + bArr[i16];
        }
        return i13;
    }

    static int eablkybsjg(byte[] bArr, int i13, int i14) {
        int iDxjokdxxww = dxjokdxxww(i14, bArr, i13, i14);
        if (iDxjokdxxww == 0) {
            return 1;
        }
        return iDxjokdxxww;
    }

    public static int gxszxtbevo(long j13) {
        return (int) (j13 ^ (j13 >>> 32));
    }

    static Object iobyxmoadg(Object obj) {
        obj.getClass();
        return obj;
    }

    public static boolean lqeggnwhkg(byte[] bArr) {
        return rlfsiqarku.wflxmlrfwp(bArr);
    }

    static Object nufgyqmvbu(Object obj, Object obj2) {
        return ((wwaezpbzkn) obj).toBuilder().wwaezpbzkn((wwaezpbzkn) obj2).buildPartial();
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
