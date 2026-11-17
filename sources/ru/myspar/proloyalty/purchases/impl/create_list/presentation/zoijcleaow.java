package ru.myspar.proloyalty.purchases.impl.create_list.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.api.CreatePurchaseListsResultHelper;
import ru.myspar.proloyalty.purchases.impl.create_list.domain.store.State;
import ru.myspar.proloyalty.purchases.impl.create_list.domain.store.gxszxtbevo;
import tg.draadjrbmk;
import wi1.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final CreatePurchaseListsResultHelper f99575btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f99576draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ri1.iobyxmoadg f99577gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f99578wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(gxszxtbevo store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, CreatePurchaseListsResultHelper resultHelper, ri1.iobyxmoadg purchasesFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resultHelper, "resultHelper");
        zdlpuopuiu.btonecajqb(purchasesFeatureApi, "purchasesFeatureApi");
        this.f99575btonecajqb = resultHelper;
        this.f99577gtknphoqwx = purchasesFeatureApi;
        this.f99576draadjrbmk = new draadjrbmk() { // from class: wi1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.purchases.impl.create_list.presentation.zoijcleaow.sopmlzcsov((State) obj);
            }
        };
        this.f99578wflxmlrfwp = new draadjrbmk() { // from class: wi1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.purchases.impl.create_list.presentation.zoijcleaow.ntlheqmsrt((ru.myspar.proloyalty.purchases.impl.create_list.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.purchases.impl.create_list.domain.store.ppxfxbqfkf ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f99570iobyxmoadg)) {
            return ru.myspar.proloyalty.purchases.impl.create_list.domain.store.ppxfxbqfkf.iobyxmoadg.f99545iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            return ru.myspar.proloyalty.purchases.impl.create_list.domain.store.ppxfxbqfkf.zoijcleaow.f99547iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2385ppxfxbqfkf) {
            return new ru.myspar.proloyalty.purchases.impl.create_list.domain.store.ppxfxbqfkf.C2383ppxfxbqfkf(((ppxfxbqfkf.C2385ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new nufgyqmvbu(state.getIsLoading(), state.getListName());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f99576draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f99578wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.proloyalty.purchases.impl.create_list.domain.store.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.purchases.impl.create_list.domain.store.wkgbmnqykc.eablkybsjg) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((ru.myspar.proloyalty.purchases.impl.create_list.domain.store.wkgbmnqykc.eablkybsjg) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.purchases.impl.create_list.domain.store.wkgbmnqykc.ppxfxbqfkf.f99550iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f99573iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.purchases.impl.create_list.domain.store.wkgbmnqykc.iobyxmoadg.f99549iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.purchases.impl.create_list.domain.store.wkgbmnqykc.zoijcleaow.f99553iobyxmoadg)) {
            i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
            iobyxmoadgVar.kcexrzcfyt().ppxfxbqfkf(this.f99575btonecajqb.zoijcleaow(), this.f99575btonecajqb.iobyxmoadg(true));
            iobyxmoadgVar.gtknphoqwx();
        } else {
            if (!(wkgbmnqykcVar instanceof ru.myspar.proloyalty.purchases.impl.create_list.domain.store.wkgbmnqykc.C2384wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            i21.iobyxmoadg iobyxmoadgVar2 = i21.iobyxmoadg.f41720iobyxmoadg;
            iobyxmoadgVar2.kcexrzcfyt().ppxfxbqfkf(this.f99575btonecajqb.zoijcleaow(), this.f99575btonecajqb.iobyxmoadg(true));
            ru.myspar.proloyalty.purchases.impl.create_list.domain.store.wkgbmnqykc.C2384wkgbmnqykc c2384wkgbmnqykc = (ru.myspar.proloyalty.purchases.impl.create_list.domain.store.wkgbmnqykc.C2384wkgbmnqykc) wkgbmnqykcVar;
            iobyxmoadgVar2.kcexrzcfyt().btonecajqb(this.f99577gtknphoqwx.zoijcleaow(c2384wkgbmnqykc.iobyxmoadg(), c2384wkgbmnqykc.zoijcleaow()));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
