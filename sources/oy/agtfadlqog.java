package oy;

import a00.ClosestShopDto;
import a00.ShopDto;
import a00.ShopServiceDto;
import a00.ShopTypeDto;
import a00.ShopsDto;
import a00.ShopsReferencesDto;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.shop.Shop;
import ru.myspar.core.domain.models.shop.ShopService;

/* JADX INFO: loaded from: classes4.dex */
public abstract class agtfadlqog {
    public static final s10.wkgbmnqykc eablkybsjg(ShopsDto shopsDto) {
        s10.gxszxtbevo gxszxtbevoVar;
        zdlpuopuiu.btonecajqb(shopsDto, "<this>");
        List shops = shopsDto.getShops();
        if (shops == null) {
            shops = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(shops, 10));
        Iterator it = shops.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((ShopDto) it.next()));
        }
        ShopsReferencesDto shopsReferences = shopsDto.getShopsReferences();
        if (shopsReferences == null || (gxszxtbevoVar = gxszxtbevo(shopsReferences)) == null) {
            gxszxtbevoVar = new s10.gxszxtbevo(null, null, 3, null);
        }
        return new s10.wkgbmnqykc(arrayList, gxszxtbevoVar);
    }

    public static final s10.gxszxtbevo gxszxtbevo(ShopsReferencesDto shopsReferencesDto) {
        zdlpuopuiu.btonecajqb(shopsReferencesDto, "<this>");
        List shopTypes = shopsReferencesDto.getShopTypes();
        if (shopTypes == null) {
            shopTypes = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(shopTypes, 10));
        Iterator it = shopTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(wkgbmnqykc((ShopTypeDto) it.next()));
        }
        List shopServices = shopsReferencesDto.getShopServices();
        if (shopServices == null) {
            shopServices = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(shopServices, 10));
        Iterator it2 = shopServices.iterator();
        while (it2.hasNext()) {
            arrayList2.add(zoijcleaow((ShopServiceDto) it2.next()));
        }
        return new s10.gxszxtbevo(arrayList, arrayList2);
    }

    public static final Shop iobyxmoadg(ShopDto shopDto) {
        zdlpuopuiu.btonecajqb(shopDto, "<this>");
        List services = shopDto.getServices();
        List pics = shopDto.getPics();
        Map intervals = shopDto.getIntervals();
        if (intervals == null) {
            intervals = tzroggbefp.dxjokdxxww();
        }
        Map map = intervals;
        String xmlId = shopDto.getXmlId();
        if (xmlId == null) {
            xmlId = "";
        }
        return new Shop(services, pics, map, xmlId, shopDto.getRegion(), shopDto.getCity(), shopDto.getName(), shopDto.getType(), shopDto.getAddress(), shopDto.getMetro(), shopDto.getHours(), shopDto.getLat(), shopDto.getLng(), 0.0d, shopDto.getIsForPickup(), 8192, null);
    }

    public static final s10.iobyxmoadg ppxfxbqfkf(ClosestShopDto closestShopDto) {
        zdlpuopuiu.btonecajqb(closestShopDto, "<this>");
        return new s10.iobyxmoadg(closestShopDto.getXmlId(), closestShopDto.getName(), closestShopDto.getAddress());
    }

    public static final s10.ppxfxbqfkf wkgbmnqykc(ShopTypeDto shopTypeDto) {
        zdlpuopuiu.btonecajqb(shopTypeDto, "<this>");
        return new s10.ppxfxbqfkf(shopTypeDto.getName(), shopTypeDto.getIcon());
    }

    public static final ShopService zoijcleaow(ShopServiceDto shopServiceDto) {
        zdlpuopuiu.btonecajqb(shopServiceDto, "<this>");
        return new ShopService(shopServiceDto.getName(), shopServiceDto.getIcon(), shopServiceDto.getPic(), false, 8, null);
    }
}
