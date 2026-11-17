package modern.payments.ecomAndroid.presentation.fragment.paymentMode;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBody;
import modern.payments.ecomAndroid.presentation.Action;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeItem;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeNewCardItem;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;", "sessionIdResponse", "Lmodern/payments/ecomAndroid/data/api/ContentResponse$Success;", "Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel$paymentMethods$1", f = "EcomPaymentModeViewModel.kt", l = {}, m = "invokeSuspend")
final class EcomPaymentModeViewModel$paymentMethods$1 extends draadjrbmk implements rgvfuqvkyq {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EcomPaymentModeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcomPaymentModeViewModel$paymentMethods$1(EcomPaymentModeViewModel ecomPaymentModeViewModel, lg.gxszxtbevo<? super EcomPaymentModeViewModel$paymentMethods$1> gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.this$0 = ecomPaymentModeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
        EcomPaymentModeViewModel$paymentMethods$1 ecomPaymentModeViewModel$paymentMethods$1 = new EcomPaymentModeViewModel$paymentMethods$1(this.this$0, gxszxtbevoVar);
        ecomPaymentModeViewModel$paymentMethods$1.L$0 = obj;
        return ecomPaymentModeViewModel$paymentMethods$1;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        zoijcleaow.gxszxtbevo();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zdlpuopuiu.zoijcleaow(obj);
        List listCollectPaymentMethods = this.this$0.collectPaymentMethods((SessionIdResponseBody) ((ContentResponse.Success) this.L$0).getData());
        if (listCollectPaymentMethods.isEmpty()) {
            this.this$0.reducer.invoke(new Action.HandleException(new State.Error.DefaultException.WhilePayment(new ErrorEntity.EcomSdkError.NoPaymentMethodsAvailable("No payment methods : " + listCollectPaymentMethods.size()), false, 2, null)));
        } else {
            if (listCollectPaymentMethods.size() != 1 || !listCollectPaymentMethods.contains(PayModeNewCardItem.INSTANCE)) {
                return listCollectPaymentMethods;
            }
            this.this$0.reducer.invoke(Action.HandleAddNewCard.INSTANCE);
        }
        return null;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(ContentResponse.Success<SessionIdResponseBody> success, lg.gxszxtbevo<? super List<? extends PayModeItem>> gxszxtbevoVar) {
        return ((EcomPaymentModeViewModel$paymentMethods$1) create(success, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
