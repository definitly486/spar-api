package org.jsoup.select;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import wl.kcexrzcfyt;
import xl.lereixgezr;
import xl.wflxmlrfwp;
import xl.yggfygwlhe;
import xl.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
abstract class btonecajqb extends org.jsoup.select.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final org.jsoup.select.wkgbmnqykc f74140iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final ThreadLocal f74141ppxfxbqfkf = ThreadLocal.withInitial(new Supplier() { // from class: zl.dxjokdxxww
        @Override // java.util.function.Supplier
        public final Object get() {
            return new IdentityHashMap();
        }
    });

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    boolean f74142zoijcleaow;

    static class eablkybsjg extends btonecajqb {
        public eablkybsjg(org.jsoup.select.wkgbmnqykc wkgbmnqykcVar) {
            super(wkgbmnqykcVar);
        }

        @Override // org.jsoup.select.btonecajqb
        boolean agtfadlqog(wflxmlrfwp wflxmlrfwpVar, zdlpuopuiu zdlpuopuiuVar) {
            return this.f74140iobyxmoadg.gxszxtbevo(wflxmlrfwpVar, zdlpuopuiuVar);
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return this.f74140iobyxmoadg.eablkybsjg() + 2;
        }

        public String toString() {
            return String.format(":is(%s)", this.f74140iobyxmoadg);
        }
    }

    static class gxszxtbevo extends btonecajqb {
        public gxszxtbevo(org.jsoup.select.wkgbmnqykc wkgbmnqykcVar) {
            super(wkgbmnqykcVar);
        }

        @Override // org.jsoup.select.btonecajqb
        boolean agtfadlqog(wflxmlrfwp wflxmlrfwpVar, zdlpuopuiu zdlpuopuiuVar) {
            return !rgvfuqvkyq(wflxmlrfwpVar, zdlpuopuiuVar);
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return this.f74140iobyxmoadg.eablkybsjg() + 2;
        }

        public String toString() {
            return String.format(":not(%s)", this.f74140iobyxmoadg);
        }
    }

    static class iobyxmoadg extends btonecajqb {
        public iobyxmoadg(org.jsoup.select.wkgbmnqykc wkgbmnqykcVar) {
            super(wkgbmnqykcVar);
        }

        @Override // org.jsoup.select.btonecajqb
        boolean agtfadlqog(wflxmlrfwp wflxmlrfwpVar, zdlpuopuiu zdlpuopuiuVar) {
            if (wflxmlrfwpVar == zdlpuopuiuVar) {
                return false;
            }
            do {
                zdlpuopuiuVar = zdlpuopuiuVar.hkdspvbjdz();
                if (zdlpuopuiuVar == null) {
                    break;
                }
                if (rgvfuqvkyq(wflxmlrfwpVar, zdlpuopuiuVar)) {
                    return true;
                }
            } while (zdlpuopuiuVar != wflxmlrfwpVar);
            return false;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return this.f74140iobyxmoadg.eablkybsjg() * 8;
        }

        public String toString() {
            return String.format("%s ", this.f74140iobyxmoadg);
        }
    }

    static class lqeggnwhkg extends btonecajqb {
        public lqeggnwhkg(org.jsoup.select.wkgbmnqykc wkgbmnqykcVar) {
            super(wkgbmnqykcVar);
        }

        @Override // org.jsoup.select.btonecajqb
        boolean agtfadlqog(wflxmlrfwp wflxmlrfwpVar, zdlpuopuiu zdlpuopuiuVar) {
            if (wflxmlrfwpVar == zdlpuopuiuVar) {
                return false;
            }
            for (zdlpuopuiu zdlpuopuiuVarYggfygwlhe = zdlpuopuiuVar.yggfygwlhe(); zdlpuopuiuVarYggfygwlhe != null && zdlpuopuiuVarYggfygwlhe != zdlpuopuiuVar; zdlpuopuiuVarYggfygwlhe = zdlpuopuiuVarYggfygwlhe.zynmafqrjb()) {
                if (rgvfuqvkyq(wflxmlrfwpVar, zdlpuopuiuVarYggfygwlhe)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return this.f74140iobyxmoadg.eablkybsjg() * 3;
        }

        public String toString() {
            return String.format("%s ~ ", this.f74140iobyxmoadg);
        }
    }

    static class nufgyqmvbu extends org.jsoup.select.wkgbmnqykc {
        nufgyqmvbu() {
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 1;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(wflxmlrfwp wflxmlrfwpVar, wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar == wflxmlrfwpVar2;
        }

        public String toString() {
            return ">";
        }
    }

    static class ppxfxbqfkf extends btonecajqb {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f74143eablkybsjg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final ArrayList f74144wkgbmnqykc;

        public ppxfxbqfkf(org.jsoup.select.wkgbmnqykc wkgbmnqykcVar) {
            super(wkgbmnqykcVar);
            ArrayList arrayList = new ArrayList();
            this.f74144wkgbmnqykc = arrayList;
            this.f74143eablkybsjg = 2;
            arrayList.add(wkgbmnqykcVar);
            this.f74143eablkybsjg += wkgbmnqykcVar.eablkybsjg();
        }

        @Override // org.jsoup.select.btonecajqb
        boolean agtfadlqog(wflxmlrfwp wflxmlrfwpVar, zdlpuopuiu zdlpuopuiuVar) {
            if (zdlpuopuiuVar == wflxmlrfwpVar) {
                return false;
            }
            for (int size = this.f74144wkgbmnqykc.size() - 1; size >= 0; size--) {
                if (zdlpuopuiuVar == null || !((org.jsoup.select.wkgbmnqykc) this.f74144wkgbmnqykc.get(size)).gxszxtbevo(wflxmlrfwpVar, zdlpuopuiuVar)) {
                    return false;
                }
                zdlpuopuiuVar = zdlpuopuiuVar.hkdspvbjdz();
            }
            return true;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return this.f74143eablkybsjg;
        }

        @Override // org.jsoup.select.btonecajqb, org.jsoup.select.wkgbmnqykc
        protected void gtknphoqwx() {
            Iterator it = this.f74144wkgbmnqykc.iterator();
            while (it.hasNext()) {
                ((org.jsoup.select.wkgbmnqykc) it.next()).gtknphoqwx();
            }
            super.gtknphoqwx();
        }

        public String toString() {
            return kcexrzcfyt.rgvfuqvkyq(this.f74144wkgbmnqykc, " > ");
        }

        void vdvldrhtss(org.jsoup.select.wkgbmnqykc wkgbmnqykcVar) {
            this.f74144wkgbmnqykc.add(wkgbmnqykcVar);
            this.f74143eablkybsjg += wkgbmnqykcVar.eablkybsjg();
            this.f74142zoijcleaow = wkgbmnqykcVar.draadjrbmk() | this.f74142zoijcleaow;
        }
    }

    static class wkgbmnqykc extends btonecajqb {
        public wkgbmnqykc(org.jsoup.select.wkgbmnqykc wkgbmnqykcVar) {
            super(wkgbmnqykcVar);
        }

        @Override // org.jsoup.select.btonecajqb
        boolean agtfadlqog(wflxmlrfwp wflxmlrfwpVar, zdlpuopuiu zdlpuopuiuVar) {
            if (wflxmlrfwpVar == zdlpuopuiuVar) {
                return false;
            }
            zdlpuopuiu zdlpuopuiuVarStevsuqkhv = this.f74142zoijcleaow ? zdlpuopuiuVar.stevsuqkhv() : zdlpuopuiuVar.wypolnanlu();
            return zdlpuopuiuVarStevsuqkhv != null && rgvfuqvkyq(wflxmlrfwpVar, zdlpuopuiuVarStevsuqkhv);
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return this.f74140iobyxmoadg.eablkybsjg() + 2;
        }

        public String toString() {
            return String.format("%s + ", this.f74140iobyxmoadg);
        }
    }

    static class zoijcleaow extends btonecajqb {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        static final wl.wflxmlrfwp f74145eablkybsjg = new wl.wflxmlrfwp(new Supplier() { // from class: org.jsoup.select.gtknphoqwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return btonecajqb.zoijcleaow.kcexrzcfyt();
            }
        });

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f74146wkgbmnqykc;

        public zoijcleaow(org.jsoup.select.wkgbmnqykc wkgbmnqykcVar) {
            super(wkgbmnqykcVar);
            this.f74146wkgbmnqykc = oxmwwwfdhm(wkgbmnqykcVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ yggfygwlhe kcexrzcfyt() {
            return new yggfygwlhe(new lereixgezr(""), zdlpuopuiu.class);
        }

        private static boolean oxmwwwfdhm(org.jsoup.select.wkgbmnqykc wkgbmnqykcVar) {
            if (!(wkgbmnqykcVar instanceof org.jsoup.select.ppxfxbqfkf)) {
                return false;
            }
            for (org.jsoup.select.wkgbmnqykc wkgbmnqykcVar2 : ((org.jsoup.select.ppxfxbqfkf) wkgbmnqykcVar).f74162iobyxmoadg) {
                if ((wkgbmnqykcVar2 instanceof lqeggnwhkg) || (wkgbmnqykcVar2 instanceof wkgbmnqykc)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.jsoup.select.btonecajqb
        boolean agtfadlqog(wflxmlrfwp wflxmlrfwpVar, zdlpuopuiu zdlpuopuiuVar) {
            return false;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return this.f74140iobyxmoadg.eablkybsjg() * 10;
        }

        @Override // org.jsoup.select.btonecajqb, org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(wflxmlrfwp wflxmlrfwpVar, wflxmlrfwp wflxmlrfwpVar2) {
            if (this.f74146wkgbmnqykc) {
                for (wflxmlrfwp wflxmlrfwpVarIwxlajgraz = wflxmlrfwpVar2.iwxlajgraz(); wflxmlrfwpVarIwxlajgraz != null; wflxmlrfwpVarIwxlajgraz = wflxmlrfwpVarIwxlajgraz.pmvmpeiblj()) {
                    if (wflxmlrfwpVarIwxlajgraz != wflxmlrfwpVar2 && this.f74140iobyxmoadg.lqeggnwhkg(wflxmlrfwpVar2, wflxmlrfwpVarIwxlajgraz)) {
                        return true;
                    }
                }
            }
            yggfygwlhe yggfygwlheVar = (yggfygwlhe) f74145eablkybsjg.zoijcleaow();
            yggfygwlheVar.wkgbmnqykc(wflxmlrfwpVar2);
            while (yggfygwlheVar.hasNext()) {
                try {
                    zdlpuopuiu next = yggfygwlheVar.next();
                    if (next != wflxmlrfwpVar2 && this.f74140iobyxmoadg.gxszxtbevo(wflxmlrfwpVar2, next)) {
                        return true;
                    }
                } finally {
                    f74145eablkybsjg.eablkybsjg(yggfygwlheVar);
                }
            }
            f74145eablkybsjg.eablkybsjg(yggfygwlheVar);
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", this.f74140iobyxmoadg);
        }
    }

    public btonecajqb(org.jsoup.select.wkgbmnqykc wkgbmnqykcVar) {
        this.f74140iobyxmoadg = wkgbmnqykcVar;
        this.f74142zoijcleaow = wkgbmnqykcVar.draadjrbmk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean ojitshcjhn(wflxmlrfwp wflxmlrfwpVar, zdlpuopuiu zdlpuopuiuVar) {
        return Boolean.valueOf(this.f74140iobyxmoadg.gxszxtbevo(wflxmlrfwpVar, zdlpuopuiuVar));
    }

    abstract boolean agtfadlqog(wflxmlrfwp wflxmlrfwpVar, zdlpuopuiu zdlpuopuiuVar);

    @Override // org.jsoup.select.wkgbmnqykc
    boolean draadjrbmk() {
        return this.f74142zoijcleaow;
    }

    @Override // org.jsoup.select.wkgbmnqykc
    boolean dxjokdxxww(wflxmlrfwp wflxmlrfwpVar, xl.kcexrzcfyt kcexrzcfytVar) {
        return agtfadlqog(wflxmlrfwpVar, kcexrzcfytVar);
    }

    @Override // org.jsoup.select.wkgbmnqykc
    protected void gtknphoqwx() {
        ((IdentityHashMap) this.f74141ppxfxbqfkf.get()).clear();
        this.f74140iobyxmoadg.gtknphoqwx();
        super.gtknphoqwx();
    }

    @Override // org.jsoup.select.wkgbmnqykc
    /* JADX INFO: renamed from: nufgyqmvbu */
    public boolean lqeggnwhkg(wflxmlrfwp wflxmlrfwpVar, wflxmlrfwp wflxmlrfwpVar2) {
        return agtfadlqog(wflxmlrfwpVar, wflxmlrfwpVar2);
    }

    boolean rgvfuqvkyq(final wflxmlrfwp wflxmlrfwpVar, zdlpuopuiu zdlpuopuiuVar) {
        return ((Boolean) ((Map) ((Map) this.f74141ppxfxbqfkf.get()).computeIfAbsent(wflxmlrfwpVar, wl.eablkybsjg.eablkybsjg())).computeIfAbsent(zdlpuopuiuVar, new Function() { // from class: org.jsoup.select.dxjokdxxww
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f74147iobyxmoadg.ojitshcjhn(wflxmlrfwpVar, (zdlpuopuiu) obj);
            }
        })).booleanValue();
    }
}
