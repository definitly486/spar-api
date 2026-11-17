package se0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.loyalty_program.api.models.LoyaltyCategory;
import ru.myspar.loyalty_program.impl.domain.categories_detail.State;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        List selectedCategoriesIds;
        List list;
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return state.zoijcleaow((1021 & 1) != 0 ? state.isInitialized : false, (1021 & 2) != 0 ? state.isLoading : ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), (1021 & 4) != 0 ? state.date : null, (1021 & 8) != 0 ? state.text : null, (1021 & 16) != 0 ? state.quantityForChoose : 0, (1021 & 32) != 0 ? state.quantityChosen : 0, (1021 & 64) != 0 ? state.isSelectedAvailable : false, (1021 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.categories : null, (1021 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.selectedCategoriesIds : null, (1021 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isUserConfirmCategories : false);
        }
        int i13 = 0;
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            gxszxtbevo.iobyxmoadg iobyxmoadgVar = (gxszxtbevo.iobyxmoadg) msg;
            return state.zoijcleaow((1021 & 1) != 0 ? state.isInitialized : true, (1021 & 2) != 0 ? state.isLoading : false, (1021 & 4) != 0 ? state.date : iobyxmoadgVar.iobyxmoadg().zoijcleaow(), (1021 & 8) != 0 ? state.text : iobyxmoadgVar.iobyxmoadg().eablkybsjg(), (1021 & 16) != 0 ? state.quantityForChoose : iobyxmoadgVar.iobyxmoadg().wkgbmnqykc(), (1021 & 32) != 0 ? state.quantityChosen : iobyxmoadgVar.iobyxmoadg().ppxfxbqfkf(), (1021 & 64) != 0 ? state.isSelectedAvailable : iobyxmoadgVar.iobyxmoadg().ppxfxbqfkf() < iobyxmoadgVar.iobyxmoadg().wkgbmnqykc(), (1021 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.categories : iobyxmoadgVar.iobyxmoadg().iobyxmoadg(), (1021 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.selectedCategoriesIds : null, (1021 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isUserConfirmCategories : false);
        }
        if (!(msg instanceof gxszxtbevo.zoijcleaow)) {
            if (!zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.eablkybsjg.f106053iobyxmoadg)) {
                if (msg instanceof gxszxtbevo.wkgbmnqykc) {
                    return state.zoijcleaow((1021 & 1) != 0 ? state.isInitialized : false, (1021 & 2) != 0 ? state.isLoading : false, (1021 & 4) != 0 ? state.date : null, (1021 & 8) != 0 ? state.text : null, (1021 & 16) != 0 ? state.quantityForChoose : 0, (1021 & 32) != 0 ? state.quantityChosen : 0, (1021 & 64) != 0 ? state.isSelectedAvailable : false, (1021 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.categories : null, (1021 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.selectedCategoriesIds : null, (1021 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isUserConfirmCategories : ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg());
                }
                throw new NoWhenBranchMatchedException();
            }
            List categories = state.getCategories();
            ArrayList arrayList = new ArrayList();
            for (Object obj : categories) {
                if (state.getSelectedCategoriesIds().contains(((LoyaltyCategory) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            return state.zoijcleaow((1021 & 1) != 0 ? state.isInitialized : false, (1021 & 2) != 0 ? state.isLoading : false, (1021 & 4) != 0 ? state.date : null, (1021 & 8) != 0 ? state.text : null, (1021 & 16) != 0 ? state.quantityForChoose : 0, (1021 & 32) != 0 ? state.quantityChosen : 0, (1021 & 64) != 0 ? state.isSelectedAvailable : false, (1021 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.categories : arrayList, (1021 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.selectedCategoriesIds : null, (1021 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isUserConfirmCategories : true);
        }
        if (state.getIsSelectedAvailable()) {
            gxszxtbevo.zoijcleaow zoijcleaowVar = (gxszxtbevo.zoijcleaow) msg;
            if (state.getSelectedCategoriesIds().contains(zoijcleaowVar.iobyxmoadg())) {
                selectedCategoriesIds = jyumaefscl.ipoelvxyzq(state.getSelectedCategoriesIds(), zoijcleaowVar.iobyxmoadg());
            } else {
                if (state.getSelectedCategoriesIds().size() >= state.getQuantityForChoose()) {
                    Integer numValueOf = Integer.valueOf(jyumaefscl.ojitshcjhn(state.getSelectedCategoriesIds()));
                    if (numValueOf.intValue() < 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        List selectedCategoriesIds2 = state.getSelectedCategoriesIds();
                        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(selectedCategoriesIds2, 10));
                        for (Object obj2 : selectedCategoriesIds2) {
                            int i14 = i13 + 1;
                            if (i13 < 0) {
                                jyumaefscl.iwizpuwonk();
                            }
                            String strIobyxmoadg = (String) obj2;
                            if (i13 == iIntValue) {
                                strIobyxmoadg = zoijcleaowVar.iobyxmoadg();
                            }
                            arrayList2.add(strIobyxmoadg);
                            i13 = i14;
                        }
                        list = arrayList2;
                    } else {
                        selectedCategoriesIds = state.getSelectedCategoriesIds();
                    }
                    return state.zoijcleaow((1021 & 1) != 0 ? state.isInitialized : false, (1021 & 2) != 0 ? state.isLoading : false, (1021 & 4) != 0 ? state.date : null, (1021 & 8) != 0 ? state.text : null, (1021 & 16) != 0 ? state.quantityForChoose : 0, (1021 & 32) != 0 ? state.quantityChosen : list.size(), (1021 & 64) != 0 ? state.isSelectedAvailable : false, (1021 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.categories : null, (1021 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.selectedCategoriesIds : list, (1021 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isUserConfirmCategories : false);
                }
                selectedCategoriesIds = jyumaefscl.jrbgnlbqoe(state.getSelectedCategoriesIds(), zoijcleaowVar.iobyxmoadg());
            }
        } else {
            selectedCategoriesIds = state.getSelectedCategoriesIds();
        }
        list = selectedCategoriesIds;
        return state.zoijcleaow((1021 & 1) != 0 ? state.isInitialized : false, (1021 & 2) != 0 ? state.isLoading : false, (1021 & 4) != 0 ? state.date : null, (1021 & 8) != 0 ? state.text : null, (1021 & 16) != 0 ? state.quantityForChoose : 0, (1021 & 32) != 0 ? state.quantityChosen : list.size(), (1021 & 64) != 0 ? state.isSelectedAvailable : false, (1021 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.categories : null, (1021 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.selectedCategoriesIds : list, (1021 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.isUserConfirmCategories : false);
    }
}
