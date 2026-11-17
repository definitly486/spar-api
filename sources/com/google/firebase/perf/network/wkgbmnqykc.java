package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import hd.lqeggnwhkg;
import java.io.IOException;
import ld.gtknphoqwx;
import lk.cdpycssgdh;
import lk.eablkybsjg;
import lk.gxszxtbevo;
import lk.jyumaefscl;
import lk.zynmafqrjb;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc implements gxszxtbevo {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final long f24645iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Timer f24646jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lqeggnwhkg f24647yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final gxszxtbevo f24648zdlpuopuiu;

    public wkgbmnqykc(gxszxtbevo gxszxtbevoVar, gtknphoqwx gtknphoqwxVar, Timer timer, long j13) {
        this.f24648zdlpuopuiu = gxszxtbevoVar;
        this.f24647yggfygwlhe = lqeggnwhkg.eablkybsjg(gtknphoqwxVar);
        this.f24645iwizpuwonk = j13;
        this.f24646jyumaefscl = timer;
    }

    @Override // lk.gxszxtbevo
    public void gxszxtbevo(eablkybsjg eablkybsjgVar, IOException iOException) {
        zynmafqrjb zynmafqrjbVarDxjokdxxww = eablkybsjgVar.dxjokdxxww();
        if (zynmafqrjbVarDxjokdxxww != null) {
            jyumaefscl jyumaefsclVarGtknphoqwx = zynmafqrjbVarDxjokdxxww.gtknphoqwx();
            if (jyumaefsclVarGtknphoqwx != null) {
                this.f24647yggfygwlhe.pkzmftpjix(jyumaefsclVarGtknphoqwx.jyumaefscl().toString());
            }
            if (zynmafqrjbVarDxjokdxxww.lqeggnwhkg() != null) {
                this.f24647yggfygwlhe.wflxmlrfwp(zynmafqrjbVarDxjokdxxww.lqeggnwhkg());
            }
        }
        this.f24647yggfygwlhe.esjtqupxsv(this.f24645iwizpuwonk);
        this.f24647yggfygwlhe.wwaezpbzkn(this.f24646jyumaefscl.eablkybsjg());
        jd.wkgbmnqykc.wkgbmnqykc(this.f24647yggfygwlhe);
        this.f24648zdlpuopuiu.gxszxtbevo(eablkybsjgVar, iOException);
    }

    @Override // lk.gxszxtbevo
    public void ppxfxbqfkf(eablkybsjg eablkybsjgVar, cdpycssgdh cdpycssgdhVar) {
        FirebasePerfOkHttpClient.iobyxmoadg(cdpycssgdhVar, this.f24647yggfygwlhe, this.f24645iwizpuwonk, this.f24646jyumaefscl.eablkybsjg());
        this.f24648zdlpuopuiu.ppxfxbqfkf(eablkybsjgVar, cdpycssgdhVar);
    }
}
