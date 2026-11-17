package ep;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.api.model.RegistrationArgs;
import ru.myspar.auth.impl.domain.registration.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f31717ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f31718zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f31718zoijcleaow = storeFactory;
        this.f31717ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(null, null, null, null, null, false, null, false, null, ((RegistrationArgs) gxszxtbevo()).getPhoneNumber(), ((RegistrationArgs) gxszxtbevo()).getEmail(), false, false, false, false, false, false, false, !((RegistrationArgs) gxszxtbevo()).getHasCard(), true, !((RegistrationArgs) gxszxtbevo()).getHasCard(), false, ((RegistrationArgs) gxszxtbevo()).getLoymaxToken(), ((RegistrationArgs) gxszxtbevo()).getResult(), false, 19134975, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f31718zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f31719iobyxmoadg), this.f31717ppxfxbqfkf, new zoijcleaow());
    }
}
