package p002if;

import android.app.Application;
import com.pandulapeter.beagle.common.configuration.Text;
import com.pandulapeter.beagle.common.configuration.zoijcleaow;
import kf.ppxfxbqfkf;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: if.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1000iobyxmoadg {
        public static /* synthetic */ void dxjokdxxww(iobyxmoadg iobyxmoadgVar, Text text, boolean z13, boolean z14, long j13, String str, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDialog");
            }
            if ((i13 & 2) != 0) {
                z13 = false;
            }
            boolean z15 = z13;
            if ((i13 & 4) != 0) {
                z14 = true;
            }
            boolean z16 = z14;
            if ((i13 & 8) != 0) {
                j13 = ppxfxbqfkf.iobyxmoadg();
            }
            long j14 = j13;
            if ((i13 & 16) != 0) {
                str = ppxfxbqfkf.zoijcleaow();
            }
            iobyxmoadgVar.ppxfxbqfkf(text, z15, z16, j14, str);
        }

        public static /* synthetic */ void eablkybsjg(iobyxmoadg iobyxmoadgVar, String str, String str2, String str3, boolean z13, long j13, String str4, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
            }
            iobyxmoadgVar.iobyxmoadg(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) == 0 ? str3 : null, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? ppxfxbqfkf.iobyxmoadg() : j13, (i13 & 32) != 0 ? ppxfxbqfkf.zoijcleaow() : str4);
        }

        public static void gxszxtbevo(iobyxmoadg iobyxmoadgVar, jf.iobyxmoadg... modules) {
            zdlpuopuiu.btonecajqb(modules, "modules");
        }

        public static boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
            return false;
        }

        public static boolean lqeggnwhkg(iobyxmoadg iobyxmoadgVar) {
            return false;
        }

        public static void nufgyqmvbu(iobyxmoadg iobyxmoadgVar, Text content, boolean z13, boolean z14, long j13, String id2) {
            zdlpuopuiu.btonecajqb(content, "content");
            zdlpuopuiu.btonecajqb(id2, "id");
        }

        public static /* synthetic */ boolean ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, Application application, com.pandulapeter.beagle.common.configuration.iobyxmoadg iobyxmoadgVar2, zoijcleaow zoijcleaowVar, int i13, Object obj) {
            if (obj == null) {
                return iobyxmoadgVar.zoijcleaow(application, (i13 & 2) != 0 ? new com.pandulapeter.beagle.common.configuration.iobyxmoadg(null, null, null, null, null, null, null, null, null, null, null, 2047, null) : iobyxmoadgVar2, (i13 & 4) != 0 ? new zoijcleaow(null, null, false, null, null, null, null, null, null, null, 1023, null) : zoijcleaowVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
        }

        public static void wkgbmnqykc(iobyxmoadg iobyxmoadgVar, String message, String str, String str2, boolean z13, long j13, String id2) {
            zdlpuopuiu.btonecajqb(message, "message");
            zdlpuopuiu.btonecajqb(id2, "id");
        }

        public static boolean zoijcleaow(iobyxmoadg iobyxmoadgVar, Application application, com.pandulapeter.beagle.common.configuration.iobyxmoadg appearance, zoijcleaow behavior) {
            zdlpuopuiu.btonecajqb(application, "application");
            zdlpuopuiu.btonecajqb(appearance, "appearance");
            zdlpuopuiu.btonecajqb(behavior, "behavior");
            return false;
        }
    }

    void iobyxmoadg(String str, String str2, String str3, boolean z13, long j13, String str4);

    void ppxfxbqfkf(Text text, boolean z13, boolean z14, long j13, String str);

    boolean zoijcleaow(Application application, com.pandulapeter.beagle.common.configuration.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar);
}
