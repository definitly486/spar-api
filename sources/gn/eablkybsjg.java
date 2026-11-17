package gn;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes3.dex */
public interface eablkybsjg {

    /* JADX INFO: renamed from: gn.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C0858eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0858eablkybsjg f37908iobyxmoadg = new C0858eablkybsjg();

        private C0858eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0858eablkybsjg);
        }

        public int hashCode() {
            return 305555662;
        }

        public String toString() {
            return "ShowErrorCantDeleteAddress";
        }
    }

    public static final class gxszxtbevo implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f37909iobyxmoadg;

        public gxszxtbevo(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f37909iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f37909iobyxmoadg, ((gxszxtbevo) obj).f37909iobyxmoadg);
        }

        public int hashCode() {
            return this.f37909iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f37909iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f37909iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f37910iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1825382490;
        }

        public String toString() {
            return "ExitFromAddressFlow";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f37911iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f37911iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f37911iobyxmoadg == ((ppxfxbqfkf) obj).f37911iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f37911iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f37911iobyxmoadg;
        }

        public String toString() {
            return "NavigateBackWithResult(isDeleteAddress=" + this.f37911iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f37912iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f37913ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f37914zoijcleaow;

        public wkgbmnqykc(String shortAddress, String fullAddress, LocationData location) {
            zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f37912iobyxmoadg = shortAddress;
            this.f37914zoijcleaow = fullAddress;
            this.f37913ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f37912iobyxmoadg, wkgbmnqykcVar.f37912iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f37914zoijcleaow, wkgbmnqykcVar.f37914zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f37913ppxfxbqfkf, wkgbmnqykcVar.f37913ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f37912iobyxmoadg.hashCode() * 31) + this.f37914zoijcleaow.hashCode()) * 31) + this.f37913ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f37914zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f37912iobyxmoadg;
        }

        public String toString() {
            return "NavigateToMapScreen(shortAddress=" + this.f37912iobyxmoadg + ", fullAddress=" + this.f37914zoijcleaow + ", location=" + this.f37913ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f37913ppxfxbqfkf;
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f37915iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1278273524;
        }

        public String toString() {
            return "NavigateBack";
        }
    }
}
