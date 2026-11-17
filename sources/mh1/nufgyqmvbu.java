package mh1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.popups.impl.domain.PopupsArgs;
import ru.myspar.proloyalty.popups.impl.domain.State;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f67201ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f67202wkgbmnqykc;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f67201ppxfxbqfkf = storeFactory;
        this.f67202wkgbmnqykc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8.zoijcleaow agtfadlqog(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f67202wkgbmnqykc;
    }

    private final State rgvfuqvkyq(PopupsArgs popupsArgs) {
        return new State(popupsArgs.getId(), popupsArgs.getPage(), popupsArgs.getNavLink(), popupsArgs.getReference(), popupsArgs.getTitle(), popupsArgs.getSubtitle(), popupsArgs.getImageUrl(), popupsArgs.getText(), popupsArgs.getButtonText());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return rgvfuqvkyq((PopupsArgs) gxszxtbevo());
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return a8.lqeggnwhkg.zoijcleaow.iobyxmoadg(this.f67201ppxfxbqfkf, nufgyqmvbu.class.getName(), false, state, new a8.wkgbmnqykc(ppxfxbqfkf.f67203iobyxmoadg), new tg.iobyxmoadg() { // from class: mh1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.agtfadlqog(this.f67200zdlpuopuiu);
            }
        }, new zoijcleaow(), 2, null);
    }
}
