package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a implements s.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int[] f6755iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final v1.iozdgvuglv f6756jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final float f6757yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final View f6758zdlpuopuiu;

    public a(View view, float f13) {
        this.f6758zdlpuopuiu = view;
        this.f6757yggfygwlhe = f13;
        v1.iozdgvuglv iozdgvuglvVar = new v1.iozdgvuglv(view);
        iozdgvuglvVar.wflxmlrfwp(true);
        this.f6756jyumaefscl = iozdgvuglvVar;
        this.f6755iwizpuwonk = new int[2];
        v1.jhduphickx.skhdrjzrfn(view, true);
    }

    private final void iobyxmoadg() {
        if (this.f6756jyumaefscl.gtknphoqwx(0)) {
            this.f6756jyumaefscl.oxmwwwfdhm(0);
        }
        if (this.f6756jyumaefscl.gtknphoqwx(1)) {
            this.f6756jyumaefscl.oxmwwwfdhm(1);
        }
    }

    @Override // s.iobyxmoadg
    public long E(long j13, int i13) {
        if (!this.f6756jyumaefscl.rgvfuqvkyq(b.lqeggnwhkg(j13), b.gtknphoqwx(i13))) {
            return g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
        }
        hg.agtfadlqog.zynmafqrjb(this.f6755iwizpuwonk, 0, 0, 0, 6, null);
        this.f6756jyumaefscl.wkgbmnqykc(b.gxszxtbevo(Float.intBitsToFloat((int) (j13 >> 32))), b.gxszxtbevo(Float.intBitsToFloat((int) (4294967295L & j13))), this.f6755iwizpuwonk, null, b.gtknphoqwx(i13));
        return b.btonecajqb(this.f6755iwizpuwonk, j13);
    }

    @Override // s.iobyxmoadg
    public long grlcpdaxtj(long j13, long j14, int i13) {
        if (!this.f6756jyumaefscl.rgvfuqvkyq(b.lqeggnwhkg(j14), b.gtknphoqwx(i13))) {
            return g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
        }
        hg.agtfadlqog.zynmafqrjb(this.f6755iwizpuwonk, 0, 0, 0, 6, null);
        this.f6756jyumaefscl.eablkybsjg(b.gxszxtbevo(Float.intBitsToFloat((int) (j13 >> 32))), b.gxszxtbevo(Float.intBitsToFloat((int) (j13 & 4294967295L))), b.gxszxtbevo(Float.intBitsToFloat((int) (j14 >> 32))), b.gxszxtbevo(Float.intBitsToFloat((int) (j14 & 4294967295L))), null, b.gtknphoqwx(i13), this.f6755iwizpuwonk);
        return b.btonecajqb(this.f6755iwizpuwonk, j14);
    }

    @Override // s.iobyxmoadg
    public Object wizcaqwiak(long j13, lg.gxszxtbevo gxszxtbevoVar) {
        if (!this.f6756jyumaefscl.zoijcleaow(b.draadjrbmk(w0.esjtqupxsv.nufgyqmvbu(j13)), b.draadjrbmk(w0.esjtqupxsv.dxjokdxxww(j13))) && !this.f6756jyumaefscl.iobyxmoadg(b.draadjrbmk(w0.esjtqupxsv.nufgyqmvbu(j13)), b.draadjrbmk(w0.esjtqupxsv.dxjokdxxww(j13)), true)) {
            j13 = w0.esjtqupxsv.f118251zoijcleaow.iobyxmoadg();
        }
        return w0.esjtqupxsv.zoijcleaow(j13);
    }

    @Override // s.iobyxmoadg
    public Object wypolnanlu(long j13, long j14, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg();
        return w0.esjtqupxsv.zoijcleaow(w0.esjtqupxsv.f118251zoijcleaow.iobyxmoadg());
    }
}
