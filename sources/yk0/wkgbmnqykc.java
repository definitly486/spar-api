package yk0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125575iobyxmoadg;

        public eablkybsjg(String newCardNumber) {
            zdlpuopuiu.btonecajqb(newCardNumber, "newCardNumber");
            this.f125575iobyxmoadg = newCardNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f125575iobyxmoadg, ((eablkybsjg) obj).f125575iobyxmoadg);
        }

        public int hashCode() {
            return this.f125575iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f125575iobyxmoadg;
        }

        public String toString() {
            return "OnConfirmDialog(newCardNumber=" + this.f125575iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f125576iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 476471223;
        }

        public String toString() {
            return "OnScanClick";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f125577iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 991055697;
        }

        public String toString() {
            return "OnActivateCardClick";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f125578iobyxmoadg;

        public lqeggnwhkg(String str) {
            this.f125578iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f125578iobyxmoadg, ((lqeggnwhkg) obj).f125578iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f125578iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f125578iobyxmoadg;
        }

        public String toString() {
            return "OnScanResult(value=" + this.f125578iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f125579iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 124060877;
        }

        public String toString() {
            return "OnSupportClick";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f125580iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1331889286;
        }

        public String toString() {
            return "OnCancelConfirmDialog";
        }
    }

    /* JADX INFO: renamed from: yk0.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C3201wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f125581iobyxmoadg;

        public C3201wkgbmnqykc(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f125581iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3201wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f125581iobyxmoadg, ((C3201wkgbmnqykc) obj).f125581iobyxmoadg);
        }

        public int hashCode() {
            return this.f125581iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f125581iobyxmoadg;
        }

        public String toString() {
            return "OnChangeCardNumber(value=" + this.f125581iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f125582iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -658074739;
        }

        public String toString() {
            return "OnBackClick";
        }
    }
}
