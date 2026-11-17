package ru.myspar.proloyalty.address.impl.map.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.address.api.AddressMapResultHelper;
import ru.myspar.proloyalty.address.api.AddressSearchResultHelper;
import ru.myspar.proloyalty.address.api.ShopSearchResultHelper;
import ru.myspar.proloyalty.address.api.model.AddressDetailScreenArgs;
import ru.myspar.proloyalty.address.api.model.AddressDetailScreenMode;
import ru.myspar.proloyalty.address.api.model.AddressSearchArgs;
import ru.myspar.proloyalty.address.api.model.ShopSearchArgs;
import ru.myspar.proloyalty.address.impl.map.domain.State;
import ru.myspar.proloyalty.common.models.LocationData;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import xl0.eablkybsjg;
import xl0.nufgyqmvbu;
import yl0.dxjokdxxww;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f91994agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final bl0.iobyxmoadg f91995btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final AddressSearchResultHelper f91996draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final AddressMapResultHelper f91997gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final draadjrbmk f91998ojitshcjhn;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final ShopSearchResultHelper f91999wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.address.impl.map.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2139iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ AddressSearchResultHelper.Result f92000jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92002zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2139iobyxmoadg(AddressSearchResultHelper.Result result, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f92000jyumaefscl = result;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C2139iobyxmoadg(this.f92000jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f92002zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                xl0.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = new xl0.wkgbmnqykc.iobyxmoadg(this.f92000jyumaefscl.getLocation());
                this.f92002zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(iobyxmoadgVar2, this) == objGxszxtbevo) {
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
            return ((C2139iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ xl0.wkgbmnqykc.zoijcleaow f92003jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f92005zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(xl0.wkgbmnqykc.zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f92003jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f92003jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f92005zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                xl0.wkgbmnqykc.zoijcleaow zoijcleaowVar = this.f92003jyumaefscl;
                this.f92005zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(zoijcleaowVar, this) == objGxszxtbevo) {
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
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(nufgyqmvbu storeFactory, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, bl0.iobyxmoadg addressFeatureApi, AddressMapResultHelper addressMapResultHelper, AddressSearchResultHelper addressSearchResultHelper, ShopSearchResultHelper shopSearchResultHelper) {
        super(storeFactory, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressMapResultHelper, "addressMapResultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressSearchResultHelper, "addressSearchResultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shopSearchResultHelper, "shopSearchResultHelper");
        this.f91995btonecajqb = addressFeatureApi;
        this.f91997gtknphoqwx = addressMapResultHelper;
        this.f91996draadjrbmk = addressSearchResultHelper;
        this.f91999wflxmlrfwp = shopSearchResultHelper;
        this.f91994agtfadlqog = new draadjrbmk() { // from class: yl0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.address.impl.map.presentation.iobyxmoadg.ikoacuggdj((State) obj);
            }
        };
        this.f91998ojitshcjhn = new draadjrbmk() { // from class: yl0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.address.impl.map.presentation.iobyxmoadg.sopmlzcsov((ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww ikoacuggdj(State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        return am0.iobyxmoadg.wkgbmnqykc(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jhduphickx(iobyxmoadg iobyxmoadgVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ShopSearchResultHelper.Result resultZoijcleaow = iobyxmoadgVar.f91999wflxmlrfwp.zoijcleaow(it);
        if (resultZoijcleaow == null) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new zoijcleaow(new xl0.wkgbmnqykc.zoijcleaow(resultZoijcleaow.getShopId(), resultZoijcleaow.getAddress(), resultZoijcleaow.getLocation()), null), 3, null);
    }

    private final void jlmebxxoox(g21.wkgbmnqykc wkgbmnqykcVar, LocationData locationData) {
        wkgbmnqykcVar.wkgbmnqykc(this.f91996draadjrbmk.ppxfxbqfkf(), new l9.draadjrbmk() { // from class: yl0.ppxfxbqfkf
            @Override // l9.draadjrbmk
            public final void iobyxmoadg(Object obj) {
                ru.myspar.proloyalty.address.impl.map.presentation.iobyxmoadg.ribwqtqdhb(this.f125884iobyxmoadg, obj);
            }
        });
        wkgbmnqykcVar.lqeggnwhkg(this.f91995btonecajqb.wkgbmnqykc(new AddressSearchArgs(locationData)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ribwqtqdhb(iobyxmoadg iobyxmoadgVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        AddressSearchResultHelper.Result resultZoijcleaow = iobyxmoadgVar.f91996draadjrbmk.zoijcleaow(it);
        if (resultZoijcleaow == null) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new C2139iobyxmoadg(resultZoijcleaow, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xl0.wkgbmnqykc sopmlzcsov(ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow zoijcleaowVar) {
        xl0.wkgbmnqykc draadjrbmkVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.eablkybsjg.f92019iobyxmoadg)) {
            return xl0.wkgbmnqykc.lqeggnwhkg.f122859iobyxmoadg;
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.ppxfxbqfkf) {
            return xl0.wkgbmnqykc.eablkybsjg.f122855iobyxmoadg;
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.wkgbmnqykc) {
            return xl0.wkgbmnqykc.gxszxtbevo.f122857iobyxmoadg;
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.C2141zoijcleaow) {
            draadjrbmkVar = new xl0.wkgbmnqykc.C3091wkgbmnqykc(((ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.C2141zoijcleaow) zoijcleaowVar).iobyxmoadg());
        } else {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.iobyxmoadg.f92022iobyxmoadg)) {
                return xl0.wkgbmnqykc.ppxfxbqfkf.f122861iobyxmoadg;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.gtknphoqwx.f92020iobyxmoadg)) {
                return xl0.wkgbmnqykc.wflxmlrfwp.f122862iobyxmoadg;
            }
            if (zoijcleaowVar instanceof ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.dxjokdxxww) {
                draadjrbmkVar = new xl0.wkgbmnqykc.gtknphoqwx(((ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.dxjokdxxww) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.nufgyqmvbu) {
                draadjrbmkVar = new xl0.wkgbmnqykc.btonecajqb(((ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.nufgyqmvbu) zoijcleaowVar).iobyxmoadg());
            } else {
                if (!(zoijcleaowVar instanceof ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.btonecajqb)) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.gxszxtbevo.f92021iobyxmoadg)) {
                        return xl0.wkgbmnqykc.nufgyqmvbu.f122860iobyxmoadg;
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.lqeggnwhkg.f92023iobyxmoadg)) {
                        return xl0.wkgbmnqykc.dxjokdxxww.f122854iobyxmoadg;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.btonecajqb btonecajqbVar = (ru.myspar.proloyalty.address.impl.map.presentation.zoijcleaow.btonecajqb) zoijcleaowVar;
                draadjrbmkVar = new xl0.wkgbmnqykc.draadjrbmk(btonecajqbVar.zoijcleaow(), btonecajqbVar.iobyxmoadg(), btonecajqbVar.ppxfxbqfkf());
            }
        }
        return draadjrbmkVar;
    }

    private final void vipkmwdibw(g21.wkgbmnqykc wkgbmnqykcVar, LocationData locationData) {
        wkgbmnqykcVar.wkgbmnqykc(this.f91999wflxmlrfwp.ppxfxbqfkf(), new l9.draadjrbmk() { // from class: yl0.wkgbmnqykc
            @Override // l9.draadjrbmk
            public final void iobyxmoadg(Object obj) {
                ru.myspar.proloyalty.address.impl.map.presentation.iobyxmoadg.jhduphickx(this.f125885iobyxmoadg, obj);
            }
        });
        wkgbmnqykcVar.lqeggnwhkg(this.f91995btonecajqb.gxszxtbevo(new ShopSearchArgs(locationData)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f122762iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else {
            if (eablkybsjgVar instanceof eablkybsjg.lqeggnwhkg) {
                Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.nufgyqmvbu.f122755iobyxmoadg)) {
                Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f92009iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.dxjokdxxww.f122750iobyxmoadg)) {
                Object objCllcsxoeiz3 = cllcsxoeiz(ppxfxbqfkf.C2140ppxfxbqfkf.f92007iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.btonecajqb.f122749iobyxmoadg)) {
                Object objCllcsxoeiz4 = cllcsxoeiz(ppxfxbqfkf.wkgbmnqykc.f92008iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof eablkybsjg.C3088eablkybsjg) {
                jlmebxxoox(i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm(), ((eablkybsjg.C3088eablkybsjg) eablkybsjgVar).iobyxmoadg());
            } else if (eablkybsjgVar instanceof eablkybsjg.gxszxtbevo) {
                vipkmwdibw(i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm(), ((eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg());
            } else if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
                eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (eablkybsjg.wkgbmnqykc) eablkybsjgVar;
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(tl0.nufgyqmvbu.zoijcleaow(new AddressDetailScreenArgs(new AddressDetailScreenMode.CreateNew(wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow()))));
            } else if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
                g21.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm();
                eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (eablkybsjg.ppxfxbqfkf) eablkybsjgVar;
                wkgbmnqykcVarOxmwwwfdhm.ppxfxbqfkf(this.f91997gtknphoqwx.ppxfxbqfkf(), this.f91997gtknphoqwx.iobyxmoadg(ppxfxbqfkfVar.ppxfxbqfkf(), ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow()));
                wkgbmnqykcVarOxmwwwfdhm.gxszxtbevo();
            } else {
                if (!(eablkybsjgVar instanceof eablkybsjg.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                i21.iobyxmoadg.f41720iobyxmoadg.wflxmlrfwp();
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f91994agtfadlqog;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f91998ojitshcjhn;
    }
}
