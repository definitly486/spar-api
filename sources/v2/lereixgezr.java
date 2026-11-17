package v2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.hkdspvbjdz;
import pj.cllcsxoeiz;

/* JADX INFO: loaded from: classes.dex */
public abstract class lereixgezr {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f115524yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f115525zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f115525zdlpuopuiu = obj;
            this.f115524yggfygwlhe |= Integer.MIN_VALUE;
            return lereixgezr.zoijcleaow(null, null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f115526cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f115527iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f115528jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f115529yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f115530zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f115527iwizpuwonk = obj;
            this.f115526cqumvgiudr |= Integer.MIN_VALUE;
            return lereixgezr.ppxfxbqfkf(null, null, this);
        }
    }

    static final class wkgbmnqykc implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f115531zdlpuopuiu;

        wkgbmnqykc(hkdspvbjdz hkdspvbjdzVar) {
            this.f115531zdlpuopuiu = hkdspvbjdzVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            pmvmpeiblj pmvmpeibljVar;
            Object obj = this.f115531zdlpuopuiu.f60015zdlpuopuiu;
            if (obj == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                pmvmpeibljVar = null;
            } else {
                pmvmpeibljVar = (pmvmpeiblj) obj;
            }
            pmvmpeibljVar.istkbnxepw().set(true);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f115532jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ esjtqupxsv f115533yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f115534zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(esjtqupxsv esjtqupxsvVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f115533yggfygwlhe = esjtqupxsvVar;
            this.f115532jyumaefscl = rgvfuqvkyqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f115533yggfygwlhe, this.f115532jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f115534zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                esjtqupxsv esjtqupxsvVar = this.f115533yggfygwlhe;
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f115532jyumaefscl;
                this.f115534zdlpuopuiu = 1;
                if (lereixgezr.ppxfxbqfkf(esjtqupxsvVar, rgvfuqvkyqVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object ppxfxbqfkf(esjtqupxsv esjtqupxsvVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        ppxfxbqfkf ppxfxbqfkfVar;
        hkdspvbjdz hkdspvbjdzVar;
        pmvmpeiblj pmvmpeibljVar;
        Throwable th2;
        Object obj;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f115526cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f115526cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj2 = ppxfxbqfkfVar.f115527iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f115526cqumvgiudr;
        pmvmpeiblj pmvmpeibljVar2 = null;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            hkdspvbjdzVar = new hkdspvbjdz();
            try {
                ppxfxbqfkfVar.f115530zdlpuopuiu = esjtqupxsvVar;
                ppxfxbqfkfVar.f115529yggfygwlhe = rgvfuqvkyqVar;
                ppxfxbqfkfVar.f115528jyumaefscl = hkdspvbjdzVar;
                ppxfxbqfkfVar.f115526cqumvgiudr = 1;
                pj.rgvfuqvkyq rgvfuqvkyqVar2 = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(ppxfxbqfkfVar), 1);
                rgvfuqvkyqVar2.lereixgezr();
                hkdspvbjdzVar.f60015zdlpuopuiu = new pmvmpeiblj(rgvfuqvkyqVar, rgvfuqvkyqVar2);
                rgvfuqvkyqVar2.stevsuqkhv(new wkgbmnqykc(hkdspvbjdzVar));
                Object obj3 = hkdspvbjdzVar.f60015zdlpuopuiu;
                if (obj3 == null) {
                    kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    pmvmpeibljVar = null;
                } else {
                    pmvmpeibljVar = (pmvmpeiblj) obj3;
                }
                esjtqupxsvVar.zynmafqrjb(pmvmpeibljVar);
                Object objZdlpuopuiu = rgvfuqvkyqVar2.zdlpuopuiu();
                if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                    kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(ppxfxbqfkfVar);
                }
                if (objZdlpuopuiu == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } catch (Throwable th3) {
                th2 = th3;
                obj = hkdspvbjdzVar.f60015zdlpuopuiu;
                if (obj == null) {
                    kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                } else {
                    pmvmpeibljVar2 = (pmvmpeiblj) obj;
                }
                esjtqupxsvVar.pmvmpeiblj(pmvmpeibljVar2);
                throw th2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hkdspvbjdz hkdspvbjdzVar2 = (hkdspvbjdz) ppxfxbqfkfVar.f115528jyumaefscl;
            esjtqupxsv esjtqupxsvVar2 = (esjtqupxsv) ppxfxbqfkfVar.f115530zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj2);
                hkdspvbjdzVar = hkdspvbjdzVar2;
                esjtqupxsvVar = esjtqupxsvVar2;
            } catch (Throwable th4) {
                hkdspvbjdzVar = hkdspvbjdzVar2;
                esjtqupxsvVar = esjtqupxsvVar2;
                th2 = th4;
                obj = hkdspvbjdzVar.f60015zdlpuopuiu;
                if (obj == null) {
                    kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                } else {
                    pmvmpeibljVar2 = (pmvmpeiblj) obj;
                }
                esjtqupxsvVar.pmvmpeiblj(pmvmpeibljVar2);
                throw th2;
            }
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object zoijcleaow(esjtqupxsv esjtqupxsvVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f115524yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f115524yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f115525zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f115524yggfygwlhe;
        if (i14 != 0) {
            if (i14 == 1) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                throw new KotlinNothingValueException();
            }
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            throw new KotlinNothingValueException();
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(Looper.myLooper(), esjtqupxsvVar.iwizpuwonk())) {
            iobyxmoadgVar.f115524yggfygwlhe = 1;
            if (ppxfxbqfkf(esjtqupxsvVar, rgvfuqvkyqVar, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            throw new KotlinNothingValueException();
        }
        Handler handlerIobyxmoadg = q1.lqeggnwhkg.iobyxmoadg(esjtqupxsvVar.iwizpuwonk());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(handlerIobyxmoadg, "createAsync(...)");
        qj.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = qj.eablkybsjg.ppxfxbqfkf(handlerIobyxmoadg, null, 1, null);
        zoijcleaow zoijcleaowVar = new zoijcleaow(esjtqupxsvVar, rgvfuqvkyqVar, null);
        iobyxmoadgVar.f115524yggfygwlhe = 2;
        if (pj.dxjokdxxww.lqeggnwhkg(wkgbmnqykcVarPpxfxbqfkf, zoijcleaowVar, iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        throw new KotlinNothingValueException();
    }
}
