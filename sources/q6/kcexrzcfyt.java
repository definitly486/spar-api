package q6;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kcexrzcfyt {
    public static final void iobyxmoadg(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(connectivityManager, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
