package e3;

import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo implements wkgbmnqykc {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private DecoderException f30241btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f30242draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private DecoderInputBuffer f30243dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final DecoderInputBuffer[] f30244eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f30245gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final eablkybsjg[] f30246gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Thread f30247iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f30248lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f30249nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f30251wflxmlrfwp;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f30253zoijcleaow = new Object();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private long f30240agtfadlqog = -9223372036854775807L;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ArrayDeque f30250ppxfxbqfkf = new ArrayDeque();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ArrayDeque f30252wkgbmnqykc = new ArrayDeque();

    class iobyxmoadg extends Thread {
        iobyxmoadg(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            gxszxtbevo.this.jyumaefscl();
        }
    }

    protected gxszxtbevo(DecoderInputBuffer[] decoderInputBufferArr, eablkybsjg[] eablkybsjgVarArr) {
        this.f30244eablkybsjg = decoderInputBufferArr;
        this.f30248lqeggnwhkg = decoderInputBufferArr.length;
        for (int i13 = 0; i13 < this.f30248lqeggnwhkg; i13++) {
            this.f30244eablkybsjg[i13] = dxjokdxxww();
        }
        this.f30246gxszxtbevo = eablkybsjgVarArr;
        this.f30249nufgyqmvbu = eablkybsjgVarArr.length;
        for (int i14 = 0; i14 < this.f30249nufgyqmvbu; i14++) {
            this.f30246gxszxtbevo[i14] = btonecajqb();
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg("ExoPlayer:SimpleDecoder");
        this.f30247iobyxmoadg = iobyxmoadgVar;
        iobyxmoadgVar.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jyumaefscl() {
        do {
            try {
            } catch (InterruptedException e13) {
                throw new IllegalStateException(e13);
            }
        } while (wflxmlrfwp());
    }

    private void kcexrzcfyt(DecoderInputBuffer decoderInputBuffer) {
        decoderInputBuffer.gxszxtbevo();
        DecoderInputBuffer[] decoderInputBufferArr = this.f30244eablkybsjg;
        int i13 = this.f30248lqeggnwhkg;
        this.f30248lqeggnwhkg = i13 + 1;
        decoderInputBufferArr[i13] = decoderInputBuffer;
    }

    private boolean nufgyqmvbu() {
        return !this.f30250ppxfxbqfkf.isEmpty() && this.f30249nufgyqmvbu > 0;
    }

    private void oxmwwwfdhm() throws DecoderException {
        DecoderException decoderException = this.f30241btonecajqb;
        if (decoderException != null) {
            throw decoderException;
        }
    }

    private void vdvldrhtss() {
        if (nufgyqmvbu()) {
            this.f30253zoijcleaow.notify();
        }
    }

    private boolean wflxmlrfwp() {
        DecoderException decoderExceptionGtknphoqwx;
        synchronized (this.f30253zoijcleaow) {
            while (!this.f30242draadjrbmk && !nufgyqmvbu()) {
                try {
                    this.f30253zoijcleaow.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f30242draadjrbmk) {
                return false;
            }
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) this.f30250ppxfxbqfkf.removeFirst();
            eablkybsjg[] eablkybsjgVarArr = this.f30246gxszxtbevo;
            int i13 = this.f30249nufgyqmvbu - 1;
            this.f30249nufgyqmvbu = i13;
            eablkybsjg eablkybsjgVar = eablkybsjgVarArr[i13];
            boolean z13 = this.f30245gtknphoqwx;
            this.f30245gtknphoqwx = false;
            if (decoderInputBuffer.dxjokdxxww()) {
                eablkybsjgVar.eablkybsjg(4);
            } else {
                eablkybsjgVar.f30239yggfygwlhe = decoderInputBuffer.f10020esjtqupxsv;
                if (decoderInputBuffer.btonecajqb()) {
                    eablkybsjgVar.eablkybsjg(134217728);
                }
                if (!rgvfuqvkyq(decoderInputBuffer.f10020esjtqupxsv)) {
                    eablkybsjgVar.f30237iwizpuwonk = true;
                }
                try {
                    decoderExceptionGtknphoqwx = draadjrbmk(decoderInputBuffer, eablkybsjgVar, z13);
                } catch (OutOfMemoryError e13) {
                    decoderExceptionGtknphoqwx = gtknphoqwx(e13);
                } catch (RuntimeException e14) {
                    decoderExceptionGtknphoqwx = gtknphoqwx(e14);
                }
                if (decoderExceptionGtknphoqwx != null) {
                    synchronized (this.f30253zoijcleaow) {
                        this.f30241btonecajqb = decoderExceptionGtknphoqwx;
                    }
                    return false;
                }
            }
            synchronized (this.f30253zoijcleaow) {
                try {
                    if (this.f30245gtknphoqwx) {
                        eablkybsjgVar.ojitshcjhn();
                    } else if (eablkybsjgVar.f30237iwizpuwonk) {
                        this.f30251wflxmlrfwp++;
                        eablkybsjgVar.ojitshcjhn();
                    } else {
                        eablkybsjgVar.f30238jyumaefscl = this.f30251wflxmlrfwp;
                        this.f30251wflxmlrfwp = 0;
                        this.f30252wkgbmnqykc.addLast(eablkybsjgVar);
                    }
                    kcexrzcfyt(decoderInputBuffer);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }

    private void yggfygwlhe(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.gxszxtbevo();
        eablkybsjg[] eablkybsjgVarArr = this.f30246gxszxtbevo;
        int i13 = this.f30249nufgyqmvbu;
        this.f30249nufgyqmvbu = i13 + 1;
        eablkybsjgVarArr[i13] = eablkybsjgVar;
    }

    @Override // e3.wkgbmnqykc
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public final DecoderInputBuffer eablkybsjg() {
        DecoderInputBuffer decoderInputBuffer;
        synchronized (this.f30253zoijcleaow) {
            oxmwwwfdhm();
            y2.iobyxmoadg.lqeggnwhkg(this.f30243dxjokdxxww == null);
            int i13 = this.f30248lqeggnwhkg;
            if (i13 == 0) {
                decoderInputBuffer = null;
            } else {
                DecoderInputBuffer[] decoderInputBufferArr = this.f30244eablkybsjg;
                int i14 = i13 - 1;
                this.f30248lqeggnwhkg = i14;
                decoderInputBuffer = decoderInputBufferArr[i14];
            }
            this.f30243dxjokdxxww = decoderInputBuffer;
        }
        return decoderInputBuffer;
    }

    protected abstract eablkybsjg btonecajqb();

    protected abstract DecoderException draadjrbmk(DecoderInputBuffer decoderInputBuffer, eablkybsjg eablkybsjgVar, boolean z13);

    protected abstract DecoderInputBuffer dxjokdxxww();

    @Override // e3.wkgbmnqykc
    public final void flush() {
        synchronized (this.f30253zoijcleaow) {
            try {
                this.f30245gtknphoqwx = true;
                this.f30251wflxmlrfwp = 0;
                DecoderInputBuffer decoderInputBuffer = this.f30243dxjokdxxww;
                if (decoderInputBuffer != null) {
                    kcexrzcfyt(decoderInputBuffer);
                    this.f30243dxjokdxxww = null;
                }
                while (!this.f30250ppxfxbqfkf.isEmpty()) {
                    kcexrzcfyt((DecoderInputBuffer) this.f30250ppxfxbqfkf.removeFirst());
                }
                while (!this.f30252wkgbmnqykc.isEmpty()) {
                    ((eablkybsjg) this.f30252wkgbmnqykc.removeFirst()).ojitshcjhn();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract DecoderException gtknphoqwx(Throwable th2);

    @Override // e3.wkgbmnqykc
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public final void ppxfxbqfkf(DecoderInputBuffer decoderInputBuffer) {
        synchronized (this.f30253zoijcleaow) {
            oxmwwwfdhm();
            y2.iobyxmoadg.iobyxmoadg(decoderInputBuffer == this.f30243dxjokdxxww);
            this.f30250ppxfxbqfkf.addLast(decoderInputBuffer);
            vdvldrhtss();
            this.f30243dxjokdxxww = null;
        }
    }

    protected final void iwizpuwonk(int i13) {
        y2.iobyxmoadg.lqeggnwhkg(this.f30248lqeggnwhkg == this.f30244eablkybsjg.length);
        for (DecoderInputBuffer decoderInputBuffer : this.f30244eablkybsjg) {
            decoderInputBuffer.rgvfuqvkyq(i13);
        }
    }

    @Override // e3.wkgbmnqykc
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public final eablkybsjg iobyxmoadg() {
        synchronized (this.f30253zoijcleaow) {
            try {
                oxmwwwfdhm();
                if (this.f30252wkgbmnqykc.isEmpty()) {
                    return null;
                }
                return (eablkybsjg) this.f30252wkgbmnqykc.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // e3.wkgbmnqykc
    public void release() {
        synchronized (this.f30253zoijcleaow) {
            this.f30242draadjrbmk = true;
            this.f30253zoijcleaow.notify();
        }
        try {
            this.f30247iobyxmoadg.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    protected final boolean rgvfuqvkyq(long j13) {
        boolean z13;
        synchronized (this.f30253zoijcleaow) {
            long j14 = this.f30240agtfadlqog;
            z13 = j14 == -9223372036854775807L || j13 >= j14;
        }
        return z13;
    }

    @Override // e3.wkgbmnqykc
    public final void wkgbmnqykc(long j13) {
        synchronized (this.f30253zoijcleaow) {
            try {
                y2.iobyxmoadg.lqeggnwhkg(this.f30248lqeggnwhkg == this.f30244eablkybsjg.length || this.f30245gtknphoqwx);
                this.f30240agtfadlqog = j13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void zdlpuopuiu(eablkybsjg eablkybsjgVar) {
        synchronized (this.f30253zoijcleaow) {
            yggfygwlhe(eablkybsjgVar);
            vdvldrhtss();
        }
    }
}
