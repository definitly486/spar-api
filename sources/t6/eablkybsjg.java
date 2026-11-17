package t6;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.telephony.TelephonyManager$CellInfoCallback;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class eablkybsjg extends nufgyqmvbu {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Executor f109803gxszxtbevo;

    class iobyxmoadg extends TelephonyManager$CellInfoCallback {
        iobyxmoadg(eablkybsjg eablkybsjgVar) {
        }

        public void onCellInfo(List list) {
        }
    }

    eablkybsjg(Context context, int i13, lrnfpwlwnk lrnfpwlwnkVar, opjhrmiecq opjhrmiecqVar) {
        super(context, i13, lrnfpwlwnkVar, opjhrmiecqVar);
        this.f109803gxszxtbevo = new v0();
    }

    @Override // t6.nufgyqmvbu
    protected List eablkybsjg(TelephonyManager telephonyManager) {
        telephonyManager.requestCellInfoUpdate(this.f109803gxszxtbevo, new iobyxmoadg(this));
        return super.eablkybsjg(telephonyManager);
    }
}
