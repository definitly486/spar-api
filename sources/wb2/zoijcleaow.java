package wb2;

import android.content.Context;
import android.location.Location;
import kotlin.jvm.internal.zdlpuopuiu;
import xb2.dxjokdxxww;
import xb2.lqeggnwhkg;
import zb2.Event;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f119247iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f119248ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dxjokdxxww f119249wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final xb2.iobyxmoadg f119250zoijcleaow;

    public zoijcleaow(Context appContext, xb2.iobyxmoadg batteryLevelProvider, lqeggnwhkg locationProvider, dxjokdxxww networkProvider) {
        zdlpuopuiu.btonecajqb(appContext, "appContext");
        zdlpuopuiu.btonecajqb(batteryLevelProvider, "batteryLevelProvider");
        zdlpuopuiu.btonecajqb(locationProvider, "locationProvider");
        zdlpuopuiu.btonecajqb(networkProvider, "networkProvider");
        this.f119247iobyxmoadg = appContext;
        this.f119250zoijcleaow = batteryLevelProvider;
        this.f119248ppxfxbqfkf = locationProvider;
        this.f119249wkgbmnqykc = networkProvider;
    }

    @Override // wb2.iobyxmoadg
    public void iobyxmoadg(Event event) {
        zdlpuopuiu.btonecajqb(event, "event");
        String batteryLevel = this.f119250zoijcleaow.getBatteryLevel();
        if (batteryLevel.length() > 0) {
            event.zoijcleaow(batteryLevel);
        }
        Location locationIobyxmoadg = this.f119248ppxfxbqfkf.iobyxmoadg(this.f119247iobyxmoadg);
        if (locationIobyxmoadg != null) {
            event.eablkybsjg(String.valueOf(locationIobyxmoadg.getLatitude()));
            event.gxszxtbevo(String.valueOf(locationIobyxmoadg.getLongitude()));
        }
        String strIobyxmoadg = this.f119249wkgbmnqykc.iobyxmoadg();
        if (strIobyxmoadg.length() > 0) {
            event.wkgbmnqykc(strIobyxmoadg);
        }
        String strZoijcleaow = this.f119249wkgbmnqykc.zoijcleaow();
        if (strZoijcleaow.length() > 0) {
            event.lqeggnwhkg(strZoijcleaow);
        }
        String strPpxfxbqfkf = this.f119249wkgbmnqykc.ppxfxbqfkf();
        if (strPpxfxbqfkf.length() > 0) {
            event.ppxfxbqfkf(strPpxfxbqfkf);
        }
    }
}
