package modern.payments.ecomAndroid.presentation.viewModel;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import mg.zoijcleaow;
import tg.oxmwwwfdhm;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u008a@"}, d2 = {"<anonymous>", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$ShortNumber;", "step", "Lmodern/payments/ecomAndroid/presentation/viewModel/CardInputMode;", "cardNumber", "", "modificationFinished", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$_errorCardNumber$2", f = "EcomAddNewCardViewModel.kt", l = {}, m = "invokeSuspend")
final class EcomAddNewCardViewModel$_errorCardNumber$2 extends draadjrbmk implements oxmwwwfdhm {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;

    EcomAddNewCardViewModel$_errorCardNumber$2(lg.gxszxtbevo<? super EcomAddNewCardViewModel$_errorCardNumber$2> gxszxtbevoVar) {
        super(4, gxszxtbevoVar);
    }

    @Override // tg.oxmwwwfdhm
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((CardInputMode) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (lg.gxszxtbevo<? super InputError.ShortNumber>) obj4);
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
        boolean z13 = this.Z$0;
        InputError.ShortNumber shortNumber = InputError.ShortNumber.INSTANCE;
        if (cardInputMode == CardInputMode.CARD_NUMBER && str.length() < 16 && z13) {
            return shortNumber;
        }
        return null;
    }

    public final Object invoke(CardInputMode cardInputMode, String str, boolean z13, lg.gxszxtbevo<? super InputError.ShortNumber> gxszxtbevoVar) {
        EcomAddNewCardViewModel$_errorCardNumber$2 ecomAddNewCardViewModel$_errorCardNumber$2 = new EcomAddNewCardViewModel$_errorCardNumber$2(gxszxtbevoVar);
        ecomAddNewCardViewModel$_errorCardNumber$2.L$0 = cardInputMode;
        ecomAddNewCardViewModel$_errorCardNumber$2.L$1 = str;
        ecomAddNewCardViewModel$_errorCardNumber$2.Z$0 = z13;
        return ecomAddNewCardViewModel$_errorCardNumber$2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
