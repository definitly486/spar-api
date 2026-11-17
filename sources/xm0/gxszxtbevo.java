package xm0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLink;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final AnalyticsLink f122877eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AnalyticsPage f122878iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final AnalyticsLocation f122879ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final AnalyticElement f122880wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AnalyticsPage f122881zoijcleaow;

    public gxszxtbevo(AnalyticsPage page, AnalyticsPage targetPage, AnalyticsLocation analyticsLocation, AnalyticElement analyticElement, AnalyticsLink analyticsLink) {
        zdlpuopuiu.btonecajqb(page, "page");
        zdlpuopuiu.btonecajqb(targetPage, "targetPage");
        this.f122878iobyxmoadg = page;
        this.f122881zoijcleaow = targetPage;
        this.f122879ppxfxbqfkf = analyticsLocation;
        this.f122880wkgbmnqykc = analyticElement;
        this.f122877eablkybsjg = analyticsLink;
    }

    public final AnalyticsPage eablkybsjg() {
        return this.f122881zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f122878iobyxmoadg, gxszxtbevoVar.f122878iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f122881zoijcleaow, gxszxtbevoVar.f122881zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122879ppxfxbqfkf, gxszxtbevoVar.f122879ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f122880wkgbmnqykc, gxszxtbevoVar.f122880wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f122877eablkybsjg, gxszxtbevoVar.f122877eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((this.f122878iobyxmoadg.hashCode() * 31) + this.f122881zoijcleaow.hashCode()) * 31;
        AnalyticsLocation analyticsLocation = this.f122879ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode())) * 31;
        AnalyticElement analyticElement = this.f122880wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (analyticElement == null ? 0 : analyticElement.hashCode())) * 31;
        AnalyticsLink analyticsLink = this.f122877eablkybsjg;
        return iHashCode3 + (analyticsLink != null ? analyticsLink.hashCode() : 0);
    }

    public final AnalyticElement iobyxmoadg() {
        return this.f122880wkgbmnqykc;
    }

    public final AnalyticsLocation ppxfxbqfkf() {
        return this.f122879ppxfxbqfkf;
    }

    public String toString() {
        return "OpenScreenEventParams(page=" + this.f122878iobyxmoadg + ", targetPage=" + this.f122881zoijcleaow + ", location=" + this.f122879ppxfxbqfkf + ", element=" + this.f122880wkgbmnqykc + ", link=" + this.f122877eablkybsjg + ")";
    }

    public final AnalyticsPage wkgbmnqykc() {
        return this.f122878iobyxmoadg;
    }

    public final AnalyticsLink zoijcleaow() {
        return this.f122877eablkybsjg;
    }

    public /* synthetic */ gxszxtbevo(AnalyticsPage analyticsPage, AnalyticsPage analyticsPage2, AnalyticsLocation analyticsLocation, AnalyticElement analyticElement, AnalyticsLink analyticsLink, int i13, gtknphoqwx gtknphoqwxVar) {
        this(analyticsPage, analyticsPage2, (i13 & 4) != 0 ? null : analyticsLocation, (i13 & 8) != 0 ? null : analyticElement, (i13 & 16) != 0 ? null : analyticsLink);
    }
}
