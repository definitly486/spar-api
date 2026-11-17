package kk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import spay.sdk.api.SPayHelperConfig;
import spay.sdk.api.SPayHelpers;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.domain.model.OrderScreenOutcome;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.bnpl.ButtonBnpl;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class gb implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f56686iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ qf f56687jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ oe f56688yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f56689zdlpuopuiu;

    public gb(sj.nufgyqmvbu nufgyqmvbuVar, oe oeVar, qf qfVar, pj.pkzmftpjix pkzmftpjixVar) {
        this.f56689zdlpuopuiu = nufgyqmvbuVar;
        this.f56688yggfygwlhe = oeVar;
        this.f56687jyumaefscl = qfVar;
        this.f56686iwizpuwonk = pkzmftpjixVar;
    }

    /* JADX WARN: Code duplicated, block: B:187:0x03e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:251:0x0525  */
    /* JADX WARN: Code duplicated, block: B:271:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c7  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        da daVar;
        ln lnVarPpxfxbqfkf;
        int i13;
        gg.wwaezpbzkn wwaezpbzknVar;
        z6 q3Var;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        Long lValueOf;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2;
        Long lValueOf2;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList3;
        ListOfCardsResponseBody.PromoInfo promoInfo;
        List<ListOfCardsResponseBody.PromoInfo.BannerData> bannerList;
        ButtonBnpl buttonBnpl;
        if (gxszxtbevoVar instanceof da) {
            daVar = (da) gxszxtbevoVar;
            int i14 = daVar.f56246yggfygwlhe;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                daVar.f56246yggfygwlhe = i14 - Integer.MIN_VALUE;
            } else {
                daVar = new da(this, gxszxtbevoVar);
            }
        } else {
            daVar = new da(this, gxszxtbevoVar);
        }
        Object obj2 = daVar.f56247zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = daVar.f56246yggfygwlhe;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f56689zdlpuopuiu;
            OrderScreenOutcome orderScreenOutcome = (OrderScreenOutcome) obj;
            if (orderScreenOutcome.isLoading()) {
                objGxszxtbevo = objGxszxtbevo;
                lnVarPpxfxbqfkf = this.f56688yggfygwlhe.ppxfxbqfkf(this.f56687jyumaefscl, orderScreenOutcome, this.f56686iwizpuwonk);
                i13 = 1;
            } else {
                SPaySdkInitConfig sPaySdkInitConfig = ((nb) this.f56688yggfygwlhe.f57935nufgyqmvbu).f57752iobyxmoadg;
                SPayHelperConfig helperConfig = sPaySdkInitConfig != null ? sPaySdkInitConfig.getHelperConfig() : null;
                if (helperConfig == null || !helperConfig.isHelperEnabled()) {
                    objGxszxtbevo = objGxszxtbevo;
                    lnVarPpxfxbqfkf = this.f56688yggfygwlhe.ppxfxbqfkf(this.f56687jyumaefscl, orderScreenOutcome, this.f56686iwizpuwonk);
                } else {
                    oe oeVar = this.f56688yggfygwlhe;
                    qf qfVar = this.f56687jyumaefscl;
                    pj.pkzmftpjix pkzmftpjixVar = this.f56686iwizpuwonk;
                    oeVar.getClass();
                    if ((orderScreenOutcome.getListCardsOutcome() instanceof w7) || (orderScreenOutcome.getListCardsOutcome() instanceof pv) || (orderScreenOutcome.getListCardsOutcome() instanceof wg)) {
                        objGxszxtbevo = objGxszxtbevo;
                        lnVarPpxfxbqfkf = new ln(new pv("Системная или внутренняя ошибка"), 2);
                    } else if (orderScreenOutcome.getListCardsOutcome() instanceof lu) {
                        lnVarPpxfxbqfkf = new ln(orderScreenOutcome.getListCardsOutcome(), 2);
                        objGxszxtbevo = objGxszxtbevo;
                        i13 = 1;
                    } else {
                        za zaVar = oeVar.f57934lqeggnwhkg;
                        SPaySdkInitConfig sPaySdkInitConfig2 = ((nb) zaVar.f59555wkgbmnqykc).f57752iobyxmoadg;
                        SPayHelperConfig helperConfig2 = sPaySdkInitConfig2 != null ? sPaySdkInitConfig2.getHelperConfig() : null;
                        if (helperConfig2 != null) {
                            ArrayList helpersList = new ArrayList();
                            List listRgvfuqvkyq = hg.jyumaefscl.rgvfuqvkyq(Boolean.valueOf(zd0.iobyxmoadg(zaVar.f59552iobyxmoadg, uc0.BNPL, b6.BY_SYSTEM)), Boolean.valueOf(zd0.iobyxmoadg(zaVar.f59552iobyxmoadg, uc0.CARD_HELPER_SBP, null)), Boolean.valueOf(zd0.iobyxmoadg(zaVar.f59552iobyxmoadg, uc0.CARD_HELPER_CREDIT, null)), Boolean.valueOf(zd0.iobyxmoadg(zaVar.f59552iobyxmoadg, uc0.CARD_HELPER_DEBIT, null)));
                            List listRgvfuqvkyq2 = hg.jyumaefscl.rgvfuqvkyq(SPayHelpers.BNPL, SPayHelpers.SBP, SPayHelpers.CREDIT_CARD, SPayHelpers.DEBIT_CARD);
                            Iterator it = listRgvfuqvkyq.iterator();
                            Iterator it2 = listRgvfuqvkyq2.iterator();
                            ArrayList arrayList = new ArrayList(Math.min(hg.jyumaefscl.cqumvgiudr(listRgvfuqvkyq, 10), hg.jyumaefscl.cqumvgiudr(listRgvfuqvkyq2, 10)));
                            while (it.hasNext() && it2.hasNext()) {
                                Object next = it.next();
                                SPayHelpers sPayHelpers = (SPayHelpers) it2.next();
                                if (((Boolean) next).booleanValue()) {
                                    helpersList.add(sPayHelpers);
                                }
                                arrayList.add(gg.wwaezpbzkn.f37140iobyxmoadg);
                            }
                            if (!helperConfig2.isHelperEnabled()) {
                                helpersList.clear();
                            }
                            int size = helpersList.size();
                            for (int i16 = 0; i16 < size; i16++) {
                                List<SPayHelpers> disabledHelpers = helperConfig2.getDisabledHelpers();
                                SPayHelpers sPayHelpers2 = SPayHelpers.SBP;
                                if (disabledHelpers.contains(sPayHelpers2) && helpersList.contains(sPayHelpers2)) {
                                    helpersList.remove(sPayHelpers2);
                                } else {
                                    List<SPayHelpers> disabledHelpers2 = helperConfig2.getDisabledHelpers();
                                    SPayHelpers sPayHelpers3 = SPayHelpers.CREDIT_CARD;
                                    if (disabledHelpers2.contains(sPayHelpers3) && helpersList.contains(sPayHelpers3)) {
                                        helpersList.remove(sPayHelpers3);
                                    } else {
                                        List<SPayHelpers> disabledHelpers3 = helperConfig2.getDisabledHelpers();
                                        SPayHelpers sPayHelpers4 = SPayHelpers.DEBIT_CARD;
                                        if (disabledHelpers3.contains(sPayHelpers4) && helpersList.contains(sPayHelpers4)) {
                                            helpersList.remove(sPayHelpers4);
                                        } else {
                                            List<SPayHelpers> disabledHelpers4 = helperConfig2.getDisabledHelpers();
                                            SPayHelpers sPayHelpers5 = SPayHelpers.BNPL;
                                            if (!(disabledHelpers4.contains(sPayHelpers5) && helpersList.contains(sPayHelpers5)) && zd0.iobyxmoadg(zaVar.f59552iobyxmoadg, uc0.BNPL, b6.BY_SYSTEM)) {
                                                PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) zaVar.f59551gxszxtbevo.getValue();
                                                if ((paymentPlanBnplResponseBody != null ? paymentPlanBnplResponseBody.getButtonBnpl() : null) == null || !zaVar.zoijcleaow()) {
                                                    helpersList.remove(sPayHelpers5);
                                                }
                                            } else {
                                                helpersList.remove(sPayHelpers5);
                                            }
                                        }
                                    }
                                }
                            }
                            auzgnhcxok auzgnhcxokVar = (auzgnhcxok) zaVar.f59556zoijcleaow;
                            auzgnhcxokVar.getClass();
                            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(helpersList, "helpersList");
                            auzgnhcxokVar.f55849esjtqupxsv.addAll(helpersList);
                            wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                        } else {
                            wwaezpbzknVar = null;
                        }
                        if (wwaezpbzknVar == null) {
                            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("HELPER CONFIG EXCEPTION").zoijcleaow("SPayHelperConfig is null", new Object[0]);
                        }
                        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) zaVar.f59550eablkybsjg.getValue();
                        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo = listOfCardsResponseBody != null ? listOfCardsResponseBody.getPaymentToolInfo() : null;
                        ArrayList arrayList2 = new ArrayList();
                        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody2 = (PaymentPlanBnplResponseBody) zaVar.f59551gxszxtbevo.getValue();
                        if (paymentPlanBnplResponseBody2 != null && (buttonBnpl = paymentPlanBnplResponseBody2.getButtonBnpl()) != null) {
                            arrayList2.add(new ListOfCardsResponseBody.PromoInfo.BannerData(SPayHelpers.BNPL.getTag(), buttonBnpl.getHeader(), buttonBnpl.getHeader(), buttonBnpl.getContent(), buttonBnpl.getActiveButtonLogo(), hg.jyumaefscl.wflxmlrfwp()));
                        }
                        ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) zaVar.f59550eablkybsjg.getValue();
                        if (listOfCardsResponseBody2 != null && (promoInfo = listOfCardsResponseBody2.getPromoInfo()) != null && (bannerList = promoInfo.getBannerList()) != null) {
                            arrayList2.addAll(bannerList);
                        }
                        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList4 = paymentToolInfo != null ? paymentToolInfo.getToolList() : null;
                        if ((toolList4 == null || toolList4.isEmpty()) && ((auzgnhcxok) zaVar.f59556zoijcleaow).f55849esjtqupxsv.isEmpty()) {
                            k6 block = k6.f57264zdlpuopuiu;
                            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
                            q3Var = o2.f57880iobyxmoadg;
                        } else {
                            List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList5 = paymentToolInfo != null ? paymentToolInfo.getToolList() : null;
                            if ((toolList5 == null || toolList5.isEmpty()) && ((auzgnhcxok) zaVar.f59556zoijcleaow).f55849esjtqupxsv.contains(SPayHelpers.DEBIT_CARD) && !arrayList2.isEmpty()) {
                                n7 block2 = n7.f57741zdlpuopuiu;
                                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block2, "block");
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj3 : arrayList2) {
                                    ListOfCardsResponseBody.PromoInfo.BannerData bannerData = (ListOfCardsResponseBody.PromoInfo.BannerData) obj3;
                                    LinkedHashSet linkedHashSet = ((auzgnhcxok) zaVar.f59556zoijcleaow).f55849esjtqupxsv;
                                    ArrayList arrayList4 = new ArrayList(hg.jyumaefscl.cqumvgiudr(linkedHashSet, 10));
                                    Iterator it3 = linkedHashSet.iterator();
                                    while (it3.hasNext()) {
                                        arrayList4.add(((SPayHelpers) it3.next()).getTag());
                                    }
                                    if (arrayList4.contains(bannerData.getType())) {
                                        arrayList3.add(obj3);
                                    }
                                }
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj4 : arrayList3) {
                                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ListOfCardsResponseBody.PromoInfo.BannerData) obj4).getType(), SPayHelpers.DEBIT_CARD.getTag())) {
                                        arrayList5.add(obj4);
                                    }
                                }
                                q3Var = new q3(arrayList5);
                            } else {
                                List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList6 = paymentToolInfo != null ? paymentToolInfo.getToolList() : null;
                                if (toolList6 == null || toolList6.isEmpty()) {
                                    if (paymentToolInfo != null) {
                                        toolList = paymentToolInfo.getToolList();
                                    } else {
                                        toolList = null;
                                    }
                                    if (toolList != null || toolList.isEmpty()) {
                                        q3Var = m1.f57569iobyxmoadg;
                                    } else {
                                        if (paymentToolInfo == null || (toolList2 = paymentToolInfo.getToolList()) == null) {
                                            lValueOf = null;
                                        } else {
                                            Iterator<T> it4 = toolList2.iterator();
                                            if (!it4.hasNext()) {
                                                throw new NoSuchElementException();
                                            }
                                            ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) it4.next()).getAmountData();
                                            Long lValueOf3 = amountData != null ? Long.valueOf(amountData.getAmount()) : null;
                                            lValueOf = Long.valueOf(lValueOf3 != null ? lValueOf3.longValue() : 0L);
                                            while (it4.hasNext()) {
                                                ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) it4.next()).getAmountData();
                                                Long lValueOf4 = amountData2 != null ? Long.valueOf(amountData2.getAmount()) : null;
                                                Long lValueOf5 = Long.valueOf(lValueOf4 != null ? lValueOf4.longValue() : 0L);
                                                if (lValueOf.compareTo(lValueOf5) < 0) {
                                                    lValueOf = lValueOf5;
                                                }
                                            }
                                        }
                                        if ((lValueOf != null ? lValueOf.longValue() : 0L) >= zaVar.wkgbmnqykc() || (!(((auzgnhcxok) zaVar.f59556zoijcleaow).f55849esjtqupxsv.contains(SPayHelpers.SBP) || ((auzgnhcxok) zaVar.f59556zoijcleaow).f55849esjtqupxsv.contains(SPayHelpers.CREDIT_CARD) || ((auzgnhcxok) zaVar.f59556zoijcleaow).f55849esjtqupxsv.contains(SPayHelpers.BNPL)) || arrayList2.isEmpty())) {
                                            q3Var = m1.f57569iobyxmoadg;
                                        } else {
                                            h5 block3 = h5.f56831zdlpuopuiu;
                                            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block3, "block");
                                            ArrayList arrayList6 = new ArrayList();
                                            for (Object obj5 : arrayList2) {
                                                ListOfCardsResponseBody.PromoInfo.BannerData bannerData2 = (ListOfCardsResponseBody.PromoInfo.BannerData) obj5;
                                                LinkedHashSet linkedHashSet2 = ((auzgnhcxok) zaVar.f59556zoijcleaow).f55849esjtqupxsv;
                                                ArrayList arrayList7 = new ArrayList(hg.jyumaefscl.cqumvgiudr(linkedHashSet2, 10));
                                                Iterator it5 = linkedHashSet2.iterator();
                                                while (it5.hasNext()) {
                                                    arrayList7.add(((SPayHelpers) it5.next()).getTag());
                                                }
                                                if (arrayList7.contains(bannerData2.getType())) {
                                                    arrayList6.add(obj5);
                                                }
                                            }
                                            ArrayList arrayList8 = new ArrayList();
                                            for (Object obj6 : arrayList6) {
                                                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ListOfCardsResponseBody.PromoInfo.BannerData) obj6).getType(), SPayHelpers.DEBIT_CARD.getTag())) {
                                                    arrayList8.add(obj6);
                                                }
                                            }
                                            q3Var = new w5(arrayList8);
                                        }
                                    }
                                } else {
                                    if (paymentToolInfo == null || (toolList3 = paymentToolInfo.getToolList()) == null) {
                                        lValueOf2 = null;
                                    } else {
                                        Iterator<T> it6 = toolList3.iterator();
                                        if (!it6.hasNext()) {
                                            throw new NoSuchElementException();
                                        }
                                        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData3 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) it6.next()).getAmountData();
                                        Long lValueOf6 = amountData3 != null ? Long.valueOf(amountData3.getAmount()) : null;
                                        lValueOf2 = Long.valueOf(lValueOf6 != null ? lValueOf6.longValue() : 0L);
                                        while (it6.hasNext()) {
                                            ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData4 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) it6.next()).getAmountData();
                                            Long lValueOf7 = amountData4 != null ? Long.valueOf(amountData4.getAmount()) : null;
                                            Long lValueOf8 = Long.valueOf(lValueOf7 != null ? lValueOf7.longValue() : 0L);
                                            if (lValueOf2.compareTo(lValueOf8) < 0) {
                                                lValueOf2 = lValueOf8;
                                            }
                                        }
                                    }
                                    if ((lValueOf2 != null ? lValueOf2.longValue() : 0L) >= zaVar.wkgbmnqykc() || ((auzgnhcxok) zaVar.f59556zoijcleaow).f55849esjtqupxsv.contains(SPayHelpers.SBP) || ((auzgnhcxok) zaVar.f59556zoijcleaow).f55849esjtqupxsv.contains(SPayHelpers.CREDIT_CARD) || ((auzgnhcxok) zaVar.f59556zoijcleaow).f55849esjtqupxsv.contains(SPayHelpers.BNPL)) {
                                        if (paymentToolInfo != null) {
                                            toolList = paymentToolInfo.getToolList();
                                        } else {
                                            toolList = null;
                                        }
                                        if (toolList != null) {
                                            q3Var = m1.f57569iobyxmoadg;
                                        } else {
                                            q3Var = m1.f57569iobyxmoadg;
                                        }
                                    } else {
                                        p8 block4 = p8.f58053zdlpuopuiu;
                                        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block4, "block");
                                        q3Var = u4.f58768iobyxmoadg;
                                    }
                                }
                            }
                        }
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(q3Var, m1.f57569iobyxmoadg)) {
                            lnVarPpxfxbqfkf = oeVar.ppxfxbqfkf(qfVar, orderScreenOutcome, pkzmftpjixVar);
                        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(q3Var, o2.f57880iobyxmoadg)) {
                            lnVarPpxfxbqfkf = new ln(new l00(jf.f57187iobyxmoadg), 6);
                        } else if (q3Var instanceof q3) {
                            lnVarPpxfxbqfkf = new ln(new l00(new ng(q3Var.iobyxmoadg())), 6);
                        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(q3Var, u4.f58768iobyxmoadg)) {
                            lnVarPpxfxbqfkf = new ln(new l00(ph.f58085iobyxmoadg), 2);
                        } else {
                            if (!(q3Var instanceof w5)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lnVarPpxfxbqfkf = new ln(new l00(new ti(q3Var.iobyxmoadg())), 6);
                        }
                    }
                }
                i13 = 1;
            }
            daVar.f56246yggfygwlhe = i13;
            Object objEmit = nufgyqmvbuVar.emit(lnVarPpxfxbqfkf, daVar);
            Object obj7 = objGxszxtbevo;
            if (objEmit == obj7) {
                return obj7;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj2);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
