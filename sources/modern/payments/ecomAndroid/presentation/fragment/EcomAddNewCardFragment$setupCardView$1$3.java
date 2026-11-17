package modern.payments.ecomAndroid.presentation.fragment;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomAddNewCardAnalytic;
import modern.payments.ecomAndroid.presentation.viewModel.AddNewCardFragmentEvent;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "month", "year", "Lgg/wwaezpbzkn;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class EcomAddNewCardFragment$setupCardView$1$3 extends jyumaefscl implements rgvfuqvkyq {
    final /* synthetic */ EcomAddNewCardFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcomAddNewCardFragment$setupCardView$1$3(EcomAddNewCardFragment ecomAddNewCardFragment) {
        super(2);
        this.this$0 = ecomAddNewCardFragment;
    }

    @Override // tg.rgvfuqvkyq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void invoke(String month, String year) {
        zdlpuopuiu.btonecajqb(month, "month");
        zdlpuopuiu.btonecajqb(year, "year");
        EcomAddNewCardFragment.access$getViewModel(this.this$0).handleEvent((AddNewCardFragmentEvent) new AddNewCardFragmentEvent.OnDateModifiedEvent(month, year));
        EcomAddNewCardFragment.access$getViewModel(this.this$0).handleAnalyticalEvent(EcomAddNewCardAnalytic.OnExpiredDateFieldClick.INSTANCE);
    }
}
