package h10;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: h10.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0896iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0896iobyxmoadg f39071iobyxmoadg = new C0896iobyxmoadg();

        private C0896iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0896iobyxmoadg);
        }

        public int hashCode() {
            return 1312045627;
        }

        public String toString() {
            return "Cancel";
        }
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f39072iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -398676894;
        }

        public String toString() {
            return "Success";
        }
    }

    public static final class wkgbmnqykc implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f39073iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -1710161236;
        }

        public String toString() {
            return "Waiting";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f39074iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f39075ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f39076zoijcleaow;

        public zoijcleaow(String str, String str2, String str3) {
            this.f39074iobyxmoadg = str;
            this.f39076zoijcleaow = str2;
            this.f39075ppxfxbqfkf = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f39074iobyxmoadg, zoijcleaowVar.f39074iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39076zoijcleaow, zoijcleaowVar.f39076zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f39075ppxfxbqfkf, zoijcleaowVar.f39075ppxfxbqfkf);
        }

        public int hashCode() {
            String str = this.f39074iobyxmoadg;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f39076zoijcleaow;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f39075ppxfxbqfkf;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Error(httpCode=" + this.f39074iobyxmoadg + ", errorCode=" + this.f39076zoijcleaow + ", description=" + this.f39075ppxfxbqfkf + ")";
        }
    }
}
