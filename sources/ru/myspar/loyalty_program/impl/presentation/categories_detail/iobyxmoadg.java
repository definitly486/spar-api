package ru.myspar.loyalty_program.impl.presentation.categories_detail;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.loyalty_program.api.models.LoyaltyCategory;
import ru.myspar.loyalty_program.impl.domain.categories_detail.State;
import ru.myspar.loyalty_program.impl.presentation.categories_detail.bottomsheet.CategoriesSheetArgs;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final d60.iobyxmoadg f90091btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f90092draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final CategoriesDetailResultHelper f90093gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f90094wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(se0.lqeggnwhkg store, ns.iobyxmoadg dispatchers, pkzmftpjix savedStateHandle, d60.iobyxmoadg resourcesManager, CategoriesDetailResultHelper resultHelper) {
        super(store, dispatchers, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchers, "dispatchers");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(resultHelper, "resultHelper");
        this.f90091btonecajqb = resourcesManager;
        this.f90093gtknphoqwx = resultHelper;
        this.f90092draadjrbmk = new draadjrbmk() { // from class: te0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.loyalty_program.impl.presentation.categories_detail.iobyxmoadg.sopmlzcsov(this.f110335zdlpuopuiu, (State) obj);
            }
        };
        this.f90094wflxmlrfwp = new draadjrbmk() { // from class: te0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.loyalty_program.impl.presentation.categories_detail.iobyxmoadg.ntlheqmsrt((ru.myspar.loyalty_program.impl.presentation.categories_detail.lqeggnwhkg) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final se0.wkgbmnqykc ntlheqmsrt(lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        if (lqeggnwhkgVar instanceof lqeggnwhkg.ppxfxbqfkf) {
            return new se0.wkgbmnqykc.iobyxmoadg(((lqeggnwhkg.ppxfxbqfkf) lqeggnwhkgVar).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.iobyxmoadg.f90095iobyxmoadg)) {
            return se0.wkgbmnqykc.zoijcleaow.f106075iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.zoijcleaow.f90098iobyxmoadg)) {
            return se0.wkgbmnqykc.C2600wkgbmnqykc.f106074iobyxmoadg;
        }
        if (lqeggnwhkgVar instanceof lqeggnwhkg.wkgbmnqykc) {
            return new se0.wkgbmnqykc.ppxfxbqfkf(((lqeggnwhkg.wkgbmnqykc) lqeggnwhkgVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final te0.lqeggnwhkg sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        boolean isInitialized = state.getIsInitialized();
        boolean isLoading = state.getIsLoading();
        String date = state.getDate();
        String str = date == null ? "" : date;
        List categories = state.getCategories();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(categories, 10));
        Iterator it = categories.iterator();
        while (true) {
            boolean z13 = false;
            if (!it.hasNext()) {
                break;
            }
            LoyaltyCategory loyaltyCategory = (LoyaltyCategory) it.next();
            if (state.getIsSelectedAvailable() && state.getSelectedCategoriesIds().contains(loyaltyCategory.getId())) {
                z13 = true;
            }
            arrayList.add(we0.ppxfxbqfkf.iobyxmoadg(loyaltyCategory, z13));
        }
        boolean z14 = state.getQuantityChosen() == state.getQuantityForChoose();
        boolean isSelectedAvailable = state.getIsSelectedAvailable();
        String text = state.getText();
        return new te0.lqeggnwhkg(isInitialized, isLoading, str, arrayList, z14, isSelectedAvailable, new we0.iobyxmoadg(text != null ? text : "", iobyxmoadgVar.f90091btonecajqb.getString(re0.wkgbmnqykc.quantity_from_quantity, Integer.valueOf(state.getQuantityChosen()), Integer.valueOf(state.getQuantityForChoose())), state.getIsSelectedAvailable()));
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f90092draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f90094wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(se0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof se0.eablkybsjg.iobyxmoadg) {
            d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
            iobyxmoadgVar.kcexrzcfyt().ppxfxbqfkf(this.f90093gtknphoqwx.zoijcleaow(), this.f90093gtknphoqwx.iobyxmoadg(((se0.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg()));
            iobyxmoadgVar.gtknphoqwx();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof se0.eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new nufgyqmvbu.iobyxmoadg(((se0.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof se0.eablkybsjg.ppxfxbqfkf)) {
            throw new NoWhenBranchMatchedException();
        }
        se0.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (se0.eablkybsjg.ppxfxbqfkf) eablkybsjgVar;
        String name = ppxfxbqfkfVar.iobyxmoadg().getName();
        String imageUrl = ppxfxbqfkfVar.iobyxmoadg().getImageUrl();
        String description = ppxfxbqfkfVar.iobyxmoadg().getDescription();
        if (description == null) {
            description = "";
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(new nufgyqmvbu.zoijcleaow(new CategoriesSheetArgs(name, imageUrl, description)), gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
