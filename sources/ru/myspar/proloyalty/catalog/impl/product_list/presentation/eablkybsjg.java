package ru.myspar.proloyalty.catalog.impl.product_list.presentation;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.proloyalty.story.api.model.StoryPayload;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class agtfadlqog implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final StoryPayload f93226iobyxmoadg;

        public agtfadlqog(StoryPayload args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f93226iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && zdlpuopuiu.eablkybsjg(this.f93226iobyxmoadg, ((agtfadlqog) obj).f93226iobyxmoadg);
        }

        public int hashCode() {
            return this.f93226iobyxmoadg.hashCode();
        }

        public final StoryPayload iobyxmoadg() {
            return this.f93226iobyxmoadg;
        }

        public String toString() {
            return "ShowStory(args=" + this.f93226iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f93227iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return 649951848;
        }

        public String toString() {
            return "ShowOrderDeliveryPriceChangeMessage";
        }
    }

    public static final class draadjrbmk implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f93228iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return -1068722294;
        }

        public String toString() {
            return "ShowProductNotAvailableMessage";
        }
    }

    public static final class dxjokdxxww implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ChangeProductParams f93229iobyxmoadg;

        public dxjokdxxww(ChangeProductParams params) {
            zdlpuopuiu.btonecajqb(params, "params");
            this.f93229iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f93229iobyxmoadg, ((dxjokdxxww) obj).f93229iobyxmoadg);
        }

        public int hashCode() {
            return this.f93229iobyxmoadg.hashCode();
        }

        public final ChangeProductParams iobyxmoadg() {
            return this.f93229iobyxmoadg;
        }

        public String toString() {
            return "ShowIqosAgreementsDialog(params=" + this.f93229iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2186eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f93230zoijcleaow = BuildYourComboDialogArgs.f95481iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final BuildYourComboDialogArgs f93231iobyxmoadg;

        public C2186eablkybsjg(BuildYourComboDialogArgs dialogArgs) {
            zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f93231iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2186eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f93231iobyxmoadg, ((C2186eablkybsjg) obj).f93231iobyxmoadg);
        }

        public int hashCode() {
            return this.f93231iobyxmoadg.hashCode();
        }

        public final BuildYourComboDialogArgs iobyxmoadg() {
            return this.f93231iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogBuildYourCombo(dialogArgs=" + this.f93231iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f93232ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f93233iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f93234zoijcleaow;

        public gtknphoqwx(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f93233iobyxmoadg = hint;
            this.f93234zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return zdlpuopuiu.eablkybsjg(this.f93233iobyxmoadg, gtknphoqwxVar.f93233iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f93234zoijcleaow, gtknphoqwxVar.f93234zoijcleaow);
        }

        public int hashCode() {
            return (this.f93233iobyxmoadg.hashCode() * 31) + this.f93234zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f93234zoijcleaow;
        }

        public String toString() {
            return "ShowProductHint(hint=" + this.f93233iobyxmoadg + ", analyticsInfo=" + this.f93234zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f93233iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListAddProductDialogArgs f93235iobyxmoadg;

        public gxszxtbevo(PurchaseListAddProductDialogArgs dialogArgs) {
            zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f93235iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f93235iobyxmoadg, ((gxszxtbevo) obj).f93235iobyxmoadg);
        }

        public int hashCode() {
            return this.f93235iobyxmoadg.hashCode();
        }

        public final PurchaseListAddProductDialogArgs iobyxmoadg() {
            return this.f93235iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogSelectPurchaseList(dialogArgs=" + this.f93235iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f93236iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 616265154;
        }

        public String toString() {
            return "ScrollToTop";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f93237iobyxmoadg;

        public lqeggnwhkg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f93237iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f93237iobyxmoadg, ((lqeggnwhkg) obj).f93237iobyxmoadg);
        }

        public int hashCode() {
            return this.f93237iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f93237iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f93237iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final sp0.iobyxmoadg f93238iobyxmoadg;

        public nufgyqmvbu(sp0.iobyxmoadg message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f93238iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f93238iobyxmoadg, ((nufgyqmvbu) obj).f93238iobyxmoadg);
        }

        public int hashCode() {
            return this.f93238iobyxmoadg.hashCode();
        }

        public final sp0.iobyxmoadg iobyxmoadg() {
            return this.f93238iobyxmoadg;
        }

        public String toString() {
            return "ShowInfoAlertDialog(message=" + this.f93238iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f93239iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return 1850039833;
        }

        public String toString() {
            return "ShowSuccessAddedToOrderMessage";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93240iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f93241zoijcleaow;

        public ppxfxbqfkf(String categoryTitle, String categoryId) {
            zdlpuopuiu.btonecajqb(categoryTitle, "categoryTitle");
            zdlpuopuiu.btonecajqb(categoryId, "categoryId");
            this.f93240iobyxmoadg = categoryTitle;
            this.f93241zoijcleaow = categoryId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f93240iobyxmoadg, ppxfxbqfkfVar.f93240iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f93241zoijcleaow, ppxfxbqfkfVar.f93241zoijcleaow);
        }

        public int hashCode() {
            return (this.f93240iobyxmoadg.hashCode() * 31) + this.f93241zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93241zoijcleaow;
        }

        public String toString() {
            return "ShowAgeCheckDialog(categoryTitle=" + this.f93240iobyxmoadg + ", categoryId=" + this.f93241zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f93240iobyxmoadg;
        }
    }

    public static final class rgvfuqvkyq implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f93242iobyxmoadg;

        public rgvfuqvkyq(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f93242iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof rgvfuqvkyq) && zdlpuopuiu.eablkybsjg(this.f93242iobyxmoadg, ((rgvfuqvkyq) obj).f93242iobyxmoadg);
        }

        public int hashCode() {
            return this.f93242iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f93242iobyxmoadg;
        }

        public String toString() {
            return "ShowWarningMessage(message=" + this.f93242iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mz0.ppxfxbqfkf f93243iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ColorsModel f93244ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f93245zoijcleaow;

        public wflxmlrfwp(mz0.ppxfxbqfkf selected, List supportedTypes, ColorsModel colorsModel) {
            zdlpuopuiu.btonecajqb(selected, "selected");
            zdlpuopuiu.btonecajqb(supportedTypes, "supportedTypes");
            this.f93243iobyxmoadg = selected;
            this.f93245zoijcleaow = supportedTypes;
            this.f93244ppxfxbqfkf = colorsModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return this.f93243iobyxmoadg == wflxmlrfwpVar.f93243iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f93245zoijcleaow, wflxmlrfwpVar.f93245zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f93244ppxfxbqfkf, wflxmlrfwpVar.f93244ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f93243iobyxmoadg.hashCode() * 31) + this.f93245zoijcleaow.hashCode()) * 31;
            ColorsModel colorsModel = this.f93244ppxfxbqfkf;
            return iHashCode + (colorsModel == null ? 0 : colorsModel.hashCode());
        }

        public final ColorsModel iobyxmoadg() {
            return this.f93244ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f93245zoijcleaow;
        }

        public String toString() {
            return "ShowSortDialog(selected=" + this.f93243iobyxmoadg + ", supportedTypes=" + this.f93245zoijcleaow + ", colorsModel=" + this.f93244ppxfxbqfkf + ")";
        }

        public final mz0.ppxfxbqfkf zoijcleaow() {
            return this.f93243iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f93246iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 321139770;
        }

        public String toString() {
            return "ShowDialogAfterAddComboToBasket";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f93247iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -855218698;
        }

        public String toString() {
            return "ShowAddedToListMessage";
        }
    }
}
