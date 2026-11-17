package xl0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.address.api.model.AddressMapScreenArgs;
import ru.myspar.proloyalty.address.api.model.AddressMapScreenFlow;
import ru.myspar.proloyalty.address.impl.map.domain.State;
import ru.myspar.proloyalty.address.impl.map.domain.models.AddressMapCameraState;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu extends or0.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a8.lqeggnwhkg f122847ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f122848wkgbmnqykc;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f122847ppxfxbqfkf = storeFactory;
        this.f122848wkgbmnqykc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8.zoijcleaow agtfadlqog(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f122848wkgbmnqykc;
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public State btonecajqb() {
        AddressMapScreenFlow.Companion companion = AddressMapScreenFlow.INSTANCE;
        AddressMapScreenFlow.Delivery deliveryIobyxmoadg = companion.iobyxmoadg();
        AddressMapScreenFlow.PickUp pickUpZoijcleaow = companion.zoijcleaow();
        AddressMapScreenFlow flow = ((AddressMapScreenArgs) gxszxtbevo()).getFlow();
        LocationData location = flow.getLocation();
        if (location == null) {
            location = cl0.ppxfxbqfkf.iobyxmoadg();
        }
        if (flow instanceof AddressMapScreenFlow.Delivery) {
            deliveryIobyxmoadg = (AddressMapScreenFlow.Delivery) flow;
        } else {
            if (!(flow instanceof AddressMapScreenFlow.PickUp)) {
                throw new NoWhenBranchMatchedException();
            }
            pickUpZoijcleaow = (AddressMapScreenFlow.PickUp) flow;
        }
        return new State(flow, ((AddressMapScreenArgs) gxszxtbevo()).getMode(), new AddressMapCameraState(location, flow.cdpycssgdh()), ((AddressMapScreenArgs) gxszxtbevo()).getIsAddressTypeSelectionEnabled(), deliveryIobyxmoadg, pickUpZoijcleaow, null, null, false, false, 960, null);
    }

    @Override // or0.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return a8.lqeggnwhkg.zoijcleaow.iobyxmoadg(this.f122847ppxfxbqfkf, nufgyqmvbu.class.getName(), false, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f122849iobyxmoadg), new tg.iobyxmoadg() { // from class: xl0.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.agtfadlqog(this.f122846zdlpuopuiu);
            }
        }, new zoijcleaow(), 2, null);
    }
}
