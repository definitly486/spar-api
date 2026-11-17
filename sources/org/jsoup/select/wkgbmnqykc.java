package org.jsoup.select;

import java.util.Iterator;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import xl.wflxmlrfwp;
import xl.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {

    public static final class agtfadlqog extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74166iobyxmoadg;

        public agtfadlqog(String str) {
            this.f74166iobyxmoadg = wl.gxszxtbevo.iobyxmoadg(wl.kcexrzcfyt.iwizpuwonk(str));
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 10;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wl.gxszxtbevo.iobyxmoadg(wflxmlrfwpVar2.s()).contains(this.f74166iobyxmoadg);
        }

        public String toString() {
            return String.format(":contains(%s)", this.f74166iobyxmoadg);
        }
    }

    public static final class btonecajqb extends ppxfxbqfkf {
        public btonecajqb(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 4;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.jyumaefscl(this.f74179iobyxmoadg) && wl.gxszxtbevo.iobyxmoadg(wflxmlrfwpVar2.ppxfxbqfkf(this.f74179iobyxmoadg)).startsWith(this.f74180zoijcleaow);
        }

        public String toString() {
            return String.format("[%s^=%s]", this.f74179iobyxmoadg, this.f74180zoijcleaow);
        }
    }

    public static class cdpycssgdh extends vdvldrhtss {
        public cdpycssgdh(int i13, int i14) {
            super(i13, i14);
        }

        @Override // org.jsoup.select.wkgbmnqykc.vdvldrhtss
        protected String agtfadlqog() {
            return "nth-last-of-type";
        }

        @Override // org.jsoup.select.wkgbmnqykc.vdvldrhtss
        protected int wflxmlrfwp(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            int i13 = 0;
            if (wflxmlrfwpVar2.hkdspvbjdz() == null) {
                return 0;
            }
            for (xl.wflxmlrfwp wflxmlrfwpVarPmvmpeiblj = wflxmlrfwpVar2; wflxmlrfwpVarPmvmpeiblj != null; wflxmlrfwpVarPmvmpeiblj = wflxmlrfwpVarPmvmpeiblj.pmvmpeiblj()) {
                if (wflxmlrfwpVarPmvmpeiblj.lmojexxdyd().equals(wflxmlrfwpVar2.lmojexxdyd())) {
                    i13++;
                }
            }
            return i13;
        }
    }

    public static final class cllcsxoeiz extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74167iobyxmoadg;

        public cllcsxoeiz(String str) {
            this.f74167iobyxmoadg = str;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 1;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.lereixgezr(this.f74167iobyxmoadg);
        }

        public String toString() {
            return String.format("%s", this.f74167iobyxmoadg);
        }
    }

    public static final class cqumvgiudr extends wkgbmnqykc {
        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            xl.wflxmlrfwp wflxmlrfwpVarEzmngbhpjk = wflxmlrfwpVar2.hkdspvbjdz();
            return (wflxmlrfwpVarEzmngbhpjk == null || (wflxmlrfwpVarEzmngbhpjk instanceof xl.gxszxtbevo) || wflxmlrfwpVar2 != wflxmlrfwpVarEzmngbhpjk.auzgnhcxok()) ? false : true;
        }

        public String toString() {
            return ":first-child";
        }
    }

    public static final class draadjrbmk extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74168iobyxmoadg;

        public draadjrbmk(String str) {
            this.f74168iobyxmoadg = wl.gxszxtbevo.iobyxmoadg(str);
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wl.gxszxtbevo.iobyxmoadg(wflxmlrfwpVar2.weqkydbzbr()).contains(this.f74168iobyxmoadg);
        }

        public String toString() {
            return String.format(":containsData(%s)", this.f74168iobyxmoadg);
        }
    }

    public static final class dsvhmnatus extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74169iobyxmoadg;

        public dsvhmnatus(String str) {
            this.f74169iobyxmoadg = str;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.lmojexxdyd().endsWith(this.f74169iobyxmoadg);
        }

        public String toString() {
            return String.format("*|%s", this.f74169iobyxmoadg);
        }
    }

    public static final class dxjokdxxww extends ppxfxbqfkf {
        public dxjokdxxww(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 3;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return !this.f74180zoijcleaow.equalsIgnoreCase(wflxmlrfwpVar2.ppxfxbqfkf(this.f74179iobyxmoadg));
        }

        public String toString() {
            return String.format("[%s!=%s]", this.f74179iobyxmoadg, this.f74180zoijcleaow);
        }
    }

    public static final class eablkybsjg extends ppxfxbqfkf {
        public eablkybsjg(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 3;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.jyumaefscl(this.f74179iobyxmoadg) && this.f74180zoijcleaow.equalsIgnoreCase(wflxmlrfwpVar2.ppxfxbqfkf(this.f74179iobyxmoadg).trim());
        }

        public String toString() {
            return String.format("[%s=%s]", this.f74179iobyxmoadg, this.f74180zoijcleaow);
        }
    }

    public static final class esjtqupxsv extends yadqdtsiqt {
        public esjtqupxsv() {
            super(0, 1);
        }

        @Override // org.jsoup.select.wkgbmnqykc.vdvldrhtss
        public String toString() {
            return ":first-of-type";
        }
    }

    public static final class gtknphoqwx extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74170iobyxmoadg;

        public gtknphoqwx(String str) {
            this.f74170iobyxmoadg = str;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 8;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.dvvnrvtcbc(this.f74170iobyxmoadg);
        }

        public String toString() {
            return String.format(".%s", this.f74170iobyxmoadg);
        }
    }

    public static final class gxszxtbevo extends ppxfxbqfkf {
        public gxszxtbevo(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 6;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.jyumaefscl(this.f74179iobyxmoadg) && wl.gxszxtbevo.iobyxmoadg(wflxmlrfwpVar2.ppxfxbqfkf(this.f74179iobyxmoadg)).contains(this.f74180zoijcleaow);
        }

        public String toString() {
            return String.format("[%s*=%s]", this.f74179iobyxmoadg, this.f74180zoijcleaow);
        }
    }

    public static final class hcddaimhww extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Pattern f74171iobyxmoadg;

        public hcddaimhww(Pattern pattern) {
            this.f74171iobyxmoadg = pattern;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 7;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return this.f74171iobyxmoadg.matcher(wflxmlrfwpVar2.jrbgnlbqoe()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", this.f74171iobyxmoadg);
        }
    }

    public static final class hkdspvbjdz extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Pattern f74172iobyxmoadg;

        public hkdspvbjdz(Pattern pattern) {
            this.f74172iobyxmoadg = pattern;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 8;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return this.f74172iobyxmoadg.matcher(wflxmlrfwpVar2.w()).find();
        }

        public String toString() {
            return String.format(":matchesWholeText(%s)", this.f74172iobyxmoadg);
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {
        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 10;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    public static final class iozdgvuglv extends wkgbmnqykc {
        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            xl.wflxmlrfwp wflxmlrfwpVarEzmngbhpjk = wflxmlrfwpVar2.hkdspvbjdz();
            return (wflxmlrfwpVarEzmngbhpjk == null || (wflxmlrfwpVarEzmngbhpjk instanceof xl.gxszxtbevo) || !wflxmlrfwpVar2.k().isEmpty()) ? false : true;
        }

        public String toString() {
            return ":only-child";
        }
    }

    public static final class istkbnxepw extends vdvldrhtss {
        public istkbnxepw(int i13, int i14) {
            super(i13, i14);
        }

        @Override // org.jsoup.select.wkgbmnqykc.vdvldrhtss
        protected String agtfadlqog() {
            return "nth-last-child";
        }

        @Override // org.jsoup.select.wkgbmnqykc.vdvldrhtss
        protected int wflxmlrfwp(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            if (wflxmlrfwpVar2.hkdspvbjdz() == null) {
                return 0;
            }
            return wflxmlrfwpVar2.hkdspvbjdz().opjhrmiecq() - wflxmlrfwpVar2.nuxfzjnpeb();
        }
    }

    public static final class iwizpuwonk extends wkgbmnqykc {
        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            for (xl.zdlpuopuiu zdlpuopuiuVarZdlpuopuiu = wflxmlrfwpVar2.zdlpuopuiu(); zdlpuopuiuVarZdlpuopuiu != null; zdlpuopuiuVarZdlpuopuiu = zdlpuopuiuVarZdlpuopuiu.zynmafqrjb()) {
                if (zdlpuopuiuVarZdlpuopuiu instanceof xl.lereixgezr) {
                    if (!((xl.lereixgezr) zdlpuopuiuVarZdlpuopuiu).sflfametgt()) {
                        return false;
                    }
                } else if (!(zdlpuopuiuVarZdlpuopuiu instanceof xl.wkgbmnqykc) && !(zdlpuopuiuVarZdlpuopuiu instanceof xl.pmvmpeiblj) && !(zdlpuopuiuVarZdlpuopuiu instanceof xl.lqeggnwhkg)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    public static final class jpowsppfya extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Pattern f74173iobyxmoadg;

        public jpowsppfya(Pattern pattern) {
            this.f74173iobyxmoadg = pattern;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 7;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return this.f74173iobyxmoadg.matcher(wflxmlrfwpVar2.v()).find();
        }

        public String toString() {
            return String.format(":matchesWholeOwnText(%s)", this.f74173iobyxmoadg);
        }
    }

    public static final class jyumaefscl extends zdlpuopuiu {
        public jyumaefscl(int i13) {
            super(i13);
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar != wflxmlrfwpVar2 && wflxmlrfwpVar2.nuxfzjnpeb() < this.f74188iobyxmoadg;
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.f74188iobyxmoadg));
        }
    }

    public static final class kcexrzcfyt extends zdlpuopuiu {
        public kcexrzcfyt(int i13) {
            super(i13);
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.nuxfzjnpeb() == this.f74188iobyxmoadg;
        }

        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.f74188iobyxmoadg));
        }
    }

    public static final class lereixgezr extends wkgbmnqykc {
        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            xl.wflxmlrfwp wflxmlrfwpVarEzmngbhpjk = wflxmlrfwpVar2.hkdspvbjdz();
            return (wflxmlrfwpVarEzmngbhpjk == null || (wflxmlrfwpVarEzmngbhpjk instanceof xl.gxszxtbevo) || wflxmlrfwpVar2 != wflxmlrfwpVarEzmngbhpjk.grlcpdaxtj()) ? false : true;
        }

        public String toString() {
            return ":last-child";
        }
    }

    public static final class lmojexxdyd extends wkgbmnqykc {
        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            xl.wflxmlrfwp wflxmlrfwpVarEzmngbhpjk = wflxmlrfwpVar2.hkdspvbjdz();
            if (wflxmlrfwpVarEzmngbhpjk == null || (wflxmlrfwpVarEzmngbhpjk instanceof xl.gxszxtbevo)) {
                return false;
            }
            int i13 = 0;
            for (xl.wflxmlrfwp wflxmlrfwpVarAuzgnhcxok = wflxmlrfwpVarEzmngbhpjk.auzgnhcxok(); wflxmlrfwpVarAuzgnhcxok != null; wflxmlrfwpVarAuzgnhcxok = wflxmlrfwpVarAuzgnhcxok.pmvmpeiblj()) {
                if (wflxmlrfwpVarAuzgnhcxok.lmojexxdyd().equals(wflxmlrfwpVar2.lmojexxdyd())) {
                    i13++;
                }
                if (i13 > 1) {
                    break;
                }
            }
            return i13 == 1;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    public static final class lqeggnwhkg extends ppxfxbqfkf {
        public lqeggnwhkg(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 4;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.jyumaefscl(this.f74179iobyxmoadg) && wl.gxszxtbevo.iobyxmoadg(wflxmlrfwpVar2.ppxfxbqfkf(this.f74179iobyxmoadg)).endsWith(this.f74180zoijcleaow);
        }

        public String toString() {
            return String.format("[%s$=%s]", this.f74179iobyxmoadg, this.f74180zoijcleaow);
        }
    }

    public static final class nufgyqmvbu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final String f74174iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Pattern f74175zoijcleaow;

        public nufgyqmvbu(String str, Pattern pattern) {
            this.f74174iobyxmoadg = wl.gxszxtbevo.zoijcleaow(str);
            this.f74175zoijcleaow = pattern;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 8;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.jyumaefscl(this.f74174iobyxmoadg) && this.f74175zoijcleaow.matcher(wflxmlrfwpVar2.ppxfxbqfkf(this.f74174iobyxmoadg)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", this.f74174iobyxmoadg, this.f74175zoijcleaow.toString());
        }
    }

    public static final class ojitshcjhn extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74176iobyxmoadg;

        public ojitshcjhn(String str) {
            this.f74176iobyxmoadg = str;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.v().contains(this.f74176iobyxmoadg);
        }

        public String toString() {
            return String.format(":containsWholeOwnText(%s)", this.f74176iobyxmoadg);
        }
    }

    public static final class oxmwwwfdhm extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74177iobyxmoadg;

        public oxmwwwfdhm(String str) {
            this.f74177iobyxmoadg = str;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 2;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return this.f74177iobyxmoadg.equals(wflxmlrfwpVar2.hszhottldk());
        }

        public String toString() {
            return String.format("#%s", this.f74177iobyxmoadg);
        }
    }

    public static final class pkzmftpjix extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Pattern f74178iobyxmoadg;

        public pkzmftpjix(Pattern pattern) {
            this.f74178iobyxmoadg = pattern;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 8;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return this.f74178iobyxmoadg.matcher(wflxmlrfwpVar2.s()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", this.f74178iobyxmoadg);
        }
    }

    public static final class pmvmpeiblj extends cdpycssgdh {
        public pmvmpeiblj() {
            super(0, 1);
        }

        @Override // org.jsoup.select.wkgbmnqykc.vdvldrhtss
        public String toString() {
            return ":last-of-type";
        }
    }

    public static abstract class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final String f74179iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final String f74180zoijcleaow;

        public ppxfxbqfkf(String str, String str2) {
            this(str, str2, true);
        }

        public ppxfxbqfkf(String str, String str2, boolean z13) {
            vl.zoijcleaow.lqeggnwhkg(str);
            vl.zoijcleaow.lqeggnwhkg(str2);
            this.f74179iobyxmoadg = wl.gxszxtbevo.zoijcleaow(str);
            boolean z14 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z14 ? str2.substring(1, str2.length() - 1) : str2;
            this.f74180zoijcleaow = z13 ? wl.gxszxtbevo.zoijcleaow(str2) : wl.gxszxtbevo.ppxfxbqfkf(str2, z14);
        }
    }

    public static final class rgvfuqvkyq extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74181iobyxmoadg;

        public rgvfuqvkyq(String str) {
            this.f74181iobyxmoadg = str;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 10;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.w().contains(this.f74181iobyxmoadg);
        }

        public String toString() {
            return String.format(":containsWholeText(%s)", this.f74181iobyxmoadg);
        }
    }

    public static abstract class vdvldrhtss extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        protected final int f74182iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        protected final int f74183zoijcleaow;

        public vdvldrhtss(int i13, int i14) {
            this.f74182iobyxmoadg = i13;
            this.f74183zoijcleaow = i14;
        }

        protected abstract String agtfadlqog();

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            xl.wflxmlrfwp wflxmlrfwpVarEzmngbhpjk = wflxmlrfwpVar2.hkdspvbjdz();
            if (wflxmlrfwpVarEzmngbhpjk == null || (wflxmlrfwpVarEzmngbhpjk instanceof xl.gxszxtbevo)) {
                return false;
            }
            int iWflxmlrfwp = wflxmlrfwp(wflxmlrfwpVar, wflxmlrfwpVar2);
            int i13 = this.f74182iobyxmoadg;
            if (i13 == 0) {
                return iWflxmlrfwp == this.f74183zoijcleaow;
            }
            int i14 = this.f74183zoijcleaow;
            return (iWflxmlrfwp - i14) * i13 >= 0 && (iWflxmlrfwp - i14) % i13 == 0;
        }

        public String toString() {
            String str;
            if (this.f74182iobyxmoadg == 0) {
                str = ":%s(%3$d)";
            } else {
                str = this.f74183zoijcleaow == 0 ? ":%s(%2$dn)" : ":%s(%2$dn%3$+d)";
            }
            return String.format(str, agtfadlqog(), Integer.valueOf(this.f74182iobyxmoadg), Integer.valueOf(this.f74183zoijcleaow));
        }

        protected abstract int wflxmlrfwp(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2);
    }

    public static final class wflxmlrfwp extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74184iobyxmoadg;

        public wflxmlrfwp(String str) {
            this.f74184iobyxmoadg = wl.gxszxtbevo.iobyxmoadg(wl.kcexrzcfyt.iwizpuwonk(str));
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wl.gxszxtbevo.iobyxmoadg(wflxmlrfwpVar2.jrbgnlbqoe()).contains(this.f74184iobyxmoadg);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", this.f74184iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1614wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74185iobyxmoadg;

        public C1614wkgbmnqykc(String str) {
            vl.zoijcleaow.btonecajqb(str);
            this.f74185iobyxmoadg = wl.gxszxtbevo.iobyxmoadg(str);
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 6;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            Iterator it = wflxmlrfwpVar2.eablkybsjg().gxszxtbevo().iterator();
            while (it.hasNext()) {
                if (wl.gxszxtbevo.iobyxmoadg(((xl.iobyxmoadg) it.next()).getKey()).startsWith(this.f74185iobyxmoadg)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", this.f74185iobyxmoadg);
        }
    }

    public static final class wwaezpbzkn extends wkgbmnqykc {
        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 1;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            if (wflxmlrfwpVar instanceof xl.gxszxtbevo) {
                wflxmlrfwpVar = wflxmlrfwpVar.auzgnhcxok();
            }
            return wflxmlrfwpVar2 == wflxmlrfwpVar;
        }

        public String toString() {
            return ":root";
        }
    }

    public static final class wypolnanlu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74186iobyxmoadg;

        public wypolnanlu(String str) {
            this.f74186iobyxmoadg = str;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.lmojexxdyd().startsWith(this.f74186iobyxmoadg);
        }

        public String toString() {
            return String.format("%s|*", this.f74186iobyxmoadg);
        }
    }

    public static class yadqdtsiqt extends vdvldrhtss {
        public yadqdtsiqt(int i13, int i14) {
            super(i13, i14);
        }

        @Override // org.jsoup.select.wkgbmnqykc.vdvldrhtss
        protected String agtfadlqog() {
            return "nth-of-type";
        }

        @Override // org.jsoup.select.wkgbmnqykc.vdvldrhtss
        protected int wflxmlrfwp(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            xl.wflxmlrfwp wflxmlrfwpVarEzmngbhpjk = wflxmlrfwpVar2.hkdspvbjdz();
            if (wflxmlrfwpVarEzmngbhpjk == null) {
                return 0;
            }
            int iWflxmlrfwp = wflxmlrfwpVarEzmngbhpjk.wflxmlrfwp();
            int i13 = 0;
            for (int i14 = 0; i14 < iWflxmlrfwp; i14++) {
                xl.zdlpuopuiu zdlpuopuiuVarDraadjrbmk = wflxmlrfwpVarEzmngbhpjk.draadjrbmk(i14);
                if (zdlpuopuiuVarDraadjrbmk.lmojexxdyd().equals(wflxmlrfwpVar2.lmojexxdyd())) {
                    i13++;
                }
                if (zdlpuopuiuVarDraadjrbmk == wflxmlrfwpVar2) {
                    break;
                }
            }
            return i13;
        }
    }

    public static final class yggfygwlhe extends zdlpuopuiu {
        public yggfygwlhe(int i13) {
            super(i13);
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.nuxfzjnpeb() > this.f74188iobyxmoadg;
        }

        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.f74188iobyxmoadg));
        }
    }

    public static final class ylkuphrtab extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static boolean f74187iobyxmoadg = false;

        public ylkuphrtab() {
            if (f74187iobyxmoadg) {
                return;
            }
            f74187iobyxmoadg = true;
            System.err.println("WARNING: :matchText selector is deprecated and will be removed in a future version. Use Element#selectNodes(String, Class) with selector ::textnode and class TextNode instead.");
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return -1;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            if (wflxmlrfwpVar2 instanceof xl.cqumvgiudr) {
                return true;
            }
            for (xl.zdlpuopuiu zdlpuopuiuVar : wflxmlrfwpVar2.t()) {
                xl.cqumvgiudr cqumvgiudrVar = new xl.cqumvgiudr(yl.kcexrzcfyt.vdvldrhtss(wflxmlrfwpVar2.o(), wflxmlrfwpVar2.n().gtknphoqwx(), yl.vdvldrhtss.f125806wkgbmnqykc), wflxmlrfwpVar2.gxszxtbevo(), wflxmlrfwpVar2.eablkybsjg());
                zdlpuopuiuVar.ribwqtqdhb(cqumvgiudrVar);
                cqumvgiudrVar.uwvvkdfqfp(zdlpuopuiuVar);
            }
            return false;
        }

        public String toString() {
            return ":matchText";
        }
    }

    public static abstract class zdlpuopuiu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final int f74188iobyxmoadg;

        public zdlpuopuiu(int i13) {
            this.f74188iobyxmoadg = i13;
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74189iobyxmoadg;

        public zoijcleaow(String str) {
            this.f74189iobyxmoadg = str;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        protected int eablkybsjg() {
            return 2;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.jyumaefscl(this.f74189iobyxmoadg);
        }

        public String toString() {
            return String.format("[%s]", this.f74189iobyxmoadg);
        }
    }

    public static final class zynmafqrjb extends vdvldrhtss {
        public zynmafqrjb(int i13, int i14) {
            super(i13, i14);
        }

        @Override // org.jsoup.select.wkgbmnqykc.vdvldrhtss
        protected String agtfadlqog() {
            return "nth-child";
        }

        @Override // org.jsoup.select.wkgbmnqykc.vdvldrhtss
        protected int wflxmlrfwp(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2) {
            return wflxmlrfwpVar2.nuxfzjnpeb() + 1;
        }
    }

    protected wkgbmnqykc() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public final boolean gxszxtbevo(xl.wflxmlrfwp wflxmlrfwpVar, xl.zdlpuopuiu zdlpuopuiuVar) {
        if (zdlpuopuiuVar instanceof xl.wflxmlrfwp) {
            return lqeggnwhkg(wflxmlrfwpVar, (xl.wflxmlrfwp) zdlpuopuiuVar);
        }
        if ((zdlpuopuiuVar instanceof xl.kcexrzcfyt) && draadjrbmk()) {
            return dxjokdxxww(wflxmlrfwpVar, (xl.kcexrzcfyt) zdlpuopuiuVar);
        }
        return false;
    }

    boolean draadjrbmk() {
        return false;
    }

    boolean dxjokdxxww(xl.wflxmlrfwp wflxmlrfwpVar, xl.kcexrzcfyt kcexrzcfytVar) {
        return false;
    }

    protected int eablkybsjg() {
        return 5;
    }

    protected void gtknphoqwx() {
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public abstract boolean lqeggnwhkg(xl.wflxmlrfwp wflxmlrfwpVar, xl.wflxmlrfwp wflxmlrfwpVar2);

    Predicate ppxfxbqfkf(final xl.wflxmlrfwp wflxmlrfwpVar) {
        return new Predicate() { // from class: zl.wkgbmnqykc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f130312iobyxmoadg.gxszxtbevo(wflxmlrfwpVar, (zdlpuopuiu) obj);
            }
        };
    }

    public Predicate wkgbmnqykc(final xl.wflxmlrfwp wflxmlrfwpVar) {
        return new Predicate() { // from class: zl.ppxfxbqfkf
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f130310iobyxmoadg.lqeggnwhkg(wflxmlrfwpVar, (wflxmlrfwp) obj);
            }
        };
    }
}
