package ye0;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.analytics.api.model.AnalyticsPage;
import sj.iozdgvuglv;

/* JADX INFO: loaded from: classes4.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: ye0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3152iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ze0.iobyxmoadg f124643iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticsPage f124644zoijcleaow;

        public C3152iobyxmoadg(ze0.iobyxmoadg action, AnalyticsPage analyticsPage) {
            zdlpuopuiu.btonecajqb(action, "action");
            zdlpuopuiu.btonecajqb(analyticsPage, "analyticsPage");
            this.f124643iobyxmoadg = action;
            this.f124644zoijcleaow = analyticsPage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3152iobyxmoadg)) {
                return false;
            }
            C3152iobyxmoadg c3152iobyxmoadg = (C3152iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f124643iobyxmoadg, c3152iobyxmoadg.f124643iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f124644zoijcleaow, c3152iobyxmoadg.f124644zoijcleaow);
        }

        public int hashCode() {
            return (this.f124643iobyxmoadg.hashCode() * 31) + this.f124644zoijcleaow.hashCode();
        }

        public final ze0.iobyxmoadg iobyxmoadg() {
            return this.f124643iobyxmoadg;
        }

        public String toString() {
            return "Event(action=" + this.f124643iobyxmoadg + ", analyticsPage=" + this.f124644zoijcleaow + ")";
        }

        public final AnalyticsPage zoijcleaow() {
            return this.f124644zoijcleaow;
        }
    }

    iozdgvuglv iobyxmoadg();

    Object lqeggnwhkg(ze0.iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, gxszxtbevo gxszxtbevoVar);
}
