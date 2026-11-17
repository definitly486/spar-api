package androidx.media3.exoplayer.mediacodec;

import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class gxszxtbevo extends DecoderInputBuffer {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f10830cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private long f10831istkbnxepw;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f10832yadqdtsiqt;

    public gxszxtbevo() {
        super(2);
        this.f10832yadqdtsiqt = 32;
    }

    private boolean iwizpuwonk(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!pmvmpeiblj()) {
            return true;
        }
        if (this.f10830cdpycssgdh >= this.f10832yadqdtsiqt) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f10021iwizpuwonk;
        return byteBuffer2 == null || (byteBuffer = this.f10021iwizpuwonk) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long cqumvgiudr() {
        return this.f10020esjtqupxsv;
    }

    public long esjtqupxsv() {
        return this.f10831istkbnxepw;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer, e3.iobyxmoadg
    public void gxszxtbevo() {
        super.gxszxtbevo();
        this.f10830cdpycssgdh = 0;
    }

    public boolean jyumaefscl(DecoderInputBuffer decoderInputBuffer) {
        y2.iobyxmoadg.iobyxmoadg(!decoderInputBuffer.oxmwwwfdhm());
        y2.iobyxmoadg.iobyxmoadg(!decoderInputBuffer.nufgyqmvbu());
        y2.iobyxmoadg.iobyxmoadg(!decoderInputBuffer.dxjokdxxww());
        if (!iwizpuwonk(decoderInputBuffer)) {
            return false;
        }
        int i13 = this.f10830cdpycssgdh;
        this.f10830cdpycssgdh = i13 + 1;
        if (i13 == 0) {
            this.f10020esjtqupxsv = decoderInputBuffer.f10020esjtqupxsv;
            if (decoderInputBuffer.gtknphoqwx()) {
                agtfadlqog(1);
            }
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f10021iwizpuwonk;
        if (byteBuffer != null) {
            rgvfuqvkyq(byteBuffer.remaining());
            this.f10021iwizpuwonk.put(byteBuffer);
        }
        this.f10831istkbnxepw = decoderInputBuffer.f10020esjtqupxsv;
        return true;
    }

    public int lereixgezr() {
        return this.f10830cdpycssgdh;
    }

    public boolean pmvmpeiblj() {
        return this.f10830cdpycssgdh > 0;
    }

    public void zynmafqrjb(int i13) {
        y2.iobyxmoadg.iobyxmoadg(i13 > 0);
        this.f10832yadqdtsiqt = i13;
    }
}
