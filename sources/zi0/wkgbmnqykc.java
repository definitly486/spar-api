package zi0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f130217iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String orderNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
            this.f130217iobyxmoadg = orderNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f130217iobyxmoadg, ((eablkybsjg) obj).f130217iobyxmoadg);
        }

        public int hashCode() {
            return this.f130217iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f130217iobyxmoadg;
        }

        public String toString() {
            return "OnOrderNumberCopyClicked(orderNumber=" + this.f130217iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f130218iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 472459551;
        }

        public String toString() {
            return "OnRefresh";
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f130219iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1567749508;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f130220iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -398400930;
        }

        public String toString() {
            return "OnNextPage";
        }
    }

    /* JADX INFO: renamed from: zi0.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C3319wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final dj0.wkgbmnqykc f130221iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3319wkgbmnqykc(dj0.wkgbmnqykc order) {
            super(null);
            zdlpuopuiu.btonecajqb(order, "order");
            this.f130221iobyxmoadg = order;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3319wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f130221iobyxmoadg, ((C3319wkgbmnqykc) obj).f130221iobyxmoadg);
        }

        public int hashCode() {
            return this.f130221iobyxmoadg.hashCode();
        }

        public final dj0.wkgbmnqykc iobyxmoadg() {
            return this.f130221iobyxmoadg;
        }

        public String toString() {
            return "OnOrderClicked(order=" + this.f130221iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f130222iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String phone) {
            super(null);
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f130222iobyxmoadg = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f130222iobyxmoadg, ((zoijcleaow) obj).f130222iobyxmoadg);
        }

        public int hashCode() {
            return this.f130222iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f130222iobyxmoadg;
        }

        public String toString() {
            return "OnCallClicked(phone=" + this.f130222iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
