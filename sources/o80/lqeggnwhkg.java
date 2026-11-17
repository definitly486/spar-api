package o80;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.updateapplicationtwo.store.State;
import ru.myspar.domain.feature.updateapplicationtwo.store.UpdateApplicationTwoDialogArgs;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f72323ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f72324zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f72324zoijcleaow = storeFactory;
        this.f72323ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(null, null, null, null, null, 31, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f72324zoijcleaow, state, new a8.wkgbmnqykc(new ppxfxbqfkf.iobyxmoadg((UpdateApplicationTwoDialogArgs) gxszxtbevo())), this.f72323ppxfxbqfkf, new zoijcleaow());
    }
}
