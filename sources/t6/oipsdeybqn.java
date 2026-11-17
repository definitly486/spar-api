package t6;

import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
interface oipsdeybqn {

    public interface iobyxmoadg {
        void iobyxmoadg(ServiceState serviceState);
    }

    public static final class zoijcleaow extends u0 implements oipsdeybqn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final iobyxmoadg f109856iobyxmoadg;

        zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this.f109856iobyxmoadg = iobyxmoadgVar;
        }

        public void onServiceStateChanged(ServiceState serviceState) {
            this.f109856iobyxmoadg.iobyxmoadg(serviceState);
        }
    }

    static oipsdeybqn iobyxmoadg(TelephonyManager telephonyManager, Executor executor, iobyxmoadg iobyxmoadgVar) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(iobyxmoadgVar);
        telephonyManager.registerTelephonyCallback(executor, zoijcleaowVar);
        return zoijcleaowVar;
    }

    static void zoijcleaow(TelephonyManager telephonyManager, oipsdeybqn oipsdeybqnVar) {
        if (oipsdeybqnVar != null) {
            telephonyManager.unregisterTelephonyCallback((zoijcleaow) oipsdeybqnVar);
        }
    }
}
