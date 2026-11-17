package c81;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ImageView f19239iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageView f19240zoijcleaow;

    private lqeggnwhkg(ImageView imageView, ImageView imageView2) {
        this.f19239iobyxmoadg = imageView;
        this.f19240zoijcleaow = imageView2;
    }

    public static lqeggnwhkg iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new lqeggnwhkg(imageView, imageView);
    }

    public static lqeggnwhkg ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(u71.eablkybsjg.item_evropolis_dialog_qr_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ImageView getRoot() {
        return this.f19239iobyxmoadg;
    }
}
