package vy0;

import android.location.Location;
import android.location.LocationManager;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements s11.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LocationManager f118200iobyxmoadg;

    public iobyxmoadg(LocationManager locationManager) {
        zdlpuopuiu.btonecajqb(locationManager, "locationManager");
        this.f118200iobyxmoadg = locationManager;
    }

    @Override // s11.iobyxmoadg
    public LocationData getLastLocation() {
        Location lastKnownLocation = this.f118200iobyxmoadg.getLastKnownLocation("gps");
        Location lastKnownLocation2 = this.f118200iobyxmoadg.getLastKnownLocation("network");
        if (lastKnownLocation == null) {
            lastKnownLocation = lastKnownLocation2;
        }
        if (lastKnownLocation != null) {
            return new LocationData(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
        }
        return null;
    }
}
