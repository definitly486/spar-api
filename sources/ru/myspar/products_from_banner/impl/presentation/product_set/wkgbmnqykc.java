package ru.myspar.products_from_banner.impl.presentation.product_set;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.products_from_banner.impl.domain.product_set_counter.args.ProductSetCounterArgs;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes3.dex */
public interface wkgbmnqykc {

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f91658ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f91659iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f91660zoijcleaow;

        public eablkybsjg(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f91659iobyxmoadg = hint;
            this.f91660zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f91659iobyxmoadg, eablkybsjgVar.f91659iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f91660zoijcleaow, eablkybsjgVar.f91660zoijcleaow);
        }

        public int hashCode() {
            return (this.f91659iobyxmoadg.hashCode() * 31) + this.f91660zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f91660zoijcleaow;
        }

        public String toString() {
            return "ShowHintDialog(hint=" + this.f91659iobyxmoadg + ", analyticsInfo=" + this.f91660zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f91659iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f91661iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -635897865;
        }

        public String toString() {
            return "ShowMessageProductNotAvailable";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f91662iobyxmoadg;

        public iobyxmoadg(PurchaseListAddProductDialogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f91662iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f91662iobyxmoadg, ((iobyxmoadg) obj).f91662iobyxmoadg);
        }

        public int hashCode() {
            return this.f91662iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f91662iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogAddProductToPurchaseList(args=" + this.f91662iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f91663iobyxmoadg;

        public lqeggnwhkg(int i13) {
            this.f91663iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f91663iobyxmoadg == ((lqeggnwhkg) obj).f91663iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f91663iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f91663iobyxmoadg;
        }

        public String toString() {
            return "ShowSnackbarMessage(res=" + this.f91663iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f91664iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Integer f91665zoijcleaow;

        public nufgyqmvbu(int i13, Integer num) {
            this.f91664iobyxmoadg = i13;
            this.f91665zoijcleaow = num;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return this.f91664iobyxmoadg == nufgyqmvbuVar.f91664iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f91665zoijcleaow, nufgyqmvbuVar.f91665zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f91664iobyxmoadg) * 31;
            Integer num = this.f91665zoijcleaow;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final Integer iobyxmoadg() {
            return this.f91665zoijcleaow;
        }

        public String toString() {
            return "ShowStatusAddedToBasketDialog(titleRes=" + this.f91664iobyxmoadg + ", messageRes=" + this.f91665zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f91664iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductSetCounterArgs f91666iobyxmoadg;

        public ppxfxbqfkf(ProductSetCounterArgs dialogArgs) {
            zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f91666iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f91666iobyxmoadg, ((ppxfxbqfkf) obj).f91666iobyxmoadg);
        }

        public int hashCode() {
            return this.f91666iobyxmoadg.hashCode();
        }

        public final ProductSetCounterArgs iobyxmoadg() {
            return this.f91666iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogChangeProductSetCount(dialogArgs=" + this.f91666iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2128wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f91667iobyxmoadg;

        public C2128wkgbmnqykc(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f91667iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2128wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f91667iobyxmoadg, ((C2128wkgbmnqykc) obj).f91667iobyxmoadg);
        }

        public int hashCode() {
            return this.f91667iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f91667iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f91667iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f91668iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 782285553;
        }

        public String toString() {
            return "ShowDialogAvailableOnlyForPickup";
        }
    }
}
