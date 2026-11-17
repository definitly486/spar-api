package jx0;

import hg.jyumaefscl;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import py0.RestaurantDetailsDto;
import py0.RestaurantDto;
import py0.RestaurantProductDetailsDto;
import py0.RestaurantProductDto;
import py0.RestaurantSectionDto;
import py0.RestaurantsDto;
import ru.myspar.proloyalty.core.domain.models.restaurants.Restaurant;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantDetails;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantProduct;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantProductDetails;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantSection;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lqeggnwhkg f52490iobyxmoadg;

    public wflxmlrfwp(lqeggnwhkg measureTypeModelMapper) {
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        this.f52490iobyxmoadg = measureTypeModelMapper;
    }

    private final RestaurantSection btonecajqb(RestaurantSectionDto restaurantSectionDto) {
        return new RestaurantSection(restaurantSectionDto.getCode(), restaurantSectionDto.getName());
    }

    private final RestaurantProductDetails dxjokdxxww(RestaurantProductDetailsDto restaurantProductDetailsDto) {
        String id2 = restaurantProductDetailsDto.getId();
        String article = restaurantProductDetailsDto.getArticle();
        String name = restaurantProductDetailsDto.getName();
        double price = restaurantProductDetailsDto.getPrice();
        String photoUrl = restaurantProductDetailsDto.getPhotoUrl();
        if (photoUrl == null) {
            photoUrl = "";
        }
        String str = photoUrl;
        double weight = restaurantProductDetailsDto.getWeight();
        Boolean isDispPer100 = restaurantProductDetailsDto.getIsDispPer100();
        return new RestaurantProductDetails(id2, article, name, price, str, weight, isDispPer100 != null ? isDispPer100.booleanValue() : false, this.f52490iobyxmoadg.ppxfxbqfkf(restaurantProductDetailsDto.getUnits(), restaurantProductDetailsDto.getMeasure()), wkgbmnqykc(restaurantProductDetailsDto.getEnergy()), wkgbmnqykc(restaurantProductDetailsDto.getFats()), wkgbmnqykc(restaurantProductDetailsDto.getCarbo()), wkgbmnqykc(restaurantProductDetailsDto.getProtein()), restaurantProductDetailsDto.getDescription());
    }

    private final f01.iobyxmoadg eablkybsjg(RestaurantsDto restaurantsDto) {
        List items = restaurantsDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(gxszxtbevo((RestaurantDto) it.next()));
        }
        return new f01.iobyxmoadg(arrayList);
    }

    private final Restaurant gxszxtbevo(RestaurantDto restaurantDto) {
        String code = restaurantDto.getCode();
        String name = restaurantDto.getName();
        String logo = restaurantDto.getLogo();
        String str = logo == null ? "" : logo;
        String image = restaurantDto.getImage();
        return new Restaurant(code, name, str, image == null ? "" : image, restaurantDto.getAvgOrderTime(), restaurantDto.getMinOrderSum(), restaurantDto.getDeliveryPrice(), restaurantDto.getHours(), restaurantDto.getIsPickupAvailable(), restaurantDto.getIsDeliveryAvailable());
    }

    private final RestaurantDetails lqeggnwhkg(RestaurantDetailsDto restaurantDetailsDto) {
        String code = restaurantDetailsDto.getCode();
        String name = restaurantDetailsDto.getName();
        String logo = restaurantDetailsDto.getLogo();
        String str = logo == null ? "" : logo;
        String image = restaurantDetailsDto.getImage();
        String str2 = image == null ? "" : image;
        String avgOrderTime = restaurantDetailsDto.getAvgOrderTime();
        double minOrderSum = restaurantDetailsDto.getMinOrderSum();
        double deliveryPrice = restaurantDetailsDto.getDeliveryPrice();
        String hours = restaurantDetailsDto.getHours();
        String shortDescription = restaurantDetailsDto.getShortDescription();
        String deliveryDescription = restaurantDetailsDto.getDeliveryDescription();
        String address = restaurantDetailsDto.getAddress();
        double lat = restaurantDetailsDto.getLat();
        double lon = restaurantDetailsDto.getLon();
        boolean isPickupAvailable = restaurantDetailsDto.getIsPickupAvailable();
        boolean isDeliveryAvailable = restaurantDetailsDto.getIsDeliveryAvailable();
        List sections = restaurantDetailsDto.getSections();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(sections, 10));
        Iterator it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(btonecajqb((RestaurantSectionDto) it.next()));
        }
        List items = restaurantDetailsDto.getItems();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it2 = items.iterator();
        while (it2.hasNext()) {
            arrayList2.add(nufgyqmvbu((RestaurantProductDto) it2.next()));
        }
        return new RestaurantDetails(code, name, str, str2, avgOrderTime, minOrderSum, deliveryPrice, hours, shortDescription, deliveryDescription, address, lat, lon, isPickupAvailable, isDeliveryAvailable, arrayList, arrayList2, d21.zoijcleaow.iobyxmoadg(restaurantDetailsDto.getPaging()));
    }

    private final RestaurantProduct nufgyqmvbu(RestaurantProductDto restaurantProductDto) {
        String id2 = restaurantProductDto.getId();
        String article = restaurantProductDto.getArticle();
        String name = restaurantProductDto.getName();
        double price = restaurantProductDto.getPrice();
        String photoUrl = restaurantProductDto.getPhotoUrl();
        if (photoUrl == null) {
            photoUrl = "";
        }
        String str = photoUrl;
        double weight = restaurantProductDto.getWeight();
        MeasureTypeModel measureTypeModelPpxfxbqfkf = this.f52490iobyxmoadg.ppxfxbqfkf(restaurantProductDto.getUnits(), restaurantProductDto.getMeasure());
        Boolean isDispPer100 = restaurantProductDto.getIsDispPer100();
        return new RestaurantProduct(id2, article, name, price, str, weight, isDispPer100 != null ? isDispPer100.booleanValue() : false, measureTypeModelPpxfxbqfkf, null);
    }

    private final Double wkgbmnqykc(String str) {
        if (str == null) {
            str = "";
        }
        return kcexrzcfyt.agtfadlqog(kcexrzcfyt.hcddaimhww(str, StringUtils.COMMA, ".", false, 4, null));
    }

    public final f01.iobyxmoadg iobyxmoadg(RestaurantsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return eablkybsjg(dto);
    }

    public final RestaurantProductDetails ppxfxbqfkf(RestaurantProductDetailsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return dxjokdxxww(dto);
    }

    public final RestaurantDetails zoijcleaow(RestaurantDetailsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return lqeggnwhkg(dto);
    }
}
