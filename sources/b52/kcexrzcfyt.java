package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ru.myspar.core.ui.view.popup_text.PopupTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class kcexrzcfyt implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f15317iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final PopupTextView f15318ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageView f15319zoijcleaow;

    private kcexrzcfyt(FrameLayout frameLayout, ImageView imageView, PopupTextView popupTextView) {
        this.f15317iobyxmoadg = frameLayout;
        this.f15319zoijcleaow = imageView;
        this.f15318ppxfxbqfkf = popupTextView;
    }

    public static kcexrzcfyt iobyxmoadg(View view) {
        int i13 = t42.iobyxmoadg.ivImage;
        ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (imageView != null) {
            i13 = t42.iobyxmoadg.tvAdvertisement;
            PopupTextView popupTextView = (PopupTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (popupTextView != null) {
                return new kcexrzcfyt((FrameLayout) view, imageView, popupTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static kcexrzcfyt ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_one, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f15317iobyxmoadg;
    }
}
