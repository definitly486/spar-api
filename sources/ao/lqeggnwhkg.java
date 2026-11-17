package ao;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.ads.api.model.ImagePopupDialogArgs;
import ru.myspar.ads.impl.domain.image.store.State;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f14025ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f14026zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f14026zoijcleaow = storeFactory;
        this.f14025ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((ImagePopupDialogArgs) gxszxtbevo()).getTitle(), ((ImagePopupDialogArgs) gxszxtbevo()).getSubtitle(), ((ImagePopupDialogArgs) gxszxtbevo()).getSubtitleText(), ((ImagePopupDialogArgs) gxszxtbevo()).getText(), ((ImagePopupDialogArgs) gxszxtbevo()).getButtonText(), ((ImagePopupDialogArgs) gxszxtbevo()).getImageLink(), ((ImagePopupDialogArgs) gxszxtbevo()).getPopupId(), ((ImagePopupDialogArgs) gxszxtbevo()).getGroupCode(), null, UserVerificationMethods.USER_VERIFY_HANDPRINT, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f14026zoijcleaow, state, new a8.wkgbmnqykc(new ppxfxbqfkf[0]), this.f14025ppxfxbqfkf, new zoijcleaow());
    }
}
