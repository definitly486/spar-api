package spay.sdk.view;

import a6.zoijcleaow;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import e7.nufgyqmvbu;
import kk.b7;
import kk.bq;
import kk.df;
import kk.pb;
import kk.te0;
import kk.tk;
import kk.u30;
import kk.vb;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.R;
import spay.sdk.SPaySdkApp;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lspay/sdk/view/SpayUserDataCompositeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkk/vb;", "data", "Lgg/wwaezpbzkn;", "setClientData", "(Lkk/vb;)V", "Lkotlin/Function1;", "Landroid/view/View;", "callback", "setOnClickListener", "(Ltg/draadjrbmk;)V", "", "value", "merchantLogo", "Ljava/lang/String;", "setMerchantLogo", "(Ljava/lang/String;)V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SpayUserDataCompositeView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pb f107890a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayUserDataCompositeView(Context context) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void setMerchantLogo(String str) {
        MerchantLogoCompositeView merchantLogoCompositeView = this.f107890a.f58064zoijcleaow;
        ImageView targetView = merchantLogoCompositeView.f107861b;
        ShimmerFrameLayout shimmerFrame = merchantLogoCompositeView.f107862c;
        Drawable drawable = merchantLogoCompositeView.f107863d;
        zdlpuopuiu.btonecajqb(targetView, "shimmerImageView");
        zdlpuopuiu.btonecajqb(shimmerFrame, "shimmerFrame");
        te0 imageRequestListener = new te0(shimmerFrame, targetView, drawable);
        df coilImpl = merchantLogoCompositeView.getCoilImpl();
        zdlpuopuiu.btonecajqb(targetView, "<this>");
        zdlpuopuiu.btonecajqb(imageRequestListener, "imageRequestListener");
        if (coilImpl != null) {
            u30 imageRequestBuilder = new u30(imageRequestListener);
            zdlpuopuiu.btonecajqb(targetView, "targetView");
            zdlpuopuiu.btonecajqb(imageRequestBuilder, "imageRequestBuilder");
            nufgyqmvbu.iobyxmoadg iobyxmoadgVarBtonecajqb = new nufgyqmvbu.iobyxmoadg(coilImpl.f56266iobyxmoadg).zoijcleaow(str).btonecajqb(targetView);
            imageRequestBuilder.invoke(iobyxmoadgVarBtonecajqb);
            coilImpl.f56267zoijcleaow.iobyxmoadg(iobyxmoadgVarBtonecajqb.iobyxmoadg());
        }
    }

    public final void setClientData(vb data) {
        zdlpuopuiu.btonecajqb(data, "data");
        setMerchantLogo(data.f58982iobyxmoadg);
    }

    public final void setOnClickListener(draadjrbmk callback) {
        zdlpuopuiu.btonecajqb(callback, "callback");
        ShapeableImageView shapeableImageView = this.f107890a.f58063ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(shapeableImageView, "binding.spayScludIvUserIcon");
        shapeableImageView.setOnClickListener(new b7(new jpowsppfya(), callback));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayUserDataCompositeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public /* synthetic */ SpayUserDataCompositeView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayUserDataCompositeView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        bq sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
        if (sdkComponent != null) {
            ((tk) sdkComponent).iobyxmoadg();
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spay_composite_layout_user_data, (ViewGroup) this, false);
        addView(viewInflate);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i14 = R.id.spay_sclud_iv_logo;
        MerchantLogoCompositeView merchantLogoCompositeView = (MerchantLogoCompositeView) zoijcleaow.iobyxmoadg(viewInflate, i14);
        if (merchantLogoCompositeView != null) {
            i14 = R.id.spay_sclud_iv_user_icon;
            ShapeableImageView shapeableImageView = (ShapeableImageView) zoijcleaow.iobyxmoadg(viewInflate, i14);
            if (shapeableImageView != null) {
                pb pbVar = new pb(frameLayout, merchantLogoCompositeView, shapeableImageView);
                zdlpuopuiu.dxjokdxxww(pbVar, "inflate(\n        LayoutI… this,\n        true\n    )");
                this.f107890a = pbVar;
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
    }
}
