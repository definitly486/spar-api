package y90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ImageView f124202iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageView f124203zoijcleaow;

    private gxszxtbevo(ImageView imageView, ImageView imageView2) {
        this.f124202iobyxmoadg = imageView;
        this.f124203zoijcleaow = imageView2;
    }

    public static gxszxtbevo iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new gxszxtbevo(imageView, imageView);
    }

    public static gxszxtbevo ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(q90.eablkybsjg.item_evropolis_dialog_puzzle, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ImageView getRoot() {
        return this.f124202iobyxmoadg;
    }
}
