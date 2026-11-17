package v8;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f116314iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final o8.zoijcleaow f116315zoijcleaow;

    private static final class iobyxmoadg implements n8.ppxfxbqfkf {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final AnimatedImageDrawable f116316zdlpuopuiu;

        iobyxmoadg(AnimatedImageDrawable animatedImageDrawable) {
            this.f116316zdlpuopuiu = animatedImageDrawable;
        }

        @Override // n8.ppxfxbqfkf
        public int getSize() {
            return this.f116316zdlpuopuiu.getIntrinsicWidth() * this.f116316zdlpuopuiu.getIntrinsicHeight() * g9.draadjrbmk.dxjokdxxww(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // n8.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f116316zdlpuopuiu;
        }

        @Override // n8.ppxfxbqfkf
        public Class ppxfxbqfkf() {
            return Drawable.class;
        }

        @Override // n8.ppxfxbqfkf
        public void zoijcleaow() {
            this.f116316zdlpuopuiu.stop();
            this.f116316zdlpuopuiu.clearAnimationCallbacks();
        }
    }

    private static final class ppxfxbqfkf implements l8.dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final nufgyqmvbu f116317iobyxmoadg;

        ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar) {
            this.f116317iobyxmoadg = nufgyqmvbuVar;
        }

        @Override // l8.dxjokdxxww
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public n8.ppxfxbqfkf zoijcleaow(InputStream inputStream, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
            return this.f116317iobyxmoadg.zoijcleaow(ImageDecoder.createSource(g9.iobyxmoadg.zoijcleaow(inputStream)), i13, i14, lqeggnwhkgVar);
        }

        @Override // l8.dxjokdxxww
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(InputStream inputStream, l8.lqeggnwhkg lqeggnwhkgVar) {
            return this.f116317iobyxmoadg.ppxfxbqfkf(inputStream);
        }
    }

    private static final class zoijcleaow implements l8.dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final nufgyqmvbu f116318iobyxmoadg;

        zoijcleaow(nufgyqmvbu nufgyqmvbuVar) {
            this.f116318iobyxmoadg = nufgyqmvbuVar;
        }

        @Override // l8.dxjokdxxww
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public n8.ppxfxbqfkf zoijcleaow(ByteBuffer byteBuffer, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
            return this.f116318iobyxmoadg.zoijcleaow(ImageDecoder.createSource(byteBuffer), i13, i14, lqeggnwhkgVar);
        }

        @Override // l8.dxjokdxxww
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(ByteBuffer byteBuffer, l8.lqeggnwhkg lqeggnwhkgVar) {
            return this.f116318iobyxmoadg.wkgbmnqykc(byteBuffer);
        }
    }

    private nufgyqmvbu(List list, o8.zoijcleaow zoijcleaowVar) {
        this.f116314iobyxmoadg = list;
        this.f116315zoijcleaow = zoijcleaowVar;
    }

    private boolean eablkybsjg(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }

    public static l8.dxjokdxxww gxszxtbevo(List list, o8.zoijcleaow zoijcleaowVar) {
        return new ppxfxbqfkf(new nufgyqmvbu(list, zoijcleaowVar));
    }

    public static l8.dxjokdxxww iobyxmoadg(List list, o8.zoijcleaow zoijcleaowVar) {
        return new zoijcleaow(new nufgyqmvbu(list, zoijcleaowVar));
    }

    boolean ppxfxbqfkf(InputStream inputStream) {
        return eablkybsjg(com.bumptech.glide.load.iobyxmoadg.gxszxtbevo(this.f116314iobyxmoadg, inputStream, this.f116315zoijcleaow));
    }

    boolean wkgbmnqykc(ByteBuffer byteBuffer) {
        return eablkybsjg(com.bumptech.glide.load.iobyxmoadg.lqeggnwhkg(this.f116314iobyxmoadg, byteBuffer));
    }

    n8.ppxfxbqfkf zoijcleaow(ImageDecoder.Source source, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new t8.nufgyqmvbu(i13, i14, lqeggnwhkgVar));
        if (v8.zoijcleaow.iobyxmoadg(drawableDecodeDrawable)) {
            return new iobyxmoadg(v8.ppxfxbqfkf.iobyxmoadg(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }
}
