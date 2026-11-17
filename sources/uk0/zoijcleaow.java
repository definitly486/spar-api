package uk0;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f113787iobyxmoadg;

    public static final class dxjokdxxww extends zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final dxjokdxxww f113788zoijcleaow = new dxjokdxxww();

        private dxjokdxxww() {
            super(pm.dxjokdxxww.saved_cards_title, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof dxjokdxxww);
        }

        public int hashCode() {
            return 1201605323;
        }

        public String toString() {
            return "SavedCards";
        }
    }

    public static final class eablkybsjg extends zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final eablkybsjg f113789zoijcleaow = new eablkybsjg();

        private eablkybsjg() {
            super(pm.dxjokdxxww.purchases_history_title, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -1388281993;
        }

        public String toString() {
            return "MyPurchases";
        }
    }

    public static final class gxszxtbevo extends zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final gxszxtbevo f113790zoijcleaow = new gxszxtbevo();

        private gxszxtbevo() {
            super(pm.dxjokdxxww.my_lists, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 295309493;
        }

        public String toString() {
            return "MyPurchasesList";
        }
    }

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f113791zoijcleaow = new iobyxmoadg();

        private iobyxmoadg() {
            super(pm.dxjokdxxww.actual_orders, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -108270590;
        }

        public String toString() {
            return "ActualOrders";
        }
    }

    public static final class lqeggnwhkg extends zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f113792zoijcleaow;

        public lqeggnwhkg(int i13) {
            super(pm.dxjokdxxww.title_notifications, null);
            this.f113792zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f113792zoijcleaow == ((lqeggnwhkg) obj).f113792zoijcleaow;
        }

        public int hashCode() {
            return Integer.hashCode(this.f113792zoijcleaow);
        }

        @Override // uk0.zoijcleaow
        public Integer iobyxmoadg() {
            return Integer.valueOf(this.f113792zoijcleaow);
        }

        public String toString() {
            return "Notifications(badgeCount=" + this.f113792zoijcleaow + ")";
        }
    }

    public static final class nufgyqmvbu extends zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final nufgyqmvbu f113793zoijcleaow = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(pm.dxjokdxxww.personal_data, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof nufgyqmvbu);
        }

        public int hashCode() {
            return -1139589127;
        }

        public String toString() {
            return "PersonalData";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final ppxfxbqfkf f113794zoijcleaow = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(pm.dxjokdxxww.favorites, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1065541708;
        }

        public String toString() {
            return "FavoritesProducts";
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f113795zoijcleaow;

        public wkgbmnqykc(int i13) {
            super(pm.dxjokdxxww.my_coupons, null);
            this.f113795zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f113795zoijcleaow == ((wkgbmnqykc) obj).f113795zoijcleaow;
        }

        public int hashCode() {
            return Integer.hashCode(this.f113795zoijcleaow);
        }

        @Override // uk0.zoijcleaow
        public Integer iobyxmoadg() {
            return Integer.valueOf(this.f113795zoijcleaow);
        }

        public String toString() {
            return "MyDiscounts(badgeCount=" + this.f113795zoijcleaow + ")";
        }
    }

    /* JADX INFO: renamed from: uk0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2820zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final C2820zoijcleaow f113796zoijcleaow = new C2820zoijcleaow();

        private C2820zoijcleaow() {
            super(pm.dxjokdxxww.completed_orders, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2820zoijcleaow);
        }

        public int hashCode() {
            return 1503842497;
        }

        public String toString() {
            return "CompletedOrders";
        }
    }

    public /* synthetic */ zoijcleaow(int i13, gtknphoqwx gtknphoqwxVar) {
        this(i13);
    }

    public Integer iobyxmoadg() {
        return null;
    }

    public final int zoijcleaow() {
        return this.f113787iobyxmoadg;
    }

    private zoijcleaow(int i13) {
        this.f113787iobyxmoadg = i13;
    }
}
