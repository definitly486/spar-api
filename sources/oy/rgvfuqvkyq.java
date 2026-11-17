package oy;

import a00.ShopDto;
import a00.ShopsReferencesDto;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rgvfuqvkyq {
    public static final r00.iobyxmoadg iobyxmoadg(SpecialBannerMapDto specialBannerMapDto) {
        s10.gxszxtbevo gxszxtbevoVar;
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
            arrayList.add(agtfadlqog.iobyxmoadg((ShopDto) it.next()));
        }
        ShopsReferencesDto shopsReferences = specialBannerMapDto.getShopsReferences();
        if (shopsReferences == null || (gxszxtbevoVar = agtfadlqog.gxszxtbevo(shopsReferences)) == null) {
            gxszxtbevoVar = new s10.gxszxtbevo(null, null, 3, null);
        }
        return new r00.iobyxmoadg(id2, title, arrayList, gxszxtbevoVar);
    }
}
