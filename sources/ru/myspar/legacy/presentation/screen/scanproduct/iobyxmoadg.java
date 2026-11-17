package ru.myspar.legacy.presentation.screen.scanproduct;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import d80.lqeggnwhkg;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import lg.gxszxtbevo;
import md0.kcexrzcfyt;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.domain.feature.scanproduct.store.State;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final lq.iobyxmoadg f89645btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f89646draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f89647gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.scanproduct.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2054iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f89648jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89650zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2054iobyxmoadg(boolean z13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f89648jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C2054iobyxmoadg(this.f89648jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89650zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                d80.wkgbmnqykc.lqeggnwhkg lqeggnwhkgVar = new d80.wkgbmnqykc.lqeggnwhkg(this.f89648jyumaefscl);
                this.f89650zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(lqeggnwhkgVar, this) == objGxszxtbevo) {
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
            return ((C2054iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f89651jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f89653zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f89653zdlpuopuiu = obj;
            this.f89651jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ribwqtqdhb(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f89654jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89656zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(boolean z13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f89654jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f89654jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89656zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                d80.wkgbmnqykc.nufgyqmvbu nufgyqmvbuVar = new d80.wkgbmnqykc.nufgyqmvbu(this.f89654jyumaefscl);
                this.f89656zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(nufgyqmvbuVar, this) == objGxszxtbevo) {
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
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, lq.iobyxmoadg catalogFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        this.f89645btonecajqb = catalogFeatureApi;
        this.f89647gtknphoqwx = new draadjrbmk() { // from class: md0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.scanproduct.iobyxmoadg.vipkmwdibw((State) obj);
            }
        };
        this.f89646draadjrbmk = new draadjrbmk() { // from class: md0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.scanproduct.iobyxmoadg.ulzqkzuiru((ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ribwqtqdhb(wkgbmnqykc wkgbmnqykcVar, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f89651jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f89651jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f89653zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f89651jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            ppxfxbqfkfVar.f89651jyumaefscl = 1;
            if (cllcsxoeiz(wkgbmnqykcVar, ppxfxbqfkfVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
        }
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d80.wkgbmnqykc ulzqkzuiru(ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf ppxfxbqfkfVar) {
        d80.wkgbmnqykc gxszxtbevoVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.eablkybsjg.f89657iobyxmoadg)) {
            return d80.wkgbmnqykc.eablkybsjg.f27183iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.wkgbmnqykc.f89662iobyxmoadg)) {
            return d80.wkgbmnqykc.C0504wkgbmnqykc.f27189iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.iobyxmoadg.f89659iobyxmoadg)) {
            return d80.wkgbmnqykc.iobyxmoadg.f27185iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.lqeggnwhkg.f89660iobyxmoadg)) {
            return d80.wkgbmnqykc.dxjokdxxww.f27182iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.zoijcleaow) {
            gxszxtbevoVar = new d80.wkgbmnqykc.zoijcleaow(((ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.C2055ppxfxbqfkf) {
            gxszxtbevoVar = new d80.wkgbmnqykc.ppxfxbqfkf(((ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.C2055ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.gxszxtbevo)) {
                throw new NoWhenBranchMatchedException();
            }
            gxszxtbevoVar = new d80.wkgbmnqykc.gxszxtbevo(((ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.gxszxtbevo) ppxfxbqfkfVar).iobyxmoadg());
        }
        return gxszxtbevoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kcexrzcfyt vipkmwdibw(State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        return new kcexrzcfyt(state.getIsFlashVisibility(), state.getIsFlashEnabled());
    }

    public final void crxdokpmqz(boolean z13) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new C2054iobyxmoadg(z13, null), 3, null);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f89647gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f89646draadjrbmk;
    }

    public final void jlmebxxoox(boolean z13) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new zoijcleaow(z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(d80.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof d80.eablkybsjg.nufgyqmvbu) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.gxszxtbevo(((d80.eablkybsjg.nufgyqmvbu) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, d80.eablkybsjg.ppxfxbqfkf.f27163iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f89666iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, d80.eablkybsjg.wkgbmnqykc.f27164iobyxmoadg)) {
            Object objCllcsxoeiz3 = cllcsxoeiz(wkgbmnqykc.zoijcleaow.f89670iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, d80.eablkybsjg.gxszxtbevo.f27159iobyxmoadg)) {
            Object objRibwqtqdhb = ribwqtqdhb(wkgbmnqykc.C2056wkgbmnqykc.f89669iobyxmoadg, gxszxtbevoVar);
            return objRibwqtqdhb == mg.zoijcleaow.gxszxtbevo() ? objRibwqtqdhb : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, d80.eablkybsjg.C0502eablkybsjg.f27158iobyxmoadg)) {
            Object objRibwqtqdhb2 = ribwqtqdhb(wkgbmnqykc.ppxfxbqfkf.f89668iobyxmoadg, gxszxtbevoVar);
            return objRibwqtqdhb2 == mg.zoijcleaow.gxszxtbevo() ? objRibwqtqdhb2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, d80.eablkybsjg.lqeggnwhkg.f27161iobyxmoadg)) {
            Object objRibwqtqdhb3 = ribwqtqdhb(wkgbmnqykc.eablkybsjg.f89664iobyxmoadg, gxszxtbevoVar);
            return objRibwqtqdhb3 == mg.zoijcleaow.gxszxtbevo() ? objRibwqtqdhb3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, d80.eablkybsjg.dxjokdxxww.f27157iobyxmoadg)) {
            Object objCllcsxoeiz4 = cllcsxoeiz(wkgbmnqykc.lqeggnwhkg.f89667iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof d80.eablkybsjg.zoijcleaow) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f89645btonecajqb.gxszxtbevo(new ProductPayload(new ProductPayload.Type.Barcode(((d80.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), null, 2, null)));
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, d80.eablkybsjg.iobyxmoadg.f27160iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
