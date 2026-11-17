package kk;

import spay.sdk.api.PaymentResult;
import spay.sdk.api.model.SPaymentRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class od0 extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ spay.sdk.c f57929yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ SPaymentRequest f57930zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od0(SPaymentRequest sPaymentRequest, spay.sdk.c cVar) {
        super(1);
        this.f57930zdlpuopuiu = sPaymentRequest;
        this.f57929yggfygwlhe = cVar;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        PaymentResult paymentResult = (PaymentResult) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentResult, "paymentResult");
        this.f57930zdlpuopuiu.getCallback().invoke(paymentResult);
        bt btVar = this.f57929yggfygwlhe.f107845e;
        if (btVar != null) {
            btVar.iobyxmoadg(new ow(df0.MACPay, null, mp.MAC, null, null, null, null, 122));
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
