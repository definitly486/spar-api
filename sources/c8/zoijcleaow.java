package c8;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {
    public static final void iobyxmoadg(eablkybsjg eablkybsjgVar, Object value) {
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        zdlpuopuiu.btonecajqb(value, "value");
        if (eablkybsjgVar.compareAndSet(null, value)) {
            return;
        }
        throw new IllegalStateException(("Value is already initialized: " + eablkybsjgVar).toString());
    }

    public static final Object zoijcleaow(eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        Object value = eablkybsjgVar.getValue();
        if (value != null) {
            return value;
        }
        throw new IllegalArgumentException("Value was not initialized");
    }
}
