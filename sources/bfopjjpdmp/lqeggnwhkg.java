package bfopjjpdmp;

import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final gxszxtbevo f16089iobyxmoadg = iobyxmoadg(50);

    public static /* synthetic */ gxszxtbevo eablkybsjg(float f13, float f14, float f15, float f16, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = nufgyqmvbu.lqeggnwhkg(0);
        }
        if ((i13 & 2) != 0) {
            f14 = nufgyqmvbu.lqeggnwhkg(0);
        }
        if ((i13 & 4) != 0) {
            f15 = nufgyqmvbu.lqeggnwhkg(0);
        }
        if ((i13 & 8) != 0) {
            f16 = nufgyqmvbu.lqeggnwhkg(0);
        }
        return wkgbmnqykc(f13, f14, f15, f16);
    }

    public static final gxszxtbevo gxszxtbevo() {
        return f16089iobyxmoadg;
    }

    public static final gxszxtbevo iobyxmoadg(int i13) {
        return zoijcleaow(ppxfxbqfkf.iobyxmoadg(i13));
    }

    public static final gxszxtbevo ppxfxbqfkf(float f13) {
        return zoijcleaow(ppxfxbqfkf.zoijcleaow(f13));
    }

    public static final gxszxtbevo wkgbmnqykc(float f13, float f14, float f15, float f16) {
        return new gxszxtbevo(ppxfxbqfkf.zoijcleaow(f13), ppxfxbqfkf.zoijcleaow(f14), ppxfxbqfkf.zoijcleaow(f15), ppxfxbqfkf.zoijcleaow(f16));
    }

    public static final gxszxtbevo zoijcleaow(zoijcleaow zoijcleaowVar) {
        return new gxszxtbevo(zoijcleaowVar, zoijcleaowVar, zoijcleaowVar, zoijcleaowVar);
    }
}
