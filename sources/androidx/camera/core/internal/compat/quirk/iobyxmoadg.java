package androidx.camera.core.internal.compat.quirk;

import istkbnxepw.ikoacuggdj;
import istkbnxepw.jhduphickx;
import istkbnxepw.jztzpxfvev;
import istkbnxepw.vipkmwdibw;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static volatile jztzpxfvev f3922iobyxmoadg;

    static {
        ikoacuggdj.zoijcleaow().ppxfxbqfkf(yadqdtsiqt.iobyxmoadg.iobyxmoadg(), new u1.iobyxmoadg() { // from class: ylkuphrtab.iobyxmoadg
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                androidx.camera.core.internal.compat.quirk.iobyxmoadg.wkgbmnqykc((jhduphickx) obj);
            }
        });
    }

    public static jztzpxfvev ppxfxbqfkf() {
        return f3922iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void wkgbmnqykc(jhduphickx jhduphickxVar) {
        f3922iobyxmoadg = new jztzpxfvev(zoijcleaow.iobyxmoadg(jhduphickxVar));
        sopmlzcsov.iobyxmoadg("DeviceQuirks", "core DeviceQuirks = " + jztzpxfvev.wkgbmnqykc(f3922iobyxmoadg));
    }

    public static vipkmwdibw zoijcleaow(Class cls) {
        return f3922iobyxmoadg.zoijcleaow(cls);
    }
}
