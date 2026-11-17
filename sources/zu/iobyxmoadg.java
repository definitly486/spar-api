package zu;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.mapview.MapView;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static /* synthetic */ void eablkybsjg(MapView mapView, Point point, boolean z13, float f13, boolean z14, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            f13 = 13.0f;
        }
        if ((i13 & 8) != 0) {
            z14 = true;
        }
        wkgbmnqykc(mapView, point, z13, f13, z14);
    }

    public static final void iobyxmoadg(MapView mapView) {
        zdlpuopuiu.btonecajqb(mapView, "<this>");
        mapView.getMapWindow().getMap().getMapObjects().clear();
    }

    public static final void ppxfxbqfkf(MapView mapView) {
        zdlpuopuiu.btonecajqb(mapView, "<this>");
        mapView.getMapWindow().setFocusRect(new ScreenRect(new ScreenPoint(0.0f, 0.0f), new ScreenPoint(mapView.getMapWindow().width(), mapView.getMapWindow().height())));
    }

    public static final void wkgbmnqykc(MapView mapView, Point point, boolean z13, float f13, boolean z14) {
        zdlpuopuiu.btonecajqb(mapView, "<this>");
        zdlpuopuiu.btonecajqb(point, "point");
        if (!z13) {
            f13 = Math.max(mapView.getMapWindow().getMap().getCameraPosition().getZoom(), f13);
        }
        mapView.getMapWindow().getMap().move(new CameraPosition(point, f13, 0.0f, 0.0f), new Animation(Animation.Type.SMOOTH, z14 ? 0.5f : 0.0f), null);
        ppxfxbqfkf(mapView);
    }

    public static final void zoijcleaow(MapView mapView, float f13) {
        zdlpuopuiu.btonecajqb(mapView, "<this>");
        CameraPosition cameraPosition = mapView.getMapWindow().getMap().getCameraPosition();
        zdlpuopuiu.dxjokdxxww(cameraPosition, "getCameraPosition(...)");
        mapView.getMapWindow().getMap().move(new CameraPosition(cameraPosition.getTarget(), f13, cameraPosition.getAzimuth(), cameraPosition.getTilt()), new Animation(Animation.Type.SMOOTH, 0.5f), null);
    }
}
