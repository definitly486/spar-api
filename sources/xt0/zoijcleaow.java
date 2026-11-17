package xt0;

import au0.AddressDto;
import au0.GetAddressesResponseDto;
import ey0.CoordinatesDto;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.components.address.api.model.UserAddress;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final UserAddress.Delivery iobyxmoadg(AddressDto addressDto) {
        Boolean hasGate;
        Boolean isPrivateHouse;
        CoordinatesDto coordinates;
        zdlpuopuiu.btonecajqb(addressDto, "<this>");
        String id2 = addressDto.getId();
        AddressDto.DetailInfoDto detailInfo = addressDto.getDetailInfo();
        String shortAddress = detailInfo != null ? detailInfo.getShortAddress() : null;
        if (shortAddress == null) {
            shortAddress = "";
        }
        AddressDto.DetailInfoDto detailInfo2 = addressDto.getDetailInfo();
        String fullAddress = detailInfo2 != null ? detailInfo2.getFullAddress() : null;
        if (fullAddress == null) {
            fullAddress = "";
        }
        AddressDto.DetailInfoDto detailInfo3 = addressDto.getDetailInfo();
        LocationData locationData = (detailInfo3 == null || (coordinates = detailInfo3.getCoordinates()) == null) ? new LocationData(0.0d, 0.0d) : new LocationData(coordinates.getLat(), coordinates.getLng());
        String title = addressDto.getTitle();
        if (title == null) {
            title = "";
        }
        AddressDto.DetailInfoDto detailInfo4 = addressDto.getDetailInfo();
        String flat = detailInfo4 != null ? detailInfo4.getFlat() : null;
        if (flat == null) {
            flat = "";
        }
        AddressDto.DetailInfoDto detailInfo5 = addressDto.getDetailInfo();
        String entrance = detailInfo5 != null ? detailInfo5.getEntrance() : null;
        if (entrance == null) {
            entrance = "";
        }
        AddressDto.DetailInfoDto detailInfo6 = addressDto.getDetailInfo();
        String floor = detailInfo6 != null ? detailInfo6.getFloor() : null;
        if (floor == null) {
            floor = "";
        }
        AddressDto.DetailInfoDto detailInfo7 = addressDto.getDetailInfo();
        String intercomCode = detailInfo7 != null ? detailInfo7.getIntercomCode() : null;
        String str = intercomCode == null ? "" : intercomCode;
        AddressDto.DetailInfoDto detailInfo8 = addressDto.getDetailInfo();
        boolean zBooleanValue = (detailInfo8 == null || (isPrivateHouse = detailInfo8.getIsPrivateHouse()) == null) ? false : isPrivateHouse.booleanValue();
        AddressDto.DetailInfoDto detailInfo9 = addressDto.getDetailInfo();
        boolean zBooleanValue2 = (detailInfo9 == null || (hasGate = detailInfo9.getHasGate()) == null) ? false : hasGate.booleanValue();
        Boolean isSelected = addressDto.getIsSelected();
        return new UserAddress.Delivery(id2, shortAddress, fullAddress, title, flat, entrance, floor, str, zBooleanValue, zBooleanValue2, locationData, isSelected != null ? isSelected.booleanValue() : false);
    }

    public static final ru.myspar.proloyalty.components.address.api.model.iobyxmoadg ppxfxbqfkf(GetAddressesResponseDto getAddressesResponseDto) {
        zdlpuopuiu.btonecajqb(getAddressesResponseDto, "<this>");
        List delivery = getAddressesResponseDto.getDelivery();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(delivery, 10));
        Iterator it = delivery.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((AddressDto) it.next()));
        }
        List pickup = getAddressesResponseDto.getPickup();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(pickup, 10));
        Iterator it2 = pickup.iterator();
        while (it2.hasNext()) {
            arrayList2.add(zoijcleaow((AddressDto) it2.next()));
        }
        return new ru.myspar.proloyalty.components.address.api.model.iobyxmoadg(arrayList, arrayList2);
    }

    public static final UserAddress.PickUp zoijcleaow(AddressDto addressDto) {
        zdlpuopuiu.btonecajqb(addressDto, "<this>");
        String id2 = addressDto.getId();
        String title = addressDto.getTitle();
        if (title == null) {
            title = "";
        }
        String subtitle = addressDto.getSubtitle();
        String str = subtitle != null ? subtitle : "";
        Boolean isSelected = addressDto.getIsSelected();
        return new UserAddress.PickUp(id2, title, str, isSelected != null ? isSelected.booleanValue() : false);
    }
}
