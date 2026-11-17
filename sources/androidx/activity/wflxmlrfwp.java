package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract class wflxmlrfwp {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static oxmwwwfdhm f2358ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int f2357iobyxmoadg = Color.argb(230, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int f2359zoijcleaow = Color.argb(UserVerificationMethods.USER_VERIFY_PATTERN, 27, 27, 27);

    public static final void iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, zynmafqrjb statusBarStyle, zynmafqrjb navigationBarStyle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navigationBarStyle, "navigationBarStyle");
        View decorView = nufgyqmvbuVar.getWindow().getDecorView();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(decorView, "window.decorView");
        tg.draadjrbmk draadjrbmkVarIobyxmoadg = statusBarStyle.iobyxmoadg();
        Resources resources = decorView.getResources();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) draadjrbmkVarIobyxmoadg.invoke(resources)).booleanValue();
        tg.draadjrbmk draadjrbmkVarIobyxmoadg2 = navigationBarStyle.iobyxmoadg();
        Resources resources2 = decorView.getResources();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) draadjrbmkVarIobyxmoadg2.invoke(resources2)).booleanValue();
        oxmwwwfdhm vdvldrhtssVar = f2358ppxfxbqfkf;
        if (vdvldrhtssVar == null) {
            vdvldrhtssVar = Build.VERSION.SDK_INT >= 29 ? new vdvldrhtss() : new agtfadlqog();
        }
        oxmwwwfdhm oxmwwwfdhmVar = vdvldrhtssVar;
        Window window = nufgyqmvbuVar.getWindow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(window, "window");
        oxmwwwfdhmVar.iobyxmoadg(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
    }

    public static /* synthetic */ void zoijcleaow(nufgyqmvbu nufgyqmvbuVar, zynmafqrjb zynmafqrjbVar, zynmafqrjb zynmafqrjbVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            zynmafqrjbVar = zynmafqrjb.iobyxmoadg.zoijcleaow(zynmafqrjb.f2374eablkybsjg, 0, 0, null, 4, null);
        }
        if ((i13 & 2) != 0) {
            zynmafqrjbVar2 = zynmafqrjb.iobyxmoadg.zoijcleaow(zynmafqrjb.f2374eablkybsjg, f2357iobyxmoadg, f2359zoijcleaow, null, 4, null);
        }
        iobyxmoadg(nufgyqmvbuVar, zynmafqrjbVar, zynmafqrjbVar2);
    }
}
