package kcexrzcfyt;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class ageimvtcrz {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final MeteringRectangle[] f54579cqumvgiudr = new MeteringRectangle[0];

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private ScheduledFuture f54581btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private ScheduledFuture f54583dxjokdxxww;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final iwizpuwonk.draadjrbmk f54586gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu f54587iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private zdlpuopuiu.ppxfxbqfkf f54588iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f54589jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private MeteringRectangle[] f54590kcexrzcfyt;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private MeteringRectangle[] f54594oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ScheduledExecutorService f54595ppxfxbqfkf;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private MeteringRectangle[] f54597vdvldrhtss;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f54600yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f54601zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final Executor f54602zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private volatile boolean f54599wkgbmnqykc = false;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private volatile Rational f54584eablkybsjg = null;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f54591lqeggnwhkg = false;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    Integer f54592nufgyqmvbu = 0;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    long f54585gtknphoqwx = 0;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    boolean f54582draadjrbmk = false;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    boolean f54598wflxmlrfwp = false;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f54580agtfadlqog = 1;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private zdlpuopuiu.ppxfxbqfkf f54593ojitshcjhn = null;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private zdlpuopuiu.ppxfxbqfkf f54596rgvfuqvkyq = null;

    class iobyxmoadg extends istkbnxepw.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f54603iobyxmoadg;

        iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
            this.f54603iobyxmoadg = iobyxmoadgVar;
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void iobyxmoadg(int i13) {
            androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f54603iobyxmoadg;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.gxszxtbevo(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void ppxfxbqfkf(int i13, istkbnxepw.btonecajqb btonecajqbVar) {
            androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f54603iobyxmoadg;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.gxszxtbevo(new CameraControlInternal.CameraControlException(btonecajqbVar));
            }
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void zoijcleaow(int i13, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
            androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f54603iobyxmoadg;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.ppxfxbqfkf(ojitshcjhnVar);
            }
        }
    }

    ageimvtcrz(zdlpuopuiu zdlpuopuiuVar, ScheduledExecutorService scheduledExecutorService, Executor executor, istkbnxepw.jztzpxfvev jztzpxfvevVar) {
        MeteringRectangle[] meteringRectangleArr = f54579cqumvgiudr;
        this.f54597vdvldrhtss = meteringRectangleArr;
        this.f54594oxmwwwfdhm = meteringRectangleArr;
        this.f54590kcexrzcfyt = meteringRectangleArr;
        this.f54601zdlpuopuiu = null;
        this.f54600yggfygwlhe = null;
        this.f54589jyumaefscl = false;
        this.f54588iwizpuwonk = null;
        this.f54587iobyxmoadg = zdlpuopuiuVar;
        this.f54602zoijcleaow = executor;
        this.f54595ppxfxbqfkf = scheduledExecutorService;
        this.f54586gxszxtbevo = new iwizpuwonk.draadjrbmk(jztzpxfvevVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cdpycssgdh(final long j13) {
        this.f54602zoijcleaow.execute(new Runnable() { // from class: kcexrzcfyt.wizcaqwiak
            @Override // java.lang.Runnable
            public final void run() {
                this.f55046zdlpuopuiu.istkbnxepw(j13);
            }
        });
    }

    private boolean cllcsxoeiz() {
        return this.f54597vdvldrhtss.length > 0;
    }

    private List cqumvgiudr(List list, int i13, Rational rational, Rect rect, int i14) {
        if (list.isEmpty() || i13 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lereixgezr.ribwqtqdhb ribwqtqdhbVar = (lereixgezr.ribwqtqdhb) it.next();
            if (arrayList.size() == i13) {
                break;
            }
            if (pmvmpeiblj(ribwqtqdhbVar)) {
                MeteringRectangle meteringRectangleIwizpuwonk = iwizpuwonk(ribwqtqdhbVar, jyumaefscl(ribwqtqdhbVar, rational2, rational, i14, this.f54586gxszxtbevo), rect);
                if (meteringRectangleIwizpuwonk.getWidth() != 0 && meteringRectangleIwizpuwonk.getHeight() != 0) {
                    arrayList.add(meteringRectangleIwizpuwonk);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private boolean esjtqupxsv() {
        return this.f54587iobyxmoadg.cdpycssgdh(1) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void iozdgvuglv(long j13) {
        if (j13 == this.f54585gtknphoqwx) {
            this.f54598wflxmlrfwp = false;
            agtfadlqog(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void istkbnxepw(long j13) {
        if (j13 == this.f54585gtknphoqwx) {
            draadjrbmk();
        }
    }

    private static MeteringRectangle iwizpuwonk(lereixgezr.ribwqtqdhb ribwqtqdhbVar, PointF pointF, Rect rect) {
        int iWidth = (int) (rect.left + (pointF.x * rect.width()));
        int iHeight = (int) (rect.top + (pointF.y * rect.height()));
        int iIobyxmoadg = ((int) (ribwqtqdhbVar.iobyxmoadg() * rect.width())) / 2;
        int iIobyxmoadg2 = ((int) (ribwqtqdhbVar.iobyxmoadg() * rect.height())) / 2;
        Rect rect2 = new Rect(iWidth - iIobyxmoadg, iHeight - iIobyxmoadg2, iWidth + iIobyxmoadg, iHeight + iIobyxmoadg2);
        rect2.left = pkzmftpjix(rect2.left, rect.right, rect.left);
        rect2.right = pkzmftpjix(rect2.right, rect.right, rect.left);
        rect2.top = pkzmftpjix(rect2.top, rect.bottom, rect.top);
        rect2.bottom = pkzmftpjix(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    private static PointF jyumaefscl(lereixgezr.ribwqtqdhb ribwqtqdhbVar, Rational rational, Rational rational2, int i13, iwizpuwonk.draadjrbmk draadjrbmkVar) {
        if (ribwqtqdhbVar.zoijcleaow() != null) {
            rational2 = ribwqtqdhbVar.zoijcleaow();
        }
        PointF pointFIobyxmoadg = draadjrbmkVar.iobyxmoadg(ribwqtqdhbVar, i13);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float fDoubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                pointFIobyxmoadg.y = (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointFIobyxmoadg.y) * (1.0f / fDoubleValue);
            } else {
                float fDoubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                pointFIobyxmoadg.x = (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointFIobyxmoadg.x) * (1.0f / fDoubleValue2);
            }
        }
        return pointFIobyxmoadg;
    }

    private void kcexrzcfyt(String str) {
        this.f54587iobyxmoadg.ntlheqmsrt(this.f54596rgvfuqvkyq);
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f54600yggfygwlhe;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.gxszxtbevo(new CameraControl.OperationCanceledException(str));
            this.f54600yggfygwlhe = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lmojexxdyd(final long j13) {
        this.f54602zoijcleaow.execute(new Runnable() { // from class: kcexrzcfyt.hszhottldk
            @Override // java.lang.Runnable
            public final void run() {
                this.f54700zdlpuopuiu.iozdgvuglv(j13);
            }
        });
    }

    private void ojitshcjhn() {
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f54600yggfygwlhe;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(null);
            this.f54600yggfygwlhe = null;
        }
    }

    private void oxmwwwfdhm(String str) {
        this.f54587iobyxmoadg.ntlheqmsrt(this.f54593ojitshcjhn);
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f54601zdlpuopuiu;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.gxszxtbevo(new CameraControl.OperationCanceledException(str));
            this.f54601zdlpuopuiu = null;
        }
    }

    private static int pkzmftpjix(int i13, int i14, int i15) {
        return Math.min(Math.max(i13, i15), i14);
    }

    private static boolean pmvmpeiblj(lereixgezr.ribwqtqdhb ribwqtqdhbVar) {
        return ribwqtqdhbVar.ppxfxbqfkf() >= 0.0f && ribwqtqdhbVar.ppxfxbqfkf() <= 1.0f && ribwqtqdhbVar.wkgbmnqykc() >= 0.0f && ribwqtqdhbVar.wkgbmnqykc() <= 1.0f;
    }

    private void rgvfuqvkyq() {
        ScheduledFuture scheduledFuture = this.f54583dxjokdxxww;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f54583dxjokdxxww = null;
        }
    }

    private void vdvldrhtss(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, lereixgezr.esjtqupxsv esjtqupxsvVar, long j13) {
        final long jOkpsazkaxt;
        this.f54587iobyxmoadg.ntlheqmsrt(this.f54593ojitshcjhn);
        rgvfuqvkyq();
        wflxmlrfwp();
        this.f54597vdvldrhtss = meteringRectangleArr;
        this.f54594oxmwwwfdhm = meteringRectangleArr2;
        this.f54590kcexrzcfyt = meteringRectangleArr3;
        if (cllcsxoeiz()) {
            this.f54591lqeggnwhkg = true;
            this.f54582draadjrbmk = false;
            this.f54598wflxmlrfwp = false;
            jOkpsazkaxt = this.f54587iobyxmoadg.okpsazkaxt();
            kegysxyocb(null, true);
        } else {
            this.f54591lqeggnwhkg = false;
            this.f54582draadjrbmk = true;
            this.f54598wflxmlrfwp = false;
            jOkpsazkaxt = this.f54587iobyxmoadg.okpsazkaxt();
        }
        this.f54592nufgyqmvbu = 0;
        final boolean zEsjtqupxsv = esjtqupxsv();
        zdlpuopuiu.ppxfxbqfkf ppxfxbqfkfVar = new zdlpuopuiu.ppxfxbqfkf() { // from class: kcexrzcfyt.skhdrjzrfn
            @Override // kcexrzcfyt.zdlpuopuiu.ppxfxbqfkf
            public final boolean iobyxmoadg(TotalCaptureResult totalCaptureResult) {
                return this.f54985iobyxmoadg.yadqdtsiqt(zEsjtqupxsv, jOkpsazkaxt, totalCaptureResult);
            }
        };
        this.f54593ojitshcjhn = ppxfxbqfkfVar;
        this.f54587iobyxmoadg.oxmwwwfdhm(ppxfxbqfkfVar);
        final long j14 = this.f54585gtknphoqwx + 1;
        this.f54585gtknphoqwx = j14;
        Runnable runnable = new Runnable() { // from class: kcexrzcfyt.igdgnonuha
            @Override // java.lang.Runnable
            public final void run() {
                this.f54703zdlpuopuiu.lmojexxdyd(j14);
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.f54595ppxfxbqfkf;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f54581btonecajqb = scheduledExecutorService.schedule(runnable, j13, timeUnit);
        if (esjtqupxsvVar.eablkybsjg()) {
            this.f54583dxjokdxxww = this.f54595ppxfxbqfkf.schedule(new Runnable() { // from class: kcexrzcfyt.lxfrhoxuzk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54881zdlpuopuiu.cdpycssgdh(j14);
                }
            }, esjtqupxsvVar.iobyxmoadg(), timeUnit);
        }
    }

    private void wflxmlrfwp() {
        ScheduledFuture scheduledFuture = this.f54581btonecajqb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f54581btonecajqb = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean yadqdtsiqt(boolean z13, long j13, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (cllcsxoeiz()) {
            if (!z13 || num == null) {
                this.f54598wflxmlrfwp = true;
                this.f54582draadjrbmk = true;
            } else if (this.f54592nufgyqmvbu.intValue() == 3) {
                if (num.intValue() == 4) {
                    this.f54598wflxmlrfwp = true;
                    this.f54582draadjrbmk = true;
                } else if (num.intValue() == 5) {
                    this.f54598wflxmlrfwp = false;
                    this.f54582draadjrbmk = true;
                }
            }
        }
        if (this.f54582draadjrbmk && zdlpuopuiu.jpowsppfya(totalCaptureResult, j13)) {
            agtfadlqog(this.f54598wflxmlrfwp);
            return true;
        }
        if (!this.f54592nufgyqmvbu.equals(num) && num != null) {
            this.f54592nufgyqmvbu = num;
        }
        return false;
    }

    private Rational yggfygwlhe() {
        if (this.f54584eablkybsjg != null) {
            return this.f54584eablkybsjg;
        }
        Rect rectJyumaefscl = this.f54587iobyxmoadg.jyumaefscl();
        return new Rational(rectJyumaefscl.width(), rectJyumaefscl.height());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object ylkuphrtab(final lereixgezr.esjtqupxsv esjtqupxsvVar, final long j13, final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        this.f54602zoijcleaow.execute(new Runnable() { // from class: kcexrzcfyt.iwxlajgraz
            @Override // java.lang.Runnable
            public final void run() {
                this.f54715zdlpuopuiu.wwaezpbzkn(iobyxmoadgVar, esjtqupxsvVar, j13);
            }
        });
        return "startFocusAndMetering";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean zynmafqrjb(int i13, long j13, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i13 || !zdlpuopuiu.jpowsppfya(totalCaptureResult, j13)) {
            return false;
        }
        ojitshcjhn();
        return true;
    }

    void agtfadlqog(boolean z13) {
        wflxmlrfwp();
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f54601zdlpuopuiu;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(lereixgezr.lereixgezr.iobyxmoadg(z13));
            this.f54601zdlpuopuiu = null;
        }
    }

    void btonecajqb(boolean z13, boolean z14) {
        if (this.f54599wkgbmnqykc) {
            androidx.camera.core.impl.dxjokdxxww.iobyxmoadg iobyxmoadgVar = new androidx.camera.core.impl.dxjokdxxww.iobyxmoadg();
            iobyxmoadgVar.zdlpuopuiu(true);
            iobyxmoadgVar.kcexrzcfyt(this.f54580agtfadlqog);
            oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg = new oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg();
            if (z13) {
                c1637iobyxmoadg.gxszxtbevo(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z14) {
                c1637iobyxmoadg.gxszxtbevo(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            iobyxmoadgVar.eablkybsjg(c1637iobyxmoadg.zoijcleaow());
            this.f54587iobyxmoadg.jhduphickx(Collections.singletonList(iobyxmoadgVar.nufgyqmvbu()));
        }
    }

    void draadjrbmk() {
        gtknphoqwx(null);
    }

    com.google.common.util.concurrent.wkgbmnqykc dsvhmnatus(lereixgezr.esjtqupxsv esjtqupxsvVar) {
        return wypolnanlu(esjtqupxsvVar, DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
    }

    void dxjokdxxww(oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg) {
        int iZdlpuopuiu = this.f54591lqeggnwhkg ? 1 : zdlpuopuiu();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Object objValueOf = Integer.valueOf(this.f54587iobyxmoadg.cdpycssgdh(iZdlpuopuiu));
        androidx.camera.core.impl.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar = androidx.camera.core.impl.btonecajqb.ppxfxbqfkf.REQUIRED;
        c1637iobyxmoadg.lqeggnwhkg(key, objValueOf, ppxfxbqfkfVar);
        MeteringRectangle[] meteringRectangleArr = this.f54597vdvldrhtss;
        if (meteringRectangleArr.length != 0) {
            c1637iobyxmoadg.lqeggnwhkg(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, ppxfxbqfkfVar);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f54594oxmwwwfdhm;
        if (meteringRectangleArr2.length != 0) {
            c1637iobyxmoadg.lqeggnwhkg(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, ppxfxbqfkfVar);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f54590kcexrzcfyt;
        if (meteringRectangleArr3.length != 0) {
            c1637iobyxmoadg.lqeggnwhkg(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, ppxfxbqfkfVar);
        }
    }

    void gtknphoqwx(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        kcexrzcfyt("Cancelled by another cancelFocusAndMetering()");
        oxmwwwfdhm("Cancelled by cancelFocusAndMetering()");
        this.f54600yggfygwlhe = iobyxmoadgVar;
        rgvfuqvkyq();
        wflxmlrfwp();
        if (cllcsxoeiz()) {
            btonecajqb(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f54579cqumvgiudr;
        this.f54597vdvldrhtss = meteringRectangleArr;
        this.f54594oxmwwwfdhm = meteringRectangleArr;
        this.f54590kcexrzcfyt = meteringRectangleArr;
        this.f54591lqeggnwhkg = false;
        final long jOkpsazkaxt = this.f54587iobyxmoadg.okpsazkaxt();
        if (this.f54600yggfygwlhe != null) {
            final int iCdpycssgdh = this.f54587iobyxmoadg.cdpycssgdh(zdlpuopuiu());
            zdlpuopuiu.ppxfxbqfkf ppxfxbqfkfVar = new zdlpuopuiu.ppxfxbqfkf() { // from class: kcexrzcfyt.dvvnrvtcbc
                @Override // kcexrzcfyt.zdlpuopuiu.ppxfxbqfkf
                public final boolean iobyxmoadg(TotalCaptureResult totalCaptureResult) {
                    return this.f54664iobyxmoadg.zynmafqrjb(iCdpycssgdh, jOkpsazkaxt, totalCaptureResult);
                }
            };
            this.f54596rgvfuqvkyq = ppxfxbqfkfVar;
            this.f54587iobyxmoadg.oxmwwwfdhm(ppxfxbqfkfVar);
        }
    }

    void hcddaimhww(boolean z13) {
        if (z13 == this.f54599wkgbmnqykc) {
            return;
        }
        this.f54599wkgbmnqykc = z13;
        if (this.f54599wkgbmnqykc) {
            return;
        }
        draadjrbmk();
    }

    void hkdspvbjdz(int i13) {
        this.f54580agtfadlqog = i13;
    }

    public void jpowsppfya(Rational rational) {
        this.f54584eablkybsjg = rational;
    }

    void kegysxyocb(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, boolean z13) {
        if (!this.f54599wkgbmnqykc) {
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.gxszxtbevo(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        androidx.camera.core.impl.dxjokdxxww.iobyxmoadg iobyxmoadgVar2 = new androidx.camera.core.impl.dxjokdxxww.iobyxmoadg();
        iobyxmoadgVar2.kcexrzcfyt(this.f54580agtfadlqog);
        iobyxmoadgVar2.zdlpuopuiu(true);
        oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg = new oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg();
        c1637iobyxmoadg.gxszxtbevo(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z13) {
            c1637iobyxmoadg.lqeggnwhkg(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f54587iobyxmoadg.zynmafqrjb(1)), androidx.camera.core.impl.btonecajqb.ppxfxbqfkf.HIGH_PRIORITY_REQUIRED);
        }
        iobyxmoadgVar2.eablkybsjg(c1637iobyxmoadg.zoijcleaow());
        iobyxmoadgVar2.ppxfxbqfkf(new iobyxmoadg(iobyxmoadgVar));
        this.f54587iobyxmoadg.jhduphickx(Collections.singletonList(iobyxmoadgVar2.nufgyqmvbu()));
    }

    boolean lereixgezr() {
        return this.f54589jyumaefscl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: stevsuqkhv, reason: merged with bridge method [inline-methods] */
    public void wwaezpbzkn(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, lereixgezr.esjtqupxsv esjtqupxsvVar, long j13) {
        if (!this.f54599wkgbmnqykc) {
            iobyxmoadgVar.gxszxtbevo(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        Rect rectJyumaefscl = this.f54587iobyxmoadg.jyumaefscl();
        Rational rationalYggfygwlhe = yggfygwlhe();
        List listCqumvgiudr = cqumvgiudr(esjtqupxsvVar.ppxfxbqfkf(), this.f54587iobyxmoadg.cqumvgiudr(), rationalYggfygwlhe, rectJyumaefscl, 1);
        List listCqumvgiudr2 = cqumvgiudr(esjtqupxsvVar.zoijcleaow(), this.f54587iobyxmoadg.iwizpuwonk(), rationalYggfygwlhe, rectJyumaefscl, 2);
        List listCqumvgiudr3 = cqumvgiudr(esjtqupxsvVar.wkgbmnqykc(), this.f54587iobyxmoadg.esjtqupxsv(), rationalYggfygwlhe, rectJyumaefscl, 4);
        if (listCqumvgiudr.isEmpty() && listCqumvgiudr2.isEmpty() && listCqumvgiudr3.isEmpty()) {
            iobyxmoadgVar.gxszxtbevo(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        oxmwwwfdhm("Cancelled by another startFocusAndMetering()");
        kcexrzcfyt("Cancelled by another startFocusAndMetering()");
        rgvfuqvkyq();
        this.f54601zdlpuopuiu = iobyxmoadgVar;
        MeteringRectangle[] meteringRectangleArr = f54579cqumvgiudr;
        vdvldrhtss((MeteringRectangle[]) listCqumvgiudr.toArray(meteringRectangleArr), (MeteringRectangle[]) listCqumvgiudr2.toArray(meteringRectangleArr), (MeteringRectangle[]) listCqumvgiudr3.toArray(meteringRectangleArr), esjtqupxsvVar, j13);
    }

    com.google.common.util.concurrent.wkgbmnqykc wypolnanlu(final lereixgezr.esjtqupxsv esjtqupxsvVar, final long j13) {
        return androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: kcexrzcfyt.fiwbwshyhd
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return this.f54685iobyxmoadg.ylkuphrtab(esjtqupxsvVar, j13, iobyxmoadgVar);
            }
        });
    }

    int zdlpuopuiu() {
        return this.f54580agtfadlqog != 3 ? 4 : 3;
    }
}
