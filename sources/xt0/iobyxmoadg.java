package xt0;

import ey0.CoordinatesDto;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.components.address.api.model.UserAddress;
import zt0.CreateOrUpdateDeliveryAddressRequest;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final CreateOrUpdateDeliveryAddressRequest iobyxmoadg(UserAddress.Delivery delivery) {
        zdlpuopuiu.btonecajqb(delivery, "<this>");
        return new CreateOrUpdateDeliveryAddressRequest(jx0.iobyxmoadg.iobyxmoadg(delivery.getAddressId()), delivery.getFullAddress(), delivery.getShortAddress(), new CoordinatesDto(delivery.getLocation().getLatitude(), delivery.getLocation().getLongitude()), jx0.iobyxmoadg.iobyxmoadg(delivery.getCustomName()), delivery.getIsPrivateHouse(), Boolean.valueOf(delivery.getHasGate()), jx0.iobyxmoadg.iobyxmoadg(delivery.getFlat()), jx0.iobyxmoadg.iobyxmoadg(delivery.getEntrance()), jx0.iobyxmoadg.iobyxmoadg(delivery.getFloor()), jx0.iobyxmoadg.iobyxmoadg(delivery.getIntercom()));
    }
}
