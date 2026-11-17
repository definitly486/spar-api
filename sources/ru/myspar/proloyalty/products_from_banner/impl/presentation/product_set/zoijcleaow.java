package ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set;

import androidx.lifecycle.pkzmftpjix;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.products_from_banner.impl.domain.product_set_counter.args.ProductSetCounterArgs;
import tg.draadjrbmk;
import yh1.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f99365agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ci1.iobyxmoadg f99366btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final an0.iobyxmoadg f99367draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final xo0.iobyxmoadg f99368gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f99369wflxmlrfwp;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f99370iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f99372yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f99373zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f99372yggfygwlhe = obj;
            this.f99370iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.lereixgezr(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(nufgyqmvbu store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ci1.iobyxmoadg stateToModelMapper, xo0.iobyxmoadg catalogFeatureApi, an0.iobyxmoadg authFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(stateToModelMapper, "stateToModelMapper");
        zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        this.f99366btonecajqb = stateToModelMapper;
        this.f99368gtknphoqwx = catalogFeatureApi;
        this.f99367draadjrbmk = authFeatureApi;
        this.f99369wflxmlrfwp = stateToModelMapper;
        this.f99365agtfadlqog = new draadjrbmk() { // from class: bi1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.zoijcleaow.mbcevpiqjq((ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh1.eablkybsjg mbcevpiqjq(ppxfxbqfkf ppxfxbqfkfVar) {
        yh1.eablkybsjg dxjokdxxwwVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.wkgbmnqykc.f99353iobyxmoadg)) {
            return yh1.eablkybsjg.wkgbmnqykc.f125189iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f99346iobyxmoadg)) {
            return yh1.eablkybsjg.gtknphoqwx.f125183iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.gtknphoqwx) {
            dxjokdxxwwVar = new yh1.eablkybsjg.C3191eablkybsjg(((ppxfxbqfkf.gtknphoqwx) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.gxszxtbevo) {
            dxjokdxxwwVar = new yh1.eablkybsjg.nufgyqmvbu(((ppxfxbqfkf.gxszxtbevo) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            dxjokdxxwwVar = new yh1.eablkybsjg.lqeggnwhkg(((ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.nufgyqmvbu.f99351iobyxmoadg)) {
                return yh1.eablkybsjg.gxszxtbevo.f125184iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.btonecajqb) {
                ppxfxbqfkf.btonecajqb btonecajqbVar = (ppxfxbqfkf.btonecajqb) ppxfxbqfkfVar;
                dxjokdxxwwVar = new yh1.eablkybsjg.btonecajqb(btonecajqbVar.zoijcleaow(), btonecajqbVar.iobyxmoadg());
            } else {
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f99349iobyxmoadg)) {
                    return yh1.eablkybsjg.iobyxmoadg.f125185iobyxmoadg;
                }
                if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2374ppxfxbqfkf) {
                    dxjokdxxwwVar = new yh1.eablkybsjg.ppxfxbqfkf(((ppxfxbqfkf.C2374ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
                } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.lqeggnwhkg) {
                    dxjokdxxwwVar = new yh1.eablkybsjg.zoijcleaow(((ppxfxbqfkf.lqeggnwhkg) ppxfxbqfkfVar).iobyxmoadg());
                } else {
                    if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.dxjokdxxww)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ppxfxbqfkf.dxjokdxxww dxjokdxxwwVar2 = (ppxfxbqfkf.dxjokdxxww) ppxfxbqfkfVar;
                    dxjokdxxwwVar = new yh1.eablkybsjg.dxjokdxxww(dxjokdxxwwVar2.zoijcleaow(), dxjokdxxwwVar2.iobyxmoadg());
                }
            }
        }
        return dxjokdxxwwVar;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f99369wflxmlrfwp;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f99365agtfadlqog;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(yh1.gxszxtbevo gxszxtbevoVar, lg.gxszxtbevo gxszxtbevoVar2) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar2 instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar2;
            int i13 = iobyxmoadgVar.f99370iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f99370iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar2);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar2);
        }
        Object obj = iobyxmoadgVar.f99372yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        switch (iobyxmoadgVar.f99370iwizpuwonk) {
            case 0:
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, yh1.gxszxtbevo.iobyxmoadg.f125200iobyxmoadg)) {
                    i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
                } else {
                    if (gxszxtbevoVar instanceof yh1.gxszxtbevo.C3192gxszxtbevo) {
                        Object ppxfxbqfkfVar = new wkgbmnqykc.ppxfxbqfkf(((yh1.gxszxtbevo.C3192gxszxtbevo) gxszxtbevoVar).iobyxmoadg());
                        iobyxmoadgVar.f99370iwizpuwonk = 1;
                        if (cllcsxoeiz(ppxfxbqfkfVar, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, yh1.gxszxtbevo.gtknphoqwx.f125198iobyxmoadg)) {
                        Object lqeggnwhkgVar = new wkgbmnqykc.lqeggnwhkg(qh1.eablkybsjg.proloyalty_products_added_to_cart, null);
                        iobyxmoadgVar.f99373zdlpuopuiu = lqeggnwhkgVar;
                        iobyxmoadgVar.f99370iwizpuwonk = 2;
                        if (cllcsxoeiz(lqeggnwhkgVar, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, yh1.gxszxtbevo.draadjrbmk.f125192iobyxmoadg)) {
                        Object lqeggnwhkgVar2 = new wkgbmnqykc.lqeggnwhkg(qh1.eablkybsjg.proloyalty_products_added_to_cart, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(qh1.eablkybsjg.proloyalty_added_to_cart_with_warnings));
                        iobyxmoadgVar.f99373zdlpuopuiu = lqeggnwhkgVar2;
                        iobyxmoadgVar.f99370iwizpuwonk = 3;
                        if (cllcsxoeiz(lqeggnwhkgVar2, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, yh1.gxszxtbevo.wflxmlrfwp.f125206iobyxmoadg)) {
                        Object lqeggnwhkgVar3 = new wkgbmnqykc.lqeggnwhkg(qh1.eablkybsjg.proloyalty_products_added_to_cart, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(qh1.eablkybsjg.proloyalty_added_to_cart_with_warnings));
                        iobyxmoadgVar.f99373zdlpuopuiu = lqeggnwhkgVar3;
                        iobyxmoadgVar.f99370iwizpuwonk = 4;
                        if (cllcsxoeiz(lqeggnwhkgVar3, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, yh1.gxszxtbevo.lqeggnwhkg.f125201iobyxmoadg)) {
                        Object lqeggnwhkgVar4 = new wkgbmnqykc.lqeggnwhkg(qh1.eablkybsjg.proloyalty_something_went_wrong, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(qh1.eablkybsjg.proloyalty_added_to_cart_with_error));
                        iobyxmoadgVar.f99373zdlpuopuiu = lqeggnwhkgVar4;
                        iobyxmoadgVar.f99370iwizpuwonk = 5;
                        if (cllcsxoeiz(lqeggnwhkgVar4, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (gxszxtbevoVar instanceof yh1.gxszxtbevo.wkgbmnqykc) {
                        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f99368gtknphoqwx.gxszxtbevo(new ProductPayload(new ProductPayload.Type.ProductId(((yh1.gxszxtbevo.wkgbmnqykc) gxszxtbevoVar).iobyxmoadg()), null, 2, null)));
                    } else {
                        if (gxszxtbevoVar instanceof yh1.gxszxtbevo.ppxfxbqfkf) {
                            Object iobyxmoadgVar2 = new wkgbmnqykc.iobyxmoadg(((yh1.gxszxtbevo.ppxfxbqfkf) gxszxtbevoVar).iobyxmoadg());
                            iobyxmoadgVar.f99370iwizpuwonk = 6;
                            if (cllcsxoeiz(iobyxmoadgVar2, iobyxmoadgVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (gxszxtbevoVar instanceof yh1.gxszxtbevo.eablkybsjg) {
                            yh1.gxszxtbevo.eablkybsjg eablkybsjgVar = (yh1.gxszxtbevo.eablkybsjg) gxszxtbevoVar;
                            vdvldrhtss vdvldrhtssVarEablkybsjg = this.f99366btonecajqb.eablkybsjg(eablkybsjgVar.wkgbmnqykc(), eablkybsjgVar.iobyxmoadg());
                            Object zoijcleaowVar = new wkgbmnqykc.zoijcleaow(new ProductSetCounterArgs(eablkybsjgVar.ppxfxbqfkf(), eablkybsjgVar.wkgbmnqykc().size(), ((Number) vdvldrhtssVarEablkybsjg.iobyxmoadg()).doubleValue(), (Double) vdvldrhtssVarEablkybsjg.wkgbmnqykc(), eablkybsjgVar.zoijcleaow()));
                            iobyxmoadgVar.f99370iwizpuwonk = 7;
                            if (cllcsxoeiz(zoijcleaowVar, iobyxmoadgVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar, yh1.gxszxtbevo.dxjokdxxww.f125193iobyxmoadg)) {
                            Object obj2 = wkgbmnqykc.eablkybsjg.f99355iobyxmoadg;
                            iobyxmoadgVar.f99370iwizpuwonk = 8;
                            if (cllcsxoeiz(obj2, iobyxmoadgVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (gxszxtbevoVar instanceof yh1.gxszxtbevo.btonecajqb) {
                            Object gxszxtbevoVar3 = new wkgbmnqykc.gxszxtbevo(((yh1.gxszxtbevo.btonecajqb) gxszxtbevoVar).iobyxmoadg());
                            iobyxmoadgVar.f99370iwizpuwonk = 9;
                            if (cllcsxoeiz(gxszxtbevoVar3, iobyxmoadgVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (!zdlpuopuiu.eablkybsjg(gxszxtbevoVar, yh1.gxszxtbevo.zoijcleaow.f125210iobyxmoadg)) {
                            if (!(gxszxtbevoVar instanceof yh1.gxszxtbevo.nufgyqmvbu)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            yh1.gxszxtbevo.nufgyqmvbu nufgyqmvbuVar = (yh1.gxszxtbevo.nufgyqmvbu) gxszxtbevoVar;
                            Object c2375wkgbmnqykc = new wkgbmnqykc.C2375wkgbmnqykc(nufgyqmvbuVar.zoijcleaow(), nufgyqmvbuVar.iobyxmoadg());
                            iobyxmoadgVar.f99370iwizpuwonk = 10;
                            if (cllcsxoeiz(c2375wkgbmnqykc, iobyxmoadgVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f99367draadjrbmk.eablkybsjg());
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
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
