package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import g6.jyumaefscl;
import g6.yggfygwlhe;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class ConstraintProxy extends BroadcastReceiver {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f13885iobyxmoadg = yggfygwlhe.dxjokdxxww("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    static void iobyxmoadg(Context context, List list) {
        Iterator it = list.iterator();
        boolean zNufgyqmvbu = false;
        boolean zDxjokdxxww = false;
        boolean zGtknphoqwx = false;
        boolean z13 = false;
        while (it.hasNext()) {
            g6.wkgbmnqykc wkgbmnqykcVar = ((p6.yggfygwlhe) it.next()).f75789btonecajqb;
            zNufgyqmvbu |= wkgbmnqykcVar.nufgyqmvbu();
            zDxjokdxxww |= wkgbmnqykcVar.dxjokdxxww();
            zGtknphoqwx |= wkgbmnqykcVar.gtknphoqwx();
            z13 |= wkgbmnqykcVar.gxszxtbevo() != jyumaefscl.NOT_REQUIRED;
            if (zNufgyqmvbu && zDxjokdxxww && zGtknphoqwx && z13) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.iobyxmoadg(context, zNufgyqmvbu, zDxjokdxxww, zGtknphoqwx, z13));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13885iobyxmoadg, "onReceive : " + intent);
        context.startService(zoijcleaow.iobyxmoadg(context));
    }
}
