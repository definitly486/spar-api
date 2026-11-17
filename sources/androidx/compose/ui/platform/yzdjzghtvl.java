package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class yzdjzghtvl implements s.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int[] f7142jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final v1.iozdgvuglv f7143yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final View f7144zdlpuopuiu;

    public yzdjzghtvl(View view) {
        this.f7144zdlpuopuiu = view;
        v1.iozdgvuglv iozdgvuglvVar = new v1.iozdgvuglv(view);
        iozdgvuglvVar.wflxmlrfwp(true);
        this.f7143yggfygwlhe = iozdgvuglvVar;
        this.f7142jyumaefscl = new int[2];
        v1.jhduphickx.skhdrjzrfn(view, true);
    }

    private final void iobyxmoadg() {
        if (this.f7143yggfygwlhe.gtknphoqwx(0)) {
            this.f7143yggfygwlhe.oxmwwwfdhm(0);
        }
        if (this.f7143yggfygwlhe.gtknphoqwx(1)) {
            this.f7143yggfygwlhe.oxmwwwfdhm(1);
        }
    }

    @Override // s.iobyxmoadg
    public long E(long j13, int i13) {
        if (!this.f7143yggfygwlhe.rgvfuqvkyq(b.lqeggnwhkg(j13), b.gtknphoqwx(i13))) {
            return g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
        }
        hg.agtfadlqog.zynmafqrjb(this.f7142jyumaefscl, 0, 0, 0, 6, null);
        this.f7143yggfygwlhe.wkgbmnqykc(b.gxszxtbevo(Float.intBitsToFloat((int) (j13 >> 32))), b.gxszxtbevo(Float.intBitsToFloat((int) (4294967295L & j13))), this.f7142jyumaefscl, null, b.gtknphoqwx(i13));
        return b.btonecajqb(this.f7142jyumaefscl, j13);
    }

    @Override // s.iobyxmoadg
    public long grlcpdaxtj(long j13, long j14, int i13) {
        if (!this.f7143yggfygwlhe.rgvfuqvkyq(b.lqeggnwhkg(j14), b.gtknphoqwx(i13))) {
            return g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
        }
        hg.agtfadlqog.zynmafqrjb(this.f7142jyumaefscl, 0, 0, 0, 6, null);
        this.f7143yggfygwlhe.eablkybsjg(b.gxszxtbevo(Float.intBitsToFloat((int) (j13 >> 32))), b.gxszxtbevo(Float.intBitsToFloat((int) (j13 & 4294967295L))), b.gxszxtbevo(Float.intBitsToFloat((int) (j14 >> 32))), b.gxszxtbevo(Float.intBitsToFloat((int) (j14 & 4294967295L))), null, b.gtknphoqwx(i13), this.f7142jyumaefscl);
        return b.btonecajqb(this.f7142jyumaefscl, j14);
    }

    @Override // s.iobyxmoadg
    public Object wizcaqwiak(long j13, lg.gxszxtbevo gxszxtbevoVar) {
        if (!this.f7143yggfygwlhe.zoijcleaow(b.draadjrbmk(w0.esjtqupxsv.nufgyqmvbu(j13)), b.draadjrbmk(w0.esjtqupxsv.dxjokdxxww(j13)))) {
            j13 = w0.esjtqupxsv.f118251zoijcleaow.iobyxmoadg();
        }
        iobyxmoadg();
        return w0.esjtqupxsv.zoijcleaow(j13);
    }

    @Override // s.iobyxmoadg
    public Object wypolnanlu(long j13, long j14, lg.gxszxtbevo gxszxtbevoVar) {
        if (!this.f7143yggfygwlhe.iobyxmoadg(b.draadjrbmk(w0.esjtqupxsv.nufgyqmvbu(j14)), b.draadjrbmk(w0.esjtqupxsv.dxjokdxxww(j14)), true)) {
            j14 = w0.esjtqupxsv.f118251zoijcleaow.iobyxmoadg();
        }
        iobyxmoadg();
        return w0.esjtqupxsv.zoijcleaow(j14);
    }
}
