package ti0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.options.impl.themeswitch.domain.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f110566ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f110567zoijcleaow;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, zoijcleaow executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f110567zoijcleaow = storeFactory;
        this.f110566ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(null, 1, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f110567zoijcleaow, state, new a8.wkgbmnqykc(wkgbmnqykc.iobyxmoadg.f110568iobyxmoadg), this.f110566ppxfxbqfkf, new ppxfxbqfkf());
    }
}
