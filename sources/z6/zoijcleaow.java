package z6;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Bitmap f129215iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final e7.draadjrbmk f129216zoijcleaow;

    public static final class iobyxmoadg implements dxjokdxxww.iobyxmoadg {
        @Override // z6.dxjokdxxww.iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public dxjokdxxww iobyxmoadg(Bitmap bitmap, e7.draadjrbmk draadjrbmkVar, v6.wkgbmnqykc wkgbmnqykcVar) {
            return new zoijcleaow(bitmap, draadjrbmkVar);
        }
    }

    public zoijcleaow(Bitmap bitmap, e7.draadjrbmk draadjrbmkVar) {
        this.f129215iobyxmoadg = bitmap;
        this.f129216zoijcleaow = draadjrbmkVar;
    }

    @Override // z6.dxjokdxxww
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        return new lqeggnwhkg(new BitmapDrawable(this.f129216zoijcleaow.lqeggnwhkg().getResources(), this.f129215iobyxmoadg), false, x6.wkgbmnqykc.MEMORY);
    }
}
