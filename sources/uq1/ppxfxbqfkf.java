package uq1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ComposeView f114197iobyxmoadg;

    private ppxfxbqfkf(ComposeView composeView) {
        this.f114197iobyxmoadg = composeView;
    }

    public static ppxfxbqfkf iobyxmoadg(View view) {
        if (view != null) {
            return new ppxfxbqfkf((ComposeView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static ppxfxbqfkf ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(mq1.zoijcleaow.item_special_banner_combo_set_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ComposeView getRoot() {
        return this.f114197iobyxmoadg;
    }
}
