package ov0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.components.search_address.api.model.SearchShop;
import ru.myspar.proloyalty.components.search_address.api.model.ShopTag;
import rv0.SearchShopDto;
import rv0.SearchShopsResponseDto;
import rv0.ShopTagDto;
import rv0.ShopsInfoDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final Map iobyxmoadg(SearchShopsResponseDto searchShopsResponseDto) {
        zdlpuopuiu.btonecajqb(searchShopsResponseDto, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<ShopsInfoDto> shopsInfoDto = searchShopsResponseDto.getShopsInfoDto();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(shopsInfoDto, 10));
        for (ShopsInfoDto shopsInfoDto2 : shopsInfoDto) {
            String city = shopsInfoDto2.getCity();
            List shops = shopsInfoDto2.getShops();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(shops, 10));
            Iterator it = shops.iterator();
            while (it.hasNext()) {
                arrayList2.add(zoijcleaow((SearchShopDto) it.next()));
            }
            arrayList.add((List) linkedHashMap.put(city, arrayList2));
        }
        return linkedHashMap;
    }

    public static final ShopTag ppxfxbqfkf(ShopTagDto shopTagDto) {
        zdlpuopuiu.btonecajqb(shopTagDto, "<this>");
        return new ShopTag(shopTagDto.getName(), shopTagDto.getIcon());
    }

    public static final SearchShop zoijcleaow(SearchShopDto searchShopDto) {
        zdlpuopuiu.btonecajqb(searchShopDto, "<this>");
        String id2 = searchShopDto.getId();
        String image = searchShopDto.getImage();
        String shortAddress = searchShopDto.getShortAddress();
        String workingHours = searchShopDto.getWorkingHours();
        List tags = searchShopDto.getTags();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(tags, 10));
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkf((ShopTagDto) it.next()));
        }
        return new SearchShop(id2, image, shortAddress, workingHours, arrayList, searchShopDto.getIsSelected(), new LocationData(searchShopDto.getLatitude(), searchShopDto.getLongitude()));
    }
}
