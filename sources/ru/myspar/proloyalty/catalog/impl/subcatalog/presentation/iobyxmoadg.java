package ru.myspar.proloyalty.catalog.impl.subcatalog.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import mj.kcexrzcfyt;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.catalog.api.model.ProductListPayload;
import ru.myspar.proloyalty.catalog.api.model.SearchPayload;
import ru.myspar.proloyalty.catalog.api.model.SubCatalogArgs;
import ru.myspar.proloyalty.catalog.impl.subcatalog.domain.store.State;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogBanner;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogSection;
import ru.myspar.proloyalty.core.domain.models.payload.EditOrderPayload;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.legacy.presentation.screen.editorder.yggfygwlhe;
import ru.myspar.proloyalty.story.api.model.StoryPayload;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final xo0.iobyxmoadg f93784btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f93785draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final hn1.iobyxmoadg f93786gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f93787wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.subcatalog.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2211iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f93788jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93790zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2211iobyxmoadg(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93788jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C2211iobyxmoadg(this.f93788jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93790zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                rq0.wkgbmnqykc.eablkybsjg eablkybsjgVar = new rq0.wkgbmnqykc.eablkybsjg(this.f93788jyumaefscl);
                this.f93790zdlpuopuiu = 1;
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
            return ((C2211iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f93791jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93793zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93791jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f93791jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93793zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                rq0.wkgbmnqykc.nufgyqmvbu nufgyqmvbuVar = new rq0.wkgbmnqykc.nufgyqmvbu(this.f93791jyumaefscl);
                this.f93793zdlpuopuiu = 1;
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
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(rq0.lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, xo0.iobyxmoadg catalogFeatureApi, hn1.iobyxmoadg scanFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanFeatureApi, "scanFeatureApi");
        this.f93784btonecajqb = catalogFeatureApi;
        this.f93786gtknphoqwx = scanFeatureApi;
        this.f93785draadjrbmk = new draadjrbmk() { // from class: sq0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.catalog.impl.subcatalog.presentation.iobyxmoadg.vipkmwdibw((State) obj);
            }
        };
        this.f93787wflxmlrfwp = new draadjrbmk() { // from class: sq0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.catalog.impl.subcatalog.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.catalog.impl.subcatalog.presentation.btonecajqb) obj);
            }
        };
    }

    private final void crxdokpmqz(SubCatalogArgs subCatalogArgs, String str, String str2, mz0.ppxfxbqfkf ppxfxbqfkfVar) {
        String str3;
        g21.wkgbmnqykc wkgbmnqykcVarKcexrzcfyt = i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt();
        xo0.iobyxmoadg iobyxmoadgVar = this.f93784btonecajqb;
        mz0.iobyxmoadg flow = subCatalogArgs.getFlow();
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
        wkgbmnqykcVarKcexrzcfyt.lqeggnwhkg(iobyxmoadgVar.nufgyqmvbu(new ProductListPayload(flow, orderEditId, str, subCatalogArgs.getParentId(), null, str3, null, ppxfxbqfkfVar, false, 336, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rq0.wkgbmnqykc ntlheqmsrt(btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        if (btonecajqbVar instanceof btonecajqb.wkgbmnqykc) {
            return new rq0.wkgbmnqykc.C1885wkgbmnqykc(((btonecajqb.wkgbmnqykc) btonecajqbVar).iobyxmoadg());
        }
        if (btonecajqbVar instanceof btonecajqb.eablkybsjg) {
            return rq0.wkgbmnqykc.gxszxtbevo.f83658iobyxmoadg;
        }
        if (btonecajqbVar instanceof btonecajqb.gxszxtbevo) {
            return rq0.wkgbmnqykc.lqeggnwhkg.f83661iobyxmoadg;
        }
        if (btonecajqbVar instanceof btonecajqb.lqeggnwhkg) {
            return rq0.wkgbmnqykc.dxjokdxxww.f83656iobyxmoadg;
        }
        if (btonecajqbVar instanceof btonecajqb.nufgyqmvbu) {
            return rq0.wkgbmnqykc.btonecajqb.f83655iobyxmoadg;
        }
        if (btonecajqbVar instanceof btonecajqb.ppxfxbqfkf) {
            return new rq0.wkgbmnqykc.ppxfxbqfkf(((btonecajqb.ppxfxbqfkf) btonecajqbVar).iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(btonecajqbVar, btonecajqb.zoijcleaow.f93771iobyxmoadg)) {
            return rq0.wkgbmnqykc.zoijcleaow.f83665iobyxmoadg;
        }
        if (!(btonecajqbVar instanceof btonecajqb.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        btonecajqb.iobyxmoadg iobyxmoadgVar = (btonecajqb.iobyxmoadg) btonecajqbVar;
        return new rq0.wkgbmnqykc.iobyxmoadg(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
    }

    private final void sopmlzcsov(CatalogBanner catalogBanner, AnalyticsPage analyticsPage, String str) {
        i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(catalogBanner.getNavigationLink(), catalogBanner.getReference(), catalogBanner.getTitle(), null, false, null, new AnalyticsPayload(analyticsPage, new AnalyticsLocation.BannerFeed(null, null, 3, null), new AnalyticElement.BannerItemElement(catalogBanner.getId(), str)), false, 184, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sq0.btonecajqb vipkmwdibw(State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        if (!state.getBanners().isEmpty()) {
            listPpxfxbqfkf.add(new uq0.iobyxmoadg.C2830iobyxmoadg(ip0.iobyxmoadg.ppxfxbqfkf(state.getBanners()).ppxfxbqfkf()));
        }
        if (!state.getItems().isEmpty()) {
            String titleImage = state.getTitleImage();
            if (titleImage == null || kcexrzcfyt.zfvoamnweg(titleImage)) {
                listPpxfxbqfkf.add(new uq0.ppxfxbqfkf(state.getTitle()));
            } else {
                listPpxfxbqfkf.add(new uq0.zoijcleaow(state.getTitleImage()));
            }
            for (CatalogSection catalogSection : state.getItems()) {
                listPpxfxbqfkf.add(new uq0.iobyxmoadg.zoijcleaow(catalogSection.getId(), catalogSection.getName(), catalogSection.getAppImage(), catalogSection.getAdv(), catalogSection.getSortType()));
            }
        }
        List listIobyxmoadg = jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
        boolean zLqeggnwhkg = state.getArgs().lqeggnwhkg();
        boolean isLoading = state.getIsLoading();
        boolean isInitialLoading = state.getIsInitialLoading();
        ColorsModel colorsModel = state.getColorsModel();
        return new sq0.btonecajqb(zLqeggnwhkg, listIobyxmoadg, isLoading, isInitialLoading, colorsModel != null ? n91.zoijcleaow.iobyxmoadg(colorsModel) : null);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f93785draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f93787wflxmlrfwp;
    }

    public final void jlmebxxoox(boolean z13) {
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new C2211iobyxmoadg(z13, null), 3, null);
    }

    public final void ribwqtqdhb(boolean z13) {
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new zoijcleaow(z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(rq0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof rq0.eablkybsjg.lqeggnwhkg) {
            Object objCllcsxoeiz = cllcsxoeiz(new gtknphoqwx.zoijcleaow(((rq0.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof rq0.eablkybsjg.nufgyqmvbu) {
            i21.iobyxmoadg.f41720iobyxmoadg.istkbnxepw();
        } else if (eablkybsjgVar instanceof rq0.eablkybsjg.wkgbmnqykc) {
            rq0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (rq0.eablkybsjg.wkgbmnqykc) eablkybsjgVar;
            crxdokpmqz(wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.wkgbmnqykc());
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, rq0.eablkybsjg.C1879eablkybsjg.f83589iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(hn1.iobyxmoadg.iobyxmoadg(this.f93786gtknphoqwx, null, 1, null));
        } else if (eablkybsjgVar instanceof rq0.eablkybsjg.gxszxtbevo) {
            rq0.eablkybsjg.gxszxtbevo gxszxtbevoVar2 = (rq0.eablkybsjg.gxszxtbevo) eablkybsjgVar;
            i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(ru.myspar.proloyalty.catalog.impl.search.ppxfxbqfkf.zoijcleaow(new SearchPayload(gxszxtbevoVar2.iobyxmoadg().getFlow(), gxszxtbevoVar2.iobyxmoadg().getOrderEditId(), null, null, 12, null)));
        } else if (eablkybsjgVar instanceof rq0.eablkybsjg.dxjokdxxww) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().eablkybsjg(yggfygwlhe.zoijcleaow(new EditOrderPayload(((rq0.eablkybsjg.dxjokdxxww) eablkybsjgVar).iobyxmoadg(), false, 2, null)));
        } else if (eablkybsjgVar instanceof rq0.eablkybsjg.ppxfxbqfkf) {
            rq0.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (rq0.eablkybsjg.ppxfxbqfkf) eablkybsjgVar;
            sopmlzcsov(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.ppxfxbqfkf(), ppxfxbqfkfVar.zoijcleaow());
        } else {
            if (eablkybsjgVar instanceof rq0.eablkybsjg.gtknphoqwx) {
                rq0.eablkybsjg.gtknphoqwx gtknphoqwxVar = (rq0.eablkybsjg.gtknphoqwx) eablkybsjgVar;
                Object objCllcsxoeiz2 = cllcsxoeiz(new gtknphoqwx.wkgbmnqykc(new StoryPayload.Onboarding(gtknphoqwxVar.zoijcleaow(), gtknphoqwxVar.iobyxmoadg())), gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, rq0.eablkybsjg.iobyxmoadg.f83593iobyxmoadg)) {
                i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
            } else {
                if (eablkybsjgVar instanceof rq0.eablkybsjg.btonecajqb) {
                    Object objCllcsxoeiz3 = cllcsxoeiz(new gtknphoqwx.iobyxmoadg(((rq0.eablkybsjg.btonecajqb) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, rq0.eablkybsjg.zoijcleaow.f83603iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(xo0.iobyxmoadg.wkgbmnqykc(this.f93784btonecajqb, null, 1, null));
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
