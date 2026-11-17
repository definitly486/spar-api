package s11;

import com.yandex.mapkit.geometry.Point;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final LocationData iobyxmoadg(Point point) {
        zdlpuopuiu.btonecajqb(point, "<this>");
        return new LocationData(point.getLatitude(), point.getLongitude());
    }

    public static final Point zoijcleaow(LocationData locationData) {
        zdlpuopuiu.btonecajqb(locationData, "<this>");
        return new Point(locationData.getLatitude(), locationData.getLongitude());
    }
}
