package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {

    private static class iobyxmoadg {
        static void iobyxmoadg(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static void zoijcleaow(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    public static Drawable iobyxmoadg(CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    public static void ppxfxbqfkf(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        iobyxmoadg.zoijcleaow(checkedTextView, mode);
    }

    public static void zoijcleaow(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        iobyxmoadg.iobyxmoadg(checkedTextView, colorStateList);
    }
}
