package ru.myspar.cities.impl.cities_list.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import is.eablkybsjg;
import is.lqeggnwhkg;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;
import ru.myspar.cities.impl.cities_list.domain.store.State;
import ru.myspar.components.geo.api.models.City;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ya2.iobyxmoadg f86084btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f86085draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f86086gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.cities.impl.cities_list.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1977iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f86087iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f86089yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f86090zdlpuopuiu;

        C1977iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f86089yggfygwlhe = obj;
            this.f86087iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lereixgezr(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ya2.iobyxmoadg webViewScreenFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(webViewScreenFeatureApi, "webViewScreenFeatureApi");
        this.f86084btonecajqb = webViewScreenFeatureApi;
        this.f86086gtknphoqwx = new draadjrbmk() { // from class: js.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.cities.impl.cities_list.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f86085draadjrbmk = new draadjrbmk() { // from class: js.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.cities.impl.cities_list.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.cities.impl.cities_list.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final is.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.C1978zoijcleaow) {
            return new is.wkgbmnqykc.zoijcleaow(((zoijcleaow.C1978zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
        if (zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf) {
            return new is.wkgbmnqykc.ppxfxbqfkf(((zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
        }
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return is.wkgbmnqykc.iobyxmoadg.f49274iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final js.gxszxtbevo sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        boolean isLoading = state.getIsLoading();
        List cities = state.getCities();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cities) {
            String name = ((City) obj).getName();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
            String lowerCase2 = state.getSearchValue().draadjrbmk().toLowerCase(locale);
            zdlpuopuiu.dxjokdxxww(lowerCase2, "toLowerCase(...)");
            if (kcexrzcfyt.sopmlzcsov(lowerCase, lowerCase2, false, 2, null)) {
                arrayList.add(obj);
            }
        }
        return new js.gxszxtbevo(isLoading, arrayList, state.getSearchValue());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f86086gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f86085draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        C1977iobyxmoadg c1977iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C1977iobyxmoadg) {
            c1977iobyxmoadg = (C1977iobyxmoadg) gxszxtbevoVar;
            int i13 = c1977iobyxmoadg.f86087iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1977iobyxmoadg.f86087iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c1977iobyxmoadg = new C1977iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1977iobyxmoadg = new C1977iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c1977iobyxmoadg.f86089yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1977iobyxmoadg.f86087iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i14 == 2) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) c1977iobyxmoadg.f86090zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(iobyxmoadgVar.f86084btonecajqb.iobyxmoadg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            ppxfxbqfkf.zoijcleaow zoijcleaowVar = new ppxfxbqfkf.zoijcleaow(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg());
            c1977iobyxmoadg.f86087iwizpuwonk = 1;
            if (cllcsxoeiz(zoijcleaowVar, c1977iobyxmoadg) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
            ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = ppxfxbqfkf.iobyxmoadg.f86091iobyxmoadg;
            c1977iobyxmoadg.f86087iwizpuwonk = 2;
            if (cllcsxoeiz(iobyxmoadgVar2, c1977iobyxmoadg) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf)) {
            throw new NoWhenBranchMatchedException();
        }
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVar3 = ppxfxbqfkf.iobyxmoadg.f86091iobyxmoadg;
        c1977iobyxmoadg.f86090zdlpuopuiu = this;
        c1977iobyxmoadg.f86087iwizpuwonk = 3;
        if (cllcsxoeiz(iobyxmoadgVar3, c1977iobyxmoadg) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(iobyxmoadgVar.f86084btonecajqb.iobyxmoadg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
