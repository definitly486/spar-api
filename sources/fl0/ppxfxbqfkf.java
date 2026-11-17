package fl0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f34333iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -226596232;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    /* JADX INFO: renamed from: fl0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C0755ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f34334iobyxmoadg;

        public C0755ppxfxbqfkf(tzroggbefp input) {
            zdlpuopuiu.btonecajqb(input, "input");
            this.f34334iobyxmoadg = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0755ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f34334iobyxmoadg, ((C0755ppxfxbqfkf) obj).f34334iobyxmoadg);
        }

        public int hashCode() {
            return this.f34334iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f34334iobyxmoadg;
        }

        public String toString() {
            return "OnChangeSearchInput(input=" + this.f34334iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f34335iobyxmoadg;

        public zoijcleaow(String fullAddress) {
            zdlpuopuiu.btonecajqb(fullAddress, "fullAddress");
            this.f34335iobyxmoadg = fullAddress;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f34335iobyxmoadg, ((zoijcleaow) obj).f34335iobyxmoadg);
        }

        public int hashCode() {
            return this.f34335iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f34335iobyxmoadg;
        }

        public String toString() {
            return "OnAddressClicked(fullAddress=" + this.f34335iobyxmoadg + ")";
        }
    }
}
