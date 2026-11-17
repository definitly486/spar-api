package jx0;

import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.shop.Shop;
import ru.myspar.proloyalty.core.domain.models.shop.ShopService;
import sy0.ClosestShopDto;
import sy0.ShopDto;
import sy0.ShopServiceDto;
import sy0.ShopTypeDto;
import sy0.ShopsDto;
import sy0.ShopsReferencesDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class agtfadlqog {
    public static final Shop eablkybsjg(ShopDto shopDto) {
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

    public static final ShopService gxszxtbevo(ShopServiceDto shopServiceDto) {
        zdlpuopuiu.btonecajqb(shopServiceDto, "<this>");
        return new ShopService(shopServiceDto.getName(), shopServiceDto.getIcon(), shopServiceDto.getPic(), false, 8, null);
    }

    public static final h01.iobyxmoadg iobyxmoadg(ClosestShopDto closestShopDto) {
        zdlpuopuiu.btonecajqb(closestShopDto, "<this>");
        return new h01.iobyxmoadg(closestShopDto.getXmlId(), closestShopDto.getName(), closestShopDto.getAddress());
    }

    public static final h01.wkgbmnqykc ppxfxbqfkf(ShopsDto shopsDto) {
        h01.gxszxtbevo gxszxtbevoVar;
        zdlpuopuiu.btonecajqb(shopsDto, "<this>");
        List shops = shopsDto.getShops();
        if (shops == null) {
            shops = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(shops, 10));
        Iterator it = shops.iterator();
        while (it.hasNext()) {
            arrayList.add(eablkybsjg((ShopDto) it.next()));
        }
        ShopsReferencesDto shopsReferences = shopsDto.getShopsReferences();
        if (shopsReferences == null || (gxszxtbevoVar = wkgbmnqykc(shopsReferences)) == null) {
            gxszxtbevoVar = new h01.gxszxtbevo(null, null, 3, null);
        }
        return new h01.wkgbmnqykc(arrayList, gxszxtbevoVar);
    }

    public static final h01.gxszxtbevo wkgbmnqykc(ShopsReferencesDto shopsReferencesDto) {
        zdlpuopuiu.btonecajqb(shopsReferencesDto, "<this>");
        List shopTypes = shopsReferencesDto.getShopTypes();
        if (shopTypes == null) {
            shopTypes = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(shopTypes, 10));
        Iterator it = shopTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((ShopTypeDto) it.next()));
        }
        List shopServices = shopsReferencesDto.getShopServices();
        if (shopServices == null) {
            shopServices = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(shopServices, 10));
        Iterator it2 = shopServices.iterator();
        while (it2.hasNext()) {
            arrayList2.add(gxszxtbevo((ShopServiceDto) it2.next()));
        }
        return new h01.gxszxtbevo(arrayList, arrayList2);
    }

    public static final h01.ppxfxbqfkf zoijcleaow(ShopTypeDto shopTypeDto) {
        zdlpuopuiu.btonecajqb(shopTypeDto, "<this>");
        return new h01.ppxfxbqfkf(shopTypeDto.getName(), shopTypeDto.getIcon());
    }
}
