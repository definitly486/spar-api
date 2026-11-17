package ra;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.ojitshcjhn;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nufgyqmvbu {
    public static void eablkybsjg(View view) {
        Drawable background = view.getBackground();
        if (background instanceof lqeggnwhkg) {
            gxszxtbevo(view, (lqeggnwhkg) background);
        }
    }

    public static void gxszxtbevo(View view, lqeggnwhkg lqeggnwhkgVar) {
        if (lqeggnwhkgVar.dsvhmnatus()) {
            lqeggnwhkgVar.vipkmwdibw(ojitshcjhn.gxszxtbevo(view));
        }
    }

    static wkgbmnqykc iobyxmoadg(int i13) {
        if (i13 != 0) {
            return i13 != 1 ? zoijcleaow() : new eablkybsjg();
        }
        return new btonecajqb();
    }

    static gxszxtbevo ppxfxbqfkf() {
        return new gxszxtbevo();
    }

    public static void wkgbmnqykc(View view, float f13) {
        Drawable background = view.getBackground();
        if (background instanceof lqeggnwhkg) {
            ((lqeggnwhkg) background).sopmlzcsov(f13);
        }
    }

    static wkgbmnqykc zoijcleaow() {
        return new btonecajqb();
    }
}
