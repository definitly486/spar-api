package bo;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.ads.api.model.ProductDayPopupDialogArgs;
import ru.myspar.ads.impl.domain.productday.store.State;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f16866ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f16867zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f16867zoijcleaow = storeFactory;
        this.f16866ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((ProductDayPopupDialogArgs) gxszxtbevo()).getPopupId(), ((ProductDayPopupDialogArgs) gxszxtbevo()).getGroupCode(), false, ((ProductDayPopupDialogArgs) gxszxtbevo()).getTitle(), ((ProductDayPopupDialogArgs) gxszxtbevo()).getSubtitle(), ((ProductDayPopupDialogArgs) gxszxtbevo()).getSubtitleText(), ((ProductDayPopupDialogArgs) gxszxtbevo()).getText(), ((ProductDayPopupDialogArgs) gxszxtbevo()).getButtonText(), null, false, ((ProductDayPopupDialogArgs) gxszxtbevo()).getProductId(), ((ProductDayPopupDialogArgs) gxszxtbevo()).getShopId(), ((ProductDayPopupDialogArgs) gxszxtbevo()).getDeliveryCode(), 772, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f16867zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f16868iobyxmoadg), this.f16866ppxfxbqfkf, new zoijcleaow());
    }
}
