package ru.myspar.catalog.impl.product_list.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import fr.nufgyqmvbu;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import hr.vdvldrhtss;
import kotlin.NoWhenBranchMatchedException;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import pm.dxjokdxxww;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.catalog.api.model.SearchPayload;
import ru.myspar.catalog.impl.product_list.domain.State;
import ru.myspar.catalog.impl.search.wflxmlrfwp;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.core.domain.models.payload.EditOrderPayload;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.core.ui.model.MainTab;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.legacy.presentation.screen.editorder.yggfygwlhe;
import ru.myspar.purchases.api.CreatePurchaseListsResultHelper;
import ru.myspar.story.api.model.StoryPayload;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final CreatePurchaseListsResultHelper f85368agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final d60.iobyxmoadg f85369btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ro.iobyxmoadg f85370draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lq.iobyxmoadg f85371gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final draadjrbmk f85372ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final draadjrbmk f85373rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final qm.iobyxmoadg f85374wflxmlrfwp;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85376zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85376zdlpuopuiu;
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
            this.f85376zdlpuopuiu = 1;
            if (crxdokpmqz.zoijcleaow(350L, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            eablkybsjg.zoijcleaow zoijcleaowVar2 = eablkybsjg.zoijcleaow.f85322iobyxmoadg;
            this.f85376zdlpuopuiu = 2;
            if (zoijcleaowVar.cllcsxoeiz(zoijcleaowVar2, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(d60.iobyxmoadg resourcesManager, lq.iobyxmoadg catalogFeatureApi, ro.iobyxmoadg authFeatureApi, qm.iobyxmoadg addressFeatureApi, CreatePurchaseListsResultHelper resultHelper, final mr.zoijcleaow stateMapper, nufgyqmvbu store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resultHelper, "resultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stateMapper, "stateMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f85369btonecajqb = resourcesManager;
        this.f85371gtknphoqwx = catalogFeatureApi;
        this.f85370draadjrbmk = authFeatureApi;
        this.f85374wflxmlrfwp = addressFeatureApi;
        this.f85368agtfadlqog = resultHelper;
        this.f85372ojitshcjhn = new draadjrbmk() { // from class: hr.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.catalog.impl.product_list.presentation.zoijcleaow.jlmebxxoox(stateMapper, (State) obj);
            }
        };
        this.f85373rgvfuqvkyq = new draadjrbmk() { // from class: hr.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.catalog.impl.product_list.presentation.zoijcleaow.ulzqkzuiru((ru.myspar.catalog.impl.product_list.presentation.wkgbmnqykc) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void crxdokpmqz(zoijcleaow zoijcleaowVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (zoijcleaowVar.f85368agtfadlqog.ppxfxbqfkf(it)) {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(zoijcleaowVar), null, null, zoijcleaowVar.new iobyxmoadg(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vdvldrhtss jlmebxxoox(mr.zoijcleaow zoijcleaowVar, State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        return zoijcleaowVar.invoke(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fr.eablkybsjg ulzqkzuiru(wkgbmnqykc wkgbmnqykcVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        if (wkgbmnqykcVar instanceof wkgbmnqykc.iobyxmoadg) {
            wkgbmnqykc.iobyxmoadg iobyxmoadgVar = (wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar;
            return new fr.eablkybsjg.iobyxmoadg(iobyxmoadgVar.iobyxmoadg().getId(), iobyxmoadgVar.zoijcleaow());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.ppxfxbqfkf) {
            return new fr.eablkybsjg.ppxfxbqfkf(((wkgbmnqykc.ppxfxbqfkf) wkgbmnqykcVar).iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.C1945wkgbmnqykc.f85362iobyxmoadg)) {
            return fr.eablkybsjg.wkgbmnqykc.f34645iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.eablkybsjg) {
            return new fr.eablkybsjg.C0767eablkybsjg(((wkgbmnqykc.eablkybsjg) wkgbmnqykcVar).iobyxmoadg().getId());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.gxszxtbevo.f85339iobyxmoadg)) {
            return fr.eablkybsjg.gxszxtbevo.f34620iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.lqeggnwhkg) {
            wkgbmnqykc.lqeggnwhkg lqeggnwhkgVar = (wkgbmnqykc.lqeggnwhkg) wkgbmnqykcVar;
            return new fr.eablkybsjg.lqeggnwhkg(lqeggnwhkgVar.zoijcleaow(), lqeggnwhkgVar.iobyxmoadg());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.nufgyqmvbu) {
            wkgbmnqykc.nufgyqmvbu nufgyqmvbuVar = (wkgbmnqykc.nufgyqmvbu) wkgbmnqykcVar;
            return new fr.eablkybsjg.nufgyqmvbu(nufgyqmvbuVar.iobyxmoadg(), nufgyqmvbuVar.zoijcleaow());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.dxjokdxxww) {
            return new fr.eablkybsjg.dxjokdxxww(((wkgbmnqykc.dxjokdxxww) wkgbmnqykcVar).iobyxmoadg().wkgbmnqykc());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.btonecajqb) {
            return new fr.eablkybsjg.btonecajqb(((wkgbmnqykc.btonecajqb) wkgbmnqykcVar).iobyxmoadg().getId());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.gtknphoqwx.f85338iobyxmoadg)) {
            return fr.eablkybsjg.gtknphoqwx.f34619iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.wflxmlrfwp) {
            wkgbmnqykc.wflxmlrfwp wflxmlrfwpVar = (wkgbmnqykc.wflxmlrfwp) wkgbmnqykcVar;
            return new fr.eablkybsjg.wflxmlrfwp(wflxmlrfwpVar.ppxfxbqfkf(), wflxmlrfwpVar.iobyxmoadg(), wflxmlrfwpVar.zoijcleaow());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.agtfadlqog) {
            return new fr.eablkybsjg.agtfadlqog(((wkgbmnqykc.agtfadlqog) wkgbmnqykcVar).iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.ojitshcjhn.f85351iobyxmoadg)) {
            return fr.eablkybsjg.ojitshcjhn.f34632iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.rgvfuqvkyq.f85355iobyxmoadg)) {
            return fr.eablkybsjg.rgvfuqvkyq.f34638iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.vdvldrhtss) {
            wkgbmnqykc.vdvldrhtss vdvldrhtssVar = (wkgbmnqykc.vdvldrhtss) wkgbmnqykcVar;
            return new fr.eablkybsjg.vdvldrhtss(vdvldrhtssVar.zoijcleaow(), vdvldrhtssVar.ppxfxbqfkf(), vdvldrhtssVar.iobyxmoadg());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.oxmwwwfdhm) {
            wkgbmnqykc.oxmwwwfdhm oxmwwwfdhmVar = (wkgbmnqykc.oxmwwwfdhm) wkgbmnqykcVar;
            return new fr.eablkybsjg.oxmwwwfdhm(oxmwwwfdhmVar.zoijcleaow().getName(), oxmwwwfdhmVar.zoijcleaow().getId(), oxmwwwfdhmVar.zoijcleaow().getArticle(), oxmwwwfdhmVar.iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.kcexrzcfyt.f85345iobyxmoadg)) {
            return fr.eablkybsjg.kcexrzcfyt.f34625iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.zdlpuopuiu.f85364iobyxmoadg)) {
            return fr.eablkybsjg.zdlpuopuiu.f34647iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.yggfygwlhe.f85363iobyxmoadg)) {
            return fr.eablkybsjg.yggfygwlhe.f34646iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.jyumaefscl.f85344iobyxmoadg)) {
            return fr.eablkybsjg.jyumaefscl.f34624iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.iwizpuwonk.f85343iobyxmoadg)) {
            return fr.eablkybsjg.iwizpuwonk.f34623iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.cqumvgiudr) {
            return new fr.eablkybsjg.cqumvgiudr(((wkgbmnqykc.cqumvgiudr) wkgbmnqykcVar).iobyxmoadg());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.lereixgezr) {
            wkgbmnqykc.lereixgezr lereixgezrVar = (wkgbmnqykc.lereixgezr) wkgbmnqykcVar;
            String strDxjokdxxww = lereixgezrVar.iobyxmoadg().dxjokdxxww();
            if (strDxjokdxxww == null) {
                strDxjokdxxww = "";
            }
            return new fr.eablkybsjg.lereixgezr(strDxjokdxxww, lereixgezrVar.iobyxmoadg().getItemId());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.draadjrbmk) {
            return new fr.eablkybsjg.draadjrbmk(((wkgbmnqykc.draadjrbmk) wkgbmnqykcVar).iobyxmoadg());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.esjtqupxsv) {
            return new fr.eablkybsjg.esjtqupxsv(((wkgbmnqykc.esjtqupxsv) wkgbmnqykcVar).iobyxmoadg());
        }
        if (!(wkgbmnqykcVar instanceof wkgbmnqykc.zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        wkgbmnqykc.zoijcleaow zoijcleaowVar = (wkgbmnqykc.zoijcleaow) wkgbmnqykcVar;
        return new fr.eablkybsjg.zoijcleaow(zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f85372ojitshcjhn;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f85373rgvfuqvkyq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:117:0x020d  */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(fr.gxszxtbevo gxszxtbevoVar, gxszxtbevo gxszxtbevoVar2) {
        if (gxszxtbevoVar instanceof fr.gxszxtbevo.vdvldrhtss) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().wkgbmnqykc(this.f85368agtfadlqog.zoijcleaow(), new l9.draadjrbmk() { // from class: hr.ppxfxbqfkf
                @Override // l9.draadjrbmk
                public final void iobyxmoadg(Object obj) {
                    ru.myspar.catalog.impl.product_list.presentation.zoijcleaow.crxdokpmqz(this.f40954iobyxmoadg, obj);
                }
            });
            Object objCllcsxoeiz = cllcsxoeiz(new eablkybsjg.lqeggnwhkg(((fr.gxszxtbevo.vdvldrhtss) gxszxtbevoVar).iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar, fr.gxszxtbevo.yggfygwlhe.f34686iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(eablkybsjg.gtknphoqwx.f85308iobyxmoadg, gxszxtbevoVar2);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar, fr.gxszxtbevo.gtknphoqwx.f34663iobyxmoadg)) {
            Object objCllcsxoeiz3 = cllcsxoeiz(eablkybsjg.iobyxmoadg.f85311iobyxmoadg, gxszxtbevoVar2);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof fr.gxszxtbevo.kcexrzcfyt) {
            Object objCllcsxoeiz4 = cllcsxoeiz(new eablkybsjg.dxjokdxxww(((fr.gxszxtbevo.kcexrzcfyt) gxszxtbevoVar).iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof fr.gxszxtbevo.oxmwwwfdhm) {
            Object objCllcsxoeiz5 = cllcsxoeiz(new eablkybsjg.nufgyqmvbu(((fr.gxszxtbevo.oxmwwwfdhm) gxszxtbevoVar).iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz5 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof fr.gxszxtbevo.pmvmpeiblj) {
            Object objCllcsxoeiz6 = cllcsxoeiz(new eablkybsjg.vdvldrhtss(((fr.gxszxtbevo.pmvmpeiblj) gxszxtbevoVar).iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof fr.gxszxtbevo.iwizpuwonk) {
            Object objCllcsxoeiz7 = cllcsxoeiz(eablkybsjg.wflxmlrfwp.f85319iobyxmoadg, gxszxtbevoVar2);
            return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof fr.gxszxtbevo.agtfadlqog) {
            fr.gxszxtbevo.agtfadlqog agtfadlqogVar = (fr.gxszxtbevo.agtfadlqog) gxszxtbevoVar;
            String strIobyxmoadg = agtfadlqogVar.iobyxmoadg();
            if (strIobyxmoadg == null) {
                strIobyxmoadg = this.f85369btonecajqb.getString(dxjokdxxww.available_only_for_pickup_product);
            }
            Object objCllcsxoeiz8 = cllcsxoeiz(new eablkybsjg.wkgbmnqykc(agtfadlqogVar.zoijcleaow(), strIobyxmoadg), gxszxtbevoVar2);
            return objCllcsxoeiz8 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz8 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof fr.gxszxtbevo.esjtqupxsv) {
            fr.gxszxtbevo.esjtqupxsv esjtqupxsvVar = (fr.gxszxtbevo.esjtqupxsv) gxszxtbevoVar;
            Object objCllcsxoeiz9 = cllcsxoeiz(new eablkybsjg.ojitshcjhn(new StoryPayload.Onboarding(esjtqupxsvVar.zoijcleaow(), esjtqupxsvVar.iobyxmoadg())), gxszxtbevoVar2);
            return objCllcsxoeiz9 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz9 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof fr.gxszxtbevo.jyumaefscl) {
            fr.gxszxtbevo.jyumaefscl jyumaefsclVar = (fr.gxszxtbevo.jyumaefscl) gxszxtbevoVar;
            Object objCllcsxoeiz10 = cllcsxoeiz(new eablkybsjg.draadjrbmk(jyumaefsclVar.zoijcleaow(), jyumaefsclVar.iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz10 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz10 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof fr.gxszxtbevo.cqumvgiudr) {
            fr.gxszxtbevo.cqumvgiudr cqumvgiudrVar = (fr.gxszxtbevo.cqumvgiudr) gxszxtbevoVar;
            Object objCllcsxoeiz11 = cllcsxoeiz(new eablkybsjg.agtfadlqog(cqumvgiudrVar.zoijcleaow(), cqumvgiudrVar.ppxfxbqfkf(), cqumvgiudrVar.iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz11 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz11 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof fr.gxszxtbevo.rgvfuqvkyq) {
            fr.gxszxtbevo.rgvfuqvkyq rgvfuqvkyqVar = (fr.gxszxtbevo.rgvfuqvkyq) gxszxtbevoVar;
            Object objCllcsxoeiz12 = cllcsxoeiz(new eablkybsjg.gxszxtbevo(new BuildYourComboDialogArgs((ComboSetProduct) jyumaefscl.opjhrmiecq(rgvfuqvkyqVar.iobyxmoadg().getProductsFirst()), (ComboSetProduct) jyumaefscl.opjhrmiecq(rgvfuqvkyqVar.iobyxmoadg().getProductsSecond()), rgvfuqvkyqVar.iobyxmoadg().getProductsFirst(), rgvfuqvkyqVar.iobyxmoadg().getProductsSecond())), gxszxtbevoVar2);
            return objCllcsxoeiz12 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz12 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof fr.gxszxtbevo.zdlpuopuiu) {
            Object objCllcsxoeiz13 = cllcsxoeiz(new eablkybsjg.btonecajqb(((fr.gxszxtbevo.zdlpuopuiu) gxszxtbevoVar).iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz13 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz13 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof fr.gxszxtbevo.ojitshcjhn) {
            Object objCllcsxoeiz14 = cllcsxoeiz(eablkybsjg.C1944eablkybsjg.f85307iobyxmoadg, gxszxtbevoVar2);
            return objCllcsxoeiz14 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz14 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof fr.gxszxtbevo.lereixgezr) {
            Object objCllcsxoeiz15 = cllcsxoeiz(eablkybsjg.rgvfuqvkyq.f85317iobyxmoadg, gxszxtbevoVar2);
            return objCllcsxoeiz15 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz15 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof fr.gxszxtbevo.iobyxmoadg) {
            if (((fr.gxszxtbevo.iobyxmoadg) gxszxtbevoVar).iobyxmoadg()) {
                d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
                if (iobyxmoadgVar.jyumaefscl(MainTab.MY_SPAR)) {
                    d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
                } else {
                    iobyxmoadgVar.istkbnxepw();
                }
            } else {
                d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
            }
        } else if (gxszxtbevoVar instanceof fr.gxszxtbevo.ppxfxbqfkf) {
            d40.iobyxmoadg.f26931iobyxmoadg.yadqdtsiqt(MainTab.CART, true);
        } else if (gxszxtbevoVar instanceof fr.gxszxtbevo.eablkybsjg) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f85370draadjrbmk.ppxfxbqfkf(new NonAuthorizedPayload(((fr.gxszxtbevo.eablkybsjg) gxszxtbevoVar).iobyxmoadg(), null, 2, null)));
        } else if (gxszxtbevoVar instanceof fr.gxszxtbevo.btonecajqb) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f85374wflxmlrfwp.ppxfxbqfkf(new rm.wkgbmnqykc.zoijcleaow(((fr.gxszxtbevo.btonecajqb) gxszxtbevoVar).iobyxmoadg())));
        } else if (gxszxtbevoVar instanceof fr.gxszxtbevo.C0768gxszxtbevo) {
            fr.gxszxtbevo.C0768gxszxtbevo c0768gxszxtbevo = (fr.gxszxtbevo.C0768gxszxtbevo) gxszxtbevoVar;
            d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f85371gtknphoqwx.gxszxtbevo(new ProductPayload(new ProductPayload.Type.Article(c0768gxszxtbevo.iobyxmoadg()), c0768gxszxtbevo.zoijcleaow())));
        } else if (gxszxtbevoVar instanceof fr.gxszxtbevo.lqeggnwhkg) {
            fr.gxszxtbevo.lqeggnwhkg lqeggnwhkgVar = (fr.gxszxtbevo.lqeggnwhkg) gxszxtbevoVar;
            d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f85371gtknphoqwx.gxszxtbevo(new ProductPayload(new ProductPayload.Type.ProductId(lqeggnwhkgVar.zoijcleaow()), lqeggnwhkgVar.iobyxmoadg())));
        } else if (gxszxtbevoVar instanceof fr.gxszxtbevo.zoijcleaow) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().eablkybsjg(yggfygwlhe.zoijcleaow(new EditOrderPayload(((fr.gxszxtbevo.zoijcleaow) gxszxtbevoVar).iobyxmoadg(), false, 2, null)));
        } else if (gxszxtbevoVar instanceof fr.gxszxtbevo.draadjrbmk) {
            fr.gxszxtbevo.draadjrbmk draadjrbmkVar = (fr.gxszxtbevo.draadjrbmk) gxszxtbevoVar;
            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(new NavigationPayload(draadjrbmkVar.zoijcleaow().getNavigationLink(), draadjrbmkVar.zoijcleaow().getReference(), draadjrbmkVar.zoijcleaow().getTitle(), null, false, null, draadjrbmkVar.iobyxmoadg(), false, 184, null));
        } else if (gxszxtbevoVar instanceof fr.gxszxtbevo.wkgbmnqykc) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.legacy.presentation.screen.filters.zoijcleaow.zoijcleaow(((fr.gxszxtbevo.wkgbmnqykc) gxszxtbevoVar).iobyxmoadg()));
        } else if (gxszxtbevoVar instanceof fr.gxszxtbevo.nufgyqmvbu) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.legacy.presentation.screen.scanproduct.zoijcleaow.zoijcleaow());
        } else {
            if (!(gxszxtbevoVar instanceof fr.gxszxtbevo.dxjokdxxww)) {
                if (!(gxszxtbevoVar instanceof fr.gxszxtbevo.wflxmlrfwp)) {
                    throw new NoWhenBranchMatchedException();
                }
                fr.gxszxtbevo.wflxmlrfwp wflxmlrfwpVar = (fr.gxszxtbevo.wflxmlrfwp) gxszxtbevoVar;
                Object objCllcsxoeiz16 = cllcsxoeiz(new eablkybsjg.ppxfxbqfkf(wflxmlrfwpVar.zoijcleaow(), wflxmlrfwpVar.iobyxmoadg()), gxszxtbevoVar2);
                return objCllcsxoeiz16 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz16 : wwaezpbzkn.f37140iobyxmoadg;
            }
            fr.gxszxtbevo.dxjokdxxww dxjokdxxwwVar = (fr.gxszxtbevo.dxjokdxxww) gxszxtbevoVar;
            d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(wflxmlrfwp.zoijcleaow(new SearchPayload(dxjokdxxwwVar.iobyxmoadg().getFlow(), dxjokdxxwwVar.iobyxmoadg().getOrderEditId(), dxjokdxxwwVar.iobyxmoadg().getSectionId(), null, 8, null)));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
