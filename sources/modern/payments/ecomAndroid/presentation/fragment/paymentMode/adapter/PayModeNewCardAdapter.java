package modern.payments.ecomAndroid.presentation.fragment.paymentMode.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeNewCardItem;
import modern.payments.ecomAndroid.util.extension.ViewExtensionsKt;
import modern.payments.p003ecomandroid.databinding.EcomRvItemPayModeNewCardBinding;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u000f*\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/adapter/PayModeNewCardAdapter;", "Lmodern/payments/ecomAndroid/presentation/base/ViewBindingDelegateAdapter;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeNewCardItem;", "Lmodern/payments/ecomandroid/databinding/EcomRvItemPayModeNewCardBinding;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "uiPreferencesRepository", "Lkotlin/Function1;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;", "Lgg/wwaezpbzkn;", "newCardItemClickActionListener", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;Ltg/draadjrbmk;)V", "item", "onBind", "(Lmodern/payments/ecomandroid/databinding/EcomRvItemPayModeNewCardBinding;Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeNewCardItem;)V", "", "", "isForViewType", "(Ljava/lang/Object;)Z", "getItemId", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeNewCardItem;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "Ltg/draadjrbmk;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PayModeNewCardAdapter extends ViewBindingDelegateAdapter<PayModeNewCardItem, EcomRvItemPayModeNewCardBinding> {
    private final draadjrbmk newCardItemClickActionListener;
    private final UIPreferencesRepository uiPreferencesRepository;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentMode.adapter.PayModeNewCardAdapter$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends vdvldrhtss implements tg.vdvldrhtss {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(3, EcomRvItemPayModeNewCardBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lmodern/payments/ecomandroid/databinding/EcomRvItemPayModeNewCardBinding;", 0);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        public final EcomRvItemPayModeNewCardBinding invoke(LayoutInflater p13, ViewGroup viewGroup, boolean z13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return EcomRvItemPayModeNewCardBinding.inflate(p13, viewGroup, z13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayModeNewCardAdapter(UIPreferencesRepository uiPreferencesRepository, draadjrbmk newCardItemClickActionListener) {
        super(AnonymousClass1.INSTANCE);
        zdlpuopuiu.btonecajqb(uiPreferencesRepository, "uiPreferencesRepository");
        zdlpuopuiu.btonecajqb(newCardItemClickActionListener, "newCardItemClickActionListener");
        this.uiPreferencesRepository = uiPreferencesRepository;
        this.newCardItemClickActionListener = newCardItemClickActionListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBind$lambda$0(PayModeNewCardAdapter this$0, PayModeNewCardItem item, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(item, "$item");
        this$0.newCardItemClickActionListener.invoke(item);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public boolean isForViewType(Object item) {
        zdlpuopuiu.btonecajqb(item, "item");
        return item instanceof PayModeNewCardItem;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public Object getItemId(PayModeNewCardItem payModeNewCardItem) {
        zdlpuopuiu.btonecajqb(payModeNewCardItem, "<this>");
        return Integer.valueOf(payModeNewCardItem.hashCode());
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public void onBind(EcomRvItemPayModeNewCardBinding ecomRvItemPayModeNewCardBinding, final PayModeNewCardItem item) {
        zdlpuopuiu.btonecajqb(ecomRvItemPayModeNewCardBinding, "<this>");
        zdlpuopuiu.btonecajqb(item, "item");
        ecomRvItemPayModeNewCardBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentMode.adapter.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayModeNewCardAdapter.onBind$lambda$0(this.f67684zdlpuopuiu, item, view);
            }
        });
        TextView ecomEripmncActvModeTitle = ecomRvItemPayModeNewCardBinding.ecomEripmncActvModeTitle;
        zdlpuopuiu.dxjokdxxww(ecomEripmncActvModeTitle, "ecomEripmncActvModeTitle");
        ViewExtensionsKt.setFontParams$default(ecomEripmncActvModeTitle, this.uiPreferencesRepository.getUIFontParams(UIPreferencesRepository.Font.BODY), null, 2, null);
    }
}
