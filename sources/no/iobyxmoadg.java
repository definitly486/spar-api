package no;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AnalyticsPage f70443iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final AnalyticElement.ChangeItemElement f70444ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AnalyticsLocation f70445zoijcleaow;

    public iobyxmoadg(AnalyticsPage page, AnalyticsLocation analyticsLocation, AnalyticElement.ChangeItemElement element) {
        zdlpuopuiu.btonecajqb(page, "page");
        zdlpuopuiu.btonecajqb(element, "element");
        this.f70443iobyxmoadg = page;
        this.f70445zoijcleaow = analyticsLocation;
        this.f70444ppxfxbqfkf = element;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f70443iobyxmoadg, iobyxmoadgVar.f70443iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f70445zoijcleaow, iobyxmoadgVar.f70445zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f70444ppxfxbqfkf, iobyxmoadgVar.f70444ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = this.f70443iobyxmoadg.hashCode() * 31;
        AnalyticsLocation analyticsLocation = this.f70445zoijcleaow;
        return ((iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode())) * 31) + this.f70444ppxfxbqfkf.hashCode();
    }

    public final AnalyticElement.ChangeItemElement iobyxmoadg() {
        return this.f70444ppxfxbqfkf;
    }

    public final AnalyticsPage ppxfxbqfkf() {
        return this.f70443iobyxmoadg;
    }

    public String toString() {
        return "AnalyticProductParams(page=" + this.f70443iobyxmoadg + ", location=" + this.f70445zoijcleaow + ", element=" + this.f70444ppxfxbqfkf + ")";
    }

    public final AnalyticsLocation zoijcleaow() {
        return this.f70445zoijcleaow;
    }
}
