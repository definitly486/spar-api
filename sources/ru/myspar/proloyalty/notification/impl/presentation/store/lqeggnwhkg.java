package ru.myspar.proloyalty.notification.impl.presentation.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.notification.impl.presentation.store.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f98540ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f98541wkgbmnqykc;

    public lqeggnwhkg(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f98540ppxfxbqfkf = storeFactory;
        this.f98541wkgbmnqykc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8.zoijcleaow agtfadlqog(lqeggnwhkg lqeggnwhkgVar) {
        return lqeggnwhkgVar.f98541wkgbmnqykc;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return a8.lqeggnwhkg.zoijcleaow.iobyxmoadg(this.f98540ppxfxbqfkf, lqeggnwhkg.class.getName(), false, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f98542iobyxmoadg), new tg.iobyxmoadg() { // from class: kf1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.agtfadlqog(this.f55374zdlpuopuiu);
            }
        }, new zoijcleaow(), 2, null);
    }
}
