package q6;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final WorkDatabase f77915iobyxmoadg;

    public agtfadlqog(WorkDatabase workDatabase) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workDatabase, "workDatabase");
        this.f77915iobyxmoadg = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer gxszxtbevo(agtfadlqog agtfadlqogVar, int i13, int i14) {
        int iWkgbmnqykc = ojitshcjhn.wkgbmnqykc(agtfadlqogVar.f77915iobyxmoadg, "next_job_scheduler_id");
        if (i13 > iWkgbmnqykc || iWkgbmnqykc > i14) {
            ojitshcjhn.eablkybsjg(agtfadlqogVar.f77915iobyxmoadg, "next_job_scheduler_id", i13 + 1);
        } else {
            i13 = iWkgbmnqykc;
        }
        return Integer.valueOf(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer wkgbmnqykc(agtfadlqog agtfadlqogVar) {
        return Integer.valueOf(ojitshcjhn.wkgbmnqykc(agtfadlqogVar.f77915iobyxmoadg, "next_alarm_manager_id"));
    }

    public final int eablkybsjg(final int i13, final int i14) {
        Object objHkdspvbjdz = this.f77915iobyxmoadg.hkdspvbjdz(new Callable() { // from class: q6.wflxmlrfwp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return agtfadlqog.gxszxtbevo(this.f77964iobyxmoadg, i13, i14);
            }
        });
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objHkdspvbjdz, "workDatabase.runInTransa…d\n            }\n        )");
        return ((Number) objHkdspvbjdz).intValue();
    }

    public final int ppxfxbqfkf() {
        Object objHkdspvbjdz = this.f77915iobyxmoadg.hkdspvbjdz(new Callable() { // from class: q6.draadjrbmk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return agtfadlqog.wkgbmnqykc(this.f77924iobyxmoadg);
            }
        });
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objHkdspvbjdz, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        return ((Number) objHkdspvbjdz).intValue();
    }
}
