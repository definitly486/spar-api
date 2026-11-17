package sn;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.address.api.model.ShopSearchArgs;
import ru.myspar.address.impl.shop_search.domain.State;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f107739ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f107740zoijcleaow;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f107740zoijcleaow = storeFactory;
        this.f107739ppxfxbqfkf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8.zoijcleaow wflxmlrfwp(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f107739ppxfxbqfkf;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(((ShopSearchArgs) gxszxtbevo()).getUserLocation(), null, null, false, null, 30, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return a8.lqeggnwhkg.zoijcleaow.iobyxmoadg(this.f107740zoijcleaow, nufgyqmvbu.class.getName(), false, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f107741iobyxmoadg), new tg.iobyxmoadg() { // from class: sn.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.wflxmlrfwp(this.f107738zdlpuopuiu);
            }
        }, new zoijcleaow(), 2, null);
    }
}
