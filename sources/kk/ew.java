package kk;

import spay.sdk.R;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ew {
    public static lx iobyxmoadg(boolean z13, boolean z14, boolean z15, ListOfCardsResponseBody.PaymentToolInfo.Tool tool) {
        vu vuVarIobyxmoadg;
        String precalculateBonuses;
        String precalculateBonuses2;
        String precalculateBonuses3;
        String precalculateBonuses4;
        String productName;
        String precalculateBonuses5;
        String productName2;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2;
        Integer numValueOf = null;
        if (z13) {
            int i13 = R.string.spay_currency_pattern;
            String strZoijcleaow = (tool == null || (amountData2 = tool.getAmountData()) == null) ? null : qa0.zoijcleaow(amountData2.getAmount());
            if (strZoijcleaow == null) {
                strZoijcleaow = "";
            }
            String currency = (tool == null || (amountData = tool.getAmountData()) == null) ? null : amountData.getCurrency();
            if (currency == null) {
                currency = "";
            }
            Object[] args = {strZoijcleaow, currency};
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            vuVarIobyxmoadg = new ms(i13, hg.agtfadlqog.i(args));
        } else {
            String paymentSystemType = tool != null ? tool.getPaymentSystemType() : null;
            if (paymentSystemType == null) {
                paymentSystemType = "";
            }
            vuVarIobyxmoadg = me.iobyxmoadg(paymentSystemType, "text", paymentSystemType);
        }
        vu vuVar = vuVarIobyxmoadg;
        if (z13 && z14 && !z15) {
            String string = (tool == null || (productName2 = tool.getProductName()) == null) ? null : mj.kcexrzcfyt.p(productName2).toString();
            String str = string == null ? "" : string;
            int i14 = R.string.spay_card_compound_wallet_number_pattern;
            Integer numValueOf2 = Integer.valueOf(R.plurals.spay_order_compound_wallet_f);
            String cardNumber = tool != null ? tool.getCardNumber() : null;
            String str2 = cardNumber == null ? "" : cardNumber;
            Integer countAdditionalCards = tool != null ? tool.getCountAdditionalCards() : null;
            String cardLogoUrl = tool != null ? tool.getCardLogoUrl() : null;
            if (tool != null && (precalculateBonuses5 = tool.getPrecalculateBonuses()) != null) {
                numValueOf = Integer.valueOf(Integer.parseInt(precalculateBonuses5));
            }
            return new lx(vuVar, str, i14, numValueOf2, str2, countAdditionalCards, cardLogoUrl, false, Integer.valueOf(qa0.iobyxmoadg(numValueOf)));
        }
        if (z13 && !z14 && !z15) {
            String string2 = (tool == null || (productName = tool.getProductName()) == null) ? null : mj.kcexrzcfyt.p(productName).toString();
            String str3 = string2 == null ? "" : string2;
            int i15 = R.string.spay_card_number_pattern;
            String cardNumber2 = tool != null ? tool.getCardNumber() : null;
            String str4 = cardNumber2 == null ? "" : cardNumber2;
            String cardLogoUrl2 = tool != null ? tool.getCardLogoUrl() : null;
            if (tool != null && (precalculateBonuses4 = tool.getPrecalculateBonuses()) != null) {
                numValueOf = Integer.valueOf(ir.eablkybsjg(precalculateBonuses4));
            }
            return new lx(vuVar, str3, i15, null, str4, null, cardLogoUrl2, false, numValueOf, 40);
        }
        if (z15) {
            int i16 = R.string.spay_payment_account_pattern;
            String cardNumber3 = tool != null ? tool.getCardNumber() : null;
            String str5 = cardNumber3 == null ? "" : cardNumber3;
            String cardLogoUrl3 = tool != null ? tool.getCardLogoUrl() : null;
            if (tool != null && (precalculateBonuses3 = tool.getPrecalculateBonuses()) != null) {
                numValueOf = Integer.valueOf(ir.eablkybsjg(precalculateBonuses3));
            }
            return new lx(vuVar, "", i16, null, str5, null, cardLogoUrl3, true, numValueOf, 40);
        }
        if (z13 || !z14) {
            int i17 = R.string.spay_card_number_pattern_old;
            String cardNumber4 = tool != null ? tool.getCardNumber() : null;
            String str6 = cardNumber4 == null ? "" : cardNumber4;
            String cardLogoUrl4 = tool != null ? tool.getCardLogoUrl() : null;
            if (tool != null && (precalculateBonuses = tool.getPrecalculateBonuses()) != null) {
                numValueOf = Integer.valueOf(Integer.parseInt(precalculateBonuses));
            }
            return new lx(vuVar, "", i17, null, str6, null, cardLogoUrl4, true, Integer.valueOf(qa0.iobyxmoadg(numValueOf)), 40);
        }
        int i18 = R.string.spay_card_compound_wallet_number_pattern_old;
        Integer numValueOf3 = Integer.valueOf(R.plurals.spay_order_compound_wallet_old_f);
        String cardNumber5 = tool != null ? tool.getCardNumber() : null;
        String str7 = cardNumber5 == null ? "" : cardNumber5;
        Integer countAdditionalCards2 = tool != null ? tool.getCountAdditionalCards() : null;
        String cardLogoUrl5 = tool != null ? tool.getCardLogoUrl() : null;
        if (tool != null && (precalculateBonuses2 = tool.getPrecalculateBonuses()) != null) {
            numValueOf = Integer.valueOf(ir.eablkybsjg(precalculateBonuses2));
        }
        return new lx(vuVar, "", i18, numValueOf3, str7, countAdditionalCards2, cardLogoUrl5, true, numValueOf);
    }
}
