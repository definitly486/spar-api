package modern.payments.ecomAndroid.presentation.fragment.paymentMode.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeSPayItem;
import modern.payments.ecomAndroid.util.extension.StringExtensionsKt;
import modern.payments.ecomAndroid.util.extension.ViewExtensionsKt;
import modern.payments.p003ecomandroid.databinding.EcomRvItemPayModeSpayBinding;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u000f*\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0018"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/adapter/PayModeSPayAdapter;", "Lmodern/payments/ecomAndroid/presentation/base/ViewBindingDelegateAdapter;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeSPayItem;", "Lmodern/payments/ecomandroid/databinding/EcomRvItemPayModeSpayBinding;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "uiPreferencesRepository", "Lkotlin/Function1;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;", "Lgg/wwaezpbzkn;", "payModeItemClickActionListener", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;Ltg/draadjrbmk;)V", "item", "onBind", "(Lmodern/payments/ecomandroid/databinding/EcomRvItemPayModeSpayBinding;Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeSPayItem;)V", "", "", "isForViewType", "(Ljava/lang/Object;)Z", "getItemId", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeSPayItem;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "Ltg/draadjrbmk;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PayModeSPayAdapter extends ViewBindingDelegateAdapter<PayModeSPayItem, EcomRvItemPayModeSpayBinding> {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String NAME = "U2JlclBheQ==";
    private final draadjrbmk payModeItemClickActionListener;
    private final UIPreferencesRepository uiPreferencesRepository;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentMode.adapter.PayModeSPayAdapter$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends vdvldrhtss implements tg.vdvldrhtss {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(3, EcomRvItemPayModeSpayBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lmodern/payments/ecomandroid/databinding/EcomRvItemPayModeSpayBinding;", 0);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        public final EcomRvItemPayModeSpayBinding invoke(LayoutInflater p13, ViewGroup viewGroup, boolean z13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return EcomRvItemPayModeSpayBinding.inflate(p13, viewGroup, z13);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/adapter/PayModeSPayAdapter$Companion;", "", "()V", "NAME", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayModeSPayAdapter(UIPreferencesRepository uiPreferencesRepository, draadjrbmk payModeItemClickActionListener) {
        super(AnonymousClass1.INSTANCE);
        zdlpuopuiu.btonecajqb(uiPreferencesRepository, "uiPreferencesRepository");
        zdlpuopuiu.btonecajqb(payModeItemClickActionListener, "payModeItemClickActionListener");
        this.uiPreferencesRepository = uiPreferencesRepository;
        this.payModeItemClickActionListener = payModeItemClickActionListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBind$lambda$0(PayModeSPayAdapter this$0, PayModeSPayItem item, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(item, "$item");
        this$0.payModeItemClickActionListener.invoke(item);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public boolean isForViewType(Object item) {
        zdlpuopuiu.btonecajqb(item, "item");
        return item instanceof PayModeSPayItem;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public Object getItemId(PayModeSPayItem payModeSPayItem) {
        zdlpuopuiu.btonecajqb(payModeSPayItem, "<this>");
        return Integer.valueOf(payModeSPayItem.hashCode());
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public void onBind(EcomRvItemPayModeSpayBinding ecomRvItemPayModeSpayBinding, final PayModeSPayItem item) {
        zdlpuopuiu.btonecajqb(ecomRvItemPayModeSpayBinding, "<this>");
        zdlpuopuiu.btonecajqb(item, "item");
        ecomRvItemPayModeSpayBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentMode.adapter.wkgbmnqykc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayModeSPayAdapter.onBind$lambda$0(this.f67686zdlpuopuiu, item, view);
            }
        });
        TextView textView = ecomRvItemPayModeSpayBinding.ecomEripmActvModeName;
        textView.setText(StringExtensionsKt.decodeBase64(NAME));
        zdlpuopuiu.lqeggnwhkg(textView);
        ViewExtensionsKt.setFontParams$default(textView, this.uiPreferencesRepository.getUIFontParams(UIPreferencesRepository.Font.BODY), null, 2, null);
        AppCompatTextView appCompatTextView = ecomRvItemPayModeSpayBinding.ecomEripmActvModeDescription;
        zdlpuopuiu.lqeggnwhkg(appCompatTextView);
        ViewExtensionsKt.setFontParams$default(appCompatTextView, this.uiPreferencesRepository.getUIFontParams(UIPreferencesRepository.Font.CAPTION), null, 2, null);
    }
}
