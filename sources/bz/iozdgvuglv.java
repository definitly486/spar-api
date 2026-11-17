package bz;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.location.DeviceOrientationRequest;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import t6.f1;

/* JADX INFO: loaded from: classes2.dex */
class iozdgvuglv extends metgxyhuhe implements e, LocationListener {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final LocationManager f17465dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f17466eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Context f17467gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final t6.zdlpuopuiu f17468lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final kc2.wkgbmnqykc f17469nufgyqmvbu;

    class iobyxmoadg extends e.iobyxmoadg {
        iobyxmoadg(kc2.gxszxtbevo gxszxtbevoVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zoijcleaow(kc2.gxszxtbevo gxszxtbevoVar) {
            try {
                LocationManager locationManager = (LocationManager) iozdgvuglv.this.f17467gxszxtbevo.getSystemService("location");
                if (locationManager != null && t6.skhdrjzrfn.iobyxmoadg(iozdgvuglv.this.f17467gxszxtbevo, t6.ppxfxbqfkf.ACCESS_FINE_LOCATION.iobyxmoadg()) && t6.skhdrjzrfn.iobyxmoadg(iozdgvuglv.this.f17467gxszxtbevo, t6.ppxfxbqfkf.ACCESS_COARSE_LOCATION.iobyxmoadg())) {
                    boolean zIsProviderEnabled = locationManager.isProviderEnabled("gps");
                    boolean zIsProviderEnabled2 = locationManager.isProviderEnabled("passive");
                    boolean zIsProviderEnabled3 = locationManager.isProviderEnabled("network");
                    if (zIsProviderEnabled || zIsProviderEnabled3 || zIsProviderEnabled2) {
                        if (zIsProviderEnabled) {
                            locationManager.requestLocationUpdates("gps", DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, 10000.0f, iozdgvuglv.this);
                        }
                        if (zIsProviderEnabled2) {
                            locationManager.requestLocationUpdates("passive", DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, 10000.0f, iozdgvuglv.this);
                        }
                        if (zIsProviderEnabled3) {
                            locationManager.requestLocationUpdates("network", DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, 10000.0f, iozdgvuglv.this);
                        }
                    }
                    if (gxszxtbevoVar == null) {
                        return;
                    }
                    return;
                }
            } catch (Exception unused) {
            } finally {
                if (gxszxtbevoVar != null) {
                    gxszxtbevoVar.iobyxmoadg(iozdgvuglv.this.iwizpuwonk());
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            final kc2.gxszxtbevo gxszxtbevoVar = null;
            new Handler(Looper.getMainLooper()).post(new Runnable(gxszxtbevoVar) { // from class: bz.yadqdtsiqt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17677zdlpuopuiu.zoijcleaow(null);
                }
            });
        }
    }

    iozdgvuglv(Set set, Context context, t6.zdlpuopuiu zdlpuopuiuVar, kc2.wkgbmnqykc wkgbmnqykcVar, LocationManager locationManager, l0 l0Var, krqnebusok krqnebusokVar, stevsuqkhv stevsuqkhvVar, pkzmftpjix pkzmftpjixVar, dxjokdxxww dxjokdxxwwVar, gtknphoqwx gtknphoqwxVar, tbqsvytpvh tbqsvytpvhVar, ylkuphrtab ylkuphrtabVar, yfnezrywwk yfnezrywwkVar, sflfametgt sflfametgtVar) {
        super(kc2.lqeggnwhkg.GeoLocationInfo);
        ArrayList arrayList = new ArrayList();
        this.f17466eablkybsjg = arrayList;
        this.f17467gxszxtbevo = context;
        this.f17468lqeggnwhkg = zdlpuopuiuVar;
        this.f17469nufgyqmvbu = wkgbmnqykcVar;
        this.f17465dxjokdxxww = locationManager;
        if (set.contains(kc2.lqeggnwhkg.Longitude)) {
            arrayList.add(l0Var);
        }
        if (set.contains(kc2.lqeggnwhkg.Latitude)) {
            arrayList.add(krqnebusokVar);
        }
        if (set.contains(kc2.lqeggnwhkg.GeoProvider)) {
            arrayList.add(stevsuqkhvVar);
        }
        if (set.contains(kc2.lqeggnwhkg.Altitude)) {
            arrayList.add(pkzmftpjixVar);
        }
        if (set.contains(kc2.lqeggnwhkg.HorizontalAccuracy)) {
            arrayList.add(dxjokdxxwwVar);
        }
        if (set.contains(kc2.lqeggnwhkg.AltitudeAccuracy)) {
            arrayList.add(gtknphoqwxVar);
        }
        if (set.contains(kc2.lqeggnwhkg.Heading)) {
            arrayList.add(tbqsvytpvhVar);
        }
        if (set.contains(kc2.lqeggnwhkg.Speed)) {
            arrayList.add(ylkuphrtabVar);
        }
        if (set.contains(kc2.lqeggnwhkg.Status)) {
            arrayList.add(yfnezrywwkVar);
        }
        if (set.contains(kc2.lqeggnwhkg.Timestamp)) {
            arrayList.add(sflfametgtVar);
        }
    }

    @Override // bz.e
    public e.iobyxmoadg agtfadlqog(kc2.gxszxtbevo gxszxtbevoVar) {
        return new iobyxmoadg(gxszxtbevoVar);
    }

    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public oc2.ppxfxbqfkf zynmafqrjb() {
        boolean z13;
        String str;
        oc2.ppxfxbqfkf ppxfxbqfkfVar = (oc2.ppxfxbqfkf) super.zynmafqrjb();
        Objects.requireNonNull(ppxfxbqfkfVar);
        oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
        Iterator it = this.f17466eablkybsjg.iterator();
        while (true) {
            if (!it.hasNext()) {
                z13 = false;
                break;
            }
            Object obj = (metgxyhuhe) it.next();
            if ((obj instanceof pkzmftpjix) && ((t6.agtfadlqog) obj).yggfygwlhe(this.f17469nufgyqmvbu.iobyxmoadg()) != null) {
                z13 = true;
                break;
            }
        }
        for (metgxyhuhe metgxyhuheVar : this.f17466eablkybsjg) {
            kc2.lqeggnwhkg lqeggnwhkgVarIwizpuwonk = metgxyhuheVar.iwizpuwonk();
            String strName = lqeggnwhkgVarIwizpuwonk.name();
            try {
                Serializable serializableZynmafqrjb = metgxyhuheVar.zynmafqrjb();
                if (serializableZynmafqrjb != null) {
                    iobyxmoadgVar.put(strName, serializableZynmafqrjb);
                }
            } catch (n0 e13) {
                if (lqeggnwhkgVarIwizpuwonk.dxjokdxxww()) {
                    iobyxmoadgVar.put(strName, e13.iobyxmoadg(lqeggnwhkgVarIwizpuwonk));
                } else {
                    iobyxmoadgVar.remove(strName);
                }
            }
        }
        LocationManager locationManager = this.f17465dxjokdxxww;
        if ((locationManager == null || f1.zoijcleaow(locationManager) == null) && !z13) {
            for (metgxyhuhe metgxyhuheVar2 : this.f17466eablkybsjg) {
                if ((metgxyhuheVar2 instanceof yfnezrywwk) && (str = (String) iobyxmoadgVar.get(metgxyhuheVar2.iwizpuwonk().name())) != null && str.equals(CommonUrlParts.Values.FALSE_INTEGER)) {
                    iobyxmoadgVar.put(metgxyhuheVar2.iwizpuwonk().name(), "2");
                    LocationManager locationManager2 = this.f17465dxjokdxxww;
                    if (locationManager2 != null && locationManager2.isProviderEnabled("gps")) {
                        agtfadlqog(null).run();
                    }
                }
            }
        }
        ppxfxbqfkfVar.add(iobyxmoadgVar);
        return ppxfxbqfkfVar;
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17468lqeggnwhkg;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i13, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public oc2.ppxfxbqfkf lereixgezr() {
        return new oc2.ppxfxbqfkf(1);
    }
}
