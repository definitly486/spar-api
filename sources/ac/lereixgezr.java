package ac;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f1377iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gc.lqeggnwhkg f1378zoijcleaow;

    public lereixgezr(String str, gc.lqeggnwhkg lqeggnwhkgVar) {
        this.f1377iobyxmoadg = str;
        this.f1378zoijcleaow = lqeggnwhkgVar;
    }

    private File zoijcleaow() {
        return this.f1378zoijcleaow.lqeggnwhkg(this.f1377iobyxmoadg);
    }

    public boolean iobyxmoadg() {
        try {
            return zoijcleaow().createNewFile();
        } catch (IOException e13) {
            xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Error creating marker: " + this.f1377iobyxmoadg, e13);
            return false;
        }
    }

    public boolean ppxfxbqfkf() {
        return zoijcleaow().exists();
    }

    public boolean wkgbmnqykc() {
        return zoijcleaow().delete();
    }
}
