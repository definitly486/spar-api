package a61;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f942iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 623263413;
        }

        public String toString() {
            return "OnOpenQrClicked";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f943iobyxmoadg;

        public gxszxtbevo(CharSequence promoCode) {
            zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            this.f943iobyxmoadg = promoCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f943iobyxmoadg, ((gxszxtbevo) obj).f943iobyxmoadg);
        }

        public int hashCode() {
            return this.f943iobyxmoadg.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f943iobyxmoadg;
        }

        public String toString() {
            return "OnPromoCodeClicked(promoCode=" + ((Object) this.f943iobyxmoadg) + ")";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f944iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -461375097;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f945iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f946ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f947wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f948zoijcleaow;

        public ppxfxbqfkf(String couponId, String couponTitle, String action, String reference) {
            zdlpuopuiu.btonecajqb(couponId, "couponId");
            zdlpuopuiu.btonecajqb(couponTitle, "couponTitle");
            zdlpuopuiu.btonecajqb(action, "action");
            zdlpuopuiu.btonecajqb(reference, "reference");
            this.f945iobyxmoadg = couponId;
            this.f948zoijcleaow = couponTitle;
            this.f946ppxfxbqfkf = action;
            this.f947wkgbmnqykc = reference;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f945iobyxmoadg, ppxfxbqfkfVar.f945iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f948zoijcleaow, ppxfxbqfkfVar.f948zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f946ppxfxbqfkf, ppxfxbqfkfVar.f946ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f947wkgbmnqykc, ppxfxbqfkfVar.f947wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f945iobyxmoadg.hashCode() * 31) + this.f948zoijcleaow.hashCode()) * 31) + this.f946ppxfxbqfkf.hashCode()) * 31) + this.f947wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f946ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f948zoijcleaow;
        }

        public String toString() {
            return "OnCouponActionClicked(couponId=" + this.f945iobyxmoadg + ", couponTitle=" + this.f948zoijcleaow + ", action=" + this.f946ppxfxbqfkf + ", reference=" + this.f947wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f947wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f945iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: a61.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0011wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f949iobyxmoadg;

        public C0011wkgbmnqykc(String couponId) {
            zdlpuopuiu.btonecajqb(couponId, "couponId");
            this.f949iobyxmoadg = couponId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0011wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f949iobyxmoadg, ((C0011wkgbmnqykc) obj).f949iobyxmoadg);
        }

        public int hashCode() {
            return this.f949iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f949iobyxmoadg;
        }

        public String toString() {
            return "OnCouponClicked(couponId=" + this.f949iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f950iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -832176792;
        }

        public String toString() {
            return "OnCloseCouponDialogClicked";
        }
    }
}
