package kk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import spay.sdk.R;
import spay.sdk.api.SPayHelpers;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.bnpl.BnplPayment;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class za {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final sj.zynmafqrjb f59550eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final sj.zynmafqrjb f59551gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final wc0 f59552iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final sj.wypolnanlu f59553lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final xf f59554ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ka f59555wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final jlmebxxoox f59556zoijcleaow;

    public za(wc0 featuresHandler, jlmebxxoox sPayDataContract, xf sPayStorage, ka sPaySdkMerchantOptionsRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        this.f59552iobyxmoadg = featuresHandler;
        this.f59556zoijcleaow = sPayDataContract;
        this.f59554ppxfxbqfkf = sPayStorage;
        this.f59555wkgbmnqykc = sPaySdkMerchantOptionsRepository;
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) sPayDataContract;
        this.f59550eablkybsjg = auzgnhcxokVar.f55863oxmwwwfdhm;
        this.f59551gxszxtbevo = auzgnhcxokVar.f55867vdvldrhtss;
        this.f59553lqeggnwhkg = auzgnhcxokVar.f55872yggfygwlhe;
    }

    public final long eablkybsjg() {
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo2;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2;
        Object next;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData3;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = ((ij) this.f59554ppxfxbqfkf).iobyxmoadg().f57487zoijcleaow;
        if (tool2 != null && (amountData3 = tool2.getAmountData()) != null) {
            return amountData3.getAmount();
        }
        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) this.f59550eablkybsjg.getValue();
        Long lValueOf = null;
        if (listOfCardsResponseBody != null && (paymentToolInfo2 = listOfCardsResponseBody.getPaymentToolInfo()) != null && (toolList2 = paymentToolInfo2.getToolList()) != null) {
            Iterator<T> it = toolList2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((ListOfCardsResponseBody.PaymentToolInfo.Tool) next).getPriorityCard());
            ListOfCardsResponseBody.PaymentToolInfo.Tool tool3 = (ListOfCardsResponseBody.PaymentToolInfo.Tool) next;
            if (tool3 != null && (amountData2 = tool3.getAmountData()) != null) {
                return amountData2.getAmount();
            }
        }
        ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) this.f59550eablkybsjg.getValue();
        if (listOfCardsResponseBody2 != null && (paymentToolInfo = listOfCardsResponseBody2.getPaymentToolInfo()) != null && (toolList = paymentToolInfo.getToolList()) != null && (tool = toolList.get(0)) != null && (amountData = tool.getAmountData()) != null) {
            lValueOf = Long.valueOf(amountData.getAmount());
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    public final boolean gxszxtbevo() {
        if (wkgbmnqykc() == 0) {
            ListOfCardsResponseBody.MerchantInfo merchantInfo = (ListOfCardsResponseBody.MerchantInfo) this.f59553lqeggnwhkg.getValue();
            if (merchantInfo != null ? kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(merchantInfo.getBindingIsNeeded(), Boolean.TRUE) : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:115:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:116:0x0201  */
    /* JADX WARN: Code duplicated, block: B:118:0x0220  */
    /* JADX WARN: Code duplicated, block: B:124:0x0237  */
    /* JADX WARN: Code duplicated, block: B:133:0x0278  */
    /* JADX WARN: Code duplicated, block: B:135:0x027b  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x0111  */
    /* JADX WARN: Code duplicated, block: B:67:0x0114  */
    /* JADX WARN: Code duplicated, block: B:74:0x013c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0170  */
    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Code duplicated, block: B:89:0x0183  */
    public final List iobyxmoadg() {
        List listWflxmlrfwp;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ArrayList arrayList;
        ListOfCardsResponseBody.PromoInfo.BannerData bannerData;
        vu rtVar;
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.PromoInfo promoInfo;
        String text;
        String bindingSafeText;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        hl hlVar = ((ij) this.f59554ppxfxbqfkf).iobyxmoadg().f57485iobyxmoadg;
        boolean z18 = false;
        boolean z19 = (hlVar instanceof l00 ? (l00) hlVar : null) != null;
        hl hlVar2 = ((ij) this.f59554ppxfxbqfkf).iobyxmoadg().f57485iobyxmoadg;
        l00 l00Var = hlVar2 instanceof l00 ? (l00) hlVar2 : null;
        if (l00Var == null || (listWflxmlrfwp = l00Var.f57369iobyxmoadg.iobyxmoadg()) == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        if (!z19 && ppxfxbqfkf() && !zoijcleaow()) {
            linkedHashSet.add(new jo(1, zv.zoijcleaow(R.string.spay_helper_hint_not_enough_money)));
        } else if (z19 || eablkybsjg() == 0 || !ppxfxbqfkf() || !zoijcleaow()) {
            if (!z19 || eablkybsjg() == 0) {
                z13 = false;
            } else {
                ListOfCardsResponseBody.MerchantInfo merchantInfo = (ListOfCardsResponseBody.MerchantInfo) this.f59553lqeggnwhkg.getValue();
                if (merchantInfo != null ? kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(merchantInfo.getBindingIsNeeded(), Boolean.TRUE) : false) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
            if (z13) {
                ListOfCardsResponseBody.MerchantInfo merchantInfo2 = (ListOfCardsResponseBody.MerchantInfo) this.f59553lqeggnwhkg.getValue();
                bindingSafeText = merchantInfo2 != null ? merchantInfo2.getBindingSafeText() : null;
                if (bindingSafeText == null) {
                    bindingSafeText = "";
                }
                linkedHashSet.add(new jo(0, me.iobyxmoadg(bindingSafeText, "text", bindingSafeText)));
            } else {
                if (!z19 && ppxfxbqfkf() && !zoijcleaow() && ((auzgnhcxok) this.f59556zoijcleaow).f55849esjtqupxsv.contains(SPayHelpers.CREDIT_CARD) && ((auzgnhcxok) this.f59556zoijcleaow).f55849esjtqupxsv.contains(SPayHelpers.SBP)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    listOfCardsResponseBody = (ListOfCardsResponseBody) this.f59550eablkybsjg.getValue();
                    if (listOfCardsResponseBody != null && (promoInfo = listOfCardsResponseBody.getPromoInfo()) != null && (text = promoInfo.getHint()) != null) {
                        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
                        linkedHashSet.add(new jo(1, new rt(text)));
                    }
                } else {
                    if (z19 || eablkybsjg() == 0 || !ppxfxbqfkf() || zoijcleaow() || ((auzgnhcxok) this.f59556zoijcleaow).f55849esjtqupxsv.contains(SPayHelpers.CREDIT_CARD) || !((auzgnhcxok) this.f59556zoijcleaow).f55849esjtqupxsv.contains(SPayHelpers.SBP)) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (z15) {
                        linkedHashSet.add(new jo(2, zv.zoijcleaow(R.string.spay_helper_hint_not_enough_money_transfer)));
                    } else {
                        if (z19 || eablkybsjg() == 0 || !ppxfxbqfkf() || zoijcleaow() || !((auzgnhcxok) this.f59556zoijcleaow).f55849esjtqupxsv.contains(SPayHelpers.CREDIT_CARD) || ((auzgnhcxok) this.f59556zoijcleaow).f55849esjtqupxsv.contains(SPayHelpers.SBP)) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        if (z16) {
                            linkedHashSet.add(new jo(2, zv.zoijcleaow(R.string.spay_helper_hint_not_enough_money_credit_card)));
                        } else {
                            if (z19 || listWflxmlrfwp.size() != 1 || ((ListOfCardsResponseBody.PromoInfo.BannerData) hg.jyumaefscl.opjhrmiecq(listWflxmlrfwp)).getHint() == null) {
                                z17 = false;
                            } else {
                                z17 = true;
                            }
                            if (z17) {
                                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ListOfCardsResponseBody.PromoInfo.BannerData) hg.jyumaefscl.opjhrmiecq(listWflxmlrfwp)).getType(), SPayHelpers.BNPL.getTag())) {
                                    rtVar = zv.zoijcleaow(R.string.spay_bnpl_helper_text);
                                } else {
                                    String text2 = ((ListOfCardsResponseBody.PromoInfo.BannerData) hg.jyumaefscl.opjhrmiecq(listWflxmlrfwp)).getHint();
                                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(text2);
                                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text2, "text");
                                    rtVar = new rt(text2);
                                }
                                linkedHashSet.add(new jo(3, rtVar));
                            } else {
                                if (z19 && listWflxmlrfwp.size() > 1) {
                                    arrayList = new ArrayList();
                                    for (Object obj : listWflxmlrfwp) {
                                        bannerData = (ListOfCardsResponseBody.PromoInfo.BannerData) obj;
                                        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bannerData.getType(), SPayHelpers.BNPL.getTag()) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bannerData.getType(), SPayHelpers.CREDIT_CARD.getTag()) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bannerData.getType(), SPayHelpers.SBP.getTag())) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        z18 = true;
                                    }
                                }
                                if (z18) {
                                    linkedHashSet.add(new jo(3, zv.zoijcleaow(R.string.spay_all_helpers_text)));
                                }
                            }
                        }
                    }
                }
            }
        } else {
            wc0 wc0Var = this.f59552iobyxmoadg;
            uc0 uc0Var = uc0.BNPL;
            if (!zd0.iobyxmoadg(wc0Var, uc0Var, b6.BY_SYSTEM) || zd0.iobyxmoadg(this.f59552iobyxmoadg, uc0Var, b6.BY_USER)) {
                if (z19) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (z13) {
                    ListOfCardsResponseBody.MerchantInfo merchantInfo3 = (ListOfCardsResponseBody.MerchantInfo) this.f59553lqeggnwhkg.getValue();
                    if (merchantInfo3 != null) {
                    }
                    if (bindingSafeText == null) {
                        bindingSafeText = "";
                    }
                    linkedHashSet.add(new jo(0, me.iobyxmoadg(bindingSafeText, "text", bindingSafeText)));
                } else {
                    if (!z19) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        listOfCardsResponseBody = (ListOfCardsResponseBody) this.f59550eablkybsjg.getValue();
                        if (listOfCardsResponseBody != null) {
                            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
                            linkedHashSet.add(new jo(1, new rt(text)));
                        }
                    } else {
                        if (z19) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            linkedHashSet.add(new jo(2, zv.zoijcleaow(R.string.spay_helper_hint_not_enough_money_transfer)));
                        } else {
                            if (z19) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                linkedHashSet.add(new jo(2, zv.zoijcleaow(R.string.spay_helper_hint_not_enough_money_credit_card)));
                            } else {
                                if (z19) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ListOfCardsResponseBody.PromoInfo.BannerData) hg.jyumaefscl.opjhrmiecq(listWflxmlrfwp)).getType(), SPayHelpers.BNPL.getTag())) {
                                        rtVar = zv.zoijcleaow(R.string.spay_bnpl_helper_text);
                                    } else {
                                        String text3 = ((ListOfCardsResponseBody.PromoInfo.BannerData) hg.jyumaefscl.opjhrmiecq(listWflxmlrfwp)).getHint();
                                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(text3);
                                        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text3, "text");
                                        rtVar = new rt(text3);
                                    }
                                    linkedHashSet.add(new jo(3, rtVar));
                                } else {
                                    if (z19) {
                                        arrayList = new ArrayList();
                                        while (r3.hasNext()) {
                                            bannerData = (ListOfCardsResponseBody.PromoInfo.BannerData) obj;
                                            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bannerData.getType(), SPayHelpers.BNPL.getTag())) {
                                            }
                                            arrayList.add(obj);
                                        }
                                        if (arrayList.size() >= 2) {
                                            z18 = true;
                                        }
                                    }
                                    if (z18) {
                                        linkedHashSet.add(new jo(3, zv.zoijcleaow(R.string.spay_all_helpers_text)));
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                linkedHashSet.add(new jo(2, zv.zoijcleaow(R.string.spay_helper_hint_not_enough_money_but_enough_to_pay_BNPL)));
            }
        }
        return hg.jyumaefscl.d(linkedHashSet, new s9());
    }

    public final boolean ppxfxbqfkf() {
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) this.f59550eablkybsjg.getValue();
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList = (listOfCardsResponseBody == null || (paymentToolInfo = listOfCardsResponseBody.getPaymentToolInfo()) == null) ? null : paymentToolInfo.getToolList();
        return (toolList == null || toolList.isEmpty() || eablkybsjg() > wkgbmnqykc()) ? false : true;
    }

    public final long wkgbmnqykc() {
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) this.f59550eablkybsjg.getValue();
        Long lValueOf = (listOfCardsResponseBody == null || (orderInfo = listOfCardsResponseBody.getOrderInfo()) == null || (orderAmount = orderInfo.getOrderAmount()) == null) ? null : Long.valueOf(orderAmount.getAmount());
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    public final boolean zoijcleaow() {
        Long lValueOf;
        GraphBnpl graphBnpl;
        List<BnplPayment> payments;
        BnplPayment bnplPayment;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo2;
        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) this.f59550eablkybsjg.getValue();
        Long lValueOf2 = null;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2 = (listOfCardsResponseBody == null || (paymentToolInfo2 = listOfCardsResponseBody.getPaymentToolInfo()) == null) ? null : paymentToolInfo2.getToolList();
        if (toolList2 != null && !toolList2.isEmpty()) {
            ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) this.f59550eablkybsjg.getValue();
            if (listOfCardsResponseBody2 == null || (paymentToolInfo = listOfCardsResponseBody2.getPaymentToolInfo()) == null || (toolList = paymentToolInfo.getToolList()) == null) {
                lValueOf = null;
            } else {
                Iterator<T> it = toolList.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) it.next()).getAmountData();
                Long lValueOf3 = amountData != null ? Long.valueOf(amountData.getAmount()) : null;
                lValueOf = Long.valueOf(lValueOf3 != null ? lValueOf3.longValue() : 0L);
                while (it.hasNext()) {
                    ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) it.next()).getAmountData();
                    Long lValueOf4 = amountData2 != null ? Long.valueOf(amountData2.getAmount()) : null;
                    Long lValueOf5 = Long.valueOf(lValueOf4 != null ? lValueOf4.longValue() : 0L);
                    if (lValueOf.compareTo(lValueOf5) < 0) {
                        lValueOf = lValueOf5;
                    }
                }
            }
            long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
            PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) this.f59551gxszxtbevo.getValue();
            if (paymentPlanBnplResponseBody != null && (graphBnpl = paymentPlanBnplResponseBody.getGraphBnpl()) != null && (payments = graphBnpl.getPayments()) != null && (bnplPayment = payments.get(0)) != null) {
                lValueOf2 = Long.valueOf(bnplPayment.getAmount());
            }
            if (jLongValue >= (lValueOf2 != null ? lValueOf2.longValue() : 0L) && this.f59551gxszxtbevo.getValue() != null && zd0.iobyxmoadg(this.f59552iobyxmoadg, uc0.BNPL, b6.BY_SYSTEM)) {
                return true;
            }
        }
        return false;
    }
}
