package y2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pkzmftpjix {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private long[] f123589iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f123590ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f123591wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Object[] f123592zoijcleaow;

    public pkzmftpjix() {
        this(10);
    }

    private void eablkybsjg() {
        int length = this.f123592zoijcleaow.length;
        if (this.f123591wkgbmnqykc < length) {
            return;
        }
        int i13 = length * 2;
        long[] jArr = new long[i13];
        Object[] objArrGxszxtbevo = gxszxtbevo(i13);
        int i14 = this.f123590ppxfxbqfkf;
        int i15 = length - i14;
        System.arraycopy(this.f123589iobyxmoadg, i14, jArr, 0, i15);
        System.arraycopy(this.f123592zoijcleaow, this.f123590ppxfxbqfkf, objArrGxszxtbevo, 0, i15);
        int i16 = this.f123590ppxfxbqfkf;
        if (i16 > 0) {
            System.arraycopy(this.f123589iobyxmoadg, 0, jArr, i15, i16);
            System.arraycopy(this.f123592zoijcleaow, 0, objArrGxszxtbevo, i15, this.f123590ppxfxbqfkf);
        }
        this.f123589iobyxmoadg = jArr;
        this.f123592zoijcleaow = objArrGxszxtbevo;
        this.f123590ppxfxbqfkf = 0;
    }

    private Object gtknphoqwx() {
        iobyxmoadg.lqeggnwhkg(this.f123591wkgbmnqykc > 0);
        Object[] objArr = this.f123592zoijcleaow;
        int i13 = this.f123590ppxfxbqfkf;
        Object obj = objArr[i13];
        objArr[i13] = null;
        this.f123590ppxfxbqfkf = (i13 + 1) % objArr.length;
        this.f123591wkgbmnqykc--;
        return obj;
    }

    private static Object[] gxszxtbevo(int i13) {
        return new Object[i13];
    }

    private Object nufgyqmvbu(long j13, boolean z13) {
        Object objGtknphoqwx = null;
        long j14 = Long.MAX_VALUE;
        while (this.f123591wkgbmnqykc > 0) {
            long j15 = j13 - this.f123589iobyxmoadg[this.f123590ppxfxbqfkf];
            if (j15 < 0 && (z13 || (-j15) >= j14)) {
                break;
            }
            objGtknphoqwx = gtknphoqwx();
            j14 = j15;
        }
        return objGtknphoqwx;
    }

    private void wkgbmnqykc(long j13) {
        int i13 = this.f123591wkgbmnqykc;
        if (i13 > 0) {
            if (j13 <= this.f123589iobyxmoadg[((this.f123590ppxfxbqfkf + i13) - 1) % this.f123592zoijcleaow.length]) {
                ppxfxbqfkf();
            }
        }
    }

    private void zoijcleaow(long j13, Object obj) {
        int i13 = this.f123590ppxfxbqfkf;
        int i14 = this.f123591wkgbmnqykc;
        Object[] objArr = this.f123592zoijcleaow;
        int length = (i13 + i14) % objArr.length;
        this.f123589iobyxmoadg[length] = j13;
        objArr[length] = obj;
        this.f123591wkgbmnqykc = i14 + 1;
    }

    public synchronized Object btonecajqb(long j13) {
        return nufgyqmvbu(j13, true);
    }

    public synchronized int draadjrbmk() {
        return this.f123591wkgbmnqykc;
    }

    public synchronized Object dxjokdxxww() {
        return this.f123591wkgbmnqykc == 0 ? null : gtknphoqwx();
    }

    public synchronized void iobyxmoadg(long j13, Object obj) {
        wkgbmnqykc(j13);
        eablkybsjg();
        zoijcleaow(j13, obj);
    }

    public synchronized Object lqeggnwhkg(long j13) {
        return nufgyqmvbu(j13, false);
    }

    public synchronized void ppxfxbqfkf() {
        this.f123590ppxfxbqfkf = 0;
        this.f123591wkgbmnqykc = 0;
        Arrays.fill(this.f123592zoijcleaow, (Object) null);
    }

    public pkzmftpjix(int i13) {
        this.f123589iobyxmoadg = new long[i13];
        this.f123592zoijcleaow = gxszxtbevo(i13);
    }
}
