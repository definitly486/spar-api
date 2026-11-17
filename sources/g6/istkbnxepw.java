package g6;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class istkbnxepw {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(pkzmftpjix pkzmftpjixVar, String str, tg.iobyxmoadg iobyxmoadgVar, androidx.lifecycle.pmvmpeiblj pmvmpeibljVar, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2) {
        boolean zIsEnabled = pkzmftpjixVar.isEnabled();
        if (zIsEnabled) {
            try {
                pkzmftpjixVar.iobyxmoadg(str);
            } catch (Throwable th2) {
                if (zIsEnabled) {
                    pkzmftpjixVar.wkgbmnqykc();
                }
                throw th2;
            }
        }
        try {
            iobyxmoadgVar.invoke();
            esjtqupxsv.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = esjtqupxsv.f36390iobyxmoadg;
            pmvmpeibljVar.wflxmlrfwp(ppxfxbqfkfVar);
            iobyxmoadgVar2.ppxfxbqfkf(ppxfxbqfkfVar);
        } catch (Throwable th3) {
            pmvmpeibljVar.wflxmlrfwp(new esjtqupxsv.zoijcleaow.iobyxmoadg(th3));
            iobyxmoadgVar2.gxszxtbevo(th3);
        }
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        if (zIsEnabled) {
            pkzmftpjixVar.wkgbmnqykc();
        }
    }

    public static final esjtqupxsv ppxfxbqfkf(final pkzmftpjix tracer, final String label, final Executor executor, final tg.iobyxmoadg block) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tracer, "tracer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(label, "label");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(executor, "executor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        final androidx.lifecycle.pmvmpeiblj pmvmpeibljVar = new androidx.lifecycle.pmvmpeiblj(esjtqupxsv.f36391zoijcleaow);
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: g6.pmvmpeiblj
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return istkbnxepw.wkgbmnqykc(executor, tracer, label, block, pmvmpeibljVar, iobyxmoadgVar);
            }
        });
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarIobyxmoadg, "getFuture { completer ->…}\n            }\n        }");
        return new lereixgezr(pmvmpeibljVar, wkgbmnqykcVarIobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wkgbmnqykc(Executor executor, final pkzmftpjix pkzmftpjixVar, final String str, final tg.iobyxmoadg iobyxmoadgVar, final androidx.lifecycle.pmvmpeiblj pmvmpeibljVar, final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg completer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(completer, "completer");
        executor.execute(new Runnable() { // from class: g6.zynmafqrjb
            @Override // java.lang.Runnable
            public final void run() {
                istkbnxepw.eablkybsjg(pkzmftpjixVar, str, iobyxmoadgVar, pmvmpeibljVar, completer);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
