package no;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLink;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final AnalyticsLink f70438eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AnalyticsPage f70439iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final AnalyticsLocation f70440ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final AnalyticElement f70441wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AnalyticsPage f70442zoijcleaow;

    public gxszxtbevo(AnalyticsPage page, AnalyticsPage targetPage, AnalyticsLocation analyticsLocation, AnalyticElement analyticElement, AnalyticsLink analyticsLink) {
        zdlpuopuiu.btonecajqb(page, "page");
        zdlpuopuiu.btonecajqb(targetPage, "targetPage");
        this.f70439iobyxmoadg = page;
        this.f70442zoijcleaow = targetPage;
        this.f70440ppxfxbqfkf = analyticsLocation;
        this.f70441wkgbmnqykc = analyticElement;
        this.f70438eablkybsjg = analyticsLink;
    }

    public final AnalyticsPage eablkybsjg() {
        return this.f70442zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f70439iobyxmoadg, gxszxtbevoVar.f70439iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f70442zoijcleaow, gxszxtbevoVar.f70442zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f70440ppxfxbqfkf, gxszxtbevoVar.f70440ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f70441wkgbmnqykc, gxszxtbevoVar.f70441wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f70438eablkybsjg, gxszxtbevoVar.f70438eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((this.f70439iobyxmoadg.hashCode() * 31) + this.f70442zoijcleaow.hashCode()) * 31;
        AnalyticsLocation analyticsLocation = this.f70440ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode())) * 31;
        AnalyticElement analyticElement = this.f70441wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (analyticElement == null ? 0 : analyticElement.hashCode())) * 31;
        AnalyticsLink analyticsLink = this.f70438eablkybsjg;
        return iHashCode3 + (analyticsLink != null ? analyticsLink.hashCode() : 0);
    }

    public final AnalyticElement iobyxmoadg() {
        return this.f70441wkgbmnqykc;
    }

    public final AnalyticsLocation ppxfxbqfkf() {
        return this.f70440ppxfxbqfkf;
    }

    public String toString() {
        return "OpenScreenEventParams(page=" + this.f70439iobyxmoadg + ", targetPage=" + this.f70442zoijcleaow + ", location=" + this.f70440ppxfxbqfkf + ", element=" + this.f70441wkgbmnqykc + ", link=" + this.f70438eablkybsjg + ")";
    }

    public final AnalyticsPage wkgbmnqykc() {
        return this.f70439iobyxmoadg;
    }

    public final AnalyticsLink zoijcleaow() {
        return this.f70438eablkybsjg;
    }

    public /* synthetic */ gxszxtbevo(AnalyticsPage analyticsPage, AnalyticsPage analyticsPage2, AnalyticsLocation analyticsLocation, AnalyticElement analyticElement, AnalyticsLink analyticsLink, int i13, gtknphoqwx gtknphoqwxVar) {
        this(analyticsPage, analyticsPage2, (i13 & 4) != 0 ? null : analyticsLocation, (i13 & 8) != 0 ? null : analyticElement, (i13 & 16) != 0 ? null : analyticsLink);
    }
}
