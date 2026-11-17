package spay.sdk.view;

import a6.zoijcleaow;
import android.content.Context;
import android.content.res.Resources;
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
import kk.hm;
import kk.ma;
import kk.x40;
import kk.xq;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.R;
import spay.sdk.view.SpasiboBonusesButtonCompositeView;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lspay/sdk/view/SpasiboBonusesButtonCompositeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pxMargin", "Lgg/wwaezpbzkn;", "setTopMargin", "(I)V", "Lkk/xq;", "btnState", "setSpasiboButtonState", "(Lkk/xq;)V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SpasiboBonusesButtonCompositeView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ma f107869a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpasiboBonusesButtonCompositeView(Context context) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
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

    public final void a(final hm onSwitchClicked) {
        zdlpuopuiu.btonecajqb(onSwitchClicked, "onSwitchClicked");
        this.f107869a.f57615wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: hc2.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpasiboBonusesButtonCompositeView.a(onSwitchClicked, view);
            }
        });
    }

    public final void b() {
        setVisibility(0);
        setTopMargin((int) getResources().getDimension(R.dimen.spay_order_bnpl_btn_margin_top));
    }

    public final void setSpasiboButtonState(xq btnState) {
        zdlpuopuiu.btonecajqb(btnState, "btnState");
        int i13 = btnState.f59323zoijcleaow ? R.drawable.spay_ic_switch_bnpl_on : R.drawable.spay_ic_switch_bnpl_off;
        AppCompatImageView appCompatImageView = this.f107869a.f57615wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(appCompatImageView, "binding.spaySpasiboSwitch");
        x40.iobyxmoadg(appCompatImageView, i13);
        this.f107869a.f57614ppxfxbqfkf.setText(getContext().getString(btnState.f59322ppxfxbqfkf ? R.string.spay_spasibo_button_zero_order_title : R.string.spay_spasibo_button_title));
        boolean z13 = btnState.f59322ppxfxbqfkf;
        if (z13 && btnState.f59323zoijcleaow) {
            this.f107869a.f57616zoijcleaow.setText(getContext().getString(R.string.spay_spasibo_button_zero_order_subtitle_on));
            return;
        }
        if (z13) {
            Resources resources = getResources();
            int i14 = R.plurals.spay_bonuses;
            int i15 = btnState.f59321iobyxmoadg;
            String quantityString = resources.getQuantityString(i14, i15, Integer.valueOf(i15));
            zdlpuopuiu.dxjokdxxww(quantityString, "resources.getQuantityStr…onuses, btnState.bonuses)");
            this.f107869a.f57616zoijcleaow.setText(getContext().getString(R.string.spay_spasibo_button_zero_order_subtitle_off, quantityString));
            return;
        }
        Resources resources2 = getResources();
        int i16 = R.plurals.spay_bonuses;
        int i17 = btnState.f59321iobyxmoadg;
        String quantityString2 = resources2.getQuantityString(i16, i17, Integer.valueOf(i17));
        zdlpuopuiu.dxjokdxxww(quantityString2, "resources.getQuantityStr…onuses, btnState.bonuses)");
        this.f107869a.f57616zoijcleaow.setText(getContext().getString(R.string.spay_spasibo_off_button_subtitle, quantityString2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpasiboBonusesButtonCompositeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public static final void a(iobyxmoadg onSwitchClicked, View view) {
        zdlpuopuiu.btonecajqb(onSwitchClicked, "$onSwitchClicked");
        onSwitchClicked.invoke();
    }

    public /* synthetic */ SpasiboBonusesButtonCompositeView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    public final void a() {
        setVisibility(8);
        setTopMargin(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpasiboBonusesButtonCompositeView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spay_composite_layout_spasibo_bonuses_button, (ViewGroup) this, false);
        addView(viewInflate);
        int i14 = R.id.spay_actv_spasibo_subtitle;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i14);
        if (appCompatTextView != null) {
            i14 = R.id.spay_actv_spasibo_title;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i14);
            if (appCompatTextView2 != null) {
                i14 = R.id.spay_cl_selected_card;
                if (((ConstraintLayout) zoijcleaow.iobyxmoadg(viewInflate, i14)) != null) {
                    CardView cardView = (CardView) viewInflate;
                    int i15 = R.id.spay_iv_spasibo_logo;
                    if (((ImageView) zoijcleaow.iobyxmoadg(viewInflate, i15)) != null) {
                        i15 = R.id.spay_spasibo_switch;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) zoijcleaow.iobyxmoadg(viewInflate, i15);
                        if (appCompatImageView != null) {
                            ma maVar = new ma(cardView, appCompatTextView, appCompatTextView2, appCompatImageView);
                            zdlpuopuiu.dxjokdxxww(maVar, "inflate(\n        LayoutI… this,\n        true\n    )");
                            this.f107869a = maVar;
                            return;
                        }
                    }
                    i14 = i15;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
    }
}
