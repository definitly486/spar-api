package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
final class metgxyhuhe implements xrmfcynszj {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final metgxyhuhe f7014zoijcleaow = new metgxyhuhe();

    private metgxyhuhe() {
    }

    @Override // androidx.compose.ui.platform.xrmfcynszj
    public Rect iobyxmoadg(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iLqeggnwhkg = ribwqtqdhb.lqeggnwhkg(activity);
            int i13 = rect.bottom;
            if (i13 + iLqeggnwhkg == point.y) {
                rect.bottom = i13 + iLqeggnwhkg;
            } else {
                int i14 = rect.right;
                if (i14 + iLqeggnwhkg == point.x) {
                    rect.right = i14 + iLqeggnwhkg;
                }
            }
        }
        return rect;
    }
}
