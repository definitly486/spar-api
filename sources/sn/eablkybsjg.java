package sn;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes3.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f107717iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 2040125663;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f107718iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f107718iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f107718iobyxmoadg, ((ppxfxbqfkf) obj).f107718iobyxmoadg);
        }

        public int hashCode() {
            return this.f107718iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f107718iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f107718iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f107719iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f107720ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f107721zoijcleaow;

        public zoijcleaow(String shopId, String address, LocationData location) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(address, "address");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f107719iobyxmoadg = shopId;
            this.f107721zoijcleaow = address;
            this.f107720ppxfxbqfkf = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f107719iobyxmoadg, zoijcleaowVar.f107719iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f107721zoijcleaow, zoijcleaowVar.f107721zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f107720ppxfxbqfkf, zoijcleaowVar.f107720ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f107719iobyxmoadg.hashCode() * 31) + this.f107721zoijcleaow.hashCode()) * 31) + this.f107720ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f107721zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f107719iobyxmoadg;
        }

        public String toString() {
            return "NavigateBackWithResult(shopId=" + this.f107719iobyxmoadg + ", address=" + this.f107721zoijcleaow + ", location=" + this.f107720ppxfxbqfkf + ")";
        }

        public final LocationData zoijcleaow() {
            return this.f107720ppxfxbqfkf;
        }
    }
}
