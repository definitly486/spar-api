package jx0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import sy0.ShopDto;
import sy0.ShopsReferencesDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class rgvfuqvkyq {
    public static final iz0.iobyxmoadg iobyxmoadg(SpecialBannerMapDto specialBannerMapDto) {
        h01.gxszxtbevo gxszxtbevoVar;
        zdlpuopuiu.btonecajqb(specialBannerMapDto, "<this>");
        String id2 = specialBannerMapDto.getId();
        String title = specialBannerMapDto.getTitle();
        if (title == null) {
            title = "";
        }
        List shops = specialBannerMapDto.getShops();
        if (shops == null) {
            shops = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(shops, 10));
        Iterator it = shops.iterator();
        while (it.hasNext()) {
            arrayList.add(agtfadlqog.eablkybsjg((ShopDto) it.next()));
        }
        ShopsReferencesDto shopsReferences = specialBannerMapDto.getShopsReferences();
        if (shopsReferences == null || (gxszxtbevoVar = agtfadlqog.wkgbmnqykc(shopsReferences)) == null) {
            gxszxtbevoVar = new h01.gxszxtbevo(null, null, 3, null);
        }
        return new iz0.iobyxmoadg(id2, title, arrayList, gxszxtbevoVar);
    }
}
