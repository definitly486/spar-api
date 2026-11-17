package ru.myspar.proloyalty.catalog.impl.search;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import aq0.dxjokdxxww;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.catalog.impl.search.domain.State;
import ru.myspar.proloyalty.core.domain.models.payload.EditOrderPayload;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.domain.feature.filters.store.FiltersArgs;
import ru.myspar.proloyalty.legacy.presentation.screen.editorder.yggfygwlhe;
import ru.myspar.proloyalty.purchases.api.CreatePurchaseListsResultHelper;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import vk0.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f93385agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final cq0.ppxfxbqfkf f93386btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final an0.iobyxmoadg f93387draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final xo0.iobyxmoadg f93388gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final draadjrbmk f93389ojitshcjhn;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final CreatePurchaseListsResultHelper f93390wflxmlrfwp;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f93391iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f93393yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f93394zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f93393yggfygwlhe = obj;
            this.f93391iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.lereixgezr(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f93395jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93397zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(boolean z13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93395jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new ppxfxbqfkf(this.f93395jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93397zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow zoijcleaowVar = zoijcleaow.this;
                aq0.gxszxtbevo.draadjrbmk draadjrbmkVar = new aq0.gxszxtbevo.draadjrbmk(this.f93395jyumaefscl);
                this.f93397zdlpuopuiu = 1;
                if (zoijcleaowVar.jpowsppfya(draadjrbmkVar, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f93398jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93400zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(boolean z13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93398jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new wkgbmnqykc(this.f93398jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93400zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow zoijcleaowVar = zoijcleaow.this;
                aq0.gxszxtbevo.cqumvgiudr cqumvgiudrVar = new aq0.gxszxtbevo.cqumvgiudr(this.f93398jyumaefscl);
                this.f93400zdlpuopuiu = 1;
                if (zoijcleaowVar.jpowsppfya(cqumvgiudrVar, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.search.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C2190zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f93402yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f93403zdlpuopuiu;

        C2190zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new C2190zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93402yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            nj.iobyxmoadg.C1516iobyxmoadg c1516iobyxmoadg = nj.iobyxmoadg.f70173yggfygwlhe;
            long jKcexrzcfyt = nj.ppxfxbqfkf.kcexrzcfyt(350, nj.wkgbmnqykc.MILLISECONDS);
            this.f93402yggfygwlhe = 1;
            if (crxdokpmqz.ppxfxbqfkf(jKcexrzcfyt, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjg.gxszxtbevo gxszxtbevoVar = new eablkybsjg.gxszxtbevo(lqeggnwhkg.proloyalty_purchases_list_product_added_to_the_list);
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            this.f93403zdlpuopuiu = gxszxtbevoVar;
            this.f93402yggfygwlhe = 2;
            if (zoijcleaowVar.cllcsxoeiz(gxszxtbevoVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C2190zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(cq0.ppxfxbqfkf stateToUiModelMapper, xo0.iobyxmoadg catalogFeatureApi, an0.iobyxmoadg authFeatureApi, CreatePurchaseListsResultHelper resultHelper, dxjokdxxww store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stateToUiModelMapper, "stateToUiModelMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resultHelper, "resultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f93386btonecajqb = stateToUiModelMapper;
        this.f93388gtknphoqwx = catalogFeatureApi;
        this.f93387draadjrbmk = authFeatureApi;
        this.f93390wflxmlrfwp = resultHelper;
        this.f93385agtfadlqog = new draadjrbmk() { // from class: yp0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.catalog.impl.search.zoijcleaow.vipkmwdibw(this.f126118zdlpuopuiu, (State) obj);
            }
        };
        this.f93389ojitshcjhn = new draadjrbmk() { // from class: yp0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.catalog.impl.search.zoijcleaow.ulzqkzuiru((ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void crxdokpmqz(zoijcleaow zoijcleaowVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (zoijcleaowVar.f93390wflxmlrfwp.ppxfxbqfkf(it)) {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(zoijcleaowVar), null, null, zoijcleaowVar.new C2190zoijcleaow(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aq0.gxszxtbevo ulzqkzuiru(ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc wkgbmnqykcVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.iobyxmoadg) {
            ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = (ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar;
            return new aq0.gxszxtbevo.iobyxmoadg(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
        }
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.zoijcleaow) {
            return new aq0.gxszxtbevo.zoijcleaow(((ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.ppxfxbqfkf.f93374iobyxmoadg)) {
            return aq0.gxszxtbevo.ppxfxbqfkf.f14130iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.C2189wkgbmnqykc.f93381iobyxmoadg)) {
            return aq0.gxszxtbevo.wkgbmnqykc.f14137iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.eablkybsjg) {
            return new aq0.gxszxtbevo.eablkybsjg(((ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.eablkybsjg) wkgbmnqykcVar).iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.gxszxtbevo.f93363iobyxmoadg)) {
            return aq0.gxszxtbevo.C0217gxszxtbevo.f14116iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.lqeggnwhkg.f93370iobyxmoadg)) {
            return aq0.gxszxtbevo.lqeggnwhkg.f14123iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.nufgyqmvbu) {
            return new aq0.gxszxtbevo.nufgyqmvbu(((ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.nufgyqmvbu) wkgbmnqykcVar).iobyxmoadg());
        }
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.dxjokdxxww) {
            ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.dxjokdxxww dxjokdxxwwVar = (ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.dxjokdxxww) wkgbmnqykcVar;
            return new aq0.gxszxtbevo.dxjokdxxww(dxjokdxxwwVar.iobyxmoadg().getId(), dxjokdxxwwVar.iobyxmoadg().getArticle(), dxjokdxxwwVar.iobyxmoadg().getName(), dxjokdxxwwVar.iobyxmoadg().getIsFavorite(), dxjokdxxwwVar.zoijcleaow());
        }
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.btonecajqb) {
            return new aq0.gxszxtbevo.btonecajqb(((ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.btonecajqb) wkgbmnqykcVar).iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.gtknphoqwx.f93362iobyxmoadg)) {
            return aq0.gxszxtbevo.gtknphoqwx.f14115iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.draadjrbmk) {
            ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.draadjrbmk draadjrbmkVar = (ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.draadjrbmk) wkgbmnqykcVar;
            return new aq0.gxszxtbevo.wflxmlrfwp(draadjrbmkVar.zoijcleaow(), draadjrbmkVar.iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.wflxmlrfwp.f93380iobyxmoadg)) {
            return aq0.gxszxtbevo.agtfadlqog.f14104iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.agtfadlqog) {
            return new aq0.gxszxtbevo.ojitshcjhn(((ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.agtfadlqog) wkgbmnqykcVar).iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.ojitshcjhn.f93372iobyxmoadg)) {
            return aq0.gxszxtbevo.rgvfuqvkyq.f14131iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.rgvfuqvkyq) {
            ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.rgvfuqvkyq rgvfuqvkyqVar = (ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.rgvfuqvkyq) wkgbmnqykcVar;
            return new aq0.gxszxtbevo.vdvldrhtss(rgvfuqvkyqVar.zoijcleaow(), rgvfuqvkyqVar.iobyxmoadg(), rgvfuqvkyqVar.ppxfxbqfkf());
        }
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.vdvldrhtss) {
            ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.vdvldrhtss vdvldrhtssVar = (ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.vdvldrhtss) wkgbmnqykcVar;
            return new aq0.gxszxtbevo.oxmwwwfdhm(vdvldrhtssVar.iobyxmoadg().getId(), vdvldrhtssVar.iobyxmoadg().getArticle(), vdvldrhtssVar.iobyxmoadg().getName(), vdvldrhtssVar.zoijcleaow());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.oxmwwwfdhm.f93373iobyxmoadg)) {
            return aq0.gxszxtbevo.kcexrzcfyt.f14122iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.kcexrzcfyt) {
            return new aq0.gxszxtbevo.zdlpuopuiu(((ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.kcexrzcfyt) wkgbmnqykcVar).iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.zdlpuopuiu.f93383iobyxmoadg)) {
            return aq0.gxszxtbevo.yggfygwlhe.f14138iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.yggfygwlhe.f93382iobyxmoadg)) {
            return aq0.gxszxtbevo.jyumaefscl.f14121iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.jyumaefscl) {
            return new aq0.gxszxtbevo.iwizpuwonk(((ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.jyumaefscl) wkgbmnqykcVar).iobyxmoadg());
        }
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.iwizpuwonk) {
            return new aq0.gxszxtbevo.esjtqupxsv(((ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.iwizpuwonk) wkgbmnqykcVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yp0.rgvfuqvkyq vipkmwdibw(zoijcleaow zoijcleaowVar, State searchStore$State) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchStore$State, "<this>");
        return zoijcleaowVar.f93386btonecajqb.invoke(searchStore$State);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f93385agtfadlqog;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f93389ojitshcjhn;
    }

    public final void jlmebxxoox(boolean z13) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new ppxfxbqfkf(z13, null), 3, null);
    }

    public final void ribwqtqdhb(boolean z13) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new wkgbmnqykc(z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(aq0.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        final zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f93391iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f93391iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f93393yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        switch (iobyxmoadgVar.f93391iwizpuwonk) {
            case 0:
                zdlpuopuiu.zoijcleaow(obj);
                if (lqeggnwhkgVar instanceof aq0.lqeggnwhkg.C0218lqeggnwhkg) {
                    eablkybsjg.iobyxmoadg iobyxmoadgVar2 = new eablkybsjg.iobyxmoadg(((aq0.lqeggnwhkg.C0218lqeggnwhkg) lqeggnwhkgVar).iobyxmoadg());
                    iobyxmoadgVar.f93391iwizpuwonk = 1;
                    if (cllcsxoeiz(iobyxmoadgVar2, iobyxmoadgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (lqeggnwhkgVar instanceof aq0.lqeggnwhkg.nufgyqmvbu) {
                    eablkybsjg.zoijcleaow zoijcleaowVar2 = new eablkybsjg.zoijcleaow(((aq0.lqeggnwhkg.nufgyqmvbu) lqeggnwhkgVar).iobyxmoadg());
                    iobyxmoadgVar.f93394zdlpuopuiu = this;
                    iobyxmoadgVar.f93391iwizpuwonk = 2;
                    if (cllcsxoeiz(zoijcleaowVar2, iobyxmoadgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zoijcleaowVar = this;
                    i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().wkgbmnqykc(zoijcleaowVar.f93390wflxmlrfwp.zoijcleaow(), new l9.draadjrbmk() { // from class: yp0.ppxfxbqfkf
                        @Override // l9.draadjrbmk
                        public final void iobyxmoadg(Object obj2) {
                            ru.myspar.proloyalty.catalog.impl.search.zoijcleaow.crxdokpmqz(this.f126124iobyxmoadg, obj2);
                        }
                    });
                } else {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, aq0.lqeggnwhkg.dxjokdxxww.f14148iobyxmoadg)) {
                        eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = eablkybsjg.ppxfxbqfkf.f93341iobyxmoadg;
                        iobyxmoadgVar.f93391iwizpuwonk = 3;
                        if (cllcsxoeiz(ppxfxbqfkfVar, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (lqeggnwhkgVar instanceof aq0.lqeggnwhkg.btonecajqb) {
                        aq0.lqeggnwhkg.btonecajqb btonecajqbVar = (aq0.lqeggnwhkg.btonecajqb) lqeggnwhkgVar;
                        eablkybsjg.wkgbmnqykc wkgbmnqykcVar = new eablkybsjg.wkgbmnqykc(btonecajqbVar.zoijcleaow(), btonecajqbVar.iobyxmoadg());
                        iobyxmoadgVar.f93391iwizpuwonk = 4;
                        if (cllcsxoeiz(wkgbmnqykcVar, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, aq0.lqeggnwhkg.gtknphoqwx.f14152iobyxmoadg)) {
                        eablkybsjg.C2188eablkybsjg c2188eablkybsjg = eablkybsjg.C2188eablkybsjg.f93335iobyxmoadg;
                        iobyxmoadgVar.f93391iwizpuwonk = 5;
                        if (cllcsxoeiz(c2188eablkybsjg, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (lqeggnwhkgVar instanceof aq0.lqeggnwhkg.draadjrbmk) {
                        aq0.lqeggnwhkg.draadjrbmk draadjrbmkVar = (aq0.lqeggnwhkg.draadjrbmk) lqeggnwhkgVar;
                        eablkybsjg.lqeggnwhkg lqeggnwhkgVar2 = new eablkybsjg.lqeggnwhkg(draadjrbmkVar.zoijcleaow(), draadjrbmkVar.iobyxmoadg());
                        iobyxmoadgVar.f93391iwizpuwonk = 6;
                        if (cllcsxoeiz(lqeggnwhkgVar2, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, aq0.lqeggnwhkg.wflxmlrfwp.f14162iobyxmoadg)) {
                        eablkybsjg.nufgyqmvbu nufgyqmvbuVar = eablkybsjg.nufgyqmvbu.f93340iobyxmoadg;
                        iobyxmoadgVar.f93391iwizpuwonk = 7;
                        if (cllcsxoeiz(nufgyqmvbuVar, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (lqeggnwhkgVar instanceof aq0.lqeggnwhkg.agtfadlqog) {
                        eablkybsjg.dxjokdxxww dxjokdxxwwVar = new eablkybsjg.dxjokdxxww(((aq0.lqeggnwhkg.agtfadlqog) lqeggnwhkgVar).iobyxmoadg());
                        iobyxmoadgVar.f93391iwizpuwonk = 8;
                        if (cllcsxoeiz(dxjokdxxwwVar, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (lqeggnwhkgVar instanceof aq0.lqeggnwhkg.iobyxmoadg) {
                        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
                    } else if (lqeggnwhkgVar instanceof aq0.lqeggnwhkg.eablkybsjg) {
                        aq0.lqeggnwhkg.eablkybsjg eablkybsjgVar = (aq0.lqeggnwhkg.eablkybsjg) lqeggnwhkgVar;
                        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.legacy.presentation.screen.filters.zoijcleaow.zoijcleaow(new FiltersArgs(eablkybsjgVar.ppxfxbqfkf(), null, eablkybsjgVar.zoijcleaow(), eablkybsjgVar.iobyxmoadg(), null, null, 50, null)));
                    } else if (lqeggnwhkgVar instanceof aq0.lqeggnwhkg.ppxfxbqfkf) {
                        aq0.lqeggnwhkg.ppxfxbqfkf ppxfxbqfkfVar2 = (aq0.lqeggnwhkg.ppxfxbqfkf) lqeggnwhkgVar;
                        i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(ppxfxbqfkfVar2.zoijcleaow(), ppxfxbqfkfVar2.ppxfxbqfkf(), null, null, false, null, ppxfxbqfkfVar2.iobyxmoadg(), false, 188, null));
                    } else if (lqeggnwhkgVar instanceof aq0.lqeggnwhkg.gxszxtbevo) {
                        aq0.lqeggnwhkg.gxszxtbevo gxszxtbevoVar2 = (aq0.lqeggnwhkg.gxszxtbevo) lqeggnwhkgVar;
                        i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f93388gtknphoqwx.gxszxtbevo(new ProductPayload(new ProductPayload.Type.ProductId(gxszxtbevoVar2.zoijcleaow()), gxszxtbevoVar2.iobyxmoadg())));
                    } else if (lqeggnwhkgVar instanceof aq0.lqeggnwhkg.zoijcleaow) {
                        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().eablkybsjg(yggfygwlhe.zoijcleaow(new EditOrderPayload(((aq0.lqeggnwhkg.zoijcleaow) lqeggnwhkgVar).iobyxmoadg(), false, 2, null)));
                    } else {
                        if (!(lqeggnwhkgVar instanceof aq0.lqeggnwhkg.wkgbmnqykc)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f93387draadjrbmk.eablkybsjg());
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 1:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 2:
                zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f93394zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().wkgbmnqykc(zoijcleaowVar.f93390wflxmlrfwp.zoijcleaow(), new l9.draadjrbmk() { // from class: yp0.ppxfxbqfkf
                    @Override // l9.draadjrbmk
                    public final void iobyxmoadg(Object obj2) {
                        ru.myspar.proloyalty.catalog.impl.search.zoijcleaow.crxdokpmqz(this.f126124iobyxmoadg, obj2);
                    }
                });
                return wwaezpbzkn.f37140iobyxmoadg;
            case 3:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 4:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 5:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 6:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 7:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 8:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
