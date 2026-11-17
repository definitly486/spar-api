package g6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import pj.auzgnhcxok;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zdlpuopuiu {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f36491iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f36492jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f36493yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f36494zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f36492jyumaefscl = rgvfuqvkyqVar;
            this.f36491iwizpuwonk = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f36492jyumaefscl, this.f36491iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f36493yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f36494zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f36493yggfygwlhe;
                    tg.rgvfuqvkyq rgvfuqvkyqVar = this.f36492jyumaefscl;
                    this.f36494zdlpuopuiu = 1;
                    obj = rgvfuqvkyqVar.invoke(cllcsxoeizVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                this.f36491iwizpuwonk.ppxfxbqfkf(obj);
            } catch (CancellationException unused) {
                this.f36491iwizpuwonk.wkgbmnqykc();
            } catch (Throwable th2) {
                this.f36491iwizpuwonk.gxszxtbevo(th2);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final com.google.common.util.concurrent.wkgbmnqykc btonecajqb(final lg.btonecajqb context, final pj.wypolnanlu start, final tg.rgvfuqvkyq block) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(start, "start");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: g6.ojitshcjhn
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return zdlpuopuiu.draadjrbmk(context, start, block, iobyxmoadgVar);
            }
        });
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarIobyxmoadg, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return wkgbmnqykcVarIobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object draadjrbmk(lg.btonecajqb btonecajqbVar, pj.wypolnanlu wypolnanluVar, tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg completer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(completer, "completer");
        final auzgnhcxok auzgnhcxokVar = (auzgnhcxok) btonecajqbVar.get(auzgnhcxok.f76671gtknphoqwx);
        completer.iobyxmoadg(new Runnable() { // from class: g6.rgvfuqvkyq
            @Override // java.lang.Runnable
            public final void run() {
                zdlpuopuiu.wflxmlrfwp(auzgnhcxokVar);
            }
        }, lqeggnwhkg.INSTANCE);
        return pj.gtknphoqwx.wkgbmnqykc(pj.dsvhmnatus.iobyxmoadg(btonecajqbVar), null, wypolnanluVar, new iobyxmoadg(rgvfuqvkyqVar, completer, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(AtomicBoolean atomicBoolean, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            iobyxmoadgVar.ppxfxbqfkf(iobyxmoadgVar2.invoke());
        } catch (Throwable th2) {
            iobyxmoadgVar.gxszxtbevo(th2);
        }
    }

    public static /* synthetic */ com.google.common.util.concurrent.wkgbmnqykc gtknphoqwx(lg.btonecajqb btonecajqbVar, pj.wypolnanlu wypolnanluVar, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            btonecajqbVar = lg.gtknphoqwx.f62507zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            wypolnanluVar = pj.wypolnanlu.DEFAULT;
        }
        return btonecajqb(btonecajqbVar, wypolnanluVar, rgvfuqvkyqVar);
    }

    public static final com.google.common.util.concurrent.wkgbmnqykc gxszxtbevo(final Executor executor, final String debugTag, final tg.iobyxmoadg block) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(executor, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(debugTag, "debugTag");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: g6.vdvldrhtss
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return zdlpuopuiu.lqeggnwhkg(executor, debugTag, block, iobyxmoadgVar);
            }
        });
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarIobyxmoadg, "getFuture { completer ->… }\n        debugTag\n    }");
        return wkgbmnqykcVarIobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object lqeggnwhkg(Executor executor, String str, final tg.iobyxmoadg iobyxmoadgVar, final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg completer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(completer, "completer");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.iobyxmoadg(new Runnable() { // from class: g6.oxmwwwfdhm
            @Override // java.lang.Runnable
            public final void run() {
                zdlpuopuiu.nufgyqmvbu(atomicBoolean);
            }
        }, lqeggnwhkg.INSTANCE);
        executor.execute(new Runnable() { // from class: g6.kcexrzcfyt
            @Override // java.lang.Runnable
            public final void run() {
                zdlpuopuiu.dxjokdxxww(atomicBoolean, completer, iobyxmoadgVar);
            }
        });
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(auzgnhcxok auzgnhcxokVar) {
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
    }
}
