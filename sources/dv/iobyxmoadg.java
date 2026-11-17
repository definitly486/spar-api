package dv;

import fv.CreateOrUpdateDeliveryAddressRequest;
import kotlin.jvm.internal.zdlpuopuiu;
import mz.CoordinatesDto;
import ru.myspar.components.address.api.model.UserAddress;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final CreateOrUpdateDeliveryAddressRequest iobyxmoadg(UserAddress.Delivery delivery) {
        zdlpuopuiu.btonecajqb(delivery, "<this>");
        return new CreateOrUpdateDeliveryAddressRequest(oy.iobyxmoadg.iobyxmoadg(delivery.getAddressId()), delivery.getFullAddress(), delivery.getShortAddress(), new CoordinatesDto(delivery.getLocation().getLatitude(), delivery.getLocation().getLongitude()), oy.iobyxmoadg.iobyxmoadg(delivery.getCustomName()), delivery.getIsPrivateHouse(), Boolean.valueOf(delivery.getHasGate()), oy.iobyxmoadg.iobyxmoadg(delivery.getFlat()), oy.iobyxmoadg.iobyxmoadg(delivery.getEntrance()), oy.iobyxmoadg.iobyxmoadg(delivery.getFloor()), oy.iobyxmoadg.iobyxmoadg(delivery.getIntercom()));
    }
}
