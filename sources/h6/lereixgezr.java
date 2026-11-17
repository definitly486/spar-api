package h6;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f39583iobyxmoadg = iobyxmoadg.f39584iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f39584iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public static /* synthetic */ lereixgezr ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z13 = true;
            }
            return iobyxmoadgVar.zoijcleaow(z13);
        }

        public final lereixgezr iobyxmoadg() {
            return ppxfxbqfkf(this, false, 1, null);
        }

        public final lereixgezr zoijcleaow(boolean z13) {
            pmvmpeiblj pmvmpeibljVar = new pmvmpeiblj();
            return z13 ? new zynmafqrjb(pmvmpeibljVar) : pmvmpeibljVar;
        }
    }

    static lereixgezr iobyxmoadg() {
        return f39583iobyxmoadg.iobyxmoadg();
    }

    static lereixgezr ppxfxbqfkf(boolean z13) {
        return f39583iobyxmoadg.zoijcleaow(z13);
    }

    esjtqupxsv eablkybsjg(p6.wflxmlrfwp wflxmlrfwpVar);

    default esjtqupxsv gxszxtbevo(p6.yggfygwlhe spec) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spec, "spec");
        return wkgbmnqykc(p6.lereixgezr.iobyxmoadg(spec));
    }

    List remove(String str);

    esjtqupxsv wkgbmnqykc(p6.wflxmlrfwp wflxmlrfwpVar);

    boolean zoijcleaow(p6.wflxmlrfwp wflxmlrfwpVar);
}
