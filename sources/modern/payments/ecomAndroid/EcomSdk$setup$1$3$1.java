package modern.payments.ecomAndroid;

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
@gxszxtbevo(c = "modern.payments.ecomAndroid.EcomSdk$setup$1$3$1", f = "EcomSdk.kt", l = {112}, m = "invokeSuspend")
final class EcomSdk$setup$1$3$1 extends draadjrbmk implements rgvfuqvkyq {
    final /* synthetic */ Throwable $it;
    int label;
    final /* synthetic */ EcomSdk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcomSdk$setup$1$3$1(EcomSdk ecomSdk, Throwable th2, lg.gxszxtbevo<? super EcomSdk$setup$1$3$1> gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.this$0 = ecomSdk;
        this.$it = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
        return new EcomSdk$setup$1$3$1(this.this$0, this.$it, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i13 = this.label;
        if (i13 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            MerchantAnalyticRepository merchantAnalyticRepository$ecomAndroid_release = this.this$0.getMerchantAnalyticRepository$ecomAndroid_release();
            String str = "Failed " + this.$it.getMessage();
            this.label = 1;
            if (merchantAnalyticRepository$ecomAndroid_release.onSdkInitializationResult(str, this) == objGxszxtbevo) {
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
        return ((EcomSdk$setup$1$3$1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
