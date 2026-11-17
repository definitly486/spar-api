package e0;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import h.dvvnrvtcbc;
import h.hkdspvbjdz;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    public static final dvvnrvtcbc iobyxmoadg(dvvnrvtcbc.iobyxmoadg iobyxmoadgVar, Resources resources, int i13) {
        Drawable drawable = resources.getDrawable(i13, null);
        zdlpuopuiu.nufgyqmvbu(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return hkdspvbjdz.ppxfxbqfkf(((BitmapDrawable) drawable).getBitmap());
    }
}
