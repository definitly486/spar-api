package h6;

import androidx.work.impl.WorkerStoppedException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sopmlzcsov {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f39641iobyxmoadg;

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.wkgbmnqykc f39642yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.work.ppxfxbqfkf f39643zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(androidx.work.ppxfxbqfkf ppxfxbqfkfVar, com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar) {
            super(1);
            this.f39643zdlpuopuiu = ppxfxbqfkfVar;
            this.f39642yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            if (th2 instanceof WorkerStoppedException) {
                this.f39643zdlpuopuiu.stop(((WorkerStoppedException) th2).getReason());
            }
            this.f39642yggfygwlhe.cancel(false);
        }
    }

    static {
        String strDxjokdxxww = g6.yggfygwlhe.dxjokdxxww("WorkerWrapper");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strDxjokdxxww, "tagWithPrefix(\"WorkerWrapper\")");
        f39641iobyxmoadg = strDxjokdxxww;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object eablkybsjg(Future future) {
        Object obj;
        boolean z13 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z13 = true;
            } catch (Throwable th2) {
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable gxszxtbevo(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(cause);
        return cause;
    }

    public static final Object wkgbmnqykc(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, androidx.work.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        try {
            if (wkgbmnqykcVar.isDone()) {
                return eablkybsjg(wkgbmnqykcVar);
            }
            pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
            rgvfuqvkyqVar.lereixgezr();
            wkgbmnqykcVar.iobyxmoadg(new istkbnxepw(wkgbmnqykcVar, rgvfuqvkyqVar), g6.lqeggnwhkg.INSTANCE);
            rgvfuqvkyqVar.stevsuqkhv(new iobyxmoadg(ppxfxbqfkfVar, wkgbmnqykcVar));
            Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
            if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
            }
            return objZdlpuopuiu;
        } catch (ExecutionException e13) {
            throw gxszxtbevo(e13);
        }
    }
}
