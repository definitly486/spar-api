package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.c1;
import java.util.concurrent.CancellationException;
import vipkmwdibw.p;

/* JADX INFO: loaded from: classes.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final long f5143yggfygwlhe;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private k.ppxfxbqfkf f5145agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f5146btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f5147draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f5148dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private vipkmwdibw.wwaezpbzkn f5149eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f5150gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private vipkmwdibw.wwaezpbzkn f5151gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pj.cllcsxoeiz f5152iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f5153lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f5154nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final vipkmwdibw.zoijcleaow f5155ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private long f5156oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.iobyxmoadg f5157ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final vipkmwdibw.zoijcleaow f5158rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f5159vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private long f5160wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private vipkmwdibw.wwaezpbzkn f5161wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final h.auzgnhcxok f5162zoijcleaow;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public static final iobyxmoadg f5142kcexrzcfyt = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final int f5144zdlpuopuiu = 8;

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f5164zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return vdvldrhtss.this.new dxjokdxxww(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f5164zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                vipkmwdibw.zoijcleaow zoijcleaowVar = vdvldrhtss.this.f5158rgvfuqvkyq;
                this.f5164zdlpuopuiu = 1;
                if (zoijcleaowVar.yggfygwlhe(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ long f5165cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw.wwaezpbzkn f5166iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f5168yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f5169zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(vipkmwdibw.wwaezpbzkn wwaezpbzknVar, long j13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f5166iwizpuwonk = wwaezpbzknVar;
            this.f5165cqumvgiudr = j13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn kcexrzcfyt(vdvldrhtss vdvldrhtssVar, long j13, vipkmwdibw.zoijcleaow zoijcleaowVar) {
            vdvldrhtssVar.wwaezpbzkn(w0.agtfadlqog.draadjrbmk(((w0.agtfadlqog) zoijcleaowVar.wflxmlrfwp()).rgvfuqvkyq(), j13));
            vdvldrhtssVar.f5157ppxfxbqfkf.invoke();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return vdvldrhtss.this.new eablkybsjg(this.f5166iwizpuwonk, this.f5165cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00a9 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            vipkmwdibw.wwaezpbzkn wwaezpbzknVar;
            vipkmwdibw.wwaezpbzkn wwaezpbzknVar2;
            vipkmwdibw.wwaezpbzkn wwaezpbzknVar3;
            vipkmwdibw.zoijcleaow zoijcleaowVar;
            w0.agtfadlqog agtfadlqogVarPpxfxbqfkf;
            tg.draadjrbmk draadjrbmkVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f5168yggfygwlhe;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        wwaezpbzknVar2 = (vipkmwdibw.wwaezpbzkn) this.f5169zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    vdvldrhtss.this.lmojexxdyd(false);
                    vdvldrhtss.this.f5153lqeggnwhkg = false;
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (vdvldrhtss.this.f5155ojitshcjhn.rgvfuqvkyq()) {
                    vipkmwdibw.wwaezpbzkn wwaezpbzknVar4 = this.f5166iwizpuwonk;
                    wwaezpbzknVar = wwaezpbzknVar4 instanceof vipkmwdibw.czzsidtyhn ? (vipkmwdibw.czzsidtyhn) wwaezpbzknVar4 : yggfygwlhe.f5245iobyxmoadg;
                } else {
                    wwaezpbzknVar = this.f5166iwizpuwonk;
                }
                wwaezpbzknVar2 = wwaezpbzknVar;
                if (!vdvldrhtss.this.f5155ojitshcjhn.rgvfuqvkyq()) {
                    vipkmwdibw.zoijcleaow zoijcleaowVar2 = vdvldrhtss.this.f5155ojitshcjhn;
                    w0.agtfadlqog agtfadlqogVarPpxfxbqfkf2 = w0.agtfadlqog.ppxfxbqfkf(this.f5165cqumvgiudr);
                    this.f5169zdlpuopuiu = wwaezpbzknVar2;
                    this.f5168yggfygwlhe = 1;
                    if (zoijcleaowVar2.zdlpuopuiu(agtfadlqogVarPpxfxbqfkf2, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                wwaezpbzknVar3 = wwaezpbzknVar2;
                final long jDraadjrbmk = w0.agtfadlqog.draadjrbmk(((w0.agtfadlqog) vdvldrhtss.this.f5155ojitshcjhn.wflxmlrfwp()).rgvfuqvkyq(), this.f5165cqumvgiudr);
                zoijcleaowVar = vdvldrhtss.this.f5155ojitshcjhn;
                agtfadlqogVarPpxfxbqfkf = w0.agtfadlqog.ppxfxbqfkf(jDraadjrbmk);
                final vdvldrhtss vdvldrhtssVar = vdvldrhtss.this;
                draadjrbmkVar = new tg.draadjrbmk() { // from class: androidx.compose.foundation.lazy.layout.zdlpuopuiu
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj2) {
                        return vdvldrhtss.eablkybsjg.kcexrzcfyt(vdvldrhtssVar, jDraadjrbmk, (vipkmwdibw.zoijcleaow) obj2);
                    }
                };
                this.f5169zdlpuopuiu = null;
                this.f5168yggfygwlhe = 2;
                if (vipkmwdibw.zoijcleaow.gxszxtbevo(zoijcleaowVar, agtfadlqogVarPpxfxbqfkf, wwaezpbzknVar3, null, draadjrbmkVar, this, 4, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                vdvldrhtss.this.lmojexxdyd(false);
                vdvldrhtss.this.f5153lqeggnwhkg = false;
                return gg.wwaezpbzkn.f37140iobyxmoadg;
                vdvldrhtss.this.f5157ppxfxbqfkf.invoke();
                wwaezpbzknVar3 = wwaezpbzknVar2;
                final long jDraadjrbmk2 = w0.agtfadlqog.draadjrbmk(((w0.agtfadlqog) vdvldrhtss.this.f5155ojitshcjhn.wflxmlrfwp()).rgvfuqvkyq(), this.f5165cqumvgiudr);
                zoijcleaowVar = vdvldrhtss.this.f5155ojitshcjhn;
                agtfadlqogVarPpxfxbqfkf = w0.agtfadlqog.ppxfxbqfkf(jDraadjrbmk2);
                final vdvldrhtss vdvldrhtssVar2 = vdvldrhtss.this;
                draadjrbmkVar = new tg.draadjrbmk() { // from class: androidx.compose.foundation.lazy.layout.zdlpuopuiu
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj2) {
                        return vdvldrhtss.eablkybsjg.kcexrzcfyt(vdvldrhtssVar2, jDraadjrbmk2, (vipkmwdibw.zoijcleaow) obj2);
                    }
                };
                this.f5169zdlpuopuiu = null;
                this.f5168yggfygwlhe = 2;
                if (vipkmwdibw.zoijcleaow.gxszxtbevo(zoijcleaowVar, agtfadlqogVarPpxfxbqfkf, wwaezpbzknVar3, null, draadjrbmkVar, this, 4, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                vdvldrhtss.this.lmojexxdyd(false);
                vdvldrhtss.this.f5153lqeggnwhkg = false;
            } catch (CancellationException unused) {
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f5171zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return vdvldrhtss.this.new gxszxtbevo(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f5171zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                vipkmwdibw.zoijcleaow zoijcleaowVar = vdvldrhtss.this.f5155ojitshcjhn;
                w0.agtfadlqog agtfadlqogVarPpxfxbqfkf = w0.agtfadlqog.ppxfxbqfkf(w0.agtfadlqog.f118237zoijcleaow.zoijcleaow());
                this.f5171zdlpuopuiu = 1;
                if (zoijcleaowVar.zdlpuopuiu(agtfadlqogVarPpxfxbqfkf, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            vdvldrhtss.this.wwaezpbzkn(w0.agtfadlqog.f118237zoijcleaow.zoijcleaow());
            vdvldrhtss.this.lmojexxdyd(false);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return vdvldrhtss.f5143yggfygwlhe;
        }

        private iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f5173zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return vdvldrhtss.this.new lqeggnwhkg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f5173zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                vipkmwdibw.zoijcleaow zoijcleaowVar = vdvldrhtss.this.f5155ojitshcjhn;
                this.f5173zdlpuopuiu = 1;
                if (zoijcleaowVar.yggfygwlhe(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f5175zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return vdvldrhtss.this.new nufgyqmvbu(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f5175zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                vipkmwdibw.zoijcleaow zoijcleaowVar = vdvldrhtss.this.f5158rgvfuqvkyq;
                this.f5175zdlpuopuiu = 1;
                if (zoijcleaowVar.yggfygwlhe(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ k.ppxfxbqfkf f5176cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw.wwaezpbzkn f5177iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ vdvldrhtss f5178jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f5179yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f5180zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(boolean z13, vdvldrhtss vdvldrhtssVar, vipkmwdibw.wwaezpbzkn wwaezpbzknVar, k.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f5179yggfygwlhe = z13;
            this.f5178jyumaefscl = vdvldrhtssVar;
            this.f5177iwizpuwonk = wwaezpbzknVar;
            this.f5176cqumvgiudr = ppxfxbqfkfVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn kcexrzcfyt(k.ppxfxbqfkf ppxfxbqfkfVar, vdvldrhtss vdvldrhtssVar, vipkmwdibw.zoijcleaow zoijcleaowVar) {
            ppxfxbqfkfVar.hcddaimhww(((Number) zoijcleaowVar.wflxmlrfwp()).floatValue());
            vdvldrhtssVar.f5157ppxfxbqfkf.invoke();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f5179yggfygwlhe, this.f5178jyumaefscl, this.f5177iwizpuwonk, this.f5176cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f5180zdlpuopuiu;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    this.f5178jyumaefscl.lereixgezr(false);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (this.f5179yggfygwlhe) {
                    vipkmwdibw.zoijcleaow zoijcleaowVar = this.f5178jyumaefscl.f5158rgvfuqvkyq;
                    Float fPpxfxbqfkf = kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(0.0f);
                    this.f5180zdlpuopuiu = 1;
                    if (zoijcleaowVar.zdlpuopuiu(fPpxfxbqfkf, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                vipkmwdibw.zoijcleaow zoijcleaowVar2 = this.f5178jyumaefscl.f5158rgvfuqvkyq;
                Float fPpxfxbqfkf2 = kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(1.0f);
                vipkmwdibw.wwaezpbzkn wwaezpbzknVar = this.f5177iwizpuwonk;
                final k.ppxfxbqfkf ppxfxbqfkfVar = this.f5176cqumvgiudr;
                final vdvldrhtss vdvldrhtssVar = this.f5178jyumaefscl;
                tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: androidx.compose.foundation.lazy.layout.oxmwwwfdhm
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj2) {
                        return vdvldrhtss.ppxfxbqfkf.kcexrzcfyt(ppxfxbqfkfVar, vdvldrhtssVar, (vipkmwdibw.zoijcleaow) obj2);
                    }
                };
                this.f5180zdlpuopuiu = 2;
                obj = vipkmwdibw.zoijcleaow.gxszxtbevo(zoijcleaowVar2, fPpxfxbqfkf2, wwaezpbzknVar, null, draadjrbmkVar, this, 4, null);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                this.f5178jyumaefscl.lereixgezr(false);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                this.f5178jyumaefscl.lereixgezr(false);
                throw th2;
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ k.ppxfxbqfkf f5181iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw.wwaezpbzkn f5182jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f5184zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(vipkmwdibw.wwaezpbzkn wwaezpbzknVar, k.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f5182jyumaefscl = wwaezpbzknVar;
            this.f5181iwizpuwonk = ppxfxbqfkfVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn kcexrzcfyt(k.ppxfxbqfkf ppxfxbqfkfVar, vdvldrhtss vdvldrhtssVar, vipkmwdibw.zoijcleaow zoijcleaowVar) {
            ppxfxbqfkfVar.hcddaimhww(((Number) zoijcleaowVar.wflxmlrfwp()).floatValue());
            vdvldrhtssVar.f5157ppxfxbqfkf.invoke();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return vdvldrhtss.this.new wkgbmnqykc(this.f5182jyumaefscl, this.f5181iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f5184zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    vipkmwdibw.zoijcleaow zoijcleaowVar = vdvldrhtss.this.f5158rgvfuqvkyq;
                    Float fPpxfxbqfkf = kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(0.0f);
                    vipkmwdibw.wwaezpbzkn wwaezpbzknVar = this.f5182jyumaefscl;
                    final k.ppxfxbqfkf ppxfxbqfkfVar = this.f5181iwizpuwonk;
                    final vdvldrhtss vdvldrhtssVar = vdvldrhtss.this;
                    tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: androidx.compose.foundation.lazy.layout.kcexrzcfyt
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj2) {
                            return vdvldrhtss.wkgbmnqykc.kcexrzcfyt(ppxfxbqfkfVar, vdvldrhtssVar, (vipkmwdibw.zoijcleaow) obj2);
                        }
                    };
                    this.f5184zdlpuopuiu = 1;
                    if (vipkmwdibw.zoijcleaow.gxszxtbevo(zoijcleaowVar, fPpxfxbqfkf, wwaezpbzknVar, null, draadjrbmkVar, this, 4, null) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                vdvldrhtss.this.pmvmpeiblj(true);
                vdvldrhtss.this.zynmafqrjb(false);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                vdvldrhtss.this.zynmafqrjb(false);
                throw th2;
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f5186zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return vdvldrhtss.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f5186zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                vipkmwdibw.zoijcleaow zoijcleaowVar = vdvldrhtss.this.f5158rgvfuqvkyq;
                Float fPpxfxbqfkf = kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(1.0f);
                this.f5186zdlpuopuiu = 1;
                if (zoijcleaowVar.zdlpuopuiu(fPpxfxbqfkf, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static {
        long j13 = Integer.MAX_VALUE;
        f5143yggfygwlhe = w0.agtfadlqog.wkgbmnqykc((j13 & 4294967295L) | (j13 << 32));
    }

    public vdvldrhtss(pj.cllcsxoeiz cllcsxoeizVar, h.auzgnhcxok auzgnhcxokVar, tg.iobyxmoadg iobyxmoadgVar) {
        this.f5152iobyxmoadg = cllcsxoeizVar;
        this.f5162zoijcleaow = auzgnhcxokVar;
        this.f5157ppxfxbqfkf = iobyxmoadgVar;
        Boolean bool = Boolean.FALSE;
        this.f5154nufgyqmvbu = c1.ppxfxbqfkf(bool, null, 2, null);
        this.f5148dxjokdxxww = c1.ppxfxbqfkf(bool, null, 2, null);
        this.f5146btonecajqb = c1.ppxfxbqfkf(bool, null, 2, null);
        this.f5150gtknphoqwx = c1.ppxfxbqfkf(bool, null, 2, null);
        long j13 = f5143yggfygwlhe;
        this.f5147draadjrbmk = j13;
        w0.agtfadlqog.iobyxmoadg iobyxmoadgVar2 = w0.agtfadlqog.f118237zoijcleaow;
        this.f5160wflxmlrfwp = iobyxmoadgVar2.zoijcleaow();
        this.f5145agtfadlqog = auzgnhcxokVar != null ? auzgnhcxokVar.zoijcleaow() : null;
        this.f5155ojitshcjhn = new vipkmwdibw.zoijcleaow(w0.agtfadlqog.ppxfxbqfkf(iobyxmoadgVar2.zoijcleaow()), p.tzroggbefp(iobyxmoadgVar2), null, null, 12, null);
        this.f5158rgvfuqvkyq = new vipkmwdibw.zoijcleaow(Float.valueOf(1.0f), p.dsvhmnatus(kotlin.jvm.internal.wflxmlrfwp.f60035iobyxmoadg), null, null, 12, null);
        this.f5159vdvldrhtss = c1.ppxfxbqfkf(w0.agtfadlqog.ppxfxbqfkf(iobyxmoadgVar2.zoijcleaow()), null, 2, null);
        this.f5156oxmwwwfdhm = j13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lereixgezr(boolean z13) {
        this.f5148dxjokdxxww.setValue(Boolean.valueOf(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lmojexxdyd(boolean z13) {
        this.f5154nufgyqmvbu.setValue(Boolean.valueOf(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pmvmpeiblj(boolean z13) {
        this.f5150gtknphoqwx.setValue(Boolean.valueOf(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wwaezpbzkn(long j13) {
        this.f5159vdvldrhtss.setValue(w0.agtfadlqog.ppxfxbqfkf(j13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zynmafqrjb(boolean z13) {
        this.f5146btonecajqb.setValue(Boolean.valueOf(z13));
    }

    public final void agtfadlqog() {
        if (iwizpuwonk()) {
            pj.gtknphoqwx.wkgbmnqykc(this.f5152iobyxmoadg, null, null, new gxszxtbevo(null), 3, null);
        }
    }

    public final void cdpycssgdh(vipkmwdibw.wwaezpbzkn wwaezpbzknVar) {
        this.f5151gxszxtbevo = wwaezpbzknVar;
    }

    public final boolean cqumvgiudr() {
        return this.f5153lqeggnwhkg;
    }

    public final void draadjrbmk() {
        k.ppxfxbqfkf ppxfxbqfkfVar = this.f5145agtfadlqog;
        vipkmwdibw.wwaezpbzkn wwaezpbzknVar = this.f5151gxszxtbevo;
        if (ppxfxbqfkfVar == null || jyumaefscl() || wwaezpbzknVar == null) {
            return;
        }
        zynmafqrjb(true);
        pj.gtknphoqwx.wkgbmnqykc(this.f5152iobyxmoadg, null, null, new wkgbmnqykc(wwaezpbzknVar, ppxfxbqfkfVar, null), 3, null);
    }

    public final void esjtqupxsv() {
        h.auzgnhcxok auzgnhcxokVar;
        if (iwizpuwonk()) {
            lmojexxdyd(false);
            pj.gtknphoqwx.wkgbmnqykc(this.f5152iobyxmoadg, null, null, new lqeggnwhkg(null), 3, null);
        }
        if (zdlpuopuiu()) {
            lereixgezr(false);
            pj.gtknphoqwx.wkgbmnqykc(this.f5152iobyxmoadg, null, null, new nufgyqmvbu(null), 3, null);
        }
        if (jyumaefscl()) {
            zynmafqrjb(false);
            pj.gtknphoqwx.wkgbmnqykc(this.f5152iobyxmoadg, null, null, new dxjokdxxww(null), 3, null);
        }
        this.f5153lqeggnwhkg = false;
        wwaezpbzkn(w0.agtfadlqog.f118237zoijcleaow.zoijcleaow());
        this.f5147draadjrbmk = f5143yggfygwlhe;
        k.ppxfxbqfkf ppxfxbqfkfVar = this.f5145agtfadlqog;
        if (ppxfxbqfkfVar != null && (auzgnhcxokVar = this.f5162zoijcleaow) != null) {
            auzgnhcxokVar.iobyxmoadg(ppxfxbqfkfVar);
        }
        this.f5145agtfadlqog = null;
        this.f5161wkgbmnqykc = null;
        this.f5151gxszxtbevo = null;
        this.f5149eablkybsjg = null;
    }

    public final void gtknphoqwx() {
        k.ppxfxbqfkf ppxfxbqfkfVar = this.f5145agtfadlqog;
        vipkmwdibw.wwaezpbzkn wwaezpbzknVar = this.f5161wkgbmnqykc;
        if (zdlpuopuiu() || wwaezpbzknVar == null || ppxfxbqfkfVar == null) {
            if (jyumaefscl()) {
                if (ppxfxbqfkfVar != null) {
                    ppxfxbqfkfVar.hcddaimhww(1.0f);
                }
                pj.gtknphoqwx.wkgbmnqykc(this.f5152iobyxmoadg, null, null, new zoijcleaow(null), 3, null);
                return;
            }
            return;
        }
        lereixgezr(true);
        boolean zJyumaefscl = jyumaefscl();
        boolean z13 = !zJyumaefscl;
        if (!zJyumaefscl) {
            ppxfxbqfkfVar.hcddaimhww(0.0f);
        }
        pj.gtknphoqwx.wkgbmnqykc(this.f5152iobyxmoadg, null, null, new ppxfxbqfkf(z13, this, wwaezpbzknVar, ppxfxbqfkfVar, null), 3, null);
    }

    public final void iozdgvuglv(long j13) {
        this.f5156oxmwwwfdhm = j13;
    }

    public final void istkbnxepw(vipkmwdibw.wwaezpbzkn wwaezpbzknVar) {
        this.f5161wkgbmnqykc = wwaezpbzknVar;
    }

    public final boolean iwizpuwonk() {
        return ((Boolean) this.f5154nufgyqmvbu.getValue()).booleanValue();
    }

    public final boolean jyumaefscl() {
        return ((Boolean) this.f5146btonecajqb.getValue()).booleanValue();
    }

    public final long kcexrzcfyt() {
        return this.f5147draadjrbmk;
    }

    public final long ojitshcjhn() {
        return this.f5160wflxmlrfwp;
    }

    public final long oxmwwwfdhm() {
        return ((w0.agtfadlqog) this.f5159vdvldrhtss.getValue()).rgvfuqvkyq();
    }

    public final void pkzmftpjix(long j13) {
        this.f5147draadjrbmk = j13;
    }

    public final k.ppxfxbqfkf rgvfuqvkyq() {
        return this.f5145agtfadlqog;
    }

    public final long vdvldrhtss() {
        return this.f5156oxmwwwfdhm;
    }

    public final void wflxmlrfwp(long j13, boolean z13) {
        vipkmwdibw.wwaezpbzkn wwaezpbzknVar = this.f5149eablkybsjg;
        if (wwaezpbzknVar == null) {
            return;
        }
        long jDraadjrbmk = w0.agtfadlqog.draadjrbmk(oxmwwwfdhm(), j13);
        wwaezpbzkn(jDraadjrbmk);
        lmojexxdyd(true);
        this.f5153lqeggnwhkg = z13;
        pj.gtknphoqwx.wkgbmnqykc(this.f5152iobyxmoadg, null, null, new eablkybsjg(wwaezpbzknVar, jDraadjrbmk, null), 3, null);
    }

    public final void yadqdtsiqt(long j13) {
        this.f5160wflxmlrfwp = j13;
    }

    public final boolean yggfygwlhe() {
        return ((Boolean) this.f5150gtknphoqwx.getValue()).booleanValue();
    }

    public final void ylkuphrtab(vipkmwdibw.wwaezpbzkn wwaezpbzknVar) {
        this.f5149eablkybsjg = wwaezpbzknVar;
    }

    public final boolean zdlpuopuiu() {
        return ((Boolean) this.f5148dxjokdxxww.getValue()).booleanValue();
    }
}
