package e60;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.zdlpuopuiu;
import s40.wflxmlrfwp;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final eablkybsjg f30596iobyxmoadg = new eablkybsjg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static AtomicBoolean f30598zoijcleaow = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final int f30597ppxfxbqfkf = 8;

    public static final class iobyxmoadg implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ View f30599zdlpuopuiu;

        iobyxmoadg(View view) {
            this.f30599zdlpuopuiu = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (eablkybsjg.f30598zoijcleaow.get()) {
                this.f30599zdlpuopuiu.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            return !eablkybsjg.f30598zoijcleaow.get();
        }
    }

    private eablkybsjg() {
    }

    public static /* synthetic */ void eablkybsjg(eablkybsjg eablkybsjgVar, Activity activity, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        eablkybsjgVar.wkgbmnqykc(activity, z13);
    }

    public final void gxszxtbevo(Activity activity) {
        zdlpuopuiu.btonecajqb(activity, "activity");
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        activity.getSplashScreen().setSplashScreenTheme(c60.zoijcleaow.eablkybsjg(activity) ? wflxmlrfwp.Theme_Spar_Splash_Dark : wflxmlrfwp.Theme_Spar_Splash_Light);
    }

    public final void ppxfxbqfkf(Activity activity) {
        zdlpuopuiu.btonecajqb(activity, "activity");
        s1.ppxfxbqfkf.f105174zoijcleaow.iobyxmoadg(activity);
    }

    public final void wkgbmnqykc(Activity activity, boolean z13) {
        zdlpuopuiu.btonecajqb(activity, "activity");
        if (f30598zoijcleaow.get()) {
            View viewFindViewById = activity.findViewById(R.id.content);
            if (viewFindViewById != null) {
                viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new iobyxmoadg(viewFindViewById));
            }
            if (z13) {
                gxszxtbevo(activity);
            }
        }
    }

    public final void zoijcleaow() {
        f30598zoijcleaow.set(false);
    }
}
