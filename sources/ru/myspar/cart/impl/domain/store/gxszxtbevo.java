package ru.myspar.cart.impl.domain.store;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.common.view.promo_code.PromoCodeEditorState;
import ru.myspar.core.domain.models.LoadInfo;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.restaurants.RestaurantDetails;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {

    public static final class agtfadlqog implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f84788iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final vu.btonecajqb f84789zoijcleaow;

        public agtfadlqog(tzroggbefp promo, vu.btonecajqb promoState) {
            zdlpuopuiu.btonecajqb(promo, "promo");
            zdlpuopuiu.btonecajqb(promoState, "promoState");
            this.f84788iobyxmoadg = promo;
            this.f84789zoijcleaow = promoState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return zdlpuopuiu.eablkybsjg(this.f84788iobyxmoadg, agtfadlqogVar.f84788iobyxmoadg) && this.f84789zoijcleaow == agtfadlqogVar.f84789zoijcleaow;
        }

        public int hashCode() {
            return (this.f84788iobyxmoadg.hashCode() * 31) + this.f84789zoijcleaow.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f84788iobyxmoadg;
        }

        public String toString() {
            return "PromoChanged(promo=" + this.f84788iobyxmoadg + ", promoState=" + this.f84789zoijcleaow + ")";
        }

        public final vu.btonecajqb zoijcleaow() {
            return this.f84789zoijcleaow;
        }
    }

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f84790iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return 1347436127;
        }

        public String toString() {
            return "ClearDialog";
        }
    }

    public static final class draadjrbmk implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CartStore$CartDialogType f84791iobyxmoadg;

        public draadjrbmk(CartStore$CartDialogType dialogType) {
            zdlpuopuiu.btonecajqb(dialogType, "dialogType");
            this.f84791iobyxmoadg = dialogType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f84791iobyxmoadg, ((draadjrbmk) obj).f84791iobyxmoadg);
        }

        public int hashCode() {
            return this.f84791iobyxmoadg.hashCode();
        }

        public final CartStore$CartDialogType iobyxmoadg() {
            return this.f84791iobyxmoadg;
        }

        public String toString() {
            return "OpenDialog(dialogType=" + this.f84791iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f84792iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return 1172313591;
        }

        public String toString() {
            return "ClearCart";
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f84793iobyxmoadg;

        public eablkybsjg(tzroggbefp value) {
            zdlpuopuiu.btonecajqb(value, "value");
            this.f84793iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f84793iobyxmoadg, ((eablkybsjg) obj).f84793iobyxmoadg);
        }

        public int hashCode() {
            return this.f84793iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f84793iobyxmoadg;
        }

        public String toString() {
            return "ChangeBonusesEditorValue(value=" + this.f84793iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f84794iobyxmoadg;

        public gtknphoqwx(boolean z13) {
            this.f84794iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && this.f84794iobyxmoadg == ((gtknphoqwx) obj).f84794iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f84794iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f84794iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f84794iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1920gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f84795iobyxmoadg;

        public C1920gxszxtbevo(List recommendations) {
            zdlpuopuiu.btonecajqb(recommendations, "recommendations");
            this.f84795iobyxmoadg = recommendations;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1920gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f84795iobyxmoadg, ((C1920gxszxtbevo) obj).f84795iobyxmoadg);
        }

        public int hashCode() {
            return this.f84795iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f84795iobyxmoadg;
        }

        public String toString() {
            return "ChangeProductRecommendations(recommendations=" + this.f84795iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Cart f84796iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final PromoCodeEditorState f84797ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final t00.dxjokdxxww f84798wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final RestaurantDetails f84799zoijcleaow;

        public iobyxmoadg(Cart cart, RestaurantDetails restaurantDetails, PromoCodeEditorState promoCodeEditorState, t00.dxjokdxxww dxjokdxxwwVar) {
            zdlpuopuiu.btonecajqb(cart, "cart");
            zdlpuopuiu.btonecajqb(promoCodeEditorState, "promoCodeEditorState");
            this.f84796iobyxmoadg = cart;
            this.f84799zoijcleaow = restaurantDetails;
            this.f84797ppxfxbqfkf = promoCodeEditorState;
            this.f84798wkgbmnqykc = dxjokdxxwwVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f84796iobyxmoadg, iobyxmoadgVar.f84796iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f84799zoijcleaow, iobyxmoadgVar.f84799zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f84797ppxfxbqfkf, iobyxmoadgVar.f84797ppxfxbqfkf) && this.f84798wkgbmnqykc == iobyxmoadgVar.f84798wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = this.f84796iobyxmoadg.hashCode() * 31;
            RestaurantDetails restaurantDetails = this.f84799zoijcleaow;
            int iHashCode2 = (((iHashCode + (restaurantDetails == null ? 0 : restaurantDetails.hashCode())) * 31) + this.f84797ppxfxbqfkf.hashCode()) * 31;
            t00.dxjokdxxww dxjokdxxwwVar = this.f84798wkgbmnqykc;
            return iHashCode2 + (dxjokdxxwwVar != null ? dxjokdxxwwVar.hashCode() : 0);
        }

        public final Cart iobyxmoadg() {
            return this.f84796iobyxmoadg;
        }

        public final RestaurantDetails ppxfxbqfkf() {
            return this.f84799zoijcleaow;
        }

        public String toString() {
            return "CartInfoUpdated(cart=" + this.f84796iobyxmoadg + ", restaurant=" + this.f84799zoijcleaow + ", promoCodeEditorState=" + this.f84797ppxfxbqfkf + ", warningState=" + this.f84798wkgbmnqykc + ")";
        }

        public final t00.dxjokdxxww wkgbmnqykc() {
            return this.f84798wkgbmnqykc;
        }

        public final PromoCodeEditorState zoijcleaow() {
            return this.f84797ppxfxbqfkf;
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f84800iobyxmoadg;

        public lqeggnwhkg(boolean z13) {
            this.f84800iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f84800iobyxmoadg == ((lqeggnwhkg) obj).f84800iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f84800iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f84800iobyxmoadg;
        }

        public String toString() {
            return "ChangeRemoveProgress(isVisible=" + this.f84800iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f84801iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            this.f84801iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f84801iobyxmoadg == ((nufgyqmvbu) obj).f84801iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f84801iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f84801iobyxmoadg;
        }

        public String toString() {
            return "ChangeScrollToTop(isNeededScrollToTop=" + this.f84801iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f84802iobyxmoadg;

        public ojitshcjhn(List productDataList) {
            zdlpuopuiu.btonecajqb(productDataList, "productDataList");
            this.f84802iobyxmoadg = productDataList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && zdlpuopuiu.eablkybsjg(this.f84802iobyxmoadg, ((ojitshcjhn) obj).f84802iobyxmoadg);
        }

        public int hashCode() {
            return this.f84802iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f84802iobyxmoadg;
        }

        public String toString() {
            return "UpdateProductDataList(productDataList=" + this.f84802iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f84803iobyxmoadg;

        public ppxfxbqfkf(int i13) {
            this.f84803iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f84803iobyxmoadg == ((ppxfxbqfkf) obj).f84803iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f84803iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f84803iobyxmoadg;
        }

        public String toString() {
            return "ChangeAppliedBonuses(value=" + this.f84803iobyxmoadg + ")";
        }
    }

    public static final class rgvfuqvkyq implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final t00.dxjokdxxww f84804iobyxmoadg;

        public rgvfuqvkyq(t00.dxjokdxxww dxjokdxxwwVar) {
            this.f84804iobyxmoadg = dxjokdxxwwVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof rgvfuqvkyq) && this.f84804iobyxmoadg == ((rgvfuqvkyq) obj).f84804iobyxmoadg;
        }

        public int hashCode() {
            t00.dxjokdxxww dxjokdxxwwVar = this.f84804iobyxmoadg;
            if (dxjokdxxwwVar == null) {
                return 0;
            }
            return dxjokdxxwwVar.hashCode();
        }

        public final t00.dxjokdxxww iobyxmoadg() {
            return this.f84804iobyxmoadg;
        }

        public String toString() {
            return "WarningStateChanged(warningState=" + this.f84804iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f84805iobyxmoadg;

        public wflxmlrfwp(boolean z13) {
            this.f84805iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && this.f84805iobyxmoadg == ((wflxmlrfwp) obj).f84805iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f84805iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f84805iobyxmoadg;
        }

        public String toString() {
            return "OrderSendStatusChanged(isSend=" + this.f84805iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f84806iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f84806iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f84806iobyxmoadg == ((wkgbmnqykc) obj).f84806iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f84806iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f84806iobyxmoadg;
        }

        public String toString() {
            return "ChangeBonusesEditorEnabled(value=" + this.f84806iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LoadInfo f84807iobyxmoadg;

        public zoijcleaow(LoadInfo loadInfo) {
            this.f84807iobyxmoadg = loadInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f84807iobyxmoadg, ((zoijcleaow) obj).f84807iobyxmoadg);
        }

        public int hashCode() {
            LoadInfo loadInfo = this.f84807iobyxmoadg;
            if (loadInfo == null) {
                return 0;
            }
            return loadInfo.hashCode();
        }

        public final LoadInfo iobyxmoadg() {
            return this.f84807iobyxmoadg;
        }

        public String toString() {
            return "CartRemoteInfoChanged(loadInfo=" + this.f84807iobyxmoadg + ")";
        }
    }
}
