package dz0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f29981iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ppxfxbqfkf f29982ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dxjokdxxww f29983wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gxszxtbevo f29984zoijcleaow;

    public gtknphoqwx(wkgbmnqykc changeCartProductInteractor, gxszxtbevo orderProductInteractor, ppxfxbqfkf basketOrderChangeProductInteractor, dxjokdxxww orderEditChangeProductInteractor) {
        zdlpuopuiu.btonecajqb(changeCartProductInteractor, "changeCartProductInteractor");
        zdlpuopuiu.btonecajqb(orderProductInteractor, "orderProductInteractor");
        zdlpuopuiu.btonecajqb(basketOrderChangeProductInteractor, "basketOrderChangeProductInteractor");
        zdlpuopuiu.btonecajqb(orderEditChangeProductInteractor, "orderEditChangeProductInteractor");
        this.f29981iobyxmoadg = changeCartProductInteractor;
        this.f29984zoijcleaow = orderProductInteractor;
        this.f29982ppxfxbqfkf = basketOrderChangeProductInteractor;
        this.f29983wkgbmnqykc = orderEditChangeProductInteractor;
    }

    public static /* synthetic */ btonecajqb zoijcleaow(gtknphoqwx gtknphoqwxVar, btonecajqb.iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            iobyxmoadgVar = btonecajqb.iobyxmoadg.zoijcleaow.f29973iobyxmoadg;
        }
        return gtknphoqwxVar.iobyxmoadg(iobyxmoadgVar);
    }

    public final btonecajqb iobyxmoadg(btonecajqb.iobyxmoadg type) {
        zoijcleaow zoijcleaowVar;
        zdlpuopuiu.btonecajqb(type, "type");
        if (type instanceof btonecajqb.iobyxmoadg.zoijcleaow) {
            return this.f29981iobyxmoadg;
        }
        if (type instanceof btonecajqb.iobyxmoadg.ppxfxbqfkf) {
            zoijcleaowVar = this.f29984zoijcleaow;
            zoijcleaowVar.wwaezpbzkn(((btonecajqb.iobyxmoadg.ppxfxbqfkf) type).iobyxmoadg());
        } else {
            if (!(type instanceof btonecajqb.iobyxmoadg.wkgbmnqykc)) {
                if (type instanceof btonecajqb.iobyxmoadg.C0620iobyxmoadg) {
                    return this.f29982ppxfxbqfkf;
                }
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaowVar = this.f29983wkgbmnqykc;
            zoijcleaowVar.wwaezpbzkn(((btonecajqb.iobyxmoadg.wkgbmnqykc) type).iobyxmoadg());
        }
        return zoijcleaowVar;
    }
}
