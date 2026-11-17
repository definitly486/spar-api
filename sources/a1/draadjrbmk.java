package a1;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class draadjrbmk extends ppxfxbqfkf {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    lqeggnwhkg f165wkgbmnqykc;

    draadjrbmk(String str) {
        this.f261iobyxmoadg = str;
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i13 = 0;
        while (iIndexOf2 != -1) {
            dArr[i13] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i13++;
        }
        dArr[i13] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        this.f165wkgbmnqykc = wkgbmnqykc(Arrays.copyOf(dArr, i13 + 1));
    }

    private static lqeggnwhkg wkgbmnqykc(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d13 = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i13 = 0; i13 < dArr.length; i13++) {
            double d14 = dArr[i13];
            int i14 = i13 + length2;
            dArr2[i14][0] = d14;
            double d15 = ((double) i13) * d13;
            dArr3[i14] = d15;
            if (i13 > 0) {
                int i15 = (length2 * 2) + i13;
                dArr2[i15][0] = d14 + 1.0d;
                dArr3[i15] = d15 + 1.0d;
                int i16 = i13 - 1;
                dArr2[i16][0] = (d14 - 1.0d) - d13;
                dArr3[i16] = (d15 - 1.0d) - d13;
            }
        }
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(dArr3, dArr2);
        PrintStream printStream = System.out;
        printStream.println(" 0 " + lqeggnwhkgVar.ppxfxbqfkf(0.0d, 0));
        printStream.println(" 1 " + lqeggnwhkgVar.ppxfxbqfkf(1.0d, 0));
        return lqeggnwhkgVar;
    }

    @Override // a1.ppxfxbqfkf
    public double iobyxmoadg(double d13) {
        return this.f165wkgbmnqykc.ppxfxbqfkf(d13, 0);
    }

    @Override // a1.ppxfxbqfkf
    public double zoijcleaow(double d13) {
        return this.f165wkgbmnqykc.gtknphoqwx(d13, 0);
    }
}
