package t;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.collection.esjtqupxsv f109079iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f109080ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final istkbnxepw f109081zoijcleaow;

    public gxszxtbevo(androidx.collection.esjtqupxsv esjtqupxsvVar, istkbnxepw istkbnxepwVar) {
        this.f109079iobyxmoadg = esjtqupxsvVar;
        this.f109081zoijcleaow = istkbnxepwVar;
    }

    public final void eablkybsjg(boolean z13) {
        this.f109080ppxfxbqfkf = z13;
    }

    public final boolean iobyxmoadg(long j13) {
        Object obj;
        List listZoijcleaow = this.f109081zoijcleaow.zoijcleaow();
        int size = listZoijcleaow.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = listZoijcleaow.get(i13);
            if (lereixgezr.zoijcleaow(((cdpycssgdh) obj).wkgbmnqykc(), j13)) {
                break;
            }
            i13++;
        }
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) obj;
        if (cdpycssgdhVar != null) {
            return cdpycssgdhVar.iobyxmoadg();
        }
        return false;
    }

    public final MotionEvent ppxfxbqfkf() {
        return this.f109081zoijcleaow.iobyxmoadg();
    }

    public final boolean wkgbmnqykc() {
        return this.f109080ppxfxbqfkf;
    }

    public final androidx.collection.esjtqupxsv zoijcleaow() {
        return this.f109079iobyxmoadg;
    }
}
