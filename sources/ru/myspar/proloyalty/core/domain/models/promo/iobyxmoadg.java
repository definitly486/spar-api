package ru.myspar.proloyalty.core.domain.models.promo;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    public static final boolean iobyxmoadg(Promotion promotion) {
        zdlpuopuiu.btonecajqb(promotion, "<this>");
        for (Object obj : promotion.getItems()) {
            Promotion.PromotionItem promotionItem = (Promotion.PromotionItem) obj;
            Integer balance = promotion.getBalance();
            if ((balance != null ? balance.intValue() : 0) >= promotionItem.getNeeds() && promotionItem.getNeeds() != 0) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }
}
