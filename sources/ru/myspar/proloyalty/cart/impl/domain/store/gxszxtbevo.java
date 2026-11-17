package ru.myspar.proloyalty.cart.impl.domain.store;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.common.view.promo_code.PromoCodeEditorState;
import ru.myspar.proloyalty.core.domain.models.LoadInfo;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantDetails;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class agtfadlqog implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f92717iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final pt0.btonecajqb f92718zoijcleaow;

        public agtfadlqog(tzroggbefp promo, pt0.btonecajqb promoState) {
            zdlpuopuiu.btonecajqb(promo, "promo");
            zdlpuopuiu.btonecajqb(promoState, "promoState");
            this.f92717iobyxmoadg = promo;
            this.f92718zoijcleaow = promoState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return zdlpuopuiu.eablkybsjg(this.f92717iobyxmoadg, agtfadlqogVar.f92717iobyxmoadg) && this.f92718zoijcleaow == agtfadlqogVar.f92718zoijcleaow;
        }

        public int hashCode() {
            return (this.f92717iobyxmoadg.hashCode() * 31) + this.f92718zoijcleaow.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f92717iobyxmoadg;
        }

        public String toString() {
            return "PromoChanged(promo=" + this.f92717iobyxmoadg + ", promoState=" + this.f92718zoijcleaow + ")";
        }

        public final pt0.btonecajqb zoijcleaow() {
            return this.f92718zoijcleaow;
        }
    }

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f92719iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return -1401717156;
        }

        public String toString() {
            return "ClearDialog";
        }
    }

    public static final class draadjrbmk implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CartStore$CartDialogType f92720iobyxmoadg;

        public draadjrbmk(CartStore$CartDialogType dialogType) {
            zdlpuopuiu.btonecajqb(dialogType, "dialogType");
            this.f92720iobyxmoadg = dialogType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f92720iobyxmoadg, ((draadjrbmk) obj).f92720iobyxmoadg);
        }

        public int hashCode() {
            return this.f92720iobyxmoadg.hashCode();
        }

        public final CartStore$CartDialogType iobyxmoadg() {
            return this.f92720iobyxmoadg;
        }

        public String toString() {
            return "OpenDialog(dialogType=" + this.f92720iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f92721iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return 1826435380;
        }

        public String toString() {
            return "ClearCart";
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f92722iobyxmoadg;

        public eablkybsjg(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f92722iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f92722iobyxmoadg, ((eablkybsjg) obj).f92722iobyxmoadg);
        }

        public int hashCode() {
            return this.f92722iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f92722iobyxmoadg;
        }

        public String toString() {
            return "ChangeBonusesEditorValue(value=" + this.f92722iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f92723iobyxmoadg;

        public gtknphoqwx(boolean z13) {
            this.f92723iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && this.f92723iobyxmoadg == ((gtknphoqwx) obj).f92723iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f92723iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f92723iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f92723iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.domain.store.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2159gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f92724iobyxmoadg;

        public C2159gxszxtbevo(List recommendations) {
            zdlpuopuiu.btonecajqb(recommendations, "recommendations");
            this.f92724iobyxmoadg = recommendations;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2159gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f92724iobyxmoadg, ((C2159gxszxtbevo) obj).f92724iobyxmoadg);
        }

        public int hashCode() {
            return this.f92724iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f92724iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductRecommendations(recommendations=" + this.f92724iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Cart f92725iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final PromoCodeEditorState f92726ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final kz0.nufgyqmvbu f92727wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final RestaurantDetails f92728zoijcleaow;

        public iobyxmoadg(Cart cart, RestaurantDetails restaurantDetails, PromoCodeEditorState promoCodeEditorState, kz0.nufgyqmvbu nufgyqmvbuVar) {
            zdlpuopuiu.btonecajqb(cart, "cart");
            zdlpuopuiu.btonecajqb(promoCodeEditorState, "promoCodeEditorState");
            this.f92725iobyxmoadg = cart;
            this.f92728zoijcleaow = restaurantDetails;
            this.f92726ppxfxbqfkf = promoCodeEditorState;
            this.f92727wkgbmnqykc = nufgyqmvbuVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f92725iobyxmoadg, iobyxmoadgVar.f92725iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92728zoijcleaow, iobyxmoadgVar.f92728zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f92726ppxfxbqfkf, iobyxmoadgVar.f92726ppxfxbqfkf) && this.f92727wkgbmnqykc == iobyxmoadgVar.f92727wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = this.f92725iobyxmoadg.hashCode() * 31;
            RestaurantDetails restaurantDetails = this.f92728zoijcleaow;
            int iHashCode2 = (((iHashCode + (restaurantDetails == null ? 0 : restaurantDetails.hashCode())) * 31) + this.f92726ppxfxbqfkf.hashCode()) * 31;
            kz0.nufgyqmvbu nufgyqmvbuVar = this.f92727wkgbmnqykc;
            return iHashCode2 + (nufgyqmvbuVar != null ? nufgyqmvbuVar.hashCode() : 0);
        }

        public final Cart iobyxmoadg() {
            return this.f92725iobyxmoadg;
        }

        public final RestaurantDetails ppxfxbqfkf() {
            return this.f92728zoijcleaow;
        }

        public String toString() {
            return "CartInfoUpdated(cart=" + this.f92725iobyxmoadg + ", restaurant=" + this.f92728zoijcleaow + ", promoCodeEditorState=" + this.f92726ppxfxbqfkf + ", warningState=" + this.f92727wkgbmnqykc + ")";
        }

        public final kz0.nufgyqmvbu wkgbmnqykc() {
            return this.f92727wkgbmnqykc;
        }

        public final PromoCodeEditorState zoijcleaow() {
            return this.f92726ppxfxbqfkf;
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f92729iobyxmoadg;

        public lqeggnwhkg(boolean z13) {
            this.f92729iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f92729iobyxmoadg == ((lqeggnwhkg) obj).f92729iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f92729iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f92729iobyxmoadg;
        }

        public String toString() {
            return "ChangeRemoveProgress(isVisible=" + this.f92729iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f92730iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            this.f92730iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f92730iobyxmoadg == ((nufgyqmvbu) obj).f92730iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f92730iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f92730iobyxmoadg;
        }

        public String toString() {
            return "ChangeScrollToTop(isNeededScrollToTop=" + this.f92730iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f92731iobyxmoadg;

        public ojitshcjhn(List productDataList) {
            zdlpuopuiu.btonecajqb(productDataList, "productDataList");
            this.f92731iobyxmoadg = productDataList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && zdlpuopuiu.eablkybsjg(this.f92731iobyxmoadg, ((ojitshcjhn) obj).f92731iobyxmoadg);
        }

        public int hashCode() {
            return this.f92731iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f92731iobyxmoadg;
        }

        public String toString() {
            return "UpdateProductDataList(productDataList=" + this.f92731iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f92732iobyxmoadg;

        public ppxfxbqfkf(int i13) {
            this.f92732iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f92732iobyxmoadg == ((ppxfxbqfkf) obj).f92732iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f92732iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f92732iobyxmoadg;
        }

        public String toString() {
            return "ChangeAppliedBonuses(value=" + this.f92732iobyxmoadg + ")";
        }
    }

    public static final class rgvfuqvkyq implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final kz0.nufgyqmvbu f92733iobyxmoadg;

        public rgvfuqvkyq(kz0.nufgyqmvbu nufgyqmvbuVar) {
            this.f92733iobyxmoadg = nufgyqmvbuVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof rgvfuqvkyq) && this.f92733iobyxmoadg == ((rgvfuqvkyq) obj).f92733iobyxmoadg;
        }

        public int hashCode() {
            kz0.nufgyqmvbu nufgyqmvbuVar = this.f92733iobyxmoadg;
            if (nufgyqmvbuVar == null) {
                return 0;
            }
            return nufgyqmvbuVar.hashCode();
        }

        public final kz0.nufgyqmvbu iobyxmoadg() {
            return this.f92733iobyxmoadg;
        }

        public String toString() {
            return "WarningStateChanged(warningState=" + this.f92733iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f92734iobyxmoadg;

        public wflxmlrfwp(boolean z13) {
            this.f92734iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && this.f92734iobyxmoadg == ((wflxmlrfwp) obj).f92734iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f92734iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f92734iobyxmoadg;
        }

        public String toString() {
            return "OrderSendStatusChanged(isSend=" + this.f92734iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f92735iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f92735iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f92735iobyxmoadg == ((wkgbmnqykc) obj).f92735iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f92735iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f92735iobyxmoadg;
        }

        public String toString() {
            return "ChangeBonusesEditorEnabled(value=" + this.f92735iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LoadInfo f92736iobyxmoadg;

        public zoijcleaow(LoadInfo loadInfo) {
            this.f92736iobyxmoadg = loadInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f92736iobyxmoadg, ((zoijcleaow) obj).f92736iobyxmoadg);
        }

        public int hashCode() {
            LoadInfo loadInfo = this.f92736iobyxmoadg;
            if (loadInfo == null) {
                return 0;
            }
            return loadInfo.hashCode();
        }

        public final LoadInfo iobyxmoadg() {
            return this.f92736iobyxmoadg;
        }

        public String toString() {
            return "CartRemoteInfoChanged(loadInfo=" + this.f92736iobyxmoadg + ")";
        }
    }
}
