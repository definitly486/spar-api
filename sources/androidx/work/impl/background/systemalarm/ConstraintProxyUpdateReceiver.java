package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import g6.yggfygwlhe;
import h6.dsvhmnatus;
import q6.zynmafqrjb;

/* JADX INFO: loaded from: classes2.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final String f13886iobyxmoadg = yggfygwlhe.dxjokdxxww("ConstrntProxyUpdtRecvr");

    class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f13888jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Context f13889yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Intent f13890zdlpuopuiu;

        iobyxmoadg(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f13890zdlpuopuiu = intent;
            this.f13889yggfygwlhe = context;
            this.f13888jyumaefscl = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f13890zdlpuopuiu.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f13890zdlpuopuiu.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f13890zdlpuopuiu.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f13890zdlpuopuiu.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                yggfygwlhe.eablkybsjg().iobyxmoadg(ConstraintProxyUpdateReceiver.f13886iobyxmoadg, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                zynmafqrjb.ppxfxbqfkf(this.f13889yggfygwlhe, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                zynmafqrjb.ppxfxbqfkf(this.f13889yggfygwlhe, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                zynmafqrjb.ppxfxbqfkf(this.f13889yggfygwlhe, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                zynmafqrjb.ppxfxbqfkf(this.f13889yggfygwlhe, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f13888jyumaefscl.finish();
            }
        }
    }

    public static Intent iobyxmoadg(Context context, boolean z13, boolean z14, boolean z15, boolean z16) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z13).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z14).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z15).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z16);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            dsvhmnatus.rgvfuqvkyq(context).jyumaefscl().wkgbmnqykc(new iobyxmoadg(intent, context, goAsync()));
            return;
        }
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13886iobyxmoadg, "Ignoring unknown action " + action);
    }
}
