package aq0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vm0.zoijcleaow f14141iobyxmoadg;

    public iobyxmoadg(vm0.zoijcleaow analyticsTracker) {
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        this.f14141iobyxmoadg = analyticsTracker;
    }

    private final void agtfadlqog(AnalyticElement analyticElement, AnalyticsLocation.Search search) {
        this.f14141iobyxmoadg.wkgbmnqykc(new xm0.nufgyqmvbu(new xm0.nufgyqmvbu.iobyxmoadg(search, analyticElement)));
    }

    private final void btonecajqb(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        this.f14141iobyxmoadg.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(AnalyticsPage.Search.f92373iwizpuwonk, analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    static /* synthetic */ void gtknphoqwx(iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        iobyxmoadgVar.btonecajqb(analyticsPage, analyticElement, analyticsLocation);
    }

    public final void draadjrbmk(String article, String productName) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(productName, "productName");
        gtknphoqwx(this, new AnalyticsPage.ItemDetail(article, productName), new AnalyticElement.ProductItemElement(article, productName), null, 4, null);
        agtfadlqog(new AnalyticElement.SearchItemElement.Item(article, productName), AnalyticsLocation.Search.Item.f92285iwizpuwonk);
    }

    public final void dxjokdxxww(String history) {
        zdlpuopuiu.btonecajqb(history, "history");
        agtfadlqog(new AnalyticElement.SearchItemElement.History(history), AnalyticsLocation.Search.History.f92284iwizpuwonk);
    }

    public final void eablkybsjg(String query) {
        zdlpuopuiu.btonecajqb(query, "query");
        this.f14141iobyxmoadg.ppxfxbqfkf(new ym0.nufgyqmvbu.zoijcleaow(query));
    }

    public final void gxszxtbevo() {
        this.f14141iobyxmoadg.zoijcleaow(ym0.nufgyqmvbu.iobyxmoadg.f125948gxszxtbevo);
    }

    public final xm0.zoijcleaow.C3095zoijcleaow iobyxmoadg(String productArticle, String productName, boolean z13, String str) {
        zdlpuopuiu.btonecajqb(productArticle, "productArticle");
        zdlpuopuiu.btonecajqb(productName, "productName");
        return new xm0.zoijcleaow.C3095zoijcleaow(AnalyticsPage.Search.f92373iwizpuwonk, z13 ? new AnalyticsLocation.Search.Recommendations(str) : null, new AnalyticElement.ProductItemElement(productArticle, productName));
    }

    public final void lqeggnwhkg() {
        this.f14141iobyxmoadg.zoijcleaow(new ym0.nufgyqmvbu.zoijcleaow(null, 1, null));
    }

    public final void nufgyqmvbu() {
        gtknphoqwx(this, AnalyticsPage.ProductListFilters.f92355iwizpuwonk, null, null, 6, null);
    }

    public final void ojitshcjhn(String id2, String title) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        agtfadlqog(new AnalyticElement.SearchItemElement.Categories(id2, title), AnalyticsLocation.Search.Category.f92282iwizpuwonk);
    }

    public final AnalyticsPayload ppxfxbqfkf(String id2, String name) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        AnalyticElement.SearchItemElement.Features features = new AnalyticElement.SearchItemElement.Features(id2, name);
        return new AnalyticsPayload(AnalyticsPage.Search.f92373iwizpuwonk, AnalyticsLocation.Search.Features.f92283iwizpuwonk, features);
    }

    public final void rgvfuqvkyq(String query) {
        zdlpuopuiu.btonecajqb(query, "query");
        agtfadlqog(new AnalyticElement.SearchItemElement.Suggestions(query), AnalyticsLocation.Search.Suggestions.f92288iwizpuwonk);
    }

    public final void vdvldrhtss(String query) {
        zdlpuopuiu.btonecajqb(query, "query");
        agtfadlqog(new AnalyticElement.SearchItemElement.Query(query), AnalyticsLocation.Search.Query.f92286iwizpuwonk);
    }

    public final void wflxmlrfwp(String article, String productName, String str) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(productName, "productName");
        gtknphoqwx(this, new AnalyticsPage.ItemDetail(article, productName), null, new AnalyticsLocation.Search.Recommendations(str), 2, null);
    }

    public final void wkgbmnqykc() {
        this.f14141iobyxmoadg.ppxfxbqfkf(ym0.nufgyqmvbu.iobyxmoadg.f125948gxszxtbevo);
    }

    public final ChangeProductAnalyticParams zoijcleaow(String productName, boolean z13, String str) {
        zdlpuopuiu.btonecajqb(productName, "productName");
        AnalyticsPage.Search search = AnalyticsPage.Search.f92373iwizpuwonk;
        Boolean boolValueOf = Boolean.valueOf(z13);
        if (!z13) {
            boolValueOf = null;
        }
        return new ChangeProductAnalyticParams(search, boolValueOf != null ? new AnalyticsLocation.Search.Recommendations(str) : null, productName);
    }
}
