package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ImageView f15346iobyxmoadg;

    private wkgbmnqykc(ImageView imageView) {
        this.f15346iobyxmoadg = imageView;
    }

    public static wkgbmnqykc iobyxmoadg(View view) {
        if (view != null) {
            return new wkgbmnqykc((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static wkgbmnqykc ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_divider, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ImageView getRoot() {
        return this.f15346iobyxmoadg;
    }
}
