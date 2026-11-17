package q6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vdvldrhtss {
    public static final NetworkCapabilities iobyxmoadg(ConnectivityManager connectivityManager, Network network) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final void ppxfxbqfkf(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(connectivityManager, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }

    public static final boolean zoijcleaow(NetworkCapabilities networkCapabilities, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i13);
    }
}
