package g0;

import android.os.Trace;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final g.lqeggnwhkg f35611iobyxmoadg = new g.lqeggnwhkg(0.0f, 0.0f, 10.0f, 10.0f);

    public static final androidx.collection.ojitshcjhn iobyxmoadg(iwizpuwonk iwizpuwonkVar, int i13) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            zdlpuopuiu zdlpuopuiuVarWkgbmnqykc = iwizpuwonkVar.wkgbmnqykc();
            if (zdlpuopuiuVarWkgbmnqykc.kcexrzcfyt().gtknphoqwx() && zdlpuopuiuVarWkgbmnqykc.kcexrzcfyt().gxszxtbevo()) {
                androidx.collection.iozdgvuglv iozdgvuglvVar = new androidx.collection.iozdgvuglv(48);
                iozdgvuglv iozdgvuglvVarIobyxmoadg = lmojexxdyd.iobyxmoadg();
                iozdgvuglvVarIobyxmoadg.zoijcleaow(w0.vdvldrhtss.zoijcleaow(zdlpuopuiuVarWkgbmnqykc.gtknphoqwx()));
                zoijcleaow(iozdgvuglvVarIobyxmoadg, zdlpuopuiuVarWkgbmnqykc, i13, iozdgvuglvVar, zdlpuopuiuVarWkgbmnqykc, lmojexxdyd.iobyxmoadg());
                return iozdgvuglvVar;
            }
            return androidx.collection.rgvfuqvkyq.iobyxmoadg();
        } finally {
            Trace.endSection();
        }
    }

    public static final boolean ppxfxbqfkf(zdlpuopuiu zdlpuopuiuVar) {
        if (!zdlpuopuiuVar.zynmafqrjb()) {
            wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
            esjtqupxsv esjtqupxsvVar = esjtqupxsv.f35662iobyxmoadg;
            if (!wflxmlrfwpVarEsjtqupxsv.ppxfxbqfkf(esjtqupxsvVar.gtknphoqwx()) && !zdlpuopuiuVar.esjtqupxsv().ppxfxbqfkf(esjtqupxsvVar.rgvfuqvkyq())) {
                return false;
            }
        }
        return true;
    }

    public static final boolean wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar) {
        return !ppxfxbqfkf(zdlpuopuiuVar) && (zdlpuopuiuVar.esjtqupxsv().agtfadlqog() || zdlpuopuiuVar.esjtqupxsv().wkgbmnqykc());
    }

    private static final void zoijcleaow(iozdgvuglv iozdgvuglvVar, zdlpuopuiu zdlpuopuiuVar, int i13, androidx.collection.iozdgvuglv iozdgvuglvVar2, zdlpuopuiu zdlpuopuiuVar2, iozdgvuglv iozdgvuglvVar3) {
        x.zdlpuopuiu zdlpuopuiuVarOxmwwwfdhm;
        boolean z13 = (zdlpuopuiuVar2.kcexrzcfyt().gtknphoqwx() && zdlpuopuiuVar2.kcexrzcfyt().gxszxtbevo()) ? false : true;
        if (!iozdgvuglvVar.isEmpty() || zdlpuopuiuVar2.vdvldrhtss() == zdlpuopuiuVar.vdvldrhtss()) {
            if (!z13 || zdlpuopuiuVar2.lereixgezr()) {
                w0.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = w0.vdvldrhtss.zoijcleaow(zdlpuopuiuVar2.cqumvgiudr());
                iozdgvuglvVar3.zoijcleaow(rgvfuqvkyqVarZoijcleaow);
                int iVdvldrhtss = zdlpuopuiuVar2.vdvldrhtss() == zdlpuopuiuVar.vdvldrhtss() ? i13 : zdlpuopuiuVar2.vdvldrhtss();
                if (!iozdgvuglvVar3.iobyxmoadg(iozdgvuglvVar)) {
                    if (zdlpuopuiuVar2.lereixgezr()) {
                        zdlpuopuiu zdlpuopuiuVarZdlpuopuiu = zdlpuopuiuVar2.zdlpuopuiu();
                        iozdgvuglvVar2.oxmwwwfdhm(iVdvldrhtss, new jyumaefscl(zdlpuopuiuVar2, w0.vdvldrhtss.zoijcleaow((zdlpuopuiuVarZdlpuopuiu == null || (zdlpuopuiuVarOxmwwwfdhm = zdlpuopuiuVarZdlpuopuiu.oxmwwwfdhm()) == null || !zdlpuopuiuVarOxmwwwfdhm.gtknphoqwx()) ? f35611iobyxmoadg : zdlpuopuiuVarZdlpuopuiu.gtknphoqwx())));
                        return;
                    } else {
                        if (iVdvldrhtss == i13) {
                            iozdgvuglvVar2.oxmwwwfdhm(iVdvldrhtss, new jyumaefscl(zdlpuopuiuVar2, iozdgvuglvVar3.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                iozdgvuglvVar2.oxmwwwfdhm(iVdvldrhtss, new jyumaefscl(zdlpuopuiuVar2, iozdgvuglvVar3.getBounds()));
                List listJyumaefscl = zdlpuopuiuVar2.jyumaefscl();
                for (int size = listJyumaefscl.size() - 1; -1 < size; size--) {
                    if (!((zdlpuopuiu) listJyumaefscl.get(size)).rgvfuqvkyq().ppxfxbqfkf(esjtqupxsv.f35662iobyxmoadg.cqumvgiudr())) {
                        zoijcleaow(iozdgvuglvVar, zdlpuopuiuVar, i13, iozdgvuglvVar2, (zdlpuopuiu) listJyumaefscl.get(size), iozdgvuglvVar3);
                    }
                }
                if (wkgbmnqykc(zdlpuopuiuVar2)) {
                    iozdgvuglvVar.ppxfxbqfkf(rgvfuqvkyqVarZoijcleaow);
                }
            }
        }
    }
}
