package rb1;

import com.yandex.mapkit.geometry.Point;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.domain.models.VisibleRegion;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public VisibleRegion invoke(com.yandex.mapkit.map.VisibleRegion visibleRegion) {
        zdlpuopuiu.btonecajqb(visibleRegion, "visibleRegion");
        Point topLeft = visibleRegion.getTopLeft();
        zdlpuopuiu.dxjokdxxww(topLeft, "getTopLeft(...)");
        LocationData locationDataIobyxmoadg = s11.zoijcleaow.iobyxmoadg(topLeft);
        Point topRight = visibleRegion.getTopRight();
        zdlpuopuiu.dxjokdxxww(topRight, "getTopRight(...)");
        LocationData locationDataIobyxmoadg2 = s11.zoijcleaow.iobyxmoadg(topRight);
        Point bottomLeft = visibleRegion.getBottomLeft();
        zdlpuopuiu.dxjokdxxww(bottomLeft, "getBottomLeft(...)");
        LocationData locationDataIobyxmoadg3 = s11.zoijcleaow.iobyxmoadg(bottomLeft);
        Point bottomRight = visibleRegion.getBottomRight();
        zdlpuopuiu.dxjokdxxww(bottomRight, "getBottomRight(...)");
        return new VisibleRegion(locationDataIobyxmoadg, locationDataIobyxmoadg2, locationDataIobyxmoadg3, s11.zoijcleaow.iobyxmoadg(bottomRight));
    }
}
