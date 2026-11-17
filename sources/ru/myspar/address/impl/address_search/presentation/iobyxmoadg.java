package ru.myspar.address.impl.address_search.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.address.api.AddressSearchResultHelper;
import ru.myspar.address.impl.address_search.domain.State;
import tg.draadjrbmk;
import um.lqeggnwhkg;
import vm.gxszxtbevo;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final d60.iobyxmoadg f83834btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f83835draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final AddressSearchResultHelper f83836gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f83837wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.address.impl.address_search.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    /* synthetic */ class C1891iobyxmoadg extends vdvldrhtss implements draadjrbmk {
        C1891iobyxmoadg(Object obj) {
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
    public iobyxmoadg(lqeggnwhkg storeFactory, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, d60.iobyxmoadg resourcesManager, AddressSearchResultHelper addressSearchResultHelper) {
        super(storeFactory, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(addressSearchResultHelper, "addressSearchResultHelper");
        this.f83834btonecajqb = resourcesManager;
        this.f83836gtknphoqwx = addressSearchResultHelper;
        this.f83835draadjrbmk = new draadjrbmk() { // from class: vm.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.address.impl.address_search.presentation.iobyxmoadg.sopmlzcsov(this.f117496zdlpuopuiu, (State) obj);
            }
        };
        this.f83837wflxmlrfwp = new draadjrbmk() { // from class: vm.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.address.impl.address_search.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.address.impl.address_search.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final um.ppxfxbqfkf ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        um.ppxfxbqfkf zoijcleaowVar2;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f83844iobyxmoadg)) {
            return um.ppxfxbqfkf.iobyxmoadg.f113937iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf) {
            zoijcleaowVar2 = new um.ppxfxbqfkf.C2825ppxfxbqfkf(((zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
        } else {
            if (!(zoijcleaowVar instanceof zoijcleaow.C1892zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaowVar2 = new um.ppxfxbqfkf.zoijcleaow(((zoijcleaow.C1892zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
        return zoijcleaowVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(iobyxmoadg iobyxmoadgVar, State addressSearchStore$State) {
        zdlpuopuiu.btonecajqb(addressSearchStore$State, "<this>");
        return xm.iobyxmoadg.iobyxmoadg(addressSearchStore$State, new C1891iobyxmoadg(iobyxmoadgVar.f83834btonecajqb));
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f83835draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f83837wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(um.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, um.wkgbmnqykc.iobyxmoadg.f113940iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().gxszxtbevo();
        } else {
            if (wkgbmnqykcVar instanceof um.wkgbmnqykc.ppxfxbqfkf) {
                Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((um.wkgbmnqykc.ppxfxbqfkf) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (!(wkgbmnqykcVar instanceof um.wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
            um.wkgbmnqykc.zoijcleaow zoijcleaowVar = (um.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar;
            iobyxmoadgVar.oxmwwwfdhm().ppxfxbqfkf(this.f83836gtknphoqwx.ppxfxbqfkf(), this.f83836gtknphoqwx.iobyxmoadg(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow()));
            iobyxmoadgVar.oxmwwwfdhm().gxszxtbevo();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
