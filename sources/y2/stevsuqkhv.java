package y2;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import io.appmetrica.analytics.impl.C4007z9;
import java.io.Closeable;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class stevsuqkhv {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final String[] f123595agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final Pattern f123596btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static HashMap f123597draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final Pattern f123598dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final String f123599eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final Pattern f123600gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final byte[] f123601gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final int f123602iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final long[] f123603lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final Pattern f123604nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static final int[] f123605ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final String f123606ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final int[] f123607rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private static final int[] f123608vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final String[] f123609wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final String f123610wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final String f123611zoijcleaow;

    static {
        int i13 = Build.VERSION.SDK_INT;
        f123602iobyxmoadg = i13;
        String str = Build.DEVICE;
        f123611zoijcleaow = str;
        String str2 = Build.MANUFACTURER;
        f123606ppxfxbqfkf = str2;
        String str3 = Build.MODEL;
        f123610wkgbmnqykc = str3;
        f123599eablkybsjg = str + ", " + str3 + ", " + str2 + ", " + i13;
        f123601gxszxtbevo = new byte[0];
        f123603lqeggnwhkg = new long[0];
        f123604nufgyqmvbu = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f123598dxjokdxxww = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f123596btonecajqb = Pattern.compile("%([A-Fa-f0-9]{2})");
        f123600gtknphoqwx = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f123609wflxmlrfwp = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f123595agtfadlqog = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f123605ojitshcjhn = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f123607rgvfuqvkyq = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f123608vdvldrhtss = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, OrderServiceErrorHandlerImpl.PAYMENT_UNSUCCESSFUL_DESCRIPTION, 196, 195, OrderServiceErrorHandlerImpl.VALIDATION_EXCEPTION, OrderServiceErrorHandlerImpl.PAYMENT_ATTEMPTS_EXCEEDED, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, OrderServiceErrorHandlerImpl.ACCESS_DENIED, OrderServiceErrorHandlerImpl.PAYMENT_TOKEN_EXPIRED, 219, 220, 213, OrderServiceErrorHandlerImpl.ORDER_IN_PROGRESS, KotlinVersion.MAX_COMPONENT_VALUE, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, BuildConfig.API_LEVEL, 116, 125, 122, 137, 142, 135, UserVerificationMethods.USER_VERIFY_PATTERN, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, OrderServiceErrorHandlerImpl.ORDER_LOCKED, 200, 221, 218, OrderServiceErrorHandlerImpl.SYSTEM_ERROR, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, OrderServiceErrorHandlerImpl.ORDER_STATUS_INCORRECT, 215, 194, 197, OrderServiceErrorHandlerImpl.ORDER_NOT_FOUND, OrderServiceErrorHandlerImpl.OPERATION_PARAMETER_INCORRECT, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static long a(long j13, int i13) {
        return d(j13, 1000000L, i13, RoundingMode.DOWN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread ageimvtcrz(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static float agtfadlqog(float f13, float f14, float f15) {
        return Math.max(f14, Math.min(f13, f15));
    }

    public static boolean auzgnhcxok(Context context) {
        return f123602iobyxmoadg >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static long b(long j13, long j14, long j15) {
        return d(j13, j14, j15, RoundingMode.DOWN);
    }

    public static String bfopjjpdmp(int i13) {
        switch (i13) {
            case -2:
                return DevicePublicKeyStringDef.NONE;
            case -1:
                return CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i13 < 10000) {
                    return "?";
                }
                return "custom (" + i13 + ")";
        }
    }

    public static int btonecajqb(int i13, int i14) {
        return ((i13 + i14) - 1) / i14;
    }

    public static void c(long[] jArr, long j13, long j14) {
        f(jArr, j13, j14, RoundingMode.DOWN);
    }

    private static HashMap cdpycssgdh() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap map = new HashMap(iSOLanguages.length + f123609wflxmlrfwp.length);
        int i13 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f123609wflxmlrfwp;
            if (i13 >= strArr.length) {
                return map;
            }
            map.put(strArr[i13], strArr[i13 + 1]);
            i13 += 2;
        }
    }

    public static v2.esjtqupxsv.zoijcleaow cllcsxoeiz(v2.esjtqupxsv esjtqupxsvVar, v2.esjtqupxsv.zoijcleaow zoijcleaowVar) {
        boolean zPpxfxbqfkf = esjtqupxsvVar.ppxfxbqfkf();
        boolean zKegysxyocb = esjtqupxsvVar.kegysxyocb();
        boolean zHkdspvbjdz = esjtqupxsvVar.hkdspvbjdz();
        boolean zRgvfuqvkyq = esjtqupxsvVar.rgvfuqvkyq();
        boolean zJztzpxfvev = esjtqupxsvVar.jztzpxfvev();
        boolean zZdlpuopuiu = esjtqupxsvVar.zdlpuopuiu();
        boolean zVdvldrhtss = esjtqupxsvVar.jyumaefscl().vdvldrhtss();
        boolean z13 = false;
        v2.esjtqupxsv.zoijcleaow.iobyxmoadg iobyxmoadgVarWkgbmnqykc = new v2.esjtqupxsv.zoijcleaow.iobyxmoadg().zoijcleaow(zoijcleaowVar).wkgbmnqykc(4, !zPpxfxbqfkf).wkgbmnqykc(5, zKegysxyocb && !zPpxfxbqfkf).wkgbmnqykc(6, zHkdspvbjdz && !zPpxfxbqfkf).wkgbmnqykc(7, !zVdvldrhtss && (zHkdspvbjdz || !zJztzpxfvev || zKegysxyocb) && !zPpxfxbqfkf).wkgbmnqykc(8, zRgvfuqvkyq && !zPpxfxbqfkf).wkgbmnqykc(9, !zVdvldrhtss && (zRgvfuqvkyq || (zJztzpxfvev && zZdlpuopuiu)) && !zPpxfxbqfkf).wkgbmnqykc(10, !zPpxfxbqfkf).wkgbmnqykc(11, zKegysxyocb && !zPpxfxbqfkf);
        if (zKegysxyocb && !zPpxfxbqfkf) {
            z13 = true;
        }
        return iobyxmoadgVarWkgbmnqykc.wkgbmnqykc(12, z13).eablkybsjg();
    }

    public static int cqumvgiudr(byte[] bArr, int i13, int i14, int i15) {
        while (i13 < i14) {
            i15 = f123608vdvldrhtss[i15 ^ (bArr[i13] & KotlinVersion.MAX_COMPONENT_VALUE)];
            i13++;
        }
        return i15;
    }

    public static int crxdokpmqz(int i13) {
        if (i13 == 2 || i13 == 4) {
            return 6005;
        }
        if (i13 == 10) {
            return 6004;
        }
        if (i13 == 7) {
            return 6005;
        }
        if (i13 == 8) {
            return 6003;
        }
        switch (i13) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i13) {
                    case 24:
                    case C4007z9.F /* 25 */:
                    case C4007z9.G /* 26 */:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static List czzsidtyhn(int i13) {
        ArrayList arrayList = new ArrayList();
        if ((i13 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i13 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i13 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i13 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i13 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i13 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i13 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            arrayList.add("subtitle");
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            arrayList.add("sign");
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            arrayList.add("describes-video");
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            arrayList.add("describes-music");
        }
        if ((i13 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i13 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i13 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i13 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        if ((i13 & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    public static long d(long j13, long j14, long j15, RoundingMode roundingMode) {
        if (j13 == 0 || j14 == 0) {
            return 0L;
        }
        if (j15 >= j14 && j15 % j14 == 0) {
            return za.wkgbmnqykc.zoijcleaow(j13, za.wkgbmnqykc.zoijcleaow(j15, j14, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j15 < j14 && j14 % j15 == 0) {
            return za.wkgbmnqykc.wkgbmnqykc(j13, za.wkgbmnqykc.zoijcleaow(j14, j15, RoundingMode.UNNECESSARY));
        }
        if (j15 < j13 || j15 % j13 != 0) {
            return (j15 >= j13 || j13 % j15 != 0) ? e(j13, j14, j15, roundingMode) : za.wkgbmnqykc.wkgbmnqykc(j14, za.wkgbmnqykc.zoijcleaow(j13, j15, RoundingMode.UNNECESSARY));
        }
        return za.wkgbmnqykc.zoijcleaow(j14, za.wkgbmnqykc.zoijcleaow(j15, j13, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static void draadjrbmk(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int dsvhmnatus(ByteBuffer byteBuffer, int i13) {
        int i14 = byteBuffer.getInt(i13);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i14 : Integer.reverseBytes(i14);
    }

    public static boolean dvvnrvtcbc(int i13) {
        return i13 == 21 || i13 == 1342177280 || i13 == 22 || i13 == 1610612736 || i13 == 4;
    }

    public static Object[] dxjokdxxww(Object[] objArr) {
        return objArr;
    }

    private static long e(long j13, long j14, long j15, RoundingMode roundingMode) {
        long jWkgbmnqykc = za.wkgbmnqykc.wkgbmnqykc(j13, j14);
        if (jWkgbmnqykc != Long.MAX_VALUE && jWkgbmnqykc != Long.MIN_VALUE) {
            return za.wkgbmnqykc.zoijcleaow(jWkgbmnqykc, j15, roundingMode);
        }
        long jPpxfxbqfkf = za.wkgbmnqykc.ppxfxbqfkf(Math.abs(j14), Math.abs(j15));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jZoijcleaow = za.wkgbmnqykc.zoijcleaow(j14, jPpxfxbqfkf, roundingMode2);
        long jZoijcleaow2 = za.wkgbmnqykc.zoijcleaow(j15, jPpxfxbqfkf, roundingMode2);
        long jPpxfxbqfkf2 = za.wkgbmnqykc.ppxfxbqfkf(Math.abs(j13), Math.abs(jZoijcleaow2));
        long jZoijcleaow3 = za.wkgbmnqykc.zoijcleaow(j13, jPpxfxbqfkf2, roundingMode2);
        long jZoijcleaow4 = za.wkgbmnqykc.zoijcleaow(jZoijcleaow2, jPpxfxbqfkf2, roundingMode2);
        long jWkgbmnqykc2 = za.wkgbmnqykc.wkgbmnqykc(jZoijcleaow3, jZoijcleaow);
        if (jWkgbmnqykc2 != Long.MAX_VALUE && jWkgbmnqykc2 != Long.MIN_VALUE) {
            return za.wkgbmnqykc.zoijcleaow(jWkgbmnqykc2, jZoijcleaow4, roundingMode);
        }
        double d13 = jZoijcleaow3 * (jZoijcleaow / jZoijcleaow4);
        if (d13 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d13 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return za.iobyxmoadg.gxszxtbevo(d13, roundingMode);
    }

    public static int eablkybsjg(zdlpuopuiu zdlpuopuiuVar, long j13, boolean z13, boolean z14) {
        int i13;
        int iWkgbmnqykc = zdlpuopuiuVar.wkgbmnqykc() - 1;
        int i14 = 0;
        while (i14 <= iWkgbmnqykc) {
            int i15 = (i14 + iWkgbmnqykc) >>> 1;
            if (zdlpuopuiuVar.ppxfxbqfkf(i15) < j13) {
                i14 = i15 + 1;
            } else {
                iWkgbmnqykc = i15 - 1;
            }
        }
        if (z13 && (i13 = iWkgbmnqykc + 1) < zdlpuopuiuVar.wkgbmnqykc() && zdlpuopuiuVar.ppxfxbqfkf(i13) == j13) {
            return i13;
        }
        if (z14 && iWkgbmnqykc == -1) {
            return 0;
        }
        return iWkgbmnqykc;
    }

    public static Handler esjtqupxsv(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Object[] eslsurpljm(Object[] objArr, int i13, int i14) {
        iobyxmoadg.iobyxmoadg(i13 >= 0);
        iobyxmoadg.iobyxmoadg(i14 <= objArr.length);
        return Arrays.copyOfRange(objArr, i13, i14);
    }

    public static String ezmngbhpjk(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strEablkybsjg = xa.zoijcleaow.eablkybsjg(str);
        String str2 = l(strEablkybsjg, "-")[0];
        if (f123597draadjrbmk == null) {
            f123597draadjrbmk = cdpycssgdh();
        }
        String str3 = (String) f123597draadjrbmk.get(str2);
        if (str3 != null) {
            strEablkybsjg = str3 + strEablkybsjg.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? mhtqkkgtqm(strEablkybsjg) : strEablkybsjg;
    }

    public static void f(long[] jArr, long j13, long j14, RoundingMode roundingMode) {
        if (j13 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i13 = 0;
        if (j14 >= j13 && j14 % j13 == 0) {
            long jZoijcleaow = za.wkgbmnqykc.zoijcleaow(j14, j13, RoundingMode.UNNECESSARY);
            while (i13 < jArr.length) {
                jArr[i13] = za.wkgbmnqykc.zoijcleaow(jArr[i13], jZoijcleaow, roundingMode);
                i13++;
            }
            return;
        }
        if (j14 < j13 && j13 % j14 == 0) {
            long jZoijcleaow2 = za.wkgbmnqykc.zoijcleaow(j13, j14, RoundingMode.UNNECESSARY);
            while (i13 < jArr.length) {
                jArr[i13] = za.wkgbmnqykc.wkgbmnqykc(jArr[i13], jZoijcleaow2);
                i13++;
            }
            return;
        }
        for (int i14 = 0; i14 < jArr.length; i14++) {
            long j15 = jArr[i14];
            if (j15 != 0) {
                if (j14 >= j15 && j14 % j15 == 0) {
                    jArr[i14] = za.wkgbmnqykc.zoijcleaow(j13, za.wkgbmnqykc.zoijcleaow(j14, j15, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j14 >= j15 || j15 % j14 != 0) {
                    jArr[i14] = e(j15, j13, j14, roundingMode);
                } else {
                    jArr[i14] = za.wkgbmnqykc.wkgbmnqykc(j13, za.wkgbmnqykc.zoijcleaow(j15, j14, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static boolean fiwbwshyhd(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static ScheduledExecutorService fmlbqenlif(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: y2.wypolnanlu
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return stevsuqkhv.fyldjkxazc(str, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread fyldjkxazc(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static boolean g(v2.esjtqupxsv esjtqupxsvVar) {
        return (esjtqupxsvVar == null || !esjtqupxsvVar.kcexrzcfyt(1) || (esjtqupxsvVar.kcexrzcfyt(17) && esjtqupxsvVar.jyumaefscl().vdvldrhtss())) ? false : true;
    }

    public static boolean grlcpdaxtj(yadqdtsiqt yadqdtsiqtVar, yadqdtsiqt yadqdtsiqtVar2, Inflater inflater) {
        return yadqdtsiqtVar.iobyxmoadg() > 0 && yadqdtsiqtVar.btonecajqb() == 120 && roivzttewh(yadqdtsiqtVar, yadqdtsiqtVar2, inflater);
    }

    public static long gtknphoqwx(long j13, long j14) {
        return ((j13 + j14) - 1) / j14;
    }

    public static int gxszxtbevo(int[] iArr, int i13, boolean z13, boolean z14) {
        int i14;
        int i15;
        int iBinarySearch = Arrays.binarySearch(iArr, i13);
        if (iBinarySearch < 0) {
            i15 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i14 = iBinarySearch - 1;
                if (i14 < 0 || iArr[i14] != i13) {
                    break;
                }
                iBinarySearch = i14;
            }
            i15 = z13 ? iBinarySearch : i14;
        }
        return z14 ? Math.max(0, i15) : i15;
    }

    public static boolean h(v2.esjtqupxsv esjtqupxsvVar, boolean z13) {
        if (esjtqupxsvVar == null || !esjtqupxsvVar.iozdgvuglv() || esjtqupxsvVar.tzroggbefp() == 1 || esjtqupxsvVar.tzroggbefp() == 4) {
            return true;
        }
        return z13 && esjtqupxsvVar.yggfygwlhe() != 0;
    }

    public static AudioFormat hcddaimhww(int i13, int i14, int i15) {
        return new AudioFormat.Builder().setSampleRate(i13).setChannelMask(i14).setEncoding(i15).build();
    }

    public static String hkdspvbjdz(int i13) {
        if (i13 == 0) {
            return StringUtils.UNDEFINED;
        }
        if (i13 == 1) {
            return "original";
        }
        if (i13 == 2) {
            return "depth-linear";
        }
        if (i13 == 3) {
            return "depth-inverse";
        }
        if (i13 == 4) {
            return "depth metadata";
        }
        throw new IllegalStateException("Unsupported auxiliary track type");
    }

    public static boolean hszhottldk(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static void i(Throwable th2) throws Throwable {
        j(th2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    public static boolean igdgnonuha(Context context) {
        int i13 = f123602iobyxmoadg;
        if (i13 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i13 != 30) {
                if (i13 == 34) {
                }
                return false;
            }
            String str = Build.MODEL;
            if (!xa.zoijcleaow.iobyxmoadg(str, "moto g(20)") && !xa.zoijcleaow.iobyxmoadg(str, "rmx3231")) {
                if (i13 == 34 || !xa.zoijcleaow.iobyxmoadg(Build.MODEL, "sm-x200")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static long ikoacuggdj(long j13, float f13) {
        return f13 == 1.0f ? j13 : Math.round(j13 * ((double) f13));
    }

    public static String iozdgvuglv(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static int ipoelvxyzq(int[] iArr, int i13) {
        for (int i14 = 0; i14 < iArr.length; i14++) {
            if (iArr[i14] == i13) {
                return i14;
            }
        }
        return -1;
    }

    public static Handler istkbnxepw(Handler.Callback callback) {
        return esjtqupxsv(mbcevpiqjq(), callback);
    }

    public static int iwizpuwonk(byte[] bArr, int i13, int i14, int i15) {
        while (i13 < i14) {
            i15 = f123605ojitshcjhn[((i15 >>> 24) ^ (bArr[i13] & KotlinVersion.MAX_COMPONENT_VALUE)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i15 << 8);
            i13++;
        }
        return i15;
    }

    public static boolean iwxlajgraz(String str) {
        str.hashCode();
        switch (str) {
            case "image/avif":
                return f123602iobyxmoadg >= 34;
            case "image/heic":
            case "image/heif":
                return f123602iobyxmoadg >= 26;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    public static long ixidwrxhsl(long j13) {
        return (j13 == -9223372036854775807L || j13 == Long.MIN_VALUE) ? j13 : j13 * 1000;
    }

    public static boolean iyctptxqzt(v2.esjtqupxsv esjtqupxsvVar) {
        if (esjtqupxsvVar == null || !esjtqupxsvVar.kcexrzcfyt(1)) {
            return false;
        }
        esjtqupxsvVar.pause();
        return true;
    }

    private static void j(Throwable th2) throws Throwable {
        throw th2;
    }

    public static int jhduphickx(Context context) {
        return igdgnonuha(context) ? 1 : 5;
    }

    public static int jlmebxxoox(String str) {
        String[] strArrK;
        int length;
        if (str == null || (length = (strArrK = k(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrK[length - 1];
        boolean z13 = length >= 3 && "neg".equals(strArrK[length - 2]);
        try {
            int i13 = Integer.parseInt((String) iobyxmoadg.eablkybsjg(str2));
            return z13 ? -i13 : i13;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int jpowsppfya(int i13) {
        if (i13 == 10) {
            return f123602iobyxmoadg >= 32 ? 737532 : 6396;
        }
        if (i13 == 12) {
            return 743676;
        }
        if (i13 == 24) {
            return f123602iobyxmoadg >= 32 ? 67108860 : 0;
        }
        switch (i13) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return OrderServiceErrorHandlerImpl.ORDER_NOT_FOUND;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static ExecutorService jrbgnlbqoe(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: y2.dsvhmnatus
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return stevsuqkhv.ageimvtcrz(str, runnable);
            }
        });
    }

    private static int jyumaefscl(int i13, int i14) {
        return (f123607rgvfuqvkyq[(i13 ^ ((i14 >> 12) & KotlinVersion.MAX_COMPONENT_VALUE)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ ((i14 << 4) & 65535)) & 65535;
    }

    public static int jztzpxfvev(int i13) {
        if (i13 == 8) {
            return 3;
        }
        if (i13 == 16) {
            return 2;
        }
        if (i13 != 24) {
            return i13 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static String[] k(String str, String str2) {
        return str.split(str2, -1);
    }

    public static boolean kcexrzcfyt(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (f123602iobyxmoadg >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i13 = 0; i13 < size; i13++) {
            if (!Objects.equals(sparseArray.valueAt(i13), sparseArray2.get(sparseArray.keyAt(i13)))) {
                return false;
            }
        }
        return true;
    }

    public static Point kegysxyocb(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) iobyxmoadg.eablkybsjg((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return tzroggbefp(context, display);
    }

    public static boolean krqnebusok(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static String[] l(String str, String str2) {
        return str.split(str2, 2);
    }

    public static Handler lereixgezr() {
        return pmvmpeiblj(null);
    }

    public static String lmojexxdyd(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int lqeggnwhkg(long[] jArr, long j13, boolean z13, boolean z14) {
        int i13;
        int i14;
        int iBinarySearch = Arrays.binarySearch(jArr, j13);
        if (iBinarySearch < 0) {
            i14 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i13 = iBinarySearch - 1;
                if (i13 < 0 || jArr[i13] != j13) {
                    break;
                }
                iBinarySearch = i13;
            }
            i14 = z13 ? iBinarySearch : i13;
        }
        return z14 ? Math.max(0, i14) : i14;
    }

    public static boolean lrnfpwlwnk(v2.esjtqupxsv esjtqupxsvVar, boolean z13) {
        return h(esjtqupxsvVar, z13) ? weqkydbzbr(esjtqupxsvVar) : iyctptxqzt(esjtqupxsvVar);
    }

    public static boolean lxfrhoxuzk(int i13) {
        return i13 == 10 || i13 == 13;
    }

    public static String[] m(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : k(str.trim(), "(\\s*,\\s*)");
    }

    public static Looper mbcevpiqjq() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static int metgxyhuhe(int i13, int i14) {
        return wypolnanlu(i13) * i14;
    }

    private static String mhtqkkgtqm(String str) {
        int i13 = 0;
        while (true) {
            String[] strArr = f123595agtfadlqog;
            if (i13 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i13])) {
                return strArr[i13 + 1] + str.substring(strArr[i13].length());
            }
            i13 += 2;
        }
    }

    public static long n(long j13, long j14, long j15) {
        long j16 = j13 - j14;
        return ((j13 ^ j16) & (j14 ^ j13)) < 0 ? j15 : j16;
    }

    public static Locale ntlheqmsrt() {
        return f123602iobyxmoadg >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static Object nufgyqmvbu(Object obj) {
        return obj;
    }

    public static int nuxfzjnpeb(String str) {
        String strEablkybsjg = xa.zoijcleaow.eablkybsjg(str);
        strEablkybsjg.hashCode();
        switch (strEablkybsjg) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static boolean o(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    private static String oipsdeybqn(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e13) {
            kcexrzcfyt.wkgbmnqykc("Util", "Failed to read system property " + str, e13);
            return null;
        }
    }

    public static int ojitshcjhn(int i13, int i14, int i15) {
        return Math.max(i14, Math.min(i13, i15));
    }

    public static long okpsazkaxt(long j13) {
        return j13 == -9223372036854775807L ? System.currentTimeMillis() : j13 + SystemClock.elapsedRealtime();
    }

    public static byte[] opjhrmiecq(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static boolean oxmwwwfdhm(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static String p(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder(bArr.length * 2);
        for (int i13 = 0; i13 < bArr.length; i13++) {
            sb3.append(Character.forDigit((bArr[i13] >> 4) & 15, 16));
            sb3.append(Character.forDigit(bArr[i13] & 15, 16));
        }
        return sb3.toString();
    }

    public static int pkzmftpjix(int i13) {
        if (i13 == 20) {
            return 30;
        }
        if (i13 == 22) {
            return 31;
        }
        if (i13 == 30) {
            return 34;
        }
        switch (i13) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i13) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    public static Handler pmvmpeiblj(Handler.Callback callback) {
        return esjtqupxsv((Looper) iobyxmoadg.dxjokdxxww(Looper.myLooper()), callback);
    }

    public static long ppxfxbqfkf(long j13, long j14, long j15) {
        long j16 = j13 + j14;
        return ((j13 ^ j16) & (j14 ^ j16)) < 0 ? j15 : j16;
    }

    public static long q(int i13, int i14) {
        return r(i14) | (r(i13) << 32);
    }

    public static long r(int i13) {
        return ((long) i13) & 4294967295L;
    }

    public static long rgvfuqvkyq(long j13, long j14, long j15) {
        return Math.max(j14, Math.min(j13, j15));
    }

    public static Object[] rhgxfdycjh(Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, objArrCopyOf, objArr.length, objArr2.length);
        return objArrCopyOf;
    }

    public static String ribwqtqdhb(int i13) {
        if (i13 == 0) {
            return "NO";
        }
        if (i13 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i13 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i13 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i13 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static long rlfsiqarku(long j13, float f13) {
        return f13 == 1.0f ? j13 : Math.round(j13 / ((double) f13));
    }

    public static boolean roivzttewh(yadqdtsiqt yadqdtsiqtVar, yadqdtsiqt yadqdtsiqtVar2, Inflater inflater) {
        if (yadqdtsiqtVar.iobyxmoadg() <= 0) {
            return false;
        }
        if (yadqdtsiqtVar2.zoijcleaow() < yadqdtsiqtVar.iobyxmoadg()) {
            yadqdtsiqtVar2.ppxfxbqfkf(yadqdtsiqtVar.iobyxmoadg() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(yadqdtsiqtVar.eablkybsjg(), yadqdtsiqtVar.gxszxtbevo(), yadqdtsiqtVar.iobyxmoadg());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(yadqdtsiqtVar2.eablkybsjg(), iInflate, yadqdtsiqtVar2.zoijcleaow() - iInflate);
                if (inflater.finished()) {
                    yadqdtsiqtVar2.ulzqkzuiru(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == yadqdtsiqtVar2.zoijcleaow()) {
                        yadqdtsiqtVar2.ppxfxbqfkf(yadqdtsiqtVar2.zoijcleaow() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th2) {
                inflater.reset();
                throw th2;
            }
        }
    }

    public static String s(String str) {
        int length = str.length();
        int iEnd = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            if (str.charAt(i14) == '%') {
                i13++;
            }
        }
        if (i13 == 0) {
            return str;
        }
        int i15 = length - (i13 * 2);
        StringBuilder sb3 = new StringBuilder(i15);
        Matcher matcher = f123596btonecajqb.matcher(str);
        while (i13 > 0 && matcher.find()) {
            char c13 = (char) Integer.parseInt((String) iobyxmoadg.eablkybsjg(matcher.group(1)), 16);
            sb3.append((CharSequence) str, iEnd, matcher.start());
            sb3.append(c13);
            iEnd = matcher.end();
            i13--;
        }
        if (iEnd < length) {
            sb3.append((CharSequence) str, iEnd, length);
        }
        if (sb3.length() != i15) {
            return null;
        }
        return sb3.toString();
    }

    private static String[] sflfametgt() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f123602iobyxmoadg >= 24 ? zfvoamnweg(configuration) : new String[]{vipkmwdibw(configuration.locale)};
    }

    public static boolean skhdrjzrfn(int i13) {
        return i13 == 3 || i13 == 2 || i13 == 268435456 || i13 == 21 || i13 == 1342177280 || i13 == 22 || i13 == 1610612736 || i13 == 4;
    }

    public static Drawable sopmlzcsov(Context context, Resources resources, int i13) {
        return resources.getDrawable(i13, context.getTheme());
    }

    public static String stevsuqkhv(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return xa.zoijcleaow.gxszxtbevo(networkCountryIso);
            }
        }
        return xa.zoijcleaow.gxszxtbevo(Locale.getDefault().getCountry());
    }

    public static long t(long j13) {
        return (j13 == -9223372036854775807L || j13 == Long.MIN_VALUE) ? j13 : j13 / 1000;
    }

    public static int tbqsvytpvh(Uri uri, String str) {
        if (str == null) {
            return zeieaojujs(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static Point tzroggbefp(Context context, Display display) {
        if (display.getDisplayId() == 0 && hszhottldk(context)) {
            String strOipsdeybqn = f123602iobyxmoadg < 28 ? oipsdeybqn("sys.display-size") : oipsdeybqn("vendor.display-size");
            if (!TextUtils.isEmpty(strOipsdeybqn)) {
                try {
                    String[] strArrK = k(strOipsdeybqn.trim(), "x");
                    if (strArrK.length == 2) {
                        int i13 = Integer.parseInt(strArrK[0]);
                        int i14 = Integer.parseInt(strArrK[1]);
                        if (i13 > 0 && i14 > 0) {
                            return new Point(i13, i14);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                kcexrzcfyt.ppxfxbqfkf("Util", "Invalid display size: " + strOipsdeybqn);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f123602iobyxmoadg >= 23) {
            ulzqkzuiru(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    public static String uawqvzlxes(int i13) {
        return Integer.toString(i13, 36);
    }

    private static void ulzqkzuiru(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static List uwvvkdfqfp(int i13) {
        ArrayList arrayList = new ArrayList();
        if ((i13 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i13 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i13 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static boolean vdvldrhtss(SparseArray sparseArray, int i13) {
        return sparseArray.indexOfKey(i13) >= 0;
    }

    public static String vipkmwdibw(Locale locale) {
        return locale.toLanguageTag();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    public static boolean weqkydbzbr(v2.esjtqupxsv esjtqupxsvVar) {
        boolean z13 = false;
        if (esjtqupxsvVar == null) {
            return false;
        }
        int iTzroggbefp = esjtqupxsvVar.tzroggbefp();
        if (iTzroggbefp != 1 || !esjtqupxsvVar.kcexrzcfyt(2)) {
            if (iTzroggbefp == 4 && esjtqupxsvVar.kcexrzcfyt(4)) {
                esjtqupxsvVar.gxszxtbevo();
            }
            if (esjtqupxsvVar.kcexrzcfyt(1)) {
                return z13;
            }
            esjtqupxsvVar.play();
            return true;
        }
        esjtqupxsvVar.zoijcleaow();
        z13 = true;
        if (esjtqupxsvVar.kcexrzcfyt(1)) {
            return z13;
        }
        esjtqupxsvVar.play();
        return true;
    }

    public static int wflxmlrfwp(long j13, long j14) {
        if (j13 < j14) {
            return -1;
        }
        return j13 == j14 ? 0 : 1;
    }

    public static boolean wizcaqwiak(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static int wkgbmnqykc(long[] jArr, long j13, boolean z13, boolean z14) {
        int i13;
        int i14;
        int iBinarySearch = Arrays.binarySearch(jArr, j13);
        if (iBinarySearch < 0) {
            i14 = ~iBinarySearch;
        } else {
            while (true) {
                i13 = iBinarySearch + 1;
                if (i13 >= jArr.length || jArr[i13] != j13) {
                    break;
                }
                iBinarySearch = i13;
            }
            i14 = z13 ? iBinarySearch : i13;
        }
        return z14 ? Math.min(jArr.length - 1, i14) : i14;
    }

    public static String wwaezpbzkn(byte[] bArr, int i13, int i14) {
        return new String(bArr, i13, i14, StandardCharsets.UTF_8);
    }

    public static int wypolnanlu(int i13) {
        if (i13 != 2) {
            if (i13 == 3) {
                return 1;
            }
            if (i13 != 4) {
                if (i13 != 21) {
                    if (i13 != 22) {
                        if (i13 != 268435456) {
                            if (i13 != 1342177280) {
                                if (i13 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static androidx.media3.common.iobyxmoadg xrmfcynszj(int i13, int i14, int i15) {
        return new androidx.media3.common.iobyxmoadg.zoijcleaow().zeieaojujs("audio/raw").kegysxyocb(i14).nuxfzjnpeb(i15).oipsdeybqn(i13).cllcsxoeiz();
    }

    public static long yadqdtsiqt(long j13, int i13) {
        return d(j13, i13, 1000000L, RoundingMode.UP);
    }

    public static String[] ydmasvzmpa() {
        String[] strArrSflfametgt = sflfametgt();
        for (int i13 = 0; i13 < strArrSflfametgt.length; i13++) {
            strArrSflfametgt[i13] = ezmngbhpjk(strArrSflfametgt[i13]);
        }
        return strArrSflfametgt;
    }

    public static String yfnezrywwk(StringBuilder sb3, Formatter formatter, long j13) {
        if (j13 == -9223372036854775807L) {
            j13 = 0;
        }
        String str = j13 < 0 ? "-" : "";
        long jAbs = (Math.abs(j13) + 500) / 1000;
        long j14 = jAbs % 60;
        long j15 = (jAbs / 60) % 60;
        long j16 = jAbs / 3600;
        sb3.setLength(0);
        return j16 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j16), Long.valueOf(j15), Long.valueOf(j14)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j15), Long.valueOf(j14)).toString();
    }

    public static int yggfygwlhe(byte[] bArr, int i13, int i14, int i15) {
        while (i13 < i14) {
            int iZoijcleaow = com.google.common.primitives.dxjokdxxww.zoijcleaow(bArr[i13]);
            i15 = jyumaefscl(iZoijcleaow & 15, jyumaefscl(iZoijcleaow >> 4, i15));
            i13++;
        }
        return i15;
    }

    public static int ylkuphrtab(Context context) {
        return w2.eablkybsjg.ppxfxbqfkf(context).generateAudioSessionId();
    }

    public static Object[] yzdjzghtvl(Object[] objArr, int i13) {
        iobyxmoadg.iobyxmoadg(i13 <= objArr.length);
        return Arrays.copyOf(objArr, i13);
    }

    public static int zdlpuopuiu(SparseArray sparseArray) {
        if (f123602iobyxmoadg >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i13 = 0; i13 < sparseArray.size(); i13++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i13)) * 31) + Objects.hashCode(sparseArray.valueAt(i13));
        }
        return iKeyAt;
    }

    public static int zeieaojujs(Uri uri) {
        int iNuxfzjnpeb;
        String scheme = uri.getScheme();
        if (scheme != null && (xa.zoijcleaow.iobyxmoadg("rtsp", scheme) || xa.zoijcleaow.iobyxmoadg("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iNuxfzjnpeb = nuxfzjnpeb(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iNuxfzjnpeb;
        }
        Matcher matcher = f123600gtknphoqwx.matcher((CharSequence) iobyxmoadg.eablkybsjg(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    private static String[] zfvoamnweg(Configuration configuration) {
        return k(configuration.getLocales().toLanguageTags(), StringUtils.COMMA);
    }

    public static Handler zynmafqrjb() {
        return istkbnxepw(null);
    }
}
