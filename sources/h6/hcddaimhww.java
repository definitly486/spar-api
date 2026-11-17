package h6;

import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes2.dex */
public interface hcddaimhww {
    default void eablkybsjg(esjtqupxsv workSpecId, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpecId, "workSpecId");
        iobyxmoadg(workSpecId, i13);
    }

    void iobyxmoadg(esjtqupxsv esjtqupxsvVar, int i13);

    void ppxfxbqfkf(esjtqupxsv esjtqupxsvVar, WorkerParameters.iobyxmoadg iobyxmoadgVar);

    default void wkgbmnqykc(esjtqupxsv workSpecId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpecId, "workSpecId");
        ppxfxbqfkf(workSpecId, null);
    }

    default void zoijcleaow(esjtqupxsv workSpecId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpecId, "workSpecId");
        iobyxmoadg(workSpecId, -512);
    }
}
