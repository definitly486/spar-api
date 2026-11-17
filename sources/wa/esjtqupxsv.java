package wa;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class esjtqupxsv {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static final Map f119116ojitshcjhn = new HashMap();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final ua.vdvldrhtss f119117agtfadlqog;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private ServiceConnection f119119draadjrbmk;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f119124iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f119125lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Intent f119126nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private IInterface f119128wflxmlrfwp;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final agtfadlqog f119130zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f119129wkgbmnqykc = new ArrayList();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Set f119121eablkybsjg = new HashSet();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Object f119123gxszxtbevo = new Object();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final IBinder.DeathRecipient f119118btonecajqb = new IBinder.DeathRecipient() { // from class: wa.vdvldrhtss
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            esjtqupxsv.nufgyqmvbu(this.f119145iobyxmoadg);
        }
    };

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final AtomicInteger f119122gtknphoqwx = new AtomicInteger(0);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f119127ppxfxbqfkf = "IntegrityService";

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final WeakReference f119120dxjokdxxww = new WeakReference(null);

    public esjtqupxsv(Context context, agtfadlqog agtfadlqogVar, String str, Intent intent, ua.vdvldrhtss vdvldrhtssVar, zdlpuopuiu zdlpuopuiuVar, byte[] bArr) {
        this.f119124iobyxmoadg = context;
        this.f119130zoijcleaow = agtfadlqogVar;
        this.f119126nufgyqmvbu = intent;
        this.f119117agtfadlqog = vdvldrhtssVar;
    }

    static /* bridge */ /* synthetic */ void agtfadlqog(esjtqupxsv esjtqupxsvVar) {
        esjtqupxsvVar.f119130zoijcleaow.wkgbmnqykc("linkToDeath", new Object[0]);
        try {
            esjtqupxsvVar.f119128wflxmlrfwp.asBinder().linkToDeath(esjtqupxsvVar.f119118btonecajqb, 0);
        } catch (RemoteException e13) {
            esjtqupxsvVar.f119130zoijcleaow.ppxfxbqfkf(e13, "linkToDeath failed", new Object[0]);
        }
    }

    private final RemoteException kcexrzcfyt() {
        return new RemoteException(String.valueOf(this.f119127ppxfxbqfkf).concat(" : Binder has died."));
    }

    public static /* synthetic */ void nufgyqmvbu(esjtqupxsv esjtqupxsvVar) {
        esjtqupxsvVar.f119130zoijcleaow.wkgbmnqykc("reportBinderDeath", new Object[0]);
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(esjtqupxsvVar.f119120dxjokdxxww.get());
        esjtqupxsvVar.f119130zoijcleaow.wkgbmnqykc("%s : Binder has died.", esjtqupxsvVar.f119127ppxfxbqfkf);
        Iterator it = esjtqupxsvVar.f119129wkgbmnqykc.iterator();
        while (it.hasNext()) {
            ((ojitshcjhn) it.next()).iobyxmoadg(esjtqupxsvVar.kcexrzcfyt());
        }
        esjtqupxsvVar.f119129wkgbmnqykc.clear();
        esjtqupxsvVar.zdlpuopuiu();
    }

    static /* bridge */ /* synthetic */ void ojitshcjhn(esjtqupxsv esjtqupxsvVar) {
        esjtqupxsvVar.f119130zoijcleaow.wkgbmnqykc("unlinkToDeath", new Object[0]);
        esjtqupxsvVar.f119128wflxmlrfwp.asBinder().unlinkToDeath(esjtqupxsvVar.f119118btonecajqb, 0);
    }

    static /* bridge */ /* synthetic */ void wflxmlrfwp(esjtqupxsv esjtqupxsvVar, ojitshcjhn ojitshcjhnVar) {
        if (esjtqupxsvVar.f119128wflxmlrfwp != null || esjtqupxsvVar.f119125lqeggnwhkg) {
            if (!esjtqupxsvVar.f119125lqeggnwhkg) {
                ojitshcjhnVar.run();
                return;
            } else {
                esjtqupxsvVar.f119130zoijcleaow.wkgbmnqykc("Waiting to bind to the service.", new Object[0]);
                esjtqupxsvVar.f119129wkgbmnqykc.add(ojitshcjhnVar);
                return;
            }
        }
        esjtqupxsvVar.f119130zoijcleaow.wkgbmnqykc("Initiate binding to the service.", new Object[0]);
        esjtqupxsvVar.f119129wkgbmnqykc.add(ojitshcjhnVar);
        cqumvgiudr cqumvgiudrVar = new cqumvgiudr(esjtqupxsvVar, null);
        esjtqupxsvVar.f119119draadjrbmk = cqumvgiudrVar;
        esjtqupxsvVar.f119125lqeggnwhkg = true;
        if (esjtqupxsvVar.f119124iobyxmoadg.bindService(esjtqupxsvVar.f119126nufgyqmvbu, cqumvgiudrVar, 1)) {
            return;
        }
        esjtqupxsvVar.f119130zoijcleaow.wkgbmnqykc("Failed to bind to the service.", new Object[0]);
        esjtqupxsvVar.f119125lqeggnwhkg = false;
        Iterator it = esjtqupxsvVar.f119129wkgbmnqykc.iterator();
        while (it.hasNext()) {
            ((ojitshcjhn) it.next()).iobyxmoadg(new w());
        }
        esjtqupxsvVar.f119129wkgbmnqykc.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zdlpuopuiu() {
        synchronized (this.f119123gxszxtbevo) {
            try {
                Iterator it = this.f119121eablkybsjg.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(kcexrzcfyt());
                }
                this.f119121eablkybsjg.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final IInterface eablkybsjg() {
        return this.f119128wflxmlrfwp;
    }

    public final void oxmwwwfdhm(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f119123gxszxtbevo) {
            this.f119121eablkybsjg.remove(taskCompletionSource);
        }
        synchronized (this.f119123gxszxtbevo) {
            try {
                if (this.f119122gtknphoqwx.get() > 0 && this.f119122gtknphoqwx.decrementAndGet() > 0) {
                    this.f119130zoijcleaow.wkgbmnqykc("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    ppxfxbqfkf().post(new kcexrzcfyt(this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Handler ppxfxbqfkf() {
        Handler handler;
        Map map = f119116ojitshcjhn;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f119127ppxfxbqfkf)) {
                    HandlerThread handlerThread = new HandlerThread(this.f119127ppxfxbqfkf, 10);
                    handlerThread.start();
                    map.put(this.f119127ppxfxbqfkf, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f119127ppxfxbqfkf);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void rgvfuqvkyq(ojitshcjhn ojitshcjhnVar, final TaskCompletionSource taskCompletionSource) {
        synchronized (this.f119123gxszxtbevo) {
            this.f119121eablkybsjg.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: wa.rgvfuqvkyq
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    this.f119143iobyxmoadg.vdvldrhtss(taskCompletionSource, task);
                }
            });
        }
        synchronized (this.f119123gxszxtbevo) {
            try {
                if (this.f119122gtknphoqwx.getAndIncrement() > 0) {
                    this.f119130zoijcleaow.iobyxmoadg("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ppxfxbqfkf().post(new oxmwwwfdhm(this, ojitshcjhnVar.ppxfxbqfkf(), ojitshcjhnVar));
    }

    final /* synthetic */ void vdvldrhtss(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f119123gxszxtbevo) {
            this.f119121eablkybsjg.remove(taskCompletionSource);
        }
    }
}
