package ru.myspar.catalog.impl.subcatalog.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import ds.btonecajqb;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import pj.cllcsxoeiz;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.catalog.api.model.ProductListPayload;
import ru.myspar.catalog.api.model.SearchPayload;
import ru.myspar.catalog.api.model.SubCatalogArgs;
import ru.myspar.catalog.impl.search.wflxmlrfwp;
import ru.myspar.catalog.impl.subcatalog.domain.store.State;
import ru.myspar.core.domain.models.catalog.CatalogBanner;
import ru.myspar.core.domain.models.catalog.CatalogSection;
import ru.myspar.core.domain.models.payload.EditOrderPayload;
import ru.myspar.core.navigation.model.AnalyticsPayload;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.legacy.presentation.screen.editorder.yggfygwlhe;
import ru.myspar.story.api.model.StoryPayload;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public static final C1974iobyxmoadg f86031agtfadlqog = new C1974iobyxmoadg(null);

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final int f86032ojitshcjhn = 8;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ob0.iobyxmoadg f86033btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f86034draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lq.iobyxmoadg f86035gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f86036wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.subcatalog.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1974iobyxmoadg {
        public /* synthetic */ C1974iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1974iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f86037jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f86039zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f86037jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f86037jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f86039zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                cs.wkgbmnqykc.nufgyqmvbu nufgyqmvbuVar = new cs.wkgbmnqykc.nufgyqmvbu(this.f86037jyumaefscl);
                this.f86039zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(nufgyqmvbuVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f86040jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f86042zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f86040jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f86040jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f86042zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                cs.wkgbmnqykc.eablkybsjg eablkybsjgVar = new cs.wkgbmnqykc.eablkybsjg(this.f86040jyumaefscl);
                this.f86042zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(eablkybsjgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(cs.lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ob0.iobyxmoadg colorsUiModelMapper, lq.iobyxmoadg catalogFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        this.f86033btonecajqb = colorsUiModelMapper;
        this.f86035gtknphoqwx = catalogFeatureApi;
        this.f86034draadjrbmk = new draadjrbmk() { // from class: ds.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.catalog.impl.subcatalog.presentation.iobyxmoadg.vipkmwdibw(this.f29416zdlpuopuiu, (State) obj);
            }
        };
        this.f86036wflxmlrfwp = new draadjrbmk() { // from class: ds.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.catalog.impl.subcatalog.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow) obj);
            }
        };
    }

    private final void crxdokpmqz(SubCatalogArgs subCatalogArgs, String str, String str2, v00.ppxfxbqfkf ppxfxbqfkfVar) {
        String str3;
        b40.wkgbmnqykc wkgbmnqykcVarKcexrzcfyt = d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt();
        lq.iobyxmoadg iobyxmoadgVar = this.f86035gtknphoqwx;
        v00.iobyxmoadg flow = subCatalogArgs.getFlow();
        String orderEditId = subCatalogArgs.getOrderEditId();
        if (str2 == null) {
            String title = subCatalogArgs.getTitle();
            if (title == null) {
                title = "";
            }
            str3 = title;
        } else {
            str3 = str2;
        }
        wkgbmnqykcVarKcexrzcfyt.lqeggnwhkg(iobyxmoadgVar.lqeggnwhkg(new ProductListPayload(flow, orderEditId, str, subCatalogArgs.getParentId(), null, str3, null, ppxfxbqfkfVar, false, 336, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cs.wkgbmnqykc ntlheqmsrt(ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow zoijcleaowVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.wkgbmnqykc) {
            return new cs.wkgbmnqykc.C0451wkgbmnqykc(((ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.wkgbmnqykc) zoijcleaowVar).iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.eablkybsjg.f86056iobyxmoadg)) {
            return cs.wkgbmnqykc.gxszxtbevo.f25635iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.gxszxtbevo.f86057iobyxmoadg)) {
            return cs.wkgbmnqykc.lqeggnwhkg.f25638iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.lqeggnwhkg.f86060iobyxmoadg)) {
            return cs.wkgbmnqykc.dxjokdxxww.f25633iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.nufgyqmvbu.f86061iobyxmoadg)) {
            return cs.wkgbmnqykc.btonecajqb.f25632iobyxmoadg;
        }
        if (zoijcleaowVar instanceof ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.ppxfxbqfkf) {
            return new cs.wkgbmnqykc.ppxfxbqfkf(((ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
        }
        if (zoijcleaowVar instanceof ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.iobyxmoadg) {
            ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.iobyxmoadg iobyxmoadgVar = (ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.iobyxmoadg) zoijcleaowVar;
            return new cs.wkgbmnqykc.iobyxmoadg(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.C1976zoijcleaow.f86064iobyxmoadg)) {
            return cs.wkgbmnqykc.zoijcleaow.f25642iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void sopmlzcsov(CatalogBanner catalogBanner, AnalyticsPage analyticsPage, String str) {
        d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(new NavigationPayload(catalogBanner.getNavigationLink(), catalogBanner.getReference(), catalogBanner.getTitle(), null, false, null, new AnalyticsPayload(analyticsPage, new AnalyticsLocation.BannerFeed(null, null, 3, null), new AnalyticElement.BannerItemElement(catalogBanner.getId(), str)), false, 184, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final btonecajqb vipkmwdibw(iobyxmoadg iobyxmoadgVar, State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        ArrayList arrayList = new ArrayList();
        if (!state.getBanners().isEmpty()) {
            arrayList.add(new es.draadjrbmk.iobyxmoadg("banners_item_id", wq.iobyxmoadg.iobyxmoadg(state.getBanners())));
        }
        if (!state.getItems().isEmpty()) {
            String title = state.getTitle();
            String titleImage = state.getTitleImage();
            if (titleImage == null || titleImage.length() <= 0) {
                titleImage = null;
            }
            arrayList.add(new es.draadjrbmk.zoijcleaow("header_item_id", title, titleImage));
        }
        for (CatalogSection catalogSection : state.getItems()) {
            arrayList.add(new es.draadjrbmk.ppxfxbqfkf(catalogSection.getId(), catalogSection.getName(), catalogSection.getAppImage(), catalogSection.getAdv(), catalogSection.getSortType()));
        }
        return new btonecajqb(arrayList, state.getTitle(), state.getIsLoading(), state.getIsInitialLoading(), iobyxmoadgVar.f86033btonecajqb.iobyxmoadg(state.getColorsModel()));
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f86034draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f86036wflxmlrfwp;
    }

    public final void jlmebxxoox(boolean z13) {
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new zoijcleaow(z13, null), 3, null);
    }

    public final void ribwqtqdhb(boolean z13) {
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new ppxfxbqfkf(z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(cs.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof cs.eablkybsjg.lqeggnwhkg) {
            Object objCllcsxoeiz = cllcsxoeiz(new ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf.zoijcleaow(((cs.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof cs.eablkybsjg.nufgyqmvbu) {
            d40.iobyxmoadg.f26931iobyxmoadg.istkbnxepw();
        } else if (eablkybsjgVar instanceof cs.eablkybsjg.wkgbmnqykc) {
            cs.eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (cs.eablkybsjg.wkgbmnqykc) eablkybsjgVar;
            crxdokpmqz(wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.wkgbmnqykc());
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, cs.eablkybsjg.C0445eablkybsjg.f25566iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.legacy.presentation.screen.scanproduct.zoijcleaow.zoijcleaow());
        } else if (eablkybsjgVar instanceof cs.eablkybsjg.gxszxtbevo) {
            cs.eablkybsjg.gxszxtbevo gxszxtbevoVar2 = (cs.eablkybsjg.gxszxtbevo) eablkybsjgVar;
            d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(wflxmlrfwp.zoijcleaow(new SearchPayload(gxszxtbevoVar2.iobyxmoadg().getFlow(), gxszxtbevoVar2.iobyxmoadg().getOrderEditId(), null, null, 12, null)));
        } else if (eablkybsjgVar instanceof cs.eablkybsjg.dxjokdxxww) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().eablkybsjg(yggfygwlhe.zoijcleaow(new EditOrderPayload(((cs.eablkybsjg.dxjokdxxww) eablkybsjgVar).iobyxmoadg(), false, 2, null)));
        } else if (eablkybsjgVar instanceof cs.eablkybsjg.ppxfxbqfkf) {
            cs.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (cs.eablkybsjg.ppxfxbqfkf) eablkybsjgVar;
            sopmlzcsov(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.ppxfxbqfkf(), ppxfxbqfkfVar.zoijcleaow());
        } else {
            if (eablkybsjgVar instanceof cs.eablkybsjg.gtknphoqwx) {
                cs.eablkybsjg.gtknphoqwx gtknphoqwxVar = (cs.eablkybsjg.gtknphoqwx) eablkybsjgVar;
                Object objCllcsxoeiz2 = cllcsxoeiz(new ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf.wkgbmnqykc(new StoryPayload.Onboarding(gtknphoqwxVar.zoijcleaow(), gtknphoqwxVar.iobyxmoadg())), gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof cs.eablkybsjg.btonecajqb) {
                Object objCllcsxoeiz3 = cllcsxoeiz(new ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf.iobyxmoadg(((cs.eablkybsjg.btonecajqb) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, cs.eablkybsjg.zoijcleaow.f25580iobyxmoadg)) {
                d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
            } else {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, cs.eablkybsjg.iobyxmoadg.f25570iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(lq.iobyxmoadg.ppxfxbqfkf(this.f86035gtknphoqwx, null, 1, null));
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
