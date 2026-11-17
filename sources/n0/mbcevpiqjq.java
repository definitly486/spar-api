package n0;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class mbcevpiqjq {
    public static final wypolnanlu iobyxmoadg() {
        return Build.VERSION.SDK_INT >= 28 ? new kegysxyocb() : new tzroggbefp();
    }

    public static final Typeface ppxfxbqfkf(Typeface typeface, cdpycssgdh cdpycssgdhVar, Context context) {
        return crxdokpmqz.f68244iobyxmoadg.iobyxmoadg(typeface, cdpycssgdhVar, context);
    }

    public static final String zoijcleaow(String str, yadqdtsiqt yadqdtsiqtVar) {
        int iDxjokdxxww = yadqdtsiqtVar.dxjokdxxww() / 100;
        if (iDxjokdxxww >= 0 && iDxjokdxxww < 2) {
            return str + "-thin";
        }
        if (2 <= iDxjokdxxww && iDxjokdxxww < 4) {
            return str + "-light";
        }
        if (iDxjokdxxww == 4) {
            return str;
        }
        if (iDxjokdxxww == 5) {
            return str + "-medium";
        }
        if ((6 <= iDxjokdxxww && iDxjokdxxww < 8) || 8 > iDxjokdxxww || iDxjokdxxww >= 11) {
            return str;
        }
        return str + "-black";
    }
}
