package oi0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class btonecajqb extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72885iobyxmoadg;

        public btonecajqb(boolean z13) {
            super(null);
            this.f72885iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && this.f72885iobyxmoadg == ((btonecajqb) obj).f72885iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72885iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72885iobyxmoadg;
        }

        public String toString() {
            return "SmsNotificationsCheckedChanged(isChecked=" + this.f72885iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72886iobyxmoadg;

        public dxjokdxxww(boolean z13) {
            super(null);
            this.f72886iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && this.f72886iobyxmoadg == ((dxjokdxxww) obj).f72886iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72886iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72886iobyxmoadg;
        }

        public String toString() {
            return "ShowQrCheckedChanged(isChecked=" + this.f72886iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72887iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f72887iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f72887iobyxmoadg == ((eablkybsjg) obj).f72887iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72887iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72887iobyxmoadg;
        }

        public String toString() {
            return "LoadingChanged(isLoading=" + this.f72887iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f72888iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f72889ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f72890wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f72891zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(List userSubscriptions, boolean z13, boolean z14, boolean z15) {
            super(null);
            zdlpuopuiu.btonecajqb(userSubscriptions, "userSubscriptions");
            this.f72888iobyxmoadg = userSubscriptions;
            this.f72891zoijcleaow = z13;
            this.f72889ppxfxbqfkf = z14;
            this.f72890wkgbmnqykc = z15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return zdlpuopuiu.eablkybsjg(this.f72888iobyxmoadg, gtknphoqwxVar.f72888iobyxmoadg) && this.f72891zoijcleaow == gtknphoqwxVar.f72891zoijcleaow && this.f72889ppxfxbqfkf == gtknphoqwxVar.f72889ppxfxbqfkf && this.f72890wkgbmnqykc == gtknphoqwxVar.f72890wkgbmnqykc;
        }

        public int hashCode() {
            return (((((this.f72888iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f72891zoijcleaow)) * 31) + Boolean.hashCode(this.f72889ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f72890wkgbmnqykc);
        }

        public final List iobyxmoadg() {
            return this.f72888iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f72890wkgbmnqykc;
        }

        public String toString() {
            return "UserInfoFetched(userSubscriptions=" + this.f72888iobyxmoadg + ", isEmailNotificationEnabled=" + this.f72891zoijcleaow + ", isSmsNotificationEnabled=" + this.f72889ppxfxbqfkf + ", isPushNotificationEnabled=" + this.f72890wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f72889ppxfxbqfkf;
        }

        public final boolean zoijcleaow() {
            return this.f72891zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: oi0.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1584gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f72892iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1584gxszxtbevo(List loadingSubscriptions) {
            super(null);
            zdlpuopuiu.btonecajqb(loadingSubscriptions, "loadingSubscriptions");
            this.f72892iobyxmoadg = loadingSubscriptions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1584gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f72892iobyxmoadg, ((C1584gxszxtbevo) obj).f72892iobyxmoadg);
        }

        public int hashCode() {
            return this.f72892iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f72892iobyxmoadg;
        }

        public String toString() {
            return "LoadingSubscriptionsChanged(loadingSubscriptions=" + this.f72892iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72893iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f72893iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f72893iobyxmoadg == ((iobyxmoadg) obj).f72893iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72893iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72893iobyxmoadg;
        }

        public String toString() {
            return "AutoBrightnessCheckedChanged(isChecked=" + this.f72893iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72894iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f72895zoijcleaow;

        public lqeggnwhkg(boolean z13, boolean z14) {
            super(null);
            this.f72894iobyxmoadg = z13;
            this.f72895zoijcleaow = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return this.f72894iobyxmoadg == lqeggnwhkgVar.f72894iobyxmoadg && this.f72895zoijcleaow == lqeggnwhkgVar.f72895zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f72894iobyxmoadg) * 31) + Boolean.hashCode(this.f72895zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f72894iobyxmoadg;
        }

        public String toString() {
            return "PrepareUi(isAutoBrightnessEnabled=" + this.f72894iobyxmoadg + ", isShowQrEnabled=" + this.f72895zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f72895zoijcleaow;
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72896iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            super(null);
            this.f72896iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f72896iobyxmoadg == ((nufgyqmvbu) obj).f72896iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72896iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72896iobyxmoadg;
        }

        public String toString() {
            return "PushNotificationsCheckedChanged(isChecked=" + this.f72896iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final x00.iobyxmoadg f72897iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(x00.iobyxmoadg darkModeState) {
            super(null);
            zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
            this.f72897iobyxmoadg = darkModeState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f72897iobyxmoadg == ((ppxfxbqfkf) obj).f72897iobyxmoadg;
        }

        public int hashCode() {
            return this.f72897iobyxmoadg.hashCode();
        }

        public final x00.iobyxmoadg iobyxmoadg() {
            return this.f72897iobyxmoadg;
        }

        public String toString() {
            return "DarkModeStateChanged(darkModeState=" + this.f72897iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72898iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f72898iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f72898iobyxmoadg == ((wkgbmnqykc) obj).f72898iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72898iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72898iobyxmoadg;
        }

        public String toString() {
            return "EmailNotificationsCheckedChanged(isChecked=" + this.f72898iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72899iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f72899iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f72899iobyxmoadg == ((zoijcleaow) obj).f72899iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72899iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72899iobyxmoadg;
        }

        public String toString() {
            return "DarkModeOptionVisibilityChanged(isVisible=" + this.f72899iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
