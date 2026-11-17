package fn;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface gxszxtbevo {

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f34424iobyxmoadg;

        public eablkybsjg(boolean z13) {
            this.f34424iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f34424iobyxmoadg == ((eablkybsjg) obj).f34424iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f34424iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f34424iobyxmoadg;
        }

        public String toString() {
            return "SetLoading(isLoading=" + this.f34424iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final rm.zoijcleaow f34425iobyxmoadg;

        public iobyxmoadg(rm.zoijcleaow addressType) {
            zdlpuopuiu.btonecajqb(addressType, "addressType");
            this.f34425iobyxmoadg = addressType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f34425iobyxmoadg == ((iobyxmoadg) obj).f34425iobyxmoadg;
        }

        public int hashCode() {
            return this.f34425iobyxmoadg.hashCode();
        }

        public final rm.zoijcleaow iobyxmoadg() {
            return this.f34425iobyxmoadg;
        }

        public String toString() {
            return "ChangeAddressType(addressType=" + this.f34425iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34426iobyxmoadg;

        public ppxfxbqfkf(String str) {
            this.f34426iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f34426iobyxmoadg, ((ppxfxbqfkf) obj).f34426iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f34426iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34426iobyxmoadg;
        }

        public String toString() {
            return "OnAddressCheckedChange(addressId=" + this.f34426iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f34427iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f34428zoijcleaow;

        public wkgbmnqykc(List delivery, List pickup) {
            zdlpuopuiu.btonecajqb(delivery, "delivery");
            zdlpuopuiu.btonecajqb(pickup, "pickup");
            this.f34427iobyxmoadg = delivery;
            this.f34428zoijcleaow = pickup;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f34427iobyxmoadg, wkgbmnqykcVar.f34427iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f34428zoijcleaow, wkgbmnqykcVar.f34428zoijcleaow);
        }

        public int hashCode() {
            return (this.f34427iobyxmoadg.hashCode() * 31) + this.f34428zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f34427iobyxmoadg;
        }

        public String toString() {
            return "SetAddressList(delivery=" + this.f34427iobyxmoadg + ", pickup=" + this.f34428zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f34428zoijcleaow;
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34429iobyxmoadg;

        public zoijcleaow(String shopId) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f34429iobyxmoadg = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f34429iobyxmoadg, ((zoijcleaow) obj).f34429iobyxmoadg);
        }

        public int hashCode() {
            return this.f34429iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34429iobyxmoadg;
        }

        public String toString() {
            return "DeletePickUpAddress(shopId=" + this.f34429iobyxmoadg + ")";
        }
    }
}
