package rw1;

import a6.zoijcleaow;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f104983iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final PlayerView f104984ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f104985zoijcleaow;

    private iobyxmoadg(ConstraintLayout constraintLayout, ComposeView composeView, PlayerView playerView) {
        this.f104983iobyxmoadg = constraintLayout;
        this.f104985zoijcleaow = composeView;
        this.f104984ppxfxbqfkf = playerView;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = qw1.iobyxmoadg.btnClose;
        ComposeView composeView = (ComposeView) zoijcleaow.iobyxmoadg(view, i13);
        if (composeView != null) {
            i13 = qw1.iobyxmoadg.pvVideoPlayer;
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
        return this.f104983iobyxmoadg;
    }
}
