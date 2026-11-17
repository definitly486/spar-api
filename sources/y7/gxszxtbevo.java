package y7;

import gg.wwaezpbzkn;
import hg.wflxmlrfwp;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final draadjrbmk f124016iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wflxmlrfwp f124017ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f124018wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final b8.iobyxmoadg f124019zoijcleaow;

    public gxszxtbevo(draadjrbmk onValue) {
        zdlpuopuiu.btonecajqb(onValue, "onValue");
        this.f124016iobyxmoadg = onValue;
        this.f124019zoijcleaow = new b8.iobyxmoadg();
        this.f124017ppxfxbqfkf = new wflxmlrfwp();
    }

    private final void iobyxmoadg() {
        Object objRemoveFirst;
        while (true) {
            synchronized (this.f124019zoijcleaow) {
                if (this.f124017ppxfxbqfkf.isEmpty()) {
                    this.f124018wkgbmnqykc = false;
                    return;
                }
                objRemoveFirst = this.f124017ppxfxbqfkf.removeFirst();
            }
            this.f124016iobyxmoadg.invoke(objRemoveFirst);
        }
    }

    public final void zoijcleaow(Object obj) {
        synchronized (this.f124019zoijcleaow) {
            this.f124017ppxfxbqfkf.addLast(obj);
            if (this.f124018wkgbmnqykc) {
                return;
            }
            this.f124018wkgbmnqykc = true;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            iobyxmoadg();
        }
    }
}
