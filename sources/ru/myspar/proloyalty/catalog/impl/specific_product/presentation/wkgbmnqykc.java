package ru.myspar.proloyalty.catalog.impl.specific_product.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import lg.gxszxtbevo;
import m21.dxjokdxxww;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.State;
import ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.lqeggnwhkg;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSet;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.core.domain.models.payload.EditOrderPayload;
import ru.myspar.proloyalty.core.navigation.model.DeepLink;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.legacy.presentation.screen.editorder.yggfygwlhe;
import ru.myspar.proloyalty.purchases.api.CreatePurchaseListsResultHelper;
import ru.myspar.proloyalty.videoplayer.api.model.VideoPlayerArgs;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final CreatePurchaseListsResultHelper f93721agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final an0.iobyxmoadg f93722btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final pw1.iobyxmoadg f93723draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final xo0.iobyxmoadg f93724gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final q41.iobyxmoadg f93725ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final draadjrbmk f93726rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final draadjrbmk f93727vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final s21.iobyxmoadg f93728wflxmlrfwp;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93730zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93730zdlpuopuiu;
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
            this.f93730zdlpuopuiu = 1;
            if (crxdokpmqz.ppxfxbqfkf(jKcexrzcfyt, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
            eablkybsjg.iobyxmoadg iobyxmoadgVar = eablkybsjg.iobyxmoadg.f93661iobyxmoadg;
            this.f93730zdlpuopuiu = 2;
            if (wkgbmnqykcVar.cllcsxoeiz(iobyxmoadgVar, this) == objGxszxtbevo) {
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
    public wkgbmnqykc(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, final pq0.zoijcleaow stateMapper, an0.iobyxmoadg authFeatureApi, xo0.iobyxmoadg catalogFeatureApi, pw1.iobyxmoadg videoPlayerFeatureApi, s21.iobyxmoadg apiEndPointsProvider, CreatePurchaseListsResultHelper resultHelper, q41.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stateMapper, "stateMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(videoPlayerFeatureApi, "videoPlayerFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resultHelper, "resultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f93722btonecajqb = authFeatureApi;
        this.f93724gtknphoqwx = catalogFeatureApi;
        this.f93723draadjrbmk = videoPlayerFeatureApi;
        this.f93728wflxmlrfwp = apiEndPointsProvider;
        this.f93721agtfadlqog = resultHelper;
        this.f93725ojitshcjhn = resourcesManager;
        this.f93726rgvfuqvkyq = new draadjrbmk() { // from class: fq0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.catalog.impl.specific_product.presentation.wkgbmnqykc.jlmebxxoox(stateMapper, (State) obj);
            }
        };
        this.f93727vdvldrhtss = new draadjrbmk() { // from class: fq0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.catalog.impl.specific_product.presentation.wkgbmnqykc.ulzqkzuiru((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void crxdokpmqz(wkgbmnqykc wkgbmnqykcVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (wkgbmnqykcVar.f93721agtfadlqog.ppxfxbqfkf(it)) {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(wkgbmnqykcVar), null, null, wkgbmnqykcVar.new iobyxmoadg(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ppxfxbqfkf jlmebxxoox(pq0.zoijcleaow zoijcleaowVar, State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        return zoijcleaowVar.invoke(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc ulzqkzuiru(ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg iobyxmoadgVar) {
        ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc dxjokdxxwwVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.zoijcleaow) {
            return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.lqeggnwhkg.f93618iobyxmoadg;
        }
        if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.rgvfuqvkyq) {
            ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.rgvfuqvkyq rgvfuqvkyqVar = (ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.rgvfuqvkyq) iobyxmoadgVar;
            dxjokdxxwwVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC2208wkgbmnqykc.zoijcleaow(rgvfuqvkyqVar.zoijcleaow(), rgvfuqvkyqVar.iobyxmoadg());
        } else {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.cqumvgiudr.f93670iobyxmoadg)) {
                return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC2208wkgbmnqykc.iobyxmoadg.f93628iobyxmoadg;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.yggfygwlhe.f93698iobyxmoadg)) {
                return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.rgvfuqvkyq.f93624iobyxmoadg;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.esjtqupxsv.f93676iobyxmoadg)) {
                return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg.f93622iobyxmoadg;
            }
            if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.kcexrzcfyt) {
                dxjokdxxwwVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf.zoijcleaow(((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.kcexrzcfyt) iobyxmoadgVar).iobyxmoadg());
            } else {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.zdlpuopuiu.f93699iobyxmoadg)) {
                    return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.ojitshcjhn.f93620iobyxmoadg;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.jyumaefscl.f93681iobyxmoadg)) {
                    return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.gtknphoqwx.f93611iobyxmoadg;
                }
                if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.gtknphoqwx) {
                    dxjokdxxwwVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.agtfadlqog.iobyxmoadg(((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.gtknphoqwx) iobyxmoadgVar).iobyxmoadg());
                } else if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.vdvldrhtss) {
                    ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.vdvldrhtss vdvldrhtssVar = (ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.vdvldrhtss) iobyxmoadgVar;
                    dxjokdxxwwVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.agtfadlqog.zoijcleaow(vdvldrhtssVar.zoijcleaow(), vdvldrhtssVar.ppxfxbqfkf(), vdvldrhtssVar.iobyxmoadg());
                } else if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.oxmwwwfdhm) {
                    ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.oxmwwwfdhm oxmwwwfdhmVar = (ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.oxmwwwfdhm) iobyxmoadgVar;
                    dxjokdxxwwVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp(oxmwwwfdhmVar.zoijcleaow(), oxmwwwfdhmVar.iobyxmoadg());
                } else {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.C2210iobyxmoadg.f93679iobyxmoadg)) {
                        return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.zoijcleaow.f93633iobyxmoadg;
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.draadjrbmk.f93671iobyxmoadg)) {
                        return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.zdlpuopuiu.f93632iobyxmoadg;
                    }
                    if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.ojitshcjhn) {
                        qq0.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = ((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.ojitshcjhn) iobyxmoadgVar).iobyxmoadg();
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVarIobyxmoadg, qq0.wkgbmnqykc.iobyxmoadg.f80520iobyxmoadg) || (wkgbmnqykcVarIobyxmoadg instanceof qq0.wkgbmnqykc.zoijcleaow)) {
                            return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.zdlpuopuiu.f93632iobyxmoadg;
                        }
                        if (wkgbmnqykcVarIobyxmoadg instanceof qq0.wkgbmnqykc.ppxfxbqfkf) {
                            return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.iwizpuwonk.f93615iobyxmoadg;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.wflxmlrfwp) {
                        dxjokdxxwwVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.yggfygwlhe(((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.wflxmlrfwp) iobyxmoadgVar).iobyxmoadg());
                    } else {
                        if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.lereixgezr) {
                            return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.kcexrzcfyt.f93617iobyxmoadg;
                        }
                        if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.eablkybsjg) {
                            dxjokdxxwwVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.vdvldrhtss(((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.eablkybsjg) iobyxmoadgVar).iobyxmoadg());
                        } else if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.ppxfxbqfkf) {
                            ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = (ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar;
                            dxjokdxxwwVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.iobyxmoadg(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow());
                        } else if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.wkgbmnqykc) {
                            dxjokdxxwwVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.oxmwwwfdhm(((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.wkgbmnqykc) iobyxmoadgVar).iobyxmoadg());
                        } else if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.agtfadlqog) {
                            dxjokdxxwwVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.jyumaefscl(((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.agtfadlqog) iobyxmoadgVar).iobyxmoadg());
                        } else {
                            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.gxszxtbevo.f93678iobyxmoadg)) {
                                return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.gxszxtbevo.f93612iobyxmoadg;
                            }
                            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar, ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.lqeggnwhkg.f93684iobyxmoadg)) {
                                return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.eablkybsjg.f93610iobyxmoadg;
                            }
                            if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.nufgyqmvbu) {
                                dxjokdxxwwVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.nufgyqmvbu(((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.nufgyqmvbu) iobyxmoadgVar).iobyxmoadg());
                            } else if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.iwizpuwonk) {
                                dxjokdxxwwVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.draadjrbmk(((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.iwizpuwonk) iobyxmoadgVar).iobyxmoadg());
                            } else {
                                if (iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.btonecajqb) {
                                    return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.btonecajqb.f93605iobyxmoadg;
                                }
                                if (!(iobyxmoadgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.dxjokdxxww)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.dxjokdxxww dxjokdxxwwVar2 = (ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg.dxjokdxxww) iobyxmoadgVar;
                                dxjokdxxwwVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.dxjokdxxww(dxjokdxxwwVar2.ppxfxbqfkf(), dxjokdxxwwVar2.iobyxmoadg(), dxjokdxxwwVar2.zoijcleaow());
                            }
                        }
                    }
                }
            }
        }
        return dxjokdxxwwVar;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f93726rgvfuqvkyq;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f93727vdvldrhtss;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.iobyxmoadg) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.btonecajqb) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.vdvldrhtss(new DeepLink.Product(((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.btonecajqb) eablkybsjgVar).iobyxmoadg()).ppxfxbqfkf(this.f93728wflxmlrfwp.ppxfxbqfkf())));
        } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.zoijcleaow) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f93722btonecajqb.eablkybsjg());
        } else {
            if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.nufgyqmvbu) {
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().wkgbmnqykc(this.f93721agtfadlqog.zoijcleaow(), new l9.draadjrbmk() { // from class: fq0.ppxfxbqfkf
                    @Override // l9.draadjrbmk
                    public final void iobyxmoadg(Object obj) {
                        ru.myspar.proloyalty.catalog.impl.specific_product.presentation.wkgbmnqykc.crxdokpmqz(this.f34571iobyxmoadg, obj);
                    }
                });
                Object objCllcsxoeiz = cllcsxoeiz(new eablkybsjg.ppxfxbqfkf(((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.nufgyqmvbu) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.C2191eablkybsjg) {
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().eablkybsjg(yggfygwlhe.zoijcleaow(new EditOrderPayload(((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.C2191eablkybsjg) eablkybsjgVar).iobyxmoadg(), false, 2, null)));
            } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.gtknphoqwx) {
                i21.iobyxmoadg.f41720iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f93724gtknphoqwx.gxszxtbevo(((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg()));
            } else {
                if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.dxjokdxxww) {
                    ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.dxjokdxxww dxjokdxxwwVar = (ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.dxjokdxxww) eablkybsjgVar;
                    Object objCllcsxoeiz2 = cllcsxoeiz(new eablkybsjg.btonecajqb(dxjokdxxwwVar.iobyxmoadg(), dxjokdxxwwVar.zoijcleaow()), gxszxtbevoVar);
                    return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.lqeggnwhkg) {
                    ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.lqeggnwhkg lqeggnwhkgVar = (ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.lqeggnwhkg) eablkybsjgVar;
                    i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.legacy.presentation.screen.review.gxszxtbevo.zoijcleaow(lqeggnwhkgVar.zoijcleaow(), lqeggnwhkgVar.ppxfxbqfkf(), lqeggnwhkgVar.wkgbmnqykc(), lqeggnwhkgVar.iobyxmoadg()));
                } else {
                    if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.wflxmlrfwp) {
                        Object objCllcsxoeiz3 = cllcsxoeiz(new eablkybsjg.gtknphoqwx(((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.wflxmlrfwp) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.gxszxtbevo) {
                        Object objCllcsxoeiz4 = cllcsxoeiz(new eablkybsjg.dxjokdxxww(((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                        return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.draadjrbmk) {
                        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f93723draadjrbmk.iobyxmoadg(new VideoPlayerArgs(((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.draadjrbmk) eablkybsjgVar).iobyxmoadg())));
                    } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.wkgbmnqykc) {
                        ComboSet comboSetIobyxmoadg = ((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg();
                        Object objCllcsxoeiz5 = cllcsxoeiz(new eablkybsjg.zoijcleaow(new BuildYourComboDialogArgs(comboSetIobyxmoadg, ((ComboSetProduct) jyumaefscl.opjhrmiecq(comboSetIobyxmoadg.getProductsFirst())).getId(), ((ComboSetProduct) jyumaefscl.opjhrmiecq(comboSetIobyxmoadg.getProductsSecond())).getId())), gxszxtbevoVar);
                        if (objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo()) {
                            return objCllcsxoeiz5;
                        }
                    } else {
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eq0.zoijcleaow.f31776iobyxmoadg)) {
                            Object objCllcsxoeiz6 = cllcsxoeiz(new eablkybsjg.draadjrbmk(this.f93725ojitshcjhn.getString(vk0.lqeggnwhkg.proloyalty_order_edit_delivery_price_changed)), gxszxtbevoVar);
                            return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof eq0.ppxfxbqfkf) {
                            Object objCllcsxoeiz7 = cllcsxoeiz(new eablkybsjg.wkgbmnqykc(((eq0.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                            return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eq0.wkgbmnqykc.f31775iobyxmoadg)) {
                            Object objCllcsxoeiz8 = cllcsxoeiz(new eablkybsjg.C2209eablkybsjg(this.f93725ojitshcjhn.getString(vk0.lqeggnwhkg.proloyalty_product_not_available)), gxszxtbevoVar);
                            return objCllcsxoeiz8 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz8 : wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eq0.gxszxtbevo.f31771iobyxmoadg)) {
                            Object objCllcsxoeiz9 = cllcsxoeiz(new eablkybsjg.lqeggnwhkg(this.f93725ojitshcjhn.getString(vk0.lqeggnwhkg.proloyalty_msg_product_adding_to_edit_order)), gxszxtbevoVar);
                            return objCllcsxoeiz9 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz9 : wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof eq0.lqeggnwhkg) {
                            Object objCllcsxoeiz10 = cllcsxoeiz(new eablkybsjg.draadjrbmk(((eq0.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                            return objCllcsxoeiz10 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz10 : wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.ppxfxbqfkf.f93437iobyxmoadg)) {
                            if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.agtfadlqog) {
                                ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.agtfadlqog agtfadlqogVar = (ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.agtfadlqog) eablkybsjgVar;
                                Object objCllcsxoeiz11 = cllcsxoeiz(new eablkybsjg.gxszxtbevo(agtfadlqogVar.zoijcleaow(), agtfadlqogVar.iobyxmoadg()), gxszxtbevoVar);
                                return objCllcsxoeiz11 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz11 : wwaezpbzkn.f37140iobyxmoadg;
                            }
                            if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.ojitshcjhn) {
                                Object objCllcsxoeiz12 = cllcsxoeiz(new eablkybsjg.nufgyqmvbu(((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.ojitshcjhn) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                                return objCllcsxoeiz12 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz12 : wwaezpbzkn.f37140iobyxmoadg;
                            }
                            if (!(eablkybsjgVar instanceof eq0.eablkybsjg)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String strIobyxmoadg = ((eq0.eablkybsjg) eablkybsjgVar).iobyxmoadg();
                            if (strIobyxmoadg == null) {
                                strIobyxmoadg = this.f93725ojitshcjhn.getString(vk0.lqeggnwhkg.proloyalty_product_not_found);
                            }
                            Object objCllcsxoeiz13 = cllcsxoeiz(new eablkybsjg.C2209eablkybsjg(strIobyxmoadg), gxszxtbevoVar);
                            return objCllcsxoeiz13 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz13 : wwaezpbzkn.f37140iobyxmoadg;
                        }
                        i21.iobyxmoadg.f41720iobyxmoadg.yadqdtsiqt(MainTab.CART, true);
                    }
                }
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
