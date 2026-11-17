package rf;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    public static Object iobyxmoadg(Context context, Class cls) {
        ComponentCallbacks2 componentCallbacks2Iobyxmoadg = uf.iobyxmoadg.iobyxmoadg(context);
        zf.wkgbmnqykc.ppxfxbqfkf(componentCallbacks2Iobyxmoadg instanceof zf.ppxfxbqfkf, "Expected application to implement GeneratedComponentManagerHolder. Check that you're passing in an application context that uses Hilt. Application class found: %s", componentCallbacks2Iobyxmoadg.getClass());
        ((zf.ppxfxbqfkf) componentCallbacks2Iobyxmoadg).oxmwwwfdhm();
        return qf.iobyxmoadg.iobyxmoadg(componentCallbacks2Iobyxmoadg, cls);
    }
}
