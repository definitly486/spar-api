package gm0;

import cm0.eablkybsjg;
import em0.gxszxtbevo;
import hg.jyumaefscl;
import hm0.ppxfxbqfkf;
import hm0.wkgbmnqykc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.address.impl.shop_search.domain.State;
import ru.myspar.proloyalty.components.search_address.api.model.SearchShop;
import ru.myspar.proloyalty.components.search_address.api.model.ShopTag;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: gm0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C0857iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f37907iobyxmoadg;

        static {
            int[] iArr = new int[eablkybsjg.values().length];
            try {
                iArr[eablkybsjg.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eablkybsjg.INPUT_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f37907iobyxmoadg = iArr;
        }
    }

    private static final List iobyxmoadg(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            arrayList.add(new hm0.iobyxmoadg.zoijcleaow(str));
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(ppxfxbqfkf((SearchShop) it.next()));
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    private static final hm0.iobyxmoadg.C0945iobyxmoadg ppxfxbqfkf(SearchShop searchShop) {
        String id2 = searchShop.getId();
        boolean isSelected = searchShop.getIsSelected();
        String image = searchShop.getImage();
        String shortAddress = searchShop.getShortAddress();
        String workingHours = searchShop.getWorkingHours();
        List tags = searchShop.getTags();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(tags, 10));
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            arrayList.add(wkgbmnqykc((ShopTag) it.next()));
        }
        return new hm0.iobyxmoadg.C0945iobyxmoadg(id2, isSelected, image, shortAddress, workingHours, arrayList);
    }

    private static final wkgbmnqykc wkgbmnqykc(ShopTag shopTag) {
        return new wkgbmnqykc(shopTag.getName(), shopTag.getIcon());
    }

    public static final gxszxtbevo zoijcleaow(State state, draadjrbmk getStringRes) {
        cm0.gxszxtbevo gxszxtbevoVar;
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        boolean isLoading = state.getIsLoading();
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(el0.gxszxtbevo.proloyalty_shop_search_hint_input, state.getSearchInput(), true);
        List listIobyxmoadg = iobyxmoadg(state.getShopsMap());
        eablkybsjg searchInputWarning = state.getSearchInputWarning();
        if (searchInputWarning != null) {
            int i13 = C0857iobyxmoadg.f37907iobyxmoadg[searchInputWarning.ordinal()];
            if (i13 == 1) {
                gxszxtbevoVar = new cm0.gxszxtbevo((String) getStringRes.invoke(Integer.valueOf(el0.gxszxtbevo.proloyalty_shop_search_not_found_title)), (String) getStringRes.invoke(Integer.valueOf(el0.gxszxtbevo.proloyalty_shop_search_not_found_description)));
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                gxszxtbevoVar = new cm0.gxszxtbevo(dxjokdxxww.ppxfxbqfkf(), (String) getStringRes.invoke(Integer.valueOf(el0.gxszxtbevo.proloyalty_shop_search_hint)));
            }
        } else {
            gxszxtbevoVar = null;
        }
        return new gxszxtbevo(isLoading, ppxfxbqfkfVar, listIobyxmoadg, gxszxtbevoVar);
    }
}
