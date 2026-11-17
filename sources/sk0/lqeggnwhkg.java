package sk0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.profile.api.model.ProfileScreenPayload;
import ru.myspar.profile.impl.profile_screen.domain.store.State;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f107279ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f107280zoijcleaow;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f107280zoijcleaow = storeFactory;
        this.f107279ppxfxbqfkf = executor;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(false, null, false, false, false, 31, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return zoijcleaow(this.f107280zoijcleaow, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f107281iobyxmoadg, ppxfxbqfkf.wkgbmnqykc.f107283iobyxmoadg, ppxfxbqfkf.zoijcleaow.f107284iobyxmoadg, new ppxfxbqfkf.C2638ppxfxbqfkf((ProfileScreenPayload) gxszxtbevo())), this.f107279ppxfxbqfkf, new zoijcleaow());
    }
}
