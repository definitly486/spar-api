package kk;

import java.util.List;
import spay.sdk.domain.model.response.OrderScreenDataResponse;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.bnpl.BnplPayment;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;

/* JADX INFO: loaded from: classes3.dex */
public final class s50 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ jlmebxxoox f58518yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f58519zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s50(jlmebxxoox jlmebxxooxVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f58518yggfygwlhe = jlmebxxooxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        s50 s50Var = new s50(this.f58518yggfygwlhe, gxszxtbevoVar);
        s50Var.f58519zdlpuopuiu = obj;
        return s50Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        s50 s50Var = new s50(this.f58518yggfygwlhe, (lg.gxszxtbevo) obj2);
        s50Var.f58519zdlpuopuiu = (OrderScreenDataResponse) obj;
        return s50Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        GraphBnpl graphBnpl;
        List<BnplPayment> payments;
        BnplPayment bnplPayment;
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) this.f58519zdlpuopuiu;
        Long lEablkybsjg = null;
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = orderScreenDataResponse != null ? orderScreenDataResponse.getPaymentPlanBnplResponseBody() : null;
        jlmebxxoox jlmebxxooxVar = this.f58518yggfygwlhe;
        if (paymentPlanBnplResponseBody != null && (graphBnpl = paymentPlanBnplResponseBody.getGraphBnpl()) != null && (payments = graphBnpl.getPayments()) != null && (bnplPayment = (BnplPayment) hg.jyumaefscl.weqkydbzbr(payments)) != null) {
            lEablkybsjg = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(bnplPayment.getAmount());
        }
        ((auzgnhcxok) jlmebxxooxVar).f55842agtfadlqog.setValue(lEablkybsjg);
        return paymentPlanBnplResponseBody;
    }
}
