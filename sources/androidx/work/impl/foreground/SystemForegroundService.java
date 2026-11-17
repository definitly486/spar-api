package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.lifecycle.jyumaefscl;
import g6.yggfygwlhe;

/* JADX INFO: loaded from: classes2.dex */
public class SystemForegroundService extends jyumaefscl implements androidx.work.impl.foreground.iobyxmoadg.zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final String f13947cqumvgiudr = yggfygwlhe.dxjokdxxww("SystemFgService");

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static SystemForegroundService f13948esjtqupxsv = null;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    NotificationManager f13949iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    androidx.work.impl.foreground.iobyxmoadg f13950jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f13951yggfygwlhe;

    static class iobyxmoadg {
        static void iobyxmoadg(Service service, int i13, Notification notification, int i14) {
            service.startForeground(i13, notification, i14);
        }
    }

    static class zoijcleaow {
        static void iobyxmoadg(Service service, int i13, Notification notification, int i14) {
            try {
                service.startForeground(i13, notification, i14);
            } catch (ForegroundServiceStartNotAllowedException e13) {
                yggfygwlhe.eablkybsjg().draadjrbmk(SystemForegroundService.f13947cqumvgiudr, "Unable to start foreground service", e13);
            } catch (SecurityException e14) {
                yggfygwlhe.eablkybsjg().draadjrbmk(SystemForegroundService.f13947cqumvgiudr, "Unable to start foreground service", e14);
            }
        }
    }

    private void gxszxtbevo() {
        this.f13949iwizpuwonk = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.iobyxmoadg iobyxmoadgVar = new androidx.work.impl.foreground.iobyxmoadg(getApplicationContext());
        this.f13950jyumaefscl = iobyxmoadgVar;
        iobyxmoadgVar.ojitshcjhn(this);
    }

    @Override // androidx.work.impl.foreground.iobyxmoadg.zoijcleaow
    public void iobyxmoadg(int i13, Notification notification) {
        this.f13949iwizpuwonk.notify(i13, notification);
    }

    @Override // androidx.lifecycle.jyumaefscl, android.app.Service
    public void onCreate() {
        super.onCreate();
        f13948esjtqupxsv = this;
        gxszxtbevo();
    }

    @Override // androidx.lifecycle.jyumaefscl, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f13950jyumaefscl.draadjrbmk();
    }

    @Override // androidx.lifecycle.jyumaefscl, android.app.Service
    public int onStartCommand(Intent intent, int i13, int i14) {
        super.onStartCommand(intent, i13, i14);
        if (this.f13951yggfygwlhe) {
            yggfygwlhe.eablkybsjg().gxszxtbevo(f13947cqumvgiudr, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f13950jyumaefscl.draadjrbmk();
            gxszxtbevo();
            this.f13951yggfygwlhe = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f13950jyumaefscl.wflxmlrfwp(intent);
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i13) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f13950jyumaefscl.agtfadlqog(i13, 2048);
    }

    @Override // androidx.work.impl.foreground.iobyxmoadg.zoijcleaow
    public void ppxfxbqfkf(int i13, int i14, Notification notification) {
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 31) {
            zoijcleaow.iobyxmoadg(this, i13, notification, i14);
        } else if (i15 >= 29) {
            iobyxmoadg.iobyxmoadg(this, i13, notification, i14);
        } else {
            startForeground(i13, notification);
        }
    }

    @Override // androidx.work.impl.foreground.iobyxmoadg.zoijcleaow
    public void stop() {
        this.f13951yggfygwlhe = true;
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13947cqumvgiudr, "Shutting down.");
        stopForeground(true);
        f13948esjtqupxsv = null;
        stopSelf();
    }

    @Override // androidx.work.impl.foreground.iobyxmoadg.zoijcleaow
    public void wkgbmnqykc(int i13) {
        this.f13949iwizpuwonk.cancel(i13);
    }

    public void onTimeout(int i13, int i14) {
        this.f13950jyumaefscl.agtfadlqog(i13, i14);
    }
}
