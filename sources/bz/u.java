package bz;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class u extends metgxyhuhe implements t6.lxfrhoxuzk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17643eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final TelephonyManager f17644gxszxtbevo;

    u(Context context, TelephonyManager telephonyManager) {
        super(kc2.lqeggnwhkg.LocationAreaCode);
        this.f17643eablkybsjg = context;
        this.f17644gxszxtbevo = telephonyManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx {
        TelephonyManager telephonyManager = this.f17644gxszxtbevo;
        if (telephonyManager == null) {
            throw new jhduphickx("mTelephonyManager == null");
        }
        try {
            try {
                GsmCellLocation gsmCellLocation = (GsmCellLocation) telephonyManager.getCellLocation();
                if (gsmCellLocation == null) {
                    throw new jhduphickx("gsmCellLocation == null");
                }
                int lac = gsmCellLocation.getLac();
                if (lac != -1) {
                    return String.valueOf(lac);
                }
                throw new jhduphickx("lac == -1 == unknown");
            } catch (Exception e13) {
                throw new jhduphickx(e13.getMessage());
            }
        } catch (Exception unused) {
            CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) this.f17644gxszxtbevo.getCellLocation();
            if (cdmaCellLocation == null) {
                throw new jhduphickx("cdmaCellLocation == null");
            }
            int networkId = cdmaCellLocation.getNetworkId();
            if (networkId != -1) {
                return String.valueOf(networkId);
            }
            throw new jhduphickx("lac == -1 == unknown");
        }
    }

    @Override // t6.lxfrhoxuzk
    public Set gtknphoqwx() {
        return t6.jyumaefscl.iobyxmoadg(t6.ppxfxbqfkf.ACCESS_FINE_LOCATION);
    }

    @Override // t6.lxfrhoxuzk
    public Context iobyxmoadg() {
        return this.f17643eablkybsjg;
    }
}
