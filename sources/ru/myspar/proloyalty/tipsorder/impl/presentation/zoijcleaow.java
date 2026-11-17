package ru.myspar.proloyalty.tipsorder.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public interface zoijcleaow {

    public static final class dxjokdxxww implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101969iobyxmoadg;

        public dxjokdxxww(String scheme) {
            zdlpuopuiu.btonecajqb(scheme, "scheme");
            this.f101969iobyxmoadg = scheme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f101969iobyxmoadg, ((dxjokdxxww) obj).f101969iobyxmoadg);
        }

        public int hashCode() {
            return this.f101969iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101969iobyxmoadg;
        }

        public String toString() {
            return "OnSelectSbpBank(scheme=" + this.f101969iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101970iobyxmoadg;

        public eablkybsjg(String itemId) {
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f101970iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f101970iobyxmoadg, ((eablkybsjg) obj).f101970iobyxmoadg);
        }

        public int hashCode() {
            return this.f101970iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101970iobyxmoadg;
        }

        public String toString() {
            return "OnClickPaymentItem(itemId=" + this.f101970iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101971iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final long f101972zoijcleaow;

        public gxszxtbevo(String purposeCode, long j13) {
            zdlpuopuiu.btonecajqb(purposeCode, "purposeCode");
            this.f101971iobyxmoadg = purposeCode;
            this.f101972zoijcleaow = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f101971iobyxmoadg, gxszxtbevoVar.f101971iobyxmoadg) && this.f101972zoijcleaow == gxszxtbevoVar.f101972zoijcleaow;
        }

        public int hashCode() {
            return (this.f101971iobyxmoadg.hashCode() * 31) + Long.hashCode(this.f101972zoijcleaow);
        }

        public final long iobyxmoadg() {
            return this.f101972zoijcleaow;
        }

        public String toString() {
            return "OnClickTipOption(purposeCode=" + this.f101971iobyxmoadg + ", optionId=" + this.f101972zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f101971iobyxmoadg;
        }
    }

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f101973iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1203101723;
        }

        public String toString() {
            return "ContentShow";
        }
    }

    public static final class lqeggnwhkg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f101974iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 365918398;
        }

        public String toString() {
            return "OnDialogButtonClick";
        }
    }

    public static final class nufgyqmvbu implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f101975iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -1731192304;
        }

        public String toString() {
            return "OnPayClick";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101976iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final tzroggbefp f101977zoijcleaow;

        public ppxfxbqfkf(String purposeCode, tzroggbefp value) {
            zdlpuopuiu.btonecajqb(purposeCode, "purposeCode");
            zdlpuopuiu.btonecajqb(value, "value");
            this.f101976iobyxmoadg = purposeCode;
            this.f101977zoijcleaow = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f101976iobyxmoadg, ppxfxbqfkfVar.f101976iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101977zoijcleaow, ppxfxbqfkfVar.f101977zoijcleaow);
        }

        public int hashCode() {
            return (this.f101976iobyxmoadg.hashCode() * 31) + this.f101977zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101976iobyxmoadg;
        }

        public String toString() {
            return "OnChangeTipsInput(purposeCode=" + this.f101976iobyxmoadg + ", value=" + this.f101977zoijcleaow + ")";
        }

        public final tzroggbefp zoijcleaow() {
            return this.f101977zoijcleaow;
        }
    }

    public static final class wkgbmnqykc implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101978iobyxmoadg;

        public wkgbmnqykc(String purposeCode) {
            zdlpuopuiu.btonecajqb(purposeCode, "purposeCode");
            this.f101978iobyxmoadg = purposeCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f101978iobyxmoadg, ((wkgbmnqykc) obj).f101978iobyxmoadg);
        }

        public int hashCode() {
            return this.f101978iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101978iobyxmoadg;
        }

        public String toString() {
            return "OnClearTipsInput(purposeCode=" + this.f101978iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.tipsorder.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2458zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2458zoijcleaow f101979iobyxmoadg = new C2458zoijcleaow();

        private C2458zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2458zoijcleaow);
        }

        public int hashCode() {
            return 464357009;
        }

        public String toString() {
            return "OnBackClick";
        }
    }
}
