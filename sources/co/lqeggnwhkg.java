package co;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.ads.api.model.PromoCodePopupDialogArgs;
import ru.myspar.ads.impl.domain.promocode.store.State;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f20245ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f20246zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f20246zoijcleaow = storeFactory;
        this.f20245ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((PromoCodePopupDialogArgs) gxszxtbevo()).getPopupId(), ((PromoCodePopupDialogArgs) gxszxtbevo()).getGroupCode(), ((PromoCodePopupDialogArgs) gxszxtbevo()).getTitle(), ((PromoCodePopupDialogArgs) gxszxtbevo()).getSubtitle(), ((PromoCodePopupDialogArgs) gxszxtbevo()).getSubtitleText(), ((PromoCodePopupDialogArgs) gxszxtbevo()).getText(), ((PromoCodePopupDialogArgs) gxszxtbevo()).getPromoCode());
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f20246zoijcleaow, state, new a8.wkgbmnqykc(new ppxfxbqfkf[0]), this.f20245ppxfxbqfkf, new zoijcleaow());
    }
}
