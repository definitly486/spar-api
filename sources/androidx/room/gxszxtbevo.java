package androidx.room;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.btonecajqb;
import n5.oxmwwwfdhm;
import pj.agtfadlqog;
import pj.b;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gxszxtbevo {

    static final class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f13183iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ oxmwwwfdhm f13184jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ agtfadlqog f13185yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ btonecajqb f13186zdlpuopuiu;

        /* JADX INFO: renamed from: androidx.room.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0185iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ rgvfuqvkyq f13187cqumvgiudr;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ agtfadlqog f13188iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ oxmwwwfdhm f13189jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f13190yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f13191zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0185iobyxmoadg(oxmwwwfdhm oxmwwwfdhmVar, agtfadlqog agtfadlqogVar, rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f13189jyumaefscl = oxmwwwfdhmVar;
                this.f13188iwizpuwonk = agtfadlqogVar;
                this.f13187cqumvgiudr = rgvfuqvkyqVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0185iobyxmoadg c0185iobyxmoadg = new C0185iobyxmoadg(this.f13189jyumaefscl, this.f13188iwizpuwonk, this.f13187cqumvgiudr, gxszxtbevoVar);
                c0185iobyxmoadg.f13190yggfygwlhe = obj;
                return c0185iobyxmoadg;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                lg.gxszxtbevo gxszxtbevoVar;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f13191zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    btonecajqb.zoijcleaow zoijcleaowVar = ((cllcsxoeiz) this.f13190yggfygwlhe).getCoroutineContext().get(lg.lqeggnwhkg.f62508dxjokdxxww);
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar);
                    btonecajqb btonecajqbVarZoijcleaow = gxszxtbevo.zoijcleaow(this.f13189jyumaefscl, (lg.lqeggnwhkg) zoijcleaowVar);
                    agtfadlqog agtfadlqogVar = this.f13188iwizpuwonk;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    rgvfuqvkyq rgvfuqvkyqVar = this.f13187cqumvgiudr;
                    this.f13190yggfygwlhe = agtfadlqogVar;
                    this.f13191zdlpuopuiu = 1;
                    obj = dxjokdxxww.lqeggnwhkg(btonecajqbVarZoijcleaow, rgvfuqvkyqVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    gxszxtbevoVar = agtfadlqogVar;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gxszxtbevoVar = (lg.gxszxtbevo) this.f13190yggfygwlhe;
                    zdlpuopuiu.zoijcleaow(obj);
                }
                gxszxtbevoVar.resumeWith(kcexrzcfyt.wkgbmnqykc(obj));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C0185iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        iobyxmoadg(btonecajqb btonecajqbVar, agtfadlqog agtfadlqogVar, oxmwwwfdhm oxmwwwfdhmVar, rgvfuqvkyq rgvfuqvkyqVar) {
            this.f13186zdlpuopuiu = btonecajqbVar;
            this.f13185yggfygwlhe = agtfadlqogVar;
            this.f13184jyumaefscl = oxmwwwfdhmVar;
            this.f13183iwizpuwonk = rgvfuqvkyqVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                dxjokdxxww.eablkybsjg(this.f13186zdlpuopuiu.minusKey(lg.lqeggnwhkg.f62508dxjokdxxww), new C0185iobyxmoadg(this.f13184jyumaefscl, this.f13185yggfygwlhe, this.f13183iwizpuwonk, null));
            } catch (Throwable th2) {
                this.f13185yggfygwlhe.hkdspvbjdz(th2);
            }
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f13192iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ oxmwwwfdhm f13193jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f13194yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f13195zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(oxmwwwfdhm oxmwwwfdhmVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f13193jyumaefscl = oxmwwwfdhmVar;
            this.f13192iwizpuwonk = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f13193jyumaefscl, this.f13192iwizpuwonk, gxszxtbevoVar);
            zoijcleaowVar.f13194yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th2;
            nufgyqmvbu nufgyqmvbuVar;
            nufgyqmvbu nufgyqmvbuVarGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f13195zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    btonecajqb.zoijcleaow zoijcleaowVar = ((cllcsxoeiz) this.f13194yggfygwlhe).getCoroutineContext().get(nufgyqmvbu.f13236jyumaefscl);
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar);
                    nufgyqmvbu nufgyqmvbuVar2 = (nufgyqmvbu) zoijcleaowVar;
                    nufgyqmvbuVar2.zoijcleaow();
                    try {
                        this.f13193jyumaefscl.ojitshcjhn();
                        try {
                            tg.draadjrbmk draadjrbmkVar = this.f13192iwizpuwonk;
                            this.f13194yggfygwlhe = nufgyqmvbuVar2;
                            this.f13195zdlpuopuiu = 1;
                            Object objInvoke = draadjrbmkVar.invoke(this);
                            if (objInvoke == nufgyqmvbuVarGxszxtbevo) {
                                return nufgyqmvbuVarGxszxtbevo;
                            }
                            nufgyqmvbuVar = nufgyqmvbuVar2;
                            obj = objInvoke;
                        } catch (Throwable th3) {
                            th2 = th3;
                            this.f13193jyumaefscl.kcexrzcfyt();
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        nufgyqmvbuVarGxszxtbevo = nufgyqmvbuVar2;
                        th = th4;
                        nufgyqmvbuVarGxszxtbevo.eablkybsjg();
                        throw th;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nufgyqmvbuVar = (nufgyqmvbu) this.f13194yggfygwlhe;
                    try {
                        zdlpuopuiu.zoijcleaow(obj);
                    } catch (Throwable th5) {
                        th2 = th5;
                        this.f13193jyumaefscl.kcexrzcfyt();
                        throw th2;
                    }
                }
                this.f13193jyumaefscl.dsvhmnatus();
                this.f13193jyumaefscl.kcexrzcfyt();
                nufgyqmvbuVar.eablkybsjg();
                return obj;
            } catch (Throwable th6) {
                th = th6;
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private static final Object ppxfxbqfkf(oxmwwwfdhm oxmwwwfdhmVar, btonecajqb btonecajqbVar, rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        pj.rgvfuqvkyq rgvfuqvkyqVar2 = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar2.lereixgezr();
        try {
            oxmwwwfdhmVar.istkbnxepw().execute(new iobyxmoadg(btonecajqbVar, rgvfuqvkyqVar2, oxmwwwfdhmVar, rgvfuqvkyqVar));
        } catch (RejectedExecutionException e13) {
            rgvfuqvkyqVar2.hkdspvbjdz(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e13));
        }
        Object objZdlpuopuiu = rgvfuqvkyqVar2.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }

    public static final Object wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(oxmwwwfdhmVar, draadjrbmkVar, null);
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar.getContext().get(nufgyqmvbu.f13236jyumaefscl);
        lg.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = nufgyqmvbuVar != null ? nufgyqmvbuVar.ppxfxbqfkf() : null;
        return lqeggnwhkgVarPpxfxbqfkf != null ? dxjokdxxww.lqeggnwhkg(lqeggnwhkgVarPpxfxbqfkf, zoijcleaowVar, gxszxtbevoVar) : ppxfxbqfkf(oxmwwwfdhmVar, gxszxtbevoVar.getContext(), zoijcleaowVar, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final btonecajqb zoijcleaow(oxmwwwfdhm oxmwwwfdhmVar, lg.lqeggnwhkg lqeggnwhkgVar) {
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(lqeggnwhkgVar);
        return lqeggnwhkgVar.plus(nufgyqmvbuVar).plus(b.iobyxmoadg(oxmwwwfdhmVar.zynmafqrjb(), Integer.valueOf(System.identityHashCode(nufgyqmvbuVar))));
    }
}
