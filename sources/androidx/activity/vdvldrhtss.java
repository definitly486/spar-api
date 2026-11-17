package androidx.activity;

import android.view.View;
import android.view.Window;
import v1.g;
import v1.oipsdeybqn;

/* JADX INFO: loaded from: classes.dex */
final class vdvldrhtss implements oxmwwwfdhm {
    @Override // androidx.activity.oxmwwwfdhm
    public void iobyxmoadg(zynmafqrjb statusBarStyle, zynmafqrjb navigationBarStyle, Window window, View view, boolean z13, boolean z14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(window, "window");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        oipsdeybqn.zoijcleaow(window, false);
        window.setStatusBarColor(statusBarStyle.wkgbmnqykc(z13));
        window.setNavigationBarColor(navigationBarStyle.wkgbmnqykc(z14));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(navigationBarStyle.zoijcleaow() == 0);
        g gVar = new g(window, view);
        gVar.wkgbmnqykc(!z13);
        gVar.ppxfxbqfkf(true ^ z14);
    }
}
