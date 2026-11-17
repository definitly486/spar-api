package g6;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ulzqkzuiru {
    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.common.util.concurrent.wkgbmnqykc eablkybsjg(final Executor executor, final tg.iobyxmoadg iobyxmoadgVar) {
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: g6.tzroggbefp
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2) {
                return ulzqkzuiru.gxszxtbevo(executor, iobyxmoadgVar, iobyxmoadgVar2);
            }
        });
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarIobyxmoadg, "getFuture {\n        val …        }\n        }\n    }");
        return wkgbmnqykcVarIobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(Executor executor, final tg.iobyxmoadg iobyxmoadgVar, final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        it.iobyxmoadg(new Runnable() { // from class: g6.mbcevpiqjq
            @Override // java.lang.Runnable
            public final void run() {
                ulzqkzuiru.lqeggnwhkg(atomicBoolean);
            }
        }, lqeggnwhkg.INSTANCE);
        executor.execute(new Runnable() { // from class: g6.ntlheqmsrt
            @Override // java.lang.Runnable
            public final void run() {
                ulzqkzuiru.nufgyqmvbu(atomicBoolean, it, iobyxmoadgVar);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lqeggnwhkg(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(AtomicBoolean atomicBoolean, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            iobyxmoadgVar.ppxfxbqfkf(iobyxmoadgVar2.invoke());
        } catch (Throwable th2) {
            iobyxmoadgVar.gxszxtbevo(th2);
        }
    }
}
