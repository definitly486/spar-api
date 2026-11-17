package wp1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.util.Size;
import gg.wwaezpbzkn;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {
    private static final boolean iobyxmoadg(Image.Plane[] planeArr, int i13, int i14) {
        int i15 = i13 * i14;
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        boolean z13 = buffer2.remaining() == ((i15 * 2) / 4) - 2 && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        return z13;
    }

    private static final void ppxfxbqfkf(Image.Plane plane, int i13, int i14, byte[] bArr, int i15, int i16) {
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

    private static final ByteBuffer wkgbmnqykc(Image.Plane[] planeArr, int i13, int i14) {
        int i15 = i13 * i14;
        byte[] bArr = new byte[((i15 / 4) * 2) + i15];
        if (iobyxmoadg(planeArr, i13, i14)) {
            planeArr[0].getBuffer().get(bArr, 0, i15);
            ByteBuffer buffer = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i15, 1);
            buffer.get(bArr, i15 + 1, ((i15 * 2) / 4) - 1);
        } else {
            ppxfxbqfkf(planeArr[0], i13, i14, bArr, 0, 1);
            ppxfxbqfkf(planeArr[1], i13, i14, bArr, i15 + 1, 2);
            ppxfxbqfkf(planeArr[2], i13, i14, bArr, i15, 2);
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        zdlpuopuiu.dxjokdxxww(byteBufferWrap, "wrap(...)");
        return byteBufferWrap;
    }

    public static final Bitmap zoijcleaow(androidx.camera.core.agtfadlqog agtfadlqogVar, rgvfuqvkyq scanArea, Size displaySize) {
        Image.Plane[] planes;
        Bitmap bitmapCreateBitmap;
        zdlpuopuiu.btonecajqb(agtfadlqogVar, "<this>");
        zdlpuopuiu.btonecajqb(scanArea, "scanArea");
        zdlpuopuiu.btonecajqb(displaySize, "displaySize");
        try {
            Image imageU = agtfadlqogVar.U();
            if (imageU == null || (planes = imageU.getPlanes()) == null) {
                planes = new Image.Plane[0];
            }
            ByteBuffer byteBufferWkgbmnqykc = wkgbmnqykc(planes, agtfadlqogVar.getWidth(), agtfadlqogVar.getHeight());
            byteBufferWkgbmnqykc.rewind();
            byte[] bArr = new byte[byteBufferWkgbmnqykc.capacity()];
            byteBufferWkgbmnqykc.get(bArr);
            YuvImage yuvImage = new YuvImage(bArr, 17, agtfadlqogVar.getWidth(), agtfadlqogVar.getHeight(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, agtfadlqogVar.getWidth(), agtfadlqogVar.getHeight()), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                zdlpuopuiu.dxjokdxxww(byteArray, "toByteArray(...)");
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                rg.zoijcleaow.iobyxmoadg(byteArrayOutputStream, null);
                if (agtfadlqogVar.K().ppxfxbqfkf() != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(agtfadlqogVar.K().ppxfxbqfkf());
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                    bitmapDecodeByteArray.recycle();
                    bitmapDecodeByteArray = bitmapCreateBitmap2;
                }
                float height = bitmapDecodeByteArray.getHeight() / displaySize.getHeight();
                float fZoijcleaow = scanArea.zoijcleaow() * height;
                float fIobyxmoadg = scanArea.iobyxmoadg() * height;
                if (fZoijcleaow + fIobyxmoadg > bitmapDecodeByteArray.getHeight()) {
                    return null;
                }
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, (int) fZoijcleaow, bitmapDecodeByteArray.getWidth(), (int) fIobyxmoadg);
                } catch (Throwable unused) {
                    bitmapCreateBitmap = null;
                }
                bitmapDecodeByteArray.recycle();
                return bitmapCreateBitmap;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    rg.zoijcleaow.iobyxmoadg(byteArrayOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
