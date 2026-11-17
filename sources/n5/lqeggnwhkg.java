package n5;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final String f68817agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final Intent f68818btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final boolean f68819draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final Executor f68820dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final List f68821eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final boolean f68822gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final boolean f68823gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Context f68824iobyxmoadg;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public final boolean f68825kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final oxmwwwfdhm.wkgbmnqykc f68826lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final Executor f68827nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final File f68828ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public final List f68829oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final u5.nufgyqmvbu.ppxfxbqfkf f68830ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final Callable f68831rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public final List f68832vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final Set f68833wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final oxmwwwfdhm.eablkybsjg f68834wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f68835zoijcleaow;

    public lqeggnwhkg(Context context, String str, u5.nufgyqmvbu.ppxfxbqfkf sqliteOpenHelperFactory, oxmwwwfdhm.eablkybsjg migrationContainer, List list, boolean z13, oxmwwwfdhm.wkgbmnqykc journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z14, boolean z15, Set set, String str2, File file, Callable callable, oxmwwwfdhm.gxszxtbevo gxszxtbevoVar, List typeConverters, List autoMigrationSpecs) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(journalMode, "journalMode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeConverters, "typeConverters");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(autoMigrationSpecs, "autoMigrationSpecs");
        this.f68824iobyxmoadg = context;
        this.f68835zoijcleaow = str;
        this.f68830ppxfxbqfkf = sqliteOpenHelperFactory;
        this.f68834wkgbmnqykc = migrationContainer;
        this.f68821eablkybsjg = list;
        this.f68823gxszxtbevo = z13;
        this.f68826lqeggnwhkg = journalMode;
        this.f68827nufgyqmvbu = queryExecutor;
        this.f68820dxjokdxxww = transactionExecutor;
        this.f68818btonecajqb = intent;
        this.f68822gtknphoqwx = z14;
        this.f68819draadjrbmk = z15;
        this.f68833wflxmlrfwp = set;
        this.f68817agtfadlqog = str2;
        this.f68828ojitshcjhn = file;
        this.f68831rgvfuqvkyq = callable;
        this.f68832vdvldrhtss = typeConverters;
        this.f68829oxmwwwfdhm = autoMigrationSpecs;
        this.f68825kcexrzcfyt = intent != null;
    }

    public boolean iobyxmoadg(int i13, int i14) {
        if ((i13 > i14 && this.f68819draadjrbmk) || !this.f68822gtknphoqwx) {
            return false;
        }
        Set set = this.f68833wflxmlrfwp;
        return set == null || !set.contains(Integer.valueOf(i13));
    }
}
