package uy0;

import android.location.Location;
import hg.agtfadlqog;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements r11.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final C2850iobyxmoadg f114744iobyxmoadg = new C2850iobyxmoadg(null);

    /* JADX INFO: renamed from: uy0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C2850iobyxmoadg {
        public /* synthetic */ C2850iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2850iobyxmoadg() {
        }
    }

    @Override // r11.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public rz0.iobyxmoadg iobyxmoadg(LocationData from, LocationData to2) {
        zdlpuopuiu.btonecajqb(from, "from");
        zdlpuopuiu.btonecajqb(to2, "to");
        float[] fArr = new float[3];
        Location.distanceBetween(from.getLatitude(), from.getLongitude(), to2.getLatitude(), to2.getLongitude(), fArr);
        return new rz0.iobyxmoadg(agtfadlqog.czzsidtyhn(fArr));
    }
}
