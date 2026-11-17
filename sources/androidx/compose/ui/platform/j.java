package androidx.compose.ui.platform;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final g0.wflxmlrfwp f6991iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.collection.lmojexxdyd f6992zoijcleaow;

    public j(g0.zdlpuopuiu zdlpuopuiuVar, androidx.collection.ojitshcjhn ojitshcjhnVar) {
        this.f6991iobyxmoadg = zdlpuopuiuVar.esjtqupxsv();
        this.f6992zoijcleaow = new androidx.collection.lmojexxdyd(zdlpuopuiuVar.jyumaefscl().size());
        List listJyumaefscl = zdlpuopuiuVar.jyumaefscl();
        int size = listJyumaefscl.size();
        for (int i13 = 0; i13 < size; i13++) {
            g0.zdlpuopuiu zdlpuopuiuVar2 = (g0.zdlpuopuiu) listJyumaefscl.get(i13);
            if (ojitshcjhnVar.iobyxmoadg(zdlpuopuiuVar2.vdvldrhtss())) {
                this.f6992zoijcleaow.lqeggnwhkg(zdlpuopuiuVar2.vdvldrhtss());
            }
        }
    }

    public final androidx.collection.lmojexxdyd iobyxmoadg() {
        return this.f6992zoijcleaow;
    }

    public final g0.wflxmlrfwp zoijcleaow() {
        return this.f6991iobyxmoadg;
    }
}
