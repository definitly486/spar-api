package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class stevsuqkhv extends ContextWrapper {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Object f3394ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static ArrayList f3395wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Resources f3396iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Resources.Theme f3397zoijcleaow;

    private stevsuqkhv(Context context) {
        super(context);
        if (!ribwqtqdhb.ppxfxbqfkf()) {
            this.f3396iobyxmoadg = new tzroggbefp(this, context.getResources());
            this.f3397zoijcleaow = null;
            return;
        }
        ribwqtqdhb ribwqtqdhbVar = new ribwqtqdhb(this, context.getResources());
        this.f3396iobyxmoadg = ribwqtqdhbVar;
        Resources.Theme themeNewTheme = ribwqtqdhbVar.newTheme();
        this.f3397zoijcleaow = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean iobyxmoadg(Context context) {
        if ((context instanceof stevsuqkhv) || (context.getResources() instanceof tzroggbefp) || (context.getResources() instanceof ribwqtqdhb)) {
            return false;
        }
        return ribwqtqdhb.ppxfxbqfkf();
    }

    public static Context zoijcleaow(Context context) {
        if (!iobyxmoadg(context)) {
            return context;
        }
        synchronized (f3394ppxfxbqfkf) {
            try {
                ArrayList arrayList = f3395wkgbmnqykc;
                if (arrayList == null) {
                    f3395wkgbmnqykc = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f3395wkgbmnqykc.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f3395wkgbmnqykc.remove(size);
                        }
                    }
                    for (int size2 = f3395wkgbmnqykc.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f3395wkgbmnqykc.get(size2);
                        stevsuqkhv stevsuqkhvVar = weakReference2 != null ? (stevsuqkhv) weakReference2.get() : null;
                        if (stevsuqkhvVar != null && stevsuqkhvVar.getBaseContext() == context) {
                            return stevsuqkhvVar;
                        }
                    }
                }
                stevsuqkhv stevsuqkhvVar2 = new stevsuqkhv(context);
                f3395wkgbmnqykc.add(new WeakReference(stevsuqkhvVar2));
                return stevsuqkhvVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f3396iobyxmoadg.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f3396iobyxmoadg;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f3397zoijcleaow;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i13) {
        Resources.Theme theme = this.f3397zoijcleaow;
        if (theme == null) {
            super.setTheme(i13);
        } else {
            theme.applyStyle(i13, true);
        }
    }
}
