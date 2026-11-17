package iwizpuwonk;

import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import istkbnxepw.jztzpxfvev;
import java.util.Iterator;
import java.util.List;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f49808iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f49809ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f49810zoijcleaow;

    public dxjokdxxww(jztzpxfvev jztzpxfvevVar, jztzpxfvev jztzpxfvevVar2) {
        this.f49808iobyxmoadg = jztzpxfvevVar2.iobyxmoadg(TextureViewIsClosedQuirk.class);
        this.f49810zoijcleaow = jztzpxfvevVar.iobyxmoadg(PreviewOrientationIncorrectQuirk.class);
        this.f49809ppxfxbqfkf = jztzpxfvevVar.iobyxmoadg(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public void iobyxmoadg(List list) {
        if (!zoijcleaow() || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((DeferrableSurface) it.next()).wkgbmnqykc();
        }
        sopmlzcsov.iobyxmoadg("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean zoijcleaow() {
        return this.f49808iobyxmoadg || this.f49810zoijcleaow || this.f49809ppxfxbqfkf;
    }
}
