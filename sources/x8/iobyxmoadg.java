package x8;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import g9.draadjrbmk;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements l8.dxjokdxxww {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final C3061iobyxmoadg f121436gxszxtbevo = new C3061iobyxmoadg();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final zoijcleaow f121437lqeggnwhkg = new zoijcleaow();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final x8.zoijcleaow f121438eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f121439iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f121440ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final C3061iobyxmoadg f121441wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f121442zoijcleaow;

    /* JADX INFO: renamed from: x8.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static class C3061iobyxmoadg {
        C3061iobyxmoadg() {
        }

        h8.iobyxmoadg iobyxmoadg(h8.iobyxmoadg.InterfaceC0923iobyxmoadg interfaceC0923iobyxmoadg, h8.ppxfxbqfkf ppxfxbqfkfVar, ByteBuffer byteBuffer, int i13) {
            return new h8.eablkybsjg(interfaceC0923iobyxmoadg, ppxfxbqfkfVar, byteBuffer, i13);
        }
    }

    static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Queue f121443iobyxmoadg = draadjrbmk.gxszxtbevo(0);

        zoijcleaow() {
        }

        synchronized h8.wkgbmnqykc iobyxmoadg(ByteBuffer byteBuffer) {
            h8.wkgbmnqykc wkgbmnqykcVar;
            try {
                wkgbmnqykcVar = (h8.wkgbmnqykc) this.f121443iobyxmoadg.poll();
                if (wkgbmnqykcVar == null) {
                    wkgbmnqykcVar = new h8.wkgbmnqykc();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return wkgbmnqykcVar.rgvfuqvkyq(byteBuffer);
        }

        synchronized void zoijcleaow(h8.wkgbmnqykc wkgbmnqykcVar) {
            wkgbmnqykcVar.iobyxmoadg();
            this.f121443iobyxmoadg.offer(wkgbmnqykcVar);
        }
    }

    public iobyxmoadg(Context context, List list, o8.wkgbmnqykc wkgbmnqykcVar, o8.zoijcleaow zoijcleaowVar) {
        this(context, list, wkgbmnqykcVar, zoijcleaowVar, f121437lqeggnwhkg, f121436gxszxtbevo);
    }

    private static int eablkybsjg(h8.ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14) {
        int iMin = Math.min(ppxfxbqfkfVar.iobyxmoadg() / i14, ppxfxbqfkfVar.wkgbmnqykc() / i13);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i13 + "x" + i14 + "], actual dimens: [" + ppxfxbqfkfVar.wkgbmnqykc() + "x" + ppxfxbqfkfVar.iobyxmoadg() + "]");
        }
        return iMax;
    }

    private eablkybsjg ppxfxbqfkf(ByteBuffer byteBuffer, int i13, int i14, h8.wkgbmnqykc wkgbmnqykcVar, l8.lqeggnwhkg lqeggnwhkgVar) {
        long jZoijcleaow = g9.lqeggnwhkg.zoijcleaow();
        try {
            h8.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
            if (ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow() > 0 && ppxfxbqfkfVarPpxfxbqfkf.ppxfxbqfkf() == 0) {
                Bitmap.Config config = lqeggnwhkgVar.ppxfxbqfkf(dxjokdxxww.f121433iobyxmoadg) == l8.zoijcleaow.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                h8.iobyxmoadg iobyxmoadgVarIobyxmoadg = this.f121441wkgbmnqykc.iobyxmoadg(this.f121438eablkybsjg, ppxfxbqfkfVarPpxfxbqfkf, byteBuffer, eablkybsjg(ppxfxbqfkfVarPpxfxbqfkf, i13, i14));
                iobyxmoadgVarIobyxmoadg.wkgbmnqykc(config);
                iobyxmoadgVarIobyxmoadg.zoijcleaow();
                Bitmap bitmapIobyxmoadg = iobyxmoadgVarIobyxmoadg.iobyxmoadg();
                if (bitmapIobyxmoadg == null) {
                    return null;
                }
                return new eablkybsjg(new ppxfxbqfkf(this.f121439iobyxmoadg, iobyxmoadgVarIobyxmoadg, t8.btonecajqb.ppxfxbqfkf(), i13, i14, bitmapIobyxmoadg));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + g9.lqeggnwhkg.iobyxmoadg(jZoijcleaow));
            }
        }
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(ByteBuffer byteBuffer, l8.lqeggnwhkg lqeggnwhkgVar) {
        return !((Boolean) lqeggnwhkgVar.ppxfxbqfkf(dxjokdxxww.f121434zoijcleaow)).booleanValue() && com.bumptech.glide.load.iobyxmoadg.lqeggnwhkg(this.f121442zoijcleaow, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public eablkybsjg zoijcleaow(ByteBuffer byteBuffer, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        h8.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = this.f121440ppxfxbqfkf.iobyxmoadg(byteBuffer);
        try {
            return ppxfxbqfkf(byteBuffer, i13, i14, wkgbmnqykcVarIobyxmoadg, lqeggnwhkgVar);
        } finally {
            this.f121440ppxfxbqfkf.zoijcleaow(wkgbmnqykcVarIobyxmoadg);
        }
    }

    iobyxmoadg(Context context, List list, o8.wkgbmnqykc wkgbmnqykcVar, o8.zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2, C3061iobyxmoadg c3061iobyxmoadg) {
        this.f121439iobyxmoadg = context.getApplicationContext();
        this.f121442zoijcleaow = list;
        this.f121441wkgbmnqykc = c3061iobyxmoadg;
        this.f121438eablkybsjg = new x8.zoijcleaow(wkgbmnqykcVar, zoijcleaowVar);
        this.f121440ppxfxbqfkf = zoijcleaowVar2;
    }
}
