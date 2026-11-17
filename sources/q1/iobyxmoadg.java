package q1;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f77640eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f77641iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final int f77642ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f77643wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f77644zoijcleaow;

    /* JADX INFO: renamed from: q1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1729iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1729iobyxmoadg f77645iobyxmoadg = new C1729iobyxmoadg();

        private C1729iobyxmoadg() {
        }

        public final int iobyxmoadg(int i13) {
            return SdkExtensions.getExtensionVersion(i13);
        }
    }

    static {
        int i13 = Build.VERSION.SDK_INT;
        f77644zoijcleaow = i13 >= 30 ? C1729iobyxmoadg.f77645iobyxmoadg.iobyxmoadg(30) : 0;
        f77642ppxfxbqfkf = i13 >= 30 ? C1729iobyxmoadg.f77645iobyxmoadg.iobyxmoadg(31) : 0;
        f77643wkgbmnqykc = i13 >= 30 ? C1729iobyxmoadg.f77645iobyxmoadg.iobyxmoadg(33) : 0;
        f77640eablkybsjg = i13 >= 30 ? C1729iobyxmoadg.f77645iobyxmoadg.iobyxmoadg(1000000) : 0;
    }

    private iobyxmoadg() {
    }

    public static final boolean iobyxmoadg(String codename, String buildCodename) {
        zdlpuopuiu.btonecajqb(codename, "codename");
        zdlpuopuiu.btonecajqb(buildCodename, "buildCodename");
        if (zdlpuopuiu.eablkybsjg("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        zdlpuopuiu.dxjokdxxww(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        zdlpuopuiu.dxjokdxxww(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean ppxfxbqfkf() {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 35) {
            if (i13 >= 34) {
                String CODENAME = Build.VERSION.CODENAME;
                zdlpuopuiu.dxjokdxxww(CODENAME, "CODENAME");
                if (iobyxmoadg("VanillaIceCream", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean zoijcleaow() {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 34) {
            if (i13 >= 33) {
                String CODENAME = Build.VERSION.CODENAME;
                zdlpuopuiu.dxjokdxxww(CODENAME, "CODENAME");
                if (iobyxmoadg("UpsideDownCake", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }
}
