package androidx.media3.exoplayer.drm;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.DrmInitData;
import com.google.common.collect.jyumaefscl;
import com.google.common.collect.kegysxyocb;
import com.google.common.collect.ulzqkzuiru;
import com.google.common.collect.zdlpuopuiu;
import g3.h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import v2.iwizpuwonk;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class DefaultDrmSessionManager implements dxjokdxxww {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final Set f10405agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.zoijcleaow f10406btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private h0 f10407cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final long f10408draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final gxszxtbevo f10409dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final HashMap f10410eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    volatile wkgbmnqykc f10411esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lqeggnwhkg f10412gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f10413gxszxtbevo;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private byte[] f10414iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f10415jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private DefaultDrmSession f10416kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int[] f10417lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f10418nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final Set f10419ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private DefaultDrmSession f10420oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wflxmlrfwp.ppxfxbqfkf f10421ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f10422rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private wflxmlrfwp f10423vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final List f10424wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final rgvfuqvkyq f10425wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Handler f10426yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Looper f10427zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final UUID f10428zoijcleaow;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class eablkybsjg implements dxjokdxxww.zoijcleaow {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private DrmSession f10430ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f10431wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final nufgyqmvbu.iobyxmoadg f10432zoijcleaow;

        public eablkybsjg(nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
            this.f10432zoijcleaow = iobyxmoadgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void gxszxtbevo(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            if (DefaultDrmSessionManager.this.f10422rgvfuqvkyq == 0 || this.f10431wkgbmnqykc) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            this.f10430ppxfxbqfkf = defaultDrmSessionManager.zdlpuopuiu((Looper) y2.iobyxmoadg.eablkybsjg(defaultDrmSessionManager.f10427zdlpuopuiu), this.f10432zoijcleaow, iobyxmoadgVar, false);
            DefaultDrmSessionManager.this.f10405agtfadlqog.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lqeggnwhkg() {
            if (this.f10431wkgbmnqykc) {
                return;
            }
            DrmSession drmSession = this.f10430ppxfxbqfkf;
            if (drmSession != null) {
                drmSession.nufgyqmvbu(this.f10432zoijcleaow);
            }
            DefaultDrmSessionManager.this.f10405agtfadlqog.remove(this);
            this.f10431wkgbmnqykc = true;
        }

        public void eablkybsjg(final androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            ((Handler) y2.iobyxmoadg.eablkybsjg(DefaultDrmSessionManager.this.f10426yggfygwlhe)).post(new Runnable() { // from class: androidx.media3.exoplayer.drm.wkgbmnqykc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10484zdlpuopuiu.gxszxtbevo(iobyxmoadgVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.drm.dxjokdxxww.zoijcleaow
        public void release() {
            stevsuqkhv.krqnebusok((Handler) y2.iobyxmoadg.eablkybsjg(DefaultDrmSessionManager.this.f10426yggfygwlhe), new Runnable() { // from class: androidx.media3.exoplayer.drm.eablkybsjg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10460zdlpuopuiu.lqeggnwhkg();
                }
            });
        }
    }

    private class gxszxtbevo implements DefaultDrmSession.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Set f10433iobyxmoadg = new HashSet();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private DefaultDrmSession f10435zoijcleaow;

        public gxszxtbevo() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.iobyxmoadg
        public void iobyxmoadg(Exception exc, boolean z13) {
            this.f10435zoijcleaow = null;
            zdlpuopuiu zdlpuopuiuVarJyumaefscl = zdlpuopuiu.jyumaefscl(this.f10433iobyxmoadg);
            this.f10433iobyxmoadg.clear();
            ulzqkzuiru it = zdlpuopuiuVarJyumaefscl.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).yadqdtsiqt(exc, z13);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.iobyxmoadg
        public void ppxfxbqfkf(DefaultDrmSession defaultDrmSession) {
            this.f10433iobyxmoadg.add(defaultDrmSession);
            if (this.f10435zoijcleaow != null) {
                return;
            }
            this.f10435zoijcleaow = defaultDrmSession;
            defaultDrmSession.ylkuphrtab();
        }

        public void wkgbmnqykc(DefaultDrmSession defaultDrmSession) {
            this.f10433iobyxmoadg.remove(defaultDrmSession);
            if (this.f10435zoijcleaow == defaultDrmSession) {
                this.f10435zoijcleaow = null;
                if (this.f10433iobyxmoadg.isEmpty()) {
                    return;
                }
                DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession) this.f10433iobyxmoadg.iterator().next();
                this.f10435zoijcleaow = defaultDrmSession2;
                defaultDrmSession2.ylkuphrtab();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.iobyxmoadg
        public void zoijcleaow() {
            this.f10435zoijcleaow = null;
            zdlpuopuiu zdlpuopuiuVarJyumaefscl = zdlpuopuiu.jyumaefscl(this.f10433iobyxmoadg);
            this.f10433iobyxmoadg.clear();
            ulzqkzuiru it = zdlpuopuiuVarJyumaefscl.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).cdpycssgdh();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class lqeggnwhkg implements DefaultDrmSession.zoijcleaow {
        private lqeggnwhkg() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.zoijcleaow
        public void iobyxmoadg(DefaultDrmSession defaultDrmSession, int i13) {
            if (DefaultDrmSessionManager.this.f10408draadjrbmk != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f10419ojitshcjhn.remove(defaultDrmSession);
                ((Handler) y2.iobyxmoadg.eablkybsjg(DefaultDrmSessionManager.this.f10426yggfygwlhe)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.zoijcleaow
        public void zoijcleaow(final DefaultDrmSession defaultDrmSession, int i13) {
            if (i13 == 1 && DefaultDrmSessionManager.this.f10422rgvfuqvkyq > 0 && DefaultDrmSessionManager.this.f10408draadjrbmk != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f10419ojitshcjhn.add(defaultDrmSession);
                ((Handler) y2.iobyxmoadg.eablkybsjg(DefaultDrmSessionManager.this.f10426yggfygwlhe)).postAtTime(new Runnable() { // from class: androidx.media3.exoplayer.drm.gxszxtbevo
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.nufgyqmvbu(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f10408draadjrbmk);
            } else if (i13 == 0) {
                DefaultDrmSessionManager.this.f10424wflxmlrfwp.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f10420oxmwwwfdhm == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f10420oxmwwwfdhm = null;
                }
                if (DefaultDrmSessionManager.this.f10416kcexrzcfyt == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f10416kcexrzcfyt = null;
                }
                DefaultDrmSessionManager.this.f10409dxjokdxxww.wkgbmnqykc(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f10408draadjrbmk != -9223372036854775807L) {
                    ((Handler) y2.iobyxmoadg.eablkybsjg(DefaultDrmSessionManager.this.f10426yggfygwlhe)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f10419ojitshcjhn.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.istkbnxepw();
        }
    }

    private class ppxfxbqfkf implements wflxmlrfwp.zoijcleaow {
        private ppxfxbqfkf() {
        }

        @Override // androidx.media3.exoplayer.drm.wflxmlrfwp.zoijcleaow
        public void iobyxmoadg(wflxmlrfwp wflxmlrfwpVar, byte[] bArr, int i13, int i14, byte[] bArr2) {
            ((wkgbmnqykc) y2.iobyxmoadg.eablkybsjg(DefaultDrmSessionManager.this.f10411esjtqupxsv)).obtainMessage(i13, bArr).sendToTarget();
        }
    }

    private class wkgbmnqykc extends Handler {
        public wkgbmnqykc(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f10424wflxmlrfwp) {
                if (defaultDrmSession.yggfygwlhe(bArr)) {
                    defaultDrmSession.istkbnxepw(message.what);
                    return;
                }
            }
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f10445wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HashMap f10441iobyxmoadg = new HashMap();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private UUID f10446zoijcleaow = v2.nufgyqmvbu.f115647wkgbmnqykc;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private wflxmlrfwp.ppxfxbqfkf f10444ppxfxbqfkf = agtfadlqog.f10453wkgbmnqykc;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int[] f10439eablkybsjg = new int[0];

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f10440gxszxtbevo = true;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.zoijcleaow f10442lqeggnwhkg = new androidx.media3.exoplayer.upstream.iobyxmoadg();

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private long f10443nufgyqmvbu = 300000;

        public zoijcleaow eablkybsjg(int... iArr) {
            for (int i13 : iArr) {
                boolean z13 = true;
                if (i13 != 2 && i13 != 1) {
                    z13 = false;
                }
                y2.iobyxmoadg.iobyxmoadg(z13);
            }
            this.f10439eablkybsjg = (int[]) iArr.clone();
            return this;
        }

        public zoijcleaow gxszxtbevo(UUID uuid, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f10446zoijcleaow = (UUID) y2.iobyxmoadg.eablkybsjg(uuid);
            this.f10444ppxfxbqfkf = (wflxmlrfwp.ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(ppxfxbqfkfVar);
            return this;
        }

        public DefaultDrmSessionManager iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar) {
            return new DefaultDrmSessionManager(this.f10446zoijcleaow, this.f10444ppxfxbqfkf, rgvfuqvkyqVar, this.f10441iobyxmoadg, this.f10445wkgbmnqykc, this.f10439eablkybsjg, this.f10440gxszxtbevo, this.f10442lqeggnwhkg, this.f10443nufgyqmvbu);
        }

        public zoijcleaow ppxfxbqfkf(boolean z13) {
            this.f10445wkgbmnqykc = z13;
            return this;
        }

        public zoijcleaow wkgbmnqykc(boolean z13) {
            this.f10440gxszxtbevo = z13;
            return this;
        }

        public zoijcleaow zoijcleaow(androidx.media3.exoplayer.upstream.zoijcleaow zoijcleaowVar) {
            this.f10442lqeggnwhkg = (androidx.media3.exoplayer.upstream.zoijcleaow) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar);
            return this;
        }
    }

    private void cdpycssgdh() {
        ulzqkzuiru it = jyumaefscl.yggfygwlhe(this.f10419ojitshcjhn).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).nufgyqmvbu(null);
        }
    }

    private DefaultDrmSession cqumvgiudr(List list, boolean z13, nufgyqmvbu.iobyxmoadg iobyxmoadgVar, boolean z14) {
        DefaultDrmSession defaultDrmSessionIwizpuwonk = iwizpuwonk(list, z13, iobyxmoadgVar);
        if (yggfygwlhe(defaultDrmSessionIwizpuwonk) && !this.f10419ojitshcjhn.isEmpty()) {
            cdpycssgdh();
            lmojexxdyd(defaultDrmSessionIwizpuwonk, iobyxmoadgVar);
            defaultDrmSessionIwizpuwonk = iwizpuwonk(list, z13, iobyxmoadgVar);
        }
        if (!yggfygwlhe(defaultDrmSessionIwizpuwonk) || !z14 || this.f10405agtfadlqog.isEmpty()) {
            return defaultDrmSessionIwizpuwonk;
        }
        yadqdtsiqt();
        if (!this.f10419ojitshcjhn.isEmpty()) {
            cdpycssgdh();
        }
        lmojexxdyd(defaultDrmSessionIwizpuwonk, iobyxmoadgVar);
        return iwizpuwonk(list, z13, iobyxmoadgVar);
    }

    private static List esjtqupxsv(DrmInitData drmInitData, UUID uuid, boolean z13) {
        ArrayList arrayList = new ArrayList(drmInitData.f9619iwizpuwonk);
        for (int i13 = 0; i13 < drmInitData.f9619iwizpuwonk; i13++) {
            DrmInitData.SchemeData schemeDataEablkybsjg = drmInitData.eablkybsjg(i13);
            if ((schemeDataEablkybsjg.ppxfxbqfkf(uuid) || (v2.nufgyqmvbu.f115646ppxfxbqfkf.equals(uuid) && schemeDataEablkybsjg.ppxfxbqfkf(v2.nufgyqmvbu.f115648zoijcleaow))) && (schemeDataEablkybsjg.f9623cqumvgiudr != null || z13)) {
                arrayList.add(schemeDataEablkybsjg);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void istkbnxepw() {
        if (this.f10423vdvldrhtss != null && this.f10422rgvfuqvkyq == 0 && this.f10424wflxmlrfwp.isEmpty() && this.f10405agtfadlqog.isEmpty()) {
            ((wflxmlrfwp) y2.iobyxmoadg.eablkybsjg(this.f10423vdvldrhtss)).release();
            this.f10423vdvldrhtss = null;
        }
    }

    private DefaultDrmSession iwizpuwonk(List list, boolean z13, nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
        y2.iobyxmoadg.eablkybsjg(this.f10423vdvldrhtss);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f10428zoijcleaow, this.f10423vdvldrhtss, this.f10409dxjokdxxww, this.f10412gtknphoqwx, list, this.f10415jyumaefscl, this.f10418nufgyqmvbu | z13, z13, this.f10414iwizpuwonk, this.f10410eablkybsjg, this.f10425wkgbmnqykc, (Looper) y2.iobyxmoadg.eablkybsjg(this.f10427zdlpuopuiu), this.f10406btonecajqb, (h0) y2.iobyxmoadg.eablkybsjg(this.f10407cqumvgiudr));
        defaultDrmSession.gxszxtbevo(iobyxmoadgVar);
        if (this.f10408draadjrbmk != -9223372036854775807L) {
            defaultDrmSession.gxszxtbevo(null);
        }
        return defaultDrmSession;
    }

    private boolean jyumaefscl(DrmInitData drmInitData) {
        if (this.f10414iwizpuwonk != null) {
            return true;
        }
        if (esjtqupxsv(drmInitData, this.f10428zoijcleaow, true).isEmpty()) {
            if (drmInitData.f9619iwizpuwonk != 1 || !drmInitData.eablkybsjg(0).ppxfxbqfkf(v2.nufgyqmvbu.f115648zoijcleaow)) {
                return false;
            }
            kcexrzcfyt.nufgyqmvbu("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f10428zoijcleaow);
        }
        String str = drmInitData.f9620jyumaefscl;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            return stevsuqkhv.f123602iobyxmoadg >= 25;
        }
        return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private synchronized void lereixgezr(Looper looper) {
        try {
            Looper looper2 = this.f10427zdlpuopuiu;
            if (looper2 == null) {
                this.f10427zdlpuopuiu = looper;
                this.f10426yggfygwlhe = new Handler(looper);
            } else {
                y2.iobyxmoadg.lqeggnwhkg(looper2 == looper);
                y2.iobyxmoadg.eablkybsjg(this.f10426yggfygwlhe);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void lmojexxdyd(DrmSession drmSession, nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
        drmSession.nufgyqmvbu(iobyxmoadgVar);
        if (this.f10408draadjrbmk != -9223372036854775807L) {
            drmSession.nufgyqmvbu(null);
        }
    }

    private DrmSession pmvmpeiblj(int i13, boolean z13) {
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) y2.iobyxmoadg.eablkybsjg(this.f10423vdvldrhtss);
        if ((wflxmlrfwpVar.lqeggnwhkg() == 2 && i3.draadjrbmk.f41821wkgbmnqykc) || stevsuqkhv.ipoelvxyzq(this.f10417lqeggnwhkg, i13) == -1 || wflxmlrfwpVar.lqeggnwhkg() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f10420oxmwwwfdhm;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionCqumvgiudr = cqumvgiudr(zdlpuopuiu.zynmafqrjb(), true, null, z13);
            this.f10424wflxmlrfwp.add(defaultDrmSessionCqumvgiudr);
            this.f10420oxmwwwfdhm = defaultDrmSessionCqumvgiudr;
        } else {
            defaultDrmSession.gxszxtbevo(null);
        }
        return this.f10420oxmwwwfdhm;
    }

    private void wwaezpbzkn(boolean z13) {
        if (z13 && this.f10427zdlpuopuiu == null) {
            kcexrzcfyt.dxjokdxxww("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) y2.iobyxmoadg.eablkybsjg(this.f10427zdlpuopuiu)).getThread()) {
            kcexrzcfyt.dxjokdxxww("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f10427zdlpuopuiu.getThread().getName(), new IllegalStateException());
        }
    }

    private void yadqdtsiqt() {
        ulzqkzuiru it = jyumaefscl.yggfygwlhe(this.f10405agtfadlqog).iterator();
        while (it.hasNext()) {
            ((eablkybsjg) it.next()).release();
        }
    }

    private static boolean yggfygwlhe(DrmSession drmSession) {
        if (drmSession.getState() != 1) {
            return false;
        }
        Throwable cause = ((DrmSession.DrmSessionException) y2.iobyxmoadg.eablkybsjg(drmSession.wkgbmnqykc())).getCause();
        return (cause instanceof ResourceBusyException) || btonecajqb.eablkybsjg(cause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public DrmSession zdlpuopuiu(Looper looper, nufgyqmvbu.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar2, boolean z13) {
        List listEsjtqupxsv;
        zynmafqrjb(looper);
        DrmInitData drmInitData = iobyxmoadgVar2.f9764kcexrzcfyt;
        if (drmInitData == null) {
            return pmvmpeiblj(iwizpuwonk.gtknphoqwx(iobyxmoadgVar2.f9769ojitshcjhn), z13);
        }
        DefaultDrmSession defaultDrmSessionCqumvgiudr = null;
        Object[] objArr = 0;
        if (this.f10414iwizpuwonk == null) {
            listEsjtqupxsv = esjtqupxsv((DrmInitData) y2.iobyxmoadg.eablkybsjg(drmInitData), this.f10428zoijcleaow, false);
            if (listEsjtqupxsv.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f10428zoijcleaow);
                kcexrzcfyt.wkgbmnqykc("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (iobyxmoadgVar != null) {
                    iobyxmoadgVar.draadjrbmk(missingSchemeDataException);
                }
                return new draadjrbmk(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            listEsjtqupxsv = null;
        }
        if (this.f10413gxszxtbevo) {
            for (DefaultDrmSession defaultDrmSession : this.f10424wflxmlrfwp) {
                if (Objects.equals(defaultDrmSession.f10381iobyxmoadg, listEsjtqupxsv)) {
                    defaultDrmSessionCqumvgiudr = defaultDrmSession;
                    break;
                }
            }
        } else {
            defaultDrmSessionCqumvgiudr = this.f10416kcexrzcfyt;
        }
        if (defaultDrmSessionCqumvgiudr == null) {
            defaultDrmSessionCqumvgiudr = cqumvgiudr(listEsjtqupxsv, false, iobyxmoadgVar, z13);
            if (!this.f10413gxszxtbevo) {
                this.f10416kcexrzcfyt = defaultDrmSessionCqumvgiudr;
            }
            this.f10424wflxmlrfwp.add(defaultDrmSessionCqumvgiudr);
        } else {
            defaultDrmSessionCqumvgiudr.gxszxtbevo(iobyxmoadgVar);
        }
        return defaultDrmSessionCqumvgiudr;
    }

    private void zynmafqrjb(Looper looper) {
        if (this.f10411esjtqupxsv == null) {
            this.f10411esjtqupxsv = new wkgbmnqykc(looper);
        }
    }

    @Override // androidx.media3.exoplayer.drm.dxjokdxxww
    public int eablkybsjg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        wwaezpbzkn(false);
        int iLqeggnwhkg = ((wflxmlrfwp) y2.iobyxmoadg.eablkybsjg(this.f10423vdvldrhtss)).lqeggnwhkg();
        DrmInitData drmInitData = iobyxmoadgVar.f9764kcexrzcfyt;
        if (drmInitData != null) {
            if (jyumaefscl(drmInitData)) {
                return iLqeggnwhkg;
            }
            return 1;
        }
        if (stevsuqkhv.ipoelvxyzq(this.f10417lqeggnwhkg, iwizpuwonk.gtknphoqwx(iobyxmoadgVar.f9769ojitshcjhn)) != -1) {
            return iLqeggnwhkg;
        }
        return 0;
    }

    @Override // androidx.media3.exoplayer.drm.dxjokdxxww
    public dxjokdxxww.zoijcleaow gxszxtbevo(nufgyqmvbu.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar2) {
        y2.iobyxmoadg.lqeggnwhkg(this.f10422rgvfuqvkyq > 0);
        y2.iobyxmoadg.dxjokdxxww(this.f10427zdlpuopuiu);
        eablkybsjg eablkybsjgVar = new eablkybsjg(iobyxmoadgVar);
        eablkybsjgVar.eablkybsjg(iobyxmoadgVar2);
        return eablkybsjgVar;
    }

    public void iozdgvuglv(int i13, byte[] bArr) {
        y2.iobyxmoadg.lqeggnwhkg(this.f10424wflxmlrfwp.isEmpty());
        if (i13 == 1 || i13 == 3) {
            y2.iobyxmoadg.eablkybsjg(bArr);
        }
        this.f10415jyumaefscl = i13;
        this.f10414iwizpuwonk = bArr;
    }

    @Override // androidx.media3.exoplayer.drm.dxjokdxxww
    public void ppxfxbqfkf(Looper looper, h0 h0Var) {
        lereixgezr(looper);
        this.f10407cqumvgiudr = h0Var;
    }

    @Override // androidx.media3.exoplayer.drm.dxjokdxxww
    public final void release() {
        wwaezpbzkn(true);
        int i13 = this.f10422rgvfuqvkyq - 1;
        this.f10422rgvfuqvkyq = i13;
        if (i13 != 0) {
            return;
        }
        if (this.f10408draadjrbmk != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f10424wflxmlrfwp);
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((DefaultDrmSession) arrayList.get(i14)).nufgyqmvbu(null);
            }
        }
        yadqdtsiqt();
        istkbnxepw();
    }

    @Override // androidx.media3.exoplayer.drm.dxjokdxxww
    public DrmSession wkgbmnqykc(nufgyqmvbu.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar2) {
        wwaezpbzkn(false);
        y2.iobyxmoadg.lqeggnwhkg(this.f10422rgvfuqvkyq > 0);
        y2.iobyxmoadg.dxjokdxxww(this.f10427zdlpuopuiu);
        return zdlpuopuiu(this.f10427zdlpuopuiu, iobyxmoadgVar, iobyxmoadgVar2, true);
    }

    @Override // androidx.media3.exoplayer.drm.dxjokdxxww
    public final void zoijcleaow() {
        wwaezpbzkn(true);
        int i13 = this.f10422rgvfuqvkyq;
        this.f10422rgvfuqvkyq = i13 + 1;
        if (i13 != 0) {
            return;
        }
        if (this.f10423vdvldrhtss == null) {
            wflxmlrfwp wflxmlrfwpVarIobyxmoadg = this.f10421ppxfxbqfkf.iobyxmoadg(this.f10428zoijcleaow);
            this.f10423vdvldrhtss = wflxmlrfwpVarIobyxmoadg;
            wflxmlrfwpVarIobyxmoadg.draadjrbmk(new ppxfxbqfkf());
        } else if (this.f10408draadjrbmk != -9223372036854775807L) {
            for (int i14 = 0; i14 < this.f10424wflxmlrfwp.size(); i14++) {
                ((DefaultDrmSession) this.f10424wflxmlrfwp.get(i14)).gxszxtbevo(null);
            }
        }
    }

    private DefaultDrmSessionManager(UUID uuid, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar, rgvfuqvkyq rgvfuqvkyqVar, HashMap map, boolean z13, int[] iArr, boolean z14, androidx.media3.exoplayer.upstream.zoijcleaow zoijcleaowVar, long j13) {
        y2.iobyxmoadg.eablkybsjg(uuid);
        y2.iobyxmoadg.zoijcleaow(!v2.nufgyqmvbu.f115648zoijcleaow.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f10428zoijcleaow = uuid;
        this.f10421ppxfxbqfkf = ppxfxbqfkfVar;
        this.f10425wkgbmnqykc = rgvfuqvkyqVar;
        this.f10410eablkybsjg = map;
        this.f10413gxszxtbevo = z13;
        this.f10417lqeggnwhkg = iArr;
        this.f10418nufgyqmvbu = z14;
        this.f10406btonecajqb = zoijcleaowVar;
        this.f10409dxjokdxxww = new gxszxtbevo();
        this.f10412gtknphoqwx = new lqeggnwhkg();
        this.f10415jyumaefscl = 0;
        this.f10424wflxmlrfwp = new ArrayList();
        this.f10405agtfadlqog = kegysxyocb.nufgyqmvbu();
        this.f10419ojitshcjhn = kegysxyocb.nufgyqmvbu();
        this.f10408draadjrbmk = j13;
    }
}
