package v1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public abstract class zynmafqrjb {

    static class iobyxmoadg {
        static MenuItem eablkybsjg(MenuItem menuItem, char c13, int i13) {
            return menuItem.setNumericShortcut(c13, i13);
        }

        static MenuItem gxszxtbevo(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }

        static MenuItem iobyxmoadg(MenuItem menuItem, char c13, int i13) {
            return menuItem.setAlphabeticShortcut(c13, i13);
        }

        static MenuItem ppxfxbqfkf(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static MenuItem wkgbmnqykc(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        static MenuItem zoijcleaow(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }
    }

    public static void eablkybsjg(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof m1.zoijcleaow) {
            ((m1.zoijcleaow) menuItem).setIconTintMode(mode);
        } else {
            iobyxmoadg.wkgbmnqykc(menuItem, mode);
        }
    }

    public static void gxszxtbevo(MenuItem menuItem, char c13, int i13) {
        if (menuItem instanceof m1.zoijcleaow) {
            ((m1.zoijcleaow) menuItem).setNumericShortcut(c13, i13);
        } else {
            iobyxmoadg.eablkybsjg(menuItem, c13, i13);
        }
    }

    public static MenuItem iobyxmoadg(MenuItem menuItem, zoijcleaow zoijcleaowVar) {
        if (menuItem instanceof m1.zoijcleaow) {
            return ((m1.zoijcleaow) menuItem).iobyxmoadg(zoijcleaowVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void lqeggnwhkg(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof m1.zoijcleaow) {
            ((m1.zoijcleaow) menuItem).setTooltipText(charSequence);
        } else {
            iobyxmoadg.gxszxtbevo(menuItem, charSequence);
        }
    }

    public static void ppxfxbqfkf(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof m1.zoijcleaow) {
            ((m1.zoijcleaow) menuItem).setContentDescription(charSequence);
        } else {
            iobyxmoadg.zoijcleaow(menuItem, charSequence);
        }
    }

    public static void wkgbmnqykc(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof m1.zoijcleaow) {
            ((m1.zoijcleaow) menuItem).setIconTintList(colorStateList);
        } else {
            iobyxmoadg.ppxfxbqfkf(menuItem, colorStateList);
        }
    }

    public static void zoijcleaow(MenuItem menuItem, char c13, int i13) {
        if (menuItem instanceof m1.zoijcleaow) {
            ((m1.zoijcleaow) menuItem).setAlphabeticShortcut(c13, i13);
        } else {
            iobyxmoadg.iobyxmoadg(menuItem, c13, i13);
        }
    }
}
