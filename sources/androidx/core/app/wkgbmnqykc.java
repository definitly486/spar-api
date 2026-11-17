package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    protected static final Method f8466eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    protected static final Method f8467gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected static final Class f8468iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final Handler f8469lqeggnwhkg = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    protected static final Field f8470ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    protected static final Method f8471wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected static final Field f8472zoijcleaow;

    class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Object f8473yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ C0134wkgbmnqykc f8474zdlpuopuiu;

        iobyxmoadg(C0134wkgbmnqykc c0134wkgbmnqykc, Object obj) {
            this.f8474zdlpuopuiu = c0134wkgbmnqykc;
            this.f8473yggfygwlhe = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8474zdlpuopuiu.f8482zdlpuopuiu = this.f8473yggfygwlhe;
        }
    }

    class ppxfxbqfkf implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Object f8475yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Object f8476zdlpuopuiu;

        ppxfxbqfkf(Object obj, Object obj2) {
            this.f8476zdlpuopuiu = obj;
            this.f8475yggfygwlhe = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = wkgbmnqykc.f8471wkgbmnqykc;
                if (method != null) {
                    method.invoke(this.f8476zdlpuopuiu, this.f8475yggfygwlhe, Boolean.FALSE, "AppCompat recreation");
                } else {
                    wkgbmnqykc.f8466eablkybsjg.invoke(this.f8476zdlpuopuiu, this.f8475yggfygwlhe, Boolean.FALSE);
                }
            } catch (RuntimeException e13) {
                if (e13.getClass() == RuntimeException.class && e13.getMessage() != null && e13.getMessage().startsWith("Unable to stop")) {
                    throw e13;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    private static final class C0134wkgbmnqykc implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final int f8480jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private Activity f8481yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f8482zdlpuopuiu;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private boolean f8479iwizpuwonk = false;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private boolean f8477cqumvgiudr = false;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private boolean f8478esjtqupxsv = false;

        C0134wkgbmnqykc(Activity activity) {
            this.f8481yggfygwlhe = activity;
            this.f8480jyumaefscl = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f8481yggfygwlhe == activity) {
                this.f8481yggfygwlhe = null;
                this.f8477cqumvgiudr = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f8477cqumvgiudr || this.f8478esjtqupxsv || this.f8479iwizpuwonk || !wkgbmnqykc.nufgyqmvbu(this.f8482zdlpuopuiu, this.f8480jyumaefscl, activity)) {
                return;
            }
            this.f8478esjtqupxsv = true;
            this.f8482zdlpuopuiu = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f8481yggfygwlhe == activity) {
                this.f8479iwizpuwonk = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    class zoijcleaow implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ C0134wkgbmnqykc f8483yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Application f8484zdlpuopuiu;

        zoijcleaow(Application application, C0134wkgbmnqykc c0134wkgbmnqykc) {
            this.f8484zdlpuopuiu = application;
            this.f8483yggfygwlhe = c0134wkgbmnqykc;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8484zdlpuopuiu.unregisterActivityLifecycleCallbacks(this.f8483yggfygwlhe);
        }
    }

    static {
        Class clsIobyxmoadg = iobyxmoadg();
        f8468iobyxmoadg = clsIobyxmoadg;
        f8472zoijcleaow = zoijcleaow();
        f8470ppxfxbqfkf = gxszxtbevo();
        f8471wkgbmnqykc = wkgbmnqykc(clsIobyxmoadg);
        f8466eablkybsjg = ppxfxbqfkf(clsIobyxmoadg);
        f8467gxszxtbevo = eablkybsjg(clsIobyxmoadg);
    }

    static boolean dxjokdxxww(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (lqeggnwhkg() && f8467gxszxtbevo == null) {
            return false;
        }
        if (f8466eablkybsjg == null && f8471wkgbmnqykc == null) {
            return false;
        }
        try {
            Object obj2 = f8470ppxfxbqfkf.get(activity);
            if (obj2 == null || (obj = f8472zoijcleaow.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0134wkgbmnqykc c0134wkgbmnqykc = new C0134wkgbmnqykc(activity);
            application.registerActivityLifecycleCallbacks(c0134wkgbmnqykc);
            f8469lqeggnwhkg.post(new iobyxmoadg(c0134wkgbmnqykc, obj2));
            try {
                if (lqeggnwhkg()) {
                    Method method = f8467gxszxtbevo;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f8469lqeggnwhkg.post(new zoijcleaow(application, c0134wkgbmnqykc));
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Method eablkybsjg(Class cls) {
        if (lqeggnwhkg() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field gxszxtbevo() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class iobyxmoadg() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean lqeggnwhkg() {
        int i13 = Build.VERSION.SDK_INT;
        return i13 == 26 || i13 == 27;
    }

    protected static boolean nufgyqmvbu(Object obj, int i13, Activity activity) {
        try {
            Object obj2 = f8470ppxfxbqfkf.get(activity);
            if (obj2 == obj && activity.hashCode() == i13) {
                f8469lqeggnwhkg.postAtFrontOfQueue(new ppxfxbqfkf(f8472zoijcleaow.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    private static Method ppxfxbqfkf(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method wkgbmnqykc(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field zoijcleaow() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }
}
