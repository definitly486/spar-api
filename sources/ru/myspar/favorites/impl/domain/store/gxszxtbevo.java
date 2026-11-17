package ru.myspar.favorites.impl.domain.store;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.product.Products;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.paging.Paging;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f88388iobyxmoadg;

        public btonecajqb(List productDataList) {
            zdlpuopuiu.btonecajqb(productDataList, "productDataList");
            this.f88388iobyxmoadg = productDataList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f88388iobyxmoadg, ((btonecajqb) obj).f88388iobyxmoadg);
        }

        public int hashCode() {
            return this.f88388iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f88388iobyxmoadg;
        }

        public String toString() {
            return "UpdateProductDataList(productDataList=" + this.f88388iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final State.zoijcleaow f88389iobyxmoadg;

        public draadjrbmk(State.zoijcleaow warningState) {
            zdlpuopuiu.btonecajqb(warningState, "warningState");
            this.f88389iobyxmoadg = warningState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && this.f88389iobyxmoadg == ((draadjrbmk) obj).f88389iobyxmoadg;
        }

        public int hashCode() {
            return this.f88389iobyxmoadg.hashCode();
        }

        public final State.zoijcleaow iobyxmoadg() {
            return this.f88389iobyxmoadg;
        }

        public String toString() {
            return "WarningStateChanged(warningState=" + this.f88389iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f88390iobyxmoadg;

        public dxjokdxxww(List list) {
            this.f88390iobyxmoadg = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f88390iobyxmoadg, ((dxjokdxxww) obj).f88390iobyxmoadg);
        }

        public int hashCode() {
            List list = this.f88390iobyxmoadg;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f88390iobyxmoadg;
        }

        public String toString() {
            return "UpdatePageLoading(products=" + this.f88390iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88391iobyxmoadg;

        public eablkybsjg(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f88391iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f88391iobyxmoadg, ((eablkybsjg) obj).f88391iobyxmoadg);
        }

        public int hashCode() {
            return this.f88391iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88391iobyxmoadg;
        }

        public String toString() {
            return "StartWorkingWithFavoriteState(productId=" + this.f88391iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f88392iobyxmoadg;

        public gtknphoqwx(boolean z13) {
            this.f88392iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && this.f88392iobyxmoadg == ((gtknphoqwx) obj).f88392iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f88392iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f88392iobyxmoadg;
        }

        public String toString() {
            return "UpdateRefreshLayoutLoading(isLoading=" + this.f88392iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.favorites.impl.domain.store.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2028gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88393iobyxmoadg;

        public C2028gxszxtbevo(String productId) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f88393iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2028gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f88393iobyxmoadg, ((C2028gxszxtbevo) obj).f88393iobyxmoadg);
        }

        public int hashCode() {
            return this.f88393iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88393iobyxmoadg;
        }

        public String toString() {
            return "StopWorkingWithFavoriteState(productId=" + this.f88393iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final State.zoijcleaow f88394iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f88395zoijcleaow;

        public iobyxmoadg(State.zoijcleaow warningState, boolean z13) {
            zdlpuopuiu.btonecajqb(warningState, "warningState");
            this.f88394iobyxmoadg = warningState;
            this.f88395zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f88394iobyxmoadg == iobyxmoadgVar.f88394iobyxmoadg && this.f88395zoijcleaow == iobyxmoadgVar.f88395zoijcleaow;
        }

        public int hashCode() {
            return (this.f88394iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f88395zoijcleaow);
        }

        public final State.zoijcleaow iobyxmoadg() {
            return this.f88394iobyxmoadg;
        }

        public String toString() {
            return "EmptyStateChanged(warningState=" + this.f88394iobyxmoadg + ", isFiltersVisible=" + this.f88395zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f88395zoijcleaow;
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88396iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f88397ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f88398wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f88399zoijcleaow;

        public lqeggnwhkg(String productId, boolean z13, String str, boolean z14) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f88396iobyxmoadg = productId;
            this.f88399zoijcleaow = z13;
            this.f88397ppxfxbqfkf = str;
            this.f88398wkgbmnqykc = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return zdlpuopuiu.eablkybsjg(this.f88396iobyxmoadg, lqeggnwhkgVar.f88396iobyxmoadg) && this.f88399zoijcleaow == lqeggnwhkgVar.f88399zoijcleaow && zdlpuopuiu.eablkybsjg(this.f88397ppxfxbqfkf, lqeggnwhkgVar.f88397ppxfxbqfkf) && this.f88398wkgbmnqykc == lqeggnwhkgVar.f88398wkgbmnqykc;
        }

        public int hashCode() {
            int iHashCode = ((this.f88396iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f88399zoijcleaow)) * 31;
            String str = this.f88397ppxfxbqfkf;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f88398wkgbmnqykc);
        }

        public final boolean iobyxmoadg() {
            return this.f88398wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f88397ppxfxbqfkf;
        }

        public String toString() {
            return "UpdateExpandedProducts(productId=" + this.f88396iobyxmoadg + ", expand=" + this.f88399zoijcleaow + ", message=" + this.f88397ppxfxbqfkf + ", autoHide=" + this.f88398wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f88396iobyxmoadg;
        }

        public final boolean zoijcleaow() {
            return this.f88399zoijcleaow;
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f88400iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            this.f88400iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f88400iobyxmoadg == ((nufgyqmvbu) obj).f88400iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f88400iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f88400iobyxmoadg;
        }

        public String toString() {
            return "UpdateFullScreenLoading(isLoading=" + this.f88400iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f88401eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Products f88402iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Paging f88403ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f88404wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f88405zoijcleaow;

        public ppxfxbqfkf(Products products, DeliveryCode deliveryCode, Paging paging, int i13, boolean z13) {
            zdlpuopuiu.btonecajqb(products, "products");
            this.f88402iobyxmoadg = products;
            this.f88405zoijcleaow = deliveryCode;
            this.f88403ppxfxbqfkf = paging;
            this.f88404wkgbmnqykc = i13;
            this.f88401eablkybsjg = z13;
        }

        public final boolean eablkybsjg() {
            return this.f88401eablkybsjg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f88402iobyxmoadg, ppxfxbqfkfVar.f88402iobyxmoadg) && this.f88405zoijcleaow == ppxfxbqfkfVar.f88405zoijcleaow && zdlpuopuiu.eablkybsjg(this.f88403ppxfxbqfkf, ppxfxbqfkfVar.f88403ppxfxbqfkf) && this.f88404wkgbmnqykc == ppxfxbqfkfVar.f88404wkgbmnqykc && this.f88401eablkybsjg == ppxfxbqfkfVar.f88401eablkybsjg;
        }

        public int hashCode() {
            int iHashCode = this.f88402iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f88405zoijcleaow;
            int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
            Paging paging = this.f88403ppxfxbqfkf;
            return ((((iHashCode2 + (paging != null ? paging.hashCode() : 0)) * 31) + Integer.hashCode(this.f88404wkgbmnqykc)) * 31) + Boolean.hashCode(this.f88401eablkybsjg);
        }

        public final int iobyxmoadg() {
            return this.f88404wkgbmnqykc;
        }

        public final Paging ppxfxbqfkf() {
            return this.f88403ppxfxbqfkf;
        }

        public String toString() {
            return "ProductsFetched(products=" + this.f88402iobyxmoadg + ", deliveryCode=" + this.f88405zoijcleaow + ", paging=" + this.f88403ppxfxbqfkf + ", currentPage=" + this.f88404wkgbmnqykc + ", refresh=" + this.f88401eablkybsjg + ")";
        }

        public final Products wkgbmnqykc() {
            return this.f88402iobyxmoadg;
        }

        public final DeliveryCode zoijcleaow() {
            return this.f88405zoijcleaow;
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f88406iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f88407zoijcleaow;

        public wkgbmnqykc(int i13, String selectedFilterId) {
            zdlpuopuiu.btonecajqb(selectedFilterId, "selectedFilterId");
            this.f88406iobyxmoadg = i13;
            this.f88407zoijcleaow = selectedFilterId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return this.f88406iobyxmoadg == wkgbmnqykcVar.f88406iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f88407zoijcleaow, wkgbmnqykcVar.f88407zoijcleaow);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f88406iobyxmoadg) * 31) + this.f88407zoijcleaow.hashCode();
        }

        public final int iobyxmoadg() {
            return this.f88406iobyxmoadg;
        }

        public String toString() {
            return "Reset(currentPage=" + this.f88406iobyxmoadg + ", selectedFilterId=" + this.f88407zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f88407zoijcleaow;
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88408iobyxmoadg;

        public zoijcleaow(String filterId) {
            zdlpuopuiu.btonecajqb(filterId, "filterId");
            this.f88408iobyxmoadg = filterId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f88408iobyxmoadg, ((zoijcleaow) obj).f88408iobyxmoadg);
        }

        public int hashCode() {
            return this.f88408iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f88408iobyxmoadg;
        }

        public String toString() {
            return "FilterIdChanged(filterId=" + this.f88408iobyxmoadg + ")";
        }
    }
}
