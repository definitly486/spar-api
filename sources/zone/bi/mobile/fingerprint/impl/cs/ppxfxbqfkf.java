package zone.bi.mobile.fingerprint.impl.cs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ServiceConnection f130652eablkybsjg = new iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f130653iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private zone.bi.mobile.fingerprint.impl.cs.iobyxmoadg f130654ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f130655wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private zoijcleaow.iobyxmoadg f130656zoijcleaow;

    class iobyxmoadg implements ServiceConnection {
        iobyxmoadg() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ppxfxbqfkf.this.f130654ppxfxbqfkf = zone.bi.mobile.fingerprint.impl.cs.iobyxmoadg.AbstractBinderC3344iobyxmoadg.wflxmlrfwp(iBinder);
            ppxfxbqfkf.this.f130655wkgbmnqykc = true;
            ppxfxbqfkf.this.ppxfxbqfkf();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ppxfxbqfkf.this.f130655wkgbmnqykc = false;
            ppxfxbqfkf.this.f130654ppxfxbqfkf = null;
        }
    }

    public ppxfxbqfkf(Context context) {
        this.f130653iobyxmoadg = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ppxfxbqfkf() {
        zone.bi.mobile.fingerprint.impl.cs.iobyxmoadg iobyxmoadgVar;
        int iIobyxmoadg;
        if (this.f130656zoijcleaow == null || (iobyxmoadgVar = this.f130654ppxfxbqfkf) == null) {
            return;
        }
        try {
            iIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        } catch (RemoteException unused) {
            iIobyxmoadg = -1;
        }
        this.f130656zoijcleaow.wkgbmnqykc(iIobyxmoadg);
    }

    @Override // zone.bi.mobile.fingerprint.impl.cs.zoijcleaow
    public void iobyxmoadg() {
        this.f130656zoijcleaow = null;
        this.f130654ppxfxbqfkf = null;
        if (this.f130655wkgbmnqykc) {
            this.f130653iobyxmoadg.unbindService(this.f130652eablkybsjg);
            this.f130655wkgbmnqykc = false;
        }
    }

    @Override // zone.bi.mobile.fingerprint.impl.cs.zoijcleaow
    public void zoijcleaow(zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        this.f130656zoijcleaow = iobyxmoadgVar;
        if (this.f130655wkgbmnqykc) {
            ppxfxbqfkf();
        } else {
            this.f130653iobyxmoadg.bindService(new Intent(this.f130653iobyxmoadg, (Class<?>) FpWorkerService.class), this.f130652eablkybsjg, 1);
        }
    }
}
