package spay.sdk.view;

import a6.zoijcleaow;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kk.d8;
import kk.p2;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lspay/sdk/view/SpayBonusOverallCompositeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bonusCount", "Lgg/wwaezpbzkn;", "setBonusCount", "(I)V", "Lkk/d8;", "a", "Lkk/d8;", "getBinding", "()Lkk/d8;", "binding", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SpayBonusOverallCompositeView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final d8 binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayBonusOverallCompositeView(Context context) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public final d8 getBinding() {
        return this.binding;
    }

    public final void setBonusCount(int bonusCount) {
        d8 d8Var = this.binding;
        if (bonusCount <= 0 || !p2.f58029iobyxmoadg || !p2.f58030zoijcleaow) {
            ConstraintLayout root = d8Var.f56236iobyxmoadg;
            zdlpuopuiu.dxjokdxxww(root, "root");
            root.setVisibility(8);
        } else {
            ConstraintLayout root2 = d8Var.f56236iobyxmoadg;
            zdlpuopuiu.dxjokdxxww(root2, "root");
            root2.setVisibility(0);
            SpayBonusCompositeView spaySclbovSbcvBonuseCount = d8Var.f56237zoijcleaow;
            zdlpuopuiu.dxjokdxxww(spaySclbovSbcvBonuseCount, "spaySclbovSbcvBonuseCount");
            spaySclbovSbcvBonuseCount.a(bonusCount, false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayBonusOverallCompositeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public /* synthetic */ SpayBonusOverallCompositeView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayBonusOverallCompositeView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spay_composite_layout_bonus_overall_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i14 = R.id.spay_sclbov_sbcv_bonuse_count;
        SpayBonusCompositeView spayBonusCompositeView = (SpayBonusCompositeView) zoijcleaow.iobyxmoadg(viewInflate, i14);
        if (spayBonusCompositeView != null) {
            d8 d8Var = new d8((ConstraintLayout) viewInflate, spayBonusCompositeView);
            zdlpuopuiu.dxjokdxxww(d8Var, "inflate(\n        LayoutI… this,\n        true\n    )");
            this.binding = d8Var;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SpayBonusOverallCompositeView, 0, 0);
            zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…,\n            0\n        )");
            setBonusCount(typedArrayObtainStyledAttributes.getInteger(R.styleable.SpayBonusOverallCompositeView_spay_bonus_overall_view_count, 0));
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
    }
}
