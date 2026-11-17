package bz;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import t6.p1;

/* JADX INFO: loaded from: classes2.dex */
abstract class pmvmpeiblj extends metgxyhuhe implements e, p1 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    protected final Context f17571eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final t6.zdlpuopuiu f17572gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final TelephonyManager f17573lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final pc2.iobyxmoadg f17574nufgyqmvbu;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final String[] f17562dxjokdxxww = {t6.iwizpuwonk.iobyxmoadg(new byte[]{-84, -1, -48, -92, -118, -23, -114, -74, 3, -75, 42, 44, 26, -68, -43, -115}), t6.iwizpuwonk.iobyxmoadg(new byte[]{116, 38, -87, 19, -98, -89, -22, -99, 73, 63, -29, 63, 58, -55, -8, 10}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-78, -20, -104, 51, 12, 62, 73, -12, 103, 99, -100, 25, 54, -32, -79, 118}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-69, 50, 113, 99, 36, -13, -55, 50, -111, -14, 116, 126, -22, -90, 5, -115}), t6.iwizpuwonk.iobyxmoadg(new byte[]{86, -50, 17, 113, -128, -60, -105, -74, -49, -19, 101, 79, -21, -69, -27, 84}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-3, -99, 63, 100, -87, 18, -28, 11, -86, 115, 66, -118, 79, -12, -51, 116}), t6.iwizpuwonk.iobyxmoadg(new byte[]{123, 102, 83, 49, -91, -19, -4, -60, -76, 100, -55, 91, 47, -112, -71, -118}), t6.iwizpuwonk.iobyxmoadg(new byte[]{77, -51, 17, -108, 24, 99, 101, 40, -42, -39, -88, -118, 80, 105, -110, -104}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-76, -125, -35, 71, 114, 97, -72, -56, -17, -88, -45, 59, 81, -51, 32, 115}), t6.iwizpuwonk.iobyxmoadg(new byte[]{46, 35, -98, -105, -48, 112, 62, -32, -43, -79, -128, 98, 70, -105, -70, -85}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-86, 97, 83, 105, 104, -45, 1, 102, 21, 53, 34, 105, 56, 0, -13, -93}), t6.iwizpuwonk.iobyxmoadg(new byte[]{95, 73, -72, -67, -105, -72, -4, -39, 25, -92, -125, 39, 35, 18, -119, 66}), t6.iwizpuwonk.iobyxmoadg(new byte[]{120, -126, 37, 68, -80, -44, 41, -35, -24, -8, 59, 103, 113, 104, -64, -127}), t6.iwizpuwonk.iobyxmoadg(new byte[]{112, 52, -42, -116, 3, 6, -50, -113, 125, -91, -28, 7, 48, -21, 89, -121}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-117, 4, 104, 49, -14, 87, 116, 76, -4, 108, 19, 52, 29, 106, 22, -20}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-84, 22, 107, -78, 32, 78, 91, -63, 36, 80, -8, -66, 49, -10, -34, 101})};

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final String[] f17560btonecajqb = {t6.iwizpuwonk.iobyxmoadg(new byte[]{44, -16, -55, -128, -121, -46, -13, -37, -36, 111, -84, 24, -123, -78, 72, 23}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-90, -72, 6, -90, 18, -52, -84, -16, -49, 21, 94, 81, -118, -26, 52, -61, 28, -115, 16, -31, 98, -17, 10, 35, -86, -66, 12, -121, -15, 109, -79, 28}), t6.iwizpuwonk.iobyxmoadg(new byte[]{85, 42, 95, -93, 62, 10, 21, 119, 86, -103, -126, -91, -36, 81, -60, -104})};

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final String[] f17563gtknphoqwx = {t6.iwizpuwonk.iobyxmoadg(new byte[]{-117, -92, 67, 26, 110, 112, 53, -59, -51, -30, -98, 66, 119, 114, 105, 95})};

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final String[] f17561draadjrbmk = {t6.iwizpuwonk.iobyxmoadg(new byte[]{42, 49, -81, 24, 41, 73, -28, -19, -110, -26, 43, -83, 29, -21, -68, -81, 66, -93, -63, -25, -104, 36, 86, 78, 86, 93, 46, 100, 30, 50, 102, 70}), t6.iwizpuwonk.iobyxmoadg(new byte[]{87, 64, 12, -75, -84, -96, -2, -96, 35, 93, 41, -59, 90, 19, -74, -64, -101, -49, -119, 25, -97, -68, 4, 67, -128, 82, 42, 36, -117, 97, -88, 76})};

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final String[] f17569wflxmlrfwp = {t6.iwizpuwonk.iobyxmoadg(new byte[]{106, -70, 123, -6, -93, -43, 64, -107, -25, -16, -125, 80, 60, -99, 9, 101})};

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final String[] f17559agtfadlqog = {t6.iwizpuwonk.iobyxmoadg(new byte[]{-119, -85, 79, 2, -65, -2, 52, -89, 50, 105, 96, 72, -20, -69, 75, 126, -2, 4, -43, 27, -83, 105, 24, 24, 85, -77, 106, 76, 110, 22, 16, 108}), t6.iwizpuwonk.iobyxmoadg(new byte[]{123, 97, -110, 25, -51, 42, 14, -26, 119, -38, 31, 36, -107, 102, 4, 5})};

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static final String[] f17565ojitshcjhn = {t6.iwizpuwonk.iobyxmoadg(new byte[]{52, 90, 54, 119, -106, -15, 29, -81, -72, 66, -50, 95, 52, 95, -27, -63}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-71, 17, 44, -108, 13, -108, 115, 13, 116, 112, -6, -53, 57, 31, -3, -67})};

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final String[] f17567rgvfuqvkyq = {t6.iwizpuwonk.iobyxmoadg(new byte[]{-80, 48, 28, -4, -65, 102, -42, 112, -19, 59, 92, 114, 17, -119, -95, 102}), t6.iwizpuwonk.iobyxmoadg(new byte[]{6, -88, 87, -100, 47, -46, -29, 70, -83, 13, -74, 14, -86, -45, -50, -93}), t6.iwizpuwonk.iobyxmoadg(new byte[]{116, -23, -114, -11, 84, -126, 2, -49, 84, 85, 64, 98, -74, 77, 107, 53})};

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private static final String f17568vdvldrhtss = t6.iwizpuwonk.iobyxmoadg(new byte[]{52, -91, 68, 78, -18, 48, 29, 0, -5, -71, -50, -72, -66, 1, 118, -95});

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private static final zoijcleaow[] f17566oxmwwwfdhm = {new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{116, -66, -105, 109, 75, 103, 10, 91, 60, -73, -7, 20, -86, 90, -35, -35}), null), new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{1, -29, -62, -69, 32, -9, 19, 4, -67, 112, -59, 12, 93, 103, -71, -18, 21, 113, 34, -46, 65, -106, 121, -45, 72, 24, 1, -25, 62, -26, 115, 73}), null), new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{88, -121, 116, -69, -63, 86, -122, 7, -117, -16, -33, -98, -21, -52, 110, -35, 41, -8, -120, 13, -79, 78, 109, 124, 75, -116, -58, -115, -31, -14, -20, 27}), null), new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{-54, 18, 112, -59, 116, -109, -122, 11, 18, -105, 14, -52, 79, -55, -36, -39, 39, 18, 42, -16, 106, 96, 54, 83, 85, 31, -36, 68, -103, 28, 95, -59}), null), new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{-47, 43, 111, 21, 126, 50, 76, 74, 85, -63, 29, -63, 14, 70, -50, 54, -82, 64, -3, -51, 56, -16, 2, -37, 2, -39, -105, -48, -25, 23, 126, -69}), null), new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{-48, 106, 60, 16, -94, 15, 58, 1, 67, 88, 40, -9, -67, 19, -72, 51}), t6.iwizpuwonk.iobyxmoadg(new byte[]{98, -5, -86, 71, -20, 123, -27, 108, 30, 20, 65, 14, 49, -101, 51, -2})), new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{116, -26, 1, -26, 23, 120, 67, 113, -47, -103, 92, -41, -121, -62, -122, 2}), t6.iwizpuwonk.iobyxmoadg(new byte[]{98, -5, -86, 71, -20, 123, -27, 108, 30, 20, 65, 14, 49, -101, 51, -2})), new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{55, 40, 120, 84, -87, 15, 77, -42, 66, -123, -68, -67, -7, 67, 42, -121}), t6.iwizpuwonk.iobyxmoadg(new byte[]{106, -70, 123, -6, -93, -43, 64, -107, -25, -16, -125, 80, 60, -99, 9, 101})), new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{112, -43, -54, 72, -125, -115, 39, -75, -6, -86, -117, -120, 94, -59, 122, 8, 24, -58, -51, 7, 118, -125, 58, 127, -72, -98, -58, 50, 15, 126, 65, 42}), null), new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{47, -81, -51, -72, 97, -92, -44, 107, 123, 99, -57, -122, -35, 106, 127, -35, 35, 76, -55, 25, -11, -83, -114, -5, -59, -95, 3, -35, 48, -120, -92, 7}), null), new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{-28, -81, 24, -3, -31, -73, -90, -80, 118, -71, 36, 36, -121, -71, 79, 120}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-37, -20, -40, 1, 37, -39, 25, 107, -15, -101, 10, 45, 97, -64, 54, -54})), new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{76, 45, 38, 124, -9, -73, 125, -93, -90, 58, 44, 54, 11, -84, 74, 4, 15, -68, -28, -89, 3, -1, -105, 11, 28, -1, 32, 111, -23, 70, 45, 59}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-99, -121, -84, -49, 24, -63, -70, 65, -78, -110, 16, -124, -73, 105, -58, -54})), new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{54, -55, -59, -104, 78, 113, -91, 118, -124, -5, 39, 33, 86, -77, 40, -72, 84, -35, 119, 81, -53, 109, -18, -51, -9, 22, -79, 54, 16, -76, -27, 25}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-128, -127, -37, 64, -86, -118, 2, 56, -85, 94, -47, 46, -91, -44, -9, -81})), new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{-6, -74, 40, -35, -42, 24, -128, -30, -64, 38, -60, -79, 124, -121, 73, 81}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-128, -127, -37, 64, -86, -118, 2, 56, -85, 94, -47, 46, -91, -44, -9, -81})), new zoijcleaow(t6.iwizpuwonk.iobyxmoadg(new byte[]{39, -63, 105, 74, 23, 21, -39, 69, 50, 80, 77, 9, 35, -106, -80, 91}), null)};

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private static final String[] f17564kcexrzcfyt = {t6.iwizpuwonk.iobyxmoadg(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 55, -55, 114, -60, 54, 113, -46, 19, 119, -92, 71, 34, -26, 65, 8, -65, 120, -38, 42, -111, 4, -84, -68, -8, -77, -60, -123, 55, -8, 25, 17, 109}), t6.iwizpuwonk.iobyxmoadg(new byte[]{57, -49, 75, 81, 83, 69, 102, -98, 95, 21, -93, -125, 95, 109, -18, -10}), t6.iwizpuwonk.iobyxmoadg(new byte[]{96, -110, 25, -5, -106, 4, 18, 111, 52, 63, -55, -10, -101, 24, -76, -15})};

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final File[] f17570zdlpuopuiu = {new File(t6.iwizpuwonk.iobyxmoadg(new byte[]{-39, 26, -124, 86, -94, -95, 15, 11, -101, 51, -19, -55, -26, 69, 64, -86, 6, 50, -95, 82, -93, 72, 119, -66, 12, 27, -49, -27, 54, -86, -65, -89})), new File(t6.iwizpuwonk.iobyxmoadg(new byte[]{36, 94, -33, -91, 12, 81, -92, 87, -28, -48, -56, 91, -3, 122, -113, -52}))};

    class iobyxmoadg extends e.iobyxmoadg {
        iobyxmoadg(kc2.gxszxtbevo gxszxtbevoVar) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
        @Override // java.lang.Runnable
        public void run() {
            boolean zKegysxyocb;
            boolean zWypolnanlu = pmvmpeiblj.this.wypolnanlu();
            int iBooleanValue = zWypolnanlu;
            if (!zWypolnanlu) {
                zKegysxyocb = pmvmpeiblj.this.kegysxyocb();
            }
            if (iBooleanValue == 0) {
                iBooleanValue = zKegysxyocb;
                pmvmpeiblj pmvmpeibljVar = pmvmpeiblj.this;
                iBooleanValue = pmvmpeibljVar.ntlheqmsrt(pmvmpeibljVar.f17571eablkybsjg.getPackageManager()).booleanValue();
            }
            iBooleanValue = zKegysxyocb;
            pmvmpeiblj.this.btonecajqb(Integer.valueOf(iBooleanValue));
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final String f17576iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final String f17577zoijcleaow;

        zoijcleaow(String str, String str2) {
            this.f17576iobyxmoadg = str;
            this.f17577zoijcleaow = str2;
        }
    }

    pmvmpeiblj(Context context, t6.zdlpuopuiu zdlpuopuiuVar, TelephonyManager telephonyManager, pc2.iobyxmoadg iobyxmoadgVar) {
        super(kc2.lqeggnwhkg.Emulator);
        this.f17571eablkybsjg = context;
        this.f17572gxszxtbevo = zdlpuopuiuVar;
        this.f17573lqeggnwhkg = telephonyManager;
        this.f17574nufgyqmvbu = iobyxmoadgVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    private boolean dsvhmnatus() throws Throwable {
        Process processStart;
        String string;
        String[] strArrSplit;
        int length;
        int i13;
        String str;
        if (t6.skhdrjzrfn.iobyxmoadg(this.f17571eablkybsjg, "android.permission.INTERNET")) {
            String[] strArr = {t6.iwizpuwonk.iobyxmoadg(new byte[]{-79, -122, -62, 78, -94, -115, 6, -73, -64, -33, 95, 15, 2, -110, 79, 15, -108, -64, -100, -84, -13, 93, -106, -35, -63, -37, 43, 106, 38, -100, 77, 99})};
            StringBuilder sb3 = new StringBuilder();
            BufferedReader bufferedReader = null;
            try {
                try {
                    ProcessBuilder processBuilder = new ProcessBuilder(strArr);
                    processBuilder.directory(new File(t6.iwizpuwonk.iobyxmoadg(new byte[]{9, 7, 58, 38, -116, -116, -59, 33, -29, 48, -23, 52, -35, -55, 18, 28})));
                    processBuilder.redirectErrorStream(true);
                    processStart = processBuilder.start();
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processStart.getInputStream()));
                        while (true) {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb3.append(line);
                                sb3.append('\n');
                            } catch (Exception unused) {
                                bufferedReader = bufferedReader2;
                                fyldjkxazc.iobyxmoadg(processStart);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                } else {
                                    string = sb3.toString();
                                    if (!TextUtils.isEmpty(string)) {
                                        strArrSplit = string.split(t6.iwizpuwonk.iobyxmoadg(new byte[]{119, -84, -4, -113, -80, -60, -101, 120, 83, 0, 125, 90, -91, 113, -38, -62}));
                                        length = strArrSplit.length;
                                        for (i13 = 0; i13 < length; i13++) {
                                            str = strArrSplit[i13];
                                            return str.contains("wlan0") ? true : true;
                                        }
                                    }
                                }
                                return false;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                fyldjkxazc.iobyxmoadg(processStart);
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        }
                        fyldjkxazc.iobyxmoadg(processStart);
                        bufferedReader2.close();
                    } catch (Exception unused3) {
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException unused4) {
                }
            } catch (Exception unused5) {
                processStart = null;
            } catch (Throwable th4) {
                th = th4;
                processStart = null;
            }
            string = sb3.toString();
            if (!TextUtils.isEmpty(string)) {
                strArrSplit = string.split(t6.iwizpuwonk.iobyxmoadg(new byte[]{119, -84, -4, -113, -80, -60, -101, 120, 83, 0, 125, 90, -91, 113, -38, -62}));
                length = strArrSplit.length;
                while (i13 < length) {
                    str = strArrSplit[i13];
                    if ((str.contains("wlan0") && !str.contains("tunl0") && !str.contains("eth0")) || !str.contains(f17568vdvldrhtss)) {
                    }
                }
            }
        }
        return false;
    }

    private boolean hcddaimhww() throws Throwable {
        int i13 = 0;
        for (zoijcleaow zoijcleaowVar : f17566oxmwwwfdhm) {
            String strSopmlzcsov = sopmlzcsov(zoijcleaowVar);
            if (strSopmlzcsov != null) {
                String str = zoijcleaowVar.f17577zoijcleaow;
                if (str == null) {
                    i13++;
                }
                if (str != null && strSopmlzcsov.contains(str)) {
                    i13++;
                }
            }
        }
        return i13 >= 5;
    }

    private boolean hkdspvbjdz() {
        if (this.f17573lqeggnwhkg != null && t6.skhdrjzrfn.iobyxmoadg(this.f17571eablkybsjg, t6.ppxfxbqfkf.READ_PHONE_STATE.iobyxmoadg())) {
            String subscriberId = this.f17573lqeggnwhkg.getSubscriberId();
            for (String str : f17563gtknphoqwx) {
                if (str.equalsIgnoreCase(subscriberId)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean iozdgvuglv() {
        if (this.f17573lqeggnwhkg != null && t6.skhdrjzrfn.iobyxmoadg(this.f17571eablkybsjg, t6.ppxfxbqfkf.READ_PHONE_STATE.iobyxmoadg())) {
            String deviceId = this.f17573lqeggnwhkg.getDeviceId();
            for (String str : f17560btonecajqb) {
                if (str.equalsIgnoreCase(deviceId)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean jlmebxxoox(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (new File(str2).exists()) {
                return true;
            }
        }
        return false;
    }

    private boolean jpowsppfya() {
        for (File file : f17570zdlpuopuiu) {
            if (file.exists() && file.canRead()) {
                StringBuilder sb3 = new StringBuilder();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb3.append(line);
                            sb3.append('\n');
                        } catch (Throwable th2) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                        continue;
                    }
                    bufferedReader.close();
                    String string = sb3.toString();
                    for (String str : f17569wflxmlrfwp) {
                        if (string.contains(str)) {
                            return true;
                        }
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean kegysxyocb() {
        return tzroggbefp() || jlmebxxoox(f17561draadjrbmk, t6.iwizpuwonk.iobyxmoadg(new byte[]{-116, 89, -114, 50, -71, -64, -111, -60, 89, 25, -38, 86, -112, 62, 115, 34})) || jlmebxxoox(f17565ojitshcjhn, t6.iwizpuwonk.iobyxmoadg(new byte[]{102, -78, -29, 0, 34, -98, -62, 84, 87, -100, -99, 22, 105, 93, -57, 90})) || jlmebxxoox(f17567rgvfuqvkyq, t6.iwizpuwonk.iobyxmoadg(new byte[]{-94, -59, 91, -11, -127, 118, -121, -39, -65, 0, 66, -11, -21, -79, 127, -22})) || jpowsppfya() || jlmebxxoox(f17559agtfadlqog, t6.iwizpuwonk.iobyxmoadg(new byte[]{-59, -128, 25, 109, 79, -68, 94, 49, 4, 51, -90, -103, 34, 113, 95, 123})) || dsvhmnatus() || hcddaimhww();
    }

    private boolean lmojexxdyd() {
        if (this.f17573lqeggnwhkg != null && t6.skhdrjzrfn.iobyxmoadg(this.f17571eablkybsjg, t6.ppxfxbqfkf.READ_PHONE_STATE.iobyxmoadg()) && t6.skhdrjzrfn.iobyxmoadg(this.f17571eablkybsjg, t6.ppxfxbqfkf.READ_PHONE_NUMBERS.iobyxmoadg())) {
            String line1Number = this.f17573lqeggnwhkg.getLine1Number();
            for (String str : f17562dxjokdxxww) {
                if (str.equalsIgnoreCase(line1Number)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean mbcevpiqjq() {
        TelephonyManager telephonyManager = this.f17573lqeggnwhkg;
        return telephonyManager != null && telephonyManager.getNetworkOperatorName().equalsIgnoreCase(ConstantDeviceInfo.APP_PLATFORM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean ntlheqmsrt(final PackageManager packageManager) {
        return (Boolean) vdvldrhtss(new Callable() { // from class: bz.lereixgezr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return pmvmpeiblj.ylkuphrtab(packageManager);
            }
        });
    }

    private String sopmlzcsov(zoijcleaow zoijcleaowVar) throws Throwable {
        Process processExec;
        Process process = null;
        str = null;
        String str = null;
        try {
            processExec = Runtime.getRuntime().exec(t6.iwizpuwonk.iobyxmoadg(new byte[]{-119, 75, -21, -56, 44, -83, -110, 69, -89, 53, -33, 57, -62, -25, 90, 44}) + zoijcleaowVar.f17576iobyxmoadg);
            try {
                String line = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine();
                if (line != null && line.length() > 0) {
                    str = line;
                }
                fyldjkxazc.iobyxmoadg(processExec);
                return str;
            } catch (IOException unused) {
                fyldjkxazc.iobyxmoadg(processExec);
                return null;
            } catch (Throwable th2) {
                process = processExec;
                th = th2;
                fyldjkxazc.iobyxmoadg(process);
                throw th;
            }
        } catch (IOException unused2) {
            processExec = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean stevsuqkhv() {
        if (Build.VERSION.SDK_INT > 28) {
            return false;
        }
        final PackageManager packageManager = this.f17571eablkybsjg.getPackageManager();
        Boolean bool = (Boolean) vdvldrhtss(new Callable() { // from class: bz.esjtqupxsv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return pmvmpeiblj.wwaezpbzkn(packageManager);
            }
        });
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    private boolean tzroggbefp() {
        if (t6.skhdrjzrfn.iobyxmoadg(this.f17571eablkybsjg, t6.ppxfxbqfkf.READ_PHONE_STATE.iobyxmoadg()) && stevsuqkhv()) {
            return lmojexxdyd() || iozdgvuglv() || hkdspvbjdz() || mbcevpiqjq();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean wwaezpbzkn(PackageManager packageManager) {
        return Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.telephony"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x0161  */
    public boolean wypolnanlu() {
        boolean z13;
        String str = Build.FINGERPRINT;
        if (str.contains(t6.iwizpuwonk.iobyxmoadg(new byte[]{46, -75, 23, -45, 33, -60, 30, 56, -84, 84, 93, 64, 89, 61, -79, 72})) || str.startsWith(t6.iwizpuwonk.iobyxmoadg(new byte[]{-99, -121, -84, -49, 24, -63, -70, 65, -78, -110, 16, -124, -73, 105, -58, -54}))) {
            z13 = true;
        } else {
            String str2 = Build.MODEL;
            if (str2.contains(t6.iwizpuwonk.iobyxmoadg(new byte[]{67, -54, 21, 29, 79, 29, -29, 31, 67, 59, 123, -6, 16, 61, -2, -23}))) {
                z13 = true;
            } else {
                Locale locale = Locale.ROOT;
                if (str2.toLowerCase(locale).contains(t6.iwizpuwonk.iobyxmoadg(new byte[]{-25, -66, 119, -23, -48, -89, 93, -14, -76, 113, -98, -13, -40, 73, -70, 119})) || str2.contains(t6.iwizpuwonk.iobyxmoadg(new byte[]{-116, -90, 16, 82, 50, 64, -17, -120, -18, -126, -109, -74, 116, -28, 117, -105})) || str2.contains(t6.iwizpuwonk.iobyxmoadg(new byte[]{46, -75, 23, -45, 33, -60, 30, 56, -84, 84, 93, 64, 89, 61, -79, 72})) || str2.contains(t6.iwizpuwonk.iobyxmoadg(new byte[]{-81, 98, -84, -34, -98, -80, 64, 64, 35, -52, -30, -46, -3, 62, 35, 46, -92, 0, -108, -63, 84, -31, -59, -34, -95, -36, 81, -21, 7, -67, 15, -19})) || Build.MANUFACTURER.contains(t6.iwizpuwonk.iobyxmoadg(new byte[]{114, 94, -72, 57, -33, -20, 49, 80, -67, -35, -113, -73, 93, -77, 119, 54}))) {
                    z13 = true;
                } else {
                    String str3 = Build.HARDWARE;
                    if (str3.equals(t6.iwizpuwonk.iobyxmoadg(new byte[]{106, -70, 123, -6, -93, -43, 64, -107, -25, -16, -125, 80, 60, -99, 9, 101})) || str3.equals(t6.iwizpuwonk.iobyxmoadg(new byte[]{39, -11, -6, -60, -106, 113, 97, 92, 97, 116, 56, -97, -82, 89, 121, -95})) || Build.DEVICE.equals(t6.iwizpuwonk.iobyxmoadg(new byte[]{-38, -96, -84, 11, 96, -110, -91, -60, -127, -11, -41, -43, -29, 84, -78, -35}))) {
                        z13 = true;
                    } else {
                        String str4 = Build.PRODUCT;
                        if (str4.equals(t6.iwizpuwonk.iobyxmoadg(new byte[]{-128, -127, -37, 64, -86, -118, 2, 56, -85, 94, -47, 46, -91, -44, -9, -81})) || str4.equals(t6.iwizpuwonk.iobyxmoadg(new byte[]{67, -54, 21, 29, 79, 29, -29, 31, 67, 59, 123, -6, 16, 61, -2, -23})) || str4.equals(t6.iwizpuwonk.iobyxmoadg(new byte[]{124, -64, -46, -36, 102, -16, -29, 46, -60, -12, -21, 73, 126, -85, -36, -43})) || str4.equals(t6.iwizpuwonk.iobyxmoadg(new byte[]{-20, 15, -50, 33, 49, -12, 116, -110, 48, -2, 76, 113, 20, 110, 98, -68})) || Build.BOARD.toLowerCase(locale).contains(t6.iwizpuwonk.iobyxmoadg(new byte[]{126, 37, -71, -45, 21, -69, -102, -80, -73, -111, -5, -71, 29, -40, 15, 55})) || Build.BOOTLOADER.toLowerCase(locale).contains(t6.iwizpuwonk.iobyxmoadg(new byte[]{126, 37, -71, -45, 21, -69, -102, -80, -73, -111, -5, -71, 29, -40, 15, 55})) || str3.toLowerCase(locale).contains(t6.iwizpuwonk.iobyxmoadg(new byte[]{126, 37, -71, -45, 21, -69, -102, -80, -73, -111, -5, -71, 29, -40, 15, 55})) || str4.toLowerCase(locale).contains(t6.iwizpuwonk.iobyxmoadg(new byte[]{126, 37, -71, -45, 21, -69, -102, -80, -73, -111, -5, -71, 29, -40, 15, 55})) || Build.SERIAL.toLowerCase(locale).contains(t6.iwizpuwonk.iobyxmoadg(new byte[]{126, 37, -71, -45, 21, -69, -102, -80, -73, -111, -5, -71, 29, -40, 15, 55}))) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                }
            }
        }
        if (z13) {
            return z13;
        }
        return Build.BRAND.startsWith(t6.iwizpuwonk.iobyxmoadg(new byte[]{-99, -121, -84, -49, 24, -63, -70, 65, -78, -110, 16, -124, -73, 105, -58, -54})) && Build.DEVICE.startsWith(t6.iwizpuwonk.iobyxmoadg(new byte[]{-99, -121, -84, -49, 24, -63, -70, 65, -78, -110, 16, -124, -73, 105, -58, -54}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean ylkuphrtab(PackageManager packageManager) {
        for (String str : f17564kcexrzcfyt) {
            try {
                packageManager.getPackageInfo(str, UserVerificationMethods.USER_VERIFY_PATTERN);
                return Boolean.TRUE;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return Boolean.FALSE;
    }

    @Override // bz.e
    public e.iobyxmoadg agtfadlqog(kc2.gxszxtbevo gxszxtbevoVar) {
        return new iobyxmoadg(gxszxtbevoVar);
    }

    protected Integer cllcsxoeiz() throws jrbgnlbqoe {
        Integer num = (Integer) ppxfxbqfkf();
        if (num != null) {
            return num;
        }
        ojitshcjhn(null);
        throw new jrbgnlbqoe(t6.iwizpuwonk.iobyxmoadg(new byte[]{-103, -75, 14, 84, 69, -13, 108, -7, -111, 8, -91, -65, 8, 77, 23, 37, -119, -24, -98, -123, -58, 2, 22, -11, -46, -113, -60, -89, 96, 60, 110, -110}));
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17572gxszxtbevo;
    }

    @Override // t6.p1
    public pc2.iobyxmoadg zoijcleaow() {
        return this.f17574nufgyqmvbu;
    }
}
