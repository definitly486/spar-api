package an;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.address.api.AddressDetailResultHelper;
import ru.myspar.address.api.AddressMapResultHelper;
import ru.myspar.address.api.model.AddressDetailScreenArgs;
import ru.myspar.address.api.model.AddressDetailScreenMode;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f2266agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final qm.iobyxmoadg f2267btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final AddressDetailResultHelper f2268draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final AddressMapResultHelper f2269gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f2270wflxmlrfwp;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f2272zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f2272zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                fn.wkgbmnqykc.dxjokdxxww dxjokdxxwwVar = new fn.wkgbmnqykc.dxjokdxxww(rm.zoijcleaow.Delivery);
                this.f2272zdlpuopuiu = 1;
                if (wkgbmnqykcVar.jpowsppfya(dxjokdxxwwVar, this) == objGxszxtbevo) {
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
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f2274zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f2274zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                fn.wkgbmnqykc.dxjokdxxww dxjokdxxwwVar = new fn.wkgbmnqykc.dxjokdxxww(rm.zoijcleaow.PickUp);
                this.f2274zdlpuopuiu = 1;
                if (wkgbmnqykcVar.jpowsppfya(dxjokdxxwwVar, this) == objGxszxtbevo) {
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
    public wkgbmnqykc(qm.iobyxmoadg addressFeatureApi, AddressMapResultHelper addressMapResultHelper, AddressDetailResultHelper addressDetailResultHelper, dn.iobyxmoadg contactsUiMapper, fn.nufgyqmvbu store, ns.iobyxmoadg dispatchers, pkzmftpjix savedStateHandle) {
        super(store, dispatchers, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressMapResultHelper, "addressMapResultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressDetailResultHelper, "addressDetailResultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(contactsUiMapper, "contactsUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchers, "dispatchers");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f2267btonecajqb = addressFeatureApi;
        this.f2269gtknphoqwx = addressMapResultHelper;
        this.f2268draadjrbmk = addressDetailResultHelper;
        this.f2270wflxmlrfwp = contactsUiMapper;
        this.f2266agtfadlqog = new draadjrbmk() { // from class: an.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.ulzqkzuiru((en.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void crxdokpmqz(wkgbmnqykc wkgbmnqykcVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (wkgbmnqykcVar.f2268draadjrbmk.zoijcleaow(it) == null) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(wkgbmnqykcVar), null, null, wkgbmnqykcVar.new iobyxmoadg(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jlmebxxoox(wkgbmnqykc wkgbmnqykcVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (wkgbmnqykcVar.f2269gtknphoqwx.zoijcleaow(it) == null) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(wkgbmnqykcVar), null, null, wkgbmnqykcVar.new zoijcleaow(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fn.wkgbmnqykc ulzqkzuiru(en.ppxfxbqfkf ppxfxbqfkfVar) {
        fn.wkgbmnqykc nufgyqmvbuVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (ppxfxbqfkfVar instanceof en.ppxfxbqfkf.zoijcleaow) {
            return fn.wkgbmnqykc.iobyxmoadg.f34463iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof en.ppxfxbqfkf.iobyxmoadg) {
            return fn.wkgbmnqykc.zoijcleaow.f34468iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof en.ppxfxbqfkf.eablkybsjg) {
            return fn.wkgbmnqykc.eablkybsjg.f34461iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof en.ppxfxbqfkf.lqeggnwhkg) {
            return fn.wkgbmnqykc.lqeggnwhkg.f34464iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof en.ppxfxbqfkf.gxszxtbevo) {
            nufgyqmvbuVar = new fn.wkgbmnqykc.gxszxtbevo(((en.ppxfxbqfkf.gxszxtbevo) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof en.ppxfxbqfkf.C0675ppxfxbqfkf) {
            nufgyqmvbuVar = new fn.wkgbmnqykc.ppxfxbqfkf(((en.ppxfxbqfkf.C0675ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof en.ppxfxbqfkf.wkgbmnqykc) {
            nufgyqmvbuVar = new fn.wkgbmnqykc.C0759wkgbmnqykc(((en.ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof en.ppxfxbqfkf.nufgyqmvbu)) {
                throw new NoWhenBranchMatchedException();
            }
            nufgyqmvbuVar = new fn.wkgbmnqykc.nufgyqmvbu(((en.ppxfxbqfkf.nufgyqmvbu) ppxfxbqfkfVar).iobyxmoadg());
        }
        return nufgyqmvbuVar;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f2270wflxmlrfwp;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f2266agtfadlqog;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(fn.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof fn.eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz = cllcsxoeiz(new en.eablkybsjg.zoijcleaow(((fn.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof fn.eablkybsjg.iobyxmoadg) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else if (eablkybsjgVar instanceof fn.eablkybsjg.ppxfxbqfkf) {
            d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
            iobyxmoadgVar.oxmwwwfdhm().wkgbmnqykc(this.f2268draadjrbmk.ppxfxbqfkf(), new l9.draadjrbmk() { // from class: an.zoijcleaow
                @Override // l9.draadjrbmk
                public final void iobyxmoadg(Object obj) {
                    wkgbmnqykc.crxdokpmqz(this.f2275iobyxmoadg, obj);
                }
            });
            iobyxmoadgVar.oxmwwwfdhm().lqeggnwhkg(in.nufgyqmvbu.zoijcleaow(new AddressDetailScreenArgs(new AddressDetailScreenMode.EditExisted(((fn.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()))));
        } else {
            if (!(eablkybsjgVar instanceof fn.eablkybsjg.zoijcleaow)) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, fn.eablkybsjg.C0757eablkybsjg.f34417iobyxmoadg)) {
                    Object objCllcsxoeiz2 = cllcsxoeiz(en.eablkybsjg.iobyxmoadg.f31570iobyxmoadg, gxszxtbevoVar);
                    return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, fn.eablkybsjg.gxszxtbevo.f34418iobyxmoadg)) {
                    Object objCllcsxoeiz3 = cllcsxoeiz(en.eablkybsjg.ppxfxbqfkf.f31571iobyxmoadg, gxszxtbevoVar);
                    return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, fn.eablkybsjg.lqeggnwhkg.f34420iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz4 = cllcsxoeiz(en.eablkybsjg.wkgbmnqykc.f31572iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
            }
            d40.iobyxmoadg iobyxmoadgVar2 = d40.iobyxmoadg.f26931iobyxmoadg;
            iobyxmoadgVar2.oxmwwwfdhm().wkgbmnqykc(this.f2269gtknphoqwx.ppxfxbqfkf(), new l9.draadjrbmk() { // from class: an.ppxfxbqfkf
                @Override // l9.draadjrbmk
                public final void iobyxmoadg(Object obj) {
                    wkgbmnqykc.jlmebxxoox(this.f2265iobyxmoadg, obj);
                }
            });
            iobyxmoadgVar2.oxmwwwfdhm().lqeggnwhkg(this.f2267btonecajqb.iobyxmoadg(((fn.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
