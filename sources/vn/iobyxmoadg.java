package vn;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import rn.eablkybsjg;
import ru.myspar.address.impl.shop_search.domain.State;
import ru.myspar.components.search_address.api.model.SearchShop;
import ru.myspar.components.search_address.api.model.ShopTag;
import tg.draadjrbmk;
import tn.gxszxtbevo;
import wn.ppxfxbqfkf;
import wn.wkgbmnqykc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: vn.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C2922iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f117509iobyxmoadg;

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
            f117509iobyxmoadg = iArr;
        }
    }

    private static final List iobyxmoadg(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            arrayList.add(new wn.iobyxmoadg.zoijcleaow(str));
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(ppxfxbqfkf((SearchShop) it.next()));
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    private static final wn.iobyxmoadg.C3020iobyxmoadg ppxfxbqfkf(SearchShop searchShop) {
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
        return new wn.iobyxmoadg.C3020iobyxmoadg(id2, isSelected, image, shortAddress, workingHours, arrayList);
    }

    private static final wkgbmnqykc wkgbmnqykc(ShopTag shopTag) {
        return new wkgbmnqykc(shopTag.getName(), shopTag.getIcon());
    }

    public static final gxszxtbevo zoijcleaow(State state, draadjrbmk getStringRes) {
        rn.gxszxtbevo gxszxtbevoVar;
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        boolean isLoading = state.getIsLoading();
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(tm.gxszxtbevo.shop_search_hint_input, state.getSearchInput(), true);
        List listIobyxmoadg = iobyxmoadg(state.getShopsMap());
        eablkybsjg searchInputWarning = state.getSearchInputWarning();
        if (searchInputWarning != null) {
            int i13 = C2922iobyxmoadg.f117509iobyxmoadg[searchInputWarning.ordinal()];
            if (i13 == 1) {
                gxszxtbevoVar = new rn.gxszxtbevo((String) getStringRes.invoke(Integer.valueOf(tm.gxszxtbevo.shop_search_not_found_title)), (String) getStringRes.invoke(Integer.valueOf(tm.gxszxtbevo.shop_search_not_found_description)));
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                gxszxtbevoVar = new rn.gxszxtbevo(k30.draadjrbmk.ppxfxbqfkf(), (String) getStringRes.invoke(Integer.valueOf(tm.gxszxtbevo.shop_search_hint)));
            }
        } else {
            gxszxtbevoVar = null;
        }
        return new gxszxtbevo(isLoading, ppxfxbqfkfVar, listIobyxmoadg, gxszxtbevoVar);
    }
}
