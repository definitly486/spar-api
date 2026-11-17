package nm0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.ads.api.model.PromoCodePopupDialogArgs;
import ru.myspar.proloyalty.ads.impl.domain.promocode.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f70341ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f70342wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f70341ppxfxbqfkf = storeFactory;
        this.f70342wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f70341ppxfxbqfkf, state, new a8.wkgbmnqykc(new ppxfxbqfkf[0]), this.f70342wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(((PromoCodePopupDialogArgs) gxszxtbevo()).getPopupId(), ((PromoCodePopupDialogArgs) gxszxtbevo()).getGroupCode(), ((PromoCodePopupDialogArgs) gxszxtbevo()).getTitle(), ((PromoCodePopupDialogArgs) gxszxtbevo()).getSubtitle(), ((PromoCodePopupDialogArgs) gxszxtbevo()).getSubtitleText(), ((PromoCodePopupDialogArgs) gxszxtbevo()).getText(), ((PromoCodePopupDialogArgs) gxszxtbevo()).getPromoCode());
    }
}
