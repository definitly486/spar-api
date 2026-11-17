package ru.myspar.catalog.impl.product_list.presentation;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ColorsModel;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.story.api.model.StoryPayload;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class agtfadlqog implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final v00.ppxfxbqfkf f85299iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ColorsModel f85300ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f85301zoijcleaow;

        public agtfadlqog(v00.ppxfxbqfkf selected, List supportedTypes, ColorsModel colorsModel) {
            zdlpuopuiu.btonecajqb(selected, "selected");
            zdlpuopuiu.btonecajqb(supportedTypes, "supportedTypes");
            this.f85299iobyxmoadg = selected;
            this.f85301zoijcleaow = supportedTypes;
            this.f85300ppxfxbqfkf = colorsModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return this.f85299iobyxmoadg == agtfadlqogVar.f85299iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f85301zoijcleaow, agtfadlqogVar.f85301zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f85300ppxfxbqfkf, agtfadlqogVar.f85300ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f85299iobyxmoadg.hashCode() * 31) + this.f85301zoijcleaow.hashCode()) * 31;
            ColorsModel colorsModel = this.f85300ppxfxbqfkf;
            return iHashCode + (colorsModel == null ? 0 : colorsModel.hashCode());
        }

        public final ColorsModel iobyxmoadg() {
            return this.f85300ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f85301zoijcleaow;
        }

        public String toString() {
            return "ShowSortDialog(selected=" + this.f85299iobyxmoadg + ", supportedTypes=" + this.f85301zoijcleaow + ", colorsModel=" + this.f85300ppxfxbqfkf + ")";
        }

        public final v00.ppxfxbqfkf zoijcleaow() {
            return this.f85299iobyxmoadg;
        }
    }

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f85302iobyxmoadg;

        public btonecajqb(ChangeProductParams params) {
            zdlpuopuiu.btonecajqb(params, "params");
            this.f85302iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f85302iobyxmoadg, ((btonecajqb) obj).f85302iobyxmoadg);
        }

        public int hashCode() {
            return this.f85302iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f85302iobyxmoadg;
        }

        public String toString() {
            return "ShowIqosAgreementsDialog(params=" + this.f85302iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f85303ppxfxbqfkf = HintDialogAnalyticsInfo.f86151iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f85304iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f85305zoijcleaow;

        public draadjrbmk(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f85304iobyxmoadg = hint;
            this.f85305zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return zdlpuopuiu.eablkybsjg(this.f85304iobyxmoadg, draadjrbmkVar.f85304iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f85305zoijcleaow, draadjrbmkVar.f85305zoijcleaow);
        }

        public int hashCode() {
            return (this.f85304iobyxmoadg.hashCode() * 31) + this.f85305zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f85305zoijcleaow;
        }

        public String toString() {
            return "ShowProductHint(hint=" + this.f85304iobyxmoadg + ", analyticsInfo=" + this.f85305zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f85304iobyxmoadg;
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final gr.iobyxmoadg f85306iobyxmoadg;

        public dxjokdxxww(gr.iobyxmoadg message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f85306iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f85306iobyxmoadg, ((dxjokdxxww) obj).f85306iobyxmoadg);
        }

        public int hashCode() {
            return this.f85306iobyxmoadg.hashCode();
        }

        public final gr.iobyxmoadg iobyxmoadg() {
            return this.f85306iobyxmoadg;
        }

        public String toString() {
            return "ShowInfoAlertDialog(message=" + this.f85306iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.product_list.presentation.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1944eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1944eablkybsjg f85307iobyxmoadg = new C1944eablkybsjg();

        private C1944eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1944eablkybsjg);
        }

        public int hashCode() {
            return -1248546729;
        }

        public String toString() {
            return "ShowDialogAfterAddComboToBasket";
        }
    }

    public static final class gtknphoqwx implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f85308iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return -433545211;
        }

        public String toString() {
            return "ShowOrderDeliveryPriceChangeMessage";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f85309zoijcleaow = BuildYourComboDialogArgs.f87699cqumvgiudr;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final BuildYourComboDialogArgs f85310iobyxmoadg;

        public gxszxtbevo(BuildYourComboDialogArgs dialogArgs) {
            zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f85310iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f85310iobyxmoadg, ((gxszxtbevo) obj).f85310iobyxmoadg);
        }

        public int hashCode() {
            return this.f85310iobyxmoadg.hashCode();
        }

        public final BuildYourComboDialogArgs iobyxmoadg() {
            return this.f85310iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogBuildYourCombo(dialogArgs=" + this.f85310iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f85311iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 143352415;
        }

        public String toString() {
            return "ScrollToTop";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f85312iobyxmoadg;

        public lqeggnwhkg(PurchaseListAddProductDialogArgs dialogArgs) {
            zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f85312iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f85312iobyxmoadg, ((lqeggnwhkg) obj).f85312iobyxmoadg);
        }

        public int hashCode() {
            return this.f85312iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f85312iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogSelectPurchaseList(dialogArgs=" + this.f85312iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f85313iobyxmoadg;

        public nufgyqmvbu(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f85313iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f85313iobyxmoadg, ((nufgyqmvbu) obj).f85313iobyxmoadg);
        }

        public int hashCode() {
            return this.f85313iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f85313iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f85313iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final StoryPayload f85314iobyxmoadg;

        public ojitshcjhn(StoryPayload args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f85314iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ojitshcjhn) && zdlpuopuiu.eablkybsjg(this.f85314iobyxmoadg, ((ojitshcjhn) obj).f85314iobyxmoadg);
        }

        public int hashCode() {
            return this.f85314iobyxmoadg.hashCode();
        }

        public final StoryPayload iobyxmoadg() {
            return this.f85314iobyxmoadg;
        }

        public String toString() {
            return "ShowStory(args=" + this.f85314iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85315iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f85316zoijcleaow;

        public ppxfxbqfkf(String categoryTitle, String categoryId) {
            zdlpuopuiu.btonecajqb(categoryTitle, "categoryTitle");
            zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f85315iobyxmoadg = categoryTitle;
            this.f85316zoijcleaow = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f85315iobyxmoadg, ppxfxbqfkfVar.f85315iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f85316zoijcleaow, ppxfxbqfkfVar.f85316zoijcleaow);
        }

        public int hashCode() {
            return (this.f85315iobyxmoadg.hashCode() * 31) + this.f85316zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85316zoijcleaow;
        }

        public String toString() {
            return "ShowAgeCheckDialog(categoryTitle=" + this.f85315iobyxmoadg + ", categoryId=" + this.f85316zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f85315iobyxmoadg;
        }
    }

    public static final class rgvfuqvkyq implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f85317iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return 1106668124;
        }

        public String toString() {
            return "ShowSuccessAddedToOrderMessage";
        }
    }

    public static final class vdvldrhtss implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85318iobyxmoadg;

        public vdvldrhtss(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f85318iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof vdvldrhtss) && zdlpuopuiu.eablkybsjg(this.f85318iobyxmoadg, ((vdvldrhtss) obj).f85318iobyxmoadg);
        }

        public int hashCode() {
            return this.f85318iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85318iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningMessage(message=" + this.f85318iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f85319iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return -1812094003;
        }

        public String toString() {
            return "ShowProductNotAvailableMessage";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f85320iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f85321zoijcleaow;

        public wkgbmnqykc(ChangeProductParams params, String message) {
            zdlpuopuiu.btonecajqb(params, "params");
            zdlpuopuiu.btonecajqb(message, "message");
            this.f85320iobyxmoadg = params;
            this.f85321zoijcleaow = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f85320iobyxmoadg, wkgbmnqykcVar.f85320iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f85321zoijcleaow, wkgbmnqykcVar.f85321zoijcleaow);
        }

        public int hashCode() {
            return (this.f85320iobyxmoadg.hashCode() * 31) + this.f85321zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f85321zoijcleaow;
        }

        public String toString() {
            return "ShowAvailableOnlyForPickupDialog(params=" + this.f85320iobyxmoadg + ", message=" + this.f85321zoijcleaow + ")";
        }

        public final ChangeProductParams zoijcleaow() {
            return this.f85320iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f85322iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1044211001;
        }

        public String toString() {
            return "ShowAddedToListMessage";
        }
    }
}
