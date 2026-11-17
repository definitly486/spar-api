package is;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f49253iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 416403263;
        }

        public String toString() {
            return "Exit";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f49254iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 221892319;
        }

        public String toString() {
            return "ShowDeliveryArea";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f49255iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f49255iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f49255iobyxmoadg, ((zoijcleaow) obj).f49255iobyxmoadg);
        }

        public int hashCode() {
            return this.f49255iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f49255iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f49255iobyxmoadg + ")";
        }
    }
}
