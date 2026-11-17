package oh;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {
    public static final Class iobyxmoadg(ClassLoader classLoader, String fqName) {
        zdlpuopuiu.btonecajqb(classLoader, "<this>");
        zdlpuopuiu.btonecajqb(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
