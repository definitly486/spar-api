package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    static ppxfxbqfkf f2662zdlpuopuiu = new ppxfxbqfkf(new wkgbmnqykc());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static int f2661yggfygwlhe = -100;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static q1.nufgyqmvbu f2658jyumaefscl = null;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static q1.nufgyqmvbu f2657iwizpuwonk = null;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static Boolean f2655cqumvgiudr = null;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static boolean f2656esjtqupxsv = false;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final androidx.collection.zoijcleaow f2659lereixgezr = new androidx.collection.zoijcleaow();

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final Object f2660pmvmpeiblj = new Object();

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final Object f2663zynmafqrjb = new Object();

    static class iobyxmoadg {
        static LocaleList iobyxmoadg(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class ppxfxbqfkf implements Executor {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Runnable f2664iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final Executor f2665jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Object f2667zdlpuopuiu = new Object();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final Queue f2666yggfygwlhe = new ArrayDeque();

        ppxfxbqfkf(Executor executor) {
            this.f2665jyumaefscl = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zoijcleaow(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                ppxfxbqfkf();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f2667zdlpuopuiu) {
                try {
                    this.f2666yggfygwlhe.add(new Runnable() { // from class: androidx.appcompat.app.nufgyqmvbu
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f2669zdlpuopuiu.zoijcleaow(runnable);
                        }
                    });
                    if (this.f2664iwizpuwonk == null) {
                        ppxfxbqfkf();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        protected void ppxfxbqfkf() {
            synchronized (this.f2667zdlpuopuiu) {
                try {
                    Runnable runnable = (Runnable) this.f2666yggfygwlhe.poll();
                    this.f2664iwizpuwonk = runnable;
                    if (runnable != null) {
                        this.f2665jyumaefscl.execute(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static class wkgbmnqykc implements Executor {
        wkgbmnqykc() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    static class zoijcleaow {
        static LocaleList iobyxmoadg(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void zoijcleaow(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    lqeggnwhkg() {
    }

    public static lqeggnwhkg btonecajqb(Activity activity, eablkybsjg eablkybsjgVar) {
        return new AppCompatDelegateImpl(activity, eablkybsjgVar);
    }

    public static void cllcsxoeiz(int i13) {
        if (i13 != -1 && i13 != 0 && i13 != 1 && i13 != 2 && i13 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f2661yggfygwlhe != i13) {
            f2661yggfygwlhe = i13;
            lqeggnwhkg();
        }
    }

    static boolean cqumvgiudr(Context context) {
        if (f2655cqumvgiudr == null) {
            try {
                Bundle bundle = oxmwwwfdhm.iobyxmoadg(context).metaData;
                if (bundle != null) {
                    f2655cqumvgiudr = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f2655cqumvgiudr = Boolean.FALSE;
            }
        }
        return f2655cqumvgiudr.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void esjtqupxsv(Context context) {
        mbcevpiqjq(context);
        f2656esjtqupxsv = true;
    }

    public static lqeggnwhkg gtknphoqwx(Dialog dialog, eablkybsjg eablkybsjgVar) {
        return new AppCompatDelegateImpl(dialog, eablkybsjgVar);
    }

    private static void lqeggnwhkg() {
        synchronized (f2660pmvmpeiblj) {
            try {
                Iterator it = f2659lereixgezr.iterator();
                while (it.hasNext()) {
                    lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) ((WeakReference) it.next()).get();
                    if (lqeggnwhkgVar != null) {
                        lqeggnwhkgVar.gxszxtbevo();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void mbcevpiqjq(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (wflxmlrfwp().eablkybsjg()) {
                    String strZoijcleaow = androidx.core.app.eablkybsjg.zoijcleaow(context);
                    Object systemService = context.getSystemService(CommonUrlParts.LOCALE);
                    if (systemService != null) {
                        zoijcleaow.zoijcleaow(systemService, iobyxmoadg.iobyxmoadg(strZoijcleaow));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    static void ntlheqmsrt(final Context context) {
        if (cqumvgiudr(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f2656esjtqupxsv) {
                    return;
                }
                f2662zdlpuopuiu.execute(new Runnable() { // from class: androidx.appcompat.app.gxszxtbevo
                    @Override // java.lang.Runnable
                    public final void run() {
                        lqeggnwhkg.esjtqupxsv(context);
                    }
                });
                return;
            }
            synchronized (f2663zynmafqrjb) {
                try {
                    q1.nufgyqmvbu nufgyqmvbuVar = f2658jyumaefscl;
                    if (nufgyqmvbuVar == null) {
                        if (f2657iwizpuwonk == null) {
                            f2657iwizpuwonk = q1.nufgyqmvbu.zoijcleaow(androidx.core.app.eablkybsjg.zoijcleaow(context));
                        }
                        if (f2657iwizpuwonk.eablkybsjg()) {
                        } else {
                            f2658jyumaefscl = f2657iwizpuwonk;
                        }
                    } else if (!nufgyqmvbuVar.equals(f2657iwizpuwonk)) {
                        q1.nufgyqmvbu nufgyqmvbuVar2 = f2658jyumaefscl;
                        f2657iwizpuwonk = nufgyqmvbuVar2;
                        androidx.core.app.eablkybsjg.iobyxmoadg(context, nufgyqmvbuVar2.lqeggnwhkg());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static int ojitshcjhn() {
        return f2661yggfygwlhe;
    }

    static Object oxmwwwfdhm() {
        Context contextAgtfadlqog;
        Iterator it = f2659lereixgezr.iterator();
        while (it.hasNext()) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) ((WeakReference) it.next()).get();
            if (lqeggnwhkgVar != null && (contextAgtfadlqog = lqeggnwhkgVar.agtfadlqog()) != null) {
                return contextAgtfadlqog.getSystemService(CommonUrlParts.LOCALE);
            }
        }
        return null;
    }

    public static q1.nufgyqmvbu wflxmlrfwp() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objOxmwwwfdhm = oxmwwwfdhm();
            if (objOxmwwwfdhm != null) {
                return q1.nufgyqmvbu.dxjokdxxww(zoijcleaow.iobyxmoadg(objOxmwwwfdhm));
            }
        } else {
            q1.nufgyqmvbu nufgyqmvbuVar = f2658jyumaefscl;
            if (nufgyqmvbuVar != null) {
                return nufgyqmvbuVar;
            }
        }
        return q1.nufgyqmvbu.wkgbmnqykc();
    }

    static void wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar) {
        synchronized (f2660pmvmpeiblj) {
            ylkuphrtab(lqeggnwhkgVar);
            f2659lereixgezr.add(new WeakReference(lqeggnwhkgVar));
        }
    }

    static void wwaezpbzkn(lqeggnwhkg lqeggnwhkgVar) {
        synchronized (f2660pmvmpeiblj) {
            ylkuphrtab(lqeggnwhkgVar);
        }
    }

    private static void ylkuphrtab(lqeggnwhkg lqeggnwhkgVar) {
        synchronized (f2660pmvmpeiblj) {
            try {
                Iterator it = f2659lereixgezr.iterator();
                while (it.hasNext()) {
                    lqeggnwhkg lqeggnwhkgVar2 = (lqeggnwhkg) ((WeakReference) it.next()).get();
                    if (lqeggnwhkgVar2 == lqeggnwhkgVar || lqeggnwhkgVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static q1.nufgyqmvbu zdlpuopuiu() {
        return f2658jyumaefscl;
    }

    public abstract Context agtfadlqog();

    public abstract void cdpycssgdh();

    public abstract View draadjrbmk(int i13);

    public void dsvhmnatus(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public Context dxjokdxxww(Context context) {
        nufgyqmvbu(context);
        return context;
    }

    public abstract void eablkybsjg(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean gxszxtbevo();

    public abstract void hcddaimhww(int i13);

    public abstract void hkdspvbjdz(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void iozdgvuglv();

    public abstract void istkbnxepw(Bundle bundle);

    public abstract void iwizpuwonk();

    public abstract void jpowsppfya(View view);

    public abstract void jyumaefscl();

    public abstract MenuInflater kcexrzcfyt();

    public abstract void kegysxyocb(CharSequence charSequence);

    public abstract void lereixgezr(Configuration configuration);

    public abstract void lmojexxdyd();

    public void nufgyqmvbu(Context context) {
    }

    public abstract boolean pkzmftpjix(int i13);

    public abstract void pmvmpeiblj(Bundle bundle);

    public abstract androidx.appcompat.app.zoijcleaow rgvfuqvkyq();

    public abstract void stevsuqkhv(int i13);

    public abstract androidx.appcompat.view.zoijcleaow tzroggbefp(androidx.appcompat.view.zoijcleaow.iobyxmoadg iobyxmoadgVar);

    public abstract int vdvldrhtss();

    public abstract void wypolnanlu(Toolbar toolbar);

    public abstract void yadqdtsiqt(Bundle bundle);

    public abstract androidx.appcompat.app.iobyxmoadg yggfygwlhe();

    public abstract void zynmafqrjb();
}
