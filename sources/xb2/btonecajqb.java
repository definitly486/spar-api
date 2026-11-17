package xb2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb implements dxjokdxxww {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final iobyxmoadg f122017ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f122018iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tb2.iobyxmoadg f122019zoijcleaow;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public btonecajqb(Context context, tb2.iobyxmoadg settings) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(settings, "settings");
        this.f122018iobyxmoadg = context;
        this.f122019zoijcleaow = settings;
    }

    private final WifiInfo btonecajqb() {
        WifiManager wifiManager = (WifiManager) this.f122018iobyxmoadg.getSystemService("wifi");
        if (wifiManager == null || !wkgbmnqykc(this.f122018iobyxmoadg)) {
            return null;
        }
        try {
            return wifiManager.getConnectionInfo();
        } catch (SecurityException e13) {
            this.f122019zoijcleaow.zoijcleaow().iobyxmoadg("NetworkProvider", e13);
            return null;
        }
    }

    private final String dxjokdxxww(ConnectivityManager connectivityManager) {
        Network[] allNetworks = connectivityManager.getAllNetworks();
        zdlpuopuiu.dxjokdxxww(allNetworks, "cm.allNetworks");
        if (allNetworks.length == 0) {
            return null;
        }
        for (Network network : allNetworks) {
            String strGxszxtbevo = gxszxtbevo(connectivityManager, network);
            if (strGxszxtbevo != null) {
                return strGxszxtbevo;
            }
        }
        return null;
    }

    private final String eablkybsjg(int i13) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i13 & KotlinVersion.MAX_COMPONENT_VALUE);
        sb3.append('.');
        sb3.append((i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        sb3.append('.');
        sb3.append((i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        sb3.append('.');
        sb3.append((i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        return sb3.toString();
    }

    private final String gxszxtbevo(ConnectivityManager connectivityManager, Network network) {
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
        if (networkCapabilities == null) {
            return null;
        }
        if (networkCapabilities.hasTransport(1)) {
            return "WIFI";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "CELLULAR";
        }
        return null;
    }

    private final String lqeggnwhkg() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return null;
            }
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress()) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
        } catch (SocketException e13) {
            this.f122019zoijcleaow.zoijcleaow().iobyxmoadg("NetworkProvider", e13);
        }
        return null;
    }

    private final String nufgyqmvbu() {
        WifiInfo wifiInfoBtonecajqb = btonecajqb();
        if (wifiInfoBtonecajqb != null) {
            return eablkybsjg(wifiInfoBtonecajqb.getIpAddress());
        }
        return null;
    }

    private final boolean wkgbmnqykc(Context context) {
        try {
            return bc2.iobyxmoadg.iobyxmoadg(context, "android.permission.ACCESS_WIFI_STATE");
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // xb2.dxjokdxxww
    public String iobyxmoadg() {
        ConnectivityManager connectivityManager;
        if (!bc2.iobyxmoadg.iobyxmoadg(this.f122018iobyxmoadg, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) this.f122018iobyxmoadg.getSystemService("connectivity")) == null) {
            return "";
        }
        String strDxjokdxxww = dxjokdxxww(connectivityManager);
        if (strDxjokdxxww != null) {
            return strDxjokdxxww;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "";
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            return type != 1 ? "" : "WIFI";
        }
        return "CELLULAR";
    }

    @Override // xb2.dxjokdxxww
    public String ppxfxbqfkf() {
        if (!bc2.iobyxmoadg.iobyxmoadg(this.f122018iobyxmoadg, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) this.f122018iobyxmoadg.getSystemService("phone");
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    @Override // xb2.dxjokdxxww
    public String zoijcleaow() {
        String strLqeggnwhkg;
        String strIobyxmoadg = iobyxmoadg();
        if (zdlpuopuiu.eablkybsjg(strIobyxmoadg, "WIFI")) {
            strLqeggnwhkg = nufgyqmvbu();
        } else {
            strLqeggnwhkg = zdlpuopuiu.eablkybsjg(strIobyxmoadg, "CELLULAR") ? lqeggnwhkg() : null;
        }
        return strLqeggnwhkg == null ? "" : strLqeggnwhkg;
    }
}
