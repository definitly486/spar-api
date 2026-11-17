package spay.sdk.view;

import a6.zoijcleaow;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.iobyxmoadg;
import androidx.core.widget.eablkybsjg;
import java.text.DecimalFormat;
import kk.f9;
import kk.p2;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lspay/sdk/view/SpayBonusCompositeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SpayBonusCompositeView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f9 f107875b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayBonusCompositeView(Context context) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public final void a(int i13, boolean z13) {
        f9 f9Var = this.f107875b;
        if (i13 <= 0 || !p2.f58029iobyxmoadg || !p2.f58030zoijcleaow || z13) {
            ConstraintLayout spaySclbvRoot = f9Var.f56511ppxfxbqfkf;
            zdlpuopuiu.dxjokdxxww(spaySclbvRoot, "spaySclbvRoot");
            spaySclbvRoot.setVisibility(8);
        } else {
            ConstraintLayout spaySclbvRoot2 = f9Var.f56511ppxfxbqfkf;
            zdlpuopuiu.dxjokdxxww(spaySclbvRoot2, "spaySclbvRoot");
            spaySclbvRoot2.setVisibility(0);
            f9Var.f56512zoijcleaow.setText(getContext().getString(R.string.spay_bonus_pattern, new DecimalFormat("#,###").format(Integer.valueOf(i13))));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayBonusCompositeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public /* synthetic */ SpayBonusCompositeView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayBonusCompositeView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spay_composite_layout_bonus_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i14 = R.id.spay_rics_actv_spasibo_bonus;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i14);
        if (appCompatTextView != null) {
            i14 = R.id.spay_rics_iv_spasibo_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) zoijcleaow.iobyxmoadg(viewInflate, i14);
            if (appCompatImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                f9 f9Var = new f9(constraintLayout, appCompatTextView, appCompatImageView, constraintLayout);
                zdlpuopuiu.dxjokdxxww(f9Var, "inflate(\n        LayoutI… this,\n        true\n    )");
                this.f107875b = f9Var;
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SpayBonusCompositeView, 0, 0);
                zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…,\n            0\n        )");
                typedArrayObtainStyledAttributes.getColor(R.styleable.SpayBonusCompositeView_spay_bonus_view_selected_color, iobyxmoadg.getColor(context, R.color.spay_bonus_selected_color));
                int color = typedArrayObtainStyledAttributes.getColor(R.styleable.SpayBonusCompositeView_spay_bonus_view_default_color, iobyxmoadg.getColor(context, R.color.spay_bonus_default_color));
                this.f107874a = color;
                typedArrayObtainStyledAttributes.recycle();
                zdlpuopuiu.dxjokdxxww(appCompatImageView, "binding.spayRicsIvSpasiboIcon");
                zdlpuopuiu.btonecajqb(appCompatImageView, "<this>");
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
                zdlpuopuiu.dxjokdxxww(colorStateListValueOf, "valueOf(color)");
                eablkybsjg.ppxfxbqfkf(appCompatImageView, colorStateListValueOf);
                appCompatTextView.setTextColor(color);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
    }
}
