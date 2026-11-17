package opjhrmiecq;

import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final androidx.compose.runtime.a f74063iobyxmoadg = androidx.compose.runtime.lmojexxdyd.btonecajqb(new tg.iobyxmoadg() { // from class: opjhrmiecq.istkbnxepw
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return yadqdtsiqt.nufgyqmvbu();
        }
    });

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static Boolean f74064zoijcleaow;

    public static final boolean btonecajqb(int i13) {
        return Build.VERSION.SDK_INT >= 28 && i13 >= 8 && i13 < 1000 && dxjokdxxww();
    }

    public static final boolean dxjokdxxww() {
        if (f74064zoijcleaow == null) {
            f74064zoijcleaow = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
        }
        Boolean bool = f74064zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(bool);
        return bool.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004f A[Catch: RejectedExecutionException -> 0x009c, TryCatch #0 {RejectedExecutionException -> 0x009c, blocks: (B:11:0x0049, B:17:0x0056, B:19:0x0066, B:24:0x0071, B:26:0x0083, B:29:0x0097, B:28:0x008b, B:21:0x006c, B:13:0x004f), top: B:37:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b A[Catch: RejectedExecutionException -> 0x009c, TryCatch #0 {RejectedExecutionException -> 0x009c, blocks: (B:11:0x0049, B:17:0x0056, B:19:0x0066, B:24:0x0071, B:26:0x0083, B:29:0x0097, B:28:0x008b, B:21:0x006c, B:13:0x004f), top: B:37:0x0049 }] */
    public static final void eablkybsjg(final String str, final j0.n nVar, final n0.wflxmlrfwp.zoijcleaow zoijcleaowVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        boolean z13;
        boolean zPpxfxbqfkf;
        Object objYadqdtsiqt;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1589371739, i13, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:68)");
        }
        Executor executor = (Executor) draadjrbmkVar.ojitshcjhn(f74063iobyxmoadg);
        if (executor == null || !btonecajqb(str.length())) {
            draadjrbmkVar.sopmlzcsov(1255196839);
            draadjrbmkVar.stevsuqkhv();
        } else {
            draadjrbmkVar.sopmlzcsov(1254328095);
            final w0.zdlpuopuiu zdlpuopuiuVar = (w0.zdlpuopuiu) draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.draadjrbmk());
            final w0.wkgbmnqykc wkgbmnqykcVar = (w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.gxszxtbevo());
            if (((i13 & 112) ^ 48) > 32) {
                try {
                    if (draadjrbmkVar.ulzqkzuiru(nVar)) {
                        z13 = true;
                    } else if ((i13 & 48) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zPpxfxbqfkf = z13 | draadjrbmkVar.ppxfxbqfkf(zdlpuopuiuVar.ordinal()) | ((((i13 & 14) ^ 6) <= 4 && draadjrbmkVar.ulzqkzuiru(str)) || (i13 & 6) == 4) | draadjrbmkVar.ulzqkzuiru(wkgbmnqykcVar) | draadjrbmkVar.lmojexxdyd(zoijcleaowVar);
                    objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                    if (zPpxfxbqfkf || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new Runnable() { // from class: opjhrmiecq.cdpycssgdh
                            @Override // java.lang.Runnable
                            public final void run() {
                                yadqdtsiqt.gxszxtbevo(nVar, zdlpuopuiuVar, str, wkgbmnqykcVar, zoijcleaowVar);
                            }
                        };
                        draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                    }
                    executor.execute((Runnable) objYadqdtsiqt);
                } catch (RejectedExecutionException unused) {
                }
                draadjrbmkVar.stevsuqkhv();
            } else {
                if ((i13 & 48) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zPpxfxbqfkf = z13 | draadjrbmkVar.ppxfxbqfkf(zdlpuopuiuVar.ordinal()) | ((((i13 & 14) ^ 6) <= 4 && draadjrbmkVar.ulzqkzuiru(str)) || (i13 & 6) == 4) | draadjrbmkVar.ulzqkzuiru(wkgbmnqykcVar) | draadjrbmkVar.lmojexxdyd(zoijcleaowVar);
                objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zPpxfxbqfkf) {
                    objYadqdtsiqt = new Runnable() { // from class: opjhrmiecq.cdpycssgdh
                        @Override // java.lang.Runnable
                        public final void run() {
                            yadqdtsiqt.gxszxtbevo(nVar, zdlpuopuiuVar, str, wkgbmnqykcVar, zoijcleaowVar);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new Runnable() { // from class: opjhrmiecq.cdpycssgdh
                        @Override // java.lang.Runnable
                        public final void run() {
                            yadqdtsiqt.gxszxtbevo(nVar, zdlpuopuiuVar, str, wkgbmnqykcVar, zoijcleaowVar);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                executor.execute((Runnable) objYadqdtsiqt);
                draadjrbmkVar.stevsuqkhv();
            }
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gxszxtbevo(j0.n nVar, w0.zdlpuopuiu zdlpuopuiuVar, String str, w0.wkgbmnqykc wkgbmnqykcVar, n0.wflxmlrfwp.zoijcleaow zoijcleaowVar) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            androidx.compose.runtime.snapshots.zoijcleaow zoijcleaowVarRgvfuqvkyq = androidx.compose.runtime.snapshots.lqeggnwhkg.iobyxmoadg.rgvfuqvkyq(androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg, null, null, 3, null);
            try {
                androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = zoijcleaowVarRgvfuqvkyq.draadjrbmk();
                try {
                    j0.lmojexxdyd.zoijcleaow(str, j0.o.wkgbmnqykc(nVar, zdlpuopuiuVar), hg.jyumaefscl.wflxmlrfwp(), wkgbmnqykcVar, zoijcleaowVar, null, 32, null).iobyxmoadg();
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    zoijcleaowVarRgvfuqvkyq.kcexrzcfyt(lqeggnwhkgVarDraadjrbmk);
                    zoijcleaowVarRgvfuqvkyq.istkbnxepw().iobyxmoadg();
                    zoijcleaowVarRgvfuqvkyq.wkgbmnqykc();
                    Trace.endSection();
                } catch (Throwable th2) {
                    zoijcleaowVarRgvfuqvkyq.kcexrzcfyt(lqeggnwhkgVarDraadjrbmk);
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    zoijcleaowVarRgvfuqvkyq.wkgbmnqykc();
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lqeggnwhkg(j0.n nVar, w0.zdlpuopuiu zdlpuopuiuVar, List list, j0.eablkybsjg eablkybsjgVar, w0.wkgbmnqykc wkgbmnqykcVar, n0.wflxmlrfwp.zoijcleaow zoijcleaowVar) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            androidx.compose.runtime.snapshots.zoijcleaow zoijcleaowVarRgvfuqvkyq = androidx.compose.runtime.snapshots.lqeggnwhkg.iobyxmoadg.rgvfuqvkyq(androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg, null, null, 3, null);
            try {
                androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = zoijcleaowVarRgvfuqvkyq.draadjrbmk();
                try {
                    j0.n nVarWkgbmnqykc = j0.o.wkgbmnqykc(nVar, zdlpuopuiuVar);
                    if (list == null) {
                        list = hg.jyumaefscl.wflxmlrfwp();
                    }
                    new j0.cqumvgiudr(eablkybsjgVar, nVarWkgbmnqykc, list, wkgbmnqykcVar, zoijcleaowVar).iobyxmoadg();
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    zoijcleaowVarRgvfuqvkyq.kcexrzcfyt(lqeggnwhkgVarDraadjrbmk);
                    zoijcleaowVarRgvfuqvkyq.istkbnxepw().iobyxmoadg();
                    zoijcleaowVarRgvfuqvkyq.wkgbmnqykc();
                    Trace.endSection();
                } catch (Throwable th2) {
                    zoijcleaowVarRgvfuqvkyq.kcexrzcfyt(lqeggnwhkgVarDraadjrbmk);
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    zoijcleaowVarRgvfuqvkyq.wkgbmnqykc();
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor nufgyqmvbu() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004f A[Catch: RejectedExecutionException -> 0x00a2, TryCatch #0 {RejectedExecutionException -> 0x00a2, blocks: (B:11:0x0049, B:17:0x0056, B:19:0x006b, B:24:0x0076, B:26:0x0088, B:29:0x009d, B:28:0x0090, B:21:0x0071, B:13:0x004f), top: B:37:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090 A[Catch: RejectedExecutionException -> 0x00a2, TryCatch #0 {RejectedExecutionException -> 0x00a2, blocks: (B:11:0x0049, B:17:0x0056, B:19:0x006b, B:24:0x0076, B:26:0x0088, B:29:0x009d, B:28:0x0090, B:21:0x0071, B:13:0x004f), top: B:37:0x0049 }] */
    public static final void wkgbmnqykc(final j0.eablkybsjg eablkybsjgVar, final j0.n nVar, final n0.wflxmlrfwp.zoijcleaow zoijcleaowVar, final List list, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        boolean z13;
        boolean zPpxfxbqfkf;
        Object objYadqdtsiqt;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-650368117, i13, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:102)");
        }
        Executor executor = (Executor) draadjrbmkVar.ojitshcjhn(f74063iobyxmoadg);
        if (executor == null || !btonecajqb(eablkybsjgVar.length())) {
            draadjrbmkVar.sopmlzcsov(-517807721);
            draadjrbmkVar.stevsuqkhv();
        } else {
            draadjrbmkVar.sopmlzcsov(-518708178);
            final w0.zdlpuopuiu zdlpuopuiuVar = (w0.zdlpuopuiu) draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.draadjrbmk());
            final w0.wkgbmnqykc wkgbmnqykcVar = (w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.gxszxtbevo());
            if (((i13 & 112) ^ 48) > 32) {
                try {
                    if (draadjrbmkVar.ulzqkzuiru(nVar)) {
                        z13 = true;
                    } else if ((i13 & 48) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zPpxfxbqfkf = z13 | draadjrbmkVar.ppxfxbqfkf(zdlpuopuiuVar.ordinal()) | draadjrbmkVar.lmojexxdyd(list) | ((((i13 & 14) ^ 6) <= 4 && draadjrbmkVar.ulzqkzuiru(eablkybsjgVar)) || (i13 & 6) == 4) | draadjrbmkVar.ulzqkzuiru(wkgbmnqykcVar) | draadjrbmkVar.lmojexxdyd(zoijcleaowVar);
                    objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                    if (zPpxfxbqfkf || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new Runnable() { // from class: opjhrmiecq.zynmafqrjb
                            @Override // java.lang.Runnable
                            public final void run() {
                                yadqdtsiqt.lqeggnwhkg(nVar, zdlpuopuiuVar, list, eablkybsjgVar, wkgbmnqykcVar, zoijcleaowVar);
                            }
                        };
                        draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                    }
                    executor.execute((Runnable) objYadqdtsiqt);
                } catch (RejectedExecutionException unused) {
                }
                draadjrbmkVar.stevsuqkhv();
            } else {
                if ((i13 & 48) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zPpxfxbqfkf = z13 | draadjrbmkVar.ppxfxbqfkf(zdlpuopuiuVar.ordinal()) | draadjrbmkVar.lmojexxdyd(list) | ((((i13 & 14) ^ 6) <= 4 && draadjrbmkVar.ulzqkzuiru(eablkybsjgVar)) || (i13 & 6) == 4) | draadjrbmkVar.ulzqkzuiru(wkgbmnqykcVar) | draadjrbmkVar.lmojexxdyd(zoijcleaowVar);
                objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zPpxfxbqfkf) {
                    objYadqdtsiqt = new Runnable() { // from class: opjhrmiecq.zynmafqrjb
                        @Override // java.lang.Runnable
                        public final void run() {
                            yadqdtsiqt.lqeggnwhkg(nVar, zdlpuopuiuVar, list, eablkybsjgVar, wkgbmnqykcVar, zoijcleaowVar);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new Runnable() { // from class: opjhrmiecq.zynmafqrjb
                        @Override // java.lang.Runnable
                        public final void run() {
                            yadqdtsiqt.lqeggnwhkg(nVar, zdlpuopuiuVar, list, eablkybsjgVar, wkgbmnqykcVar, zoijcleaowVar);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                executor.execute((Runnable) objYadqdtsiqt);
                draadjrbmkVar.stevsuqkhv();
            }
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
    }
}
