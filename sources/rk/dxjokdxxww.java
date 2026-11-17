package rk;

import java.net.Proxy;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.jyumaefscl;
import lk.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final dxjokdxxww f82947iobyxmoadg = new dxjokdxxww();

    private dxjokdxxww() {
    }

    private final boolean zoijcleaow(zynmafqrjb zynmafqrjbVar, Proxy.Type type) {
        return !zynmafqrjbVar.gxszxtbevo() && type == Proxy.Type.HTTP;
    }

    public final String iobyxmoadg(zynmafqrjb request, Proxy.Type proxyType) {
        zdlpuopuiu.btonecajqb(request, "request");
        zdlpuopuiu.btonecajqb(proxyType, "proxyType");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(request.lqeggnwhkg());
        sb3.append(' ');
        dxjokdxxww dxjokdxxwwVar = f82947iobyxmoadg;
        if (dxjokdxxwwVar.zoijcleaow(request, proxyType)) {
            sb3.append(request.gtknphoqwx());
        } else {
            sb3.append(dxjokdxxwwVar.ppxfxbqfkf(request.gtknphoqwx()));
        }
        sb3.append(" HTTP/1.1");
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String ppxfxbqfkf(jyumaefscl url) {
        zdlpuopuiu.btonecajqb(url, "url");
        String strWkgbmnqykc = url.wkgbmnqykc();
        String strGxszxtbevo = url.gxszxtbevo();
        if (strGxszxtbevo == null) {
            return strWkgbmnqykc;
        }
        return strWkgbmnqykc + '?' + strGxszxtbevo;
    }
}
