package d7;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
final class gxszxtbevo implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConnectivityManager f27116iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f27117ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc.iobyxmoadg f27118zoijcleaow;

    public static final class iobyxmoadg extends ConnectivityManager.NetworkCallback {
        iobyxmoadg() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            gxszxtbevo.this.wkgbmnqykc(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            gxszxtbevo.this.wkgbmnqykc(network, false);
        }
    }

    public gxszxtbevo(ConnectivityManager connectivityManager, wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        this.f27116iobyxmoadg = connectivityManager;
        this.f27118zoijcleaow = iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg();
        this.f27117ppxfxbqfkf = iobyxmoadgVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), iobyxmoadgVar2);
    }

    private final boolean ppxfxbqfkf(Network network) {
        NetworkCapabilities networkCapabilities = this.f27116iobyxmoadg.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wkgbmnqykc(Network network, boolean z13) {
        boolean z14 = false;
        for (Network network2 : this.f27116iobyxmoadg.getAllNetworks()) {
            if (zdlpuopuiu.eablkybsjg(network2, network) ? z13 : ppxfxbqfkf(network2)) {
                z14 = true;
                break;
            }
        }
        this.f27118zoijcleaow.iobyxmoadg(z14);
    }

    @Override // d7.wkgbmnqykc
    public boolean iobyxmoadg() {
        for (Network network : this.f27116iobyxmoadg.getAllNetworks()) {
            if (ppxfxbqfkf(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // d7.wkgbmnqykc
    public void shutdown() {
        this.f27116iobyxmoadg.unregisterNetworkCallback(this.f27117ppxfxbqfkf);
    }
}
