package ru.myspar.purchases.impl.list_shared_with_you.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ky1.eablkybsjg;
import ky1.lqeggnwhkg;
import lg.gxszxtbevo;
import ly1.nufgyqmvbu;
import ru.myspar.purchases.impl.list_shared_with_you.domain.store.State;
import ru.myspar.purchases.impl.lists.presentation.model.PurchaseListUiModel;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f102511btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f102512gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f102511btonecajqb = new draadjrbmk() { // from class: ly1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.purchases.impl.list_shared_with_you.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f102512gtknphoqwx = new draadjrbmk() { // from class: ly1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.purchases.impl.list_shared_with_you.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.purchases.impl.list_shared_with_you.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky1.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2478zoijcleaow.f102517iobyxmoadg)) {
            return ky1.wkgbmnqykc.zoijcleaow.f61091iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f102516iobyxmoadg)) {
            return ky1.wkgbmnqykc.iobyxmoadg.f61090iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new nufgyqmvbu(new PurchaseListUiModel(state.getPurchaseListId(), state.getPurchaseListName(), state.getProductsCount(), false, 8, null), state.getIsUserHasTheSamePurchaseList(), state.getIsPurchaseListFeatureEnabled(), state.getIsLoading());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f102511btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f102512gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.C2477ppxfxbqfkf(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f61079iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f102513iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz3 = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
