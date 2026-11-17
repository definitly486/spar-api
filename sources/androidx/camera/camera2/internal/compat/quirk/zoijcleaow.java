package androidx.camera.camera2.internal.compat.quirk;

import istkbnxepw.ikoacuggdj;
import istkbnxepw.jhduphickx;
import istkbnxepw.jztzpxfvev;
import istkbnxepw.vipkmwdibw;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static volatile jztzpxfvev f3654iobyxmoadg;

    static {
        ikoacuggdj.zoijcleaow().ppxfxbqfkf(yadqdtsiqt.iobyxmoadg.iobyxmoadg(), new u1.iobyxmoadg() { // from class: jyumaefscl.iobyxmoadg
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                androidx.camera.camera2.internal.compat.quirk.zoijcleaow.wkgbmnqykc((jhduphickx) obj);
            }
        });
    }

    public static jztzpxfvev ppxfxbqfkf() {
        return f3654iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void wkgbmnqykc(jhduphickx jhduphickxVar) {
        f3654iobyxmoadg = new jztzpxfvev(ppxfxbqfkf.iobyxmoadg(jhduphickxVar));
        sopmlzcsov.iobyxmoadg("DeviceQuirks", "camera2 DeviceQuirks = " + jztzpxfvev.wkgbmnqykc(f3654iobyxmoadg));
    }

    public static vipkmwdibw zoijcleaow(Class cls) {
        return f3654iobyxmoadg.zoijcleaow(cls);
    }
}
