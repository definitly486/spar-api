package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class iozdgvuglv implements l8.dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg f21070iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gxszxtbevo f21071ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final o8.wkgbmnqykc f21072zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final l8.gxszxtbevo f21069wkgbmnqykc = l8.gxszxtbevo.iobyxmoadg("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new iobyxmoadg());

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final l8.gxszxtbevo f21066eablkybsjg = l8.gxszxtbevo.iobyxmoadg("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new zoijcleaow());

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final gxszxtbevo f21067gxszxtbevo = new gxszxtbevo();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final List f21068lqeggnwhkg = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    interface eablkybsjg {
        void iobyxmoadg(MediaExtractor mediaExtractor, Object obj);

        void zoijcleaow(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    static class gxszxtbevo {
        gxszxtbevo() {
        }

        public MediaMetadataRetriever iobyxmoadg() {
            return new MediaMetadataRetriever();
        }
    }

    class iobyxmoadg implements l8.gxszxtbevo.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ByteBuffer f21073iobyxmoadg = ByteBuffer.allocate(8);

        iobyxmoadg() {
        }

        @Override // l8.gxszxtbevo.zoijcleaow
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(byte[] bArr, Long l13, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f21073iobyxmoadg) {
                this.f21073iobyxmoadg.position(0);
                messageDigest.update(this.f21073iobyxmoadg.putLong(l13.longValue()).array());
            }
        }
    }

    static final class lqeggnwhkg implements eablkybsjg {
        lqeggnwhkg() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.iozdgvuglv.eablkybsjg
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.iozdgvuglv.eablkybsjg
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    private static final class nufgyqmvbu extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        nufgyqmvbu() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    private static final class ppxfxbqfkf implements eablkybsjg {
        private ppxfxbqfkf() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.iozdgvuglv.eablkybsjg
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.iozdgvuglv.eablkybsjg
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    static final class wkgbmnqykc implements eablkybsjg {

        class iobyxmoadg extends MediaDataSource {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f21075zdlpuopuiu;

            iobyxmoadg(ByteBuffer byteBuffer) {
                this.f21075zdlpuopuiu = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f21075zdlpuopuiu.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j13, byte[] bArr, int i13, int i14) {
                if (j13 >= this.f21075zdlpuopuiu.limit()) {
                    return -1;
                }
                this.f21075zdlpuopuiu.position((int) j13);
                int iMin = Math.min(i14, this.f21075zdlpuopuiu.remaining());
                this.f21075zdlpuopuiu.get(bArr, i13, iMin);
                return iMin;
            }
        }

        wkgbmnqykc() {
        }

        private MediaDataSource ppxfxbqfkf(ByteBuffer byteBuffer) {
            return new iobyxmoadg(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.iozdgvuglv.eablkybsjg
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(ppxfxbqfkf(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.iozdgvuglv.eablkybsjg
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(ppxfxbqfkf(byteBuffer));
        }
    }

    class zoijcleaow implements l8.gxszxtbevo.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ByteBuffer f21076iobyxmoadg = ByteBuffer.allocate(4);

        zoijcleaow() {
        }

        @Override // l8.gxszxtbevo.zoijcleaow
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f21076iobyxmoadg) {
                this.f21076iobyxmoadg.position(0);
                messageDigest.update(this.f21076iobyxmoadg.putInt(num.intValue()).array());
            }
        }
    }

    iozdgvuglv(o8.wkgbmnqykc wkgbmnqykcVar, eablkybsjg eablkybsjgVar) {
        this(wkgbmnqykcVar, eablkybsjgVar, f21067gxszxtbevo);
    }

    static boolean btonecajqb() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return gtknphoqwx();
        }
        int i13 = Build.VERSION.SDK_INT;
        return i13 >= 30 && i13 < 33;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:23:0x0053, B:25:0x0059), top: B:40:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[DONT_GENERATE] */
    private boolean draadjrbmk(Object obj, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
            try {
                if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    return false;
                }
                MediaExtractor mediaExtractor2 = new MediaExtractor();
                try {
                    this.f21070iobyxmoadg.iobyxmoadg(mediaExtractor2, obj);
                    int trackCount = mediaExtractor2.getTrackCount();
                    for (int i13 = 0; i13 < trackCount; i13++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i13).getString("mime"))) {
                            mediaExtractor2.release();
                            return true;
                        }
                    }
                    mediaExtractor2.release();
                } catch (Throwable th2) {
                    th = th2;
                    mediaExtractor = mediaExtractor2;
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                    }
                }
                return false;
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static boolean dxjokdxxww(MediaMetadataRetriever mediaMetadataRetriever) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i13 = Integer.parseInt(strExtractMetadata);
        return (i13 == 7 || i13 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    private static Bitmap eablkybsjg(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!btonecajqb()) {
            return bitmap;
        }
        try {
            if (dxjokdxxww(mediaMetadataRetriever) && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
            }
        }
        return bitmap;
    }

    private static boolean gtknphoqwx() {
        Iterator it = f21068lqeggnwhkg.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private Bitmap gxszxtbevo(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j13, int i13, int i14, int i15, agtfadlqog agtfadlqogVar) {
        if (draadjrbmk(obj, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapNufgyqmvbu = (Build.VERSION.SDK_INT < 27 || i14 == Integer.MIN_VALUE || i15 == Integer.MIN_VALUE || agtfadlqogVar == agtfadlqog.f21046gxszxtbevo) ? null : nufgyqmvbu(mediaMetadataRetriever, j13, i13, i14, i15, agtfadlqogVar);
        if (bitmapNufgyqmvbu == null) {
            bitmapNufgyqmvbu = lqeggnwhkg(mediaMetadataRetriever, j13, i13);
        }
        Bitmap bitmapEablkybsjg = eablkybsjg(mediaMetadataRetriever, bitmapNufgyqmvbu);
        if (bitmapEablkybsjg != null) {
            return bitmapEablkybsjg;
        }
        throw new nufgyqmvbu();
    }

    private static Bitmap lqeggnwhkg(MediaMetadataRetriever mediaMetadataRetriever, long j13, int i13) {
        return mediaMetadataRetriever.getFrameAtTime(j13, i13);
    }

    private static Bitmap nufgyqmvbu(MediaMetadataRetriever mediaMetadataRetriever, long j13, int i13, int i14, int i15, agtfadlqog agtfadlqogVar) {
        try {
            int i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i17 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i18 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i18 == 90 || i18 == 270) {
                i17 = i16;
                i16 = i17;
            }
            float fZoijcleaow = agtfadlqogVar.zoijcleaow(i16, i17, i14, i15);
            return mediaMetadataRetriever.getScaledFrameAtTime(j13, i13, Math.round(i16 * fZoijcleaow), Math.round(fZoijcleaow * i17));
        } catch (Throwable th2) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
            return null;
        }
    }

    public static l8.dxjokdxxww ppxfxbqfkf(o8.wkgbmnqykc wkgbmnqykcVar) {
        return new iozdgvuglv(wkgbmnqykcVar, new ppxfxbqfkf(null));
    }

    public static l8.dxjokdxxww wflxmlrfwp(o8.wkgbmnqykc wkgbmnqykcVar) {
        return new iozdgvuglv(wkgbmnqykcVar, new lqeggnwhkg());
    }

    public static l8.dxjokdxxww wkgbmnqykc(o8.wkgbmnqykc wkgbmnqykcVar) {
        return new iozdgvuglv(wkgbmnqykcVar, new wkgbmnqykc());
    }

    @Override // l8.dxjokdxxww
    public boolean iobyxmoadg(Object obj, l8.lqeggnwhkg lqeggnwhkgVar) {
        return true;
    }

    @Override // l8.dxjokdxxww
    public n8.ppxfxbqfkf zoijcleaow(Object obj, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) throws IOException {
        long jLongValue = ((Long) lqeggnwhkgVar.ppxfxbqfkf(f21069wkgbmnqykc)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) lqeggnwhkgVar.ppxfxbqfkf(f21066eablkybsjg);
        if (num == null) {
            num = 2;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) lqeggnwhkgVar.ppxfxbqfkf(agtfadlqog.f21049nufgyqmvbu);
        if (agtfadlqogVar == null) {
            agtfadlqogVar = agtfadlqog.f21048lqeggnwhkg;
        }
        agtfadlqog agtfadlqogVar2 = agtfadlqogVar;
        MediaMetadataRetriever mediaMetadataRetrieverIobyxmoadg = this.f21071ppxfxbqfkf.iobyxmoadg();
        try {
            this.f21070iobyxmoadg.zoijcleaow(mediaMetadataRetrieverIobyxmoadg, obj);
            return com.bumptech.glide.load.resource.bitmap.lqeggnwhkg.eablkybsjg(gxszxtbevo(obj, mediaMetadataRetrieverIobyxmoadg, jLongValue, num.intValue(), i13, i14, agtfadlqogVar2), this.f21072zoijcleaow);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetrieverIobyxmoadg.release();
            } else {
                mediaMetadataRetrieverIobyxmoadg.release();
            }
        }
    }

    iozdgvuglv(o8.wkgbmnqykc wkgbmnqykcVar, eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        this.f21072zoijcleaow = wkgbmnqykcVar;
        this.f21070iobyxmoadg = eablkybsjgVar;
        this.f21071ppxfxbqfkf = gxszxtbevoVar;
    }
}
