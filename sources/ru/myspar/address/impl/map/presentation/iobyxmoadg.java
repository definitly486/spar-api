package ru.myspar.address.impl.map.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import lg.gxszxtbevo;
import mn.eablkybsjg;
import mn.nufgyqmvbu;
import nn.dxjokdxxww;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.address.api.AddressMapResultHelper;
import ru.myspar.address.api.AddressSearchResultHelper;
import ru.myspar.address.api.ShopSearchResultHelper;
import ru.myspar.address.api.model.AddressDetailScreenArgs;
import ru.myspar.address.api.model.AddressDetailScreenMode;
import ru.myspar.address.api.model.AddressSearchArgs;
import ru.myspar.address.api.model.ShopSearchArgs;
import ru.myspar.address.impl.map.domain.State;
import ru.myspar.common.models.LocationData;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f83969agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final qm.iobyxmoadg f83970btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final AddressSearchResultHelper f83971draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final AddressMapResultHelper f83972gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final draadjrbmk f83973ojitshcjhn;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final ShopSearchResultHelper f83974wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.address.impl.map.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1895iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ AddressSearchResultHelper.Result f83975jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83977zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1895iobyxmoadg(AddressSearchResultHelper.Result result, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f83975jyumaefscl = result;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C1895iobyxmoadg(this.f83975jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83977zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                mn.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = new mn.wkgbmnqykc.iobyxmoadg(this.f83975jyumaefscl.getLocation());
                this.f83977zdlpuopuiu = 1;
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
            return ((C1895iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ mn.wkgbmnqykc.zoijcleaow f83978jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83980zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(mn.wkgbmnqykc.zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f83978jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f83978jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83980zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                mn.wkgbmnqykc.zoijcleaow zoijcleaowVar = this.f83978jyumaefscl;
                this.f83980zdlpuopuiu = 1;
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
    public iobyxmoadg(nufgyqmvbu storeFactory, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, qm.iobyxmoadg addressFeatureApi, AddressMapResultHelper addressMapResultHelper, AddressSearchResultHelper addressSearchResultHelper, ShopSearchResultHelper shopSearchResultHelper) {
        super(storeFactory, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storeFactory, "storeFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressMapResultHelper, "addressMapResultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressSearchResultHelper, "addressSearchResultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shopSearchResultHelper, "shopSearchResultHelper");
        this.f83970btonecajqb = addressFeatureApi;
        this.f83972gtknphoqwx = addressMapResultHelper;
        this.f83971draadjrbmk = addressSearchResultHelper;
        this.f83974wflxmlrfwp = shopSearchResultHelper;
        this.f83969agtfadlqog = new draadjrbmk() { // from class: nn.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.address.impl.map.presentation.iobyxmoadg.ikoacuggdj((State) obj);
            }
        };
        this.f83973ojitshcjhn = new draadjrbmk() { // from class: nn.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.address.impl.map.presentation.iobyxmoadg.sopmlzcsov((ru.myspar.address.impl.map.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww ikoacuggdj(State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        return pn.iobyxmoadg.wkgbmnqykc(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jhduphickx(iobyxmoadg iobyxmoadgVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ShopSearchResultHelper.Result resultZoijcleaow = iobyxmoadgVar.f83974wflxmlrfwp.zoijcleaow(it);
        if (resultZoijcleaow == null) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new zoijcleaow(new mn.wkgbmnqykc.zoijcleaow(resultZoijcleaow.getShopId(), resultZoijcleaow.getAddress(), resultZoijcleaow.getLocation()), null), 3, null);
    }

    private final void jlmebxxoox(b40.wkgbmnqykc wkgbmnqykcVar, LocationData locationData) {
        wkgbmnqykcVar.wkgbmnqykc(this.f83971draadjrbmk.ppxfxbqfkf(), new l9.draadjrbmk() { // from class: nn.ppxfxbqfkf
            @Override // l9.draadjrbmk
            public final void iobyxmoadg(Object obj) {
                ru.myspar.address.impl.map.presentation.iobyxmoadg.ribwqtqdhb(this.f70423iobyxmoadg, obj);
            }
        });
        wkgbmnqykcVar.lqeggnwhkg(this.f83970btonecajqb.wkgbmnqykc(new AddressSearchArgs(locationData)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ribwqtqdhb(iobyxmoadg iobyxmoadgVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        AddressSearchResultHelper.Result resultZoijcleaow = iobyxmoadgVar.f83971draadjrbmk.zoijcleaow(it);
        if (resultZoijcleaow == null) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new C1895iobyxmoadg(resultZoijcleaow, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mn.wkgbmnqykc sopmlzcsov(ru.myspar.address.impl.map.presentation.zoijcleaow zoijcleaowVar) {
        mn.wkgbmnqykc draadjrbmkVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.address.impl.map.presentation.zoijcleaow.eablkybsjg.f83994iobyxmoadg)) {
            return mn.wkgbmnqykc.lqeggnwhkg.f67635iobyxmoadg;
        }
        if (zoijcleaowVar instanceof ru.myspar.address.impl.map.presentation.zoijcleaow.ppxfxbqfkf) {
            return mn.wkgbmnqykc.eablkybsjg.f67631iobyxmoadg;
        }
        if (zoijcleaowVar instanceof ru.myspar.address.impl.map.presentation.zoijcleaow.wkgbmnqykc) {
            return mn.wkgbmnqykc.gxszxtbevo.f67633iobyxmoadg;
        }
        if (zoijcleaowVar instanceof ru.myspar.address.impl.map.presentation.zoijcleaow.C1897zoijcleaow) {
            draadjrbmkVar = new mn.wkgbmnqykc.C1401wkgbmnqykc(((ru.myspar.address.impl.map.presentation.zoijcleaow.C1897zoijcleaow) zoijcleaowVar).iobyxmoadg());
        } else {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.address.impl.map.presentation.zoijcleaow.iobyxmoadg.f83997iobyxmoadg)) {
                return mn.wkgbmnqykc.ppxfxbqfkf.f67637iobyxmoadg;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.address.impl.map.presentation.zoijcleaow.gtknphoqwx.f83995iobyxmoadg)) {
                return mn.wkgbmnqykc.wflxmlrfwp.f67638iobyxmoadg;
            }
            if (zoijcleaowVar instanceof ru.myspar.address.impl.map.presentation.zoijcleaow.dxjokdxxww) {
                draadjrbmkVar = new mn.wkgbmnqykc.gtknphoqwx(((ru.myspar.address.impl.map.presentation.zoijcleaow.dxjokdxxww) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof ru.myspar.address.impl.map.presentation.zoijcleaow.nufgyqmvbu) {
                draadjrbmkVar = new mn.wkgbmnqykc.btonecajqb(((ru.myspar.address.impl.map.presentation.zoijcleaow.nufgyqmvbu) zoijcleaowVar).iobyxmoadg());
            } else {
                if (!(zoijcleaowVar instanceof ru.myspar.address.impl.map.presentation.zoijcleaow.btonecajqb)) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.address.impl.map.presentation.zoijcleaow.gxszxtbevo.f83996iobyxmoadg)) {
                        return mn.wkgbmnqykc.nufgyqmvbu.f67636iobyxmoadg;
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.address.impl.map.presentation.zoijcleaow.lqeggnwhkg.f83998iobyxmoadg)) {
                        return mn.wkgbmnqykc.dxjokdxxww.f67630iobyxmoadg;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ru.myspar.address.impl.map.presentation.zoijcleaow.btonecajqb btonecajqbVar = (ru.myspar.address.impl.map.presentation.zoijcleaow.btonecajqb) zoijcleaowVar;
                draadjrbmkVar = new mn.wkgbmnqykc.draadjrbmk(btonecajqbVar.zoijcleaow(), btonecajqbVar.iobyxmoadg(), btonecajqbVar.ppxfxbqfkf());
            }
        }
        return draadjrbmkVar;
    }

    private final void vipkmwdibw(b40.wkgbmnqykc wkgbmnqykcVar, LocationData locationData) {
        wkgbmnqykcVar.wkgbmnqykc(this.f83974wflxmlrfwp.ppxfxbqfkf(), new l9.draadjrbmk() { // from class: nn.wkgbmnqykc
            @Override // l9.draadjrbmk
            public final void iobyxmoadg(Object obj) {
                ru.myspar.address.impl.map.presentation.iobyxmoadg.jhduphickx(this.f70424iobyxmoadg, obj);
            }
        });
        wkgbmnqykcVar.lqeggnwhkg(this.f83970btonecajqb.zoijcleaow(new ShopSearchArgs(locationData)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f67538iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else {
            if (eablkybsjgVar instanceof eablkybsjg.lqeggnwhkg) {
                Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.nufgyqmvbu.f67531iobyxmoadg)) {
                Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f83984iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.dxjokdxxww.f67526iobyxmoadg)) {
                Object objCllcsxoeiz3 = cllcsxoeiz(ppxfxbqfkf.C1896ppxfxbqfkf.f83982iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.btonecajqb.f67525iobyxmoadg)) {
                Object objCllcsxoeiz4 = cllcsxoeiz(ppxfxbqfkf.wkgbmnqykc.f83983iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof eablkybsjg.C1398eablkybsjg) {
                jlmebxxoox(d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm(), ((eablkybsjg.C1398eablkybsjg) eablkybsjgVar).iobyxmoadg());
            } else if (eablkybsjgVar instanceof eablkybsjg.gxszxtbevo) {
                vipkmwdibw(d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm(), ((eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg());
            } else if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
                eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (eablkybsjg.wkgbmnqykc) eablkybsjgVar;
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(in.nufgyqmvbu.zoijcleaow(new AddressDetailScreenArgs(new AddressDetailScreenMode.CreateNew(wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow()))));
            } else if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
                b40.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm();
                eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (eablkybsjg.ppxfxbqfkf) eablkybsjgVar;
                wkgbmnqykcVarOxmwwwfdhm.ppxfxbqfkf(this.f83972gtknphoqwx.ppxfxbqfkf(), this.f83972gtknphoqwx.iobyxmoadg(ppxfxbqfkfVar.ppxfxbqfkf(), ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow()));
                wkgbmnqykcVarOxmwwwfdhm.gxszxtbevo();
            } else {
                if (!(eablkybsjgVar instanceof eablkybsjg.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                d40.iobyxmoadg.f26931iobyxmoadg.wflxmlrfwp();
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f83969agtfadlqog;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f83973ojitshcjhn;
    }
}
