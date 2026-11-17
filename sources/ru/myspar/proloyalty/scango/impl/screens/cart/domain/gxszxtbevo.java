package ru.myspar.proloyalty.scango.impl.screens.cart.domain;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.screens.cart.domain.model.ScanGoCartDeletedProduct;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class dxjokdxxww extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f100615iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
            super(null);
        }
    }

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f100616iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(List content) {
            super(null);
            zdlpuopuiu.btonecajqb(content, "content");
            this.f100616iobyxmoadg = content;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f100616iobyxmoadg, ((eablkybsjg) obj).f100616iobyxmoadg);
        }

        public int hashCode() {
            return this.f100616iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f100616iobyxmoadg;
        }

        public String toString() {
            return "ChangedProductsInState(content=" + this.f100616iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scango.impl.screens.cart.domain.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2421gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f100617iobyxmoadg;

        public C2421gxszxtbevo(boolean z13) {
            super(null);
            this.f100617iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2421gxszxtbevo) && this.f100617iobyxmoadg == ((C2421gxszxtbevo) obj).f100617iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f100617iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f100617iobyxmoadg;
        }

        public String toString() {
            return "ShowLoading(isVisible=" + this.f100617iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final State.iobyxmoadg f100618eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final boolean f100619gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f100620iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f100621ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final List f100622wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f100623zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String totalPriceInt, String totalPriceFractional, boolean z13, List content, State.iobyxmoadg cartState, boolean z14) {
            super(null);
            zdlpuopuiu.btonecajqb(totalPriceInt, "totalPriceInt");
            zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
            zdlpuopuiu.btonecajqb(content, "content");
            zdlpuopuiu.btonecajqb(cartState, "cartState");
            this.f100620iobyxmoadg = totalPriceInt;
            this.f100623zoijcleaow = totalPriceFractional;
            this.f100621ppxfxbqfkf = z13;
            this.f100622wkgbmnqykc = content;
            this.f100618eablkybsjg = cartState;
            this.f100619gxszxtbevo = z14;
        }

        public final boolean eablkybsjg() {
            return this.f100621ppxfxbqfkf;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f100620iobyxmoadg, iobyxmoadgVar.f100620iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f100623zoijcleaow, iobyxmoadgVar.f100623zoijcleaow) && this.f100621ppxfxbqfkf == iobyxmoadgVar.f100621ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f100622wkgbmnqykc, iobyxmoadgVar.f100622wkgbmnqykc) && this.f100618eablkybsjg == iobyxmoadgVar.f100618eablkybsjg && this.f100619gxszxtbevo == iobyxmoadgVar.f100619gxszxtbevo;
        }

        public final boolean gxszxtbevo() {
            return this.f100619gxszxtbevo;
        }

        public int hashCode() {
            return (((((((((this.f100620iobyxmoadg.hashCode() * 31) + this.f100623zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f100621ppxfxbqfkf)) * 31) + this.f100622wkgbmnqykc.hashCode()) * 31) + this.f100618eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f100619gxszxtbevo);
        }

        public final State.iobyxmoadg iobyxmoadg() {
            return this.f100618eablkybsjg;
        }

        public final String ppxfxbqfkf() {
            return this.f100623zoijcleaow;
        }

        public String toString() {
            return "CartUpdated(totalPriceInt=" + this.f100620iobyxmoadg + ", totalPriceFractional=" + this.f100623zoijcleaow + ", isCheckoutBtnEnabled=" + this.f100621ppxfxbqfkf + ", content=" + this.f100622wkgbmnqykc + ", cartState=" + this.f100618eablkybsjg + ", isTutorialCart=" + this.f100619gxszxtbevo + ")";
        }

        public final String wkgbmnqykc() {
            return this.f100620iobyxmoadg;
        }

        public final List zoijcleaow() {
            return this.f100622wkgbmnqykc;
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f100624iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(String startText) {
            super(null);
            zdlpuopuiu.btonecajqb(startText, "startText");
            this.f100624iobyxmoadg = startText;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f100624iobyxmoadg, ((lqeggnwhkg) obj).f100624iobyxmoadg);
        }

        public int hashCode() {
            return this.f100624iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f100624iobyxmoadg;
        }

        public String toString() {
            return "ShowStartMessage(startText=" + this.f100624iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ko1.iobyxmoadg f100625iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(ko1.iobyxmoadg option) {
            super(null);
            zdlpuopuiu.btonecajqb(option, "option");
            this.f100625iobyxmoadg = option;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f100625iobyxmoadg == ((nufgyqmvbu) obj).f100625iobyxmoadg;
        }

        public int hashCode() {
            return this.f100625iobyxmoadg.hashCode();
        }

        public final ko1.iobyxmoadg iobyxmoadg() {
            return this.f100625iobyxmoadg;
        }

        public String toString() {
            return "SubmitTutorialCart(option=" + this.f100625iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ScanGoCartDeletedProduct f100626iobyxmoadg;

        public ppxfxbqfkf(ScanGoCartDeletedProduct scanGoCartDeletedProduct) {
            super(null);
            this.f100626iobyxmoadg = scanGoCartDeletedProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f100626iobyxmoadg, ((ppxfxbqfkf) obj).f100626iobyxmoadg);
        }

        public int hashCode() {
            ScanGoCartDeletedProduct scanGoCartDeletedProduct = this.f100626iobyxmoadg;
            if (scanGoCartDeletedProduct == null) {
                return 0;
            }
            return scanGoCartDeletedProduct.hashCode();
        }

        public final ScanGoCartDeletedProduct iobyxmoadg() {
            return this.f100626iobyxmoadg;
        }

        public String toString() {
            return "ChangedDeletedProduct(deletedProduct=" + this.f100626iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Boolean f100627iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Long f100628zoijcleaow;

        public wkgbmnqykc(Boolean bool, Long l13) {
            super(null);
            this.f100627iobyxmoadg = bool;
            this.f100628zoijcleaow = l13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f100627iobyxmoadg, wkgbmnqykcVar.f100627iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f100628zoijcleaow, wkgbmnqykcVar.f100628zoijcleaow);
        }

        public int hashCode() {
            Boolean bool = this.f100627iobyxmoadg;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l13 = this.f100628zoijcleaow;
            return iHashCode + (l13 != null ? l13.hashCode() : 0);
        }

        public final Long iobyxmoadg() {
            return this.f100628zoijcleaow;
        }

        public String toString() {
            return "ChangedLastDeletedProductTimer(isReturnProductFlatEnabled=" + this.f100627iobyxmoadg + ", timerValue=" + this.f100628zoijcleaow + ")";
        }

        public final Boolean zoijcleaow() {
            return this.f100627iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ko1.iobyxmoadg f100629iobyxmoadg;

        public zoijcleaow(ko1.iobyxmoadg iobyxmoadgVar) {
            super(null);
            this.f100629iobyxmoadg = iobyxmoadgVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f100629iobyxmoadg == ((zoijcleaow) obj).f100629iobyxmoadg;
        }

        public int hashCode() {
            ko1.iobyxmoadg iobyxmoadgVar = this.f100629iobyxmoadg;
            if (iobyxmoadgVar == null) {
                return 0;
            }
            return iobyxmoadgVar.hashCode();
        }

        public final ko1.iobyxmoadg iobyxmoadg() {
            return this.f100629iobyxmoadg;
        }

        public String toString() {
            return "ChangedCurrentTutorialOption(currentTutorialOption=" + this.f100629iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
