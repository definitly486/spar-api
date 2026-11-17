package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ServiceConnection f13168btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final Runnable f13169draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final AtomicBoolean f13170dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f13171eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final Runnable f13172gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public wkgbmnqykc.ppxfxbqfkf f13173gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f13174iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private androidx.room.ppxfxbqfkf f13175lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final androidx.room.zoijcleaow f13176nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Executor f13177ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Context f13178wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f13179zoijcleaow;

    public static final class iobyxmoadg extends wkgbmnqykc.ppxfxbqfkf {
        iobyxmoadg(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.wkgbmnqykc.ppxfxbqfkf
        public void ppxfxbqfkf(Set tables) {
            zdlpuopuiu.btonecajqb(tables, "tables");
            if (eablkybsjg.this.btonecajqb().get()) {
                return;
            }
            try {
                androidx.room.ppxfxbqfkf ppxfxbqfkfVarNufgyqmvbu = eablkybsjg.this.nufgyqmvbu();
                if (ppxfxbqfkfVarNufgyqmvbu != null) {
                    ppxfxbqfkfVarNufgyqmvbu.lqeggnwhkg(eablkybsjg.this.ppxfxbqfkf(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e13) {
                Log.w("ROOM", "Cannot broadcast invalidation", e13);
            }
        }

        @Override // androidx.room.wkgbmnqykc.ppxfxbqfkf
        public boolean zoijcleaow() {
            return true;
        }
    }

    public static final class ppxfxbqfkf implements ServiceConnection {
        ppxfxbqfkf() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(service, "service");
            eablkybsjg.this.wflxmlrfwp(androidx.room.ppxfxbqfkf.iobyxmoadg.wflxmlrfwp(service));
            eablkybsjg.this.wkgbmnqykc().execute(eablkybsjg.this.dxjokdxxww());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            zdlpuopuiu.btonecajqb(name, "name");
            eablkybsjg.this.wkgbmnqykc().execute(eablkybsjg.this.lqeggnwhkg());
            eablkybsjg.this.wflxmlrfwp(null);
        }
    }

    public static final class zoijcleaow extends androidx.room.zoijcleaow.iobyxmoadg {
        zoijcleaow() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ojitshcjhn(eablkybsjg this$0, String[] tables) {
            zdlpuopuiu.btonecajqb(this$0, "this$0");
            zdlpuopuiu.btonecajqb(tables, "$tables");
            this$0.eablkybsjg().wflxmlrfwp((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.zoijcleaow
        public void zoijcleaow(final String[] tables) {
            zdlpuopuiu.btonecajqb(tables, "tables");
            Executor executorWkgbmnqykc = eablkybsjg.this.wkgbmnqykc();
            final eablkybsjg eablkybsjgVar = eablkybsjg.this;
            executorWkgbmnqykc.execute(new Runnable() { // from class: n5.rgvfuqvkyq
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.room.eablkybsjg.zoijcleaow.ojitshcjhn(eablkybsjgVar, tables);
                }
            });
        }
    }

    public eablkybsjg(Context context, String name, Intent serviceIntent, wkgbmnqykc invalidationTracker, Executor executor) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(serviceIntent, "serviceIntent");
        zdlpuopuiu.btonecajqb(invalidationTracker, "invalidationTracker");
        zdlpuopuiu.btonecajqb(executor, "executor");
        this.f13174iobyxmoadg = name;
        this.f13179zoijcleaow = invalidationTracker;
        this.f13177ppxfxbqfkf = executor;
        Context applicationContext = context.getApplicationContext();
        this.f13178wkgbmnqykc = applicationContext;
        this.f13176nufgyqmvbu = new zoijcleaow();
        this.f13170dxjokdxxww = new AtomicBoolean(false);
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        this.f13168btonecajqb = ppxfxbqfkfVar;
        this.f13172gtknphoqwx = new Runnable() { // from class: n5.agtfadlqog
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.eablkybsjg.agtfadlqog(this.f68789zdlpuopuiu);
            }
        };
        this.f13169draadjrbmk = new Runnable() { // from class: n5.ojitshcjhn
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.eablkybsjg.gtknphoqwx(this.f68836zdlpuopuiu);
            }
        };
        draadjrbmk(new iobyxmoadg((String[]) invalidationTracker.gtknphoqwx().keySet().toArray(new String[0])));
        applicationContext.bindService(serviceIntent, ppxfxbqfkfVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(eablkybsjg this$0) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        try {
            androidx.room.ppxfxbqfkf ppxfxbqfkfVar = this$0.f13175lqeggnwhkg;
            if (ppxfxbqfkfVar != null) {
                this$0.f13171eablkybsjg = ppxfxbqfkfVar.btonecajqb(this$0.f13176nufgyqmvbu, this$0.f13174iobyxmoadg);
                this$0.f13179zoijcleaow.ppxfxbqfkf(this$0.gxszxtbevo());
            }
        } catch (RemoteException e13) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(eablkybsjg this$0) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        this$0.f13179zoijcleaow.rgvfuqvkyq(this$0.gxszxtbevo());
    }

    public final AtomicBoolean btonecajqb() {
        return this.f13170dxjokdxxww;
    }

    public final void draadjrbmk(wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<set-?>");
        this.f13173gxszxtbevo = ppxfxbqfkfVar;
    }

    public final Runnable dxjokdxxww() {
        return this.f13172gtknphoqwx;
    }

    public final wkgbmnqykc eablkybsjg() {
        return this.f13179zoijcleaow;
    }

    public final wkgbmnqykc.ppxfxbqfkf gxszxtbevo() {
        wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = this.f13173gxszxtbevo;
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar;
        }
        zdlpuopuiu.pmvmpeiblj("observer");
        return null;
    }

    public final Runnable lqeggnwhkg() {
        return this.f13169draadjrbmk;
    }

    public final androidx.room.ppxfxbqfkf nufgyqmvbu() {
        return this.f13175lqeggnwhkg;
    }

    public final int ppxfxbqfkf() {
        return this.f13171eablkybsjg;
    }

    public final void wflxmlrfwp(androidx.room.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f13175lqeggnwhkg = ppxfxbqfkfVar;
    }

    public final Executor wkgbmnqykc() {
        return this.f13177ppxfxbqfkf;
    }
}
