package ql0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.address.api.model.AddressMapScreenArgs;
import ru.myspar.proloyalty.components.address.api.model.UserAddress;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    /* JADX INFO: renamed from: ql0.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1769eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1769eablkybsjg f79096iobyxmoadg = new C1769eablkybsjg();

        private C1769eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1769eablkybsjg);
        }

        public int hashCode() {
            return 1231630996;
        }

        public String toString() {
            return "ShowCannotDeleteMessage";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f79097iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 2038776811;
        }

        public String toString() {
            return "ShowPriceCanChangeMessage";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f79098iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -417003584;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f79099iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 877888670;
        }

        public String toString() {
            return "ShowSomethingProductsAvailableOnlyForPickupMessage";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UserAddress.Delivery f79100iobyxmoadg;

        public ppxfxbqfkf(UserAddress.Delivery userAddress) {
            zdlpuopuiu.btonecajqb(userAddress, "userAddress");
            this.f79100iobyxmoadg = userAddress;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f79100iobyxmoadg, ((ppxfxbqfkf) obj).f79100iobyxmoadg);
        }

        public int hashCode() {
            return this.f79100iobyxmoadg.hashCode();
        }

        public final UserAddress.Delivery iobyxmoadg() {
            return this.f79100iobyxmoadg;
        }

        public String toString() {
            return "NavigateToDetailAddressScreen(userAddress=" + this.f79100iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f79101iobyxmoadg;

        public wkgbmnqykc(Throwable throwable) {
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f79101iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f79101iobyxmoadg, ((wkgbmnqykc) obj).f79101iobyxmoadg);
        }

        public int hashCode() {
            return this.f79101iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f79101iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(throwable=" + this.f79101iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AddressMapScreenArgs f79102iobyxmoadg;

        public zoijcleaow(AddressMapScreenArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f79102iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f79102iobyxmoadg, ((zoijcleaow) obj).f79102iobyxmoadg);
        }

        public int hashCode() {
            return this.f79102iobyxmoadg.hashCode();
        }

        public final AddressMapScreenArgs iobyxmoadg() {
            return this.f79102iobyxmoadg;
        }

        public String toString() {
            return "NavigateToAddressMapScreen(args=" + this.f79102iobyxmoadg + ")";
        }
    }
}
