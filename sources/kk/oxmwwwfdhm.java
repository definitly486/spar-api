package kk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import npi.spay.Bn;
import spay.sdk.R;
import spay.sdk.domain.model.BnplMethod;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.SPaySdkConfig;
import spay.sdk.domain.model.response.bnpl.BnplPayment;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import spay.sdk.view.BnplButtonCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class oxmwwwfdhm implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ m60 f58008iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ jlmebxxoox f58009jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ lrnfpwlwnk f58010yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f58011zdlpuopuiu;

    public oxmwwwfdhm(sj.nufgyqmvbu nufgyqmvbuVar, lrnfpwlwnk lrnfpwlwnkVar, jlmebxxoox jlmebxxooxVar, m60 m60Var) {
        this.f58011zdlpuopuiu = nufgyqmvbuVar;
        this.f58010yggfygwlhe = lrnfpwlwnkVar;
        this.f58009jyumaefscl = jlmebxxooxVar;
        this.f58008iwizpuwonk = m60Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0375  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        zh0 zh0Var;
        sj.nufgyqmvbu nufgyqmvbuVar;
        zh0 zh0Var2;
        qe qeVar;
        kn knVar;
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        ListOfCardsResponseBody.OrderInfo orderInfo2;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount2;
        GraphBnpl graphBnpl;
        ms msVar;
        GraphBnpl graphBnpl2;
        ListOfCardsResponseBody.OrderInfo orderInfo3;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount3;
        if (gxszxtbevoVar instanceof zh0) {
            zh0Var = (zh0) gxszxtbevoVar;
            int i13 = zh0Var.f59586yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zh0Var.f59586yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                zh0Var = new zh0(this, gxszxtbevoVar);
            }
        } else {
            zh0Var = new zh0(this, gxszxtbevoVar);
        }
        Object obj2 = zh0Var.f59587zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zh0Var.f59586yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar2 = this.f58011zdlpuopuiu;
            PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) obj;
            ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) this.f58010yggfygwlhe.f57522wflxmlrfwp.getValue();
            String count = null;
            String currency = (listOfCardsResponseBody == null || (orderInfo3 = listOfCardsResponseBody.getOrderInfo()) == null || (orderAmount3 = orderInfo3.getOrderAmount()) == null) ? null : orderAmount3.getCurrency();
            if (currency == null) {
                currency = "";
            }
            long amount = 0;
            if (((paymentPlanBnplResponseBody == null || (graphBnpl2 = paymentPlanBnplResponseBody.getGraphBnpl()) == null) ? null : graphBnpl2.getCount()) == null || paymentPlanBnplResponseBody.getGraphBnpl().getPayments() == null || !zd0.iobyxmoadg(this.f58010yggfygwlhe.f57523wkgbmnqykc, uc0.BNPL, b6.BY_USER) || this.f58010yggfygwlhe.f57516nufgyqmvbu.gxszxtbevo()) {
                nufgyqmvbuVar = nufgyqmvbuVar2;
                zh0Var2 = zh0Var;
                if (paymentPlanBnplResponseBody != null && (graphBnpl = paymentPlanBnplResponseBody.getGraphBnpl()) != null) {
                    count = graphBnpl.getCount();
                }
                if (count == null || paymentPlanBnplResponseBody.getGraphBnpl().getPayments() == null || zd0.iobyxmoadg(this.f58010yggfygwlhe.f57523wkgbmnqykc, uc0.BNPL, b6.BY_USER) || this.f58010yggfygwlhe.f57516nufgyqmvbu.gxszxtbevo()) {
                    lrnfpwlwnk lrnfpwlwnkVar = this.f58010yggfygwlhe;
                    ow event = new ow(nd.LC_PAY_BNPL_UNAVAILABLE, we0.PAY_VIEW, mp.LC, null, null, null, null, 120);
                    lrnfpwlwnkVar.getClass();
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
                    lrnfpwlwnkVar.f56062iobyxmoadg.iobyxmoadg(event);
                    ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) this.f58010yggfygwlhe.f57522wflxmlrfwp.getValue();
                    long amount2 = (listOfCardsResponseBody2 == null || (orderInfo = listOfCardsResponseBody2.getOrderInfo()) == null || (orderAmount = orderInfo.getOrderAmount()) == null) ? 0L : orderAmount.getAmount();
                    ((auzgnhcxok) this.f58009jyumaefscl).f55842agtfadlqog.setValue(kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(amount2));
                    if (amount2 != 0) {
                        this.f58010yggfygwlhe.f57507esjtqupxsv.setValue(zv.zoijcleaow(R.string.spay_pay_text));
                        qeVar = new qe(qa0.ppxfxbqfkf(amount2, currency), amount2);
                    } else {
                        ListOfCardsResponseBody.MerchantInfo merchantInfo = (ListOfCardsResponseBody.MerchantInfo) ((auzgnhcxok) this.f58009jyumaefscl).f55872yggfygwlhe.getValue();
                        if (merchantInfo != null ? kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(merchantInfo.getBindingIsNeeded(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true)) : false) {
                            this.f58010yggfygwlhe.f57507esjtqupxsv.setValue(zv.zoijcleaow(R.string.spay_enable_text));
                            SPaySdkConfig sPaySdkConfig = ((s80) this.f58008iwizpuwonk).f58531ppxfxbqfkf;
                            if (sPaySdkConfig == null) {
                                throw Bn.f70538zdlpuopuiu;
                            }
                            String text = sPaySdkConfig.getLocalization().getEnableSPay();
                            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
                            qeVar = new qe(new rt(text), 0L);
                        } else {
                            this.f58010yggfygwlhe.f57507esjtqupxsv.setValue(zv.zoijcleaow(R.string.spay_pay_text));
                            qeVar = new qe(qa0.ppxfxbqfkf(amount2, currency), amount2);
                        }
                    }
                    this.f58010yggfygwlhe.f57519pmvmpeiblj.setValue(hg.jyumaefscl.eablkybsjg(qeVar));
                    lrnfpwlwnk.draadjrbmk(this.f58010yggfygwlhe, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
                    knVar = new kn(null, null, null, null, 23);
                } else {
                    lrnfpwlwnk lrnfpwlwnkVar2 = this.f58010yggfygwlhe;
                    ow event2 = new ow(nd.LC_PAY_BNPL_AVAILABLE, we0.PAY_VIEW, mp.LC, null, null, null, null, 120);
                    lrnfpwlwnkVar2.getClass();
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event2, "event");
                    lrnfpwlwnkVar2.f56062iobyxmoadg.iobyxmoadg(event2);
                    this.f58010yggfygwlhe.f57507esjtqupxsv.setValue(zv.zoijcleaow(R.string.spay_pay_text));
                    ListOfCardsResponseBody listOfCardsResponseBody3 = (ListOfCardsResponseBody) this.f58010yggfygwlhe.f57522wflxmlrfwp.getValue();
                    if (listOfCardsResponseBody3 != null && (orderInfo2 = listOfCardsResponseBody3.getOrderInfo()) != null && (orderAmount2 = orderInfo2.getOrderAmount()) != null) {
                        amount = orderAmount2.getAmount();
                    }
                    ((auzgnhcxok) this.f58009jyumaefscl).f55842agtfadlqog.setValue(kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(amount));
                    this.f58010yggfygwlhe.f57519pmvmpeiblj.setValue(hg.jyumaefscl.eablkybsjg(new qe(qa0.ppxfxbqfkf(amount, currency), amount)));
                    lrnfpwlwnk.draadjrbmk(this.f58010yggfygwlhe, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
                    knVar = new kn(null, null, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false), paymentPlanBnplResponseBody.getButtonBnpl(), 11);
                }
            } else {
                lrnfpwlwnk lrnfpwlwnkVar3 = this.f58010yggfygwlhe;
                ow event3 = new ow(nd.LC_PAY_BNPL_AVAILABLE, we0.PAY_VIEW, mp.LC, null, null, null, null, 120);
                lrnfpwlwnkVar3.getClass();
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event3, "event");
                lrnfpwlwnkVar3.f56062iobyxmoadg.iobyxmoadg(event3);
                this.f58010yggfygwlhe.f57507esjtqupxsv.setValue(zv.zoijcleaow(R.string.spay_pay_bnpl));
                ((auzgnhcxok) this.f58009jyumaefscl).f55842agtfadlqog.setValue(kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(paymentPlanBnplResponseBody.getGraphBnpl().getPayments().get(0).getAmount()));
                Iterator<T> it = paymentPlanBnplResponseBody.getGraphBnpl().getPayments().iterator();
                while (it.hasNext()) {
                    amount += ((BnplPayment) it.next()).getAmount();
                }
                String strZoijcleaow = qa0.zoijcleaow(amount);
                sj.zynmafqrjb zynmafqrjbVar = this.f58010yggfygwlhe.f57519pmvmpeiblj;
                List<BnplPayment> payments = paymentPlanBnplResponseBody.getGraphBnpl().getPayments();
                ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(payments, 10));
                Iterator it2 = payments.iterator();
                int i15 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        hg.jyumaefscl.iwizpuwonk();
                    }
                    BnplPayment bnplPayment = (BnplPayment) next;
                    sj.nufgyqmvbu nufgyqmvbuVar3 = nufgyqmvbuVar2;
                    zh0 zh0Var3 = zh0Var;
                    ms msVarPpxfxbqfkf = qa0.ppxfxbqfkf(bnplPayment.getAmount(), currency);
                    lrnfpwlwnk lrnfpwlwnkVar4 = this.f58010yggfygwlhe;
                    Iterator it3 = it2;
                    if ((((auzgnhcxok) lrnfpwlwnkVar4.f56063zoijcleaow).btonecajqb() instanceof BnplMethod.SixPartPayment) && i15 == 0) {
                        int i17 = ((auzgnhcxok) lrnfpwlwnkVar4.f56063zoijcleaow).f55855iwizpuwonk;
                        if (i17 != 0) {
                            int i18 = R.string.spay_currency_pattern_with_commission_from_total;
                            Object[] args = {strZoijcleaow, "₽", Integer.valueOf(i17 / 100), "₽"};
                            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
                            msVar = new ms(i18, hg.agtfadlqog.i(args));
                        } else {
                            int i19 = R.string.spay_currency_pattern_with_empty_commission_from_total;
                            Object[] args2 = {strZoijcleaow, "₽"};
                            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args2, "args");
                            msVar = new ms(i19, hg.agtfadlqog.i(args2));
                        }
                    } else {
                        int i23 = R.string.spay_currency_pattern_from_total;
                        Object[] args3 = {strZoijcleaow, "₽", bnplPayment.getDate()};
                        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args3, "args");
                        msVar = new ms(i23, hg.agtfadlqog.i(args3));
                    }
                    arrayList.add(new ppxfxbqfkf(msVarPpxfxbqfkf, msVar));
                    i15 = i16;
                    zh0Var = zh0Var3;
                    nufgyqmvbuVar2 = nufgyqmvbuVar3;
                    it2 = it3;
                }
                nufgyqmvbuVar = nufgyqmvbuVar2;
                zh0Var2 = zh0Var;
                zynmafqrjbVar.setValue(arrayList);
                lrnfpwlwnk lrnfpwlwnkVar5 = this.f58010yggfygwlhe;
                if (lrnfpwlwnkVar5.f57512jyumaefscl instanceof BnplMethod.SixPartPayment) {
                    BnplButtonCompositeView.f107848c = true;
                }
                lrnfpwlwnk.draadjrbmk(lrnfpwlwnkVar5, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
                knVar = new kn(String.valueOf(paymentPlanBnplResponseBody.getGraphBnpl().getPayments().size()), kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(paymentPlanBnplResponseBody.getGraphBnpl().getPayments().get(0).getAmount()), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true), paymentPlanBnplResponseBody.getButtonBnpl(), 8);
            }
            zh0 zh0Var4 = zh0Var2;
            zh0Var4.f59586yggfygwlhe = 1;
            if (nufgyqmvbuVar.emit(knVar, zh0Var4) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj2);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
