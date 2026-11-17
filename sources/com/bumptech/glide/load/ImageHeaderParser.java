package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import o8.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final boolean f20769zdlpuopuiu;

        ImageType(boolean z13) {
            this.f20769zdlpuopuiu = z13;
        }

        public boolean hasAlpha() {
            return this.f20769zdlpuopuiu;
        }

        public boolean isWebp() {
            int i13 = iobyxmoadg.f20770iobyxmoadg[ordinal()];
            return i13 == 1 || i13 == 2 || i13 == 3;
        }
    }

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f20770iobyxmoadg;

        static {
            int[] iArr = new int[ImageType.values().length];
            f20770iobyxmoadg = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20770iobyxmoadg[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20770iobyxmoadg[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    int iobyxmoadg(ByteBuffer byteBuffer, zoijcleaow zoijcleaowVar);

    ImageType ppxfxbqfkf(InputStream inputStream);

    int wkgbmnqykc(InputStream inputStream, zoijcleaow zoijcleaowVar);

    ImageType zoijcleaow(ByteBuffer byteBuffer);
}
