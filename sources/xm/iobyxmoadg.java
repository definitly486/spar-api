package xm;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import rn.eablkybsjg;
import ru.myspar.address.impl.address_search.domain.State;
import ru.myspar.components.search_address.api.model.SearchAddress;
import tg.draadjrbmk;
import vm.gxszxtbevo;
import ym.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: xm.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C3093iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f122875iobyxmoadg;

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
            f122875iobyxmoadg = iArr;
        }
    }

    public static final gxszxtbevo iobyxmoadg(State state, draadjrbmk getStringRes) {
        rn.gxszxtbevo gxszxtbevoVar;
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        boolean isLoading = state.getIsLoading();
        ym.iobyxmoadg iobyxmoadgVar = new ym.iobyxmoadg(tm.gxszxtbevo.address_search_hint_input, state.getSearchInput(), true);
        List searchResult = state.getSearchResult();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(searchResult, 10));
        int i13 = 0;
        for (Object obj : searchResult) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            SearchAddress searchAddress = (SearchAddress) obj;
            arrayList.add(new zoijcleaow(i13, searchAddress.getFullAddress(), searchAddress.getShortAddress()));
            i13 = i14;
        }
        eablkybsjg inputWarning = state.getInputWarning();
        if (inputWarning != null) {
            int i15 = C3093iobyxmoadg.f122875iobyxmoadg[inputWarning.ordinal()];
            if (i15 == 1) {
                gxszxtbevoVar = new rn.gxszxtbevo((String) getStringRes.invoke(Integer.valueOf(s40.draadjrbmk.address_not_found)), (String) getStringRes.invoke(Integer.valueOf(tm.gxszxtbevo.address_not_found_description)));
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                gxszxtbevoVar = new rn.gxszxtbevo(k30.draadjrbmk.ppxfxbqfkf(), (String) getStringRes.invoke(Integer.valueOf(tm.gxszxtbevo.address_search_hint)));
            }
        } else {
            gxszxtbevoVar = null;
        }
        return new gxszxtbevo(isLoading, iobyxmoadgVar, arrayList, gxszxtbevoVar);
    }
}
