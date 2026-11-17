package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ojitshcjhn {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final Queue f21105agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final l8.gxszxtbevo f21106btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final zoijcleaow f21107draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final l8.gxszxtbevo f21108dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final Set f21109gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final l8.gxszxtbevo f21110gxszxtbevo = l8.gxszxtbevo.gxszxtbevo("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", l8.zoijcleaow.f61850jyumaefscl);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final l8.gxszxtbevo f21111lqeggnwhkg = l8.gxszxtbevo.eablkybsjg("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final l8.gxszxtbevo f21112nufgyqmvbu = agtfadlqog.f21049nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final Set f21113wflxmlrfwp;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yggfygwlhe f21114eablkybsjg = yggfygwlhe.zoijcleaow();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final o8.wkgbmnqykc f21115iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final o8.zoijcleaow f21116ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f21117wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final DisplayMetrics f21118zoijcleaow;

    class iobyxmoadg implements zoijcleaow {
        iobyxmoadg() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ojitshcjhn.zoijcleaow
        public void iobyxmoadg() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ojitshcjhn.zoijcleaow
        public void zoijcleaow(o8.wkgbmnqykc wkgbmnqykcVar, Bitmap bitmap) {
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg();

        void zoijcleaow(o8.wkgbmnqykc wkgbmnqykcVar, Bitmap bitmap);
    }

    static {
        Boolean bool = Boolean.FALSE;
        f21108dxjokdxxww = l8.gxszxtbevo.gxszxtbevo("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f21106btonecajqb = l8.gxszxtbevo.gxszxtbevo("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f21109gtknphoqwx = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f21107draadjrbmk = new iobyxmoadg();
        f21113wflxmlrfwp = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f21105agtfadlqog = g9.draadjrbmk.gxszxtbevo(0);
    }

    public ojitshcjhn(List list, DisplayMetrics displayMetrics, o8.wkgbmnqykc wkgbmnqykcVar, o8.zoijcleaow zoijcleaowVar) {
        this.f21117wkgbmnqykc = list;
        this.f21118zoijcleaow = (DisplayMetrics) g9.gtknphoqwx.eablkybsjg(displayMetrics);
        this.f21115iobyxmoadg = (o8.wkgbmnqykc) g9.gtknphoqwx.eablkybsjg(wkgbmnqykcVar);
        this.f21116ppxfxbqfkf = (o8.zoijcleaow) g9.gtknphoqwx.eablkybsjg(zoijcleaowVar);
    }

    private static String agtfadlqog(BitmapFactory.Options options) {
        return btonecajqb(options.inBitmap);
    }

    private static String btonecajqb(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static int cqumvgiudr(double d13) {
        return (int) (d13 + 0.5d);
    }

    private static int draadjrbmk(double d13) {
        if (d13 > 1.0d) {
            d13 = 1.0d / d13;
        }
        return (int) Math.round(d13 * 2.147483647E9d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap dxjokdxxww(com.bumptech.glide.load.resource.bitmap.jyumaefscl r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.ojitshcjhn.zoijcleaow r7, o8.wkgbmnqykc r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.iobyxmoadg()
            r5.zoijcleaow()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.istkbnxepw.nufgyqmvbu()
            r4.lock()
            android.graphics.Bitmap r5 = r5.iobyxmoadg(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.istkbnxepw.nufgyqmvbu()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = yggfygwlhe(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.ppxfxbqfkf(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = dxjokdxxww(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.istkbnxepw.nufgyqmvbu()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.istkbnxepw.nufgyqmvbu()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.ojitshcjhn.dxjokdxxww(com.bumptech.glide.load.resource.bitmap.jyumaefscl, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.ojitshcjhn$zoijcleaow, o8.wkgbmnqykc):android.graphics.Bitmap");
    }

    private n8.ppxfxbqfkf eablkybsjg(jyumaefscl jyumaefsclVar, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar) {
        byte[] bArr = (byte[]) this.f21116ppxfxbqfkf.ppxfxbqfkf(65536, byte[].class);
        BitmapFactory.Options optionsGtknphoqwx = gtknphoqwx();
        optionsGtknphoqwx.inTempStorage = bArr;
        l8.zoijcleaow zoijcleaowVar2 = (l8.zoijcleaow) lqeggnwhkgVar.ppxfxbqfkf(f21110gxszxtbevo);
        l8.nufgyqmvbu nufgyqmvbuVar = (l8.nufgyqmvbu) lqeggnwhkgVar.ppxfxbqfkf(f21111lqeggnwhkg);
        agtfadlqog agtfadlqogVar = (agtfadlqog) lqeggnwhkgVar.ppxfxbqfkf(agtfadlqog.f21049nufgyqmvbu);
        boolean zBooleanValue = ((Boolean) lqeggnwhkgVar.ppxfxbqfkf(f21108dxjokdxxww)).booleanValue();
        l8.gxszxtbevo gxszxtbevoVar = f21106btonecajqb;
        try {
            return lqeggnwhkg.eablkybsjg(nufgyqmvbu(jyumaefsclVar, optionsGtknphoqwx, agtfadlqogVar, zoijcleaowVar2, nufgyqmvbuVar, lqeggnwhkgVar.ppxfxbqfkf(gxszxtbevoVar) != null && ((Boolean) lqeggnwhkgVar.ppxfxbqfkf(gxszxtbevoVar)).booleanValue(), i13, i14, zBooleanValue, zoijcleaowVar), this.f21115iobyxmoadg);
        } finally {
            jyumaefscl(optionsGtknphoqwx);
            this.f21116ppxfxbqfkf.eablkybsjg(bArr);
        }
    }

    private static void esjtqupxsv(BitmapFactory.Options options, o8.wkgbmnqykc wkgbmnqykcVar, int i13, int i14) {
        Bitmap.Config config = options.inPreferredConfig;
        if (config == Bitmap.Config.HARDWARE) {
            return;
        }
        Bitmap.Config config2 = options.outConfig;
        if (config2 != null) {
            config = config2;
        }
        options.inBitmap = wkgbmnqykcVar.eablkybsjg(i13, i14, config);
    }

    private static synchronized BitmapFactory.Options gtknphoqwx() {
        BitmapFactory.Options options;
        Queue queue = f21105agtfadlqog;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            iwizpuwonk(options);
        }
        return options;
    }

    private static int iobyxmoadg(double d13) {
        int iDraadjrbmk = draadjrbmk(d13);
        int iCqumvgiudr = cqumvgiudr(((double) iDraadjrbmk) * d13);
        return cqumvgiudr((d13 / ((double) (iCqumvgiudr / iDraadjrbmk))) * ((double) iCqumvgiudr));
    }

    private static void iwizpuwonk(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static void jyumaefscl(BitmapFactory.Options options) {
        iwizpuwonk(options);
        Queue queue = f21105agtfadlqog;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static boolean kcexrzcfyt(BitmapFactory.Options options) {
        int i13;
        int i14 = options.inTargetDensity;
        return i14 > 0 && (i13 = options.inDensity) > 0 && i14 != i13;
    }

    private boolean lereixgezr(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    private Bitmap nufgyqmvbu(jyumaefscl jyumaefsclVar, BitmapFactory.Options options, agtfadlqog agtfadlqogVar, l8.zoijcleaow zoijcleaowVar, l8.nufgyqmvbu nufgyqmvbuVar, boolean z13, int i13, int i14, boolean z14, zoijcleaow zoijcleaowVar2) {
        int i15;
        int i16;
        int i17;
        String str;
        ColorSpace colorSpace;
        int iRound;
        int iRound2;
        long jZoijcleaow = g9.lqeggnwhkg.zoijcleaow();
        int[] iArrWflxmlrfwp = wflxmlrfwp(jyumaefsclVar, options, zoijcleaowVar2, this.f21115iobyxmoadg);
        int i18 = iArrWflxmlrfwp[0];
        int i19 = iArrWflxmlrfwp[1];
        String str2 = options.outMimeType;
        boolean z15 = (i18 == -1 || i19 == -1) ? false : z13;
        int iPpxfxbqfkf = jyumaefsclVar.ppxfxbqfkf();
        int iDxjokdxxww = istkbnxepw.dxjokdxxww(iPpxfxbqfkf);
        boolean zDraadjrbmk = istkbnxepw.draadjrbmk(iPpxfxbqfkf);
        if (i13 == Integer.MIN_VALUE) {
            i15 = i14;
            i16 = oxmwwwfdhm(iDxjokdxxww) ? i19 : i18;
        } else {
            i15 = i14;
            i16 = i13;
        }
        if (i15 == Integer.MIN_VALUE) {
            i17 = oxmwwwfdhm(iDxjokdxxww) ? i18 : i19;
        } else {
            i17 = i15;
        }
        ImageHeaderParser.ImageType imageTypeWkgbmnqykc = jyumaefsclVar.wkgbmnqykc();
        ppxfxbqfkf(imageTypeWkgbmnqykc, jyumaefsclVar, zoijcleaowVar2, this.f21115iobyxmoadg, agtfadlqogVar, iDxjokdxxww, i18, i19, i16, i17, options);
        zoijcleaow(jyumaefsclVar, zoijcleaowVar, z15, zDraadjrbmk, options, i16, i17);
        int i23 = Build.VERSION.SDK_INT;
        if (lereixgezr(imageTypeWkgbmnqykc)) {
            if (i18 < 0 || i19 < 0 || !z14) {
                float f13 = kcexrzcfyt(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i24 = options.inSampleSize;
                float f14 = i24;
                int iCeil = (int) Math.ceil(i18 / f14);
                int iCeil2 = (int) Math.ceil(i19 / f14);
                iRound = Math.round(iCeil * f13);
                iRound2 = Math.round(iCeil2 * f13);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i18 + "x" + i19 + "], sampleSize: " + i24 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f13);
                }
            } else {
                str = "Downsampler";
                iRound = i16;
                iRound2 = i17;
            }
            if (iRound > 0 && iRound2 > 0) {
                esjtqupxsv(options, this.f21115iobyxmoadg, iRound, iRound2);
            }
        } else {
            str = "Downsampler";
        }
        if (nufgyqmvbuVar != null) {
            if (i23 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((nufgyqmvbuVar == l8.nufgyqmvbu.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapDxjokdxxww = dxjokdxxww(jyumaefsclVar, options, zoijcleaowVar2, this.f21115iobyxmoadg);
        zoijcleaowVar2.zoijcleaow(this.f21115iobyxmoadg, bitmapDxjokdxxww);
        if (Log.isLoggable(str, 2)) {
            zdlpuopuiu(i18, i19, str2, options, bitmapDxjokdxxww, i13, i14, jZoijcleaow);
        }
        if (bitmapDxjokdxxww == null) {
            return null;
        }
        bitmapDxjokdxxww.setDensity(this.f21118zoijcleaow.densityDpi);
        Bitmap bitmapWflxmlrfwp = istkbnxepw.wflxmlrfwp(this.f21115iobyxmoadg, bitmapDxjokdxxww, iPpxfxbqfkf);
        if (bitmapDxjokdxxww.equals(bitmapWflxmlrfwp)) {
            return bitmapWflxmlrfwp;
        }
        this.f21115iobyxmoadg.ppxfxbqfkf(bitmapDxjokdxxww);
        return bitmapWflxmlrfwp;
    }

    private static boolean oxmwwwfdhm(int i13) {
        return i13 == 90 || i13 == 270;
    }

    private static void ppxfxbqfkf(ImageHeaderParser.ImageType imageType, jyumaefscl jyumaefsclVar, zoijcleaow zoijcleaowVar, o8.wkgbmnqykc wkgbmnqykcVar, agtfadlqog agtfadlqogVar, int i13, int i14, int i15, int i16, int i17, BitmapFactory.Options options) {
        int i18;
        int i19;
        int iFloor;
        int iFloor2;
        if (i14 <= 0 || i15 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i16 + "x" + i17 + "]");
                return;
            }
            return;
        }
        if (oxmwwwfdhm(i13)) {
            i19 = i14;
            i18 = i15;
        } else {
            i18 = i14;
            i19 = i15;
        }
        float fZoijcleaow = agtfadlqogVar.zoijcleaow(i18, i19, i16, i17);
        if (fZoijcleaow <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fZoijcleaow + " from: " + agtfadlqogVar + ", source: [" + i14 + "x" + i15 + "], target: [" + i16 + "x" + i17 + "]");
        }
        agtfadlqog.lqeggnwhkg lqeggnwhkgVarIobyxmoadg = agtfadlqogVar.iobyxmoadg(i18, i19, i16, i17);
        if (lqeggnwhkgVarIobyxmoadg == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f13 = i18;
        float f14 = i19;
        int iCqumvgiudr = i18 / cqumvgiudr(fZoijcleaow * f13);
        int iCqumvgiudr2 = i19 / cqumvgiudr(fZoijcleaow * f14);
        agtfadlqog.lqeggnwhkg lqeggnwhkgVar = agtfadlqog.lqeggnwhkg.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(lqeggnwhkgVarIobyxmoadg == lqeggnwhkgVar ? Math.max(iCqumvgiudr, iCqumvgiudr2) : Math.min(iCqumvgiudr, iCqumvgiudr2)));
        if (lqeggnwhkgVarIobyxmoadg == lqeggnwhkgVar && iMax < 1.0f / fZoijcleaow) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f13 / fMin);
            iFloor2 = (int) Math.ceil(f14 / fMin);
            int i23 = iMax / 8;
            if (i23 > 0) {
                iFloor /= i23;
                iFloor2 /= i23;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f15 = iMax;
            iFloor = (int) Math.floor(f13 / f15);
            iFloor2 = (int) Math.floor(f14 / f15);
        } else if (imageType.isWebp()) {
            float f16 = iMax;
            iFloor = Math.round(f13 / f16);
            iFloor2 = Math.round(f14 / f16);
        } else if (i18 % iMax == 0 && i19 % iMax == 0) {
            iFloor = i18 / iMax;
            iFloor2 = i19 / iMax;
        } else {
            int[] iArrWflxmlrfwp = wflxmlrfwp(jyumaefsclVar, options, zoijcleaowVar, wkgbmnqykcVar);
            iFloor = iArrWflxmlrfwp[0];
            iFloor2 = iArrWflxmlrfwp[1];
        }
        double dZoijcleaow = agtfadlqogVar.zoijcleaow(iFloor, iFloor2, i16, i17);
        options.inTargetDensity = iobyxmoadg(dZoijcleaow);
        options.inDensity = draadjrbmk(dZoijcleaow);
        if (kcexrzcfyt(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i14 + "x" + i15 + "], degreesToRotate: " + i13 + ", target: [" + i16 + "x" + i17 + "], power of two scaled: [" + iFloor + "x" + iFloor2 + "], exact scale factor: " + fZoijcleaow + ", power of 2 sample size: " + iMax + ", adjusted scale factor: " + dZoijcleaow + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private static int[] wflxmlrfwp(jyumaefscl jyumaefsclVar, BitmapFactory.Options options, zoijcleaow zoijcleaowVar, o8.wkgbmnqykc wkgbmnqykcVar) {
        options.inJustDecodeBounds = true;
        dxjokdxxww(jyumaefsclVar, options, zoijcleaowVar, wkgbmnqykcVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static IOException yggfygwlhe(IllegalArgumentException illegalArgumentException, int i13, int i14, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i13 + ", outHeight: " + i14 + ", outMimeType: " + str + ", inBitmap: " + agtfadlqog(options), illegalArgumentException);
    }

    private static void zdlpuopuiu(int i13, int i14, String str, BitmapFactory.Options options, Bitmap bitmap, int i15, int i16, long j13) {
        Log.v("Downsampler", "Decoded " + btonecajqb(bitmap) + " from [" + i13 + "x" + i14 + "] " + str + " with inBitmap " + agtfadlqog(options) + " for [" + i15 + "x" + i16 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + g9.lqeggnwhkg.iobyxmoadg(j13));
    }

    private void zoijcleaow(jyumaefscl jyumaefsclVar, l8.zoijcleaow zoijcleaowVar, boolean z13, boolean z14, BitmapFactory.Options options, int i13, int i14) {
        boolean zHasAlpha;
        if (this.f21114eablkybsjg.lqeggnwhkg(i13, i14, options, z13, z14)) {
            return;
        }
        if (zoijcleaowVar == l8.zoijcleaow.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = jyumaefsclVar.wkgbmnqykc().hasAlpha();
        } catch (IOException e13) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + zoijcleaowVar, e13);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    public n8.ppxfxbqfkf gxszxtbevo(InputStream inputStream, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar) {
        return eablkybsjg(new jyumaefscl.zoijcleaow(inputStream, this.f21117wkgbmnqykc, this.f21116ppxfxbqfkf), i13, i14, lqeggnwhkgVar, zoijcleaowVar);
    }

    public n8.ppxfxbqfkf lqeggnwhkg(ByteBuffer byteBuffer, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return eablkybsjg(new jyumaefscl.iobyxmoadg(byteBuffer, this.f21117wkgbmnqykc, this.f21116ppxfxbqfkf), i13, i14, lqeggnwhkgVar, f21107draadjrbmk);
    }

    public boolean ojitshcjhn(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.ppxfxbqfkf();
    }

    public boolean rgvfuqvkyq(InputStream inputStream) {
        return true;
    }

    public boolean vdvldrhtss(ByteBuffer byteBuffer) {
        return true;
    }

    public n8.ppxfxbqfkf wkgbmnqykc(ParcelFileDescriptor parcelFileDescriptor, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return eablkybsjg(new jyumaefscl.ppxfxbqfkf(parcelFileDescriptor, this.f21117wkgbmnqykc, this.f21116ppxfxbqfkf), i13, i14, lqeggnwhkgVar, f21107draadjrbmk);
    }
}
