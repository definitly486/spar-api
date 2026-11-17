package rl0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    /* JADX INFO: renamed from: rl0.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1861eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1861eablkybsjg f83022iobyxmoadg = new C1861eablkybsjg();

        private C1861eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1861eablkybsjg);
        }

        public int hashCode() {
            return -1483205967;
        }

        public String toString() {
            return "ShowErrorCantDeleteAddress";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f83023iobyxmoadg;

        public gxszxtbevo(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f83023iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f83023iobyxmoadg, ((gxszxtbevo) obj).f83023iobyxmoadg);
        }

        public int hashCode() {
            return this.f83023iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f83023iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f83023iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f83024iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1754579165;
        }

        public String toString() {
            return "ExitFromAddressFlow";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83025iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f83025iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f83025iobyxmoadg == ((ppxfxbqfkf) obj).f83025iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83025iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83025iobyxmoadg;
        }

        public String toString() {
            return "NavigateBackWithResult(isDeleteAddress=" + this.f83025iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83026iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f83027ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f83028zoijcleaow;

        public wkgbmnqykc(String shortAddress, String fullAddress, LocationData location) {
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f83026iobyxmoadg = shortAddress;
            this.f83028zoijcleaow = fullAddress;
            this.f83027ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f83026iobyxmoadg, wkgbmnqykcVar.f83026iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f83028zoijcleaow, wkgbmnqykcVar.f83028zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f83027ppxfxbqfkf, wkgbmnqykcVar.f83027ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f83026iobyxmoadg.hashCode() * 31) + this.f83028zoijcleaow.hashCode()) * 31) + this.f83027ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83028zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f83026iobyxmoadg;
        }

        public String toString() {
            return "NavigateToMapScreen(shortAddress=" + this.f83026iobyxmoadg + ", fullAddress=" + this.f83028zoijcleaow + ", location=" + this.f83027ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f83027ppxfxbqfkf;
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f83029iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 895122223;
        }

        public String toString() {
            return "NavigateBack";
        }
    }
}
