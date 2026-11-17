package org.jsoup.select;

import java.util.regex.Pattern;
import wl.kcexrzcfyt;
import xl.wflxmlrfwp;
import xl.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
abstract class eablkybsjg extends org.jsoup.select.wkgbmnqykc {

    static class iobyxmoadg extends eablkybsjg {
        iobyxmoadg() {
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 4;
        }

        public String toString() {
            return ":blank";
        }

        @Override // org.jsoup.select.eablkybsjg
        boolean wflxmlrfwp(zdlpuopuiu zdlpuopuiuVar) {
            return kcexrzcfyt.btonecajqb(zdlpuopuiuVar.iozdgvuglv());
        }
    }

    static class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Class f74149iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final String f74150zoijcleaow;

        ppxfxbqfkf(Class cls, String str) {
            this.f74149iobyxmoadg = cls;
            this.f74150zoijcleaow = "::" + str;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 1;
        }

        public String toString() {
            return this.f74150zoijcleaow;
        }

        @Override // org.jsoup.select.eablkybsjg
        boolean wflxmlrfwp(zdlpuopuiu zdlpuopuiuVar) {
            return this.f74149iobyxmoadg.isInstance(zdlpuopuiuVar);
        }
    }

    static class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Pattern f74151iobyxmoadg;

        protected wkgbmnqykc(Pattern pattern) {
            this.f74151iobyxmoadg = pattern;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 8;
        }

        public String toString() {
            return String.format(":matches(%s)", this.f74151iobyxmoadg);
        }

        @Override // org.jsoup.select.eablkybsjg
        boolean wflxmlrfwp(zdlpuopuiu zdlpuopuiuVar) {
            return this.f74151iobyxmoadg.matcher(zdlpuopuiuVar.iozdgvuglv()).find();
        }
    }

    static class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74152iobyxmoadg;

        public zoijcleaow(String str) {
            this.f74152iobyxmoadg = wl.gxszxtbevo.iobyxmoadg(kcexrzcfyt.iwizpuwonk(str));
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 6;
        }

        public String toString() {
            return String.format(":contains(%s)", this.f74152iobyxmoadg);
        }

        @Override // org.jsoup.select.eablkybsjg
        boolean wflxmlrfwp(zdlpuopuiu zdlpuopuiuVar) {
            return wl.gxszxtbevo.iobyxmoadg(zdlpuopuiuVar.iozdgvuglv()).contains(this.f74152iobyxmoadg);
        }
    }

    eablkybsjg() {
    }

    @Override // org.jsoup.select.wkgbmnqykc
    boolean draadjrbmk() {
        return true;
    }

    @Override // org.jsoup.select.wkgbmnqykc
    boolean dxjokdxxww(wflxmlrfwp wflxmlrfwpVar, xl.kcexrzcfyt kcexrzcfytVar) {
        return wflxmlrfwp(kcexrzcfytVar);
    }

    @Override // org.jsoup.select.wkgbmnqykc
    /* JADX INFO: renamed from: nufgyqmvbu */
    public boolean lqeggnwhkg(wflxmlrfwp wflxmlrfwpVar, wflxmlrfwp wflxmlrfwpVar2) {
        return wflxmlrfwp(wflxmlrfwpVar2);
    }

    abstract boolean wflxmlrfwp(zdlpuopuiu zdlpuopuiuVar);
}
