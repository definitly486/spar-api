package h;

import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public abstract class yzdjzghtvl {
    public static final g.lqeggnwhkg eablkybsjg(Rect rect) {
        return new g.lqeggnwhkg(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final g.lqeggnwhkg gxszxtbevo(RectF rectF) {
        return new g.lqeggnwhkg(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final Rect iobyxmoadg(g.lqeggnwhkg lqeggnwhkgVar) {
        return new Rect((int) lqeggnwhkgVar.nufgyqmvbu(), (int) lqeggnwhkgVar.gtknphoqwx(), (int) lqeggnwhkgVar.dxjokdxxww(), (int) lqeggnwhkgVar.eablkybsjg());
    }

    public static final RectF ppxfxbqfkf(g.lqeggnwhkg lqeggnwhkgVar) {
        return new RectF(lqeggnwhkgVar.nufgyqmvbu(), lqeggnwhkgVar.gtknphoqwx(), lqeggnwhkgVar.dxjokdxxww(), lqeggnwhkgVar.eablkybsjg());
    }

    public static final w0.rgvfuqvkyq wkgbmnqykc(Rect rect) {
        return new w0.rgvfuqvkyq(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final Rect zoijcleaow(w0.rgvfuqvkyq rgvfuqvkyqVar) {
        return new Rect(rgvfuqvkyqVar.gxszxtbevo(), rgvfuqvkyqVar.dxjokdxxww(), rgvfuqvkyqVar.lqeggnwhkg(), rgvfuqvkyqVar.wkgbmnqykc());
    }
}
