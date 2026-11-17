package bz;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.net.NetworkInterface;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
class g0 extends metgxyhuhe implements t6.czzsidtyhn {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final String f17421gxszxtbevo = t6.iwizpuwonk.iobyxmoadg(new byte[]{-44, 87, -109, -41, -35, 102, -4, 61, -85, 91, 74, -119, 46, 64, 31, -4});

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17422eablkybsjg;

    g0(Context context) {
        super(kc2.lqeggnwhkg.WiFiMacAddress);
        this.f17422eablkybsjg = context;
    }

    private static String yadqdtsiqt() {
        byte[] hardwareAddress;
        String string = null;
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase(f17421gxszxtbevo) && (hardwareAddress = networkInterface.getHardwareAddress()) != null) {
                    StringBuilder sb3 = new StringBuilder();
                    for (byte b13 : hardwareAddress) {
                        sb3.append(String.format(t6.iwizpuwonk.iobyxmoadg(new byte[]{71, -18, 19, -71, -76, 58, 122, -14, 51, 19, 66, 108, -120, -1, 30, -86}), Integer.valueOf(b13 & 255)));
                        sb3.append(':');
                    }
                    if (sb3.length() > 0) {
                        sb3.deleteCharAt(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
            }
        } catch (Exception unused) {
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx {
        WifiManager wifiManager = (WifiManager) this.f17422eablkybsjg.getApplicationContext().getSystemService("wifi");
        WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
        if (connectionInfo == null || connectionInfo.getMacAddress() == null) {
            throw new jhduphickx(t6.iwizpuwonk.iobyxmoadg(new byte[]{46, 95, -41, -15, -87, 87, 12, -58, -18, -31, -7, 99, 39, 90, 116, 17, -92, 107, -86, -21, -81, -36, 40, 76, 40, -30, -86, 29, 65, -53, -121, -15, -126, 96, -25, -29, -114, 36, -120, 97, -24, 15, 121, 111, -112, -62, -10, -65, 28, -3, -123, 101, -106, 19, 75, 87, -12, -54, -72, 47, 6, 105, -116, 20, -76, 41, 6, -62, -51, 95, -72, -27, -36, -5, -107, -80, -17, 122, -113, -19}));
        }
        String strYadqdtsiqt = yadqdtsiqt();
        if (strYadqdtsiqt != null) {
            return strYadqdtsiqt;
        }
        throw new jhduphickx(t6.iwizpuwonk.iobyxmoadg(new byte[]{67, -33, -109, 12, 121, 44, -33, 47, -37, -39, 24, 124, 116, 26, 41, 99, 83, -121, -39, 28, 2, 20, -18, 121, 24, 99, -91, 115, 91, 103, 111, 77}));
    }

    @Override // t6.czzsidtyhn
    public int esjtqupxsv() {
        return 30;
    }
}
