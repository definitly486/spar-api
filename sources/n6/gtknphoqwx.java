package n6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import g6.yggfygwlhe;
import kotlin.jvm.internal.zdlpuopuiu;
import q6.oxmwwwfdhm;
import q6.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f69167iobyxmoadg;

    static {
        String strDxjokdxxww = yggfygwlhe.dxjokdxxww("NetworkStateTracker");
        zdlpuopuiu.dxjokdxxww(strDxjokdxxww, "tagWithPrefix(\"NetworkStateTracker\")");
        f69167iobyxmoadg = strDxjokdxxww;
    }

    public static final boolean eablkybsjg(ConnectivityManager connectivityManager) {
        zdlpuopuiu.btonecajqb(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesIobyxmoadg = vdvldrhtss.iobyxmoadg(connectivityManager, oxmwwwfdhm.iobyxmoadg(connectivityManager));
            if (networkCapabilitiesIobyxmoadg != null) {
                return vdvldrhtss.zoijcleaow(networkCapabilitiesIobyxmoadg, 16);
            }
            return false;
        } catch (SecurityException e13) {
            yggfygwlhe.eablkybsjg().wkgbmnqykc(f69167iobyxmoadg, "Unable to validate active network", e13);
            return false;
        }
    }

    public static final nufgyqmvbu iobyxmoadg(Context context, r6.zoijcleaow taskExecutor) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(taskExecutor, "taskExecutor");
        return new btonecajqb(context, taskExecutor);
    }

    public static final l6.wkgbmnqykc ppxfxbqfkf(ConnectivityManager connectivityManager) {
        zdlpuopuiu.btonecajqb(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z13 = false;
        boolean z14 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zEablkybsjg = eablkybsjg(connectivityManager);
        boolean zIobyxmoadg = p1.iobyxmoadg.iobyxmoadg(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z13 = true;
        }
        return new l6.wkgbmnqykc(z14, zEablkybsjg, zIobyxmoadg, z13);
    }

    public static final l6.wkgbmnqykc wkgbmnqykc(NetworkCapabilities networkCapabilities) {
        zdlpuopuiu.btonecajqb(networkCapabilities, "<this>");
        return new l6.wkgbmnqykc(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18));
    }
}
