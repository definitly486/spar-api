package bz;

import android.app.Activity;
import android.app.Activity$ScreenCaptureCallback;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.FileObserver;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class k extends metgxyhuhe {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static FileObserver f17493btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static FileObserver f17496gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static boolean f17497gxszxtbevo;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static Activity$ScreenCaptureCallback f17499nufgyqmvbu;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final AtomicInteger f17495eablkybsjg = new AtomicInteger(0);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final HashSet f17498lqeggnwhkg = new HashSet();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final Application.ActivityLifecycleCallbacks f17494dxjokdxxww = new zoijcleaow();

    class eablkybsjg extends FileObserver {
        eablkybsjg(File file, int i13) {
            super(file, i13);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i13, String str) {
            k.f17495eablkybsjg.getAndIncrement();
        }
    }

    class gxszxtbevo extends FileObserver {
        gxszxtbevo(File file, int i13) {
            super(file, i13);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i13, String str) {
            k.f17495eablkybsjg.getAndIncrement();
        }
    }

    class iobyxmoadg extends FileObserver {
        iobyxmoadg(String str, int i13) {
            super(str, i13);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i13, String str) {
            k.f17495eablkybsjg.getAndIncrement();
        }
    }

    class ppxfxbqfkf implements Activity$ScreenCaptureCallback {
        ppxfxbqfkf() {
        }

        public void onScreenCaptured() {
            k.f17495eablkybsjg.getAndIncrement();
        }
    }

    class wkgbmnqykc extends FileObserver {
        wkgbmnqykc(String str, int i13) {
            super(str, i13);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i13, String str) {
            k.f17495eablkybsjg.getAndIncrement();
        }
    }

    class zoijcleaow implements Application.ActivityLifecycleCallbacks {
        zoijcleaow() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            k.yadqdtsiqt(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            k.lmojexxdyd(activity);
        }
    }

    k() {
        super(kc2.lqeggnwhkg.ScreenshotCounter);
    }

    private static void cdpycssgdh() {
        if (f17493btonecajqb == null || f17496gtknphoqwx == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Environment.getExternalStorageDirectory().getAbsolutePath());
                String str = File.separator;
                sb3.append(str);
                sb3.append(Environment.DIRECTORY_PICTURES);
                sb3.append(str);
                sb3.append(Environment.DIRECTORY_SCREENSHOTS);
                sb3.append(str);
                File file = new File(sb3.toString());
                File file2 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + str + Environment.DIRECTORY_DCIM + str + Environment.DIRECTORY_SCREENSHOTS + str);
                f17493btonecajqb = new gxszxtbevo(file, UserVerificationMethods.USER_VERIFY_HANDPRINT);
                f17496gtknphoqwx = new eablkybsjg(file2, UserVerificationMethods.USER_VERIFY_HANDPRINT);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(Environment.getExternalStorageDirectory().getAbsolutePath());
                String str2 = File.separator;
                sb4.append(str2);
                sb4.append(Environment.DIRECTORY_PICTURES);
                sb4.append(str2);
                sb4.append("Screenshots");
                sb4.append(str2);
                String string = sb4.toString();
                String str3 = Environment.getExternalStorageDirectory().getAbsolutePath() + str2 + Environment.DIRECTORY_DCIM + str2 + "Screenshots" + str2;
                f17493btonecajqb = new iobyxmoadg(string, UserVerificationMethods.USER_VERIFY_HANDPRINT);
                f17496gtknphoqwx = new wkgbmnqykc(str3, UserVerificationMethods.USER_VERIFY_HANDPRINT);
            }
            f17493btonecajqb.startWatching();
            f17496gtknphoqwx.startWatching();
        }
    }

    private static void dsvhmnatus(Context context) throws q2 {
        if (jpowsppfya()) {
            wypolnanlu(context, t6.ppxfxbqfkf.DETECT_SCREEN_CAPTURE);
        } else {
            wypolnanlu(context, t6.ppxfxbqfkf.READ_EXTERNAL_STORAGE);
        }
    }

    public static synchronized void iozdgvuglv(Context context) {
        try {
            if (f17497gxszxtbevo) {
                return;
            }
            dsvhmnatus(context);
            f17495eablkybsjg.set(0);
            if (jpowsppfya()) {
                ylkuphrtab(context);
            } else {
                cdpycssgdh();
            }
            f17497gxszxtbevo = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static boolean jpowsppfya() {
        return Build.VERSION.SDK_INT >= 34;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void lmojexxdyd(Activity activity) {
        if (f17498lqeggnwhkg.remove(activity)) {
            activity.unregisterScreenCaptureCallback(f17499nufgyqmvbu);
        }
    }

    private static boolean pkzmftpjix(Context context, t6.ppxfxbqfkf ppxfxbqfkfVar) {
        return t6.skhdrjzrfn.iobyxmoadg(context, ppxfxbqfkfVar.iobyxmoadg());
    }

    private static void wypolnanlu(Context context, t6.ppxfxbqfkf ppxfxbqfkfVar) throws q2 {
        if (!pkzmftpjix(context, ppxfxbqfkfVar)) {
            throw new q2(ppxfxbqfkfVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void yadqdtsiqt(Activity activity) {
        try {
            if (f17499nufgyqmvbu == null) {
                f17499nufgyqmvbu = new ppxfxbqfkf();
            }
            activity.registerScreenCaptureCallback(activity.getMainExecutor(), f17499nufgyqmvbu);
            f17498lqeggnwhkg.add(activity);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static synchronized void ylkuphrtab(Context context) {
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(f17494dxjokdxxww);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: hcddaimhww, reason: merged with bridge method [inline-methods] */
    public Integer lereixgezr() throws jrbgnlbqoe {
        if (f17497gxszxtbevo) {
            return Integer.valueOf(f17495eablkybsjg.intValue());
        }
        throw new jrbgnlbqoe("not started and/or permission denied");
    }
}
