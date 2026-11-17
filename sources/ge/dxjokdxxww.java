package ge;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class dxjokdxxww {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static dxjokdxxww f36902ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Object f36903zoijcleaow = new Object();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private ub.agtfadlqog f36904iobyxmoadg;

    private dxjokdxxww() {
    }

    public static dxjokdxxww eablkybsjg(Context context, Executor executor) {
        dxjokdxxww dxjokdxxwwVar;
        synchronized (f36903zoijcleaow) {
            Preconditions.checkState(f36902ppxfxbqfkf == null, "MlKitContext is already initialized");
            dxjokdxxww dxjokdxxwwVar2 = new dxjokdxxww();
            f36902ppxfxbqfkf = dxjokdxxwwVar2;
            Context contextGxszxtbevo = gxszxtbevo(context);
            ub.agtfadlqog agtfadlqogVarEablkybsjg = ub.agtfadlqog.wflxmlrfwp(executor).wkgbmnqykc(ub.gxszxtbevo.ppxfxbqfkf(contextGxszxtbevo, MlKitComponentDiscoveryService.class).zoijcleaow()).zoijcleaow(ub.ppxfxbqfkf.kcexrzcfyt(contextGxszxtbevo, Context.class, new Class[0])).zoijcleaow(ub.ppxfxbqfkf.kcexrzcfyt(dxjokdxxwwVar2, dxjokdxxww.class, new Class[0])).eablkybsjg();
            dxjokdxxwwVar2.f36904iobyxmoadg = agtfadlqogVarEablkybsjg;
            agtfadlqogVarEablkybsjg.rgvfuqvkyq(true);
            dxjokdxxwwVar = f36902ppxfxbqfkf;
        }
        return dxjokdxxwwVar;
    }

    private static Context gxszxtbevo(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public static dxjokdxxww ppxfxbqfkf() {
        dxjokdxxww dxjokdxxwwVar;
        synchronized (f36903zoijcleaow) {
            Preconditions.checkState(f36902ppxfxbqfkf != null, "MlKitContext has not been initialized");
            dxjokdxxwwVar = (dxjokdxxww) Preconditions.checkNotNull(f36902ppxfxbqfkf);
        }
        return dxjokdxxwwVar;
    }

    public static dxjokdxxww wkgbmnqykc(Context context) {
        dxjokdxxww dxjokdxxwwVarEablkybsjg;
        synchronized (f36903zoijcleaow) {
            dxjokdxxwwVarEablkybsjg = eablkybsjg(context, TaskExecutors.MAIN_THREAD);
        }
        return dxjokdxxwwVarEablkybsjg;
    }

    public Object iobyxmoadg(Class cls) {
        Preconditions.checkState(f36902ppxfxbqfkf == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f36904iobyxmoadg);
        return this.f36904iobyxmoadg.iobyxmoadg(cls);
    }

    public Context zoijcleaow() {
        return (Context) iobyxmoadg(Context.class);
    }
}
