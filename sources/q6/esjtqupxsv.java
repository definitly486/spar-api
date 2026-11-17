package q6;

import android.net.NetworkRequest;

/* JADX INFO: loaded from: classes2.dex */
final class esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final esjtqupxsv f77928iobyxmoadg = new esjtqupxsv();

    private esjtqupxsv() {
    }

    public final int[] iobyxmoadg(NetworkRequest request) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        int[] capabilities = request.getCapabilities();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(capabilities, "request.capabilities");
        return capabilities;
    }

    public final int[] zoijcleaow(NetworkRequest request) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        int[] transportTypes = request.getTransportTypes();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(transportTypes, "request.transportTypes");
        return transportTypes;
    }
}
