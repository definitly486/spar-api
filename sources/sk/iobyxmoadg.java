package sk;

import bl.eablkybsjg;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.yggfygwlhe;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final C2632iobyxmoadg f107188ppxfxbqfkf = new C2632iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg f107189iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f107190zoijcleaow;

    /* JADX INFO: renamed from: sk.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2632iobyxmoadg {
        public /* synthetic */ C2632iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2632iobyxmoadg() {
        }
    }

    public iobyxmoadg(eablkybsjg source) {
        zdlpuopuiu.btonecajqb(source, "source");
        this.f107189iobyxmoadg = source;
        this.f107190zoijcleaow = 262144L;
    }

    public final yggfygwlhe iobyxmoadg() {
        yggfygwlhe.iobyxmoadg iobyxmoadgVar = new yggfygwlhe.iobyxmoadg();
        while (true) {
            String strZoijcleaow = zoijcleaow();
            if (strZoijcleaow.length() == 0) {
                return iobyxmoadgVar.gxszxtbevo();
            }
            iobyxmoadgVar.ppxfxbqfkf(strZoijcleaow);
        }
    }

    public final String zoijcleaow() {
        String strRibwqtqdhb = this.f107189iobyxmoadg.ribwqtqdhb(this.f107190zoijcleaow);
        this.f107190zoijcleaow -= (long) strRibwqtqdhb.length();
        return strRibwqtqdhb;
    }
}
