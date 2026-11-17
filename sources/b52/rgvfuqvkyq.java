package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import ru.myspar.core.ui.view.popup_text.PopupTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class rgvfuqvkyq implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f15337iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final PopupTextView f15338ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ShapeableImageView f15339zoijcleaow;

    private rgvfuqvkyq(MaterialCardView materialCardView, ShapeableImageView shapeableImageView, PopupTextView popupTextView) {
        this.f15337iobyxmoadg = materialCardView;
        this.f15339zoijcleaow = shapeableImageView;
        this.f15338ppxfxbqfkf = popupTextView;
    }

    public static rgvfuqvkyq iobyxmoadg(View view) {
        int i13 = t42.iobyxmoadg.siv_image_ext;
        ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (shapeableImageView != null) {
            i13 = t42.iobyxmoadg.tvAdvertisement;
            PopupTextView popupTextView = (PopupTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (popupTextView != null) {
                return new rgvfuqvkyq((MaterialCardView) view, shapeableImageView, popupTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static rgvfuqvkyq ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_image_ext, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f15337iobyxmoadg;
    }
}
