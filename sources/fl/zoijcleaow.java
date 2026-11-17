package fl;

import java.util.Arrays;
import rl.eablkybsjg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f34308eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final byte f34309iobyxmoadg = 61;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f34310ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    protected final int f34311wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f34312zoijcleaow;

    static class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f34313eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        boolean f34314gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f34315iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        int f34316lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        int f34317nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        byte[] f34318ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f34319wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        long f34320zoijcleaow;

        iobyxmoadg() {
        }

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.f34318ppxfxbqfkf), Integer.valueOf(this.f34316lqeggnwhkg), Boolean.valueOf(this.f34314gxszxtbevo), Integer.valueOf(this.f34315iobyxmoadg), Long.valueOf(this.f34320zoijcleaow), Integer.valueOf(this.f34317nufgyqmvbu), Integer.valueOf(this.f34319wkgbmnqykc), Integer.valueOf(this.f34313eablkybsjg));
        }
    }

    protected zoijcleaow(int i13, int i14, int i15, int i16) {
        this.f34312zoijcleaow = i13;
        this.f34310ppxfxbqfkf = i14;
        this.f34311wkgbmnqykc = (i15 <= 0 || i16 <= 0) ? 0 : (i15 / i14) * i14;
        this.f34308eablkybsjg = i16;
    }

    private byte[] wflxmlrfwp(iobyxmoadg iobyxmoadgVar) {
        byte[] bArr = iobyxmoadgVar.f34318ppxfxbqfkf;
        if (bArr == null) {
            iobyxmoadgVar.f34318ppxfxbqfkf = new byte[btonecajqb()];
            iobyxmoadgVar.f34319wkgbmnqykc = 0;
            iobyxmoadgVar.f34313eablkybsjg = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            iobyxmoadgVar.f34318ppxfxbqfkf = bArr2;
        }
        return iobyxmoadgVar.f34318ppxfxbqfkf;
    }

    protected int btonecajqb() {
        return 8192;
    }

    int draadjrbmk(byte[] bArr, int i13, int i14, iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.f34318ppxfxbqfkf == null) {
            return iobyxmoadgVar.f34314gxszxtbevo ? -1 : 0;
        }
        int iMin = Math.min(iobyxmoadg(iobyxmoadgVar), i14);
        System.arraycopy(iobyxmoadgVar.f34318ppxfxbqfkf, iobyxmoadgVar.f34313eablkybsjg, bArr, i13, iMin);
        int i15 = iobyxmoadgVar.f34313eablkybsjg + iMin;
        iobyxmoadgVar.f34313eablkybsjg = i15;
        if (i15 >= iobyxmoadgVar.f34319wkgbmnqykc) {
            iobyxmoadgVar.f34318ppxfxbqfkf = null;
        }
        return iMin;
    }

    protected byte[] dxjokdxxww(int i13, iobyxmoadg iobyxmoadgVar) {
        byte[] bArr = iobyxmoadgVar.f34318ppxfxbqfkf;
        return (bArr == null || bArr.length < iobyxmoadgVar.f34319wkgbmnqykc + i13) ? wflxmlrfwp(iobyxmoadgVar) : bArr;
    }

    public byte[] eablkybsjg(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        ppxfxbqfkf(bArr, 0, bArr.length, iobyxmoadgVar);
        ppxfxbqfkf(bArr, 0, -1, iobyxmoadgVar);
        int i13 = iobyxmoadgVar.f34319wkgbmnqykc;
        byte[] bArr2 = new byte[i13];
        draadjrbmk(bArr2, 0, i13, iobyxmoadgVar);
        return bArr2;
    }

    protected abstract boolean gtknphoqwx(byte b13);

    abstract void gxszxtbevo(byte[] bArr, int i13, int i14, iobyxmoadg iobyxmoadgVar);

    int iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.f34318ppxfxbqfkf != null) {
            return iobyxmoadgVar.f34319wkgbmnqykc - iobyxmoadgVar.f34313eablkybsjg;
        }
        return 0;
    }

    public byte[] lqeggnwhkg(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        gxszxtbevo(bArr, 0, bArr.length, iobyxmoadgVar);
        gxszxtbevo(bArr, 0, -1, iobyxmoadgVar);
        int i13 = iobyxmoadgVar.f34319wkgbmnqykc - iobyxmoadgVar.f34313eablkybsjg;
        byte[] bArr2 = new byte[i13];
        draadjrbmk(bArr2, 0, i13, iobyxmoadgVar);
        return bArr2;
    }

    public String nufgyqmvbu(byte[] bArr) {
        return eablkybsjg.gxszxtbevo(lqeggnwhkg(bArr));
    }

    abstract void ppxfxbqfkf(byte[] bArr, int i13, int i14, iobyxmoadg iobyxmoadgVar);

    public byte[] wkgbmnqykc(String str) {
        return eablkybsjg(eablkybsjg.ppxfxbqfkf(str));
    }

    protected boolean zoijcleaow(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b13 : bArr) {
            if (61 == b13 || gtknphoqwx(b13)) {
                return true;
            }
        }
        return false;
    }
}
