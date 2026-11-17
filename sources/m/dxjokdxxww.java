package m;

import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class dxjokdxxww {
    public static final void iobyxmoadg(char c13, ArrayList arrayList, float[] fArr, int i13) {
        int i14 = 0;
        switch (c13) {
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                int i15 = i13 - 7;
                for (int i16 = 0; i16 <= i15; i16 += 7) {
                    arrayList.add(new nufgyqmvbu.iobyxmoadg(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], Float.compare(fArr[i16 + 3], 0.0f) != 0, Float.compare(fArr[i16 + 4], 0.0f) != 0, fArr[i16 + 5], fArr[i16 + 6]));
                }
                return;
            case 'C':
                int i17 = i13 - 6;
                while (i14 <= i17) {
                    arrayList.add(new nufgyqmvbu.ppxfxbqfkf(fArr[i14], fArr[i14 + 1], fArr[i14 + 2], fArr[i14 + 3], fArr[i14 + 4], fArr[i14 + 5]));
                    i14 += 6;
                }
                return;
            case 'H':
                int i18 = i13 - 1;
                while (i14 <= i18) {
                    arrayList.add(new nufgyqmvbu.wkgbmnqykc(fArr[i14]));
                    i14++;
                }
                return;
            case 'L':
                int i19 = i13 - 2;
                while (i14 <= i19) {
                    arrayList.add(new nufgyqmvbu.eablkybsjg(fArr[i14], fArr[i14 + 1]));
                    i14 += 2;
                }
                return;
            case 'M':
                zoijcleaow(arrayList, fArr, i13);
                return;
            case 'Q':
                int i23 = i13 - 4;
                while (i14 <= i23) {
                    arrayList.add(new nufgyqmvbu.lqeggnwhkg(fArr[i14], fArr[i14 + 1], fArr[i14 + 2], fArr[i14 + 3]));
                    i14 += 4;
                }
                return;
            case 'S':
                int i24 = i13 - 4;
                while (i14 <= i24) {
                    arrayList.add(new nufgyqmvbu.C1346nufgyqmvbu(fArr[i14], fArr[i14 + 1], fArr[i14 + 2], fArr[i14 + 3]));
                    i14 += 4;
                }
                return;
            case 'T':
                int i25 = i13 - 2;
                while (i14 <= i25) {
                    arrayList.add(new nufgyqmvbu.dxjokdxxww(fArr[i14], fArr[i14 + 1]));
                    i14 += 2;
                }
                return;
            case 'V':
                int i26 = i13 - 1;
                while (i14 <= i26) {
                    arrayList.add(new nufgyqmvbu.kcexrzcfyt(fArr[i14]));
                    i14++;
                }
                return;
            case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
            case 'z':
                arrayList.add(nufgyqmvbu.zoijcleaow.f64722ppxfxbqfkf);
                return;
            case 'a':
                int i27 = i13 - 7;
                for (int i28 = 0; i28 <= i27; i28 += 7) {
                    arrayList.add(new nufgyqmvbu.btonecajqb(fArr[i28], fArr[i28 + 1], fArr[i28 + 2], Float.compare(fArr[i28 + 3], 0.0f) != 0, Float.compare(fArr[i28 + 4], 0.0f) != 0, fArr[i28 + 5], fArr[i28 + 6]));
                }
                return;
            case 'c':
                int i29 = i13 - 6;
                while (i14 <= i29) {
                    arrayList.add(new nufgyqmvbu.gtknphoqwx(fArr[i14], fArr[i14 + 1], fArr[i14 + 2], fArr[i14 + 3], fArr[i14 + 4], fArr[i14 + 5]));
                    i14 += 6;
                }
                return;
            case 'h':
                int i33 = i13 - 1;
                while (i14 <= i33) {
                    arrayList.add(new nufgyqmvbu.draadjrbmk(fArr[i14]));
                    i14++;
                }
                return;
            case 'l':
                int i34 = i13 - 2;
                while (i14 <= i34) {
                    arrayList.add(new nufgyqmvbu.wflxmlrfwp(fArr[i14], fArr[i14 + 1]));
                    i14 += 2;
                }
                return;
            case 'm':
                ppxfxbqfkf(arrayList, fArr, i13);
                return;
            case 'q':
                int i35 = i13 - 4;
                while (i14 <= i35) {
                    arrayList.add(new nufgyqmvbu.ojitshcjhn(fArr[i14], fArr[i14 + 1], fArr[i14 + 2], fArr[i14 + 3]));
                    i14 += 4;
                }
                return;
            case BuildConfig.API_LEVEL /* 115 */:
                int i36 = i13 - 4;
                while (i14 <= i36) {
                    arrayList.add(new nufgyqmvbu.rgvfuqvkyq(fArr[i14], fArr[i14 + 1], fArr[i14 + 2], fArr[i14 + 3]));
                    i14 += 4;
                }
                return;
            case 't':
                int i37 = i13 - 2;
                while (i14 <= i37) {
                    arrayList.add(new nufgyqmvbu.vdvldrhtss(fArr[i14], fArr[i14 + 1]));
                    i14 += 2;
                }
                return;
            case 'v':
                int i38 = i13 - 1;
                while (i14 <= i38) {
                    arrayList.add(new nufgyqmvbu.oxmwwwfdhm(fArr[i14]));
                    i14++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c13);
        }
    }

    private static final void ppxfxbqfkf(List list, float[] fArr, int i13) {
        int i14 = i13 - 2;
        if (i14 >= 0) {
            list.add(new nufgyqmvbu.agtfadlqog(fArr[0], fArr[1]));
            for (int i15 = 2; i15 <= i14; i15 += 2) {
                list.add(new nufgyqmvbu.wflxmlrfwp(fArr[i15], fArr[i15 + 1]));
            }
        }
    }

    private static final void zoijcleaow(List list, float[] fArr, int i13) {
        int i14 = i13 - 2;
        if (i14 >= 0) {
            list.add(new nufgyqmvbu.gxszxtbevo(fArr[0], fArr[1]));
            for (int i15 = 2; i15 <= i14; i15 += 2) {
                list.add(new nufgyqmvbu.eablkybsjg(fArr[i15], fArr[i15 + 1]));
            }
        }
    }
}
