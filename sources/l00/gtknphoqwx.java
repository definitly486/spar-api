package l00;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f61228iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ppxfxbqfkf f61229ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dxjokdxxww f61230wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gxszxtbevo f61231zoijcleaow;

    public gtknphoqwx(wkgbmnqykc changeCartProductInteractor, gxszxtbevo orderProductInteractor, ppxfxbqfkf basketOrderChangeProductInteractor, dxjokdxxww orderEditChangeProductInteractor) {
        zdlpuopuiu.btonecajqb(changeCartProductInteractor, "changeCartProductInteractor");
        zdlpuopuiu.btonecajqb(orderProductInteractor, "orderProductInteractor");
        zdlpuopuiu.btonecajqb(basketOrderChangeProductInteractor, "basketOrderChangeProductInteractor");
        zdlpuopuiu.btonecajqb(orderEditChangeProductInteractor, "orderEditChangeProductInteractor");
        this.f61228iobyxmoadg = changeCartProductInteractor;
        this.f61231zoijcleaow = orderProductInteractor;
        this.f61229ppxfxbqfkf = basketOrderChangeProductInteractor;
        this.f61230wkgbmnqykc = orderEditChangeProductInteractor;
    }

    public static /* synthetic */ btonecajqb zoijcleaow(gtknphoqwx gtknphoqwxVar, btonecajqb.iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            iobyxmoadgVar = btonecajqb.iobyxmoadg.zoijcleaow.f61220iobyxmoadg;
        }
        return gtknphoqwxVar.iobyxmoadg(iobyxmoadgVar);
    }

    public final btonecajqb iobyxmoadg(btonecajqb.iobyxmoadg type) {
        zoijcleaow zoijcleaowVar;
        zdlpuopuiu.btonecajqb(type, "type");
        if (type instanceof btonecajqb.iobyxmoadg.zoijcleaow) {
            return this.f61228iobyxmoadg;
        }
        if (type instanceof btonecajqb.iobyxmoadg.ppxfxbqfkf) {
            zoijcleaowVar = this.f61231zoijcleaow;
            zoijcleaowVar.wwaezpbzkn(((btonecajqb.iobyxmoadg.ppxfxbqfkf) type).iobyxmoadg());
        } else {
            if (!(type instanceof btonecajqb.iobyxmoadg.wkgbmnqykc)) {
                if (type instanceof btonecajqb.iobyxmoadg.C1234iobyxmoadg) {
                    return this.f61229ppxfxbqfkf;
                }
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaowVar = this.f61230wkgbmnqykc;
            zoijcleaowVar.wwaezpbzkn(((btonecajqb.iobyxmoadg.wkgbmnqykc) type).iobyxmoadg());
        }
        return zoijcleaowVar;
    }
}
