package yq0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f126257iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 27650556;
        }

        public String toString() {
            return "Exit";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f126258iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1116555748;
        }

        public String toString() {
            return "ShowDeliveryArea";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f126259iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f126259iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f126259iobyxmoadg, ((zoijcleaow) obj).f126259iobyxmoadg);
        }

        public int hashCode() {
            return this.f126259iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f126259iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f126259iobyxmoadg + ")";
        }
    }
}
