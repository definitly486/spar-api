package ru.myspar.cart.impl.domain.store;

import p0.tzroggbefp;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class agtfadlqog implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f84950iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation f84951ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f84952zoijcleaow;

        public agtfadlqog(HintUiModel hint, AnalyticElement.ProductItemElement analyticElement, AnalyticsLocation analyticsLocation) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f84950iobyxmoadg = hint;
            this.f84952zoijcleaow = analyticElement;
            this.f84951ppxfxbqfkf = analyticsLocation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84950iobyxmoadg, agtfadlqogVar.f84950iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84952zoijcleaow, agtfadlqogVar.f84952zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84951ppxfxbqfkf, agtfadlqogVar.f84951ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f84950iobyxmoadg.hashCode() * 31) + this.f84952zoijcleaow.hashCode()) * 31;
            AnalyticsLocation analyticsLocation = this.f84951ppxfxbqfkf;
            return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
        }

        public final AnalyticElement.ProductItemElement iobyxmoadg() {
            return this.f84952zoijcleaow;
        }

        public final HintUiModel ppxfxbqfkf() {
            return this.f84950iobyxmoadg;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f84950iobyxmoadg + ", analyticElement=" + this.f84952zoijcleaow + ", analyticsLocation=" + this.f84951ppxfxbqfkf + ")";
        }

        public final AnalyticsLocation zoijcleaow() {
            return this.f84951ppxfxbqfkf;
        }
    }

    public static final class btonecajqb implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final btonecajqb f84953iobyxmoadg = new btonecajqb();

        private btonecajqb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof btonecajqb);
        }

        public int hashCode() {
            return 894926800;
        }

        public String toString() {
            return "OnClearCartClicked";
        }
    }

    public static final class cqumvgiudr implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final cqumvgiudr f84954iobyxmoadg = new cqumvgiudr();

        private cqumvgiudr() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof cqumvgiudr);
        }

        public int hashCode() {
            return 1679698967;
        }

        public String toString() {
            return "OnSendOrderClicked";
        }
    }

    public static final class draadjrbmk implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f84955iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return 1228539685;
        }

        public String toString() {
            return "OnCloseInLoginClicked";
        }
    }

    public static final class dxjokdxxww implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f84956iobyxmoadg;

        public dxjokdxxww(tzroggbefp change) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(change, "change");
            this.f84956iobyxmoadg = change;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84956iobyxmoadg, ((dxjokdxxww) obj).f84956iobyxmoadg);
        }

        public int hashCode() {
            return this.f84956iobyxmoadg.hashCode();
        }

        public String toString() {
            return "OnChangeChanged(change=" + this.f84956iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ru.myspar.cart.impl.domain.store.iobyxmoadg.ppxfxbqfkf f84957iobyxmoadg;

        public eablkybsjg(ru.myspar.cart.impl.domain.store.iobyxmoadg.ppxfxbqfkf params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f84957iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84957iobyxmoadg, ((eablkybsjg) obj).f84957iobyxmoadg);
        }

        public int hashCode() {
            return this.f84957iobyxmoadg.hashCode();
        }

        public final ru.myspar.cart.impl.domain.store.iobyxmoadg.ppxfxbqfkf iobyxmoadg() {
            return this.f84957iobyxmoadg;
        }

        public String toString() {
            return "OnCartProductChanged(params=" + this.f84957iobyxmoadg + ")";
        }
    }

    public static final class esjtqupxsv implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final esjtqupxsv f84958iobyxmoadg = new esjtqupxsv();

        private esjtqupxsv() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof esjtqupxsv);
        }

        public int hashCode() {
            return 1689020813;
        }

        public String toString() {
            return "OnShipmentEditClicked";
        }
    }

    public static final class gtknphoqwx implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final kq.agtfadlqog f84959iobyxmoadg;

        public gtknphoqwx(kq.agtfadlqog info) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(info, "info");
            this.f84959iobyxmoadg = info;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84959iobyxmoadg, ((gtknphoqwx) obj).f84959iobyxmoadg);
        }

        public int hashCode() {
            return this.f84959iobyxmoadg.hashCode();
        }

        public final kq.agtfadlqog iobyxmoadg() {
            return this.f84959iobyxmoadg;
        }

        public String toString() {
            return "OnClickedLoadInfo(info=" + this.f84959iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f84960iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 917204837;
        }

        public String toString() {
            return "OnCatalogClick";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f84961iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1383112247;
        }

        public String toString() {
            return "CloseDialog";
        }
    }

    public static final class istkbnxepw implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final istkbnxepw f84962iobyxmoadg = new istkbnxepw();

        private istkbnxepw() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof istkbnxepw);
        }

        public int hashCode() {
            return 10364359;
        }

        public String toString() {
            return "ShowDeliveryTermsDialog";
        }
    }

    public static final class iwizpuwonk implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iwizpuwonk f84963iobyxmoadg = new iwizpuwonk();

        private iwizpuwonk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iwizpuwonk);
        }

        public int hashCode() {
            return -1018113809;
        }

        public String toString() {
            return "OnRegisterClick";
        }
    }

    public static final class jyumaefscl implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ru.myspar.cart.impl.domain.store.iobyxmoadg.ppxfxbqfkf f84964iobyxmoadg;

        public jyumaefscl(ru.myspar.cart.impl.domain.store.iobyxmoadg.ppxfxbqfkf params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f84964iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof jyumaefscl) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84964iobyxmoadg, ((jyumaefscl) obj).f84964iobyxmoadg);
        }

        public int hashCode() {
            return this.f84964iobyxmoadg.hashCode();
        }

        public final ru.myspar.cart.impl.domain.store.iobyxmoadg.ppxfxbqfkf iobyxmoadg() {
            return this.f84964iobyxmoadg;
        }

        public String toString() {
            return "OnRecommendationProductChanged(params=" + this.f84964iobyxmoadg + ")";
        }
    }

    public static final class kcexrzcfyt implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84965iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AnalyticsLocation.ItemFeed f84966ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f84967zoijcleaow;

        public kcexrzcfyt(String productId, AnalyticElement.ProductItemElement analyticElement, AnalyticsLocation.ItemFeed itemFeed) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
            this.f84965iobyxmoadg = productId;
            this.f84967zoijcleaow = analyticElement;
            this.f84966ppxfxbqfkf = itemFeed;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kcexrzcfyt)) {
                return false;
            }
            kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84965iobyxmoadg, kcexrzcfytVar.f84965iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84967zoijcleaow, kcexrzcfytVar.f84967zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84966ppxfxbqfkf, kcexrzcfytVar.f84966ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f84965iobyxmoadg.hashCode() * 31) + this.f84967zoijcleaow.hashCode()) * 31;
            AnalyticsLocation.ItemFeed itemFeed = this.f84966ppxfxbqfkf;
            return iHashCode + (itemFeed == null ? 0 : itemFeed.hashCode());
        }

        public final AnalyticElement.ProductItemElement iobyxmoadg() {
            return this.f84967zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f84965iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(productId=" + this.f84965iobyxmoadg + ", analyticElement=" + this.f84967zoijcleaow + ", analyticsLocation=" + this.f84966ppxfxbqfkf + ")";
        }

        public final AnalyticsLocation.ItemFeed zoijcleaow() {
            return this.f84966ppxfxbqfkf;
        }
    }

    public static final class lereixgezr implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f84968iobyxmoadg;

        public lereixgezr(boolean z13) {
            this.f84968iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lereixgezr) && this.f84968iobyxmoadg == ((lereixgezr) obj).f84968iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f84968iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f84968iobyxmoadg;
        }

        public String toString() {
            return "OnStartStateChanged(isStart=" + this.f84968iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f84969iobyxmoadg;

        public lqeggnwhkg(boolean z13) {
            this.f84969iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f84969iobyxmoadg == ((lqeggnwhkg) obj).f84969iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f84969iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f84969iobyxmoadg;
        }

        public String toString() {
            return "OnChangeBonusesEditorEnabled(value=" + this.f84969iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f84970iobyxmoadg;

        public nufgyqmvbu(tzroggbefp value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            this.f84970iobyxmoadg = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84970iobyxmoadg, ((nufgyqmvbu) obj).f84970iobyxmoadg);
        }

        public int hashCode() {
            return this.f84970iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f84970iobyxmoadg;
        }

        public String toString() {
            return "OnChangeBonusesEditorValue(value=" + this.f84970iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f84971iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return 608624002;
        }

        public String toString() {
            return "OnIntervalEditClicked";
        }
    }

    public static final class oxmwwwfdhm implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final oxmwwwfdhm f84972iobyxmoadg = new oxmwwwfdhm();

        private oxmwwwfdhm() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof oxmwwwfdhm);
        }

        public int hashCode() {
            return 2000153216;
        }

        public String toString() {
            return "OnOrderReceiverClicked";
        }
    }

    public static final class pmvmpeiblj implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final pmvmpeiblj f84973iobyxmoadg = new pmvmpeiblj();

        private pmvmpeiblj() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof pmvmpeiblj);
        }

        public int hashCode() {
            return 329393092;
        }

        public String toString() {
            return "Refresh";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f84974iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 886327792;
        }

        public String toString() {
            return "OnApplyPromoClicked";
        }
    }

    public static final class rgvfuqvkyq implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f84975iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return 1330124693;
        }

        public String toString() {
            return "OnLoginClick";
        }
    }

    public static final class vdvldrhtss implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final vdvldrhtss f84976iobyxmoadg = new vdvldrhtss();

        private vdvldrhtss() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof vdvldrhtss);
        }

        public int hashCode() {
            return -1229498661;
        }

        public String toString() {
            return "OnOrderCommentsClicked";
        }
    }

    public static final class wflxmlrfwp implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f84977iobyxmoadg;

        public wflxmlrfwp(boolean z13) {
            this.f84977iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && this.f84977iobyxmoadg == ((wflxmlrfwp) obj).f84977iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f84977iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f84977iobyxmoadg;
        }

        public String toString() {
            return "OnHiddenStateChanged(isHidden=" + this.f84977iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1933wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1933wkgbmnqykc f84978iobyxmoadg = new C1933wkgbmnqykc();

        private C1933wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1933wkgbmnqykc);
        }

        public int hashCode() {
            return 162265643;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class yggfygwlhe implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f84979iobyxmoadg;

        public yggfygwlhe(tzroggbefp promoCode) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            this.f84979iobyxmoadg = promoCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84979iobyxmoadg, ((yggfygwlhe) obj).f84979iobyxmoadg);
        }

        public int hashCode() {
            return this.f84979iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f84979iobyxmoadg;
        }

        public String toString() {
            return "OnPromoCodeChanged(promoCode=" + this.f84979iobyxmoadg + ")";
        }
    }

    public static final class zdlpuopuiu implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84980iobyxmoadg;

        public zdlpuopuiu(String productId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productId, "productId");
            this.f84980iobyxmoadg = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f84980iobyxmoadg, ((zdlpuopuiu) obj).f84980iobyxmoadg);
        }

        public int hashCode() {
            return this.f84980iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84980iobyxmoadg;
        }

        public String toString() {
            return "OnProductRemoved(productId=" + this.f84980iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f84981iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1766263356;
        }

        public String toString() {
            return "OnApplyBonusesValue";
        }
    }

    public static final class zynmafqrjb implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zynmafqrjb f84982iobyxmoadg = new zynmafqrjb();

        private zynmafqrjb() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zynmafqrjb);
        }

        public int hashCode() {
            return -762390297;
        }

        public String toString() {
            return "ShowCartDeleteDialog";
        }
    }
}
