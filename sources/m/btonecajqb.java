package m;

import java.util.ArrayList;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float[] f64615iobyxmoadg = new float[64];

    public static /* synthetic */ ArrayList zoijcleaow(btonecajqb btonecajqbVar, String str, ArrayList arrayList, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            arrayList = new ArrayList();
        }
        return btonecajqbVar.iobyxmoadg(str, arrayList);
    }

    public final ArrayList iobyxmoadg(String str, ArrayList arrayList) {
        int i13;
        char cCharAt;
        int i14;
        int length = str.length();
        int i15 = 0;
        while (i15 < length && zdlpuopuiu.draadjrbmk(str.charAt(i15), 32) <= 0) {
            i15++;
        }
        while (length > i15 && zdlpuopuiu.draadjrbmk(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i16 = 0;
        while (i15 < length) {
            while (true) {
                i13 = i15 + 1;
                cCharAt = str.charAt(i15);
                int i17 = cCharAt | ' ';
                if ((i17 - 97) * (i17 - 122) <= 0 && i17 != 101) {
                    break;
                }
                if (i13 >= length) {
                    cCharAt = 0;
                    break;
                }
                i15 = i13;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i16 = 0;
                    while (true) {
                        if (i13 >= length || zdlpuopuiu.draadjrbmk(str.charAt(i13), 32) > 0) {
                            long jIobyxmoadg = zoijcleaow.iobyxmoadg(str, i13, length);
                            i14 = (int) (jIobyxmoadg >>> 32);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jIobyxmoadg & 4294967295L));
                            if (!Float.isNaN(fIntBitsToFloat)) {
                                float[] fArr = this.f64615iobyxmoadg;
                                int i18 = i16 + 1;
                                fArr[i16] = fIntBitsToFloat;
                                if (i18 >= fArr.length) {
                                    float[] fArr2 = new float[i18 * 2];
                                    this.f64615iobyxmoadg = fArr2;
                                    hg.agtfadlqog.gtknphoqwx(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i16 = i18;
                            }
                            while (i14 < length && str.charAt(i14) == ',') {
                                i14++;
                            }
                            if (i14 >= length || Float.isNaN(fIntBitsToFloat)) {
                                break;
                            }
                            i13 = i14;
                        } else {
                            i13++;
                        }
                    }
                    i13 = i14;
                }
                dxjokdxxww.iobyxmoadg(cCharAt, arrayList, this.f64615iobyxmoadg, i16);
            }
            i15 = i13;
        }
        return arrayList;
    }
}
