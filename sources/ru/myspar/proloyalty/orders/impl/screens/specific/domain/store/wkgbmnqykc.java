package ru.myspar.proloyalty.orders.impl.screens.specific.domain.store;

import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class agtfadlqog extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f98921iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return -1169289237;
        }

        public String toString() {
            return "OnInMarketClicked";
        }
    }

    public static final class btonecajqb extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98922iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(String article) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(article, "article");
            this.f98922iobyxmoadg = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98922iobyxmoadg, ((btonecajqb) obj).f98922iobyxmoadg);
        }

        public int hashCode() {
            return this.f98922iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98922iobyxmoadg;
        }

        public String toString() {
            return "OnDeleteBtnClicked(article=" + this.f98922iobyxmoadg + ")";
        }
    }

    public static final class cqumvgiudr extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98923iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f98924zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public cqumvgiudr(String productArticle, String replaceArticle) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(replaceArticle, "replaceArticle");
            this.f98923iobyxmoadg = productArticle;
            this.f98924zoijcleaow = replaceArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof cqumvgiudr)) {
                return false;
            }
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98923iobyxmoadg, cqumvgiudrVar.f98923iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98924zoijcleaow, cqumvgiudrVar.f98924zoijcleaow);
        }

        public int hashCode() {
            return (this.f98923iobyxmoadg.hashCode() * 31) + this.f98924zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98923iobyxmoadg;
        }

        public String toString() {
            return "OnReplaceClicked(productArticle=" + this.f98923iobyxmoadg + ", replaceArticle=" + this.f98924zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f98924zoijcleaow;
        }
    }

    public static final class draadjrbmk extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f98925iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return -299337730;
        }

        public String toString() {
            return "OnEditOrderClicked";
        }
    }

    public static final class dxjokdxxww extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f98926iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return -1795874205;
        }

        public String toString() {
            return "OnDeleteAllReplacementsDialogClicked";
        }
    }

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f98927iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -1176735537;
        }

        public String toString() {
            return "OnCancelOrderClick";
        }
    }

    public static final class esjtqupxsv extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final esjtqupxsv f98928iobyxmoadg = new esjtqupxsv();

        private esjtqupxsv() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof esjtqupxsv);
        }

        public int hashCode() {
            return 99639311;
        }

        public String toString() {
            return "OnWebViewPaymentSuccessfully";
        }
    }

    public static final class gtknphoqwx extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final xz0.iobyxmoadg f98929iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(xz0.iobyxmoadg paymentResult) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentResult, "paymentResult");
            this.f98929iobyxmoadg = paymentResult;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98929iobyxmoadg, ((gtknphoqwx) obj).f98929iobyxmoadg);
        }

        public int hashCode() {
            return this.f98929iobyxmoadg.hashCode();
        }

        public final xz0.iobyxmoadg iobyxmoadg() {
            return this.f98929iobyxmoadg;
        }

        public String toString() {
            return "OnEcomSdkPaymentResult(paymentResult=" + this.f98929iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f98930iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -823402437;
        }

        public String toString() {
            return "OnChoosePickupPlaceCar";
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98931iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String phone) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
            this.f98931iobyxmoadg = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98931iobyxmoadg, ((iobyxmoadg) obj).f98931iobyxmoadg);
        }

        public int hashCode() {
            return this.f98931iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98931iobyxmoadg;
        }

        public String toString() {
            return "Call(phone=" + this.f98931iobyxmoadg + ")";
        }
    }

    public static final class iwizpuwonk extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iwizpuwonk f98932iobyxmoadg = new iwizpuwonk();

        private iwizpuwonk() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iwizpuwonk);
        }

        public int hashCode() {
            return -2114536784;
        }

        public String toString() {
            return "OnRepeatOrderClick";
        }
    }

    public static final class jyumaefscl extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final jyumaefscl f98933iobyxmoadg = new jyumaefscl();

        private jyumaefscl() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof jyumaefscl);
        }

        public int hashCode() {
            return -1498204000;
        }

        public String toString() {
            return "OnRefresh";
        }
    }

    public static final class kcexrzcfyt extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final kcexrzcfyt f98934iobyxmoadg = new kcexrzcfyt();

        private kcexrzcfyt() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof kcexrzcfyt);
        }

        public int hashCode() {
            return 982480526;
        }

        public String toString() {
            return "OnPaymentMethodSelectedSuccessfully";
        }
    }

    public static final class lereixgezr extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lereixgezr f98935iobyxmoadg = new lereixgezr();

        private lereixgezr() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lereixgezr);
        }

        public int hashCode() {
            return 895596012;
        }

        public String toString() {
            return "OnWhereIsMyOrder";
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f98936iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -1493434400;
        }

        public String toString() {
            return "OnCopyOrderNumberClicked";
        }
    }

    public static final class nufgyqmvbu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f98937iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -1699750599;
        }

        public String toString() {
            return "OnDeleteAllReplacementsButtonClicked";
        }
    }

    public static final class ojitshcjhn extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f98938iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return -1122271872;
        }

        public String toString() {
            return "OnInPlaceClicked";
        }
    }

    public static final class oxmwwwfdhm extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final oxmwwwfdhm f98939iobyxmoadg = new oxmwwwfdhm();

        private oxmwwwfdhm() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof oxmwwwfdhm);
        }

        public int hashCode() {
            return -1439604581;
        }

        public String toString() {
            return "OnPayClick";
        }
    }

    public static final class pmvmpeiblj extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final pmvmpeiblj f98940iobyxmoadg = new pmvmpeiblj();

        private pmvmpeiblj() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof pmvmpeiblj);
        }

        public int hashCode() {
            return 914594605;
        }

        public String toString() {
            return "TipsOrderClicked";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f98941iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1836473477;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class rgvfuqvkyq extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f98942iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return -1017515425;
        }

        public String toString() {
            return "OnMyWayClicked";
        }
    }

    public static final class vdvldrhtss extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98943iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f98944zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public vdvldrhtss(String article, AnalyticElement.ProductItemElement productItemElement) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(article, "article");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productItemElement, "productItemElement");
            this.f98943iobyxmoadg = article;
            this.f98944zoijcleaow = productItemElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98943iobyxmoadg, vdvldrhtssVar.f98943iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98944zoijcleaow, vdvldrhtssVar.f98944zoijcleaow);
        }

        public int hashCode() {
            return (this.f98943iobyxmoadg.hashCode() * 31) + this.f98944zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98943iobyxmoadg;
        }

        public String toString() {
            return "OnOrderProductClickedByArticle(article=" + this.f98943iobyxmoadg + ", productItemElement=" + this.f98944zoijcleaow + ")";
        }

        public final AnalyticElement.ProductItemElement zoijcleaow() {
            return this.f98944zoijcleaow;
        }
    }

    public static final class wflxmlrfwp extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f98945iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f98946zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(HintUiModel hint, AnalyticElement.ProductItemElement analyticElement) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f98945iobyxmoadg = hint;
            this.f98946zoijcleaow = analyticElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98945iobyxmoadg, wflxmlrfwpVar.f98945iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f98946zoijcleaow, wflxmlrfwpVar.f98946zoijcleaow);
        }

        public int hashCode() {
            return (this.f98945iobyxmoadg.hashCode() * 31) + this.f98946zoijcleaow.hashCode();
        }

        public final AnalyticElement.ProductItemElement iobyxmoadg() {
            return this.f98946zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f98945iobyxmoadg + ", analyticElement=" + this.f98946zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f98945iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.orders.impl.screens.specific.domain.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2364wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2364wkgbmnqykc f98947iobyxmoadg = new C2364wkgbmnqykc();

        private C2364wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2364wkgbmnqykc);
        }

        public int hashCode() {
            return -1467584945;
        }

        public String toString() {
            return "OnCallClick";
        }
    }

    public static final class yggfygwlhe extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f98948iobyxmoadg;

        public yggfygwlhe(boolean z13) {
            super(null);
            this.f98948iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof yggfygwlhe) && this.f98948iobyxmoadg == ((yggfygwlhe) obj).f98948iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f98948iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f98948iobyxmoadg;
        }

        public String toString() {
            return "OnRateSuccess(isPositiveRate=" + this.f98948iobyxmoadg + ")";
        }
    }

    public static final class zdlpuopuiu extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zdlpuopuiu f98949iobyxmoadg = new zdlpuopuiu();

        private zdlpuopuiu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zdlpuopuiu);
        }

        public int hashCode() {
            return 265864660;
        }

        public String toString() {
            return "OnRateOrderClicked";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f98950iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1011697883;
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
