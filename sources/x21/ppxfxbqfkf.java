package x21;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p21.nufgyqmvbu;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements x21.zoijcleaow {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final iobyxmoadg f121046lqeggnwhkg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zoijcleaow f121047eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final wypolnanlu f121048gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f121049iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ConnectivityManager f121050ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zynmafqrjb f121051wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f121052zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow extends ConnectivityManager.NetworkCallback {
        zoijcleaow() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            zdlpuopuiu.btonecajqb(network, "network");
            ppxfxbqfkf.this.f121051wkgbmnqykc.setValue(Boolean.TRUE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            zdlpuopuiu.btonecajqb(network, "network");
            zdlpuopuiu.btonecajqb(networkCapabilities, "networkCapabilities");
            ppxfxbqfkf.this.f121051wkgbmnqykc.setValue(Boolean.valueOf(ppxfxbqfkf.this.isConnected()));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            zdlpuopuiu.btonecajqb(network, "network");
            ppxfxbqfkf.this.f121051wkgbmnqykc.setValue(Boolean.FALSE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            ppxfxbqfkf.this.f121051wkgbmnqykc.setValue(Boolean.FALSE);
        }
    }

    public ppxfxbqfkf(Context context, nufgyqmvbu client) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(client, "client");
        this.f121049iobyxmoadg = client;
        this.f121050ppxfxbqfkf = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(Boolean.valueOf(isConnected()));
        this.f121051wkgbmnqykc = zynmafqrjbVarIobyxmoadg;
        this.f121047eablkybsjg = new zoijcleaow();
        this.f121048gxszxtbevo = zynmafqrjbVarIobyxmoadg;
    }

    @Override // x21.zoijcleaow
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public wypolnanlu getState() {
        return this.f121048gxszxtbevo;
    }

    @Override // x21.zoijcleaow
    public void iobyxmoadg() {
        if (this.f121052zoijcleaow) {
            return;
        }
        this.f121050ppxfxbqfkf.registerDefaultNetworkCallback(this.f121047eablkybsjg);
        this.f121052zoijcleaow = true;
    }

    @Override // x21.zoijcleaow
    public boolean isConnected() {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = this.f121050ppxfxbqfkf.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = this.f121050ppxfxbqfkf.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0);
    }

    @Override // x21.zoijcleaow
    public void ppxfxbqfkf() {
        if (this.f121052zoijcleaow) {
            this.f121050ppxfxbqfkf.unregisterNetworkCallback(this.f121047eablkybsjg);
            this.f121052zoijcleaow = false;
        }
    }

    @Override // x21.zoijcleaow
    public void wkgbmnqykc() {
        this.f121051wkgbmnqykc.setValue(Boolean.valueOf(isConnected()));
    }
}
