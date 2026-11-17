package modern.payments.ecomAndroid.domain.helper.impl;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.api.PaymentResult;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lspay/sdk/api/PaymentResult;", "paymentResult", "Lgg/wwaezpbzkn;", "invoke", "(Lspay/sdk/api/PaymentResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class SPayFlowHelperImpl$pay$1$config$1$1$payRequest$1 extends jyumaefscl implements draadjrbmk {
    final /* synthetic */ draadjrbmk $callback;
    final /* synthetic */ SPayFlowHelperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SPayFlowHelperImpl$pay$1$config$1$1$payRequest$1(SPayFlowHelperImpl sPayFlowHelperImpl, draadjrbmk draadjrbmkVar) {
        super(1);
        this.this$0 = sPayFlowHelperImpl;
        this.$callback = draadjrbmkVar;
    }

    @Override // tg.draadjrbmk
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PaymentResult) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void invoke(PaymentResult paymentResult) {
        zdlpuopuiu.btonecajqb(paymentResult, "paymentResult");
        this.$callback.invoke(this.this$0.processSPaymentResult(paymentResult));
    }
}
