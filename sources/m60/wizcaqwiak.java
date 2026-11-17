package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import ru.myspar.core.ui.view.popup_text.PopupTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class wizcaqwiak implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final FrameLayout f66070eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f66071iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ShapeableImageView f66072ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final PopupTextView f66073wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final FloatingActionButton f66074zoijcleaow;

    private wizcaqwiak(FrameLayout frameLayout, FloatingActionButton floatingActionButton, ShapeableImageView shapeableImageView, PopupTextView popupTextView, FrameLayout frameLayout2) {
        this.f66071iobyxmoadg = frameLayout;
        this.f66074zoijcleaow = floatingActionButton;
        this.f66072ppxfxbqfkf = shapeableImageView;
        this.f66073wkgbmnqykc = popupTextView;
        this.f66070eablkybsjg = frameLayout2;
    }

    public static wizcaqwiak iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.fabPlay;
        FloatingActionButton floatingActionButton = (FloatingActionButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (floatingActionButton != null) {
            i13 = pm.eablkybsjg.ivBanner;
            ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (shapeableImageView != null) {
                i13 = pm.eablkybsjg.tvAdvertisement;
                PopupTextView popupTextView = (PopupTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (popupTextView != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    return new wizcaqwiak(frameLayout, floatingActionButton, shapeableImageView, popupTextView, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static wizcaqwiak ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_video_banner, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f66071iobyxmoadg;
    }
}
