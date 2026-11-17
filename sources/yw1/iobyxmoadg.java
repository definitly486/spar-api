package yw1;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.jyumaefscl;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ur0.iobyxmoadg f126821eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final jyumaefscl f126822gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final t81.iobyxmoadg f126823lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final lw1.zoijcleaow f126824nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final s21.iobyxmoadg f126825ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zy0.iobyxmoadg f126826wkgbmnqykc;

    /* JADX INFO: renamed from: yw1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3242iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f126828zdlpuopuiu;

        C3242iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C3242iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f126828zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            t81.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f126823lqeggnwhkg;
            s81.iobyxmoadg iobyxmoadgVar2 = s81.iobyxmoadg.f105725hcddaimhww;
            this.f126828zdlpuopuiu = 1;
            obj = iobyxmoadgVar.ppxfxbqfkf(iobyxmoadgVar2, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            iobyxmoadg.this.xrmfcynszj(zBooleanValue);
            iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.this;
            this.f126828zdlpuopuiu = 2;
            if (iobyxmoadgVar3.uwvvkdfqfp(zBooleanValue, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C3242iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f126830zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f126830zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ur0.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f126821eablkybsjg;
                String name = iobyxmoadg.this.getClass().getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                this.f126830zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(name, "android.permission.CAMERA", this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            ur0.ppxfxbqfkf ppxfxbqfkfVar = (ur0.ppxfxbqfkf) obj;
            if (ppxfxbqfkfVar instanceof ur0.ppxfxbqfkf.zoijcleaow) {
                iobyxmoadg.this.ydmasvzmpa();
            } else {
                if (!(ppxfxbqfkfVar instanceof ur0.ppxfxbqfkf.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg.this.crxdokpmqz(eablkybsjg.zoijcleaow.f126815iobyxmoadg);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f126831iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f126833yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f126834zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f126833yggfygwlhe = obj;
            this.f126831iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.uwvvkdfqfp(false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, s21.iobyxmoadg apiEndPointsProvider, zy0.iobyxmoadg fileUtil, ur0.iobyxmoadg permissionManager, jyumaefscl getWebViewTokenUseCase, t81.iobyxmoadg featureManager, lw1.zoijcleaow userNewsInteractor) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fileUtil, "fileUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getWebViewTokenUseCase, "getWebViewTokenUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userNewsInteractor, "userNewsInteractor");
        this.f126825ppxfxbqfkf = apiEndPointsProvider;
        this.f126826wkgbmnqykc = fileUtil;
        this.f126821eablkybsjg = permissionManager;
        this.f126822gxszxtbevo = getWebViewTokenUseCase;
        this.f126823lqeggnwhkg = featureManager;
        this.f126824nufgyqmvbu = userNewsInteractor;
    }

    private final void czzsidtyhn() {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C3242iobyxmoadg(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object uwvvkdfqfp(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f126831iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f126831iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f126833yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f126831iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            if (z13) {
                jyumaefscl jyumaefsclVar = this.f126822gxszxtbevo;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                zoijcleaowVar.f126834zdlpuopuiu = this;
                zoijcleaowVar.f126831iwizpuwonk = 1;
                objZoijcleaow = jyumaefsclVar.zoijcleaow(wwaezpbzknVar, zoijcleaowVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f126834zdlpuopuiu;
        zdlpuopuiu.zoijcleaow(objZoijcleaow);
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg.zoijcleaow(iobyxmoadgVar.f126825ppxfxbqfkf.eablkybsjg(), (String) objZoijcleaow));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xrmfcynszj(boolean z13) {
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg.C3241iobyxmoadg(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ydmasvzmpa() {
        crxdokpmqz(new eablkybsjg.wkgbmnqykc(this.f126826wkgbmnqykc.iobyxmoadg()));
    }

    private final void yfnezrywwk() {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(yw1.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, yw1.ppxfxbqfkf.iobyxmoadg.f126835iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        czzsidtyhn();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f126836iobyxmoadg)) {
            this.f126824nufgyqmvbu.zoijcleaow();
            crxdokpmqz(eablkybsjg.iobyxmoadg.f126812iobyxmoadg);
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.ppxfxbqfkf.f126837iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.ppxfxbqfkf.f126813iobyxmoadg);
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f126838iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            yfnezrywwk();
        }
    }
}
