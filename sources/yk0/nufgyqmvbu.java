package yk0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.activation_card.impl.domain.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f125572ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f125573wkgbmnqykc;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f125572ppxfxbqfkf = storeFactory;
        this.f125573wkgbmnqykc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8.zoijcleaow agtfadlqog(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f125573wkgbmnqykc;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(null, false, null, false, false, 31, null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return a8.lqeggnwhkg.zoijcleaow.iobyxmoadg(this.f125572ppxfxbqfkf, nufgyqmvbu.class.getName(), false, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f125574iobyxmoadg), new tg.iobyxmoadg() { // from class: yk0.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.agtfadlqog(this.f125571zdlpuopuiu);
            }
        }, new zoijcleaow(), 2, null);
    }
}
