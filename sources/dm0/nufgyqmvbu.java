package dm0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.address.api.model.ShopSearchArgs;
import ru.myspar.proloyalty.address.impl.shop_search.domain.State;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f29160ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f29161wkgbmnqykc;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f29160ppxfxbqfkf = storeFactory;
        this.f29161wkgbmnqykc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8.zoijcleaow agtfadlqog(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f29161wkgbmnqykc;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(((ShopSearchArgs) gxszxtbevo()).getUserLocation(), null, null, false, null, 30, null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return a8.lqeggnwhkg.zoijcleaow.iobyxmoadg(this.f29160ppxfxbqfkf, nufgyqmvbu.class.getName(), false, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f29162iobyxmoadg), new tg.iobyxmoadg() { // from class: dm0.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.agtfadlqog(this.f29159zdlpuopuiu);
            }
        }, new zoijcleaow(), 2, null);
    }
}
