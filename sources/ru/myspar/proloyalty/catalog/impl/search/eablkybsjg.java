package ru.myspar.proloyalty.catalog.impl.search;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    public static final class dxjokdxxww extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93334iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f93334iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f93334iobyxmoadg, ((dxjokdxxww) obj).f93334iobyxmoadg);
        }

        public int hashCode() {
            return this.f93334iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93334iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningMessage(message=" + this.f93334iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.search.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2188eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2188eablkybsjg f93335iobyxmoadg = new C2188eablkybsjg();

        private C2188eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2188eablkybsjg);
        }

        public int hashCode() {
            return 1289423829;
        }

        public String toString() {
            return "ShowProductNotAvailableMessage";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f93336iobyxmoadg;

        public gxszxtbevo(int i13) {
            super(null);
            this.f93336iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && this.f93336iobyxmoadg == ((gxszxtbevo) obj).f93336iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f93336iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f93336iobyxmoadg;
        }

        public String toString() {
            return "ShowSnackbarMessage(res=" + this.f93336iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final bq0.iobyxmoadg f93337iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(bq0.iobyxmoadg cachedParams) {
            super(null);
            zdlpuopuiu.btonecajqb(cachedParams, "cachedParams");
            this.f93337iobyxmoadg = cachedParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f93337iobyxmoadg, ((iobyxmoadg) obj).f93337iobyxmoadg);
        }

        public int hashCode() {
            return this.f93337iobyxmoadg.hashCode();
        }

        public final bq0.iobyxmoadg iobyxmoadg() {
            return this.f93337iobyxmoadg;
        }

        public String toString() {
            return "ShowAgeCheckedDialog(cachedParams=" + this.f93337iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mz0.ppxfxbqfkf f93338iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f93339zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(mz0.ppxfxbqfkf type, List supportedTypes) {
            super(null);
            zdlpuopuiu.btonecajqb(type, "type");
            zdlpuopuiu.btonecajqb(supportedTypes, "supportedTypes");
            this.f93338iobyxmoadg = type;
            this.f93339zoijcleaow = supportedTypes;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return this.f93338iobyxmoadg == lqeggnwhkgVar.f93338iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f93339zoijcleaow, lqeggnwhkgVar.f93339zoijcleaow);
        }

        public int hashCode() {
            return (this.f93338iobyxmoadg.hashCode() * 31) + this.f93339zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f93339zoijcleaow;
        }

        public String toString() {
            return "ShowSortDialog(type=" + this.f93338iobyxmoadg + ", supportedTypes=" + this.f93339zoijcleaow + ")";
        }

        public final mz0.ppxfxbqfkf zoijcleaow() {
            return this.f93338iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f93340iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -1090286953;
        }

        public String toString() {
            return "ShowSuccessAddedMessage";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f93341iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1257046787;
        }

        public String toString() {
            return "ShowOrderDeliveryPriceChangeMessage";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f93342ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f93343iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f93344zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f93343iobyxmoadg = hint;
            this.f93344zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f93343iobyxmoadg, wkgbmnqykcVar.f93343iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f93344zoijcleaow, wkgbmnqykcVar.f93344zoijcleaow);
        }

        public int hashCode() {
            return (this.f93343iobyxmoadg.hashCode() * 31) + this.f93344zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f93344zoijcleaow;
        }

        public String toString() {
            return "ShowProductHint(hint=" + this.f93343iobyxmoadg + ", analyticsInfo=" + this.f93344zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f93343iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f93345iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(PurchaseListAddProductDialogArgs dialogArgs) {
            super(null);
            zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f93345iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f93345iobyxmoadg, ((zoijcleaow) obj).f93345iobyxmoadg);
        }

        public int hashCode() {
            return this.f93345iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f93345iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogSelectPurchaseList(dialogArgs=" + this.f93345iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
