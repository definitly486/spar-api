package ru.myspar.address.impl.shop_search.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.address.api.ShopSearchResultHelper;
import ru.myspar.address.impl.shop_search.domain.State;
import sn.eablkybsjg;
import sn.nufgyqmvbu;
import tg.draadjrbmk;
import tn.gxszxtbevo;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final d60.iobyxmoadg f84025btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f84026draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ShopSearchResultHelper f84027gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f84028wflxmlrfwp;

    /* synthetic */ class iobyxmoadg extends vdvldrhtss implements draadjrbmk {
        iobyxmoadg(Object obj) {
            super(1, obj, d60.iobyxmoadg.class, "getString", "getString(I)Ljava/lang/String;", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final String iobyxmoadg(int i13) {
            return ((d60.iobyxmoadg) this.receiver).getString(i13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(nufgyqmvbu storeFactory, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, d60.iobyxmoadg resourcesManager, ShopSearchResultHelper shopSearchResultHelper) {
        super(storeFactory, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(shopSearchResultHelper, "shopSearchResultHelper");
        this.f84025btonecajqb = resourcesManager;
        this.f84027gtknphoqwx = shopSearchResultHelper;
        this.f84026draadjrbmk = new draadjrbmk() { // from class: tn.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.address.impl.shop_search.presentation.zoijcleaow.sopmlzcsov(this.f111069zdlpuopuiu, (State) obj);
            }
        };
        this.f84028wflxmlrfwp = new draadjrbmk() { // from class: tn.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.address.impl.shop_search.presentation.zoijcleaow.ntlheqmsrt((ru.myspar.address.impl.shop_search.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sn.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        sn.wkgbmnqykc ppxfxbqfkfVar2;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f84021iobyxmoadg)) {
            return sn.wkgbmnqykc.iobyxmoadg.f107742iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            ppxfxbqfkfVar2 = new sn.wkgbmnqykc.zoijcleaow(((ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.C1898ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkfVar2 = new sn.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C1898ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        }
        return ppxfxbqfkfVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(zoijcleaow zoijcleaowVar, State shopSearchStore$State) {
        zdlpuopuiu.btonecajqb(shopSearchStore$State, "<this>");
        return vn.iobyxmoadg.zoijcleaow(shopSearchStore$State, new iobyxmoadg(zoijcleaowVar.f84025btonecajqb));
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f84026draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f84028wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f107717iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().gxszxtbevo();
        } else {
            if (!(eablkybsjgVar instanceof eablkybsjg.zoijcleaow)) {
                if (!(eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            b40.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm();
            eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) eablkybsjgVar;
            wkgbmnqykcVarOxmwwwfdhm.ppxfxbqfkf(this.f84027gtknphoqwx.ppxfxbqfkf(), this.f84027gtknphoqwx.iobyxmoadg(zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow()));
            wkgbmnqykcVarOxmwwwfdhm.gxszxtbevo();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
