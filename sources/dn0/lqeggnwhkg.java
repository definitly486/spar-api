package dn0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.auth.api.model.AuthBySmsArgs;
import ru.myspar.proloyalty.auth.impl.domain.authbysms.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f29238ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f29239wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f29238ppxfxbqfkf = storeFactory;
        this.f29239wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f29238ppxfxbqfkf, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f29240iobyxmoadg), this.f29239wkgbmnqykc, new zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(false, ((AuthBySmsArgs) gxszxtbevo()).getPhoneNumber(), ((AuthBySmsArgs) gxszxtbevo()).getHash(), null, false, false, false, false, String.valueOf(((AuthBySmsArgs) gxszxtbevo()).getTimeLimit()), 249, null);
    }
}
