package u;

import w0.esjtqupxsv;
import w0.lereixgezr;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f112409eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf.iobyxmoadg f112410iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ppxfxbqfkf f112411ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f112412wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ppxfxbqfkf f112413zoijcleaow;

    public wkgbmnqykc() {
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = eablkybsjg.dxjokdxxww() ? ppxfxbqfkf.iobyxmoadg.Impulse : ppxfxbqfkf.iobyxmoadg.Lsq2;
        this.f112410iobyxmoadg = iobyxmoadgVar;
        this.f112413zoijcleaow = new ppxfxbqfkf(false, iobyxmoadgVar, 1, null);
        this.f112411ppxfxbqfkf = new ppxfxbqfkf(false, iobyxmoadgVar, 1, null);
        this.f112412wkgbmnqykc = g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
    }

    public final void eablkybsjg() {
        this.f112413zoijcleaow.eablkybsjg();
        this.f112411ppxfxbqfkf.eablkybsjg();
        this.f112409eablkybsjg = 0L;
    }

    public final void gxszxtbevo(long j13) {
        this.f112412wkgbmnqykc = j13;
    }

    public final void iobyxmoadg(long j13, long j14) {
        this.f112413zoijcleaow.iobyxmoadg(j13, Float.intBitsToFloat((int) (j14 >> 32)));
        this.f112411ppxfxbqfkf.iobyxmoadg(j13, Float.intBitsToFloat((int) (j14 & 4294967295L)));
    }

    public final void lqeggnwhkg(long j13) {
        this.f112409eablkybsjg = j13;
    }

    public final long ppxfxbqfkf() {
        return this.f112412wkgbmnqykc;
    }

    public final long wkgbmnqykc() {
        return this.f112409eablkybsjg;
    }

    public final long zoijcleaow(long j13) {
        if (!(esjtqupxsv.nufgyqmvbu(j13) > 0.0f && esjtqupxsv.dxjokdxxww(j13) > 0.0f)) {
            w.iobyxmoadg.zoijcleaow("maximumVelocity should be a positive value. You specified=" + ((Object) esjtqupxsv.agtfadlqog(j13)));
        }
        return lereixgezr.iobyxmoadg(this.f112413zoijcleaow.wkgbmnqykc(esjtqupxsv.nufgyqmvbu(j13)), this.f112411ppxfxbqfkf.wkgbmnqykc(esjtqupxsv.dxjokdxxww(j13)));
    }
}
