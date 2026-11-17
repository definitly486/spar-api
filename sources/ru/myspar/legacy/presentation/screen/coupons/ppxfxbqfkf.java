package ru.myspar.legacy.presentation.screen.coupons;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface ppxfxbqfkf {

    public static final class eablkybsjg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f88896iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -115561546;
        }

        public String toString() {
            return "OnOpenQrClicked";
        }
    }

    public static final class gxszxtbevo implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f88897iobyxmoadg;

        public gxszxtbevo(CharSequence promoCode) {
            zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            this.f88897iobyxmoadg = promoCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f88897iobyxmoadg, ((gxszxtbevo) obj).f88897iobyxmoadg);
        }

        public int hashCode() {
            return this.f88897iobyxmoadg.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f88897iobyxmoadg;
        }

        public String toString() {
            return "OnPromoCodeClicked(promoCode=" + ((Object) this.f88897iobyxmoadg) + ")";
        }
    }

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f88898iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -846856696;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.coupons.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2039ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88899iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f88900ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f88901wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f88902zoijcleaow;

        public C2039ppxfxbqfkf(String couponId, String couponTitle, String action, String reference) {
            zdlpuopuiu.btonecajqb(couponId, "couponId");
            zdlpuopuiu.btonecajqb(couponTitle, "couponTitle");
            zdlpuopuiu.btonecajqb(action, "action");
            zdlpuopuiu.btonecajqb(reference, "reference");
            this.f88899iobyxmoadg = couponId;
            this.f88902zoijcleaow = couponTitle;
            this.f88900ppxfxbqfkf = action;
            this.f88901wkgbmnqykc = reference;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2039ppxfxbqfkf)) {
                return false;
            }
            C2039ppxfxbqfkf c2039ppxfxbqfkf = (C2039ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f88899iobyxmoadg, c2039ppxfxbqfkf.f88899iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88902zoijcleaow, c2039ppxfxbqfkf.f88902zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f88900ppxfxbqfkf, c2039ppxfxbqfkf.f88900ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f88901wkgbmnqykc, c2039ppxfxbqfkf.f88901wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f88899iobyxmoadg.hashCode() * 31) + this.f88902zoijcleaow.hashCode()) * 31) + this.f88900ppxfxbqfkf.hashCode()) * 31) + this.f88901wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88900ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f88902zoijcleaow;
        }

        public String toString() {
            return "OnCouponActionClicked(couponId=" + this.f88899iobyxmoadg + ", couponTitle=" + this.f88902zoijcleaow + ", action=" + this.f88900ppxfxbqfkf + ", reference=" + this.f88901wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f88901wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f88899iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ec0.eablkybsjg f88903iobyxmoadg;

        public wkgbmnqykc(ec0.eablkybsjg coupon) {
            zdlpuopuiu.btonecajqb(coupon, "coupon");
            this.f88903iobyxmoadg = coupon;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f88903iobyxmoadg, ((wkgbmnqykc) obj).f88903iobyxmoadg);
        }

        public int hashCode() {
            return this.f88903iobyxmoadg.hashCode();
        }

        public final ec0.eablkybsjg iobyxmoadg() {
            return this.f88903iobyxmoadg;
        }

        public String toString() {
            return "OnCouponClicked(coupon=" + this.f88903iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f88904iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1345645113;
        }

        public String toString() {
            return "OnCloseCouponDialogClicked";
        }
    }
}
