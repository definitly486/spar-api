package ua2;

import a6.zoijcleaow;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f113101iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final PlayerView f113102ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f113103zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, ComposeView composeView, PlayerView playerView) {
        this.f113101iobyxmoadg = constraintLayout;
        this.f113103zoijcleaow = composeView;
        this.f113102ppxfxbqfkf = playerView;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = ta2.iobyxmoadg.btnClose;
        ComposeView composeView = (ComposeView) zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = ta2.iobyxmoadg.pvVideoPlayer;
            PlayerView playerView = (PlayerView) zoijcleaow.iobyxmoadg(view, i13);
            if (playerView != null) {
                return new iobyxmoadg((ConstraintLayout) view, composeView, playerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f113101iobyxmoadg;
    }
}
