package gi0;

import java.io.File;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f37498iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1869319741;
        }

        public String toString() {
            return "Close";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final File f37499iobyxmoadg;

        public zoijcleaow(File log) {
            zdlpuopuiu.btonecajqb(log, "log");
            this.f37499iobyxmoadg = log;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f37499iobyxmoadg, ((zoijcleaow) obj).f37499iobyxmoadg);
        }

        public int hashCode() {
            return this.f37499iobyxmoadg.hashCode();
        }

        public final File iobyxmoadg() {
            return this.f37499iobyxmoadg;
        }

        public String toString() {
            return "ShareLog(log=" + this.f37499iobyxmoadg + ")";
        }
    }
}
