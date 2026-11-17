package ru.myspar.proloyalty.catalog.impl.product_list.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import rp0.nufgyqmvbu;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.catalog.api.model.SearchPayload;
import ru.myspar.proloyalty.catalog.impl.product_list.domain.State;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.core.domain.models.payload.EditOrderPayload;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.legacy.presentation.screen.editorder.yggfygwlhe;
import ru.myspar.proloyalty.purchases.api.CreatePurchaseListsResultHelper;
import ru.myspar.proloyalty.story.api.model.StoryPayload;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f93293agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final xo0.iobyxmoadg f93294btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final hn1.iobyxmoadg f93295draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final an0.iobyxmoadg f93296gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final draadjrbmk f93297ojitshcjhn;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final CreatePurchaseListsResultHelper f93298wflxmlrfwp;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93300zdlpuopuiu;

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
            int i13 = this.f93300zdlpuopuiu;
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
            this.f93300zdlpuopuiu = 1;
            if (crxdokpmqz.zoijcleaow(350L, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            eablkybsjg.zoijcleaow zoijcleaowVar2 = eablkybsjg.zoijcleaow.f93247iobyxmoadg;
            this.f93300zdlpuopuiu = 2;
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
    public zoijcleaow(xo0.iobyxmoadg catalogFeatureApi, an0.iobyxmoadg authFeatureApi, hn1.iobyxmoadg scanFeatureApi, CreatePurchaseListsResultHelper resultHelper, final xp0.iobyxmoadg stateMapper, nufgyqmvbu store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanFeatureApi, "scanFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resultHelper, "resultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stateMapper, "stateMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f93294btonecajqb = catalogFeatureApi;
        this.f93296gtknphoqwx = authFeatureApi;
        this.f93295draadjrbmk = scanFeatureApi;
        this.f93298wflxmlrfwp = resultHelper;
        this.f93293agtfadlqog = new draadjrbmk() { // from class: tp0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.catalog.impl.product_list.presentation.zoijcleaow.jlmebxxoox(stateMapper, (State) obj);
            }
        };
        this.f93297ojitshcjhn = new draadjrbmk() { // from class: tp0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.catalog.impl.product_list.presentation.zoijcleaow.ulzqkzuiru((ru.myspar.proloyalty.catalog.impl.product_list.presentation.wkgbmnqykc) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void crxdokpmqz(zoijcleaow zoijcleaowVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (zoijcleaowVar.f93298wflxmlrfwp.ppxfxbqfkf(it)) {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(zoijcleaowVar), null, null, zoijcleaowVar.new iobyxmoadg(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tp0.rgvfuqvkyq jlmebxxoox(xp0.iobyxmoadg iobyxmoadgVar, State productListStore$State) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productListStore$State, "<this>");
        return iobyxmoadgVar.invoke(productListStore$State);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rp0.eablkybsjg ulzqkzuiru(wkgbmnqykc wkgbmnqykcVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        if (wkgbmnqykcVar instanceof wkgbmnqykc.iobyxmoadg) {
            wkgbmnqykc.iobyxmoadg iobyxmoadgVar = (wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar;
            return new rp0.eablkybsjg.iobyxmoadg(iobyxmoadgVar.iobyxmoadg().getId(), iobyxmoadgVar.zoijcleaow());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.ppxfxbqfkf.f93279iobyxmoadg)) {
            return rp0.eablkybsjg.ppxfxbqfkf.f83315iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.C2187wkgbmnqykc) {
            return new rp0.eablkybsjg.wkgbmnqykc(((wkgbmnqykc.C2187wkgbmnqykc) wkgbmnqykcVar).iobyxmoadg().getId());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.eablkybsjg.f93262iobyxmoadg)) {
            return rp0.eablkybsjg.C1868eablkybsjg.f83298iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.gxszxtbevo) {
            wkgbmnqykc.gxszxtbevo gxszxtbevoVar = (wkgbmnqykc.gxszxtbevo) wkgbmnqykcVar;
            return new rp0.eablkybsjg.gxszxtbevo(gxszxtbevoVar.zoijcleaow(), gxszxtbevoVar.iobyxmoadg());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.lqeggnwhkg) {
            wkgbmnqykc.lqeggnwhkg lqeggnwhkgVar = (wkgbmnqykc.lqeggnwhkg) wkgbmnqykcVar;
            return new rp0.eablkybsjg.lqeggnwhkg(lqeggnwhkgVar.iobyxmoadg(), lqeggnwhkgVar.zoijcleaow());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.nufgyqmvbu) {
            return new rp0.eablkybsjg.nufgyqmvbu(((wkgbmnqykc.nufgyqmvbu) wkgbmnqykcVar).iobyxmoadg().nufgyqmvbu());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.dxjokdxxww) {
            return new rp0.eablkybsjg.dxjokdxxww(((wkgbmnqykc.dxjokdxxww) wkgbmnqykcVar).iobyxmoadg().getId());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.btonecajqb.f93256iobyxmoadg)) {
            return rp0.eablkybsjg.btonecajqb.f83292iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.draadjrbmk) {
            wkgbmnqykc.draadjrbmk draadjrbmkVar = (wkgbmnqykc.draadjrbmk) wkgbmnqykcVar;
            return new rp0.eablkybsjg.draadjrbmk(draadjrbmkVar.ppxfxbqfkf(), draadjrbmkVar.iobyxmoadg(), draadjrbmkVar.zoijcleaow());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.wflxmlrfwp) {
            return new rp0.eablkybsjg.wflxmlrfwp(((wkgbmnqykc.wflxmlrfwp) wkgbmnqykcVar).iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.agtfadlqog.f93255iobyxmoadg)) {
            return rp0.eablkybsjg.agtfadlqog.f83291iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.ojitshcjhn.f93277iobyxmoadg)) {
            return rp0.eablkybsjg.ojitshcjhn.f83313iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.rgvfuqvkyq) {
            wkgbmnqykc.rgvfuqvkyq rgvfuqvkyqVar = (wkgbmnqykc.rgvfuqvkyq) wkgbmnqykcVar;
            return new rp0.eablkybsjg.rgvfuqvkyq(rgvfuqvkyqVar.zoijcleaow(), rgvfuqvkyqVar.ppxfxbqfkf(), rgvfuqvkyqVar.iobyxmoadg());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.vdvldrhtss) {
            wkgbmnqykc.vdvldrhtss vdvldrhtssVar = (wkgbmnqykc.vdvldrhtss) wkgbmnqykcVar;
            return new rp0.eablkybsjg.vdvldrhtss(vdvldrhtssVar.zoijcleaow().getName(), vdvldrhtssVar.zoijcleaow().getId(), vdvldrhtssVar.zoijcleaow().getArticle(), vdvldrhtssVar.iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.kcexrzcfyt.f93272iobyxmoadg)) {
            return rp0.eablkybsjg.kcexrzcfyt.f83307iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.zdlpuopuiu.f93289iobyxmoadg)) {
            return rp0.eablkybsjg.zdlpuopuiu.f83326iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.yggfygwlhe.f93288iobyxmoadg)) {
            return rp0.eablkybsjg.yggfygwlhe.f83325iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.jyumaefscl.f93271iobyxmoadg)) {
            return rp0.eablkybsjg.jyumaefscl.f83306iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.iwizpuwonk.f93270iobyxmoadg)) {
            return rp0.eablkybsjg.iwizpuwonk.f83305iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.cqumvgiudr) {
            return new rp0.eablkybsjg.cqumvgiudr(((wkgbmnqykc.cqumvgiudr) wkgbmnqykcVar).iobyxmoadg());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.lereixgezr) {
            wkgbmnqykc.lereixgezr lereixgezrVar = (wkgbmnqykc.lereixgezr) wkgbmnqykcVar;
            String strDxjokdxxww = lereixgezrVar.iobyxmoadg().dxjokdxxww();
            if (strDxjokdxxww == null) {
                strDxjokdxxww = "";
            }
            return new rp0.eablkybsjg.lereixgezr(strDxjokdxxww, lereixgezrVar.iobyxmoadg().getItemId());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.gtknphoqwx) {
            return new rp0.eablkybsjg.gtknphoqwx(((wkgbmnqykc.gtknphoqwx) wkgbmnqykcVar).iobyxmoadg());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.esjtqupxsv) {
            return new rp0.eablkybsjg.esjtqupxsv(((wkgbmnqykc.esjtqupxsv) wkgbmnqykcVar).iobyxmoadg());
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.zoijcleaow) {
            wkgbmnqykc.zoijcleaow zoijcleaowVar = (wkgbmnqykc.zoijcleaow) wkgbmnqykcVar;
            return new rp0.eablkybsjg.zoijcleaow(zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.oxmwwwfdhm.f93278iobyxmoadg)) {
            return rp0.eablkybsjg.oxmwwwfdhm.f83314iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f93293agtfadlqog;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f93297ojitshcjhn;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:107:0x01de  */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(rp0.gxszxtbevo gxszxtbevoVar, gxszxtbevo gxszxtbevoVar2) {
        if (gxszxtbevoVar instanceof rp0.gxszxtbevo.rgvfuqvkyq) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().wkgbmnqykc(this.f93298wflxmlrfwp.zoijcleaow(), new l9.draadjrbmk() { // from class: tp0.ppxfxbqfkf
                @Override // l9.draadjrbmk
                public final void iobyxmoadg(Object obj) {
                    ru.myspar.proloyalty.catalog.impl.product_list.presentation.zoijcleaow.crxdokpmqz(this.f111150iobyxmoadg, obj);
                }
            });
            Object objCllcsxoeiz = cllcsxoeiz(new eablkybsjg.gxszxtbevo(((rp0.gxszxtbevo.rgvfuqvkyq) gxszxtbevoVar).iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar, rp0.gxszxtbevo.zdlpuopuiu.f83367iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(eablkybsjg.btonecajqb.f93227iobyxmoadg, gxszxtbevoVar2);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar, rp0.gxszxtbevo.gtknphoqwx.f83340iobyxmoadg)) {
            Object objCllcsxoeiz3 = cllcsxoeiz(eablkybsjg.iobyxmoadg.f93236iobyxmoadg, gxszxtbevoVar2);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof rp0.gxszxtbevo.oxmwwwfdhm) {
            Object objCllcsxoeiz4 = cllcsxoeiz(new eablkybsjg.nufgyqmvbu(((rp0.gxszxtbevo.oxmwwwfdhm) gxszxtbevoVar).iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof rp0.gxszxtbevo.vdvldrhtss) {
            Object objCllcsxoeiz5 = cllcsxoeiz(new eablkybsjg.lqeggnwhkg(((rp0.gxszxtbevo.vdvldrhtss) gxszxtbevoVar).iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz5 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof rp0.gxszxtbevo.lereixgezr) {
            Object objCllcsxoeiz6 = cllcsxoeiz(new eablkybsjg.rgvfuqvkyq(((rp0.gxszxtbevo.lereixgezr) gxszxtbevoVar).iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof rp0.gxszxtbevo.jyumaefscl) {
            Object objCllcsxoeiz7 = cllcsxoeiz(eablkybsjg.draadjrbmk.f93228iobyxmoadg, gxszxtbevoVar2);
            return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof rp0.gxszxtbevo.cqumvgiudr) {
            rp0.gxszxtbevo.cqumvgiudr cqumvgiudrVar = (rp0.gxszxtbevo.cqumvgiudr) gxszxtbevoVar;
            Object objCllcsxoeiz8 = cllcsxoeiz(new eablkybsjg.agtfadlqog(new StoryPayload.Onboarding(cqumvgiudrVar.zoijcleaow(), cqumvgiudrVar.iobyxmoadg())), gxszxtbevoVar2);
            return objCllcsxoeiz8 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz8 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof rp0.gxszxtbevo.yggfygwlhe) {
            rp0.gxszxtbevo.yggfygwlhe yggfygwlheVar = (rp0.gxszxtbevo.yggfygwlhe) gxszxtbevoVar;
            Object objCllcsxoeiz9 = cllcsxoeiz(new eablkybsjg.gtknphoqwx(yggfygwlheVar.zoijcleaow(), yggfygwlheVar.iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz9 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz9 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof rp0.gxszxtbevo.iwizpuwonk) {
            rp0.gxszxtbevo.iwizpuwonk iwizpuwonkVar = (rp0.gxszxtbevo.iwizpuwonk) gxszxtbevoVar;
            Object objCllcsxoeiz10 = cllcsxoeiz(new eablkybsjg.wflxmlrfwp(iwizpuwonkVar.zoijcleaow(), iwizpuwonkVar.ppxfxbqfkf(), iwizpuwonkVar.iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz10 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz10 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof rp0.gxszxtbevo.ojitshcjhn) {
            rp0.gxszxtbevo.ojitshcjhn ojitshcjhnVar = (rp0.gxszxtbevo.ojitshcjhn) gxszxtbevoVar;
            Object objCllcsxoeiz11 = cllcsxoeiz(new eablkybsjg.C2186eablkybsjg(new BuildYourComboDialogArgs(ojitshcjhnVar.iobyxmoadg(), ((ComboSetProduct) jyumaefscl.opjhrmiecq(ojitshcjhnVar.iobyxmoadg().getProductsFirst())).getId(), ((ComboSetProduct) jyumaefscl.opjhrmiecq(ojitshcjhnVar.iobyxmoadg().getProductsSecond())).getId())), gxszxtbevoVar2);
            return objCllcsxoeiz11 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz11 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof rp0.gxszxtbevo.kcexrzcfyt) {
            Object objCllcsxoeiz12 = cllcsxoeiz(new eablkybsjg.dxjokdxxww(((rp0.gxszxtbevo.kcexrzcfyt) gxszxtbevoVar).iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz12 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz12 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof rp0.gxszxtbevo.agtfadlqog) {
            Object objCllcsxoeiz13 = cllcsxoeiz(eablkybsjg.wkgbmnqykc.f93246iobyxmoadg, gxszxtbevoVar2);
            return objCllcsxoeiz13 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz13 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof rp0.gxszxtbevo.esjtqupxsv) {
            Object objCllcsxoeiz14 = cllcsxoeiz(eablkybsjg.ojitshcjhn.f93239iobyxmoadg, gxszxtbevoVar2);
            return objCllcsxoeiz14 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz14 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof rp0.gxszxtbevo.zoijcleaow) {
            if (((rp0.gxszxtbevo.zoijcleaow) gxszxtbevoVar).iobyxmoadg()) {
                i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
                if (iobyxmoadgVar.jyumaefscl(MainTab.MY_SPAR)) {
                    i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
                } else {
                    iobyxmoadgVar.istkbnxepw();
                }
            } else {
                i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
            }
        } else if (gxszxtbevoVar instanceof rp0.gxszxtbevo.wkgbmnqykc) {
            i21.iobyxmoadg.f41720iobyxmoadg.yadqdtsiqt(MainTab.CART, true);
        } else if (gxszxtbevoVar instanceof rp0.gxszxtbevo.C1869gxszxtbevo) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f93296gtknphoqwx.eablkybsjg());
        } else if (gxszxtbevoVar instanceof rp0.gxszxtbevo.lqeggnwhkg) {
            rp0.gxszxtbevo.lqeggnwhkg lqeggnwhkgVar = (rp0.gxszxtbevo.lqeggnwhkg) gxszxtbevoVar;
            i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f93294btonecajqb.gxszxtbevo(new ProductPayload(new ProductPayload.Type.Article(lqeggnwhkgVar.iobyxmoadg()), lqeggnwhkgVar.zoijcleaow())));
        } else if (gxszxtbevoVar instanceof rp0.gxszxtbevo.nufgyqmvbu) {
            rp0.gxszxtbevo.nufgyqmvbu nufgyqmvbuVar = (rp0.gxszxtbevo.nufgyqmvbu) gxszxtbevoVar;
            i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f93294btonecajqb.gxszxtbevo(new ProductPayload(new ProductPayload.Type.ProductId(nufgyqmvbuVar.zoijcleaow()), nufgyqmvbuVar.iobyxmoadg())));
        } else if (gxszxtbevoVar instanceof rp0.gxszxtbevo.ppxfxbqfkf) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().eablkybsjg(yggfygwlhe.zoijcleaow(new EditOrderPayload(((rp0.gxszxtbevo.ppxfxbqfkf) gxszxtbevoVar).iobyxmoadg(), false, 2, null)));
        } else if (gxszxtbevoVar instanceof rp0.gxszxtbevo.draadjrbmk) {
            rp0.gxszxtbevo.draadjrbmk draadjrbmkVar = (rp0.gxszxtbevo.draadjrbmk) gxszxtbevoVar;
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(draadjrbmkVar.zoijcleaow().getNavigationLink(), draadjrbmkVar.zoijcleaow().getReference(), draadjrbmkVar.zoijcleaow().getTitle(), null, false, null, draadjrbmkVar.iobyxmoadg(), false, 184, null));
        } else if (gxszxtbevoVar instanceof rp0.gxszxtbevo.eablkybsjg) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.legacy.presentation.screen.filters.zoijcleaow.zoijcleaow(((rp0.gxszxtbevo.eablkybsjg) gxszxtbevoVar).iobyxmoadg()));
        } else if (gxszxtbevoVar instanceof rp0.gxszxtbevo.dxjokdxxww) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(hn1.iobyxmoadg.iobyxmoadg(this.f93295draadjrbmk, null, 1, null));
        } else if (gxszxtbevoVar instanceof rp0.gxszxtbevo.btonecajqb) {
            rp0.gxszxtbevo.btonecajqb btonecajqbVar = (rp0.gxszxtbevo.btonecajqb) gxszxtbevoVar;
            i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(ru.myspar.proloyalty.catalog.impl.search.ppxfxbqfkf.zoijcleaow(new SearchPayload(btonecajqbVar.iobyxmoadg().getFlow(), btonecajqbVar.iobyxmoadg().getOrderEditId(), btonecajqbVar.iobyxmoadg().getSectionId(), null, 8, null)));
        } else {
            if (gxszxtbevoVar instanceof rp0.gxszxtbevo.wflxmlrfwp) {
                rp0.gxszxtbevo.wflxmlrfwp wflxmlrfwpVar = (rp0.gxszxtbevo.wflxmlrfwp) gxszxtbevoVar;
                Object objCllcsxoeiz15 = cllcsxoeiz(new eablkybsjg.ppxfxbqfkf(wflxmlrfwpVar.zoijcleaow(), wflxmlrfwpVar.iobyxmoadg()), gxszxtbevoVar2);
                return objCllcsxoeiz15 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz15 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (!(gxszxtbevoVar instanceof rp0.gxszxtbevo.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            rp0.gxszxtbevo.iobyxmoadg iobyxmoadgVar2 = (rp0.gxszxtbevo.iobyxmoadg) gxszxtbevoVar;
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(iobyxmoadgVar2.iobyxmoadg().wkgbmnqykc(iobyxmoadgVar2.zoijcleaow()));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
