package l40;

import java.util.Iterator;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public enum ppxfxbqfkf {
    PROD("Prod"),
    PREPROD("Preprod"),
    DEV("Dev"),
    TEST("Test"),
    TEAMPROFI("Teamprofi");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f61576zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f61575zynmafqrjb = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f61574yggfygwlhe = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ppxfxbqfkf iobyxmoadg(String value) {
            Object next;
            zdlpuopuiu.btonecajqb(value, "value");
            Iterator<E> it = ppxfxbqfkf.lqeggnwhkg().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!zdlpuopuiu.eablkybsjg(((ppxfxbqfkf) next).wkgbmnqykc(), value));
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) next;
            return ppxfxbqfkfVar == null ? ppxfxbqfkf.PREPROD : ppxfxbqfkfVar;
        }

        private iobyxmoadg() {
        }
    }

    ppxfxbqfkf(String str) {
        this.f61576zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg lqeggnwhkg() {
        return f61575zynmafqrjb;
    }

    public final String wkgbmnqykc() {
        return this.f61576zdlpuopuiu;
    }
}
