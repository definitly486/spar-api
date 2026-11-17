package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.jyumaefscl;
import g6.yggfygwlhe;
import q6.lmojexxdyd;

/* JADX INFO: loaded from: classes2.dex */
public class SystemAlarmService extends jyumaefscl implements eablkybsjg.ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final String f13892iwizpuwonk = yggfygwlhe.dxjokdxxww("SystemAlarmService");

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f13893jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private eablkybsjg f13894yggfygwlhe;

    private void eablkybsjg() {
        eablkybsjg eablkybsjgVar = new eablkybsjg(this);
        this.f13894yggfygwlhe = eablkybsjgVar;
        eablkybsjgVar.wflxmlrfwp(this);
    }

    @Override // androidx.lifecycle.jyumaefscl, android.app.Service
    public void onCreate() {
        super.onCreate();
        eablkybsjg();
        this.f13893jyumaefscl = false;
    }

    @Override // androidx.lifecycle.jyumaefscl, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f13893jyumaefscl = true;
        this.f13894yggfygwlhe.gtknphoqwx();
    }

    @Override // androidx.lifecycle.jyumaefscl, android.app.Service
    public int onStartCommand(Intent intent, int i13, int i14) {
        super.onStartCommand(intent, i13, i14);
        if (this.f13893jyumaefscl) {
            yggfygwlhe.eablkybsjg().gxszxtbevo(f13892iwizpuwonk, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f13894yggfygwlhe.gtknphoqwx();
            eablkybsjg();
            this.f13893jyumaefscl = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f13894yggfygwlhe.iobyxmoadg(intent, i14);
        return 3;
    }

    @Override // androidx.work.impl.background.systemalarm.eablkybsjg.ppxfxbqfkf
    public void zoijcleaow() {
        this.f13893jyumaefscl = true;
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13892iwizpuwonk, "All commands completed in dispatcher");
        lmojexxdyd.iobyxmoadg();
        stopSelf();
    }
}
