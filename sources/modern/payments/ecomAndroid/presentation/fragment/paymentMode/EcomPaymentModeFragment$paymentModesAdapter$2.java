package modern.payments.ecomAndroid.presentation.fragment.paymentMode;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.presentation.base.CompositeDelegateAdapter;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.adapter.PayModeBindingCardAdapter;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.adapter.PayModeNewCardAdapter;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.adapter.PayModeSPayAdapter;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.adapter.PayModeSbpAdapter;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeBindingCardItem;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeItem;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lmodern/payments/ecomAndroid/presentation/base/CompositeDelegateAdapter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class EcomPaymentModeFragment$paymentModesAdapter$2 extends jyumaefscl implements tg.iobyxmoadg {
    final /* synthetic */ EcomPaymentModeFragment this$0;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeFragment$paymentModesAdapter$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;", "it", "Lgg/wwaezpbzkn;", "invoke", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class AnonymousClass1 extends jyumaefscl implements draadjrbmk {
        final /* synthetic */ EcomPaymentModeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(EcomPaymentModeFragment ecomPaymentModeFragment) {
            super(1);
            this.this$0 = ecomPaymentModeFragment;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PayModeItem) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void invoke(PayModeItem it) {
            zdlpuopuiu.btonecajqb(it, "it");
            this.this$0.getViewModel().handleEvent((PaymentModeEvent) new PaymentModeEvent.ItemClickedEvent(it, this.this$0.requireActivity()));
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeFragment$paymentModesAdapter$2$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;", "it", "Lgg/wwaezpbzkn;", "invoke", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class AnonymousClass2 extends jyumaefscl implements draadjrbmk {
        final /* synthetic */ EcomPaymentModeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(EcomPaymentModeFragment ecomPaymentModeFragment) {
            super(1);
            this.this$0 = ecomPaymentModeFragment;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PayModeItem) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void invoke(PayModeItem it) {
            zdlpuopuiu.btonecajqb(it, "it");
            this.this$0.getViewModel().handleEvent((PaymentModeEvent) new PaymentModeEvent.ItemClickedEvent(it, null, 2, null));
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeFragment$paymentModesAdapter$2$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeBindingCardItem;", "it", "Lgg/wwaezpbzkn;", "invoke", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeBindingCardItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class AnonymousClass3 extends jyumaefscl implements draadjrbmk {
        final /* synthetic */ EcomPaymentModeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(EcomPaymentModeFragment ecomPaymentModeFragment) {
            super(1);
            this.this$0 = ecomPaymentModeFragment;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PayModeBindingCardItem) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void invoke(PayModeBindingCardItem it) {
            zdlpuopuiu.btonecajqb(it, "it");
            this.this$0.getViewModel().handleEvent((PaymentModeEvent) new PaymentModeEvent.ItemClickedEvent(it, null, 2, null));
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeFragment$paymentModesAdapter$2$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeBindingCardItem;", "it", "Lgg/wwaezpbzkn;", "invoke", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeBindingCardItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class AnonymousClass4 extends jyumaefscl implements draadjrbmk {
        final /* synthetic */ EcomPaymentModeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(EcomPaymentModeFragment ecomPaymentModeFragment) {
            super(1);
            this.this$0 = ecomPaymentModeFragment;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PayModeBindingCardItem) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void invoke(PayModeBindingCardItem it) {
            zdlpuopuiu.btonecajqb(it, "it");
            this.this$0.getViewModel().handleEvent((PaymentModeEvent) new PaymentModeEvent.DeleteBindingClickedEvent(it));
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeFragment$paymentModesAdapter$2$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;", "it", "Lgg/wwaezpbzkn;", "invoke", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class AnonymousClass5 extends jyumaefscl implements draadjrbmk {
        final /* synthetic */ EcomPaymentModeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(EcomPaymentModeFragment ecomPaymentModeFragment) {
            super(1);
            this.this$0 = ecomPaymentModeFragment;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PayModeItem) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void invoke(PayModeItem it) {
            zdlpuopuiu.btonecajqb(it, "it");
            this.this$0.getViewModel().handleEvent((PaymentModeEvent) new PaymentModeEvent.ItemClickedEvent(it, null, 2, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcomPaymentModeFragment$paymentModesAdapter$2(EcomPaymentModeFragment ecomPaymentModeFragment) {
        super(0);
        this.this$0 = ecomPaymentModeFragment;
    }

    @Override // tg.iobyxmoadg
    public final CompositeDelegateAdapter invoke() {
        return new CompositeDelegateAdapter(new PayModeSPayAdapter(this.this$0.getUiPreferencesRepository(), new AnonymousClass1(this.this$0)), new PayModeNewCardAdapter(this.this$0.getUiPreferencesRepository(), new AnonymousClass2(this.this$0)), new PayModeBindingCardAdapter(this.this$0.getUiPreferencesRepository(), new AnonymousClass3(this.this$0), new AnonymousClass4(this.this$0)), new PayModeSbpAdapter(this.this$0.getUiPreferencesRepository(), new AnonymousClass5(this.this$0)));
    }
}
