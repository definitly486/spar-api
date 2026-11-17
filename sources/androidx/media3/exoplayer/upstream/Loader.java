package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import y2.jpowsppfya;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;
import y2.wflxmlrfwp;

/* JADX INFO: loaded from: classes.dex */
public final class Loader {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final ppxfxbqfkf f11422gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final ppxfxbqfkf f11423lqeggnwhkg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final q3.iobyxmoadg f11425iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private IOException f11426ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private wkgbmnqykc f11427zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final ppxfxbqfkf f11424wkgbmnqykc = lqeggnwhkg(false, -9223372036854775807L);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final ppxfxbqfkf f11421eablkybsjg = lqeggnwhkg(true, -9223372036854775807L);

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            String str;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unexpected ");
            sb3.append(th2.getClass().getSimpleName());
            if (th2.getMessage() != null) {
                str = ": " + th2.getMessage();
            } else {
                str = "";
            }
            sb3.append(str);
            super(sb3.toString(), th2);
        }
    }

    public interface eablkybsjg {
        void load();

        void zoijcleaow();
    }

    public interface gxszxtbevo {
        void gtknphoqwx();
    }

    private static final class lqeggnwhkg implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final gxszxtbevo f11428zdlpuopuiu;

        public lqeggnwhkg(gxszxtbevo gxszxtbevoVar) {
            this.f11428zdlpuopuiu = gxszxtbevoVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11428zdlpuopuiu.gtknphoqwx();
        }
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f11429iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final long f11430zoijcleaow;

        public boolean ppxfxbqfkf() {
            int i13 = this.f11429iobyxmoadg;
            return i13 == 0 || i13 == 1;
        }

        private ppxfxbqfkf(int i13, long j13) {
            this.f11429iobyxmoadg = i13;
            this.f11430zoijcleaow = j13;
        }
    }

    private final class wkgbmnqykc extends Handler implements Runnable {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private IOException f11431cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private int f11432esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private zoijcleaow f11434iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final long f11435jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private Thread f11436lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private boolean f11437pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final eablkybsjg f11438yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final int f11439zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private volatile boolean f11440zynmafqrjb;

        public wkgbmnqykc(Looper looper, eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, int i13, long j13) {
            super(looper);
            this.f11438yggfygwlhe = eablkybsjgVar;
            this.f11434iwizpuwonk = zoijcleaowVar;
            this.f11439zdlpuopuiu = i13;
            this.f11435jyumaefscl = j13;
        }

        private void ppxfxbqfkf() {
            Loader.this.f11427zoijcleaow = null;
        }

        private long wkgbmnqykc() {
            return Math.min((this.f11432esjtqupxsv - 1) * 1000, 5000);
        }

        private void zoijcleaow() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((zoijcleaow) y2.iobyxmoadg.eablkybsjg(this.f11434iwizpuwonk)).wflxmlrfwp(this.f11438yggfygwlhe, jElapsedRealtime, jElapsedRealtime - this.f11435jyumaefscl, this.f11432esjtqupxsv);
            this.f11431cqumvgiudr = null;
            Loader.this.f11425iobyxmoadg.execute((Runnable) y2.iobyxmoadg.eablkybsjg(Loader.this.f11427zoijcleaow));
        }

        public void eablkybsjg(int i13) throws IOException {
            IOException iOException = this.f11431cqumvgiudr;
            if (iOException != null && this.f11432esjtqupxsv > i13) {
                throw iOException;
            }
        }

        public void gxszxtbevo(long j13) {
            y2.iobyxmoadg.lqeggnwhkg(Loader.this.f11427zoijcleaow == null);
            Loader.this.f11427zoijcleaow = this;
            if (j13 > 0) {
                sendEmptyMessageDelayed(1, j13);
            } else {
                zoijcleaow();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f11440zynmafqrjb) {
                return;
            }
            int i13 = message.what;
            if (i13 == 1) {
                zoijcleaow();
                return;
            }
            if (i13 == 4) {
                throw ((Error) message.obj);
            }
            ppxfxbqfkf();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j13 = jElapsedRealtime - this.f11435jyumaefscl;
            zoijcleaow zoijcleaowVar = (zoijcleaow) y2.iobyxmoadg.eablkybsjg(this.f11434iwizpuwonk);
            if (this.f11437pmvmpeiblj) {
                zoijcleaowVar.jyumaefscl(this.f11438yggfygwlhe, jElapsedRealtime, j13, false);
                return;
            }
            int i14 = message.what;
            if (i14 == 2) {
                try {
                    zoijcleaowVar.oxmwwwfdhm(this.f11438yggfygwlhe, jElapsedRealtime, j13);
                    return;
                } catch (RuntimeException e13) {
                    kcexrzcfyt.wkgbmnqykc("LoadTask", "Unexpected exception handling load completed", e13);
                    Loader.this.f11426ppxfxbqfkf = new UnexpectedLoaderException(e13);
                    return;
                }
            }
            if (i14 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f11431cqumvgiudr = iOException;
            int i15 = this.f11432esjtqupxsv + 1;
            this.f11432esjtqupxsv = i15;
            ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = zoijcleaowVar.lqeggnwhkg(this.f11438yggfygwlhe, jElapsedRealtime, j13, iOException, i15);
            if (ppxfxbqfkfVarLqeggnwhkg.f11429iobyxmoadg == 3) {
                Loader.this.f11426ppxfxbqfkf = this.f11431cqumvgiudr;
            } else if (ppxfxbqfkfVarLqeggnwhkg.f11429iobyxmoadg != 2) {
                if (ppxfxbqfkfVarLqeggnwhkg.f11429iobyxmoadg == 1) {
                    this.f11432esjtqupxsv = 1;
                }
                gxszxtbevo(ppxfxbqfkfVarLqeggnwhkg.f11430zoijcleaow != -9223372036854775807L ? ppxfxbqfkfVarLqeggnwhkg.f11430zoijcleaow : wkgbmnqykc());
            }
        }

        public void iobyxmoadg(boolean z13) {
            this.f11440zynmafqrjb = z13;
            this.f11431cqumvgiudr = null;
            if (hasMessages(1)) {
                this.f11437pmvmpeiblj = true;
                removeMessages(1);
                if (!z13) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f11437pmvmpeiblj = true;
                        this.f11438yggfygwlhe.zoijcleaow();
                        Thread thread = this.f11436lereixgezr;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z13) {
                ppxfxbqfkf();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((zoijcleaow) y2.iobyxmoadg.eablkybsjg(this.f11434iwizpuwonk)).jyumaefscl(this.f11438yggfygwlhe, jElapsedRealtime, jElapsedRealtime - this.f11435jyumaefscl, true);
                this.f11434iwizpuwonk = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z13;
            try {
                synchronized (this) {
                    z13 = this.f11437pmvmpeiblj;
                    this.f11436lereixgezr = Thread.currentThread();
                }
                if (!z13) {
                    jpowsppfya.iobyxmoadg("load:" + this.f11438yggfygwlhe.getClass().getSimpleName());
                    try {
                        this.f11438yggfygwlhe.load();
                        jpowsppfya.zoijcleaow();
                    } catch (Throwable th2) {
                        jpowsppfya.zoijcleaow();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f11436lereixgezr = null;
                    Thread.interrupted();
                }
                if (this.f11440zynmafqrjb) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e13) {
                if (this.f11440zynmafqrjb) {
                    return;
                }
                obtainMessage(3, e13).sendToTarget();
            } catch (Error e14) {
                if (!this.f11440zynmafqrjb) {
                    kcexrzcfyt.wkgbmnqykc("LoadTask", "Unexpected error loading stream", e14);
                    obtainMessage(4, e14).sendToTarget();
                }
                throw e14;
            } catch (Exception e15) {
                if (this.f11440zynmafqrjb) {
                    return;
                }
                kcexrzcfyt.wkgbmnqykc("LoadTask", "Unexpected exception loading stream", e15);
                obtainMessage(3, new UnexpectedLoaderException(e15)).sendToTarget();
            } catch (OutOfMemoryError e16) {
                if (this.f11440zynmafqrjb) {
                    return;
                }
                kcexrzcfyt.wkgbmnqykc("LoadTask", "OutOfMemory error loading stream", e16);
                obtainMessage(3, new UnexpectedLoaderException(e16)).sendToTarget();
            }
        }
    }

    public interface zoijcleaow {
        void jyumaefscl(eablkybsjg eablkybsjgVar, long j13, long j14, boolean z13);

        ppxfxbqfkf lqeggnwhkg(eablkybsjg eablkybsjgVar, long j13, long j14, IOException iOException, int i13);

        void oxmwwwfdhm(eablkybsjg eablkybsjgVar, long j13, long j14);

        void wflxmlrfwp(eablkybsjg eablkybsjgVar, long j13, long j14, int i13);
    }

    static {
        long j13 = -9223372036854775807L;
        f11422gxszxtbevo = new ppxfxbqfkf(2, j13);
        f11423lqeggnwhkg = new ppxfxbqfkf(3, j13);
    }

    public Loader(String str) {
        this(q3.iobyxmoadg.kcexrzcfyt(stevsuqkhv.jrbgnlbqoe("ExoPlayer:Loader:" + str), new wflxmlrfwp() { // from class: p3.nufgyqmvbu
            @Override // y2.wflxmlrfwp
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public static ppxfxbqfkf lqeggnwhkg(boolean z13, long j13) {
        return new ppxfxbqfkf(z13 ? 1 : 0, j13);
    }

    public long agtfadlqog(eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, int i13) {
        Looper looper = (Looper) y2.iobyxmoadg.dxjokdxxww(Looper.myLooper());
        this.f11426ppxfxbqfkf = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new wkgbmnqykc(looper, eablkybsjgVar, zoijcleaowVar, i13, jElapsedRealtime).gxszxtbevo(0L);
        return jElapsedRealtime;
    }

    public void btonecajqb() throws IOException {
        gtknphoqwx(Integer.MIN_VALUE);
    }

    public void draadjrbmk() {
        wflxmlrfwp(null);
    }

    public boolean dxjokdxxww() {
        return this.f11427zoijcleaow != null;
    }

    public void eablkybsjg() {
        ((wkgbmnqykc) y2.iobyxmoadg.dxjokdxxww(this.f11427zoijcleaow)).iobyxmoadg(false);
    }

    public void gtknphoqwx(int i13) throws IOException {
        IOException iOException = this.f11426ppxfxbqfkf;
        if (iOException != null) {
            throw iOException;
        }
        wkgbmnqykc wkgbmnqykcVar = this.f11427zoijcleaow;
        if (wkgbmnqykcVar != null) {
            if (i13 == Integer.MIN_VALUE) {
                i13 = wkgbmnqykcVar.f11439zdlpuopuiu;
            }
            wkgbmnqykcVar.eablkybsjg(i13);
        }
    }

    public void gxszxtbevo() {
        this.f11426ppxfxbqfkf = null;
    }

    public boolean nufgyqmvbu() {
        return this.f11426ppxfxbqfkf != null;
    }

    public void wflxmlrfwp(gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar = this.f11427zoijcleaow;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.iobyxmoadg(true);
        }
        if (gxszxtbevoVar != null) {
            this.f11425iobyxmoadg.execute(new lqeggnwhkg(gxszxtbevoVar));
        }
        this.f11425iobyxmoadg.release();
    }

    public Loader(q3.iobyxmoadg iobyxmoadgVar) {
        this.f11425iobyxmoadg = iobyxmoadgVar;
    }
}
