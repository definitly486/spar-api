package wl1;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ComposeView f120200iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f120201zoijcleaow;

    private iobyxmoadg(ComposeView composeView, ComposeView composeView2) {
        this.f120200iobyxmoadg = composeView;
        this.f120201zoijcleaow = composeView2;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ComposeView composeView = (ComposeView) view;
        return new iobyxmoadg(composeView, composeView);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ComposeView getRoot() {
        return this.f120200iobyxmoadg;
    }
}
