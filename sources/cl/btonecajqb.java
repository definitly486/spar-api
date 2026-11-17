package cl;

import bl.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btonecajqb {
    public static final int iobyxmoadg(int[] iArr, int i13, int i14, int i15) {
        zdlpuopuiu.btonecajqb(iArr, "<this>");
        int i16 = i15 - 1;
        while (i14 <= i16) {
            int i17 = (i14 + i16) >>> 1;
            int i18 = iArr[i17];
            if (i18 < i13) {
                i14 = i17 + 1;
            } else {
                if (i18 <= i13) {
                    return i17;
                }
                i16 = i17 - 1;
            }
        }
        return (-i14) - 1;
    }

    public static final int zoijcleaow(yadqdtsiqt yadqdtsiqtVar, int i13) {
        zdlpuopuiu.btonecajqb(yadqdtsiqtVar, "<this>");
        int iIobyxmoadg = iobyxmoadg(yadqdtsiqtVar.kegysxyocb(), i13 + 1, 0, yadqdtsiqtVar.tzroggbefp().length);
        return iIobyxmoadg >= 0 ? iIobyxmoadg : ~iIobyxmoadg;
    }
}
