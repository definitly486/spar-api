package s;

import a.nufgyqmvbu;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import w0.esjtqupxsv;
import z.ageimvtcrz;
import z.fyldjkxazc;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements ageimvtcrz, s.iobyxmoadg {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private ppxfxbqfkf f105082hcddaimhww;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final Object f105083jpowsppfya;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private s.zoijcleaow f105084pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private s.iobyxmoadg f105085ylkuphrtab;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f105086cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f105088jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        long f105089yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        long f105090zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f105088jyumaefscl = obj;
            this.f105086cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.wypolnanlu(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: s.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C2550ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {
        C2550ppxfxbqfkf() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final cllcsxoeiz invoke() {
            return ppxfxbqfkf.this.I0();
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f105092iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f105094yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        long f105095zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f105094yggfygwlhe = obj;
            this.f105092iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.wizcaqwiak(0L, this);
        }
    }

    public ppxfxbqfkf(s.iobyxmoadg iobyxmoadgVar, s.zoijcleaow zoijcleaowVar) {
        this.f105085ylkuphrtab = iobyxmoadgVar;
        this.f105084pkzmftpjix = zoijcleaowVar == null ? new s.zoijcleaow() : zoijcleaowVar;
        this.f105083jpowsppfya = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cllcsxoeiz I0() {
        cllcsxoeiz cllcsxoeizVarNufgyqmvbu;
        if (nufgyqmvbu.f64wflxmlrfwp) {
            ppxfxbqfkf ppxfxbqfkfVarK0 = K0();
            cllcsxoeizVarNufgyqmvbu = ppxfxbqfkfVarK0 != null ? ppxfxbqfkfVarK0.I0() : null;
            if ((cllcsxoeizVarNufgyqmvbu == null || !dsvhmnatus.nufgyqmvbu(cllcsxoeizVarNufgyqmvbu)) && (cllcsxoeizVarNufgyqmvbu = this.f105084pkzmftpjix.nufgyqmvbu()) == null) {
                throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
            }
        } else {
            ppxfxbqfkf ppxfxbqfkfVarK1 = K0();
            if ((ppxfxbqfkfVarK1 == null || (cllcsxoeizVarNufgyqmvbu = ppxfxbqfkfVarK1.I0()) == null) && (cllcsxoeizVarNufgyqmvbu = this.f105084pkzmftpjix.nufgyqmvbu()) == null) {
                throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
            }
        }
        return cllcsxoeizVarNufgyqmvbu;
    }

    private final s.iobyxmoadg J0() {
        if (n0()) {
            return K0();
        }
        return null;
    }

    private final void L0() {
        if (this.f105084pkzmftpjix.gxszxtbevo() == this) {
            this.f105084pkzmftpjix.gtknphoqwx(null);
        }
    }

    private final void M0(s.zoijcleaow zoijcleaowVar) {
        L0();
        if (zoijcleaowVar == null) {
            this.f105084pkzmftpjix = new s.zoijcleaow();
        } else if (!zdlpuopuiu.eablkybsjg(zoijcleaowVar, this.f105084pkzmftpjix)) {
            this.f105084pkzmftpjix = zoijcleaowVar;
        }
        if (n0()) {
            N0();
        }
    }

    private final void N0() {
        this.f105084pkzmftpjix.gtknphoqwx(this);
        this.f105084pkzmftpjix.btonecajqb(null);
        this.f105082hcddaimhww = null;
        this.f105084pkzmftpjix.dxjokdxxww(new C2550ppxfxbqfkf());
        this.f105084pkzmftpjix.draadjrbmk(g0());
    }

    @Override // s.iobyxmoadg
    public long E(long j13, int i13) {
        s.iobyxmoadg iobyxmoadgVarJ0 = J0();
        long jE = iobyxmoadgVarJ0 != null ? iobyxmoadgVarJ0.E(j13, i13) : g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
        return g.eablkybsjg.vdvldrhtss(jE, this.f105085ylkuphrtab.E(g.eablkybsjg.rgvfuqvkyq(j13, jE), i13));
    }

    public final ppxfxbqfkf K0() {
        if (n0()) {
            return (ppxfxbqfkf) fyldjkxazc.zoijcleaow(this);
        }
        return null;
    }

    public final void O0(s.iobyxmoadg iobyxmoadgVar, s.zoijcleaow zoijcleaowVar) {
        this.f105085ylkuphrtab = iobyxmoadgVar;
        M0(zoijcleaowVar);
    }

    @Override // z.ageimvtcrz
    public Object dsvhmnatus() {
        return this.f105083jpowsppfya;
    }

    @Override // s.iobyxmoadg
    public long grlcpdaxtj(long j13, long j14, int i13) {
        long jGrlcpdaxtj = this.f105085ylkuphrtab.grlcpdaxtj(j13, j14, i13);
        s.iobyxmoadg iobyxmoadgVarJ0 = J0();
        return g.eablkybsjg.vdvldrhtss(jGrlcpdaxtj, iobyxmoadgVarJ0 != null ? iobyxmoadgVarJ0.grlcpdaxtj(g.eablkybsjg.vdvldrhtss(j13, jGrlcpdaxtj), g.eablkybsjg.rgvfuqvkyq(j14, jGrlcpdaxtj), i13) : g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf());
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void q0() {
        N0();
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void r0() {
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) wkgbmnqykc.zoijcleaow(this);
        this.f105082hcddaimhww = ppxfxbqfkfVar;
        this.f105084pkzmftpjix.btonecajqb(ppxfxbqfkfVar);
        L0();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // s.iobyxmoadg
    public Object wizcaqwiak(long j13, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        long jIobyxmoadg;
        long j14;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f105092iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f105092iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objWizcaqwiak = zoijcleaowVar.f105094yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f105092iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                j13 = zoijcleaowVar.f105095zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objWizcaqwiak);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j14 = zoijcleaowVar.f105095zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objWizcaqwiak);
            }
            return esjtqupxsv.zoijcleaow(esjtqupxsv.draadjrbmk(j14, ((esjtqupxsv) objWizcaqwiak).ojitshcjhn()));
        }
        gg.zdlpuopuiu.zoijcleaow(objWizcaqwiak);
        s.iobyxmoadg iobyxmoadgVarJ0 = J0();
        if (iobyxmoadgVarJ0 != null) {
            zoijcleaowVar.f105095zdlpuopuiu = j13;
            zoijcleaowVar.f105092iwizpuwonk = 1;
            objWizcaqwiak = iobyxmoadgVarJ0.wizcaqwiak(j13, zoijcleaowVar);
            if (objWizcaqwiak == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            jIobyxmoadg = esjtqupxsv.f118251zoijcleaow.iobyxmoadg();
        }
        long j15 = j13;
        j14 = jIobyxmoadg;
        s.iobyxmoadg iobyxmoadgVar = this.f105085ylkuphrtab;
        long jGtknphoqwx = esjtqupxsv.gtknphoqwx(j15, j14);
        zoijcleaowVar.f105095zdlpuopuiu = j14;
        zoijcleaowVar.f105092iwizpuwonk = 2;
        objWizcaqwiak = iobyxmoadgVar.wizcaqwiak(jGtknphoqwx, zoijcleaowVar);
        if (objWizcaqwiak == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return esjtqupxsv.zoijcleaow(esjtqupxsv.draadjrbmk(j14, ((esjtqupxsv) objWizcaqwiak).ojitshcjhn()));
        jIobyxmoadg = ((esjtqupxsv) objWizcaqwiak).ojitshcjhn();
        long j16 = j13;
        j14 = jIobyxmoadg;
        s.iobyxmoadg iobyxmoadgVar2 = this.f105085ylkuphrtab;
        long jGtknphoqwx2 = esjtqupxsv.gtknphoqwx(j16, j14);
        zoijcleaowVar.f105095zdlpuopuiu = j14;
        zoijcleaowVar.f105092iwizpuwonk = 2;
        objWizcaqwiak = iobyxmoadgVar2.wizcaqwiak(jGtknphoqwx2, zoijcleaowVar);
        if (objWizcaqwiak == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return esjtqupxsv.zoijcleaow(esjtqupxsv.draadjrbmk(j14, ((esjtqupxsv) objWizcaqwiak).ojitshcjhn()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // s.iobyxmoadg
    public Object wypolnanlu(long j13, long j14, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        long j15;
        long j16;
        long jOjitshcjhn;
        long jIobyxmoadg;
        long j17;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f105086cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f105086cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objWypolnanlu = iobyxmoadgVar.f105088jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f105086cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                long j18 = iobyxmoadgVar.f105089yggfygwlhe;
                long j19 = iobyxmoadgVar.f105090zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objWypolnanlu);
                j16 = j18;
                j15 = j19;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j17 = iobyxmoadgVar.f105090zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objWypolnanlu);
            }
            jIobyxmoadg = ((esjtqupxsv) objWypolnanlu).ojitshcjhn();
            jOjitshcjhn = j17;
            return esjtqupxsv.zoijcleaow(esjtqupxsv.draadjrbmk(jOjitshcjhn, jIobyxmoadg));
        }
        gg.zdlpuopuiu.zoijcleaow(objWypolnanlu);
        s.iobyxmoadg iobyxmoadgVar2 = this.f105085ylkuphrtab;
        j15 = j13;
        iobyxmoadgVar.f105090zdlpuopuiu = j15;
        j16 = j14;
        iobyxmoadgVar.f105089yggfygwlhe = j16;
        iobyxmoadgVar.f105086cqumvgiudr = 1;
        objWypolnanlu = iobyxmoadgVar2.wypolnanlu(j13, j14, iobyxmoadgVar);
        if (objWypolnanlu == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        jOjitshcjhn = ((esjtqupxsv) objWypolnanlu).ojitshcjhn();
        s.iobyxmoadg iobyxmoadgVarJ0 = n0() ? J0() : this.f105082hcddaimhww;
        if (iobyxmoadgVarJ0 != null) {
            long jDraadjrbmk = esjtqupxsv.draadjrbmk(j15, jOjitshcjhn);
            long jGtknphoqwx = esjtqupxsv.gtknphoqwx(j16, jOjitshcjhn);
            iobyxmoadgVar.f105090zdlpuopuiu = jOjitshcjhn;
            iobyxmoadgVar.f105086cqumvgiudr = 2;
            objWypolnanlu = iobyxmoadgVarJ0.wypolnanlu(jDraadjrbmk, jGtknphoqwx, iobyxmoadgVar);
            if (objWypolnanlu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            j17 = jOjitshcjhn;
            jIobyxmoadg = ((esjtqupxsv) objWypolnanlu).ojitshcjhn();
            jOjitshcjhn = j17;
        } else {
            jIobyxmoadg = esjtqupxsv.f118251zoijcleaow.iobyxmoadg();
        }
        return esjtqupxsv.zoijcleaow(esjtqupxsv.draadjrbmk(jOjitshcjhn, jIobyxmoadg));
    }
}
