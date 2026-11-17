package ni;

import jh.lmojexxdyd;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f70100iobyxmoadg;

    public lqeggnwhkg(Object obj) {
        this.f70100iobyxmoadg = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            Object objZoijcleaow = zoijcleaow();
            lqeggnwhkg lqeggnwhkgVar = obj instanceof lqeggnwhkg ? (lqeggnwhkg) obj : null;
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objZoijcleaow, lqeggnwhkgVar != null ? lqeggnwhkgVar.zoijcleaow() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object objZoijcleaow = zoijcleaow();
        if (objZoijcleaow != null) {
            return objZoijcleaow.hashCode();
        }
        return 0;
    }

    public abstract kegysxyocb iobyxmoadg(lmojexxdyd lmojexxdydVar);

    public String toString() {
        return String.valueOf(zoijcleaow());
    }

    public Object zoijcleaow() {
        return this.f70100iobyxmoadg;
    }
}
