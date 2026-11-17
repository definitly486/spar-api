package ru.myspar.scango.impl.screens.cart.domain;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.screens.cart.domain.model.ScanGoCartDeletedProduct;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class dxjokdxxww extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f103271iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
            super(null);
        }
    }

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f103272iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(List content) {
            super(null);
            zdlpuopuiu.btonecajqb(content, "content");
            this.f103272iobyxmoadg = content;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f103272iobyxmoadg, ((eablkybsjg) obj).f103272iobyxmoadg);
        }

        public int hashCode() {
            return this.f103272iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f103272iobyxmoadg;
        }

        public String toString() {
            return "ChangedProductsInState(content=" + this.f103272iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.cart.domain.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2500gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f103273iobyxmoadg;

        public C2500gxszxtbevo(boolean z13) {
            super(null);
            this.f103273iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2500gxszxtbevo) && this.f103273iobyxmoadg == ((C2500gxszxtbevo) obj).f103273iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f103273iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f103273iobyxmoadg;
        }

        public String toString() {
            return "ShowLoading(isVisible=" + this.f103273iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final State.iobyxmoadg f103274eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final boolean f103275gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f103276iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f103277ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final List f103278wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f103279zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String totalPriceInt, String totalPriceFractional, boolean z13, List content, State.iobyxmoadg cartState, boolean z14) {
            super(null);
            zdlpuopuiu.btonecajqb(totalPriceInt, "totalPriceInt");
            zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
            zdlpuopuiu.btonecajqb(content, "content");
            zdlpuopuiu.btonecajqb(cartState, "cartState");
            this.f103276iobyxmoadg = totalPriceInt;
            this.f103279zoijcleaow = totalPriceFractional;
            this.f103277ppxfxbqfkf = z13;
            this.f103278wkgbmnqykc = content;
            this.f103274eablkybsjg = cartState;
            this.f103275gxszxtbevo = z14;
        }

        public final boolean eablkybsjg() {
            return this.f103277ppxfxbqfkf;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f103276iobyxmoadg, iobyxmoadgVar.f103276iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f103279zoijcleaow, iobyxmoadgVar.f103279zoijcleaow) && this.f103277ppxfxbqfkf == iobyxmoadgVar.f103277ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f103278wkgbmnqykc, iobyxmoadgVar.f103278wkgbmnqykc) && this.f103274eablkybsjg == iobyxmoadgVar.f103274eablkybsjg && this.f103275gxszxtbevo == iobyxmoadgVar.f103275gxszxtbevo;
        }

        public final boolean gxszxtbevo() {
            return this.f103275gxszxtbevo;
        }

        public int hashCode() {
            return (((((((((this.f103276iobyxmoadg.hashCode() * 31) + this.f103279zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f103277ppxfxbqfkf)) * 31) + this.f103278wkgbmnqykc.hashCode()) * 31) + this.f103274eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f103275gxszxtbevo);
        }

        public final State.iobyxmoadg iobyxmoadg() {
            return this.f103274eablkybsjg;
        }

        public final String ppxfxbqfkf() {
            return this.f103279zoijcleaow;
        }

        public String toString() {
            return "CartUpdated(totalPriceInt=" + this.f103276iobyxmoadg + ", totalPriceFractional=" + this.f103279zoijcleaow + ", isCheckoutBtnEnabled=" + this.f103277ppxfxbqfkf + ", content=" + this.f103278wkgbmnqykc + ", cartState=" + this.f103274eablkybsjg + ", isTutorialCart=" + this.f103275gxszxtbevo + ")";
        }

        public final String wkgbmnqykc() {
            return this.f103276iobyxmoadg;
        }

        public final List zoijcleaow() {
            return this.f103278wkgbmnqykc;
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f103280iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(String startText) {
            super(null);
            zdlpuopuiu.btonecajqb(startText, "startText");
            this.f103280iobyxmoadg = startText;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f103280iobyxmoadg, ((lqeggnwhkg) obj).f103280iobyxmoadg);
        }

        public int hashCode() {
            return this.f103280iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f103280iobyxmoadg;
        }

        public String toString() {
            return "ShowStartMessage(startText=" + this.f103280iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final o22.iobyxmoadg f103281iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(o22.iobyxmoadg option) {
            super(null);
            zdlpuopuiu.btonecajqb(option, "option");
            this.f103281iobyxmoadg = option;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f103281iobyxmoadg == ((nufgyqmvbu) obj).f103281iobyxmoadg;
        }

        public int hashCode() {
            return this.f103281iobyxmoadg.hashCode();
        }

        public final o22.iobyxmoadg iobyxmoadg() {
            return this.f103281iobyxmoadg;
        }

        public String toString() {
            return "SubmitTutorialCart(option=" + this.f103281iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ScanGoCartDeletedProduct f103282iobyxmoadg;

        public ppxfxbqfkf(ScanGoCartDeletedProduct scanGoCartDeletedProduct) {
            super(null);
            this.f103282iobyxmoadg = scanGoCartDeletedProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f103282iobyxmoadg, ((ppxfxbqfkf) obj).f103282iobyxmoadg);
        }

        public int hashCode() {
            ScanGoCartDeletedProduct scanGoCartDeletedProduct = this.f103282iobyxmoadg;
            if (scanGoCartDeletedProduct == null) {
                return 0;
            }
            return scanGoCartDeletedProduct.hashCode();
        }

        public final ScanGoCartDeletedProduct iobyxmoadg() {
            return this.f103282iobyxmoadg;
        }

        public String toString() {
            return "ChangedDeletedProduct(deletedProduct=" + this.f103282iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Boolean f103283iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Long f103284zoijcleaow;

        public wkgbmnqykc(Boolean bool, Long l13) {
            super(null);
            this.f103283iobyxmoadg = bool;
            this.f103284zoijcleaow = l13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f103283iobyxmoadg, wkgbmnqykcVar.f103283iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f103284zoijcleaow, wkgbmnqykcVar.f103284zoijcleaow);
        }

        public int hashCode() {
            Boolean bool = this.f103283iobyxmoadg;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l13 = this.f103284zoijcleaow;
            return iHashCode + (l13 != null ? l13.hashCode() : 0);
        }

        public final Long iobyxmoadg() {
            return this.f103284zoijcleaow;
        }

        public String toString() {
            return "ChangedLastDeletedProductTimer(isReturnProductFlatEnabled=" + this.f103283iobyxmoadg + ", timerValue=" + this.f103284zoijcleaow + ")";
        }

        public final Boolean zoijcleaow() {
            return this.f103283iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final o22.iobyxmoadg f103285iobyxmoadg;

        public zoijcleaow(o22.iobyxmoadg iobyxmoadgVar) {
            super(null);
            this.f103285iobyxmoadg = iobyxmoadgVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f103285iobyxmoadg == ((zoijcleaow) obj).f103285iobyxmoadg;
        }

        public int hashCode() {
            o22.iobyxmoadg iobyxmoadgVar = this.f103285iobyxmoadg;
            if (iobyxmoadgVar == null) {
                return 0;
            }
            return iobyxmoadgVar.hashCode();
        }

        public final o22.iobyxmoadg iobyxmoadg() {
            return this.f103285iobyxmoadg;
        }

        public String toString() {
            return "ChangedCurrentTutorialOption(currentTutorialOption=" + this.f103285iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
