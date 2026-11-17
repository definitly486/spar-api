package ageimvtcrz;

import androidx.collection.jpowsppfya;
import gg.wwaezpbzkn;
import h.opjhrmiecq;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;
import w0.kcexrzcfyt;
import z.cdpycssgdh;
import z.yggfygwlhe;
import z.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.nufgyqmvbu, zdlpuopuiu, cdpycssgdh {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final boolean f1823cllcsxoeiz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private wflxmlrfwp f1824dsvhmnatus;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final float f1825hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final tg.iobyxmoadg f1826hkdspvbjdz;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final opjhrmiecq f1827jpowsppfya;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private boolean f1828kegysxyocb;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final boolean f1829pkzmftpjix;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private long f1830stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private final jpowsppfya f1831tzroggbefp;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private float f1832wypolnanlu;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final metgxyhuhe.btonecajqb f1833ylkuphrtab;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f1835yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f1836zdlpuopuiu;

        /* JADX INFO: renamed from: ageimvtcrz.gtknphoqwx$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0039iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ cllcsxoeiz f1837yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ gtknphoqwx f1838zdlpuopuiu;

            C0039iobyxmoadg(gtknphoqwx gtknphoqwxVar, cllcsxoeiz cllcsxoeizVar) {
                this.f1838zdlpuopuiu = gtknphoqwxVar;
                this.f1837yggfygwlhe = cllcsxoeizVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(metgxyhuhe.dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
                if (!(dxjokdxxwwVar instanceof metgxyhuhe.agtfadlqog)) {
                    this.f1838zdlpuopuiu.V0(dxjokdxxwwVar, this.f1837yggfygwlhe);
                } else if (this.f1838zdlpuopuiu.f1828kegysxyocb) {
                    this.f1838zdlpuopuiu.T0((metgxyhuhe.agtfadlqog) dxjokdxxwwVar);
                } else {
                    this.f1838zdlpuopuiu.f1831tzroggbefp.agtfadlqog(dxjokdxxwwVar);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = gtknphoqwx.this.new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f1835yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f1836zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f1835yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = gtknphoqwx.this.f1833ylkuphrtab.ppxfxbqfkf();
                C0039iobyxmoadg c0039iobyxmoadg = new C0039iobyxmoadg(gtknphoqwx.this, cllcsxoeizVar);
                this.f1836zdlpuopuiu = 1;
                if (lqeggnwhkgVarPpxfxbqfkf.collect(c0039iobyxmoadg, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ gtknphoqwx(metgxyhuhe.btonecajqb btonecajqbVar, boolean z13, float f13, opjhrmiecq opjhrmiecqVar, tg.iobyxmoadg iobyxmoadgVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(btonecajqbVar, z13, f13, opjhrmiecqVar, iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0(metgxyhuhe.agtfadlqog agtfadlqogVar) {
        if (agtfadlqogVar instanceof metgxyhuhe.agtfadlqog.zoijcleaow) {
            M0((metgxyhuhe.agtfadlqog.zoijcleaow) agtfadlqogVar, this.f1830stevsuqkhv, this.f1832wypolnanlu);
        } else if (agtfadlqogVar instanceof metgxyhuhe.agtfadlqog.ppxfxbqfkf) {
            U0(((metgxyhuhe.agtfadlqog.ppxfxbqfkf) agtfadlqogVar).iobyxmoadg());
        } else if (agtfadlqogVar instanceof metgxyhuhe.agtfadlqog.iobyxmoadg) {
            U0(((metgxyhuhe.agtfadlqog.iobyxmoadg) agtfadlqogVar).iobyxmoadg());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0(metgxyhuhe.dxjokdxxww dxjokdxxwwVar, cllcsxoeiz cllcsxoeizVar) {
        wflxmlrfwp wflxmlrfwpVar = this.f1824dsvhmnatus;
        if (wflxmlrfwpVar == null) {
            wflxmlrfwpVar = new wflxmlrfwp(this.f1829pkzmftpjix, this.f1826hkdspvbjdz);
            yggfygwlhe.iobyxmoadg(this);
            this.f1824dsvhmnatus = wflxmlrfwpVar;
        }
        wflxmlrfwpVar.ppxfxbqfkf(dxjokdxxwwVar, cllcsxoeizVar);
    }

    public abstract void M0(metgxyhuhe.agtfadlqog.zoijcleaow zoijcleaowVar, long j13, float f13);

    public abstract void N0(j.gxszxtbevo gxszxtbevoVar);

    protected final boolean O0() {
        return this.f1829pkzmftpjix;
    }

    protected final tg.iobyxmoadg P0() {
        return this.f1826hkdspvbjdz;
    }

    public final long Q0() {
        return this.f1827jpowsppfya.iobyxmoadg();
    }

    protected final long R0() {
        return this.f1830stevsuqkhv;
    }

    protected final float S0() {
        return this.f1832wypolnanlu;
    }

    public abstract void U0(metgxyhuhe.agtfadlqog.zoijcleaow zoijcleaowVar);

    @Override // z.zdlpuopuiu
    public void gtknphoqwx(j.ppxfxbqfkf ppxfxbqfkfVar) throws Throwable {
        ppxfxbqfkfVar.b0();
        wflxmlrfwp wflxmlrfwpVar = this.f1824dsvhmnatus;
        if (wflxmlrfwpVar != null) {
            wflxmlrfwpVar.zoijcleaow(ppxfxbqfkfVar, this.f1832wypolnanlu, Q0());
        }
        N0(ppxfxbqfkfVar);
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public final boolean l0() {
        return this.f1823cllcsxoeiz;
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void q0() {
        pj.gtknphoqwx.wkgbmnqykc(g0(), null, null, new iobyxmoadg(null), 3, null);
    }

    @Override // z.cdpycssgdh
    public void stevsuqkhv(long j13) {
        this.f1828kegysxyocb = true;
        w0.wkgbmnqykc wkgbmnqykcVarDraadjrbmk = z.gtknphoqwx.draadjrbmk(this);
        this.f1830stevsuqkhv = kcexrzcfyt.wkgbmnqykc(j13);
        this.f1832wypolnanlu = Float.isNaN(this.f1825hcddaimhww) ? wkgbmnqykc.iobyxmoadg(wkgbmnqykcVarDraadjrbmk, this.f1829pkzmftpjix, this.f1830stevsuqkhv) : wkgbmnqykcVarDraadjrbmk.I(this.f1825hcddaimhww);
        jpowsppfya jpowsppfyaVar = this.f1831tzroggbefp;
        Object[] objArr = jpowsppfyaVar.f4343iobyxmoadg;
        int i13 = jpowsppfyaVar.f4344zoijcleaow;
        for (int i14 = 0; i14 < i13; i14++) {
            T0((metgxyhuhe.agtfadlqog) objArr[i14]);
        }
        this.f1831tzroggbefp.yggfygwlhe();
    }

    private gtknphoqwx(metgxyhuhe.btonecajqb btonecajqbVar, boolean z13, float f13, opjhrmiecq opjhrmiecqVar, tg.iobyxmoadg iobyxmoadgVar) {
        this.f1833ylkuphrtab = btonecajqbVar;
        this.f1829pkzmftpjix = z13;
        this.f1825hcddaimhww = f13;
        this.f1827jpowsppfya = opjhrmiecqVar;
        this.f1826hkdspvbjdz = iobyxmoadgVar;
        this.f1830stevsuqkhv = g.gtknphoqwx.f35588zoijcleaow.zoijcleaow();
        this.f1831tzroggbefp = new jpowsppfya(0, 1, null);
    }
}
