package bx1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f17352iobyxmoadg;

        public iobyxmoadg(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.f17352iobyxmoadg = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f17352iobyxmoadg, ((iobyxmoadg) obj).f17352iobyxmoadg);
        }

        public int hashCode() {
            return this.f17352iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f17352iobyxmoadg;
        }

        public String toString() {
            return "Init(url=" + this.f17352iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f17353iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1623547173;
        }

        public String toString() {
            return "TrackAnalytics";
        }
    }
}
