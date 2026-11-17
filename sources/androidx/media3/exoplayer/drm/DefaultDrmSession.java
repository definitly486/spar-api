package androidx.media3.exoplayer.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import g3.h0;
import i3.zdlpuopuiu;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final Looper f10372agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.zoijcleaow f10373btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private wflxmlrfwp.iobyxmoadg f10374cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final rgvfuqvkyq f10375draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final y2.agtfadlqog f10376dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f10377eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private wflxmlrfwp.wkgbmnqykc f10378esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final h0 f10379gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f10380gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final List f10381iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private byte[] f10382iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private byte[] f10383jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private ppxfxbqfkf f10384kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f10385lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final HashMap f10386nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final eablkybsjg f10387ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private HandlerThread f10388oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f10389ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f10390rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f10391vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final UUID f10392wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow f10393wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private DrmSession.DrmSessionException f10394yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private e3.zoijcleaow f10395zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wflxmlrfwp f10396zoijcleaow;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th2) {
            super(th2);
        }
    }

    private class eablkybsjg extends Handler {
        public eablkybsjg(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i13 = message.what;
            if (i13 == 1) {
                DefaultDrmSession.this.iozdgvuglv(obj, obj2);
            } else {
                if (i13 != 2) {
                    return;
                }
                DefaultDrmSession.this.lereixgezr(obj, obj2);
            }
        }
    }

    public interface iobyxmoadg {
        void iobyxmoadg(Exception exc, boolean z13);

        void ppxfxbqfkf(DefaultDrmSession defaultDrmSession);

        void zoijcleaow();
    }

    private class ppxfxbqfkf extends Handler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f10398iobyxmoadg;

        public ppxfxbqfkf(Looper looper) {
            super(looper);
        }

        private boolean iobyxmoadg(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) message.obj;
            if (!wkgbmnqykcVar.f10404zoijcleaow) {
                return false;
            }
            int i13 = wkgbmnqykcVar.f10400eablkybsjg + 1;
            wkgbmnqykcVar.f10400eablkybsjg = i13;
            if (i13 > DefaultDrmSession.this.f10373btonecajqb.zoijcleaow(3)) {
                return false;
            }
            long jIobyxmoadg = DefaultDrmSession.this.f10373btonecajqb.iobyxmoadg(new androidx.media3.exoplayer.upstream.zoijcleaow.iobyxmoadg(new m3.dxjokdxxww(wkgbmnqykcVar.f10401iobyxmoadg, mediaDrmCallbackException.f10451zdlpuopuiu, mediaDrmCallbackException.f10450yggfygwlhe, mediaDrmCallbackException.f10449jyumaefscl, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - wkgbmnqykcVar.f10402ppxfxbqfkf, mediaDrmCallbackException.f10448iwizpuwonk), new m3.btonecajqb(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), wkgbmnqykcVar.f10400eablkybsjg));
            if (jIobyxmoadg == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f10398iobyxmoadg) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jIobyxmoadg);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objZoijcleaow;
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) message.obj;
            try {
                int i13 = message.what;
                if (i13 == 1) {
                    objZoijcleaow = DefaultDrmSession.this.f10375draadjrbmk.zoijcleaow(DefaultDrmSession.this.f10392wflxmlrfwp, (wflxmlrfwp.wkgbmnqykc) wkgbmnqykcVar.f10403wkgbmnqykc);
                } else {
                    if (i13 != 2) {
                        throw new RuntimeException();
                    }
                    objZoijcleaow = DefaultDrmSession.this.f10375draadjrbmk.iobyxmoadg(DefaultDrmSession.this.f10392wflxmlrfwp, (wflxmlrfwp.iobyxmoadg) wkgbmnqykcVar.f10403wkgbmnqykc);
                }
            } catch (MediaDrmCallbackException e13) {
                boolean zIobyxmoadg = iobyxmoadg(message, e13);
                objZoijcleaow = e13;
                if (zIobyxmoadg) {
                    return;
                }
            } catch (Exception e14) {
                kcexrzcfyt.dxjokdxxww("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e14);
                objZoijcleaow = e14;
            }
            DefaultDrmSession.this.f10373btonecajqb.ppxfxbqfkf(wkgbmnqykcVar.f10401iobyxmoadg);
            synchronized (this) {
                try {
                    if (!this.f10398iobyxmoadg) {
                        DefaultDrmSession.this.f10387ojitshcjhn.obtainMessage(message.what, Pair.create(wkgbmnqykcVar.f10403wkgbmnqykc, objZoijcleaow)).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public synchronized void ppxfxbqfkf() {
            removeCallbacksAndMessages(null);
            this.f10398iobyxmoadg = true;
        }

        void zoijcleaow(int i13, Object obj, boolean z13) {
            obtainMessage(i13, new wkgbmnqykc(m3.dxjokdxxww.iobyxmoadg(), z13, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }
    }

    private static final class wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public int f10400eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final long f10401iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final long f10402ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final Object f10403wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final boolean f10404zoijcleaow;

        public wkgbmnqykc(long j13, boolean z13, long j14, Object obj) {
            this.f10401iobyxmoadg = j13;
            this.f10404zoijcleaow = z13;
            this.f10402ppxfxbqfkf = j14;
            this.f10403wkgbmnqykc = obj;
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg(DefaultDrmSession defaultDrmSession, int i13);

        void zoijcleaow(DefaultDrmSession defaultDrmSession, int i13);
    }

    public DefaultDrmSession(UUID uuid, wflxmlrfwp wflxmlrfwpVar, iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar, List list, int i13, boolean z13, boolean z14, byte[] bArr, HashMap map, rgvfuqvkyq rgvfuqvkyqVar, Looper looper, androidx.media3.exoplayer.upstream.zoijcleaow zoijcleaowVar2, h0 h0Var) {
        if (i13 == 1 || i13 == 3) {
            y2.iobyxmoadg.eablkybsjg(bArr);
        }
        this.f10392wflxmlrfwp = uuid;
        this.f10389ppxfxbqfkf = iobyxmoadgVar;
        this.f10393wkgbmnqykc = zoijcleaowVar;
        this.f10396zoijcleaow = wflxmlrfwpVar;
        this.f10377eablkybsjg = i13;
        this.f10380gxszxtbevo = z13;
        this.f10385lqeggnwhkg = z14;
        if (bArr != null) {
            this.f10382iwizpuwonk = bArr;
            this.f10381iobyxmoadg = null;
        } else {
            this.f10381iobyxmoadg = Collections.unmodifiableList((List) y2.iobyxmoadg.eablkybsjg(list));
        }
        this.f10386nufgyqmvbu = map;
        this.f10375draadjrbmk = rgvfuqvkyqVar;
        this.f10376dxjokdxxww = new y2.agtfadlqog();
        this.f10373btonecajqb = zoijcleaowVar2;
        this.f10379gtknphoqwx = h0Var;
        this.f10390rgvfuqvkyq = 2;
        this.f10372agtfadlqog = looper;
        this.f10387ojitshcjhn = new eablkybsjg(looper);
    }

    private void esjtqupxsv(final Throwable th2, int i13) {
        this.f10394yggfygwlhe = new DrmSession.DrmSessionException(th2, btonecajqb.zoijcleaow(th2, i13));
        kcexrzcfyt.wkgbmnqykc("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            oxmwwwfdhm(new y2.wflxmlrfwp() { // from class: androidx.media3.exoplayer.drm.ppxfxbqfkf
                @Override // y2.wflxmlrfwp
                public final void accept(Object obj) {
                    DefaultDrmSession.iwizpuwonk(th2, (nufgyqmvbu.iobyxmoadg) obj);
                }
            });
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!btonecajqb.eablkybsjg(th2) && !btonecajqb.wkgbmnqykc(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.f10390rgvfuqvkyq != 4) {
            this.f10390rgvfuqvkyq = 1;
        }
    }

    private void hcddaimhww() {
        if (Thread.currentThread() != this.f10372agtfadlqog.getThread()) {
            kcexrzcfyt.dxjokdxxww("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f10372agtfadlqog.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iozdgvuglv(Object obj, Object obj2) {
        if (obj == this.f10378esjtqupxsv) {
            if (this.f10390rgvfuqvkyq == 2 || jyumaefscl()) {
                this.f10378esjtqupxsv = null;
                if (obj2 instanceof Exception) {
                    this.f10389ppxfxbqfkf.iobyxmoadg((Exception) obj2, false);
                    return;
                }
                try {
                    this.f10396zoijcleaow.gxszxtbevo((byte[]) obj2);
                    this.f10389ppxfxbqfkf.zoijcleaow();
                } catch (Exception e13) {
                    this.f10389ppxfxbqfkf.iobyxmoadg(e13, true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void iwizpuwonk(Throwable th2, nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.draadjrbmk((Exception) th2);
    }

    private boolean jyumaefscl() {
        int i13 = this.f10390rgvfuqvkyq;
        return i13 == 3 || i13 == 4;
    }

    private void kcexrzcfyt(boolean z13) {
        if (this.f10385lqeggnwhkg) {
            return;
        }
        byte[] bArr = (byte[]) stevsuqkhv.nufgyqmvbu(this.f10383jyumaefscl);
        int i13 = this.f10377eablkybsjg;
        if (i13 != 0 && i13 != 1) {
            if (i13 == 2) {
                if (this.f10382iwizpuwonk == null || pkzmftpjix()) {
                    wwaezpbzkn(bArr, 2, z13);
                    return;
                }
                return;
            }
            if (i13 != 3) {
                return;
            }
            y2.iobyxmoadg.eablkybsjg(this.f10382iwizpuwonk);
            y2.iobyxmoadg.eablkybsjg(this.f10383jyumaefscl);
            wwaezpbzkn(this.f10382iwizpuwonk, 3, z13);
            return;
        }
        if (this.f10382iwizpuwonk == null) {
            wwaezpbzkn(bArr, 1, z13);
            return;
        }
        if (this.f10390rgvfuqvkyq == 4 || pkzmftpjix()) {
            long jZdlpuopuiu = zdlpuopuiu();
            if (this.f10377eablkybsjg != 0 || jZdlpuopuiu > 60) {
                if (jZdlpuopuiu <= 0) {
                    esjtqupxsv(new KeysExpiredException(), 2);
                    return;
                } else {
                    this.f10390rgvfuqvkyq = 4;
                    oxmwwwfdhm(new y2.wflxmlrfwp() { // from class: i3.ppxfxbqfkf
                        @Override // y2.wflxmlrfwp
                        public final void accept(Object obj) {
                            ((androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg) obj).btonecajqb();
                        }
                    });
                    return;
                }
            }
            kcexrzcfyt.zoijcleaow("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jZdlpuopuiu);
            wwaezpbzkn(bArr, 2, z13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lereixgezr(Object obj, Object obj2) {
        if (obj == this.f10374cqumvgiudr && jyumaefscl()) {
            this.f10374cqumvgiudr = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                pmvmpeiblj((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f10377eablkybsjg == 3) {
                    this.f10396zoijcleaow.gtknphoqwx((byte[]) stevsuqkhv.nufgyqmvbu(this.f10382iwizpuwonk), bArr);
                    oxmwwwfdhm(new y2.wflxmlrfwp() { // from class: i3.iobyxmoadg
                        @Override // y2.wflxmlrfwp
                        public final void accept(Object obj3) {
                            ((androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg) obj3).dxjokdxxww();
                        }
                    });
                    return;
                }
                byte[] bArrGtknphoqwx = this.f10396zoijcleaow.gtknphoqwx(this.f10383jyumaefscl, bArr);
                int i13 = this.f10377eablkybsjg;
                if ((i13 == 2 || (i13 == 0 && this.f10382iwizpuwonk != null)) && bArrGtknphoqwx != null && bArrGtknphoqwx.length != 0) {
                    this.f10382iwizpuwonk = bArrGtknphoqwx;
                }
                this.f10390rgvfuqvkyq = 4;
                oxmwwwfdhm(new y2.wflxmlrfwp() { // from class: i3.zoijcleaow
                    @Override // y2.wflxmlrfwp
                    public final void accept(Object obj3) {
                        ((androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg) obj3).nufgyqmvbu();
                    }
                });
            } catch (Exception e13) {
                e = e13;
                pmvmpeiblj(e, true);
            } catch (NoSuchMethodError e14) {
                e = e14;
                pmvmpeiblj(e, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    private boolean lmojexxdyd() {
        if (jyumaefscl()) {
            return true;
        }
        try {
            byte[] bArrWkgbmnqykc = this.f10396zoijcleaow.wkgbmnqykc();
            this.f10383jyumaefscl = bArrWkgbmnqykc;
            this.f10396zoijcleaow.zoijcleaow(bArrWkgbmnqykc, this.f10379gtknphoqwx);
            this.f10395zdlpuopuiu = this.f10396zoijcleaow.nufgyqmvbu(this.f10383jyumaefscl);
            final int i13 = 3;
            this.f10390rgvfuqvkyq = 3;
            oxmwwwfdhm(new y2.wflxmlrfwp() { // from class: androidx.media3.exoplayer.drm.zoijcleaow
                @Override // y2.wflxmlrfwp
                public final void accept(Object obj) {
                    ((nufgyqmvbu.iobyxmoadg) obj).gtknphoqwx(i13);
                }
            });
            y2.iobyxmoadg.eablkybsjg(this.f10383jyumaefscl);
            return true;
        } catch (NotProvisionedException unused) {
            this.f10389ppxfxbqfkf.ppxfxbqfkf(this);
            return false;
        } catch (Exception e13) {
            e = e13;
            if (btonecajqb.wkgbmnqykc(e)) {
                this.f10389ppxfxbqfkf.ppxfxbqfkf(this);
                return false;
            }
            esjtqupxsv(e, 1);
            return false;
        } catch (NoSuchMethodError e14) {
            e = e14;
            if (btonecajqb.wkgbmnqykc(e)) {
                this.f10389ppxfxbqfkf.ppxfxbqfkf(this);
                return false;
            }
            esjtqupxsv(e, 1);
            return false;
        }
    }

    private void oxmwwwfdhm(y2.wflxmlrfwp wflxmlrfwpVar) {
        Iterator it = this.f10376dxjokdxxww.i().iterator();
        while (it.hasNext()) {
            wflxmlrfwpVar.accept((nufgyqmvbu.iobyxmoadg) it.next());
        }
    }

    private boolean pkzmftpjix() {
        try {
            this.f10396zoijcleaow.eablkybsjg(this.f10383jyumaefscl, this.f10382iwizpuwonk);
            return true;
        } catch (Exception | NoSuchMethodError e13) {
            esjtqupxsv(e13, 1);
            return false;
        }
    }

    private void pmvmpeiblj(Throwable th2, boolean z13) {
        if ((th2 instanceof NotProvisionedException) || btonecajqb.wkgbmnqykc(th2)) {
            this.f10389ppxfxbqfkf.ppxfxbqfkf(this);
        } else {
            esjtqupxsv(th2, z13 ? 1 : 2);
        }
    }

    private void wwaezpbzkn(byte[] bArr, int i13, boolean z13) {
        try {
            this.f10374cqumvgiudr = this.f10396zoijcleaow.wflxmlrfwp(bArr, this.f10381iobyxmoadg, i13, this.f10386nufgyqmvbu);
            ((ppxfxbqfkf) stevsuqkhv.nufgyqmvbu(this.f10384kcexrzcfyt)).zoijcleaow(2, y2.iobyxmoadg.eablkybsjg(this.f10374cqumvgiudr), z13);
        } catch (Exception | NoSuchMethodError e13) {
            pmvmpeiblj(e13, true);
        }
    }

    private long zdlpuopuiu() {
        if (!v2.nufgyqmvbu.f115647wkgbmnqykc.equals(this.f10392wflxmlrfwp)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) y2.iobyxmoadg.eablkybsjg(zdlpuopuiu.zoijcleaow(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private void zynmafqrjb() {
        if (this.f10377eablkybsjg == 0 && this.f10390rgvfuqvkyq == 4) {
            stevsuqkhv.nufgyqmvbu(this.f10383jyumaefscl);
            kcexrzcfyt(false);
        }
    }

    void cdpycssgdh() {
        if (lmojexxdyd()) {
            kcexrzcfyt(true);
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean dxjokdxxww(String str) {
        hcddaimhww();
        return this.f10396zoijcleaow.dxjokdxxww((byte[]) y2.iobyxmoadg.dxjokdxxww(this.f10383jyumaefscl), str);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final e3.zoijcleaow eablkybsjg() {
        hcddaimhww();
        return this.f10395zdlpuopuiu;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        hcddaimhww();
        return this.f10390rgvfuqvkyq;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void gxszxtbevo(nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
        hcddaimhww();
        if (this.f10391vdvldrhtss < 0) {
            kcexrzcfyt.ppxfxbqfkf("DefaultDrmSession", "Session reference count less than zero: " + this.f10391vdvldrhtss);
            this.f10391vdvldrhtss = 0;
        }
        if (iobyxmoadgVar != null) {
            this.f10376dxjokdxxww.iobyxmoadg(iobyxmoadgVar);
        }
        int i13 = this.f10391vdvldrhtss + 1;
        this.f10391vdvldrhtss = i13;
        if (i13 == 1) {
            y2.iobyxmoadg.lqeggnwhkg(this.f10390rgvfuqvkyq == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f10388oxmwwwfdhm = handlerThread;
            handlerThread.start();
            this.f10384kcexrzcfyt = new ppxfxbqfkf(this.f10388oxmwwwfdhm.getLooper());
            if (lmojexxdyd()) {
                kcexrzcfyt(true);
            }
        } else if (iobyxmoadgVar != null && jyumaefscl() && this.f10376dxjokdxxww.zoijcleaow(iobyxmoadgVar) == 1) {
            iobyxmoadgVar.gtknphoqwx(this.f10390rgvfuqvkyq);
        }
        this.f10393wkgbmnqykc.iobyxmoadg(this, this.f10391vdvldrhtss);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID iobyxmoadg() {
        hcddaimhww();
        return this.f10392wflxmlrfwp;
    }

    void istkbnxepw(int i13) {
        if (i13 != 2) {
            return;
        }
        zynmafqrjb();
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public Map lqeggnwhkg() {
        hcddaimhww();
        byte[] bArr = this.f10383jyumaefscl;
        if (bArr == null) {
            return null;
        }
        return this.f10396zoijcleaow.iobyxmoadg(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void nufgyqmvbu(nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
        hcddaimhww();
        int i13 = this.f10391vdvldrhtss;
        if (i13 <= 0) {
            kcexrzcfyt.ppxfxbqfkf("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i14 = i13 - 1;
        this.f10391vdvldrhtss = i14;
        if (i14 == 0) {
            this.f10390rgvfuqvkyq = 0;
            ((eablkybsjg) stevsuqkhv.nufgyqmvbu(this.f10387ojitshcjhn)).removeCallbacksAndMessages(null);
            ((ppxfxbqfkf) stevsuqkhv.nufgyqmvbu(this.f10384kcexrzcfyt)).ppxfxbqfkf();
            this.f10384kcexrzcfyt = null;
            ((HandlerThread) stevsuqkhv.nufgyqmvbu(this.f10388oxmwwwfdhm)).quit();
            this.f10388oxmwwwfdhm = null;
            this.f10395zdlpuopuiu = null;
            this.f10394yggfygwlhe = null;
            this.f10374cqumvgiudr = null;
            this.f10378esjtqupxsv = null;
            byte[] bArr = this.f10383jyumaefscl;
            if (bArr != null) {
                this.f10396zoijcleaow.btonecajqb(bArr);
                this.f10383jyumaefscl = null;
            }
        }
        if (iobyxmoadgVar != null) {
            this.f10376dxjokdxxww.ppxfxbqfkf(iobyxmoadgVar);
            if (this.f10376dxjokdxxww.zoijcleaow(iobyxmoadgVar) == 0) {
                iobyxmoadgVar.wflxmlrfwp();
            }
        }
        this.f10393wkgbmnqykc.zoijcleaow(this, this.f10391vdvldrhtss);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException wkgbmnqykc() {
        hcddaimhww();
        if (this.f10390rgvfuqvkyq == 1) {
            return this.f10394yggfygwlhe;
        }
        return null;
    }

    void yadqdtsiqt(Exception exc, boolean z13) {
        esjtqupxsv(exc, z13 ? 1 : 3);
    }

    public boolean yggfygwlhe(byte[] bArr) {
        hcddaimhww();
        return Arrays.equals(this.f10383jyumaefscl, bArr);
    }

    void ylkuphrtab() {
        this.f10378esjtqupxsv = this.f10396zoijcleaow.ppxfxbqfkf();
        ((ppxfxbqfkf) stevsuqkhv.nufgyqmvbu(this.f10384kcexrzcfyt)).zoijcleaow(1, y2.iobyxmoadg.eablkybsjg(this.f10378esjtqupxsv), true);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean zoijcleaow() {
        hcddaimhww();
        return this.f10380gxszxtbevo;
    }
}
