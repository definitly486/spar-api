package n7;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.jpowsppfya;
import com.airbnb.lottie.ppxfxbqfkf;
import java.io.IOException;
import java.util.Map;
import v7.btonecajqb;
import v7.wkgbmnqykc;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Object f69221wkgbmnqykc = new Object();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f69222iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f69223ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f69224zoijcleaow;

    public zoijcleaow(Drawable.Callback callback, String str, ppxfxbqfkf ppxfxbqfkfVar, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f69224zoijcleaow = str;
        } else {
            this.f69224zoijcleaow = str + '/';
        }
        this.f69223ppxfxbqfkf = map;
        wkgbmnqykc(ppxfxbqfkfVar);
        if (callback instanceof View) {
            this.f69222iobyxmoadg = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f69222iobyxmoadg = null;
        }
    }

    private Bitmap ppxfxbqfkf(String str, Bitmap bitmap) {
        synchronized (f69221wkgbmnqykc) {
            ((jpowsppfya) this.f69223ppxfxbqfkf.get(str)).lqeggnwhkg(bitmap);
        }
        return bitmap;
    }

    public Bitmap iobyxmoadg(String str) {
        jpowsppfya jpowsppfyaVar = (jpowsppfya) this.f69223ppxfxbqfkf.get(str);
        if (jpowsppfyaVar == null) {
            return null;
        }
        Bitmap bitmapZoijcleaow = jpowsppfyaVar.zoijcleaow();
        if (bitmapZoijcleaow != null) {
            return bitmapZoijcleaow;
        }
        Context context = this.f69222iobyxmoadg;
        if (context == null) {
            return null;
        }
        String strPpxfxbqfkf = jpowsppfyaVar.ppxfxbqfkf();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strPpxfxbqfkf.startsWith("data:") && strPpxfxbqfkf.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strPpxfxbqfkf.substring(strPpxfxbqfkf.indexOf(44) + 1), 0);
                return ppxfxbqfkf(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e13) {
                wkgbmnqykc.wkgbmnqykc("data URL did not have correct base64 format.", e13);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f69224zoijcleaow)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f69224zoijcleaow + strPpxfxbqfkf), null, options);
                if (bitmapDecodeStream != null) {
                    return ppxfxbqfkf(str, btonecajqb.draadjrbmk(bitmapDecodeStream, jpowsppfyaVar.gxszxtbevo(), jpowsppfyaVar.wkgbmnqykc()));
                }
                wkgbmnqykc.ppxfxbqfkf("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e14) {
                wkgbmnqykc.wkgbmnqykc("Unable to decode image `" + str + "`.", e14);
                return null;
            }
        } catch (IOException e15) {
            wkgbmnqykc.wkgbmnqykc("Unable to open asset.", e15);
            return null;
        }
    }

    public void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar) {
    }

    public boolean zoijcleaow(Context context) {
        if (this.f69222iobyxmoadg instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f69222iobyxmoadg;
    }
}
