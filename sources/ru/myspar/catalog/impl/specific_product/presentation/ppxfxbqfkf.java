package ru.myspar.catalog.impl.specific_product.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import h40.dxjokdxxww;
import hg.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.catalog.impl.specific_product.domain.store.State;
import ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg;
import ru.myspar.catalog.impl.specific_product.domain.store.lqeggnwhkg;
import ru.myspar.core.domain.models.comboset.ComboSet;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.core.domain.models.payload.EditOrderPayload;
import ru.myspar.core.navigation.model.DeepLink;
import ru.myspar.core.ui.model.MainTab;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.legacy.presentation.screen.editorder.yggfygwlhe;
import ru.myspar.videoplayer.api.model.VideoPlayerArgs;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final d60.iobyxmoadg f85957agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ro.iobyxmoadg f85958btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final sa2.iobyxmoadg f85959draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lq.iobyxmoadg f85960gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final draadjrbmk f85961ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final draadjrbmk f85962rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final qm.iobyxmoadg f85963wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, final as.zoijcleaow stateMapper, ro.iobyxmoadg authFeatureApi, lq.iobyxmoadg catalogFeatureApi, sa2.iobyxmoadg videoPlayerFeatureApi, qm.iobyxmoadg addressFeatureApi, d60.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(stateMapper, "stateMapper");
        zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        zdlpuopuiu.btonecajqb(videoPlayerFeatureApi, "videoPlayerFeatureApi");
        zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f85958btonecajqb = authFeatureApi;
        this.f85960gtknphoqwx = catalogFeatureApi;
        this.f85959draadjrbmk = videoPlayerFeatureApi;
        this.f85963wflxmlrfwp = addressFeatureApi;
        this.f85957agtfadlqog = resourcesManager;
        this.f85961ojitshcjhn = new draadjrbmk() { // from class: sr.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.catalog.impl.specific_product.presentation.ppxfxbqfkf.sopmlzcsov(stateMapper, (State) obj);
            }
        };
        this.f85962rgvfuqvkyq = new draadjrbmk() { // from class: sr.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.catalog.impl.specific_product.presentation.ppxfxbqfkf.ntlheqmsrt((ru.myspar.catalog.impl.specific_product.presentation.iobyxmoadg) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc ntlheqmsrt(iobyxmoadg iobyxmoadgVar) {
        ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc dxjokdxxwwVar;
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        if (iobyxmoadgVar instanceof iobyxmoadg.zoijcleaow) {
            return ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.lqeggnwhkg.f85886iobyxmoadg;
        }
        if (iobyxmoadgVar instanceof iobyxmoadg.rgvfuqvkyq) {
            iobyxmoadg.rgvfuqvkyq rgvfuqvkyqVar = (iobyxmoadg.rgvfuqvkyq) iobyxmoadgVar;
            dxjokdxxwwVar = new ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC1970wkgbmnqykc.zoijcleaow(rgvfuqvkyqVar.zoijcleaow(), rgvfuqvkyqVar.iobyxmoadg());
        } else {
            if (zdlpuopuiu.eablkybsjg(iobyxmoadgVar, iobyxmoadg.iwizpuwonk.f85937iobyxmoadg)) {
                return ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC1970wkgbmnqykc.iobyxmoadg.f85898iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(iobyxmoadgVar, iobyxmoadg.yggfygwlhe.f85954iobyxmoadg)) {
                return ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.ojitshcjhn.f85888iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(iobyxmoadgVar, iobyxmoadg.cqumvgiudr.f85927iobyxmoadg)) {
                return ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg.f85890iobyxmoadg;
            }
            if (iobyxmoadgVar instanceof iobyxmoadg.kcexrzcfyt) {
                dxjokdxxwwVar = new ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf.zoijcleaow(((iobyxmoadg.kcexrzcfyt) iobyxmoadgVar).iobyxmoadg());
            } else {
                if (zdlpuopuiu.eablkybsjg(iobyxmoadgVar, iobyxmoadg.zdlpuopuiu.f85955iobyxmoadg)) {
                    return ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.agtfadlqog.f85872iobyxmoadg;
                }
                if (iobyxmoadgVar instanceof iobyxmoadg.gtknphoqwx) {
                    dxjokdxxwwVar = new ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp.iobyxmoadg(((iobyxmoadg.gtknphoqwx) iobyxmoadgVar).iobyxmoadg());
                } else if (iobyxmoadgVar instanceof iobyxmoadg.vdvldrhtss) {
                    iobyxmoadg.vdvldrhtss vdvldrhtssVar = (iobyxmoadg.vdvldrhtss) iobyxmoadgVar;
                    dxjokdxxwwVar = new ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp.zoijcleaow(vdvldrhtssVar.zoijcleaow(), vdvldrhtssVar.ppxfxbqfkf(), vdvldrhtssVar.iobyxmoadg());
                } else if (iobyxmoadgVar instanceof iobyxmoadg.oxmwwwfdhm) {
                    iobyxmoadg.oxmwwwfdhm oxmwwwfdhmVar = (iobyxmoadg.oxmwwwfdhm) iobyxmoadgVar;
                    dxjokdxxwwVar = new ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.draadjrbmk(oxmwwwfdhmVar.zoijcleaow(), oxmwwwfdhmVar.iobyxmoadg());
                } else {
                    if (zdlpuopuiu.eablkybsjg(iobyxmoadgVar, iobyxmoadg.C1971iobyxmoadg.f85936iobyxmoadg)) {
                        return ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.zoijcleaow.f85903iobyxmoadg;
                    }
                    if (zdlpuopuiu.eablkybsjg(iobyxmoadgVar, iobyxmoadg.draadjrbmk.f85928iobyxmoadg)) {
                        return ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.kcexrzcfyt.f85885iobyxmoadg;
                    }
                    if (iobyxmoadgVar instanceof iobyxmoadg.ojitshcjhn) {
                        bs.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = ((iobyxmoadg.ojitshcjhn) iobyxmoadgVar).iobyxmoadg();
                        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVarIobyxmoadg, bs.wkgbmnqykc.iobyxmoadg.f16988iobyxmoadg) || (wkgbmnqykcVarIobyxmoadg instanceof bs.wkgbmnqykc.zoijcleaow)) {
                            return ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.kcexrzcfyt.f85885iobyxmoadg;
                        }
                        if (wkgbmnqykcVarIobyxmoadg instanceof bs.wkgbmnqykc.ppxfxbqfkf) {
                            return ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.jyumaefscl.f85884iobyxmoadg;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (iobyxmoadgVar instanceof iobyxmoadg.wflxmlrfwp) {
                        dxjokdxxwwVar = new ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.zdlpuopuiu(((iobyxmoadg.wflxmlrfwp) iobyxmoadgVar).iobyxmoadg());
                    } else {
                        if (iobyxmoadgVar instanceof iobyxmoadg.esjtqupxsv) {
                            return ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.oxmwwwfdhm.f85889iobyxmoadg;
                        }
                        if (iobyxmoadgVar instanceof iobyxmoadg.eablkybsjg) {
                            dxjokdxxwwVar = new ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.rgvfuqvkyq(((iobyxmoadg.eablkybsjg) iobyxmoadgVar).iobyxmoadg());
                        } else if (iobyxmoadgVar instanceof iobyxmoadg.ppxfxbqfkf) {
                            iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = (iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar;
                            dxjokdxxwwVar = new ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.iobyxmoadg(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow());
                        } else if (iobyxmoadgVar instanceof iobyxmoadg.wkgbmnqykc) {
                            dxjokdxxwwVar = new ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.vdvldrhtss(((iobyxmoadg.wkgbmnqykc) iobyxmoadgVar).iobyxmoadg());
                        } else if (iobyxmoadgVar instanceof iobyxmoadg.agtfadlqog) {
                            dxjokdxxwwVar = new ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.yggfygwlhe(((iobyxmoadg.agtfadlqog) iobyxmoadgVar).iobyxmoadg());
                        } else {
                            if (zdlpuopuiu.eablkybsjg(iobyxmoadgVar, iobyxmoadg.gxszxtbevo.f85935iobyxmoadg)) {
                                return ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.gxszxtbevo.f85881iobyxmoadg;
                            }
                            if (zdlpuopuiu.eablkybsjg(iobyxmoadgVar, iobyxmoadg.lqeggnwhkg.f85940iobyxmoadg)) {
                                return ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.eablkybsjg.f85879iobyxmoadg;
                            }
                            if (iobyxmoadgVar instanceof iobyxmoadg.nufgyqmvbu) {
                                dxjokdxxwwVar = new ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.nufgyqmvbu(((iobyxmoadg.nufgyqmvbu) iobyxmoadgVar).iobyxmoadg());
                            } else if (iobyxmoadgVar instanceof iobyxmoadg.jyumaefscl) {
                                dxjokdxxwwVar = new ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.gtknphoqwx(((iobyxmoadg.jyumaefscl) iobyxmoadgVar).iobyxmoadg());
                            } else {
                                if (iobyxmoadgVar instanceof iobyxmoadg.btonecajqb) {
                                    return ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.btonecajqb.f85873iobyxmoadg;
                                }
                                if (!(iobyxmoadgVar instanceof iobyxmoadg.dxjokdxxww)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iobyxmoadg.dxjokdxxww dxjokdxxwwVar2 = (iobyxmoadg.dxjokdxxww) iobyxmoadgVar;
                                dxjokdxxwwVar = new ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.dxjokdxxww(dxjokdxxwwVar2.ppxfxbqfkf(), dxjokdxxwwVar2.iobyxmoadg(), dxjokdxxwwVar2.zoijcleaow());
                            }
                        }
                    }
                }
            }
        }
        return dxjokdxxwwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zoijcleaow sopmlzcsov(as.zoijcleaow zoijcleaowVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return zoijcleaowVar.invoke(state);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f85961ojitshcjhn;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f85962rgvfuqvkyq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else if (eablkybsjgVar instanceof eablkybsjg.gtknphoqwx) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.vdvldrhtss(new DeepLink.Product(((eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg()).ppxfxbqfkf()));
        } else if (eablkybsjgVar instanceof eablkybsjg.C1952eablkybsjg) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f85958btonecajqb.ppxfxbqfkf(new NonAuthorizedPayload(null, null, 3, null)));
        } else {
            if (eablkybsjgVar instanceof eablkybsjg.dxjokdxxww) {
                Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((eablkybsjg.dxjokdxxww) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof eablkybsjg.gxszxtbevo) {
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().eablkybsjg(yggfygwlhe.zoijcleaow(new EditOrderPayload(((eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg(), false, 2, null)));
            } else if (eablkybsjgVar instanceof eablkybsjg.draadjrbmk) {
                d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f85960gtknphoqwx.gxszxtbevo(((eablkybsjg.draadjrbmk) eablkybsjgVar).iobyxmoadg()));
            } else {
                if (eablkybsjgVar instanceof eablkybsjg.btonecajqb) {
                    eablkybsjg.btonecajqb btonecajqbVar = (eablkybsjg.btonecajqb) eablkybsjgVar;
                    Object objCllcsxoeiz2 = cllcsxoeiz(new wkgbmnqykc.nufgyqmvbu(btonecajqbVar.iobyxmoadg(), btonecajqbVar.zoijcleaow()), gxszxtbevoVar);
                    return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof eablkybsjg.nufgyqmvbu) {
                    eablkybsjg.nufgyqmvbu nufgyqmvbuVar = (eablkybsjg.nufgyqmvbu) eablkybsjgVar;
                    d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.legacy.presentation.screen.review.gxszxtbevo.zoijcleaow(nufgyqmvbuVar.zoijcleaow(), nufgyqmvbuVar.ppxfxbqfkf(), nufgyqmvbuVar.wkgbmnqykc(), nufgyqmvbuVar.iobyxmoadg()));
                } else {
                    if (eablkybsjgVar instanceof eablkybsjg.agtfadlqog) {
                        Object objCllcsxoeiz3 = cllcsxoeiz(new wkgbmnqykc.dxjokdxxww(((eablkybsjg.agtfadlqog) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (eablkybsjgVar instanceof eablkybsjg.lqeggnwhkg) {
                        Object objCllcsxoeiz4 = cllcsxoeiz(new wkgbmnqykc.lqeggnwhkg(((eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                        return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (eablkybsjgVar instanceof eablkybsjg.wflxmlrfwp) {
                        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f85959draadjrbmk.iobyxmoadg(new VideoPlayerArgs(((eablkybsjg.wflxmlrfwp) eablkybsjgVar).iobyxmoadg())));
                    } else if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
                        ComboSet comboSetIobyxmoadg = ((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg();
                        Object objCllcsxoeiz5 = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(new BuildYourComboDialogArgs((ComboSetProduct) jyumaefscl.opjhrmiecq(comboSetIobyxmoadg.getProductsFirst()), (ComboSetProduct) jyumaefscl.opjhrmiecq(comboSetIobyxmoadg.getProductsSecond()), comboSetIobyxmoadg.getProductsFirst(), comboSetIobyxmoadg.getProductsSecond())), gxszxtbevoVar);
                        if (objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo()) {
                            return objCllcsxoeiz5;
                        }
                    } else if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
                        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f85963wflxmlrfwp.ppxfxbqfkf(new rm.wkgbmnqykc.zoijcleaow(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg())));
                    } else {
                        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, rr.zoijcleaow.f83680iobyxmoadg)) {
                            Object objCllcsxoeiz6 = cllcsxoeiz(new wkgbmnqykc.btonecajqb(this.f85957agtfadlqog.getString(pm.dxjokdxxww.order_edit_delivery_price_changed)), gxszxtbevoVar);
                            return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof rr.ppxfxbqfkf) {
                            Object objCllcsxoeiz7 = cllcsxoeiz(new wkgbmnqykc.ppxfxbqfkf(((rr.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                            return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, rr.wkgbmnqykc.f83679iobyxmoadg)) {
                            Object objCllcsxoeiz8 = cllcsxoeiz(new wkgbmnqykc.C1972wkgbmnqykc(this.f85957agtfadlqog.getString(pm.dxjokdxxww.product_not_available)), gxszxtbevoVar);
                            return objCllcsxoeiz8 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz8 : wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, rr.eablkybsjg.f83675iobyxmoadg)) {
                            Object objCllcsxoeiz9 = cllcsxoeiz(new wkgbmnqykc.gxszxtbevo(this.f85957agtfadlqog.getString(pm.dxjokdxxww.msg_product_adding_to_edit_order)), gxszxtbevoVar);
                            return objCllcsxoeiz9 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz9 : wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (eablkybsjgVar instanceof rr.gxszxtbevo) {
                            Object objCllcsxoeiz10 = cllcsxoeiz(new wkgbmnqykc.btonecajqb(((rr.gxszxtbevo) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                            return objCllcsxoeiz10 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz10 : wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.ppxfxbqfkf.f85707iobyxmoadg)) {
                            if (!(eablkybsjgVar instanceof eablkybsjg.ojitshcjhn)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eablkybsjg.ojitshcjhn ojitshcjhnVar = (eablkybsjg.ojitshcjhn) eablkybsjgVar;
                            Object objCllcsxoeiz11 = cllcsxoeiz(new wkgbmnqykc.eablkybsjg(ojitshcjhnVar.zoijcleaow(), ojitshcjhnVar.iobyxmoadg()), gxszxtbevoVar);
                            return objCllcsxoeiz11 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz11 : wwaezpbzkn.f37140iobyxmoadg;
                        }
                        d40.iobyxmoadg.f26931iobyxmoadg.yadqdtsiqt(MainTab.CART, true);
                    }
                }
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
