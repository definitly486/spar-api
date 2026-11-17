package ne;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.mlkit.common.MlKitException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ppxfxbqfkf f69797iobyxmoadg = new ppxfxbqfkf();

    private ppxfxbqfkf() {
    }

    public static Bitmap btonecajqb(Bitmap bitmap, int i13, int i14, int i15) {
        if (i13 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i14, i15);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i13);
        return Bitmap.createBitmap(bitmap, 0, 0, i14, i15, matrix, true);
    }

    private static final void draadjrbmk(Image.Plane plane, int i13, int i14, byte[] bArr, int i15, int i16) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int iLimit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (iLimit == 0) {
            return;
        }
        int i17 = i13 / (i14 / iLimit);
        int rowStride = 0;
        for (int i18 = 0; i18 < iLimit; i18++) {
            int pixelStride = rowStride;
            for (int i19 = 0; i19 < i17; i19++) {
                bArr[i15] = buffer.get(pixelStride);
                i15 += i16;
                pixelStride += plane.getPixelStride();
            }
            rowStride += plane.getRowStride();
        }
    }

    public static ByteBuffer dxjokdxxww(ByteBuffer byteBuffer, boolean z13) {
        int i13;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i14 = iLimit / 6;
        ByteBuffer byteBufferAllocate = z13 ? ByteBuffer.allocate(iLimit) : ByteBuffer.allocateDirect(iLimit);
        int i15 = 0;
        while (true) {
            i13 = i14 * 4;
            if (i15 >= i13) {
                break;
            }
            byteBufferAllocate.put(i15, byteBuffer.get(i15));
            i15++;
        }
        for (int i16 = 0; i16 < i14 + i14; i16++) {
            byteBufferAllocate.put(i13 + i16, byteBuffer.get(((i16 % 2) * i14) + i13 + (i16 / 2)));
        }
        return byteBufferAllocate;
    }

    public static ppxfxbqfkf eablkybsjg() {
        return f69797iobyxmoadg;
    }

    private static byte[] gtknphoqwx(byte[] bArr, int i13, int i14) throws MlKitException {
        YuvImage yuvImage = new YuvImage(bArr, 17, i13, i14, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i13, i14), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException e13) {
            Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new MlKitException("Image conversion error from NV21 format", 13, e13);
        }
    }

    public static ByteBuffer iobyxmoadg(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    public static Bitmap nufgyqmvbu(ByteBuffer byteBuffer, int i13, int i14, int i15) throws MlKitException {
        byte[] bArrGtknphoqwx = gtknphoqwx(dxjokdxxww(byteBuffer, true).array(), i13, i14);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrGtknphoqwx, 0, bArrGtknphoqwx.length);
        return btonecajqb(bitmapDecodeByteArray, i15, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public Bitmap gxszxtbevo(ByteBuffer byteBuffer, int i13, int i14, int i15) throws MlKitException {
        byte[] bArrGtknphoqwx = gtknphoqwx(zoijcleaow(byteBuffer), i13, i14);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrGtknphoqwx, 0, bArrGtknphoqwx.length);
        return btonecajqb(bitmapDecodeByteArray, i15, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public ByteBuffer lqeggnwhkg(Image.Plane[] planeArr, int i13, int i14) {
        int i15 = i13 * i14;
        int i16 = i15 / 4;
        byte[] bArr = new byte[i16 + i16 + i15];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i17 = (i15 + i15) / 4;
        boolean z13 = buffer2.remaining() == i17 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z13) {
            planeArr[0].getBuffer().get(bArr, 0, i15);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i15, 1);
            buffer3.get(bArr, i15 + 1, i17 - 1);
        } else {
            draadjrbmk(planeArr[0], i13, i14, bArr, 0, 1);
            draadjrbmk(planeArr[1], i13, i14, bArr, i15 + 1, 2);
            draadjrbmk(planeArr[2], i13, i14, bArr, i15, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    public ByteBuffer ppxfxbqfkf(me.iobyxmoadg iobyxmoadgVar, boolean z13) throws MlKitException {
        int iEablkybsjg = iobyxmoadgVar.eablkybsjg();
        if (iEablkybsjg != -1) {
            if (iEablkybsjg == 17) {
                return z13 ? iobyxmoadg((ByteBuffer) Preconditions.checkNotNull(iobyxmoadgVar.ppxfxbqfkf())) : (ByteBuffer) Preconditions.checkNotNull(iobyxmoadgVar.ppxfxbqfkf());
            }
            if (iEablkybsjg == 35) {
                return lqeggnwhkg((Image.Plane[]) Preconditions.checkNotNull(iobyxmoadgVar.nufgyqmvbu()), iobyxmoadgVar.btonecajqb(), iobyxmoadgVar.gxszxtbevo());
            }
            if (iEablkybsjg == 842094169) {
                return dxjokdxxww((ByteBuffer) Preconditions.checkNotNull(iobyxmoadgVar.ppxfxbqfkf()), z13);
            }
            throw new MlKitException("Unsupported image format", 13);
        }
        Bitmap bitmapCopy = (Bitmap) Preconditions.checkNotNull(iobyxmoadgVar.zoijcleaow());
        if (bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i13 = width * height;
        int[] iArr = new int[i13];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        int iCeil2 = ((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i13;
        ByteBuffer byteBufferAllocate = z13 ? ByteBuffer.allocate(iCeil2) : ByteBuffer.allocateDirect(iCeil2);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < height; i16++) {
            int i17 = 0;
            while (i17 < width) {
                int i18 = iArr[i15];
                int i19 = i18 >> 16;
                int i23 = i18 >> 8;
                int i24 = i18 & KotlinVersion.MAX_COMPONENT_VALUE;
                int i25 = i14 + 1;
                int i26 = i19 & KotlinVersion.MAX_COMPONENT_VALUE;
                int i27 = i23 & KotlinVersion.MAX_COMPONENT_VALUE;
                byteBufferAllocate.put(i14, (byte) Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (((((i26 * 66) + (i27 * 129)) + (i24 * 25)) + UserVerificationMethods.USER_VERIFY_PATTERN) >> 8) + 16));
                if (i16 % 2 == 0 && i15 % 2 == 0) {
                    int i28 = ((((i26 * 112) - (i27 * 94)) - (i24 * 18)) + UserVerificationMethods.USER_VERIFY_PATTERN) >> 8;
                    int i29 = ((((i26 * (-38)) - (i27 * 74)) + (i24 * 112)) + UserVerificationMethods.USER_VERIFY_PATTERN) >> 8;
                    int i33 = i28 + UserVerificationMethods.USER_VERIFY_PATTERN;
                    int i34 = i29 + UserVerificationMethods.USER_VERIFY_PATTERN;
                    int i35 = i13 + 1;
                    byteBufferAllocate.put(i13, (byte) Math.min(KotlinVersion.MAX_COMPONENT_VALUE, i33));
                    i13 += 2;
                    byteBufferAllocate.put(i35, (byte) Math.min(KotlinVersion.MAX_COMPONENT_VALUE, i34));
                }
                i15++;
                i17++;
                i14 = i25;
            }
        }
        return byteBufferAllocate;
    }

    public Bitmap wkgbmnqykc(me.iobyxmoadg iobyxmoadgVar) throws MlKitException {
        int iEablkybsjg = iobyxmoadgVar.eablkybsjg();
        if (iEablkybsjg == -1) {
            return btonecajqb((Bitmap) Preconditions.checkNotNull(iobyxmoadgVar.zoijcleaow()), iobyxmoadgVar.dxjokdxxww(), iobyxmoadgVar.btonecajqb(), iobyxmoadgVar.gxszxtbevo());
        }
        if (iEablkybsjg == 17) {
            return gxszxtbevo((ByteBuffer) Preconditions.checkNotNull(iobyxmoadgVar.ppxfxbqfkf()), iobyxmoadgVar.btonecajqb(), iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.dxjokdxxww());
        }
        if (iEablkybsjg == 35) {
            return gxszxtbevo(lqeggnwhkg((Image.Plane[]) Preconditions.checkNotNull(iobyxmoadgVar.nufgyqmvbu()), iobyxmoadgVar.btonecajqb(), iobyxmoadgVar.gxszxtbevo()), iobyxmoadgVar.btonecajqb(), iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.dxjokdxxww());
        }
        if (iEablkybsjg == 842094169) {
            return nufgyqmvbu((ByteBuffer) Preconditions.checkNotNull(iobyxmoadgVar.ppxfxbqfkf()), iobyxmoadgVar.btonecajqb(), iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.dxjokdxxww());
        }
        throw new MlKitException("Unsupported image format", 13);
    }

    public byte[] zoijcleaow(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        return bArr;
    }
}
