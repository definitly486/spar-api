package modern.payments.ecomAndroid.presentation.viewModel;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.util.event.Event;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lmodern/payments/ecomAndroid/util/event/Event;", "Lmodern/payments/ecomAndroid/domain/State;", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
@gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomBottomSheetViewModel$state$1", f = "EcomBottomSheetViewModel.kt", l = {}, m = "invokeSuspend")
final class EcomBottomSheetViewModel$state$1 extends draadjrbmk implements rgvfuqvkyq {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EcomBottomSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcomBottomSheetViewModel$state$1(EcomBottomSheetViewModel ecomBottomSheetViewModel, lg.gxszxtbevo<? super EcomBottomSheetViewModel$state$1> gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.this$0 = ecomBottomSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
        EcomBottomSheetViewModel$state$1 ecomBottomSheetViewModel$state$1 = new EcomBottomSheetViewModel$state$1(this.this$0, gxszxtbevoVar);
        ecomBottomSheetViewModel$state$1.L$0 = obj;
        return ecomBottomSheetViewModel$state$1;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        zoijcleaow.gxszxtbevo();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zdlpuopuiu.zoijcleaow(obj);
        Event event = (Event) this.L$0;
        if (!this.this$0.optionsRepository.isFeatureEnabled(Constants.FeatureName.RESULT_VIEW) && ((event.peek() instanceof State.Error) || (event.peek() instanceof State.PaymentResult))) {
            this.this$0.closeSdk();
        }
        return event;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Event<? extends State> event, lg.gxszxtbevo<? super Event<? extends State>> gxszxtbevoVar) {
        return ((EcomBottomSheetViewModel$state$1) create(event, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
