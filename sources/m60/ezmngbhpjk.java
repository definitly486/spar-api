package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes4.dex */
public final class ezmngbhpjk implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ComposeView f65497iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ComposeView f65498zoijcleaow;

    private ezmngbhpjk(ComposeView composeView, ComposeView composeView2) {
        this.f65497iobyxmoadg = composeView;
        this.f65498zoijcleaow = composeView2;
    }

    public static ezmngbhpjk iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ComposeView composeView = (ComposeView) view;
        return new ezmngbhpjk(composeView, composeView);
    }

    public static ezmngbhpjk ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.special_banner_compose, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ComposeView getRoot() {
        return this.f65497iobyxmoadg;
    }
}
