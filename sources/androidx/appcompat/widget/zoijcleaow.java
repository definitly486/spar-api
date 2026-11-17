package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class zoijcleaow extends Drawable {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final ActionBarContainer f3519iobyxmoadg;

    private static class iobyxmoadg {
        public static void iobyxmoadg(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public zoijcleaow(ActionBarContainer actionBarContainer) {
        this.f3519iobyxmoadg = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3519iobyxmoadg;
        if (actionBarContainer.f2967pmvmpeiblj) {
            Drawable drawable = actionBarContainer.f2966lereixgezr;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f2961cqumvgiudr;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f3519iobyxmoadg;
        Drawable drawable3 = actionBarContainer2.f2962esjtqupxsv;
        if (drawable3 == null || !actionBarContainer2.f2970zynmafqrjb) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f3519iobyxmoadg;
        if (actionBarContainer.f2967pmvmpeiblj) {
            if (actionBarContainer.f2966lereixgezr != null) {
                iobyxmoadg.iobyxmoadg(actionBarContainer.f2961cqumvgiudr, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f2961cqumvgiudr;
            if (drawable != null) {
                iobyxmoadg.iobyxmoadg(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
