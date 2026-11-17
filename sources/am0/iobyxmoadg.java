package am0;

import b31.gxszxtbevo;
import bm0.zoijcleaow;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.address.api.model.AddressMapScreenFlow;
import ru.myspar.proloyalty.address.impl.map.domain.State;
import ru.myspar.proloyalty.address.impl.map.domain.models.AddressMapShop;
import ru.myspar.proloyalty.common.models.LocationData;
import tt0.agtfadlqog;
import tt0.ojitshcjhn;
import tt0.rgvfuqvkyq;
import yl0.dxjokdxxww;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    private static final List eablkybsjg(List list, String str) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AddressMapShop addressMapShop = (AddressMapShop) it.next();
            arrayList.add(new agtfadlqog(addressMapShop.getLocation(), new zoijcleaow(addressMapShop.getId(), addressMapShop.getAddress()), zdlpuopuiu.eablkybsjg(addressMapShop.getId(), str) ? gxszxtbevo.ic_map_shop_selected_pin : gxszxtbevo.ic_map_shop_pin, true));
        }
        return arrayList;
    }

    private static final List iobyxmoadg(List list, LocationData locationData) {
        return locationData == null ? list : jyumaefscl.jrbgnlbqoe(list, new agtfadlqog(locationData, null, gxszxtbevo.ic_user_location_map_pin, true));
    }

    private static final boolean ppxfxbqfkf(AddressMapScreenFlow addressMapScreenFlow) {
        if (addressMapScreenFlow instanceof AddressMapScreenFlow.Delivery) {
            return ((AddressMapScreenFlow.Delivery) addressMapScreenFlow).getIsIncludedInTheDeliveryArea();
        }
        if (addressMapScreenFlow instanceof AddressMapScreenFlow.PickUp) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final dxjokdxxww wkgbmnqykc(State state) {
        cl0.zoijcleaow zoijcleaowVar;
        List listIobyxmoadg;
        zdlpuopuiu.btonecajqb(state, "<this>");
        boolean isLoading = state.getIsLoading();
        AddressMapScreenFlow currentFlow = state.getCurrentFlow();
        if (currentFlow instanceof AddressMapScreenFlow.Delivery) {
            zoijcleaowVar = cl0.zoijcleaow.Delivery;
        } else {
            if (!(currentFlow instanceof AddressMapScreenFlow.PickUp)) {
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaowVar = cl0.zoijcleaow.PickUp;
        }
        bm0.iobyxmoadg iobyxmoadgVar = new bm0.iobyxmoadg(zoijcleaowVar, zoijcleaow(state.getCurrentFlow()), (state.getIsNeededShowAddressShimmer() || state.getIsLoading() || !ppxfxbqfkf(state.getCurrentFlow())) ? false : true, state.getIsNeededShowAddressShimmer(), ppxfxbqfkf(state.getCurrentFlow()), state.getIsAddressTypeSelectionEnabled());
        LocationData cameraPosition = state.getMapCameraState().getCameraPosition();
        float cameraZoom = state.getMapCameraState().getCameraZoom();
        rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(1.0f, 21.0f);
        boolean z13 = state.getCurrentFlow() instanceof AddressMapScreenFlow.Delivery;
        AddressMapScreenFlow currentFlow2 = state.getCurrentFlow();
        if (currentFlow2 instanceof AddressMapScreenFlow.Delivery) {
            listIobyxmoadg = jyumaefscl.wflxmlrfwp();
        } else {
            if (!(currentFlow2 instanceof AddressMapScreenFlow.PickUp)) {
                throw new NoWhenBranchMatchedException();
            }
            listIobyxmoadg = iobyxmoadg(eablkybsjg(state.getPickUpShopList(), ((AddressMapScreenFlow.PickUp) state.getCurrentFlow()).getShopId()), state.getUserLocation());
        }
        return new dxjokdxxww(isLoading, new ojitshcjhn(cameraPosition, cameraZoom, rgvfuqvkyqVar, z13, listIobyxmoadg), iobyxmoadgVar);
    }

    private static final String zoijcleaow(AddressMapScreenFlow addressMapScreenFlow) {
        if (addressMapScreenFlow instanceof AddressMapScreenFlow.Delivery) {
            return ((AddressMapScreenFlow.Delivery) addressMapScreenFlow).getShortAddress();
        }
        if (addressMapScreenFlow instanceof AddressMapScreenFlow.PickUp) {
            return ((AddressMapScreenFlow.PickUp) addressMapScreenFlow).getFullAddress();
        }
        throw new NoWhenBranchMatchedException();
    }
}
