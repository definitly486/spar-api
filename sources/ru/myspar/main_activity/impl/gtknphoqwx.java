package ru.myspar.main_activity.impl;

import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.core.domain.models.reviewWithBonuses.ReviewWithBonuses;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.evropolis.api.model.EvropolisGift;
import ru.myspar.main_activity.impl.models.PopupTypesUiModel;
import ru.myspar.purchases.api.model.PurchaseListSharedWithYouDialogArgs;

/* JADX INFO: loaded from: classes4.dex */
public interface gtknphoqwx {

    public static final class agtfadlqog implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f90405iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return 1097980421;
        }

        public String toString() {
            return "ShowInAppReview";
        }
    }

    public static final class btonecajqb implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListSharedWithYouDialogArgs f90406iobyxmoadg;

        public btonecajqb(PurchaseListSharedWithYouDialogArgs dialogArgs) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f90406iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90406iobyxmoadg, ((btonecajqb) obj).f90406iobyxmoadg);
        }

        public int hashCode() {
            return this.f90406iobyxmoadg.hashCode();
        }

        public final PurchaseListSharedWithYouDialogArgs iobyxmoadg() {
            return this.f90406iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogPurchaseListSharedWithYou(dialogArgs=" + this.f90406iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ss.wkgbmnqykc f90407iobyxmoadg;

        public cqumvgiudr(ss.wkgbmnqykc message) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f90407iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cqumvgiudr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90407iobyxmoadg, ((cqumvgiudr) obj).f90407iobyxmoadg);
        }

        public int hashCode() {
            return this.f90407iobyxmoadg.hashCode();
        }

        public final ss.wkgbmnqykc iobyxmoadg() {
            return this.f90407iobyxmoadg;
        }

        public String toString() {
            return "ShowSnackbar(message=" + this.f90407iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final EvropolisGift f90408iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f90409zoijcleaow;

        public draadjrbmk(EvropolisGift gift, DeliveryCode deliveryCode) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gift, "gift");
            this.f90408iobyxmoadg = gift;
            this.f90409zoijcleaow = deliveryCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof draadjrbmk)) {
                return false;
            }
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90408iobyxmoadg, draadjrbmkVar.f90408iobyxmoadg) && this.f90409zoijcleaow == draadjrbmkVar.f90409zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = this.f90408iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f90409zoijcleaow;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f90409zoijcleaow;
        }

        public String toString() {
            return "ShowEvropolisGiftDialog(gift=" + this.f90408iobyxmoadg + ", deliveryCode=" + this.f90409zoijcleaow + ")";
        }

        public final EvropolisGift zoijcleaow() {
            return this.f90408iobyxmoadg;
        }
    }

    public static final class dxjokdxxww implements gtknphoqwx {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f90410zoijcleaow = BuildYourComboDialogArgs.f87699cqumvgiudr;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final BuildYourComboDialogArgs f90411iobyxmoadg;

        public dxjokdxxww(BuildYourComboDialogArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f90411iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90411iobyxmoadg, ((dxjokdxxww) obj).f90411iobyxmoadg);
        }

        public int hashCode() {
            return this.f90411iobyxmoadg.hashCode();
        }

        public final BuildYourComboDialogArgs iobyxmoadg() {
            return this.f90411iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogBuildYourCombo(args=" + this.f90411iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final at.zoijcleaow f90412iobyxmoadg;

        public eablkybsjg(at.zoijcleaow requestModel) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(requestModel, "requestModel");
            this.f90412iobyxmoadg = requestModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90412iobyxmoadg, ((eablkybsjg) obj).f90412iobyxmoadg);
        }

        public int hashCode() {
            return this.f90412iobyxmoadg.hashCode();
        }

        public final at.zoijcleaow iobyxmoadg() {
            return this.f90412iobyxmoadg;
        }

        public String toString() {
            return "RequestPermissions(requestModel=" + this.f90412iobyxmoadg + ")";
        }
    }

    public static final class esjtqupxsv implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final p00.ppxfxbqfkf f90413iobyxmoadg;

        public esjtqupxsv(p00.ppxfxbqfkf message) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f90413iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof esjtqupxsv) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90413iobyxmoadg, ((esjtqupxsv) obj).f90413iobyxmoadg);
        }

        public int hashCode() {
            return this.f90413iobyxmoadg.hashCode();
        }

        public final p00.ppxfxbqfkf iobyxmoadg() {
            return this.f90413iobyxmoadg;
        }

        public String toString() {
            return "ShowUpdateApplicationDialog(message=" + this.f90413iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.main_activity.impl.gtknphoqwx$gtknphoqwx, reason: collision with other inner class name */
    public static final class C2077gtknphoqwx implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2077gtknphoqwx f90414iobyxmoadg = new C2077gtknphoqwx();

        private C2077gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2077gtknphoqwx);
        }

        public int hashCode() {
            return -97822967;
        }

        public String toString() {
            return "ShowEchecksDialog";
        }
    }

    public static final class gxszxtbevo implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final eg0.zoijcleaow f90415iobyxmoadg;

        public gxszxtbevo(eg0.zoijcleaow popup) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popup, "popup");
            this.f90415iobyxmoadg = popup;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90415iobyxmoadg, ((gxszxtbevo) obj).f90415iobyxmoadg);
        }

        public int hashCode() {
            return this.f90415iobyxmoadg.hashCode();
        }

        public final eg0.zoijcleaow iobyxmoadg() {
            return this.f90415iobyxmoadg;
        }

        public String toString() {
            return "ShowAdultWarningDialog(popup=" + this.f90415iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f90416iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 2024259351;
        }

        public String toString() {
            return "HideConnectionSnackbar";
        }
    }

    public static final class iwizpuwonk implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ReviewWithBonuses f90417iobyxmoadg;

        public iwizpuwonk(ReviewWithBonuses reviewWithBonuses) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reviewWithBonuses, "reviewWithBonuses");
            this.f90417iobyxmoadg = reviewWithBonuses;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iwizpuwonk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90417iobyxmoadg, ((iwizpuwonk) obj).f90417iobyxmoadg);
        }

        public int hashCode() {
            return this.f90417iobyxmoadg.hashCode();
        }

        public final ReviewWithBonuses iobyxmoadg() {
            return this.f90417iobyxmoadg;
        }

        public String toString() {
            return "ShowReviewWithBonusesDialog(reviewWithBonuses=" + this.f90417iobyxmoadg + ")";
        }
    }

    public static final class jyumaefscl implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final pf0.eablkybsjg f90418iobyxmoadg;

        public jyumaefscl(pf0.eablkybsjg params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f90418iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jyumaefscl) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90418iobyxmoadg, ((jyumaefscl) obj).f90418iobyxmoadg);
        }

        public int hashCode() {
            return this.f90418iobyxmoadg.hashCode();
        }

        public final pf0.eablkybsjg iobyxmoadg() {
            return this.f90418iobyxmoadg;
        }

        public String toString() {
            return "ShowRateOrderDialog(params=" + this.f90418iobyxmoadg + ")";
        }
    }

    public static final class kcexrzcfyt implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f90419iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof kcexrzcfyt);
        }

        public int hashCode() {
            return -1306825667;
        }

        public String toString() {
            return "ShowQrCode";
        }
    }

    public static final class lqeggnwhkg implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f90420iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 395838947;
        }

        public String toString() {
            return "ShowContinueScanGoSessionDialog";
        }
    }

    public static final class nufgyqmvbu implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f90421iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -1243224813;
        }

        public String toString() {
            return "ShowDialogAfterAddComboToBasket";
        }
    }

    public static final class ojitshcjhn implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f90422iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return -1048682036;
        }

        public String toString() {
            return "ShowIqosAgreementsDialog";
        }
    }

    public static final class oxmwwwfdhm implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PopupTypesUiModel f90423iobyxmoadg;

        public oxmwwwfdhm(PopupTypesUiModel popup) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popup, "popup");
            this.f90423iobyxmoadg = popup;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90423iobyxmoadg, ((oxmwwwfdhm) obj).f90423iobyxmoadg);
        }

        public int hashCode() {
            return this.f90423iobyxmoadg.hashCode();
        }

        public final PopupTypesUiModel iobyxmoadg() {
            return this.f90423iobyxmoadg;
        }

        public String toString() {
            return "ShowPopupTypesDialog(popup=" + this.f90423iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f90424iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -535889518;
        }

        public String toString() {
            return "OpenNetworkPanel";
        }
    }

    public static final class rgvfuqvkyq implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final af0.iobyxmoadg f90425iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsPage f90426zoijcleaow;

        public rgvfuqvkyq(af0.iobyxmoadg loymaxPopup, AnalyticsPage page) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loymaxPopup, "loymaxPopup");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(page, "page");
            this.f90425iobyxmoadg = loymaxPopup;
            this.f90426zoijcleaow = page;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof rgvfuqvkyq)) {
                return false;
            }
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90425iobyxmoadg, rgvfuqvkyqVar.f90425iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90426zoijcleaow, rgvfuqvkyqVar.f90426zoijcleaow);
        }

        public int hashCode() {
            return (this.f90425iobyxmoadg.hashCode() * 31) + this.f90426zoijcleaow.hashCode();
        }

        public final af0.iobyxmoadg iobyxmoadg() {
            return this.f90425iobyxmoadg;
        }

        public String toString() {
            return "ShowLoymaxPopupDialog(loymaxPopup=" + this.f90425iobyxmoadg + ", page=" + this.f90426zoijcleaow + ")";
        }

        public final AnalyticsPage zoijcleaow() {
            return this.f90426zoijcleaow;
        }
    }

    public static final class vdvldrhtss implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f90427iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final eg0.zoijcleaow f90428ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f90429zoijcleaow;

        public vdvldrhtss(String shopId, DeliveryCode deliveryCode, eg0.zoijcleaow popupModel) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shopId, "shopId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popupModel, "popupModel");
            this.f90427iobyxmoadg = shopId;
            this.f90429zoijcleaow = deliveryCode;
            this.f90428ppxfxbqfkf = popupModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90427iobyxmoadg, vdvldrhtssVar.f90427iobyxmoadg) && this.f90429zoijcleaow == vdvldrhtssVar.f90429zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90428ppxfxbqfkf, vdvldrhtssVar.f90428ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = this.f90427iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f90429zoijcleaow;
            return ((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.f90428ppxfxbqfkf.hashCode();
        }

        public final eg0.zoijcleaow iobyxmoadg() {
            return this.f90428ppxfxbqfkf;
        }

        public String toString() {
            return "ShowPopupDialog(shopId=" + this.f90427iobyxmoadg + ", deliveryCode=" + this.f90429zoijcleaow + ", popupModel=" + this.f90428ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f90427iobyxmoadg;
        }
    }

    public static final class wflxmlrfwp implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f90430iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return -1343215091;
        }

        public String toString() {
            return "ShowForceUpdateDialog";
        }
    }

    public static final class wkgbmnqykc implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f90431iobyxmoadg;

        public wkgbmnqykc(String msg) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(msg, "msg");
            this.f90431iobyxmoadg = msg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90431iobyxmoadg, ((wkgbmnqykc) obj).f90431iobyxmoadg);
        }

        public int hashCode() {
            return this.f90431iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f90431iobyxmoadg;
        }

        public String toString() {
            return "PushDescription(msg=" + this.f90431iobyxmoadg + ")";
        }
    }

    public static final class yggfygwlhe implements gtknphoqwx {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f90432zoijcleaow = xa0.wflxmlrfwp.f121917wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final xa0.wflxmlrfwp f90433iobyxmoadg;

        public yggfygwlhe(xa0.wflxmlrfwp params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f90433iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f90433iobyxmoadg, ((yggfygwlhe) obj).f90433iobyxmoadg);
        }

        public int hashCode() {
            return this.f90433iobyxmoadg.hashCode();
        }

        public final xa0.wflxmlrfwp iobyxmoadg() {
            return this.f90433iobyxmoadg;
        }

        public String toString() {
            return "ShowQuizDialog(params=" + this.f90433iobyxmoadg + ")";
        }
    }

    public static final class zdlpuopuiu implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f90434iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return -1706006632;
        }

        public String toString() {
            return "ShowQrDialog";
        }
    }

    public static final class zoijcleaow implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f90435iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 325637782;
        }

        public String toString() {
            return "HideSystemSplashScreen";
        }
    }
}
