package ru.myspar.proloyalty.main_activity.impl;

import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.core.domain.models.reviewWithBonuses.ReviewWithBonuses;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;
import ru.myspar.proloyalty.main_activity.impl.models.PopupTypesUiModel;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListSharedWithYouDialogArgs;

/* JADX INFO: loaded from: classes5.dex */
public interface agtfadlqog {

    /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.agtfadlqog$agtfadlqog, reason: collision with other inner class name */
    public static final class C2312agtfadlqog implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final EvropolisGift f97793iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f97794zoijcleaow;

        public C2312agtfadlqog(EvropolisGift gift, DeliveryCode deliveryCode) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gift, "gift");
            this.f97793iobyxmoadg = gift;
            this.f97794zoijcleaow = deliveryCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2312agtfadlqog)) {
                return false;
            }
            C2312agtfadlqog c2312agtfadlqog = (C2312agtfadlqog) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97793iobyxmoadg, c2312agtfadlqog.f97793iobyxmoadg) && this.f97794zoijcleaow == c2312agtfadlqog.f97794zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = this.f97793iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f97794zoijcleaow;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f97794zoijcleaow;
        }

        public String toString() {
            return "ShowEvropolisGiftDialog(gift=" + this.f97793iobyxmoadg + ", deliveryCode=" + this.f97794zoijcleaow + ")";
        }

        public final EvropolisGift zoijcleaow() {
            return this.f97793iobyxmoadg;
        }
    }

    public static final class btonecajqb implements agtfadlqog {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f97795zoijcleaow = BuildYourComboDialogArgs.f95481iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final BuildYourComboDialogArgs f97796iobyxmoadg;

        public btonecajqb(BuildYourComboDialogArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            this.f97796iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97796iobyxmoadg, ((btonecajqb) obj).f97796iobyxmoadg);
        }

        public int hashCode() {
            return this.f97796iobyxmoadg.hashCode();
        }

        public final BuildYourComboDialogArgs iobyxmoadg() {
            return this.f97796iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogBuildYourCombo(args=" + this.f97796iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lr0.eablkybsjg f97797iobyxmoadg;

        public cqumvgiudr(lr0.eablkybsjg message) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f97797iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof cqumvgiudr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97797iobyxmoadg, ((cqumvgiudr) obj).f97797iobyxmoadg);
        }

        public int hashCode() {
            return this.f97797iobyxmoadg.hashCode();
        }

        public final lr0.eablkybsjg iobyxmoadg() {
            return this.f97797iobyxmoadg;
        }

        public String toString() {
            return "ShowSnackbar(message=" + this.f97797iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f97798iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return -629240890;
        }

        public String toString() {
            return "ShowEchecksDialog";
        }
    }

    public static final class dxjokdxxww implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f97799iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -242513136;
        }

        public String toString() {
            return "ShowDialogAfterAddComboToBasket";
        }
    }

    public static final class eablkybsjg implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ur0.zoijcleaow f97800iobyxmoadg;

        public eablkybsjg(ur0.zoijcleaow requestModel) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(requestModel, "requestModel");
            this.f97800iobyxmoadg = requestModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97800iobyxmoadg, ((eablkybsjg) obj).f97800iobyxmoadg);
        }

        public int hashCode() {
            return this.f97800iobyxmoadg.hashCode();
        }

        public final ur0.zoijcleaow iobyxmoadg() {
            return this.f97800iobyxmoadg;
        }

        public String toString() {
            return "RequestPermissions(requestModel=" + this.f97800iobyxmoadg + ")";
        }
    }

    public static final class esjtqupxsv implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final hz0.ppxfxbqfkf f97801iobyxmoadg;

        public esjtqupxsv(hz0.ppxfxbqfkf message) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            this.f97801iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof esjtqupxsv) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97801iobyxmoadg, ((esjtqupxsv) obj).f97801iobyxmoadg);
        }

        public int hashCode() {
            return this.f97801iobyxmoadg.hashCode();
        }

        public final hz0.ppxfxbqfkf iobyxmoadg() {
            return this.f97801iobyxmoadg;
        }

        public String toString() {
            return "ShowUpdateApplicationDialog(message=" + this.f97801iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListSharedWithYouDialogArgs f97802iobyxmoadg;

        public gtknphoqwx(PurchaseListSharedWithYouDialogArgs dialogArgs) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dialogArgs, "dialogArgs");
            this.f97802iobyxmoadg = dialogArgs;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97802iobyxmoadg, ((gtknphoqwx) obj).f97802iobyxmoadg);
        }

        public int hashCode() {
            return this.f97802iobyxmoadg.hashCode();
        }

        public final PurchaseListSharedWithYouDialogArgs iobyxmoadg() {
            return this.f97802iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogPurchaseListSharedWithYou(dialogArgs=" + this.f97802iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final jd1.ppxfxbqfkf f97803iobyxmoadg;

        public gxszxtbevo(jd1.ppxfxbqfkf popup) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popup, "popup");
            this.f97803iobyxmoadg = popup;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97803iobyxmoadg, ((gxszxtbevo) obj).f97803iobyxmoadg);
        }

        public int hashCode() {
            return this.f97803iobyxmoadg.hashCode();
        }

        public final jd1.ppxfxbqfkf iobyxmoadg() {
            return this.f97803iobyxmoadg;
        }

        public String toString() {
            return "ShowAdultWarningDialog(popup=" + this.f97803iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f97804iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1709332318;
        }

        public String toString() {
            return "CloseApp";
        }
    }

    public static final class iwizpuwonk implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ReviewWithBonuses f97805iobyxmoadg;

        public iwizpuwonk(ReviewWithBonuses reviewWithBonuses) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reviewWithBonuses, "reviewWithBonuses");
            this.f97805iobyxmoadg = reviewWithBonuses;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iwizpuwonk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97805iobyxmoadg, ((iwizpuwonk) obj).f97805iobyxmoadg);
        }

        public int hashCode() {
            return this.f97805iobyxmoadg.hashCode();
        }

        public final ReviewWithBonuses iobyxmoadg() {
            return this.f97805iobyxmoadg;
        }

        public String toString() {
            return "ShowReviewWithBonusesDialog(reviewWithBonuses=" + this.f97805iobyxmoadg + ")";
        }
    }

    public static final class jyumaefscl implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tc1.ppxfxbqfkf f97806iobyxmoadg;

        public jyumaefscl(tc1.ppxfxbqfkf params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f97806iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jyumaefscl) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97806iobyxmoadg, ((jyumaefscl) obj).f97806iobyxmoadg);
        }

        public int hashCode() {
            return this.f97806iobyxmoadg.hashCode();
        }

        public final tc1.ppxfxbqfkf iobyxmoadg() {
            return this.f97806iobyxmoadg;
        }

        public String toString() {
            return "ShowRateOrderDialog(params=" + this.f97806iobyxmoadg + ")";
        }
    }

    public static final class kcexrzcfyt implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PopupTypesUiModel f97807iobyxmoadg;

        public kcexrzcfyt(PopupTypesUiModel popup) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popup, "popup");
            this.f97807iobyxmoadg = popup;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97807iobyxmoadg, ((kcexrzcfyt) obj).f97807iobyxmoadg);
        }

        public int hashCode() {
            return this.f97807iobyxmoadg.hashCode();
        }

        public final PopupTypesUiModel iobyxmoadg() {
            return this.f97807iobyxmoadg;
        }

        public String toString() {
            return "ShowPopupTypesDialog(popup=" + this.f97807iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97808iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final jd1.ppxfxbqfkf f97809ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f97810zoijcleaow;

        public lqeggnwhkg(String shopId, DeliveryCode deliveryCode, jd1.ppxfxbqfkf popupModel) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shopId, "shopId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popupModel, "popupModel");
            this.f97808iobyxmoadg = shopId;
            this.f97810zoijcleaow = deliveryCode;
            this.f97809ppxfxbqfkf = popupModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97808iobyxmoadg, lqeggnwhkgVar.f97808iobyxmoadg) && this.f97810zoijcleaow == lqeggnwhkgVar.f97810zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97809ppxfxbqfkf, lqeggnwhkgVar.f97809ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = this.f97808iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f97810zoijcleaow;
            return ((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.f97809ppxfxbqfkf.hashCode();
        }

        public final jd1.ppxfxbqfkf iobyxmoadg() {
            return this.f97809ppxfxbqfkf;
        }

        public String toString() {
            return "ShowBannerPopupDialog(shopId=" + this.f97808iobyxmoadg + ", deliveryCode=" + this.f97810zoijcleaow + ", popupModel=" + this.f97809ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f97808iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f97811iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return 1396550624;
        }

        public String toString() {
            return "ShowContinueScanGoSessionDialog";
        }
    }

    public static final class ojitshcjhn implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f97812iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return 368097354;
        }

        public String toString() {
            return "ShowForceUpdateDialog";
        }
    }

    public static final class oxmwwwfdhm implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final hh1.btonecajqb f97813iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsPage f97814zoijcleaow;

        public oxmwwwfdhm(hh1.btonecajqb popup, AnalyticsPage page) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popup, "popup");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(page, "page");
            this.f97813iobyxmoadg = popup;
            this.f97814zoijcleaow = page;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof oxmwwwfdhm)) {
                return false;
            }
            oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97813iobyxmoadg, oxmwwwfdhmVar.f97813iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97814zoijcleaow, oxmwwwfdhmVar.f97814zoijcleaow);
        }

        public int hashCode() {
            return (this.f97813iobyxmoadg.hashCode() * 31) + this.f97814zoijcleaow.hashCode();
        }

        public final AnalyticsPage iobyxmoadg() {
            return this.f97814zoijcleaow;
        }

        public String toString() {
            return "ShowPopupDialog(popup=" + this.f97813iobyxmoadg + ", page=" + this.f97814zoijcleaow + ")";
        }

        public final hh1.btonecajqb zoijcleaow() {
            return this.f97813iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f97815iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1836716025;
        }

        public String toString() {
            return "HideSystemSplashScreen";
        }
    }

    public static final class rgvfuqvkyq implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f97816iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return -1651172862;
        }

        public String toString() {
            return "ShowInAppReview";
        }
    }

    public static final class vdvldrhtss implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final vdvldrhtss f97817iobyxmoadg = new vdvldrhtss();

        private vdvldrhtss() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof vdvldrhtss);
        }

        public int hashCode() {
            return -601436561;
        }

        public String toString() {
            return "ShowIqosAgreementsDialog";
        }
    }

    public static final class wflxmlrfwp implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97818iobyxmoadg;

        public wflxmlrfwp(String userEmail) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userEmail, "userEmail");
            this.f97818iobyxmoadg = userEmail;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97818iobyxmoadg, ((wflxmlrfwp) obj).f97818iobyxmoadg);
        }

        public int hashCode() {
            return this.f97818iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97818iobyxmoadg;
        }

        public String toString() {
            return "ShowEmailVerifyDialog(userEmail=" + this.f97818iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97819iobyxmoadg;

        public wkgbmnqykc(String msg) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(msg, "msg");
            this.f97819iobyxmoadg = msg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97819iobyxmoadg, ((wkgbmnqykc) obj).f97819iobyxmoadg);
        }

        public int hashCode() {
            return this.f97819iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97819iobyxmoadg;
        }

        public String toString() {
            return "PushDescription(msg=" + this.f97819iobyxmoadg + ")";
        }
    }

    public static final class yggfygwlhe implements agtfadlqog {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f97820zoijcleaow = x81.wflxmlrfwp.f121527wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final x81.wflxmlrfwp f97821iobyxmoadg;

        public yggfygwlhe(x81.wflxmlrfwp params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f97821iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f97821iobyxmoadg, ((yggfygwlhe) obj).f97821iobyxmoadg);
        }

        public int hashCode() {
            return this.f97821iobyxmoadg.hashCode();
        }

        public final x81.wflxmlrfwp iobyxmoadg() {
            return this.f97821iobyxmoadg;
        }

        public String toString() {
            return "ShowQuizDialog(params=" + this.f97821iobyxmoadg + ")";
        }
    }

    public static final class zdlpuopuiu implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f97822iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return 507863584;
        }

        public String toString() {
            return "ShowQrCode";
        }
    }

    public static final class zoijcleaow implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f97823iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -759629702;
        }

        public String toString() {
            return "HideConnectionSnackbar";
        }
    }
}
