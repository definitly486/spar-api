package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow implements AudioProcessor {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private AudioProcessor.iobyxmoadg f9701eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private ByteBuffer f9702gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private ByteBuffer f9703lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f9704nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    protected AudioProcessor.iobyxmoadg f9705ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private AudioProcessor.iobyxmoadg f9706wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected AudioProcessor.iobyxmoadg f9707zoijcleaow;

    public zoijcleaow() {
        ByteBuffer byteBuffer = AudioProcessor.f9649iobyxmoadg;
        this.f9702gxszxtbevo = byteBuffer;
        this.f9703lqeggnwhkg = byteBuffer;
        AudioProcessor.iobyxmoadg iobyxmoadgVar = AudioProcessor.iobyxmoadg.f9651eablkybsjg;
        this.f9706wkgbmnqykc = iobyxmoadgVar;
        this.f9701eablkybsjg = iobyxmoadgVar;
        this.f9707zoijcleaow = iobyxmoadgVar;
        this.f9705ppxfxbqfkf = iobyxmoadgVar;
    }

    protected void btonecajqb() {
    }

    protected final ByteBuffer draadjrbmk(int i13) {
        if (this.f9702gxszxtbevo.capacity() < i13) {
            this.f9702gxszxtbevo = ByteBuffer.allocateDirect(i13).order(ByteOrder.nativeOrder());
        } else {
            this.f9702gxszxtbevo.clear();
        }
        ByteBuffer byteBuffer = this.f9702gxszxtbevo;
        this.f9703lqeggnwhkg = byteBuffer;
        return byteBuffer;
    }

    protected void dxjokdxxww() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer eablkybsjg() {
        ByteBuffer byteBuffer = this.f9703lqeggnwhkg;
        this.f9703lqeggnwhkg = AudioProcessor.f9649iobyxmoadg;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f9703lqeggnwhkg = AudioProcessor.f9649iobyxmoadg;
        this.f9704nufgyqmvbu = false;
        this.f9707zoijcleaow = this.f9706wkgbmnqykc;
        this.f9705ppxfxbqfkf = this.f9701eablkybsjg;
        dxjokdxxww();
    }

    protected void gtknphoqwx() {
    }

    protected final boolean iobyxmoadg() {
        return this.f9703lqeggnwhkg.hasRemaining();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.f9701eablkybsjg != AudioProcessor.iobyxmoadg.f9651eablkybsjg;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void lqeggnwhkg() {
        this.f9704nufgyqmvbu = true;
        btonecajqb();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.iobyxmoadg nufgyqmvbu(AudioProcessor.iobyxmoadg iobyxmoadgVar) {
        this.f9706wkgbmnqykc = iobyxmoadgVar;
        this.f9701eablkybsjg = ppxfxbqfkf(iobyxmoadgVar);
        return isActive() ? this.f9701eablkybsjg : AudioProcessor.iobyxmoadg.f9651eablkybsjg;
    }

    protected abstract AudioProcessor.iobyxmoadg ppxfxbqfkf(AudioProcessor.iobyxmoadg iobyxmoadgVar);

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean wkgbmnqykc() {
        return this.f9704nufgyqmvbu && this.f9703lqeggnwhkg == AudioProcessor.f9649iobyxmoadg;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void zoijcleaow() {
        flush();
        this.f9702gxszxtbevo = AudioProcessor.f9649iobyxmoadg;
        AudioProcessor.iobyxmoadg iobyxmoadgVar = AudioProcessor.iobyxmoadg.f9651eablkybsjg;
        this.f9706wkgbmnqykc = iobyxmoadgVar;
        this.f9701eablkybsjg = iobyxmoadgVar;
        this.f9707zoijcleaow = iobyxmoadgVar;
        this.f9705ppxfxbqfkf = iobyxmoadgVar;
        gtknphoqwx();
    }
}
