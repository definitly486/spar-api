package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import hd.lqeggnwhkg;
import java.io.IOException;
import ld.gtknphoqwx;
import lk.cdpycssgdh;
import lk.cqumvgiudr;
import lk.eablkybsjg;
import lk.gxszxtbevo;
import lk.jyumaefscl;
import lk.yadqdtsiqt;
import lk.zynmafqrjb;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfOkHttpClient {
    @Keep
    public static void enqueue(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        Timer timer = new Timer();
        eablkybsjgVar.f(new wkgbmnqykc(gxszxtbevoVar, gtknphoqwx.gtknphoqwx(), timer, timer.lqeggnwhkg()));
    }

    @Keep
    public static cdpycssgdh execute(eablkybsjg eablkybsjgVar) throws IOException {
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = lqeggnwhkg.eablkybsjg(gtknphoqwx.gtknphoqwx());
        Timer timer = new Timer();
        long jLqeggnwhkg = timer.lqeggnwhkg();
        try {
            cdpycssgdh cdpycssgdhVarExecute = eablkybsjgVar.execute();
            iobyxmoadg(cdpycssgdhVarExecute, lqeggnwhkgVarEablkybsjg, jLqeggnwhkg, timer.eablkybsjg());
            return cdpycssgdhVarExecute;
        } catch (IOException e13) {
            zynmafqrjb zynmafqrjbVarDxjokdxxww = eablkybsjgVar.dxjokdxxww();
            if (zynmafqrjbVarDxjokdxxww != null) {
                jyumaefscl jyumaefsclVarGtknphoqwx = zynmafqrjbVarDxjokdxxww.gtknphoqwx();
                if (jyumaefsclVarGtknphoqwx != null) {
                    lqeggnwhkgVarEablkybsjg.pkzmftpjix(jyumaefsclVarGtknphoqwx.jyumaefscl().toString());
                }
                if (zynmafqrjbVarDxjokdxxww.lqeggnwhkg() != null) {
                    lqeggnwhkgVarEablkybsjg.wflxmlrfwp(zynmafqrjbVarDxjokdxxww.lqeggnwhkg());
                }
            }
            lqeggnwhkgVarEablkybsjg.esjtqupxsv(jLqeggnwhkg);
            lqeggnwhkgVarEablkybsjg.wwaezpbzkn(timer.eablkybsjg());
            jd.wkgbmnqykc.wkgbmnqykc(lqeggnwhkgVarEablkybsjg);
            throw e13;
        }
    }

    static void iobyxmoadg(cdpycssgdh cdpycssgdhVar, lqeggnwhkg lqeggnwhkgVar, long j13, long j14) {
        zynmafqrjb zynmafqrjbVarCdpycssgdh = cdpycssgdhVar.cdpycssgdh();
        if (zynmafqrjbVarCdpycssgdh == null) {
            return;
        }
        lqeggnwhkgVar.pkzmftpjix(zynmafqrjbVarCdpycssgdh.gtknphoqwx().jyumaefscl().toString());
        lqeggnwhkgVar.wflxmlrfwp(zynmafqrjbVarCdpycssgdh.lqeggnwhkg());
        if (zynmafqrjbVarCdpycssgdh.iobyxmoadg() != null) {
            long jIobyxmoadg = zynmafqrjbVarCdpycssgdh.iobyxmoadg().iobyxmoadg();
            if (jIobyxmoadg != -1) {
                lqeggnwhkgVar.iwizpuwonk(jIobyxmoadg);
            }
        }
        yadqdtsiqt yadqdtsiqtVarWkgbmnqykc = cdpycssgdhVar.wkgbmnqykc();
        if (yadqdtsiqtVarWkgbmnqykc != null) {
            long jNufgyqmvbu = yadqdtsiqtVarWkgbmnqykc.nufgyqmvbu();
            if (jNufgyqmvbu != -1) {
                lqeggnwhkgVar.iozdgvuglv(jNufgyqmvbu);
            }
            cqumvgiudr cqumvgiudrVarDxjokdxxww = yadqdtsiqtVarWkgbmnqykc.dxjokdxxww();
            if (cqumvgiudrVarDxjokdxxww != null) {
                lqeggnwhkgVar.yadqdtsiqt(cqumvgiudrVarDxjokdxxww.toString());
            }
        }
        lqeggnwhkgVar.oxmwwwfdhm(cdpycssgdhVar.btonecajqb());
        lqeggnwhkgVar.esjtqupxsv(j13);
        lqeggnwhkgVar.wwaezpbzkn(j14);
        lqeggnwhkgVar.ppxfxbqfkf();
    }
}
