package o8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f72301iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f72302zoijcleaow = new HashMap();

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Object f72303iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        iobyxmoadg f72304ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        iobyxmoadg f72305wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private List f72306zoijcleaow;

        iobyxmoadg() {
            this(null);
        }

        public void iobyxmoadg(Object obj) {
            if (this.f72306zoijcleaow == null) {
                this.f72306zoijcleaow = new ArrayList();
            }
            this.f72306zoijcleaow.add(obj);
        }

        public int ppxfxbqfkf() {
            List list = this.f72306zoijcleaow;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public Object zoijcleaow() {
            int iPpxfxbqfkf = ppxfxbqfkf();
            if (iPpxfxbqfkf > 0) {
                return this.f72306zoijcleaow.remove(iPpxfxbqfkf - 1);
            }
            return null;
        }

        iobyxmoadg(Object obj) {
            this.f72305wkgbmnqykc = this;
            this.f72304ppxfxbqfkf = this;
            this.f72303iobyxmoadg = obj;
        }
    }

    lqeggnwhkg() {
    }

    private static void eablkybsjg(iobyxmoadg iobyxmoadgVar) {
        iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar.f72305wkgbmnqykc;
        iobyxmoadgVar2.f72304ppxfxbqfkf = iobyxmoadgVar.f72304ppxfxbqfkf;
        iobyxmoadgVar.f72304ppxfxbqfkf.f72305wkgbmnqykc = iobyxmoadgVar2;
    }

    private static void lqeggnwhkg(iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.f72304ppxfxbqfkf.f72305wkgbmnqykc = iobyxmoadgVar;
        iobyxmoadgVar.f72305wkgbmnqykc.f72304ppxfxbqfkf = iobyxmoadgVar;
    }

    private void ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        eablkybsjg(iobyxmoadgVar);
        iobyxmoadg iobyxmoadgVar2 = this.f72301iobyxmoadg;
        iobyxmoadgVar.f72305wkgbmnqykc = iobyxmoadgVar2.f72305wkgbmnqykc;
        iobyxmoadgVar.f72304ppxfxbqfkf = iobyxmoadgVar2;
        lqeggnwhkg(iobyxmoadgVar);
    }

    private void zoijcleaow(iobyxmoadg iobyxmoadgVar) {
        eablkybsjg(iobyxmoadgVar);
        iobyxmoadg iobyxmoadgVar2 = this.f72301iobyxmoadg;
        iobyxmoadgVar.f72305wkgbmnqykc = iobyxmoadgVar2;
        iobyxmoadgVar.f72304ppxfxbqfkf = iobyxmoadgVar2.f72304ppxfxbqfkf;
        lqeggnwhkg(iobyxmoadgVar);
    }

    public Object gxszxtbevo() {
        for (iobyxmoadg iobyxmoadgVar = this.f72301iobyxmoadg.f72305wkgbmnqykc; !iobyxmoadgVar.equals(this.f72301iobyxmoadg); iobyxmoadgVar = iobyxmoadgVar.f72305wkgbmnqykc) {
            Object objZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (objZoijcleaow != null) {
                return objZoijcleaow;
            }
            eablkybsjg(iobyxmoadgVar);
            this.f72302zoijcleaow.remove(iobyxmoadgVar.f72303iobyxmoadg);
            ((draadjrbmk) iobyxmoadgVar.f72303iobyxmoadg).iobyxmoadg();
        }
        return null;
    }

    public Object iobyxmoadg(draadjrbmk draadjrbmkVar) {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f72302zoijcleaow.get(draadjrbmkVar);
        if (iobyxmoadgVar == null) {
            iobyxmoadgVar = new iobyxmoadg(draadjrbmkVar);
            this.f72302zoijcleaow.put(draadjrbmkVar, iobyxmoadgVar);
        } else {
            draadjrbmkVar.iobyxmoadg();
        }
        zoijcleaow(iobyxmoadgVar);
        return iobyxmoadgVar.zoijcleaow();
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("GroupedLinkedMap( ");
        iobyxmoadg iobyxmoadgVar = this.f72301iobyxmoadg.f72304ppxfxbqfkf;
        boolean z13 = false;
        while (!iobyxmoadgVar.equals(this.f72301iobyxmoadg)) {
            sb3.append('{');
            sb3.append(iobyxmoadgVar.f72303iobyxmoadg);
            sb3.append(':');
            sb3.append(iobyxmoadgVar.ppxfxbqfkf());
            sb3.append("}, ");
            iobyxmoadgVar = iobyxmoadgVar.f72304ppxfxbqfkf;
            z13 = true;
        }
        if (z13) {
            sb3.delete(sb3.length() - 2, sb3.length());
        }
        sb3.append(" )");
        return sb3.toString();
    }

    public void wkgbmnqykc(draadjrbmk draadjrbmkVar, Object obj) {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f72302zoijcleaow.get(draadjrbmkVar);
        if (iobyxmoadgVar == null) {
            iobyxmoadgVar = new iobyxmoadg(draadjrbmkVar);
            ppxfxbqfkf(iobyxmoadgVar);
            this.f72302zoijcleaow.put(draadjrbmkVar, iobyxmoadgVar);
        } else {
            draadjrbmkVar.iobyxmoadg();
        }
        iobyxmoadgVar.iobyxmoadg(obj);
    }
}
