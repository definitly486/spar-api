package ru.myspar.tipsorder.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public interface zoijcleaow {

    public static final class dxjokdxxww implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104606iobyxmoadg;

        public dxjokdxxww(String scheme) {
            zdlpuopuiu.btonecajqb(scheme, "scheme");
            this.f104606iobyxmoadg = scheme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f104606iobyxmoadg, ((dxjokdxxww) obj).f104606iobyxmoadg);
        }

        public int hashCode() {
            return this.f104606iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104606iobyxmoadg;
        }

        public String toString() {
            return "OnSelectSbpBank(scheme=" + this.f104606iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104607iobyxmoadg;

        public eablkybsjg(String itemId) {
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f104607iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f104607iobyxmoadg, ((eablkybsjg) obj).f104607iobyxmoadg);
        }

        public int hashCode() {
            return this.f104607iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104607iobyxmoadg;
        }

        public String toString() {
            return "OnClickPaymentItem(itemId=" + this.f104607iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104608iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final long f104609zoijcleaow;

        public gxszxtbevo(String purposeCode, long j13) {
            zdlpuopuiu.btonecajqb(purposeCode, "purposeCode");
            this.f104608iobyxmoadg = purposeCode;
            this.f104609zoijcleaow = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f104608iobyxmoadg, gxszxtbevoVar.f104608iobyxmoadg) && this.f104609zoijcleaow == gxszxtbevoVar.f104609zoijcleaow;
        }

        public int hashCode() {
            return (this.f104608iobyxmoadg.hashCode() * 31) + Long.hashCode(this.f104609zoijcleaow);
        }

        public final long iobyxmoadg() {
            return this.f104609zoijcleaow;
        }

        public String toString() {
            return "OnClickTipOption(purposeCode=" + this.f104608iobyxmoadg + ", optionId=" + this.f104609zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f104608iobyxmoadg;
        }
    }

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f104610iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -801887000;
        }

        public String toString() {
            return "ContentShow";
        }
    }

    public static final class lqeggnwhkg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f104611iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -634793279;
        }

        public String toString() {
            return "OnDialogButtonClick";
        }
    }

    public static final class nufgyqmvbu implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f104612iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 1052696749;
        }

        public String toString() {
            return "OnPayClick";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104613iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final tzroggbefp f104614zoijcleaow;

        public ppxfxbqfkf(String purposeCode, tzroggbefp value) {
            zdlpuopuiu.btonecajqb(purposeCode, "purposeCode");
            zdlpuopuiu.btonecajqb(value, "value");
            this.f104613iobyxmoadg = purposeCode;
            this.f104614zoijcleaow = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f104613iobyxmoadg, ppxfxbqfkfVar.f104613iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104614zoijcleaow, ppxfxbqfkfVar.f104614zoijcleaow);
        }

        public int hashCode() {
            return (this.f104613iobyxmoadg.hashCode() * 31) + this.f104614zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104613iobyxmoadg;
        }

        public String toString() {
            return "OnChangeTipsInput(purposeCode=" + this.f104613iobyxmoadg + ", value=" + this.f104614zoijcleaow + ")";
        }

        public final tzroggbefp zoijcleaow() {
            return this.f104614zoijcleaow;
        }
    }

    public static final class wkgbmnqykc implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104615iobyxmoadg;

        public wkgbmnqykc(String purposeCode) {
            zdlpuopuiu.btonecajqb(purposeCode, "purposeCode");
            this.f104615iobyxmoadg = purposeCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f104615iobyxmoadg, ((wkgbmnqykc) obj).f104615iobyxmoadg);
        }

        public int hashCode() {
            return this.f104615iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104615iobyxmoadg;
        }

        public String toString() {
            return "OnClearTipsInput(purposeCode=" + this.f104615iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.tipsorder.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2536zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2536zoijcleaow f104616iobyxmoadg = new C2536zoijcleaow();

        private C2536zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2536zoijcleaow);
        }

        public int hashCode() {
            return 865571732;
        }

        public String toString() {
            return "OnBackClick";
        }
    }
}
