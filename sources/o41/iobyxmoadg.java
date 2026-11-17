package o41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import b31.dxjokdxxww;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ComposeView f72031iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f72032zoijcleaow;

    private iobyxmoadg(ComposeView composeView, ComposeView composeView2) {
        this.f72031iobyxmoadg = composeView;
        this.f72032zoijcleaow = composeView2;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ComposeView composeView = (ComposeView) view;
        return new iobyxmoadg(composeView, composeView);
    }

    public static iobyxmoadg ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(dxjokdxxww.compose_view_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ComposeView getRoot() {
        return this.f72031iobyxmoadg;
    }
}
