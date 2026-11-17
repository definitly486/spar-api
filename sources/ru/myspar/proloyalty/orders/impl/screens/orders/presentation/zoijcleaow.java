package ru.myspar.proloyalty.orders.impl.screens.orders.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class eablkybsjg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final dg1.wkgbmnqykc f98655iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(dg1.wkgbmnqykc order) {
            super(null);
            zdlpuopuiu.btonecajqb(order, "order");
            this.f98655iobyxmoadg = order;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f98655iobyxmoadg, ((eablkybsjg) obj).f98655iobyxmoadg);
        }

        public int hashCode() {
            return this.f98655iobyxmoadg.hashCode();
        }

        public final dg1.wkgbmnqykc iobyxmoadg() {
            return this.f98655iobyxmoadg;
        }

        public String toString() {
            return "OnOrderClicked(order=" + this.f98655iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98656iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(String orderNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            this.f98656iobyxmoadg = orderNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f98656iobyxmoadg, ((gxszxtbevo) obj).f98656iobyxmoadg);
        }

        public int hashCode() {
            return this.f98656iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98656iobyxmoadg;
        }

        public String toString() {
            return "OnOrderNumberCopyClicked(orderNumber=" + this.f98656iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f98657iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f98658iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f98659iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1641976522;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98660iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String npsUrl) {
            super(null);
            zdlpuopuiu.btonecajqb(npsUrl, "npsUrl");
            this.f98660iobyxmoadg = npsUrl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f98660iobyxmoadg, ((wkgbmnqykc) obj).f98660iobyxmoadg);
        }

        public int hashCode() {
            return this.f98660iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98660iobyxmoadg;
        }

        public String toString() {
            return "OnOpenOrderNpsUrl(npsUrl=" + this.f98660iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.orders.impl.screens.orders.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2358zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f98661iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2358zoijcleaow(String phone) {
            super(null);
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f98661iobyxmoadg = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2358zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f98661iobyxmoadg, ((C2358zoijcleaow) obj).f98661iobyxmoadg);
        }

        public int hashCode() {
            return this.f98661iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f98661iobyxmoadg;
        }

        public String toString() {
            return "OnCallClicked(phone=" + this.f98661iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
