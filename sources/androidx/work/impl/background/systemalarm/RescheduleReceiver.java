package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import g6.yggfygwlhe;
import h6.dsvhmnatus;

/* JADX INFO: loaded from: classes2.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f13891iobyxmoadg = yggfygwlhe.dxjokdxxww("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13891iobyxmoadg, "Received intent " + intent);
        try {
            dsvhmnatus.rgvfuqvkyq(context).pmvmpeiblj(goAsync());
        } catch (IllegalStateException e13) {
            yggfygwlhe.eablkybsjg().wkgbmnqykc(f13891iobyxmoadg, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e13);
        }
    }
}
