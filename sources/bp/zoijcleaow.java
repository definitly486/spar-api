package bp;

import a8.eablkybsjg;
import a8.lqeggnwhkg;
import a8.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.impl.domain.deleteaccount.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ru.myspar.auth.impl.domain.deleteaccount.store.iobyxmoadg f16916ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f16917zoijcleaow;

    public zoijcleaow(lqeggnwhkg storeFactory, ru.myspar.auth.impl.domain.deleteaccount.store.iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f16917zoijcleaow = storeFactory;
        this.f16916ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(false, null, null, false, 0, 0, false, null, false, 511, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f16917zoijcleaow, state, new wkgbmnqykc(iobyxmoadg.C0304iobyxmoadg.f16915iobyxmoadg), this.f16916ppxfxbqfkf, new ru.myspar.auth.impl.domain.deleteaccount.store.zoijcleaow());
    }
}
