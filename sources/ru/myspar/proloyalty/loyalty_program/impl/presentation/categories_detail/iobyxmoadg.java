package ru.myspar.proloyalty.loyalty_program.impl.presentation.categories_detail;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.components.loyalty_program.api.models.LoyaltyCategory;
import ru.myspar.proloyalty.loyalty_program.impl.domain.categories_detail.State;
import ru.myspar.proloyalty.loyalty_program.impl.presentation.categories_detail.bottomsheet.CategoriesSheetArgs;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final q41.iobyxmoadg f97701btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f97702draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final CategoriesDetailResultHelper f97703gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f97704wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(nc1.lqeggnwhkg store, dr0.iobyxmoadg dispatchers, pkzmftpjix savedStateHandle, q41.iobyxmoadg resourcesManager, CategoriesDetailResultHelper resultHelper) {
        super(store, dispatchers, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchers, "dispatchers");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(resultHelper, "resultHelper");
        this.f97701btonecajqb = resourcesManager;
        this.f97703gtknphoqwx = resultHelper;
        this.f97702draadjrbmk = new draadjrbmk() { // from class: oc1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.loyalty_program.impl.presentation.categories_detail.iobyxmoadg.sopmlzcsov(this.f72596zdlpuopuiu, (State) obj);
            }
        };
        this.f97704wflxmlrfwp = new draadjrbmk() { // from class: oc1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.loyalty_program.impl.presentation.categories_detail.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.loyalty_program.impl.presentation.categories_detail.lqeggnwhkg) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nc1.wkgbmnqykc ntlheqmsrt(lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        if (lqeggnwhkgVar instanceof lqeggnwhkg.ppxfxbqfkf) {
            return new nc1.wkgbmnqykc.iobyxmoadg(((lqeggnwhkg.ppxfxbqfkf) lqeggnwhkgVar).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.iobyxmoadg.f97705iobyxmoadg)) {
            return nc1.wkgbmnqykc.zoijcleaow.f69695iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.zoijcleaow.f97708iobyxmoadg)) {
            return nc1.wkgbmnqykc.C1499wkgbmnqykc.f69694iobyxmoadg;
        }
        if (lqeggnwhkgVar instanceof lqeggnwhkg.wkgbmnqykc) {
            return new nc1.wkgbmnqykc.ppxfxbqfkf(((lqeggnwhkg.wkgbmnqykc) lqeggnwhkgVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oc1.lqeggnwhkg sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
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
            arrayList.add(rc1.ppxfxbqfkf.iobyxmoadg(loyaltyCategory, z13));
        }
        boolean z14 = state.getQuantityChosen() == state.getQuantityForChoose();
        boolean isSelectedAvailable = state.getIsSelectedAvailable();
        String text = state.getText();
        return new oc1.lqeggnwhkg(isInitialized, isLoading, str, arrayList, z14, isSelectedAvailable, new rc1.iobyxmoadg(text != null ? text : "", iobyxmoadgVar.f97701btonecajqb.getString(mc1.wkgbmnqykc.proloyalty_quantity_from_quantity, Integer.valueOf(state.getQuantityChosen()), Integer.valueOf(state.getQuantityForChoose())), state.getIsSelectedAvailable()));
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f97702draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f97704wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(nc1.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof nc1.eablkybsjg.iobyxmoadg) {
            i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
            iobyxmoadgVar.kcexrzcfyt().ppxfxbqfkf(this.f97703gtknphoqwx.zoijcleaow(), this.f97703gtknphoqwx.iobyxmoadg(((nc1.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg()));
            iobyxmoadgVar.gtknphoqwx();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof nc1.eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new nufgyqmvbu.iobyxmoadg(((nc1.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof nc1.eablkybsjg.ppxfxbqfkf)) {
            throw new NoWhenBranchMatchedException();
        }
        nc1.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (nc1.eablkybsjg.ppxfxbqfkf) eablkybsjgVar;
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
