package bz;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class ribwqtqdhb extends metgxyhuhe {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final t6.hcddaimhww f17589btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final t6.h0 f17590dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Handler f17591eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Map f17592gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Context f17593lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final kc2.eablkybsjg f17594nufgyqmvbu;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final kc2.lqeggnwhkg f17584gtknphoqwx = kc2.lqeggnwhkg.Compromised;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final long f17583draadjrbmk = TimeUnit.SECONDS.toMillis(3);

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    static final String[] f17588wflxmlrfwp = {t6.iwizpuwonk.iobyxmoadg(new byte[]{3, -39, 62, -26, 54, 2, 103, 50, 34, 60, 32, 88, -96, 101, -28, -11, 50, 106, 45, 54, 82, -121, -55, -116, -95, -13, -32, -97, 41, 7, -48, -85}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-45, 57, -106, 12, 60, 110, -12, -5, 32, -3, 72, -27, -88, -60, -23, 75}), t6.iwizpuwonk.iobyxmoadg(new byte[]{16, 110, 9, -65, -56, -30, 27, 30, 53, -127, -36, -19, 17, -11, 71, 115}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-87, -5, 83, 124, 109, 98, 39, -21, 99, -23, -91, 34, -9, -36, 5, -6, 25, 115, 70, -65, 81, 16, -118, -88, 57, 123, 36, -98, 43, -40, -96, 106}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-83, 66, 28, -25, -10, 6, 79, 17, -4, -13, -87, 87, -47, -7, -2, -103}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-125, 63, 81, -37, 99, 80, -105, -15, -34, 72, 40, 32, 81, 118, -33, -67, -1, -73, -6, -121, -127, -80, -45, 31, -80, 71, 60, 109, 43, 87, 7, -52}), t6.iwizpuwonk.iobyxmoadg(new byte[]{31, 88, 65, -119, -69, -38, 97, 51, -49, -100, 49, -110, 9, -99, 105, -30, 0, -5, -115, -69, -91, -56, -66, 83, 76, -118, 54, 10, 2, -68, 97, -48}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-56, 35, 86, -36, -54, -78, 27, -39, -19, 113, -76, 54, -126, 30, 86, 18, 19, -93, -43, 51, -56, 75, -61, 97, -8, -122, 30, 8, -122, -74, 124, -61}), t6.iwizpuwonk.iobyxmoadg(new byte[]{11, 109, -31, 38, -77, 97, 12, 20, 127, 37, 38, 8, -45, 93, 20, -99, 2, -28, -109, -91, -84, 38, 62, 112, -79, -2, 25, -45, -79, 64, 3, 118}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-108, 55, -41, -40, -71, -38, 31, -28, 92, -82, 80, 9, 78, 5, 60, -37, 100, 57, 15, 23, 62, -35, 66, -14, 70, 55, 4, 49, -2, -69, -6, 64}), t6.iwizpuwonk.iobyxmoadg(new byte[]{38, 88, 75, 39, -35, 47, 99, -33, -126, 10, -111, -78, 76, -94, -95, -57}), t6.iwizpuwonk.iobyxmoadg(new byte[]{21, -67, 125, -12, 6, 126, -123, 30, 64, -111, 57, 17, 59, -33, -85, 98}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-94, 83, 96, -13, 121, 4, -115, 87, -60, -16, -112, 94, -9, -26, 82, 66, 62, 127, -126, -81, 109, 47, -7, 78, 25, 32, 88, -49, -75, -29, 82, 22, -42, -49, -14, 79, 108, 99, 11, -111, -11, -92, 16, -100, -63, -63, -11, -73}), t6.iwizpuwonk.iobyxmoadg(new byte[]{69, -95, -30, -23, -30, -92, 123, -57, 37, 84, 81, -75, 4, -4, -75, -59, -51, 41, 99, 65, 50, -29, 32, 0, -101, -18, 119, -22, 88, -17, -27, -78}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-48, -22, -24, -115, -51, 103, 48, 57, -97, -53, -93, -37, 26, -84, -76, 76}), t6.iwizpuwonk.iobyxmoadg(new byte[]{18, 51, -35, 12, -70, -22, 125, 118, 59, -13, 54, 99, -59, -32, 22, 69}), t6.iwizpuwonk.iobyxmoadg(new byte[]{122, -75, -11, 51, -82, -107, -104, -2, 114, -26, 118, 39, 63, 105, 47, -30})};

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    static final String f17582agtfadlqog = t6.iwizpuwonk.iobyxmoadg(new byte[]{-119, 80, -111, 74, -8, -86, -114, 13, -45, 14, -71, 108, 49, 28, 16, 59});

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    static final String f17585ojitshcjhn = t6.iwizpuwonk.iobyxmoadg(new byte[]{119, 46, -125, -99, 6, -101, 66, 116, -82, -93, -115, 41, 116, -87, -9, 59});

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final String[] f17586rgvfuqvkyq = {t6.iwizpuwonk.iobyxmoadg(new byte[]{66, 54, -12, 63, -112, -100, -10, 15, 52, -13, -120, 89, 84, 38, 9, -114}), t6.iwizpuwonk.iobyxmoadg(new byte[]{105, -20, -30, -111, 58, 42, 104, 37, 29, 85, -118, 13, 109, 116, 18, 3}), t6.iwizpuwonk.iobyxmoadg(new byte[]{102, 105, 77, 8, 56, 99, 48, 15, -67, 5, -12, 56, -18, -59, 111, 116, 120, -51, -34, 111, 86, 50, 83, 91, 91, -65, -52, 84, 3, -28, -72, 44}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-59, -69, -85, 85, -60, -105, 71, 3, 72, -41, 32, 118, 2, 74, -80, -3, -41, 127, 67, 14, -36, 123, 17, 102, 116, 54, -83, -24, 57, 92, 104, -48}), t6.iwizpuwonk.iobyxmoadg(new byte[]{86, 110, 56, -107, 87, 67, 81, 119, 44, 97, -128, 120, 64, 111, 110, -117}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-116, -14, 64, 124, -94, -122, 58, 66, -15, -121, 42, -67, -97, 0, 85, -64}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-65, 79, 105, -19, 67, 57, -56, 99, 119, 74, -69, 9, 84, 51, 121, -115})};

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private static int f17587vdvldrhtss = -1;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'jyumaefscl' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class iobyxmoadg {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ iobyxmoadg[] f17595cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public static final iobyxmoadg f17596iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public static final iobyxmoadg f17597jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f17598yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f17599zdlpuopuiu;

        static {
            String strIobyxmoadg = t6.iwizpuwonk.iobyxmoadg(new byte[]{-96, -38, -48, -60, 29, 123, -100, 3, -30, 50, -77, 91, -84, 95, -56, 16, 28, 107, -26, 6, 83, -120, 47, 16, -19, 94, -38, 22, -50, 20, 90, -108});
            String str = ribwqtqdhb.f17582agtfadlqog;
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg("SearchSuBinary", 0, strIobyxmoadg, str);
            f17597jyumaefscl = iobyxmoadgVar;
            iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg("SearchSuBinaryX", 1, t6.iwizpuwonk.iobyxmoadg(new byte[]{-115, -62, 82, 118, 88, -72, 96, -113, -69, -12, 23, -115, 89, -41, 101, -77, 114, 79, 42, 88, -31, -93, -74, 124, 71, -103, 127, -111, -74, -85, 70, -68}), str);
            f17596iwizpuwonk = iobyxmoadgVar2;
            f17595cqumvgiudr = new iobyxmoadg[]{iobyxmoadgVar, iobyxmoadgVar2};
        }

        private iobyxmoadg(String str, int i13, String str2, String str3) {
            super(str, i13);
            this.f17599zdlpuopuiu = str2;
            this.f17598yggfygwlhe = str3;
        }

        public static iobyxmoadg valueOf(String str) {
            return (iobyxmoadg) Enum.valueOf(iobyxmoadg.class, str);
        }

        public static iobyxmoadg[] values() {
            return (iobyxmoadg[]) f17595cqumvgiudr.clone();
        }

        static List wkgbmnqykc(iobyxmoadg iobyxmoadgVar) {
            Process processExec;
            ArrayList arrayList = new ArrayList(0);
            try {
                processExec = Runtime.getRuntime().exec(new String[]{iobyxmoadgVar.f17599zdlpuopuiu, iobyxmoadgVar.f17598yggfygwlhe});
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        arrayList.add(line);
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                processExec = null;
            }
            fyldjkxazc.iobyxmoadg(processExec);
            return arrayList;
        }

        public String iobyxmoadg() {
            return this.f17599zdlpuopuiu;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    enum ppxfxbqfkf {
        WorkerThread,
        MainThread
    }

    private enum zoijcleaow {
        TwiceZygoteInit(t6.iwizpuwonk.iobyxmoadg(new byte[]{61, -96, 51, 107, -38, -22, -45, 49, -74, 59, 16, -81, 70, 81, -127, 47, 85, 75, -104, 63, -110, 76, -54, -126, 54, -84, -90, -81, -10, -39, 69, 78, 83, 30, 61, 44, 117, 84, 24, -42, 84, 26, 118, -65, 14, 74, 72, 77}), t6.iwizpuwonk.iobyxmoadg(new byte[]{57, 113, -35, -27, -115, -45, -57, -75, -111, 90, -74, 36, -56, 66, 57, -73}), true),
        Xposed(t6.iwizpuwonk.iobyxmoadg(new byte[]{-58, 23, 52, -115, 53, 44, 88, -82, 46, -70, -38, -29, 40, -20, 111, 72, -22, 61, -14, 110, 36, -12, 61, -15, 2, -41, -17, 63, 59, -23, 85, -26}), t6.iwizpuwonk.iobyxmoadg(new byte[]{78, -81, 51, -90, -125, -127, 57, 40, -22, 40, 85, -29, 115, -52, 88, 112}), false),
        CydiaSubstrate(t6.iwizpuwonk.iobyxmoadg(new byte[]{103, -111, 95, -10, 15, 81, 87, -89, 37, -47, 121, 104, -32, -102, 46, -43, -61, 112, 77, -64, -54, -15, -127, 39, -14, -46, -99, 63, 47, 37, -75, 102}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-101, 93, 66, 68, 63, -23, 57, 114, -90, -111, -29, 107, -14, 20, 112, 121}), false);


        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final boolean f17607jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f17608yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f17609zdlpuopuiu;

        zoijcleaow(String str, String str2, boolean z13) {
            this.f17609zdlpuopuiu = str;
            this.f17608yggfygwlhe = str2;
            this.f17607jyumaefscl = z13;
        }

        static boolean iobyxmoadg(zoijcleaow zoijcleaowVar, String str, String str2) {
            boolean zEquals = zoijcleaowVar.f17607jyumaefscl ? str.equals(zoijcleaowVar.f17609zdlpuopuiu) : str.contains(zoijcleaowVar.f17609zdlpuopuiu);
            return (zEquals || str2 == null || zoijcleaowVar.f17608yggfygwlhe.isEmpty()) ? zEquals : str2.toLowerCase(Locale.ROOT).contains(zoijcleaowVar.f17608yggfygwlhe);
        }
    }

    ribwqtqdhb(Context context, kc2.eablkybsjg eablkybsjgVar, t6.rlfsiqarku rlfsiqarkuVar, t6.zfvoamnweg zfvoamnwegVar, t6.h0 h0Var, t6.hcddaimhww hcddaimhwwVar) {
        super(f17584gtknphoqwx);
        this.f17591eablkybsjg = new Handler(Looper.getMainLooper());
        this.f17592gxszxtbevo = new ConcurrentHashMap(ppxfxbqfkf.values().length);
        this.f17593lqeggnwhkg = context;
        this.f17594nufgyqmvbu = eablkybsjgVar;
        this.f17590dxjokdxxww = h0Var;
        this.f17589btonecajqb = hcddaimhwwVar;
    }

    private boolean cllcsxoeiz() {
        Iterator it = hcddaimhww(Process.myPid()).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            String str = (String) it.next();
            if (str != null) {
                String strTrim = str.toLowerCase(Locale.ROOT).trim();
                for (String str2 : f17586rgvfuqvkyq) {
                    if (strTrim.contains(str2)) {
                        return true;
                    }
                }
            }
        }
    }

    private t6.wwaezpbzkn crxdokpmqz() {
        if (ulzqkzuiru()) {
            return this.f17590dxjokdxxww.iobyxmoadg();
        }
        return null;
    }

    private zone.bi.mobile.fingerprint.impl.cs.zoijcleaow dsvhmnatus() {
        if (ulzqkzuiru()) {
            return this.f17590dxjokdxxww.gxszxtbevo(this.f17593lqeggnwhkg);
        }
        return null;
    }

    private static Set hcddaimhww(int i13) {
        HashSet hashSet = new HashSet();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(String.format(Locale.ROOT, t6.iwizpuwonk.iobyxmoadg(new byte[]{-95, -19, -128, -97, 108, -10, -24, -43, -128, -88, -46, 29, 94, 37, -97, 30}), Integer.valueOf(i13)))));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (line.endsWith(".so") || line.endsWith(".jar")) {
                        hashSet.add(line.substring(line.lastIndexOf(t6.iwizpuwonk.iobyxmoadg(new byte[]{91, -119, -16, -117, -91, -64, 2, 25, 94, -21, -40, -106, -36, 105, -23, -34})) + 1));
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            bufferedReader.close();
        } catch (IOException unused) {
        }
        return hashSet;
    }

    private static boolean ikoacuggdj(String str) {
        return Files.exists(Paths.get(str, new String[0]), new LinkOption[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void jhduphickx(int[] iArr, zone.bi.mobile.fingerprint.impl.cs.zoijcleaow zoijcleaowVar, CountDownLatch countDownLatch, int i13) {
        iArr[0] = i13;
        zoijcleaowVar.iobyxmoadg();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jlmebxxoox(ppxfxbqfkf ppxfxbqfkfVar, CountDownLatch countDownLatch) {
        this.f17592gxszxtbevo.put(ppxfxbqfkfVar, ntlheqmsrt());
        countDownLatch.countDown();
    }

    private void jpowsppfya(String str) {
        this.f17589btonecajqb.gxszxtbevo(f17584gtknphoqwx, kc2.nufgyqmvbu.zoijcleaow.Warning, str, 7);
    }

    private boolean kegysxyocb() {
        if (!pkzmftpjix()) {
            ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.WorkerThread;
            if (((EnumSet) this.f17592gxszxtbevo.get(ppxfxbqfkfVar)) == null) {
                this.f17592gxszxtbevo.put(ppxfxbqfkfVar, ntlheqmsrt());
            }
        }
        final ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkf.MainThread;
        if (((EnumSet) this.f17592gxszxtbevo.get(ppxfxbqfkfVar2)) == null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f17591eablkybsjg.post(new Runnable() { // from class: bz.crxdokpmqz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17395zdlpuopuiu.jlmebxxoox(ppxfxbqfkfVar2, countDownLatch);
                }
            });
            try {
                countDownLatch.await(500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        }
        Iterator it = this.f17592gxszxtbevo.values().iterator();
        while (it.hasNext()) {
            if (!((EnumSet) it.next()).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private static boolean lmojexxdyd() {
        for (String str : f17588wflxmlrfwp) {
            if (ikoacuggdj(str)) {
                return true;
            }
        }
        return false;
    }

    private t6.zoijcleaow mbcevpiqjq() {
        if (ulzqkzuiru()) {
            return this.f17590dxjokdxxww.zoijcleaow();
        }
        return null;
    }

    private static EnumSet ntlheqmsrt() {
        EnumSet enumSetNoneOf = EnumSet.noneOf(zoijcleaow.class);
        try {
            throw new Exception(t6.iwizpuwonk.iobyxmoadg(new byte[]{87, 87, 85, 49, 88, -101, -113, 117, 16, 118, -83, 58, -66, 75, -30, 27, -27, 15, 69, 48, 53, 41, 79, 56, -110, -25, -49, -96, 126, 3, -121, -114, -2, -111, 16, -53, 66, 100, 3, 68, -77, -8, -33, -92, -75, -1, -1, 81}));
        } catch (Exception e13) {
            int i13 = 0;
            for (StackTraceElement stackTraceElement : e13.getStackTrace()) {
                String className = stackTraceElement.getClassName();
                String fileName = stackTraceElement.getFileName();
                for (zoijcleaow zoijcleaowVar : zoijcleaow.values()) {
                    if (zoijcleaow.iobyxmoadg(zoijcleaowVar, className, fileName)) {
                        if (zoijcleaowVar.equals(zoijcleaow.TwiceZygoteInit)) {
                            i13++;
                            if (i13 > 1) {
                                enumSetNoneOf.add(zoijcleaowVar);
                            }
                        } else {
                            enumSetNoneOf.add(zoijcleaowVar);
                        }
                    }
                }
            }
            return enumSetNoneOf;
        }
    }

    private static boolean pkzmftpjix() {
        return Looper.getMainLooper().isCurrentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ribwqtqdhb(final zone.bi.mobile.fingerprint.impl.cs.zoijcleaow zoijcleaowVar, final int[] iArr, final CountDownLatch countDownLatch) {
        zoijcleaowVar.zoijcleaow(new zone.bi.mobile.fingerprint.impl.cs.zoijcleaow.iobyxmoadg() { // from class: bz.jlmebxxoox
            @Override // zone.bi.mobile.fingerprint.impl.cs.zoijcleaow.iobyxmoadg
            public final void wkgbmnqykc(int i13) {
                ribwqtqdhb.jhduphickx(iArr, zoijcleaowVar, countDownLatch, i13);
            }
        });
    }

    private boolean sopmlzcsov() {
        final zone.bi.mobile.fingerprint.impl.cs.zoijcleaow zoijcleaowVarDsvhmnatus = dsvhmnatus();
        if (zoijcleaowVarDsvhmnatus == null) {
            return false;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final int[] iArr = {0};
        this.f17591eablkybsjg.post(new Runnable() { // from class: bz.sopmlzcsov
            @Override // java.lang.Runnable
            public final void run() {
                ribwqtqdhb.ribwqtqdhb(zoijcleaowVarDsvhmnatus, iArr, countDownLatch);
            }
        });
        try {
            if (!countDownLatch.await(f17583draadjrbmk, TimeUnit.MILLISECONDS)) {
                jpowsppfya(t6.iwizpuwonk.iobyxmoadg(new byte[]{-128, -110, -65, 99, 116, 116, 118, -47, 30, -78, -67, 9, 115, 68, -87, 78, -127, 25, 118, -80, -9, -124, -71, -107, -6, -57, 78, -91, 117, 4, -52, 13, 33, -117, -57, -87, -59, 90, 64, -58, -27, 49, -97, 26, -78, -28, -83, 126, 8, -56, -34, 69, 63, -102, 59, 5, 51, -78, 124, -17, 0, 91, -31, 104}));
            }
        } catch (InterruptedException unused) {
        }
        ylkuphrtab(iArr[0]);
        return iArr[0] == 2;
    }

    private boolean stevsuqkhv() {
        t6.wwaezpbzkn wwaezpbzknVarCrxdokpmqz = crxdokpmqz();
        int iIobyxmoadg = wwaezpbzknVarCrxdokpmqz != null ? wwaezpbzknVarCrxdokpmqz.iobyxmoadg() : 0;
        ylkuphrtab(iIobyxmoadg);
        return iIobyxmoadg == 1;
    }

    private static boolean tzroggbefp() {
        String str = Build.TAGS;
        return str != null && str.contains(f17585ojitshcjhn);
    }

    private boolean ulzqkzuiru() {
        boolean zPpxfxbqfkf = this.f17590dxjokdxxww.ppxfxbqfkf();
        if (zPpxfxbqfkf) {
            return zPpxfxbqfkf;
        }
        boolean zWkgbmnqykc = this.f17590dxjokdxxww.wkgbmnqykc(this.f17593lqeggnwhkg);
        vipkmwdibw(zWkgbmnqykc);
        return zWkgbmnqykc;
    }

    private void vipkmwdibw(boolean z13) {
        if (z13) {
            return;
        }
        this.f17589btonecajqb.gxszxtbevo(f17584gtknphoqwx, kc2.nufgyqmvbu.zoijcleaow.Critical, t6.iwizpuwonk.iobyxmoadg(new byte[]{80, 77, -33, 100, 72, 113, -109, 41, -31, -124, 93, -66, 117, 109, 33, -59, -126, 33, 7, 11, 24, -43, 88, -65, 35, -119, -124, -25, -122, -119, -40, 53, 10, -95, -92, 2, 114, -125, -119, -106, -106, 31, -81, 63, -30, -47, -108, -117}), 5);
    }

    private boolean wwaezpbzkn() {
        if (f17587vdvldrhtss < 0) {
            iobyxmoadg[] iobyxmoadgVarArr = {iobyxmoadg.f17597jyumaefscl, iobyxmoadg.f17596iwizpuwonk};
            for (int i13 = 0; i13 < 2; i13++) {
                iobyxmoadg iobyxmoadgVar = iobyxmoadgVarArr[i13];
                if (ikoacuggdj(iobyxmoadgVar.iobyxmoadg())) {
                    f17587vdvldrhtss = !iobyxmoadg.wkgbmnqykc(iobyxmoadgVar).isEmpty() ? 1 : 0;
                    break;
                }
            }
        }
        return f17587vdvldrhtss > 0;
    }

    private boolean wypolnanlu() {
        t6.zoijcleaow zoijcleaowVarMbcevpiqjq = mbcevpiqjq();
        int iIobyxmoadg = zoijcleaowVarMbcevpiqjq != null ? zoijcleaowVarMbcevpiqjq.iobyxmoadg() : 0;
        ylkuphrtab(iIobyxmoadg);
        return iIobyxmoadg == 8;
    }

    private void ylkuphrtab(int i13) {
        if (i13 == -1) {
            this.f17589btonecajqb.gxszxtbevo(f17584gtknphoqwx, kc2.nufgyqmvbu.zoijcleaow.Critical, t6.iwizpuwonk.iobyxmoadg(new byte[]{6, 87, 92, -116, -100, -83, -80, 27, 30, 45, -24, -114, -83, 117, 10, -2, 71, -70, 14, 127, -40, 71, 89, 92, -88, 70, 61, 74, -15, -55, 122, -12}), 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: hkdspvbjdz, reason: merged with bridge method [inline-methods] */
    public Integer lereixgezr() {
        ?? r13;
        ?? r14;
        boolean zTzroggbefp = tzroggbefp();
        if (lmojexxdyd() || (kc2.eablkybsjg.Deep.equals(this.f17594nufgyqmvbu) && stevsuqkhv())) {
            r13 = zTzroggbefp;
            r13 = zTzroggbefp;
            r13 = (zTzroggbefp ? 1 : 0) | 2;
        }
        r13 = zTzroggbefp;
        r13 = zTzroggbefp;
        r13 = zTzroggbefp;
        ?? r15 = r13;
        if (wwaezpbzkn()) {
            r15 = (r13 == true ? 1 : 0) | 4;
        }
        int i13 = r15;
        if (kc2.eablkybsjg.Deep.equals(this.f17594nufgyqmvbu)) {
            if (cllcsxoeiz()) {
                r14 = r15;
                r14 = (r15 == true ? 1 : 0) | 32;
            }
            r14 = r15;
            ?? r16 = r14;
            if (kegysxyocb()) {
                r16 = (r14 == true ? 1 : 0) | 64;
            }
            ?? r17 = r16;
            if (sopmlzcsov()) {
                r17 = (r16 == true ? 1 : 0) | UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i13 = r17;
            if (wypolnanlu()) {
                i13 = (r17 == true ? 1 : 0) | UserVerificationMethods.USER_VERIFY_HANDPRINT;
            }
        }
        return Integer.valueOf(i13);
    }
}
