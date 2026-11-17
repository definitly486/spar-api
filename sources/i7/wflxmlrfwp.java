package i7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes2.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wflxmlrfwp f42080iobyxmoadg = new wflxmlrfwp();

    private wflxmlrfwp() {
    }

    private final boolean ppxfxbqfkf(boolean z13, Bitmap bitmap, f7.dxjokdxxww dxjokdxxwwVar, f7.nufgyqmvbu nufgyqmvbuVar) {
        if (z13) {
            return true;
        }
        return x6.gxszxtbevo.ppxfxbqfkf(bitmap.getWidth(), bitmap.getHeight(), f7.zoijcleaow.iobyxmoadg(dxjokdxxwwVar) ? bitmap.getWidth() : gtknphoqwx.pmvmpeiblj(dxjokdxxwwVar.wkgbmnqykc(), nufgyqmvbuVar), f7.zoijcleaow.iobyxmoadg(dxjokdxxwwVar) ? bitmap.getHeight() : gtknphoqwx.pmvmpeiblj(dxjokdxxwwVar.ppxfxbqfkf(), nufgyqmvbuVar), nufgyqmvbuVar) == 1.0d;
    }

    private final boolean zoijcleaow(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == iobyxmoadg.eablkybsjg(config);
    }

    public final Bitmap iobyxmoadg(Drawable drawable, Bitmap.Config config, f7.dxjokdxxww dxjokdxxwwVar, f7.nufgyqmvbu nufgyqmvbuVar, boolean z13) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (zoijcleaow(bitmap, config) && ppxfxbqfkf(z13, bitmap, dxjokdxxwwVar, nufgyqmvbuVar)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iRgvfuqvkyq = gtknphoqwx.rgvfuqvkyq(drawableMutate);
        int i13 = UserVerificationMethods.USER_VERIFY_NONE;
        if (iRgvfuqvkyq <= 0) {
            iRgvfuqvkyq = 512;
        }
        int iDxjokdxxww = gtknphoqwx.dxjokdxxww(drawableMutate);
        if (iDxjokdxxww > 0) {
            i13 = iDxjokdxxww;
        }
        double dPpxfxbqfkf = x6.gxszxtbevo.ppxfxbqfkf(iRgvfuqvkyq, i13, f7.zoijcleaow.iobyxmoadg(dxjokdxxwwVar) ? iRgvfuqvkyq : gtknphoqwx.pmvmpeiblj(dxjokdxxwwVar.wkgbmnqykc(), nufgyqmvbuVar), f7.zoijcleaow.iobyxmoadg(dxjokdxxwwVar) ? i13 : gtknphoqwx.pmvmpeiblj(dxjokdxxwwVar.ppxfxbqfkf(), nufgyqmvbuVar), nufgyqmvbuVar);
        int iPpxfxbqfkf = vg.iobyxmoadg.ppxfxbqfkf(((double) iRgvfuqvkyq) * dPpxfxbqfkf);
        int iPpxfxbqfkf2 = vg.iobyxmoadg.ppxfxbqfkf(dPpxfxbqfkf * ((double) i13));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iPpxfxbqfkf, iPpxfxbqfkf2, iobyxmoadg.eablkybsjg(config));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bitmapCreateBitmap, "createBitmap(width, height, config)");
        Rect bounds = drawableMutate.getBounds();
        int i14 = bounds.left;
        int i15 = bounds.top;
        int i16 = bounds.right;
        int i17 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iPpxfxbqfkf, iPpxfxbqfkf2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i14, i15, i16, i17);
        return bitmapCreateBitmap;
    }
}
