package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class tzroggbefp implements w {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ViewConfiguration f7091iobyxmoadg;

    public tzroggbefp(ViewConfiguration viewConfiguration) {
        this.f7091iobyxmoadg = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.w
    public float dxjokdxxww() {
        return Build.VERSION.SDK_INT >= 34 ? ulzqkzuiru.f7094iobyxmoadg.iobyxmoadg(this.f7091iobyxmoadg) : super.dxjokdxxww();
    }

    @Override // androidx.compose.ui.platform.w
    public float eablkybsjg() {
        return Build.VERSION.SDK_INT >= 34 ? ulzqkzuiru.f7094iobyxmoadg.zoijcleaow(this.f7091iobyxmoadg) : super.eablkybsjg();
    }

    @Override // androidx.compose.ui.platform.w
    public long iobyxmoadg() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.w
    public float lqeggnwhkg() {
        return this.f7091iobyxmoadg.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.w
    public float nufgyqmvbu() {
        return this.f7091iobyxmoadg.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.w
    public long ppxfxbqfkf() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.w
    public float wkgbmnqykc() {
        return this.f7091iobyxmoadg.getScaledMinimumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.w
    public long zoijcleaow() {
        return 40L;
    }
}
