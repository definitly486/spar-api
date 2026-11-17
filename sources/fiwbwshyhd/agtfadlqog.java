package fiwbwshyhd;

import gg.zdlpuopuiu;
import w0.esjtqupxsv;
import w0.lereixgezr;

/* JADX INFO: loaded from: classes.dex */
final class agtfadlqog implements s.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f33955jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final tg.rgvfuqvkyq f33956yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final tg.draadjrbmk f33957zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f33958iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f33960yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        float f33961zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f33960yggfygwlhe = obj;
            this.f33958iwizpuwonk |= Integer.MIN_VALUE;
            return agtfadlqog.this.wizcaqwiak(0L, this);
        }
    }

    public agtfadlqog(tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar, boolean z13) {
        this.f33957zdlpuopuiu = draadjrbmkVar;
        this.f33956yggfygwlhe = rgvfuqvkyqVar;
        this.f33955jyumaefscl = z13;
    }

    @Override // s.iobyxmoadg
    public long E(long j13, int i13) {
        if (!this.f33955jyumaefscl) {
            return g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
        }
        if (s.eablkybsjg.wkgbmnqykc(i13, s.eablkybsjg.f105077iobyxmoadg.zoijcleaow())) {
            int i14 = (int) (j13 & 4294967295L);
            if (Float.intBitsToFloat(i14) < 0.0f) {
                float fFloatValue = ((Number) this.f33957zdlpuopuiu.invoke(Float.valueOf(Float.intBitsToFloat(i14)))).floatValue();
                return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fFloatValue))));
            }
        }
        return g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
    }

    @Override // s.iobyxmoadg
    public long grlcpdaxtj(long j13, long j14, int i13) {
        if (!this.f33955jyumaefscl) {
            return g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
        }
        if (s.eablkybsjg.wkgbmnqykc(i13, s.eablkybsjg.f105077iobyxmoadg.zoijcleaow())) {
            int i14 = (int) (j14 & 4294967295L);
            if (Float.intBitsToFloat(i14) > 0.0f) {
                return g.eablkybsjg.eablkybsjg((4294967295L & ((long) Float.floatToRawIntBits(((Number) this.f33957zdlpuopuiu.invoke(Float.valueOf(Float.intBitsToFloat(i14)))).floatValue()))) | (Float.floatToRawIntBits(0.0f) << 32));
            }
        }
        return g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // s.iobyxmoadg
    public Object wizcaqwiak(long j13, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        float f13;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f33958iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f33958iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objInvoke = iobyxmoadgVar.f33960yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f33958iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objInvoke);
            tg.rgvfuqvkyq rgvfuqvkyqVar = this.f33956yggfygwlhe;
            Float fPpxfxbqfkf = kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(esjtqupxsv.dxjokdxxww(j13));
            iobyxmoadgVar.f33961zdlpuopuiu = 0.0f;
            iobyxmoadgVar.f33958iwizpuwonk = 1;
            objInvoke = rgvfuqvkyqVar.invoke(fPpxfxbqfkf, iobyxmoadgVar);
            if (objInvoke == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            f13 = 0.0f;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f13 = iobyxmoadgVar.f33961zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(objInvoke);
        }
        return esjtqupxsv.zoijcleaow(lereixgezr.iobyxmoadg(f13, ((Number) objInvoke).floatValue()));
    }
}
