package g6;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes2.dex */
public abstract class stevsuqkhv {
    private static final androidx.work.ppxfxbqfkf ppxfxbqfkf(Context context, String str, WorkerParameters workerParameters) {
        try {
            Object objNewInstance = wkgbmnqykc(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objNewInstance, "{\n                val co…Parameters)\n            }");
            return (androidx.work.ppxfxbqfkf) objNewInstance;
        } catch (Throwable th2) {
            yggfygwlhe.eablkybsjg().wkgbmnqykc(kegysxyocb.f36430iobyxmoadg, "Could not instantiate " + str, th2);
            throw th2;
        }
    }

    private static final Class wkgbmnqykc(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(androidx.work.ppxfxbqfkf.class);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            return clsAsSubclass;
        } catch (Throwable th2) {
            yggfygwlhe.eablkybsjg().wkgbmnqykc(kegysxyocb.f36430iobyxmoadg, "Invalid class: " + str, th2);
            throw th2;
        }
    }

    public abstract androidx.work.ppxfxbqfkf iobyxmoadg(Context context, String str, WorkerParameters workerParameters);

    public final androidx.work.ppxfxbqfkf zoijcleaow(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appContext, "appContext");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workerClassName, "workerClassName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workerParameters, "workerParameters");
        androidx.work.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = iobyxmoadg(appContext, workerClassName, workerParameters);
        if (ppxfxbqfkfVarIobyxmoadg == null) {
            ppxfxbqfkfVarIobyxmoadg = ppxfxbqfkf(appContext, workerClassName, workerParameters);
        }
        if (!ppxfxbqfkfVarIobyxmoadg.isUsed()) {
            return ppxfxbqfkfVarIobyxmoadg;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
