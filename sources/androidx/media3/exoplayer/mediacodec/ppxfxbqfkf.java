package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
class ppxfxbqfkf implements dxjokdxxww {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final ArrayDeque f10848lqeggnwhkg = new ArrayDeque();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final Object f10849nufgyqmvbu = new Object();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final y2.draadjrbmk f10850eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f10851gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MediaCodec f10852iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Handler f10853ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final AtomicReference f10854wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final HandlerThread f10855zoijcleaow;

    class iobyxmoadg extends Handler {
        iobyxmoadg(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ppxfxbqfkf.this.btonecajqb(message);
        }
    }

    private static class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public long f10857eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public int f10858gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public int f10859iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f10860ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f10861wkgbmnqykc = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f10862zoijcleaow;

        zoijcleaow() {
        }

        public void iobyxmoadg(int i13, int i14, int i15, long j13, int i16) {
            this.f10859iobyxmoadg = i13;
            this.f10862zoijcleaow = i14;
            this.f10860ppxfxbqfkf = i15;
            this.f10857eablkybsjg = j13;
            this.f10858gxszxtbevo = i16;
        }
    }

    public ppxfxbqfkf(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new y2.draadjrbmk());
    }

    private void agtfadlqog() {
        ((Handler) y2.iobyxmoadg.eablkybsjg(this.f10853ppxfxbqfkf)).removeCallbacksAndMessages(null);
        gxszxtbevo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btonecajqb(Message message) {
        zoijcleaow zoijcleaowVar;
        int i13 = message.what;
        if (i13 == 1) {
            zoijcleaowVar = (zoijcleaow) message.obj;
            gtknphoqwx(zoijcleaowVar.f10859iobyxmoadg, zoijcleaowVar.f10862zoijcleaow, zoijcleaowVar.f10860ppxfxbqfkf, zoijcleaowVar.f10857eablkybsjg, zoijcleaowVar.f10858gxszxtbevo);
        } else if (i13 != 2) {
            zoijcleaowVar = null;
            if (i13 == 3) {
                this.f10850eablkybsjg.eablkybsjg();
            } else if (i13 != 4) {
                mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f10854wkgbmnqykc, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                wflxmlrfwp((Bundle) message.obj);
            }
        } else {
            zoijcleaowVar = (zoijcleaow) message.obj;
            draadjrbmk(zoijcleaowVar.f10859iobyxmoadg, zoijcleaowVar.f10862zoijcleaow, zoijcleaowVar.f10861wkgbmnqykc, zoijcleaowVar.f10857eablkybsjg, zoijcleaowVar.f10858gxszxtbevo);
        }
        if (zoijcleaowVar != null) {
            rgvfuqvkyq(zoijcleaowVar);
        }
    }

    private void draadjrbmk(int i13, int i14, MediaCodec.CryptoInfo cryptoInfo, long j13, int i15) {
        try {
            synchronized (f10849nufgyqmvbu) {
                this.f10852iobyxmoadg.queueSecureInputBuffer(i13, i14, cryptoInfo, j13, i15);
            }
        } catch (RuntimeException e13) {
            mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f10854wkgbmnqykc, null, e13);
        }
    }

    private static int[] dxjokdxxww(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    private void gtknphoqwx(int i13, int i14, int i15, long j13, int i16) {
        try {
            this.f10852iobyxmoadg.queueInputBuffer(i13, i14, i15, j13, i16);
        } catch (RuntimeException e13) {
            mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f10854wkgbmnqykc, null, e13);
        }
    }

    private void gxszxtbevo() {
        this.f10850eablkybsjg.ppxfxbqfkf();
        ((Handler) y2.iobyxmoadg.eablkybsjg(this.f10853ppxfxbqfkf)).obtainMessage(3).sendToTarget();
        this.f10850eablkybsjg.iobyxmoadg();
    }

    private static void lqeggnwhkg(e3.ppxfxbqfkf ppxfxbqfkfVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = ppxfxbqfkfVar.f30259gxszxtbevo;
        cryptoInfo.numBytesOfClearData = dxjokdxxww(ppxfxbqfkfVar.f30264wkgbmnqykc, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = dxjokdxxww(ppxfxbqfkfVar.f30258eablkybsjg, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) y2.iobyxmoadg.eablkybsjg(nufgyqmvbu(ppxfxbqfkfVar.f30265zoijcleaow, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) y2.iobyxmoadg.eablkybsjg(nufgyqmvbu(ppxfxbqfkfVar.f30260iobyxmoadg, cryptoInfo.iv));
        cryptoInfo.mode = ppxfxbqfkfVar.f30263ppxfxbqfkf;
        if (stevsuqkhv.f123602iobyxmoadg >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(ppxfxbqfkfVar.f30261lqeggnwhkg, ppxfxbqfkfVar.f30262nufgyqmvbu));
        }
    }

    private static byte[] nufgyqmvbu(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static zoijcleaow ojitshcjhn() {
        ArrayDeque arrayDeque = f10848lqeggnwhkg;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zoijcleaow();
                }
                return (zoijcleaow) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void rgvfuqvkyq(zoijcleaow zoijcleaowVar) {
        ArrayDeque arrayDeque = f10848lqeggnwhkg;
        synchronized (arrayDeque) {
            arrayDeque.add(zoijcleaowVar);
        }
    }

    private void wflxmlrfwp(Bundle bundle) {
        try {
            this.f10852iobyxmoadg.setParameters(bundle);
        } catch (RuntimeException e13) {
            mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f10854wkgbmnqykc, null, e13);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.dxjokdxxww
    public void flush() {
        if (this.f10851gxszxtbevo) {
            try {
                agtfadlqog();
            } catch (InterruptedException e13) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e13);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.dxjokdxxww
    public void iobyxmoadg(int i13, int i14, e3.ppxfxbqfkf ppxfxbqfkfVar, long j13, int i15) {
        wkgbmnqykc();
        zoijcleaow zoijcleaowVarOjitshcjhn = ojitshcjhn();
        zoijcleaowVarOjitshcjhn.iobyxmoadg(i13, i14, 0, j13, i15);
        lqeggnwhkg(ppxfxbqfkfVar, zoijcleaowVarOjitshcjhn.f10861wkgbmnqykc);
        ((Handler) stevsuqkhv.nufgyqmvbu(this.f10853ppxfxbqfkf)).obtainMessage(2, zoijcleaowVarOjitshcjhn).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.dxjokdxxww
    public void ppxfxbqfkf(Bundle bundle) {
        wkgbmnqykc();
        ((Handler) stevsuqkhv.nufgyqmvbu(this.f10853ppxfxbqfkf)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.dxjokdxxww
    public void shutdown() {
        if (this.f10851gxszxtbevo) {
            flush();
            this.f10855zoijcleaow.quit();
        }
        this.f10851gxszxtbevo = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.dxjokdxxww
    public void start() {
        if (this.f10851gxszxtbevo) {
            return;
        }
        this.f10855zoijcleaow.start();
        this.f10853ppxfxbqfkf = new iobyxmoadg(this.f10855zoijcleaow.getLooper());
        this.f10851gxszxtbevo = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.dxjokdxxww
    public void wkgbmnqykc() {
        RuntimeException runtimeException = (RuntimeException) this.f10854wkgbmnqykc.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.dxjokdxxww
    public void zoijcleaow(int i13, int i14, int i15, long j13, int i16) {
        wkgbmnqykc();
        zoijcleaow zoijcleaowVarOjitshcjhn = ojitshcjhn();
        zoijcleaowVarOjitshcjhn.iobyxmoadg(i13, i14, i15, j13, i16);
        ((Handler) stevsuqkhv.nufgyqmvbu(this.f10853ppxfxbqfkf)).obtainMessage(1, zoijcleaowVarOjitshcjhn).sendToTarget();
    }

    ppxfxbqfkf(MediaCodec mediaCodec, HandlerThread handlerThread, y2.draadjrbmk draadjrbmkVar) {
        this.f10852iobyxmoadg = mediaCodec;
        this.f10855zoijcleaow = handlerThread;
        this.f10850eablkybsjg = draadjrbmkVar;
        this.f10854wkgbmnqykc = new AtomicReference();
    }
}
