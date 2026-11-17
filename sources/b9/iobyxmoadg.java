package b9;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f15570iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: b9.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C0268iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Class f15571iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final l8.wkgbmnqykc f15572zoijcleaow;

        C0268iobyxmoadg(Class cls, l8.wkgbmnqykc wkgbmnqykcVar) {
            this.f15571iobyxmoadg = cls;
            this.f15572zoijcleaow = wkgbmnqykcVar;
        }

        boolean iobyxmoadg(Class cls) {
            return this.f15571iobyxmoadg.isAssignableFrom(cls);
        }
    }

    public synchronized void iobyxmoadg(Class cls, l8.wkgbmnqykc wkgbmnqykcVar) {
        this.f15570iobyxmoadg.add(new C0268iobyxmoadg(cls, wkgbmnqykcVar));
    }

    public synchronized l8.wkgbmnqykc zoijcleaow(Class cls) {
        for (C0268iobyxmoadg c0268iobyxmoadg : this.f15570iobyxmoadg) {
            if (c0268iobyxmoadg.iobyxmoadg(cls)) {
                return c0268iobyxmoadg.f15572zoijcleaow;
            }
        }
        return null;
    }
}
