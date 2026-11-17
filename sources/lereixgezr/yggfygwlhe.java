package lereixgezr;

import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator;
import androidx.camera.core.impl.MetadataHolderService;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class yggfygwlhe {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static final Object f62457ojitshcjhn = new Object();

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final SparseArray f62458rgvfuqvkyq = new SparseArray();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final Integer f62459agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final czzsidtyhn f62460btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private iobyxmoadg f62461draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private androidx.camera.core.impl.cdpycssgdh f62462dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Handler f62463eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final com.google.common.util.concurrent.wkgbmnqykc f62464gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final HandlerThread f62465gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final istkbnxepw.esjtqupxsv f62466iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private istkbnxepw.yggfygwlhe f62467lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private istkbnxepw.zdlpuopuiu f62468nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jyumaefscl f62469ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private com.google.common.util.concurrent.wkgbmnqykc f62470wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Executor f62471wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f62472zoijcleaow;

    private enum iobyxmoadg {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public yggfygwlhe(Context context, jyumaefscl.zoijcleaow zoijcleaowVar) {
        this(context, zoijcleaowVar, new istkbnxepw.okpsazkaxt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x0112 A[Catch: all -> 0x006d, TryCatch #4 {all -> 0x006d, blocks: (B:3:0x0014, B:5:0x001c, B:7:0x0040, B:9:0x005a, B:11:0x0064, B:20:0x0076, B:22:0x0085, B:23:0x0088, B:25:0x0093, B:26:0x009f, B:27:0x00a0, B:28:0x00ac, B:29:0x00ad, B:30:0x00b9, B:31:0x00ba, B:35:0x00d3, B:36:0x0112, B:37:0x0114, B:40:0x011a, B:42:0x0120, B:43:0x0128, B:45:0x012c, B:46:0x0159, B:48:0x015d, B:49:0x0162, B:54:0x016f, B:38:0x0115, B:39:0x0119), top: B:59:0x0014, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0120 A[Catch: all -> 0x006d, TryCatch #4 {all -> 0x006d, blocks: (B:3:0x0014, B:5:0x001c, B:7:0x0040, B:9:0x005a, B:11:0x0064, B:20:0x0076, B:22:0x0085, B:23:0x0088, B:25:0x0093, B:26:0x009f, B:27:0x00a0, B:28:0x00ac, B:29:0x00ad, B:30:0x00b9, B:31:0x00ba, B:35:0x00d3, B:36:0x0112, B:37:0x0114, B:40:0x011a, B:42:0x0120, B:43:0x0128, B:45:0x012c, B:46:0x0159, B:48:0x015d, B:49:0x0162, B:54:0x016f, B:38:0x0115, B:39:0x0119), top: B:59:0x0014, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0128 A[Catch: all -> 0x006d, TryCatch #4 {all -> 0x006d, blocks: (B:3:0x0014, B:5:0x001c, B:7:0x0040, B:9:0x005a, B:11:0x0064, B:20:0x0076, B:22:0x0085, B:23:0x0088, B:25:0x0093, B:26:0x009f, B:27:0x00a0, B:28:0x00ac, B:29:0x00ad, B:30:0x00b9, B:31:0x00ba, B:35:0x00d3, B:36:0x0112, B:37:0x0114, B:40:0x011a, B:42:0x0120, B:43:0x0128, B:45:0x012c, B:46:0x0159, B:48:0x015d, B:49:0x0162, B:54:0x016f, B:38:0x0115, B:39:0x0119), top: B:59:0x0014, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x012c A[Catch: all -> 0x006d, TryCatch #4 {all -> 0x006d, blocks: (B:3:0x0014, B:5:0x001c, B:7:0x0040, B:9:0x005a, B:11:0x0064, B:20:0x0076, B:22:0x0085, B:23:0x0088, B:25:0x0093, B:26:0x009f, B:27:0x00a0, B:28:0x00ac, B:29:0x00ad, B:30:0x00b9, B:31:0x00ba, B:35:0x00d3, B:36:0x0112, B:37:0x0114, B:40:0x011a, B:42:0x0120, B:43:0x0128, B:45:0x012c, B:46:0x0159, B:48:0x015d, B:49:0x0162, B:54:0x016f, B:38:0x0115, B:39:0x0119), top: B:59:0x0014, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0159 A[Catch: all -> 0x006d, TryCatch #4 {all -> 0x006d, blocks: (B:3:0x0014, B:5:0x001c, B:7:0x0040, B:9:0x005a, B:11:0x0064, B:20:0x0076, B:22:0x0085, B:23:0x0088, B:25:0x0093, B:26:0x009f, B:27:0x00a0, B:28:0x00ac, B:29:0x00ad, B:30:0x00b9, B:31:0x00ba, B:35:0x00d3, B:36:0x0112, B:37:0x0114, B:40:0x011a, B:42:0x0120, B:43:0x0128, B:45:0x012c, B:46:0x0159, B:48:0x015d, B:49:0x0162, B:54:0x016f, B:38:0x0115, B:39:0x0119), top: B:59:0x0014, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x015d A[Catch: all -> 0x006d, TryCatch #4 {all -> 0x006d, blocks: (B:3:0x0014, B:5:0x001c, B:7:0x0040, B:9:0x005a, B:11:0x0064, B:20:0x0076, B:22:0x0085, B:23:0x0088, B:25:0x0093, B:26:0x009f, B:27:0x00a0, B:28:0x00ac, B:29:0x00ad, B:30:0x00b9, B:31:0x00ba, B:35:0x00d3, B:36:0x0112, B:37:0x0114, B:40:0x011a, B:42:0x0120, B:43:0x0128, B:45:0x012c, B:46:0x0159, B:48:0x015d, B:49:0x0162, B:54:0x016f, B:38:0x0115, B:39:0x0119), top: B:59:0x0014, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0162 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #4 {all -> 0x006d, blocks: (B:3:0x0014, B:5:0x001c, B:7:0x0040, B:9:0x005a, B:11:0x0064, B:20:0x0076, B:22:0x0085, B:23:0x0088, B:25:0x0093, B:26:0x009f, B:27:0x00a0, B:28:0x00ac, B:29:0x00ad, B:30:0x00b9, B:31:0x00ba, B:35:0x00d3, B:36:0x0112, B:37:0x0114, B:40:0x011a, B:42:0x0120, B:43:0x0128, B:45:0x012c, B:46:0x0159, B:48:0x015d, B:49:0x0162, B:54:0x016f, B:38:0x0115, B:39:0x0119), top: B:59:0x0014, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x012c, please report this as an issue */
    public /* synthetic */ void agtfadlqog(Context context, final Executor executor, final int i13, final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, final long j13) {
        czzsidtyhn.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo;
        y5.iobyxmoadg.ppxfxbqfkf("CX:initAndRetryRecursively");
        final Context contextIobyxmoadg = cdpycssgdh.eablkybsjg.iobyxmoadg(context);
        try {
            try {
                istkbnxepw.yggfygwlhe.iobyxmoadg iobyxmoadgVarRibwqtqdhb = this.f62469ppxfxbqfkf.ribwqtqdhb(null);
                if (iobyxmoadgVarRibwqtqdhb == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                }
                istkbnxepw.istkbnxepw istkbnxepwVarIobyxmoadg = istkbnxepw.istkbnxepw.iobyxmoadg(this.f62471wkgbmnqykc, this.f62463eablkybsjg);
                rgvfuqvkyq rgvfuqvkyqVarCrxdokpmqz = this.f62469ppxfxbqfkf.crxdokpmqz(null);
                this.f62467lqeggnwhkg = iobyxmoadgVarRibwqtqdhb.iobyxmoadg(contextIobyxmoadg, istkbnxepwVarIobyxmoadg, rgvfuqvkyqVarCrxdokpmqz, this.f62469ppxfxbqfkf.vipkmwdibw());
                istkbnxepw.zdlpuopuiu.iobyxmoadg iobyxmoadgVarIkoacuggdj = this.f62469ppxfxbqfkf.ikoacuggdj(null);
                if (iobyxmoadgVarIkoacuggdj == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                }
                this.f62468nufgyqmvbu = iobyxmoadgVarIkoacuggdj.iobyxmoadg(contextIobyxmoadg, this.f62467lqeggnwhkg.ppxfxbqfkf(), this.f62467lqeggnwhkg.zoijcleaow());
                androidx.camera.core.impl.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVarXrmfcynszj = this.f62469ppxfxbqfkf.xrmfcynszj(null);
                if (ppxfxbqfkfVarXrmfcynszj == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                this.f62462dxjokdxxww = ppxfxbqfkfVarXrmfcynszj.iobyxmoadg(contextIobyxmoadg);
                if (executor instanceof draadjrbmk) {
                    ((draadjrbmk) executor).ppxfxbqfkf(this.f62467lqeggnwhkg);
                }
                this.f62466iobyxmoadg.zoijcleaow(this.f62467lqeggnwhkg);
                CameraValidator.iobyxmoadg(contextIobyxmoadg, this.f62466iobyxmoadg, rgvfuqvkyqVarCrxdokpmqz);
                if (i13 > 1) {
                    vdvldrhtss(null);
                }
                rgvfuqvkyq();
                iobyxmoadgVar.ppxfxbqfkf(null);
                y5.iobyxmoadg.gxszxtbevo();
            } catch (Throwable th2) {
                y5.iobyxmoadg.gxszxtbevo();
                throw th2;
            }
        } catch (InitializationException e13) {
            e = e13;
            androidx.camera.core.impl.lqeggnwhkg lqeggnwhkgVar = new androidx.camera.core.impl.lqeggnwhkg(j13, i13, e);
            ppxfxbqfkfVarGxszxtbevo = this.f62460btonecajqb.gxszxtbevo(lqeggnwhkgVar);
            vdvldrhtss(lqeggnwhkgVar);
            if (ppxfxbqfkfVarGxszxtbevo.wkgbmnqykc() || i13 >= Integer.MAX_VALUE) {
                synchronized (this.f62472zoijcleaow) {
                    this.f62461draadjrbmk = iobyxmoadg.INITIALIZING_ERROR;
                }
                if (ppxfxbqfkfVarGxszxtbevo.ppxfxbqfkf()) {
                    rgvfuqvkyq();
                    iobyxmoadgVar.ppxfxbqfkf(null);
                } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                    String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).iobyxmoadg();
                    sopmlzcsov.wkgbmnqykc("CameraX", str, e);
                    iobyxmoadgVar.gxszxtbevo(new InitializationException(new CameraUnavailableException(3, str)));
                } else if (e instanceof InitializationException) {
                    iobyxmoadgVar.gxszxtbevo(e);
                } else {
                    iobyxmoadgVar.gxszxtbevo(new InitializationException(e));
                }
            } else {
                sopmlzcsov.wflxmlrfwp("CameraX", "Retry init. Start time " + j13 + " current time " + SystemClock.elapsedRealtime(), e);
                q1.lqeggnwhkg.zoijcleaow(this.f62463eablkybsjg, new Runnable() { // from class: lereixgezr.zdlpuopuiu
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62484zdlpuopuiu.wflxmlrfwp(executor, j13, i13, contextIobyxmoadg, iobyxmoadgVar);
                    }
                }, "retry_token", ppxfxbqfkfVarGxszxtbevo.zoijcleaow());
            }
        } catch (CameraValidator.CameraIdListIncorrectException e14) {
            e = e14;
            androidx.camera.core.impl.lqeggnwhkg lqeggnwhkgVar2 = new androidx.camera.core.impl.lqeggnwhkg(j13, i13, e);
            ppxfxbqfkfVarGxszxtbevo = this.f62460btonecajqb.gxszxtbevo(lqeggnwhkgVar2);
            vdvldrhtss(lqeggnwhkgVar2);
            if (ppxfxbqfkfVarGxszxtbevo.wkgbmnqykc()) {
                synchronized (this.f62472zoijcleaow) {
                    this.f62461draadjrbmk = iobyxmoadg.INITIALIZING_ERROR;
                    if (ppxfxbqfkfVarGxszxtbevo.ppxfxbqfkf()) {
                        rgvfuqvkyq();
                        iobyxmoadgVar.ppxfxbqfkf(null);
                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                        String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).iobyxmoadg();
                        sopmlzcsov.wkgbmnqykc("CameraX", str2, e);
                        iobyxmoadgVar.gxszxtbevo(new InitializationException(new CameraUnavailableException(3, str2)));
                    } else if (e instanceof InitializationException) {
                        iobyxmoadgVar.gxszxtbevo(e);
                    } else {
                        iobyxmoadgVar.gxszxtbevo(new InitializationException(e));
                    }
                }
            } else {
                synchronized (this.f62472zoijcleaow) {
                    this.f62461draadjrbmk = iobyxmoadg.INITIALIZING_ERROR;
                    if (ppxfxbqfkfVarGxszxtbevo.ppxfxbqfkf()) {
                        rgvfuqvkyq();
                        iobyxmoadgVar.ppxfxbqfkf(null);
                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                        String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).iobyxmoadg();
                        sopmlzcsov.wkgbmnqykc("CameraX", str3, e);
                        iobyxmoadgVar.gxszxtbevo(new InitializationException(new CameraUnavailableException(3, str3)));
                    } else if (e instanceof InitializationException) {
                        iobyxmoadgVar.gxszxtbevo(e);
                    } else {
                        iobyxmoadgVar.gxszxtbevo(new InitializationException(e));
                    }
                }
            }
        } catch (RuntimeException e15) {
            e = e15;
            androidx.camera.core.impl.lqeggnwhkg lqeggnwhkgVar3 = new androidx.camera.core.impl.lqeggnwhkg(j13, i13, e);
            ppxfxbqfkfVarGxszxtbevo = this.f62460btonecajqb.gxszxtbevo(lqeggnwhkgVar3);
            vdvldrhtss(lqeggnwhkgVar3);
            if (ppxfxbqfkfVarGxszxtbevo.wkgbmnqykc()) {
                synchronized (this.f62472zoijcleaow) {
                    this.f62461draadjrbmk = iobyxmoadg.INITIALIZING_ERROR;
                    if (ppxfxbqfkfVarGxszxtbevo.ppxfxbqfkf()) {
                        rgvfuqvkyq();
                        iobyxmoadgVar.ppxfxbqfkf(null);
                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                        String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).iobyxmoadg();
                        sopmlzcsov.wkgbmnqykc("CameraX", str4, e);
                        iobyxmoadgVar.gxszxtbevo(new InitializationException(new CameraUnavailableException(3, str4)));
                    } else if (e instanceof InitializationException) {
                        iobyxmoadgVar.gxszxtbevo(e);
                    } else {
                        iobyxmoadgVar.gxszxtbevo(new InitializationException(e));
                    }
                }
            } else {
                synchronized (this.f62472zoijcleaow) {
                    this.f62461draadjrbmk = iobyxmoadg.INITIALIZING_ERROR;
                    if (ppxfxbqfkfVarGxszxtbevo.ppxfxbqfkf()) {
                        rgvfuqvkyq();
                        iobyxmoadgVar.ppxfxbqfkf(null);
                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                        String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).iobyxmoadg();
                        sopmlzcsov.wkgbmnqykc("CameraX", str5, e);
                        iobyxmoadgVar.gxszxtbevo(new InitializationException(new CameraUnavailableException(3, str5)));
                    } else if (e instanceof InitializationException) {
                        iobyxmoadgVar.gxszxtbevo(e);
                    } else {
                        iobyxmoadgVar.gxszxtbevo(new InitializationException(e));
                    }
                }
            }
        }
    }

    private static void btonecajqb(Integer num) {
        synchronized (f62457ojitshcjhn) {
            try {
                if (num == null) {
                    return;
                }
                u1.nufgyqmvbu.ppxfxbqfkf(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = f62458rgvfuqvkyq;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + ((Integer) sparseArray.get(num.intValue())).intValue() : 1));
                oxmwwwfdhm();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private com.google.common.util.concurrent.wkgbmnqykc draadjrbmk(final Context context) {
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarIobyxmoadg;
        synchronized (this.f62472zoijcleaow) {
            u1.nufgyqmvbu.dxjokdxxww(this.f62461draadjrbmk == iobyxmoadg.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f62461draadjrbmk = iobyxmoadg.INITIALIZING;
            wkgbmnqykcVarIobyxmoadg = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: lereixgezr.oxmwwwfdhm
                @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
                public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                    return this.f62352iobyxmoadg.ojitshcjhn(context, iobyxmoadgVar);
                }
            });
        }
        return wkgbmnqykcVarIobyxmoadg;
    }

    private void gtknphoqwx(final Executor executor, final long j13, final int i13, final Context context, final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        executor.execute(new Runnable() { // from class: lereixgezr.kcexrzcfyt
            @Override // java.lang.Runnable
            public final void run() {
                this.f62317zdlpuopuiu.agtfadlqog(context, executor, i13, iobyxmoadgVar, j13);
            }
        });
    }

    private static void kcexrzcfyt(Context context, istkbnxepw.jhduphickx jhduphickxVar, ojitshcjhn.iobyxmoadg iobyxmoadgVar) {
        if (jhduphickxVar != null) {
            sopmlzcsov.iobyxmoadg("CameraX", "QuirkSettings from CameraXConfig: " + jhduphickxVar);
        } else {
            jhduphickxVar = (istkbnxepw.jhduphickx) iobyxmoadgVar.apply(context);
            sopmlzcsov.iobyxmoadg("CameraX", "QuirkSettings from app metadata: " + jhduphickxVar);
        }
        if (jhduphickxVar == null) {
            jhduphickxVar = istkbnxepw.ikoacuggdj.f49332zoijcleaow;
            sopmlzcsov.iobyxmoadg("CameraX", "QuirkSettings by default: " + jhduphickxVar);
        }
        istkbnxepw.ikoacuggdj.zoijcleaow().wkgbmnqykc(jhduphickxVar);
    }

    private static jyumaefscl.zoijcleaow lqeggnwhkg(Context context) {
        ComponentCallbacks2 componentCallbacks2Zoijcleaow = cdpycssgdh.eablkybsjg.zoijcleaow(context);
        if (componentCallbacks2Zoijcleaow instanceof jyumaefscl.zoijcleaow) {
            return (jyumaefscl.zoijcleaow) componentCallbacks2Zoijcleaow;
        }
        try {
            Context contextIobyxmoadg = cdpycssgdh.eablkybsjg.iobyxmoadg(context);
            Bundle bundle = contextIobyxmoadg.getPackageManager().getServiceInfo(new ComponentName(contextIobyxmoadg, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (jyumaefscl.zoijcleaow) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            sopmlzcsov.ppxfxbqfkf("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e13) {
            e = e13;
            sopmlzcsov.wkgbmnqykc("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e14) {
            e = e14;
            sopmlzcsov.wkgbmnqykc("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e15) {
            e = e15;
            sopmlzcsov.wkgbmnqykc("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e16) {
            e = e16;
            sopmlzcsov.wkgbmnqykc("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e17) {
            e = e17;
            sopmlzcsov.wkgbmnqykc("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e18) {
            e = e18;
            sopmlzcsov.wkgbmnqykc("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e19) {
            e = e19;
            sopmlzcsov.wkgbmnqykc("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object ojitshcjhn(Context context, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        gtknphoqwx(this.f62471wkgbmnqykc, SystemClock.elapsedRealtime(), 1, context, iobyxmoadgVar);
        return "CameraX initInternal";
    }

    private static void oxmwwwfdhm() {
        SparseArray sparseArray = f62458rgvfuqvkyq;
        if (sparseArray.size() == 0) {
            sopmlzcsov.dxjokdxxww();
            return;
        }
        if (sparseArray.get(3) != null) {
            sopmlzcsov.btonecajqb(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            sopmlzcsov.btonecajqb(4);
        } else if (sparseArray.get(5) != null) {
            sopmlzcsov.btonecajqb(5);
        } else if (sparseArray.get(6) != null) {
            sopmlzcsov.btonecajqb(6);
        }
    }

    private void rgvfuqvkyq() {
        synchronized (this.f62472zoijcleaow) {
            this.f62461draadjrbmk = iobyxmoadg.INITIALIZED;
        }
    }

    private void vdvldrhtss(czzsidtyhn.zoijcleaow zoijcleaowVar) {
        if (y5.iobyxmoadg.nufgyqmvbu()) {
            y5.iobyxmoadg.btonecajqb("CX:CameraProvider-RetryStatus", zoijcleaowVar != null ? zoijcleaowVar.getStatus() : -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wflxmlrfwp(Executor executor, long j13, int i13, Context context, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        gtknphoqwx(executor, j13, i13 + 1, context, iobyxmoadgVar);
    }

    public com.google.common.util.concurrent.wkgbmnqykc dxjokdxxww() {
        return this.f62464gtknphoqwx;
    }

    public istkbnxepw.yggfygwlhe eablkybsjg() {
        istkbnxepw.yggfygwlhe yggfygwlheVar = this.f62467lqeggnwhkg;
        if (yggfygwlheVar != null) {
            return yggfygwlheVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public istkbnxepw.esjtqupxsv gxszxtbevo() {
        return this.f62466iobyxmoadg;
    }

    public androidx.camera.core.impl.cdpycssgdh nufgyqmvbu() {
        androidx.camera.core.impl.cdpycssgdh cdpycssgdhVar = this.f62462dxjokdxxww;
        if (cdpycssgdhVar != null) {
            return cdpycssgdhVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public istkbnxepw.zdlpuopuiu wkgbmnqykc() {
        istkbnxepw.zdlpuopuiu zdlpuopuiuVar = this.f62468nufgyqmvbu;
        if (zdlpuopuiuVar != null) {
            return zdlpuopuiuVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    yggfygwlhe(Context context, jyumaefscl.zoijcleaow zoijcleaowVar, ojitshcjhn.iobyxmoadg iobyxmoadgVar) {
        this.f62466iobyxmoadg = new istkbnxepw.esjtqupxsv();
        this.f62472zoijcleaow = new Object();
        this.f62461draadjrbmk = iobyxmoadg.UNINITIALIZED;
        this.f62470wflxmlrfwp = iozdgvuglv.gtknphoqwx.draadjrbmk(null);
        if (zoijcleaowVar != null) {
            this.f62469ppxfxbqfkf = zoijcleaowVar.getCameraXConfig();
        } else {
            jyumaefscl.zoijcleaow zoijcleaowVarLqeggnwhkg = lqeggnwhkg(context);
            if (zoijcleaowVarLqeggnwhkg == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f62469ppxfxbqfkf = zoijcleaowVarLqeggnwhkg.getCameraXConfig();
        }
        kcexrzcfyt(context, this.f62469ppxfxbqfkf.okpsazkaxt(), iobyxmoadgVar);
        Executor executorJlmebxxoox = this.f62469ppxfxbqfkf.jlmebxxoox(null);
        Handler handlerJztzpxfvev = this.f62469ppxfxbqfkf.jztzpxfvev(null);
        this.f62471wkgbmnqykc = executorJlmebxxoox == null ? new draadjrbmk() : executorJlmebxxoox;
        if (handlerJztzpxfvev == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f62465gxszxtbevo = handlerThread;
            handlerThread.start();
            this.f62463eablkybsjg = q1.lqeggnwhkg.iobyxmoadg(handlerThread.getLooper());
        } else {
            this.f62465gxszxtbevo = null;
            this.f62463eablkybsjg = handlerJztzpxfvev;
        }
        Integer num = (Integer) this.f62469ppxfxbqfkf.lqeggnwhkg(jyumaefscl.f62299dsvhmnatus, null);
        this.f62459agtfadlqog = num;
        btonecajqb(num);
        this.f62460btonecajqb = new czzsidtyhn.iobyxmoadg(this.f62469ppxfxbqfkf.jhduphickx()).iobyxmoadg();
        this.f62464gtknphoqwx = draadjrbmk(context);
    }
}
