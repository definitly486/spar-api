package lk;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f63197iobyxmoadg = iobyxmoadg.f63199iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final vdvldrhtss f63198zoijcleaow = new iobyxmoadg.C1283iobyxmoadg();

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f63199iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: lk.vdvldrhtss$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static final class C1283iobyxmoadg implements vdvldrhtss {
            @Override // lk.vdvldrhtss
            public List iobyxmoadg(String hostname) throws UnknownHostException {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(allByName, "getAllByName(hostname)");
                    return hg.agtfadlqog.i(allByName);
                } catch (NullPointerException e13) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e13);
                    throw unknownHostException;
                }
            }
        }

        private iobyxmoadg() {
        }
    }

    List iobyxmoadg(String str);
}
