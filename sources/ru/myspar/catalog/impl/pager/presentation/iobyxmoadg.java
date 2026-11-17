package ru.myspar.catalog.impl.pager.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pm.dxjokdxxww;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.catalog.api.model.ProductListPayload;
import ru.myspar.catalog.api.model.SearchPayload;
import ru.myspar.catalog.api.model.SubCatalogArgs;
import ru.myspar.catalog.impl.pager.domain.store.State;
import ru.myspar.catalog.impl.search.wflxmlrfwp;
import ru.myspar.core.domain.models.catalog.CatalogSection;
import ru.myspar.core.domain.models.delivery.CatalogPagerAddressData;
import ru.myspar.core.domain.models.payload.EditOrderPayload;
import ru.myspar.core.domain.models.restaurants.Restaurant;
import ru.myspar.domain.feature.specificrestaurant.store.SpecificRestaurantArgs;
import ru.myspar.legacy.presentation.screen.editorder.yggfygwlhe;
import tg.draadjrbmk;
import yq.eablkybsjg;
import yq.lqeggnwhkg;
import yq.wkgbmnqykc;
import zq.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final qm.iobyxmoadg f85220agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ob0.iobyxmoadg f85221btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final d60.iobyxmoadg f85222draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lq.iobyxmoadg f85223gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final draadjrbmk f85224ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final draadjrbmk f85225rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final lo.zoijcleaow f85226wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ob0.iobyxmoadg colorsUiModelMapper, lq.iobyxmoadg catalogFeatureApi, d60.iobyxmoadg resourcesManager, lo.zoijcleaow analyticsTracker, qm.iobyxmoadg addressFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        this.f85221btonecajqb = colorsUiModelMapper;
        this.f85223gtknphoqwx = catalogFeatureApi;
        this.f85222draadjrbmk = resourcesManager;
        this.f85226wflxmlrfwp = analyticsTracker;
        this.f85220agtfadlqog = addressFeatureApi;
        this.f85224ojitshcjhn = new draadjrbmk() { // from class: zq.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.catalog.impl.pager.presentation.iobyxmoadg.jlmebxxoox(this.f130920zdlpuopuiu, (State) obj);
            }
        };
        this.f85225rgvfuqvkyq = new draadjrbmk() { // from class: zq.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.catalog.impl.pager.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.catalog.impl.pager.presentation.zoijcleaow) obj);
            }
        };
    }

    private final xq.zoijcleaow crxdokpmqz(Restaurant restaurant) {
        return new xq.zoijcleaow(restaurant.getCode(), restaurant.getName(), restaurant.getLogo(), restaurant.getImage(), restaurant.getAvgOrderTime(), this.f85222draadjrbmk.getString(dxjokdxxww.restaurant_min_order_sum_format, String.valueOf(vg.iobyxmoadg.ppxfxbqfkf(restaurant.getMinOrderSum()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu jlmebxxoox(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        xq.iobyxmoadg selectedTab = state.getSelectedTab();
        boolean z13 = state.getIsRestaurantsEnabled() && !state.getArgs().eablkybsjg();
        boolean isLoading = state.getIsLoading();
        List sections = state.getSections();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(sections, 10));
        Iterator it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(wq.iobyxmoadg.zoijcleaow((CatalogSection) it.next(), iobyxmoadgVar.f85221btonecajqb));
        }
        CatalogPagerAddressData addressData = state.getAddressData();
        String address = addressData != null ? addressData.getAddress() : null;
        if (address == null) {
            address = "";
        }
        CatalogPagerAddressData addressData2 = state.getAddressData();
        String deliveryType = addressData2 != null ? addressData2.getDeliveryType() : null;
        String str = deliveryType != null ? deliveryType : "";
        String strPpxfxbqfkf = k30.draadjrbmk.ppxfxbqfkf();
        CatalogPagerAddressData addressData3 = state.getAddressData();
        ht.nufgyqmvbu nufgyqmvbuVarIobyxmoadg = ht.dxjokdxxww.iobyxmoadg(address, str, strPpxfxbqfkf, addressData3 != null ? addressData3.getIsCartHasAddress() : false);
        List restaurants = state.getRestaurants();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(restaurants, 10));
        Iterator it2 = restaurants.iterator();
        while (it2.hasNext()) {
            arrayList2.add(iobyxmoadgVar.crxdokpmqz((Restaurant) it2.next()));
        }
        return new nufgyqmvbu(selectedTab, z13, arrayList, isLoading, null, nufgyqmvbuVarIobyxmoadg, arrayList2, state.getArgs().eablkybsjg(), 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        wkgbmnqykc c3217wkgbmnqykc;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.nufgyqmvbu) {
            return wkgbmnqykc.nufgyqmvbu.f126252iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.lqeggnwhkg) {
            return wkgbmnqykc.lqeggnwhkg.f126251iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return wkgbmnqykc.iobyxmoadg.f126250iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.eablkybsjg) {
            c3217wkgbmnqykc = new wkgbmnqykc.eablkybsjg(((zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.C1941zoijcleaow) {
            c3217wkgbmnqykc = new wkgbmnqykc.zoijcleaow(((zoijcleaow.C1941zoijcleaow) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf) {
            zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = (zoijcleaow.ppxfxbqfkf) zoijcleaowVar;
            c3217wkgbmnqykc = new wkgbmnqykc.ppxfxbqfkf(ppxfxbqfkfVar.iobyxmoadg().getItemId(), ppxfxbqfkfVar.iobyxmoadg().btonecajqb());
        } else {
            if (zoijcleaowVar instanceof zoijcleaow.gtknphoqwx) {
                return wkgbmnqykc.gtknphoqwx.f126248iobyxmoadg;
            }
            if (zoijcleaowVar instanceof zoijcleaow.dxjokdxxww) {
                c3217wkgbmnqykc = new wkgbmnqykc.dxjokdxxww(((zoijcleaow.dxjokdxxww) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof zoijcleaow.btonecajqb) {
                c3217wkgbmnqykc = new wkgbmnqykc.btonecajqb(((zoijcleaow.btonecajqb) zoijcleaowVar).iobyxmoadg());
            } else {
                if (!(zoijcleaowVar instanceof zoijcleaow.wkgbmnqykc)) {
                    if (zoijcleaowVar instanceof zoijcleaow.gxszxtbevo) {
                        return wkgbmnqykc.gxszxtbevo.f126249iobyxmoadg;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c3217wkgbmnqykc = new wkgbmnqykc.C3217wkgbmnqykc(((zoijcleaow.wkgbmnqykc) zoijcleaowVar).iobyxmoadg());
            }
        }
        return c3217wkgbmnqykc;
    }

    private final void sopmlzcsov(String str) {
        d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(ru.myspar.legacy.presentation.screen.specificrestaurant.zoijcleaow.zoijcleaow(new SpecificRestaurantArgs(str)));
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f85224ojitshcjhn;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f85225rgvfuqvkyq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.lqeggnwhkg) {
            this.f85226wflxmlrfwp.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(AnalyticsPage.Catalog.f84276iwizpuwonk, AnalyticsPage.Search.f84345iwizpuwonk, null, null, null, 28, null)));
            eablkybsjg.lqeggnwhkg lqeggnwhkgVar = (eablkybsjg.lqeggnwhkg) eablkybsjgVar;
            d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(wflxmlrfwp.zoijcleaow(lqeggnwhkgVar.iobyxmoadg().eablkybsjg() ? new SearchPayload(v00.iobyxmoadg.ORDER_EDIT, lqeggnwhkgVar.iobyxmoadg().getOrderEditId(), null, null, 12, null) : new SearchPayload(null, null, null, null, 15, null)));
        } else {
            if (!(eablkybsjgVar instanceof eablkybsjg.gxszxtbevo)) {
                if (eablkybsjgVar instanceof eablkybsjg.nufgyqmvbu) {
                    Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.C1940ppxfxbqfkf(((eablkybsjg.nufgyqmvbu) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof eablkybsjg.dxjokdxxww) {
                    Object objCllcsxoeiz2 = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.dxjokdxxww) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
                    eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (eablkybsjg.wkgbmnqykc) eablkybsjgVar;
                    this.f85226wflxmlrfwp.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(AnalyticsPage.Catalog.f84276iwizpuwonk, new AnalyticsPage.SubCatalog(wkgbmnqykcVar.wkgbmnqykc(), wkgbmnqykcVar.zoijcleaow()), null, null, null, 28, null)));
                    d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(lq.iobyxmoadg.iobyxmoadg(this.f85223gtknphoqwx, new SubCatalogArgs(wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.wkgbmnqykc()), false, 2, null));
                } else if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
                    eablkybsjg.iobyxmoadg iobyxmoadgVar = (eablkybsjg.iobyxmoadg) eablkybsjgVar;
                    this.f85226wflxmlrfwp.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(AnalyticsPage.Catalog.f84276iwizpuwonk, new AnalyticsPage.ProductList(iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.zoijcleaow()), null, null, null, 28, null)));
                    d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f85223gtknphoqwx.lqeggnwhkg(new ProductListPayload(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow(), null, null, iobyxmoadgVar.eablkybsjg(), null, iobyxmoadgVar.wkgbmnqykc(), false, 344, null)));
                } else if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
                    sopmlzcsov(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg());
                } else if (eablkybsjgVar instanceof eablkybsjg.C3209eablkybsjg) {
                    d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().eablkybsjg(yggfygwlhe.zoijcleaow(new EditOrderPayload(((eablkybsjg.C3209eablkybsjg) eablkybsjgVar).iobyxmoadg(), false, 2, null)));
                } else {
                    if (!(eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf)) {
                        if (!(eablkybsjgVar instanceof eablkybsjg.btonecajqb)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Object objCllcsxoeiz3 = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f85229iobyxmoadg, gxszxtbevoVar);
                        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
                    }
                    eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (eablkybsjg.ppxfxbqfkf) eablkybsjgVar;
                    d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f85220agtfadlqog.ppxfxbqfkf(new rm.wkgbmnqykc.iobyxmoadg(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.iobyxmoadg())));
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            this.f85226wflxmlrfwp.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(AnalyticsPage.Catalog.f84276iwizpuwonk, AnalyticsPage.Scan.f84344iwizpuwonk, null, null, null, 28, null)));
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.legacy.presentation.screen.scanproduct.zoijcleaow.zoijcleaow());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
