package lm0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.ads.api.model.ImagePopupDialogArgs;
import ru.myspar.proloyalty.ads.impl.domain.image.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f63606ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f63607wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f63606ppxfxbqfkf = storeFactory;
        this.f63607wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f63606ppxfxbqfkf, state, new a8.wkgbmnqykc(new ppxfxbqfkf[0]), this.f63607wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(((ImagePopupDialogArgs) gxszxtbevo()).getTitle(), ((ImagePopupDialogArgs) gxszxtbevo()).getSubtitle(), ((ImagePopupDialogArgs) gxszxtbevo()).getSubtitleText(), ((ImagePopupDialogArgs) gxszxtbevo()).getText(), ((ImagePopupDialogArgs) gxszxtbevo()).getButtonText(), ((ImagePopupDialogArgs) gxszxtbevo()).getImageLink(), ((ImagePopupDialogArgs) gxszxtbevo()).getPopupId(), ((ImagePopupDialogArgs) gxszxtbevo()).getGroupCode(), null, UserVerificationMethods.USER_VERIFY_HANDPRINT, null);
    }
}
