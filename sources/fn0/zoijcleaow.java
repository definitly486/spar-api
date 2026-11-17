package fn0;

import a8.eablkybsjg;
import a8.lqeggnwhkg;
import a8.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f34470ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.iobyxmoadg f34471wkgbmnqykc;

    public zoijcleaow(lqeggnwhkg storeFactory, ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f34470ppxfxbqfkf = storeFactory;
        this.f34471wkgbmnqykc = executor;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f34470ppxfxbqfkf, state, new wkgbmnqykc(iobyxmoadg.C0760iobyxmoadg.f34469iobyxmoadg), this.f34471wkgbmnqykc, new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.zoijcleaow());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(false, null, null, false, 0, 0, false, null, false, null, 1023, null);
    }
}
