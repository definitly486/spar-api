package rb1;

import com.yandex.mapkit.map.CameraPosition;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public CameraPosition invoke(ru.myspar.proloyalty.core.domain.models.CameraPosition cameraPosition) {
        zdlpuopuiu.btonecajqb(cameraPosition, "cameraPosition");
        return new CameraPosition(s11.zoijcleaow.zoijcleaow(cameraPosition.getTarget()), cameraPosition.getZoom(), cameraPosition.getAzimuth(), cameraPosition.getTilt());
    }
}
