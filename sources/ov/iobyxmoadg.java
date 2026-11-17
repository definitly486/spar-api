package ov;

import hg.jyumaefscl;
import iv.ppxfxbqfkf;
import iv.zoijcleaow;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mv.AddressByLocationDto;
import mv.CitiesOfPresenceDto;
import mv.ShopsByLocationDto;
import ru.myspar.common.models.LocationData;
import ru.myspar.components.geo.api.models.City;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final iv.iobyxmoadg iobyxmoadg(AddressByLocationDto addressByLocationDto) {
        zdlpuopuiu.btonecajqb(addressByLocationDto, "<this>");
        return (!addressByLocationDto.getIsDeliveryAvailable() || addressByLocationDto.getAddressInfo() == null) ? new iv.iobyxmoadg.C1053iobyxmoadg(addressByLocationDto.getTitle()) : new iv.iobyxmoadg.zoijcleaow(addressByLocationDto.getAddressInfo().getFullAddress(), addressByLocationDto.getAddressInfo().getShortAddress(), new LocationData(addressByLocationDto.getAddressInfo().getLatitude(), addressByLocationDto.getAddressInfo().getLongitude()));
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
