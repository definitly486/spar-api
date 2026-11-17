package h3;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.KotlinVersion;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class wwaezpbzkn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private ByteBuffer f39279iobyxmoadg = AudioProcessor.f9649iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f39280ppxfxbqfkf = 0;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f39281zoijcleaow = 2;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final byte[] f39278wkgbmnqykc = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final byte[] f39277eablkybsjg = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    private void eablkybsjg(ByteBuffer byteBuffer, byte[] bArr) {
        gxszxtbevo(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(com.google.common.primitives.dxjokdxxww.iobyxmoadg(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, stevsuqkhv.iwizpuwonk(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void gxszxtbevo(ByteBuffer byteBuffer, long j13, int i13, int i14, boolean z13) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z13 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j13);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i13);
        byteBuffer.putInt(0);
        byteBuffer.put(com.google.common.primitives.dxjokdxxww.iobyxmoadg(i14));
    }

    private ByteBuffer ppxfxbqfkf(int i13) {
        if (this.f39279iobyxmoadg.capacity() < i13) {
            this.f39279iobyxmoadg = ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f39279iobyxmoadg.clear();
        }
        return this.f39279iobyxmoadg;
    }

    private ByteBuffer zoijcleaow(ByteBuffer byteBuffer, byte[] bArr) {
        int i13;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i14 = iLimit - iPosition;
        int i15 = (i14 + KotlinVersion.MAX_COMPONENT_VALUE) / KotlinVersion.MAX_COMPONENT_VALUE;
        int length = i15 + 27 + i14;
        if (this.f39281zoijcleaow == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f39278wkgbmnqykc.length;
            length += f39277eablkybsjg.length + length2;
            i13 = length2;
        } else {
            i13 = 0;
        }
        ByteBuffer byteBufferPpxfxbqfkf = ppxfxbqfkf(length);
        if (this.f39281zoijcleaow == 2) {
            if (bArr != null) {
                eablkybsjg(byteBufferPpxfxbqfkf, bArr);
            } else {
                byteBufferPpxfxbqfkf.put(f39278wkgbmnqykc);
            }
            byteBufferPpxfxbqfkf.put(f39277eablkybsjg);
        }
        int iBtonecajqb = this.f39280ppxfxbqfkf + t3.wwaezpbzkn.btonecajqb(byteBuffer);
        this.f39280ppxfxbqfkf = iBtonecajqb;
        gxszxtbevo(byteBufferPpxfxbqfkf, iBtonecajqb, this.f39281zoijcleaow, i15, false);
        for (int i16 = 0; i16 < i15; i16++) {
            if (i14 >= 255) {
                byteBufferPpxfxbqfkf.put((byte) -1);
                i14 -= 255;
            } else {
                byteBufferPpxfxbqfkf.put((byte) i14);
                i14 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferPpxfxbqfkf.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferPpxfxbqfkf.flip();
        if (this.f39281zoijcleaow == 2) {
            byte[] bArrArray = byteBufferPpxfxbqfkf.array();
            int iArrayOffset = byteBufferPpxfxbqfkf.arrayOffset() + i13;
            byte[] bArr2 = f39277eablkybsjg;
            byteBufferPpxfxbqfkf.putInt(i13 + bArr2.length + 22, stevsuqkhv.iwizpuwonk(bArrArray, iArrayOffset + bArr2.length, byteBufferPpxfxbqfkf.limit() - byteBufferPpxfxbqfkf.position(), 0));
        } else {
            byteBufferPpxfxbqfkf.putInt(22, stevsuqkhv.iwizpuwonk(byteBufferPpxfxbqfkf.array(), byteBufferPpxfxbqfkf.arrayOffset(), byteBufferPpxfxbqfkf.limit() - byteBufferPpxfxbqfkf.position(), 0));
        }
        this.f39281zoijcleaow++;
        return byteBufferPpxfxbqfkf;
    }

    public void iobyxmoadg(DecoderInputBuffer decoderInputBuffer, List list) {
        y2.iobyxmoadg.eablkybsjg(decoderInputBuffer.f10021iwizpuwonk);
        if (decoderInputBuffer.f10021iwizpuwonk.limit() - decoderInputBuffer.f10021iwizpuwonk.position() == 0) {
            return;
        }
        this.f39279iobyxmoadg = zoijcleaow(decoderInputBuffer.f10021iwizpuwonk, (this.f39281zoijcleaow == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null);
        decoderInputBuffer.gxszxtbevo();
        decoderInputBuffer.rgvfuqvkyq(this.f39279iobyxmoadg.remaining());
        decoderInputBuffer.f10021iwizpuwonk.put(this.f39279iobyxmoadg);
        decoderInputBuffer.vdvldrhtss();
    }

    public void wkgbmnqykc() {
        this.f39279iobyxmoadg = AudioProcessor.f9649iobyxmoadg;
        this.f39280ppxfxbqfkf = 0;
        this.f39281zoijcleaow = 2;
    }
}
