package id1;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.esjtqupxsv;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.pkzmftpjix;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final sc1.ppxfxbqfkf f42423iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dr0.iobyxmoadg f42424ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final esjtqupxsv f42425zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f42427zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return gxszxtbevo.this.new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f42427zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    if (!((Boolean) gxszxtbevo.this.f42425zoijcleaow.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                        return null;
                    }
                    gxszxtbevo gxszxtbevoVar = gxszxtbevo.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    sc1.ppxfxbqfkf ppxfxbqfkfVar = gxszxtbevoVar.f42423iobyxmoadg;
                    this.f42427zdlpuopuiu = 1;
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
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((zz0.zoijcleaow) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            return (zz0.zoijcleaow) (kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zz0.iobyxmoadg f42428jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f42430zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(zz0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f42428jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return gxszxtbevo.this.new zoijcleaow(this.f42428jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f42430zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sc1.ppxfxbqfkf ppxfxbqfkfVar = gxszxtbevo.this.f42423iobyxmoadg;
                zz0.iobyxmoadg iobyxmoadgVar = this.f42428jyumaefscl;
                this.f42430zdlpuopuiu = 1;
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

    public gxszxtbevo(sc1.ppxfxbqfkf mySparDialogsRepository, esjtqupxsv isAuthUseCase, dr0.iobyxmoadg dispatchersProvider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mySparDialogsRepository, "mySparDialogsRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f42423iobyxmoadg = mySparDialogsRepository;
        this.f42425zoijcleaow = isAuthUseCase;
        this.f42424ppxfxbqfkf = dispatchersProvider;
    }

    private final pkzmftpjix ppxfxbqfkf() {
        return this.f42424ppxfxbqfkf.zoijcleaow();
    }

    public final Object eablkybsjg(zz0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objLqeggnwhkg;
        esjtqupxsv esjtqupxsvVar = this.f42425zoijcleaow;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        return (((Boolean) esjtqupxsvVar.zoijcleaow(wwaezpbzknVar)).booleanValue() && (objLqeggnwhkg = dxjokdxxww.lqeggnwhkg(ppxfxbqfkf(), new zoijcleaow(iobyxmoadgVar, null), gxszxtbevoVar)) == mg.zoijcleaow.gxszxtbevo()) ? objLqeggnwhkg : wwaezpbzknVar;
    }

    public final Object wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(ppxfxbqfkf(), new iobyxmoadg(null), gxszxtbevoVar);
    }
}
