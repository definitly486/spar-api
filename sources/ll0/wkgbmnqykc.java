package ll0;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.address.api.AddressDetailResultHelper;
import ru.myspar.proloyalty.address.api.AddressMapResultHelper;
import ru.myspar.proloyalty.address.api.model.AddressDetailScreenArgs;
import ru.myspar.proloyalty.address.api.model.AddressDetailScreenMode;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f63344agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final bl0.iobyxmoadg f63345btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final AddressDetailResultHelper f63346draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final AddressMapResultHelper f63347gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f63348wflxmlrfwp;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f63350zdlpuopuiu;

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
            int i13 = this.f63350zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                ql0.wkgbmnqykc.dxjokdxxww dxjokdxxwwVar = new ql0.wkgbmnqykc.dxjokdxxww(cl0.zoijcleaow.Delivery);
                this.f63350zdlpuopuiu = 1;
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
        int f63352zdlpuopuiu;

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
            int i13 = this.f63352zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                ql0.wkgbmnqykc.dxjokdxxww dxjokdxxwwVar = new ql0.wkgbmnqykc.dxjokdxxww(cl0.zoijcleaow.PickUp);
                this.f63352zdlpuopuiu = 1;
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
    public wkgbmnqykc(bl0.iobyxmoadg addressFeatureApi, AddressMapResultHelper addressMapResultHelper, AddressDetailResultHelper addressDetailResultHelper, ol0.iobyxmoadg contactsUiMapper, ql0.nufgyqmvbu store, dr0.iobyxmoadg dispatchers, pkzmftpjix savedStateHandle) {
        super(store, dispatchers, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressMapResultHelper, "addressMapResultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressDetailResultHelper, "addressDetailResultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(contactsUiMapper, "contactsUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchers, "dispatchers");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f63345btonecajqb = addressFeatureApi;
        this.f63347gtknphoqwx = addressMapResultHelper;
        this.f63346draadjrbmk = addressDetailResultHelper;
        this.f63348wflxmlrfwp = contactsUiMapper;
        this.f63344agtfadlqog = new draadjrbmk() { // from class: ll0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.ulzqkzuiru((pl0.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void crxdokpmqz(wkgbmnqykc wkgbmnqykcVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (wkgbmnqykcVar.f63346draadjrbmk.zoijcleaow(it) == null) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(wkgbmnqykcVar), null, null, wkgbmnqykcVar.new iobyxmoadg(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jlmebxxoox(wkgbmnqykc wkgbmnqykcVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (wkgbmnqykcVar.f63347gtknphoqwx.zoijcleaow(it) == null) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(wkgbmnqykcVar), null, null, wkgbmnqykcVar.new zoijcleaow(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ql0.wkgbmnqykc ulzqkzuiru(pl0.ppxfxbqfkf ppxfxbqfkfVar) {
        ql0.wkgbmnqykc nufgyqmvbuVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (ppxfxbqfkfVar instanceof pl0.ppxfxbqfkf.zoijcleaow) {
            return ql0.wkgbmnqykc.iobyxmoadg.f79142iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof pl0.ppxfxbqfkf.iobyxmoadg) {
            return ql0.wkgbmnqykc.zoijcleaow.f79147iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof pl0.ppxfxbqfkf.eablkybsjg) {
            return ql0.wkgbmnqykc.eablkybsjg.f79140iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof pl0.ppxfxbqfkf.lqeggnwhkg) {
            return ql0.wkgbmnqykc.lqeggnwhkg.f79143iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof pl0.ppxfxbqfkf.gxszxtbevo) {
            nufgyqmvbuVar = new ql0.wkgbmnqykc.gxszxtbevo(((pl0.ppxfxbqfkf.gxszxtbevo) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof pl0.ppxfxbqfkf.C1701ppxfxbqfkf) {
            nufgyqmvbuVar = new ql0.wkgbmnqykc.ppxfxbqfkf(((pl0.ppxfxbqfkf.C1701ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof pl0.ppxfxbqfkf.wkgbmnqykc) {
            nufgyqmvbuVar = new ql0.wkgbmnqykc.C1771wkgbmnqykc(((pl0.ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof pl0.ppxfxbqfkf.nufgyqmvbu)) {
                throw new NoWhenBranchMatchedException();
            }
            nufgyqmvbuVar = new ql0.wkgbmnqykc.nufgyqmvbu(((pl0.ppxfxbqfkf.nufgyqmvbu) ppxfxbqfkfVar).iobyxmoadg());
        }
        return nufgyqmvbuVar;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f63348wflxmlrfwp;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f63344agtfadlqog;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ql0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof ql0.eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz = cllcsxoeiz(new pl0.eablkybsjg.zoijcleaow(((ql0.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof ql0.eablkybsjg.iobyxmoadg) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else if (eablkybsjgVar instanceof ql0.eablkybsjg.ppxfxbqfkf) {
            i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
            iobyxmoadgVar.oxmwwwfdhm().wkgbmnqykc(this.f63346draadjrbmk.ppxfxbqfkf(), new l9.draadjrbmk() { // from class: ll0.zoijcleaow
                @Override // l9.draadjrbmk
                public final void iobyxmoadg(Object obj) {
                    wkgbmnqykc.crxdokpmqz(this.f63353iobyxmoadg, obj);
                }
            });
            iobyxmoadgVar.oxmwwwfdhm().lqeggnwhkg(tl0.nufgyqmvbu.zoijcleaow(new AddressDetailScreenArgs(new AddressDetailScreenMode.EditExisted(((ql0.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()))));
        } else {
            if (!(eablkybsjgVar instanceof ql0.eablkybsjg.zoijcleaow)) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ql0.eablkybsjg.C1769eablkybsjg.f79096iobyxmoadg)) {
                    Object objCllcsxoeiz2 = cllcsxoeiz(pl0.eablkybsjg.iobyxmoadg.f76901iobyxmoadg, gxszxtbevoVar);
                    return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ql0.eablkybsjg.gxszxtbevo.f79097iobyxmoadg)) {
                    Object objCllcsxoeiz3 = cllcsxoeiz(pl0.eablkybsjg.ppxfxbqfkf.f76902iobyxmoadg, gxszxtbevoVar);
                    return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ql0.eablkybsjg.lqeggnwhkg.f79099iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz4 = cllcsxoeiz(pl0.eablkybsjg.wkgbmnqykc.f76903iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
            }
            i21.iobyxmoadg iobyxmoadgVar2 = i21.iobyxmoadg.f41720iobyxmoadg;
            iobyxmoadgVar2.oxmwwwfdhm().wkgbmnqykc(this.f63347gtknphoqwx.ppxfxbqfkf(), new l9.draadjrbmk() { // from class: ll0.ppxfxbqfkf
                @Override // l9.draadjrbmk
                public final void iobyxmoadg(Object obj) {
                    wkgbmnqykc.jlmebxxoox(this.f63343iobyxmoadg, obj);
                }
            });
            iobyxmoadgVar2.oxmwwwfdhm().lqeggnwhkg(this.f63345btonecajqb.zoijcleaow(((ql0.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
