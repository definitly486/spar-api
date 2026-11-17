package bf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int[] f16028eablkybsjg = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final ppxfxbqfkf[] f16029gxszxtbevo = iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f16030iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow[] f16031ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f16032wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int[] f16033zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f16034iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f16035zoijcleaow;

        iobyxmoadg(int i13, int i14) {
            this.f16034iobyxmoadg = i13;
            this.f16035zoijcleaow = i14;
        }

        public int iobyxmoadg() {
            return this.f16034iobyxmoadg;
        }

        public int zoijcleaow() {
            return this.f16035zoijcleaow;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f16036iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final iobyxmoadg[] f16037zoijcleaow;

        zoijcleaow(int i13, iobyxmoadg... iobyxmoadgVarArr) {
            this.f16036iobyxmoadg = i13;
            this.f16037zoijcleaow = iobyxmoadgVarArr;
        }

        public iobyxmoadg[] iobyxmoadg() {
            return this.f16037zoijcleaow;
        }

        public int ppxfxbqfkf() {
            int iIobyxmoadg = 0;
            for (iobyxmoadg iobyxmoadgVar : this.f16037zoijcleaow) {
                iIobyxmoadg += iobyxmoadgVar.iobyxmoadg();
            }
            return iIobyxmoadg;
        }

        public int wkgbmnqykc() {
            return this.f16036iobyxmoadg * ppxfxbqfkf();
        }

        public int zoijcleaow() {
            return this.f16036iobyxmoadg;
        }
    }

    private ppxfxbqfkf(int i13, int[] iArr, zoijcleaow... zoijcleaowVarArr) {
        this.f16030iobyxmoadg = i13;
        this.f16033zoijcleaow = iArr;
        this.f16031ppxfxbqfkf = zoijcleaowVarArr;
        int iZoijcleaow = zoijcleaowVarArr[0].zoijcleaow();
        int iIobyxmoadg = 0;
        for (iobyxmoadg iobyxmoadgVar : zoijcleaowVarArr[0].iobyxmoadg()) {
            iIobyxmoadg += iobyxmoadgVar.iobyxmoadg() * (iobyxmoadgVar.zoijcleaow() + iZoijcleaow);
        }
        this.f16032wkgbmnqykc = iIobyxmoadg;
    }

    public static ppxfxbqfkf eablkybsjg(int i13) {
        if (i13 <= 0 || i13 > 40) {
            throw new IllegalArgumentException();
        }
        return f16029gxszxtbevo[i13 - 1];
    }

    private static ppxfxbqfkf[] iobyxmoadg() {
        return new ppxfxbqfkf[]{new ppxfxbqfkf(1, new int[0], new zoijcleaow(7, new iobyxmoadg(1, 19)), new zoijcleaow(10, new iobyxmoadg(1, 16)), new zoijcleaow(13, new iobyxmoadg(1, 13)), new zoijcleaow(17, new iobyxmoadg(1, 9))), new ppxfxbqfkf(2, new int[]{6, 18}, new zoijcleaow(10, new iobyxmoadg(1, 34)), new zoijcleaow(16, new iobyxmoadg(1, 28)), new zoijcleaow(22, new iobyxmoadg(1, 22)), new zoijcleaow(28, new iobyxmoadg(1, 16))), new ppxfxbqfkf(3, new int[]{6, 22}, new zoijcleaow(15, new iobyxmoadg(1, 55)), new zoijcleaow(26, new iobyxmoadg(1, 44)), new zoijcleaow(18, new iobyxmoadg(2, 17)), new zoijcleaow(22, new iobyxmoadg(2, 13))), new ppxfxbqfkf(4, new int[]{6, 26}, new zoijcleaow(20, new iobyxmoadg(1, 80)), new zoijcleaow(18, new iobyxmoadg(2, 32)), new zoijcleaow(26, new iobyxmoadg(2, 24)), new zoijcleaow(16, new iobyxmoadg(4, 9))), new ppxfxbqfkf(5, new int[]{6, 30}, new zoijcleaow(26, new iobyxmoadg(1, 108)), new zoijcleaow(24, new iobyxmoadg(2, 43)), new zoijcleaow(18, new iobyxmoadg(2, 15), new iobyxmoadg(2, 16)), new zoijcleaow(22, new iobyxmoadg(2, 11), new iobyxmoadg(2, 12))), new ppxfxbqfkf(6, new int[]{6, 34}, new zoijcleaow(18, new iobyxmoadg(2, 68)), new zoijcleaow(16, new iobyxmoadg(4, 27)), new zoijcleaow(24, new iobyxmoadg(4, 19)), new zoijcleaow(28, new iobyxmoadg(4, 15))), new ppxfxbqfkf(7, new int[]{6, 22, 38}, new zoijcleaow(20, new iobyxmoadg(2, 78)), new zoijcleaow(18, new iobyxmoadg(4, 31)), new zoijcleaow(18, new iobyxmoadg(2, 14), new iobyxmoadg(4, 15)), new zoijcleaow(26, new iobyxmoadg(4, 13), new iobyxmoadg(1, 14))), new ppxfxbqfkf(8, new int[]{6, 24, 42}, new zoijcleaow(24, new iobyxmoadg(2, 97)), new zoijcleaow(22, new iobyxmoadg(2, 38), new iobyxmoadg(2, 39)), new zoijcleaow(22, new iobyxmoadg(4, 18), new iobyxmoadg(2, 19)), new zoijcleaow(26, new iobyxmoadg(4, 14), new iobyxmoadg(2, 15))), new ppxfxbqfkf(9, new int[]{6, 26, 46}, new zoijcleaow(30, new iobyxmoadg(2, 116)), new zoijcleaow(22, new iobyxmoadg(3, 36), new iobyxmoadg(2, 37)), new zoijcleaow(20, new iobyxmoadg(4, 16), new iobyxmoadg(4, 17)), new zoijcleaow(24, new iobyxmoadg(4, 12), new iobyxmoadg(4, 13))), new ppxfxbqfkf(10, new int[]{6, 28, 50}, new zoijcleaow(18, new iobyxmoadg(2, 68), new iobyxmoadg(2, 69)), new zoijcleaow(26, new iobyxmoadg(4, 43), new iobyxmoadg(1, 44)), new zoijcleaow(24, new iobyxmoadg(6, 19), new iobyxmoadg(2, 20)), new zoijcleaow(28, new iobyxmoadg(6, 15), new iobyxmoadg(2, 16))), new ppxfxbqfkf(11, new int[]{6, 30, 54}, new zoijcleaow(20, new iobyxmoadg(4, 81)), new zoijcleaow(30, new iobyxmoadg(1, 50), new iobyxmoadg(4, 51)), new zoijcleaow(28, new iobyxmoadg(4, 22), new iobyxmoadg(4, 23)), new zoijcleaow(24, new iobyxmoadg(3, 12), new iobyxmoadg(8, 13))), new ppxfxbqfkf(12, new int[]{6, 32, 58}, new zoijcleaow(24, new iobyxmoadg(2, 92), new iobyxmoadg(2, 93)), new zoijcleaow(22, new iobyxmoadg(6, 36), new iobyxmoadg(2, 37)), new zoijcleaow(26, new iobyxmoadg(4, 20), new iobyxmoadg(6, 21)), new zoijcleaow(28, new iobyxmoadg(7, 14), new iobyxmoadg(4, 15))), new ppxfxbqfkf(13, new int[]{6, 34, 62}, new zoijcleaow(26, new iobyxmoadg(4, 107)), new zoijcleaow(22, new iobyxmoadg(8, 37), new iobyxmoadg(1, 38)), new zoijcleaow(24, new iobyxmoadg(8, 20), new iobyxmoadg(4, 21)), new zoijcleaow(22, new iobyxmoadg(12, 11), new iobyxmoadg(4, 12))), new ppxfxbqfkf(14, new int[]{6, 26, 46, 66}, new zoijcleaow(30, new iobyxmoadg(3, BuildConfig.API_LEVEL), new iobyxmoadg(1, 116)), new zoijcleaow(24, new iobyxmoadg(4, 40), new iobyxmoadg(5, 41)), new zoijcleaow(20, new iobyxmoadg(11, 16), new iobyxmoadg(5, 17)), new zoijcleaow(24, new iobyxmoadg(11, 12), new iobyxmoadg(5, 13))), new ppxfxbqfkf(15, new int[]{6, 26, 48, 70}, new zoijcleaow(22, new iobyxmoadg(5, 87), new iobyxmoadg(1, 88)), new zoijcleaow(24, new iobyxmoadg(5, 41), new iobyxmoadg(5, 42)), new zoijcleaow(30, new iobyxmoadg(5, 24), new iobyxmoadg(7, 25)), new zoijcleaow(24, new iobyxmoadg(11, 12), new iobyxmoadg(7, 13))), new ppxfxbqfkf(16, new int[]{6, 26, 50, 74}, new zoijcleaow(24, new iobyxmoadg(5, 98), new iobyxmoadg(1, 99)), new zoijcleaow(28, new iobyxmoadg(7, 45), new iobyxmoadg(3, 46)), new zoijcleaow(24, new iobyxmoadg(15, 19), new iobyxmoadg(2, 20)), new zoijcleaow(30, new iobyxmoadg(3, 15), new iobyxmoadg(13, 16))), new ppxfxbqfkf(17, new int[]{6, 30, 54, 78}, new zoijcleaow(28, new iobyxmoadg(1, 107), new iobyxmoadg(5, 108)), new zoijcleaow(28, new iobyxmoadg(10, 46), new iobyxmoadg(1, 47)), new zoijcleaow(28, new iobyxmoadg(1, 22), new iobyxmoadg(15, 23)), new zoijcleaow(28, new iobyxmoadg(2, 14), new iobyxmoadg(17, 15))), new ppxfxbqfkf(18, new int[]{6, 30, 56, 82}, new zoijcleaow(30, new iobyxmoadg(5, 120), new iobyxmoadg(1, 121)), new zoijcleaow(26, new iobyxmoadg(9, 43), new iobyxmoadg(4, 44)), new zoijcleaow(28, new iobyxmoadg(17, 22), new iobyxmoadg(1, 23)), new zoijcleaow(28, new iobyxmoadg(2, 14), new iobyxmoadg(19, 15))), new ppxfxbqfkf(19, new int[]{6, 30, 58, 86}, new zoijcleaow(28, new iobyxmoadg(3, 113), new iobyxmoadg(4, 114)), new zoijcleaow(26, new iobyxmoadg(3, 44), new iobyxmoadg(11, 45)), new zoijcleaow(26, new iobyxmoadg(17, 21), new iobyxmoadg(4, 22)), new zoijcleaow(26, new iobyxmoadg(9, 13), new iobyxmoadg(16, 14))), new ppxfxbqfkf(20, new int[]{6, 34, 62, 90}, new zoijcleaow(28, new iobyxmoadg(3, 107), new iobyxmoadg(5, 108)), new zoijcleaow(26, new iobyxmoadg(3, 41), new iobyxmoadg(13, 42)), new zoijcleaow(30, new iobyxmoadg(15, 24), new iobyxmoadg(5, 25)), new zoijcleaow(28, new iobyxmoadg(15, 15), new iobyxmoadg(10, 16))), new ppxfxbqfkf(21, new int[]{6, 28, 50, 72, 94}, new zoijcleaow(28, new iobyxmoadg(4, 116), new iobyxmoadg(4, 117)), new zoijcleaow(26, new iobyxmoadg(17, 42)), new zoijcleaow(28, new iobyxmoadg(17, 22), new iobyxmoadg(6, 23)), new zoijcleaow(30, new iobyxmoadg(19, 16), new iobyxmoadg(6, 17))), new ppxfxbqfkf(22, new int[]{6, 26, 50, 74, 98}, new zoijcleaow(28, new iobyxmoadg(2, 111), new iobyxmoadg(7, 112)), new zoijcleaow(28, new iobyxmoadg(17, 46)), new zoijcleaow(30, new iobyxmoadg(7, 24), new iobyxmoadg(16, 25)), new zoijcleaow(24, new iobyxmoadg(34, 13))), new ppxfxbqfkf(23, new int[]{6, 30, 54, 78, 102}, new zoijcleaow(30, new iobyxmoadg(4, 121), new iobyxmoadg(5, 122)), new zoijcleaow(28, new iobyxmoadg(4, 47), new iobyxmoadg(14, 48)), new zoijcleaow(30, new iobyxmoadg(11, 24), new iobyxmoadg(14, 25)), new zoijcleaow(30, new iobyxmoadg(16, 15), new iobyxmoadg(14, 16))), new ppxfxbqfkf(24, new int[]{6, 28, 54, 80, 106}, new zoijcleaow(30, new iobyxmoadg(6, 117), new iobyxmoadg(4, 118)), new zoijcleaow(28, new iobyxmoadg(6, 45), new iobyxmoadg(14, 46)), new zoijcleaow(30, new iobyxmoadg(11, 24), new iobyxmoadg(16, 25)), new zoijcleaow(30, new iobyxmoadg(30, 16), new iobyxmoadg(2, 17))), new ppxfxbqfkf(25, new int[]{6, 32, 58, 84, 110}, new zoijcleaow(26, new iobyxmoadg(8, 106), new iobyxmoadg(4, 107)), new zoijcleaow(28, new iobyxmoadg(8, 47), new iobyxmoadg(13, 48)), new zoijcleaow(30, new iobyxmoadg(7, 24), new iobyxmoadg(22, 25)), new zoijcleaow(30, new iobyxmoadg(22, 15), new iobyxmoadg(13, 16))), new ppxfxbqfkf(26, new int[]{6, 30, 58, 86, 114}, new zoijcleaow(28, new iobyxmoadg(10, 114), new iobyxmoadg(2, BuildConfig.API_LEVEL)), new zoijcleaow(28, new iobyxmoadg(19, 46), new iobyxmoadg(4, 47)), new zoijcleaow(28, new iobyxmoadg(28, 22), new iobyxmoadg(6, 23)), new zoijcleaow(30, new iobyxmoadg(33, 16), new iobyxmoadg(4, 17))), new ppxfxbqfkf(27, new int[]{6, 34, 62, 90, 118}, new zoijcleaow(30, new iobyxmoadg(8, 122), new iobyxmoadg(4, 123)), new zoijcleaow(28, new iobyxmoadg(22, 45), new iobyxmoadg(3, 46)), new zoijcleaow(30, new iobyxmoadg(8, 23), new iobyxmoadg(26, 24)), new zoijcleaow(30, new iobyxmoadg(12, 15), new iobyxmoadg(28, 16))), new ppxfxbqfkf(28, new int[]{6, 26, 50, 74, 98, 122}, new zoijcleaow(30, new iobyxmoadg(3, 117), new iobyxmoadg(10, 118)), new zoijcleaow(28, new iobyxmoadg(3, 45), new iobyxmoadg(23, 46)), new zoijcleaow(30, new iobyxmoadg(4, 24), new iobyxmoadg(31, 25)), new zoijcleaow(30, new iobyxmoadg(11, 15), new iobyxmoadg(31, 16))), new ppxfxbqfkf(29, new int[]{6, 30, 54, 78, 102, 126}, new zoijcleaow(30, new iobyxmoadg(7, 116), new iobyxmoadg(7, 117)), new zoijcleaow(28, new iobyxmoadg(21, 45), new iobyxmoadg(7, 46)), new zoijcleaow(30, new iobyxmoadg(1, 23), new iobyxmoadg(37, 24)), new zoijcleaow(30, new iobyxmoadg(19, 15), new iobyxmoadg(26, 16))), new ppxfxbqfkf(30, new int[]{6, 26, 52, 78, 104, 130}, new zoijcleaow(30, new iobyxmoadg(5, BuildConfig.API_LEVEL), new iobyxmoadg(10, 116)), new zoijcleaow(28, new iobyxmoadg(19, 47), new iobyxmoadg(10, 48)), new zoijcleaow(30, new iobyxmoadg(15, 24), new iobyxmoadg(25, 25)), new zoijcleaow(30, new iobyxmoadg(23, 15), new iobyxmoadg(25, 16))), new ppxfxbqfkf(31, new int[]{6, 30, 56, 82, 108, 134}, new zoijcleaow(30, new iobyxmoadg(13, BuildConfig.API_LEVEL), new iobyxmoadg(3, 116)), new zoijcleaow(28, new iobyxmoadg(2, 46), new iobyxmoadg(29, 47)), new zoijcleaow(30, new iobyxmoadg(42, 24), new iobyxmoadg(1, 25)), new zoijcleaow(30, new iobyxmoadg(23, 15), new iobyxmoadg(28, 16))), new ppxfxbqfkf(32, new int[]{6, 34, 60, 86, 112, 138}, new zoijcleaow(30, new iobyxmoadg(17, BuildConfig.API_LEVEL)), new zoijcleaow(28, new iobyxmoadg(10, 46), new iobyxmoadg(23, 47)), new zoijcleaow(30, new iobyxmoadg(10, 24), new iobyxmoadg(35, 25)), new zoijcleaow(30, new iobyxmoadg(19, 15), new iobyxmoadg(35, 16))), new ppxfxbqfkf(33, new int[]{6, 30, 58, 86, 114, 142}, new zoijcleaow(30, new iobyxmoadg(17, BuildConfig.API_LEVEL), new iobyxmoadg(1, 116)), new zoijcleaow(28, new iobyxmoadg(14, 46), new iobyxmoadg(21, 47)), new zoijcleaow(30, new iobyxmoadg(29, 24), new iobyxmoadg(19, 25)), new zoijcleaow(30, new iobyxmoadg(11, 15), new iobyxmoadg(46, 16))), new ppxfxbqfkf(34, new int[]{6, 34, 62, 90, 118, 146}, new zoijcleaow(30, new iobyxmoadg(13, BuildConfig.API_LEVEL), new iobyxmoadg(6, 116)), new zoijcleaow(28, new iobyxmoadg(14, 46), new iobyxmoadg(23, 47)), new zoijcleaow(30, new iobyxmoadg(44, 24), new iobyxmoadg(7, 25)), new zoijcleaow(30, new iobyxmoadg(59, 16), new iobyxmoadg(1, 17))), new ppxfxbqfkf(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new zoijcleaow(30, new iobyxmoadg(12, 121), new iobyxmoadg(7, 122)), new zoijcleaow(28, new iobyxmoadg(12, 47), new iobyxmoadg(26, 48)), new zoijcleaow(30, new iobyxmoadg(39, 24), new iobyxmoadg(14, 25)), new zoijcleaow(30, new iobyxmoadg(22, 15), new iobyxmoadg(41, 16))), new ppxfxbqfkf(36, new int[]{6, 24, 50, 76, 102, UserVerificationMethods.USER_VERIFY_PATTERN, 154}, new zoijcleaow(30, new iobyxmoadg(6, 121), new iobyxmoadg(14, 122)), new zoijcleaow(28, new iobyxmoadg(6, 47), new iobyxmoadg(34, 48)), new zoijcleaow(30, new iobyxmoadg(46, 24), new iobyxmoadg(10, 25)), new zoijcleaow(30, new iobyxmoadg(2, 15), new iobyxmoadg(64, 16))), new ppxfxbqfkf(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new zoijcleaow(30, new iobyxmoadg(17, 122), new iobyxmoadg(4, 123)), new zoijcleaow(28, new iobyxmoadg(29, 46), new iobyxmoadg(14, 47)), new zoijcleaow(30, new iobyxmoadg(49, 24), new iobyxmoadg(10, 25)), new zoijcleaow(30, new iobyxmoadg(24, 15), new iobyxmoadg(46, 16))), new ppxfxbqfkf(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new zoijcleaow(30, new iobyxmoadg(4, 122), new iobyxmoadg(18, 123)), new zoijcleaow(28, new iobyxmoadg(13, 46), new iobyxmoadg(32, 47)), new zoijcleaow(30, new iobyxmoadg(48, 24), new iobyxmoadg(14, 25)), new zoijcleaow(30, new iobyxmoadg(42, 15), new iobyxmoadg(32, 16))), new ppxfxbqfkf(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new zoijcleaow(30, new iobyxmoadg(20, 117), new iobyxmoadg(4, 118)), new zoijcleaow(28, new iobyxmoadg(40, 47), new iobyxmoadg(7, 48)), new zoijcleaow(30, new iobyxmoadg(43, 24), new iobyxmoadg(22, 25)), new zoijcleaow(30, new iobyxmoadg(10, 15), new iobyxmoadg(67, 16))), new ppxfxbqfkf(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new zoijcleaow(30, new iobyxmoadg(19, 118), new iobyxmoadg(6, 119)), new zoijcleaow(28, new iobyxmoadg(18, 47), new iobyxmoadg(31, 48)), new zoijcleaow(30, new iobyxmoadg(34, 24), new iobyxmoadg(34, 25)), new zoijcleaow(30, new iobyxmoadg(20, 15), new iobyxmoadg(61, 16)))};
    }

    public int gxszxtbevo() {
        return this.f16030iobyxmoadg;
    }

    public zoijcleaow ppxfxbqfkf(bf.iobyxmoadg iobyxmoadgVar) {
        return this.f16031ppxfxbqfkf[iobyxmoadgVar.ordinal()];
    }

    public String toString() {
        return String.valueOf(this.f16030iobyxmoadg);
    }

    public int wkgbmnqykc() {
        return this.f16032wkgbmnqykc;
    }

    public int zoijcleaow() {
        return (this.f16030iobyxmoadg * 4) + 17;
    }
}
