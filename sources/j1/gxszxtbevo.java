package j1;

import android.graphics.Path;
import android.util.Log;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f50469iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        boolean f50470zoijcleaow;

        iobyxmoadg() {
        }
    }

    public static void btonecajqb(zoijcleaow[] zoijcleaowVarArr, Path path) {
        float[] fArr = new float[6];
        char c13 = 'm';
        for (zoijcleaow zoijcleaowVar : zoijcleaowVarArr) {
            zoijcleaow.eablkybsjg(path, fArr, c13, zoijcleaowVar.f50471iobyxmoadg, zoijcleaowVar.f50472zoijcleaow);
            c13 = zoijcleaowVar.f50471iobyxmoadg;
        }
    }

    private static int dxjokdxxww(String str, int i13) {
        while (i13 < str.length()) {
            char cCharAt = str.charAt(i13);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i13;
            }
            i13++;
        }
        return i13;
    }

    public static Path eablkybsjg(String str) {
        Path path = new Path();
        try {
            zoijcleaow.nufgyqmvbu(wkgbmnqykc(str), path);
            return path;
        } catch (RuntimeException e13) {
            throw new RuntimeException("Error in parsing " + str, e13);
        }
    }

    public static void gtknphoqwx(zoijcleaow[] zoijcleaowVarArr, zoijcleaow[] zoijcleaowVarArr2) {
        for (int i13 = 0; i13 < zoijcleaowVarArr2.length; i13++) {
            zoijcleaowVarArr[i13].f50471iobyxmoadg = zoijcleaowVarArr2[i13].f50471iobyxmoadg;
            for (int i14 = 0; i14 < zoijcleaowVarArr2[i13].f50472zoijcleaow.length; i14++) {
                zoijcleaowVarArr[i13].f50472zoijcleaow[i14] = zoijcleaowVarArr2[i13].f50472zoijcleaow[i14];
            }
        }
    }

    public static zoijcleaow[] gxszxtbevo(zoijcleaow[] zoijcleaowVarArr) {
        zoijcleaow[] zoijcleaowVarArr2 = new zoijcleaow[zoijcleaowVarArr.length];
        for (int i13 = 0; i13 < zoijcleaowVarArr.length; i13++) {
            zoijcleaowVarArr2[i13] = new zoijcleaow(zoijcleaowVarArr[i13]);
        }
        return zoijcleaowVarArr2;
    }

    private static void iobyxmoadg(ArrayList arrayList, char c13, float[] fArr) {
        arrayList.add(new zoijcleaow(c13, fArr));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    private static void lqeggnwhkg(String str, int i13, iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.f50470zoijcleaow = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        for (int i14 = i13; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if (cCharAt == ' ') {
                z13 = false;
                z15 = true;
            } else if (cCharAt != 'E' && cCharAt != 'e') {
                switch (cCharAt) {
                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        z13 = false;
                        z15 = true;
                        break;
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        if (i14 == i13 || z13) {
                            z13 = false;
                        } else {
                            iobyxmoadgVar.f50470zoijcleaow = true;
                            z13 = false;
                            z15 = true;
                        }
                        break;
                    case '.':
                        if (z14) {
                            iobyxmoadgVar.f50470zoijcleaow = true;
                            z13 = false;
                            z15 = true;
                        } else {
                            z13 = false;
                            z14 = true;
                        }
                        break;
                    default:
                        z13 = false;
                        break;
                }
            } else {
                z13 = true;
            }
            if (z15) {
                iobyxmoadgVar.f50469iobyxmoadg = i14;
            }
        }
        iobyxmoadgVar.f50469iobyxmoadg = i14;
    }

    private static float[] nufgyqmvbu(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            int length = str.length();
            int i13 = 1;
            int i14 = 0;
            while (i13 < length) {
                lqeggnwhkg(str, i13, iobyxmoadgVar);
                int i15 = iobyxmoadgVar.f50469iobyxmoadg;
                if (i13 < i15) {
                    fArr[i14] = Float.parseFloat(str.substring(i13, i15));
                    i14++;
                }
                i13 = iobyxmoadgVar.f50470zoijcleaow ? i15 : i15 + 1;
            }
            return ppxfxbqfkf(fArr, 0, i14);
        } catch (NumberFormatException e13) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e13);
        }
    }

    static float[] ppxfxbqfkf(float[] fArr, int i13, int i14) {
        if (i13 > i14) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i13 < 0 || i13 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i15 = i14 - i13;
        int iMin = Math.min(i15, length - i13);
        float[] fArr2 = new float[i15];
        System.arraycopy(fArr, i13, fArr2, 0, iMin);
        return fArr2;
    }

    public static zoijcleaow[] wkgbmnqykc(String str) {
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 1;
        while (i14 < str.length()) {
            int iDxjokdxxww = dxjokdxxww(str, i14);
            String strTrim = str.substring(i13, iDxjokdxxww).trim();
            if (!strTrim.isEmpty()) {
                iobyxmoadg(arrayList, strTrim.charAt(0), nufgyqmvbu(strTrim));
            }
            i13 = iDxjokdxxww;
            i14 = iDxjokdxxww + 1;
        }
        if (i14 - i13 == 1 && i13 < str.length()) {
            iobyxmoadg(arrayList, str.charAt(i13), new float[0]);
        }
        return (zoijcleaow[]) arrayList.toArray(new zoijcleaow[0]);
    }

    public static boolean zoijcleaow(zoijcleaow[] zoijcleaowVarArr, zoijcleaow[] zoijcleaowVarArr2) {
        if (zoijcleaowVarArr == null || zoijcleaowVarArr2 == null || zoijcleaowVarArr.length != zoijcleaowVarArr2.length) {
            return false;
        }
        for (int i13 = 0; i13 < zoijcleaowVarArr.length; i13++) {
            if (zoijcleaowVarArr[i13].f50471iobyxmoadg != zoijcleaowVarArr2[i13].f50471iobyxmoadg || zoijcleaowVarArr[i13].f50472zoijcleaow.length != zoijcleaowVarArr2[i13].f50472zoijcleaow.length) {
                return false;
            }
        }
        return true;
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private char f50471iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final float[] f50472zoijcleaow;

        zoijcleaow(char c13, float[] fArr) {
            this.f50471iobyxmoadg = c13;
            this.f50472zoijcleaow = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void eablkybsjg(Path path, float[] fArr, char c13, char c14, float[] fArr2) {
            int i13;
            int i14;
            int i15;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f23;
            char c15 = c14;
            boolean z13 = false;
            float f24 = fArr[0];
            float f25 = fArr[1];
            float f26 = fArr[2];
            float f27 = fArr[3];
            float f28 = fArr[4];
            float f29 = fArr[5];
            switch (c15) {
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 'a':
                    i13 = 7;
                    i14 = i13;
                    break;
                case 'C':
                case 'c':
                    i13 = 6;
                    i14 = i13;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i14 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i14 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case BuildConfig.API_LEVEL /* 115 */:
                    i14 = 4;
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                case 'z':
                    path.close();
                    path.moveTo(f28, f29);
                    f24 = f28;
                    f26 = f24;
                    f25 = f29;
                    f27 = f25;
                    i14 = 2;
                    break;
            }
            float f33 = f24;
            float f34 = f25;
            float f35 = f28;
            float f36 = f29;
            int i16 = 0;
            char c16 = c13;
            while (i16 < fArr2.length) {
                if (c15 != 'A') {
                    if (c15 == 'C') {
                        i15 = i16;
                        int i17 = i15 + 2;
                        int i18 = i15 + 3;
                        int i19 = i15 + 4;
                        int i23 = i15 + 5;
                        path.cubicTo(fArr2[i15], fArr2[i15 + 1], fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i23]);
                        f33 = fArr2[i19];
                        float f37 = fArr2[i23];
                        float f38 = fArr2[i17];
                        float f39 = fArr2[i18];
                        f34 = f37;
                        f27 = f39;
                        f26 = f38;
                    } else if (c15 == 'H') {
                        i15 = i16;
                        path.lineTo(fArr2[i15], f34);
                        f33 = fArr2[i15];
                    } else if (c15 == 'Q') {
                        i15 = i16;
                        int i24 = i15 + 1;
                        int i25 = i15 + 2;
                        int i26 = i15 + 3;
                        path.quadTo(fArr2[i15], fArr2[i24], fArr2[i25], fArr2[i26]);
                        float f43 = fArr2[i15];
                        float f44 = fArr2[i24];
                        f33 = fArr2[i25];
                        f34 = fArr2[i26];
                        f26 = f43;
                        f27 = f44;
                    } else if (c15 == 'V') {
                        i15 = i16;
                        path.lineTo(f33, fArr2[i15]);
                        f34 = fArr2[i15];
                    } else if (c15 != 'a') {
                        if (c15 != 'c') {
                            if (c15 == 'h') {
                                path.rLineTo(fArr2[i16], 0.0f);
                                f33 += fArr2[i16];
                            } else if (c15 != 'q') {
                                if (c15 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i16]);
                                    f16 = fArr2[i16];
                                } else if (c15 == 'L') {
                                    int i27 = i16 + 1;
                                    path.lineTo(fArr2[i16], fArr2[i27]);
                                    f33 = fArr2[i16];
                                    f34 = fArr2[i27];
                                } else if (c15 == 'M') {
                                    f33 = fArr2[i16];
                                    f34 = fArr2[i16 + 1];
                                    if (i16 > 0) {
                                        path.lineTo(f33, f34);
                                    } else {
                                        path.moveTo(f33, f34);
                                        i15 = i16;
                                        f36 = f34;
                                        f35 = f33;
                                    }
                                } else if (c15 == 'S') {
                                    if (c16 == 'c' || c16 == 's' || c16 == 'C' || c16 == 'S') {
                                        f33 = (f33 * 2.0f) - f26;
                                        f34 = (f34 * 2.0f) - f27;
                                    }
                                    float f45 = f34;
                                    float f46 = f33;
                                    int i28 = i16 + 1;
                                    int i29 = i16 + 2;
                                    int i33 = i16 + 3;
                                    path.cubicTo(f46, f45, fArr2[i16], fArr2[i28], fArr2[i29], fArr2[i33]);
                                    f13 = fArr2[i16];
                                    f14 = fArr2[i28];
                                    f33 = fArr2[i29];
                                    f34 = fArr2[i33];
                                    f26 = f13;
                                    f27 = f14;
                                } else if (c15 == 'T') {
                                    if (c16 == 'q' || c16 == 't' || c16 == 'Q' || c16 == 'T') {
                                        f33 = (f33 * 2.0f) - f26;
                                        f34 = (f34 * 2.0f) - f27;
                                    }
                                    int i34 = i16 + 1;
                                    path.quadTo(f33, f34, fArr2[i16], fArr2[i34]);
                                    i15 = i16;
                                    f27 = f34;
                                    f26 = f33;
                                    f33 = fArr2[i16];
                                    f34 = fArr2[i34];
                                } else if (c15 == 'l') {
                                    int i35 = i16 + 1;
                                    path.rLineTo(fArr2[i16], fArr2[i35]);
                                    f33 += fArr2[i16];
                                    f16 = fArr2[i35];
                                } else if (c15 == 'm') {
                                    float f47 = fArr2[i16];
                                    f33 += f47;
                                    float f48 = fArr2[i16 + 1];
                                    f34 += f48;
                                    if (i16 > 0) {
                                        path.rLineTo(f47, f48);
                                    } else {
                                        path.rMoveTo(f47, f48);
                                        i15 = i16;
                                        f36 = f34;
                                        f35 = f33;
                                    }
                                } else if (c15 == 's') {
                                    if (c16 == 'c' || c16 == 's' || c16 == 'C' || c16 == 'S') {
                                        float f49 = f33 - f26;
                                        f17 = f34 - f27;
                                        f18 = f49;
                                    } else {
                                        f18 = 0.0f;
                                        f17 = 0.0f;
                                    }
                                    int i36 = i16 + 1;
                                    int i37 = i16 + 2;
                                    int i38 = i16 + 3;
                                    path.rCubicTo(f18, f17, fArr2[i16], fArr2[i36], fArr2[i37], fArr2[i38]);
                                    f13 = fArr2[i16] + f33;
                                    f14 = fArr2[i36] + f34;
                                    f33 += fArr2[i37];
                                    f15 = fArr2[i38];
                                } else if (c15 == 't') {
                                    if (c16 == 'q' || c16 == 't' || c16 == 'Q' || c16 == 'T') {
                                        f19 = f33 - f26;
                                        f23 = f34 - f27;
                                    } else {
                                        f23 = 0.0f;
                                        f19 = 0.0f;
                                    }
                                    int i39 = i16 + 1;
                                    path.rQuadTo(f19, f23, fArr2[i16], fArr2[i39]);
                                    float f53 = f19 + f33;
                                    float f54 = f23 + f34;
                                    f33 += fArr2[i16];
                                    f34 += fArr2[i39];
                                    f27 = f54;
                                    f26 = f53;
                                }
                                f34 += f16;
                            } else {
                                int i43 = i16 + 1;
                                int i44 = i16 + 2;
                                int i45 = i16 + 3;
                                path.rQuadTo(fArr2[i16], fArr2[i43], fArr2[i44], fArr2[i45]);
                                f13 = fArr2[i16] + f33;
                                f14 = fArr2[i43] + f34;
                                f33 += fArr2[i44];
                                f15 = fArr2[i45];
                            }
                            i15 = i16;
                        } else {
                            int i46 = i16 + 2;
                            int i47 = i16 + 3;
                            int i48 = i16 + 4;
                            int i49 = i16 + 5;
                            path.rCubicTo(fArr2[i16], fArr2[i16 + 1], fArr2[i46], fArr2[i47], fArr2[i48], fArr2[i49]);
                            f13 = fArr2[i46] + f33;
                            f14 = fArr2[i47] + f34;
                            f33 += fArr2[i48];
                            f15 = fArr2[i49];
                        }
                        f34 += f15;
                        f26 = f13;
                        f27 = f14;
                        i15 = i16;
                    } else {
                        int i53 = i16 + 5;
                        int i54 = i16 + 6;
                        i15 = i16;
                        lqeggnwhkg(path, f33, f34, fArr2[i53] + f33, fArr2[i54] + f34, fArr2[i16], fArr2[i16 + 1], fArr2[i16 + 2], fArr2[i16 + 3] != 0.0f, fArr2[i16 + 4] != 0.0f);
                        f33 += fArr2[i53];
                        f34 += fArr2[i54];
                    }
                    i16 = i15 + i14;
                    c16 = c14;
                    c15 = c16;
                    z13 = false;
                } else {
                    i15 = i16;
                    int i55 = i15 + 5;
                    int i56 = i15 + 6;
                    lqeggnwhkg(path, f33, f34, fArr2[i55], fArr2[i56], fArr2[i15], fArr2[i15 + 1], fArr2[i15 + 2], fArr2[i15 + 3] != 0.0f, fArr2[i15 + 4] != 0.0f);
                    f33 = fArr2[i55];
                    f34 = fArr2[i56];
                }
                f27 = f34;
                f26 = f33;
                i16 = i15 + i14;
                c16 = c14;
                c15 = c16;
                z13 = false;
            }
            fArr[z13 ? 1 : 0] = f33;
            fArr[1] = f34;
            fArr[2] = f26;
            fArr[3] = f27;
            fArr[4] = f35;
            fArr[5] = f36;
        }

        private static void gxszxtbevo(Path path, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d23, double d24) {
            double d25 = d15;
            int iCeil = (int) Math.ceil(Math.abs((d24 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d19);
            double dSin = Math.sin(d19);
            double dCos2 = Math.cos(d23);
            double dSin2 = Math.sin(d23);
            double d26 = -d25;
            double d27 = d26 * dCos;
            double d28 = d16 * dSin;
            double d29 = (d27 * dSin2) - (d28 * dCos2);
            double d33 = d26 * dSin;
            double d34 = d16 * dCos;
            double d35 = (dSin2 * d33) + (dCos2 * d34);
            double d36 = d24 / ((double) iCeil);
            double d37 = d35;
            double d38 = d29;
            int i13 = 0;
            double d39 = d17;
            double d43 = d18;
            double d44 = d23;
            while (i13 < iCeil) {
                double d45 = d44 + d36;
                double dSin3 = Math.sin(d45);
                double dCos3 = Math.cos(d45);
                double d46 = (d13 + ((d25 * dCos) * dCos3)) - (d28 * dSin3);
                double d47 = d14 + (d25 * dSin * dCos3) + (d34 * dSin3);
                double d48 = (d27 * dSin3) - (d28 * dCos3);
                double d49 = (dSin3 * d33) + (dCos3 * d34);
                double d53 = d45 - d44;
                double dTan = Math.tan(d53 / 2.0d);
                double dSin4 = (Math.sin(d53) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d54 = d39 + (d38 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d54, (float) (d43 + (d37 * dSin4)), (float) (d46 - (dSin4 * d48)), (float) (d47 - (dSin4 * d49)), (float) d46, (float) d47);
                i13++;
                d36 = d36;
                dSin = dSin;
                d39 = d46;
                d33 = d33;
                dCos = dCos;
                d44 = d45;
                d37 = d49;
                d38 = d48;
                iCeil = iCeil;
                d43 = d47;
                d25 = d15;
            }
        }

        private static void lqeggnwhkg(Path path, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z13, boolean z14) {
            double d13;
            double d14;
            double radians = Math.toRadians(f19);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d15 = f13;
            double d16 = d15 * dCos;
            double d17 = f14;
            double d18 = f17;
            double d19 = (d16 + (d17 * dSin)) / d18;
            double d23 = (((double) (-f13)) * dSin) + (d17 * dCos);
            double d24 = f18;
            double d25 = d23 / d24;
            double d26 = f16;
            double d27 = ((((double) f15) * dCos) + (d26 * dSin)) / d18;
            double d28 = ((((double) (-f15)) * dSin) + (d26 * dCos)) / d24;
            double d29 = d19 - d27;
            double d33 = d25 - d28;
            double d34 = (d19 + d27) / 2.0d;
            double d35 = (d25 + d28) / 2.0d;
            double d36 = (d29 * d29) + (d33 * d33);
            if (d36 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d37 = (1.0d / d36) - 0.25d;
            if (d37 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d36);
                float fSqrt = (float) (Math.sqrt(d36) / 1.99999d);
                lqeggnwhkg(path, f13, f14, f15, f16, f17 * fSqrt, f18 * fSqrt, f19, z13, z14);
                return;
            }
            double dSqrt = Math.sqrt(d37);
            double d38 = d29 * dSqrt;
            double d39 = dSqrt * d33;
            if (z13 == z14) {
                d13 = d34 - d39;
                d14 = d35 + d38;
            } else {
                d13 = d34 + d39;
                d14 = d35 - d38;
            }
            double dAtan2 = Math.atan2(d25 - d14, d19 - d13);
            double dAtan3 = Math.atan2(d28 - d14, d27 - d13) - dAtan2;
            if (z14 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d43 = d13 * d18;
            double d44 = d14 * d24;
            gxszxtbevo(path, (d43 * dCos) - (d44 * dSin), (d43 * dSin) + (d44 * dCos), d18, d24, d15, d17, radians, dAtan2, dAtan3);
        }

        public static void nufgyqmvbu(zoijcleaow[] zoijcleaowVarArr, Path path) {
            gxszxtbevo.btonecajqb(zoijcleaowVarArr, path);
        }

        zoijcleaow(zoijcleaow zoijcleaowVar) {
            this.f50471iobyxmoadg = zoijcleaowVar.f50471iobyxmoadg;
            float[] fArr = zoijcleaowVar.f50472zoijcleaow;
            this.f50472zoijcleaow = gxszxtbevo.ppxfxbqfkf(fArr, 0, fArr.length);
        }
    }
}
