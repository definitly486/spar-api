package ru.myspar.purchases.impl.create_list.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import qx1.nufgyqmvbu;
import ru.myspar.purchases.api.CreatePurchaseListsResultHelper;
import ru.myspar.purchases.impl.create_list.domain.store.State;
import ru.myspar.purchases.impl.create_list.domain.store.gxszxtbevo;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final CreatePurchaseListsResultHelper f102283btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f102284draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lx1.iobyxmoadg f102285gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f102286wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(gxszxtbevo store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, CreatePurchaseListsResultHelper resultHelper, lx1.iobyxmoadg purchasesFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resultHelper, "resultHelper");
        zdlpuopuiu.btonecajqb(purchasesFeatureApi, "purchasesFeatureApi");
        this.f102283btonecajqb = resultHelper;
        this.f102285gtknphoqwx = purchasesFeatureApi;
        this.f102284draadjrbmk = new draadjrbmk() { // from class: qx1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.purchases.impl.create_list.presentation.zoijcleaow.sopmlzcsov((State) obj);
            }
        };
        this.f102286wflxmlrfwp = new draadjrbmk() { // from class: qx1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.purchases.impl.create_list.presentation.zoijcleaow.ntlheqmsrt((ru.myspar.purchases.impl.create_list.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.purchases.impl.create_list.domain.store.ppxfxbqfkf ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f102278iobyxmoadg)) {
            return ru.myspar.purchases.impl.create_list.domain.store.ppxfxbqfkf.iobyxmoadg.f102253iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            return ru.myspar.purchases.impl.create_list.domain.store.ppxfxbqfkf.zoijcleaow.f102255iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2467ppxfxbqfkf) {
            return new ru.myspar.purchases.impl.create_list.domain.store.ppxfxbqfkf.C2465ppxfxbqfkf(((ppxfxbqfkf.C2467ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new nufgyqmvbu(state.getIsLoading(), state.getListName());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f102284draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f102286wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.purchases.impl.create_list.domain.store.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (wkgbmnqykcVar instanceof ru.myspar.purchases.impl.create_list.domain.store.wkgbmnqykc.eablkybsjg) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((ru.myspar.purchases.impl.create_list.domain.store.wkgbmnqykc.eablkybsjg) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.purchases.impl.create_list.domain.store.wkgbmnqykc.ppxfxbqfkf.f102258iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f102281iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.purchases.impl.create_list.domain.store.wkgbmnqykc.iobyxmoadg.f102257iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.purchases.impl.create_list.domain.store.wkgbmnqykc.zoijcleaow.f102261iobyxmoadg)) {
            d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
            iobyxmoadgVar.kcexrzcfyt().ppxfxbqfkf(this.f102283btonecajqb.zoijcleaow(), this.f102283btonecajqb.iobyxmoadg(true));
            iobyxmoadgVar.gtknphoqwx();
        } else {
            if (!(wkgbmnqykcVar instanceof ru.myspar.purchases.impl.create_list.domain.store.wkgbmnqykc.C2466wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            d40.iobyxmoadg iobyxmoadgVar2 = d40.iobyxmoadg.f26931iobyxmoadg;
            iobyxmoadgVar2.kcexrzcfyt().ppxfxbqfkf(this.f102283btonecajqb.zoijcleaow(), this.f102283btonecajqb.iobyxmoadg(true));
            ru.myspar.purchases.impl.create_list.domain.store.wkgbmnqykc.C2466wkgbmnqykc c2466wkgbmnqykc = (ru.myspar.purchases.impl.create_list.domain.store.wkgbmnqykc.C2466wkgbmnqykc) wkgbmnqykcVar;
            iobyxmoadgVar2.kcexrzcfyt().btonecajqb(this.f102285gtknphoqwx.zoijcleaow(c2466wkgbmnqykc.iobyxmoadg(), c2466wkgbmnqykc.zoijcleaow()));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
