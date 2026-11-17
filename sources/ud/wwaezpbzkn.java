package ud;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class wwaezpbzkn implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static cdpycssgdh f113452jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static boolean f113453yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final wwaezpbzkn f113454zdlpuopuiu = new wwaezpbzkn();

    private wwaezpbzkn() {
    }

    public final void iobyxmoadg(cdpycssgdh cdpycssgdhVar) {
        f113452jyumaefscl = cdpycssgdhVar;
        if (cdpycssgdhVar == null || !f113453yggfygwlhe) {
            return;
        }
        f113453yggfygwlhe = false;
        cdpycssgdhVar.gtknphoqwx();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        cdpycssgdh cdpycssgdhVar = f113452jyumaefscl;
        if (cdpycssgdhVar != null) {
            cdpycssgdhVar.nufgyqmvbu();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        gg.wwaezpbzkn wwaezpbzknVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        cdpycssgdh cdpycssgdhVar = f113452jyumaefscl;
        if (cdpycssgdhVar != null) {
            cdpycssgdhVar.gtknphoqwx();
            wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        } else {
            wwaezpbzknVar = null;
        }
        if (wwaezpbzknVar == null) {
            f113453yggfygwlhe = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
    }
}
