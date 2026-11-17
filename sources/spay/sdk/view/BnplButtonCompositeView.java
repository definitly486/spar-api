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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import e7.nufgyqmvbu;
import kk.df;
import kk.te0;
import kk.u30;
import kk.x5;
import kk.y4;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.R;
import spay.sdk.domain.model.response.bnpl.ButtonBnpl;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"Lspay/sdk/view/BnplButtonCompositeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "bnplNewSubTitle", "Lgg/wwaezpbzkn;", "setBnplNewSubTitle", "(Ljava/lang/String;)V", "pxMargin", "setTopMargin", "(I)V", "bnplNewTitle", "setBnplTitle", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BnplButtonCompositeView extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f107848c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5 f107849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f107850b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BnplButtonCompositeView(Context context) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void setBnplNewSubTitle(String bnplNewSubTitle) {
        this.f107849a.f59250ppxfxbqfkf.setText(bnplNewSubTitle);
    }

    private final void setTopMargin(int pxMargin) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, pxMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        setLayoutParams(marginLayoutParams);
    }

    public final void a() {
        setVisibility(8);
        this.f107850b = true;
        setTopMargin(0);
    }

    public final void b(ButtonBnpl bnpl) {
        zdlpuopuiu.btonecajqb(bnpl, "bnpl");
        setVisibility(0);
        a(bnpl);
        if (this.f107850b) {
            setTopMargin((int) getResources().getDimension(R.dimen.spay_order_bnpl_btn_margin_top));
            this.f107850b = false;
        }
    }

    public final void setBnplTitle(String bnplNewTitle) {
        zdlpuopuiu.btonecajqb(bnplNewTitle, "bnplNewTitle");
        this.f107849a.f59251wkgbmnqykc.setText(bnplNewTitle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BnplButtonCompositeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public /* synthetic */ BnplButtonCompositeView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BnplButtonCompositeView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spay_composite_layout_bnpl_button, (ViewGroup) this, false);
        addView(viewInflate);
        int i14 = R.id.spay_aciv_bnpl_icon;
        BnplLogoCompositeView bnplLogoCompositeView = (BnplLogoCompositeView) zoijcleaow.iobyxmoadg(viewInflate, i14);
        if (bnplLogoCompositeView != null) {
            i14 = R.id.spay_actv_bnpl_subtitle;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i14);
            if (appCompatTextView != null) {
                i14 = R.id.spay_actv_bnpl_title;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i14);
                if (appCompatTextView2 != null) {
                    i14 = R.id.spay_cl_selected_card;
                    if (((ConstraintLayout) zoijcleaow.iobyxmoadg(viewInflate, i14)) != null) {
                        CardView cardView = (CardView) viewInflate;
                        int i15 = R.id.spay_sclbb_aciv_switch;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) zoijcleaow.iobyxmoadg(viewInflate, i15);
                        if (appCompatImageView != null) {
                            x5 x5Var = new x5(cardView, bnplLogoCompositeView, appCompatTextView, appCompatTextView2, cardView, appCompatImageView);
                            zdlpuopuiu.dxjokdxxww(x5Var, "inflate(\n        LayoutI… this,\n        true\n    )");
                            this.f107849a = x5Var;
                            zdlpuopuiu.dxjokdxxww(cardView, "binding.spayCvBnplRoot");
                            cardView.setOnClickListener(new y4(new jpowsppfya(), this));
                            return;
                        }
                        i14 = i15;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
    }

    public final void a(String numOfPayments, ButtonBnpl bnpl) {
        String string;
        zdlpuopuiu.btonecajqb(numOfPayments, "numOfPayments");
        zdlpuopuiu.btonecajqb(bnpl, "bnpl");
        BnplLogoCompositeView bnplLogoCompositeView = this.f107849a.f59252zoijcleaow;
        String activeButtonLogo = bnpl.getActiveButtonLogo();
        ImageView targetView = bnplLogoCompositeView.f107852b;
        ShimmerFrameLayout shimmerFrame = bnplLogoCompositeView.f107853c;
        Drawable drawable = bnplLogoCompositeView.f107854d;
        zdlpuopuiu.btonecajqb(targetView, "shimmerImageView");
        zdlpuopuiu.btonecajqb(shimmerFrame, "shimmerFrame");
        te0 imageRequestListener = new te0(shimmerFrame, targetView, drawable);
        df coilImpl = bnplLogoCompositeView.getCoilImpl();
        zdlpuopuiu.btonecajqb(targetView, "<this>");
        zdlpuopuiu.btonecajqb(imageRequestListener, "imageRequestListener");
        if (coilImpl != null) {
            u30 imageRequestBuilder = new u30(imageRequestListener);
            zdlpuopuiu.btonecajqb(targetView, "targetView");
            zdlpuopuiu.btonecajqb(imageRequestBuilder, "imageRequestBuilder");
            nufgyqmvbu.iobyxmoadg iobyxmoadgVarBtonecajqb = new nufgyqmvbu.iobyxmoadg(coilImpl.f56266iobyxmoadg).zoijcleaow(activeButtonLogo).btonecajqb(targetView);
            imageRequestBuilder.invoke(iobyxmoadgVarBtonecajqb);
            coilImpl.f56267zoijcleaow.iobyxmoadg(iobyxmoadgVarBtonecajqb.iobyxmoadg());
        }
        AppCompatImageView appCompatImageView = this.f107849a.f59248eablkybsjg;
        zdlpuopuiu.dxjokdxxww(appCompatImageView, "binding.spaySclbbAcivSwitch");
        int i13 = R.drawable.spay_ic_switch_bnpl_on;
        zdlpuopuiu.btonecajqb(appCompatImageView, "<this>");
        appCompatImageView.setImageDrawable(i1.nufgyqmvbu.gxszxtbevo(appCompatImageView.getResources(), i13, null));
        if (f107848c) {
            string = bnpl.getContent();
        } else {
            string = getResources().getString(R.string.spay_bnpl_on_button_subtitle);
            zdlpuopuiu.dxjokdxxww(string, "{\n                resour…          )\n            }");
        }
        setBnplNewSubTitle(string);
    }

    public final void a(ButtonBnpl bnpl) {
        zdlpuopuiu.btonecajqb(bnpl, "bnpl");
        setBnplTitle(bnpl.getHeader());
        setBnplNewSubTitle(bnpl.getContent());
        BnplLogoCompositeView bnplLogoCompositeView = this.f107849a.f59252zoijcleaow;
        String inactiveButtonLogo = bnpl.getInactiveButtonLogo();
        ImageView targetView = bnplLogoCompositeView.f107852b;
        ShimmerFrameLayout shimmerFrame = bnplLogoCompositeView.f107853c;
        Drawable drawable = bnplLogoCompositeView.f107855e;
        zdlpuopuiu.btonecajqb(targetView, "shimmerImageView");
        zdlpuopuiu.btonecajqb(shimmerFrame, "shimmerFrame");
        te0 imageRequestListener = new te0(shimmerFrame, targetView, drawable);
        df coilImpl = bnplLogoCompositeView.getCoilImpl();
        zdlpuopuiu.btonecajqb(targetView, "<this>");
        zdlpuopuiu.btonecajqb(imageRequestListener, "imageRequestListener");
        if (coilImpl != null) {
            u30 imageRequestBuilder = new u30(imageRequestListener);
            zdlpuopuiu.btonecajqb(targetView, "targetView");
            zdlpuopuiu.btonecajqb(imageRequestBuilder, "imageRequestBuilder");
            nufgyqmvbu.iobyxmoadg iobyxmoadgVarBtonecajqb = new nufgyqmvbu.iobyxmoadg(coilImpl.f56266iobyxmoadg).zoijcleaow(inactiveButtonLogo).btonecajqb(targetView);
            imageRequestBuilder.invoke(iobyxmoadgVarBtonecajqb);
            coilImpl.f56267zoijcleaow.iobyxmoadg(iobyxmoadgVarBtonecajqb.iobyxmoadg());
        }
        AppCompatImageView appCompatImageView = this.f107849a.f59248eablkybsjg;
        zdlpuopuiu.dxjokdxxww(appCompatImageView, "binding.spaySclbbAcivSwitch");
        int i13 = R.drawable.spay_ic_switch_bnpl_off;
        zdlpuopuiu.btonecajqb(appCompatImageView, "<this>");
        appCompatImageView.setImageDrawable(i1.nufgyqmvbu.gxszxtbevo(appCompatImageView.getResources(), i13, null));
    }
}
