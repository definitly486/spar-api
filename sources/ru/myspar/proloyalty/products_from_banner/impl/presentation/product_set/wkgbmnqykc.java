package ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.products_from_banner.impl.domain.product_set_counter.args.ProductSetCounterArgs;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f99355iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 537028890;
        }

        public String toString() {
            return "ShowMessageProductNotAvailable";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f99356iobyxmoadg;

        public gxszxtbevo(int i13) {
            this.f99356iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && this.f99356iobyxmoadg == ((gxszxtbevo) obj).f99356iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f99356iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f99356iobyxmoadg;
        }

        public String toString() {
            return "ShowSnackbarMessage(res=" + this.f99356iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f99357iobyxmoadg;

        public iobyxmoadg(PurchaseListAddProductDialogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f99357iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99357iobyxmoadg, ((iobyxmoadg) obj).f99357iobyxmoadg);
        }

        public int hashCode() {
            return this.f99357iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f99357iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogAddProductToPurchaseList(args=" + this.f99357iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f99358iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Integer f99359zoijcleaow;

        public lqeggnwhkg(int i13, Integer num) {
            this.f99358iobyxmoadg = i13;
            this.f99359zoijcleaow = num;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return this.f99358iobyxmoadg == lqeggnwhkgVar.f99358iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f99359zoijcleaow, lqeggnwhkgVar.f99359zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f99358iobyxmoadg) * 31;
            Integer num = this.f99359zoijcleaow;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final Integer iobyxmoadg() {
            return this.f99359zoijcleaow;
        }

        public String toString() {
            return "ShowStatusAddedToBasketDialog(titleRes=" + this.f99358iobyxmoadg + ", messageRes=" + this.f99359zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f99358iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f99360iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f99360iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f99360iobyxmoadg, ((ppxfxbqfkf) obj).f99360iobyxmoadg);
        }

        public int hashCode() {
            return this.f99360iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f99360iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f99360iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2375wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f99361ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f99362iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f99363zoijcleaow;

        public C2375wkgbmnqykc(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f99362iobyxmoadg = hint;
            this.f99363zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2375wkgbmnqykc)) {
                return false;
            }
            C2375wkgbmnqykc c2375wkgbmnqykc = (C2375wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f99362iobyxmoadg, c2375wkgbmnqykc.f99362iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99363zoijcleaow, c2375wkgbmnqykc.f99363zoijcleaow);
        }

        public int hashCode() {
            return (this.f99362iobyxmoadg.hashCode() * 31) + this.f99363zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f99363zoijcleaow;
        }

        public String toString() {
            return "ShowHintDialog(hint=" + this.f99362iobyxmoadg + ", analyticsInfo=" + this.f99363zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f99362iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ProductSetCounterArgs f99364iobyxmoadg;

        public zoijcleaow(ProductSetCounterArgs dialogArgs) {
            zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f99364iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99364iobyxmoadg, ((zoijcleaow) obj).f99364iobyxmoadg);
        }

        public int hashCode() {
            return this.f99364iobyxmoadg.hashCode();
        }

        public final ProductSetCounterArgs iobyxmoadg() {
            return this.f99364iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogChangeProductSetCount(dialogArgs=" + this.f99364iobyxmoadg + ")";
        }
    }
}
