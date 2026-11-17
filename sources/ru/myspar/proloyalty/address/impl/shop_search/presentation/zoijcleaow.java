package ru.myspar.proloyalty.address.impl.shop_search.presentation;

import androidx.lifecycle.pkzmftpjix;
import dm0.eablkybsjg;
import dm0.nufgyqmvbu;
import em0.gxszxtbevo;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.address.api.ShopSearchResultHelper;
import ru.myspar.proloyalty.address.impl.shop_search.domain.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final q41.iobyxmoadg f92050btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f92051draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ShopSearchResultHelper f92052gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f92053wflxmlrfwp;

    /* synthetic */ class iobyxmoadg extends vdvldrhtss implements draadjrbmk {
        iobyxmoadg(Object obj) {
            super(1, obj, q41.iobyxmoadg.class, "getString", "getString(I)Ljava/lang/String;", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final String iobyxmoadg(int i13) {
            return ((q41.iobyxmoadg) this.receiver).getString(i13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(nufgyqmvbu storeFactory, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, q41.iobyxmoadg resourcesManager, ShopSearchResultHelper shopSearchResultHelper) {
        super(storeFactory, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(shopSearchResultHelper, "shopSearchResultHelper");
        this.f92050btonecajqb = resourcesManager;
        this.f92052gtknphoqwx = shopSearchResultHelper;
        this.f92051draadjrbmk = new draadjrbmk() { // from class: em0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.address.impl.shop_search.presentation.zoijcleaow.sopmlzcsov(this.f31551zdlpuopuiu, (State) obj);
            }
        };
        this.f92053wflxmlrfwp = new draadjrbmk() { // from class: em0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.address.impl.shop_search.presentation.zoijcleaow.ntlheqmsrt((ru.myspar.proloyalty.address.impl.shop_search.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dm0.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        dm0.wkgbmnqykc ppxfxbqfkfVar2;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f92046iobyxmoadg)) {
            return dm0.wkgbmnqykc.iobyxmoadg.f29163iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            ppxfxbqfkfVar2 = new dm0.wkgbmnqykc.zoijcleaow(((ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.C2142ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkfVar2 = new dm0.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2142ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        }
        return ppxfxbqfkfVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(zoijcleaow zoijcleaowVar, State shopSearchStore$State) {
        zdlpuopuiu.btonecajqb(shopSearchStore$State, "<this>");
        return gm0.iobyxmoadg.zoijcleaow(shopSearchStore$State, new iobyxmoadg(zoijcleaowVar.f92050btonecajqb));
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f92051draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f92053wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f29138iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().gxszxtbevo();
        } else {
            if (!(eablkybsjgVar instanceof eablkybsjg.zoijcleaow)) {
                if (!(eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            g21.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm();
            eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) eablkybsjgVar;
            wkgbmnqykcVarOxmwwwfdhm.ppxfxbqfkf(this.f92052gtknphoqwx.ppxfxbqfkf(), this.f92052gtknphoqwx.iobyxmoadg(zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow()));
            wkgbmnqykcVarOxmwwwfdhm.gxszxtbevo();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
