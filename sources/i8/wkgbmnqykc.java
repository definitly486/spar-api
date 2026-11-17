package i8;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import h.bfopjjpdmp;
import h.hkdspvbjdz;
import h.oipsdeybqn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {
    public static final l.ppxfxbqfkf iobyxmoadg(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            zdlpuopuiu.dxjokdxxww(bitmap, "bitmap");
            return new l.iobyxmoadg(hkdspvbjdz.ppxfxbqfkf(bitmap), 0L, 0L, 6, null);
        }
        if (drawable instanceof ColorDrawable) {
            return new l.zoijcleaow(bfopjjpdmp.zoijcleaow(((ColorDrawable) drawable).getColor()), null);
        }
        if (drawable == null) {
            return new l.zoijcleaow(oipsdeybqn.f38945zoijcleaow.gxszxtbevo(), null);
        }
        Drawable drawableMutate = drawable.mutate();
        zdlpuopuiu.dxjokdxxww(drawableMutate, "mutate()");
        return new iobyxmoadg(drawableMutate);
    }
}
