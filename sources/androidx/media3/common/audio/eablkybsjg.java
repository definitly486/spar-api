package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import kotlin.KotlinVersion;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg extends zoijcleaow {
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // androidx.media3.common.audio.AudioProcessor
    public void gxszxtbevo(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i13 = iLimit - iPosition;
        int i14 = this.f9707zoijcleaow.f9653ppxfxbqfkf;
        if (i14 == 3) {
            i13 *= 2;
        } else if (i14 == 4) {
            i13 /= 2;
        } else {
            if (i14 != 21) {
                if (i14 == 22) {
                    i13 /= 2;
                } else if (i14 != 268435456) {
                    if (i14 != 1342177280) {
                        if (i14 != 1610612736) {
                            throw new IllegalStateException();
                        }
                        i13 /= 2;
                    }
                }
            }
            i13 /= 3;
            i13 *= 2;
        }
        ByteBuffer byteBufferDraadjrbmk = draadjrbmk(i13);
        int i15 = this.f9707zoijcleaow.f9653ppxfxbqfkf;
        if (i15 == 3) {
            while (iPosition < iLimit) {
                byteBufferDraadjrbmk.put((byte) 0);
                byteBufferDraadjrbmk.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i15 == 4) {
            while (iPosition < iLimit) {
                short sAgtfadlqog = (short) (stevsuqkhv.agtfadlqog(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferDraadjrbmk.put((byte) (sAgtfadlqog & 255));
                byteBufferDraadjrbmk.put((byte) ((sAgtfadlqog >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
                iPosition += 4;
            }
        } else if (i15 == 21) {
            while (iPosition < iLimit) {
                byteBufferDraadjrbmk.put(byteBuffer.get(iPosition + 1));
                byteBufferDraadjrbmk.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i15 == 22) {
            while (iPosition < iLimit) {
                byteBufferDraadjrbmk.put(byteBuffer.get(iPosition + 2));
                byteBufferDraadjrbmk.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i15 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferDraadjrbmk.put(byteBuffer.get(iPosition + 1));
                byteBufferDraadjrbmk.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i15 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferDraadjrbmk.put(byteBuffer.get(iPosition + 1));
                byteBufferDraadjrbmk.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i15 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferDraadjrbmk.put(byteBuffer.get(iPosition + 1));
                byteBufferDraadjrbmk.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferDraadjrbmk.flip();
    }

    @Override // androidx.media3.common.audio.zoijcleaow
    public AudioProcessor.iobyxmoadg ppxfxbqfkf(AudioProcessor.iobyxmoadg iobyxmoadgVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i13 = iobyxmoadgVar.f9653ppxfxbqfkf;
        if (i13 == 3 || i13 == 2 || i13 == 268435456 || i13 == 21 || i13 == 1342177280 || i13 == 22 || i13 == 1610612736 || i13 == 4) {
            return i13 != 2 ? new AudioProcessor.iobyxmoadg(iobyxmoadgVar.f9652iobyxmoadg, iobyxmoadgVar.f9655zoijcleaow, 2) : AudioProcessor.iobyxmoadg.f9651eablkybsjg;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(iobyxmoadgVar);
    }
}
