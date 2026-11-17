package ah0;

import kotlin.jvm.internal.zdlpuopuiu;
import lo.zoijcleaow;
import no.eablkybsjg;
import no.gxszxtbevo;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f1909iobyxmoadg;

    public iobyxmoadg(zoijcleaow analyticsTracker) {
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        this.f1909iobyxmoadg = analyticsTracker;
    }

    private final void lqeggnwhkg(gxszxtbevo gxszxtbevoVar) {
        this.f1909iobyxmoadg.ppxfxbqfkf(new eablkybsjg(gxszxtbevoVar));
    }

    public final void eablkybsjg() {
        lqeggnwhkg(new gxszxtbevo(AnalyticsPage.MainScreen.f84306iwizpuwonk, AnalyticsPage.QrCode.f84339iwizpuwonk, null, null, null, 28, null));
    }

    public final void gxszxtbevo(String storyId, AnalyticsLocation location, AnalyticElement element) {
        zdlpuopuiu.btonecajqb(storyId, "storyId");
        zdlpuopuiu.btonecajqb(location, "location");
        zdlpuopuiu.btonecajqb(element, "element");
        lqeggnwhkg(new gxszxtbevo(AnalyticsPage.MainScreen.f84306iwizpuwonk, new AnalyticsPage.Story(storyId), location, element, null, 16, null));
    }

    public final void iobyxmoadg(String catalogId, String catalogName) {
        zdlpuopuiu.btonecajqb(catalogId, "catalogId");
        zdlpuopuiu.btonecajqb(catalogName, "catalogName");
        lqeggnwhkg(new gxszxtbevo(AnalyticsPage.MainScreen.f84306iwizpuwonk, new AnalyticsPage.SubCatalog(catalogName, catalogId), null, null, null, 28, null));
    }

    public final void nufgyqmvbu() {
        lqeggnwhkg(new gxszxtbevo(AnalyticsPage.MainScreen.f84306iwizpuwonk, AnalyticsPage.Video.f84364iwizpuwonk, null, null, null, 28, null));
    }

    public final void ppxfxbqfkf(String id2, String name, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        lqeggnwhkg(new gxszxtbevo(AnalyticsPage.MainScreen.f84306iwizpuwonk, new AnalyticsPage.ProductList(name, id2), analyticsLocation, analyticElement, null, 16, null));
    }

    public final void wkgbmnqykc() {
        lqeggnwhkg(new gxszxtbevo(AnalyticsPage.MainScreen.f84306iwizpuwonk, AnalyticsPage.Menu.f84307iwizpuwonk, null, null, null, 28, null));
    }

    public final void zoijcleaow(String productArticle, String productName, AnalyticElement element, AnalyticsLocation analyticsLocation) {
        zdlpuopuiu.btonecajqb(productArticle, "productArticle");
        zdlpuopuiu.btonecajqb(productName, "productName");
        zdlpuopuiu.btonecajqb(element, "element");
        lqeggnwhkg(new gxszxtbevo(AnalyticsPage.MainScreen.f84306iwizpuwonk, new AnalyticsPage.ItemDetail(productArticle, productName), analyticsLocation, element, null, 16, null));
    }
}
