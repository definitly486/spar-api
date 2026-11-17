package ac2;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import zb2.EventsPackage;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements ac2.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final iobyxmoadg f1547ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tb2.iobyxmoadg f1548iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dc2.iobyxmoadg f1549zoijcleaow;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public zoijcleaow(tb2.iobyxmoadg settings, dc2.iobyxmoadg networkClient) {
        zdlpuopuiu.btonecajqb(settings, "settings");
        zdlpuopuiu.btonecajqb(networkClient, "networkClient");
        this.f1548iobyxmoadg = settings;
        this.f1549zoijcleaow = networkClient;
    }

    @Override // ac2.iobyxmoadg
    public Object iobyxmoadg(EventsPackage eventsPackage, gxszxtbevo gxszxtbevoVar) {
        gk.zoijcleaow.iobyxmoadg iobyxmoadgVar = gk.zoijcleaow.f37751wkgbmnqykc;
        iobyxmoadgVar.iobyxmoadg();
        int iSendToNetwork = this.f1549zoijcleaow.sendToNetwork(this.f1548iobyxmoadg.eablkybsjg(), iobyxmoadgVar.zoijcleaow(EventsPackage.INSTANCE.serializer(), eventsPackage));
        if (200 > iSendToNetwork || iSendToNetwork >= 207) {
            this.f1548iobyxmoadg.zoijcleaow().zoijcleaow("NetworkDelegate", "Data not sent");
        } else {
            this.f1548iobyxmoadg.zoijcleaow().zoijcleaow("NetworkDelegate", "Data sent successfully");
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
