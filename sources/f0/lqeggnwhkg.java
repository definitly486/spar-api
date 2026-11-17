package f0;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f32502iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private float f32503ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rgvfuqvkyq f32504zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f32505jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f32507zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f32507zdlpuopuiu = obj;
            this.f32505jyumaefscl |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.eablkybsjg(0.0f, this);
        }
    }

    public lqeggnwhkg(int i13, rgvfuqvkyq rgvfuqvkyqVar) {
        this.f32502iobyxmoadg = i13;
        this.f32504zoijcleaow = rgvfuqvkyqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(float f13, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f32505jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f32505jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objInvoke = iobyxmoadgVar.f32507zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f32505jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objInvoke);
            rgvfuqvkyq rgvfuqvkyqVar = this.f32504zoijcleaow;
            Float fPpxfxbqfkf = kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(f13);
            iobyxmoadgVar.f32505jyumaefscl = 1;
            objInvoke = rgvfuqvkyqVar.invoke(fPpxfxbqfkf, iobyxmoadgVar);
            if (objInvoke == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(objInvoke);
        }
        this.f32503ppxfxbqfkf += ((Number) objInvoke).floatValue();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Object gxszxtbevo(int i13, int i14, lg.gxszxtbevo gxszxtbevoVar) {
        if (i13 > i14) {
            throw new IllegalArgumentException(("Expected min=" + i13 + " ≤ max=" + i14).toString());
        }
        int i15 = i14 - i13;
        int i16 = this.f32502iobyxmoadg;
        if (i15 > i16) {
            throw new IllegalArgumentException(("Expected range (" + i15 + ") to be ≤ viewportSize=" + this.f32502iobyxmoadg).toString());
        }
        float f13 = i13;
        float f14 = this.f32503ppxfxbqfkf;
        if (f13 >= f14 && i14 <= i16 + f14) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (f13 >= f14) {
            i13 = i14 - i16;
        }
        Object objLqeggnwhkg = lqeggnwhkg(i13, gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Object lqeggnwhkg(float f13, lg.gxszxtbevo gxszxtbevoVar) {
        Object objEablkybsjg = eablkybsjg(f13 - this.f32503ppxfxbqfkf, gxszxtbevoVar);
        return objEablkybsjg == mg.zoijcleaow.gxszxtbevo() ? objEablkybsjg : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final int ppxfxbqfkf(int i13) {
        return zg.gtknphoqwx.agtfadlqog(i13 - vg.iobyxmoadg.wkgbmnqykc(this.f32503ppxfxbqfkf), 0, this.f32502iobyxmoadg);
    }

    public final void wkgbmnqykc() {
        this.f32503ppxfxbqfkf = 0.0f;
    }

    public final float zoijcleaow() {
        return this.f32503ppxfxbqfkf;
    }
}
