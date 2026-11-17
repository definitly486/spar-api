package ac;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
class vdvldrhtss {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    static final FilenameFilter f1424zdlpuopuiu = new FilenameFilter() { // from class: ac.rgvfuqvkyq
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return vdvldrhtss.hcddaimhww(file, str);
        }
    };

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private istkbnxepw f1425agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final xb.iobyxmoadg f1426btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final agtfadlqog f1427draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final cc.eablkybsjg f1428dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final bc.gxszxtbevo f1429eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final yb.iobyxmoadg f1430gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final pkzmftpjix f1431gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f1432iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final gc.lqeggnwhkg f1434lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ac.zoijcleaow f1435nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lereixgezr f1438ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final ribwqtqdhb f1441wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cc.ojitshcjhn f1442wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yadqdtsiqt f1443zoijcleaow;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private ic.btonecajqb f1436ojitshcjhn = null;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    final TaskCompletionSource f1439rgvfuqvkyq = new TaskCompletionSource();

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    final TaskCompletionSource f1440vdvldrhtss = new TaskCompletionSource();

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    final TaskCompletionSource f1437oxmwwwfdhm = new TaskCompletionSource();

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    final AtomicBoolean f1433kcexrzcfyt = new AtomicBoolean(false);

    class eablkybsjg implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ long f1444iobyxmoadg;

        eablkybsjg(long j13) {
            this.f1444iobyxmoadg = j13;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f1444iobyxmoadg);
            vdvldrhtss.this.f1430gtknphoqwx.iobyxmoadg("_ae", bundle);
            return null;
        }
    }

    class iobyxmoadg implements istkbnxepw.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // ac.istkbnxepw.iobyxmoadg
        public void iobyxmoadg(ic.btonecajqb btonecajqbVar, Thread thread, Throwable th2) {
            vdvldrhtss.this.lmojexxdyd(btonecajqbVar, thread, th2);
        }
    }

    class ppxfxbqfkf implements SuccessContinuation {
        ppxfxbqfkf() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Task then(Void r13) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    class wkgbmnqykc implements SuccessContinuation {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Task f1448iobyxmoadg;

        class iobyxmoadg implements SuccessContinuation {
            iobyxmoadg() {
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public Task then(ic.wkgbmnqykc wkgbmnqykcVar) {
                if (wkgbmnqykcVar == null) {
                    xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Received null app settings at app startup. Cannot send cached reports");
                    return Tasks.forResult(null);
                }
                vdvldrhtss.this.cllcsxoeiz();
                vdvldrhtss.this.f1441wflxmlrfwp.lereixgezr(vdvldrhtss.this.f1429eablkybsjg.f15695iobyxmoadg);
                vdvldrhtss.this.f1437oxmwwwfdhm.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        wkgbmnqykc(Task task) {
            this.f1448iobyxmoadg = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Task then(Boolean bool) {
            if (bool.booleanValue()) {
                xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Sending cached crash reports...");
                vdvldrhtss.this.f1443zoijcleaow.ppxfxbqfkf(bool.booleanValue());
                return this.f1448iobyxmoadg.onSuccessTask(vdvldrhtss.this.f1429eablkybsjg.f15695iobyxmoadg, new iobyxmoadg());
            }
            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Deleting cached crash reports...");
            vdvldrhtss.vdvldrhtss(vdvldrhtss.this.jpowsppfya());
            vdvldrhtss.this.f1441wflxmlrfwp.esjtqupxsv();
            vdvldrhtss.this.f1437oxmwwwfdhm.trySetResult(null);
            return Tasks.forResult(null);
        }
    }

    class zoijcleaow implements Callable {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ boolean f1451eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ long f1453iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ Thread f1454ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ ic.btonecajqb f1455wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ Throwable f1456zoijcleaow;

        class iobyxmoadg implements SuccessContinuation {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ String f1457iobyxmoadg;

            iobyxmoadg(String str) {
                this.f1457iobyxmoadg = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public Task then(ic.wkgbmnqykc wkgbmnqykcVar) {
                if (wkgbmnqykcVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{vdvldrhtss.this.cllcsxoeiz(), vdvldrhtss.this.f1441wflxmlrfwp.pmvmpeiblj(vdvldrhtss.this.f1429eablkybsjg.f15695iobyxmoadg, zoijcleaow.this.f1451eablkybsjg ? this.f1457iobyxmoadg : null)});
                }
                xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Received null app settings, cannot send reports at crash time.");
                return Tasks.forResult(null);
            }
        }

        zoijcleaow(long j13, Throwable th2, Thread thread, ic.btonecajqb btonecajqbVar, boolean z13) {
            this.f1453iobyxmoadg = j13;
            this.f1456zoijcleaow = th2;
            this.f1454ppxfxbqfkf = thread;
            this.f1455wkgbmnqykc = btonecajqbVar;
            this.f1451eablkybsjg = z13;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Task call() {
            long jYadqdtsiqt = vdvldrhtss.yadqdtsiqt(this.f1453iobyxmoadg);
            String strPmvmpeiblj = vdvldrhtss.this.pmvmpeiblj();
            if (strPmvmpeiblj == null) {
                xb.lqeggnwhkg.gxszxtbevo().wkgbmnqykc("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            vdvldrhtss.this.f1438ppxfxbqfkf.iobyxmoadg();
            vdvldrhtss.this.f1441wflxmlrfwp.jyumaefscl(this.f1456zoijcleaow, this.f1454ppxfxbqfkf, strPmvmpeiblj, jYadqdtsiqt);
            vdvldrhtss.this.jyumaefscl(this.f1453iobyxmoadg);
            vdvldrhtss.this.kcexrzcfyt(this.f1455wkgbmnqykc);
            vdvldrhtss.this.yggfygwlhe(new dxjokdxxww().ppxfxbqfkf(), Boolean.valueOf(this.f1451eablkybsjg));
            return !vdvldrhtss.this.f1443zoijcleaow.wkgbmnqykc() ? Tasks.forResult(null) : this.f1455wkgbmnqykc.iobyxmoadg().onSuccessTask(vdvldrhtss.this.f1429eablkybsjg.f15695iobyxmoadg, new iobyxmoadg(strPmvmpeiblj));
        }
    }

    vdvldrhtss(Context context, pkzmftpjix pkzmftpjixVar, yadqdtsiqt yadqdtsiqtVar, gc.lqeggnwhkg lqeggnwhkgVar, lereixgezr lereixgezrVar, ac.zoijcleaow zoijcleaowVar, cc.ojitshcjhn ojitshcjhnVar, cc.eablkybsjg eablkybsjgVar, ribwqtqdhb ribwqtqdhbVar, xb.iobyxmoadg iobyxmoadgVar, yb.iobyxmoadg iobyxmoadgVar2, agtfadlqog agtfadlqogVar, bc.gxszxtbevo gxszxtbevoVar) {
        this.f1432iobyxmoadg = context;
        this.f1431gxszxtbevo = pkzmftpjixVar;
        this.f1443zoijcleaow = yadqdtsiqtVar;
        this.f1434lqeggnwhkg = lqeggnwhkgVar;
        this.f1438ppxfxbqfkf = lereixgezrVar;
        this.f1435nufgyqmvbu = zoijcleaowVar;
        this.f1442wkgbmnqykc = ojitshcjhnVar;
        this.f1428dxjokdxxww = eablkybsjgVar;
        this.f1426btonecajqb = iobyxmoadgVar;
        this.f1430gtknphoqwx = iobyxmoadgVar2;
        this.f1427draadjrbmk = agtfadlqogVar;
        this.f1441wflxmlrfwp = ribwqtqdhbVar;
        this.f1429eablkybsjg = gxszxtbevoVar;
    }

    private static dc.lmojexxdyd.iobyxmoadg agtfadlqog(pkzmftpjix pkzmftpjixVar, ac.zoijcleaow zoijcleaowVar) {
        return dc.lmojexxdyd.iobyxmoadg.zoijcleaow(pkzmftpjixVar.gxszxtbevo(), zoijcleaowVar.f1486gxszxtbevo, zoijcleaowVar.f1488lqeggnwhkg, pkzmftpjixVar.iobyxmoadg().ppxfxbqfkf(), iozdgvuglv.wkgbmnqykc(zoijcleaowVar.f1491wkgbmnqykc).lqeggnwhkg(), zoijcleaowVar.f1489nufgyqmvbu);
    }

    private InputStream cdpycssgdh(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        xb.lqeggnwhkg.gxszxtbevo().lqeggnwhkg("No version control information found");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task cllcsxoeiz() {
        ArrayList arrayList = new ArrayList();
        for (File file : jpowsppfya()) {
            try {
                arrayList.add(hkdspvbjdz(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private void cqumvgiudr(String str) {
        xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Finalizing native report for session " + str);
        xb.nufgyqmvbu nufgyqmvbuVarIobyxmoadg = this.f1426btonecajqb.iobyxmoadg(str);
        File filePpxfxbqfkf = nufgyqmvbuVarIobyxmoadg.ppxfxbqfkf();
        dc.iozdgvuglv.iobyxmoadg iobyxmoadgVarZoijcleaow = nufgyqmvbuVarIobyxmoadg.zoijcleaow();
        if (dsvhmnatus(str, filePpxfxbqfkf, iobyxmoadgVarZoijcleaow)) {
            xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("No native core present");
            return;
        }
        long jLastModified = filePpxfxbqfkf.lastModified();
        cc.eablkybsjg eablkybsjgVar = new cc.eablkybsjg(this.f1434lqeggnwhkg, str);
        File fileGtknphoqwx = this.f1434lqeggnwhkg.gtknphoqwx(str);
        if (!fileGtknphoqwx.isDirectory()) {
            xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Couldn't create directory to store native session files, aborting.");
            return;
        }
        jyumaefscl(jLastModified);
        List listIstkbnxepw = istkbnxepw(nufgyqmvbuVarIobyxmoadg, str, this.f1434lqeggnwhkg, eablkybsjgVar.zoijcleaow());
        cllcsxoeiz.zoijcleaow(fileGtknphoqwx, listIstkbnxepw);
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("CrashlyticsController#finalizePreviousNativeSession");
        this.f1441wflxmlrfwp.gtknphoqwx(str, listIstkbnxepw, iobyxmoadgVarZoijcleaow);
        eablkybsjgVar.iobyxmoadg();
    }

    private Task crxdokpmqz() {
        if (this.f1443zoijcleaow.wkgbmnqykc()) {
            xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Automatic data collection is enabled. Allowing upload.");
            this.f1439rgvfuqvkyq.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Automatic data collection is disabled.");
        xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Notifying that unsent reports are available.");
        this.f1439rgvfuqvkyq.trySetResult(Boolean.TRUE);
        Task taskOnSuccessTask = this.f1443zoijcleaow.nufgyqmvbu().onSuccessTask(new ppxfxbqfkf());
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Waiting for send/deleteUnsentReports to be called.");
        return bc.zoijcleaow.ppxfxbqfkf(taskOnSuccessTask, this.f1440vdvldrhtss.getTask());
    }

    private static boolean dsvhmnatus(String str, File file, dc.iozdgvuglv.iobyxmoadg iobyxmoadgVar) {
        if (file == null || !file.exists()) {
            xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("No minidump data found for session " + str);
        }
        if (iobyxmoadgVar == null) {
            xb.lqeggnwhkg.gxszxtbevo().lqeggnwhkg("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && iobyxmoadgVar == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean hcddaimhww(File file, String str) {
        return str.startsWith(".ae");
    }

    private Task hkdspvbjdz(long j13) {
        if (lereixgezr()) {
            xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new eablkybsjg(j13));
    }

    static List istkbnxepw(xb.nufgyqmvbu nufgyqmvbuVar, String str, gc.lqeggnwhkg lqeggnwhkgVar, byte[] bArr) {
        File fileVdvldrhtss = lqeggnwhkgVar.vdvldrhtss(str, "user-data");
        File fileVdvldrhtss2 = lqeggnwhkgVar.vdvldrhtss(str, "keys");
        File fileVdvldrhtss3 = lqeggnwhkgVar.vdvldrhtss(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new nufgyqmvbu("logs_file", "logs", bArr));
        arrayList.add(new wwaezpbzkn("crash_meta_file", "metadata", nufgyqmvbuVar.wkgbmnqykc()));
        arrayList.add(new wwaezpbzkn("session_meta_file", "session", nufgyqmvbuVar.lqeggnwhkg()));
        arrayList.add(new wwaezpbzkn("app_meta_file", "app", nufgyqmvbuVar.eablkybsjg()));
        arrayList.add(new wwaezpbzkn("device_meta_file", "device", nufgyqmvbuVar.iobyxmoadg()));
        arrayList.add(new wwaezpbzkn("os_meta_file", "os", nufgyqmvbuVar.gxszxtbevo()));
        arrayList.add(wypolnanlu(nufgyqmvbuVar));
        arrayList.add(new wwaezpbzkn("user_meta_file", "user", fileVdvldrhtss));
        arrayList.add(new wwaezpbzkn("keys_file", "keys", fileVdvldrhtss2));
        arrayList.add(new wwaezpbzkn("rollouts_file", "rollouts", fileVdvldrhtss3));
        return arrayList;
    }

    private void jlmebxxoox(String str) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30) {
            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("ANR feature enabled, but device is API " + i13);
            return;
        }
        List historicalProcessExitReasons = ((ActivityManager) this.f1432iobyxmoadg.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f1441wflxmlrfwp.cqumvgiudr(str, historicalProcessExitReasons, new cc.eablkybsjg(this.f1434lqeggnwhkg, str), cc.ojitshcjhn.wflxmlrfwp(str, this.f1434lqeggnwhkg, this.f1429eablkybsjg));
        } else {
            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("No ApplicationExitInfo available. Session: " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jyumaefscl(long j13) {
        try {
            if (this.f1434lqeggnwhkg.lqeggnwhkg(".ae" + j13).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e13) {
            xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Could not create app exception marker file.", e13);
        }
    }

    private static byte[] kegysxyocb(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
        while (true) {
            int i13 = inputStream.read(bArr);
            if (i13 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i13);
        }
    }

    private static boolean lereixgezr() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static dc.lmojexxdyd.zoijcleaow ojitshcjhn(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return dc.lmojexxdyd.zoijcleaow.ppxfxbqfkf(btonecajqb.gtknphoqwx(), Build.MODEL, Runtime.getRuntime().availableProcessors(), btonecajqb.zoijcleaow(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), btonecajqb.iwizpuwonk(), btonecajqb.draadjrbmk(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void pkzmftpjix(String str) {
        yggfygwlhe(str, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String pmvmpeiblj() {
        SortedSet sortedSetOxmwwwfdhm = this.f1441wflxmlrfwp.oxmwwwfdhm();
        if (sortedSetOxmwwwfdhm.isEmpty()) {
            return null;
        }
        return (String) sortedSetOxmwwwfdhm.first();
    }

    private static dc.lmojexxdyd.ppxfxbqfkf rgvfuqvkyq() {
        return dc.lmojexxdyd.ppxfxbqfkf.iobyxmoadg(Build.VERSION.RELEASE, Build.VERSION.CODENAME, btonecajqb.cqumvgiudr());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vdvldrhtss(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static hkdspvbjdz wypolnanlu(xb.nufgyqmvbu nufgyqmvbuVar) {
        File filePpxfxbqfkf = nufgyqmvbuVar.ppxfxbqfkf();
        return (filePpxfxbqfkf == null || !filePpxfxbqfkf.exists()) ? new nufgyqmvbu("minidump_file", "minidump", new byte[]{0}) : new wwaezpbzkn("minidump_file", "minidump", filePpxfxbqfkf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long yadqdtsiqt(long j13) {
        return j13 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yggfygwlhe(String str, Boolean bool) {
        long jZynmafqrjb = zynmafqrjb();
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Opening a new session with ID " + str);
        this.f1426btonecajqb.wkgbmnqykc(str, String.format(Locale.US, "Crashlytics Android SDK/%s", esjtqupxsv.draadjrbmk()), jZynmafqrjb, dc.lmojexxdyd.zoijcleaow(agtfadlqog(this.f1431gxszxtbevo, this.f1435nufgyqmvbu), rgvfuqvkyq(), ojitshcjhn(this.f1432iobyxmoadg)));
        if (bool.booleanValue() && str != null) {
            this.f1442wkgbmnqykc.oxmwwwfdhm(str);
        }
        this.f1428dxjokdxxww.eablkybsjg(str);
        this.f1427draadjrbmk.eablkybsjg(str);
        this.f1441wflxmlrfwp.kcexrzcfyt(str, jZynmafqrjb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zdlpuopuiu(boolean z13, ic.btonecajqb btonecajqbVar, boolean z14) {
        String str;
        bc.gxszxtbevo.ppxfxbqfkf();
        ArrayList arrayList = new ArrayList(this.f1441wflxmlrfwp.oxmwwwfdhm());
        if (arrayList.size() <= z13) {
            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z13 ? 1 : 0);
        if (z14 && btonecajqbVar.zoijcleaow().f42385zoijcleaow.f42388zoijcleaow) {
            jlmebxxoox(str2);
        } else {
            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("ANR feature disabled.");
        }
        if (z14 && this.f1426btonecajqb.ppxfxbqfkf(str2)) {
            cqumvgiudr(str2);
        }
        if (z13 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f1427draadjrbmk.eablkybsjg(null);
            str = null;
        }
        this.f1441wflxmlrfwp.draadjrbmk(zynmafqrjb(), str);
    }

    private static long zynmafqrjb() {
        return yadqdtsiqt(System.currentTimeMillis());
    }

    boolean esjtqupxsv(ic.btonecajqb btonecajqbVar) {
        bc.gxszxtbevo.ppxfxbqfkf();
        if (ylkuphrtab()) {
            xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Finalizing previously open sessions.");
        try {
            zdlpuopuiu(true, btonecajqbVar, true);
            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Closed all previously open sessions.");
            return true;
        } catch (Exception e13) {
            xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Unable to finalize previously open sessions.", e13);
            return false;
        }
    }

    String iozdgvuglv() {
        InputStream inputStreamCdpycssgdh = cdpycssgdh("META-INF/version-control-info.textproto");
        if (inputStreamCdpycssgdh == null) {
            return null;
        }
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Read version control info");
        return Base64.encodeToString(kegysxyocb(inputStreamCdpycssgdh), 0);
    }

    void iwizpuwonk(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ic.btonecajqb btonecajqbVar) {
        this.f1436ojitshcjhn = btonecajqbVar;
        stevsuqkhv(str);
        istkbnxepw istkbnxepwVar = new istkbnxepw(new iobyxmoadg(), btonecajqbVar, uncaughtExceptionHandler, this.f1426btonecajqb);
        this.f1425agtfadlqog = istkbnxepwVar;
        Thread.setDefaultUncaughtExceptionHandler(istkbnxepwVar);
    }

    List jpowsppfya() {
        return this.f1434lqeggnwhkg.nufgyqmvbu(f1424zdlpuopuiu);
    }

    void kcexrzcfyt(ic.btonecajqb btonecajqbVar) {
        zdlpuopuiu(false, btonecajqbVar, false);
    }

    void lmojexxdyd(ic.btonecajqb btonecajqbVar, Thread thread, Throwable th2) {
        wwaezpbzkn(btonecajqbVar, thread, th2, false);
    }

    void mbcevpiqjq(String str, String str2) {
        try {
            this.f1442wkgbmnqykc.rgvfuqvkyq(str, str2);
        } catch (IllegalArgumentException e13) {
            Context context = this.f1432iobyxmoadg;
            if (context != null && btonecajqb.yggfygwlhe(context)) {
                throw e13;
            }
            xb.lqeggnwhkg.gxszxtbevo().wkgbmnqykc("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void ntlheqmsrt(String str, String str2) {
        try {
            this.f1442wkgbmnqykc.vdvldrhtss(str, str2);
        } catch (IllegalArgumentException e13) {
            Context context = this.f1432iobyxmoadg;
            if (context != null && btonecajqb.yggfygwlhe(context)) {
                throw e13;
            }
            xb.lqeggnwhkg.gxszxtbevo().wkgbmnqykc("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    boolean oxmwwwfdhm() {
        bc.gxszxtbevo.ppxfxbqfkf();
        if (!this.f1438ppxfxbqfkf.ppxfxbqfkf()) {
            String strPmvmpeiblj = pmvmpeiblj();
            return strPmvmpeiblj != null && this.f1426btonecajqb.ppxfxbqfkf(strPmvmpeiblj);
        }
        xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Found previous crash marker.");
        this.f1438ppxfxbqfkf.wkgbmnqykc();
        return true;
    }

    void ribwqtqdhb(Thread thread, Throwable th2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (ylkuphrtab()) {
            return;
        }
        long jYadqdtsiqt = yadqdtsiqt(jCurrentTimeMillis);
        String strPmvmpeiblj = pmvmpeiblj();
        if (strPmvmpeiblj == null) {
            xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.f1441wflxmlrfwp.iwizpuwonk(th2, thread, strPmvmpeiblj, jYadqdtsiqt);
        }
    }

    void sopmlzcsov(Task task) {
        if (this.f1441wflxmlrfwp.ojitshcjhn()) {
            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Crash reports are available to be sent.");
            crxdokpmqz().onSuccessTask(this.f1429eablkybsjg.f15695iobyxmoadg, new wkgbmnqykc(task));
        } else {
            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("No crash reports are available to be sent.");
            this.f1439rgvfuqvkyq.trySetResult(Boolean.FALSE);
        }
    }

    void stevsuqkhv(final String str) {
        this.f1429eablkybsjg.f15695iobyxmoadg.gxszxtbevo(new Runnable() { // from class: ac.ojitshcjhn
            @Override // java.lang.Runnable
            public final void run() {
                this.f1394zdlpuopuiu.pkzmftpjix(str);
            }
        });
    }

    void tzroggbefp() {
        try {
            String strIozdgvuglv = iozdgvuglv();
            if (strIozdgvuglv != null) {
                ntlheqmsrt("com.crashlytics.version-control-info", strIozdgvuglv);
                xb.lqeggnwhkg.gxszxtbevo().lqeggnwhkg("Saved version control info");
            }
        } catch (IOException e13) {
            xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Unable to save version control info", e13);
        }
    }

    void ulzqkzuiru(String str) {
        this.f1442wkgbmnqykc.kcexrzcfyt(str);
    }

    synchronized void wwaezpbzkn(ic.btonecajqb btonecajqbVar, Thread thread, Throwable th2, boolean z13) {
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
        Task taskLqeggnwhkg = this.f1429eablkybsjg.f15695iobyxmoadg.lqeggnwhkg(new zoijcleaow(System.currentTimeMillis(), th2, thread, btonecajqbVar, z13));
        if (!z13) {
            try {
                try {
                    ikoacuggdj.zoijcleaow(taskLqeggnwhkg);
                } catch (TimeoutException unused) {
                    xb.lqeggnwhkg.gxszxtbevo().wkgbmnqykc("Cannot send reports. Timed out while fetching settings.");
                }
            } catch (Exception e13) {
                xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Error handling uncaught exception", e13);
            }
        }
    }

    boolean ylkuphrtab() {
        istkbnxepw istkbnxepwVar = this.f1425agtfadlqog;
        return istkbnxepwVar != null && istkbnxepwVar.iobyxmoadg();
    }
}
