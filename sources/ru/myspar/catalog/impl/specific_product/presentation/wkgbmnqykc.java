package ru.myspar.catalog.impl.specific_product.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.models.product.VivinoRating;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class btonecajqb implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85964iobyxmoadg;

        public btonecajqb(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f85964iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f85964iobyxmoadg, ((btonecajqb) obj).f85964iobyxmoadg);
        }

        public int hashCode() {
            return this.f85964iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85964iobyxmoadg;
        }

        public String toString() {
            return "ShowWarning(message=" + this.f85964iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final VivinoRating f85965iobyxmoadg;

        public dxjokdxxww(VivinoRating vivino) {
            zdlpuopuiu.btonecajqb(vivino, "vivino");
            this.f85965iobyxmoadg = vivino;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f85965iobyxmoadg, ((dxjokdxxww) obj).f85965iobyxmoadg);
        }

        public int hashCode() {
            return this.f85965iobyxmoadg.hashCode();
        }

        public final VivinoRating iobyxmoadg() {
            return this.f85965iobyxmoadg;
        }

        public String toString() {
            return "ShowVivinoDialog(vivino=" + this.f85965iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f85966ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f85967iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f85968zoijcleaow;

        public eablkybsjg(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f85967iobyxmoadg = hint;
            this.f85968zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f85967iobyxmoadg, eablkybsjgVar.f85967iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f85968zoijcleaow, eablkybsjgVar.f85968zoijcleaow);
        }

        public int hashCode() {
            return (this.f85967iobyxmoadg.hashCode() * 31) + this.f85968zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f85968zoijcleaow;
        }

        public String toString() {
            return "ShowHint(hint=" + this.f85967iobyxmoadg + ", analyticsInfo=" + this.f85968zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f85967iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85969iobyxmoadg;

        public gxszxtbevo(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f85969iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f85969iobyxmoadg, ((gxszxtbevo) obj).f85969iobyxmoadg);
        }

        public int hashCode() {
            return this.f85969iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85969iobyxmoadg;
        }

        public String toString() {
            return "ShowInfoSnackbar(message=" + this.f85969iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f85970zoijcleaow = BuildYourComboDialogArgs.f87699cqumvgiudr;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final BuildYourComboDialogArgs f85971iobyxmoadg;

        public iobyxmoadg(BuildYourComboDialogArgs dialogArgs) {
            zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f85971iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f85971iobyxmoadg, ((iobyxmoadg) obj).f85971iobyxmoadg);
        }

        public int hashCode() {
            return this.f85971iobyxmoadg.hashCode();
        }

        public final BuildYourComboDialogArgs iobyxmoadg() {
            return this.f85971iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogBuildYourCombo(dialogArgs=" + this.f85971iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85972iobyxmoadg;

        public lqeggnwhkg(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.f85972iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f85972iobyxmoadg, ((lqeggnwhkg) obj).f85972iobyxmoadg);
        }

        public int hashCode() {
            return this.f85972iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85972iobyxmoadg;
        }

        public String toString() {
            return "ShowProductPhotoDialog(url=" + this.f85972iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85973iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f85974zoijcleaow;

        public nufgyqmvbu(String productArticle, String productName) {
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f85973iobyxmoadg = productArticle;
            this.f85974zoijcleaow = productName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f85973iobyxmoadg, nufgyqmvbuVar.f85973iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f85974zoijcleaow, nufgyqmvbuVar.f85974zoijcleaow);
        }

        public int hashCode() {
            return (this.f85973iobyxmoadg.hashCode() * 31) + this.f85974zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85973iobyxmoadg;
        }

        public String toString() {
            return "ShowRateProductDialog(productArticle=" + this.f85973iobyxmoadg + ", productName=" + this.f85974zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f85974zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f85975iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f85975iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f85975iobyxmoadg, ((ppxfxbqfkf) obj).f85975iobyxmoadg);
        }

        public int hashCode() {
            return this.f85975iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f85975iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f85975iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1972wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85976iobyxmoadg;

        public C1972wkgbmnqykc(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f85976iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1972wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f85976iobyxmoadg, ((C1972wkgbmnqykc) obj).f85976iobyxmoadg);
        }

        public int hashCode() {
            return this.f85976iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85976iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackbar(message=" + this.f85976iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f85977iobyxmoadg;

        public zoijcleaow(PurchaseListAddProductDialogArgs dialogArgs) {
            zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f85977iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f85977iobyxmoadg, ((zoijcleaow) obj).f85977iobyxmoadg);
        }

        public int hashCode() {
            return this.f85977iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f85977iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogSelectPurchaseList(dialogArgs=" + this.f85977iobyxmoadg + ")";
        }
    }
}
