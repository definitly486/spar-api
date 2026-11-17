package bz;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class yggfygwlhe extends metgxyhuhe {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final String[] f17683gxszxtbevo = {t6.iwizpuwonk.iobyxmoadg(new byte[]{-21, -61, 19, -52, 127, 21, -78, 93, -80, -41, -100, -110, 85, -97, 104, 49}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-46, 55, 111, 0, -60, -76, -75, 31, -126, -29, 22, -105, 94, -80, -24, 119}), t6.iwizpuwonk.iobyxmoadg(new byte[]{-1, -93, -64, -112, -55, -44, -5, 9, 92, -112, -89, 122, -3, -90, 35, 8}), t6.iwizpuwonk.iobyxmoadg(new byte[]{83, 75, -112, -69, 44, -84, 48, 8, 4, -100, -35, -15, 28, -99, -115, 32})};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ConnectivityManager f17684eablkybsjg;

    yggfygwlhe(ConnectivityManager connectivityManager) {
        super(kc2.lqeggnwhkg.DnsIP);
        this.f17684eablkybsjg = connectivityManager;
    }

    private String cdpycssgdh() throws u4 {
        LinkProperties linkProperties;
        if (this.f17684eablkybsjg == null) {
            throw new u4(t6.iwizpuwonk.iobyxmoadg(new byte[]{123, 23, -64, 85, -4, 69, 71, -102, 29, -62, 79, -54, 89, 100, -69, -84, 4, -102, -86, -67, 49, 44, 2, 46, -85, 10, -123, -71, 109, 37, 34, 19}));
        }
        StringBuilder sb3 = new StringBuilder();
        for (Network network : this.f17684eablkybsjg.getAllNetworks()) {
            NetworkInfo networkInfo = this.f17684eablkybsjg.getNetworkInfo(network);
            if (networkInfo != null && networkInfo.isConnected() && (linkProperties = this.f17684eablkybsjg.getLinkProperties(network)) != null) {
                Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
                while (it.hasNext()) {
                    sb3.append(it.next());
                    sb3.append(t6.iwizpuwonk.iobyxmoadg(new byte[]{91, -119, -16, -117, -91, -64, 2, 25, 94, -21, -40, -106, -36, 105, -23, -34}));
                }
            }
        }
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws u4 {
        t6.iwizpuwonk.iobyxmoadg(new byte[]{57, 113, -35, -27, -115, -45, -57, -75, -111, 90, -74, 36, -56, 66, 57, -73});
        try {
            String strCdpycssgdh = cdpycssgdh();
            if (!strCdpycssgdh.isEmpty()) {
                strCdpycssgdh = strCdpycssgdh.substring(0, strCdpycssgdh.length() - 1);
            }
            return strCdpycssgdh.replaceAll(t6.iwizpuwonk.iobyxmoadg(new byte[]{54, 63, -42, 79, -102, -16, -107, -70, 115, -6, 77, 106, -85, -20, 82, -88}), t6.iwizpuwonk.iobyxmoadg(new byte[]{57, 113, -35, -27, -115, -45, -57, -75, -111, 90, -74, 36, -56, 66, 57, -73}));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException e13) {
            throw new u4(e13.getMessage(), e13);
        }
    }
}
