package modern.payments.ecomAndroid.presentation.fragment.paymentMode.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeBindingCardItem;
import modern.payments.ecomAndroid.util.CoilImpl;
import modern.payments.ecomAndroid.util.extension.ViewExtensionsKt;
import modern.payments.p003ecomandroid.R;
import modern.payments.p003ecomandroid.databinding.EcomRvItemPayModeBindingCardBinding;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u000f*\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/adapter/PayModeBindingCardAdapter;", "Lmodern/payments/ecomAndroid/presentation/base/ViewBindingDelegateAdapter;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeBindingCardItem;", "Lmodern/payments/ecomandroid/databinding/EcomRvItemPayModeBindingCardBinding;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "uiPreferencesRepository", "Lkotlin/Function1;", "Lgg/wwaezpbzkn;", "itemClickAction", "deleteAction", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;Ltg/draadjrbmk;Ltg/draadjrbmk;)V", "item", "onBind", "(Lmodern/payments/ecomandroid/databinding/EcomRvItemPayModeBindingCardBinding;Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeBindingCardItem;)V", "", "", "isForViewType", "(Ljava/lang/Object;)Z", "getItemId", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeBindingCardItem;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "Ltg/draadjrbmk;", "Lmodern/payments/ecomAndroid/util/CoilImpl;", "coilImpl", "Lmodern/payments/ecomAndroid/util/CoilImpl;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PayModeBindingCardAdapter extends ViewBindingDelegateAdapter<PayModeBindingCardItem, EcomRvItemPayModeBindingCardBinding> {
    private final CoilImpl coilImpl;
    private final draadjrbmk deleteAction;
    private final draadjrbmk itemClickAction;
    private final UIPreferencesRepository uiPreferencesRepository;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentMode.adapter.PayModeBindingCardAdapter$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends vdvldrhtss implements tg.vdvldrhtss {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(3, EcomRvItemPayModeBindingCardBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lmodern/payments/ecomandroid/databinding/EcomRvItemPayModeBindingCardBinding;", 0);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        public final EcomRvItemPayModeBindingCardBinding invoke(LayoutInflater p13, ViewGroup viewGroup, boolean z13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return EcomRvItemPayModeBindingCardBinding.inflate(p13, viewGroup, z13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayModeBindingCardAdapter(UIPreferencesRepository uiPreferencesRepository, draadjrbmk itemClickAction, draadjrbmk deleteAction) {
        super(AnonymousClass1.INSTANCE);
        zdlpuopuiu.btonecajqb(uiPreferencesRepository, "uiPreferencesRepository");
        zdlpuopuiu.btonecajqb(itemClickAction, "itemClickAction");
        zdlpuopuiu.btonecajqb(deleteAction, "deleteAction");
        this.uiPreferencesRepository = uiPreferencesRepository;
        this.itemClickAction = itemClickAction;
        this.deleteAction = deleteAction;
        PaymentFlowSubcomponent paymentFlowSubcomponent$ecomAndroid_release = EcomSdk.INSTANCE.getPaymentFlowSubcomponent$ecomAndroid_release();
        this.coilImpl = paymentFlowSubcomponent$ecomAndroid_release != null ? paymentFlowSubcomponent$ecomAndroid_release.getCoil() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBind$lambda$0(PayModeBindingCardAdapter this$0, PayModeBindingCardItem item, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(item, "$item");
        this$0.itemClickAction.invoke(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBind$lambda$1(PayModeBindingCardAdapter this$0, PayModeBindingCardItem item, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(item, "$item");
        this$0.deleteAction.invoke(item);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public boolean isForViewType(Object item) {
        zdlpuopuiu.btonecajqb(item, "item");
        return item instanceof PayModeBindingCardItem;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public Object getItemId(PayModeBindingCardItem payModeBindingCardItem) {
        zdlpuopuiu.btonecajqb(payModeBindingCardItem, "<this>");
        return Integer.valueOf(payModeBindingCardItem.hashCode());
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public void onBind(EcomRvItemPayModeBindingCardBinding ecomRvItemPayModeBindingCardBinding, final PayModeBindingCardItem item) {
        zdlpuopuiu.btonecajqb(ecomRvItemPayModeBindingCardBinding, "<this>");
        zdlpuopuiu.btonecajqb(item, "item");
        ecomRvItemPayModeBindingCardBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentMode.adapter.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayModeBindingCardAdapter.onBind$lambda$0(this.f67682zdlpuopuiu, item, view);
            }
        });
        ecomRvItemPayModeBindingCardBinding.ecomEripmbcAcivDeleteIcon.setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentMode.adapter.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayModeBindingCardAdapter.onBind$lambda$1(this.f67688zdlpuopuiu, item, view);
            }
        });
        ecomRvItemPayModeBindingCardBinding.ecomEripmbcActvModeTitle.setText(ecomRvItemPayModeBindingCardBinding.getRoot().getContext().getString(R.string.ecom_card_number_pattern, item.getMaskedPan()));
        TextView ecomEripmbcActvModeTitle = ecomRvItemPayModeBindingCardBinding.ecomEripmbcActvModeTitle;
        zdlpuopuiu.dxjokdxxww(ecomEripmbcActvModeTitle, "ecomEripmbcActvModeTitle");
        ViewExtensionsKt.setFontParams$default(ecomEripmbcActvModeTitle, this.uiPreferencesRepository.getUIFontParams(UIPreferencesRepository.Font.BODY), null, 2, null);
        CoilImpl coilImpl = this.coilImpl;
        if (coilImpl != null) {
            String logoUrl = item.getLogoUrl();
            ImageView ecomEripmbcAcivModeHint = ecomRvItemPayModeBindingCardBinding.ecomEripmbcAcivModeHint;
            zdlpuopuiu.dxjokdxxww(ecomEripmbcAcivModeHint, "ecomEripmbcAcivModeHint");
            CoilImpl.loadImage$default(coilImpl, logoUrl, ecomEripmbcAcivModeHint, null, 4, null);
        }
    }
}
