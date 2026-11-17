package ru.myspar.main_activity.impl;

import kotlin.jvm.internal.zdlpuopuiu;
import o72.Splash;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.core.domain.models.payload.MySparScreenPayload;
import ru.myspar.core.domain.models.reviewWithBonuses.ReviewWithBonuses;

/* JADX INFO: loaded from: classes4.dex */
public interface btonecajqb {

    public static final class agtfadlqog implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final agtfadlqog f90211iobyxmoadg = new agtfadlqog();

        private agtfadlqog() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof agtfadlqog);
        }

        public int hashCode() {
            return -1126668523;
        }

        public String toString() {
            return "OpenScanGoFlow";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.main_activity.impl.btonecajqb$btonecajqb, reason: collision with other inner class name */
    public static final class C2069btonecajqb implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final MySparScreenPayload f90212iobyxmoadg;

        public C2069btonecajqb(MySparScreenPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f90212iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2069btonecajqb) && zdlpuopuiu.eablkybsjg(this.f90212iobyxmoadg, ((C2069btonecajqb) obj).f90212iobyxmoadg);
        }

        public int hashCode() {
            return this.f90212iobyxmoadg.hashCode();
        }

        public final MySparScreenPayload iobyxmoadg() {
            return this.f90212iobyxmoadg;
        }

        public String toString() {
            return "OnRateArrowClicked(payload=" + this.f90212iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ReviewWithBonuses f90213iobyxmoadg;

        public draadjrbmk(ReviewWithBonuses bonuses) {
            zdlpuopuiu.btonecajqb(bonuses, "bonuses");
            this.f90213iobyxmoadg = bonuses;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f90213iobyxmoadg, ((draadjrbmk) obj).f90213iobyxmoadg);
        }

        public int hashCode() {
            return this.f90213iobyxmoadg.hashCode();
        }

        public final ReviewWithBonuses iobyxmoadg() {
            return this.f90213iobyxmoadg;
        }

        public String toString() {
            return "OnReviewWithBonusesDialogShowed(bonuses=" + this.f90213iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final f40.zoijcleaow f90214iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final eg0.zoijcleaow f90215zoijcleaow;

        public dxjokdxxww(f40.zoijcleaow link, eg0.zoijcleaow popup) {
            zdlpuopuiu.btonecajqb(link, "link");
            zdlpuopuiu.btonecajqb(popup, "popup");
            this.f90214iobyxmoadg = link;
            this.f90215zoijcleaow = popup;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return this.f90214iobyxmoadg == dxjokdxxwwVar.f90214iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f90215zoijcleaow, dxjokdxxwwVar.f90215zoijcleaow);
        }

        public int hashCode() {
            return (this.f90214iobyxmoadg.hashCode() * 31) + this.f90215zoijcleaow.hashCode();
        }

        public final f40.zoijcleaow iobyxmoadg() {
            return this.f90214iobyxmoadg;
        }

        public String toString() {
            return "OnPopupClicked(link=" + this.f90214iobyxmoadg + ", popup=" + this.f90215zoijcleaow + ")";
        }

        public final eg0.zoijcleaow zoijcleaow() {
            return this.f90215zoijcleaow;
        }
    }

    public static final class eablkybsjg implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f90216iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 1155998455;
        }

        public String toString() {
            return "OnCancelAppClicked";
        }
    }

    public static final class gtknphoqwx implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gtknphoqwx f90217iobyxmoadg = new gtknphoqwx();

        private gtknphoqwx() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gtknphoqwx);
        }

        public int hashCode() {
            return 1821555454;
        }

        public String toString() {
            return "OnRestartAppClicked";
        }
    }

    public static final class gxszxtbevo implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ComboSetProduct f90218iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f90219zoijcleaow;

        public gxszxtbevo(ComboSetProduct productFirst, ComboSetProduct productSecond) {
            zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f90218iobyxmoadg = productFirst;
            this.f90219zoijcleaow = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f90218iobyxmoadg, gxszxtbevoVar.f90218iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f90219zoijcleaow, gxszxtbevoVar.f90219zoijcleaow);
        }

        public int hashCode() {
            return (this.f90218iobyxmoadg.hashCode() * 31) + this.f90219zoijcleaow.hashCode();
        }

        public final ComboSetProduct iobyxmoadg() {
            return this.f90218iobyxmoadg;
        }

        public String toString() {
            return "OnClickedAddComboToCart(productFirst=" + this.f90218iobyxmoadg + ", productSecond=" + this.f90219zoijcleaow + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f90219zoijcleaow;
        }
    }

    public static final class iobyxmoadg implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Splash f90220iobyxmoadg;

        public iobyxmoadg(Splash splash) {
            this.f90220iobyxmoadg = splash;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f90220iobyxmoadg, ((iobyxmoadg) obj).f90220iobyxmoadg);
        }

        public int hashCode() {
            Splash splash = this.f90220iobyxmoadg;
            if (splash == null) {
                return 0;
            }
            return splash.hashCode();
        }

        public final Splash iobyxmoadg() {
            return this.f90220iobyxmoadg;
        }

        public String toString() {
            return "CustomSplashScreenAnimationShowed(splash=" + this.f90220iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f90221iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -1179907150;
        }

        public String toString() {
            return "OnNavigateToCartTab";
        }
    }

    public static final class nufgyqmvbu implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final at.ppxfxbqfkf f90222iobyxmoadg;

        public nufgyqmvbu(at.ppxfxbqfkf result) {
            zdlpuopuiu.btonecajqb(result, "result");
            this.f90222iobyxmoadg = result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f90222iobyxmoadg, ((nufgyqmvbu) obj).f90222iobyxmoadg);
        }

        public int hashCode() {
            return this.f90222iobyxmoadg.hashCode();
        }

        public final at.ppxfxbqfkf iobyxmoadg() {
            return this.f90222iobyxmoadg;
        }

        public String toString() {
            return "OnPermissionRequestResult(result=" + this.f90222iobyxmoadg + ")";
        }
    }

    public static final class ojitshcjhn implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final f40.zoijcleaow f90223iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f90224zoijcleaow;

        public ojitshcjhn(f40.zoijcleaow navLink, String str) {
            zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f90223iobyxmoadg = navLink;
            this.f90224zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ojitshcjhn)) {
                return false;
            }
            ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
            return this.f90223iobyxmoadg == ojitshcjhnVar.f90223iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f90224zoijcleaow, ojitshcjhnVar.f90224zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f90223iobyxmoadg.hashCode() * 31;
            String str = this.f90224zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final f40.zoijcleaow iobyxmoadg() {
            return this.f90223iobyxmoadg;
        }

        public String toString() {
            return "SendNavLinkWithReference(navLink=" + this.f90223iobyxmoadg + ", reference=" + this.f90224zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f90224zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final eg0.zoijcleaow f90225iobyxmoadg;

        public ppxfxbqfkf(eg0.zoijcleaow popup) {
            zdlpuopuiu.btonecajqb(popup, "popup");
            this.f90225iobyxmoadg = popup;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f90225iobyxmoadg, ((ppxfxbqfkf) obj).f90225iobyxmoadg);
        }

        public int hashCode() {
            return this.f90225iobyxmoadg.hashCode();
        }

        public final eg0.zoijcleaow iobyxmoadg() {
            return this.f90225iobyxmoadg;
        }

        public String toString() {
            return "OnAdultWarningDialogConfirmed(popup=" + this.f90225iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wflxmlrfwp f90226iobyxmoadg = new wflxmlrfwp();

        private wflxmlrfwp() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wflxmlrfwp);
        }

        public int hashCode() {
            return 1526426616;
        }

        public String toString() {
            return "OpenNetworkPanel";
        }
    }

    public static final class wkgbmnqykc implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f90227iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            this.f90227iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f90227iobyxmoadg == ((wkgbmnqykc) obj).f90227iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f90227iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f90227iobyxmoadg;
        }

        public String toString() {
            return "OnAppReviewRateSuccess(isPositiveRate=" + this.f90227iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f90228iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 963750899;
        }

        public String toString() {
            return "OnActivityResume";
        }
    }
}
