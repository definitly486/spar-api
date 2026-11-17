package p41;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes5.dex */
public abstract class nufgyqmvbu {
    public static final void eablkybsjg(Button button, String str, String str2) {
        ColorStateList colorStateList;
        zdlpuopuiu.btonecajqb(button, "<this>");
        if (str != null) {
            try {
                if (str.length() == 0) {
                    colorStateList = null;
                } else {
                    colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{Color.parseColor(str), (str2 == null || str2.length() <= 0) ? dxjokdxxww.iobyxmoadg(button, b31.wkgbmnqykc.spar_color_surface_button_disable) : Color.parseColor(str2)});
                }
            } catch (IllegalArgumentException e13) {
                kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(e13, new CrashlyticsKey[0]);
                return;
            }
        } else {
            colorStateList = null;
        }
        button.setBackgroundTintList(colorStateList);
    }

    public static final void gxszxtbevo(ImageView imageView, int i13) {
        zdlpuopuiu.btonecajqb(imageView, "<this>");
        Context context = imageView.getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        imageView.setImageTintList(ColorStateList.valueOf(ppxfxbqfkf.ppxfxbqfkf(context, i13)));
    }

    public static final void iobyxmoadg(View view) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final void lqeggnwhkg(View view, String str) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        if (str != null) {
            try {
                if (str.length() != 0) {
                    int color = Color.parseColor(str);
                    view.setBackgroundTintList(ColorStateList.valueOf(Color.argb(Color.alpha(color), Math.min((int) (Color.red(color) + 76.5f), KotlinVersion.MAX_COMPONENT_VALUE), Math.min((int) (Color.green(color) + 76.5f), KotlinVersion.MAX_COMPONENT_VALUE), Math.min((int) (Color.blue(color) + 76.5f), KotlinVersion.MAX_COMPONENT_VALUE))));
                    return;
                }
            } catch (IllegalArgumentException e13) {
                kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(e13, new CrashlyticsKey[0]);
                return;
            }
        }
        throw new IllegalArgumentException("Color is Null or Empty");
    }

    public static final void nufgyqmvbu(Button button, String str) {
        zdlpuopuiu.btonecajqb(button, "<this>");
        if (str != null) {
            try {
                if (str.length() == 0) {
                    return;
                }
                button.setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
            } catch (IllegalArgumentException e13) {
                kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(e13, new CrashlyticsKey[0]);
            }
        }
    }

    public static final void ppxfxbqfkf(View view, String str) {
        ColorStateList colorStateListValueOf;
        zdlpuopuiu.btonecajqb(view, "<this>");
        if (str != null) {
            try {
                colorStateListValueOf = str.length() == 0 ? null : ColorStateList.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException e13) {
                kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(e13, new CrashlyticsKey[0]);
                return;
            }
        }
        view.setBackgroundTintList(colorStateListValueOf);
    }

    public static final void wkgbmnqykc(View view, int i13) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        Context context = view.getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        view.setBackgroundTintList(ColorStateList.valueOf(ppxfxbqfkf.ppxfxbqfkf(context, i13)));
    }

    public static final void zoijcleaow(View view, int i13) {
        zdlpuopuiu.btonecajqb(view, "<this>");
        view.setBackgroundTintList(ColorStateList.valueOf(androidx.core.content.iobyxmoadg.getColor(view.getContext(), i13)));
    }
}
