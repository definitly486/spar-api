package ou1;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import pt0.btonecajqb;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface gxszxtbevo {

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f74746iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -1833996828;
        }

        public String toString() {
            return "ClearCustomizableParamBuffer";
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f74747iobyxmoadg;

        public eablkybsjg(boolean z13) {
            this.f74747iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f74747iobyxmoadg == ((eablkybsjg) obj).f74747iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f74747iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f74747iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoadingState(isLoading=" + this.f74747iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ou1.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1625gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f74748iobyxmoadg;

        public C1625gxszxtbevo(boolean z13) {
            this.f74748iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1625gxszxtbevo) && this.f74748iobyxmoadg == ((C1625gxszxtbevo) obj).f74748iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f74748iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f74748iobyxmoadg;
        }

        public String toString() {
            return "ChangeOpenSettingsBottomSheet(isOpen=" + this.f74748iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f74749iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f74749iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f74749iobyxmoadg == ((iobyxmoadg) obj).f74749iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f74749iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f74749iobyxmoadg;
        }

        public String toString() {
            return "ChangeAutoRenewalEnabled(isEnabled=" + this.f74749iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f74750iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final btonecajqb f74751zoijcleaow;

        public lqeggnwhkg(tzroggbefp promo, btonecajqb promoState) {
            zdlpuopuiu.btonecajqb(promo, "promo");
            zdlpuopuiu.btonecajqb(promoState, "promoState");
            this.f74750iobyxmoadg = promo;
            this.f74751zoijcleaow = promoState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return zdlpuopuiu.eablkybsjg(this.f74750iobyxmoadg, lqeggnwhkgVar.f74750iobyxmoadg) && this.f74751zoijcleaow == lqeggnwhkgVar.f74751zoijcleaow;
        }

        public int hashCode() {
            return (this.f74750iobyxmoadg.hashCode() * 31) + this.f74751zoijcleaow.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f74750iobyxmoadg;
        }

        public String toString() {
            return "ChangePromoCode(promo=" + this.f74750iobyxmoadg + ", promoState=" + this.f74751zoijcleaow + ")";
        }

        public final btonecajqb zoijcleaow() {
            return this.f74751zoijcleaow;
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74752iobyxmoadg;

        public nufgyqmvbu(String settingId) {
            zdlpuopuiu.btonecajqb(settingId, "settingId");
            this.f74752iobyxmoadg = settingId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f74752iobyxmoadg, ((nufgyqmvbu) obj).f74752iobyxmoadg);
        }

        public int hashCode() {
            return this.f74752iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f74752iobyxmoadg;
        }

        public String toString() {
            return "ChangeSettingAdditionalInfoNumber(settingId=" + this.f74752iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74753iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f74754zoijcleaow;

        public ppxfxbqfkf(String settingId, String variantValue) {
            zdlpuopuiu.btonecajqb(settingId, "settingId");
            zdlpuopuiu.btonecajqb(variantValue, "variantValue");
            this.f74753iobyxmoadg = settingId;
            this.f74754zoijcleaow = variantValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f74753iobyxmoadg, ppxfxbqfkfVar.f74753iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f74754zoijcleaow, ppxfxbqfkfVar.f74754zoijcleaow);
        }

        public int hashCode() {
            return (this.f74753iobyxmoadg.hashCode() * 31) + this.f74754zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f74753iobyxmoadg;
        }

        public String toString() {
            return "ChangeCustomizableParam(settingId=" + this.f74753iobyxmoadg + ", variantValue=" + this.f74754zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f74754zoijcleaow;
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SubscriptionDetailInfo f74755iobyxmoadg;

        public wkgbmnqykc(SubscriptionDetailInfo detailInfo) {
            zdlpuopuiu.btonecajqb(detailInfo, "detailInfo");
            this.f74755iobyxmoadg = detailInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f74755iobyxmoadg, ((wkgbmnqykc) obj).f74755iobyxmoadg);
        }

        public int hashCode() {
            return this.f74755iobyxmoadg.hashCode();
        }

        public final SubscriptionDetailInfo iobyxmoadg() {
            return this.f74755iobyxmoadg;
        }

        public String toString() {
            return "ChangeDetailInfo(detailInfo=" + this.f74755iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f74756iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f74756iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f74756iobyxmoadg == ((zoijcleaow) obj).f74756iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f74756iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f74756iobyxmoadg;
        }

        public String toString() {
            return "ChangeAutoRenewalLoading(isLoading=" + this.f74756iobyxmoadg + ")";
        }
    }
}
