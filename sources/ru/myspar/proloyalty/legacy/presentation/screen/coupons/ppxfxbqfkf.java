package ru.myspar.proloyalty.legacy.presentation.screen.coupons;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class eablkybsjg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f96680iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 718006425;
        }

        public String toString() {
            return "OnOpenQrClicked";
        }
    }

    public static final class gxszxtbevo implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f96681iobyxmoadg;

        public gxszxtbevo(CharSequence promoCode) {
            zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            this.f96681iobyxmoadg = promoCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f96681iobyxmoadg, ((gxszxtbevo) obj).f96681iobyxmoadg);
        }

        public int hashCode() {
            return this.f96681iobyxmoadg.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f96681iobyxmoadg;
        }

        public String toString() {
            return "OnPromoCodeClicked(promoCode=" + ((Object) this.f96681iobyxmoadg) + ")";
        }
    }

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f96682iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -373943957;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.coupons.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2284ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96683iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f96684ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f96685wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f96686zoijcleaow;

        public C2284ppxfxbqfkf(String couponId, String couponTitle, String action, String reference) {
            zdlpuopuiu.btonecajqb(couponId, "couponId");
            zdlpuopuiu.btonecajqb(couponTitle, "couponTitle");
            zdlpuopuiu.btonecajqb(action, "action");
            zdlpuopuiu.btonecajqb(reference, "reference");
            this.f96683iobyxmoadg = couponId;
            this.f96686zoijcleaow = couponTitle;
            this.f96684ppxfxbqfkf = action;
            this.f96685wkgbmnqykc = reference;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2284ppxfxbqfkf)) {
                return false;
            }
            C2284ppxfxbqfkf c2284ppxfxbqfkf = (C2284ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f96683iobyxmoadg, c2284ppxfxbqfkf.f96683iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f96686zoijcleaow, c2284ppxfxbqfkf.f96686zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f96684ppxfxbqfkf, c2284ppxfxbqfkf.f96684ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f96685wkgbmnqykc, c2284ppxfxbqfkf.f96685wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f96683iobyxmoadg.hashCode() * 31) + this.f96686zoijcleaow.hashCode()) * 31) + this.f96684ppxfxbqfkf.hashCode()) * 31) + this.f96685wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96684ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f96686zoijcleaow;
        }

        public String toString() {
            return "OnCouponActionClicked(couponId=" + this.f96683iobyxmoadg + ", couponTitle=" + this.f96686zoijcleaow + ", action=" + this.f96684ppxfxbqfkf + ", reference=" + this.f96685wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f96685wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f96683iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final da1.eablkybsjg f96687iobyxmoadg;

        public wkgbmnqykc(da1.eablkybsjg coupon) {
            zdlpuopuiu.btonecajqb(coupon, "coupon");
            this.f96687iobyxmoadg = coupon;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f96687iobyxmoadg, ((wkgbmnqykc) obj).f96687iobyxmoadg);
        }

        public int hashCode() {
            return this.f96687iobyxmoadg.hashCode();
        }

        public final da1.eablkybsjg iobyxmoadg() {
            return this.f96687iobyxmoadg;
        }

        public String toString() {
            return "OnCouponClicked(coupon=" + this.f96687iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f96688iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1610874116;
        }

        public String toString() {
            return "OnCloseCouponDialogClicked";
        }
    }
}
