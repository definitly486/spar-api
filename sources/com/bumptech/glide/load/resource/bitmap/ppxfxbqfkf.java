package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf implements l8.btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final o8.zoijcleaow f21123iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final l8.gxszxtbevo f21122zoijcleaow = l8.gxszxtbevo.gxszxtbevo("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final l8.gxszxtbevo f21121ppxfxbqfkf = l8.gxszxtbevo.eablkybsjg("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    public ppxfxbqfkf(o8.zoijcleaow zoijcleaowVar) {
        this.f21123iobyxmoadg = zoijcleaowVar;
    }

    private Bitmap.CompressFormat wkgbmnqykc(Bitmap bitmap, l8.lqeggnwhkg lqeggnwhkgVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) lqeggnwhkgVar.ppxfxbqfkf(f21121ppxfxbqfkf);
        if (compressFormat != null) {
            return compressFormat;
        }
        return bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // l8.wkgbmnqykc
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(n8.ppxfxbqfkf ppxfxbqfkfVar, File file, l8.lqeggnwhkg lqeggnwhkgVar) {
        boolean z13;
        Bitmap bitmap = (Bitmap) ppxfxbqfkfVar.get();
        Bitmap.CompressFormat compressFormatWkgbmnqykc = wkgbmnqykc(bitmap, lqeggnwhkgVar);
        h9.zoijcleaow.wkgbmnqykc("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatWkgbmnqykc);
        try {
            long jZoijcleaow = g9.lqeggnwhkg.zoijcleaow();
            int iIntValue = ((Integer) lqeggnwhkgVar.ppxfxbqfkf(f21122zoijcleaow)).intValue();
            OutputStream ppxfxbqfkfVar2 = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        ppxfxbqfkfVar2 = this.f21123iobyxmoadg != null ? new com.bumptech.glide.load.data.ppxfxbqfkf(fileOutputStream, this.f21123iobyxmoadg) : fileOutputStream;
                        bitmap.compress(compressFormatWkgbmnqykc, iIntValue, ppxfxbqfkfVar2);
                        ppxfxbqfkfVar2.close();
                        try {
                            ppxfxbqfkfVar2.close();
                        } catch (IOException unused) {
                        }
                        z13 = true;
                    } catch (IOException e13) {
                        e = e13;
                        ppxfxbqfkfVar2 = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (ppxfxbqfkfVar2 != null) {
                            try {
                                ppxfxbqfkfVar2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z13 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        ppxfxbqfkfVar2 = fileOutputStream;
                        if (ppxfxbqfkfVar2 != null) {
                            try {
                                ppxfxbqfkfVar2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e14) {
                e = e14;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormatWkgbmnqykc + " of size " + g9.draadjrbmk.nufgyqmvbu(bitmap) + " in " + g9.lqeggnwhkg.iobyxmoadg(jZoijcleaow) + ", options format: " + lqeggnwhkgVar.ppxfxbqfkf(f21121ppxfxbqfkf) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            h9.zoijcleaow.eablkybsjg();
            return z13;
        } catch (Throwable th4) {
            h9.zoijcleaow.eablkybsjg();
            throw th4;
        }
    }

    @Override // l8.btonecajqb
    public l8.ppxfxbqfkf zoijcleaow(l8.lqeggnwhkg lqeggnwhkgVar) {
        return l8.ppxfxbqfkf.TRANSFORMED;
    }
}
