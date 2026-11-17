package i7;

import android.os.SystemClock;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final agtfadlqog f42049iobyxmoadg = new agtfadlqog();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final File f42052zoijcleaow = new File("/proc/self/fd");

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static int f42050ppxfxbqfkf = 30;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static long f42051wkgbmnqykc = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static boolean f42048eablkybsjg = true;

    private agtfadlqog() {
    }

    private final boolean iobyxmoadg() {
        int i13 = f42050ppxfxbqfkf;
        f42050ppxfxbqfkf = i13 + 1;
        return i13 >= 30 || SystemClock.uptimeMillis() > f42051wkgbmnqykc + ((long) 30000);
    }

    public final synchronized boolean zoijcleaow(kcexrzcfyt kcexrzcfytVar) {
        try {
            if (iobyxmoadg()) {
                f42050ppxfxbqfkf = 0;
                f42051wkgbmnqykc = SystemClock.uptimeMillis();
                String[] list = f42052zoijcleaow.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z13 = length < 800;
                f42048eablkybsjg = z13;
                if (!z13 && kcexrzcfytVar != null && kcexrzcfytVar.zoijcleaow() <= 5) {
                    kcexrzcfytVar.iobyxmoadg("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f42048eablkybsjg;
    }
}
