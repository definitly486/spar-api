package jc;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f51082iobyxmoadg;

    public ppxfxbqfkf(int i13) {
        this.f51082iobyxmoadg = i13;
    }

    private static StackTraceElement[] ppxfxbqfkf(StackTraceElement[] stackTraceElementArr, int i13) {
        int i14;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i15 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i15];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null || !zoijcleaow(stackTraceElementArr, num.intValue(), i15)) {
                stackTraceElementArr2[i16] = stackTraceElementArr[i15];
                i16++;
                i17 = 1;
                i14 = i15;
            } else {
                int iIntValue = i15 - num.intValue();
                if (i17 < i13) {
                    System.arraycopy(stackTraceElementArr, i15, stackTraceElementArr2, i16, iIntValue);
                    i16 += iIntValue;
                    i17++;
                }
                i14 = (iIntValue - 1) + i15;
            }
            map.put(stackTraceElement, Integer.valueOf(i15));
            i15 = i14 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i16];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i16);
        return stackTraceElementArr3;
    }

    private static boolean zoijcleaow(StackTraceElement[] stackTraceElementArr, int i13, int i14) {
        int i15 = i14 - i13;
        if (i14 + i15 > stackTraceElementArr.length) {
            return false;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            if (!stackTraceElementArr[i13 + i16].equals(stackTraceElementArr[i14 + i16])) {
                return false;
            }
        }
        return true;
    }

    @Override // jc.wkgbmnqykc
    public StackTraceElement[] iobyxmoadg(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTraceElementArrPpxfxbqfkf = ppxfxbqfkf(stackTraceElementArr, this.f51082iobyxmoadg);
        return stackTraceElementArrPpxfxbqfkf.length < stackTraceElementArr.length ? stackTraceElementArrPpxfxbqfkf : stackTraceElementArr;
    }
}
