package androidx.work.impl;

import android.content.Context;
import g6.lmojexxdyd;
import h6.dsvhmnatus;
import h6.hkdspvbjdz;
import h6.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.vdvldrhtss;
import n6.agtfadlqog;
import pj.cllcsxoeiz;
import pj.pkzmftpjix;
import tg.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class btonecajqb {

    /* synthetic */ class iobyxmoadg extends vdvldrhtss implements zdlpuopuiu {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f13945zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(6, btonecajqb.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        @Override // tg.zdlpuopuiu
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final List dxjokdxxww(Context p13, androidx.work.iobyxmoadg p14, r6.zoijcleaow p15, WorkDatabase p16, agtfadlqog p17, h6.zdlpuopuiu p18) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p14, "p1");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p15, "p2");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p16, "p3");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p17, "p4");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p18, "p5");
            return btonecajqb.zoijcleaow(p13, p14, p15, p16, p17, p18);
        }
    }

    public static /* synthetic */ dsvhmnatus eablkybsjg(Context context, androidx.work.iobyxmoadg iobyxmoadgVar, r6.zoijcleaow zoijcleaowVar, WorkDatabase workDatabase, agtfadlqog agtfadlqogVar, h6.zdlpuopuiu zdlpuopuiuVar, zdlpuopuiu zdlpuopuiuVar2, int i13, Object obj) {
        WorkDatabase workDatabaseZoijcleaow;
        agtfadlqog agtfadlqogVar2;
        r6.zoijcleaow ppxfxbqfkfVar = (i13 & 4) != 0 ? new r6.ppxfxbqfkf(iobyxmoadgVar.wflxmlrfwp()) : zoijcleaowVar;
        if ((i13 & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(applicationContext, "context.applicationContext");
            r6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "workTaskExecutor.serialTaskExecutor");
            workDatabaseZoijcleaow = companion.zoijcleaow(applicationContext, iobyxmoadgVarPpxfxbqfkf, iobyxmoadgVar.iobyxmoadg(), context.getResources().getBoolean(lmojexxdyd.workmanager_test_configuration));
        } else {
            workDatabaseZoijcleaow = workDatabase;
        }
        if ((i13 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(applicationContext2, "context.applicationContext");
            agtfadlqogVar2 = new agtfadlqog(applicationContext2, ppxfxbqfkfVar, null, null, null, null, 60, null);
        } else {
            agtfadlqogVar2 = agtfadlqogVar;
        }
        return wkgbmnqykc(context, iobyxmoadgVar, ppxfxbqfkfVar, workDatabaseZoijcleaow, agtfadlqogVar2, (i13 & 32) != 0 ? new h6.zdlpuopuiu(context.getApplicationContext(), iobyxmoadgVar, ppxfxbqfkfVar, workDatabaseZoijcleaow) : zdlpuopuiuVar, (i13 & 64) != 0 ? iobyxmoadg.f13945zdlpuopuiu : zdlpuopuiuVar2);
    }

    public static final cllcsxoeiz gxszxtbevo(r6.zoijcleaow taskExecutor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(taskExecutor, "taskExecutor");
        pkzmftpjix pkzmftpjixVarZoijcleaow = taskExecutor.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(pkzmftpjixVarZoijcleaow, "taskExecutor.taskCoroutineDispatcher");
        return pj.dsvhmnatus.iobyxmoadg(pkzmftpjixVarZoijcleaow);
    }

    public static final dsvhmnatus ppxfxbqfkf(Context context, androidx.work.iobyxmoadg configuration) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configuration, "configuration");
        return eablkybsjg(context, configuration, null, null, null, null, null, 124, null);
    }

    public static final dsvhmnatus wkgbmnqykc(Context context, androidx.work.iobyxmoadg configuration, r6.zoijcleaow workTaskExecutor, WorkDatabase workDatabase, agtfadlqog trackers, h6.zdlpuopuiu processor, zdlpuopuiu schedulersCreator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configuration, "configuration");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workTaskExecutor, "workTaskExecutor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workDatabase, "workDatabase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(trackers, "trackers");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(processor, "processor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(schedulersCreator, "schedulersCreator");
        return new dsvhmnatus(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, (List) schedulersCreator.dxjokdxxww(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List zoijcleaow(Context context, androidx.work.iobyxmoadg iobyxmoadgVar, r6.zoijcleaow zoijcleaowVar, WorkDatabase workDatabase, agtfadlqog agtfadlqogVar, h6.zdlpuopuiu zdlpuopuiuVar) {
        jyumaefscl jyumaefsclVarPpxfxbqfkf = androidx.work.impl.iobyxmoadg.ppxfxbqfkf(context, workDatabase, iobyxmoadgVar);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(jyumaefsclVarPpxfxbqfkf, "createBestAvailableBackg…kDatabase, configuration)");
        return hg.jyumaefscl.rgvfuqvkyq(jyumaefsclVarPpxfxbqfkf, new i6.zoijcleaow(context, iobyxmoadgVar, agtfadlqogVar, zdlpuopuiuVar, new hkdspvbjdz(zdlpuopuiuVar, zoijcleaowVar), zoijcleaowVar));
    }
}
