package od;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static volatile wkgbmnqykc f72613zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f72614iobyxmoadg = new HashSet();

    wkgbmnqykc() {
    }

    public static wkgbmnqykc iobyxmoadg() {
        wkgbmnqykc wkgbmnqykcVar = f72613zoijcleaow;
        if (wkgbmnqykcVar == null) {
            synchronized (wkgbmnqykc.class) {
                try {
                    wkgbmnqykcVar = f72613zoijcleaow;
                    if (wkgbmnqykcVar == null) {
                        wkgbmnqykcVar = new wkgbmnqykc();
                        f72613zoijcleaow = wkgbmnqykcVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return wkgbmnqykcVar;
    }

    Set zoijcleaow() {
        Set setUnmodifiableSet;
        synchronized (this.f72614iobyxmoadg) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f72614iobyxmoadg);
        }
        return setUnmodifiableSet;
    }
}
