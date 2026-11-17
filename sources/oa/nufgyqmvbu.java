package oa;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nufgyqmvbu {
    public static Typeface iobyxmoadg(Context context, Typeface typeface) {
        return zoijcleaow(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface zoijcleaow(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, o1.iobyxmoadg.zoijcleaow(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
