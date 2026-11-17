package iu0;

import cu0.ppxfxbqfkf;
import cu0.zoijcleaow;
import gu0.AddressByLocationDto;
import gu0.CitiesOfPresenceDto;
import gu0.ShopsByLocationDto;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.components.geo.api.models.City;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final cu0.iobyxmoadg iobyxmoadg(AddressByLocationDto addressByLocationDto) {
        zdlpuopuiu.btonecajqb(addressByLocationDto, "<this>");
        return (!addressByLocationDto.getIsDeliveryAvailable() || addressByLocationDto.getAddressInfo() == null) ? new cu0.iobyxmoadg.C0456iobyxmoadg(addressByLocationDto.getTitle()) : new cu0.iobyxmoadg.zoijcleaow(addressByLocationDto.getAddressInfo().getFullAddress(), addressByLocationDto.getAddressInfo().getShortAddress(), new LocationData(addressByLocationDto.getAddressInfo().getLatitude(), addressByLocationDto.getAddressInfo().getLongitude()));
    }

    public static final City ppxfxbqfkf(CitiesOfPresenceDto.CityDto cityDto) {
        zdlpuopuiu.btonecajqb(cityDto, "<this>");
        return new City(cityDto.getId(), cityDto.getName(), cityDto.getDefaultShopId());
    }

    public static final ppxfxbqfkf zoijcleaow(ShopsByLocationDto shopsByLocationDto) {
        zdlpuopuiu.btonecajqb(shopsByLocationDto, "<this>");
        String selectedShopId = shopsByLocationDto.getSelectedShopId();
        List<ShopsByLocationDto.ShopDto> shops = shopsByLocationDto.getShops();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(shops, 10));
        for (ShopsByLocationDto.ShopDto shopDto : shops) {
            arrayList.add(new zoijcleaow(shopDto.getShopId(), shopDto.getShortAddress(), new LocationData(shopDto.getLatitude(), shopDto.getLongitude())));
        }
        return new ppxfxbqfkf(selectedShopId, arrayList);
    }
}
