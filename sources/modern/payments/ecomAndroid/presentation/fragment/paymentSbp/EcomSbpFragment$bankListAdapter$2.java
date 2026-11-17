package modern.payments.ecomAndroid.presentation.fragment.paymentSbp;

import android.content.Context;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.model.response.EcomSbpConfig;
import modern.payments.ecomAndroid.presentation.base.CompositeDelegateAdapter;
import modern.payments.ecomAndroid.presentation.fragment.paymentSbp.adapter.SbpBankListAdapter;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lmodern/payments/ecomAndroid/presentation/base/CompositeDelegateAdapter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class EcomSbpFragment$bankListAdapter$2 extends jyumaefscl implements tg.iobyxmoadg {
    final /* synthetic */ EcomSbpFragment this$0;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpFragment$bankListAdapter$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;", "it", "Lgg/wwaezpbzkn;", "invoke", "(Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class AnonymousClass1 extends jyumaefscl implements draadjrbmk {
        final /* synthetic */ EcomSbpFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(EcomSbpFragment ecomSbpFragment) {
            super(1);
            this.this$0 = ecomSbpFragment;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((EcomSbpConfig.SbpBankInfo) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void invoke(EcomSbpConfig.SbpBankInfo it) {
            zdlpuopuiu.btonecajqb(it, "it");
            EcomSbpViewModel ecomSbpViewModelAccess$getViewModel = EcomSbpFragment.access$getViewModel(this.this$0);
            Context contextRequireContext = this.this$0.requireContext();
            zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
            ecomSbpViewModelAccess$getViewModel.handleEvent((SbpScreenEvent) new SbpScreenEvent.BankItemClickEvent(it, contextRequireContext));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcomSbpFragment$bankListAdapter$2(EcomSbpFragment ecomSbpFragment) {
        super(0);
        this.this$0 = ecomSbpFragment;
    }

    @Override // tg.iobyxmoadg
    public final CompositeDelegateAdapter invoke() {
        return new CompositeDelegateAdapter(new SbpBankListAdapter(this.this$0.getUiPreferencesRepository(), new AnonymousClass1(this.this$0)));
    }
}
