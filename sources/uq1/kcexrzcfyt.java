package uq1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes6.dex */
public final class kcexrzcfyt implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f114179iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ImageView f114180ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f114181zoijcleaow;

    private kcexrzcfyt(FrameLayout frameLayout, ComposeView composeView, ImageView imageView) {
        this.f114179iobyxmoadg = frameLayout;
        this.f114181zoijcleaow = composeView;
        this.f114180ppxfxbqfkf = imageView;
    }

    public static kcexrzcfyt iobyxmoadg(View view) {
        int i13 = mq1.iobyxmoadg.cvAdPlate;
        ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = mq1.iobyxmoadg.ivImage;
            ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (imageView != null) {
                return new kcexrzcfyt((FrameLayout) view, composeView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static kcexrzcfyt ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(mq1.zoijcleaow.item_special_banner_one_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f114179iobyxmoadg;
    }
}
