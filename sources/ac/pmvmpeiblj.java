package ac;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class pmvmpeiblj {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final Map f1405lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    static final String f1406nufgyqmvbu;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ic.btonecajqb f1407eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final xb.btonecajqb f1408gxszxtbevo = xb.btonecajqb.f121951iobyxmoadg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f1409iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f1410ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final jc.wkgbmnqykc f1411wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pkzmftpjix f1412zoijcleaow;

    static {
        HashMap map = new HashMap();
        f1405lqeggnwhkg = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f1406nufgyqmvbu = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.2.1");
    }

    public pmvmpeiblj(Context context, pkzmftpjix pkzmftpjixVar, zoijcleaow zoijcleaowVar, jc.wkgbmnqykc wkgbmnqykcVar, ic.btonecajqb btonecajqbVar) {
        this.f1409iobyxmoadg = context;
        this.f1412zoijcleaow = pkzmftpjixVar;
        this.f1410ppxfxbqfkf = zoijcleaowVar;
        this.f1411wkgbmnqykc = wkgbmnqykcVar;
        this.f1407eablkybsjg = btonecajqbVar;
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf agtfadlqog(jc.eablkybsjg eablkybsjgVar, int i13, int i14, int i15) {
        String str = eablkybsjgVar.f51078zoijcleaow;
        String str2 = eablkybsjgVar.f51075iobyxmoadg;
        StackTraceElement[] stackTraceElementArr = eablkybsjgVar.f51076ppxfxbqfkf;
        int i16 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        jc.eablkybsjg eablkybsjgVar2 = eablkybsjgVar.f51077wkgbmnqykc;
        if (i15 >= i14) {
            jc.eablkybsjg eablkybsjgVar3 = eablkybsjgVar2;
            while (eablkybsjgVar3 != null) {
                eablkybsjgVar3 = eablkybsjgVar3.f51077wkgbmnqykc;
                i16++;
            }
        }
        dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.AbstractC0522iobyxmoadg abstractC0522iobyxmoadgWkgbmnqykc = dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.iobyxmoadg().gxszxtbevo(str).eablkybsjg(str2).ppxfxbqfkf(oxmwwwfdhm(stackTraceElementArr, i13)).wkgbmnqykc(i16);
        if (eablkybsjgVar2 != null && i16 == 0) {
            abstractC0522iobyxmoadgWkgbmnqykc.zoijcleaow(agtfadlqog(eablkybsjgVar2, i13, i14, i15 + 1));
        }
        return abstractC0522iobyxmoadgWkgbmnqykc.iobyxmoadg();
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg btonecajqb(int i13, dc.iozdgvuglv.iobyxmoadg iobyxmoadgVar) {
        return dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.iobyxmoadg().ppxfxbqfkf(Boolean.valueOf(iobyxmoadgVar.ppxfxbqfkf() != 100)).wkgbmnqykc(pmvmpeiblj(iobyxmoadgVar)).nufgyqmvbu(i13).gxszxtbevo(ojitshcjhn(iobyxmoadgVar)).iobyxmoadg();
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg cqumvgiudr(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return esjtqupxsv(thread, stackTraceElementArr, 0);
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf draadjrbmk(int i13) {
        gxszxtbevo gxszxtbevoVarIobyxmoadg = gxszxtbevo.iobyxmoadg(this.f1409iobyxmoadg);
        Float fZoijcleaow = gxszxtbevoVarIobyxmoadg.zoijcleaow();
        Double dValueOf = fZoijcleaow != null ? Double.valueOf(fZoijcleaow.doubleValue()) : null;
        int iPpxfxbqfkf = gxszxtbevoVarIobyxmoadg.ppxfxbqfkf();
        boolean zAgtfadlqog = btonecajqb.agtfadlqog(this.f1409iobyxmoadg);
        return dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg().zoijcleaow(dValueOf).ppxfxbqfkf(iPpxfxbqfkf).gxszxtbevo(zAgtfadlqog).eablkybsjg(i13).lqeggnwhkg(gxszxtbevo(btonecajqb.zoijcleaow(this.f1409iobyxmoadg) - btonecajqb.iobyxmoadg(this.f1409iobyxmoadg))).wkgbmnqykc(btonecajqb.ppxfxbqfkf(Environment.getDataDirectory().getPath())).iobyxmoadg();
    }

    private List dxjokdxxww() {
        return Collections.singletonList(nufgyqmvbu());
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg esjtqupxsv(Thread thread, StackTraceElement[] stackTraceElementArr, int i13) {
        return dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.iobyxmoadg().wkgbmnqykc(thread.getName()).ppxfxbqfkf(i13).zoijcleaow(oxmwwwfdhm(stackTraceElementArr, i13)).iobyxmoadg();
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg gtknphoqwx(int i13, jc.eablkybsjg eablkybsjgVar, Thread thread, int i14, int i15, boolean z13) {
        Boolean boolValueOf;
        dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = this.f1408gxszxtbevo.eablkybsjg(this.f1409iobyxmoadg);
        if (ppxfxbqfkfVarEablkybsjg.zoijcleaow() > 0) {
            boolValueOf = Boolean.valueOf(ppxfxbqfkfVarEablkybsjg.zoijcleaow() != 100);
        } else {
            boolValueOf = null;
        }
        return dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.iobyxmoadg().ppxfxbqfkf(boolValueOf).wkgbmnqykc(ppxfxbqfkfVarEablkybsjg).zoijcleaow(this.f1408gxszxtbevo.wkgbmnqykc(this.f1409iobyxmoadg)).nufgyqmvbu(i13).gxszxtbevo(rgvfuqvkyq(eablkybsjgVar, thread, i14, i15, z13)).iobyxmoadg();
    }

    private static long gxszxtbevo(long j13) {
        if (j13 > 0) {
            return j13;
        }
        return 0L;
    }

    private dc.iozdgvuglv.iobyxmoadg iobyxmoadg(dc.iozdgvuglv.iobyxmoadg iobyxmoadgVar) {
        List listUnmodifiableList;
        if (!this.f1407eablkybsjg.zoijcleaow().f42385zoijcleaow.f42387ppxfxbqfkf || this.f1410ppxfxbqfkf.f1490ppxfxbqfkf.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (lqeggnwhkg lqeggnwhkgVar : this.f1410ppxfxbqfkf.f1490ppxfxbqfkf) {
                arrayList.add(dc.iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg.iobyxmoadg().wkgbmnqykc(lqeggnwhkgVar.ppxfxbqfkf()).zoijcleaow(lqeggnwhkgVar.iobyxmoadg()).ppxfxbqfkf(lqeggnwhkgVar.zoijcleaow()).iobyxmoadg());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return dc.iozdgvuglv.iobyxmoadg.iobyxmoadg().ppxfxbqfkf(iobyxmoadgVar.ppxfxbqfkf()).eablkybsjg(iobyxmoadgVar.eablkybsjg()).lqeggnwhkg(iobyxmoadgVar.lqeggnwhkg()).dxjokdxxww(iobyxmoadgVar.dxjokdxxww()).wkgbmnqykc(iobyxmoadgVar.wkgbmnqykc()).gxszxtbevo(iobyxmoadgVar.gxszxtbevo()).nufgyqmvbu(iobyxmoadgVar.nufgyqmvbu()).btonecajqb(iobyxmoadgVar.btonecajqb()).zoijcleaow(listUnmodifiableList).iobyxmoadg();
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc iwizpuwonk() {
        return dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc.iobyxmoadg().wkgbmnqykc(CommonUrlParts.Values.FALSE_INTEGER).ppxfxbqfkf(CommonUrlParts.Values.FALSE_INTEGER).zoijcleaow(0L).iobyxmoadg();
    }

    private dc.iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg jyumaefscl() {
        return dc.iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg.iobyxmoadg().wkgbmnqykc(3).eablkybsjg(Build.VERSION.RELEASE).zoijcleaow(Build.VERSION.CODENAME).ppxfxbqfkf(btonecajqb.cqumvgiudr()).iobyxmoadg();
    }

    private dc.iozdgvuglv.eablkybsjg.iobyxmoadg kcexrzcfyt() {
        return dc.iozdgvuglv.eablkybsjg.iobyxmoadg.iobyxmoadg().eablkybsjg(this.f1412zoijcleaow.gxszxtbevo()).lqeggnwhkg(this.f1410ppxfxbqfkf.f1486gxszxtbevo).wkgbmnqykc(this.f1410ppxfxbqfkf.f1488lqeggnwhkg).gxszxtbevo(this.f1412zoijcleaow.iobyxmoadg().ppxfxbqfkf()).zoijcleaow(this.f1410ppxfxbqfkf.f1489nufgyqmvbu.wkgbmnqykc()).ppxfxbqfkf(this.f1410ppxfxbqfkf.f1489nufgyqmvbu.eablkybsjg()).iobyxmoadg();
    }

    private List lereixgezr(jc.eablkybsjg eablkybsjgVar, Thread thread, int i13, boolean z13) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(esjtqupxsv(thread, eablkybsjgVar.f51076ppxfxbqfkf, i13));
        if (z13) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(cqumvgiudr(key, this.f1411wkgbmnqykc.iobyxmoadg(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static int lqeggnwhkg() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f1405lqeggnwhkg.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg nufgyqmvbu() {
        return dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg.iobyxmoadg().zoijcleaow(0L).wkgbmnqykc(0L).ppxfxbqfkf(this.f1410ppxfxbqfkf.f1485eablkybsjg).eablkybsjg(this.f1410ppxfxbqfkf.f1492zoijcleaow).iobyxmoadg();
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow ojitshcjhn(dc.iozdgvuglv.iobyxmoadg iobyxmoadgVar) {
        return dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.iobyxmoadg().zoijcleaow(iobyxmoadgVar).eablkybsjg(iwizpuwonk()).ppxfxbqfkf(dxjokdxxww()).iobyxmoadg();
    }

    private List oxmwwwfdhm(StackTraceElement[] stackTraceElementArr, int i13) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(vdvldrhtss(stackTraceElement, dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.iobyxmoadg().ppxfxbqfkf(i13)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf pmvmpeiblj(dc.iozdgvuglv.iobyxmoadg iobyxmoadgVar) {
        return this.f1408gxszxtbevo.iobyxmoadg(iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.ppxfxbqfkf());
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow rgvfuqvkyq(jc.eablkybsjg eablkybsjgVar, Thread thread, int i13, int i14, boolean z13) {
        return dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.iobyxmoadg().gxszxtbevo(lereixgezr(eablkybsjgVar, thread, i13, z13)).wkgbmnqykc(wflxmlrfwp(eablkybsjgVar, i13, i14)).eablkybsjg(iwizpuwonk()).ppxfxbqfkf(dxjokdxxww()).iobyxmoadg();
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow vdvldrhtss(StackTraceElement stackTraceElement, dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.AbstractC0519iobyxmoadg abstractC0519iobyxmoadg) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC0519iobyxmoadg.eablkybsjg(jMax).gxszxtbevo(str).zoijcleaow(fileName).wkgbmnqykc(lineNumber).iobyxmoadg();
    }

    private dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf wflxmlrfwp(jc.eablkybsjg eablkybsjgVar, int i13, int i14) {
        return agtfadlqog(eablkybsjgVar, i13, i14, 0);
    }

    private dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf yggfygwlhe() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iLqeggnwhkg = lqeggnwhkg();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jZoijcleaow = btonecajqb.zoijcleaow(this.f1409iobyxmoadg);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zIwizpuwonk = btonecajqb.iwizpuwonk();
        int iDraadjrbmk = btonecajqb.draadjrbmk();
        String str = Build.MANUFACTURER;
        return dc.iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg().zoijcleaow(iLqeggnwhkg).gxszxtbevo(Build.MODEL).ppxfxbqfkf(iAvailableProcessors).nufgyqmvbu(jZoijcleaow).wkgbmnqykc(blockCount).dxjokdxxww(zIwizpuwonk).btonecajqb(iDraadjrbmk).eablkybsjg(str).lqeggnwhkg(Build.PRODUCT).iobyxmoadg();
    }

    private dc.iozdgvuglv.eablkybsjg zdlpuopuiu(String str, long j13) {
        return dc.iozdgvuglv.eablkybsjg.iobyxmoadg().wflxmlrfwp(j13).btonecajqb(str).nufgyqmvbu(f1406nufgyqmvbu).zoijcleaow(kcexrzcfyt()).draadjrbmk(jyumaefscl()).eablkybsjg(yggfygwlhe()).dxjokdxxww(3).iobyxmoadg();
    }

    private dc.iozdgvuglv.zoijcleaow zoijcleaow() {
        return dc.iozdgvuglv.zoijcleaow().draadjrbmk("19.2.1").nufgyqmvbu(this.f1410ppxfxbqfkf.f1487iobyxmoadg).dxjokdxxww(this.f1412zoijcleaow.iobyxmoadg().ppxfxbqfkf()).lqeggnwhkg(this.f1412zoijcleaow.iobyxmoadg().eablkybsjg()).gxszxtbevo(this.f1412zoijcleaow.iobyxmoadg().wkgbmnqykc()).wkgbmnqykc(this.f1410ppxfxbqfkf.f1486gxszxtbevo).eablkybsjg(this.f1410ppxfxbqfkf.f1488lqeggnwhkg).gtknphoqwx(4);
    }

    public dc.iozdgvuglv eablkybsjg(String str, long j13) {
        return zoijcleaow().wflxmlrfwp(zdlpuopuiu(str, j13)).iobyxmoadg();
    }

    public dc.iozdgvuglv.eablkybsjg.wkgbmnqykc ppxfxbqfkf(dc.iozdgvuglv.iobyxmoadg iobyxmoadgVar) {
        int i13 = this.f1409iobyxmoadg.getResources().getConfiguration().orientation;
        return dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg().lqeggnwhkg("anr").gxszxtbevo(iobyxmoadgVar.dxjokdxxww()).zoijcleaow(btonecajqb(i13, iobyxmoadg(iobyxmoadgVar))).ppxfxbqfkf(draadjrbmk(i13)).iobyxmoadg();
    }

    public dc.iozdgvuglv.eablkybsjg.wkgbmnqykc wkgbmnqykc(Throwable th2, Thread thread, String str, long j13, int i13, int i14, boolean z13) {
        int i15 = this.f1409iobyxmoadg.getResources().getConfiguration().orientation;
        return dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg().lqeggnwhkg(str).gxszxtbevo(j13).zoijcleaow(gtknphoqwx(i15, jc.eablkybsjg.iobyxmoadg(th2, this.f1411wkgbmnqykc), thread, i13, i14, z13)).ppxfxbqfkf(draadjrbmk(i15)).iobyxmoadg();
    }
}
