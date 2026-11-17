package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f48685a;

    public n(p pVar) {
        this.f48685a = pVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            p pVar = this.f48685a;
            pVar.getClass();
            String provider = location.getProvider();
            t tVar = (t) pVar.f48691e.get(provider);
            if (tVar == null) {
                t tVar2 = new t(pVar.f48687a.f48664a);
                tVar2.f48698c.add(pVar.f48689c);
                Iterator it = pVar.f48690d.iterator();
                while (it.hasNext()) {
                    tVar2.f48698c.add((Consumer) it.next());
                }
                pVar.f48691e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f48696a = pVar.f48687a.f48664a;
            }
            if (tVar.f48699d != null) {
                boolean zDidTimePassMillis = tVar.f48697b.didTimePassMillis(tVar.f48700e, tVar.f48696a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z13 = location.distanceTo(tVar.f48699d) > tVar.f48696a.getUpdateDistanceInterval();
                boolean z14 = tVar.f48699d == null || location.getTime() - tVar.f48699d.getTime() >= 0;
                if ((!zDidTimePassMillis && !z13) || !z14) {
                    return;
                }
            }
            tVar.f48699d = location;
            tVar.f48700e = System.currentTimeMillis();
            Iterator it2 = tVar.f48698c.iterator();
            while (it2.hasNext()) {
                ((Consumer) it2.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i13, Bundle bundle) {
    }
}
