package igdgnonuha;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j4 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final j4 f43151iobyxmoadg = new j4();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final vipkmwdibw.czzsidtyhn f43153zoijcleaow = new vipkmwdibw.czzsidtyhn(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final float f43152ppxfxbqfkf = w0.nufgyqmvbu.lqeggnwhkg(125);

    private j4() {
    }

    public static /* synthetic */ g2 wkgbmnqykc(j4 j4Var, Set set, float f13, float f14, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = 10.0f;
        }
        if ((i13 & 4) != 0) {
            f14 = 10.0f;
        }
        return j4Var.ppxfxbqfkf(set, f13, f14);
    }

    public final vipkmwdibw.czzsidtyhn iobyxmoadg() {
        return f43153zoijcleaow;
    }

    public final g2 ppxfxbqfkf(Set set, float f13, float f14) {
        if (set.size() <= 1) {
            return null;
        }
        Set set2 = set;
        Float fFiwbwshyhd = hg.jyumaefscl.fiwbwshyhd(set2);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fFiwbwshyhd);
        float fFloatValue = fFiwbwshyhd.floatValue();
        Float fFyldjkxazc = hg.jyumaefscl.fyldjkxazc(set2);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fFyldjkxazc);
        return new g2(fFloatValue - fFyldjkxazc.floatValue(), f13, f14);
    }

    public final float zoijcleaow() {
        return f43152ppxfxbqfkf;
    }
}
