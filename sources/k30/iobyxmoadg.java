package k30;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C1144iobyxmoadg f53681iobyxmoadg = new C1144iobyxmoadg(null);

    /* JADX INFO: renamed from: k30.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1144iobyxmoadg {
        public /* synthetic */ C1144iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1144iobyxmoadg() {
        }
    }

    private final double eablkybsjg(double d13, double d14) {
        return d13 / (Math.cos(d14) * 111.32d);
    }

    private final double gxszxtbevo(double d13, double d14) {
        return d13 / (Math.cos(Math.toRadians(d14)) * 111.32d);
    }

    private final double lqeggnwhkg(double d13) {
        return d13 * 0.001d;
    }

    private final double ppxfxbqfkf(double d13) {
        return (Math.asin(d13 / 6378000.0d) * ((double) 180)) / 3.141592653589793d;
    }

    private final double wkgbmnqykc(double d13) {
        return d13 / 110.574d;
    }

    public final BoundingBox iobyxmoadg(Point point, double d13) {
        zdlpuopuiu.btonecajqb(point, "point");
        return new BoundingBox(new Point(point.getLatitude() - wkgbmnqykc(d13), point.getLongitude() - eablkybsjg(d13, point.getLatitude())), new Point(point.getLatitude() + wkgbmnqykc(d13), point.getLongitude() + eablkybsjg(d13, point.getLatitude())));
    }

    public final BoundingBox zoijcleaow(LocationData centerPoint, double d13) {
        zdlpuopuiu.btonecajqb(centerPoint, "centerPoint");
        double latitude = centerPoint.getLatitude();
        double longitude = centerPoint.getLongitude();
        double dGxszxtbevo = gxszxtbevo(lqeggnwhkg(d13), latitude);
        double dPpxfxbqfkf = ppxfxbqfkf(d13);
        return new BoundingBox(new Point(latitude - dPpxfxbqfkf, longitude - dGxszxtbevo), new Point(latitude + dPpxfxbqfkf, longitude + dGxszxtbevo));
    }
}
