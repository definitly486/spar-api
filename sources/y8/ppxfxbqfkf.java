package y8;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final o8.wkgbmnqykc f124061iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final eablkybsjg f124062ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f124063zoijcleaow;

    public ppxfxbqfkf(o8.wkgbmnqykc wkgbmnqykcVar, eablkybsjg eablkybsjgVar, eablkybsjg eablkybsjgVar2) {
        this.f124061iobyxmoadg = wkgbmnqykcVar;
        this.f124063zoijcleaow = eablkybsjgVar;
        this.f124062ppxfxbqfkf = eablkybsjgVar2;
    }

    private static n8.ppxfxbqfkf zoijcleaow(n8.ppxfxbqfkf ppxfxbqfkfVar) {
        return ppxfxbqfkfVar;
    }

    @Override // y8.eablkybsjg
    public n8.ppxfxbqfkf iobyxmoadg(n8.ppxfxbqfkf ppxfxbqfkfVar, l8.lqeggnwhkg lqeggnwhkgVar) {
        Drawable drawable = (Drawable) ppxfxbqfkfVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f124063zoijcleaow.iobyxmoadg(com.bumptech.glide.load.resource.bitmap.lqeggnwhkg.eablkybsjg(((BitmapDrawable) drawable).getBitmap(), this.f124061iobyxmoadg), lqeggnwhkgVar);
        }
        if (drawable instanceof x8.ppxfxbqfkf) {
            return this.f124062ppxfxbqfkf.iobyxmoadg(zoijcleaow(ppxfxbqfkfVar), lqeggnwhkgVar);
        }
        return null;
    }
}
