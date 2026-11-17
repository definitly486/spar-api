package lj0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import kj0.ppxfxbqfkf;
import kj0.wkgbmnqykc;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f62696iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialCardView f62697ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f62698wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ShapeableImageView f62699zoijcleaow;

    private zoijcleaow(MaterialCardView materialCardView, ShapeableImageView shapeableImageView, MaterialCardView materialCardView2, MaterialTextView materialTextView) {
        this.f62696iobyxmoadg = materialCardView;
        this.f62699zoijcleaow = shapeableImageView;
        this.f62697ppxfxbqfkf = materialCardView2;
        this.f62698wkgbmnqykc = materialTextView;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = ppxfxbqfkf.ivImage;
        ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (shapeableImageView != null) {
            MaterialCardView materialCardView = (MaterialCardView) view;
            int i14 = ppxfxbqfkf.tvName;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i14);
            if (materialTextView != null) {
                return new zoijcleaow(materialCardView, shapeableImageView, materialCardView, materialTextView);
            }
            i13 = i14;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static zoijcleaow ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(wkgbmnqykc.item_partner, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f62696iobyxmoadg;
    }
}
