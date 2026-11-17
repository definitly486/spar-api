package wa;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
final class cqumvgiudr implements ServiceConnection {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final /* synthetic */ esjtqupxsv f119115zdlpuopuiu;

    /* synthetic */ cqumvgiudr(esjtqupxsv esjtqupxsvVar, iwizpuwonk iwizpuwonkVar) {
        this.f119115zdlpuopuiu = esjtqupxsvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f119115zdlpuopuiu.f119130zoijcleaow.wkgbmnqykc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        esjtqupxsv esjtqupxsvVar = this.f119115zdlpuopuiu;
        esjtqupxsvVar.ppxfxbqfkf().post(new yggfygwlhe(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f119115zdlpuopuiu.f119130zoijcleaow.wkgbmnqykc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        esjtqupxsv esjtqupxsvVar = this.f119115zdlpuopuiu;
        esjtqupxsvVar.ppxfxbqfkf().post(new jyumaefscl(this));
    }
}
