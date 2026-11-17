package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.util.Arrays;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class nufgyqmvbu extends androidx.media3.common.audio.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int[] f10279btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int[] f10280dxjokdxxww;

    nufgyqmvbu() {
    }

    @Override // androidx.media3.common.audio.zoijcleaow
    protected void dxjokdxxww() {
        this.f10279btonecajqb = this.f10280dxjokdxxww;
    }

    @Override // androidx.media3.common.audio.zoijcleaow
    protected void gtknphoqwx() {
        this.f10279btonecajqb = null;
        this.f10280dxjokdxxww = null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void gxszxtbevo(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) y2.iobyxmoadg.eablkybsjg(this.f10279btonecajqb);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferDraadjrbmk = draadjrbmk(((iLimit - iPosition) / this.f9707zoijcleaow.f9654wkgbmnqykc) * this.f9705ppxfxbqfkf.f9654wkgbmnqykc);
        while (iPosition < iLimit) {
            for (int i13 : iArr) {
                int iWypolnanlu = (stevsuqkhv.wypolnanlu(this.f9707zoijcleaow.f9653ppxfxbqfkf) * i13) + iPosition;
                int i14 = this.f9707zoijcleaow.f9653ppxfxbqfkf;
                if (i14 == 2) {
                    byteBufferDraadjrbmk.putShort(byteBuffer.getShort(iWypolnanlu));
                } else {
                    if (i14 != 4) {
                        throw new IllegalStateException("Unexpected encoding: " + this.f9707zoijcleaow.f9653ppxfxbqfkf);
                    }
                    byteBufferDraadjrbmk.putFloat(byteBuffer.getFloat(iWypolnanlu));
                }
            }
            iPosition += this.f9707zoijcleaow.f9654wkgbmnqykc;
        }
        byteBuffer.position(iLimit);
        byteBufferDraadjrbmk.flip();
    }

    @Override // androidx.media3.common.audio.zoijcleaow
    public AudioProcessor.iobyxmoadg ppxfxbqfkf(AudioProcessor.iobyxmoadg iobyxmoadgVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f10280dxjokdxxww;
        if (iArr == null) {
            return AudioProcessor.iobyxmoadg.f9651eablkybsjg;
        }
        int i13 = iobyxmoadgVar.f9653ppxfxbqfkf;
        if (i13 != 2 && i13 != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(iobyxmoadgVar);
        }
        boolean z13 = iobyxmoadgVar.f9655zoijcleaow != iArr.length;
        int i14 = 0;
        while (i14 < iArr.length) {
            int i15 = iArr[i14];
            if (i15 >= iobyxmoadgVar.f9655zoijcleaow) {
                throw new AudioProcessor.UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", iobyxmoadgVar);
            }
            z13 |= i15 != i14;
            i14++;
        }
        return z13 ? new AudioProcessor.iobyxmoadg(iobyxmoadgVar.f9652iobyxmoadg, iArr.length, iobyxmoadgVar.f9653ppxfxbqfkf) : AudioProcessor.iobyxmoadg.f9651eablkybsjg;
    }

    public void wflxmlrfwp(int[] iArr) {
        this.f10280dxjokdxxww = iArr;
    }
}
