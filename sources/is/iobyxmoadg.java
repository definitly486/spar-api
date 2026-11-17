package is;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import p0.tzroggbefp;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.components.geo.api.models.City;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final kv.zoijcleaow f49259ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final s20.zoijcleaow f49260wkgbmnqykc;

    /* JADX INFO: renamed from: is.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1049iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f49261jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ is.ppxfxbqfkf f49262yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f49263zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1049iobyxmoadg(is.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f49262yggfygwlhe = ppxfxbqfkfVar;
            this.f49261jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1049iobyxmoadg(this.f49262yggfygwlhe, this.f49261jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f49263zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f49262yggfygwlhe, is.ppxfxbqfkf.iobyxmoadg.f49273iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f49261jyumaefscl;
                this.f49263zdlpuopuiu = 1;
                if (iobyxmoadgVar.xrmfcynszj(this) == objGxszxtbevo) {
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
            return ((C1049iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f49264iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f49266yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f49267zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49266yggfygwlhe = obj;
            this.f49264iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.xrmfcynszj(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f49268jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f49269yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f49270zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f49269yggfygwlhe = wkgbmnqykcVar;
            this.f49268jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f49269yggfygwlhe, this.f49268jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f49270zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            wkgbmnqykc wkgbmnqykcVar = this.f49269yggfygwlhe;
            if (wkgbmnqykcVar instanceof wkgbmnqykc.zoijcleaow) {
                this.f49268jyumaefscl.rlfsiqarku(((wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg());
            } else if (wkgbmnqykcVar instanceof wkgbmnqykc.ppxfxbqfkf) {
                this.f49268jyumaefscl.uwvvkdfqfp(((wkgbmnqykc.ppxfxbqfkf) wkgbmnqykcVar).iobyxmoadg());
            } else {
                if (!(wkgbmnqykcVar instanceof wkgbmnqykc.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f49268jyumaefscl.czzsidtyhn();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(kv.zoijcleaow getCitiesUseCase, s20.zoijcleaow setChosenCityUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCitiesUseCase, "getCitiesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setChosenCityUseCase, "setChosenCityUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f49259ppxfxbqfkf = getCitiesUseCase;
        this.f49260wkgbmnqykc = setChosenCityUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void czzsidtyhn() {
        crxdokpmqz(eablkybsjg.ppxfxbqfkf.f49254iobyxmoadg);
    }

    private final void metgxyhuhe(Throwable th2) {
        crxdokpmqz(new eablkybsjg.zoijcleaow(th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rlfsiqarku(tzroggbefp tzroggbefpVar) {
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(tzroggbefpVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uwvvkdfqfp(City city) {
        Object objWkgbmnqykc;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            this.f49260wkgbmnqykc.zoijcleaow(new s20.zoijcleaow.iobyxmoadg(city));
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f49253iobyxmoadg);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            metgxyhuhe(thDxjokdxxww);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object xrmfcynszj(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f49264iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f49264iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f49266yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f49264iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.zoijcleaow(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                kv.zoijcleaow zoijcleaowVar = this.f49259ppxfxbqfkf;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                ppxfxbqfkfVar.f49267zdlpuopuiu = this;
                ppxfxbqfkfVar.f49264iwizpuwonk = 1;
                objZoijcleaow = zoijcleaowVar.zoijcleaow(wwaezpbzknVar, ppxfxbqfkfVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f49267zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf((List) objWkgbmnqykc));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.metgxyhuhe(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.zoijcleaow(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(is.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1049iobyxmoadg(action, this, null), 3, null);
    }
}
