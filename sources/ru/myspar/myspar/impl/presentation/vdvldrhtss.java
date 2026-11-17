package ru.myspar.myspar.impl.presentation;

import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.catalog.api.model.ProductListPayload;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.catalog.api.model.SubCatalogArgs;
import ru.myspar.domain.feature.specificrestaurant.store.SpecificRestaurantArgs;
import ru.myspar.orders.api.model.SpecificOrderArgs;
import ru.myspar.videoplayer.api.model.VideoPlayerArgs;
import ru.myspar.webview_screen.api.models.SpecialProductsWebViewArgs;

/* JADX INFO: loaded from: classes4.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ah0.iobyxmoadg f90826btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final qm.iobyxmoadg f90827dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ya2.iobyxmoadg f90828eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gg0.iobyxmoadg f90829gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j00.wkgbmnqykc f90830iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final wi0.iobyxmoadg f90831lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final q12.iobyxmoadg f90832nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ro.iobyxmoadg f90833ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lq.iobyxmoadg f90834wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final sa2.iobyxmoadg f90835zoijcleaow;

    public vdvldrhtss(j00.wkgbmnqykc optionsInteractor, sa2.iobyxmoadg videoPlayerFeatureApi, ro.iobyxmoadg authFeatureApi, lq.iobyxmoadg catalogFeatureApi, ya2.iobyxmoadg webViewScreenFeatureApi, gg0.iobyxmoadg menuFeatureApi, wi0.iobyxmoadg ordersFeatureApi, q12.iobyxmoadg scanGoFeatureApi, qm.iobyxmoadg addressFeatureApi, ah0.iobyxmoadg mySparOpenScreenAnalytics) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(optionsInteractor, "optionsInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(videoPlayerFeatureApi, "videoPlayerFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(webViewScreenFeatureApi, "webViewScreenFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(menuFeatureApi, "menuFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ordersFeatureApi, "ordersFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoFeatureApi, "scanGoFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mySparOpenScreenAnalytics, "mySparOpenScreenAnalytics");
        this.f90830iobyxmoadg = optionsInteractor;
        this.f90835zoijcleaow = videoPlayerFeatureApi;
        this.f90833ppxfxbqfkf = authFeatureApi;
        this.f90834wkgbmnqykc = catalogFeatureApi;
        this.f90828eablkybsjg = webViewScreenFeatureApi;
        this.f90829gxszxtbevo = menuFeatureApi;
        this.f90831lqeggnwhkg = ordersFeatureApi;
        this.f90832nufgyqmvbu = scanGoFeatureApi;
        this.f90827dxjokdxxww = addressFeatureApi;
        this.f90826btonecajqb = mySparOpenScreenAnalytics;
    }

    public static /* synthetic */ void lqeggnwhkg(vdvldrhtss vdvldrhtssVar, ProductListPayload productListPayload, AnalyticsLocation analyticsLocation, AnalyticElement analyticElement, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticsLocation = null;
        }
        if ((i13 & 4) != 0) {
            analyticElement = null;
        }
        vdvldrhtssVar.gxszxtbevo(productListPayload, analyticsLocation, analyticElement);
    }

    private final void ppxfxbqfkf(l9.vdvldrhtss vdvldrhtssVar) {
        d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(vdvldrhtssVar);
    }

    private final void zoijcleaow(l9.vdvldrhtss vdvldrhtssVar) {
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().draadjrbmk(vdvldrhtssVar);
    }

    public final void agtfadlqog(SpecificRestaurantArgs args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        zoijcleaow(ru.myspar.legacy.presentation.screen.specificrestaurant.zoijcleaow.zoijcleaow(args));
    }

    public final void btonecajqb() {
        zoijcleaow(this.f90832nufgyqmvbu.ppxfxbqfkf());
    }

    public final void draadjrbmk(SpecificOrderArgs args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        ppxfxbqfkf(this.f90831lqeggnwhkg.zoijcleaow(args));
    }

    public final void dxjokdxxww() {
        zoijcleaow(ro.iobyxmoadg.lqeggnwhkg(this.f90833ppxfxbqfkf, null, 1, null));
    }

    public final void eablkybsjg() {
        zoijcleaow(this.f90833ppxfxbqfkf.ppxfxbqfkf(new NonAuthorizedPayload(NonAuthorizedPayload.zoijcleaow.BUY, null, 2, null)));
    }

    public final void gtknphoqwx(SpecialProductsWebViewArgs args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        zoijcleaow(this.f90828eablkybsjg.gxszxtbevo(args));
    }

    public final void gxszxtbevo(ProductListPayload args, AnalyticsLocation analyticsLocation, AnalyticElement analyticElement) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        ah0.iobyxmoadg iobyxmoadgVar = this.f90826btonecajqb;
        String brandId = args.getBrandId();
        if (brandId == null) {
            brandId = "";
        }
        String productsTitle = args.getProductsTitle();
        iobyxmoadgVar.ppxfxbqfkf(brandId, productsTitle != null ? productsTitle : "", analyticElement, analyticsLocation);
        zoijcleaow(this.f90834wkgbmnqykc.lqeggnwhkg(args));
    }

    public final void iobyxmoadg() {
        zoijcleaow(ro.iobyxmoadg.nufgyqmvbu(this.f90833ppxfxbqfkf, null, 1, null));
    }

    public final void nufgyqmvbu(String promotionId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promotionId, "promotionId");
        zoijcleaow(this.f90830iobyxmoadg.btonecajqb(promotionId) ? ru.myspar.legacy.presentation.screen.promotiononboarding.zoijcleaow.zoijcleaow() : ru.myspar.legacy.presentation.screen.promotion.zoijcleaow.zoijcleaow());
    }

    public final void ojitshcjhn(SubCatalogArgs args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        ah0.iobyxmoadg iobyxmoadgVar = this.f90826btonecajqb;
        String parentId = args.getParentId();
        String title = args.getTitle();
        if (title == null) {
            title = "";
        }
        iobyxmoadgVar.iobyxmoadg(parentId, title);
        zoijcleaow(lq.iobyxmoadg.iobyxmoadg(this.f90834wkgbmnqykc, args, false, 2, null));
    }

    public final void rgvfuqvkyq(VideoPlayerArgs args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        this.f90826btonecajqb.nufgyqmvbu();
        zoijcleaow(this.f90835zoijcleaow.iobyxmoadg(args));
    }

    public final void vdvldrhtss(boolean z13) {
        zoijcleaow(this.f90827dxjokdxxww.ppxfxbqfkf(new rm.wkgbmnqykc.zoijcleaow(z13)));
    }

    public final void wflxmlrfwp(ProductPayload args, String productArticle, String productName, AnalyticsLocation location, AnalyticElement element) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productArticle, "productArticle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productName, "productName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        this.f90826btonecajqb.zoijcleaow(productArticle, productName, element, location);
        ppxfxbqfkf(this.f90834wkgbmnqykc.gxszxtbevo(args));
    }

    public final void wkgbmnqykc() {
        this.f90826btonecajqb.wkgbmnqykc();
        ppxfxbqfkf(this.f90829gxszxtbevo.iobyxmoadg());
    }
}
