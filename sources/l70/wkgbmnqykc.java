package l70;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f61799iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -655943598;
        }

        public String toString() {
            return "OnOpenQrClicked";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f61800iobyxmoadg;

        public gxszxtbevo(CharSequence promoCode) {
            zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            this.f61800iobyxmoadg = promoCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f61800iobyxmoadg, ((gxszxtbevo) obj).f61800iobyxmoadg);
        }

        public int hashCode() {
            return this.f61800iobyxmoadg.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f61800iobyxmoadg;
        }

        public String toString() {
            return "OnPromoCodeClicked(promoCode=" + ((Object) this.f61800iobyxmoadg) + ")";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f61801iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1294943068;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f61802iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f61803ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f61804wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f61805zoijcleaow;

        public ppxfxbqfkf(String couponId, String couponTitle, String action, String reference) {
            zdlpuopuiu.btonecajqb(couponId, "couponId");
            zdlpuopuiu.btonecajqb(couponTitle, "couponTitle");
            zdlpuopuiu.btonecajqb(action, "action");
            zdlpuopuiu.btonecajqb(reference, "reference");
            this.f61802iobyxmoadg = couponId;
            this.f61805zoijcleaow = couponTitle;
            this.f61803ppxfxbqfkf = action;
            this.f61804wkgbmnqykc = reference;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f61802iobyxmoadg, ppxfxbqfkfVar.f61802iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61805zoijcleaow, ppxfxbqfkfVar.f61805zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f61803ppxfxbqfkf, ppxfxbqfkfVar.f61803ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f61804wkgbmnqykc, ppxfxbqfkfVar.f61804wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f61802iobyxmoadg.hashCode() * 31) + this.f61805zoijcleaow.hashCode()) * 31) + this.f61803ppxfxbqfkf.hashCode()) * 31) + this.f61804wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f61803ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f61805zoijcleaow;
        }

        public String toString() {
            return "OnCouponActionClicked(couponId=" + this.f61802iobyxmoadg + ", couponTitle=" + this.f61805zoijcleaow + ", action=" + this.f61803ppxfxbqfkf + ", reference=" + this.f61804wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f61804wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f61802iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: l70.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1252wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f61806iobyxmoadg;

        public C1252wkgbmnqykc(String couponId) {
            zdlpuopuiu.btonecajqb(couponId, "couponId");
            this.f61806iobyxmoadg = couponId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1252wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f61806iobyxmoadg, ((C1252wkgbmnqykc) obj).f61806iobyxmoadg);
        }

        public int hashCode() {
            return this.f61806iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f61806iobyxmoadg;
        }

        public String toString() {
            return "OnCouponClicked(couponId=" + this.f61806iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f61807iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1882853461;
        }

        public String toString() {
            return "OnCloseCouponDialogClicked";
        }
    }
}
