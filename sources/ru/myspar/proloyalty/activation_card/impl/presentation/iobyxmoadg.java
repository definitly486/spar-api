package ru.myspar.proloyalty.activation_card.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import ru.myspar.proloyalty.scan.api.model.ScanScreenPayload;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import yk0.eablkybsjg;
import yk0.nufgyqmvbu;
import zk0.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final hn1.iobyxmoadg f91790btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f91791draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f91792gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.activation_card.impl.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2133iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f91793jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f91795zdlpuopuiu;

        C2133iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f91795zdlpuopuiu = obj;
            this.f91793jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lereixgezr(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f91796jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f91798zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(String str, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f91796jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f91796jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f91798zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                yk0.wkgbmnqykc.lqeggnwhkg lqeggnwhkgVar = new yk0.wkgbmnqykc.lqeggnwhkg(this.f91796jyumaefscl);
                this.f91798zdlpuopuiu = 1;
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
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg activationCardUiMapper, nufgyqmvbu store, dr0.iobyxmoadg dispatchers, pkzmftpjix savedStateHandle, hn1.iobyxmoadg scanFeatureApi) {
        super(store, dispatchers, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activationCardUiMapper, "activationCardUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchers, "dispatchers");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanFeatureApi, "scanFeatureApi");
        this.f91790btonecajqb = scanFeatureApi;
        this.f91792gtknphoqwx = activationCardUiMapper;
        this.f91791draadjrbmk = new draadjrbmk() { // from class: zk0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.activation_card.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.activation_card.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yk0.wkgbmnqykc ntlheqmsrt(ru.myspar.proloyalty.activation_card.impl.presentation.zoijcleaow zoijcleaowVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.activation_card.impl.presentation.zoijcleaow.wkgbmnqykc) {
            return new yk0.wkgbmnqykc.C3201wkgbmnqykc(((ru.myspar.proloyalty.activation_card.impl.presentation.zoijcleaow.wkgbmnqykc) zoijcleaowVar).iobyxmoadg());
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.activation_card.impl.presentation.zoijcleaow.C2134zoijcleaow) {
            return yk0.wkgbmnqykc.zoijcleaow.f125582iobyxmoadg;
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.activation_card.impl.presentation.zoijcleaow.gxszxtbevo) {
            return yk0.wkgbmnqykc.gxszxtbevo.f125576iobyxmoadg;
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.activation_card.impl.presentation.zoijcleaow.iobyxmoadg) {
            return yk0.wkgbmnqykc.iobyxmoadg.f125577iobyxmoadg;
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.activation_card.impl.presentation.zoijcleaow.ppxfxbqfkf) {
            return yk0.wkgbmnqykc.ppxfxbqfkf.f125580iobyxmoadg;
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.activation_card.impl.presentation.zoijcleaow.eablkybsjg) {
            return new yk0.wkgbmnqykc.eablkybsjg(((ru.myspar.proloyalty.activation_card.impl.presentation.zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg());
        }
        if (zoijcleaowVar instanceof ru.myspar.proloyalty.activation_card.impl.presentation.zoijcleaow.lqeggnwhkg) {
            return yk0.wkgbmnqykc.nufgyqmvbu.f125579iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sopmlzcsov(iobyxmoadg iobyxmoadgVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        String strWkgbmnqykc = dxjokdxxww.wkgbmnqykc(it instanceof String ? (String) it : null);
        if (strWkgbmnqykc == null) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(iobyxmoadgVar), null, null, iobyxmoadgVar.new zoijcleaow(strWkgbmnqykc, null), 3, null);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f91792gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f91791draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        C2133iobyxmoadg c2133iobyxmoadg;
        if (gxszxtbevoVar instanceof C2133iobyxmoadg) {
            c2133iobyxmoadg = (C2133iobyxmoadg) gxszxtbevoVar;
            int i13 = c2133iobyxmoadg.f91793jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2133iobyxmoadg.f91793jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2133iobyxmoadg = new C2133iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2133iobyxmoadg = new C2133iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2133iobyxmoadg.f91795zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2133iobyxmoadg.f91793jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
                i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
            } else if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
                i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
                iobyxmoadgVar.oxmwwwfdhm().wkgbmnqykc("SCAN_RESULT_KEY", new l9.draadjrbmk() { // from class: zk0.zoijcleaow
                    @Override // l9.draadjrbmk
                    public final void iobyxmoadg(Object obj2) {
                        ru.myspar.proloyalty.activation_card.impl.presentation.iobyxmoadg.sopmlzcsov(this.f130309iobyxmoadg, obj2);
                    }
                });
                iobyxmoadgVar.oxmwwwfdhm().lqeggnwhkg(this.f91790btonecajqb.zoijcleaow(new ScanScreenPayload(in1.iobyxmoadg.ActivationCard)));
            } else if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
                i21.iobyxmoadg.iozdgvuglv(i21.iobyxmoadg.f41720iobyxmoadg, MainTab.SUPPORT, false, 2, null);
            } else {
                if (!(eablkybsjgVar instanceof eablkybsjg.C3198eablkybsjg)) {
                    if (!(eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object iobyxmoadgVar2 = new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg());
                    c2133iobyxmoadg.f91793jyumaefscl = 2;
                    if (cllcsxoeiz(iobyxmoadgVar2, c2133iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                Object zoijcleaowVar = new ppxfxbqfkf.zoijcleaow(((eablkybsjg.C3198eablkybsjg) eablkybsjgVar).iobyxmoadg());
                c2133iobyxmoadg.f91793jyumaefscl = 1;
                if (cllcsxoeiz(zoijcleaowVar, c2133iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
