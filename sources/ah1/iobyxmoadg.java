package ah1;

import hh1.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import sj.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: ah1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0041iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final gtknphoqwx f1910iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsPage f1911zoijcleaow;

        public C0041iobyxmoadg(gtknphoqwx action, AnalyticsPage analyticsPage) {
            zdlpuopuiu.btonecajqb(action, "action");
            zdlpuopuiu.btonecajqb(analyticsPage, "analyticsPage");
            this.f1910iobyxmoadg = action;
            this.f1911zoijcleaow = analyticsPage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0041iobyxmoadg)) {
                return false;
            }
            C0041iobyxmoadg c0041iobyxmoadg = (C0041iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f1910iobyxmoadg, c0041iobyxmoadg.f1910iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f1911zoijcleaow, c0041iobyxmoadg.f1911zoijcleaow);
        }

        public int hashCode() {
            return (this.f1910iobyxmoadg.hashCode() * 31) + this.f1911zoijcleaow.hashCode();
        }

        public final gtknphoqwx iobyxmoadg() {
            return this.f1910iobyxmoadg;
        }

        public String toString() {
            return "Event(action=" + this.f1910iobyxmoadg + ", analyticsPage=" + this.f1911zoijcleaow + ")";
        }

        public final AnalyticsPage zoijcleaow() {
            return this.f1911zoijcleaow;
        }
    }

    Object gxszxtbevo(gtknphoqwx gtknphoqwxVar, AnalyticsPage analyticsPage, gxszxtbevo gxszxtbevoVar);

    lqeggnwhkg iobyxmoadg();
}
