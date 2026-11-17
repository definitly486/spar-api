package n6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import g6.yggfygwlhe;
import kotlin.jvm.internal.zdlpuopuiu;
import q6.kcexrzcfyt;
import q6.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public final class btonecajqb extends nufgyqmvbu {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ConnectivityManager f69161gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final iobyxmoadg f69162lqeggnwhkg;

    public static final class iobyxmoadg extends ConnectivityManager.NetworkCallback {
        iobyxmoadg() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            zdlpuopuiu.btonecajqb(network, "network");
            zdlpuopuiu.btonecajqb(capabilities, "capabilities");
            yggfygwlhe.eablkybsjg().iobyxmoadg(gtknphoqwx.f69167iobyxmoadg, "Network capabilities changed: " + capabilities);
            btonecajqb btonecajqbVar = btonecajqb.this;
            btonecajqbVar.lqeggnwhkg(Build.VERSION.SDK_INT >= 28 ? gtknphoqwx.wkgbmnqykc(capabilities) : gtknphoqwx.ppxfxbqfkf(btonecajqbVar.f69161gxszxtbevo));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            zdlpuopuiu.btonecajqb(network, "network");
            yggfygwlhe.eablkybsjg().iobyxmoadg(gtknphoqwx.f69167iobyxmoadg, "Network connection lost");
            btonecajqb btonecajqbVar = btonecajqb.this;
            btonecajqbVar.lqeggnwhkg(gtknphoqwx.ppxfxbqfkf(btonecajqbVar.f69161gxszxtbevo));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(Context context, r6.zoijcleaow taskExecutor) {
        super(context, taskExecutor);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(taskExecutor, "taskExecutor");
        Object systemService = wkgbmnqykc().getSystemService("connectivity");
        zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f69161gxszxtbevo = (ConnectivityManager) systemService;
        this.f69162lqeggnwhkg = new iobyxmoadg();
    }

    @Override // n6.nufgyqmvbu
    public void dxjokdxxww() {
        try {
            yggfygwlhe.eablkybsjg().iobyxmoadg(gtknphoqwx.f69167iobyxmoadg, "Unregistering network callback");
            vdvldrhtss.ppxfxbqfkf(this.f69161gxszxtbevo, this.f69162lqeggnwhkg);
        } catch (IllegalArgumentException e13) {
            yggfygwlhe.eablkybsjg().wkgbmnqykc(gtknphoqwx.f69167iobyxmoadg, "Received exception while unregistering network callback", e13);
        } catch (SecurityException e14) {
            yggfygwlhe.eablkybsjg().wkgbmnqykc(gtknphoqwx.f69167iobyxmoadg, "Received exception while unregistering network callback", e14);
        }
    }

    @Override // n6.nufgyqmvbu
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public l6.wkgbmnqykc eablkybsjg() {
        return gtknphoqwx.ppxfxbqfkf(this.f69161gxszxtbevo);
    }

    @Override // n6.nufgyqmvbu
    public void nufgyqmvbu() {
        try {
            yggfygwlhe.eablkybsjg().iobyxmoadg(gtknphoqwx.f69167iobyxmoadg, "Registering network callback");
            kcexrzcfyt.iobyxmoadg(this.f69161gxszxtbevo, this.f69162lqeggnwhkg);
        } catch (IllegalArgumentException e13) {
            yggfygwlhe.eablkybsjg().wkgbmnqykc(gtknphoqwx.f69167iobyxmoadg, "Received exception while registering network callback", e13);
        } catch (SecurityException e14) {
            yggfygwlhe.eablkybsjg().wkgbmnqykc(gtknphoqwx.f69167iobyxmoadg, "Received exception while registering network callback", e14);
        }
    }
}
