package ru.myspar.proloyalty.catalog.impl.specific_product.presentation;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.models.product.VivinoRating;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93652iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f93653zoijcleaow;

        public btonecajqb(String productArticle, String productName) {
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f93652iobyxmoadg = productArticle;
            this.f93653zoijcleaow = productName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f93652iobyxmoadg, btonecajqbVar.f93652iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f93653zoijcleaow, btonecajqbVar.f93653zoijcleaow);
        }

        public int hashCode() {
            return (this.f93652iobyxmoadg.hashCode() * 31) + this.f93653zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93652iobyxmoadg;
        }

        public String toString() {
            return "ShowRateProductDialog(productArticle=" + this.f93652iobyxmoadg + ", productName=" + this.f93653zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f93653zoijcleaow;
        }
    }

    public static final class draadjrbmk implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93654iobyxmoadg;

        public draadjrbmk(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f93654iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f93654iobyxmoadg, ((draadjrbmk) obj).f93654iobyxmoadg);
        }

        public int hashCode() {
            return this.f93654iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93654iobyxmoadg;
        }

        public String toString() {
            return "ShowWarning(message=" + this.f93654iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93655iobyxmoadg;

        public dxjokdxxww(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.f93655iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f93655iobyxmoadg, ((dxjokdxxww) obj).f93655iobyxmoadg);
        }

        public int hashCode() {
            return this.f93655iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93655iobyxmoadg;
        }

        public String toString() {
            return "ShowProductPhotoDialog(url=" + this.f93655iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2209eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93656iobyxmoadg;

        public C2209eablkybsjg(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f93656iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2209eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f93656iobyxmoadg, ((C2209eablkybsjg) obj).f93656iobyxmoadg);
        }

        public int hashCode() {
            return this.f93656iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93656iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackbar(message=" + this.f93656iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final VivinoRating f93657iobyxmoadg;

        public gtknphoqwx(VivinoRating vivino) {
            zdlpuopuiu.btonecajqb(vivino, "vivino");
            this.f93657iobyxmoadg = vivino;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f93657iobyxmoadg, ((gtknphoqwx) obj).f93657iobyxmoadg);
        }

        public int hashCode() {
            return this.f93657iobyxmoadg.hashCode();
        }

        public final VivinoRating iobyxmoadg() {
            return this.f93657iobyxmoadg;
        }

        public String toString() {
            return "ShowVivinoDialog(vivino=" + this.f93657iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f93658ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f93659iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f93660zoijcleaow;

        public gxszxtbevo(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f93659iobyxmoadg = hint;
            this.f93660zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f93659iobyxmoadg, gxszxtbevoVar.f93659iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f93660zoijcleaow, gxszxtbevoVar.f93660zoijcleaow);
        }

        public int hashCode() {
            return (this.f93659iobyxmoadg.hashCode() * 31) + this.f93660zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f93660zoijcleaow;
        }

        public String toString() {
            return "ShowHint(hint=" + this.f93659iobyxmoadg + ", analyticsInfo=" + this.f93660zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f93659iobyxmoadg;
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f93661iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 336135502;
        }

        public String toString() {
            return "ShowAddedToListMessage";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93662iobyxmoadg;

        public lqeggnwhkg(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f93662iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f93662iobyxmoadg, ((lqeggnwhkg) obj).f93662iobyxmoadg);
        }

        public int hashCode() {
            return this.f93662iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93662iobyxmoadg;
        }

        public String toString() {
            return "ShowInfoSnackbar(message=" + this.f93662iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f93663iobyxmoadg;

        public nufgyqmvbu(List declarations) {
            zdlpuopuiu.btonecajqb(declarations, "declarations");
            this.f93663iobyxmoadg = declarations;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f93663iobyxmoadg, ((nufgyqmvbu) obj).f93663iobyxmoadg);
        }

        public int hashCode() {
            return this.f93663iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f93663iobyxmoadg;
        }

        public String toString() {
            return "ShowProductDeclarations(declarations=" + this.f93663iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f93664iobyxmoadg;

        public ppxfxbqfkf(PurchaseListAddProductDialogArgs dialogArgs) {
            zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f93664iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f93664iobyxmoadg, ((ppxfxbqfkf) obj).f93664iobyxmoadg);
        }

        public int hashCode() {
            return this.f93664iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f93664iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogSelectPurchaseList(dialogArgs=" + this.f93664iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f93665iobyxmoadg;

        public wkgbmnqykc(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f93665iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f93665iobyxmoadg, ((wkgbmnqykc) obj).f93665iobyxmoadg);
        }

        public int hashCode() {
            return this.f93665iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f93665iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f93665iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f93666zoijcleaow = BuildYourComboDialogArgs.f95481iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final BuildYourComboDialogArgs f93667iobyxmoadg;

        public zoijcleaow(BuildYourComboDialogArgs dialogArgs) {
            zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f93667iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f93667iobyxmoadg, ((zoijcleaow) obj).f93667iobyxmoadg);
        }

        public int hashCode() {
            return this.f93667iobyxmoadg.hashCode();
        }

        public final BuildYourComboDialogArgs iobyxmoadg() {
            return this.f93667iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogBuildYourCombo(dialogArgs=" + this.f93667iobyxmoadg + ")";
        }
    }
}
