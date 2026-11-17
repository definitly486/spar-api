package of1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class btonecajqb extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72745iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f72746ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f72747zoijcleaow;

        public btonecajqb(boolean z13, boolean z14, boolean z15) {
            super(null);
            this.f72745iobyxmoadg = z13;
            this.f72747zoijcleaow = z14;
            this.f72746ppxfxbqfkf = z15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return this.f72745iobyxmoadg == btonecajqbVar.f72745iobyxmoadg && this.f72747zoijcleaow == btonecajqbVar.f72747zoijcleaow && this.f72746ppxfxbqfkf == btonecajqbVar.f72746ppxfxbqfkf;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f72745iobyxmoadg) * 31) + Boolean.hashCode(this.f72747zoijcleaow)) * 31) + Boolean.hashCode(this.f72746ppxfxbqfkf);
        }

        public final boolean iobyxmoadg() {
            return this.f72745iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f72747zoijcleaow;
        }

        public String toString() {
            return "UserNotificationFetched(isEmailNotificationEnabled=" + this.f72745iobyxmoadg + ", isSmsNotificationEnabled=" + this.f72747zoijcleaow + ", isPushNotificationEnabled=" + this.f72746ppxfxbqfkf + ")";
        }

        public final boolean zoijcleaow() {
            return this.f72746ppxfxbqfkf;
        }
    }

    public static final class draadjrbmk extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f72748iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(List userSubscription) {
            super(null);
            zdlpuopuiu.btonecajqb(userSubscription, "userSubscription");
            this.f72748iobyxmoadg = userSubscription;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f72748iobyxmoadg, ((draadjrbmk) obj).f72748iobyxmoadg);
        }

        public int hashCode() {
            return this.f72748iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f72748iobyxmoadg;
        }

        public String toString() {
            return "UserSubscriptionFetched(userSubscription=" + this.f72748iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72749iobyxmoadg;

        public dxjokdxxww(boolean z13) {
            super(null);
            this.f72749iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && this.f72749iobyxmoadg == ((dxjokdxxww) obj).f72749iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72749iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72749iobyxmoadg;
        }

        public String toString() {
            return "SmsNotificationsCheckedChanged(isChecked=" + this.f72749iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72750iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f72750iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f72750iobyxmoadg == ((eablkybsjg) obj).f72750iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72750iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72750iobyxmoadg;
        }

        public String toString() {
            return "LoadingChanged(isLoading=" + this.f72750iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f72751iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f72752zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(String subscriptionId, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(subscriptionId, "subscriptionId");
            this.f72751iobyxmoadg = subscriptionId;
            this.f72752zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return zdlpuopuiu.eablkybsjg(this.f72751iobyxmoadg, gtknphoqwxVar.f72751iobyxmoadg) && this.f72752zoijcleaow == gtknphoqwxVar.f72752zoijcleaow;
        }

        public int hashCode() {
            return (this.f72751iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f72752zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f72751iobyxmoadg;
        }

        public String toString() {
            return "UserSubscriptionCheckedChange(subscriptionId=" + this.f72751iobyxmoadg + ", isChecked=" + this.f72752zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f72752zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: of1.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1579gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72753iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f72754zoijcleaow;

        public C1579gxszxtbevo(boolean z13, boolean z14) {
            super(null);
            this.f72753iobyxmoadg = z13;
            this.f72754zoijcleaow = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1579gxszxtbevo)) {
                return false;
            }
            C1579gxszxtbevo c1579gxszxtbevo = (C1579gxszxtbevo) obj;
            return this.f72753iobyxmoadg == c1579gxszxtbevo.f72753iobyxmoadg && this.f72754zoijcleaow == c1579gxszxtbevo.f72754zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f72753iobyxmoadg) * 31) + Boolean.hashCode(this.f72754zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f72753iobyxmoadg;
        }

        public String toString() {
            return "PrepareUi(isAutoBrightnessEnabled=" + this.f72753iobyxmoadg + ", isShowQrEnabled=" + this.f72754zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f72754zoijcleaow;
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72755iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f72755iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f72755iobyxmoadg == ((iobyxmoadg) obj).f72755iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72755iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72755iobyxmoadg;
        }

        public String toString() {
            return "AutoBrightnessCheckedChanged(isChecked=" + this.f72755iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72756iobyxmoadg;

        public lqeggnwhkg(boolean z13) {
            super(null);
            this.f72756iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f72756iobyxmoadg == ((lqeggnwhkg) obj).f72756iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72756iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72756iobyxmoadg;
        }

        public String toString() {
            return "PushNotificationsCheckedChanged(isChecked=" + this.f72756iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72757iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            super(null);
            this.f72757iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f72757iobyxmoadg == ((nufgyqmvbu) obj).f72757iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72757iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72757iobyxmoadg;
        }

        public String toString() {
            return "ShowQrCheckedChanged(isChecked=" + this.f72757iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final oz0.iobyxmoadg f72758iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(oz0.iobyxmoadg darkModeState) {
            super(null);
            zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
            this.f72758iobyxmoadg = darkModeState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f72758iobyxmoadg == ((ppxfxbqfkf) obj).f72758iobyxmoadg;
        }

        public int hashCode() {
            return this.f72758iobyxmoadg.hashCode();
        }

        public final oz0.iobyxmoadg iobyxmoadg() {
            return this.f72758iobyxmoadg;
        }

        public String toString() {
            return "DarkModeStateChanged(darkModeState=" + this.f72758iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72759iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f72759iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f72759iobyxmoadg == ((wkgbmnqykc) obj).f72759iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72759iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72759iobyxmoadg;
        }

        public String toString() {
            return "EmailNotificationsCheckedChanged(isChecked=" + this.f72759iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72760iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f72760iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f72760iobyxmoadg == ((zoijcleaow) obj).f72760iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72760iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72760iobyxmoadg;
        }

        public String toString() {
            return "DarkModeOptionVisibilityChanged(isVisible=" + this.f72760iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
