package v8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static volatile boolean f116313iobyxmoadg = true;

    private static Drawable eablkybsjg(Context context, int i13, Resources.Theme theme) {
        if (theme != null) {
            androidx.appcompat.view.wkgbmnqykc wkgbmnqykcVar = new androidx.appcompat.view.wkgbmnqykc(context, theme);
            wkgbmnqykcVar.iobyxmoadg(theme.getResources().getConfiguration());
            context = wkgbmnqykcVar;
        }
        return nufgyqmvbu.iobyxmoadg.zoijcleaow(context, i13);
    }

    public static Drawable iobyxmoadg(Context context, int i13, Resources.Theme theme) {
        return ppxfxbqfkf(context, context, i13, theme);
    }

    private static Drawable ppxfxbqfkf(Context context, Context context2, int i13, Resources.Theme theme) {
        try {
            if (f116313iobyxmoadg) {
                return eablkybsjg(context2, i13, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e13) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e13;
            }
            return androidx.core.content.iobyxmoadg.getDrawable(context2, i13);
        } catch (NoClassDefFoundError unused2) {
            f116313iobyxmoadg = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return wkgbmnqykc(context2, i13, theme);
    }

    private static Drawable wkgbmnqykc(Context context, int i13, Resources.Theme theme) {
        return i1.nufgyqmvbu.gxszxtbevo(context.getResources(), i13, theme);
    }

    public static Drawable zoijcleaow(Context context, Context context2, int i13) {
        return ppxfxbqfkf(context, context2, i13, null);
    }
}
