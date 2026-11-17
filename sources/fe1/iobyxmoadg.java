package fe1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import vm0.zoijcleaow;
import xm0.eablkybsjg;
import xm0.gxszxtbevo;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f33536iobyxmoadg;

    public iobyxmoadg(zoijcleaow analyticsTracker) {
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        this.f33536iobyxmoadg = analyticsTracker;
    }

    private final void nufgyqmvbu(gxszxtbevo gxszxtbevoVar) {
        this.f33536iobyxmoadg.wkgbmnqykc(new eablkybsjg(gxszxtbevoVar));
    }

    public final void dxjokdxxww() {
        nufgyqmvbu(new gxszxtbevo(AnalyticsPage.MainScreen.f92334iwizpuwonk, AnalyticsPage.Video.f92392iwizpuwonk, null, null, null, 28, null));
    }

    public final void eablkybsjg() {
        nufgyqmvbu(new gxszxtbevo(AnalyticsPage.MainScreen.f92334iwizpuwonk, AnalyticsPage.Menu.f92335iwizpuwonk, null, null, null, 28, null));
    }

    public final void gxszxtbevo() {
        nufgyqmvbu(new gxszxtbevo(AnalyticsPage.MainScreen.f92334iwizpuwonk, AnalyticsPage.QrCode.f92367iwizpuwonk, null, null, null, 28, null));
    }

    public final void iobyxmoadg(String catalogId, String catalogName) {
        zdlpuopuiu.btonecajqb(catalogId, "catalogId");
        zdlpuopuiu.btonecajqb(catalogName, "catalogName");
        nufgyqmvbu(new gxszxtbevo(AnalyticsPage.MainScreen.f92334iwizpuwonk, new AnalyticsPage.SubCatalog(catalogName, catalogId), null, null, null, 28, null));
    }

    public final void lqeggnwhkg(String storyId, AnalyticsLocation location, AnalyticElement element) {
        zdlpuopuiu.btonecajqb(storyId, "storyId");
        zdlpuopuiu.btonecajqb(location, "location");
        zdlpuopuiu.btonecajqb(element, "element");
        nufgyqmvbu(new gxszxtbevo(AnalyticsPage.MainScreen.f92334iwizpuwonk, new AnalyticsPage.Story(storyId), location, element, null, 16, null));
    }

    public final void ppxfxbqfkf(String productArticle, String productName, AnalyticElement element, AnalyticsLocation analyticsLocation) {
        zdlpuopuiu.btonecajqb(productArticle, "productArticle");
        zdlpuopuiu.btonecajqb(productName, "productName");
        zdlpuopuiu.btonecajqb(element, "element");
        nufgyqmvbu(new gxszxtbevo(AnalyticsPage.MainScreen.f92334iwizpuwonk, new AnalyticsPage.ItemDetail(productArticle, productName), analyticsLocation, element, null, 16, null));
    }

    public final void wkgbmnqykc(String id2, String name, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        nufgyqmvbu(new gxszxtbevo(AnalyticsPage.MainScreen.f92334iwizpuwonk, new AnalyticsPage.ProductList(name, id2), analyticsLocation, analyticElement, null, 16, null));
    }

    public final void zoijcleaow() {
        nufgyqmvbu(new gxszxtbevo(AnalyticsPage.MainScreen.f92334iwizpuwonk, AnalyticsPage.Search.f92373iwizpuwonk, null, null, null, 28, null));
    }
}
