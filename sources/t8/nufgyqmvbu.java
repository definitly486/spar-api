package t8;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.resource.bitmap.agtfadlqog;
import com.bumptech.glide.load.resource.bitmap.ojitshcjhn;
import com.bumptech.glide.load.resource.bitmap.yggfygwlhe;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final agtfadlqog f110051eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f110052gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yggfygwlhe f110053iobyxmoadg = yggfygwlhe.zoijcleaow();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final l8.nufgyqmvbu f110054lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f110055ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final l8.zoijcleaow f110056wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f110057zoijcleaow;

    class iobyxmoadg implements ImageDecoder$OnPartialImageListener {
        iobyxmoadg() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public nufgyqmvbu(int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        this.f110057zoijcleaow = i13;
        this.f110055ppxfxbqfkf = i14;
        this.f110056wkgbmnqykc = (l8.zoijcleaow) lqeggnwhkgVar.ppxfxbqfkf(ojitshcjhn.f21110gxszxtbevo);
        this.f110051eablkybsjg = (agtfadlqog) lqeggnwhkgVar.ppxfxbqfkf(agtfadlqog.f21049nufgyqmvbu);
        l8.gxszxtbevo gxszxtbevoVar = ojitshcjhn.f21106btonecajqb;
        this.f110052gxszxtbevo = lqeggnwhkgVar.ppxfxbqfkf(gxszxtbevoVar) != null && ((Boolean) lqeggnwhkgVar.ppxfxbqfkf(gxszxtbevoVar)).booleanValue();
        this.f110054lqeggnwhkg = (l8.nufgyqmvbu) lqeggnwhkgVar.ppxfxbqfkf(ojitshcjhn.f21111lqeggnwhkg);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f110053iobyxmoadg.gxszxtbevo(this.f110057zoijcleaow, this.f110055ppxfxbqfkf, this.f110052gxszxtbevo, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f110056wkgbmnqykc == l8.zoijcleaow.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new iobyxmoadg());
        Size size = imageInfo.getSize();
        int width = this.f110057zoijcleaow;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f110055ppxfxbqfkf;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fZoijcleaow = this.f110051eablkybsjg.zoijcleaow(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fZoijcleaow);
        int iRound2 = Math.round(size.getHeight() * fZoijcleaow);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fZoijcleaow);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        l8.nufgyqmvbu nufgyqmvbuVar = this.f110054lqeggnwhkg;
        if (nufgyqmvbuVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((nufgyqmvbuVar == l8.nufgyqmvbu.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
