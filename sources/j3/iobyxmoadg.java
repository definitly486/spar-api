package j3;

import android.graphics.Bitmap;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.hszhottldk;
import androidx.media3.exoplayer.image.ImageDecoderException;
import e3.gxszxtbevo;
import java.io.IOException;
import java.nio.ByteBuffer;
import v2.iwizpuwonk;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg extends gxszxtbevo implements j3.ppxfxbqfkf {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final zoijcleaow f50599ojitshcjhn;

    /* JADX INFO: renamed from: j3.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C1085iobyxmoadg extends wkgbmnqykc {
        C1085iobyxmoadg() {
        }

        @Override // e3.eablkybsjg
        public void ojitshcjhn() {
            iobyxmoadg.this.zdlpuopuiu(this);
        }
    }

    public static final class ppxfxbqfkf implements j3.ppxfxbqfkf.iobyxmoadg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final zoijcleaow f50601zoijcleaow = new zoijcleaow() { // from class: j3.zoijcleaow
            @Override // j3.iobyxmoadg.zoijcleaow
            public final Bitmap iobyxmoadg(byte[] bArr, int i13) {
                return iobyxmoadg.zynmafqrjb(bArr, i13);
            }
        };

        @Override // j3.ppxfxbqfkf.iobyxmoadg
        public int iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            String str = iobyxmoadgVar.f9769ojitshcjhn;
            if (str == null || !iwizpuwonk.ojitshcjhn(str)) {
                return hszhottldk.jyumaefscl(0);
            }
            return stevsuqkhv.iwxlajgraz(iobyxmoadgVar.f9769ojitshcjhn) ? hszhottldk.jyumaefscl(4) : hszhottldk.jyumaefscl(1);
        }

        @Override // j3.ppxfxbqfkf.iobyxmoadg
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg zoijcleaow() {
            return new iobyxmoadg(this.f50601zoijcleaow, null);
        }
    }

    public interface zoijcleaow {
        Bitmap iobyxmoadg(byte[] bArr, int i13);
    }

    /* synthetic */ iobyxmoadg(zoijcleaow zoijcleaowVar, C1085iobyxmoadg c1085iobyxmoadg) {
        this(zoijcleaowVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap zynmafqrjb(byte[] bArr, int i13) throws ImageDecoderException {
        try {
            return b3.zoijcleaow.iobyxmoadg(bArr, i13, null, -1);
        } catch (ParserException e13) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i13 + ")", e13);
        } catch (IOException e14) {
            throw new ImageDecoderException(e14);
        }
    }

    @Override // e3.gxszxtbevo
    protected DecoderInputBuffer dxjokdxxww() {
        return new DecoderInputBuffer(1);
    }

    @Override // e3.gxszxtbevo, e3.wkgbmnqykc
    public /* bridge */ /* synthetic */ wkgbmnqykc iobyxmoadg() {
        return (wkgbmnqykc) super.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e3.gxszxtbevo
    /* JADX INFO: renamed from: istkbnxepw, reason: merged with bridge method [inline-methods] */
    public ImageDecoderException draadjrbmk(DecoderInputBuffer decoderInputBuffer, wkgbmnqykc wkgbmnqykcVar, boolean z13) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) y2.iobyxmoadg.eablkybsjg(decoderInputBuffer.f10021iwizpuwonk);
            y2.iobyxmoadg.lqeggnwhkg(byteBuffer.hasArray());
            y2.iobyxmoadg.iobyxmoadg(byteBuffer.arrayOffset() == 0);
            wkgbmnqykcVar.f50603cqumvgiudr = this.f50599ojitshcjhn.iobyxmoadg(byteBuffer.array(), byteBuffer.remaining());
            wkgbmnqykcVar.f30239yggfygwlhe = decoderInputBuffer.f10020esjtqupxsv;
            return null;
        } catch (ImageDecoderException e13) {
            return e13;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e3.gxszxtbevo
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc btonecajqb() {
        return new C1085iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e3.gxszxtbevo
    /* JADX INFO: renamed from: pmvmpeiblj, reason: merged with bridge method [inline-methods] */
    public ImageDecoderException gtknphoqwx(Throwable th2) {
        return new ImageDecoderException("Unexpected decode error", th2);
    }

    private iobyxmoadg(zoijcleaow zoijcleaowVar) {
        super(new DecoderInputBuffer[1], new wkgbmnqykc[1]);
        this.f50599ojitshcjhn = zoijcleaowVar;
    }
}
