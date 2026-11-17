package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class auzgnhcxok implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ShapeableImageView f65349iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ShapeableImageView f65350zoijcleaow;

    private auzgnhcxok(ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2) {
        this.f65349iobyxmoadg = shapeableImageView;
        this.f65350zoijcleaow = shapeableImageView2;
    }

    public static auzgnhcxok iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ShapeableImageView shapeableImageView = (ShapeableImageView) view;
        return new auzgnhcxok(shapeableImageView, shapeableImageView);
    }

    public static auzgnhcxok ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_square_card, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ShapeableImageView getRoot() {
        return this.f65349iobyxmoadg;
    }
}
