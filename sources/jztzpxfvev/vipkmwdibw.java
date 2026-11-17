package jztzpxfvev;

import androidx.compose.foundation.gestures.GestureCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class vipkmwdibw implements ribwqtqdhb, w0.wkgbmnqykc {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final yj.iobyxmoadg f53011iwizpuwonk = yj.lqeggnwhkg.iobyxmoadg(false);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f53012jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f53013yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final /* synthetic */ w0.wkgbmnqykc f53014zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f53015jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f53017zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53017zdlpuopuiu = obj;
            this.f53015jyumaefscl |= Integer.MIN_VALUE;
            return vipkmwdibw.this.P(this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f53018jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f53020zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53020zdlpuopuiu = obj;
            this.f53018jyumaefscl |= Integer.MIN_VALUE;
            return vipkmwdibw.this.U(this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f53021jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f53023zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53023zdlpuopuiu = obj;
            this.f53021jyumaefscl |= Integer.MIN_VALUE;
            return vipkmwdibw.this.gtknphoqwx(this);
        }
    }

    public vipkmwdibw(w0.wkgbmnqykc wkgbmnqykcVar) {
        this.f53014zdlpuopuiu = wkgbmnqykcVar;
    }

    @Override // w0.wkgbmnqykc
    public float A(float f13) {
        return this.f53014zdlpuopuiu.A(f13);
    }

    @Override // w0.draadjrbmk
    public float F() {
        return this.f53014zdlpuopuiu.F();
    }

    @Override // w0.wkgbmnqykc
    public float I(float f13) {
        return this.f53014zdlpuopuiu.I(f13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jztzpxfvev.ribwqtqdhb
    public Object P(lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f53015jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f53015jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objU = iobyxmoadgVar.f53017zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f53015jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objU);
            iobyxmoadgVar.f53015jyumaefscl = 1;
            objU = U(iobyxmoadgVar);
            if (objU == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objU);
        }
        if (((Boolean) objU).booleanValue()) {
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        throw new GestureCancellationException("The press gesture was canceled.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jztzpxfvev.ribwqtqdhb
    public Object U(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f53018jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f53018jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f53020zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f53018jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!this.f53013yggfygwlhe && !this.f53012jyumaefscl) {
                yj.iobyxmoadg iobyxmoadgVar = this.f53011iwizpuwonk;
                ppxfxbqfkfVar.f53018jyumaefscl = 1;
                if (yj.iobyxmoadg.C3196iobyxmoadg.iobyxmoadg(iobyxmoadgVar, null, ppxfxbqfkfVar, 1, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f53013yggfygwlhe);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        yj.iobyxmoadg.C3196iobyxmoadg.ppxfxbqfkf(this.f53011iwizpuwonk, null, 1, null);
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f53013yggfygwlhe);
    }

    @Override // w0.wkgbmnqykc
    public long V(long j13) {
        return this.f53014zdlpuopuiu.V(j13);
    }

    @Override // w0.wkgbmnqykc
    public float getDensity() {
        return this.f53014zdlpuopuiu.getDensity();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f53021jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f53021jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f53023zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f53021jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            yj.iobyxmoadg iobyxmoadgVar = this.f53011iwizpuwonk;
            zoijcleaowVar.f53021jyumaefscl = 1;
            if (yj.iobyxmoadg.C3196iobyxmoadg.iobyxmoadg(iobyxmoadgVar, null, zoijcleaowVar, 1, null) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        this.f53013yggfygwlhe = false;
        this.f53012jyumaefscl = false;
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void gxszxtbevo() {
        this.f53012jyumaefscl = true;
        if (this.f53011iwizpuwonk.wkgbmnqykc()) {
            yj.iobyxmoadg.C3196iobyxmoadg.ppxfxbqfkf(this.f53011iwizpuwonk, null, 1, null);
        }
    }

    @Override // w0.wkgbmnqykc
    public int hszhottldk(float f13) {
        return this.f53014zdlpuopuiu.hszhottldk(f13);
    }

    public final void lqeggnwhkg() {
        this.f53013yggfygwlhe = true;
        if (this.f53011iwizpuwonk.wkgbmnqykc()) {
            yj.iobyxmoadg.C3196iobyxmoadg.ppxfxbqfkf(this.f53011iwizpuwonk, null, 1, null);
        }
    }

    @Override // w0.wkgbmnqykc
    public long mbcevpiqjq(long j13) {
        return this.f53014zdlpuopuiu.mbcevpiqjq(j13);
    }

    @Override // w0.wkgbmnqykc
    public float mhtqkkgtqm(long j13) {
        return this.f53014zdlpuopuiu.mhtqkkgtqm(j13);
    }

    @Override // w0.draadjrbmk
    public long tzroggbefp(float f13) {
        return this.f53014zdlpuopuiu.tzroggbefp(f13);
    }

    @Override // w0.wkgbmnqykc
    public long uwvvkdfqfp(float f13) {
        return this.f53014zdlpuopuiu.uwvvkdfqfp(f13);
    }

    @Override // w0.draadjrbmk
    public float vipkmwdibw(long j13) {
        return this.f53014zdlpuopuiu.vipkmwdibw(j13);
    }

    @Override // w0.wkgbmnqykc
    public float x(int i13) {
        return this.f53014zdlpuopuiu.x(i13);
    }
}
