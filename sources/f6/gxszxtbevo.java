package f6;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f32912iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ gxszxtbevo zoijcleaow(iobyxmoadg iobyxmoadgVar, Object obj, String str, zoijcleaow zoijcleaowVar, eablkybsjg eablkybsjgVar, int i13, Object obj2) {
            if ((i13 & 2) != 0) {
                zoijcleaowVar = ppxfxbqfkf.f32933iobyxmoadg.iobyxmoadg();
            }
            if ((i13 & 4) != 0) {
                eablkybsjgVar = f6.iobyxmoadg.f32917iobyxmoadg;
            }
            return iobyxmoadgVar.iobyxmoadg(obj, str, zoijcleaowVar, eablkybsjgVar);
        }

        public final gxszxtbevo iobyxmoadg(Object obj, String tag, zoijcleaow verificationMode, eablkybsjg logger) {
            zdlpuopuiu.btonecajqb(obj, "<this>");
            zdlpuopuiu.btonecajqb(tag, "tag");
            zdlpuopuiu.btonecajqb(verificationMode, "verificationMode");
            zdlpuopuiu.btonecajqb(logger, "logger");
            return new lqeggnwhkg(obj, tag, verificationMode, logger);
        }

        private iobyxmoadg() {
        }
    }

    public enum zoijcleaow {
        STRICT,
        LOG,
        QUIET
    }

    public abstract Object iobyxmoadg();

    public abstract gxszxtbevo ppxfxbqfkf(String str, draadjrbmk draadjrbmkVar);

    protected final String zoijcleaow(Object value, String message) {
        zdlpuopuiu.btonecajqb(value, "value");
        zdlpuopuiu.btonecajqb(message, "message");
        return message + " value: " + value;
    }
}
