package jj;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {
    public static final boolean iobyxmoadg(Throwable th2) {
        zdlpuopuiu.btonecajqb(th2, "<this>");
        Class<?> superclass = th2.getClass();
        while (!zdlpuopuiu.eablkybsjg(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException zoijcleaow(Throwable e13) throws Throwable {
        zdlpuopuiu.btonecajqb(e13, "e");
        throw e13;
    }
}
