package ru.myspar.proloyalty.myspar.impl.presentation;

import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.catalog.api.model.ProductListPayload;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.catalog.api.model.SearchPayload;
import ru.myspar.proloyalty.catalog.api.model.SubCatalogArgs;
import ru.myspar.proloyalty.domain.feature.specificrestaurant.store.SpecificRestaurantArgs;
import ru.myspar.proloyalty.orders.api.model.SpecificOrderArgs;
import ru.myspar.proloyalty.videoplayer.api.model.VideoPlayerArgs;
import ru.myspar.proloyalty.webview_screen.api.models.SpecialProductsWebViewArgs;

/* JADX INFO: loaded from: classes5.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final fe1.iobyxmoadg f98171dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final vw1.iobyxmoadg f98172eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ld1.iobyxmoadg f98173gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bz0.ppxfxbqfkf f98174iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final wf1.iobyxmoadg f98175lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final mn1.iobyxmoadg f98176nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final an0.iobyxmoadg f98177ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final xo0.iobyxmoadg f98178wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pw1.iobyxmoadg f98179zoijcleaow;

    public rgvfuqvkyq(bz0.ppxfxbqfkf optionsInteractor, pw1.iobyxmoadg videoPlayerFeatureApi, an0.iobyxmoadg authFeatureApi, xo0.iobyxmoadg catalogFeatureApi, vw1.iobyxmoadg webViewScreenFeatureApi, ld1.iobyxmoadg menuFeatureApi, wf1.iobyxmoadg ordersFeatureApi, mn1.iobyxmoadg scanGoFeatureApi, fe1.iobyxmoadg mySparOpenScreenAnalytics) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(optionsInteractor, "optionsInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(videoPlayerFeatureApi, "videoPlayerFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(webViewScreenFeatureApi, "webViewScreenFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(menuFeatureApi, "menuFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ordersFeatureApi, "ordersFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoFeatureApi, "scanGoFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mySparOpenScreenAnalytics, "mySparOpenScreenAnalytics");
        this.f98174iobyxmoadg = optionsInteractor;
        this.f98179zoijcleaow = videoPlayerFeatureApi;
        this.f98177ppxfxbqfkf = authFeatureApi;
        this.f98178wkgbmnqykc = catalogFeatureApi;
        this.f98172eablkybsjg = webViewScreenFeatureApi;
        this.f98173gxszxtbevo = menuFeatureApi;
        this.f98175lqeggnwhkg = ordersFeatureApi;
        this.f98176nufgyqmvbu = scanGoFeatureApi;
        this.f98171dxjokdxxww = mySparOpenScreenAnalytics;
    }

    public static /* synthetic */ void gxszxtbevo(rgvfuqvkyq rgvfuqvkyqVar, ProductListPayload productListPayload, AnalyticsLocation analyticsLocation, AnalyticElement analyticElement, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticsLocation = null;
        }
        if ((i13 & 4) != 0) {
            analyticElement = null;
        }
        rgvfuqvkyqVar.eablkybsjg(productListPayload, analyticsLocation, analyticElement);
    }

    private final void ppxfxbqfkf(l9.vdvldrhtss vdvldrhtssVar) {
        i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(vdvldrhtssVar);
    }

    private final void zoijcleaow(l9.vdvldrhtss vdvldrhtssVar) {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().draadjrbmk(vdvldrhtssVar);
    }

    public final void agtfadlqog(SubCatalogArgs args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        fe1.iobyxmoadg iobyxmoadgVar = this.f98171dxjokdxxww;
        String parentId = args.getParentId();
        String title = args.getTitle();
        if (title == null) {
            title = "";
        }
        iobyxmoadgVar.iobyxmoadg(parentId, title);
        zoijcleaow(xo0.iobyxmoadg.eablkybsjg(this.f98178wkgbmnqykc, args, false, 2, null));
    }

    public final void btonecajqb(SpecialProductsWebViewArgs args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        zoijcleaow(this.f98172eablkybsjg.eablkybsjg(args));
    }

    public final void draadjrbmk(ProductPayload args, String productArticle, String productName, AnalyticsLocation location, AnalyticElement element) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productName, "productName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        this.f98171dxjokdxxww.ppxfxbqfkf(productArticle, productName, element, location);
        ppxfxbqfkf(this.f98178wkgbmnqykc.gxszxtbevo(args));
    }

    public final void dxjokdxxww() {
        this.f98171dxjokdxxww.zoijcleaow();
        ppxfxbqfkf(this.f98178wkgbmnqykc.iobyxmoadg(new SearchPayload(null, null, null, null, 15, null)));
    }

    public final void eablkybsjg(ProductListPayload args, AnalyticsLocation analyticsLocation, AnalyticElement analyticElement) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        fe1.iobyxmoadg iobyxmoadgVar = this.f98171dxjokdxxww;
        String brandId = args.getBrandId();
        if (brandId == null) {
            brandId = "";
        }
        String productsTitle = args.getProductsTitle();
        iobyxmoadgVar.wkgbmnqykc(brandId, productsTitle != null ? productsTitle : "", analyticElement, analyticsLocation);
        zoijcleaow(this.f98178wkgbmnqykc.nufgyqmvbu(args));
    }

    public final void gtknphoqwx(SpecificOrderArgs args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        ppxfxbqfkf(this.f98175lqeggnwhkg.iobyxmoadg(args));
    }

    public final void iobyxmoadg() {
        zoijcleaow(this.f98177ppxfxbqfkf.eablkybsjg());
    }

    public final void lqeggnwhkg(String promotionId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promotionId, "promotionId");
        zoijcleaow(this.f98174iobyxmoadg.dxjokdxxww(promotionId) ? ru.myspar.proloyalty.legacy.presentation.screen.promotiononboarding.zoijcleaow.zoijcleaow() : ru.myspar.proloyalty.legacy.presentation.screen.promotion.zoijcleaow.zoijcleaow());
    }

    public final void nufgyqmvbu() {
        zoijcleaow(this.f98176nufgyqmvbu.ppxfxbqfkf());
    }

    public final void ojitshcjhn(VideoPlayerArgs args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        this.f98171dxjokdxxww.dxjokdxxww();
        zoijcleaow(this.f98179zoijcleaow.iobyxmoadg(args));
    }

    public final void wflxmlrfwp(SpecificRestaurantArgs args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        zoijcleaow(ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.zoijcleaow.zoijcleaow(args));
    }

    public final void wkgbmnqykc() {
        this.f98171dxjokdxxww.eablkybsjg();
        ppxfxbqfkf(this.f98173gxszxtbevo.iobyxmoadg());
    }
}
