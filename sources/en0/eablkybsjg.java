package en0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f31602iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 42917382;
        }

        public String toString() {
            return "Exit";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f31603iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f31603iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f31603iobyxmoadg, ((ppxfxbqfkf) obj).f31603iobyxmoadg);
        }

        public int hashCode() {
            return this.f31603iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f31603iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f31603iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f31604iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f31605ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f31606zoijcleaow;

        public zoijcleaow(String phoneNumber, String hash, int i13) {
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            zdlpuopuiu.btonecajqb(hash, "hash");
            this.f31604iobyxmoadg = phoneNumber;
            this.f31606zoijcleaow = hash;
            this.f31605ppxfxbqfkf = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f31604iobyxmoadg, zoijcleaowVar.f31604iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f31606zoijcleaow, zoijcleaowVar.f31606zoijcleaow) && this.f31605ppxfxbqfkf == zoijcleaowVar.f31605ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f31604iobyxmoadg.hashCode() * 31) + this.f31606zoijcleaow.hashCode()) * 31) + Integer.hashCode(this.f31605ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f31606zoijcleaow;
        }

        public final int ppxfxbqfkf() {
            return this.f31605ppxfxbqfkf;
        }

        public String toString() {
            return "NavigateToAuthBySmsScreen(phoneNumber=" + this.f31604iobyxmoadg + ", hash=" + this.f31606zoijcleaow + ", timeLimit=" + this.f31605ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f31604iobyxmoadg;
        }
    }
}
