package ru.myspar.legacy.presentation.screen.shopfilters;

import androidx.lifecycle.pkzmftpjix;
import g80.lqeggnwhkg;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.domain.feature.shopfilters.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final C2058iobyxmoadg f89721wflxmlrfwp = new C2058iobyxmoadg(null);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ob0.wkgbmnqykc f89722btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f89723draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f89724gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.shopfilters.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C2058iobyxmoadg {
        public /* synthetic */ C2058iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2058iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ob0.wkgbmnqykc shopUiMapper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(shopUiMapper, "shopUiMapper");
        this.f89722btonecajqb = shopUiMapper;
        this.f89724gtknphoqwx = new draadjrbmk() { // from class: od0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.shopfilters.iobyxmoadg.crxdokpmqz(this.f72621zdlpuopuiu, (State) obj);
            }
        };
        this.f89723draadjrbmk = new draadjrbmk() { // from class: od0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.shopfilters.iobyxmoadg.ntlheqmsrt((ru.myspar.legacy.presentation.screen.shopfilters.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final od0.lqeggnwhkg crxdokpmqz(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        List listInvoke = iobyxmoadgVar.f89722btonecajqb.invoke(state.getFilterValues());
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listInvoke, 10));
        int i13 = 0;
        for (Object obj : listInvoke) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            rb0.zoijcleaow zoijcleaowVarWkgbmnqykc = (rb0.zoijcleaow) obj;
            if (iobyxmoadgVar.sopmlzcsov(i13, state.getFilterValues())) {
                zoijcleaowVarWkgbmnqykc = rb0.zoijcleaow.wkgbmnqykc(zoijcleaowVarWkgbmnqykc, null, null, null, null, false, false, 0.0f, 63, null);
            }
            arrayList.add(zoijcleaowVarWkgbmnqykc);
            i13 = i14;
        }
        return new od0.lqeggnwhkg(arrayList, state.getIsLoading());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g80.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f89725iobyxmoadg)) {
            return g80.wkgbmnqykc.iobyxmoadg.f36639iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f89727iobyxmoadg)) {
            return g80.wkgbmnqykc.zoijcleaow.f36641iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2059ppxfxbqfkf) {
            return new g80.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2059ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean sopmlzcsov(int i13, List list) {
        return i13 == jyumaefscl.ojitshcjhn(list) && list.size() % 2 != 0;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f89724gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f89723draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(g80.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof g80.eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((g80.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, g80.eablkybsjg.iobyxmoadg.f36617iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
