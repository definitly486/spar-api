package ru.myspar.catalog.impl.search;

import java.util.List;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.product.ProductListData;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vdvldrhtss {

    public static final class dxjokdxxww extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85463iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(String message) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f85463iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85463iobyxmoadg, ((dxjokdxxww) obj).f85463iobyxmoadg);
        }

        public int hashCode() {
            return this.f85463iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85463iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningMessage(message=" + this.f85463iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends vdvldrhtss {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f85464ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f85465iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f85466zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f85465iobyxmoadg = hint;
            this.f85466zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85465iobyxmoadg, eablkybsjgVar.f85465iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85466zoijcleaow, eablkybsjgVar.f85466zoijcleaow);
        }

        public int hashCode() {
            return (this.f85465iobyxmoadg.hashCode() * 31) + this.f85466zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f85466zoijcleaow;
        }

        public String toString() {
            return "ShowProductHint(hint=" + this.f85465iobyxmoadg + ", analyticsInfo=" + this.f85466zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f85465iobyxmoadg;
        }
    }

    public static final class gxszxtbevo extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f85467iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 1678176536;
        }

        public String toString() {
            return "ShowProductNotAvailableMessage";
        }
    }

    public static final class iobyxmoadg extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductListData f85468iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final zdlpuopuiu.zoijcleaow f85469zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ProductListData products, zdlpuopuiu.zoijcleaow cachedParams) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(products, "products");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cachedParams, "cachedParams");
            this.f85468iobyxmoadg = products;
            this.f85469zoijcleaow = cachedParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85468iobyxmoadg, iobyxmoadgVar.f85468iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85469zoijcleaow, iobyxmoadgVar.f85469zoijcleaow);
        }

        public int hashCode() {
            return (this.f85468iobyxmoadg.hashCode() * 31) + this.f85469zoijcleaow.hashCode();
        }

        public final zdlpuopuiu.zoijcleaow iobyxmoadg() {
            return this.f85469zoijcleaow;
        }

        public String toString() {
            return "ShowAgeCheckedDialog(products=" + this.f85468iobyxmoadg + ", cachedParams=" + this.f85469zoijcleaow + ")";
        }

        public final ProductListData zoijcleaow() {
            return this.f85468iobyxmoadg;
        }
    }

    public static final class lqeggnwhkg extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f85470iobyxmoadg;

        public lqeggnwhkg(int i13) {
            super(null);
            this.f85470iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f85470iobyxmoadg == ((lqeggnwhkg) obj).f85470iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f85470iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f85470iobyxmoadg;
        }

        public String toString() {
            return "ShowSnackbarMessage(res=" + this.f85470iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final v00.ppxfxbqfkf f85471iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f85472zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(v00.ppxfxbqfkf type, List supportedTypes) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(supportedTypes, "supportedTypes");
            this.f85471iobyxmoadg = type;
            this.f85472zoijcleaow = supportedTypes;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return this.f85471iobyxmoadg == nufgyqmvbuVar.f85471iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85472zoijcleaow, nufgyqmvbuVar.f85472zoijcleaow);
        }

        public int hashCode() {
            return (this.f85471iobyxmoadg.hashCode() * 31) + this.f85472zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f85472zoijcleaow;
        }

        public String toString() {
            return "ShowSortDialog(type=" + this.f85471iobyxmoadg + ", supportedTypes=" + this.f85472zoijcleaow + ")";
        }

        public final v00.ppxfxbqfkf zoijcleaow() {
            return this.f85471iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f85473iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(PurchaseListAddProductDialogArgs dialogArgs) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f85473iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85473iobyxmoadg, ((ppxfxbqfkf) obj).f85473iobyxmoadg);
        }

        public int hashCode() {
            return this.f85473iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f85473iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogSelectPurchaseList(dialogArgs=" + this.f85473iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f85474iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 460656676;
        }

        public String toString() {
            return "ShowOrderDeliveryPrimeChangeMessage";
        }
    }

    public static final class zoijcleaow extends vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f85475iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f85476zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(ChangeProductParams params, String message) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f85475iobyxmoadg = params;
            this.f85476zoijcleaow = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85475iobyxmoadg, zoijcleaowVar.f85475iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85476zoijcleaow, zoijcleaowVar.f85476zoijcleaow);
        }

        public int hashCode() {
            return (this.f85475iobyxmoadg.hashCode() * 31) + this.f85476zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85476zoijcleaow;
        }

        public String toString() {
            return "ShowAvailableOnlyForPickupDialog(params=" + this.f85475iobyxmoadg + ", message=" + this.f85476zoijcleaow + ")";
        }

        public final ChangeProductParams zoijcleaow() {
            return this.f85475iobyxmoadg;
        }
    }

    public /* synthetic */ vdvldrhtss(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private vdvldrhtss() {
    }
}
