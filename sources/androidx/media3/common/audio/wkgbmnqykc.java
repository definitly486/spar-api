package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc implements AudioProcessor {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private ByteBuffer f9685agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f9686btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private ByteBuffer f9687draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private AudioProcessor.iobyxmoadg f9688dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float f9689eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private ppxfxbqfkf f9690gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private AudioProcessor.iobyxmoadg f9691gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private AudioProcessor.iobyxmoadg f9692lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private AudioProcessor.iobyxmoadg f9693nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private long f9694ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f9695ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private long f9696rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f9697vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private ShortBuffer f9698wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private float f9699wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f9700zoijcleaow;

    public wkgbmnqykc() {
        this(false);
    }

    private boolean iobyxmoadg() {
        return Math.abs(this.f9699wkgbmnqykc - 1.0f) < 1.0E-4f && Math.abs(this.f9689eablkybsjg - 1.0f) < 1.0E-4f && this.f9692lqeggnwhkg.f9652iobyxmoadg == this.f9691gxszxtbevo.f9652iobyxmoadg;
    }

    public void btonecajqb(float f13) {
        y2.iobyxmoadg.iobyxmoadg(f13 > 0.0f);
        if (this.f9699wkgbmnqykc != f13) {
            this.f9699wkgbmnqykc = f13;
            this.f9686btonecajqb = true;
        }
    }

    public void dxjokdxxww(float f13) {
        y2.iobyxmoadg.iobyxmoadg(f13 > 0.0f);
        if (this.f9689eablkybsjg != f13) {
            this.f9689eablkybsjg = f13;
            this.f9686btonecajqb = true;
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer eablkybsjg() {
        int iGtknphoqwx;
        ppxfxbqfkf ppxfxbqfkfVar = this.f9690gtknphoqwx;
        if (ppxfxbqfkfVar != null && (iGtknphoqwx = ppxfxbqfkfVar.gtknphoqwx()) > 0) {
            if (this.f9687draadjrbmk.capacity() < iGtknphoqwx) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iGtknphoqwx).order(ByteOrder.nativeOrder());
                this.f9687draadjrbmk = byteBufferOrder;
                this.f9698wflxmlrfwp = byteBufferOrder.asShortBuffer();
            } else {
                this.f9687draadjrbmk.clear();
                this.f9698wflxmlrfwp.clear();
            }
            ppxfxbqfkfVar.btonecajqb(this.f9698wflxmlrfwp);
            this.f9696rgvfuqvkyq += (long) iGtknphoqwx;
            this.f9687draadjrbmk.limit(iGtknphoqwx);
            this.f9685agtfadlqog = this.f9687draadjrbmk;
        }
        ByteBuffer byteBuffer = this.f9685agtfadlqog;
        this.f9685agtfadlqog = AudioProcessor.f9649iobyxmoadg;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            AudioProcessor.iobyxmoadg iobyxmoadgVar = this.f9691gxszxtbevo;
            this.f9693nufgyqmvbu = iobyxmoadgVar;
            AudioProcessor.iobyxmoadg iobyxmoadgVar2 = this.f9692lqeggnwhkg;
            this.f9688dxjokdxxww = iobyxmoadgVar2;
            if (this.f9686btonecajqb) {
                this.f9690gtknphoqwx = new ppxfxbqfkf(iobyxmoadgVar.f9652iobyxmoadg, iobyxmoadgVar.f9655zoijcleaow, this.f9699wkgbmnqykc, this.f9689eablkybsjg, iobyxmoadgVar2.f9652iobyxmoadg);
            } else {
                ppxfxbqfkf ppxfxbqfkfVar = this.f9690gtknphoqwx;
                if (ppxfxbqfkfVar != null) {
                    ppxfxbqfkfVar.dxjokdxxww();
                }
            }
        }
        this.f9685agtfadlqog = AudioProcessor.f9649iobyxmoadg;
        this.f9694ojitshcjhn = 0L;
        this.f9696rgvfuqvkyq = 0L;
        this.f9697vdvldrhtss = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void gxszxtbevo(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(this.f9690gtknphoqwx);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f9694ojitshcjhn += (long) iRemaining;
            ppxfxbqfkfVar.zdlpuopuiu(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.f9692lqeggnwhkg.f9652iobyxmoadg != -1 && (this.f9700zoijcleaow || !iobyxmoadg());
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void lqeggnwhkg() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f9690gtknphoqwx;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.kcexrzcfyt();
        }
        this.f9697vdvldrhtss = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public AudioProcessor.iobyxmoadg nufgyqmvbu(AudioProcessor.iobyxmoadg iobyxmoadgVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (iobyxmoadgVar.f9653ppxfxbqfkf != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(iobyxmoadgVar);
        }
        int i13 = this.f9695ppxfxbqfkf;
        if (i13 == -1) {
            i13 = iobyxmoadgVar.f9652iobyxmoadg;
        }
        this.f9691gxszxtbevo = iobyxmoadgVar;
        AudioProcessor.iobyxmoadg iobyxmoadgVar2 = new AudioProcessor.iobyxmoadg(i13, iobyxmoadgVar.f9655zoijcleaow, 2);
        this.f9692lqeggnwhkg = iobyxmoadgVar2;
        this.f9686btonecajqb = true;
        return iobyxmoadgVar2;
    }

    public long ppxfxbqfkf(long j13) {
        if (this.f9696rgvfuqvkyq < 1024) {
            return (long) (((double) this.f9699wkgbmnqykc) * j13);
        }
        long jDraadjrbmk = this.f9694ojitshcjhn - ((long) ((ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(this.f9690gtknphoqwx)).draadjrbmk());
        int i13 = this.f9688dxjokdxxww.f9652iobyxmoadg;
        int i14 = this.f9693nufgyqmvbu.f9652iobyxmoadg;
        return i13 == i14 ? stevsuqkhv.b(j13, jDraadjrbmk, this.f9696rgvfuqvkyq) : stevsuqkhv.b(j13, jDraadjrbmk * ((long) i13), this.f9696rgvfuqvkyq * ((long) i14));
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean wkgbmnqykc() {
        ppxfxbqfkf ppxfxbqfkfVar;
        return this.f9697vdvldrhtss && ((ppxfxbqfkfVar = this.f9690gtknphoqwx) == null || ppxfxbqfkfVar.gtknphoqwx() == 0);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void zoijcleaow() {
        this.f9699wkgbmnqykc = 1.0f;
        this.f9689eablkybsjg = 1.0f;
        AudioProcessor.iobyxmoadg iobyxmoadgVar = AudioProcessor.iobyxmoadg.f9651eablkybsjg;
        this.f9691gxszxtbevo = iobyxmoadgVar;
        this.f9692lqeggnwhkg = iobyxmoadgVar;
        this.f9693nufgyqmvbu = iobyxmoadgVar;
        this.f9688dxjokdxxww = iobyxmoadgVar;
        ByteBuffer byteBuffer = AudioProcessor.f9649iobyxmoadg;
        this.f9687draadjrbmk = byteBuffer;
        this.f9698wflxmlrfwp = byteBuffer.asShortBuffer();
        this.f9685agtfadlqog = byteBuffer;
        this.f9695ppxfxbqfkf = -1;
        this.f9686btonecajqb = false;
        this.f9690gtknphoqwx = null;
        this.f9694ojitshcjhn = 0L;
        this.f9696rgvfuqvkyq = 0L;
        this.f9697vdvldrhtss = false;
    }

    wkgbmnqykc(boolean z13) {
        this.f9699wkgbmnqykc = 1.0f;
        this.f9689eablkybsjg = 1.0f;
        AudioProcessor.iobyxmoadg iobyxmoadgVar = AudioProcessor.iobyxmoadg.f9651eablkybsjg;
        this.f9691gxszxtbevo = iobyxmoadgVar;
        this.f9692lqeggnwhkg = iobyxmoadgVar;
        this.f9693nufgyqmvbu = iobyxmoadgVar;
        this.f9688dxjokdxxww = iobyxmoadgVar;
        ByteBuffer byteBuffer = AudioProcessor.f9649iobyxmoadg;
        this.f9687draadjrbmk = byteBuffer;
        this.f9698wflxmlrfwp = byteBuffer.asShortBuffer();
        this.f9685agtfadlqog = byteBuffer;
        this.f9695ppxfxbqfkf = -1;
        this.f9700zoijcleaow = z13;
    }
}
