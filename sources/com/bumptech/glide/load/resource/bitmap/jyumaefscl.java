package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
interface jyumaefscl {

    public static final class iobyxmoadg implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ByteBuffer f21087iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final o8.zoijcleaow f21088ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f21089zoijcleaow;

        iobyxmoadg(ByteBuffer byteBuffer, List list, o8.zoijcleaow zoijcleaowVar) {
            this.f21087iobyxmoadg = byteBuffer;
            this.f21089zoijcleaow = list;
            this.f21088ppxfxbqfkf = zoijcleaowVar;
        }

        private InputStream eablkybsjg() {
            return g9.iobyxmoadg.lqeggnwhkg(g9.iobyxmoadg.wkgbmnqykc(this.f21087iobyxmoadg));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.jyumaefscl
        public Bitmap iobyxmoadg(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(eablkybsjg(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.jyumaefscl
        public int ppxfxbqfkf() {
            return com.bumptech.glide.load.iobyxmoadg.ppxfxbqfkf(this.f21089zoijcleaow, g9.iobyxmoadg.wkgbmnqykc(this.f21087iobyxmoadg), this.f21088ppxfxbqfkf);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.jyumaefscl
        public ImageHeaderParser.ImageType wkgbmnqykc() {
            return com.bumptech.glide.load.iobyxmoadg.lqeggnwhkg(this.f21089zoijcleaow, g9.iobyxmoadg.wkgbmnqykc(this.f21087iobyxmoadg));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.jyumaefscl
        public void zoijcleaow() {
        }
    }

    public static final class ppxfxbqfkf implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final o8.zoijcleaow f21090iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f21091ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f21092zoijcleaow;

        ppxfxbqfkf(ParcelFileDescriptor parcelFileDescriptor, List list, o8.zoijcleaow zoijcleaowVar) {
            this.f21090iobyxmoadg = (o8.zoijcleaow) g9.gtknphoqwx.eablkybsjg(zoijcleaowVar);
            this.f21092zoijcleaow = (List) g9.gtknphoqwx.eablkybsjg(list);
            this.f21091ppxfxbqfkf = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.jyumaefscl
        public Bitmap iobyxmoadg(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f21091ppxfxbqfkf.iobyxmoadg().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.jyumaefscl
        public int ppxfxbqfkf() {
            return com.bumptech.glide.load.iobyxmoadg.iobyxmoadg(this.f21092zoijcleaow, this.f21091ppxfxbqfkf, this.f21090iobyxmoadg);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.jyumaefscl
        public ImageHeaderParser.ImageType wkgbmnqykc() {
            return com.bumptech.glide.load.iobyxmoadg.eablkybsjg(this.f21092zoijcleaow, this.f21091ppxfxbqfkf, this.f21090iobyxmoadg);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.jyumaefscl
        public void zoijcleaow() {
        }
    }

    public static final class zoijcleaow implements jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final com.bumptech.glide.load.data.gtknphoqwx f21093iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f21094ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final o8.zoijcleaow f21095zoijcleaow;

        zoijcleaow(InputStream inputStream, List list, o8.zoijcleaow zoijcleaowVar) {
            this.f21095zoijcleaow = (o8.zoijcleaow) g9.gtknphoqwx.eablkybsjg(zoijcleaowVar);
            this.f21094ppxfxbqfkf = (List) g9.gtknphoqwx.eablkybsjg(list);
            this.f21093iobyxmoadg = new com.bumptech.glide.load.data.gtknphoqwx(inputStream, zoijcleaowVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.jyumaefscl
        public Bitmap iobyxmoadg(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f21093iobyxmoadg.iobyxmoadg(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.jyumaefscl
        public int ppxfxbqfkf() {
            return com.bumptech.glide.load.iobyxmoadg.zoijcleaow(this.f21094ppxfxbqfkf, this.f21093iobyxmoadg.iobyxmoadg(), this.f21095zoijcleaow);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.jyumaefscl
        public ImageHeaderParser.ImageType wkgbmnqykc() {
            return com.bumptech.glide.load.iobyxmoadg.gxszxtbevo(this.f21094ppxfxbqfkf, this.f21093iobyxmoadg.iobyxmoadg(), this.f21095zoijcleaow);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.jyumaefscl
        public void zoijcleaow() {
            this.f21093iobyxmoadg.ppxfxbqfkf();
        }
    }

    Bitmap iobyxmoadg(BitmapFactory.Options options);

    int ppxfxbqfkf();

    ImageHeaderParser.ImageType wkgbmnqykc();

    void zoijcleaow();
}
