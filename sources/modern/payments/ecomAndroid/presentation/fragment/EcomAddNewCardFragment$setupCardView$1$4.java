package modern.payments.ecomAndroid.presentation.fragment;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomAddNewCardAnalytic;
import modern.payments.ecomAndroid.presentation.viewModel.AddNewCardFragmentEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lgg/wwaezpbzkn;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class EcomAddNewCardFragment$setupCardView$1$4 extends jyumaefscl implements tg.draadjrbmk {
    final /* synthetic */ EcomAddNewCardFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcomAddNewCardFragment$setupCardView$1$4(EcomAddNewCardFragment ecomAddNewCardFragment) {
        super(1);
        this.this$0 = ecomAddNewCardFragment;
    }

    @Override // tg.draadjrbmk
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void invoke(String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        EcomAddNewCardFragment.access$getViewModel(this.this$0).handleEvent((AddNewCardFragmentEvent) new AddNewCardFragmentEvent.OnCVVModifiedEvent(it));
        EcomAddNewCardFragment.access$getViewModel(this.this$0).handleAnalyticalEvent(EcomAddNewCardAnalytic.OnCvcClick.INSTANCE);
    }
}
