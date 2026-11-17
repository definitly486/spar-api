package w11;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.zdlpuopuiu;
import kr0.wkgbmnqykc;
import rj.btonecajqb;
import rj.lqeggnwhkg;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import sj.dxjokdxxww;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f118559iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final lqeggnwhkg f118560zoijcleaow = btonecajqb.zoijcleaow(Integer.MAX_VALUE, null, null, 6, null);

    private iobyxmoadg() {
    }

    private final void iobyxmoadg(Throwable th2, String str) {
        wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th2, CrashlyticsKey.INSTANCE.iobyxmoadg(str));
    }

    public final sj.lqeggnwhkg ppxfxbqfkf() {
        return dxjokdxxww.mbcevpiqjq(f118560zoijcleaow);
    }

    public final void zoijcleaow(Throwable error) {
        zdlpuopuiu.btonecajqb(error, "error");
        if (error instanceof CancellationException) {
            return;
        }
        String strIobyxmoadg = yp1.iobyxmoadg.iobyxmoadg();
        iobyxmoadg(error, strIobyxmoadg);
        Iterator it = x11.iobyxmoadg.iobyxmoadg(error, strIobyxmoadg).iterator();
        while (it.hasNext()) {
            f118560zoijcleaow.eablkybsjg((y11.iobyxmoadg) it.next());
        }
    }
}
