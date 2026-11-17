package fn;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.address.api.model.AddressListArgs;
import ru.myspar.address.impl.addresslist.store.State;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f34457ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f34458zoijcleaow;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f34458zoijcleaow = storeFactory;
        this.f34457ppxfxbqfkf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8.zoijcleaow wflxmlrfwp(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f34457ppxfxbqfkf;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        return new State(false, null, null, null, ((AddressListArgs) gxszxtbevo()).getAddressType(), ((AddressListArgs) gxszxtbevo()).getTypeSelectionEnable(), 15, null);
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return a8.lqeggnwhkg.zoijcleaow.iobyxmoadg(this.f34458zoijcleaow, nufgyqmvbu.class.getName(), false, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f34459iobyxmoadg), new tg.iobyxmoadg() { // from class: fn.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.wflxmlrfwp(this.f34456zdlpuopuiu);
            }
        }, new zoijcleaow(), 2, null);
    }
}
