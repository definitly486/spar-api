package modern.payments.ecomAndroid.presentation.viewModel;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import mg.zoijcleaow;
import tg.oxmwwwfdhm;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u008a@"}, d2 = {"<anonymous>", "", "errorCardNumber", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$ShortNumber;", "errorDate", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError;", "errorCVV", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$ShortCvv;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$_hasError$1", f = "EcomAddNewCardViewModel.kt", l = {}, m = "invokeSuspend")
final class EcomAddNewCardViewModel$_hasError$1 extends draadjrbmk implements oxmwwwfdhm {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    EcomAddNewCardViewModel$_hasError$1(lg.gxszxtbevo<? super EcomAddNewCardViewModel$_hasError$1> gxszxtbevoVar) {
        super(4, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        zoijcleaow.gxszxtbevo();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zdlpuopuiu.zoijcleaow(obj);
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg((((InputError.ShortNumber) this.L$0) == null && ((InputError) this.L$1) == null && ((InputError.ShortCvv) this.L$2) == null) ? false : true);
    }

    @Override // tg.oxmwwwfdhm
    public final Object invoke(InputError.ShortNumber shortNumber, InputError inputError, InputError.ShortCvv shortCvv, lg.gxszxtbevo<? super Boolean> gxszxtbevoVar) {
        EcomAddNewCardViewModel$_hasError$1 ecomAddNewCardViewModel$_hasError$1 = new EcomAddNewCardViewModel$_hasError$1(gxszxtbevoVar);
        ecomAddNewCardViewModel$_hasError$1.L$0 = shortNumber;
        ecomAddNewCardViewModel$_hasError$1.L$1 = inputError;
        ecomAddNewCardViewModel$_hasError$1.L$2 = shortCvv;
        return ecomAddNewCardViewModel$_hasError$1.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
