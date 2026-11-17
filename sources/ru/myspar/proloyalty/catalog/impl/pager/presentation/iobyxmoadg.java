package ru.myspar.proloyalty.catalog.impl.pager.presentation;

import androidx.lifecycle.pkzmftpjix;
import bs0.rgvfuqvkyq;
import bs0.vdvldrhtss;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import kp0.eablkybsjg;
import kp0.lqeggnwhkg;
import kp0.wkgbmnqykc;
import lg.gxszxtbevo;
import lp0.nufgyqmvbu;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.catalog.api.model.ProductListPayload;
import ru.myspar.proloyalty.catalog.api.model.SearchPayload;
import ru.myspar.proloyalty.catalog.api.model.SubCatalogArgs;
import ru.myspar.proloyalty.catalog.impl.pager.domain.store.State;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogSection;
import ru.myspar.proloyalty.core.domain.models.delivery.CatalogPagerAddressData;
import ru.myspar.proloyalty.core.domain.models.payload.EditOrderPayload;
import ru.myspar.proloyalty.core.domain.models.restaurants.Restaurant;
import ru.myspar.proloyalty.domain.feature.specificrestaurant.store.SpecificRestaurantArgs;
import ru.myspar.proloyalty.legacy.presentation.screen.editorder.yggfygwlhe;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final vm0.zoijcleaow f93145agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final n91.iobyxmoadg f93146btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final q41.iobyxmoadg f93147draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final xo0.iobyxmoadg f93148gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final bl0.iobyxmoadg f93149ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final draadjrbmk f93150rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final draadjrbmk f93151vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final hn1.iobyxmoadg f93152wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, n91.iobyxmoadg colorsUiModelMapper, xo0.iobyxmoadg catalogFeatureApi, q41.iobyxmoadg resourcesManager, hn1.iobyxmoadg scanFeatureApi, vm0.zoijcleaow analyticsTracker, bl0.iobyxmoadg addressFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(scanFeatureApi, "scanFeatureApi");
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        this.f93146btonecajqb = colorsUiModelMapper;
        this.f93148gtknphoqwx = catalogFeatureApi;
        this.f93147draadjrbmk = resourcesManager;
        this.f93152wflxmlrfwp = scanFeatureApi;
        this.f93145agtfadlqog = analyticsTracker;
        this.f93149ojitshcjhn = addressFeatureApi;
        this.f93150rgvfuqvkyq = new draadjrbmk() { // from class: lp0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.catalog.impl.pager.presentation.iobyxmoadg.jlmebxxoox(this.f63766zdlpuopuiu, (State) obj);
            }
        };
        this.f93151vdvldrhtss = new draadjrbmk() { // from class: lp0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.catalog.impl.pager.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.catalog.impl.pager.presentation.zoijcleaow) obj);
            }
        };
    }

    private final jp0.zoijcleaow crxdokpmqz(Restaurant restaurant) {
        return new jp0.zoijcleaow(restaurant.getCode(), restaurant.getName(), restaurant.getLogo(), restaurant.getImage(), restaurant.getAvgOrderTime(), this.f93147draadjrbmk.getString(vk0.lqeggnwhkg.proloyalty_restaurant_min_order_sum_format, String.valueOf(vg.iobyxmoadg.ppxfxbqfkf(restaurant.getMinOrderSum()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu jlmebxxoox(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        jp0.iobyxmoadg selectedTab = state.getSelectedTab();
        boolean z13 = state.getIsRestaurantsEnabled() && !state.getArgs().eablkybsjg();
        boolean isLoading = state.getIsLoading();
        List sections = state.getSections();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(sections, 10));
        Iterator it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(ip0.iobyxmoadg.iobyxmoadg((CatalogSection) it.next(), iobyxmoadgVar.f93146btonecajqb));
        }
        CatalogPagerAddressData addressData = state.getAddressData();
        String address = addressData != null ? addressData.getAddress() : null;
        String str = address == null ? "" : address;
        CatalogPagerAddressData addressData2 = state.getAddressData();
        String deliveryType = addressData2 != null ? addressData2.getDeliveryType() : null;
        String str2 = deliveryType == null ? "" : deliveryType;
        String strPpxfxbqfkf = dxjokdxxww.ppxfxbqfkf();
        CatalogPagerAddressData addressData3 = state.getAddressData();
        rgvfuqvkyq rgvfuqvkyqVarIobyxmoadg = vdvldrhtss.iobyxmoadg(str, str2, strPpxfxbqfkf, addressData3 != null ? addressData3.getIsCartHasAddress() : false, state.getIsLoading(), false);
        List restaurants = state.getRestaurants();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(restaurants, 10));
        Iterator it2 = restaurants.iterator();
        while (it2.hasNext()) {
            arrayList2.add(iobyxmoadgVar.crxdokpmqz((Restaurant) it2.next()));
        }
        return new nufgyqmvbu(selectedTab, z13, arrayList, isLoading, null, rgvfuqvkyqVarIobyxmoadg, arrayList2, state.getArgs().eablkybsjg(), 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        wkgbmnqykc c1208wkgbmnqykc;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.nufgyqmvbu) {
            return wkgbmnqykc.nufgyqmvbu.f60323iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.lqeggnwhkg) {
            return wkgbmnqykc.lqeggnwhkg.f60322iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return wkgbmnqykc.iobyxmoadg.f60321iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.eablkybsjg) {
            c1208wkgbmnqykc = new wkgbmnqykc.eablkybsjg(((zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.C2183zoijcleaow) {
            c1208wkgbmnqykc = new wkgbmnqykc.zoijcleaow(((zoijcleaow.C2183zoijcleaow) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf) {
            zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = (zoijcleaow.ppxfxbqfkf) zoijcleaowVar;
            c1208wkgbmnqykc = new wkgbmnqykc.ppxfxbqfkf(ppxfxbqfkfVar.iobyxmoadg().getItemId(), ppxfxbqfkfVar.iobyxmoadg().btonecajqb());
        } else {
            if (zoijcleaowVar instanceof zoijcleaow.gtknphoqwx) {
                return wkgbmnqykc.gtknphoqwx.f60319iobyxmoadg;
            }
            if (zoijcleaowVar instanceof zoijcleaow.dxjokdxxww) {
                c1208wkgbmnqykc = new wkgbmnqykc.dxjokdxxww(((zoijcleaow.dxjokdxxww) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof zoijcleaow.btonecajqb) {
                c1208wkgbmnqykc = new wkgbmnqykc.btonecajqb(((zoijcleaow.btonecajqb) zoijcleaowVar).iobyxmoadg());
            } else {
                if (!(zoijcleaowVar instanceof zoijcleaow.wkgbmnqykc)) {
                    if (zoijcleaowVar instanceof zoijcleaow.gxszxtbevo) {
                        return wkgbmnqykc.gxszxtbevo.f60320iobyxmoadg;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c1208wkgbmnqykc = new wkgbmnqykc.C1208wkgbmnqykc(((zoijcleaow.wkgbmnqykc) zoijcleaowVar).iobyxmoadg());
            }
        }
        return c1208wkgbmnqykc;
    }

    private final void sopmlzcsov(String str) {
        i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.zoijcleaow.zoijcleaow(new SpecificRestaurantArgs(str)));
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f93150rgvfuqvkyq;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f93151vdvldrhtss;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.lqeggnwhkg) {
            this.f93145agtfadlqog.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(AnalyticsPage.Catalog.f92304iwizpuwonk, AnalyticsPage.Search.f92373iwizpuwonk, null, null, null, 28, null)));
            eablkybsjg.lqeggnwhkg lqeggnwhkgVar = (eablkybsjg.lqeggnwhkg) eablkybsjgVar;
            i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(ru.myspar.proloyalty.catalog.impl.search.ppxfxbqfkf.zoijcleaow(lqeggnwhkgVar.iobyxmoadg().eablkybsjg() ? new SearchPayload(mz0.iobyxmoadg.ORDER_EDIT, lqeggnwhkgVar.iobyxmoadg().getOrderEditId(), null, null, 12, null) : new SearchPayload(null, null, null, null, 15, null)));
        } else {
            if (!(eablkybsjgVar instanceof eablkybsjg.gxszxtbevo)) {
                if (eablkybsjgVar instanceof eablkybsjg.nufgyqmvbu) {
                    Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.C2182ppxfxbqfkf(((eablkybsjg.nufgyqmvbu) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof eablkybsjg.dxjokdxxww) {
                    Object objCllcsxoeiz2 = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.dxjokdxxww) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
                    eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (eablkybsjg.wkgbmnqykc) eablkybsjgVar;
                    this.f93145agtfadlqog.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(AnalyticsPage.Catalog.f92304iwizpuwonk, new AnalyticsPage.SubCatalog(wkgbmnqykcVar.wkgbmnqykc(), wkgbmnqykcVar.zoijcleaow()), null, null, null, 28, null)));
                    i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(xo0.iobyxmoadg.eablkybsjg(this.f93148gtknphoqwx, new SubCatalogArgs(wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.wkgbmnqykc()), false, 2, null));
                } else if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
                    eablkybsjg.iobyxmoadg iobyxmoadgVar = (eablkybsjg.iobyxmoadg) eablkybsjgVar;
                    this.f93145agtfadlqog.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(AnalyticsPage.Catalog.f92304iwizpuwonk, new AnalyticsPage.ProductList(iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.zoijcleaow()), null, null, null, 28, null)));
                    i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f93148gtknphoqwx.nufgyqmvbu(new ProductListPayload(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow(), null, null, iobyxmoadgVar.eablkybsjg(), null, iobyxmoadgVar.wkgbmnqykc(), false, 344, null)));
                } else if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
                    sopmlzcsov(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg());
                } else if (eablkybsjgVar instanceof eablkybsjg.C1200eablkybsjg) {
                    i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().eablkybsjg(yggfygwlhe.zoijcleaow(new EditOrderPayload(((eablkybsjg.C1200eablkybsjg) eablkybsjgVar).iobyxmoadg(), false, 2, null)));
                } else {
                    if (!(eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf)) {
                        if (!(eablkybsjgVar instanceof eablkybsjg.btonecajqb)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Object objCllcsxoeiz3 = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f93155iobyxmoadg, gxszxtbevoVar);
                        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
                    }
                    eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (eablkybsjg.ppxfxbqfkf) eablkybsjgVar;
                    i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f93149ojitshcjhn.ppxfxbqfkf(new cl0.wkgbmnqykc.iobyxmoadg(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.iobyxmoadg())));
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            this.f93145agtfadlqog.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(AnalyticsPage.Catalog.f92304iwizpuwonk, AnalyticsPage.Scan.f92372iwizpuwonk, null, null, null, 28, null)));
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(hn1.iobyxmoadg.iobyxmoadg(this.f93152wflxmlrfwp, null, 1, null));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
