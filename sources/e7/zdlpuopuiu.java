package e7;

import java.util.concurrent.CancellationException;
import pj.auzgnhcxok;

/* JADX INFO: loaded from: classes2.dex */
public final class zdlpuopuiu implements agtfadlqog {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final auzgnhcxok f30793cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final androidx.lifecycle.gtknphoqwx f30794iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final g7.wkgbmnqykc f30795jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final nufgyqmvbu f30796yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final v6.wkgbmnqykc f30797zdlpuopuiu;

    public zdlpuopuiu(v6.wkgbmnqykc wkgbmnqykcVar, nufgyqmvbu nufgyqmvbuVar, g7.wkgbmnqykc wkgbmnqykcVar2, androidx.lifecycle.gtknphoqwx gtknphoqwxVar, auzgnhcxok auzgnhcxokVar) {
        this.f30797zdlpuopuiu = wkgbmnqykcVar;
        this.f30796yggfygwlhe = nufgyqmvbuVar;
        this.f30795jyumaefscl = wkgbmnqykcVar2;
        this.f30794iwizpuwonk = gtknphoqwxVar;
        this.f30793cqumvgiudr = auzgnhcxokVar;
    }

    public void iobyxmoadg() {
        auzgnhcxok.iobyxmoadg.iobyxmoadg(this.f30793cqumvgiudr, null, 1, null);
        g7.wkgbmnqykc wkgbmnqykcVar = this.f30795jyumaefscl;
        if (wkgbmnqykcVar instanceof androidx.lifecycle.rgvfuqvkyq) {
            this.f30794iwizpuwonk.wkgbmnqykc((androidx.lifecycle.rgvfuqvkyq) wkgbmnqykcVar);
        }
        this.f30794iwizpuwonk.wkgbmnqykc(this);
    }

    @Override // androidx.lifecycle.gxszxtbevo
    public void onDestroy(androidx.lifecycle.vdvldrhtss vdvldrhtssVar) {
        i7.gtknphoqwx.draadjrbmk(this.f30795jyumaefscl.getView()).iobyxmoadg();
    }

    @Override // e7.agtfadlqog
    public void start() {
        this.f30794iwizpuwonk.iobyxmoadg(this);
        g7.wkgbmnqykc wkgbmnqykcVar = this.f30795jyumaefscl;
        if (wkgbmnqykcVar instanceof androidx.lifecycle.rgvfuqvkyq) {
            i7.lqeggnwhkg.zoijcleaow(this.f30794iwizpuwonk, (androidx.lifecycle.rgvfuqvkyq) wkgbmnqykcVar);
        }
        i7.gtknphoqwx.draadjrbmk(this.f30795jyumaefscl.getView()).ppxfxbqfkf(this);
    }

    public final void zoijcleaow() {
        this.f30797zdlpuopuiu.iobyxmoadg(this.f30796yggfygwlhe);
    }

    @Override // e7.agtfadlqog
    public void zynmafqrjb() {
        if (this.f30795jyumaefscl.getView().isAttachedToWindow()) {
            return;
        }
        i7.gtknphoqwx.draadjrbmk(this.f30795jyumaefscl.getView()).ppxfxbqfkf(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }
}
