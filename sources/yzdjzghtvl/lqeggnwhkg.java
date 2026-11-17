package yzdjzghtvl;

import androidx.collection.wwaezpbzkn;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wwaezpbzkn f126936iobyxmoadg;

    public lqeggnwhkg(long[] jArr) {
        wwaezpbzkn wwaezpbzknVar;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            wwaezpbzknVar = new wwaezpbzkn(jArrCopyOf.length);
            wwaezpbzknVar.eablkybsjg(wwaezpbzknVar.f4414zoijcleaow, jArrCopyOf);
        } else {
            wwaezpbzknVar = new wwaezpbzkn(0, 1, null);
        }
        this.f126936iobyxmoadg = wwaezpbzknVar;
    }

    public final void iobyxmoadg(long j13) {
        this.f126936iobyxmoadg.wkgbmnqykc(j13);
    }

    public final long[] zoijcleaow() {
        wwaezpbzkn wwaezpbzknVar = this.f126936iobyxmoadg;
        int i13 = wwaezpbzknVar.f4414zoijcleaow;
        if (i13 == 0) {
            return null;
        }
        long[] jArr = new long[i13];
        long[] jArr2 = wwaezpbzknVar.f4413iobyxmoadg;
        for (int i14 = 0; i14 < i13; i14++) {
            jArr[i14] = jArr2[i14];
        }
        return jArr;
    }
}
