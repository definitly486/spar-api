package modern.payments.ecomAndroid.domain.reducer.impl;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
@gxszxtbevo(c = "modern.payments.ecomAndroid.domain.reducer.impl.ReducerImpl$handlePaymentOrder$1$1", f = "ReducerImpl.kt", l = {173}, m = "invokeSuspend")
final class ReducerImpl$handlePaymentOrder$1$1 extends draadjrbmk implements rgvfuqvkyq {
    int label;
    final /* synthetic */ ReducerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReducerImpl$handlePaymentOrder$1$1(ReducerImpl reducerImpl, lg.gxszxtbevo<? super ReducerImpl$handlePaymentOrder$1$1> gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.this$0 = reducerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
        return new ReducerImpl$handlePaymentOrder$1$1(this.this$0, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i13 = this.label;
        if (i13 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            MerchantAnalyticRepository merchantAnalyticRepository = this.this$0.merchantAnalyticRepository;
            this.label = 1;
            if (merchantAnalyticRepository.onPayment3DsStarted(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        return ((ReducerImpl$handlePaymentOrder$1$1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
