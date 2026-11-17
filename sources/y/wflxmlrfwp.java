package y;

import androidx.compose.runtime.c1;
import androidx.compose.runtime.iwxlajgraz;

/* JADX INFO: loaded from: classes.dex */
public final class wflxmlrfwp extends lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f123492iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iwxlajgraz f123493zoijcleaow;

    public wflxmlrfwp(ppxfxbqfkf ppxfxbqfkfVar) {
        super(null);
        this.f123492iobyxmoadg = ppxfxbqfkfVar;
        this.f123493zoijcleaow = c1.ppxfxbqfkf(null, null, 2, null);
    }

    private final void eablkybsjg(Object obj) {
        this.f123493zoijcleaow.setValue(obj);
    }

    private final Object ppxfxbqfkf() {
        return this.f123493zoijcleaow.getValue();
    }

    @Override // y.lqeggnwhkg
    public boolean iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
        return ppxfxbqfkfVar == this.f123492iobyxmoadg;
    }

    public void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, Object obj) {
        if (!(ppxfxbqfkfVar == this.f123492iobyxmoadg)) {
            w.iobyxmoadg.zoijcleaow("Check failed.");
        }
        eablkybsjg(obj);
    }

    @Override // y.lqeggnwhkg
    public Object zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
        if (!(ppxfxbqfkfVar == this.f123492iobyxmoadg)) {
            w.iobyxmoadg.zoijcleaow("Check failed.");
        }
        Object objPpxfxbqfkf = ppxfxbqfkf();
        if (objPpxfxbqfkf == null) {
            return null;
        }
        return objPpxfxbqfkf;
    }
}
