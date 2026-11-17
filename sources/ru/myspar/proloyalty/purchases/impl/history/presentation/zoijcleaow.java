package ru.myspar.proloyalty.purchases.impl.history.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class eablkybsjg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f99617iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -1637770168;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    public static final class gxszxtbevo extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99618iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(String orderId) {
            super(null);
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f99618iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f99618iobyxmoadg, ((gxszxtbevo) obj).f99618iobyxmoadg);
        }

        public int hashCode() {
            return this.f99618iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99618iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseClicked(orderId=" + this.f99618iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f99619iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -942343334;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class lqeggnwhkg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f99620iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -1062998723;
        }

        public String toString() {
            return "OnRateProductsClicked";
        }
    }

    public static final class nufgyqmvbu extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99621iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(String orderId) {
            super(null);
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f99621iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f99621iobyxmoadg, ((nufgyqmvbu) obj).f99621iobyxmoadg);
        }

        public int hashCode() {
            return this.f99621iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99621iobyxmoadg;
        }

        public String toString() {
            return "OnRatePurchaseClicked(orderId=" + this.f99621iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f99622iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1084435850;
        }

        public String toString() {
            return "OnCompilationClicked";
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f99623iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 1204573541;
        }

        public String toString() {
            return "OnCompletedRate";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.history.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2387zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2387zoijcleaow f99624iobyxmoadg = new C2387zoijcleaow();

        private C2387zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2387zoijcleaow);
        }

        public int hashCode() {
            return -1904799914;
        }

        public String toString() {
            return "OnBackToCatalogClicked";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
