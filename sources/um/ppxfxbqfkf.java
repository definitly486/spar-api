package um;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes3.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f113937iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 450885179;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    /* JADX INFO: renamed from: um.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2825ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f113938iobyxmoadg;

        public C2825ppxfxbqfkf(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f113938iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2825ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f113938iobyxmoadg, ((C2825ppxfxbqfkf) obj).f113938iobyxmoadg);
        }

        public int hashCode() {
            return this.f113938iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f113938iobyxmoadg;
        }

        public String toString() {
            return "OnChangeSearchInput(input=" + this.f113938iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f113939iobyxmoadg;

        public zoijcleaow(String fullAddress) {
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            this.f113939iobyxmoadg = fullAddress;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f113939iobyxmoadg, ((zoijcleaow) obj).f113939iobyxmoadg);
        }

        public int hashCode() {
            return this.f113939iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f113939iobyxmoadg;
        }

        public String toString() {
            return "OnAddressClicked(fullAddress=" + this.f113939iobyxmoadg + ")";
        }
    }
}
