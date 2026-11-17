package t7;

import android.graphics.Color;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg implements cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final lqeggnwhkg f109979iobyxmoadg = new lqeggnwhkg();

    private lqeggnwhkg() {
    }

    @Override // t7.cllcsxoeiz
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public Integer iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, float f13) {
        boolean z13 = ppxfxbqfkfVar.zdlpuopuiu() == u7.ppxfxbqfkf.zoijcleaow.BEGIN_ARRAY;
        if (z13) {
            ppxfxbqfkfVar.wkgbmnqykc();
        }
        double dAgtfadlqog = ppxfxbqfkfVar.agtfadlqog();
        double dAgtfadlqog2 = ppxfxbqfkfVar.agtfadlqog();
        double dAgtfadlqog3 = ppxfxbqfkfVar.agtfadlqog();
        double dAgtfadlqog4 = ppxfxbqfkfVar.zdlpuopuiu() == u7.ppxfxbqfkf.zoijcleaow.NUMBER ? ppxfxbqfkfVar.agtfadlqog() : 1.0d;
        if (z13) {
            ppxfxbqfkfVar.nufgyqmvbu();
        }
        if (dAgtfadlqog <= 1.0d && dAgtfadlqog2 <= 1.0d && dAgtfadlqog3 <= 1.0d) {
            dAgtfadlqog *= 255.0d;
            dAgtfadlqog2 *= 255.0d;
            dAgtfadlqog3 *= 255.0d;
            if (dAgtfadlqog4 <= 1.0d) {
                dAgtfadlqog4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dAgtfadlqog4, (int) dAgtfadlqog, (int) dAgtfadlqog2, (int) dAgtfadlqog3));
    }
}
