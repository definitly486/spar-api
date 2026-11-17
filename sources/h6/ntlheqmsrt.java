package h6;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import pj.iyctptxqzt;
import pj.skhdrjzrfn;

/* JADX INFO: loaded from: classes2.dex */
public final class ntlheqmsrt {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final String f39588agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final WorkDatabase f39589btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final p6.zoijcleaow f39590draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final o6.iobyxmoadg f39591dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.work.ppxfxbqfkf f39592eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final p6.jyumaefscl f39593gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final r6.zoijcleaow f39594gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final p6.yggfygwlhe f39595iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final androidx.work.iobyxmoadg f39596lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final g6.zoijcleaow f39597nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final pj.pmvmpeiblj f39598ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f39599ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final List f39600wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final WorkerParameters.iobyxmoadg f39601wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f39602zoijcleaow;

    static final class eablkybsjg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ntlheqmsrt f39603iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f39604jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f39605yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.work.ppxfxbqfkf f39606zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(androidx.work.ppxfxbqfkf ppxfxbqfkfVar, boolean z13, String str, ntlheqmsrt ntlheqmsrtVar) {
            super(1);
            this.f39606zdlpuopuiu = ppxfxbqfkfVar;
            this.f39605yggfygwlhe = z13;
            this.f39604jyumaefscl = str;
            this.f39603iwizpuwonk = ntlheqmsrtVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            if (th2 instanceof WorkerStoppedException) {
                this.f39606zdlpuopuiu.stop(((WorkerStoppedException) th2).getReason());
            }
            if (!this.f39605yggfygwlhe || this.f39604jyumaefscl == null) {
                return;
            }
            this.f39603iwizpuwonk.f39596lqeggnwhkg.agtfadlqog().zoijcleaow(this.f39604jyumaefscl, this.f39603iwizpuwonk.wflxmlrfwp().hashCode());
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ g6.gtknphoqwx f39607iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.work.ppxfxbqfkf f39608jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f39610zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(androidx.work.ppxfxbqfkf ppxfxbqfkfVar, g6.gtknphoqwx gtknphoqwxVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f39608jyumaefscl = ppxfxbqfkfVar;
            this.f39607iwizpuwonk = gtknphoqwxVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ntlheqmsrt.this.new gxszxtbevo(this.f39608jyumaefscl, this.f39607iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f39610zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            Context context = ntlheqmsrt.this.f39602zoijcleaow;
            p6.yggfygwlhe yggfygwlheVarWflxmlrfwp = ntlheqmsrt.this.wflxmlrfwp();
            androidx.work.ppxfxbqfkf ppxfxbqfkfVar = this.f39608jyumaefscl;
            g6.gtknphoqwx gtknphoqwxVar = this.f39607iwizpuwonk;
            r6.zoijcleaow zoijcleaowVar = ntlheqmsrt.this.f39594gxszxtbevo;
            this.f39610zdlpuopuiu = 1;
            if (q6.ylkuphrtab.zoijcleaow(context, yggfygwlheVarWflxmlrfwp, ppxfxbqfkfVar, gtknphoqwxVar, zoijcleaowVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            String str = sopmlzcsov.f39641iobyxmoadg;
            ntlheqmsrt ntlheqmsrtVar = ntlheqmsrt.this;
            g6.yggfygwlhe.eablkybsjg().iobyxmoadg(str, "Starting work for " + ntlheqmsrtVar.wflxmlrfwp().f75804ppxfxbqfkf);
            com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarStartWork = this.f39608jyumaefscl.startWork();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarStartWork, "worker.startWork()");
            androidx.work.ppxfxbqfkf ppxfxbqfkfVar2 = this.f39608jyumaefscl;
            this.f39610zdlpuopuiu = 2;
            obj = sopmlzcsov.wkgbmnqykc(wkgbmnqykcVarStartWork, ppxfxbqfkfVar2, this);
            return obj == objGxszxtbevo ? objGxszxtbevo : obj;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private WorkerParameters.iobyxmoadg f39611dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final p6.yggfygwlhe f39612eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final List f39613gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final androidx.work.iobyxmoadg f39614iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final Context f39615lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private androidx.work.ppxfxbqfkf f39616nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final o6.iobyxmoadg f39617ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final WorkDatabase f39618wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final r6.zoijcleaow f39619zoijcleaow;

        public iobyxmoadg(Context context, androidx.work.iobyxmoadg configuration, r6.zoijcleaow workTaskExecutor, o6.iobyxmoadg foregroundProcessor, WorkDatabase workDatabase, p6.yggfygwlhe workSpec, List tags) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configuration, "configuration");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workTaskExecutor, "workTaskExecutor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(foregroundProcessor, "foregroundProcessor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workDatabase, "workDatabase");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpec, "workSpec");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tags, "tags");
            this.f39614iobyxmoadg = configuration;
            this.f39619zoijcleaow = workTaskExecutor;
            this.f39617ppxfxbqfkf = foregroundProcessor;
            this.f39618wkgbmnqykc = workDatabase;
            this.f39612eablkybsjg = workSpec;
            this.f39613gxszxtbevo = tags;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(applicationContext, "context.applicationContext");
            this.f39615lqeggnwhkg = applicationContext;
            this.f39611dxjokdxxww = new WorkerParameters.iobyxmoadg();
        }

        public final androidx.work.ppxfxbqfkf btonecajqb() {
            return this.f39616nufgyqmvbu;
        }

        public final r6.zoijcleaow dxjokdxxww() {
            return this.f39619zoijcleaow;
        }

        public final WorkerParameters.iobyxmoadg eablkybsjg() {
            return this.f39611dxjokdxxww;
        }

        public final iobyxmoadg gtknphoqwx(WorkerParameters.iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar != null) {
                this.f39611dxjokdxxww = iobyxmoadgVar;
            }
            return this;
        }

        public final List gxszxtbevo() {
            return this.f39613gxszxtbevo;
        }

        public final ntlheqmsrt iobyxmoadg() {
            return new ntlheqmsrt(this);
        }

        public final WorkDatabase lqeggnwhkg() {
            return this.f39618wkgbmnqykc;
        }

        public final p6.yggfygwlhe nufgyqmvbu() {
            return this.f39612eablkybsjg;
        }

        public final androidx.work.iobyxmoadg ppxfxbqfkf() {
            return this.f39614iobyxmoadg;
        }

        public final o6.iobyxmoadg wkgbmnqykc() {
            return this.f39617ppxfxbqfkf;
        }

        public final Context zoijcleaow() {
            return this.f39615lqeggnwhkg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f39621zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ntlheqmsrt f39622yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f39623zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(ntlheqmsrt ntlheqmsrtVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f39622yggfygwlhe = ntlheqmsrtVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f39622yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f39623zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ntlheqmsrt ntlheqmsrtVar = this.f39622yggfygwlhe;
                    this.f39623zdlpuopuiu = 1;
                    obj = ntlheqmsrtVar.jyumaefscl(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return obj;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean kcexrzcfyt(zoijcleaow zoijcleaowVar, ntlheqmsrt ntlheqmsrtVar) {
            boolean zYggfygwlhe;
            if (zoijcleaowVar instanceof zoijcleaow.C0909zoijcleaow) {
                zYggfygwlhe = ntlheqmsrtVar.oxmwwwfdhm(((zoijcleaow.C0909zoijcleaow) zoijcleaowVar).iobyxmoadg());
            } else if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
                ntlheqmsrtVar.cqumvgiudr(((zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg());
                zYggfygwlhe = false;
            } else {
                if (!(zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                zYggfygwlhe = ntlheqmsrtVar.yggfygwlhe(((zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
            }
            return Boolean.valueOf(zYggfygwlhe);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ntlheqmsrt.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            final zoijcleaow iobyxmoadgVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f39621zdlpuopuiu;
            int i14 = 1;
            androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    pj.pmvmpeiblj pmvmpeibljVar = ntlheqmsrt.this.f39598ojitshcjhn;
                    iobyxmoadg iobyxmoadgVar3 = new iobyxmoadg(ntlheqmsrt.this, null);
                    this.f39621zdlpuopuiu = 1;
                    obj = pj.dxjokdxxww.lqeggnwhkg(pmvmpeibljVar, iobyxmoadgVar3, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                iobyxmoadgVar = (zoijcleaow) obj;
            } catch (WorkerStoppedException e13) {
                iobyxmoadgVar = new zoijcleaow.ppxfxbqfkf(e13.getReason());
            } catch (CancellationException unused) {
                iobyxmoadgVar = new zoijcleaow.iobyxmoadg(iobyxmoadgVar2, i14, objArr3 == true ? 1 : 0);
            } catch (Throwable th2) {
                g6.yggfygwlhe.eablkybsjg().wkgbmnqykc(sopmlzcsov.f39641iobyxmoadg, "Unexpected error in WorkerWrapper", th2);
                iobyxmoadgVar = new zoijcleaow.iobyxmoadg(objArr2 == true ? 1 : 0, i14, objArr == true ? 1 : 0);
            }
            WorkDatabase workDatabase = ntlheqmsrt.this.f39589btonecajqb;
            final ntlheqmsrt ntlheqmsrtVar = ntlheqmsrt.this;
            Object objHkdspvbjdz = workDatabase.hkdspvbjdz(new Callable() { // from class: h6.ulzqkzuiru
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ntlheqmsrt.ppxfxbqfkf.kcexrzcfyt(iobyxmoadgVar, ntlheqmsrtVar);
                }
            });
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objHkdspvbjdz, "workDatabase.runInTransa…          }\n            )");
            return objHkdspvbjdz;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f39624cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f39626jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f39627yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f39628zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f39626jyumaefscl = obj;
            this.f39624cqumvgiudr |= Integer.MIN_VALUE;
            return ntlheqmsrt.this.jyumaefscl(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class zoijcleaow {

        public static final class iobyxmoadg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final androidx.work.ppxfxbqfkf.iobyxmoadg f39629iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(androidx.work.ppxfxbqfkf.iobyxmoadg result) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
                this.f39629iobyxmoadg = result;
            }

            public final androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadg() {
                return this.f39629iobyxmoadg;
            }

            public /* synthetic */ iobyxmoadg(androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? new androidx.work.ppxfxbqfkf.iobyxmoadg.C0209iobyxmoadg() : iobyxmoadgVar);
            }
        }

        public static final class ppxfxbqfkf extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final int f39630iobyxmoadg;

            public ppxfxbqfkf(int i13) {
                super(null);
                this.f39630iobyxmoadg = i13;
            }

            public final int iobyxmoadg() {
                return this.f39630iobyxmoadg;
            }

            public /* synthetic */ ppxfxbqfkf(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this((i14 & 1) != 0 ? -256 : i13);
            }
        }

        /* JADX INFO: renamed from: h6.ntlheqmsrt$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C0909zoijcleaow extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final androidx.work.ppxfxbqfkf.iobyxmoadg f39631iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0909zoijcleaow(androidx.work.ppxfxbqfkf.iobyxmoadg result) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
                this.f39631iobyxmoadg = result;
            }

            public final androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadg() {
                return this.f39631iobyxmoadg;
            }
        }

        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public ntlheqmsrt(iobyxmoadg builder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
        p6.yggfygwlhe yggfygwlheVarNufgyqmvbu = builder.nufgyqmvbu();
        this.f39595iobyxmoadg = yggfygwlheVarNufgyqmvbu;
        this.f39602zoijcleaow = builder.zoijcleaow();
        this.f39599ppxfxbqfkf = yggfygwlheVarNufgyqmvbu.f75796iobyxmoadg;
        this.f39601wkgbmnqykc = builder.eablkybsjg();
        this.f39592eablkybsjg = builder.btonecajqb();
        this.f39594gxszxtbevo = builder.dxjokdxxww();
        androidx.work.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = builder.ppxfxbqfkf();
        this.f39596lqeggnwhkg = iobyxmoadgVarPpxfxbqfkf;
        this.f39597nufgyqmvbu = iobyxmoadgVarPpxfxbqfkf.iobyxmoadg();
        this.f39591dxjokdxxww = builder.wkgbmnqykc();
        WorkDatabase workDatabaseLqeggnwhkg = builder.lqeggnwhkg();
        this.f39589btonecajqb = workDatabaseLqeggnwhkg;
        this.f39593gtknphoqwx = workDatabaseLqeggnwhkg.ulzqkzuiru();
        this.f39590draadjrbmk = workDatabaseLqeggnwhkg.stevsuqkhv();
        List listGxszxtbevo = builder.gxszxtbevo();
        this.f39600wflxmlrfwp = listGxszxtbevo;
        this.f39588agtfadlqog = gtknphoqwx(listGxszxtbevo);
        this.f39598ojitshcjhn = skhdrjzrfn.zoijcleaow(null, 1, null);
    }

    private final boolean agtfadlqog(androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar instanceof androidx.work.ppxfxbqfkf.iobyxmoadg.C0210ppxfxbqfkf) {
            String str = sopmlzcsov.f39641iobyxmoadg;
            g6.yggfygwlhe.eablkybsjg().gxszxtbevo(str, "Worker result SUCCESS for " + this.f39588agtfadlqog);
            return this.f39595iobyxmoadg.agtfadlqog() ? zdlpuopuiu() : esjtqupxsv(iobyxmoadgVar);
        }
        if (iobyxmoadgVar instanceof androidx.work.ppxfxbqfkf.iobyxmoadg.zoijcleaow) {
            String str2 = sopmlzcsov.f39641iobyxmoadg;
            g6.yggfygwlhe.eablkybsjg().gxszxtbevo(str2, "Worker result RETRY for " + this.f39588agtfadlqog);
            return kcexrzcfyt(-256);
        }
        String str3 = sopmlzcsov.f39641iobyxmoadg;
        g6.yggfygwlhe.eablkybsjg().gxszxtbevo(str3, "Worker result FAILURE for " + this.f39588agtfadlqog);
        if (this.f39595iobyxmoadg.agtfadlqog()) {
            return zdlpuopuiu();
        }
        if (iobyxmoadgVar == null) {
            iobyxmoadgVar = new androidx.work.ppxfxbqfkf.iobyxmoadg.C0209iobyxmoadg();
        }
        return cqumvgiudr(iobyxmoadgVar);
    }

    private final boolean esjtqupxsv(androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        this.f39593gtknphoqwx.jyumaefscl(g6.hkdspvbjdz.ppxfxbqfkf.SUCCEEDED, this.f39599ppxfxbqfkf);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVar, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        androidx.work.zoijcleaow zoijcleaowVarWkgbmnqykc = ((androidx.work.ppxfxbqfkf.iobyxmoadg.C0210ppxfxbqfkf) iobyxmoadgVar).wkgbmnqykc();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVarWkgbmnqykc, "success.outputData");
        this.f39593gtknphoqwx.kcexrzcfyt(this.f39599ppxfxbqfkf, zoijcleaowVarWkgbmnqykc);
        long jCurrentTimeMillis = this.f39597nufgyqmvbu.currentTimeMillis();
        for (String str : this.f39590draadjrbmk.zoijcleaow(this.f39599ppxfxbqfkf)) {
            if (this.f39593gtknphoqwx.nufgyqmvbu(str) == g6.hkdspvbjdz.ppxfxbqfkf.BLOCKED && this.f39590draadjrbmk.ppxfxbqfkf(str)) {
                String str2 = sopmlzcsov.f39641iobyxmoadg;
                g6.yggfygwlhe.eablkybsjg().gxszxtbevo(str2, "Setting status to enqueued for " + str);
                this.f39593gtknphoqwx.jyumaefscl(g6.hkdspvbjdz.ppxfxbqfkf.ENQUEUED, str);
                this.f39593gtknphoqwx.zdlpuopuiu(str, jCurrentTimeMillis);
            }
        }
        return false;
    }

    private final String gtknphoqwx(List list) {
        return "Work [ id=" + this.f39599ppxfxbqfkf + ", tags={ " + hg.jyumaefscl.iwxlajgraz(list, StringUtils.COMMA, null, null, 0, null, null, 62, null) + " } ]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean iwizpuwonk(ntlheqmsrt ntlheqmsrtVar) {
        p6.yggfygwlhe yggfygwlheVar = ntlheqmsrtVar.f39595iobyxmoadg;
        if (yggfygwlheVar.f75811zoijcleaow != g6.hkdspvbjdz.ppxfxbqfkf.ENQUEUED) {
            String str = sopmlzcsov.f39641iobyxmoadg;
            g6.yggfygwlhe.eablkybsjg().iobyxmoadg(str, ntlheqmsrtVar.f39595iobyxmoadg.f75804ppxfxbqfkf + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!yggfygwlheVar.agtfadlqog() && !ntlheqmsrtVar.f39595iobyxmoadg.wflxmlrfwp()) || ntlheqmsrtVar.f39597nufgyqmvbu.currentTimeMillis() >= ntlheqmsrtVar.f39595iobyxmoadg.ppxfxbqfkf()) {
            return Boolean.FALSE;
        }
        g6.yggfygwlhe.eablkybsjg().iobyxmoadg(sopmlzcsov.f39641iobyxmoadg, "Delaying execution for " + ntlheqmsrtVar.f39595iobyxmoadg.f75804ppxfxbqfkf + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:69:0x0229  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        androidx.work.zoijcleaow zoijcleaowVarIobyxmoadg;
        ntlheqmsrt ntlheqmsrtVar;
        WorkerParameters workerParameters;
        u1.iobyxmoadg iobyxmoadgVarRgvfuqvkyq;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f39624cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f39624cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = wkgbmnqykcVar.f39626jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f39624cqumvgiudr;
        int i15 = 1;
        kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            boolean zIsEnabled = this.f39596lqeggnwhkg.agtfadlqog().isEnabled();
            String strGtknphoqwx = this.f39595iobyxmoadg.gtknphoqwx();
            if (zIsEnabled && strGtknphoqwx != null) {
                this.f39596lqeggnwhkg.agtfadlqog().ppxfxbqfkf(strGtknphoqwx, this.f39595iobyxmoadg.hashCode());
            }
            Boolean shouldExit = (Boolean) this.f39589btonecajqb.hkdspvbjdz(new Callable() { // from class: h6.tzroggbefp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ntlheqmsrt.iwizpuwonk(this.f39651iobyxmoadg);
                }
            });
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(shouldExit, "shouldExit");
            int i16 = 0;
            if (shouldExit.booleanValue()) {
                return new zoijcleaow.ppxfxbqfkf(i16, i15, gtknphoqwxVar);
            }
            if (this.f39595iobyxmoadg.agtfadlqog()) {
                zoijcleaowVarIobyxmoadg = this.f39595iobyxmoadg.f75793eablkybsjg;
            } else {
                g6.draadjrbmk draadjrbmkVarZoijcleaow = this.f39596lqeggnwhkg.gxszxtbevo().zoijcleaow(this.f39595iobyxmoadg.f75808wkgbmnqykc);
                if (draadjrbmkVarZoijcleaow == null) {
                    String str = sopmlzcsov.f39641iobyxmoadg;
                    g6.yggfygwlhe.eablkybsjg().ppxfxbqfkf(str, "Could not create Input Merger " + this.f39595iobyxmoadg.f75808wkgbmnqykc);
                    return new zoijcleaow.iobyxmoadg(objArr2 == true ? 1 : 0, i15, objArr == true ? 1 : 0);
                }
                zoijcleaowVarIobyxmoadg = draadjrbmkVarZoijcleaow.iobyxmoadg(hg.jyumaefscl.ixidwrxhsl(hg.jyumaefscl.eablkybsjg(this.f39595iobyxmoadg.f75793eablkybsjg), this.f39593gtknphoqwx.draadjrbmk(this.f39599ppxfxbqfkf)));
            }
            androidx.work.zoijcleaow zoijcleaowVar = zoijcleaowVarIobyxmoadg;
            UUID uuidFromString = UUID.fromString(this.f39599ppxfxbqfkf);
            List list = this.f39600wflxmlrfwp;
            WorkerParameters.iobyxmoadg iobyxmoadgVar = this.f39601wkgbmnqykc;
            p6.yggfygwlhe yggfygwlheVar = this.f39595iobyxmoadg;
            WorkerParameters workerParameters2 = new WorkerParameters(uuidFromString, zoijcleaowVar, list, iobyxmoadgVar, yggfygwlheVar.f75794gtknphoqwx, yggfygwlheVar.gxszxtbevo(), this.f39596lqeggnwhkg.wkgbmnqykc(), this.f39596lqeggnwhkg.ojitshcjhn(), this.f39594gxszxtbevo, this.f39596lqeggnwhkg.vdvldrhtss(), new q6.hkdspvbjdz(this.f39589btonecajqb, this.f39594gxszxtbevo), new q6.hcddaimhww(this.f39589btonecajqb, this.f39591dxjokdxxww, this.f39594gxszxtbevo));
            androidx.work.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = this.f39592eablkybsjg;
            if (ppxfxbqfkfVarZoijcleaow == null) {
                try {
                    ppxfxbqfkfVarZoijcleaow = this.f39596lqeggnwhkg.vdvldrhtss().zoijcleaow(this.f39602zoijcleaow, this.f39595iobyxmoadg.f75804ppxfxbqfkf, workerParameters2);
                } catch (Throwable th2) {
                    String str2 = sopmlzcsov.f39641iobyxmoadg;
                    g6.yggfygwlhe.eablkybsjg().ppxfxbqfkf(str2, "Could not create Worker " + this.f39595iobyxmoadg.f75804ppxfxbqfkf);
                    u1.iobyxmoadg iobyxmoadgVarOxmwwwfdhm = this.f39596lqeggnwhkg.oxmwwwfdhm();
                    if (iobyxmoadgVarOxmwwwfdhm != null) {
                        q6.dsvhmnatus.iobyxmoadg(iobyxmoadgVarOxmwwwfdhm, new g6.wypolnanlu(this.f39595iobyxmoadg.f75804ppxfxbqfkf, workerParameters2, th2), sopmlzcsov.f39641iobyxmoadg);
                    }
                    return new zoijcleaow.iobyxmoadg(null, 1, 0 == true ? 1 : 0);
                }
            }
            ppxfxbqfkfVarZoijcleaow.setUsed();
            lg.btonecajqb.zoijcleaow zoijcleaowVar2 = wkgbmnqykcVar.getContext().get(auzgnhcxok.f76671gtknphoqwx);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar2);
            auzgnhcxok auzgnhcxokVar = (auzgnhcxok) zoijcleaowVar2;
            auzgnhcxokVar.pmvmpeiblj(new eablkybsjg(ppxfxbqfkfVarZoijcleaow, zIsEnabled, strGtknphoqwx, this));
            if (!lereixgezr()) {
                return new zoijcleaow.ppxfxbqfkf(0, 1, null);
            }
            int i17 = 1;
            kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar2 = null;
            int i18 = 0;
            if (auzgnhcxokVar.isCancelled()) {
                return new zoijcleaow.ppxfxbqfkf(i18, i17, gtknphoqwxVar2);
            }
            g6.gtknphoqwx gtknphoqwxVarZoijcleaow = workerParameters2.zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gtknphoqwxVarZoijcleaow, "params.foregroundUpdater");
            Executor executorIobyxmoadg = this.f39594gxszxtbevo.iobyxmoadg();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(executorIobyxmoadg, "workTaskExecutor.getMainThreadExecutor()");
            pj.pkzmftpjix pkzmftpjixVarZoijcleaow = iyctptxqzt.zoijcleaow(executorIobyxmoadg);
            try {
                gxszxtbevo gxszxtbevoVar2 = new gxszxtbevo(ppxfxbqfkfVarZoijcleaow, gtknphoqwxVarZoijcleaow, null);
                wkgbmnqykcVar.f39628zdlpuopuiu = this;
                wkgbmnqykcVar.f39627yggfygwlhe = workerParameters2;
                wkgbmnqykcVar.f39624cqumvgiudr = 1;
                objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(pkzmftpjixVarZoijcleaow, gxszxtbevoVar2, wkgbmnqykcVar);
                if (objLqeggnwhkg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                ntlheqmsrtVar = this;
                workerParameters = workerParameters2;
            } catch (CancellationException e13) {
                e = e13;
                ntlheqmsrtVar = this;
                String str3 = sopmlzcsov.f39641iobyxmoadg;
                g6.yggfygwlhe.eablkybsjg().lqeggnwhkg(str3, ntlheqmsrtVar.f39588agtfadlqog + " was cancelled", e);
                throw e;
            } catch (Throwable th3) {
                th = th3;
                ntlheqmsrtVar = this;
                workerParameters = workerParameters2;
                String str4 = sopmlzcsov.f39641iobyxmoadg;
                g6.yggfygwlhe.eablkybsjg().wkgbmnqykc(str4, ntlheqmsrtVar.f39588agtfadlqog + " failed because it threw an exception/error", th);
                iobyxmoadgVarRgvfuqvkyq = ntlheqmsrtVar.f39596lqeggnwhkg.rgvfuqvkyq();
                if (iobyxmoadgVarRgvfuqvkyq != null) {
                    q6.dsvhmnatus.iobyxmoadg(iobyxmoadgVarRgvfuqvkyq, new g6.wypolnanlu(ntlheqmsrtVar.f39595iobyxmoadg.f75804ppxfxbqfkf, workerParameters, th), sopmlzcsov.f39641iobyxmoadg);
                }
                return new zoijcleaow.iobyxmoadg(null, 1, 0 == true ? 1 : 0);
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            workerParameters = (WorkerParameters) wkgbmnqykcVar.f39627yggfygwlhe;
            ntlheqmsrtVar = (ntlheqmsrt) wkgbmnqykcVar.f39628zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            } catch (CancellationException e14) {
                e = e14;
                String str5 = sopmlzcsov.f39641iobyxmoadg;
                g6.yggfygwlhe.eablkybsjg().lqeggnwhkg(str5, ntlheqmsrtVar.f39588agtfadlqog + " was cancelled", e);
                throw e;
            } catch (Throwable th4) {
                th = th4;
                String str6 = sopmlzcsov.f39641iobyxmoadg;
                g6.yggfygwlhe.eablkybsjg().wkgbmnqykc(str6, ntlheqmsrtVar.f39588agtfadlqog + " failed because it threw an exception/error", th);
                iobyxmoadgVarRgvfuqvkyq = ntlheqmsrtVar.f39596lqeggnwhkg.rgvfuqvkyq();
                if (iobyxmoadgVarRgvfuqvkyq != null) {
                    q6.dsvhmnatus.iobyxmoadg(iobyxmoadgVarRgvfuqvkyq, new g6.wypolnanlu(ntlheqmsrtVar.f39595iobyxmoadg.f75804ppxfxbqfkf, workerParameters, th), sopmlzcsov.f39641iobyxmoadg);
                }
                return new zoijcleaow.iobyxmoadg(null, 1, 0 == true ? 1 : 0);
            }
        }
        androidx.work.ppxfxbqfkf.iobyxmoadg result = (androidx.work.ppxfxbqfkf.iobyxmoadg) objLqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(result, "result");
        return new zoijcleaow.C0909zoijcleaow(result);
    }

    private final boolean kcexrzcfyt(int i13) {
        this.f39593gtknphoqwx.jyumaefscl(g6.hkdspvbjdz.ppxfxbqfkf.ENQUEUED, this.f39599ppxfxbqfkf);
        this.f39593gtknphoqwx.zdlpuopuiu(this.f39599ppxfxbqfkf, this.f39597nufgyqmvbu.currentTimeMillis());
        this.f39593gtknphoqwx.istkbnxepw(this.f39599ppxfxbqfkf, this.f39595iobyxmoadg.nufgyqmvbu());
        this.f39593gtknphoqwx.ojitshcjhn(this.f39599ppxfxbqfkf, -1L);
        this.f39593gtknphoqwx.eablkybsjg(this.f39599ppxfxbqfkf, i13);
        return true;
    }

    private final boolean lereixgezr() {
        Object objHkdspvbjdz = this.f39589btonecajqb.hkdspvbjdz(new Callable() { // from class: h6.mbcevpiqjq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ntlheqmsrt.pmvmpeiblj(this.f39587iobyxmoadg);
            }
        });
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objHkdspvbjdz, "workDatabase.runInTransa…e\n            }\n        )");
        return ((Boolean) objHkdspvbjdz).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean oxmwwwfdhm(androidx.work.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        g6.hkdspvbjdz.ppxfxbqfkf ppxfxbqfkfVarNufgyqmvbu = this.f39593gtknphoqwx.nufgyqmvbu(this.f39599ppxfxbqfkf);
        this.f39589btonecajqb.ntlheqmsrt().iobyxmoadg(this.f39599ppxfxbqfkf);
        if (ppxfxbqfkfVarNufgyqmvbu == null) {
            return false;
        }
        if (ppxfxbqfkfVarNufgyqmvbu == g6.hkdspvbjdz.ppxfxbqfkf.RUNNING) {
            return agtfadlqog(iobyxmoadgVar);
        }
        if (ppxfxbqfkfVarNufgyqmvbu.wkgbmnqykc()) {
            return false;
        }
        return kcexrzcfyt(-512);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean pmvmpeiblj(ntlheqmsrt ntlheqmsrtVar) {
        boolean z13;
        if (ntlheqmsrtVar.f39593gtknphoqwx.nufgyqmvbu(ntlheqmsrtVar.f39599ppxfxbqfkf) == g6.hkdspvbjdz.ppxfxbqfkf.ENQUEUED) {
            ntlheqmsrtVar.f39593gtknphoqwx.jyumaefscl(g6.hkdspvbjdz.ppxfxbqfkf.RUNNING, ntlheqmsrtVar.f39599ppxfxbqfkf);
            ntlheqmsrtVar.f39593gtknphoqwx.lereixgezr(ntlheqmsrtVar.f39599ppxfxbqfkf);
            ntlheqmsrtVar.f39593gtknphoqwx.eablkybsjg(ntlheqmsrtVar.f39599ppxfxbqfkf, -256);
            z13 = true;
        } else {
            z13 = false;
        }
        return Boolean.valueOf(z13);
    }

    private final void rgvfuqvkyq(String str) {
        List listKcexrzcfyt = hg.jyumaefscl.kcexrzcfyt(str);
        while (!listKcexrzcfyt.isEmpty()) {
            String str2 = (String) hg.jyumaefscl.hkdspvbjdz(listKcexrzcfyt);
            if (this.f39593gtknphoqwx.nufgyqmvbu(str2) != g6.hkdspvbjdz.ppxfxbqfkf.CANCELLED) {
                this.f39593gtknphoqwx.jyumaefscl(g6.hkdspvbjdz.ppxfxbqfkf.FAILED, str2);
            }
            listKcexrzcfyt.addAll(this.f39590draadjrbmk.zoijcleaow(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean yggfygwlhe(int i13) {
        g6.hkdspvbjdz.ppxfxbqfkf ppxfxbqfkfVarNufgyqmvbu = this.f39593gtknphoqwx.nufgyqmvbu(this.f39599ppxfxbqfkf);
        if (ppxfxbqfkfVarNufgyqmvbu == null || ppxfxbqfkfVarNufgyqmvbu.wkgbmnqykc()) {
            String str = sopmlzcsov.f39641iobyxmoadg;
            g6.yggfygwlhe.eablkybsjg().iobyxmoadg(str, "Status for " + this.f39599ppxfxbqfkf + " is " + ppxfxbqfkfVarNufgyqmvbu + " ; not doing any work");
            return false;
        }
        String str2 = sopmlzcsov.f39641iobyxmoadg;
        g6.yggfygwlhe.eablkybsjg().iobyxmoadg(str2, "Status for " + this.f39599ppxfxbqfkf + " is " + ppxfxbqfkfVarNufgyqmvbu + "; not doing any work and rescheduling for later execution");
        this.f39593gtknphoqwx.jyumaefscl(g6.hkdspvbjdz.ppxfxbqfkf.ENQUEUED, this.f39599ppxfxbqfkf);
        this.f39593gtknphoqwx.eablkybsjg(this.f39599ppxfxbqfkf, i13);
        this.f39593gtknphoqwx.ojitshcjhn(this.f39599ppxfxbqfkf, -1L);
        return true;
    }

    private final boolean zdlpuopuiu() {
        this.f39593gtknphoqwx.zdlpuopuiu(this.f39599ppxfxbqfkf, this.f39597nufgyqmvbu.currentTimeMillis());
        this.f39593gtknphoqwx.jyumaefscl(g6.hkdspvbjdz.ppxfxbqfkf.ENQUEUED, this.f39599ppxfxbqfkf);
        this.f39593gtknphoqwx.cqumvgiudr(this.f39599ppxfxbqfkf);
        this.f39593gtknphoqwx.istkbnxepw(this.f39599ppxfxbqfkf, this.f39595iobyxmoadg.nufgyqmvbu());
        this.f39593gtknphoqwx.zoijcleaow(this.f39599ppxfxbqfkf);
        this.f39593gtknphoqwx.ojitshcjhn(this.f39599ppxfxbqfkf, -1L);
        return false;
    }

    public final boolean cqumvgiudr(androidx.work.ppxfxbqfkf.iobyxmoadg result) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        rgvfuqvkyq(this.f39599ppxfxbqfkf);
        androidx.work.zoijcleaow zoijcleaowVarWkgbmnqykc = ((androidx.work.ppxfxbqfkf.iobyxmoadg.C0209iobyxmoadg) result).wkgbmnqykc();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVarWkgbmnqykc, "failure.outputData");
        this.f39593gtknphoqwx.istkbnxepw(this.f39599ppxfxbqfkf, this.f39595iobyxmoadg.nufgyqmvbu());
        this.f39593gtknphoqwx.kcexrzcfyt(this.f39599ppxfxbqfkf, zoijcleaowVarWkgbmnqykc);
        return false;
    }

    public final p6.wflxmlrfwp draadjrbmk() {
        return p6.lereixgezr.iobyxmoadg(this.f39595iobyxmoadg);
    }

    public final void ojitshcjhn(int i13) {
        this.f39598ojitshcjhn.nufgyqmvbu(new WorkerStoppedException(i13));
    }

    public final com.google.common.util.concurrent.wkgbmnqykc vdvldrhtss() {
        return g6.zdlpuopuiu.gtknphoqwx(this.f39594gxszxtbevo.zoijcleaow().plus(skhdrjzrfn.zoijcleaow(null, 1, null)), null, new ppxfxbqfkf(null), 2, null);
    }

    public final p6.yggfygwlhe wflxmlrfwp() {
        return this.f39595iobyxmoadg;
    }
}
