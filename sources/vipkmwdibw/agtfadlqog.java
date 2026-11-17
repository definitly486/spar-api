package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public abstract class agtfadlqog {
    public static final kcexrzcfyt dxjokdxxww(ezmngbhpjk ezmngbhpjkVar, Object obj) {
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) ezmngbhpjkVar.iobyxmoadg().invoke(obj);
        kcexrzcfytVar.wkgbmnqykc();
        return kcexrzcfytVar;
    }

    public static final wflxmlrfwp eablkybsjg(wflxmlrfwp wflxmlrfwpVar, float f13, float f14, long j13, long j14, boolean z13) {
        return new wflxmlrfwp(wflxmlrfwpVar.draadjrbmk(), Float.valueOf(f13), zdlpuopuiu.iobyxmoadg(f14), j13, j14, z13);
    }

    public static final wflxmlrfwp gxszxtbevo(wflxmlrfwp wflxmlrfwpVar, Object obj, kcexrzcfyt kcexrzcfytVar, long j13, long j14, boolean z13) {
        return new wflxmlrfwp(wflxmlrfwpVar.draadjrbmk(), obj, kcexrzcfytVar, j13, j14, z13);
    }

    public static final wflxmlrfwp iobyxmoadg(float f13, float f14, long j13, long j14, boolean z13) {
        return new wflxmlrfwp(p.dsvhmnatus(kotlin.jvm.internal.wflxmlrfwp.f60035iobyxmoadg), Float.valueOf(f13), zdlpuopuiu.iobyxmoadg(f14), j13, j14, z13);
    }

    public static /* synthetic */ wflxmlrfwp lqeggnwhkg(wflxmlrfwp wflxmlrfwpVar, float f13, float f14, long j13, long j14, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = ((Number) wflxmlrfwpVar.getValue()).floatValue();
        }
        if ((i13 & 2) != 0) {
            f14 = ((ojitshcjhn) wflxmlrfwpVar.ojitshcjhn()).gxszxtbevo();
        }
        float f15 = f14;
        if ((i13 & 4) != 0) {
            j13 = wflxmlrfwpVar.wkgbmnqykc();
        }
        long j15 = j13;
        if ((i13 & 8) != 0) {
            j14 = wflxmlrfwpVar.iobyxmoadg();
        }
        long j16 = j14;
        if ((i13 & 16) != 0) {
            z13 = wflxmlrfwpVar.rgvfuqvkyq();
        }
        return eablkybsjg(wflxmlrfwpVar, f13, f15, j15, j16, z13);
    }

    public static /* synthetic */ wflxmlrfwp nufgyqmvbu(wflxmlrfwp wflxmlrfwpVar, Object obj, kcexrzcfyt kcexrzcfytVar, long j13, long j14, boolean z13, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = wflxmlrfwpVar.getValue();
        }
        if ((i13 & 2) != 0) {
            kcexrzcfytVar = zdlpuopuiu.eablkybsjg(wflxmlrfwpVar.ojitshcjhn());
        }
        kcexrzcfyt kcexrzcfytVar2 = kcexrzcfytVar;
        if ((i13 & 4) != 0) {
            j13 = wflxmlrfwpVar.wkgbmnqykc();
        }
        long j15 = j13;
        if ((i13 & 8) != 0) {
            j14 = wflxmlrfwpVar.iobyxmoadg();
        }
        long j16 = j14;
        if ((i13 & 16) != 0) {
            z13 = wflxmlrfwpVar.rgvfuqvkyq();
        }
        return gxszxtbevo(wflxmlrfwpVar, obj, kcexrzcfytVar2, j15, j16, z13);
    }

    public static /* synthetic */ wflxmlrfwp ppxfxbqfkf(float f13, float f14, long j13, long j14, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f14 = 0.0f;
        }
        long j15 = (i13 & 4) != 0 ? Long.MIN_VALUE : j13;
        long j16 = (i13 & 8) == 0 ? j14 : Long.MIN_VALUE;
        if ((i13 & 16) != 0) {
            z13 = false;
        }
        return iobyxmoadg(f13, f14, j15, j16, z13);
    }

    public static final wflxmlrfwp zoijcleaow(ezmngbhpjk ezmngbhpjkVar, Object obj, Object obj2, long j13, long j14, boolean z13) {
        return new wflxmlrfwp(ezmngbhpjkVar, obj, (kcexrzcfyt) ezmngbhpjkVar.iobyxmoadg().invoke(obj2), j13, j14, z13);
    }
}
