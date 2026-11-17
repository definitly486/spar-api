package mm0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.ads.api.model.ProductDayPopupDialogArgs;
import ru.myspar.proloyalty.ads.impl.domain.productday.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f67498ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f67499wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f67498ppxfxbqfkf = storeFactory;
        this.f67499wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f67498ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f67500iobyxmoadg), this.f67499wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(((ProductDayPopupDialogArgs) gxszxtbevo()).getPopupId(), ((ProductDayPopupDialogArgs) gxszxtbevo()).getGroupCode(), false, ((ProductDayPopupDialogArgs) gxszxtbevo()).getTitle(), ((ProductDayPopupDialogArgs) gxszxtbevo()).getSubtitle(), ((ProductDayPopupDialogArgs) gxszxtbevo()).getSubtitleText(), ((ProductDayPopupDialogArgs) gxszxtbevo()).getText(), ((ProductDayPopupDialogArgs) gxszxtbevo()).getButtonText(), null, false, ((ProductDayPopupDialogArgs) gxszxtbevo()).getProductId(), ((ProductDayPopupDialogArgs) gxszxtbevo()).getShopId(), ((ProductDayPopupDialogArgs) gxszxtbevo()).getDeliveryCode(), 772, null);
    }
}
