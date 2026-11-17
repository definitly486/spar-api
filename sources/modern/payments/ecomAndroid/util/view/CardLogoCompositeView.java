package modern.payments.ecomAndroid.util.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import i1.nufgyqmvbu;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.di.component.PaymentFlowSubcomponent;
import modern.payments.ecomAndroid.presentation.view.ShimmerImage;
import modern.payments.ecomAndroid.util.CoilImpl;
import modern.payments.p003ecomandroid.R;
import modern.payments.p003ecomandroid.databinding.EcomCompositeLayoutCardLogoBinding;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lmodern/payments/ecomAndroid/util/view/CardLogoCompositeView;", "Landroid/widget/FrameLayout;", "Lmodern/payments/ecomAndroid/presentation/view/ShimmerImage;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "cardIconUrl", "Lgg/wwaezpbzkn;", "loadImageAsyncWithShimmer$ecomAndroid_release", "(Ljava/lang/String;)V", "loadImageAsyncWithShimmer", "Lmodern/payments/ecomAndroid/util/CoilImpl;", "coilImpl", "Lmodern/payments/ecomAndroid/util/CoilImpl;", "getCoilImpl", "()Lmodern/payments/ecomAndroid/util/CoilImpl;", "Landroid/graphics/drawable/Drawable;", "defaultImage", "Landroid/graphics/drawable/Drawable;", "Lmodern/payments/ecomandroid/databinding/EcomCompositeLayoutCardLogoBinding;", "binding", "Lmodern/payments/ecomandroid/databinding/EcomCompositeLayoutCardLogoBinding;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardLogoCompositeView extends FrameLayout implements ShimmerImage {
    private final EcomCompositeLayoutCardLogoBinding binding;
    private final CoilImpl coilImpl;
    private final Drawable defaultImage;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardLogoCompositeView(Context context) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    @Override // modern.payments.ecomAndroid.presentation.view.ShimmerImage
    public CoilImpl getCoilImpl() {
        return this.coilImpl;
    }

    @Override // modern.payments.ecomAndroid.presentation.view.ShimmerImage
    public void loadImageAsyncWithShimmer(String str, ImageView imageView, ShimmerFrameLayout shimmerFrameLayout, Drawable drawable) {
        ShimmerImage.DefaultImpls.loadImageAsyncWithShimmer(this, str, imageView, shimmerFrameLayout, drawable);
    }

    public final void loadImageAsyncWithShimmer$ecomAndroid_release(String cardIconUrl) {
        ImageView ecomIvCardIcon = this.binding.ecomIvCardIcon;
        zdlpuopuiu.dxjokdxxww(ecomIvCardIcon, "ecomIvCardIcon");
        ShimmerFrameLayout ecomShimmerFlCardIcon = this.binding.ecomShimmerFlCardIcon;
        zdlpuopuiu.dxjokdxxww(ecomShimmerFlCardIcon, "ecomShimmerFlCardIcon");
        loadImageAsyncWithShimmer(cardIconUrl, ecomIvCardIcon, ecomShimmerFlCardIcon, this.defaultImage);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardLogoCompositeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public /* synthetic */ CardLogoCompositeView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardLogoCompositeView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        PaymentFlowSubcomponent paymentFlowSubcomponent$ecomAndroid_release = EcomSdk.INSTANCE.getPaymentFlowSubcomponent$ecomAndroid_release();
        this.coilImpl = paymentFlowSubcomponent$ecomAndroid_release != null ? paymentFlowSubcomponent$ecomAndroid_release.getCoil() : null;
        this.defaultImage = nufgyqmvbu.gxszxtbevo(getResources(), R.drawable.ecom_ic_card_preview, null);
        EcomCompositeLayoutCardLogoBinding ecomCompositeLayoutCardLogoBindingInflate = EcomCompositeLayoutCardLogoBinding.inflate(LayoutInflater.from(context), this, true);
        zdlpuopuiu.dxjokdxxww(ecomCompositeLayoutCardLogoBindingInflate, "inflate(...)");
        this.binding = ecomCompositeLayoutCardLogoBindingInflate;
    }
}
