package h0;

import w0.agtfadlqog;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int ppxfxbqfkf(float[] fArr) {
        int i13 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i14 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i13 = 1;
        }
        return (i14 << 1) | i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wkgbmnqykc(long j13) {
        return !agtfadlqog.nufgyqmvbu(j13, agtfadlqog.f118237zoijcleaow.iobyxmoadg());
    }
}
