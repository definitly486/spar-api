package androidx.camera.core.internal.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.agtfadlqog;
import cdpycssgdh.dxjokdxxww;
import cdpycssgdh.nufgyqmvbu;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageUtil {

    public static final class CodecFailedException extends Exception {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final iobyxmoadg f3925zdlpuopuiu;

        public enum iobyxmoadg {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        CodecFailedException(String str, iobyxmoadg iobyxmoadgVar) {
            super(str);
            this.f3925zdlpuopuiu = iobyxmoadgVar;
        }
    }

    public static byte[] btonecajqb(agtfadlqog agtfadlqogVar, Rect rect, int i13, int i14) throws CodecFailedException {
        if (agtfadlqogVar.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + agtfadlqogVar.getFormat());
        }
        YuvImage yuvImage = new YuvImage(gtknphoqwx(agtfadlqogVar), 17, agtfadlqogVar.getWidth(), agtfadlqogVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(byteArrayOutputStream, nufgyqmvbu.zoijcleaow(agtfadlqogVar, i14));
        if (rect == null) {
            rect = new Rect(0, 0, agtfadlqogVar.getWidth(), agtfadlqogVar.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i13, dxjokdxxwwVar)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new CodecFailedException("YuvImage failed to encode jpeg.", CodecFailedException.iobyxmoadg.ENCODE_FAILED);
    }

    public static Bitmap dxjokdxxww(Bitmap bitmap, int i13) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i13);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Rational eablkybsjg(int i13, Rational rational) {
        return (i13 == 90 || i13 == 270) ? gxszxtbevo(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static byte[] gtknphoqwx(agtfadlqog agtfadlqogVar) {
        agtfadlqog.iobyxmoadg iobyxmoadgVar = agtfadlqogVar.eslsurpljm()[0];
        agtfadlqog.iobyxmoadg iobyxmoadgVar2 = agtfadlqogVar.eslsurpljm()[1];
        agtfadlqog.iobyxmoadg iobyxmoadgVar3 = agtfadlqogVar.eslsurpljm()[2];
        ByteBuffer byteBufferZoijcleaow = iobyxmoadgVar.zoijcleaow();
        ByteBuffer byteBufferZoijcleaow2 = iobyxmoadgVar2.zoijcleaow();
        ByteBuffer byteBufferZoijcleaow3 = iobyxmoadgVar3.zoijcleaow();
        byteBufferZoijcleaow.rewind();
        byteBufferZoijcleaow2.rewind();
        byteBufferZoijcleaow3.rewind();
        int iRemaining = byteBufferZoijcleaow.remaining();
        byte[] bArr = new byte[((agtfadlqogVar.getWidth() * agtfadlqogVar.getHeight()) / 2) + iRemaining];
        int width = 0;
        for (int i13 = 0; i13 < agtfadlqogVar.getHeight(); i13++) {
            byteBufferZoijcleaow.get(bArr, width, agtfadlqogVar.getWidth());
            width += agtfadlqogVar.getWidth();
            byteBufferZoijcleaow.position(Math.min(iRemaining, (byteBufferZoijcleaow.position() - agtfadlqogVar.getWidth()) + iobyxmoadgVar.ppxfxbqfkf()));
        }
        int height = agtfadlqogVar.getHeight() / 2;
        int width2 = agtfadlqogVar.getWidth() / 2;
        int iPpxfxbqfkf = iobyxmoadgVar3.ppxfxbqfkf();
        int iPpxfxbqfkf2 = iobyxmoadgVar2.ppxfxbqfkf();
        int iWkgbmnqykc = iobyxmoadgVar3.wkgbmnqykc();
        int iWkgbmnqykc2 = iobyxmoadgVar2.wkgbmnqykc();
        byte[] bArr2 = new byte[iPpxfxbqfkf];
        byte[] bArr3 = new byte[iPpxfxbqfkf2];
        for (int i14 = 0; i14 < height; i14++) {
            byteBufferZoijcleaow3.get(bArr2, 0, Math.min(iPpxfxbqfkf, byteBufferZoijcleaow3.remaining()));
            byteBufferZoijcleaow2.get(bArr3, 0, Math.min(iPpxfxbqfkf2, byteBufferZoijcleaow2.remaining()));
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < width2; i17++) {
                int i18 = width + 1;
                bArr[width] = bArr2[i15];
                width += 2;
                bArr[i18] = bArr3[i16];
                i15 += iWkgbmnqykc;
                i16 += iWkgbmnqykc2;
            }
        }
        return bArr;
    }

    private static Rational gxszxtbevo(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static Bitmap iobyxmoadg(agtfadlqog agtfadlqogVar) {
        int format = agtfadlqogVar.getFormat();
        if (format == 1) {
            return ppxfxbqfkf(agtfadlqogVar);
        }
        if (format == 35) {
            return ImageProcessingUtil.gxszxtbevo(agtfadlqogVar);
        }
        if (format == 256 || format == 4101) {
            return zoijcleaow(agtfadlqogVar);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + agtfadlqogVar.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    public static boolean lqeggnwhkg(int i13) {
        return i13 == 256 || i13 == 4101;
    }

    public static byte[] nufgyqmvbu(agtfadlqog agtfadlqogVar) {
        if (!lqeggnwhkg(agtfadlqogVar.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + agtfadlqogVar.getFormat());
        }
        ByteBuffer byteBufferZoijcleaow = agtfadlqogVar.eslsurpljm()[0].zoijcleaow();
        byte[] bArr = new byte[byteBufferZoijcleaow.capacity()];
        byteBufferZoijcleaow.rewind();
        byteBufferZoijcleaow.get(bArr);
        return bArr;
    }

    private static Bitmap ppxfxbqfkf(agtfadlqog agtfadlqogVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(agtfadlqogVar.getWidth(), agtfadlqogVar.getHeight(), Bitmap.Config.ARGB_8888);
        agtfadlqogVar.eslsurpljm()[0].zoijcleaow().rewind();
        ImageProcessingUtil.btonecajqb(bitmapCreateBitmap, agtfadlqogVar.eslsurpljm()[0].zoijcleaow(), agtfadlqogVar.eslsurpljm()[0].ppxfxbqfkf());
        return bitmapCreateBitmap;
    }

    public static ByteBuffer wkgbmnqykc(Bitmap bitmap) {
        u1.nufgyqmvbu.zoijcleaow(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.dxjokdxxww(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    private static Bitmap zoijcleaow(agtfadlqog agtfadlqogVar) {
        byte[] bArrNufgyqmvbu = nufgyqmvbu(agtfadlqogVar);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrNufgyqmvbu, 0, bArrNufgyqmvbu.length, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }
}
