package zone.bi.mobile.fingerprint.impl.cs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import t6.d1;
import t6.t0;

/* JADX INFO: loaded from: classes6.dex */
public class FpWorkerService extends Service {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final zone.bi.mobile.fingerprint.impl.cs.iobyxmoadg.AbstractBinderC3344iobyxmoadg f130649zdlpuopuiu = new iobyxmoadg();

    class iobyxmoadg extends zone.bi.mobile.fingerprint.impl.cs.iobyxmoadg.AbstractBinderC3344iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // zone.bi.mobile.fingerprint.impl.cs.iobyxmoadg
        public int iobyxmoadg() {
            d1 d1Var = (d1) t0.iobyxmoadg();
            if (!d1Var.ppxfxbqfkf()) {
                d1Var.wkgbmnqykc(FpWorkerService.this.getApplicationContext());
            }
            if (d1Var.ppxfxbqfkf()) {
                return d1Var.eablkybsjg().ppxfxbqfkf();
            }
            return -1;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f130649zdlpuopuiu;
    }
}
