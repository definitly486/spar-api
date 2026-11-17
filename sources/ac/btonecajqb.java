package ac;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* JADX INFO: loaded from: classes2.dex */
public abstract class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final char[] f1316iobyxmoadg = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ac.btonecajqb$iobyxmoadg, still in use, count: 1, list:
      (r0v0 ac.btonecajqb$iobyxmoadg) from 0x0084: INVOKE (r5v5 java.util.HashMap), ("x86"), (r0v0 ac.btonecajqb$iobyxmoadg) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class iobyxmoadg {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private static final Map f1317cdpycssgdh;

        static {
            HashMap map = new HashMap(4);
            f1317cdpycssgdh = map;
            map.put("armeabi-v7a", new iobyxmoadg());
            map.put("armeabi", new iobyxmoadg());
            map.put("arm64-v8a", new iobyxmoadg());
            map.put("x86", new iobyxmoadg());
        }

        private iobyxmoadg() {
            super(str, i);
        }

        public static iobyxmoadg valueOf(String str) {
            return (iobyxmoadg) Enum.valueOf(iobyxmoadg.class, str);
        }

        public static iobyxmoadg[] values() {
            return (iobyxmoadg[]) f1325yadqdtsiqt.clone();
        }

        static iobyxmoadg wkgbmnqykc() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) f1317cdpycssgdh.get(str.toLowerCase(Locale.US));
            return iobyxmoadgVar == null ? UNKNOWN : iobyxmoadgVar;
        }
    }

    public static boolean agtfadlqog(Context context) {
        return (iwizpuwonk() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static List btonecajqb(Context context) {
        ArrayList arrayList = new ArrayList();
        int iRgvfuqvkyq = rgvfuqvkyq(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iRgvfuqvkyq2 = rgvfuqvkyq(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iRgvfuqvkyq3 = rgvfuqvkyq(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iRgvfuqvkyq == 0 || iRgvfuqvkyq2 == 0 || iRgvfuqvkyq3 == 0) {
            xb.lqeggnwhkg.gxszxtbevo().zoijcleaow(String.format("Could not find resources: %d %d %d", Integer.valueOf(iRgvfuqvkyq), Integer.valueOf(iRgvfuqvkyq2), Integer.valueOf(iRgvfuqvkyq3)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(iRgvfuqvkyq);
        String[] stringArray2 = context.getResources().getStringArray(iRgvfuqvkyq2);
        String[] stringArray3 = context.getResources().getStringArray(iRgvfuqvkyq3);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            xb.lqeggnwhkg.gxszxtbevo().zoijcleaow(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i13 = 0; i13 < stringArray3.length; i13++) {
            arrayList.add(new lqeggnwhkg(stringArray[i13], stringArray2[i13], stringArray3[i13]));
        }
        return arrayList;
    }

    public static boolean cqumvgiudr() {
        boolean zIwizpuwonk = iwizpuwonk();
        String str = Build.TAGS;
        if ((zIwizpuwonk || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zIwizpuwonk && new File("/system/xbin/su").exists();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int draadjrbmk() {
        boolean zIwizpuwonk = iwizpuwonk();
        ?? r13 = zIwizpuwonk;
        if (cqumvgiudr()) {
            r13 = (zIwizpuwonk ? 1 : 0) | 2;
        }
        return jyumaefscl() ? r13 | 4 : r13;
    }

    public static boolean dxjokdxxww(Context context, String str, boolean z13) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int iRgvfuqvkyq = rgvfuqvkyq(context, str, "bool");
            if (iRgvfuqvkyq > 0) {
                return resources.getBoolean(iRgvfuqvkyq);
            }
            int iRgvfuqvkyq2 = rgvfuqvkyq(context, str, "string");
            if (iRgvfuqvkyq2 > 0) {
                return Boolean.parseBoolean(context.getString(iRgvfuqvkyq2));
            }
        }
        return z13;
    }

    public static boolean eablkybsjg(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean esjtqupxsv(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static int gtknphoqwx() {
        return iobyxmoadg.wkgbmnqykc().ordinal();
    }

    public static void gxszxtbevo(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e13) {
                xb.lqeggnwhkg.gxszxtbevo().eablkybsjg(str, e13);
            }
        }
    }

    public static long iobyxmoadg(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static boolean iwizpuwonk() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean jyumaefscl() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    private static String kcexrzcfyt(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return zdlpuopuiu(messageDigest.digest());
        } catch (NoSuchAlgorithmException e13) {
            xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Could not create hashing algorithm: " + str + ", returning empty string.", e13);
            return "";
        }
    }

    public static String lereixgezr(String str) {
        return oxmwwwfdhm(str, "SHA-1");
    }

    public static void lqeggnwhkg(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e13) {
                throw e13;
            } catch (Exception unused) {
            }
        }
    }

    public static String nufgyqmvbu(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb3 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb3.append((String) it.next());
        }
        String string = sb3.toString();
        if (string.length() > 0) {
            return lereixgezr(string);
        }
        return null;
    }

    public static String ojitshcjhn(Context context) {
        int i13 = context.getApplicationContext().getApplicationInfo().icon;
        if (i13 <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i13);
            return ConstantDeviceInfo.APP_PLATFORM.equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    private static String oxmwwwfdhm(String str, String str2) {
        return kcexrzcfyt(str.getBytes(), str2);
    }

    public static String pmvmpeiblj(InputStream inputStream) {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }

    public static long ppxfxbqfkf(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static int rgvfuqvkyq(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, ojitshcjhn(context));
    }

    public static SharedPreferences vdvldrhtss(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static String wflxmlrfwp(Context context) {
        int iRgvfuqvkyq = rgvfuqvkyq(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iRgvfuqvkyq == 0) {
            iRgvfuqvkyq = rgvfuqvkyq(context, "com.crashlytics.android.build_id", "string");
        }
        if (iRgvfuqvkyq != 0) {
            return context.getResources().getString(iRgvfuqvkyq);
        }
        return null;
    }

    public static boolean wkgbmnqykc(Context context) {
        if (!eablkybsjg(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean yggfygwlhe(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static String zdlpuopuiu(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i13 = 0; i13 < bArr.length; i13++) {
            byte b13 = bArr[i13];
            int i14 = i13 * 2;
            char[] cArr2 = f1316iobyxmoadg;
            cArr[i14] = cArr2[(b13 & 255) >>> 4];
            cArr[i14 + 1] = cArr2[b13 & 15];
        }
        return new String(cArr);
    }

    public static synchronized long zoijcleaow(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }
}
