package v1;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final DisplayCutout f115177iobyxmoadg;

    static class iobyxmoadg {
        static int eablkybsjg(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }

        static List iobyxmoadg(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int ppxfxbqfkf(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int wkgbmnqykc(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int zoijcleaow(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }
    }

    static class zoijcleaow {
        static Insets iobyxmoadg(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    private oxmwwwfdhm(DisplayCutout displayCutout) {
        this.f115177iobyxmoadg = displayCutout;
    }

    static oxmwwwfdhm lqeggnwhkg(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new oxmwwwfdhm(displayCutout);
    }

    public int eablkybsjg() {
        if (Build.VERSION.SDK_INT >= 28) {
            return iobyxmoadg.eablkybsjg(this.f115177iobyxmoadg);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oxmwwwfdhm.class != obj.getClass()) {
            return false;
        }
        return u1.zoijcleaow.iobyxmoadg(this.f115177iobyxmoadg, ((oxmwwwfdhm) obj).f115177iobyxmoadg);
    }

    public j1.wkgbmnqykc gxszxtbevo() {
        return Build.VERSION.SDK_INT >= 30 ? j1.wkgbmnqykc.wkgbmnqykc(zoijcleaow.iobyxmoadg(this.f115177iobyxmoadg)) : j1.wkgbmnqykc.f50504eablkybsjg;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f115177iobyxmoadg;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public List iobyxmoadg() {
        return Build.VERSION.SDK_INT >= 28 ? iobyxmoadg.iobyxmoadg(this.f115177iobyxmoadg) : Collections.emptyList();
    }

    public int ppxfxbqfkf() {
        if (Build.VERSION.SDK_INT >= 28) {
            return iobyxmoadg.ppxfxbqfkf(this.f115177iobyxmoadg);
        }
        return 0;
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f115177iobyxmoadg + "}";
    }

    public int wkgbmnqykc() {
        if (Build.VERSION.SDK_INT >= 28) {
            return iobyxmoadg.wkgbmnqykc(this.f115177iobyxmoadg);
        }
        return 0;
    }

    public int zoijcleaow() {
        if (Build.VERSION.SDK_INT >= 28) {
            return iobyxmoadg.zoijcleaow(this.f115177iobyxmoadg);
        }
        return 0;
    }
}
