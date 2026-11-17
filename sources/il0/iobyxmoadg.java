package il0;

import b31.wflxmlrfwp;
import cm0.eablkybsjg;
import gl0.gxszxtbevo;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import jl0.zoijcleaow;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.address.impl.address_search.domain.State;
import ru.myspar.proloyalty.components.search_address.api.model.SearchAddress;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: il0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C1039iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f44968iobyxmoadg;

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
            f44968iobyxmoadg = iArr;
        }
    }

    public static final gxszxtbevo iobyxmoadg(State state, draadjrbmk getStringRes) {
        cm0.gxszxtbevo gxszxtbevoVar;
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        boolean isLoading = state.getIsLoading();
        jl0.iobyxmoadg iobyxmoadgVar = new jl0.iobyxmoadg(el0.gxszxtbevo.proloyalty_address_search_hint_input, state.getSearchInput(), true);
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
            int i15 = C1039iobyxmoadg.f44968iobyxmoadg[inputWarning.ordinal()];
            if (i15 == 1) {
                gxszxtbevoVar = new cm0.gxszxtbevo((String) getStringRes.invoke(Integer.valueOf(wflxmlrfwp.proloyalty_address_not_found)), (String) getStringRes.invoke(Integer.valueOf(el0.gxszxtbevo.proloyalty_address_not_found_description)));
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                gxszxtbevoVar = new cm0.gxszxtbevo(dxjokdxxww.ppxfxbqfkf(), (String) getStringRes.invoke(Integer.valueOf(el0.gxszxtbevo.proloyalty_address_search_hint)));
            }
        } else {
            gxszxtbevoVar = null;
        }
        return new gxszxtbevo(isLoading, iobyxmoadgVar, arrayList, gxszxtbevoVar);
    }
}
