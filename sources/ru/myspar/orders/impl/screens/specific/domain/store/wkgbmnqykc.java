package ru.myspar.orders.impl.screens.specific.domain.store;

import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {

    public static final class agtfadlqog extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f91276iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return 730140462;
        }

        public String toString() {
            return "OnInMarketClicked";
        }
    }

    public static final class btonecajqb extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91277iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(String article) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(article, "article");
            this.f91277iobyxmoadg = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91277iobyxmoadg, ((btonecajqb) obj).f91277iobyxmoadg);
        }

        public int hashCode() {
            return this.f91277iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91277iobyxmoadg;
        }

        public String toString() {
            return "OnDeleteBtnClicked(article=" + this.f91277iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91278iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f91279zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public cqumvgiudr(String productArticle, String replaceArticle) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(replaceArticle, "replaceArticle");
            this.f91278iobyxmoadg = productArticle;
            this.f91279zoijcleaow = replaceArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof cqumvgiudr)) {
                return false;
            }
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91278iobyxmoadg, cqumvgiudrVar.f91278iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91279zoijcleaow, cqumvgiudrVar.f91279zoijcleaow);
        }

        public int hashCode() {
            return (this.f91278iobyxmoadg.hashCode() * 31) + this.f91279zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91278iobyxmoadg;
        }

        public String toString() {
            return "OnReplaceClicked(productArticle=" + this.f91278iobyxmoadg + ", replaceArticle=" + this.f91279zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f91279zoijcleaow;
        }
    }

    public static final class draadjrbmk extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f91280iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return -1546559205;
        }

        public String toString() {
            return "OnEditOrderClicked";
        }
    }

    public static final class dxjokdxxww extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f91281iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -1880957376;
        }

        public String toString() {
            return "OnDeleteAllReplacementsDialogClicked";
        }
    }

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f91282iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 1871010284;
        }

        public String toString() {
            return "OnCancelOrderClick";
        }
    }

    public static final class esjtqupxsv extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final esjtqupxsv f91283iobyxmoadg = new esjtqupxsv();

        private esjtqupxsv() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof esjtqupxsv);
        }

        public int hashCode() {
            return -835565332;
        }

        public String toString() {
            return "OnWebViewPaymentSuccessfully";
        }
    }

    public static final class gtknphoqwx extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final h10.iobyxmoadg f91284iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(h10.iobyxmoadg paymentResult) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentResult, "paymentResult");
            this.f91284iobyxmoadg = paymentResult;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91284iobyxmoadg, ((gtknphoqwx) obj).f91284iobyxmoadg);
        }

        public int hashCode() {
            return this.f91284iobyxmoadg.hashCode();
        }

        public final h10.iobyxmoadg iobyxmoadg() {
            return this.f91284iobyxmoadg;
        }

        public String toString() {
            return "OnEcomSdkPaymentResult(paymentResult=" + this.f91284iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f91285iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 1167127256;
        }

        public String toString() {
            return "OnChoosePickupPlaceCar";
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91286iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String phone) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
            this.f91286iobyxmoadg = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91286iobyxmoadg, ((iobyxmoadg) obj).f91286iobyxmoadg);
        }

        public int hashCode() {
            return this.f91286iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91286iobyxmoadg;
        }

        public String toString() {
            return "Call(phone=" + this.f91286iobyxmoadg + ")";
        }
    }

    public static final class iwizpuwonk extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iwizpuwonk f91287iobyxmoadg = new iwizpuwonk();

        private iwizpuwonk() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iwizpuwonk);
        }

        public int hashCode() {
            return 933209037;
        }

        public String toString() {
            return "OnRepeatOrderClick";
        }
    }

    public static final class jyumaefscl extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final jyumaefscl f91288iobyxmoadg = new jyumaefscl();

        private jyumaefscl() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof jyumaefscl);
        }

        public int hashCode() {
            return 1746086627;
        }

        public String toString() {
            return "OnRefresh";
        }
    }

    public static final class kcexrzcfyt extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f91289iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof kcexrzcfyt);
        }

        public int hashCode() {
            return -1791210735;
        }

        public String toString() {
            return "OnPaymentMethodSelectedSuccessfully";
        }
    }

    public static final class lereixgezr extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lereixgezr f91290iobyxmoadg = new lereixgezr();

        private lereixgezr() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lereixgezr);
        }

        public int hashCode() {
            return 125583945;
        }

        public String toString() {
            return "OnWhereIsMyOrder";
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f91291iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 145153853;
        }

        public String toString() {
            return "OnCopyOrderNumberClicked";
        }
    }

    public static final class nufgyqmvbu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f91292iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -1784833770;
        }

        public String toString() {
            return "OnDeleteAllReplacementsButtonClicked";
        }
    }

    public static final class ojitshcjhn extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f91293iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return -1892283939;
        }

        public String toString() {
            return "OnInPlaceClicked";
        }
    }

    public static final class oxmwwwfdhm extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final oxmwwwfdhm f91294iobyxmoadg = new oxmwwwfdhm();

        private oxmwwwfdhm() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof oxmwwwfdhm);
        }

        public int hashCode() {
            return 349157048;
        }

        public String toString() {
            return "OnPayClick";
        }
    }

    public static final class pmvmpeiblj extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final pmvmpeiblj f91295iobyxmoadg = new pmvmpeiblj();

        private pmvmpeiblj() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof pmvmpeiblj);
        }

        public int hashCode() {
            return 144582538;
        }

        public String toString() {
            return "TipsOrderClicked";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f91296iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1120045752;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class rgvfuqvkyq extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f91297iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return 1819668988;
        }

        public String toString() {
            return "OnMyWayClicked";
        }
    }

    public static final class vdvldrhtss extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91298iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f91299zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public vdvldrhtss(String article, AnalyticElement.ProductItemElement productItemElement) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(article, "article");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productItemElement, "productItemElement");
            this.f91298iobyxmoadg = article;
            this.f91299zoijcleaow = productItemElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91298iobyxmoadg, vdvldrhtssVar.f91298iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91299zoijcleaow, vdvldrhtssVar.f91299zoijcleaow);
        }

        public int hashCode() {
            return (this.f91298iobyxmoadg.hashCode() * 31) + this.f91299zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91298iobyxmoadg;
        }

        public String toString() {
            return "OnOrderProductClickedByArticle(article=" + this.f91298iobyxmoadg + ", productItemElement=" + this.f91299zoijcleaow + ")";
        }

        public final AnalyticElement.ProductItemElement zoijcleaow() {
            return this.f91299zoijcleaow;
        }
    }

    public static final class wflxmlrfwp extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f91300iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f91301zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(HintUiModel hint, AnalyticElement.ProductItemElement analyticElement) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f91300iobyxmoadg = hint;
            this.f91301zoijcleaow = analyticElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91300iobyxmoadg, wflxmlrfwpVar.f91300iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f91301zoijcleaow, wflxmlrfwpVar.f91301zoijcleaow);
        }

        public int hashCode() {
            return (this.f91300iobyxmoadg.hashCode() * 31) + this.f91301zoijcleaow.hashCode();
        }

        public final AnalyticElement.ProductItemElement iobyxmoadg() {
            return this.f91301zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f91300iobyxmoadg + ", analyticElement=" + this.f91301zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f91300iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.domain.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2117wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2117wkgbmnqykc f91302iobyxmoadg = new C2117wkgbmnqykc();

        private C2117wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2117wkgbmnqykc);
        }

        public int hashCode() {
            return -1850549294;
        }

        public String toString() {
            return "OnCallClick";
        }
    }

    public static final class yggfygwlhe extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f91303iobyxmoadg;

        public yggfygwlhe(boolean z13) {
            super(null);
            this.f91303iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof yggfygwlhe) && this.f91303iobyxmoadg == ((yggfygwlhe) obj).f91303iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f91303iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f91303iobyxmoadg;
        }

        public String toString() {
            return "OnRateSuccess(isPositiveRate=" + this.f91303iobyxmoadg + ")";
        }
    }

    public static final class zdlpuopuiu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f91304iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return -981356815;
        }

        public String toString() {
            return "OnRateOrderClicked";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f91305iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1020857944;
        }

        public String toString() {
            return "ConfirmReplacements";
        }
    }

    public /* synthetic */ wkgbmnqykc(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
