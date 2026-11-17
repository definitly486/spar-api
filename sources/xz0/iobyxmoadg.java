package xz0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: xz0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3118iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C3118iobyxmoadg f123477iobyxmoadg = new C3118iobyxmoadg();

        private C3118iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C3118iobyxmoadg);
        }

        public int hashCode() {
            return 2017959198;
        }

        public String toString() {
            return "Cancel";
        }
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f123478iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 9807327;
        }

        public String toString() {
            return "Success";
        }
    }

    public static final class wkgbmnqykc implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f123479iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -1301677015;
        }

        public String toString() {
            return "Waiting";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f123480iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f123481ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f123482zoijcleaow;

        public zoijcleaow(String str, String str2, String str3) {
            this.f123480iobyxmoadg = str;
            this.f123482zoijcleaow = str2;
            this.f123481ppxfxbqfkf = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f123480iobyxmoadg, zoijcleaowVar.f123480iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f123482zoijcleaow, zoijcleaowVar.f123482zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f123481ppxfxbqfkf, zoijcleaowVar.f123481ppxfxbqfkf);
        }

        public int hashCode() {
            String str = this.f123480iobyxmoadg;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f123482zoijcleaow;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f123481ppxfxbqfkf;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Error(httpCode=" + this.f123480iobyxmoadg + ", errorCode=" + this.f123482zoijcleaow + ", description=" + this.f123481ppxfxbqfkf + ")";
        }
    }
}
