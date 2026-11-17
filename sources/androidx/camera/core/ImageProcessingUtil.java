package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import istkbnxepw.cllcsxoeiz;
import java.nio.ByteBuffer;
import java.util.Locale;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageProcessingUtil {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static int f3657iobyxmoadg;

    enum iobyxmoadg {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void agtfadlqog(agtfadlqog agtfadlqogVar, agtfadlqog agtfadlqogVar2, agtfadlqog agtfadlqogVar3) {
        if (agtfadlqogVar == null || agtfadlqogVar2 == null) {
            return;
        }
        agtfadlqogVar2.close();
    }

    public static void btonecajqb(Bitmap bitmap, ByteBuffer byteBuffer, int i13) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i13, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    private static boolean draadjrbmk(agtfadlqog agtfadlqogVar) {
        return agtfadlqogVar.getFormat() == 35 && agtfadlqogVar.eslsurpljm().length == 3;
    }

    public static void dxjokdxxww(Bitmap bitmap, ByteBuffer byteBuffer, int i13) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i13, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static agtfadlqog eablkybsjg(cllcsxoeiz cllcsxoeizVar, byte[] bArr) {
        u1.nufgyqmvbu.iobyxmoadg(cllcsxoeizVar.wkgbmnqykc() == 256);
        u1.nufgyqmvbu.gxszxtbevo(bArr);
        Surface surfaceIobyxmoadg = cllcsxoeizVar.iobyxmoadg();
        u1.nufgyqmvbu.gxszxtbevo(surfaceIobyxmoadg);
        if (nativeWriteJpegToSurface(bArr, surfaceIobyxmoadg) != 0) {
            sopmlzcsov.ppxfxbqfkf("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        agtfadlqog agtfadlqogVarPpxfxbqfkf = cllcsxoeizVar.ppxfxbqfkf();
        if (agtfadlqogVarPpxfxbqfkf == null) {
            sopmlzcsov.ppxfxbqfkf("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return agtfadlqogVarPpxfxbqfkf;
    }

    private static boolean gtknphoqwx(int i13) {
        return i13 == 0 || i13 == 90 || i13 == 180 || i13 == 270;
    }

    public static Bitmap gxszxtbevo(agtfadlqog agtfadlqogVar) {
        if (agtfadlqogVar.getFormat() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = agtfadlqogVar.getWidth();
        int height = agtfadlqogVar.getHeight();
        int iPpxfxbqfkf = agtfadlqogVar.eslsurpljm()[0].ppxfxbqfkf();
        int iPpxfxbqfkf2 = agtfadlqogVar.eslsurpljm()[1].ppxfxbqfkf();
        int iPpxfxbqfkf3 = agtfadlqogVar.eslsurpljm()[2].ppxfxbqfkf();
        int iWkgbmnqykc = agtfadlqogVar.eslsurpljm()[0].wkgbmnqykc();
        int iWkgbmnqykc2 = agtfadlqogVar.eslsurpljm()[1].wkgbmnqykc();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(agtfadlqogVar.getWidth(), agtfadlqogVar.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(agtfadlqogVar.eslsurpljm()[0].zoijcleaow(), iPpxfxbqfkf, agtfadlqogVar.eslsurpljm()[1].zoijcleaow(), iPpxfxbqfkf2, agtfadlqogVar.eslsurpljm()[2].zoijcleaow(), iPpxfxbqfkf3, iWkgbmnqykc, iWkgbmnqykc2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static agtfadlqog lqeggnwhkg(final agtfadlqog agtfadlqogVar, cllcsxoeiz cllcsxoeizVar, ByteBuffer byteBuffer, int i13, boolean z13) {
        if (!draadjrbmk(agtfadlqogVar)) {
            sopmlzcsov.ppxfxbqfkf("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!gtknphoqwx(i13)) {
            sopmlzcsov.ppxfxbqfkf("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (nufgyqmvbu(agtfadlqogVar, cllcsxoeizVar.iobyxmoadg(), byteBuffer, i13, z13) == iobyxmoadg.ERROR_CONVERSION) {
            sopmlzcsov.ppxfxbqfkf("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            sopmlzcsov.iobyxmoadg("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(f3657iobyxmoadg)));
            f3657iobyxmoadg++;
        }
        final agtfadlqog agtfadlqogVarPpxfxbqfkf = cllcsxoeizVar.ppxfxbqfkf();
        if (agtfadlqogVarPpxfxbqfkf == null) {
            sopmlzcsov.ppxfxbqfkf("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(agtfadlqogVarPpxfxbqfkf);
        kcexrzcfytVar.iobyxmoadg(new eablkybsjg.iobyxmoadg() { // from class: lereixgezr.wypolnanlu
            @Override // androidx.camera.core.eablkybsjg.iobyxmoadg
            public final void zoijcleaow(androidx.camera.core.agtfadlqog agtfadlqogVar2) {
                ImageProcessingUtil.wflxmlrfwp(agtfadlqogVarPpxfxbqfkf, agtfadlqogVar, agtfadlqogVar2);
            }
        });
        return kcexrzcfytVar;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, int i16, int i17, Surface surface, ByteBuffer byteBuffer4, int i18, int i19, int i23, int i24, int i25, int i26);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, int i16, int i17, Bitmap bitmap, int i18, int i19, int i23);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i13, int i14, int i15, int i16, boolean z13);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, int i16, ByteBuffer byteBuffer4, int i17, int i18, ByteBuffer byteBuffer5, int i19, int i23, ByteBuffer byteBuffer6, int i24, int i25, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i26, int i27, int i28);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, int i16, int i17, int i18, int i19, int i23, int i24, int i25);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    private static iobyxmoadg nufgyqmvbu(agtfadlqog agtfadlqogVar, Surface surface, ByteBuffer byteBuffer, int i13, boolean z13) {
        int width = agtfadlqogVar.getWidth();
        int height = agtfadlqogVar.getHeight();
        int iPpxfxbqfkf = agtfadlqogVar.eslsurpljm()[0].ppxfxbqfkf();
        int iPpxfxbqfkf2 = agtfadlqogVar.eslsurpljm()[1].ppxfxbqfkf();
        int iPpxfxbqfkf3 = agtfadlqogVar.eslsurpljm()[2].ppxfxbqfkf();
        int iWkgbmnqykc = agtfadlqogVar.eslsurpljm()[0].wkgbmnqykc();
        int iWkgbmnqykc2 = agtfadlqogVar.eslsurpljm()[1].wkgbmnqykc();
        return nativeConvertAndroid420ToABGR(agtfadlqogVar.eslsurpljm()[0].zoijcleaow(), iPpxfxbqfkf, agtfadlqogVar.eslsurpljm()[1].zoijcleaow(), iPpxfxbqfkf2, agtfadlqogVar.eslsurpljm()[2].zoijcleaow(), iPpxfxbqfkf3, iWkgbmnqykc, iWkgbmnqykc2, surface, byteBuffer, width, height, z13 ? iWkgbmnqykc : 0, z13 ? iWkgbmnqykc2 : 0, z13 ? iWkgbmnqykc2 : 0, i13) != 0 ? iobyxmoadg.ERROR_CONVERSION : iobyxmoadg.SUCCESS;
    }

    public static agtfadlqog ojitshcjhn(final agtfadlqog agtfadlqogVar, cllcsxoeiz cllcsxoeizVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i13) {
        if (!draadjrbmk(agtfadlqogVar)) {
            sopmlzcsov.ppxfxbqfkf("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!gtknphoqwx(i13)) {
            sopmlzcsov.ppxfxbqfkf("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        iobyxmoadg iobyxmoadgVar = iobyxmoadg.ERROR_CONVERSION;
        if ((i13 > 0 ? rgvfuqvkyq(agtfadlqogVar, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i13) : iobyxmoadgVar) == iobyxmoadgVar) {
            sopmlzcsov.ppxfxbqfkf("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        final agtfadlqog agtfadlqogVarPpxfxbqfkf = cllcsxoeizVar.ppxfxbqfkf();
        if (agtfadlqogVarPpxfxbqfkf == null) {
            sopmlzcsov.ppxfxbqfkf("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
            return null;
        }
        kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(agtfadlqogVarPpxfxbqfkf);
        kcexrzcfytVar.iobyxmoadg(new eablkybsjg.iobyxmoadg() { // from class: lereixgezr.stevsuqkhv
            @Override // androidx.camera.core.eablkybsjg.iobyxmoadg
            public final void zoijcleaow(androidx.camera.core.agtfadlqog agtfadlqogVar2) {
                ImageProcessingUtil.agtfadlqog(agtfadlqogVarPpxfxbqfkf, agtfadlqogVar, agtfadlqogVar2);
            }
        });
        return kcexrzcfytVar;
    }

    public static boolean ppxfxbqfkf(agtfadlqog agtfadlqogVar) {
        if (!draadjrbmk(agtfadlqogVar)) {
            sopmlzcsov.ppxfxbqfkf("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        if (wkgbmnqykc(agtfadlqogVar) != iobyxmoadg.ERROR_CONVERSION) {
            return true;
        }
        sopmlzcsov.ppxfxbqfkf("ImageProcessingUtil", "One pixel shift for YUV failure");
        return false;
    }

    private static iobyxmoadg rgvfuqvkyq(agtfadlqog agtfadlqogVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i13) {
        int width = agtfadlqogVar.getWidth();
        int height = agtfadlqogVar.getHeight();
        int iPpxfxbqfkf = agtfadlqogVar.eslsurpljm()[0].ppxfxbqfkf();
        int iPpxfxbqfkf2 = agtfadlqogVar.eslsurpljm()[1].ppxfxbqfkf();
        int iPpxfxbqfkf3 = agtfadlqogVar.eslsurpljm()[2].ppxfxbqfkf();
        int iWkgbmnqykc = agtfadlqogVar.eslsurpljm()[1].wkgbmnqykc();
        Image imageZoijcleaow = wwaezpbzkn.iobyxmoadg.zoijcleaow(imageWriter);
        if (imageZoijcleaow != null && nativeRotateYUV(agtfadlqogVar.eslsurpljm()[0].zoijcleaow(), iPpxfxbqfkf, agtfadlqogVar.eslsurpljm()[1].zoijcleaow(), iPpxfxbqfkf2, agtfadlqogVar.eslsurpljm()[2].zoijcleaow(), iPpxfxbqfkf3, iWkgbmnqykc, imageZoijcleaow.getPlanes()[0].getBuffer(), imageZoijcleaow.getPlanes()[0].getRowStride(), imageZoijcleaow.getPlanes()[0].getPixelStride(), imageZoijcleaow.getPlanes()[1].getBuffer(), imageZoijcleaow.getPlanes()[1].getRowStride(), imageZoijcleaow.getPlanes()[1].getPixelStride(), imageZoijcleaow.getPlanes()[2].getBuffer(), imageZoijcleaow.getPlanes()[2].getRowStride(), imageZoijcleaow.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i13) == 0) {
            wwaezpbzkn.iobyxmoadg.wkgbmnqykc(imageWriter, imageZoijcleaow);
            return iobyxmoadg.SUCCESS;
        }
        return iobyxmoadg.ERROR_CONVERSION;
    }

    public static boolean vdvldrhtss(Surface surface, byte[] bArr) {
        u1.nufgyqmvbu.gxszxtbevo(bArr);
        u1.nufgyqmvbu.gxszxtbevo(surface);
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        sopmlzcsov.ppxfxbqfkf("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void wflxmlrfwp(agtfadlqog agtfadlqogVar, agtfadlqog agtfadlqogVar2, agtfadlqog agtfadlqogVar3) {
        if (agtfadlqogVar == null || agtfadlqogVar2 == null) {
            return;
        }
        agtfadlqogVar2.close();
    }

    private static iobyxmoadg wkgbmnqykc(agtfadlqog agtfadlqogVar) {
        int width = agtfadlqogVar.getWidth();
        int height = agtfadlqogVar.getHeight();
        int iPpxfxbqfkf = agtfadlqogVar.eslsurpljm()[0].ppxfxbqfkf();
        int iPpxfxbqfkf2 = agtfadlqogVar.eslsurpljm()[1].ppxfxbqfkf();
        int iPpxfxbqfkf3 = agtfadlqogVar.eslsurpljm()[2].ppxfxbqfkf();
        int iWkgbmnqykc = agtfadlqogVar.eslsurpljm()[0].wkgbmnqykc();
        int iWkgbmnqykc2 = agtfadlqogVar.eslsurpljm()[1].wkgbmnqykc();
        return nativeShiftPixel(agtfadlqogVar.eslsurpljm()[0].zoijcleaow(), iPpxfxbqfkf, agtfadlqogVar.eslsurpljm()[1].zoijcleaow(), iPpxfxbqfkf2, agtfadlqogVar.eslsurpljm()[2].zoijcleaow(), iPpxfxbqfkf3, iWkgbmnqykc, iWkgbmnqykc2, width, height, iWkgbmnqykc, iWkgbmnqykc2, iWkgbmnqykc2) != 0 ? iobyxmoadg.ERROR_CONVERSION : iobyxmoadg.SUCCESS;
    }
}
