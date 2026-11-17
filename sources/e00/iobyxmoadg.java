package e00;

import android.location.Location;
import hg.agtfadlqog;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements l30.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final C0626iobyxmoadg f30122iobyxmoadg = new C0626iobyxmoadg(null);

    /* JADX INFO: renamed from: e00.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C0626iobyxmoadg {
        public /* synthetic */ C0626iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0626iobyxmoadg() {
        }
    }

    @Override // l30.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public a10.iobyxmoadg iobyxmoadg(LocationData from, LocationData to2) {
        zdlpuopuiu.btonecajqb(from, "from");
        zdlpuopuiu.btonecajqb(to2, "to");
        float[] fArr = new float[3];
        Location.distanceBetween(from.getLatitude(), from.getLongitude(), to2.getLatitude(), to2.getLongitude(), fArr);
        return new a10.iobyxmoadg(agtfadlqog.czzsidtyhn(fArr));
    }
}
