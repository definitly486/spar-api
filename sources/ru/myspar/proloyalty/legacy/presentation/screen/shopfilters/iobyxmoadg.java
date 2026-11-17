package ru.myspar.proloyalty.legacy.presentation.screen.shopfilters;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import q61.lqeggnwhkg;
import ru.myspar.proloyalty.domain.feature.shopfilters.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final C2298iobyxmoadg f97351wflxmlrfwp = new C2298iobyxmoadg(null);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final n91.wkgbmnqykc f97352btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f97353draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f97354gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.shopfilters.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C2298iobyxmoadg {
        public /* synthetic */ C2298iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2298iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, n91.wkgbmnqykc shopUiMapper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(shopUiMapper, "shopUiMapper");
        this.f97352btonecajqb = shopUiMapper;
        this.f97354gtknphoqwx = new draadjrbmk() { // from class: kb1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.shopfilters.iobyxmoadg.crxdokpmqz(this.f54399zdlpuopuiu, (State) obj);
            }
        };
        this.f97353draadjrbmk = new draadjrbmk() { // from class: kb1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.shopfilters.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.legacy.presentation.screen.shopfilters.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kb1.lqeggnwhkg crxdokpmqz(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        List listInvoke = iobyxmoadgVar.f97352btonecajqb.invoke(state.getFilterValues());
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listInvoke, 10));
        int i13 = 0;
        for (Object obj : listInvoke) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            q91.zoijcleaow zoijcleaowVarWkgbmnqykc = (q91.zoijcleaow) obj;
            if (iobyxmoadgVar.sopmlzcsov(i13, state.getFilterValues())) {
                zoijcleaowVarWkgbmnqykc = q91.zoijcleaow.wkgbmnqykc(zoijcleaowVarWkgbmnqykc, null, null, null, null, false, false, 0.0f, 63, null);
            }
            arrayList.add(zoijcleaowVarWkgbmnqykc);
            i13 = i14;
        }
        return new kb1.lqeggnwhkg(arrayList, state.getIsLoading());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q61.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f97355iobyxmoadg)) {
            return q61.wkgbmnqykc.iobyxmoadg.f78013iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f97357iobyxmoadg)) {
            return q61.wkgbmnqykc.zoijcleaow.f78015iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2299ppxfxbqfkf) {
            return new q61.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2299ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean sopmlzcsov(int i13, List list) {
        return i13 == jyumaefscl.ojitshcjhn(list) && list.size() % 2 != 0;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f97354gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f97353draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(q61.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof q61.eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((q61.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, q61.eablkybsjg.iobyxmoadg.f77991iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
