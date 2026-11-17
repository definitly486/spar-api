package g0;

import android.graphics.Region;
import h.yzdjzghtvl;

/* JADX INFO: loaded from: classes.dex */
final class gtknphoqwx implements iozdgvuglv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Region f35705iobyxmoadg = new Region();

    @Override // g0.iozdgvuglv
    public w0.rgvfuqvkyq getBounds() {
        return yzdjzghtvl.wkgbmnqykc(this.f35705iobyxmoadg.getBounds());
    }

    @Override // g0.iozdgvuglv
    public boolean iobyxmoadg(iozdgvuglv iozdgvuglvVar) {
        Region region = this.f35705iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iozdgvuglvVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticRegionImpl");
        return region.op(((gtknphoqwx) iozdgvuglvVar).f35705iobyxmoadg, Region.Op.INTERSECT);
    }

    @Override // g0.iozdgvuglv
    public boolean isEmpty() {
        return this.f35705iobyxmoadg.isEmpty();
    }

    @Override // g0.iozdgvuglv
    public boolean ppxfxbqfkf(w0.rgvfuqvkyq rgvfuqvkyqVar) {
        return this.f35705iobyxmoadg.op(rgvfuqvkyqVar.gxszxtbevo(), rgvfuqvkyqVar.dxjokdxxww(), rgvfuqvkyqVar.lqeggnwhkg(), rgvfuqvkyqVar.wkgbmnqykc(), Region.Op.DIFFERENCE);
    }

    @Override // g0.iozdgvuglv
    public void zoijcleaow(w0.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f35705iobyxmoadg.set(rgvfuqvkyqVar.gxszxtbevo(), rgvfuqvkyqVar.dxjokdxxww(), rgvfuqvkyqVar.lqeggnwhkg(), rgvfuqvkyqVar.wkgbmnqykc());
    }
}
