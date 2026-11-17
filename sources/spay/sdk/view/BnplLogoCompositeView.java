package spay.sdk.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import i1.nufgyqmvbu;
import kk.bq;
import kk.df;
import kk.tk;
import kk.zf0;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.R;
import spay.sdk.SPaySdkApp;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lspay/sdk/view/BnplLogoCompositeView;", "Landroid/widget/FrameLayout;", "Lkk/zf0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkk/df;", "a", "Lkk/df;", "getCoilImpl", "()Lkk/df;", "coilImpl", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BnplLogoCompositeView extends FrameLayout implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final df coilImpl;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f107852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ShimmerFrameLayout f107853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f107854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f107855e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BnplLogoCompositeView(Context context) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    @Override // kk.zf0
    public df getCoilImpl() {
        return this.coilImpl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BnplLogoCompositeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public /* synthetic */ BnplLogoCompositeView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BnplLogoCompositeView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        bq sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
        this.coilImpl = sdkComponent != null ? ((tk) sdkComponent).iobyxmoadg() : null;
        this.f107854d = nufgyqmvbu.gxszxtbevo(getResources(), R.drawable.spay_ic_bnpl_on, null);
        this.f107855e = nufgyqmvbu.gxszxtbevo(getResources(), R.drawable.spay_ic_bnpl_off, null);
        LayoutInflater.from(context).inflate(R.layout.spay_composite_layout_bnpl_logo, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.spay_iv_bnpl_logo);
        zdlpuopuiu.dxjokdxxww(viewFindViewById, "findViewById<ImageView>(R.id.spay_iv_bnpl_logo)");
        this.f107852b = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.spay_shimmer_fl_bnpl_logo);
        zdlpuopuiu.dxjokdxxww(viewFindViewById2, "findViewById<ShimmerFram…er_fl_bnpl_logo\n        )");
        this.f107853c = (ShimmerFrameLayout) viewFindViewById2;
    }
}
