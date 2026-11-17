package fn;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.address.api.model.AddressMapScreenArgs;
import ru.myspar.components.address.api.model.UserAddress;

/* JADX INFO: loaded from: classes3.dex */
public interface eablkybsjg {

    /* JADX INFO: renamed from: fn.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C0757eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0757eablkybsjg f34417iobyxmoadg = new C0757eablkybsjg();

        private C0757eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0757eablkybsjg);
        }

        public int hashCode() {
            return 180954327;
        }

        public String toString() {
            return "ShowCannotDeleteMessage";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f34418iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 1655812462;
        }

        public String toString() {
            return "ShowPriceCanChangeMessage";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f34419iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1696210595;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class lqeggnwhkg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f34420iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 792805499;
        }

        public String toString() {
            return "ShowSomethingProductsAvailableOnlyForPickupMessage";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UserAddress.Delivery f34421iobyxmoadg;

        public ppxfxbqfkf(UserAddress.Delivery userAddress) {
            zdlpuopuiu.btonecajqb(userAddress, "userAddress");
            this.f34421iobyxmoadg = userAddress;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f34421iobyxmoadg, ((ppxfxbqfkf) obj).f34421iobyxmoadg);
        }

        public int hashCode() {
            return this.f34421iobyxmoadg.hashCode();
        }

        public final UserAddress.Delivery iobyxmoadg() {
            return this.f34421iobyxmoadg;
        }

        public String toString() {
            return "NavigateToDetailAddressScreen(userAddress=" + this.f34421iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f34422iobyxmoadg;

        public wkgbmnqykc(Throwable throwable) {
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f34422iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f34422iobyxmoadg, ((wkgbmnqykc) obj).f34422iobyxmoadg);
        }

        public int hashCode() {
            return this.f34422iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f34422iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(throwable=" + this.f34422iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AddressMapScreenArgs f34423iobyxmoadg;

        public zoijcleaow(AddressMapScreenArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f34423iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f34423iobyxmoadg, ((zoijcleaow) obj).f34423iobyxmoadg);
        }

        public int hashCode() {
            return this.f34423iobyxmoadg.hashCode();
        }

        public final AddressMapScreenArgs iobyxmoadg() {
            return this.f34423iobyxmoadg;
        }

        public String toString() {
            return "NavigateToAddressMapScreen(args=" + this.f34423iobyxmoadg + ")";
        }
    }
}
