package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class opjhrmiecq implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f65856dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f65857eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f65858gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65859iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f65860lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f65861nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Group f65862ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ShapeableImageView f65863wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f65864zoijcleaow;

    private opjhrmiecq(ConstraintLayout constraintLayout, MaterialButton materialButton, Group group, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5) {
        this.f65859iobyxmoadg = constraintLayout;
        this.f65864zoijcleaow = materialButton;
        this.f65862ppxfxbqfkf = group;
        this.f65863wkgbmnqykc = shapeableImageView;
        this.f65857eablkybsjg = materialTextView;
        this.f65858gxszxtbevo = materialTextView2;
        this.f65860lqeggnwhkg = materialTextView3;
        this.f65861nufgyqmvbu = materialTextView4;
        this.f65856dxjokdxxww = materialTextView5;
    }

    public static opjhrmiecq iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnPromotionProductReward;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.groupPrice;
            Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (group != null) {
                i13 = pm.eablkybsjg.ivPromotionProduct;
                ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (shapeableImageView != null) {
                    i13 = pm.eablkybsjg.tvPromotionNoStickerHeader;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = pm.eablkybsjg.tvPromotionOldPrice;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            i13 = pm.eablkybsjg.tvPromotionProductName;
                            MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView3 != null) {
                                i13 = pm.eablkybsjg.tvPromotionProductRealPrice;
                                MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView4 != null) {
                                    i13 = pm.eablkybsjg.tvPromotionProductRewardText;
                                    MaterialTextView materialTextView5 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView5 != null) {
                                        return new opjhrmiecq((ConstraintLayout) view, materialButton, group, shapeableImageView, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static opjhrmiecq ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_promotion_product, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65859iobyxmoadg;
    }
}
