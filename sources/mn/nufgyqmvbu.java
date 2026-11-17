package mn;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.address.api.model.AddressMapScreenArgs;
import ru.myspar.address.api.model.AddressMapScreenFlow;
import ru.myspar.address.impl.map.domain.State;
import ru.myspar.address.impl.map.domain.models.AddressMapCameraState;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu extends vs.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f67623ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a8.lqeggnwhkg f67624zoijcleaow;

    public nufgyqmvbu(a8.lqeggnwhkg storeFactory, iobyxmoadg executor) {
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f67624zoijcleaow = storeFactory;
        this.f67623ppxfxbqfkf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a8.zoijcleaow wflxmlrfwp(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.f67623ppxfxbqfkf;
    }

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public State dxjokdxxww() {
        AddressMapScreenFlow.Companion companion = AddressMapScreenFlow.INSTANCE;
        AddressMapScreenFlow.Delivery deliveryIobyxmoadg = companion.iobyxmoadg();
        AddressMapScreenFlow.PickUp pickUpZoijcleaow = companion.zoijcleaow();
        AddressMapScreenFlow flow = ((AddressMapScreenArgs) gxszxtbevo()).getFlow();
        LocationData location = flow.getLocation();
        if (location == null) {
            location = rm.ppxfxbqfkf.iobyxmoadg();
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

    @Override // vs.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public a8.eablkybsjg ppxfxbqfkf(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return a8.lqeggnwhkg.zoijcleaow.iobyxmoadg(this.f67624zoijcleaow, nufgyqmvbu.class.getName(), false, state, new a8.wkgbmnqykc(ppxfxbqfkf.iobyxmoadg.f67625iobyxmoadg), new tg.iobyxmoadg() { // from class: mn.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return nufgyqmvbu.wflxmlrfwp(this.f67622zdlpuopuiu);
            }
        }, new zoijcleaow(), 2, null);
    }
}
