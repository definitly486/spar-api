package b8;

import c8.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static volatile boolean f15466iobyxmoadg = true;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final c8.eablkybsjg f15467zoijcleaow = c8.wkgbmnqykc.iobyxmoadg(null);

    public static final void iobyxmoadg() {
        if (!f15466iobyxmoadg || zoijcleaow()) {
            return;
        }
        throw new IllegalArgumentException(("Not on Main thread, current thread is: " + zoijcleaow.iobyxmoadg()).toString());
    }

    public static final boolean zoijcleaow() {
        Object value;
        if (!f15466iobyxmoadg) {
            return true;
        }
        c8.eablkybsjg eablkybsjgVar = f15467zoijcleaow;
        while (true) {
            value = eablkybsjgVar.getValue();
            if (value != null) {
                break;
            }
            wkgbmnqykc wkgbmnqykcVarZoijcleaow = zoijcleaow.zoijcleaow();
            if (wkgbmnqykcVarZoijcleaow == null) {
                lqeggnwhkg.wkgbmnqykc("Main thread id is undefined, main thread assert is disabled");
            }
            eablkybsjg eablkybsjgVar2 = new eablkybsjg(wkgbmnqykcVarZoijcleaow);
            if (eablkybsjgVar.compareAndSet(null, eablkybsjgVar2)) {
                value = eablkybsjgVar2;
                break;
            }
        }
        wkgbmnqykc wkgbmnqykcVarIobyxmoadg = ((eablkybsjg) value).iobyxmoadg();
        if (wkgbmnqykcVarIobyxmoadg != null) {
            return zoijcleaow.ppxfxbqfkf(wkgbmnqykcVarIobyxmoadg);
        }
        return true;
    }
}
