package ru.myspar.purchases.impl.list_details.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.legacy.presentation.model.AddProductParams;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f102443iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f102443iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f102443iobyxmoadg, ((eablkybsjg) obj).f102443iobyxmoadg);
        }

        public int hashCode() {
            return this.f102443iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f102443iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f102443iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102444iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f102444iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f102444iobyxmoadg, ((gxszxtbevo) obj).f102444iobyxmoadg);
        }

        public int hashCode() {
            return this.f102444iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102444iobyxmoadg;
        }

        public String toString() {
            return "ShowMessageLimitAddedProduct(message=" + this.f102444iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f102445ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f102446iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f102447zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f102446iobyxmoadg = hint;
            this.f102447zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f102446iobyxmoadg, iobyxmoadgVar.f102446iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102447zoijcleaow, iobyxmoadgVar.f102447zoijcleaow);
        }

        public int hashCode() {
            return (this.f102446iobyxmoadg.hashCode() * 31) + this.f102447zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f102447zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f102446iobyxmoadg + ", analyticsInfo=" + this.f102447zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f102446iobyxmoadg;
        }
    }

    public static final class lqeggnwhkg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f102448iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -917727216;
        }

        public String toString() {
            return "ShowMessageProductNotAvailable";
        }
    }

    public static final class nufgyqmvbu extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f102449iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 1907618749;
        }

        public String toString() {
            return "ShowMessageSuccessAddedProduct";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2474ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final az1.iobyxmoadg f102450iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2474ppxfxbqfkf(az1.iobyxmoadg section) {
            super(null);
            zdlpuopuiu.btonecajqb(section, "section");
            this.f102450iobyxmoadg = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2474ppxfxbqfkf) && this.f102450iobyxmoadg == ((C2474ppxfxbqfkf) obj).f102450iobyxmoadg;
        }

        public int hashCode() {
            return this.f102450iobyxmoadg.hashCode();
        }

        public final az1.iobyxmoadg iobyxmoadg() {
            return this.f102450iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogActionsWithAllProducts(section=" + this.f102450iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102451iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final az1.iobyxmoadg f102452zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String productId, az1.iobyxmoadg section) {
            super(null);
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(section, "section");
            this.f102451iobyxmoadg = productId;
            this.f102452zoijcleaow = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f102451iobyxmoadg, wkgbmnqykcVar.f102451iobyxmoadg) && this.f102452zoijcleaow == wkgbmnqykcVar.f102452zoijcleaow;
        }

        public int hashCode() {
            return (this.f102451iobyxmoadg.hashCode() * 31) + this.f102452zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102451iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogConfirmDeleteProductFromList(productId=" + this.f102451iobyxmoadg + ", section=" + this.f102452zoijcleaow + ")";
        }

        public final az1.iobyxmoadg zoijcleaow() {
            return this.f102452zoijcleaow;
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f102453ppxfxbqfkf = AddProductParams.f88839lereixgezr;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AddProductParams f102454iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f102455zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(AddProductParams params, String message) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            zdlpuopuiu.btonecajqb(message, "message");
            this.f102454iobyxmoadg = params;
            this.f102455zoijcleaow = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f102454iobyxmoadg, zoijcleaowVar.f102454iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102455zoijcleaow, zoijcleaowVar.f102455zoijcleaow);
        }

        public int hashCode() {
            return (this.f102454iobyxmoadg.hashCode() * 31) + this.f102455zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102455zoijcleaow;
        }

        public String toString() {
            return "ShowAvailableOnlyForPickupDialog(params=" + this.f102454iobyxmoadg + ", message=" + this.f102455zoijcleaow + ")";
        }

        public final AddProductParams zoijcleaow() {
            return this.f102454iobyxmoadg;
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
