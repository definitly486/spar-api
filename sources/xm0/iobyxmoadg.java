package xm0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AnalyticsPage f122882iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final AnalyticElement.ChangeItemElement f122883ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AnalyticsLocation f122884zoijcleaow;

    public iobyxmoadg(AnalyticsPage page, AnalyticsLocation analyticsLocation, AnalyticElement.ChangeItemElement element) {
        zdlpuopuiu.btonecajqb(page, "page");
        zdlpuopuiu.btonecajqb(element, "element");
        this.f122882iobyxmoadg = page;
        this.f122884zoijcleaow = analyticsLocation;
        this.f122883ppxfxbqfkf = element;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f122882iobyxmoadg, iobyxmoadgVar.f122882iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f122884zoijcleaow, iobyxmoadgVar.f122884zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122883ppxfxbqfkf, iobyxmoadgVar.f122883ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = this.f122882iobyxmoadg.hashCode() * 31;
        AnalyticsLocation analyticsLocation = this.f122884zoijcleaow;
        return ((iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode())) * 31) + this.f122883ppxfxbqfkf.hashCode();
    }

    public final AnalyticElement.ChangeItemElement iobyxmoadg() {
        return this.f122883ppxfxbqfkf;
    }

    public final AnalyticsPage ppxfxbqfkf() {
        return this.f122882iobyxmoadg;
    }

    public String toString() {
        return "AnalyticProductParams(page=" + this.f122882iobyxmoadg + ", location=" + this.f122884zoijcleaow + ", element=" + this.f122883ppxfxbqfkf + ")";
    }

    public final AnalyticsLocation zoijcleaow() {
        return this.f122884zoijcleaow;
    }
}
