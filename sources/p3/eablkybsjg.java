package p3;

import java.util.Arrays;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg implements zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f75455eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f75456gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f75457iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private iobyxmoadg[] f75458lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final byte[] f75459ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f75460wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f75461zoijcleaow;

    public eablkybsjg(boolean z13, int i13) {
        this(z13, i13, 0);
    }

    @Override // p3.zoijcleaow
    public int eablkybsjg() {
        return this.f75461zoijcleaow;
    }

    public synchronized int gxszxtbevo() {
        return this.f75455eablkybsjg * this.f75461zoijcleaow;
    }

    @Override // p3.zoijcleaow
    public synchronized iobyxmoadg iobyxmoadg() {
        iobyxmoadg iobyxmoadgVar;
        try {
            this.f75455eablkybsjg++;
            int i13 = this.f75456gxszxtbevo;
            if (i13 > 0) {
                iobyxmoadg[] iobyxmoadgVarArr = this.f75458lqeggnwhkg;
                int i14 = i13 - 1;
                this.f75456gxszxtbevo = i14;
                iobyxmoadgVar = (iobyxmoadg) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVarArr[i14]);
                this.f75458lqeggnwhkg[this.f75456gxszxtbevo] = null;
            } else {
                iobyxmoadgVar = new iobyxmoadg(new byte[this.f75461zoijcleaow], 0);
                int i15 = this.f75455eablkybsjg;
                iobyxmoadg[] iobyxmoadgVarArr2 = this.f75458lqeggnwhkg;
                if (i15 > iobyxmoadgVarArr2.length) {
                    this.f75458lqeggnwhkg = (iobyxmoadg[]) Arrays.copyOf(iobyxmoadgVarArr2, iobyxmoadgVarArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iobyxmoadgVar;
    }

    public synchronized void lqeggnwhkg() {
        if (this.f75457iobyxmoadg) {
            nufgyqmvbu(0);
        }
    }

    public synchronized void nufgyqmvbu(int i13) {
        boolean z13 = i13 < this.f75460wkgbmnqykc;
        this.f75460wkgbmnqykc = i13;
        if (z13) {
            zoijcleaow();
        }
    }

    @Override // p3.zoijcleaow
    public synchronized void ppxfxbqfkf(zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        while (iobyxmoadgVar != null) {
            try {
                iobyxmoadg[] iobyxmoadgVarArr = this.f75458lqeggnwhkg;
                int i13 = this.f75456gxszxtbevo;
                this.f75456gxszxtbevo = i13 + 1;
                iobyxmoadgVarArr[i13] = iobyxmoadgVar.iobyxmoadg();
                this.f75455eablkybsjg--;
                iobyxmoadgVar = iobyxmoadgVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    @Override // p3.zoijcleaow
    public synchronized void wkgbmnqykc(iobyxmoadg iobyxmoadgVar) {
        iobyxmoadg[] iobyxmoadgVarArr = this.f75458lqeggnwhkg;
        int i13 = this.f75456gxszxtbevo;
        this.f75456gxszxtbevo = i13 + 1;
        iobyxmoadgVarArr[i13] = iobyxmoadgVar;
        this.f75455eablkybsjg--;
        notifyAll();
    }

    @Override // p3.zoijcleaow
    public synchronized void zoijcleaow() {
        try {
            int i13 = 0;
            int iMax = Math.max(0, stevsuqkhv.btonecajqb(this.f75460wkgbmnqykc, this.f75461zoijcleaow) - this.f75455eablkybsjg);
            int i14 = this.f75456gxszxtbevo;
            if (iMax >= i14) {
                return;
            }
            if (this.f75459ppxfxbqfkf != null) {
                int i15 = i14 - 1;
                while (i13 <= i15) {
                    iobyxmoadg iobyxmoadgVar = (iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f75458lqeggnwhkg[i13]);
                    if (iobyxmoadgVar.f75475iobyxmoadg == this.f75459ppxfxbqfkf) {
                        i13++;
                    } else {
                        iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f75458lqeggnwhkg[i15]);
                        if (iobyxmoadgVar2.f75475iobyxmoadg != this.f75459ppxfxbqfkf) {
                            i15--;
                        } else {
                            iobyxmoadg[] iobyxmoadgVarArr = this.f75458lqeggnwhkg;
                            iobyxmoadgVarArr[i13] = iobyxmoadgVar2;
                            iobyxmoadgVarArr[i15] = iobyxmoadgVar;
                            i15--;
                            i13++;
                        }
                    }
                }
                iMax = Math.max(iMax, i13);
                if (iMax >= this.f75456gxszxtbevo) {
                    return;
                }
            }
            Arrays.fill(this.f75458lqeggnwhkg, iMax, this.f75456gxszxtbevo, (Object) null);
            this.f75456gxszxtbevo = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public eablkybsjg(boolean z13, int i13, int i14) {
        y2.iobyxmoadg.iobyxmoadg(i13 > 0);
        y2.iobyxmoadg.iobyxmoadg(i14 >= 0);
        this.f75457iobyxmoadg = z13;
        this.f75461zoijcleaow = i13;
        this.f75456gxszxtbevo = i14;
        this.f75458lqeggnwhkg = new iobyxmoadg[i14 + 100];
        if (i14 <= 0) {
            this.f75459ppxfxbqfkf = null;
            return;
        }
        this.f75459ppxfxbqfkf = new byte[i14 * i13];
        for (int i15 = 0; i15 < i14; i15++) {
            this.f75458lqeggnwhkg[i15] = new iobyxmoadg(this.f75459ppxfxbqfkf, i15 * i13);
        }
    }
}
