package n7;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import o7.dxjokdxxww;
import o7.ppxfxbqfkf;
import v7.wkgbmnqykc;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final AssetManager f69219wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f69217iobyxmoadg = new dxjokdxxww();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f69220zoijcleaow = new HashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f69218ppxfxbqfkf = new HashMap();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private String f69216eablkybsjg = ".ttf";

    public iobyxmoadg(Drawable.Callback callback, com.airbnb.lottie.zoijcleaow zoijcleaowVar) {
        if (callback instanceof View) {
            this.f69219wkgbmnqykc = ((View) callback).getContext().getAssets();
        } else {
            wkgbmnqykc.ppxfxbqfkf("LottieDrawable must be inside of a view for images to work.");
            this.f69219wkgbmnqykc = null;
        }
    }

    private Typeface eablkybsjg(Typeface typeface, String str) {
        int i13;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i13 = 3;
        } else if (zContains) {
            i13 = 2;
        } else {
            i13 = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i13 ? typeface : Typeface.create(typeface, i13);
    }

    private Typeface iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
        String strIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
        Typeface typeface = (Typeface) this.f69218ppxfxbqfkf.get(strIobyxmoadg);
        if (typeface != null) {
            return typeface;
        }
        ppxfxbqfkfVar.ppxfxbqfkf();
        ppxfxbqfkfVar.zoijcleaow();
        if (ppxfxbqfkfVar.wkgbmnqykc() != null) {
            return ppxfxbqfkfVar.wkgbmnqykc();
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.f69219wkgbmnqykc, "fonts/" + strIobyxmoadg + this.f69216eablkybsjg);
        this.f69218ppxfxbqfkf.put(strIobyxmoadg, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public void ppxfxbqfkf(String str) {
        this.f69216eablkybsjg = str;
    }

    public void wkgbmnqykc(com.airbnb.lottie.zoijcleaow zoijcleaowVar) {
    }

    public Typeface zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f69217iobyxmoadg.zoijcleaow(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.ppxfxbqfkf());
        Typeface typeface = (Typeface) this.f69220zoijcleaow.get(this.f69217iobyxmoadg);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceEablkybsjg = eablkybsjg(iobyxmoadg(ppxfxbqfkfVar), ppxfxbqfkfVar.ppxfxbqfkf());
        this.f69220zoijcleaow.put(this.f69217iobyxmoadg, typefaceEablkybsjg);
        return typefaceEablkybsjg;
    }
}
