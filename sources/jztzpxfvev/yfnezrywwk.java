package jztzpxfvev;

/* JADX INFO: loaded from: classes.dex */
public final class yfnezrywwk implements s.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f53081yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final jztzpxfvev f53082zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f53083iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f53085yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        long f53086zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53085yggfygwlhe = obj;
            this.f53083iwizpuwonk |= Integer.MIN_VALUE;
            return yfnezrywwk.this.wypolnanlu(0L, 0L, this);
        }
    }

    public yfnezrywwk(jztzpxfvev jztzpxfvevVar, boolean z13) {
        this.f53082zdlpuopuiu = jztzpxfvevVar;
        this.f53081yggfygwlhe = z13;
    }

    @Override // s.iobyxmoadg
    public long grlcpdaxtj(long j13, long j14, int i13) {
        return this.f53081yggfygwlhe ? this.f53082zdlpuopuiu.zoijcleaow(j14) : g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
    }

    public final void iobyxmoadg(boolean z13) {
        this.f53081yggfygwlhe = z13;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // s.iobyxmoadg
    public Object wypolnanlu(long j13, long j14, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        long jIobyxmoadg;
        long jIobyxmoadg2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f53083iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f53083iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar.f53085yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f53083iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            if (this.f53081yggfygwlhe) {
                if (this.f53082zdlpuopuiu.iobyxmoadg()) {
                    jIobyxmoadg2 = w0.esjtqupxsv.f118251zoijcleaow.iobyxmoadg();
                } else {
                    jztzpxfvev jztzpxfvevVar = this.f53082zdlpuopuiu;
                    iobyxmoadgVar.f53086zdlpuopuiu = j14;
                    iobyxmoadgVar.f53083iwizpuwonk = 1;
                    objPpxfxbqfkf = jztzpxfvevVar.ppxfxbqfkf(j14, iobyxmoadgVar);
                    if (objPpxfxbqfkf == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                jIobyxmoadg = w0.esjtqupxsv.gtknphoqwx(j14, jIobyxmoadg2);
            } else {
                jIobyxmoadg = w0.esjtqupxsv.f118251zoijcleaow.iobyxmoadg();
            }
            return w0.esjtqupxsv.zoijcleaow(jIobyxmoadg);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j14 = iobyxmoadgVar.f53086zdlpuopuiu;
        gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        jIobyxmoadg2 = ((w0.esjtqupxsv) objPpxfxbqfkf).ojitshcjhn();
        jIobyxmoadg = w0.esjtqupxsv.gtknphoqwx(j14, jIobyxmoadg2);
        return w0.esjtqupxsv.zoijcleaow(jIobyxmoadg);
    }
}
