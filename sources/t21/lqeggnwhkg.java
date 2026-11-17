package t21;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface lqeggnwhkg {

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f109333iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -2041131971;
        }

        public String toString() {
            return "Disable";
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f109334iobyxmoadg;

        public zoijcleaow(String vpnRequestId) {
            zdlpuopuiu.btonecajqb(vpnRequestId, "vpnRequestId");
            this.f109334iobyxmoadg = vpnRequestId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f109334iobyxmoadg, ((zoijcleaow) obj).f109334iobyxmoadg);
        }

        public int hashCode() {
            return this.f109334iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f109334iobyxmoadg;
        }

        public String toString() {
            return "Enable(vpnRequestId=" + this.f109334iobyxmoadg + ")";
        }
    }
}
