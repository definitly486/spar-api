package q30;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.zdlpuopuiu;
import rj.btonecajqb;
import rj.lqeggnwhkg;
import rs.wkgbmnqykc;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import sj.dxjokdxxww;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f77790iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final lqeggnwhkg f77791zoijcleaow = btonecajqb.zoijcleaow(Integer.MAX_VALUE, null, null, 6, null);

    private iobyxmoadg() {
    }

    private final void iobyxmoadg(Throwable th2, String str) {
        wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(th2, CrashlyticsKey.INSTANCE.iobyxmoadg(str));
    }

    public final sj.lqeggnwhkg ppxfxbqfkf() {
        return dxjokdxxww.mbcevpiqjq(f77791zoijcleaow);
    }

    public final void zoijcleaow(Throwable error) {
        zdlpuopuiu.btonecajqb(error, "error");
        if (error instanceof CancellationException) {
            return;
        }
        String strIobyxmoadg = c42.iobyxmoadg.iobyxmoadg();
        iobyxmoadg(error, strIobyxmoadg);
        Iterator it = s30.iobyxmoadg.iobyxmoadg(error, strIobyxmoadg).iterator();
        while (it.hasNext()) {
            f77791zoijcleaow.eablkybsjg((t30.iobyxmoadg) it.next());
        }
    }
}
