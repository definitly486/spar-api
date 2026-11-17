package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class ojitshcjhn extends androidx.media3.common.audio.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f10281agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f10282btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f10283draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f10284dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f10285gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private long f10286ojitshcjhn;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private byte[] f10287wflxmlrfwp = stevsuqkhv.f123601gxszxtbevo;

    public void agtfadlqog() {
        this.f10286ojitshcjhn = 0L;
    }

    @Override // androidx.media3.common.audio.zoijcleaow
    protected void btonecajqb() {
        if (this.f10285gtknphoqwx) {
            int i13 = this.f10281agtfadlqog;
            if (i13 > 0) {
                this.f10286ojitshcjhn += (long) (i13 / this.f9707zoijcleaow.f9654wkgbmnqykc);
            }
            this.f10281agtfadlqog = 0;
        }
    }

    @Override // androidx.media3.common.audio.zoijcleaow
    protected void dxjokdxxww() {
        if (this.f10285gtknphoqwx) {
            this.f10285gtknphoqwx = false;
            int i13 = this.f10282btonecajqb;
            int i14 = this.f9707zoijcleaow.f9654wkgbmnqykc;
            this.f10287wflxmlrfwp = new byte[i13 * i14];
            this.f10283draadjrbmk = this.f10284dxjokdxxww * i14;
        }
        this.f10281agtfadlqog = 0;
    }

    @Override // androidx.media3.common.audio.zoijcleaow, androidx.media3.common.audio.AudioProcessor
    public ByteBuffer eablkybsjg() {
        int i13;
        if (super.wkgbmnqykc() && (i13 = this.f10281agtfadlqog) > 0) {
            draadjrbmk(i13).put(this.f10287wflxmlrfwp, 0, this.f10281agtfadlqog).flip();
            this.f10281agtfadlqog = 0;
        }
        return super.eablkybsjg();
    }

    @Override // androidx.media3.common.audio.zoijcleaow
    protected void gtknphoqwx() {
        this.f10287wflxmlrfwp = stevsuqkhv.f123601gxszxtbevo;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void gxszxtbevo(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i13 = iLimit - iPosition;
        if (i13 == 0) {
            return;
        }
        int iMin = Math.min(i13, this.f10283draadjrbmk);
        this.f10286ojitshcjhn += (long) (iMin / this.f9707zoijcleaow.f9654wkgbmnqykc);
        this.f10283draadjrbmk -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f10283draadjrbmk > 0) {
            return;
        }
        int i14 = i13 - iMin;
        int length = (this.f10281agtfadlqog + i14) - this.f10287wflxmlrfwp.length;
        ByteBuffer byteBufferDraadjrbmk = draadjrbmk(length);
        int iOjitshcjhn = stevsuqkhv.ojitshcjhn(length, 0, this.f10281agtfadlqog);
        byteBufferDraadjrbmk.put(this.f10287wflxmlrfwp, 0, iOjitshcjhn);
        int iOjitshcjhn2 = stevsuqkhv.ojitshcjhn(length - iOjitshcjhn, 0, i14);
        byteBuffer.limit(byteBuffer.position() + iOjitshcjhn2);
        byteBufferDraadjrbmk.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i15 = i14 - iOjitshcjhn2;
        int i16 = this.f10281agtfadlqog - iOjitshcjhn;
        this.f10281agtfadlqog = i16;
        byte[] bArr = this.f10287wflxmlrfwp;
        System.arraycopy(bArr, iOjitshcjhn, bArr, 0, i16);
        byteBuffer.get(this.f10287wflxmlrfwp, this.f10281agtfadlqog, i15);
        this.f10281agtfadlqog += i15;
        byteBufferDraadjrbmk.flip();
    }

    public void ojitshcjhn(int i13, int i14) {
        this.f10284dxjokdxxww = i13;
        this.f10282btonecajqb = i14;
    }

    @Override // androidx.media3.common.audio.zoijcleaow
    public AudioProcessor.iobyxmoadg ppxfxbqfkf(AudioProcessor.iobyxmoadg iobyxmoadgVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i13 = iobyxmoadgVar.f9653ppxfxbqfkf;
        if (i13 != 2 && i13 != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(iobyxmoadgVar);
        }
        this.f10285gtknphoqwx = true;
        return (this.f10284dxjokdxxww == 0 && this.f10282btonecajqb == 0) ? AudioProcessor.iobyxmoadg.f9651eablkybsjg : iobyxmoadgVar;
    }

    public long wflxmlrfwp() {
        return this.f10286ojitshcjhn;
    }

    @Override // androidx.media3.common.audio.zoijcleaow, androidx.media3.common.audio.AudioProcessor
    public boolean wkgbmnqykc() {
        return super.wkgbmnqykc() && this.f10281agtfadlqog == 0;
    }
}
