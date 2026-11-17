package ru.myspar.proloyalty.scan.impl.scan_screen.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kn1.eablkybsjg;
import kn1.nufgyqmvbu;
import kotlin.NoWhenBranchMatchedException;
import lg.gxszxtbevo;
import ln1.kcexrzcfyt;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.scan.impl.scan_screen.domain.State;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final xo0.iobyxmoadg f100410btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f100411draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f100412gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scan.impl.scan_screen.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2413iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f100413jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100415zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2413iobyxmoadg(boolean z13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f100413jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C2413iobyxmoadg(this.f100413jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100415zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                kn1.wkgbmnqykc.lqeggnwhkg lqeggnwhkgVar = new kn1.wkgbmnqykc.lqeggnwhkg(this.f100413jyumaefscl);
                this.f100415zdlpuopuiu = 1;
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
            return ((C2413iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f100416jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f100418zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f100418zdlpuopuiu = obj;
            this.f100416jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ribwqtqdhb(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f100419jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100421zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(boolean z13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f100419jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f100419jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100421zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                kn1.wkgbmnqykc.nufgyqmvbu nufgyqmvbuVar = new kn1.wkgbmnqykc.nufgyqmvbu(this.f100419jyumaefscl);
                this.f100421zdlpuopuiu = 1;
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
    public iobyxmoadg(nufgyqmvbu store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, xo0.iobyxmoadg catalogFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        this.f100410btonecajqb = catalogFeatureApi;
        this.f100412gtknphoqwx = new draadjrbmk() { // from class: ln1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.scan.impl.scan_screen.presentation.iobyxmoadg.vipkmwdibw((State) obj);
            }
        };
        this.f100411draadjrbmk = new draadjrbmk() { // from class: ln1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.scan.impl.scan_screen.presentation.iobyxmoadg.ulzqkzuiru((ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ribwqtqdhb(ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar2;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar2 = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar2.f100416jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar2.f100416jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar2 = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar2 = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar2.f100418zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar2.f100416jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            ppxfxbqfkfVar2.f100416jyumaefscl = 1;
            if (cllcsxoeiz(ppxfxbqfkfVar, ppxfxbqfkfVar2) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
        }
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kn1.wkgbmnqykc ulzqkzuiru(ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow zoijcleaowVar) {
        kn1.wkgbmnqykc gxszxtbevoVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.eablkybsjg.f100430iobyxmoadg)) {
            return kn1.wkgbmnqykc.eablkybsjg.f59901iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.wkgbmnqykc.f100435iobyxmoadg)) {
            return kn1.wkgbmnqykc.C1193wkgbmnqykc.f59907iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.iobyxmoadg.f100432iobyxmoadg)) {
            return kn1.wkgbmnqykc.iobyxmoadg.f59903iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.lqeggnwhkg.f100433iobyxmoadg)) {
            return kn1.wkgbmnqykc.dxjokdxxww.f59900iobyxmoadg;
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.C2415zoijcleaow) {
            gxszxtbevoVar = new kn1.wkgbmnqykc.zoijcleaow(((ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.C2415zoijcleaow) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.ppxfxbqfkf) {
            gxszxtbevoVar = new kn1.wkgbmnqykc.ppxfxbqfkf(((ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
        } else {
            if (!(zoijcleaowVar instanceof ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.gxszxtbevo)) {
                throw new NoWhenBranchMatchedException();
            }
            gxszxtbevoVar = new kn1.wkgbmnqykc.gxszxtbevo(((ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.gxszxtbevo) zoijcleaowVar).iobyxmoadg());
        }
        return gxszxtbevoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kcexrzcfyt vipkmwdibw(State state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        return new kcexrzcfyt(state.getArgs().getType(), state.getIsFlashVisibility(), state.getIsFlashEnabled());
    }

    public final void crxdokpmqz(boolean z13) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new C2413iobyxmoadg(z13, null), 3, null);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f100412gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f100411draadjrbmk;
    }

    public final void jlmebxxoox(boolean z13) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new zoijcleaow(z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.dxjokdxxww) {
            Object objCllcsxoeiz = cllcsxoeiz(new ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.gxszxtbevo(((eablkybsjg.dxjokdxxww) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.wkgbmnqykc.f59880iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.iobyxmoadg.f100424iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.C1191eablkybsjg.f59874iobyxmoadg)) {
            Object objCllcsxoeiz3 = cllcsxoeiz(ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.zoijcleaow.f100428iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.lqeggnwhkg.f59877iobyxmoadg)) {
            Object objRibwqtqdhb = ribwqtqdhb(ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.wkgbmnqykc.f100427iobyxmoadg, gxszxtbevoVar);
            return objRibwqtqdhb == mg.zoijcleaow.gxszxtbevo() ? objRibwqtqdhb : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.gxszxtbevo.f59875iobyxmoadg)) {
            Object objRibwqtqdhb2 = ribwqtqdhb(ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.C2414ppxfxbqfkf.f100426iobyxmoadg, gxszxtbevoVar);
            return objRibwqtqdhb2 == mg.zoijcleaow.gxszxtbevo() ? objRibwqtqdhb2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.nufgyqmvbu.f59878iobyxmoadg)) {
            Object objRibwqtqdhb3 = ribwqtqdhb(ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.eablkybsjg.f100422iobyxmoadg, gxszxtbevoVar);
            return objRibwqtqdhb3 == mg.zoijcleaow.gxszxtbevo() ? objRibwqtqdhb3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.btonecajqb.f59872iobyxmoadg)) {
            Object objCllcsxoeiz4 = cllcsxoeiz(ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.lqeggnwhkg.f100425iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f100410btonecajqb.gxszxtbevo(new ProductPayload(new ProductPayload.Type.Barcode(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), null, 2, null)));
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f59876iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else {
            if (!(eablkybsjgVar instanceof eablkybsjg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
            iobyxmoadgVar.oxmwwwfdhm().ppxfxbqfkf("SCAN_RESULT_KEY", ((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg());
            iobyxmoadgVar.gtknphoqwx();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
