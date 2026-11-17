package kk;

import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes3.dex */
public final class nc0 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final FrameLayout f57757iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final CardView f57758zoijcleaow;

    public nc0(FrameLayout frameLayout, CardView cardView) {
        this.f57757iobyxmoadg = frameLayout;
        this.f57758zoijcleaow = cardView;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f57757iobyxmoadg;
    }
}
