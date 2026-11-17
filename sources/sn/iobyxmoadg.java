package sn;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import mj.kcexrzcfyt;
import p0.tzroggbefp;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import ru.myspar.address.impl.shop_search.domain.State;
import ru.myspar.components.search_address.api.model.SearchShop;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final sw.zoijcleaow f107726ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private auzgnhcxok f107727wkgbmnqykc;

    /* JADX INFO: renamed from: sn.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2647iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f107728cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ boolean f107729iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f107730jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f107731yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f107732zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2647iobyxmoadg(boolean z13, iobyxmoadg iobyxmoadgVar, boolean z14, String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f107731yggfygwlhe = z13;
            this.f107730jyumaefscl = iobyxmoadgVar;
            this.f107729iwizpuwonk = z14;
            this.f107728cqumvgiudr = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C2647iobyxmoadg(this.f107731yggfygwlhe, this.f107730jyumaefscl, this.f107729iwizpuwonk, this.f107728cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f107732zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                this.f107730jyumaefscl.xrmfcynszj();
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            if (this.f107731yggfygwlhe) {
                this.f107732zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(1000L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            this.f107730jyumaefscl.ydmasvzmpa();
            if (!this.f107729iwizpuwonk) {
                this.f107730jyumaefscl.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(null));
            }
            iobyxmoadg iobyxmoadgVar = this.f107730jyumaefscl;
            String str = this.f107728cqumvgiudr;
            this.f107732zdlpuopuiu = 2;
            if (iobyxmoadgVar.yfnezrywwk(str, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            this.f107730jyumaefscl.xrmfcynszj();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C2647iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f107733cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f107735jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f107736yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107737zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107735jyumaefscl = obj;
            this.f107733cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.yfnezrywwk(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(sw.zoijcleaow searchShopUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchShopUseCase, "searchShopUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f107726ppxfxbqfkf = searchShopUseCase;
    }

    private final void czzsidtyhn(String str, boolean z13, boolean z14) {
        auzgnhcxok auzgnhcxokVar = this.f107727wkgbmnqykc;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
        this.f107727wkgbmnqykc = gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2647iobyxmoadg(z13, this, z14, str, null), 3, null);
    }

    private final void metgxyhuhe(tzroggbefp tzroggbefpVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(tzroggbefpVar, ((State) jlmebxxoox()).getSearchInput())) {
            return;
        }
        ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(tzroggbefpVar));
        String strDraadjrbmk = tzroggbefpVar.draadjrbmk();
        if (kcexrzcfyt.zfvoamnweg(strDraadjrbmk)) {
            strDraadjrbmk = null;
        }
        uwvvkdfqfp(this, strDraadjrbmk, true, false, 4, null);
    }

    private final void rlfsiqarku(String str) {
        Object next;
        Iterator it = jyumaefscl.lereixgezr(((State) jlmebxxoox()).getShopsMap().values()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((SearchShop) next).getId(), str));
        SearchShop searchShop = (SearchShop) next;
        if (searchShop == null) {
            return;
        }
        crxdokpmqz(new eablkybsjg.zoijcleaow(searchShop.getId(), searchShop.getShortAddress(), searchShop.getLocation()));
    }

    static /* synthetic */ void uwvvkdfqfp(iobyxmoadg iobyxmoadgVar, String str, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z14 = false;
        }
        iobyxmoadgVar.czzsidtyhn(str, z13, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xrmfcynszj() {
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ydmasvzmpa() {
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yfnezrywwk(String str, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        rn.eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f107733cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f107733cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f107735jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f107733cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            sw.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = new sw.zoijcleaow.iobyxmoadg(str, ((State) jlmebxxoox()).getLocation().getLatitude(), ((State) jlmebxxoox()).getLocation().getLongitude());
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                sw.zoijcleaow zoijcleaowVar2 = this.f107726ppxfxbqfkf;
                zoijcleaowVar.f107737zdlpuopuiu = this;
                zoijcleaowVar.f107736yggfygwlhe = str;
                zoijcleaowVar.f107733cqumvgiudr = 1;
                objZoijcleaow = zoijcleaowVar2.zoijcleaow(iobyxmoadgVar2, zoijcleaowVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) zoijcleaowVar.f107736yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f107737zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Map) objZoijcleaow);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            Map map = (Map) objWkgbmnqykc;
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(map));
            if (map.isEmpty() && (str == null || kcexrzcfyt.zfvoamnweg(str))) {
                eablkybsjgVar = rn.eablkybsjg.INPUT_EMPTY;
            } else {
                eablkybsjgVar = map.isEmpty() ? rn.eablkybsjg.NOT_FOUND : null;
            }
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(eablkybsjgVar));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.crxdokpmqz(new eablkybsjg.ppxfxbqfkf(thDxjokdxxww));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f107742iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f107717iobyxmoadg);
        } else if (intent instanceof wkgbmnqykc.zoijcleaow) {
            metgxyhuhe(((wkgbmnqykc.zoijcleaow) intent).iobyxmoadg());
        } else {
            if (!(intent instanceof wkgbmnqykc.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            rlfsiqarku(((wkgbmnqykc.ppxfxbqfkf) intent).iobyxmoadg());
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ppxfxbqfkf.iobyxmoadg.f107741iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        czzsidtyhn(null, false, true);
    }
}
