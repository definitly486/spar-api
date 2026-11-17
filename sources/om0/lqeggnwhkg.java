package om0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.ads.api.model.TextPopupDialogArgs;
import ru.myspar.proloyalty.ads.impl.domain.text.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f73161ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f73162wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f73161ppxfxbqfkf = storeFactory;
        this.f73162wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f73161ppxfxbqfkf, state, new a8.wkgbmnqykc(new ppxfxbqfkf[0]), this.f73162wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(((TextPopupDialogArgs) gxszxtbevo()).getPopupId(), ((TextPopupDialogArgs) gxszxtbevo()).getGroupCode(), ((TextPopupDialogArgs) gxszxtbevo()).getTitle(), ((TextPopupDialogArgs) gxszxtbevo()).getSubtitle(), ((TextPopupDialogArgs) gxszxtbevo()).getSubtitleText(), ((TextPopupDialogArgs) gxszxtbevo()).getText(), ((TextPopupDialogArgs) gxszxtbevo()).getButtonText(), null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }
}
