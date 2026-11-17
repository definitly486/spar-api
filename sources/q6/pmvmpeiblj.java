package q6;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pmvmpeiblj {
    public static final int[] iobyxmoadg(NetworkRequest networkRequest) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return esjtqupxsv.f77928iobyxmoadg.iobyxmoadg(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 29; i13++) {
            int i14 = iArr[i13];
            if (jyumaefscl.f77946iobyxmoadg.ppxfxbqfkf(networkRequest, i14)) {
                arrayList.add(Integer.valueOf(i14));
            }
        }
        return hg.jyumaefscl.l(arrayList);
    }

    public static final int[] zoijcleaow(NetworkRequest networkRequest) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return esjtqupxsv.f77928iobyxmoadg.zoijcleaow(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 9; i13++) {
            int i14 = iArr[i13];
            if (jyumaefscl.f77946iobyxmoadg.wkgbmnqykc(networkRequest, i14)) {
                arrayList.add(Integer.valueOf(i14));
            }
        }
        return hg.jyumaefscl.l(arrayList);
    }
}
