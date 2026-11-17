package mn;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.address.api.model.AddressMapScreenFlow;
import ru.myspar.address.impl.map.domain.State;
import ru.myspar.address.impl.map.domain.models.AddressMapCameraState;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return state.zoijcleaow((511 & 1) != 0 ? state.currentFlow : null, (511 & 2) != 0 ? state.mode : null, (511 & 4) != 0 ? state.mapCameraState : null, (511 & 8) != 0 ? state.isAddressTypeSelectionEnabled : false, (511 & 16) != 0 ? state.deliveryFlow : null, (511 & 32) != 0 ? state.pickUpFlow : null, (511 & 64) != 0 ? state.userLocation : null, (511 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.pickUpShopList : null, (511 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isNeededShowAddressShimmer : false, (511 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg());
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return state.zoijcleaow((511 & 1) != 0 ? state.currentFlow : null, (511 & 2) != 0 ? state.mode : null, (511 & 4) != 0 ? state.mapCameraState : null, (511 & 8) != 0 ? state.isAddressTypeSelectionEnabled : false, (511 & 16) != 0 ? state.deliveryFlow : null, (511 & 32) != 0 ? state.pickUpFlow : null, (511 & 64) != 0 ? state.userLocation : null, (511 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.pickUpShopList : null, (511 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isNeededShowAddressShimmer : ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), (511 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.lqeggnwhkg) {
            return state.zoijcleaow((511 & 1) != 0 ? state.currentFlow : null, (511 & 2) != 0 ? state.mode : null, (511 & 4) != 0 ? state.mapCameraState : null, (511 & 8) != 0 ? state.isAddressTypeSelectionEnabled : false, (511 & 16) != 0 ? state.deliveryFlow : null, (511 & 32) != 0 ? state.pickUpFlow : null, (511 & 64) != 0 ? state.userLocation : ((gxszxtbevo.lqeggnwhkg) msg).iobyxmoadg(), (511 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.pickUpShopList : null, (511 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isNeededShowAddressShimmer : false, (511 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            AddressMapCameraState mapCameraState = state.getMapCameraState();
            gxszxtbevo.wkgbmnqykc wkgbmnqykcVar = (gxszxtbevo.wkgbmnqykc) msg;
            LocationData locationDataIobyxmoadg = wkgbmnqykcVar.iobyxmoadg();
            Float fZoijcleaow = wkgbmnqykcVar.zoijcleaow();
            return state.zoijcleaow((511 & 1) != 0 ? state.currentFlow : null, (511 & 2) != 0 ? state.mode : null, (511 & 4) != 0 ? state.mapCameraState : mapCameraState.zoijcleaow(locationDataIobyxmoadg, fZoijcleaow != null ? fZoijcleaow.floatValue() : state.getMapCameraState().getCameraZoom()), (511 & 8) != 0 ? state.isAddressTypeSelectionEnabled : false, (511 & 16) != 0 ? state.deliveryFlow : null, (511 & 32) != 0 ? state.pickUpFlow : null, (511 & 64) != 0 ? state.userLocation : null, (511 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.pickUpShopList : null, (511 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isNeededShowAddressShimmer : false, (511 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return state.zoijcleaow((511 & 1) != 0 ? state.currentFlow : null, (511 & 2) != 0 ? state.mode : null, (511 & 4) != 0 ? state.mapCameraState : AddressMapCameraState.ppxfxbqfkf(state.getMapCameraState(), null, ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), 1, null), (511 & 8) != 0 ? state.isAddressTypeSelectionEnabled : false, (511 & 16) != 0 ? state.deliveryFlow : null, (511 & 32) != 0 ? state.pickUpFlow : null, (511 & 64) != 0 ? state.userLocation : null, (511 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.pickUpShopList : null, (511 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isNeededShowAddressShimmer : false, (511 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
        }
        if (!(msg instanceof gxszxtbevo.zoijcleaow)) {
            if (msg instanceof gxszxtbevo.C1399gxszxtbevo) {
                return state.zoijcleaow((511 & 1) != 0 ? state.currentFlow : null, (511 & 2) != 0 ? state.mode : null, (511 & 4) != 0 ? state.mapCameraState : null, (511 & 8) != 0 ? state.isAddressTypeSelectionEnabled : false, (511 & 16) != 0 ? state.deliveryFlow : null, (511 & 32) != 0 ? state.pickUpFlow : null, (511 & 64) != 0 ? state.userLocation : null, (511 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.pickUpShopList : ((gxszxtbevo.C1399gxszxtbevo) msg).iobyxmoadg(), (511 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isNeededShowAddressShimmer : false, (511 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
            }
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
        AddressMapScreenFlow addressMapScreenFlowIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        AddressMapScreenFlow addressMapScreenFlowIobyxmoadg2 = zoijcleaowVar.iobyxmoadg();
        AddressMapScreenFlow.Delivery deliveryFlow = addressMapScreenFlowIobyxmoadg2 instanceof AddressMapScreenFlow.Delivery ? (AddressMapScreenFlow.Delivery) addressMapScreenFlowIobyxmoadg2 : null;
        if (deliveryFlow == null) {
            deliveryFlow = state.getDeliveryFlow();
        }
        AddressMapScreenFlow.Delivery delivery = deliveryFlow;
        AddressMapScreenFlow addressMapScreenFlowIobyxmoadg3 = zoijcleaowVar.iobyxmoadg();
        AddressMapScreenFlow.PickUp pickUp = addressMapScreenFlowIobyxmoadg3 instanceof AddressMapScreenFlow.PickUp ? (AddressMapScreenFlow.PickUp) addressMapScreenFlowIobyxmoadg3 : null;
        return state.zoijcleaow((511 & 1) != 0 ? state.currentFlow : addressMapScreenFlowIobyxmoadg, (511 & 2) != 0 ? state.mode : null, (511 & 4) != 0 ? state.mapCameraState : null, (511 & 8) != 0 ? state.isAddressTypeSelectionEnabled : false, (511 & 16) != 0 ? state.deliveryFlow : delivery, (511 & 32) != 0 ? state.pickUpFlow : pickUp == null ? state.getPickUpFlow() : pickUp, (511 & 64) != 0 ? state.userLocation : null, (511 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.pickUpShopList : null, (511 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.isNeededShowAddressShimmer : false, (511 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isLoading : false);
    }
}
