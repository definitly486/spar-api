package ru.myspar.proloyalty.main_activity.impl;

import it1.Splash;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.core.domain.models.payload.MySparScreenPayload;
import ru.myspar.proloyalty.core.domain.models.reviewWithBonuses.ReviewWithBonuses;
import ru.myspar.proloyalty.core.ui.model.MainTab;

/* JADX INFO: loaded from: classes5.dex */
public interface wflxmlrfwp {

    public static final class agtfadlqog implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final MainTab f98040iobyxmoadg;

        public agtfadlqog(MainTab tab) {
            zdlpuopuiu.btonecajqb(tab, "tab");
            this.f98040iobyxmoadg = tab;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof agtfadlqog) && this.f98040iobyxmoadg == ((agtfadlqog) obj).f98040iobyxmoadg;
        }

        public int hashCode() {
            return this.f98040iobyxmoadg.hashCode();
        }

        public final MainTab iobyxmoadg() {
            return this.f98040iobyxmoadg;
        }

        public String toString() {
            return "OnSelectTab(tab=" + this.f98040iobyxmoadg + ")";
        }
    }

    public static final class btonecajqb implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final k21.ojitshcjhn f98041iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final jd1.ppxfxbqfkf f98042zoijcleaow;

        public btonecajqb(k21.ojitshcjhn link, jd1.ppxfxbqfkf popup) {
            zdlpuopuiu.btonecajqb(link, "link");
            zdlpuopuiu.btonecajqb(popup, "popup");
            this.f98041iobyxmoadg = link;
            this.f98042zoijcleaow = popup;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return this.f98041iobyxmoadg == btonecajqbVar.f98041iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f98042zoijcleaow, btonecajqbVar.f98042zoijcleaow);
        }

        public int hashCode() {
            return (this.f98041iobyxmoadg.hashCode() * 31) + this.f98042zoijcleaow.hashCode();
        }

        public final k21.ojitshcjhn iobyxmoadg() {
            return this.f98041iobyxmoadg;
        }

        public String toString() {
            return "OnPopupClicked(link=" + this.f98041iobyxmoadg + ", popup=" + this.f98042zoijcleaow + ")";
        }

        public final jd1.ppxfxbqfkf zoijcleaow() {
            return this.f98042zoijcleaow;
        }
    }

    public static final class draadjrbmk implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f98043iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return 1290137531;
        }

        public String toString() {
            return "OnRestartAppClicked";
        }
    }

    public static final class dxjokdxxww implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ur0.ppxfxbqfkf f98044iobyxmoadg;

        public dxjokdxxww(ur0.ppxfxbqfkf result) {
            zdlpuopuiu.btonecajqb(result, "result");
            this.f98044iobyxmoadg = result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f98044iobyxmoadg, ((dxjokdxxww) obj).f98044iobyxmoadg);
        }

        public int hashCode() {
            return this.f98044iobyxmoadg.hashCode();
        }

        public final ur0.ppxfxbqfkf iobyxmoadg() {
            return this.f98044iobyxmoadg;
        }

        public String toString() {
            return "OnPermissionRequestResult(result=" + this.f98044iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f98045iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -233310122;
        }

        public String toString() {
            return "OnActivityResume";
        }
    }

    public static final class gtknphoqwx implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final MySparScreenPayload f98046iobyxmoadg;

        public gtknphoqwx(MySparScreenPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f98046iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f98046iobyxmoadg, ((gtknphoqwx) obj).f98046iobyxmoadg);
        }

        public int hashCode() {
            return this.f98046iobyxmoadg.hashCode();
        }

        public final MySparScreenPayload iobyxmoadg() {
            return this.f98046iobyxmoadg;
        }

        public String toString() {
            return "OnRateArrowClicked(payload=" + this.f98046iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final jd1.ppxfxbqfkf f98047iobyxmoadg;

        public gxszxtbevo(jd1.ppxfxbqfkf popup) {
            zdlpuopuiu.btonecajqb(popup, "popup");
            this.f98047iobyxmoadg = popup;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f98047iobyxmoadg, ((gxszxtbevo) obj).f98047iobyxmoadg);
        }

        public int hashCode() {
            return this.f98047iobyxmoadg.hashCode();
        }

        public final jd1.ppxfxbqfkf iobyxmoadg() {
            return this.f98047iobyxmoadg;
        }

        public String toString() {
            return "OnAdultWarningDialogConfirmed(popup=" + this.f98047iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f98048iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -341895710;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class lqeggnwhkg implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f98049iobyxmoadg;

        public lqeggnwhkg(boolean z13) {
            this.f98049iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f98049iobyxmoadg == ((lqeggnwhkg) obj).f98049iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f98049iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f98049iobyxmoadg;
        }

        public String toString() {
            return "OnAppReviewRateSuccess(isPositiveRate=" + this.f98049iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f98050iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f98051zoijcleaow;

        public nufgyqmvbu(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f98050iobyxmoadg = productFirst;
            this.f98051zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof nufgyqmvbu)) {
                return false;
            }
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            return zdlpuopuiu.eablkybsjg(this.f98050iobyxmoadg, nufgyqmvbuVar.f98050iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f98051zoijcleaow, nufgyqmvbuVar.f98051zoijcleaow);
        }

        public int hashCode() {
            return (this.f98050iobyxmoadg.hashCode() * 31) + this.f98051zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f98050iobyxmoadg;
        }

        public String toString() {
            return "OnClickedAddComboToCart(productFirst=" + this.f98050iobyxmoadg + ", productSecond=" + this.f98051zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f98051zoijcleaow;
        }
    }

    public static final class ojitshcjhn implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ojitshcjhn f98052iobyxmoadg = new ojitshcjhn();

        private ojitshcjhn() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ojitshcjhn);
        }

        public int hashCode() {
            return -1484951664;
        }

        public String toString() {
            return "OnVpnScreenPause";
        }
    }

    public static final class oxmwwwfdhm implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final k21.ojitshcjhn f98053iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f98054zoijcleaow;

        public oxmwwwfdhm(k21.ojitshcjhn navLink, String str) {
            zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f98053iobyxmoadg = navLink;
            this.f98054zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof oxmwwwfdhm)) {
                return false;
            }
            oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
            return this.f98053iobyxmoadg == oxmwwwfdhmVar.f98053iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f98054zoijcleaow, oxmwwwfdhmVar.f98054zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f98053iobyxmoadg.hashCode() * 31;
            String str = this.f98054zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final k21.ojitshcjhn iobyxmoadg() {
            return this.f98053iobyxmoadg;
        }

        public String toString() {
            return "SendNavLinkWithReference(navLink=" + this.f98053iobyxmoadg + ", reference=" + this.f98054zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f98054zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f98055iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 311720069;
        }

        public String toString() {
            return "CheckVpnConnection";
        }
    }

    public static final class rgvfuqvkyq implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final rgvfuqvkyq f98056iobyxmoadg = new rgvfuqvkyq();

        private rgvfuqvkyq() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof rgvfuqvkyq);
        }

        public int hashCode() {
            return 1272033747;
        }

        public String toString() {
            return "OnVpnScreenResume";
        }
    }

    public static final class vdvldrhtss implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final vdvldrhtss f98057iobyxmoadg = new vdvldrhtss();

        private vdvldrhtss() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof vdvldrhtss);
        }

        public int hashCode() {
            return -967020488;
        }

        public String toString() {
            return "OpenScanGoFlow";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.wflxmlrfwp$wflxmlrfwp, reason: collision with other inner class name */
    public static final class C2323wflxmlrfwp implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ReviewWithBonuses f98058iobyxmoadg;

        public C2323wflxmlrfwp(ReviewWithBonuses bonuses) {
            zdlpuopuiu.btonecajqb(bonuses, "bonuses");
            this.f98058iobyxmoadg = bonuses;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2323wflxmlrfwp) && zdlpuopuiu.eablkybsjg(this.f98058iobyxmoadg, ((C2323wflxmlrfwp) obj).f98058iobyxmoadg);
        }

        public int hashCode() {
            return this.f98058iobyxmoadg.hashCode();
        }

        public final ReviewWithBonuses iobyxmoadg() {
            return this.f98058iobyxmoadg;
        }

        public String toString() {
            return "OnReviewWithBonusesDialogShowed(bonuses=" + this.f98058iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Splash f98059iobyxmoadg;

        public wkgbmnqykc(Splash splash) {
            this.f98059iobyxmoadg = splash;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f98059iobyxmoadg, ((wkgbmnqykc) obj).f98059iobyxmoadg);
        }

        public int hashCode() {
            Splash splash = this.f98059iobyxmoadg;
            if (splash == null) {
                return 0;
            }
            return splash.hashCode();
        }

        public final Splash iobyxmoadg() {
            return this.f98059iobyxmoadg;
        }

        public String toString() {
            return "CustomSplashScreenAnimationShowed(splash=" + this.f98059iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f98060iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 720839035;
        }

        public String toString() {
            return "CallToSupport";
        }
    }
}
