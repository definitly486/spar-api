package z6;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Drawable f129203iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final e7.draadjrbmk f129204zoijcleaow;

    public static final class iobyxmoadg implements dxjokdxxww.iobyxmoadg {
        @Override // z6.dxjokdxxww.iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public dxjokdxxww iobyxmoadg(Drawable drawable, e7.draadjrbmk draadjrbmkVar, v6.wkgbmnqykc wkgbmnqykcVar) {
            return new gxszxtbevo(drawable, draadjrbmkVar);
        }
    }

    public gxszxtbevo(Drawable drawable, e7.draadjrbmk draadjrbmkVar) {
        this.f129203iobyxmoadg = drawable;
        this.f129204zoijcleaow = draadjrbmkVar;
    }

    @Override // z6.dxjokdxxww
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        Drawable bitmapDrawable;
        boolean zYggfygwlhe = i7.gtknphoqwx.yggfygwlhe(this.f129203iobyxmoadg);
        if (zYggfygwlhe) {
            bitmapDrawable = new BitmapDrawable(this.f129204zoijcleaow.lqeggnwhkg().getResources(), i7.wflxmlrfwp.f42080iobyxmoadg.iobyxmoadg(this.f129203iobyxmoadg, this.f129204zoijcleaow.gxszxtbevo(), this.f129204zoijcleaow.ojitshcjhn(), this.f129204zoijcleaow.agtfadlqog(), this.f129204zoijcleaow.ppxfxbqfkf()));
        } else {
            bitmapDrawable = this.f129203iobyxmoadg;
        }
        return new lqeggnwhkg(bitmapDrawable, zYggfygwlhe, x6.wkgbmnqykc.MEMORY);
    }
}
