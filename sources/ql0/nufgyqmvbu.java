package ql0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.address.api.model.AddressListArgs;
import ru.myspar.proloyalty.address.impl.addresslist.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f79136ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f79137wkgbmnqykc;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f79136ppxfxbqfkf = storeFactory;
        this.f79137wkgbmnqykc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8.zoijcleaow agtfadlqog(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f79137wkgbmnqykc;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        return new State(false, null, null, null, ((AddressListArgs) gxszxtbevo()).getAddressType(), ((AddressListArgs) gxszxtbevo()).getTypeSelectionEnable(), 15, null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return a8.lqeggnwhkg.zoijcleaow.iobyxmoadg(this.f79136ppxfxbqfkf, nufgyqmvbu.class.getName(), false, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f79138iobyxmoadg), new tg.iobyxmoadg() { // from class: ql0.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.agtfadlqog(this.f79135zdlpuopuiu);
            }
        }, new zoijcleaow(), 2, null);
    }
}
