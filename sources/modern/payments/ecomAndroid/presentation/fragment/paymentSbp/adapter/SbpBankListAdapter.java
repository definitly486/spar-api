package modern.payments.ecomAndroid.presentation.fragment.paymentSbp.adapter;

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
import modern.payments.ecomAndroid.domain.model.response.EcomSbpConfig;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter;
import modern.payments.ecomAndroid.util.CoilImpl;
import modern.payments.ecomAndroid.util.extension.ImageViewExtensionsKt;
import modern.payments.ecomAndroid.util.extension.ViewExtensionsKt;
import modern.payments.p003ecomandroid.databinding.EcomRvItemSbpBankBinding;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/adapter/SbpBankListAdapter;", "Lmodern/payments/ecomAndroid/presentation/base/ViewBindingDelegateAdapter;", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;", "Lmodern/payments/ecomandroid/databinding/EcomRvItemSbpBankBinding;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "uiPreferencesRepository", "Lkotlin/Function1;", "Lgg/wwaezpbzkn;", "itemClickAction", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;Ltg/draadjrbmk;)V", "item", "onBind", "(Lmodern/payments/ecomandroid/databinding/EcomRvItemSbpBankBinding;Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;)V", "", "", "isForViewType", "(Ljava/lang/Object;)Z", "getItemId", "(Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;)Ljava/lang/Object;", "itemContent", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "Ltg/draadjrbmk;", "Lmodern/payments/ecomAndroid/util/CoilImpl;", "coilImpl", "Lmodern/payments/ecomAndroid/util/CoilImpl;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SbpBankListAdapter extends ViewBindingDelegateAdapter<EcomSbpConfig.SbpBankInfo, EcomRvItemSbpBankBinding> {
    private final CoilImpl coilImpl;
    private final draadjrbmk itemClickAction;
    private final UIPreferencesRepository uiPreferencesRepository;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.adapter.SbpBankListAdapter$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends vdvldrhtss implements tg.vdvldrhtss {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(3, EcomRvItemSbpBankBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lmodern/payments/ecomandroid/databinding/EcomRvItemSbpBankBinding;", 0);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        public final EcomRvItemSbpBankBinding invoke(LayoutInflater p13, ViewGroup viewGroup, boolean z13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return EcomRvItemSbpBankBinding.inflate(p13, viewGroup, z13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpBankListAdapter(UIPreferencesRepository uiPreferencesRepository, draadjrbmk itemClickAction) {
        super(AnonymousClass1.INSTANCE);
        zdlpuopuiu.btonecajqb(uiPreferencesRepository, "uiPreferencesRepository");
        zdlpuopuiu.btonecajqb(itemClickAction, "itemClickAction");
        this.uiPreferencesRepository = uiPreferencesRepository;
        this.itemClickAction = itemClickAction;
        PaymentFlowSubcomponent paymentFlowSubcomponent$ecomAndroid_release = EcomSdk.INSTANCE.getPaymentFlowSubcomponent$ecomAndroid_release();
        this.coilImpl = paymentFlowSubcomponent$ecomAndroid_release != null ? paymentFlowSubcomponent$ecomAndroid_release.getCoil() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBind$lambda$1(SbpBankListAdapter this$0, EcomSbpConfig.SbpBankInfo item, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(item, "$item");
        this$0.itemClickAction.invoke(item);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public boolean isForViewType(Object item) {
        zdlpuopuiu.btonecajqb(item, "item");
        return item instanceof EcomSbpConfig.SbpBankInfo;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter, modern.payments.ecomAndroid.presentation.base.DelegateAdapter
    public Object itemContent(Object item) {
        zdlpuopuiu.btonecajqb(item, "item");
        return ((EcomSbpConfig.SbpBankInfo) item).getBankName();
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public Object getItemId(EcomSbpConfig.SbpBankInfo sbpBankInfo) {
        zdlpuopuiu.btonecajqb(sbpBankInfo, "<this>");
        return Integer.valueOf(sbpBankInfo.hashCode());
    }

    @Override // modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter
    public void onBind(EcomRvItemSbpBankBinding ecomRvItemSbpBankBinding, final EcomSbpConfig.SbpBankInfo item) {
        zdlpuopuiu.btonecajqb(ecomRvItemSbpBankBinding, "<this>");
        zdlpuopuiu.btonecajqb(item, "item");
        TextView textView = ecomRvItemSbpBankBinding.ecomSbpBankName;
        textView.setText(item.getBankName());
        zdlpuopuiu.lqeggnwhkg(textView);
        ViewExtensionsKt.setFontParams$default(textView, this.uiPreferencesRepository.getUIFontParams(UIPreferencesRepository.Font.BODY), null, 2, null);
        ImageView ecomSbpBankIcon = ecomRvItemSbpBankBinding.ecomSbpBankIcon;
        zdlpuopuiu.dxjokdxxww(ecomSbpBankIcon, "ecomSbpBankIcon");
        ImageViewExtensionsKt.loadImageAsync$default(ecomSbpBankIcon, this.coilImpl, item.getLogoURL(), null, 4, null);
        ecomRvItemSbpBankBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.adapter.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SbpBankListAdapter.onBind$lambda$1(this.f67694zdlpuopuiu, item, view);
            }
        });
    }
}
