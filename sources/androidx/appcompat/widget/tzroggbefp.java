package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class tzroggbefp extends hkdspvbjdz {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final WeakReference f3398zoijcleaow;

    public tzroggbefp(Context context, Resources resources) {
        super(resources);
        this.f3398zoijcleaow = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i13) {
        Drawable drawableIobyxmoadg = iobyxmoadg(i13);
        Context context = (Context) this.f3398zoijcleaow.get();
        if (drawableIobyxmoadg != null && context != null) {
            jpowsppfya.lqeggnwhkg().iwizpuwonk(context, i13, drawableIobyxmoadg);
        }
        return drawableIobyxmoadg;
    }
}
