package ru.myspar.proloyalty.cities.impl.cities_list.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.cities.impl.cities_list.domain.store.State;
import ru.myspar.proloyalty.components.geo.api.models.City;
import tg.draadjrbmk;
import yq0.eablkybsjg;
import yq0.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final vw1.iobyxmoadg f93818btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f93819draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f93820gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.cities.impl.cities_list.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2212iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f93821iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f93823yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f93824zdlpuopuiu;

        C2212iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f93823yggfygwlhe = obj;
            this.f93821iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lereixgezr(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, vw1.iobyxmoadg webViewScreenFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(webViewScreenFeatureApi, "webViewScreenFeatureApi");
        this.f93818btonecajqb = webViewScreenFeatureApi;
        this.f93820gtknphoqwx = new draadjrbmk() { // from class: zq0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.cities.impl.cities_list.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f93819draadjrbmk = new draadjrbmk() { // from class: zq0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.cities.impl.cities_list.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.cities.impl.cities_list.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yq0.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.C2213zoijcleaow) {
            return new yq0.wkgbmnqykc.zoijcleaow(((zoijcleaow.C2213zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
        if (zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf) {
            return new yq0.wkgbmnqykc.ppxfxbqfkf(((zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
        }
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return yq0.wkgbmnqykc.iobyxmoadg.f126278iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zq0.gxszxtbevo sopmlzcsov(State state) {
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
        return new zq0.gxszxtbevo(isLoading, arrayList, state.getSearchValue());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f93820gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f93819draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        C2212iobyxmoadg c2212iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C2212iobyxmoadg) {
            c2212iobyxmoadg = (C2212iobyxmoadg) gxszxtbevoVar;
            int i13 = c2212iobyxmoadg.f93821iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2212iobyxmoadg.f93821iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2212iobyxmoadg = new C2212iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2212iobyxmoadg = new C2212iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2212iobyxmoadg.f93823yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2212iobyxmoadg.f93821iwizpuwonk;
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
            iobyxmoadgVar = (iobyxmoadg) c2212iobyxmoadg.f93824zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(iobyxmoadgVar.f93818btonecajqb.iobyxmoadg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            ppxfxbqfkf.zoijcleaow zoijcleaowVar = new ppxfxbqfkf.zoijcleaow(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg());
            c2212iobyxmoadg.f93821iwizpuwonk = 1;
            if (cllcsxoeiz(zoijcleaowVar, c2212iobyxmoadg) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
            ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = ppxfxbqfkf.iobyxmoadg.f93825iobyxmoadg;
            c2212iobyxmoadg.f93821iwizpuwonk = 2;
            if (cllcsxoeiz(iobyxmoadgVar2, c2212iobyxmoadg) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf)) {
            throw new NoWhenBranchMatchedException();
        }
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVar3 = ppxfxbqfkf.iobyxmoadg.f93825iobyxmoadg;
        c2212iobyxmoadg.f93824zdlpuopuiu = this;
        c2212iobyxmoadg.f93821iwizpuwonk = 3;
        if (cllcsxoeiz(iobyxmoadgVar3, c2212iobyxmoadg) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(iobyxmoadgVar.f93818btonecajqb.iobyxmoadg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
