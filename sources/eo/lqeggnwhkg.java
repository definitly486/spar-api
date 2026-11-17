package eo;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.ads.api.model.TextPopupDialogArgs;
import ru.myspar.ads.impl.domain.text.store.State;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f31633ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f31634zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f31634zoijcleaow = storeFactory;
        this.f31633ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((TextPopupDialogArgs) gxszxtbevo()).getPopupId(), ((TextPopupDialogArgs) gxszxtbevo()).getGroupCode(), ((TextPopupDialogArgs) gxszxtbevo()).getTitle(), ((TextPopupDialogArgs) gxszxtbevo()).getSubtitle(), ((TextPopupDialogArgs) gxszxtbevo()).getSubtitleText(), ((TextPopupDialogArgs) gxszxtbevo()).getText(), ((TextPopupDialogArgs) gxszxtbevo()).getButtonText(), null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f31634zoijcleaow, state, new a8.wkgbmnqykc(new ppxfxbqfkf[0]), this.f31633ppxfxbqfkf, new zoijcleaow());
    }
}
