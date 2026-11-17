package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes6.dex */
public final class pmvmpeiblj implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f15333iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f15334ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final FloatingActionButton f15335zoijcleaow;

    private pmvmpeiblj(MaterialCardView materialCardView, FloatingActionButton floatingActionButton, AppCompatImageView appCompatImageView) {
        this.f15333iobyxmoadg = materialCardView;
        this.f15335zoijcleaow = floatingActionButton;
        this.f15334ppxfxbqfkf = appCompatImageView;
    }

    public static pmvmpeiblj iobyxmoadg(View view) {
        int i13 = t42.iobyxmoadg.fabPlay;
        FloatingActionButton floatingActionButton = (FloatingActionButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (floatingActionButton != null) {
            i13 = t42.iobyxmoadg.ivThumbnail;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView != null) {
                return new pmvmpeiblj((MaterialCardView) view, floatingActionButton, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static pmvmpeiblj ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_video, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f15333iobyxmoadg;
    }
}
