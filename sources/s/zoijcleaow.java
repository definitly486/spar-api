package s;

import gg.zdlpuopuiu;
import kotlin.jvm.internal.jyumaefscl;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import w0.esjtqupxsv;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private s.ppxfxbqfkf f105097iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private tg.iobyxmoadg f105098ppxfxbqfkf = new iobyxmoadg();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private cllcsxoeiz f105099wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private s.ppxfxbqfkf f105100zoijcleaow;

    static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {
        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final cllcsxoeiz invoke() {
            return zoijcleaow.this.nufgyqmvbu();
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f105102jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f105104zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f105104zdlpuopuiu = obj;
            this.f105102jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.ppxfxbqfkf(0L, this);
        }
    }

    /* JADX INFO: renamed from: s.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C2551zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f105105jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f105107zdlpuopuiu;

        C2551zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f105107zdlpuopuiu = obj;
            this.f105105jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(0L, 0L, this);
        }
    }

    public final void btonecajqb(s.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f105100zoijcleaow = ppxfxbqfkfVar;
    }

    public final void draadjrbmk(cllcsxoeiz cllcsxoeizVar) {
        this.f105099wkgbmnqykc = cllcsxoeizVar;
    }

    public final void dxjokdxxww(tg.iobyxmoadg iobyxmoadgVar) {
        this.f105098ppxfxbqfkf = iobyxmoadgVar;
    }

    public final cllcsxoeiz eablkybsjg() {
        cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f105098ppxfxbqfkf.invoke();
        if (cllcsxoeizVar != null) {
            return cllcsxoeizVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final void gtknphoqwx(s.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f105097iobyxmoadg = ppxfxbqfkfVar;
    }

    public final s.ppxfxbqfkf gxszxtbevo() {
        return this.f105097iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object iobyxmoadg(long j13, long j14, gxszxtbevo gxszxtbevoVar) {
        C2551zoijcleaow c2551zoijcleaow;
        long jIobyxmoadg;
        if (gxszxtbevoVar instanceof C2551zoijcleaow) {
            c2551zoijcleaow = (C2551zoijcleaow) gxszxtbevoVar;
            int i13 = c2551zoijcleaow.f105105jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2551zoijcleaow.f105105jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2551zoijcleaow = new C2551zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c2551zoijcleaow = new C2551zoijcleaow(gxszxtbevoVar);
        }
        C2551zoijcleaow c2551zoijcleaow2 = c2551zoijcleaow;
        Object objWypolnanlu = c2551zoijcleaow2.f105107zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2551zoijcleaow2.f105105jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objWypolnanlu);
            if (lqeggnwhkg() == null) {
                s.ppxfxbqfkf ppxfxbqfkfVar = this.f105100zoijcleaow;
                if (ppxfxbqfkfVar != null) {
                    c2551zoijcleaow2.f105105jyumaefscl = 1;
                    objWypolnanlu = ppxfxbqfkfVar.wypolnanlu(j13, j14, c2551zoijcleaow2);
                    if (objWypolnanlu == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    jIobyxmoadg = ((esjtqupxsv) objWypolnanlu).ojitshcjhn();
                } else {
                    jIobyxmoadg = esjtqupxsv.f118251zoijcleaow.iobyxmoadg();
                }
            } else {
                s.iobyxmoadg iobyxmoadgVarLqeggnwhkg = lqeggnwhkg();
                if (iobyxmoadgVarLqeggnwhkg != null) {
                    c2551zoijcleaow2.f105105jyumaefscl = 2;
                    objWypolnanlu = iobyxmoadgVarLqeggnwhkg.wypolnanlu(j13, j14, c2551zoijcleaow2);
                    if (objWypolnanlu == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    jIobyxmoadg = ((esjtqupxsv) objWypolnanlu).ojitshcjhn();
                } else {
                    jIobyxmoadg = esjtqupxsv.f118251zoijcleaow.iobyxmoadg();
                }
            }
        } else if (i14 == 1) {
            zdlpuopuiu.zoijcleaow(objWypolnanlu);
            jIobyxmoadg = ((esjtqupxsv) objWypolnanlu).ojitshcjhn();
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(objWypolnanlu);
            jIobyxmoadg = ((esjtqupxsv) objWypolnanlu).ojitshcjhn();
        }
        return esjtqupxsv.zoijcleaow(jIobyxmoadg);
    }

    public final s.iobyxmoadg lqeggnwhkg() {
        s.ppxfxbqfkf ppxfxbqfkfVar = this.f105097iobyxmoadg;
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar.K0();
        }
        return null;
    }

    public final cllcsxoeiz nufgyqmvbu() {
        return this.f105099wkgbmnqykc;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ppxfxbqfkf(long j13, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        long jIobyxmoadg;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f105102jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f105102jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objWizcaqwiak = ppxfxbqfkfVar.f105104zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f105102jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objWizcaqwiak);
            s.iobyxmoadg iobyxmoadgVarLqeggnwhkg = lqeggnwhkg();
            if (iobyxmoadgVarLqeggnwhkg != null) {
                ppxfxbqfkfVar.f105102jyumaefscl = 1;
                objWizcaqwiak = iobyxmoadgVarLqeggnwhkg.wizcaqwiak(j13, ppxfxbqfkfVar);
                if (objWizcaqwiak == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                jIobyxmoadg = esjtqupxsv.f118251zoijcleaow.iobyxmoadg();
            }
            return esjtqupxsv.zoijcleaow(jIobyxmoadg);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zdlpuopuiu.zoijcleaow(objWizcaqwiak);
        jIobyxmoadg = ((esjtqupxsv) objWizcaqwiak).ojitshcjhn();
        return esjtqupxsv.zoijcleaow(jIobyxmoadg);
    }

    public final long wkgbmnqykc(long j13, int i13) {
        s.iobyxmoadg iobyxmoadgVarLqeggnwhkg = lqeggnwhkg();
        return iobyxmoadgVarLqeggnwhkg != null ? iobyxmoadgVarLqeggnwhkg.E(j13, i13) : g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
    }

    public final long zoijcleaow(long j13, long j14, int i13) {
        s.iobyxmoadg iobyxmoadgVarLqeggnwhkg = lqeggnwhkg();
        return iobyxmoadgVarLqeggnwhkg != null ? iobyxmoadgVarLqeggnwhkg.grlcpdaxtj(j13, j14, i13) : g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
    }
}
