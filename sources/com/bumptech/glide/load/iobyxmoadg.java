package com.bumptech.glide.load;

import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.lereixgezr;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    class eablkybsjg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ InputStream f21029iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ o8.zoijcleaow f21030zoijcleaow;

        eablkybsjg(InputStream inputStream, o8.zoijcleaow zoijcleaowVar) {
            this.f21029iobyxmoadg = inputStream;
            this.f21030zoijcleaow = zoijcleaowVar;
        }

        @Override // com.bumptech.glide.load.iobyxmoadg.lqeggnwhkg
        public int iobyxmoadg(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.wkgbmnqykc(this.f21029iobyxmoadg, this.f21030zoijcleaow);
            } finally {
                this.f21029iobyxmoadg.reset();
            }
        }
    }

    class gxszxtbevo implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f21031iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ o8.zoijcleaow f21032zoijcleaow;

        gxszxtbevo(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, o8.zoijcleaow zoijcleaowVar) {
            this.f21031iobyxmoadg = parcelFileDescriptorRewinder;
            this.f21032zoijcleaow = zoijcleaowVar;
        }

        @Override // com.bumptech.glide.load.iobyxmoadg.lqeggnwhkg
        public int iobyxmoadg(ImageHeaderParser imageHeaderParser) throws Throwable {
            lereixgezr lereixgezrVar = null;
            try {
                lereixgezr lereixgezrVar2 = new lereixgezr(new FileInputStream(this.f21031iobyxmoadg.iobyxmoadg().getFileDescriptor()), this.f21032zoijcleaow);
                try {
                    int iWkgbmnqykc = imageHeaderParser.wkgbmnqykc(lereixgezrVar2, this.f21032zoijcleaow);
                    lereixgezrVar2.release();
                    this.f21031iobyxmoadg.iobyxmoadg();
                    return iWkgbmnqykc;
                } catch (Throwable th2) {
                    th = th2;
                    lereixgezrVar = lereixgezrVar2;
                    if (lereixgezrVar != null) {
                        lereixgezrVar.release();
                    }
                    this.f21031iobyxmoadg.iobyxmoadg();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0386iobyxmoadg implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ InputStream f21033iobyxmoadg;

        C0386iobyxmoadg(InputStream inputStream) {
            this.f21033iobyxmoadg = inputStream;
        }

        @Override // com.bumptech.glide.load.iobyxmoadg.nufgyqmvbu
        public ImageHeaderParser.ImageType iobyxmoadg(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.ppxfxbqfkf(this.f21033iobyxmoadg);
            } finally {
                this.f21033iobyxmoadg.reset();
            }
        }
    }

    private interface lqeggnwhkg {
        int iobyxmoadg(ImageHeaderParser imageHeaderParser);
    }

    private interface nufgyqmvbu {
        ImageHeaderParser.ImageType iobyxmoadg(ImageHeaderParser imageHeaderParser);
    }

    class ppxfxbqfkf implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f21034iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ o8.zoijcleaow f21035zoijcleaow;

        ppxfxbqfkf(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, o8.zoijcleaow zoijcleaowVar) {
            this.f21034iobyxmoadg = parcelFileDescriptorRewinder;
            this.f21035zoijcleaow = zoijcleaowVar;
        }

        @Override // com.bumptech.glide.load.iobyxmoadg.nufgyqmvbu
        public ImageHeaderParser.ImageType iobyxmoadg(ImageHeaderParser imageHeaderParser) throws Throwable {
            lereixgezr lereixgezrVar = null;
            try {
                lereixgezr lereixgezrVar2 = new lereixgezr(new FileInputStream(this.f21034iobyxmoadg.iobyxmoadg().getFileDescriptor()), this.f21035zoijcleaow);
                try {
                    ImageHeaderParser.ImageType imageTypePpxfxbqfkf = imageHeaderParser.ppxfxbqfkf(lereixgezrVar2);
                    lereixgezrVar2.release();
                    this.f21034iobyxmoadg.iobyxmoadg();
                    return imageTypePpxfxbqfkf;
                } catch (Throwable th2) {
                    th = th2;
                    lereixgezrVar = lereixgezrVar2;
                    if (lereixgezrVar != null) {
                        lereixgezrVar.release();
                    }
                    this.f21034iobyxmoadg.iobyxmoadg();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    class wkgbmnqykc implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f21036iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ o8.zoijcleaow f21037zoijcleaow;

        wkgbmnqykc(ByteBuffer byteBuffer, o8.zoijcleaow zoijcleaowVar) {
            this.f21036iobyxmoadg = byteBuffer;
            this.f21037zoijcleaow = zoijcleaowVar;
        }

        @Override // com.bumptech.glide.load.iobyxmoadg.lqeggnwhkg
        public int iobyxmoadg(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.iobyxmoadg(this.f21036iobyxmoadg, this.f21037zoijcleaow);
            } finally {
                g9.iobyxmoadg.wkgbmnqykc(this.f21036iobyxmoadg);
            }
        }
    }

    class zoijcleaow implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f21038iobyxmoadg;

        zoijcleaow(ByteBuffer byteBuffer) {
            this.f21038iobyxmoadg = byteBuffer;
        }

        @Override // com.bumptech.glide.load.iobyxmoadg.nufgyqmvbu
        public ImageHeaderParser.ImageType iobyxmoadg(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.zoijcleaow(this.f21038iobyxmoadg);
            } finally {
                g9.iobyxmoadg.wkgbmnqykc(this.f21038iobyxmoadg);
            }
        }
    }

    public static ImageHeaderParser.ImageType eablkybsjg(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, o8.zoijcleaow zoijcleaowVar) {
        return nufgyqmvbu(list, new ppxfxbqfkf(parcelFileDescriptorRewinder, zoijcleaowVar));
    }

    public static ImageHeaderParser.ImageType gxszxtbevo(List list, InputStream inputStream, o8.zoijcleaow zoijcleaowVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new lereixgezr(inputStream, zoijcleaowVar);
        }
        inputStream.mark(5242880);
        return nufgyqmvbu(list, new C0386iobyxmoadg(inputStream));
    }

    public static int iobyxmoadg(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, o8.zoijcleaow zoijcleaowVar) {
        return wkgbmnqykc(list, new gxszxtbevo(parcelFileDescriptorRewinder, zoijcleaowVar));
    }

    public static ImageHeaderParser.ImageType lqeggnwhkg(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : nufgyqmvbu(list, new zoijcleaow(byteBuffer));
    }

    private static ImageHeaderParser.ImageType nufgyqmvbu(List list, nufgyqmvbu nufgyqmvbuVar) {
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            ImageHeaderParser.ImageType imageTypeIobyxmoadg = nufgyqmvbuVar.iobyxmoadg((ImageHeaderParser) list.get(i13));
            if (imageTypeIobyxmoadg != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeIobyxmoadg;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int ppxfxbqfkf(List list, ByteBuffer byteBuffer, o8.zoijcleaow zoijcleaowVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return wkgbmnqykc(list, new wkgbmnqykc(byteBuffer, zoijcleaowVar));
    }

    private static int wkgbmnqykc(List list, lqeggnwhkg lqeggnwhkgVar) {
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            int iIobyxmoadg = lqeggnwhkgVar.iobyxmoadg((ImageHeaderParser) list.get(i13));
            if (iIobyxmoadg != -1) {
                return iIobyxmoadg;
            }
        }
        return -1;
    }

    public static int zoijcleaow(List list, InputStream inputStream, o8.zoijcleaow zoijcleaowVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new lereixgezr(inputStream, zoijcleaowVar);
        }
        inputStream.mark(5242880);
        return wkgbmnqykc(list, new eablkybsjg(inputStream, zoijcleaowVar));
    }
}
