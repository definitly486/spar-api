package zl;

import xl.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {
    public static void iobyxmoadg(gxszxtbevo gxszxtbevoVar, zdlpuopuiu zdlpuopuiuVar) {
        vl.zoijcleaow.btonecajqb(gxszxtbevoVar);
        vl.zoijcleaow.btonecajqb(zdlpuopuiuVar);
        zdlpuopuiu zdlpuopuiuVarDraadjrbmk = zdlpuopuiuVar;
        int i13 = 0;
        while (zdlpuopuiuVarDraadjrbmk != null) {
            zdlpuopuiu zdlpuopuiuVarDsvhmnatus = zdlpuopuiuVarDraadjrbmk.dsvhmnatus();
            int iWflxmlrfwp = zdlpuopuiuVarDsvhmnatus != null ? zdlpuopuiuVarDsvhmnatus.wflxmlrfwp() : 0;
            zdlpuopuiu zdlpuopuiuVarZynmafqrjb = zdlpuopuiuVarDraadjrbmk.zynmafqrjb();
            gxszxtbevoVar.iobyxmoadg(zdlpuopuiuVarDraadjrbmk, i13);
            if (zdlpuopuiuVarDsvhmnatus != null && !zdlpuopuiuVarDraadjrbmk.cqumvgiudr()) {
                if (iWflxmlrfwp == zdlpuopuiuVarDsvhmnatus.wflxmlrfwp()) {
                    zdlpuopuiuVarDraadjrbmk = zdlpuopuiuVarDsvhmnatus.draadjrbmk(zdlpuopuiuVarDraadjrbmk.jztzpxfvev());
                } else if (zdlpuopuiuVarZynmafqrjb == null) {
                    i13--;
                    zdlpuopuiuVarDraadjrbmk = zdlpuopuiuVarDsvhmnatus;
                } else {
                    zdlpuopuiuVarDraadjrbmk = zdlpuopuiuVarZynmafqrjb;
                }
            }
            if (zdlpuopuiuVarDraadjrbmk.wflxmlrfwp() > 0) {
                zdlpuopuiuVarDraadjrbmk = zdlpuopuiuVarDraadjrbmk.draadjrbmk(0);
                i13++;
            } else {
                while (zdlpuopuiuVarDraadjrbmk.zynmafqrjb() == null && i13 > 0) {
                    gxszxtbevoVar.zoijcleaow(zdlpuopuiuVarDraadjrbmk, i13);
                    zdlpuopuiuVarDraadjrbmk = zdlpuopuiuVarDraadjrbmk.dsvhmnatus();
                    i13--;
                }
                gxszxtbevoVar.zoijcleaow(zdlpuopuiuVarDraadjrbmk, i13);
                if (zdlpuopuiuVarDraadjrbmk == zdlpuopuiuVar) {
                    return;
                } else {
                    zdlpuopuiuVarDraadjrbmk = zdlpuopuiuVarDraadjrbmk.zynmafqrjb();
                }
            }
        }
    }
}
