package vd;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public interface zoijcleaow {

    public enum iobyxmoadg {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* JADX INFO: renamed from: vd.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2906zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f116526iobyxmoadg;

        public C2906zoijcleaow(String sessionId) {
            zdlpuopuiu.btonecajqb(sessionId, "sessionId");
            this.f116526iobyxmoadg = sessionId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2906zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f116526iobyxmoadg, ((C2906zoijcleaow) obj).f116526iobyxmoadg);
        }

        public int hashCode() {
            return this.f116526iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f116526iobyxmoadg;
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f116526iobyxmoadg + ')';
        }
    }

    boolean iobyxmoadg();

    void ppxfxbqfkf(C2906zoijcleaow c2906zoijcleaow);

    iobyxmoadg zoijcleaow();
}
