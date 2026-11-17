package ru.myspar.products_from_banner.impl.presentation.product_set;

import androidx.lifecycle.pkzmftpjix;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import ik0.nufgyqmvbu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.products_from_banner.impl.domain.product_set_counter.args.ProductSetCounterArgs;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f91669agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final mk0.iobyxmoadg f91670btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ro.iobyxmoadg f91671draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lq.iobyxmoadg f91672gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final draadjrbmk f91673ojitshcjhn;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final qm.iobyxmoadg f91674wflxmlrfwp;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f91675iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f91677yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f91678zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91677yggfygwlhe = obj;
            this.f91675iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.lereixgezr(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(nufgyqmvbu store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, mk0.iobyxmoadg stateToModelMapper, lq.iobyxmoadg catalogFeatureApi, ro.iobyxmoadg authFeatureApi, qm.iobyxmoadg addressFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(stateToModelMapper, "stateToModelMapper");
        zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        this.f91670btonecajqb = stateToModelMapper;
        this.f91672gtknphoqwx = catalogFeatureApi;
        this.f91671draadjrbmk = authFeatureApi;
        this.f91674wflxmlrfwp = addressFeatureApi;
        this.f91669agtfadlqog = stateToModelMapper;
        this.f91673ojitshcjhn = new draadjrbmk() { // from class: lk0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.products_from_banner.impl.presentation.product_set.zoijcleaow.mbcevpiqjq((ru.myspar.products_from_banner.impl.presentation.product_set.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ik0.eablkybsjg mbcevpiqjq(ppxfxbqfkf ppxfxbqfkfVar) {
        ik0.eablkybsjg btonecajqbVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.wkgbmnqykc.f91656iobyxmoadg)) {
            return ik0.eablkybsjg.C1035eablkybsjg.f44601iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f91648iobyxmoadg)) {
            return ik0.eablkybsjg.draadjrbmk.f44599iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.draadjrbmk) {
            btonecajqbVar = new ik0.eablkybsjg.gxszxtbevo(((ppxfxbqfkf.draadjrbmk) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.gxszxtbevo) {
            btonecajqbVar = new ik0.eablkybsjg.dxjokdxxww(((ppxfxbqfkf.gxszxtbevo) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            btonecajqbVar = new ik0.eablkybsjg.nufgyqmvbu(((ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.nufgyqmvbu.f91654iobyxmoadg)) {
                return ik0.eablkybsjg.lqeggnwhkg.f44606iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.gtknphoqwx) {
                ppxfxbqfkf.gtknphoqwx gtknphoqwxVar = (ppxfxbqfkf.gtknphoqwx) ppxfxbqfkfVar;
                btonecajqbVar = new ik0.eablkybsjg.gtknphoqwx(gtknphoqwxVar.zoijcleaow(), gtknphoqwxVar.iobyxmoadg());
            } else {
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f91652iobyxmoadg)) {
                    return ik0.eablkybsjg.iobyxmoadg.f44605iobyxmoadg;
                }
                if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2127ppxfxbqfkf) {
                    btonecajqbVar = new ik0.eablkybsjg.ppxfxbqfkf(((ppxfxbqfkf.C2127ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
                } else {
                    if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.dxjokdxxww.f91647iobyxmoadg)) {
                        return ik0.eablkybsjg.wkgbmnqykc.f44609iobyxmoadg;
                    }
                    if (ppxfxbqfkfVar instanceof ppxfxbqfkf.lqeggnwhkg) {
                        btonecajqbVar = new ik0.eablkybsjg.zoijcleaow(((ppxfxbqfkf.lqeggnwhkg) ppxfxbqfkfVar).iobyxmoadg());
                    } else {
                        if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.btonecajqb)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ppxfxbqfkf.btonecajqb btonecajqbVar2 = (ppxfxbqfkf.btonecajqb) ppxfxbqfkfVar;
                        btonecajqbVar = new ik0.eablkybsjg.btonecajqb(btonecajqbVar2.zoijcleaow(), btonecajqbVar2.iobyxmoadg());
                    }
                }
            }
        }
        return btonecajqbVar;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f91669agtfadlqog;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f91673ojitshcjhn;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ik0.gxszxtbevo gxszxtbevoVar, lg.gxszxtbevo gxszxtbevoVar2) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar2 instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar2;
            int i13 = iobyxmoadgVar.f91675iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f91675iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar2);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar2);
        }
        Object obj = iobyxmoadgVar.f91677yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        switch (iobyxmoadgVar.f91675iwizpuwonk) {
            case 0:
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, ik0.gxszxtbevo.iobyxmoadg.f44622iobyxmoadg)) {
                    d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
                } else {
                    if (gxszxtbevoVar instanceof ik0.gxszxtbevo.nufgyqmvbu) {
                        Object c2128wkgbmnqykc = new wkgbmnqykc.C2128wkgbmnqykc(((ik0.gxszxtbevo.nufgyqmvbu) gxszxtbevoVar).iobyxmoadg());
                        iobyxmoadgVar.f91675iwizpuwonk = 1;
                        if (cllcsxoeiz(c2128wkgbmnqykc, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, ik0.gxszxtbevo.wflxmlrfwp.f44630iobyxmoadg)) {
                        Object nufgyqmvbuVar = new wkgbmnqykc.nufgyqmvbu(ak0.eablkybsjg.products_added_to_cart, null);
                        iobyxmoadgVar.f91678zdlpuopuiu = nufgyqmvbuVar;
                        iobyxmoadgVar.f91675iwizpuwonk = 2;
                        if (cllcsxoeiz(nufgyqmvbuVar, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, ik0.gxszxtbevo.agtfadlqog.f44611iobyxmoadg)) {
                        Object nufgyqmvbuVar2 = new wkgbmnqykc.nufgyqmvbu(ak0.eablkybsjg.products_added_to_cart, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(ak0.eablkybsjg.added_to_cart_with_warnings));
                        iobyxmoadgVar.f91678zdlpuopuiu = nufgyqmvbuVar2;
                        iobyxmoadgVar.f91675iwizpuwonk = 3;
                        if (cllcsxoeiz(nufgyqmvbuVar2, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, ik0.gxszxtbevo.ojitshcjhn.f44628iobyxmoadg)) {
                        Object nufgyqmvbuVar3 = new wkgbmnqykc.nufgyqmvbu(ak0.eablkybsjg.products_added_to_cart, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(ak0.eablkybsjg.added_to_cart_with_warnings));
                        iobyxmoadgVar.f91678zdlpuopuiu = nufgyqmvbuVar3;
                        iobyxmoadgVar.f91675iwizpuwonk = 4;
                        if (cllcsxoeiz(nufgyqmvbuVar3, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, ik0.gxszxtbevo.dxjokdxxww.f44616iobyxmoadg)) {
                        Object nufgyqmvbuVar4 = new wkgbmnqykc.nufgyqmvbu(ak0.eablkybsjg.something_went_wrong, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(ak0.eablkybsjg.added_to_cart_with_error));
                        iobyxmoadgVar.f91678zdlpuopuiu = nufgyqmvbuVar4;
                        iobyxmoadgVar.f91675iwizpuwonk = 5;
                        if (cllcsxoeiz(nufgyqmvbuVar4, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (gxszxtbevoVar instanceof ik0.gxszxtbevo.eablkybsjg) {
                        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f91672gtknphoqwx.gxszxtbevo(new ProductPayload(new ProductPayload.Type.ProductId(((ik0.gxszxtbevo.eablkybsjg) gxszxtbevoVar).iobyxmoadg()), null, 2, null)));
                    } else if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, ik0.gxszxtbevo.zoijcleaow.f44632iobyxmoadg)) {
                        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f91671draadjrbmk.ppxfxbqfkf(new NonAuthorizedPayload(NonAuthorizedPayload.zoijcleaow.BUY, null, 2, null)));
                    } else {
                        if (gxszxtbevoVar instanceof ik0.gxszxtbevo.ppxfxbqfkf) {
                            Object iobyxmoadgVar2 = new wkgbmnqykc.iobyxmoadg(((ik0.gxszxtbevo.ppxfxbqfkf) gxszxtbevoVar).iobyxmoadg());
                            iobyxmoadgVar.f91675iwizpuwonk = 6;
                            if (cllcsxoeiz(iobyxmoadgVar2, iobyxmoadgVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (!(gxszxtbevoVar instanceof ik0.gxszxtbevo.wkgbmnqykc)) {
                            if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, ik0.gxszxtbevo.C1036gxszxtbevo.f44621iobyxmoadg)) {
                                Object obj2 = wkgbmnqykc.zoijcleaow.f91668iobyxmoadg;
                                iobyxmoadgVar.f91675iwizpuwonk = 7;
                                if (cllcsxoeiz(obj2, iobyxmoadgVar) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                return wwaezpbzkn.f37140iobyxmoadg;
                            }
                            if (gxszxtbevoVar instanceof ik0.gxszxtbevo.lqeggnwhkg) {
                                ik0.gxszxtbevo.lqeggnwhkg lqeggnwhkgVar = (ik0.gxszxtbevo.lqeggnwhkg) gxszxtbevoVar;
                                vdvldrhtss vdvldrhtssVarEablkybsjg = this.f91670btonecajqb.eablkybsjg(lqeggnwhkgVar.wkgbmnqykc(), lqeggnwhkgVar.iobyxmoadg());
                                Object ppxfxbqfkfVar = new wkgbmnqykc.ppxfxbqfkf(new ProductSetCounterArgs(lqeggnwhkgVar.ppxfxbqfkf(), lqeggnwhkgVar.wkgbmnqykc().size(), ((Number) vdvldrhtssVarEablkybsjg.iobyxmoadg()).doubleValue(), (Double) vdvldrhtssVarEablkybsjg.wkgbmnqykc(), lqeggnwhkgVar.zoijcleaow()));
                                iobyxmoadgVar.f91675iwizpuwonk = 8;
                                if (cllcsxoeiz(ppxfxbqfkfVar, iobyxmoadgVar) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                return wwaezpbzkn.f37140iobyxmoadg;
                            }
                            if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, ik0.gxszxtbevo.gtknphoqwx.f44620iobyxmoadg)) {
                                Object obj3 = wkgbmnqykc.gxszxtbevo.f91661iobyxmoadg;
                                iobyxmoadgVar.f91675iwizpuwonk = 9;
                                if (cllcsxoeiz(obj3, iobyxmoadgVar) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                return wwaezpbzkn.f37140iobyxmoadg;
                            }
                            if (gxszxtbevoVar instanceof ik0.gxszxtbevo.draadjrbmk) {
                                Object lqeggnwhkgVar2 = new wkgbmnqykc.lqeggnwhkg(((ik0.gxszxtbevo.draadjrbmk) gxszxtbevoVar).iobyxmoadg());
                                iobyxmoadgVar.f91675iwizpuwonk = 10;
                                if (cllcsxoeiz(lqeggnwhkgVar2, iobyxmoadgVar) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                return wwaezpbzkn.f37140iobyxmoadg;
                            }
                            if (!(gxszxtbevoVar instanceof ik0.gxszxtbevo.btonecajqb)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ik0.gxszxtbevo.btonecajqb btonecajqbVar = (ik0.gxszxtbevo.btonecajqb) gxszxtbevoVar;
                            Object eablkybsjgVar = new wkgbmnqykc.eablkybsjg(btonecajqbVar.zoijcleaow(), btonecajqbVar.iobyxmoadg());
                            iobyxmoadgVar.f91675iwizpuwonk = 11;
                            if (cllcsxoeiz(eablkybsjgVar, iobyxmoadgVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f91674wflxmlrfwp.ppxfxbqfkf(new rm.wkgbmnqykc.zoijcleaow(((ik0.gxszxtbevo.wkgbmnqykc) gxszxtbevoVar).iobyxmoadg())));
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 1:
                gg.zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 2:
            case 3:
            case 4:
            case 5:
                gg.zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 6:
                gg.zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 7:
                gg.zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 8:
                gg.zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 9:
                gg.zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 10:
                gg.zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 11:
                gg.zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
