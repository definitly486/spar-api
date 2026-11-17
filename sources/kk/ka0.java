package kk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import spay.sdk.R;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.OrderScreenDataResponse;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class ka0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f57283iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ lg0 f57284jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ hf0 f57285yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f57286zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(hf0 hf0Var, lg0 lg0Var, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f57285yggfygwlhe = hf0Var;
        this.f57284jyumaefscl = lg0Var;
        this.f57283iwizpuwonk = pkzmftpjixVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        ka0 ka0Var = new ka0(this.f57285yggfygwlhe, this.f57284jyumaefscl, this.f57283iwizpuwonk, gxszxtbevoVar);
        ka0Var.f57286zdlpuopuiu = obj;
        return ka0Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((ka0) create((hl) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> listOfCards;
        long jLongValue;
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        String str;
        vu vuVarIobyxmoadg;
        g6 g6Var;
        vu vuVarIobyxmoadg2;
        l6 l6Var;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        hl hlVar = (hl) this.f57286zdlpuopuiu;
        Integer num = 0;
        b6 b6Var = null;
        if (hlVar instanceof w20) {
            ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) ((auzgnhcxok) this.f57285yggfygwlhe.f56909ppxfxbqfkf).f55863oxmwwwfdhm.getValue();
            if (listOfCardsResponseBody2 == null || (paymentToolInfo = listOfCardsResponseBody2.getPaymentToolInfo()) == null || (listOfCards = paymentToolInfo.getToolList()) == null) {
                listOfCards = hg.jyumaefscl.wflxmlrfwp();
            }
            hf0 hf0Var = this.f57285yggfygwlhe;
            Iterator<ListOfCardsResponseBody.PaymentToolInfo.Tool> it = listOfCards.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                String cardNumber = it.next().getCardNumber();
                ListOfCardsResponseBody.PaymentToolInfo.Tool tool = ((ij) hf0Var.f56908lqeggnwhkg).iobyxmoadg().f57487zoijcleaow;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cardNumber, tool != null ? tool.getCardNumber() : null)) {
                    break;
                }
                i13++;
            }
            int iIobyxmoadg = qa0.iobyxmoadg(i13 == -1 ? null : kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(i13));
            hf0 hf0Var2 = this.f57285yggfygwlhe;
            bx bxVar = hf0Var2.f56906gxszxtbevo;
            wc0 wc0Var = hf0Var2.f56905eablkybsjg;
            uc0 uc0Var = uc0.BNPL;
            if (zd0.iobyxmoadg(wc0Var, uc0Var, b6.BY_USER) && zd0.iobyxmoadg(hf0Var2.f56905eablkybsjg, uc0Var, b6.BY_SYSTEM)) {
                jLongValue = ((auzgnhcxok) this.f57285yggfygwlhe.f56909ppxfxbqfkf).iobyxmoadg();
            } else {
                OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) ((auzgnhcxok) this.f57285yggfygwlhe.f56909ppxfxbqfkf).f55843btonecajqb.getValue();
                Long lValueOf = (orderScreenDataResponse == null || (listOfCardsResponseBody = orderScreenDataResponse.getListOfCardsResponseBody()) == null || (orderInfo = listOfCardsResponseBody.getOrderInfo()) == null || (orderAmount = orderInfo.getOrderAmount()) == null) ? null : Long.valueOf(orderAmount.getAmount());
                jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
            }
            boolean z13 = ((auzgnhcxok) this.f57285yggfygwlhe.f56909ppxfxbqfkf).btonecajqb() instanceof PayStrategy.PayWithPaymentAccount;
            bxVar.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listOfCards, "listOfCards");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listOfCards) {
                ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2).getAmountData();
                Long lValueOf2 = amountData != null ? Long.valueOf(amountData.getAmount()) : null;
                if ((lValueOf2 != null ? lValueOf2.longValue() : 0L) >= jLongValue) {
                    arrayList.add(obj2);
                }
            }
            List listD = arrayList;
            if (zd0.iobyxmoadg(bxVar.f56065zoijcleaow, uc0.CARD_LIST_SORT, null)) {
                listD = hg.jyumaefscl.d(hg.jyumaefscl.d(arrayList, new tu()), new xv());
            }
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listD, 10));
            Iterator it2 = listD.iterator();
            while (true) {
                str = "card";
                if (!it2.hasNext()) {
                    break;
                }
                ListOfCardsResponseBody.PaymentToolInfo.Tool card = (ListOfCardsResponseBody.PaymentToolInfo.Tool) it2.next();
                Integer num2 = num;
                boolean zIobyxmoadg = zd0.iobyxmoadg(bxVar.f56065zoijcleaow, uc0.CARD_BALANCE, b6Var);
                Integer countAdditionalCards = card.getCountAdditionalCards();
                boolean z14 = countAdditionalCards != null && countAdditionalCards.intValue() > 0;
                String cardNumber2 = card.getCardNumber();
                ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = ((ln) ((ij) bxVar.f56064iobyxmoadg).f57056zoijcleaow.getValue()).f57487zoijcleaow;
                int i14 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cardNumber2, tool2 != null ? tool2.getCardNumber() : null) ? R.color.spay_card_selected_background_12 : R.color.spay_card_selection_background;
                int i15 = listOfCards.indexOf(card) == iIobyxmoadg ? R.drawable.spay_ic_selected : R.drawable.spay_ic_unselected;
                Iterator it3 = it2;
                boolean zIobyxmoadg2 = zd0.iobyxmoadg(bxVar.f56065zoijcleaow, uc0.S_BONUSES, null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(card, "card");
                if (zIobyxmoadg) {
                    int i16 = R.string.spay_currency_pattern;
                    ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2 = card.getAmountData();
                    String strZoijcleaow = amountData2 != null ? qa0.zoijcleaow(amountData2.getAmount()) : null;
                    if (strZoijcleaow == null) {
                        strZoijcleaow = "";
                    }
                    ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData3 = card.getAmountData();
                    String currency = amountData3 != null ? amountData3.getCurrency() : null;
                    if (currency == null) {
                        currency = "";
                    }
                    Object[] args = {strZoijcleaow, currency};
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
                    vuVarIobyxmoadg2 = new ms(i16, hg.agtfadlqog.i(args));
                } else {
                    String paymentSystemType = card.getPaymentSystemType();
                    if (paymentSystemType == null) {
                        paymentSystemType = "";
                    }
                    vuVarIobyxmoadg2 = me.iobyxmoadg(paymentSystemType, "text", paymentSystemType);
                }
                if (zIobyxmoadg && z14 && !z13) {
                    int paymentId = card.getPaymentId();
                    String cardNumber3 = card.getCardNumber();
                    String str2 = cardNumber3 == null ? "" : cardNumber3;
                    String cardLogoUrl = card.getCardLogoUrl();
                    int i17 = R.string.spay_card_compound_wallet_number_pattern;
                    int i18 = R.plurals.spay_order_compound_wallet_f;
                    Integer countAdditionalCards2 = card.getCountAdditionalCards();
                    String string = mj.kcexrzcfyt.p(card.getProductName()).toString();
                    String precalculateBonuses = card.getPrecalculateBonuses();
                    l6Var = new l6(paymentId, i14, i15, i17, Integer.valueOf(i18), str2, countAdditionalCards2, vuVarIobyxmoadg2, string, cardLogoUrl, false, zIobyxmoadg2 ? precalculateBonuses != null ? Integer.valueOf(ir.eablkybsjg(precalculateBonuses)) : null : num2);
                } else if (zIobyxmoadg && !z14 && !z13) {
                    int paymentId2 = card.getPaymentId();
                    String cardNumber4 = card.getCardNumber();
                    String str3 = cardNumber4 == null ? "" : cardNumber4;
                    String cardLogoUrl2 = card.getCardLogoUrl();
                    int i19 = R.string.spay_card_number_pattern;
                    String string2 = mj.kcexrzcfyt.p(card.getProductName()).toString();
                    String precalculateBonuses2 = card.getPrecalculateBonuses();
                    l6Var = new l6(paymentId2, i14, i15, i19, null, str3, null, vuVarIobyxmoadg2, string2, cardLogoUrl2, false, zIobyxmoadg2 ? precalculateBonuses2 != null ? Integer.valueOf(ir.eablkybsjg(precalculateBonuses2)) : null : num2);
                } else if (z13) {
                    int paymentId3 = card.getPaymentId();
                    String cardLogoUrl3 = card.getCardLogoUrl();
                    int i23 = R.string.spay_payment_account_pattern;
                    String cardNumber5 = card.getCardNumber();
                    String str4 = cardNumber5 == null ? "" : cardNumber5;
                    String precalculateBonuses3 = card.getPrecalculateBonuses();
                    l6Var = new l6(paymentId3, i14, i15, i23, null, str4, null, vuVarIobyxmoadg2, "", cardLogoUrl3, true, zIobyxmoadg2 ? precalculateBonuses3 != null ? Integer.valueOf(ir.eablkybsjg(precalculateBonuses3)) : null : num2);
                } else if (zIobyxmoadg || !z14) {
                    int paymentId4 = card.getPaymentId();
                    String cardLogoUrl4 = card.getCardLogoUrl();
                    int i24 = R.string.spay_card_number_pattern_old;
                    String cardNumber6 = card.getCardNumber();
                    String str5 = cardNumber6 == null ? "" : cardNumber6;
                    String precalculateBonuses4 = card.getPrecalculateBonuses();
                    l6Var = new l6(paymentId4, i14, i15, i24, null, str5, null, vuVarIobyxmoadg2, "", cardLogoUrl4, true, zIobyxmoadg2 ? precalculateBonuses4 != null ? Integer.valueOf(ir.eablkybsjg(precalculateBonuses4)) : null : num2);
                } else {
                    int paymentId5 = card.getPaymentId();
                    String cardLogoUrl5 = card.getCardLogoUrl();
                    int i25 = R.string.spay_card_compound_wallet_number_pattern_old;
                    int i26 = R.plurals.spay_order_compound_wallet_old_f;
                    Integer countAdditionalCards3 = card.getCountAdditionalCards();
                    String cardNumber7 = card.getCardNumber();
                    String str6 = cardNumber7 == null ? "" : cardNumber7;
                    String precalculateBonuses5 = card.getPrecalculateBonuses();
                    l6Var = new l6(paymentId5, i14, i15, i25, Integer.valueOf(i26), str6, countAdditionalCards3, vuVarIobyxmoadg2, "", cardLogoUrl5, true, zIobyxmoadg2 ? precalculateBonuses5 != null ? Integer.valueOf(ir.eablkybsjg(precalculateBonuses5)) : null : num2);
                }
                arrayList2.add(l6Var);
                num = num2;
                it2 = it3;
                b6Var = null;
            }
            Integer num3 = num;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : listOfCards) {
                ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData4 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj3).getAmountData();
                Long lValueOf3 = amountData4 != null ? Long.valueOf(amountData4.getAmount()) : null;
                if ((lValueOf3 != null ? lValueOf3.longValue() : 0L) < jLongValue) {
                    arrayList3.add(obj3);
                }
            }
            List<ListOfCardsResponseBody.PaymentToolInfo.Tool> listD2 = arrayList3;
            if (zd0.iobyxmoadg(bxVar.f56065zoijcleaow, uc0.CARD_LIST_SORT, null)) {
                listD2 = hg.jyumaefscl.d(arrayList3, new pt());
            }
            ArrayList arrayList4 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listD2, 10));
            for (ListOfCardsResponseBody.PaymentToolInfo.Tool tool3 : listD2) {
                boolean zIobyxmoadg3 = zd0.iobyxmoadg(bxVar.f56065zoijcleaow, uc0.CARD_BALANCE, null);
                Integer countAdditionalCards4 = tool3.getCountAdditionalCards();
                boolean z15 = countAdditionalCards4 != null && countAdditionalCards4.intValue() > 0;
                String cardNumber8 = tool3.getCardNumber();
                ListOfCardsResponseBody.PaymentToolInfo.Tool tool4 = ((ln) ((ij) bxVar.f56064iobyxmoadg).f57056zoijcleaow.getValue()).f57487zoijcleaow;
                int i27 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cardNumber8, tool4 != null ? tool4.getCardNumber() : null) ? R.color.spay_card_selected_background_12 : R.color.spay_card_selection_background;
                int i28 = listOfCards.indexOf(tool3) == iIobyxmoadg ? R.drawable.spay_ic_selected : R.drawable.spay_ic_unselected;
                List<ListOfCardsResponseBody.PaymentToolInfo.Tool> list = listOfCards;
                boolean zIobyxmoadg4 = zd0.iobyxmoadg(bxVar.f56065zoijcleaow, uc0.S_BONUSES, null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tool3, str);
                if (zIobyxmoadg3) {
                    int i29 = R.string.spay_currency_pattern;
                    ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData5 = tool3.getAmountData();
                    String strZoijcleaow2 = amountData5 != null ? qa0.zoijcleaow(amountData5.getAmount()) : null;
                    if (strZoijcleaow2 == null) {
                        strZoijcleaow2 = "";
                    }
                    ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData6 = tool3.getAmountData();
                    String currency2 = amountData6 != null ? amountData6.getCurrency() : null;
                    Object[] args2 = {strZoijcleaow2, currency2 == null ? "" : currency2};
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args2, "args");
                    vuVarIobyxmoadg = new ms(i29, hg.agtfadlqog.i(args2));
                } else {
                    String paymentSystemType2 = tool3.getPaymentSystemType();
                    if (paymentSystemType2 == null) {
                        paymentSystemType2 = "";
                    }
                    vuVarIobyxmoadg = me.iobyxmoadg(paymentSystemType2, "text", paymentSystemType2);
                }
                if (zIobyxmoadg3 && z15 && !z13) {
                    int paymentId6 = tool3.getPaymentId();
                    String cardNumber9 = tool3.getCardNumber();
                    String str7 = cardNumber9 == null ? "" : cardNumber9;
                    String cardLogoUrl6 = tool3.getCardLogoUrl();
                    int i33 = R.string.spay_card_compound_wallet_number_pattern;
                    int i34 = R.plurals.spay_order_compound_wallet_f;
                    Integer countAdditionalCards5 = tool3.getCountAdditionalCards();
                    String string3 = mj.kcexrzcfyt.p(tool3.getProductName()).toString();
                    String precalculateBonuses6 = tool3.getPrecalculateBonuses();
                    g6Var = new g6(paymentId6, i27, i28, i33, Integer.valueOf(i34), str7, countAdditionalCards5, vuVarIobyxmoadg, string3, cardLogoUrl6, false, zIobyxmoadg4 ? precalculateBonuses6 != null ? Integer.valueOf(ir.eablkybsjg(precalculateBonuses6)) : null : num3);
                } else if (zIobyxmoadg3 && !z15 && !z13) {
                    int paymentId7 = tool3.getPaymentId();
                    String cardNumber10 = tool3.getCardNumber();
                    String str8 = cardNumber10 == null ? "" : cardNumber10;
                    String cardLogoUrl7 = tool3.getCardLogoUrl();
                    int i35 = R.string.spay_card_number_pattern;
                    String string4 = mj.kcexrzcfyt.p(tool3.getProductName()).toString();
                    String precalculateBonuses7 = tool3.getPrecalculateBonuses();
                    g6Var = new g6(paymentId7, i27, i28, i35, null, str8, null, vuVarIobyxmoadg, string4, cardLogoUrl7, false, zIobyxmoadg4 ? precalculateBonuses7 != null ? Integer.valueOf(ir.eablkybsjg(precalculateBonuses7)) : null : num3);
                } else if (z13) {
                    int paymentId8 = tool3.getPaymentId();
                    String cardLogoUrl8 = tool3.getCardLogoUrl();
                    int i36 = R.string.spay_payment_account_pattern;
                    String cardNumber11 = tool3.getCardNumber();
                    String str9 = cardNumber11 == null ? "" : cardNumber11;
                    String precalculateBonuses8 = tool3.getPrecalculateBonuses();
                    g6Var = new g6(paymentId8, i27, i28, i36, null, str9, null, vuVarIobyxmoadg, "", cardLogoUrl8, true, zIobyxmoadg4 ? precalculateBonuses8 != null ? Integer.valueOf(ir.eablkybsjg(precalculateBonuses8)) : null : num3);
                } else if (zIobyxmoadg3 || !z15) {
                    int paymentId9 = tool3.getPaymentId();
                    String cardLogoUrl9 = tool3.getCardLogoUrl();
                    int i37 = R.string.spay_card_number_pattern_old;
                    String cardNumber12 = tool3.getCardNumber();
                    String str10 = cardNumber12 == null ? "" : cardNumber12;
                    String precalculateBonuses9 = tool3.getPrecalculateBonuses();
                    g6Var = new g6(paymentId9, i27, i28, i37, null, str10, null, vuVarIobyxmoadg, "", cardLogoUrl9, true, zIobyxmoadg4 ? precalculateBonuses9 != null ? Integer.valueOf(ir.eablkybsjg(precalculateBonuses9)) : null : num3);
                } else {
                    int paymentId10 = tool3.getPaymentId();
                    String cardLogoUrl10 = tool3.getCardLogoUrl();
                    int i38 = R.string.spay_card_compound_wallet_number_pattern_old;
                    int i39 = R.plurals.spay_order_compound_wallet_old_f;
                    Integer countAdditionalCards6 = tool3.getCountAdditionalCards();
                    String cardNumber13 = tool3.getCardNumber();
                    String str11 = cardNumber13 == null ? "" : cardNumber13;
                    String precalculateBonuses10 = tool3.getPrecalculateBonuses();
                    g6Var = new g6(paymentId10, i27, i28, i38, Integer.valueOf(i39), str11, countAdditionalCards6, vuVarIobyxmoadg, "", cardLogoUrl10, true, zIobyxmoadg4 ? precalculateBonuses10 != null ? Integer.valueOf(ir.eablkybsjg(precalculateBonuses10)) : null : num3);
                }
                arrayList4.add(g6Var);
                listOfCards = list;
                str = str;
            }
            ArrayList arrayList5 = new ArrayList();
            if (!arrayList2.isEmpty()) {
                arrayList5.addAll(arrayList2);
            }
            if (!arrayList4.isEmpty()) {
                arrayList5.add(new wt(zv.zoijcleaow(z13 ? R.string.spay_payment_accounts_selection_header_not_enough_money : R.string.spay_card_selection_header_not_enough_money)));
                arrayList5.addAll(arrayList4);
            }
            ((ve) this.f57285yggfygwlhe.f56911zoijcleaow).zoijcleaow(new wo(this.f57284jyumaefscl.f57474zoijcleaow.f55767iobyxmoadg, new r0(arrayList5, iIobyxmoadg)));
        } else if (hlVar instanceof g60) {
            hf0 hf0Var3 = this.f57285yggfygwlhe;
            ((ve) hf0Var3.f56911zoijcleaow).zoijcleaow(new g(new g60(new g90(hf0Var3, this.f57284jyumaefscl, this.f57283iwizpuwonk, null))));
        } else {
            pc pcVar = this.f57285yggfygwlhe.f56911zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pcVar, "<this>");
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("ELSE BRANCH ERROR").zoijcleaow("Unpredictable case", new Object[0]);
            ((ve) pcVar).zoijcleaow(zw.f59634iobyxmoadg);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
