package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ub.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f24254iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final zdlpuopuiu f24255lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final tc.zoijcleaow f24256nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wflxmlrfwp f24257ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ub.agtfadlqog f24258wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f24259zoijcleaow;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final Object f24249gtknphoqwx = new Object();

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    static final Map f24248draadjrbmk = new androidx.collection.iobyxmoadg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final AtomicBoolean f24252eablkybsjg = new AtomicBoolean(false);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final AtomicBoolean f24253gxszxtbevo = new AtomicBoolean();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final List f24251dxjokdxxww = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final List f24250btonecajqb = new CopyOnWriteArrayList();

    public interface iobyxmoadg {
        void onBackgroundStateChanged(boolean z13);
    }

    private static class ppxfxbqfkf extends BroadcastReceiver {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static AtomicReference f24260zoijcleaow = new AtomicReference();

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f24261iobyxmoadg;

        public ppxfxbqfkf(Context context) {
            this.f24261iobyxmoadg = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void zoijcleaow(Context context) {
            if (f24260zoijcleaow.get() == null) {
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(context);
                if (mbcevpiqjq.wkgbmnqykc.iobyxmoadg(f24260zoijcleaow, null, ppxfxbqfkfVar)) {
                    context.registerReceiver(ppxfxbqfkfVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (gxszxtbevo.f24249gtknphoqwx) {
                try {
                    Iterator it = gxszxtbevo.f24248draadjrbmk.values().iterator();
                    while (it.hasNext()) {
                        ((gxszxtbevo) it.next()).rgvfuqvkyq();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ppxfxbqfkf();
        }

        public void ppxfxbqfkf() {
            this.f24261iobyxmoadg.unregisterReceiver(this);
        }
    }

    private static class zoijcleaow implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static AtomicReference f24262iobyxmoadg = new AtomicReference();

        private zoijcleaow() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void zoijcleaow(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f24262iobyxmoadg.get() == null) {
                    zoijcleaow zoijcleaowVar = new zoijcleaow();
                    if (mbcevpiqjq.wkgbmnqykc.iobyxmoadg(f24262iobyxmoadg, null, zoijcleaowVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(zoijcleaowVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z13) {
            synchronized (gxszxtbevo.f24249gtknphoqwx) {
                try {
                    for (gxszxtbevo gxszxtbevoVar : new ArrayList(gxszxtbevo.f24248draadjrbmk.values())) {
                        if (gxszxtbevoVar.f24252eablkybsjg.get()) {
                            gxszxtbevoVar.esjtqupxsv(z13);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    protected gxszxtbevo(final Context context, String str, wflxmlrfwp wflxmlrfwpVar) {
        this.f24254iobyxmoadg = (Context) Preconditions.checkNotNull(context);
        this.f24259zoijcleaow = Preconditions.checkNotEmpty(str);
        this.f24257ppxfxbqfkf = (wflxmlrfwp) Preconditions.checkNotNull(wflxmlrfwpVar);
        agtfadlqog agtfadlqogVarZoijcleaow = FirebaseInitProvider.zoijcleaow();
        xd.ppxfxbqfkf.zoijcleaow("Firebase");
        xd.ppxfxbqfkf.zoijcleaow("ComponentDiscovery");
        List listZoijcleaow = ub.gxszxtbevo.ppxfxbqfkf(context, ComponentDiscoveryService.class).zoijcleaow();
        xd.ppxfxbqfkf.iobyxmoadg();
        xd.ppxfxbqfkf.zoijcleaow("Runtime");
        ub.agtfadlqog.zoijcleaow zoijcleaowVarLqeggnwhkg = ub.agtfadlqog.wflxmlrfwp(vb.gtknphoqwx.INSTANCE).wkgbmnqykc(listZoijcleaow).ppxfxbqfkf(new FirebaseCommonRegistrar()).ppxfxbqfkf(new ExecutorsRegistrar()).zoijcleaow(ub.ppxfxbqfkf.kcexrzcfyt(context, Context.class, new Class[0])).zoijcleaow(ub.ppxfxbqfkf.kcexrzcfyt(this, gxszxtbevo.class, new Class[0])).zoijcleaow(ub.ppxfxbqfkf.kcexrzcfyt(wflxmlrfwpVar, wflxmlrfwp.class, new Class[0])).lqeggnwhkg(new xd.zoijcleaow());
        if (q1.draadjrbmk.iobyxmoadg(context) && FirebaseInitProvider.ppxfxbqfkf()) {
            zoijcleaowVarLqeggnwhkg.zoijcleaow(ub.ppxfxbqfkf.kcexrzcfyt(agtfadlqogVarZoijcleaow, agtfadlqog.class, new Class[0]));
        }
        ub.agtfadlqog agtfadlqogVarEablkybsjg = zoijcleaowVarLqeggnwhkg.eablkybsjg();
        this.f24258wkgbmnqykc = agtfadlqogVarEablkybsjg;
        xd.ppxfxbqfkf.iobyxmoadg();
        this.f24255lqeggnwhkg = new zdlpuopuiu(new tc.zoijcleaow() { // from class: com.google.firebase.wkgbmnqykc
            @Override // tc.zoijcleaow
            public final Object get() {
                return this.f24907iobyxmoadg.jyumaefscl(context);
            }
        });
        this.f24256nufgyqmvbu = agtfadlqogVarEablkybsjg.gxszxtbevo(rc.gxszxtbevo.class);
        lqeggnwhkg(new iobyxmoadg() { // from class: com.google.firebase.eablkybsjg
            @Override // com.google.firebase.gxszxtbevo.iobyxmoadg
            public final void onBackgroundStateChanged(boolean z13) {
                this.f24247iobyxmoadg.iwizpuwonk(z13);
            }
        });
        xd.ppxfxbqfkf.iobyxmoadg();
    }

    private static String cqumvgiudr(String str) {
        return str.trim();
    }

    public static gxszxtbevo draadjrbmk() {
        gxszxtbevo gxszxtbevoVar;
        synchronized (f24249gtknphoqwx) {
            try {
                gxszxtbevoVar = (gxszxtbevo) f24248draadjrbmk.get("[DEFAULT]");
                if (gxszxtbevoVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((rc.gxszxtbevo) gxszxtbevoVar.f24256nufgyqmvbu.get()).draadjrbmk();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gxszxtbevoVar;
    }

    private void dxjokdxxww() {
        Preconditions.checkState(!this.f24253gxszxtbevo.get(), "FirebaseApp was deleted");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void esjtqupxsv(boolean z13) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f24251dxjokdxxww.iterator();
        while (it.hasNext()) {
            ((iobyxmoadg) it.next()).onBackgroundStateChanged(z13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void iwizpuwonk(boolean z13) {
        if (z13) {
            return;
        }
        ((rc.gxszxtbevo) this.f24256nufgyqmvbu.get()).draadjrbmk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ yc.iobyxmoadg jyumaefscl(Context context) {
        return new yc.iobyxmoadg(context, ojitshcjhn(), (qc.ppxfxbqfkf) this.f24258wkgbmnqykc.iobyxmoadg(qc.ppxfxbqfkf.class));
    }

    public static gxszxtbevo kcexrzcfyt(Context context, wflxmlrfwp wflxmlrfwpVar, String str) {
        gxszxtbevo gxszxtbevoVar;
        zoijcleaow.zoijcleaow(context);
        String strCqumvgiudr = cqumvgiudr(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f24249gtknphoqwx) {
            Map map = f24248draadjrbmk;
            Preconditions.checkState(!map.containsKey(strCqumvgiudr), "FirebaseApp name " + strCqumvgiudr + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            gxszxtbevoVar = new gxszxtbevo(context, strCqumvgiudr, wflxmlrfwpVar);
            map.put(strCqumvgiudr, gxszxtbevoVar);
        }
        gxszxtbevoVar.rgvfuqvkyq();
        return gxszxtbevoVar;
    }

    public static gxszxtbevo oxmwwwfdhm(Context context, wflxmlrfwp wflxmlrfwpVar) {
        return kcexrzcfyt(context, wflxmlrfwpVar, "[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rgvfuqvkyq() {
        if (!q1.draadjrbmk.iobyxmoadg(this.f24254iobyxmoadg)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + wflxmlrfwp());
            ppxfxbqfkf.zoijcleaow(this.f24254iobyxmoadg);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + wflxmlrfwp());
        this.f24258wkgbmnqykc.rgvfuqvkyq(yggfygwlhe());
        ((rc.gxszxtbevo) this.f24256nufgyqmvbu.get()).draadjrbmk();
    }

    public static gxszxtbevo vdvldrhtss(Context context) {
        synchronized (f24249gtknphoqwx) {
            try {
                if (f24248draadjrbmk.containsKey("[DEFAULT]")) {
                    return draadjrbmk();
                }
                wflxmlrfwp wflxmlrfwpVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(context);
                if (wflxmlrfwpVarIobyxmoadg == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return oxmwwwfdhm(context, wflxmlrfwpVarIobyxmoadg);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public wflxmlrfwp agtfadlqog() {
        dxjokdxxww();
        return this.f24257ppxfxbqfkf;
    }

    public Object btonecajqb(Class cls) {
        dxjokdxxww();
        return this.f24258wkgbmnqykc.iobyxmoadg(cls);
    }

    public boolean equals(Object obj) {
        if (obj instanceof gxszxtbevo) {
            return this.f24259zoijcleaow.equals(((gxszxtbevo) obj).wflxmlrfwp());
        }
        return false;
    }

    public Context gtknphoqwx() {
        dxjokdxxww();
        return this.f24254iobyxmoadg;
    }

    public int hashCode() {
        return this.f24259zoijcleaow.hashCode();
    }

    public void lqeggnwhkg(iobyxmoadg iobyxmoadgVar) {
        dxjokdxxww();
        if (this.f24252eablkybsjg.get() && BackgroundDetector.getInstance().isInBackground()) {
            iobyxmoadgVar.onBackgroundStateChanged(true);
        }
        this.f24251dxjokdxxww.add(iobyxmoadgVar);
    }

    public void nufgyqmvbu(lqeggnwhkg lqeggnwhkgVar) {
        dxjokdxxww();
        Preconditions.checkNotNull(lqeggnwhkgVar);
        this.f24250btonecajqb.add(lqeggnwhkgVar);
    }

    public String ojitshcjhn() {
        return Base64Utils.encodeUrlSafeNoPadding(wflxmlrfwp().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(agtfadlqog().ppxfxbqfkf().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return Objects.toStringHelper(this).add(ExternalMetricsManagerImpl.NAME, this.f24259zoijcleaow).add("options", this.f24257ppxfxbqfkf).toString();
    }

    public String wflxmlrfwp() {
        dxjokdxxww();
        return this.f24259zoijcleaow;
    }

    public boolean yggfygwlhe() {
        return "[DEFAULT]".equals(wflxmlrfwp());
    }

    public boolean zdlpuopuiu() {
        dxjokdxxww();
        return ((yc.iobyxmoadg) this.f24255lqeggnwhkg.get()).zoijcleaow();
    }
}
