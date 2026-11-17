package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class jyumaefscl extends Service implements vdvldrhtss {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final tzroggbefp f9491zdlpuopuiu = new tzroggbefp(this);

    @Override // androidx.lifecycle.vdvldrhtss
    public gtknphoqwx getLifecycle() {
        return this.f9491zdlpuopuiu.iobyxmoadg();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        this.f9491zdlpuopuiu.zoijcleaow();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f9491zdlpuopuiu.ppxfxbqfkf();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f9491zdlpuopuiu.wkgbmnqykc();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i13) {
        this.f9491zdlpuopuiu.eablkybsjg();
        super.onStart(intent, i13);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i13, int i14) {
        return super.onStartCommand(intent, i13, i14);
    }
}
