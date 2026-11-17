package kk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import spay.sdk.domain.model.BnplMethod;
import spay.sdk.domain.model.OrderScreenOutcome;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;
import spay.sdk.domain.model.response.OrderScreenDataResponse;
import spay.sdk.domain.model.response.bnpl.BnplPayment;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class oe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final jlmebxxoox f57931eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final xf f57932gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final u f57933iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final za f57934lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final ka f57935nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final xk f57936ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final y50 f57937wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final cd f57938zoijcleaow;

    public oe(u getListOfCardsUseCase, cd getPaymentAccountsUseCase, xk getPaymentPlanBnplUseCase, y50 getSbasiboBonusesUseCase, jlmebxxoox sPayDataContract, xf sPayStorage, za helperManager, ka sPaySdkMerchantOptionsRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getListOfCardsUseCase, "getListOfCardsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPaymentAccountsUseCase, "getPaymentAccountsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPaymentPlanBnplUseCase, "getPaymentPlanBnplUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getSbasiboBonusesUseCase, "getSbasiboBonusesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(helperManager, "helperManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        this.f57933iobyxmoadg = getListOfCardsUseCase;
        this.f57938zoijcleaow = getPaymentAccountsUseCase;
        this.f57936ppxfxbqfkf = getPaymentPlanBnplUseCase;
        this.f57937wkgbmnqykc = getSbasiboBonusesUseCase;
        this.f57931eablkybsjg = sPayDataContract;
        this.f57932gxszxtbevo = sPayStorage;
        this.f57934lqeggnwhkg = helperManager;
        this.f57935nufgyqmvbu = sPaySdkMerchantOptionsRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object iobyxmoadg(oe oeVar, String str, PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        h2 h2Var;
        if (wkgbmnqykcVar instanceof h2) {
            h2Var = (h2) wkgbmnqykcVar;
            int i13 = h2Var.f56817iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                h2Var.f56817iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                h2Var = new h2(oeVar, wkgbmnqykcVar);
            }
        } else {
            h2Var = new h2(oeVar, wkgbmnqykcVar);
        }
        Object objWwaezpbzkn = h2Var.f56819yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = h2Var.f56817iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWwaezpbzkn);
            PayStrategy payStrategyBtonecajqb = ((auzgnhcxok) oeVar.f57931eablkybsjg).btonecajqb();
            BnplMethod bnplMethod = payStrategyBtonecajqb instanceof BnplMethod ? (BnplMethod) payStrategyBtonecajqb : null;
            if (!(bnplMethod instanceof BnplMethod.SixPartPayment ? true : bnplMethod instanceof BnplMethod.FourPartPayment)) {
                return null;
            }
            if (paymentBnplPlanRequestBody != null) {
                xk xkVar = oeVar.f57936ppxfxbqfkf;
                am amVar = new am(str, paymentBnplPlanRequestBody);
                h2Var.f56820zdlpuopuiu = oeVar;
                h2Var.f56817iwizpuwonk = 1;
                pj.ikoacuggdj.zoijcleaow();
                xkVar.getClass();
                objWwaezpbzkn = sj.dxjokdxxww.wwaezpbzkn(new vj(xkVar, amVar, null));
                if (objWwaezpbzkn == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            oeVar.getClass();
            return sj.dxjokdxxww.wwaezpbzkn(new f1(null));
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oeVar = h2Var.f56820zdlpuopuiu;
        gg.zdlpuopuiu.zoijcleaow(objWwaezpbzkn);
        sj.lqeggnwhkg lqeggnwhkgVar = (sj.lqeggnwhkg) objWwaezpbzkn;
        if (lqeggnwhkgVar != null) {
            return lqeggnwhkgVar;
        }
        oeVar.getClass();
        return sj.dxjokdxxww.wwaezpbzkn(new f1(null));
    }

    public final ln ppxfxbqfkf(qf qfVar, OrderScreenOutcome orderScreenOutcome, pj.pkzmftpjix pkzmftpjixVar) {
        OrderScreenDataResponse orderScreenDataResponse;
        ArrayList arrayList;
        BnplPayment bnplPayment;
        if ((orderScreenOutcome.getListCardsOutcome() instanceof w20) && (orderScreenOutcome.getSpasiboOutcome() instanceof md)) {
            OrderScreenDataResponse orderScreenDataResponse2 = new OrderScreenDataResponse(((w20) orderScreenOutcome.getListCardsOutcome()).f59085iobyxmoadg, null, ((md) orderScreenOutcome.getSpasiboOutcome()).f57632iobyxmoadg, false, 8, null);
            wkgbmnqykc((w20) orderScreenOutcome.getListCardsOutcome());
            ((auzgnhcxok) this.f57931eablkybsjg).gxszxtbevo(orderScreenDataResponse2);
            return ln.iobyxmoadg(((ij) this.f57932gxszxtbevo).iobyxmoadg(), new le0(ek.f56434iobyxmoadg, null, false, 6), null, false, 6);
        }
        if (!(orderScreenOutcome.getListCardsOutcome() instanceof w20) || !(orderScreenOutcome.getBnplOutcome() instanceof up)) {
            if (orderScreenOutcome.isLoading()) {
                return ln.iobyxmoadg(((ij) this.f57932gxszxtbevo).iobyxmoadg(), orderScreenOutcome.getListCardsOutcome(), null, false, 6);
            }
            if (orderScreenOutcome.isNetworkError()) {
                return ln.iobyxmoadg(((ij) this.f57932gxszxtbevo).iobyxmoadg(), new g60(new n4(this, qfVar, pkzmftpjixVar, null)), null, true, 2);
            }
            if (!(orderScreenOutcome.getListCardsOutcome() instanceof w20)) {
                return ln.iobyxmoadg(((ij) this.f57932gxszxtbevo).iobyxmoadg(), orderScreenOutcome.getListCardsOutcome(), null, true, 2);
            }
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("UNKNOWN BNPL ERROR").zoijcleaow(String.valueOf(orderScreenOutcome.getBnplOutcome()), new Object[0]);
            PayStrategy payStrategyBtonecajqb = ((auzgnhcxok) this.f57931eablkybsjg).btonecajqb();
            PayStrategy.PayWithPartsOnly payWithPartsOnly = PayStrategy.PayWithPartsOnly.INSTANCE;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(payStrategyBtonecajqb, payWithPartsOnly)) {
                return ln.iobyxmoadg(((ij) this.f57932gxszxtbevo).iobyxmoadg(), d50.f56229iobyxmoadg, null, true, 2);
            }
            wkgbmnqykc((w20) orderScreenOutcome.getListCardsOutcome());
            ((auzgnhcxok) this.f57931eablkybsjg).gxszxtbevo(new OrderScreenDataResponse(((w20) orderScreenOutcome.getListCardsOutcome()).f59085iobyxmoadg, null, null, false, 8, null));
            return ln.iobyxmoadg(((ij) this.f57932gxszxtbevo).iobyxmoadg(), kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((auzgnhcxok) this.f57931eablkybsjg).btonecajqb(), payWithPartsOnly) ? id0.f57031iobyxmoadg : new le0(ek.f56434iobyxmoadg, null, false, 6), null, false, 6);
        }
        if (((up) orderScreenOutcome.getBnplOutcome()).f58877iobyxmoadg.isBnplEnabled()) {
            List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList = ((w20) orderScreenOutcome.getListCardsOutcome()).f59085iobyxmoadg.getPaymentToolInfo().getToolList();
            GraphBnpl graphBnpl = ((up) orderScreenOutcome.getBnplOutcome()).f58877iobyxmoadg.getGraphBnpl();
            List<BnplPayment> payments = graphBnpl != null ? graphBnpl.getPayments() : null;
            if (toolList != null) {
                arrayList = new ArrayList();
                for (Object obj : toolList) {
                    ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj).getAmountData();
                    if (amountData != null) {
                        long amount = amountData.getAmount();
                        if (payments != null && (bnplPayment = payments.get(0)) != null && amount >= bnplPayment.getAmount()) {
                            arrayList.add(obj);
                        }
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || !(!arrayList.isEmpty())) {
                return ln.iobyxmoadg(((ij) this.f57932gxszxtbevo).iobyxmoadg(), j70.f57166iobyxmoadg, null, true, 2);
            }
            orderScreenDataResponse = new OrderScreenDataResponse(((w20) orderScreenOutcome.getListCardsOutcome()).f59085iobyxmoadg, ((up) orderScreenOutcome.getBnplOutcome()).f58877iobyxmoadg, null, false, 8, null);
        } else {
            orderScreenDataResponse = new OrderScreenDataResponse(((w20) orderScreenOutcome.getListCardsOutcome()).f59085iobyxmoadg, null, null, false, 8, null);
        }
        wkgbmnqykc((w20) orderScreenOutcome.getListCardsOutcome());
        ((auzgnhcxok) this.f57931eablkybsjg).gxszxtbevo(orderScreenDataResponse);
        return ln.iobyxmoadg(((ij) this.f57932gxszxtbevo).iobyxmoadg(), kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((auzgnhcxok) this.f57931eablkybsjg).btonecajqb(), PayStrategy.PayWithPartsOnly.INSTANCE) ? id0.f57031iobyxmoadg : new le0(ek.f56434iobyxmoadg, null, false, 6), null, false, 6);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    public final void wkgbmnqykc(w20 w20Var) {
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        Object next;
        Object next2;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        if (((ij) this.f57932gxszxtbevo).iobyxmoadg().f57487zoijcleaow != null || (toolList = w20Var.f59085iobyxmoadg.getPaymentToolInfo().getToolList()) == null || toolList.isEmpty()) {
            return;
        }
        ListOfCardsResponseBody.PaymentToolInfo.Tool incomeSelectedCard = ((ij) this.f57932gxszxtbevo).iobyxmoadg().f57487zoijcleaow;
        if (incomeSelectedCard == null) {
            Iterator<T> it = w20Var.f59085iobyxmoadg.getPaymentToolInfo().getToolList().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((ListOfCardsResponseBody.PaymentToolInfo.Tool) next).getPriorityCard());
            ListOfCardsResponseBody.PaymentToolInfo.Tool tool = (ListOfCardsResponseBody.PaymentToolInfo.Tool) next;
            if (tool == null || !tool.getPriorityCard()) {
                tool = null;
            } else {
                ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = tool.getAmountData();
                ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount = w20Var.f59085iobyxmoadg.getOrderInfo().getOrderAmount();
                if (amountData == null || orderAmount == null) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(amountData.getAmount() >= ((long) orderAmount.getAmount()));
                }
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(boolValueOf2, Boolean.TRUE)) {
                    tool = null;
                }
            }
            if (tool == null) {
                Iterator<T> it2 = w20Var.f59085iobyxmoadg.getPaymentToolInfo().getToolList().iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) next2).getAmountData();
                    ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount2 = w20Var.f59085iobyxmoadg.getOrderInfo().getOrderAmount();
                    if (amountData2 == null || orderAmount2 == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(amountData2.getAmount() >= ((long) orderAmount2.getAmount()));
                    }
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(boolValueOf, Boolean.TRUE));
                incomeSelectedCard = (ListOfCardsResponseBody.PaymentToolInfo.Tool) next2;
                if (incomeSelectedCard == null) {
                    incomeSelectedCard = w20Var.f59085iobyxmoadg.getPaymentToolInfo().getToolList().get(0);
                }
            } else {
                incomeSelectedCard = tool;
            }
        }
        ij ijVar = (ij) this.f57932gxszxtbevo;
        ijVar.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(incomeSelectedCard, "incomeSelectedCard");
        sj.zynmafqrjb zynmafqrjbVar = ijVar.f57055iobyxmoadg;
        zynmafqrjbVar.setValue(ln.iobyxmoadg((ln) zynmafqrjbVar.getValue(), null, incomeSelectedCard, false, 5));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e3, code lost:
    
        if (r1 == r5) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zoijcleaow(kk.qf r19, pj.pkzmftpjix r20, kotlin.coroutines.jvm.internal.wkgbmnqykc r21) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.oe.zoijcleaow(kk.qf, pj.pkzmftpjix, kotlin.coroutines.jvm.internal.wkgbmnqykc):java.lang.Object");
    }
}
