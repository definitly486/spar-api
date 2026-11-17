package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    static class iobyxmoadg {
        static ColorStateList iobyxmoadg(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        static void ppxfxbqfkf(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        static void wkgbmnqykc(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }

        static PorterDuff.Mode zoijcleaow(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }
    }

    static class zoijcleaow {
        static Drawable iobyxmoadg(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    public static void eablkybsjg(CompoundButton compoundButton, PorterDuff.Mode mode) {
        iobyxmoadg.wkgbmnqykc(compoundButton, mode);
    }

    public static Drawable iobyxmoadg(CompoundButton compoundButton) {
        return zoijcleaow.iobyxmoadg(compoundButton);
    }

    public static PorterDuff.Mode ppxfxbqfkf(CompoundButton compoundButton) {
        return iobyxmoadg.zoijcleaow(compoundButton);
    }

    public static void wkgbmnqykc(CompoundButton compoundButton, ColorStateList colorStateList) {
        iobyxmoadg.ppxfxbqfkf(compoundButton, colorStateList);
    }

    public static ColorStateList zoijcleaow(CompoundButton compoundButton) {
        return iobyxmoadg.iobyxmoadg(compoundButton);
    }
}
