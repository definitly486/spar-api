package c81;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f19249iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ShapeableImageView f19250ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final TextView f19251zoijcleaow;

    private zoijcleaow(LinearLayout linearLayout, TextView textView, ShapeableImageView shapeableImageView) {
        this.f19249iobyxmoadg = linearLayout;
        this.f19251zoijcleaow = textView;
        this.f19250ppxfxbqfkf = shapeableImageView;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = u71.wkgbmnqykc.description;
        TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (textView != null) {
            i13 = u71.wkgbmnqykc.image;
            ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (shapeableImageView != null) {
                return new zoijcleaow((LinearLayout) view, textView, shapeableImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static zoijcleaow ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(u71.eablkybsjg.item_evropolis_dialog_bonus_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f19249iobyxmoadg;
    }
}
