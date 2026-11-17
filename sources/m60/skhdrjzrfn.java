package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class skhdrjzrfn implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TextView f65972eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65973iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ShapeableImageView f65974ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final ConstraintLayout f65975wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f65976zoijcleaow;

    private skhdrjzrfn(ConstraintLayout constraintLayout, ComposeView composeView, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout2, TextView textView) {
        this.f65973iobyxmoadg = constraintLayout;
        this.f65976zoijcleaow = composeView;
        this.f65974ppxfxbqfkf = shapeableImageView;
        this.f65975wkgbmnqykc = constraintLayout2;
        this.f65972eablkybsjg = textView;
    }

    public static skhdrjzrfn iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.cvAdPlate;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = pm.eablkybsjg.ivIcon;
            ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (shapeableImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i13 = pm.eablkybsjg.tvName;
                TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (textView != null) {
                    return new skhdrjzrfn(constraintLayout, composeView, shapeableImageView, constraintLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static skhdrjzrfn ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_subcatalog_section, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65973iobyxmoadg;
    }
}
