package f00;

import android.location.Location;
import android.location.LocationManager;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements m30.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LocationManager f32536iobyxmoadg;

    public iobyxmoadg(LocationManager locationManager) {
        zdlpuopuiu.btonecajqb(locationManager, "locationManager");
        this.f32536iobyxmoadg = locationManager;
    }

    @Override // m30.iobyxmoadg
    public LocationData getLastLocation() {
        Location lastKnownLocation = this.f32536iobyxmoadg.getLastKnownLocation("gps");
        Location lastKnownLocation2 = this.f32536iobyxmoadg.getLastKnownLocation("network");
        if (lastKnownLocation == null) {
            lastKnownLocation = lastKnownLocation2;
        }
        if (lastKnownLocation != null) {
            return new LocationData(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
        }
        return null;
    }
}
