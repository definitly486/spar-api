package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int zoijcleaow(ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk() - 1;
        int i14 = 0;
        while (i14 < iDraadjrbmk) {
            int i15 = ((iDraadjrbmk - i14) / 2) + i14;
            int iZoijcleaow = ((gxszxtbevo.iobyxmoadg) ppxfxbqfkfVar.f49169zdlpuopuiu[i15]).zoijcleaow();
            if (iZoijcleaow == i13) {
                return i15;
            }
            if (iZoijcleaow < i13) {
                i14 = i15 + 1;
                if (i13 < ((gxszxtbevo.iobyxmoadg) ppxfxbqfkfVar.f49169zdlpuopuiu[i14]).zoijcleaow()) {
                    return i15;
                }
            } else {
                iDraadjrbmk = i15 - 1;
            }
        }
        return i14;
    }
}
