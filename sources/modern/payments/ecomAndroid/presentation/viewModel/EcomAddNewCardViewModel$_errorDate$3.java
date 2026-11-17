package modern.payments.ecomAndroid.presentation.viewModel;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import mg.zoijcleaow;
import tg.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u008a@"}, d2 = {"<anonymous>", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError;", "step", "Lmodern/payments/ecomAndroid/presentation/viewModel/CardInputMode;", "month", "", "year", "modificationFinished", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$_errorDate$3", f = "EcomAddNewCardViewModel.kt", l = {}, m = "invokeSuspend")
final class EcomAddNewCardViewModel$_errorDate$3 extends draadjrbmk implements kcexrzcfyt {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ EcomAddNewCardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcomAddNewCardViewModel$_errorDate$3(EcomAddNewCardViewModel ecomAddNewCardViewModel, lg.gxszxtbevo<? super EcomAddNewCardViewModel$_errorDate$3> gxszxtbevoVar) {
        super(5, gxszxtbevoVar);
        this.this$0 = ecomAddNewCardViewModel;
    }

    @Override // tg.kcexrzcfyt
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return invoke((CardInputMode) obj, (String) obj2, (String) obj3, ((Boolean) obj4).booleanValue(), (lg.gxszxtbevo<? super InputError>) obj5);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        zoijcleaow.gxszxtbevo();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zdlpuopuiu.zoijcleaow(obj);
        CardInputMode cardInputMode = (CardInputMode) this.L$0;
        String str = (String) this.L$1;
        String str2 = (String) this.L$2;
        boolean z13 = this.Z$0;
        if (cardInputMode != CardInputMode.EXPIRED_DATE || !z13) {
            return null;
        }
        InputError errorOnMonth = this.this$0.getErrorOnMonth(str);
        return errorOnMonth == null ? this.this$0.getErrorOnYear(str2) : errorOnMonth;
    }

    public final Object invoke(CardInputMode cardInputMode, String str, String str2, boolean z13, lg.gxszxtbevo<? super InputError> gxszxtbevoVar) {
        EcomAddNewCardViewModel$_errorDate$3 ecomAddNewCardViewModel$_errorDate$3 = new EcomAddNewCardViewModel$_errorDate$3(this.this$0, gxszxtbevoVar);
        ecomAddNewCardViewModel$_errorDate$3.L$0 = cardInputMode;
        ecomAddNewCardViewModel$_errorDate$3.L$1 = str;
        ecomAddNewCardViewModel$_errorDate$3.L$2 = str2;
        ecomAddNewCardViewModel$_errorDate$3.Z$0 = z13;
        return ecomAddNewCardViewModel$_errorDate$3.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
