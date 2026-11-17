package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f13768zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private LinearLayoutManager f13769iobyxmoadg;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0205iobyxmoadg implements Comparator {
        C0205iobyxmoadg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f13768zoijcleaow = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    iobyxmoadg(LinearLayoutManager linearLayoutManager) {
        this.f13769iobyxmoadg = linearLayoutManager;
    }

    private boolean iobyxmoadg() {
        int top;
        int i13;
        int bottom;
        int i14;
        int iVipkmwdibw = this.f13769iobyxmoadg.vipkmwdibw();
        if (iVipkmwdibw == 0) {
            return true;
        }
        boolean z13 = this.f13769iobyxmoadg.G0() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iVipkmwdibw, 2);
        for (int i15 = 0; i15 < iVipkmwdibw; i15++) {
            View viewRibwqtqdhb = this.f13769iobyxmoadg.ribwqtqdhb(i15);
            if (viewRibwqtqdhb == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = viewRibwqtqdhb.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f13768zoijcleaow;
            int[] iArr2 = iArr[i15];
            if (z13) {
                top = viewRibwqtqdhb.getLeft();
                i13 = marginLayoutParams.leftMargin;
            } else {
                top = viewRibwqtqdhb.getTop();
                i13 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i13;
            int[] iArr3 = iArr[i15];
            if (z13) {
                bottom = viewRibwqtqdhb.getRight();
                i14 = marginLayoutParams.rightMargin;
            } else {
                bottom = viewRibwqtqdhb.getBottom();
                i14 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i14;
        }
        Arrays.sort(iArr, new C0205iobyxmoadg());
        for (int i16 = 1; i16 < iVipkmwdibw; i16++) {
            if (iArr[i16 - 1][1] != iArr[i16][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i17 = iArr4[1];
        int i18 = iArr4[0];
        return i18 <= 0 && iArr[iVipkmwdibw - 1][1] >= i17 - i18;
    }

    private static boolean ppxfxbqfkf(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                if (ppxfxbqfkf(viewGroup.getChildAt(i13))) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean zoijcleaow() {
        int iVipkmwdibw = this.f13769iobyxmoadg.vipkmwdibw();
        for (int i13 = 0; i13 < iVipkmwdibw; i13++) {
            if (ppxfxbqfkf(this.f13769iobyxmoadg.ribwqtqdhb(i13))) {
                return true;
            }
        }
        return false;
    }

    boolean wkgbmnqykc() {
        return (!iobyxmoadg() || this.f13769iobyxmoadg.vipkmwdibw() <= 1) && zoijcleaow();
    }
}
