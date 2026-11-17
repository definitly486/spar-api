package rb1;

import com.yandex.mapkit.geometry.Point;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.CameraPosition;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public CameraPosition invoke(com.yandex.mapkit.map.CameraPosition cameraPosition) {
        zdlpuopuiu.btonecajqb(cameraPosition, "cameraPosition");
        Point target = cameraPosition.getTarget();
        zdlpuopuiu.dxjokdxxww(target, "getTarget(...)");
        return new CameraPosition(s11.zoijcleaow.iobyxmoadg(target), cameraPosition.getZoom(), cameraPosition.getAzimuth(), cameraPosition.getTilt());
    }
}
