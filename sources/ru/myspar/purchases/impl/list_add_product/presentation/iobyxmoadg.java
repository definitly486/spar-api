package ru.myspar.purchases.impl.list_add_product.presentation;

import androidx.lifecycle.pkzmftpjix;
import dy1.eablkybsjg;
import dy1.lqeggnwhkg;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.purchases.impl.list_add_product.domain.model.AddProductType;
import ru.myspar.purchases.impl.list_add_product.domain.store.State;
import ru.myspar.purchases.impl.lists.presentation.model.PurchaseListUiModel;
import ru.myspar.purchases_list.api.models.PurchaseList;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f102387btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f102388gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f102387btonecajqb = new draadjrbmk() { // from class: ey1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.purchases.impl.list_add_product.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f102388gtknphoqwx = new draadjrbmk() { // from class: ey1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.purchases.impl.list_add_product.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.purchases.impl.list_add_product.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dy1.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f102401iobyxmoadg)) {
            return dy1.wkgbmnqykc.iobyxmoadg.f29959iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.C2473zoijcleaow) {
            return new dy1.wkgbmnqykc.zoijcleaow(((zoijcleaow.C2473zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ey1.lqeggnwhkg sopmlzcsov(State state) {
        boolean zContains;
        zdlpuopuiu.btonecajqb(state, "<this>");
        List<PurchaseList> purchaseLists = state.getPurchaseLists();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(purchaseLists, 10));
        for (PurchaseList purchaseList : purchaseLists) {
            String id2 = purchaseList.getId();
            String name = purchaseList.getName();
            int size = purchaseList.getProducts().size();
            AddProductType typeOfUse = state.getTypeOfUse();
            if (typeOfUse instanceof AddProductType.ProductsListFromBanner) {
                zContains = false;
            } else {
                if (!(typeOfUse instanceof AddProductType.SingleProduct)) {
                    throw new NoWhenBranchMatchedException();
                }
                zContains = purchaseList.getProducts().contains(((AddProductType.SingleProduct) state.getTypeOfUse()).getProductArticle());
            }
            arrayList.add(new PurchaseListUiModel(id2, name, size, zContains));
        }
        return new ey1.lqeggnwhkg(arrayList, state.getIsLoading());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f102387btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f102388gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.wkgbmnqykc(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f29942iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f102389iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz3 = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.ppxfxbqfkf.f29943iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz4 = cllcsxoeiz(ppxfxbqfkf.C2471ppxfxbqfkf.f102390iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
