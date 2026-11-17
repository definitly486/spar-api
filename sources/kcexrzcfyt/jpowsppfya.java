package kcexrzcfyt;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import modern.payments.ecomAndroid.data.common.MockConstants;

/* JADX INFO: loaded from: classes.dex */
final class jpowsppfya implements istkbnxepw.iwizpuwonk {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    CameraDevice f54726cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    final istkbnxepw.zynmafqrjb f54727cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    volatile dxjokdxxww f54728cqumvgiudr = dxjokdxxww.INITIALIZED;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private androidx.camera.core.impl.gxszxtbevo f54729crxdokpmqz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final boolean f54730dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final istkbnxepw.mbcevpiqjq f54731esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    final eablkybsjg f54732hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    final pmvmpeiblj.iobyxmoadg f54733hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private final zdlpuopuiu.pmvmpeiblj f54734ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    iyctptxqzt f54735iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    final tzroggbefp f54736istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ScheduledExecutorService f54737iwizpuwonk;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private final tbqsvytpvh f54738jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    final Object f54739jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    final gxszxtbevo f54740jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Executor f54741jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private final d f54742jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private boolean f54743kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final rlfsiqarku f54744lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    final AtomicInteger f54745lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private jrbgnlbqoe f54746mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private final zeieaojujs f54747ntlheqmsrt;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private final yggfygwlhe.lqeggnwhkg f54748okpsazkaxt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f54749pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final zdlpuopuiu f54750pmvmpeiblj;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private istkbnxepw.yfnezrywwk f54751ribwqtqdhb;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private final Set f54752sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private boolean f54753stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private boolean f54754tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private final e.zoijcleaow f54755ulzqkzuiru;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    boolean f54756vipkmwdibw;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f54757wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final boolean f54758wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private final nufgyqmvbu f54759xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    int f54760yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zdlpuopuiu.cllcsxoeiz f54761yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    final Map f54762ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final androidx.camera.core.impl.zynmafqrjb f54763zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final btonecajqb f54764zynmafqrjb;

    final class btonecajqb extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final iobyxmoadg f54765eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Executor f54767iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private zoijcleaow f54768ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        ScheduledFuture f54769wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ScheduledExecutorService f54770zoijcleaow;

        class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final long f54771iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private long f54773zoijcleaow = -1;

            iobyxmoadg(long j13) {
                this.f54771iobyxmoadg = j13;
            }

            void eablkybsjg() {
                this.f54773zoijcleaow = -1L;
            }

            boolean iobyxmoadg() {
                if (zoijcleaow() < wkgbmnqykc()) {
                    return true;
                }
                eablkybsjg();
                return false;
            }

            int ppxfxbqfkf() {
                if (!btonecajqb.this.gxszxtbevo()) {
                    return 700;
                }
                long jZoijcleaow = zoijcleaow();
                if (jZoijcleaow <= 120000) {
                    return 1000;
                }
                return jZoijcleaow <= 300000 ? 2000 : 4000;
            }

            int wkgbmnqykc() {
                if (!btonecajqb.this.gxszxtbevo()) {
                    long j13 = this.f54771iobyxmoadg;
                    return j13 > 0 ? Math.min((int) j13, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND) : AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
                }
                long j14 = this.f54771iobyxmoadg;
                if (j14 > 0) {
                    return Math.min((int) j14, 1800000);
                }
                return 1800000;
            }

            long zoijcleaow() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.f54773zoijcleaow == -1) {
                    this.f54773zoijcleaow = jUptimeMillis;
                }
                return jUptimeMillis - this.f54773zoijcleaow;
            }
        }

        class zoijcleaow implements Runnable {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private boolean f54775yggfygwlhe = false;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private Executor f54776zdlpuopuiu;

            zoijcleaow(Executor executor) {
                this.f54776zdlpuopuiu = executor;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void ppxfxbqfkf() {
                if (this.f54775yggfygwlhe) {
                    return;
                }
                u1.nufgyqmvbu.nufgyqmvbu(jpowsppfya.this.f54728cqumvgiudr == dxjokdxxww.REOPENING || jpowsppfya.this.f54728cqumvgiudr == dxjokdxxww.REOPENING_QUIRK);
                if (btonecajqb.this.gxszxtbevo()) {
                    jpowsppfya.this.fmlbqenlif(true);
                } else {
                    jpowsppfya.this.ezmngbhpjk(true);
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f54776zdlpuopuiu.execute(new Runnable() { // from class: kcexrzcfyt.wypolnanlu
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f55055zdlpuopuiu.ppxfxbqfkf();
                    }
                });
            }

            void zoijcleaow() {
                this.f54775yggfygwlhe = true;
            }
        }

        btonecajqb(Executor executor, ScheduledExecutorService scheduledExecutorService, long j13) {
            this.f54767iobyxmoadg = executor;
            this.f54770zoijcleaow = scheduledExecutorService;
            this.f54765eablkybsjg = new iobyxmoadg(j13);
        }

        private void ppxfxbqfkf(int i13) {
            int i14 = 1;
            u1.nufgyqmvbu.dxjokdxxww(jpowsppfya.this.f54760yadqdtsiqt != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i13 == 1) {
                i14 = 2;
            } else if (i13 != 2) {
                i14 = 3;
            }
            jpowsppfya.this.ageimvtcrz(dxjokdxxww.REOPENING, lereixgezr.vdvldrhtss.iobyxmoadg.iobyxmoadg(i14));
            jpowsppfya.this.wypolnanlu(false);
        }

        private void zoijcleaow(CameraDevice cameraDevice, int i13) {
            u1.nufgyqmvbu.dxjokdxxww(jpowsppfya.this.f54728cqumvgiudr == dxjokdxxww.OPENING || jpowsppfya.this.f54728cqumvgiudr == dxjokdxxww.OPENED || jpowsppfya.this.f54728cqumvgiudr == dxjokdxxww.CONFIGURED || jpowsppfya.this.f54728cqumvgiudr == dxjokdxxww.REOPENING || jpowsppfya.this.f54728cqumvgiudr == dxjokdxxww.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + jpowsppfya.this.f54728cqumvgiudr);
            if (i13 == 1 || i13 == 2 || i13 == 4) {
                lereixgezr.sopmlzcsov.iobyxmoadg("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), jpowsppfya.vipkmwdibw(i13)));
                ppxfxbqfkf(i13);
                return;
            }
            lereixgezr.sopmlzcsov.ppxfxbqfkf("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + jpowsppfya.vipkmwdibw(i13) + " closing camera.");
            jpowsppfya.this.ageimvtcrz(dxjokdxxww.CLOSING, lereixgezr.vdvldrhtss.iobyxmoadg.iobyxmoadg(i13 == 3 ? 5 : 6));
            jpowsppfya.this.wypolnanlu(false);
        }

        void eablkybsjg() {
            u1.nufgyqmvbu.nufgyqmvbu(this.f54768ppxfxbqfkf == null);
            u1.nufgyqmvbu.nufgyqmvbu(this.f54769wkgbmnqykc == null);
            if (!this.f54765eablkybsjg.iobyxmoadg()) {
                lereixgezr.sopmlzcsov.ppxfxbqfkf("Camera2CameraImpl", "Camera reopening attempted for " + this.f54765eablkybsjg.wkgbmnqykc() + "ms without success.");
                jpowsppfya.this.fyldjkxazc(dxjokdxxww.PENDING_OPEN, null, false);
                return;
            }
            this.f54768ppxfxbqfkf = new zoijcleaow(this.f54767iobyxmoadg);
            jpowsppfya.this.ntlheqmsrt("Attempting camera re-open in " + this.f54765eablkybsjg.ppxfxbqfkf() + "ms: " + this.f54768ppxfxbqfkf + " activeResuming = " + jpowsppfya.this.f54756vipkmwdibw);
            this.f54769wkgbmnqykc = this.f54770zoijcleaow.schedule(this.f54768ppxfxbqfkf, (long) this.f54765eablkybsjg.ppxfxbqfkf(), TimeUnit.MILLISECONDS);
        }

        boolean gxszxtbevo() {
            int i13;
            jpowsppfya jpowsppfyaVar = jpowsppfya.this;
            return jpowsppfyaVar.f54756vipkmwdibw && ((i13 = jpowsppfyaVar.f54760yadqdtsiqt) == 1 || i13 == 2);
        }

        boolean iobyxmoadg() {
            if (this.f54769wkgbmnqykc == null) {
                return false;
            }
            jpowsppfya.this.ntlheqmsrt("Cancelling scheduled re-open: " + this.f54768ppxfxbqfkf);
            this.f54768ppxfxbqfkf.zoijcleaow();
            this.f54768ppxfxbqfkf = null;
            this.f54769wkgbmnqykc.cancel(false);
            this.f54769wkgbmnqykc = null;
            return true;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            jpowsppfya.this.ntlheqmsrt("CameraDevice.onClosed()");
            u1.nufgyqmvbu.dxjokdxxww(jpowsppfya.this.f54726cdpycssgdh == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int iOrdinal = jpowsppfya.this.f54728cqumvgiudr.ordinal();
            if (iOrdinal == 1 || iOrdinal == 4) {
                u1.nufgyqmvbu.nufgyqmvbu(jpowsppfya.this.jztzpxfvev());
                jpowsppfya.this.tzroggbefp();
                return;
            }
            if (iOrdinal != 5 && iOrdinal != 6) {
                throw new IllegalStateException("Camera closed while in state: " + jpowsppfya.this.f54728cqumvgiudr);
            }
            jpowsppfya jpowsppfyaVar = jpowsppfya.this;
            if (jpowsppfyaVar.f54760yadqdtsiqt == 0) {
                jpowsppfyaVar.ezmngbhpjk(false);
                return;
            }
            jpowsppfyaVar.ntlheqmsrt("Camera closed due to error: " + jpowsppfya.vipkmwdibw(jpowsppfya.this.f54760yadqdtsiqt));
            eablkybsjg();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            jpowsppfya.this.ntlheqmsrt("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i13) {
            jpowsppfya jpowsppfyaVar = jpowsppfya.this;
            jpowsppfyaVar.f54726cdpycssgdh = cameraDevice;
            jpowsppfyaVar.f54760yadqdtsiqt = i13;
            jpowsppfyaVar.f54759xrmfcynszj.zoijcleaow();
            int iOrdinal = jpowsppfya.this.f54728cqumvgiudr.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        lereixgezr.sopmlzcsov.iobyxmoadg("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), jpowsppfya.vipkmwdibw(i13), jpowsppfya.this.f54728cqumvgiudr.name()));
                        zoijcleaow(cameraDevice, i13);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + jpowsppfya.this.f54728cqumvgiudr);
                }
            }
            lereixgezr.sopmlzcsov.ppxfxbqfkf("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), jpowsppfya.vipkmwdibw(i13), jpowsppfya.this.f54728cqumvgiudr.name()));
            jpowsppfya.this.wypolnanlu(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            jpowsppfya.this.ntlheqmsrt("CameraDevice.onOpened()");
            jpowsppfya jpowsppfyaVar = jpowsppfya.this;
            jpowsppfyaVar.f54726cdpycssgdh = cameraDevice;
            jpowsppfyaVar.f54760yadqdtsiqt = 0;
            wkgbmnqykc();
            int iOrdinal = jpowsppfya.this.f54728cqumvgiudr.ordinal();
            if (iOrdinal == 1 || iOrdinal == 4) {
                u1.nufgyqmvbu.nufgyqmvbu(jpowsppfya.this.jztzpxfvev());
                jpowsppfya.this.f54726cdpycssgdh.close();
                jpowsppfya.this.f54726cdpycssgdh = null;
            } else {
                if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + jpowsppfya.this.f54728cqumvgiudr);
                }
                jpowsppfya.this.fiwbwshyhd(dxjokdxxww.OPENED);
                istkbnxepw.zynmafqrjb zynmafqrjbVar = jpowsppfya.this.f54727cllcsxoeiz;
                String id2 = cameraDevice.getId();
                jpowsppfya jpowsppfyaVar2 = jpowsppfya.this;
                if (zynmafqrjbVar.btonecajqb(id2, jpowsppfyaVar2.f54733hkdspvbjdz.iobyxmoadg(jpowsppfyaVar2.f54726cdpycssgdh.getId()))) {
                    jpowsppfya.this.iwxlajgraz();
                }
            }
        }

        void wkgbmnqykc() {
            this.f54765eablkybsjg.eablkybsjg();
        }
    }

    enum dxjokdxxww {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    final class eablkybsjg extends CameraManager.AvailabilityCallback implements istkbnxepw.zynmafqrjb.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f54788iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f54790zoijcleaow = true;

        eablkybsjg(String str) {
            this.f54788iobyxmoadg = str;
        }

        @Override // istkbnxepw.zynmafqrjb.ppxfxbqfkf
        public void iobyxmoadg() {
            if (jpowsppfya.this.f54728cqumvgiudr == dxjokdxxww.PENDING_OPEN) {
                jpowsppfya.this.ezmngbhpjk(false);
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f54788iobyxmoadg.equals(str)) {
                this.f54790zoijcleaow = true;
                if (jpowsppfya.this.f54728cqumvgiudr == dxjokdxxww.PENDING_OPEN) {
                    jpowsppfya.this.ezmngbhpjk(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f54788iobyxmoadg.equals(str)) {
                this.f54790zoijcleaow = false;
            }
        }

        boolean zoijcleaow() {
            return this.f54790zoijcleaow;
        }
    }

    static abstract class gtknphoqwx {
        gtknphoqwx() {
        }

        static gtknphoqwx iobyxmoadg(String str, Class cls, androidx.camera.core.impl.jyumaefscl jyumaefsclVar, androidx.camera.core.impl.istkbnxepw istkbnxepwVar, Size size, androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar, List list) {
            return new kcexrzcfyt.wkgbmnqykc(str, cls, jyumaefsclVar, istkbnxepwVar, size, iwizpuwonkVar, list);
        }

        static gtknphoqwx zoijcleaow(lereixgezr.roivzttewh roivzttewhVar, boolean z13) {
            return iobyxmoadg(jpowsppfya.ikoacuggdj(roivzttewhVar), roivzttewhVar.getClass(), z13 ? roivzttewhVar.iwizpuwonk() : roivzttewhVar.yggfygwlhe(), roivzttewhVar.btonecajqb(), roivzttewhVar.gxszxtbevo(), roivzttewhVar.eablkybsjg(), jpowsppfya.ribwqtqdhb(roivzttewhVar));
        }

        abstract Class dxjokdxxww();

        abstract androidx.camera.core.impl.iwizpuwonk eablkybsjg();

        abstract Size gxszxtbevo();

        abstract androidx.camera.core.impl.istkbnxepw lqeggnwhkg();

        abstract String nufgyqmvbu();

        abstract List ppxfxbqfkf();

        abstract androidx.camera.core.impl.jyumaefscl wkgbmnqykc();
    }

    final class gxszxtbevo implements istkbnxepw.zynmafqrjb.zoijcleaow {
        gxszxtbevo() {
        }

        @Override // istkbnxepw.zynmafqrjb.zoijcleaow
        public void iobyxmoadg() {
            if (jpowsppfya.this.f54728cqumvgiudr == dxjokdxxww.OPENED) {
                jpowsppfya.this.iwxlajgraz();
            }
        }
    }

    class iobyxmoadg implements kcexrzcfyt.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // kcexrzcfyt.gxszxtbevo
        public CamcorderProfile iobyxmoadg(int i13, int i14) {
            return CamcorderProfile.get(i13, i14);
        }

        @Override // kcexrzcfyt.gxszxtbevo
        public boolean zoijcleaow(int i13, int i14) {
            return CamcorderProfile.hasProfile(i13, i14);
        }
    }

    final class lqeggnwhkg implements CameraControlInternal.zoijcleaow {
        lqeggnwhkg() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.zoijcleaow
        public void iobyxmoadg() {
            jpowsppfya.this.rhgxfdycjh();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.zoijcleaow
        public void zoijcleaow(List list) {
            jpowsppfya.this.ipoelvxyzq((List) u1.nufgyqmvbu.gxszxtbevo(list));
        }
    }

    class ppxfxbqfkf implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ iyctptxqzt f54799iobyxmoadg;

        ppxfxbqfkf(iyctptxqzt iyctptxqztVar) {
            this.f54799iobyxmoadg = iyctptxqztVar;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r13) {
            jpowsppfya.this.f54762ylkuphrtab.remove(this.f54799iobyxmoadg);
            int iOrdinal = jpowsppfya.this.f54728cqumvgiudr.ordinal();
            if (iOrdinal != 1 && iOrdinal != 4) {
                if (iOrdinal != 5 && (iOrdinal != 6 || jpowsppfya.this.f54760yadqdtsiqt == 0)) {
                    return;
                } else {
                    jpowsppfya.this.ntlheqmsrt("Camera reopen required. Checking if the current camera can be closed safely.");
                }
            }
            if (jpowsppfya.this.jztzpxfvev()) {
                jpowsppfya jpowsppfyaVar = jpowsppfya.this;
                if (jpowsppfyaVar.f54726cdpycssgdh != null) {
                    jpowsppfyaVar.ntlheqmsrt("closing camera");
                    zdlpuopuiu.iobyxmoadg.iobyxmoadg(jpowsppfya.this.f54726cdpycssgdh);
                    jpowsppfya.this.f54726cdpycssgdh = null;
                }
            }
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
        }
    }

    class wkgbmnqykc implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ iyctptxqzt f54801iobyxmoadg;

        wkgbmnqykc(iyctptxqzt iyctptxqztVar) {
            this.f54801iobyxmoadg = iyctptxqztVar;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r13) {
            if (jpowsppfya.this.f54733hkdspvbjdz.ppxfxbqfkf() == 2 && jpowsppfya.this.f54728cqumvgiudr == dxjokdxxww.OPENED) {
                jpowsppfya.this.fiwbwshyhd(dxjokdxxww.CONFIGURED);
            }
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            if (th2 instanceof DeferrableSurface.SurfaceClosedException) {
                androidx.camera.core.impl.jyumaefscl jyumaefsclVarSopmlzcsov = jpowsppfya.this.sopmlzcsov(((DeferrableSurface.SurfaceClosedException) th2).iobyxmoadg());
                if (jyumaefsclVarSopmlzcsov != null) {
                    jpowsppfya.this.skhdrjzrfn(jyumaefsclVarSopmlzcsov);
                    return;
                }
                return;
            }
            if (th2 instanceof CancellationException) {
                jpowsppfya.this.ntlheqmsrt("Unable to configure camera cancelled");
                return;
            }
            dxjokdxxww dxjokdxxwwVar = jpowsppfya.this.f54728cqumvgiudr;
            dxjokdxxww dxjokdxxwwVar2 = dxjokdxxww.OPENED;
            if (dxjokdxxwwVar == dxjokdxxwwVar2) {
                jpowsppfya.this.ageimvtcrz(dxjokdxxwwVar2, lereixgezr.vdvldrhtss.iobyxmoadg.zoijcleaow(4, th2));
            }
            lereixgezr.sopmlzcsov.wkgbmnqykc("Camera2CameraImpl", "Unable to configure camera " + jpowsppfya.this, th2);
            jpowsppfya jpowsppfyaVar = jpowsppfya.this;
            if (jpowsppfyaVar.f54735iozdgvuglv == this.f54801iobyxmoadg) {
                jpowsppfyaVar.wizcaqwiak(false);
            }
        }
    }

    class zoijcleaow extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f54803iobyxmoadg;

        zoijcleaow(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
            this.f54803iobyxmoadg = iobyxmoadgVar;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            jpowsppfya.this.ntlheqmsrt("openCameraConfigAndClose camera closed");
            this.f54803iobyxmoadg.ppxfxbqfkf(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            jpowsppfya.this.ntlheqmsrt("openCameraConfigAndClose camera disconnected");
            this.f54803iobyxmoadg.ppxfxbqfkf(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i13) {
            jpowsppfya.this.ntlheqmsrt("openCameraConfigAndClose camera error " + i13);
            this.f54803iobyxmoadg.ppxfxbqfkf(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            jpowsppfya.this.ntlheqmsrt("openCameraConfigAndClose camera opened");
            com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarKegysxyocb = jpowsppfya.this.kegysxyocb(cameraDevice);
            Objects.requireNonNull(cameraDevice);
            wkgbmnqykcVarKegysxyocb.iobyxmoadg(new Runnable() { // from class: kcexrzcfyt.hkdspvbjdz
                @Override // java.lang.Runnable
                public final void run() {
                    cameraDevice.close();
                }
            }, jpowsppfya.this.f54741jyumaefscl);
        }
    }

    jpowsppfya(Context context, zdlpuopuiu.cllcsxoeiz cllcsxoeizVar, String str, tzroggbefp tzroggbefpVar, pmvmpeiblj.iobyxmoadg iobyxmoadgVar, istkbnxepw.zynmafqrjb zynmafqrjbVar, Executor executor, Handler handler, tbqsvytpvh tbqsvytpvhVar, long j13) throws CameraUnavailableException {
        istkbnxepw.mbcevpiqjq mbcevpiqjqVar = new istkbnxepw.mbcevpiqjq();
        this.f54731esjtqupxsv = mbcevpiqjqVar;
        this.f54760yadqdtsiqt = 0;
        this.f54745lmojexxdyd = new AtomicInteger(0);
        this.f54762ylkuphrtab = new LinkedHashMap();
        this.f54749pkzmftpjix = 0;
        this.f54753stevsuqkhv = false;
        this.f54743kegysxyocb = false;
        this.f54754tzroggbefp = true;
        this.f54752sopmlzcsov = new HashSet();
        this.f54729crxdokpmqz = istkbnxepw.kcexrzcfyt.iobyxmoadg();
        this.f54739jlmebxxoox = new Object();
        this.f54756vipkmwdibw = false;
        this.f54759xrmfcynszj = new nufgyqmvbu(this, null);
        this.f54761yggfygwlhe = cllcsxoeizVar;
        this.f54733hkdspvbjdz = iobyxmoadgVar;
        this.f54727cllcsxoeiz = zynmafqrjbVar;
        ScheduledExecutorService scheduledExecutorServiceEablkybsjg = yadqdtsiqt.iobyxmoadg.eablkybsjg(handler);
        this.f54737iwizpuwonk = scheduledExecutorServiceEablkybsjg;
        Executor executorGxszxtbevo = yadqdtsiqt.iobyxmoadg.gxszxtbevo(executor);
        this.f54741jyumaefscl = executorGxszxtbevo;
        this.f54764zynmafqrjb = new btonecajqb(executorGxszxtbevo, scheduledExecutorServiceEablkybsjg, j13);
        this.f54763zdlpuopuiu = new androidx.camera.core.impl.zynmafqrjb(str);
        mbcevpiqjqVar.lqeggnwhkg(istkbnxepw.iwizpuwonk.iobyxmoadg.CLOSED);
        rlfsiqarku rlfsiqarkuVar = new rlfsiqarku(zynmafqrjbVar);
        this.f54744lereixgezr = rlfsiqarkuVar;
        zeieaojujs zeieaojujsVar = new zeieaojujs(executorGxszxtbevo);
        this.f54747ntlheqmsrt = zeieaojujsVar;
        this.f54738jhduphickx = tbqsvytpvhVar;
        try {
            zdlpuopuiu.pmvmpeiblj pmvmpeibljVarPpxfxbqfkf = cllcsxoeizVar.ppxfxbqfkf(str);
            this.f54734ikoacuggdj = pmvmpeibljVarPpxfxbqfkf;
            zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(pmvmpeibljVarPpxfxbqfkf, scheduledExecutorServiceEablkybsjg, executorGxszxtbevo, new lqeggnwhkg(), tzroggbefpVar.nufgyqmvbu());
            this.f54750pmvmpeiblj = zdlpuopuiuVar;
            this.f54736istkbnxepw = tzroggbefpVar;
            tzroggbefpVar.zdlpuopuiu(zdlpuopuiuVar);
            tzroggbefpVar.iwizpuwonk(rlfsiqarkuVar.iobyxmoadg());
            this.f54748okpsazkaxt = yggfygwlhe.lqeggnwhkg.iobyxmoadg(pmvmpeibljVarPpxfxbqfkf);
            this.f54735iozdgvuglv = nuxfzjnpeb();
            this.f54755ulzqkzuiru = new e.zoijcleaow(executorGxszxtbevo, scheduledExecutorServiceEablkybsjg, handler, zeieaojujsVar, tzroggbefpVar.nufgyqmvbu(), androidx.camera.camera2.internal.compat.quirk.zoijcleaow.ppxfxbqfkf());
            this.f54730dsvhmnatus = tzroggbefpVar.nufgyqmvbu().iobyxmoadg(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.f54758wypolnanlu = tzroggbefpVar.nufgyqmvbu().iobyxmoadg(LegacyCameraSurfaceCleanupQuirk.class);
            eablkybsjg eablkybsjgVar = new eablkybsjg(str);
            this.f54732hcddaimhww = eablkybsjgVar;
            gxszxtbevo gxszxtbevoVar = new gxszxtbevo();
            this.f54740jpowsppfya = gxszxtbevoVar;
            zynmafqrjbVar.lqeggnwhkg(this, executorGxszxtbevo, gxszxtbevoVar, eablkybsjgVar);
            cllcsxoeizVar.lqeggnwhkg(executorGxszxtbevo, eablkybsjgVar);
            this.f54742jztzpxfvev = new d(context, str, cllcsxoeizVar, new iobyxmoadg());
        } catch (CameraAccessExceptionCompat e13) {
            throw czzsidtyhn.iobyxmoadg(e13);
        }
    }

    private void auzgnhcxok(boolean z13) {
        if (!z13) {
            this.f54764zynmafqrjb.wkgbmnqykc();
        }
        this.f54764zynmafqrjb.iobyxmoadg();
        this.f54759xrmfcynszj.iobyxmoadg();
        ntlheqmsrt("Opening camera.");
        fiwbwshyhd(dxjokdxxww.OPENING);
        try {
            this.f54761yggfygwlhe.gxszxtbevo(this.f54736istkbnxepw.zoijcleaow(), this.f54741jyumaefscl, mbcevpiqjq());
        } catch (CameraAccessExceptionCompat e13) {
            ntlheqmsrt("Unable to open camera due to " + e13.getMessage());
            if (e13.nufgyqmvbu() != 10001) {
                this.f54759xrmfcynszj.wkgbmnqykc();
            } else {
                ageimvtcrz(dxjokdxxww.INITIALIZED, lereixgezr.vdvldrhtss.iobyxmoadg.zoijcleaow(7, e13));
            }
        } catch (SecurityException e14) {
            ntlheqmsrt("Unable to open camera due to " + e14.getMessage());
            fiwbwshyhd(dxjokdxxww.REOPENING);
            this.f54764zynmafqrjb.eablkybsjg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bfopjjpdmp(String str) {
        ntlheqmsrt("Use case " + str + " INACTIVE");
        this.f54763zdlpuopuiu.cqumvgiudr(str);
        rhgxfdycjh();
    }

    private void cllcsxoeiz() {
        androidx.camera.core.impl.jyumaefscl jyumaefsclVarPpxfxbqfkf = this.f54763zdlpuopuiu.lqeggnwhkg().ppxfxbqfkf();
        androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVarGtknphoqwx = jyumaefsclVarPpxfxbqfkf.gtknphoqwx();
        int size = dxjokdxxwwVarGtknphoqwx.dxjokdxxww().size();
        int size2 = jyumaefsclVarPpxfxbqfkf.ojitshcjhn().size();
        if (jyumaefsclVarPpxfxbqfkf.ojitshcjhn().isEmpty()) {
            return;
        }
        if (dxjokdxxwwVarGtknphoqwx.dxjokdxxww().isEmpty()) {
            if (this.f54746mbcevpiqjq == null) {
                this.f54746mbcevpiqjq = new jrbgnlbqoe(this.f54736istkbnxepw.vdvldrhtss(), this.f54738jhduphickx, new jrbgnlbqoe.ppxfxbqfkf() { // from class: kcexrzcfyt.istkbnxepw
                    @Override // kcexrzcfyt.jrbgnlbqoe.ppxfxbqfkf
                    public final void iobyxmoadg() {
                        this.f54710iobyxmoadg.metgxyhuhe();
                    }
                });
            }
            if (xrmfcynszj()) {
                hkdspvbjdz();
                return;
            } else {
                lereixgezr.sopmlzcsov.ppxfxbqfkf("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
                return;
            }
        }
        if (size2 == 1 && size == 1) {
            lxfrhoxuzk();
            return;
        }
        if (size >= 2) {
            lxfrhoxuzk();
            return;
        }
        if (this.f54746mbcevpiqjq != null && !xrmfcynszj()) {
            lxfrhoxuzk();
            return;
        }
        lereixgezr.sopmlzcsov.iobyxmoadg("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void czzsidtyhn(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    private boolean dsvhmnatus(androidx.camera.core.impl.dxjokdxxww.iobyxmoadg iobyxmoadgVar) {
        if (!iobyxmoadgVar.wflxmlrfwp().isEmpty()) {
            lereixgezr.sopmlzcsov.draadjrbmk("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator it = this.f54763zdlpuopuiu.gxszxtbevo().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVarGtknphoqwx = ((androidx.camera.core.impl.jyumaefscl) it.next()).gtknphoqwx();
            List listDxjokdxxww = dxjokdxxwwVarGtknphoqwx.dxjokdxxww();
            if (!listDxjokdxxww.isEmpty()) {
                if (dxjokdxxwwVarGtknphoqwx.nufgyqmvbu() != 0) {
                    iobyxmoadgVar.oxmwwwfdhm(dxjokdxxwwVarGtknphoqwx.nufgyqmvbu());
                }
                if (dxjokdxxwwVarGtknphoqwx.draadjrbmk() != 0) {
                    iobyxmoadgVar.yggfygwlhe(dxjokdxxwwVarGtknphoqwx.draadjrbmk());
                }
                Iterator it2 = listDxjokdxxww.iterator();
                while (it2.hasNext()) {
                    iobyxmoadgVar.gxszxtbevo((DeferrableSurface) it2.next());
                }
            }
        }
        if (!iobyxmoadgVar.wflxmlrfwp().isEmpty()) {
            return true;
        }
        lereixgezr.sopmlzcsov.draadjrbmk("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    private void dvvnrvtcbc() {
        int iOrdinal = this.f54728cqumvgiudr.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            fmlbqenlif(false);
            return;
        }
        if (iOrdinal != 4) {
            ntlheqmsrt("open() ignored due to being in state: " + this.f54728cqumvgiudr);
            return;
        }
        fiwbwshyhd(dxjokdxxww.REOPENING);
        if (jztzpxfvev() || this.f54743kegysxyocb || this.f54760yadqdtsiqt != 0) {
            return;
        }
        u1.nufgyqmvbu.dxjokdxxww(this.f54726cdpycssgdh != null, "Camera Device should be open if session close is not complete");
        fiwbwshyhd(dxjokdxxww.OPENED);
        iwxlajgraz();
    }

    private Collection grlcpdaxtj(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(gtknphoqwx.zoijcleaow((lereixgezr.roivzttewh) it.next(), this.f54754tzroggbefp));
        }
        return arrayList;
    }

    private void hkdspvbjdz() {
        jrbgnlbqoe jrbgnlbqoeVar = this.f54746mbcevpiqjq;
        if (jrbgnlbqoeVar != null) {
            String strJhduphickx = jhduphickx(jrbgnlbqoeVar);
            androidx.camera.core.impl.zynmafqrjb zynmafqrjbVar = this.f54763zdlpuopuiu;
            androidx.camera.core.impl.jyumaefscl jyumaefsclVarNufgyqmvbu = this.f54746mbcevpiqjq.nufgyqmvbu();
            androidx.camera.core.impl.istkbnxepw istkbnxepwVarDxjokdxxww = this.f54746mbcevpiqjq.dxjokdxxww();
            androidx.camera.core.impl.cdpycssgdh.zoijcleaow zoijcleaowVar = androidx.camera.core.impl.cdpycssgdh.zoijcleaow.METERING_REPEATING;
            zynmafqrjbVar.jyumaefscl(strJhduphickx, jyumaefsclVarNufgyqmvbu, istkbnxepwVarDxjokdxxww, null, Collections.singletonList(zoijcleaowVar));
            this.f54763zdlpuopuiu.yggfygwlhe(strJhduphickx, this.f54746mbcevpiqjq.nufgyqmvbu(), this.f54746mbcevpiqjq.dxjokdxxww(), null, Collections.singletonList(zoijcleaowVar));
        }
    }

    private void hszhottldk(final String str, final androidx.camera.core.impl.jyumaefscl jyumaefsclVar, final androidx.camera.core.impl.istkbnxepw istkbnxepwVar, final androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar, final List list) {
        this.f54741jyumaefscl.execute(new Runnable() { // from class: kcexrzcfyt.pmvmpeiblj
            @Override // java.lang.Runnable
            public final void run() {
                this.f54955zdlpuopuiu.lrnfpwlwnk(str, jyumaefsclVar, istkbnxepwVar, iwizpuwonkVar, list);
            }
        });
    }

    static String ikoacuggdj(lereixgezr.roivzttewh roivzttewhVar) {
        return roivzttewhVar.ojitshcjhn() + roivzttewhVar.hashCode();
    }

    private void ixidwrxhsl(Collection collection) {
        Size sizeGxszxtbevo;
        boolean zIsEmpty = this.f54763zdlpuopuiu.nufgyqmvbu().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        Rational rational = null;
        while (it.hasNext()) {
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) it.next();
            if (!this.f54763zdlpuopuiu.ojitshcjhn(gtknphoqwxVar.nufgyqmvbu())) {
                this.f54763zdlpuopuiu.jyumaefscl(gtknphoqwxVar.nufgyqmvbu(), gtknphoqwxVar.wkgbmnqykc(), gtknphoqwxVar.lqeggnwhkg(), gtknphoqwxVar.eablkybsjg(), gtknphoqwxVar.ppxfxbqfkf());
                arrayList.add(gtknphoqwxVar.nufgyqmvbu());
                if (gtknphoqwxVar.dxjokdxxww() == lereixgezr.metgxyhuhe.class && (sizeGxszxtbevo = gtknphoqwxVar.gxszxtbevo()) != null) {
                    rational = new Rational(sizeGxszxtbevo.getWidth(), sizeGxszxtbevo.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ntlheqmsrt("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (zIsEmpty) {
            this.f54750pmvmpeiblj.crxdokpmqz(true);
            this.f54750pmvmpeiblj.ylkuphrtab();
        }
        cllcsxoeiz();
        yzdjzghtvl();
        rhgxfdycjh();
        wizcaqwiak(false);
        if (this.f54728cqumvgiudr == dxjokdxxww.OPENED) {
            iwxlajgraz();
        } else {
            dvvnrvtcbc();
        }
        if (rational != null) {
            this.f54750pmvmpeiblj.jlmebxxoox(rational);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object iyctptxqzt(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        try {
            ArrayList arrayList = new ArrayList(this.f54763zdlpuopuiu.lqeggnwhkg().ppxfxbqfkf().ppxfxbqfkf());
            arrayList.add(this.f54747ntlheqmsrt.ppxfxbqfkf());
            arrayList.add(new zoijcleaow(iobyxmoadgVar));
            this.f54761yggfygwlhe.gxszxtbevo(this.f54736istkbnxepw.zoijcleaow(), this.f54741jyumaefscl, jztzpxfvev.iobyxmoadg(arrayList));
            return "configAndCloseTask";
        } catch (CameraAccessExceptionCompat | SecurityException e13) {
            ulzqkzuiru("Unable to open camera for configAndClose: " + e13.getMessage(), e13);
            iobyxmoadgVar.gxszxtbevo(e13);
            return "configAndCloseTask";
        }
    }

    static String jhduphickx(jrbgnlbqoe jrbgnlbqoeVar) {
        return jrbgnlbqoeVar.gxszxtbevo() + jrbgnlbqoeVar.hashCode();
    }

    private int jlmebxxoox() {
        synchronized (this.f54739jlmebxxoox) {
            try {
                return this.f54733hkdspvbjdz.ppxfxbqfkf() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: jrbgnlbqoe, reason: merged with bridge method [inline-methods] */
    public void ydmasvzmpa(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) it.next();
            if (this.f54763zdlpuopuiu.ojitshcjhn(gtknphoqwxVar.nufgyqmvbu())) {
                this.f54763zdlpuopuiu.zdlpuopuiu(gtknphoqwxVar.nufgyqmvbu());
                arrayList.add(gtknphoqwxVar.nufgyqmvbu());
                if (gtknphoqwxVar.dxjokdxxww() == lereixgezr.metgxyhuhe.class) {
                    z13 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ntlheqmsrt("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z13) {
            this.f54750pmvmpeiblj.jlmebxxoox(null);
        }
        cllcsxoeiz();
        if (this.f54763zdlpuopuiu.dxjokdxxww().isEmpty()) {
            this.f54750pmvmpeiblj.vipkmwdibw(false);
        } else {
            yzdjzghtvl();
        }
        if (this.f54763zdlpuopuiu.nufgyqmvbu().isEmpty()) {
            this.f54750pmvmpeiblj.zdlpuopuiu();
            wizcaqwiak(false);
            this.f54750pmvmpeiblj.crxdokpmqz(false);
            this.f54735iozdgvuglv = nuxfzjnpeb();
            stevsuqkhv();
            return;
        }
        rhgxfdycjh();
        wizcaqwiak(false);
        if (this.f54728cqumvgiudr == dxjokdxxww.OPENED) {
            iwxlajgraz();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.util.concurrent.wkgbmnqykc kegysxyocb(CameraDevice cameraDevice) {
        final opjhrmiecq opjhrmiecqVar = new opjhrmiecq(this.f54748okpsazkaxt);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final istkbnxepw.dsvhmnatus dsvhmnatusVar = new istkbnxepw.dsvhmnatus(surface);
        dsvhmnatusVar.gtknphoqwx().iobyxmoadg(new Runnable() { // from class: kcexrzcfyt.yadqdtsiqt
            @Override // java.lang.Runnable
            public final void run() {
                jpowsppfya.czzsidtyhn(surface, surfaceTexture);
            }
        }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        androidx.camera.core.impl.jyumaefscl.zoijcleaow zoijcleaowVar = new androidx.camera.core.impl.jyumaefscl.zoijcleaow();
        zoijcleaowVar.nufgyqmvbu(dsvhmnatusVar);
        zoijcleaowVar.esjtqupxsv(1);
        ntlheqmsrt("Start configAndClose.");
        return iozdgvuglv.wkgbmnqykc.zoijcleaow(iozdgvuglv.gtknphoqwx.pmvmpeiblj(opjhrmiecqVar.zoijcleaow(zoijcleaowVar.rgvfuqvkyq(), cameraDevice, this.f54755ulzqkzuiru.iobyxmoadg()))).gxszxtbevo(new iozdgvuglv.iobyxmoadg() { // from class: kcexrzcfyt.iozdgvuglv
            @Override // iozdgvuglv.iobyxmoadg
            public final com.google.common.util.concurrent.wkgbmnqykc apply(Object obj) {
                return jpowsppfya.uwvvkdfqfp(opjhrmiecqVar, dsvhmnatusVar, (Void) obj);
            }
        }, this.f54741jyumaefscl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lrnfpwlwnk(String str, androidx.camera.core.impl.jyumaefscl jyumaefsclVar, androidx.camera.core.impl.istkbnxepw istkbnxepwVar, androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar, List list) {
        ntlheqmsrt("Use case " + str + " RESET");
        this.f54763zdlpuopuiu.esjtqupxsv(str, jyumaefsclVar, istkbnxepwVar, iwizpuwonkVar, list);
        cllcsxoeiz();
        wizcaqwiak(false);
        rhgxfdycjh();
        if (this.f54728cqumvgiudr == dxjokdxxww.OPENED) {
            iwxlajgraz();
        }
    }

    private void lxfrhoxuzk() {
        if (this.f54746mbcevpiqjq != null) {
            this.f54763zdlpuopuiu.iwizpuwonk(this.f54746mbcevpiqjq.gxszxtbevo() + this.f54746mbcevpiqjq.hashCode());
            this.f54763zdlpuopuiu.cqumvgiudr(this.f54746mbcevpiqjq.gxszxtbevo() + this.f54746mbcevpiqjq.hashCode());
            this.f54746mbcevpiqjq.ppxfxbqfkf();
            this.f54746mbcevpiqjq = null;
        }
    }

    private CameraDevice.StateCallback mbcevpiqjq() {
        ArrayList arrayList = new ArrayList(this.f54763zdlpuopuiu.lqeggnwhkg().ppxfxbqfkf().ppxfxbqfkf());
        arrayList.add(this.f54747ntlheqmsrt.ppxfxbqfkf());
        arrayList.add(this.f54764zynmafqrjb);
        return jztzpxfvev.iobyxmoadg(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void metgxyhuhe() {
        if (okpsazkaxt()) {
            hszhottldk(jhduphickx(this.f54746mbcevpiqjq), this.f54746mbcevpiqjq.nufgyqmvbu(), this.f54746mbcevpiqjq.dxjokdxxww(), null, Collections.singletonList(androidx.camera.core.impl.cdpycssgdh.zoijcleaow.METERING_REPEATING));
        }
    }

    private iyctptxqzt nuxfzjnpeb() {
        synchronized (this.f54739jlmebxxoox) {
            try {
                if (this.f54751ribwqtqdhb == null) {
                    return new opjhrmiecq(this.f54748okpsazkaxt, this.f54736istkbnxepw.nufgyqmvbu());
                }
                return new krqnebusok(this.f54751ribwqtqdhb, this.f54736istkbnxepw, this.f54748okpsazkaxt, this.f54741jyumaefscl, this.f54737iwizpuwonk);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oipsdeybqn(String str, androidx.camera.core.impl.jyumaefscl jyumaefsclVar, androidx.camera.core.impl.istkbnxepw istkbnxepwVar, androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar, List list) {
        ntlheqmsrt("Use case " + str + " ACTIVE");
        this.f54763zdlpuopuiu.yggfygwlhe(str, jyumaefsclVar, istkbnxepwVar, iwizpuwonkVar, list);
        this.f54763zdlpuopuiu.esjtqupxsv(str, jyumaefsclVar, istkbnxepwVar, iwizpuwonkVar, list);
        rhgxfdycjh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void opjhrmiecq(String str, androidx.camera.core.impl.jyumaefscl jyumaefsclVar, androidx.camera.core.impl.istkbnxepw istkbnxepwVar, androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar, List list) {
        ntlheqmsrt("Use case " + str + " UPDATED");
        this.f54763zdlpuopuiu.esjtqupxsv(str, jyumaefsclVar, istkbnxepwVar, iwizpuwonkVar, list);
        rhgxfdycjh();
    }

    static List ribwqtqdhb(lereixgezr.roivzttewh roivzttewhVar) {
        if (roivzttewhVar.lqeggnwhkg() == null) {
            return null;
        }
        return wypolnanlu.nufgyqmvbu.metgxyhuhe(roivzttewhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void rlfsiqarku(List list) {
        try {
            ixidwrxhsl(list);
        } finally {
            this.f54750pmvmpeiblj.zdlpuopuiu();
        }
    }

    private void roivzttewh(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lereixgezr.roivzttewh roivzttewhVar = (lereixgezr.roivzttewh) it.next();
            String strIkoacuggdj = ikoacuggdj(roivzttewhVar);
            if (this.f54752sopmlzcsov.contains(strIkoacuggdj)) {
                roivzttewhVar.hkdspvbjdz();
                this.f54752sopmlzcsov.remove(strIkoacuggdj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void sflfametgt(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        jrbgnlbqoe jrbgnlbqoeVar = this.f54746mbcevpiqjq;
        if (jrbgnlbqoeVar == null) {
            iobyxmoadgVar.ppxfxbqfkf(Boolean.FALSE);
        } else {
            iobyxmoadgVar.ppxfxbqfkf(Boolean.valueOf(this.f54763zdlpuopuiu.ojitshcjhn(jhduphickx(jrbgnlbqoeVar))));
        }
    }

    private void stevsuqkhv() {
        ntlheqmsrt("Closing camera.");
        boolean z13 = true;
        switch (this.f54728cqumvgiudr.ordinal()) {
            case 3:
                u1.nufgyqmvbu.nufgyqmvbu(this.f54726cdpycssgdh == null);
                fiwbwshyhd(dxjokdxxww.INITIALIZED);
                break;
            case 4:
            default:
                ntlheqmsrt("close() ignored due to being in state: " + this.f54728cqumvgiudr);
                break;
            case 5:
            case 6:
            case 7:
                if (!this.f54764zynmafqrjb.iobyxmoadg() && !this.f54759xrmfcynszj.ppxfxbqfkf()) {
                    z13 = false;
                }
                this.f54759xrmfcynszj.iobyxmoadg();
                fiwbwshyhd(dxjokdxxww.CLOSING);
                if (z13) {
                    u1.nufgyqmvbu.nufgyqmvbu(jztzpxfvev());
                    tzroggbefp();
                }
                break;
            case 8:
            case 9:
                fiwbwshyhd(dxjokdxxww.CLOSING);
                wypolnanlu(false);
                break;
        }
    }

    private void tbqsvytpvh(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lereixgezr.roivzttewh roivzttewhVar = (lereixgezr.roivzttewh) it.next();
            String strIkoacuggdj = ikoacuggdj(roivzttewhVar);
            if (!this.f54752sopmlzcsov.contains(strIkoacuggdj)) {
                this.f54752sopmlzcsov.add(strIkoacuggdj);
                roivzttewhVar.jpowsppfya();
                roivzttewhVar.pkzmftpjix();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tzroggbefp() {
        u1.nufgyqmvbu.nufgyqmvbu(this.f54728cqumvgiudr == dxjokdxxww.RELEASING || this.f54728cqumvgiudr == dxjokdxxww.CLOSING);
        u1.nufgyqmvbu.nufgyqmvbu(this.f54762ylkuphrtab.isEmpty());
        if (!this.f54753stevsuqkhv) {
            crxdokpmqz();
            return;
        }
        if (this.f54743kegysxyocb) {
            ntlheqmsrt("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f54732hcddaimhww.zoijcleaow()) {
            this.f54753stevsuqkhv = false;
            crxdokpmqz();
            ntlheqmsrt("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            ntlheqmsrt("Open camera to configAndClose");
            com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarUawqvzlxes = uawqvzlxes();
            this.f54743kegysxyocb = true;
            wkgbmnqykcVarUawqvzlxes.iobyxmoadg(new Runnable() { // from class: kcexrzcfyt.wwaezpbzkn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55054zdlpuopuiu.yfnezrywwk();
                }
            }, this.f54741jyumaefscl);
        }
    }

    private com.google.common.util.concurrent.wkgbmnqykc uawqvzlxes() {
        return androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: kcexrzcfyt.iwizpuwonk
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return this.f54711iobyxmoadg.iyctptxqzt(iobyxmoadgVar);
            }
        });
    }

    private void ulzqkzuiru(String str, Throwable th2) {
        lereixgezr.sopmlzcsov.zoijcleaow("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.wkgbmnqykc uwvvkdfqfp(opjhrmiecq opjhrmiecqVar, DeferrableSurface deferrableSurface, Void r13) {
        opjhrmiecqVar.close();
        deferrableSurface.wkgbmnqykc();
        return opjhrmiecqVar.eablkybsjg(false);
    }

    static String vipkmwdibw(int i13) {
        if (i13 == 0) {
            return "ERROR_NONE";
        }
        if (i13 == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i13 == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i13 == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i13 != 4) {
            return i13 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
        }
        return "ERROR_CAMERA_DEVICE";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void weqkydbzbr(androidx.camera.core.impl.jyumaefscl.wkgbmnqykc wkgbmnqykcVar, androidx.camera.core.impl.jyumaefscl jyumaefsclVar) {
        wkgbmnqykcVar.iobyxmoadg(jyumaefsclVar, androidx.camera.core.impl.jyumaefscl.lqeggnwhkg.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    private boolean xrmfcynszj() {
        ArrayList arrayList = new ArrayList();
        int iJlmebxxoox = jlmebxxoox();
        for (androidx.camera.core.impl.zynmafqrjb.zoijcleaow zoijcleaowVar : this.f54763zdlpuopuiu.btonecajqb()) {
            if (zoijcleaowVar.ppxfxbqfkf() == null || zoijcleaowVar.ppxfxbqfkf().get(0) != androidx.camera.core.impl.cdpycssgdh.zoijcleaow.METERING_REPEATING) {
                if (zoijcleaowVar.eablkybsjg() == null || zoijcleaowVar.ppxfxbqfkf() == null) {
                    lereixgezr.sopmlzcsov.draadjrbmk("Camera2CameraImpl", "Invalid stream spec or capture types in " + zoijcleaowVar);
                    return false;
                }
                androidx.camera.core.impl.jyumaefscl jyumaefsclVarWkgbmnqykc = zoijcleaowVar.wkgbmnqykc();
                androidx.camera.core.impl.istkbnxepw istkbnxepwVarGxszxtbevo = zoijcleaowVar.gxszxtbevo();
                for (DeferrableSurface deferrableSurface : jyumaefsclVarWkgbmnqykc.ojitshcjhn()) {
                    arrayList.add(androidx.camera.core.impl.iobyxmoadg.iobyxmoadg(this.f54742jztzpxfvev.hkdspvbjdz(iJlmebxxoox, istkbnxepwVarGxszxtbevo.wflxmlrfwp(), deferrableSurface.nufgyqmvbu()), istkbnxepwVarGxszxtbevo.wflxmlrfwp(), deferrableSurface.nufgyqmvbu(), zoijcleaowVar.eablkybsjg().zoijcleaow(), zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.eablkybsjg().wkgbmnqykc(), istkbnxepwVarGxszxtbevo.esjtqupxsv(null)));
                }
            }
        }
        u1.nufgyqmvbu.gxszxtbevo(this.f54746mbcevpiqjq);
        HashMap map = new HashMap();
        map.put(this.f54746mbcevpiqjq.dxjokdxxww(), Collections.singletonList(this.f54746mbcevpiqjq.eablkybsjg()));
        try {
            this.f54742jztzpxfvev.pmvmpeiblj(iJlmebxxoox, arrayList, map, false, false);
            ntlheqmsrt("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e13) {
            ulzqkzuiru("Surface combination with metering repeating  not supported!", e13);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yfnezrywwk() {
        this.f54743kegysxyocb = false;
        this.f54753stevsuqkhv = false;
        ntlheqmsrt("OpenCameraConfigAndClose is done, state: " + this.f54728cqumvgiudr);
        int iOrdinal = this.f54728cqumvgiudr.ordinal();
        if (iOrdinal == 1 || iOrdinal == 4) {
            u1.nufgyqmvbu.nufgyqmvbu(jztzpxfvev());
            crxdokpmqz();
            return;
        }
        if (iOrdinal != 6) {
            ntlheqmsrt("OpenCameraConfigAndClose finished while in state: " + this.f54728cqumvgiudr);
            return;
        }
        if (this.f54760yadqdtsiqt == 0) {
            ezmngbhpjk(false);
            return;
        }
        ntlheqmsrt("OpenCameraConfigAndClose in error: " + vipkmwdibw(this.f54760yadqdtsiqt));
        this.f54764zynmafqrjb.eablkybsjg();
    }

    private void yzdjzghtvl() {
        Iterator it = this.f54763zdlpuopuiu.dxjokdxxww().iterator();
        boolean zJpowsppfya = false;
        while (it.hasNext()) {
            zJpowsppfya |= ((androidx.camera.core.impl.istkbnxepw) it.next()).jpowsppfya(false);
        }
        this.f54750pmvmpeiblj.vipkmwdibw(zJpowsppfya);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zeieaojujs(boolean z13) {
        this.f54756vipkmwdibw = z13;
        if (z13 && this.f54728cqumvgiudr == dxjokdxxww.PENDING_OPEN) {
            fmlbqenlif(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object zfvoamnweg(final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        try {
            this.f54741jyumaefscl.execute(new Runnable() { // from class: kcexrzcfyt.lmojexxdyd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54876zdlpuopuiu.sflfametgt(iobyxmoadgVar);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            iobyxmoadgVar.gxszxtbevo(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    void ageimvtcrz(dxjokdxxww dxjokdxxwwVar, lereixgezr.vdvldrhtss.iobyxmoadg iobyxmoadgVar) {
        fyldjkxazc(dxjokdxxwwVar, iobyxmoadgVar, true);
    }

    @Override // istkbnxepw.iwizpuwonk
    public void btonecajqb(final boolean z13) {
        this.f54741jyumaefscl.execute(new Runnable() { // from class: kcexrzcfyt.zynmafqrjb
            @Override // java.lang.Runnable
            public final void run() {
                this.f55117zdlpuopuiu.zeieaojujs(z13);
            }
        });
    }

    void crxdokpmqz() {
        u1.nufgyqmvbu.nufgyqmvbu(this.f54728cqumvgiudr == dxjokdxxww.RELEASING || this.f54728cqumvgiudr == dxjokdxxww.CLOSING);
        u1.nufgyqmvbu.nufgyqmvbu(this.f54762ylkuphrtab.isEmpty());
        this.f54726cdpycssgdh = null;
        if (this.f54728cqumvgiudr == dxjokdxxww.CLOSING) {
            fiwbwshyhd(dxjokdxxww.INITIALIZED);
            return;
        }
        this.f54761yggfygwlhe.nufgyqmvbu(this.f54732hcddaimhww);
        fiwbwshyhd(dxjokdxxww.RELEASED);
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f54757wwaezpbzkn;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(null);
            this.f54757wwaezpbzkn = null;
        }
    }

    @Override // istkbnxepw.iwizpuwonk
    public void draadjrbmk(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(grlcpdaxtj(arrayList));
        roivzttewh(new ArrayList(arrayList));
        this.f54741jyumaefscl.execute(new Runnable() { // from class: kcexrzcfyt.lereixgezr
            @Override // java.lang.Runnable
            public final void run() {
                this.f54874zdlpuopuiu.ydmasvzmpa(arrayList2);
            }
        });
    }

    @Override // istkbnxepw.iwizpuwonk
    public androidx.camera.core.impl.gxszxtbevo dxjokdxxww() {
        return this.f54729crxdokpmqz;
    }

    @Override // lereixgezr.roivzttewh.zoijcleaow
    public void eablkybsjg(lereixgezr.roivzttewh roivzttewhVar) {
        u1.nufgyqmvbu.gxszxtbevo(roivzttewhVar);
        final String strIkoacuggdj = ikoacuggdj(roivzttewhVar);
        final androidx.camera.core.impl.jyumaefscl jyumaefsclVarIwizpuwonk = this.f54754tzroggbefp ? roivzttewhVar.iwizpuwonk() : roivzttewhVar.yggfygwlhe();
        final androidx.camera.core.impl.istkbnxepw istkbnxepwVarBtonecajqb = roivzttewhVar.btonecajqb();
        final androidx.camera.core.impl.iwizpuwonk iwizpuwonkVarEablkybsjg = roivzttewhVar.eablkybsjg();
        final List listRibwqtqdhb = ribwqtqdhb(roivzttewhVar);
        this.f54741jyumaefscl.execute(new Runnable() { // from class: kcexrzcfyt.pkzmftpjix
            @Override // java.lang.Runnable
            public final void run() {
                this.f54949zdlpuopuiu.opjhrmiecq(strIkoacuggdj, jyumaefsclVarIwizpuwonk, istkbnxepwVarBtonecajqb, iwizpuwonkVarEablkybsjg, listRibwqtqdhb);
            }
        });
    }

    void ezmngbhpjk(boolean z13) {
        ntlheqmsrt("Attempting to open the camera.");
        if (this.f54732hcddaimhww.zoijcleaow() && this.f54727cllcsxoeiz.dxjokdxxww(this)) {
            auzgnhcxok(z13);
        } else {
            ntlheqmsrt("No cameras available. Waiting for available camera before opening camera.");
            fiwbwshyhd(dxjokdxxww.PENDING_OPEN);
        }
    }

    void fiwbwshyhd(dxjokdxxww dxjokdxxwwVar) {
        ageimvtcrz(dxjokdxxwwVar, null);
    }

    void fmlbqenlif(boolean z13) {
        ntlheqmsrt("Attempting to force open the camera.");
        if (this.f54727cllcsxoeiz.dxjokdxxww(this)) {
            auzgnhcxok(z13);
        } else {
            ntlheqmsrt("No cameras available. Waiting for available camera before opening camera.");
            fiwbwshyhd(dxjokdxxww.PENDING_OPEN);
        }
    }

    void fyldjkxazc(dxjokdxxww dxjokdxxwwVar, lereixgezr.vdvldrhtss.iobyxmoadg iobyxmoadgVar, boolean z13) {
        istkbnxepw.iwizpuwonk.iobyxmoadg iobyxmoadgVar2;
        ntlheqmsrt("Transitioning camera internal state: " + this.f54728cqumvgiudr + " --> " + dxjokdxxwwVar);
        mhtqkkgtqm(dxjokdxxwwVar, iobyxmoadgVar);
        this.f54728cqumvgiudr = dxjokdxxwwVar;
        switch (dxjokdxxwwVar) {
            case RELEASED:
                iobyxmoadgVar2 = istkbnxepw.iwizpuwonk.iobyxmoadg.RELEASED;
                break;
            case RELEASING:
                iobyxmoadgVar2 = istkbnxepw.iwizpuwonk.iobyxmoadg.RELEASING;
                break;
            case INITIALIZED:
                iobyxmoadgVar2 = istkbnxepw.iwizpuwonk.iobyxmoadg.CLOSED;
                break;
            case PENDING_OPEN:
                iobyxmoadgVar2 = istkbnxepw.iwizpuwonk.iobyxmoadg.PENDING_OPEN;
                break;
            case CLOSING:
            case REOPENING_QUIRK:
                iobyxmoadgVar2 = istkbnxepw.iwizpuwonk.iobyxmoadg.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                iobyxmoadgVar2 = istkbnxepw.iwizpuwonk.iobyxmoadg.OPENING;
                break;
            case OPENED:
                iobyxmoadgVar2 = istkbnxepw.iwizpuwonk.iobyxmoadg.OPEN;
                break;
            case CONFIGURED:
                iobyxmoadgVar2 = istkbnxepw.iwizpuwonk.iobyxmoadg.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + dxjokdxxwwVar);
        }
        this.f54727cllcsxoeiz.eablkybsjg(this, iobyxmoadgVar2, z13);
        this.f54731esjtqupxsv.lqeggnwhkg(iobyxmoadgVar2);
        this.f54744lereixgezr.ppxfxbqfkf(iobyxmoadgVar2, iobyxmoadgVar);
    }

    @Override // istkbnxepw.iwizpuwonk
    public void gtknphoqwx(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f54750pmvmpeiblj.ylkuphrtab();
        tbqsvytpvh(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(grlcpdaxtj(arrayList));
        try {
            this.f54741jyumaefscl.execute(new Runnable() { // from class: kcexrzcfyt.ylkuphrtab
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55074zdlpuopuiu.rlfsiqarku(arrayList2);
                }
            });
        } catch (RejectedExecutionException e13) {
            ulzqkzuiru("Unable to attach use cases.", e13);
            this.f54750pmvmpeiblj.zdlpuopuiu();
        }
    }

    @Override // istkbnxepw.iwizpuwonk
    public CameraControlInternal gxszxtbevo() {
        return this.f54750pmvmpeiblj;
    }

    com.google.common.util.concurrent.wkgbmnqykc igdgnonuha(iyctptxqzt iyctptxqztVar, boolean z13) {
        iyctptxqztVar.close();
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarEablkybsjg = iyctptxqztVar.eablkybsjg(z13);
        ntlheqmsrt("Releasing session in state " + this.f54728cqumvgiudr.name());
        this.f54762ylkuphrtab.put(iyctptxqztVar, wkgbmnqykcVarEablkybsjg);
        iozdgvuglv.gtknphoqwx.lqeggnwhkg(wkgbmnqykcVarEablkybsjg, new ppxfxbqfkf(iyctptxqztVar), yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        return wkgbmnqykcVarEablkybsjg;
    }

    void ipoelvxyzq(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVar = (androidx.camera.core.impl.dxjokdxxww) it.next();
            androidx.camera.core.impl.dxjokdxxww.iobyxmoadg iobyxmoadgVarGtknphoqwx = androidx.camera.core.impl.dxjokdxxww.iobyxmoadg.gtknphoqwx(dxjokdxxwwVar);
            if (dxjokdxxwwVar.gtknphoqwx() == 5 && dxjokdxxwwVar.wkgbmnqykc() != null) {
                iobyxmoadgVarGtknphoqwx.ojitshcjhn(dxjokdxxwwVar.wkgbmnqykc());
            }
            if (!dxjokdxxwwVar.dxjokdxxww().isEmpty() || !dxjokdxxwwVar.agtfadlqog() || dsvhmnatus(iobyxmoadgVarGtknphoqwx)) {
                arrayList.add(iobyxmoadgVarGtknphoqwx.nufgyqmvbu());
            }
        }
        ntlheqmsrt("Issue capture request");
        this.f54735iozdgvuglv.iobyxmoadg(arrayList);
    }

    void iwxlajgraz() {
        u1.nufgyqmvbu.nufgyqmvbu(this.f54728cqumvgiudr == dxjokdxxww.OPENED);
        androidx.camera.core.impl.jyumaefscl.nufgyqmvbu nufgyqmvbuVarLqeggnwhkg = this.f54763zdlpuopuiu.lqeggnwhkg();
        if (!nufgyqmvbuVarLqeggnwhkg.gxszxtbevo()) {
            ntlheqmsrt("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f54727cllcsxoeiz.btonecajqb(this.f54726cdpycssgdh.getId(), this.f54733hkdspvbjdz.iobyxmoadg(this.f54726cdpycssgdh.getId()))) {
            ntlheqmsrt("Unable to create capture session in camera operating mode = " + this.f54733hkdspvbjdz.ppxfxbqfkf());
            return;
        }
        HashMap map = new HashMap();
        b.wflxmlrfwp(this.f54763zdlpuopuiu.nufgyqmvbu(), this.f54763zdlpuopuiu.dxjokdxxww(), map);
        this.f54735iozdgvuglv.dxjokdxxww(map);
        iyctptxqzt iyctptxqztVar = this.f54735iozdgvuglv;
        iozdgvuglv.gtknphoqwx.lqeggnwhkg(iyctptxqztVar.zoijcleaow(nufgyqmvbuVarLqeggnwhkg.ppxfxbqfkf(), (CameraDevice) u1.nufgyqmvbu.gxszxtbevo(this.f54726cdpycssgdh), this.f54755ulzqkzuiru.iobyxmoadg()), new wkgbmnqykc(iyctptxqztVar), this.f54741jyumaefscl);
    }

    boolean jztzpxfvev() {
        return this.f54762ylkuphrtab.isEmpty();
    }

    @Override // lereixgezr.roivzttewh.zoijcleaow
    public void lqeggnwhkg(lereixgezr.roivzttewh roivzttewhVar) {
        u1.nufgyqmvbu.gxszxtbevo(roivzttewhVar);
        final String strIkoacuggdj = ikoacuggdj(roivzttewhVar);
        final androidx.camera.core.impl.jyumaefscl jyumaefsclVarIwizpuwonk = this.f54754tzroggbefp ? roivzttewhVar.iwizpuwonk() : roivzttewhVar.yggfygwlhe();
        final androidx.camera.core.impl.istkbnxepw istkbnxepwVarBtonecajqb = roivzttewhVar.btonecajqb();
        final androidx.camera.core.impl.iwizpuwonk iwizpuwonkVarEablkybsjg = roivzttewhVar.eablkybsjg();
        final List listRibwqtqdhb = ribwqtqdhb(roivzttewhVar);
        this.f54741jyumaefscl.execute(new Runnable() { // from class: kcexrzcfyt.cqumvgiudr
            @Override // java.lang.Runnable
            public final void run() {
                this.f54622zdlpuopuiu.oipsdeybqn(strIkoacuggdj, jyumaefsclVarIwizpuwonk, istkbnxepwVarBtonecajqb, iwizpuwonkVarEablkybsjg, listRibwqtqdhb);
            }
        });
    }

    void mhtqkkgtqm(dxjokdxxww dxjokdxxwwVar, lereixgezr.vdvldrhtss.iobyxmoadg iobyxmoadgVar) {
        if (y5.iobyxmoadg.nufgyqmvbu()) {
            y5.iobyxmoadg.btonecajqb("CX:C2State[" + this + "]", dxjokdxxwwVar.ordinal());
            if (iobyxmoadgVar != null) {
                this.f54749pkzmftpjix++;
            }
            if (this.f54749pkzmftpjix > 0) {
                y5.iobyxmoadg.btonecajqb("CX:C2StateErrorCode[" + this + "]", iobyxmoadgVar != null ? iobyxmoadgVar.wkgbmnqykc() : 0);
            }
        }
    }

    void ntlheqmsrt(String str) {
        ulzqkzuiru(str, null);
    }

    @Override // istkbnxepw.iwizpuwonk
    public void ojitshcjhn(androidx.camera.core.impl.gxszxtbevo gxszxtbevoVar) {
        if (gxszxtbevoVar == null) {
            gxszxtbevoVar = istkbnxepw.kcexrzcfyt.iobyxmoadg();
        }
        istkbnxepw.yfnezrywwk yfnezrywwkVarZdlpuopuiu = gxszxtbevoVar.zdlpuopuiu(null);
        this.f54729crxdokpmqz = gxszxtbevoVar;
        synchronized (this.f54739jlmebxxoox) {
            this.f54751ribwqtqdhb = yfnezrywwkVarZdlpuopuiu;
        }
    }

    boolean okpsazkaxt() {
        try {
            return ((Boolean) androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: kcexrzcfyt.cdpycssgdh
                @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
                public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                    return this.f54615iobyxmoadg.zfvoamnweg(iobyxmoadgVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e13) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e13);
        }
    }

    @Override // istkbnxepw.iwizpuwonk
    public void oxmwwwfdhm(boolean z13) {
        this.f54754tzroggbefp = z13;
    }

    @Override // lereixgezr.roivzttewh.zoijcleaow
    public void ppxfxbqfkf(lereixgezr.roivzttewh roivzttewhVar) {
        u1.nufgyqmvbu.gxszxtbevo(roivzttewhVar);
        hszhottldk(ikoacuggdj(roivzttewhVar), this.f54754tzroggbefp ? roivzttewhVar.iwizpuwonk() : roivzttewhVar.yggfygwlhe(), roivzttewhVar.btonecajqb(), roivzttewhVar.eablkybsjg(), ribwqtqdhb(roivzttewhVar));
    }

    @Override // istkbnxepw.iwizpuwonk
    public istkbnxepw.sopmlzcsov rgvfuqvkyq() {
        return this.f54731esjtqupxsv;
    }

    void rhgxfdycjh() {
        androidx.camera.core.impl.jyumaefscl.nufgyqmvbu nufgyqmvbuVarEablkybsjg = this.f54763zdlpuopuiu.eablkybsjg();
        if (!nufgyqmvbuVarEablkybsjg.gxszxtbevo()) {
            this.f54750pmvmpeiblj.sopmlzcsov();
            this.f54735iozdgvuglv.nufgyqmvbu(this.f54750pmvmpeiblj.lereixgezr());
            return;
        }
        this.f54750pmvmpeiblj.ribwqtqdhb(nufgyqmvbuVarEablkybsjg.ppxfxbqfkf().rgvfuqvkyq());
        nufgyqmvbuVarEablkybsjg.zoijcleaow(this.f54750pmvmpeiblj.lereixgezr());
        this.f54735iozdgvuglv.nufgyqmvbu(nufgyqmvbuVarEablkybsjg.ppxfxbqfkf());
    }

    void skhdrjzrfn(final androidx.camera.core.impl.jyumaefscl jyumaefsclVar) {
        ScheduledExecutorService scheduledExecutorServiceWkgbmnqykc = yadqdtsiqt.iobyxmoadg.wkgbmnqykc();
        final androidx.camera.core.impl.jyumaefscl.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = jyumaefsclVar.wkgbmnqykc();
        if (wkgbmnqykcVarWkgbmnqykc != null) {
            ulzqkzuiru("Posting surface closed", new Throwable());
            scheduledExecutorServiceWkgbmnqykc.execute(new Runnable() { // from class: kcexrzcfyt.esjtqupxsv
                @Override // java.lang.Runnable
                public final void run() {
                    jpowsppfya.weqkydbzbr(wkgbmnqykcVarWkgbmnqykc, jyumaefsclVar);
                }
            });
        }
    }

    androidx.camera.core.impl.jyumaefscl sopmlzcsov(DeferrableSurface deferrableSurface) {
        for (androidx.camera.core.impl.jyumaefscl jyumaefsclVar : this.f54763zdlpuopuiu.nufgyqmvbu()) {
            if (jyumaefsclVar.ojitshcjhn().contains(deferrableSurface)) {
                return jyumaefsclVar;
            }
        }
        return null;
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f54736istkbnxepw.zoijcleaow());
    }

    @Override // istkbnxepw.iwizpuwonk
    public istkbnxepw.jyumaefscl wflxmlrfwp() {
        return this.f54736istkbnxepw;
    }

    void wizcaqwiak(boolean z13) {
        u1.nufgyqmvbu.nufgyqmvbu(this.f54735iozdgvuglv != null);
        ntlheqmsrt("Resetting Capture Session");
        iyctptxqzt iyctptxqztVar = this.f54735iozdgvuglv;
        androidx.camera.core.impl.jyumaefscl jyumaefsclVarLqeggnwhkg = iyctptxqztVar.lqeggnwhkg();
        List listGxszxtbevo = iyctptxqztVar.gxszxtbevo();
        iyctptxqzt iyctptxqztVarNuxfzjnpeb = nuxfzjnpeb();
        this.f54735iozdgvuglv = iyctptxqztVarNuxfzjnpeb;
        iyctptxqztVarNuxfzjnpeb.nufgyqmvbu(jyumaefsclVarLqeggnwhkg);
        this.f54735iozdgvuglv.iobyxmoadg(listGxszxtbevo);
        if (this.f54728cqumvgiudr.ordinal() != 8) {
            ntlheqmsrt("Skipping Capture Session state check due to current camera state: " + this.f54728cqumvgiudr + " and previous session status: " + iyctptxqztVar.ppxfxbqfkf());
        } else if (this.f54730dsvhmnatus && iyctptxqztVar.ppxfxbqfkf()) {
            ntlheqmsrt("Close camera before creating new session");
            fiwbwshyhd(dxjokdxxww.REOPENING_QUIRK);
        }
        if (this.f54758wypolnanlu && iyctptxqztVar.ppxfxbqfkf()) {
            ntlheqmsrt("ConfigAndClose is required when close the camera.");
            this.f54753stevsuqkhv = true;
        }
        igdgnonuha(iyctptxqztVar, z13);
    }

    @Override // lereixgezr.roivzttewh.zoijcleaow
    public void wkgbmnqykc(lereixgezr.roivzttewh roivzttewhVar) {
        u1.nufgyqmvbu.gxszxtbevo(roivzttewhVar);
        final String strIkoacuggdj = ikoacuggdj(roivzttewhVar);
        this.f54741jyumaefscl.execute(new Runnable() { // from class: kcexrzcfyt.hcddaimhww
            @Override // java.lang.Runnable
            public final void run() {
                this.f54697zdlpuopuiu.bfopjjpdmp(strIkoacuggdj);
            }
        });
    }

    void wypolnanlu(boolean z13) {
        u1.nufgyqmvbu.dxjokdxxww(this.f54728cqumvgiudr == dxjokdxxww.CLOSING || this.f54728cqumvgiudr == dxjokdxxww.RELEASING || (this.f54728cqumvgiudr == dxjokdxxww.REOPENING && this.f54760yadqdtsiqt != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f54728cqumvgiudr + " (error: " + vipkmwdibw(this.f54760yadqdtsiqt) + ")");
        wizcaqwiak(z13);
        this.f54735iozdgvuglv.wkgbmnqykc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    class nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private iobyxmoadg f54794iobyxmoadg;

        /* JADX INFO: Access modifiers changed from: private */
        class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final ScheduledFuture f54796iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final AtomicBoolean f54798zoijcleaow = new AtomicBoolean(false);

            iobyxmoadg() {
                this.f54796iobyxmoadg = jpowsppfya.this.f54737iwizpuwonk.schedule(new Runnable() { // from class: kcexrzcfyt.dsvhmnatus
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f54663zdlpuopuiu.wkgbmnqykc();
                    }
                }, MockConstants.TWO_SECONDS_DELAY, TimeUnit.MILLISECONDS);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void eablkybsjg() {
                if (jpowsppfya.this.f54728cqumvgiudr == dxjokdxxww.OPENING) {
                    jpowsppfya.this.ntlheqmsrt("Camera onError timeout, reopen it.");
                    jpowsppfya.this.fiwbwshyhd(dxjokdxxww.REOPENING);
                    jpowsppfya.this.f54764zynmafqrjb.eablkybsjg();
                } else {
                    jpowsppfya.this.ntlheqmsrt("Camera skip reopen at state: " + jpowsppfya.this.f54728cqumvgiudr);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void wkgbmnqykc() {
                if (this.f54798zoijcleaow.getAndSet(true)) {
                    return;
                }
                jpowsppfya.this.f54741jyumaefscl.execute(new Runnable() { // from class: kcexrzcfyt.cllcsxoeiz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f54616zdlpuopuiu.eablkybsjg();
                    }
                });
            }

            public boolean gxszxtbevo() {
                return this.f54798zoijcleaow.get();
            }

            public void ppxfxbqfkf() {
                this.f54798zoijcleaow.set(true);
                this.f54796iobyxmoadg.cancel(true);
            }
        }

        private nufgyqmvbu() {
            this.f54794iobyxmoadg = null;
        }

        public void iobyxmoadg() {
            iobyxmoadg iobyxmoadgVar = this.f54794iobyxmoadg;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.ppxfxbqfkf();
            }
            this.f54794iobyxmoadg = null;
        }

        public boolean ppxfxbqfkf() {
            iobyxmoadg iobyxmoadgVar = this.f54794iobyxmoadg;
            return (iobyxmoadgVar == null || iobyxmoadgVar.gxszxtbevo()) ? false : true;
        }

        public void wkgbmnqykc() {
            if (jpowsppfya.this.f54728cqumvgiudr != dxjokdxxww.OPENING) {
                jpowsppfya.this.ntlheqmsrt("Don't need the onError timeout handler.");
                return;
            }
            jpowsppfya.this.ntlheqmsrt("Camera waiting for onError.");
            iobyxmoadg();
            this.f54794iobyxmoadg = new iobyxmoadg();
        }

        public void zoijcleaow() {
            jpowsppfya.this.ntlheqmsrt("Camera receive onErrorCallback");
            iobyxmoadg();
        }

        /* synthetic */ nufgyqmvbu(jpowsppfya jpowsppfyaVar, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }
}
