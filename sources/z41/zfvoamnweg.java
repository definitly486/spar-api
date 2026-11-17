package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class zfvoamnweg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ShapeableImageView f128574iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ShapeableImageView f128575zoijcleaow;

    private zfvoamnweg(ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2) {
        this.f128574iobyxmoadg = shapeableImageView;
        this.f128575zoijcleaow = shapeableImageView2;
    }

    public static zfvoamnweg iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ShapeableImageView shapeableImageView = (ShapeableImageView) view;
        return new zfvoamnweg(shapeableImageView, shapeableImageView);
    }

    public static zfvoamnweg ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_square_card_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ShapeableImageView getRoot() {
        return this.f128574iobyxmoadg;
    }
}
