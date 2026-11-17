package ru.myspar.proloyalty.favorites.impl.domain.store;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.product.Products;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.paging.Paging;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f96202iobyxmoadg;

        public btonecajqb(List productDataList) {
            zdlpuopuiu.btonecajqb(productDataList, "productDataList");
            this.f96202iobyxmoadg = productDataList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f96202iobyxmoadg, ((btonecajqb) obj).f96202iobyxmoadg);
        }

        public int hashCode() {
            return this.f96202iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f96202iobyxmoadg;
        }

        public String toString() {
            return "UpdateProductDataList(productDataList=" + this.f96202iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final State.zoijcleaow f96203iobyxmoadg;

        public draadjrbmk(State.zoijcleaow warningState) {
            zdlpuopuiu.btonecajqb(warningState, "warningState");
            this.f96203iobyxmoadg = warningState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && this.f96203iobyxmoadg == ((draadjrbmk) obj).f96203iobyxmoadg;
        }

        public int hashCode() {
            return this.f96203iobyxmoadg.hashCode();
        }

        public final State.zoijcleaow iobyxmoadg() {
            return this.f96203iobyxmoadg;
        }

        public String toString() {
            return "WarningStateChanged(warningState=" + this.f96203iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f96204iobyxmoadg;

        public dxjokdxxww(List list) {
            this.f96204iobyxmoadg = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f96204iobyxmoadg, ((dxjokdxxww) obj).f96204iobyxmoadg);
        }

        public int hashCode() {
            List list = this.f96204iobyxmoadg;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f96204iobyxmoadg;
        }

        public String toString() {
            return "UpdatePageLoading(products=" + this.f96204iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96205iobyxmoadg;

        public eablkybsjg(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f96205iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f96205iobyxmoadg, ((eablkybsjg) obj).f96205iobyxmoadg);
        }

        public int hashCode() {
            return this.f96205iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96205iobyxmoadg;
        }

        public String toString() {
            return "StartWorkingWithFavoriteState(productId=" + this.f96205iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f96206iobyxmoadg;

        public gtknphoqwx(boolean z13) {
            this.f96206iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && this.f96206iobyxmoadg == ((gtknphoqwx) obj).f96206iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f96206iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f96206iobyxmoadg;
        }

        public String toString() {
            return "UpdateRefreshLayoutLoading(isLoading=" + this.f96206iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.favorites.impl.domain.store.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2272gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96207iobyxmoadg;

        public C2272gxszxtbevo(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f96207iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2272gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f96207iobyxmoadg, ((C2272gxszxtbevo) obj).f96207iobyxmoadg);
        }

        public int hashCode() {
            return this.f96207iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96207iobyxmoadg;
        }

        public String toString() {
            return "StopWorkingWithFavoriteState(productId=" + this.f96207iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final State.zoijcleaow f96208iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f96209zoijcleaow;

        public iobyxmoadg(State.zoijcleaow warningState, boolean z13) {
            zdlpuopuiu.btonecajqb(warningState, "warningState");
            this.f96208iobyxmoadg = warningState;
            this.f96209zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f96208iobyxmoadg == iobyxmoadgVar.f96208iobyxmoadg && this.f96209zoijcleaow == iobyxmoadgVar.f96209zoijcleaow;
        }

        public int hashCode() {
            return (this.f96208iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f96209zoijcleaow);
        }

        public final State.zoijcleaow iobyxmoadg() {
            return this.f96208iobyxmoadg;
        }

        public String toString() {
            return "EmptyStateChanged(warningState=" + this.f96208iobyxmoadg + ", isFiltersVisible=" + this.f96209zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f96209zoijcleaow;
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96210iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f96211ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f96212wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f96213zoijcleaow;

        public lqeggnwhkg(String productId, boolean z13, String str, boolean z14) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f96210iobyxmoadg = productId;
            this.f96213zoijcleaow = z13;
            this.f96211ppxfxbqfkf = str;
            this.f96212wkgbmnqykc = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return zdlpuopuiu.eablkybsjg(this.f96210iobyxmoadg, lqeggnwhkgVar.f96210iobyxmoadg) && this.f96213zoijcleaow == lqeggnwhkgVar.f96213zoijcleaow && zdlpuopuiu.eablkybsjg(this.f96211ppxfxbqfkf, lqeggnwhkgVar.f96211ppxfxbqfkf) && this.f96212wkgbmnqykc == lqeggnwhkgVar.f96212wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = ((this.f96210iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f96213zoijcleaow)) * 31;
            String str = this.f96211ppxfxbqfkf;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f96212wkgbmnqykc);
        }

        public final boolean iobyxmoadg() {
            return this.f96212wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f96211ppxfxbqfkf;
        }

        public String toString() {
            return "UpdateExpandedProducts(productId=" + this.f96210iobyxmoadg + ", expand=" + this.f96213zoijcleaow + ", message=" + this.f96211ppxfxbqfkf + ", autoHide=" + this.f96212wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f96210iobyxmoadg;
        }

        public final boolean zoijcleaow() {
            return this.f96213zoijcleaow;
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f96214iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            this.f96214iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f96214iobyxmoadg == ((nufgyqmvbu) obj).f96214iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f96214iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f96214iobyxmoadg;
        }

        public String toString() {
            return "UpdateFullScreenLoading(isLoading=" + this.f96214iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f96215eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Products f96216iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Paging f96217ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f96218wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f96219zoijcleaow;

        public ppxfxbqfkf(Products products, DeliveryCode deliveryCode, Paging paging, int i13, boolean z13) {
            zdlpuopuiu.btonecajqb(products, "products");
            this.f96216iobyxmoadg = products;
            this.f96219zoijcleaow = deliveryCode;
            this.f96217ppxfxbqfkf = paging;
            this.f96218wkgbmnqykc = i13;
            this.f96215eablkybsjg = z13;
        }

        public final boolean eablkybsjg() {
            return this.f96215eablkybsjg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f96216iobyxmoadg, ppxfxbqfkfVar.f96216iobyxmoadg) && this.f96219zoijcleaow == ppxfxbqfkfVar.f96219zoijcleaow && zdlpuopuiu.eablkybsjg(this.f96217ppxfxbqfkf, ppxfxbqfkfVar.f96217ppxfxbqfkf) && this.f96218wkgbmnqykc == ppxfxbqfkfVar.f96218wkgbmnqykc && this.f96215eablkybsjg == ppxfxbqfkfVar.f96215eablkybsjg;
        }

        public int hashCode() {
            int iHashCode = this.f96216iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f96219zoijcleaow;
            int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
            Paging paging = this.f96217ppxfxbqfkf;
            return ((((iHashCode2 + (paging != null ? paging.hashCode() : 0)) * 31) + Integer.hashCode(this.f96218wkgbmnqykc)) * 31) + Boolean.hashCode(this.f96215eablkybsjg);
        }

        public final int iobyxmoadg() {
            return this.f96218wkgbmnqykc;
        }

        public final Paging ppxfxbqfkf() {
            return this.f96217ppxfxbqfkf;
        }

        public String toString() {
            return "ProductsFetched(products=" + this.f96216iobyxmoadg + ", deliveryCode=" + this.f96219zoijcleaow + ", paging=" + this.f96217ppxfxbqfkf + ", currentPage=" + this.f96218wkgbmnqykc + ", refresh=" + this.f96215eablkybsjg + ")";
        }

        public final Products wkgbmnqykc() {
            return this.f96216iobyxmoadg;
        }

        public final DeliveryCode zoijcleaow() {
            return this.f96219zoijcleaow;
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f96220iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f96221zoijcleaow;

        public wkgbmnqykc(int i13, String selectedFilterId) {
            zdlpuopuiu.btonecajqb(selectedFilterId, "selectedFilterId");
            this.f96220iobyxmoadg = i13;
            this.f96221zoijcleaow = selectedFilterId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return this.f96220iobyxmoadg == wkgbmnqykcVar.f96220iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f96221zoijcleaow, wkgbmnqykcVar.f96221zoijcleaow);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f96220iobyxmoadg) * 31) + this.f96221zoijcleaow.hashCode();
        }

        public final int iobyxmoadg() {
            return this.f96220iobyxmoadg;
        }

        public String toString() {
            return "Reset(currentPage=" + this.f96220iobyxmoadg + ", selectedFilterId=" + this.f96221zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f96221zoijcleaow;
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96222iobyxmoadg;

        public zoijcleaow(String filterId) {
            zdlpuopuiu.btonecajqb(filterId, "filterId");
            this.f96222iobyxmoadg = filterId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f96222iobyxmoadg, ((zoijcleaow) obj).f96222iobyxmoadg);
        }

        public int hashCode() {
            return this.f96222iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f96222iobyxmoadg;
        }

        public String toString() {
            return "FilterIdChanged(filterId=" + this.f96222iobyxmoadg + ")";
        }
    }
}
