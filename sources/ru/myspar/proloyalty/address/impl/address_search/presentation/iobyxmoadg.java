package ru.myspar.proloyalty.address.impl.address_search.presentation;

import androidx.lifecycle.pkzmftpjix;
import fl0.lqeggnwhkg;
import gg.wwaezpbzkn;
import gl0.gxszxtbevo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.address.api.AddressSearchResultHelper;
import ru.myspar.proloyalty.address.impl.address_search.domain.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final q41.iobyxmoadg f91859btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f91860draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final AddressSearchResultHelper f91861gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f91862wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.address.impl.address_search.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    /* synthetic */ class C2135iobyxmoadg extends vdvldrhtss implements draadjrbmk {
        C2135iobyxmoadg(Object obj) {
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
    public iobyxmoadg(lqeggnwhkg storeFactory, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, q41.iobyxmoadg resourcesManager, AddressSearchResultHelper addressSearchResultHelper) {
        super(storeFactory, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(addressSearchResultHelper, "addressSearchResultHelper");
        this.f91859btonecajqb = resourcesManager;
        this.f91861gtknphoqwx = addressSearchResultHelper;
        this.f91860draadjrbmk = new draadjrbmk() { // from class: gl0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.address.impl.address_search.presentation.iobyxmoadg.sopmlzcsov(this.f37791zdlpuopuiu, (State) obj);
            }
        };
        this.f91862wflxmlrfwp = new draadjrbmk() { // from class: gl0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.address.impl.address_search.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.address.impl.address_search.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl0.ppxfxbqfkf ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        fl0.ppxfxbqfkf zoijcleaowVar2;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f91869iobyxmoadg)) {
            return fl0.ppxfxbqfkf.iobyxmoadg.f34333iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf) {
            zoijcleaowVar2 = new fl0.ppxfxbqfkf.C0755ppxfxbqfkf(((zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
        } else {
            if (!(zoijcleaowVar instanceof zoijcleaow.C2136zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaowVar2 = new fl0.ppxfxbqfkf.zoijcleaow(((zoijcleaow.C2136zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
        return zoijcleaowVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(iobyxmoadg iobyxmoadgVar, State addressSearchStore$State) {
        zdlpuopuiu.btonecajqb(addressSearchStore$State, "<this>");
        return il0.iobyxmoadg.iobyxmoadg(addressSearchStore$State, new C2135iobyxmoadg(iobyxmoadgVar.f91859btonecajqb));
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f91860draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f91862wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(fl0.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, fl0.wkgbmnqykc.iobyxmoadg.f34336iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().gxszxtbevo();
        } else {
            if (wkgbmnqykcVar instanceof fl0.wkgbmnqykc.ppxfxbqfkf) {
                Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((fl0.wkgbmnqykc.ppxfxbqfkf) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (!(wkgbmnqykcVar instanceof fl0.wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
            fl0.wkgbmnqykc.zoijcleaow zoijcleaowVar = (fl0.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar;
            iobyxmoadgVar.oxmwwwfdhm().ppxfxbqfkf(this.f91861gtknphoqwx.ppxfxbqfkf(), this.f91861gtknphoqwx.iobyxmoadg(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow()));
            iobyxmoadgVar.oxmwwwfdhm().gxszxtbevo();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
