package rk;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.agtfadlqog;
import lk.cdpycssgdh;
import lk.cqumvgiudr;
import lk.istkbnxepw;
import lk.iwizpuwonk;
import lk.wflxmlrfwp;
import lk.yadqdtsiqt;
import lk.zynmafqrjb;
import mj.kcexrzcfyt;
import mk.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f82955iobyxmoadg;

    public iobyxmoadg(agtfadlqog cookieJar) {
        zdlpuopuiu.btonecajqb(cookieJar, "cookieJar");
        this.f82955iobyxmoadg = cookieJar;
    }

    private final String iobyxmoadg(List list) {
        StringBuilder sb3 = new StringBuilder();
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            if (i13 > 0) {
                sb3.append("; ");
            }
            sb3.append(wflxmlrfwpVar.eablkybsjg());
            sb3.append('=');
            sb3.append(wflxmlrfwpVar.lqeggnwhkg());
            i13 = i14;
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // lk.iwizpuwonk
    public cdpycssgdh intercept(iwizpuwonk.iobyxmoadg chain) {
        yadqdtsiqt yadqdtsiqtVarWkgbmnqykc;
        zdlpuopuiu.btonecajqb(chain, "chain");
        zynmafqrjb zynmafqrjbVarDxjokdxxww = chain.dxjokdxxww();
        zynmafqrjb.iobyxmoadg iobyxmoadgVarNufgyqmvbu = zynmafqrjbVarDxjokdxxww.nufgyqmvbu();
        istkbnxepw istkbnxepwVarIobyxmoadg = zynmafqrjbVarDxjokdxxww.iobyxmoadg();
        if (istkbnxepwVarIobyxmoadg != null) {
            cqumvgiudr cqumvgiudrVarZoijcleaow = istkbnxepwVarIobyxmoadg.zoijcleaow();
            if (cqumvgiudrVarZoijcleaow != null) {
                iobyxmoadgVarNufgyqmvbu.dxjokdxxww("Content-Type", cqumvgiudrVarZoijcleaow.toString());
            }
            long jIobyxmoadg = istkbnxepwVarIobyxmoadg.iobyxmoadg();
            if (jIobyxmoadg != -1) {
                iobyxmoadgVarNufgyqmvbu.dxjokdxxww("Content-Length", String.valueOf(jIobyxmoadg));
                iobyxmoadgVarNufgyqmvbu.wflxmlrfwp("Transfer-Encoding");
            } else {
                iobyxmoadgVarNufgyqmvbu.dxjokdxxww("Transfer-Encoding", "chunked");
                iobyxmoadgVarNufgyqmvbu.wflxmlrfwp("Content-Length");
            }
        }
        boolean z13 = false;
        if (zynmafqrjbVarDxjokdxxww.wkgbmnqykc("Host") == null) {
            iobyxmoadgVarNufgyqmvbu.dxjokdxxww("Host", rgvfuqvkyq.zdlpuopuiu(zynmafqrjbVarDxjokdxxww.gtknphoqwx(), false, 1, null));
        }
        if (zynmafqrjbVarDxjokdxxww.wkgbmnqykc("Connection") == null) {
            iobyxmoadgVarNufgyqmvbu.dxjokdxxww("Connection", "Keep-Alive");
        }
        if (zynmafqrjbVarDxjokdxxww.wkgbmnqykc("Accept-Encoding") == null && zynmafqrjbVarDxjokdxxww.wkgbmnqykc("Range") == null) {
            iobyxmoadgVarNufgyqmvbu.dxjokdxxww("Accept-Encoding", "gzip");
            z13 = true;
        }
        List listIobyxmoadg = this.f82955iobyxmoadg.iobyxmoadg(zynmafqrjbVarDxjokdxxww.gtknphoqwx());
        if (!listIobyxmoadg.isEmpty()) {
            iobyxmoadgVarNufgyqmvbu.dxjokdxxww("Cookie", iobyxmoadg(listIobyxmoadg));
        }
        if (zynmafqrjbVarDxjokdxxww.wkgbmnqykc("User-Agent") == null) {
            iobyxmoadgVarNufgyqmvbu.dxjokdxxww("User-Agent", "okhttp/5.0.0-alpha.11");
        }
        zynmafqrjb zynmafqrjbVarZoijcleaow = iobyxmoadgVarNufgyqmvbu.zoijcleaow();
        cdpycssgdh cdpycssgdhVarZoijcleaow = chain.zoijcleaow(zynmafqrjbVarZoijcleaow);
        eablkybsjg.gxszxtbevo(this.f82955iobyxmoadg, zynmafqrjbVarZoijcleaow.gtknphoqwx(), cdpycssgdhVarZoijcleaow.kcexrzcfyt());
        cdpycssgdh.iobyxmoadg iobyxmoadgVarVdvldrhtss = cdpycssgdhVarZoijcleaow.cqumvgiudr().vdvldrhtss(zynmafqrjbVarZoijcleaow);
        if (z13 && kcexrzcfyt.istkbnxepw("gzip", cdpycssgdh.vdvldrhtss(cdpycssgdhVarZoijcleaow, "Content-Encoding", null, 2, null), true) && eablkybsjg.zoijcleaow(cdpycssgdhVarZoijcleaow) && (yadqdtsiqtVarWkgbmnqykc = cdpycssgdhVarZoijcleaow.wkgbmnqykc()) != null) {
            bl.agtfadlqog agtfadlqogVar = new bl.agtfadlqog(yadqdtsiqtVarWkgbmnqykc.draadjrbmk());
            iobyxmoadgVarVdvldrhtss.btonecajqb(cdpycssgdhVarZoijcleaow.kcexrzcfyt().eablkybsjg().nufgyqmvbu("Content-Encoding").nufgyqmvbu("Content-Length").gxszxtbevo());
            iobyxmoadgVarVdvldrhtss.zoijcleaow(new nufgyqmvbu(cdpycssgdh.vdvldrhtss(cdpycssgdhVarZoijcleaow, "Content-Type", null, 2, null), -1L, bl.zdlpuopuiu.ppxfxbqfkf(agtfadlqogVar)));
        }
        return iobyxmoadgVarVdvldrhtss.ppxfxbqfkf();
    }
}
