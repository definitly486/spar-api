package dg0;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.pkzmftpjix;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final of0.ppxfxbqfkf f28118iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ns.iobyxmoadg f28119ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final c20.eablkybsjg f28120zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f28122zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return nufgyqmvbu.this.new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f28122zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    if (!((Boolean) nufgyqmvbu.this.f28120zoijcleaow.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                        return null;
                    }
                    nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    of0.ppxfxbqfkf ppxfxbqfkfVar = nufgyqmvbuVar.f28118iobyxmoadg;
                    this.f28122zdlpuopuiu = 1;
                    obj = ppxfxbqfkfVar.iobyxmoadg(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((j10.zoijcleaow) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            return (j10.zoijcleaow) (kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ j10.iobyxmoadg f28123jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f28125zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(j10.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f28123jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return nufgyqmvbu.this.new zoijcleaow(this.f28123jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f28125zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                of0.ppxfxbqfkf ppxfxbqfkfVar = nufgyqmvbu.this.f28118iobyxmoadg;
                j10.iobyxmoadg iobyxmoadgVar = this.f28123jyumaefscl;
                this.f28125zdlpuopuiu = 1;
                if (ppxfxbqfkfVar.eablkybsjg(iobyxmoadgVar, this) == objGxszxtbevo) {
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

    public nufgyqmvbu(of0.ppxfxbqfkf mySparDialogsRepository, c20.eablkybsjg isLoggedInUseCase, ns.iobyxmoadg dispatchersProvider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mySparDialogsRepository, "mySparDialogsRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f28118iobyxmoadg = mySparDialogsRepository;
        this.f28120zoijcleaow = isLoggedInUseCase;
        this.f28119ppxfxbqfkf = dispatchersProvider;
    }

    private final pkzmftpjix ppxfxbqfkf() {
        return this.f28119ppxfxbqfkf.zoijcleaow();
    }

    public final Object eablkybsjg(j10.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objLqeggnwhkg;
        c20.eablkybsjg eablkybsjgVar = this.f28120zoijcleaow;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        return (((Boolean) eablkybsjgVar.zoijcleaow(wwaezpbzknVar)).booleanValue() && (objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(ppxfxbqfkf(), new zoijcleaow(iobyxmoadgVar, null), gxszxtbevoVar)) == mg.zoijcleaow.gxszxtbevo()) ? objLqeggnwhkg : wwaezpbzknVar;
    }

    public final Object wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
        return pj.dxjokdxxww.lqeggnwhkg(ppxfxbqfkf(), new iobyxmoadg(null), gxszxtbevoVar);
    }
}
