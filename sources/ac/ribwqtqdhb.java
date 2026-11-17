package ac;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final cc.ojitshcjhn f1416eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final pkzmftpjix f1417gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pmvmpeiblj f1418iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final bc.gxszxtbevo f1419lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final hc.zoijcleaow f1420ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cc.eablkybsjg f1421wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gc.eablkybsjg f1422zoijcleaow;

    ribwqtqdhb(pmvmpeiblj pmvmpeibljVar, gc.eablkybsjg eablkybsjgVar, hc.zoijcleaow zoijcleaowVar, cc.eablkybsjg eablkybsjgVar2, cc.ojitshcjhn ojitshcjhnVar, pkzmftpjix pkzmftpjixVar, bc.gxszxtbevo gxszxtbevoVar) {
        this.f1418iobyxmoadg = pmvmpeibljVar;
        this.f1422zoijcleaow = eablkybsjgVar;
        this.f1420ppxfxbqfkf = zoijcleaowVar;
        this.f1421wkgbmnqykc = eablkybsjgVar2;
        this.f1416eablkybsjg = ojitshcjhnVar;
        this.f1417gxszxtbevo = pkzmftpjixVar;
        this.f1419lqeggnwhkg = gxszxtbevoVar;
    }

    private static List agtfadlqog(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(dc.iozdgvuglv.ppxfxbqfkf.iobyxmoadg().zoijcleaow((String) entry.getKey()).ppxfxbqfkf((String) entry.getValue()).iobyxmoadg());
        }
        Collections.sort(arrayList, new Comparator() { // from class: ac.jlmebxxoox
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ribwqtqdhb.rgvfuqvkyq((dc.iozdgvuglv.ppxfxbqfkf) obj, (dc.iozdgvuglv.ppxfxbqfkf) obj2);
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    private zynmafqrjb btonecajqb(zynmafqrjb zynmafqrjbVar) {
        if (zynmafqrjbVar.zoijcleaow().nufgyqmvbu() != null && zynmafqrjbVar.zoijcleaow().lqeggnwhkg() != null) {
            return zynmafqrjbVar;
        }
        ylkuphrtab ylkuphrtabVarWkgbmnqykc = this.f1417gxszxtbevo.wkgbmnqykc(true);
        return zynmafqrjb.iobyxmoadg(zynmafqrjbVar.zoijcleaow().zdlpuopuiu(ylkuphrtabVarWkgbmnqykc.zoijcleaow()).kcexrzcfyt(ylkuphrtabVarWkgbmnqykc.iobyxmoadg()), zynmafqrjbVar.wkgbmnqykc(), zynmafqrjbVar.ppxfxbqfkf());
    }

    public static ribwqtqdhb dxjokdxxww(Context context, pkzmftpjix pkzmftpjixVar, gc.lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar, cc.eablkybsjg eablkybsjgVar, cc.ojitshcjhn ojitshcjhnVar, jc.wkgbmnqykc wkgbmnqykcVar, ic.btonecajqb btonecajqbVar, dsvhmnatus dsvhmnatusVar, agtfadlqog agtfadlqogVar, bc.gxszxtbevo gxszxtbevoVar) {
        return new ribwqtqdhb(new pmvmpeiblj(context, pkzmftpjixVar, zoijcleaowVar, wkgbmnqykcVar, btonecajqbVar), new gc.eablkybsjg(lqeggnwhkgVar, btonecajqbVar, agtfadlqogVar), hc.zoijcleaow.zoijcleaow(context, btonecajqbVar, dsvhmnatusVar), eablkybsjgVar, ojitshcjhnVar, pkzmftpjixVar, gxszxtbevoVar);
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc eablkybsjg(dc.iozdgvuglv.eablkybsjg.wkgbmnqykc wkgbmnqykcVar) {
        return gxszxtbevo(wkgbmnqykc(wkgbmnqykcVar, this.f1421wkgbmnqykc, this.f1416eablkybsjg), this.f1416eablkybsjg);
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc gxszxtbevo(dc.iozdgvuglv.eablkybsjg.wkgbmnqykc wkgbmnqykcVar, cc.ojitshcjhn ojitshcjhnVar) {
        List listDxjokdxxww = ojitshcjhnVar.dxjokdxxww();
        if (listDxjokdxxww.isEmpty()) {
            return wkgbmnqykcVar;
        }
        dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow zoijcleaowVarNufgyqmvbu = wkgbmnqykcVar.nufgyqmvbu();
        zoijcleaowVarNufgyqmvbu.eablkybsjg(dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo.iobyxmoadg().zoijcleaow(listDxjokdxxww).iobyxmoadg());
        return zoijcleaowVarNufgyqmvbu.iobyxmoadg();
    }

    private static dc.iozdgvuglv.iobyxmoadg lqeggnwhkg(ApplicationExitInfo applicationExitInfo) {
        String strNufgyqmvbu = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strNufgyqmvbu = nufgyqmvbu(traceInputStream);
            }
        } catch (IOException e13) {
            xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e13);
        }
        return dc.iozdgvuglv.iobyxmoadg.iobyxmoadg().ppxfxbqfkf(applicationExitInfo.getImportance()).eablkybsjg(applicationExitInfo.getProcessName()).lqeggnwhkg(applicationExitInfo.getReason()).dxjokdxxww(applicationExitInfo.getTimestamp()).wkgbmnqykc(applicationExitInfo.getPid()).gxszxtbevo(applicationExitInfo.getPss()).nufgyqmvbu(applicationExitInfo.getRss()).btonecajqb(strNufgyqmvbu).iobyxmoadg();
    }

    public static String nufgyqmvbu(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i13 = inputStream.read(bArr);
            if (i13 == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int rgvfuqvkyq(dc.iozdgvuglv.ppxfxbqfkf ppxfxbqfkfVar, dc.iozdgvuglv.ppxfxbqfkf ppxfxbqfkfVar2) {
        return ppxfxbqfkfVar.zoijcleaow().compareTo(ppxfxbqfkfVar2.zoijcleaow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vdvldrhtss(dc.iozdgvuglv.eablkybsjg.wkgbmnqykc wkgbmnqykcVar, String str, boolean z13) {
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("disk worker: log non-fatal event to persistence");
        this.f1422zoijcleaow.esjtqupxsv(wkgbmnqykcVar, str, z13);
    }

    private ApplicationExitInfo wflxmlrfwp(String str, List list) {
        long jVdvldrhtss = this.f1422zoijcleaow.vdvldrhtss(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoIobyxmoadg = q6.dxjokdxxww.iobyxmoadg(it.next());
            if (applicationExitInfoIobyxmoadg.getTimestamp() < jVdvldrhtss) {
                return null;
            }
            if (applicationExitInfoIobyxmoadg.getReason() == 6) {
                return applicationExitInfoIobyxmoadg;
            }
        }
        return null;
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc wkgbmnqykc(dc.iozdgvuglv.eablkybsjg.wkgbmnqykc wkgbmnqykcVar, cc.eablkybsjg eablkybsjgVar, cc.ojitshcjhn ojitshcjhnVar) {
        dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow zoijcleaowVarNufgyqmvbu = wkgbmnqykcVar.nufgyqmvbu();
        String strPpxfxbqfkf = eablkybsjgVar.ppxfxbqfkf();
        if (strPpxfxbqfkf != null) {
            zoijcleaowVarNufgyqmvbu.wkgbmnqykc(dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc.iobyxmoadg().zoijcleaow(strPpxfxbqfkf).iobyxmoadg());
        } else {
            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("No log data to include with this event.");
        }
        List listAgtfadlqog = agtfadlqog(ojitshcjhnVar.lqeggnwhkg());
        List listAgtfadlqog2 = agtfadlqog(ojitshcjhnVar.nufgyqmvbu());
        if (!listAgtfadlqog.isEmpty() || !listAgtfadlqog2.isEmpty()) {
            zoijcleaowVarNufgyqmvbu.zoijcleaow(wkgbmnqykcVar.zoijcleaow().dxjokdxxww().eablkybsjg(listAgtfadlqog).lqeggnwhkg(listAgtfadlqog2).iobyxmoadg());
        }
        return zoijcleaowVarNufgyqmvbu.iobyxmoadg();
    }

    private void yggfygwlhe(Throwable th2, Thread thread, final String str, String str2, long j13, boolean z13) {
        final boolean zEquals = str2.equals("crash");
        final dc.iozdgvuglv.eablkybsjg.wkgbmnqykc wkgbmnqykcVarEablkybsjg = eablkybsjg(this.f1418iobyxmoadg.wkgbmnqykc(th2, thread, str2, j13, 4, 8, z13));
        if (z13) {
            this.f1422zoijcleaow.esjtqupxsv(wkgbmnqykcVarEablkybsjg, str, zEquals);
        } else {
            this.f1419lqeggnwhkg.f15698zoijcleaow.gxszxtbevo(new Runnable() { // from class: ac.crxdokpmqz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1333zdlpuopuiu.vdvldrhtss(wkgbmnqykcVarEablkybsjg, str, zEquals);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zdlpuopuiu(Task task) {
        if (!task.isSuccessful()) {
            xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        zynmafqrjb zynmafqrjbVar = (zynmafqrjb) task.getResult();
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Crashlytics report successfully enqueued to DataTransport: " + zynmafqrjbVar.wkgbmnqykc());
        File filePpxfxbqfkf = zynmafqrjbVar.ppxfxbqfkf();
        if (filePpxfxbqfkf.delete()) {
            xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Deleted report file: " + filePpxfxbqfkf.getPath());
            return true;
        }
        xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Crashlytics could not delete report file: " + filePpxfxbqfkf.getPath());
        return true;
    }

    public void cqumvgiudr(String str, List list, cc.eablkybsjg eablkybsjgVar, cc.ojitshcjhn ojitshcjhnVar) {
        ApplicationExitInfo applicationExitInfoWflxmlrfwp = wflxmlrfwp(str, list);
        if (applicationExitInfoWflxmlrfwp == null) {
            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        dc.iozdgvuglv.eablkybsjg.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = this.f1418iobyxmoadg.ppxfxbqfkf(lqeggnwhkg(applicationExitInfoWflxmlrfwp));
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Persisting anr for session " + str);
        this.f1422zoijcleaow.esjtqupxsv(gxszxtbevo(wkgbmnqykc(wkgbmnqykcVarPpxfxbqfkf, eablkybsjgVar, ojitshcjhnVar), ojitshcjhnVar), str, true);
    }

    public void draadjrbmk(long j13, String str) {
        this.f1422zoijcleaow.gtknphoqwx(str, j13);
    }

    public void esjtqupxsv() {
        this.f1422zoijcleaow.dxjokdxxww();
    }

    public void gtknphoqwx(String str, List list, dc.iozdgvuglv.iobyxmoadg iobyxmoadgVar) {
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dc.iozdgvuglv.wkgbmnqykc.zoijcleaow zoijcleaowVarDraadjrbmk = ((hkdspvbjdz) it.next()).draadjrbmk();
            if (zoijcleaowVarDraadjrbmk != null) {
                arrayList.add(zoijcleaowVarDraadjrbmk);
            }
        }
        this.f1422zoijcleaow.draadjrbmk(str, dc.iozdgvuglv.wkgbmnqykc.iobyxmoadg().zoijcleaow(Collections.unmodifiableList(arrayList)).iobyxmoadg(), iobyxmoadgVar);
    }

    public void iwizpuwonk(Throwable th2, Thread thread, String str, long j13) {
        xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Persisting non-fatal event for session " + str);
        yggfygwlhe(th2, thread, str, "error", j13, false);
    }

    public void jyumaefscl(Throwable th2, Thread thread, String str, long j13) {
        xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Persisting fatal event for session " + str);
        yggfygwlhe(th2, thread, str, "crash", j13, true);
    }

    public void kcexrzcfyt(String str, long j13) {
        this.f1422zoijcleaow.lereixgezr(this.f1418iobyxmoadg.eablkybsjg(str, j13));
    }

    public Task lereixgezr(Executor executor) {
        return pmvmpeiblj(executor, null);
    }

    public boolean ojitshcjhn() {
        return this.f1422zoijcleaow.oxmwwwfdhm();
    }

    public SortedSet oxmwwwfdhm() {
        return this.f1422zoijcleaow.rgvfuqvkyq();
    }

    public Task pmvmpeiblj(Executor executor, String str) {
        List<zynmafqrjb> listIwizpuwonk = this.f1422zoijcleaow.iwizpuwonk();
        ArrayList arrayList = new ArrayList();
        for (zynmafqrjb zynmafqrjbVar : listIwizpuwonk) {
            if (str == null || str.equals(zynmafqrjbVar.wkgbmnqykc())) {
                arrayList.add(this.f1420ppxfxbqfkf.ppxfxbqfkf(btonecajqb(zynmafqrjbVar), str != null).continueWith(executor, new Continuation() { // from class: ac.sopmlzcsov
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Boolean.valueOf(this.f1423iobyxmoadg.zdlpuopuiu(task));
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
