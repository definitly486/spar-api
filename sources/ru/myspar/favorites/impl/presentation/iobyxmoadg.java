package ru.myspar.favorites.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import pj.cllcsxoeiz;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.core.ui.model.MainTab;
import ru.myspar.favorites.impl.presentation.gtknphoqwx;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final tg.draadjrbmk f88537agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final qm.iobyxmoadg f88538btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final lq.iobyxmoadg f88539draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ro.iobyxmoadg f88540gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final tg.draadjrbmk f88541wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.favorites.impl.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2031iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f88542jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88544zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2031iobyxmoadg(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f88542jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C2031iobyxmoadg(this.f88542jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f88544zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.favorites.impl.domain.store.wkgbmnqykc.gxszxtbevo gxszxtbevoVar = new ru.myspar.favorites.impl.domain.store.wkgbmnqykc.gxszxtbevo(this.f88542jyumaefscl);
                this.f88544zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(gxszxtbevoVar, this) == objGxszxtbevo) {
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
            return ((C2031iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f88545jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88547zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f88545jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f88545jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f88547zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.favorites.impl.domain.store.wkgbmnqykc.gtknphoqwx gtknphoqwxVar = new ru.myspar.favorites.impl.domain.store.wkgbmnqykc.gtknphoqwx(this.f88545jyumaefscl);
                this.f88547zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(gtknphoqwxVar, this) == objGxszxtbevo) {
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
    public iobyxmoadg(ru.myspar.favorites.impl.domain.store.lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ja0.zoijcleaow uiMapper, qm.iobyxmoadg addressFeatureApi, ro.iobyxmoadg authFeatureApi, lq.iobyxmoadg catalogFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uiMapper, "uiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        this.f88538btonecajqb = addressFeatureApi;
        this.f88540gtknphoqwx = authFeatureApi;
        this.f88539draadjrbmk = catalogFeatureApi;
        this.f88541wflxmlrfwp = uiMapper;
        this.f88537agtfadlqog = new tg.draadjrbmk() { // from class: ha0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.favorites.impl.presentation.iobyxmoadg.mbcevpiqjq((gtknphoqwx) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.favorites.impl.domain.store.wkgbmnqykc mbcevpiqjq(gtknphoqwx gtknphoqwxVar) {
        ru.myspar.favorites.impl.domain.store.wkgbmnqykc lqeggnwhkgVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gtknphoqwxVar, "<this>");
        if (gtknphoqwxVar instanceof gtknphoqwx.zoijcleaow) {
            return ru.myspar.favorites.impl.domain.store.wkgbmnqykc.zoijcleaow.f88493iobyxmoadg;
        }
        if (gtknphoqwxVar instanceof gtknphoqwx.ppxfxbqfkf) {
            return ru.myspar.favorites.impl.domain.store.wkgbmnqykc.ppxfxbqfkf.f88491iobyxmoadg;
        }
        if (gtknphoqwxVar instanceof gtknphoqwx.wkgbmnqykc) {
            lqeggnwhkgVar = new ru.myspar.favorites.impl.domain.store.wkgbmnqykc.C2030wkgbmnqykc(((gtknphoqwx.wkgbmnqykc) gtknphoqwxVar).iobyxmoadg());
        } else if (gtknphoqwxVar instanceof gtknphoqwx.eablkybsjg) {
            lqeggnwhkgVar = new ru.myspar.favorites.impl.domain.store.wkgbmnqykc.eablkybsjg(((gtknphoqwx.eablkybsjg) gtknphoqwxVar).iobyxmoadg());
        } else {
            if (gtknphoqwxVar instanceof gtknphoqwx.lqeggnwhkg) {
                return ru.myspar.favorites.impl.domain.store.wkgbmnqykc.nufgyqmvbu.f88490iobyxmoadg;
            }
            if (gtknphoqwxVar instanceof gtknphoqwx.dxjokdxxww) {
                lqeggnwhkgVar = new ru.myspar.favorites.impl.domain.store.wkgbmnqykc.btonecajqb(((gtknphoqwx.dxjokdxxww) gtknphoqwxVar).iobyxmoadg());
            } else {
                if (gtknphoqwxVar instanceof gtknphoqwx.btonecajqb) {
                    return ru.myspar.favorites.impl.domain.store.wkgbmnqykc.draadjrbmk.f88481iobyxmoadg;
                }
                if (gtknphoqwxVar instanceof gtknphoqwx.iobyxmoadg) {
                    lqeggnwhkgVar = new ru.myspar.favorites.impl.domain.store.wkgbmnqykc.iobyxmoadg(((gtknphoqwx.iobyxmoadg) gtknphoqwxVar).iobyxmoadg());
                } else if (gtknphoqwxVar instanceof gtknphoqwx.nufgyqmvbu) {
                    gtknphoqwx.nufgyqmvbu nufgyqmvbuVar = (gtknphoqwx.nufgyqmvbu) gtknphoqwxVar;
                    lqeggnwhkgVar = new ru.myspar.favorites.impl.domain.store.wkgbmnqykc.dxjokdxxww(nufgyqmvbuVar.zoijcleaow(), nufgyqmvbuVar.iobyxmoadg());
                } else {
                    if (!(gtknphoqwxVar instanceof gtknphoqwx.gxszxtbevo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gtknphoqwx.gxszxtbevo gxszxtbevoVar = (gtknphoqwx.gxszxtbevo) gtknphoqwxVar;
                    lqeggnwhkgVar = new ru.myspar.favorites.impl.domain.store.wkgbmnqykc.lqeggnwhkg(gxszxtbevoVar.zoijcleaow(), gxszxtbevoVar.iobyxmoadg());
                }
            }
        }
        return lqeggnwhkgVar;
    }

    @Override // ws.zoijcleaow
    protected tg.draadjrbmk esjtqupxsv() {
        return this.f88541wflxmlrfwp;
    }

    @Override // ws.zoijcleaow
    protected tg.draadjrbmk iwizpuwonk() {
        return this.f88537agtfadlqog;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.favorites.impl.domain.store.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof ru.myspar.favorites.impl.domain.store.eablkybsjg.iobyxmoadg) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else {
            if (eablkybsjgVar instanceof ru.myspar.favorites.impl.domain.store.eablkybsjg.lqeggnwhkg) {
                Object objCllcsxoeiz = cllcsxoeiz(new draadjrbmk.ppxfxbqfkf(((ru.myspar.favorites.impl.domain.store.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof ru.myspar.favorites.impl.domain.store.eablkybsjg.dxjokdxxww) {
                Object objCllcsxoeiz2 = cllcsxoeiz(new draadjrbmk.wkgbmnqykc(((ru.myspar.favorites.impl.domain.store.eablkybsjg.dxjokdxxww) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof ru.myspar.favorites.impl.domain.store.eablkybsjg.btonecajqb) {
                Object objCllcsxoeiz3 = cllcsxoeiz(draadjrbmk.eablkybsjg.f88512iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof ru.myspar.favorites.impl.domain.store.eablkybsjg.gtknphoqwx) {
                Object objCllcsxoeiz4 = cllcsxoeiz(new draadjrbmk.gxszxtbevo(((ru.myspar.favorites.impl.domain.store.eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof ru.myspar.favorites.impl.domain.store.eablkybsjg.wflxmlrfwp) {
                d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f88539draadjrbmk.gxszxtbevo(new ProductPayload(new ProductPayload.Type.ProductId(((ru.myspar.favorites.impl.domain.store.eablkybsjg.wflxmlrfwp) eablkybsjgVar).iobyxmoadg()), null, 2, null)));
            } else {
                if (eablkybsjgVar instanceof ru.myspar.favorites.impl.domain.store.eablkybsjg.draadjrbmk) {
                    Object objCllcsxoeiz5 = cllcsxoeiz(new draadjrbmk.nufgyqmvbu(((ru.myspar.favorites.impl.domain.store.eablkybsjg.draadjrbmk) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz5 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.favorites.impl.domain.store.eablkybsjg.nufgyqmvbu) {
                    ru.myspar.favorites.impl.domain.store.eablkybsjg.nufgyqmvbu nufgyqmvbuVar = (ru.myspar.favorites.impl.domain.store.eablkybsjg.nufgyqmvbu) eablkybsjgVar;
                    Object objCllcsxoeiz6 = cllcsxoeiz(new draadjrbmk.zoijcleaow(nufgyqmvbuVar.zoijcleaow(), nufgyqmvbuVar.iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.favorites.impl.domain.store.eablkybsjg.C2027eablkybsjg) {
                    d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f88538btonecajqb.ppxfxbqfkf(new rm.wkgbmnqykc.zoijcleaow(((ru.myspar.favorites.impl.domain.store.eablkybsjg.C2027eablkybsjg) eablkybsjgVar).iobyxmoadg())));
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.favorites.impl.domain.store.eablkybsjg.zoijcleaow.f88387iobyxmoadg)) {
                    d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f88540gtknphoqwx.ppxfxbqfkf(new NonAuthorizedPayload(NonAuthorizedPayload.zoijcleaow.BUY, null, 2, null)));
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.favorites.impl.domain.store.eablkybsjg.wkgbmnqykc.f88386iobyxmoadg)) {
                    d40.iobyxmoadg.iozdgvuglv(d40.iobyxmoadg.f26931iobyxmoadg, MainTab.CATALOG, false, 2, null);
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.favorites.impl.domain.store.eablkybsjg.ppxfxbqfkf.f88383iobyxmoadg)) {
                        if (!(eablkybsjgVar instanceof ru.myspar.favorites.impl.domain.store.eablkybsjg.gxszxtbevo)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ru.myspar.favorites.impl.domain.store.eablkybsjg.gxszxtbevo gxszxtbevoVar2 = (ru.myspar.favorites.impl.domain.store.eablkybsjg.gxszxtbevo) eablkybsjgVar;
                        Object objCllcsxoeiz7 = cllcsxoeiz(new draadjrbmk.iobyxmoadg(gxszxtbevoVar2.zoijcleaow(), gxszxtbevoVar2.iobyxmoadg()), gxszxtbevoVar);
                        return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
                    }
                    d40.iobyxmoadg.iozdgvuglv(d40.iobyxmoadg.f26931iobyxmoadg, MainTab.CART, false, 2, null);
                }
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void sopmlzcsov(boolean z13) {
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new zoijcleaow(z13, null), 3, null);
    }

    public final void ulzqkzuiru(boolean z13) {
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new C2031iobyxmoadg(z13, null), 3, null);
    }
}
