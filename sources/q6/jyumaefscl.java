package q6;

import android.net.NetworkRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final jyumaefscl f77946iobyxmoadg = new jyumaefscl();

    private jyumaefscl() {
    }

    public static final NetworkRequest iobyxmoadg(int[] capabilities, int[] transports) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(capabilities, "capabilities");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i13 : capabilities) {
            try {
                builder.addCapability(i13);
            } catch (IllegalArgumentException e13) {
                g6.yggfygwlhe.eablkybsjg().draadjrbmk(lereixgezr.f77948zoijcleaow.iobyxmoadg(), "Ignoring adding capability '" + i13 + '\'', e13);
            }
        }
        for (int i14 : transports) {
            builder.addTransportType(i14);
        }
        NetworkRequest networkRequestBuild = builder.build();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(networkRequestBuild, "networkRequest.build()");
        return networkRequestBuild;
    }

    public final boolean ppxfxbqfkf(NetworkRequest request, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        return request.hasCapability(i13);
    }

    public final boolean wkgbmnqykc(NetworkRequest request, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        return request.hasTransport(i13);
    }

    public final lereixgezr zoijcleaow(int[] capabilities, int[] transports) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(capabilities, "capabilities");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transports, "transports");
        return new lereixgezr(iobyxmoadg(capabilities, transports));
    }
}
