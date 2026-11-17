package ql0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f79103iobyxmoadg;

        public eablkybsjg(boolean z13) {
            this.f79103iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f79103iobyxmoadg == ((eablkybsjg) obj).f79103iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f79103iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f79103iobyxmoadg;
        }

        public String toString() {
            return "SetLoading(isLoading=" + this.f79103iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final cl0.zoijcleaow f79104iobyxmoadg;

        public iobyxmoadg(cl0.zoijcleaow addressType) {
            zdlpuopuiu.btonecajqb(addressType, "addressType");
            this.f79104iobyxmoadg = addressType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f79104iobyxmoadg == ((iobyxmoadg) obj).f79104iobyxmoadg;
        }

        public int hashCode() {
            return this.f79104iobyxmoadg.hashCode();
        }

        public final cl0.zoijcleaow iobyxmoadg() {
            return this.f79104iobyxmoadg;
        }

        public String toString() {
            return "ChangeAddressType(addressType=" + this.f79104iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f79105iobyxmoadg;

        public ppxfxbqfkf(String str) {
            this.f79105iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f79105iobyxmoadg, ((ppxfxbqfkf) obj).f79105iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f79105iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f79105iobyxmoadg;
        }

        public String toString() {
            return "OnAddressCheckedChange(addressId=" + this.f79105iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f79106iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f79107zoijcleaow;

        public wkgbmnqykc(List delivery, List pickup) {
            zdlpuopuiu.btonecajqb(delivery, "delivery");
            zdlpuopuiu.btonecajqb(pickup, "pickup");
            this.f79106iobyxmoadg = delivery;
            this.f79107zoijcleaow = pickup;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f79106iobyxmoadg, wkgbmnqykcVar.f79106iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f79107zoijcleaow, wkgbmnqykcVar.f79107zoijcleaow);
        }

        public int hashCode() {
            return (this.f79106iobyxmoadg.hashCode() * 31) + this.f79107zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f79106iobyxmoadg;
        }

        public String toString() {
            return "SetAddressList(delivery=" + this.f79106iobyxmoadg + ", pickup=" + this.f79107zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f79107zoijcleaow;
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f79108iobyxmoadg;

        public zoijcleaow(String shopId) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f79108iobyxmoadg = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f79108iobyxmoadg, ((zoijcleaow) obj).f79108iobyxmoadg);
        }

        public int hashCode() {
            return this.f79108iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f79108iobyxmoadg;
        }

        public String toString() {
            return "DeletePickUpAddress(shopId=" + this.f79108iobyxmoadg + ")";
        }
    }
}
