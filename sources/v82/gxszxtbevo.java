package v82;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailInfo;
import vu.btonecajqb;

/* JADX INFO: loaded from: classes6.dex */
public interface gxszxtbevo {

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f116345iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -257118489;
        }

        public String toString() {
            return "ClearCustomizableParamBuffer";
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f116346iobyxmoadg;

        public eablkybsjg(boolean z13) {
            this.f116346iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f116346iobyxmoadg == ((eablkybsjg) obj).f116346iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f116346iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f116346iobyxmoadg;
        }

        public String toString() {
            return "ChangeLoadingState(isLoading=" + this.f116346iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: v82.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2897gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f116347iobyxmoadg;

        public C2897gxszxtbevo(boolean z13) {
            this.f116347iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2897gxszxtbevo) && this.f116347iobyxmoadg == ((C2897gxszxtbevo) obj).f116347iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f116347iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f116347iobyxmoadg;
        }

        public String toString() {
            return "ChangeOpenSettingsBottomSheet(isOpen=" + this.f116347iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f116348iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f116348iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f116348iobyxmoadg == ((iobyxmoadg) obj).f116348iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f116348iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f116348iobyxmoadg;
        }

        public String toString() {
            return "ChangeAutoRenewalEnabled(isEnabled=" + this.f116348iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f116349iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final btonecajqb f116350zoijcleaow;

        public lqeggnwhkg(tzroggbefp promo, btonecajqb promoState) {
            zdlpuopuiu.btonecajqb(promo, "promo");
            zdlpuopuiu.btonecajqb(promoState, "promoState");
            this.f116349iobyxmoadg = promo;
            this.f116350zoijcleaow = promoState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return zdlpuopuiu.eablkybsjg(this.f116349iobyxmoadg, lqeggnwhkgVar.f116349iobyxmoadg) && this.f116350zoijcleaow == lqeggnwhkgVar.f116350zoijcleaow;
        }

        public int hashCode() {
            return (this.f116349iobyxmoadg.hashCode() * 31) + this.f116350zoijcleaow.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f116349iobyxmoadg;
        }

        public String toString() {
            return "ChangePromoCode(promo=" + this.f116349iobyxmoadg + ", promoState=" + this.f116350zoijcleaow + ")";
        }

        public final btonecajqb zoijcleaow() {
            return this.f116350zoijcleaow;
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f116351iobyxmoadg;

        public nufgyqmvbu(String settingId) {
            zdlpuopuiu.btonecajqb(settingId, "settingId");
            this.f116351iobyxmoadg = settingId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f116351iobyxmoadg, ((nufgyqmvbu) obj).f116351iobyxmoadg);
        }

        public int hashCode() {
            return this.f116351iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f116351iobyxmoadg;
        }

        public String toString() {
            return "ChangeSettingAdditionalInfoNumber(settingId=" + this.f116351iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f116352iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f116353zoijcleaow;

        public ppxfxbqfkf(String settingId, String variantValue) {
            zdlpuopuiu.btonecajqb(settingId, "settingId");
            zdlpuopuiu.btonecajqb(variantValue, "variantValue");
            this.f116352iobyxmoadg = settingId;
            this.f116353zoijcleaow = variantValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f116352iobyxmoadg, ppxfxbqfkfVar.f116352iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f116353zoijcleaow, ppxfxbqfkfVar.f116353zoijcleaow);
        }

        public int hashCode() {
            return (this.f116352iobyxmoadg.hashCode() * 31) + this.f116353zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f116352iobyxmoadg;
        }

        public String toString() {
            return "ChangeCustomizableParam(settingId=" + this.f116352iobyxmoadg + ", variantValue=" + this.f116353zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f116353zoijcleaow;
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SubscriptionDetailInfo f116354iobyxmoadg;

        public wkgbmnqykc(SubscriptionDetailInfo detailInfo) {
            zdlpuopuiu.btonecajqb(detailInfo, "detailInfo");
            this.f116354iobyxmoadg = detailInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f116354iobyxmoadg, ((wkgbmnqykc) obj).f116354iobyxmoadg);
        }

        public int hashCode() {
            return this.f116354iobyxmoadg.hashCode();
        }

        public final SubscriptionDetailInfo iobyxmoadg() {
            return this.f116354iobyxmoadg;
        }

        public String toString() {
            return "ChangeDetailInfo(detailInfo=" + this.f116354iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f116355iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f116355iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f116355iobyxmoadg == ((zoijcleaow) obj).f116355iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f116355iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f116355iobyxmoadg;
        }

        public String toString() {
            return "ChangeAutoRenewalLoading(isLoading=" + this.f116355iobyxmoadg + ")";
        }
    }
}
