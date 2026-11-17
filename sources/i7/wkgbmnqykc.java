package i7;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {
    public static final boolean eablkybsjg(Context context, String str) {
        return androidx.core.content.iobyxmoadg.checkSelfPermission(context, str) == 0;
    }

    public static final Drawable iobyxmoadg(Context context, int i13) {
        Drawable drawableZoijcleaow = nufgyqmvbu.iobyxmoadg.zoijcleaow(context, i13);
        if (drawableZoijcleaow != null) {
            return drawableZoijcleaow;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i13).toString());
    }

    public static final androidx.lifecycle.gtknphoqwx ppxfxbqfkf(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof androidx.lifecycle.vdvldrhtss)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((androidx.lifecycle.vdvldrhtss) baseContext).getLifecycle();
    }

    public static final Drawable wkgbmnqykc(Context context, Resources resources, int i13) throws XmlPullParserException, IOException {
        XmlResourceParser xml = resources.getXml(i13);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return zoijcleaow(resources, i13, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final Drawable zoijcleaow(Resources resources, int i13, Resources.Theme theme) {
        Drawable drawableGxszxtbevo = i1.nufgyqmvbu.gxszxtbevo(resources, i13, theme);
        if (drawableGxszxtbevo != null) {
            return drawableGxszxtbevo;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i13).toString());
    }
}
