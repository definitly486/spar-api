package cdpycssgdh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    static final Charset f19710eablkybsjg = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    static final String[] f19711gxszxtbevo = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    static final int[] f19712lqeggnwhkg = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    static final byte[] f19713nufgyqmvbu = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f19714iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final long f19715ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final byte[] f19716wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f19717zoijcleaow;

    lqeggnwhkg(int i13, int i14, byte[] bArr) {
        this(i13, i14, -1L, bArr);
    }

    public static lqeggnwhkg dxjokdxxww(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f19712lqeggnwhkg[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i13 : iArr) {
            byteBufferWrap.putShort((short) i13);
        }
        return new lqeggnwhkg(3, iArr.length, byteBufferWrap.array());
    }

    public static lqeggnwhkg eablkybsjg(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f19710eablkybsjg);
        return new lqeggnwhkg(2, bytes.length, bytes);
    }

    public static lqeggnwhkg gxszxtbevo(long j13, ByteOrder byteOrder) {
        return lqeggnwhkg(new long[]{j13}, byteOrder);
    }

    public static lqeggnwhkg iobyxmoadg(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new lqeggnwhkg(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f19710eablkybsjg);
        return new lqeggnwhkg(1, bytes.length, bytes);
    }

    public static lqeggnwhkg lqeggnwhkg(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f19712lqeggnwhkg[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j13 : jArr) {
            byteBufferWrap.putInt((int) j13);
        }
        return new lqeggnwhkg(4, jArr.length, byteBufferWrap.array());
    }

    public static lqeggnwhkg nufgyqmvbu(gtknphoqwx[] gtknphoqwxVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f19712lqeggnwhkg[5] * gtknphoqwxVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (gtknphoqwx gtknphoqwxVar : gtknphoqwxVarArr) {
            byteBufferWrap.putInt((int) gtknphoqwxVar.zoijcleaow());
            byteBufferWrap.putInt((int) gtknphoqwxVar.iobyxmoadg());
        }
        return new lqeggnwhkg(5, gtknphoqwxVarArr.length, byteBufferWrap.array());
    }

    public static lqeggnwhkg ppxfxbqfkf(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f19712lqeggnwhkg[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i13 : iArr) {
            byteBufferWrap.putInt(i13);
        }
        return new lqeggnwhkg(9, iArr.length, byteBufferWrap.array());
    }

    public static lqeggnwhkg wkgbmnqykc(gtknphoqwx[] gtknphoqwxVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f19712lqeggnwhkg[10] * gtknphoqwxVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (gtknphoqwx gtknphoqwxVar : gtknphoqwxVarArr) {
            byteBufferWrap.putInt((int) gtknphoqwxVar.zoijcleaow());
            byteBufferWrap.putInt((int) gtknphoqwxVar.iobyxmoadg());
        }
        return new lqeggnwhkg(10, gtknphoqwxVarArr.length, byteBufferWrap.array());
    }

    public static lqeggnwhkg zoijcleaow(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f19712lqeggnwhkg[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d13 : dArr) {
            byteBufferWrap.putDouble(d13);
        }
        return new lqeggnwhkg(12, dArr.length, byteBufferWrap.array());
    }

    public int btonecajqb() {
        return f19712lqeggnwhkg[this.f19714iobyxmoadg] * this.f19717zoijcleaow;
    }

    public String toString() {
        return "(" + f19711gxszxtbevo[this.f19714iobyxmoadg] + ", data length:" + this.f19716wkgbmnqykc.length + ")";
    }

    lqeggnwhkg(int i13, int i14, long j13, byte[] bArr) {
        this.f19714iobyxmoadg = i13;
        this.f19717zoijcleaow = i14;
        this.f19715ppxfxbqfkf = j13;
        this.f19716wkgbmnqykc = bArr;
    }
}
