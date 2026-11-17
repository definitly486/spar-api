package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class agtfadlqog extends androidx.media3.common.audio.zoijcleaow {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final int f10201dxjokdxxww = Float.floatToIntBits(Float.NaN);

    agtfadlqog() {
    }

    private static void wflxmlrfwp(int i13, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i13) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f10201dxjokdxxww) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void gxszxtbevo(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDraadjrbmk;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i13 = iLimit - iPosition;
        int i14 = this.f9707zoijcleaow.f9653ppxfxbqfkf;
        if (i14 == 21) {
            byteBufferDraadjrbmk = draadjrbmk((i13 / 3) * 4);
            while (iPosition < iLimit) {
                wflxmlrfwp(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferDraadjrbmk);
                iPosition += 3;
            }
        } else if (i14 == 22) {
            byteBufferDraadjrbmk = draadjrbmk(i13);
            while (iPosition < iLimit) {
                wflxmlrfwp((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferDraadjrbmk);
                iPosition += 4;
            }
        } else if (i14 == 1342177280) {
            byteBufferDraadjrbmk = draadjrbmk((i13 / 3) * 4);
            while (iPosition < iLimit) {
                wflxmlrfwp(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferDraadjrbmk);
                iPosition += 3;
            }
        } else {
            if (i14 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferDraadjrbmk = draadjrbmk(i13);
            while (iPosition < iLimit) {
                wflxmlrfwp((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferDraadjrbmk);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferDraadjrbmk.flip();
    }

    @Override // androidx.media3.common.audio.zoijcleaow
    public AudioProcessor.iobyxmoadg ppxfxbqfkf(AudioProcessor.iobyxmoadg iobyxmoadgVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i13 = iobyxmoadgVar.f9653ppxfxbqfkf;
        if (stevsuqkhv.dvvnrvtcbc(i13)) {
            return i13 != 4 ? new AudioProcessor.iobyxmoadg(iobyxmoadgVar.f9652iobyxmoadg, iobyxmoadgVar.f9655zoijcleaow, 4) : AudioProcessor.iobyxmoadg.f9651eablkybsjg;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(iobyxmoadgVar);
    }
}
