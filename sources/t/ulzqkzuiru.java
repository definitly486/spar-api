package t;

import androidx.compose.ui.input.pointer.CancelTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import androidx.compose.ui.platform.w;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import pj.crxdokpmqz;

/* JADX INFO: loaded from: classes.dex */
public final class ulzqkzuiru extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements ntlheqmsrt, ylkuphrtab, w0.wkgbmnqykc {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private auzgnhcxok f109158cllcsxoeiz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private rgvfuqvkyq f109159dsvhmnatus = tzroggbefp.f109157iobyxmoadg;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private Object[] f109160hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private PointerInputEventHandler f109161hkdspvbjdz;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private tg.rgvfuqvkyq f109162jpowsppfya;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f109163kegysxyocb;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private long f109164mbcevpiqjq;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private Object f109165pkzmftpjix;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final Object f109166stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private rgvfuqvkyq f109167tzroggbefp;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f109168wypolnanlu;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private Object f109169ylkuphrtab;

    private final class iobyxmoadg implements t.zoijcleaow, w0.wkgbmnqykc, lg.gxszxtbevo {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private pj.agtfadlqog f109173jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final lg.gxszxtbevo f109174yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final /* synthetic */ ulzqkzuiru f109175zdlpuopuiu;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private oxmwwwfdhm f109172iwizpuwonk = oxmwwwfdhm.Main;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final lg.btonecajqb f109170cqumvgiudr = lg.gtknphoqwx.f62507zdlpuopuiu;

        /* JADX INFO: renamed from: t.ulzqkzuiru$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2680iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            int f109176iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f109178yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f109179zdlpuopuiu;

            C2680iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f109178yggfygwlhe = obj;
                this.f109176iwizpuwonk |= Integer.MIN_VALUE;
                return iobyxmoadg.this.ikoacuggdj(0L, null, this);
            }
        }

        static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            int f109180jyumaefscl;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            /* synthetic */ Object f109182zdlpuopuiu;

            ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f109182zdlpuopuiu = obj;
                this.f109180jyumaefscl |= Integer.MIN_VALUE;
                return iobyxmoadg.this.l(0L, null, this);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f109183jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ long f109184yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f109185zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(long j13, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f109184yggfygwlhe = j13;
                this.f109183jyumaefscl = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new zoijcleaow(this.f109184yggfygwlhe, this.f109183jyumaefscl, gxszxtbevoVar);
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0040  */
            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                pj.agtfadlqog agtfadlqogVar;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f109185zdlpuopuiu;
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    agtfadlqogVar = this.f109183jyumaefscl.f109173jyumaefscl;
                    if (agtfadlqogVar != null) {
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                        agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(new PointerEventTimeoutCancellationException(this.f109184yggfygwlhe))));
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                long j13 = this.f109184yggfygwlhe - 8;
                this.f109185zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(j13, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                this.f109185zdlpuopuiu = 2;
                if (crxdokpmqz.zoijcleaow(8L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                agtfadlqogVar = this.f109183jyumaefscl.f109173jyumaefscl;
                if (agtfadlqogVar != null) {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(new PointerEventTimeoutCancellationException(this.f109184yggfygwlhe))));
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            this.f109175zdlpuopuiu = ulzqkzuiru.this;
            this.f109174yggfygwlhe = gxszxtbevoVar;
        }

        @Override // w0.wkgbmnqykc
        public float A(float f13) {
            return this.f109175zdlpuopuiu.A(f13);
        }

        @Override // w0.draadjrbmk
        public float F() {
            return this.f109175zdlpuopuiu.F();
        }

        @Override // w0.wkgbmnqykc
        public float I(float f13) {
            return this.f109175zdlpuopuiu.I(f13);
        }

        @Override // w0.wkgbmnqykc
        public long V(long j13) {
            return this.f109175zdlpuopuiu.V(j13);
        }

        @Override // t.zoijcleaow
        public rgvfuqvkyq b() {
            return ulzqkzuiru.this.f109159dsvhmnatus;
        }

        @Override // t.zoijcleaow
        public long dvvnrvtcbc() {
            return ulzqkzuiru.this.dvvnrvtcbc();
        }

        @Override // lg.gxszxtbevo
        public lg.btonecajqb getContext() {
            return this.f109170cqumvgiudr;
        }

        @Override // w0.wkgbmnqykc
        public float getDensity() {
            return this.f109175zdlpuopuiu.getDensity();
        }

        @Override // t.zoijcleaow
        public w getViewConfiguration() {
            return ulzqkzuiru.this.getViewConfiguration();
        }

        @Override // w0.wkgbmnqykc
        public int hszhottldk(float f13) {
            return this.f109175zdlpuopuiu.hszhottldk(f13);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [pj.auzgnhcxok] */
        /* JADX WARN: Type inference failed for: r11v3, types: [pj.auzgnhcxok] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r13v0, types: [tg.rgvfuqvkyq] */
        @Override // t.zoijcleaow
        public Object ikoacuggdj(long j13, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            C2680iobyxmoadg c2680iobyxmoadg;
            pj.agtfadlqog agtfadlqogVar;
            if (gxszxtbevoVar instanceof C2680iobyxmoadg) {
                c2680iobyxmoadg = (C2680iobyxmoadg) gxszxtbevoVar;
                int i13 = c2680iobyxmoadg.f109176iwizpuwonk;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    c2680iobyxmoadg.f109176iwizpuwonk = i13 - Integer.MIN_VALUE;
                } else {
                    c2680iobyxmoadg = new C2680iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                c2680iobyxmoadg = new C2680iobyxmoadg(gxszxtbevoVar);
            }
            Object objInvoke = c2680iobyxmoadg.f109178yggfygwlhe;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = c2680iobyxmoadg.f109176iwizpuwonk;
            try {
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(objInvoke);
                    if (j13 <= 0 && (agtfadlqogVar = this.f109173jyumaefscl) != null) {
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                        agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(new PointerEventTimeoutCancellationException(j13))));
                    }
                    auzgnhcxok auzgnhcxokVarWkgbmnqykc = pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.this.g0(), null, null, new zoijcleaow(j13, this, null), 3, null);
                    c2680iobyxmoadg.f109179zdlpuopuiu = auzgnhcxokVarWkgbmnqykc;
                    c2680iobyxmoadg.f109176iwizpuwonk = 1;
                    objInvoke = rgvfuqvkyqVar.invoke(this, c2680iobyxmoadg);
                    j13 = auzgnhcxokVarWkgbmnqykc;
                    if (objInvoke == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    auzgnhcxok auzgnhcxokVar = (auzgnhcxok) c2680iobyxmoadg.f109179zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objInvoke);
                    j13 = auzgnhcxokVar;
                }
                j13.nufgyqmvbu(CancelTimeoutCancellationException.f6391zdlpuopuiu);
                return objInvoke;
            } catch (Throwable th2) {
                j13.nufgyqmvbu(CancelTimeoutCancellationException.f6391zdlpuopuiu);
                throw th2;
            }
        }

        @Override // t.zoijcleaow
        public long iobyxmoadg() {
            return ulzqkzuiru.this.f109164mbcevpiqjq;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // t.zoijcleaow
        public Object l(long j13, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar;
            if (gxszxtbevoVar instanceof ppxfxbqfkf) {
                ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
                int i13 = ppxfxbqfkfVar.f109180jyumaefscl;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    ppxfxbqfkfVar.f109180jyumaefscl = i13 - Integer.MIN_VALUE;
                } else {
                    ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
                }
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
            Object objIkoacuggdj = ppxfxbqfkfVar.f109182zdlpuopuiu;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = ppxfxbqfkfVar.f109180jyumaefscl;
            try {
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(objIkoacuggdj);
                    ppxfxbqfkfVar.f109180jyumaefscl = 1;
                    objIkoacuggdj = ikoacuggdj(j13, rgvfuqvkyqVar, ppxfxbqfkfVar);
                    if (objIkoacuggdj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(objIkoacuggdj);
                }
                return objIkoacuggdj;
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
        }

        @Override // w0.wkgbmnqykc
        public long mbcevpiqjq(long j13) {
            return this.f109175zdlpuopuiu.mbcevpiqjq(j13);
        }

        @Override // w0.wkgbmnqykc
        public float mhtqkkgtqm(long j13) {
            return this.f109175zdlpuopuiu.mhtqkkgtqm(j13);
        }

        public final void oxmwwwfdhm(rgvfuqvkyq rgvfuqvkyqVar, oxmwwwfdhm oxmwwwfdhmVar) {
            pj.agtfadlqog agtfadlqogVar;
            if (oxmwwwfdhmVar != this.f109172iwizpuwonk || (agtfadlqogVar = this.f109173jyumaefscl) == null) {
                return;
            }
            this.f109173jyumaefscl = null;
            agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(rgvfuqvkyqVar));
        }

        @Override // lg.gxszxtbevo
        public void resumeWith(Object obj) {
            Object obj2 = ulzqkzuiru.this.f109166stevsuqkhv;
            ulzqkzuiru ulzqkzuiruVar = ulzqkzuiru.this;
            synchronized (obj2) {
                ulzqkzuiruVar.f109168wypolnanlu.rgvfuqvkyq(this);
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            this.f109174yggfygwlhe.resumeWith(obj);
        }

        @Override // w0.draadjrbmk
        public long tzroggbefp(float f13) {
            return this.f109175zdlpuopuiu.tzroggbefp(f13);
        }

        @Override // w0.wkgbmnqykc
        public long uwvvkdfqfp(float f13) {
            return this.f109175zdlpuopuiu.uwvvkdfqfp(f13);
        }

        @Override // w0.draadjrbmk
        public float vipkmwdibw(long j13) {
            return this.f109175zdlpuopuiu.vipkmwdibw(j13);
        }

        public final void wflxmlrfwp(Throwable th2) {
            pj.agtfadlqog agtfadlqogVar = this.f109173jyumaefscl;
            if (agtfadlqogVar != null) {
                agtfadlqogVar.hkdspvbjdz(th2);
            }
            this.f109173jyumaefscl = null;
        }

        @Override // w0.wkgbmnqykc
        public float x(int i13) {
            return this.f109175zdlpuopuiu.x(i13);
        }

        @Override // t.zoijcleaow
        public Object yzdjzghtvl(oxmwwwfdhm oxmwwwfdhmVar, lg.gxszxtbevo gxszxtbevoVar) {
            pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
            rgvfuqvkyqVar.lereixgezr();
            this.f109172iwizpuwonk = oxmwwwfdhmVar;
            this.f109173jyumaefscl = rgvfuqvkyqVar;
            Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
            if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
            }
            return objZdlpuopuiu;
        }
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f109186zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
            super(1);
            this.f109186zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            this.f109186zdlpuopuiu.wflxmlrfwp(th2);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f109188zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ulzqkzuiru.this.new wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f109188zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (ulzqkzuiru.this.f109162jpowsppfya != null) {
                    tg.rgvfuqvkyq rgvfuqvkyqVar = ulzqkzuiru.this.f109162jpowsppfya;
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rgvfuqvkyqVar);
                    ulzqkzuiru ulzqkzuiruVar = ulzqkzuiru.this;
                    this.f109188zdlpuopuiu = 1;
                    if (rgvfuqvkyqVar.invoke(ulzqkzuiruVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    PointerInputEventHandler pointerInputEventHandlerN0 = ulzqkzuiru.this.N0();
                    ulzqkzuiru ulzqkzuiruVar2 = ulzqkzuiru.this;
                    this.f109188zdlpuopuiu = 2;
                    if (pointerInputEventHandlerN0.invoke(ulzqkzuiruVar2, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1 && i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f109189iobyxmoadg;

        static {
            int[] iArr = new int[oxmwwwfdhm.values().length];
            try {
                iArr[oxmwwwfdhm.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oxmwwwfdhm.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oxmwwwfdhm.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f109189iobyxmoadg = iArr;
        }
    }

    public ulzqkzuiru(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f109169ylkuphrtab = obj;
        this.f109165pkzmftpjix = obj2;
        this.f109160hcddaimhww = objArr;
        this.f109161hkdspvbjdz = pointerInputEventHandler;
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new iobyxmoadg[16], 0);
        this.f109168wypolnanlu = ppxfxbqfkfVar;
        this.f109166stevsuqkhv = ppxfxbqfkfVar;
        this.f109163kegysxyocb = new ipoelvxyzq.ppxfxbqfkf(new iobyxmoadg[16], 0);
        this.f109164mbcevpiqjq = w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg();
    }

    private final void M0(rgvfuqvkyq rgvfuqvkyqVar, oxmwwwfdhm oxmwwwfdhmVar) {
        synchronized (this.f109166stevsuqkhv) {
            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f109163kegysxyocb;
            ppxfxbqfkfVar.ppxfxbqfkf(ppxfxbqfkfVar.draadjrbmk(), this.f109168wypolnanlu);
        }
        try {
            int i13 = zoijcleaow.f109189iobyxmoadg[oxmwwwfdhmVar.ordinal()];
            if (i13 == 1 || i13 == 2) {
                ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2 = this.f109163kegysxyocb;
                Object[] objArr = ppxfxbqfkfVar2.f49169zdlpuopuiu;
                int iDraadjrbmk = ppxfxbqfkfVar2.draadjrbmk();
                for (int i14 = 0; i14 < iDraadjrbmk; i14++) {
                    ((iobyxmoadg) objArr[i14]).oxmwwwfdhm(rgvfuqvkyqVar, oxmwwwfdhmVar);
                }
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar3 = this.f109163kegysxyocb;
                int iDraadjrbmk2 = ppxfxbqfkfVar3.draadjrbmk() - 1;
                Object[] objArr2 = ppxfxbqfkfVar3.f49169zdlpuopuiu;
                if (iDraadjrbmk2 < objArr2.length) {
                    while (iDraadjrbmk2 >= 0) {
                        ((iobyxmoadg) objArr2[iDraadjrbmk2]).oxmwwwfdhm(rgvfuqvkyqVar, oxmwwwfdhmVar);
                        iDraadjrbmk2--;
                    }
                }
            }
            this.f109163kegysxyocb.nufgyqmvbu();
        } catch (Throwable th2) {
            this.f109163kegysxyocb.nufgyqmvbu();
            throw th2;
        }
    }

    @Override // w0.draadjrbmk
    public float F() {
        return z.gtknphoqwx.rgvfuqvkyq(this).kegysxyocb().F();
    }

    public PointerInputEventHandler N0() {
        return this.f109161hkdspvbjdz;
    }

    public final void O0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        boolean z13 = !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f109169ylkuphrtab, obj);
        this.f109169ylkuphrtab = obj;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f109165pkzmftpjix, obj2)) {
            z13 = true;
        }
        this.f109165pkzmftpjix = obj2;
        Object[] objArr2 = this.f109160hcddaimhww;
        if (objArr2 != null && objArr == null) {
            z13 = true;
        }
        if (objArr2 == null && objArr != null) {
            z13 = true;
        }
        if (objArr2 != null && objArr != null && !Arrays.equals(objArr, objArr2)) {
            z13 = true;
        }
        this.f109160hcddaimhww = objArr;
        if (N0().getClass() == pointerInputEventHandler.getClass() ? z13 : true) {
            ezmngbhpjk();
        }
        this.f109161hkdspvbjdz = pointerInputEventHandler;
    }

    @Override // z.tbqsvytpvh
    public void W() {
        ezmngbhpjk();
    }

    @Override // t.ylkuphrtab
    public Object X(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        pj.rgvfuqvkyq rgvfuqvkyqVar2 = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar2.lereixgezr();
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(rgvfuqvkyqVar2);
        synchronized (this.f109166stevsuqkhv) {
            this.f109168wypolnanlu.zoijcleaow(iobyxmoadgVar);
            lg.gxszxtbevo gxszxtbevoVarIobyxmoadg = lg.nufgyqmvbu.iobyxmoadg(rgvfuqvkyqVar, iobyxmoadgVar, iobyxmoadgVar);
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            gxszxtbevoVarIobyxmoadg.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
        }
        rgvfuqvkyqVar2.stevsuqkhv(new ppxfxbqfkf(iobyxmoadgVar));
        Object objZdlpuopuiu = rgvfuqvkyqVar2.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }

    public long dvvnrvtcbc() {
        long jV = V(getViewConfiguration().gxszxtbevo());
        long jIobyxmoadg = iobyxmoadg();
        return g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jV >> 32)) - ((int) (jIobyxmoadg >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jV & 4294967295L)) - ((int) (jIobyxmoadg & 4294967295L))) / 2.0f)) & 4294967295L));
    }

    @Override // t.ntlheqmsrt
    public void ezmngbhpjk() {
        auzgnhcxok auzgnhcxokVar = this.f109158cllcsxoeiz;
        if (auzgnhcxokVar != null) {
            auzgnhcxokVar.nufgyqmvbu(new PointerInputResetException());
            this.f109158cllcsxoeiz = null;
        }
    }

    @Override // w0.wkgbmnqykc
    public float getDensity() {
        return z.gtknphoqwx.rgvfuqvkyq(this).kegysxyocb().getDensity();
    }

    @Override // t.ylkuphrtab
    public w getViewConfiguration() {
        return z.gtknphoqwx.rgvfuqvkyq(this).igdgnonuha();
    }

    @Override // t.ylkuphrtab
    public long iobyxmoadg() {
        return this.f109164mbcevpiqjq;
    }

    @Override // z.tbqsvytpvh
    public void metgxyhuhe(rgvfuqvkyq rgvfuqvkyqVar, oxmwwwfdhm oxmwwwfdhmVar, long j13) {
        this.f109164mbcevpiqjq = j13;
        if (oxmwwwfdhmVar == oxmwwwfdhm.Initial) {
            this.f109159dsvhmnatus = rgvfuqvkyqVar;
        }
        if (this.f109158cllcsxoeiz == null) {
            this.f109158cllcsxoeiz = pj.gtknphoqwx.wkgbmnqykc(g0(), null, pj.wypolnanlu.UNDISPATCHED, new wkgbmnqykc(null), 1, null);
        }
        M0(rgvfuqvkyqVar, oxmwwwfdhmVar);
        List listPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf();
        int size = listPpxfxbqfkf.size();
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                z13 = true;
                break;
            } else if (!vdvldrhtss.wkgbmnqykc((pmvmpeiblj) listPpxfxbqfkf.get(i13))) {
                break;
            } else {
                i13++;
            }
        }
        if (z13) {
            rgvfuqvkyqVar = null;
        }
        this.f109167tzroggbefp = rgvfuqvkyqVar;
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void r0() {
        ezmngbhpjk();
        super.r0();
    }

    @Override // z.tbqsvytpvh
    public void s() {
        rgvfuqvkyq rgvfuqvkyqVar = this.f109167tzroggbefp;
        if (rgvfuqvkyqVar == null) {
            return;
        }
        List listPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf();
        int size = listPpxfxbqfkf.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((pmvmpeiblj) listPpxfxbqfkf.get(i13)).dxjokdxxww()) {
                List listPpxfxbqfkf2 = rgvfuqvkyqVar.ppxfxbqfkf();
                ArrayList arrayList = new ArrayList(listPpxfxbqfkf2.size());
                int size2 = listPpxfxbqfkf2.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    pmvmpeiblj pmvmpeibljVar = (pmvmpeiblj) listPpxfxbqfkf2.get(i14);
                    arrayList.add(new pmvmpeiblj(pmvmpeibljVar.gxszxtbevo(), pmvmpeibljVar.ojitshcjhn(), pmvmpeibljVar.nufgyqmvbu(), false, pmvmpeibljVar.btonecajqb(), pmvmpeibljVar.ojitshcjhn(), pmvmpeibljVar.nufgyqmvbu(), pmvmpeibljVar.dxjokdxxww(), pmvmpeibljVar.dxjokdxxww(), pmvmpeibljVar.agtfadlqog(), 0L, UserVerificationMethods.USER_VERIFY_ALL, (kotlin.jvm.internal.gtknphoqwx) null));
                }
                rgvfuqvkyq rgvfuqvkyqVar2 = new rgvfuqvkyq(arrayList);
                this.f109159dsvhmnatus = rgvfuqvkyqVar2;
                M0(rgvfuqvkyqVar2, oxmwwwfdhm.Initial);
                M0(rgvfuqvkyqVar2, oxmwwwfdhm.Main);
                M0(rgvfuqvkyqVar2, oxmwwwfdhm.Final);
                this.f109167tzroggbefp = null;
                return;
            }
        }
    }

    @Override // z.btonecajqb
    public void yadqdtsiqt() {
        ezmngbhpjk();
    }
}
