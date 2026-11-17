package androidx.camera.extensions.internal;

import androidx.camera.extensions.impl.ExtensionVersionImpl;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static volatile gxszxtbevo f3999iobyxmoadg;

    private static class iobyxmoadg extends gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.camera.extensions.internal.gxszxtbevo
        boolean eablkybsjg() {
            return false;
        }

        @Override // androidx.camera.extensions.internal.gxszxtbevo
        gtknphoqwx ppxfxbqfkf() {
            return null;
        }
    }

    private static class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static ExtensionVersionImpl f4000ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private gtknphoqwx f4001zoijcleaow;

        zoijcleaow() {
            if (f4000ppxfxbqfkf == null) {
                f4000ppxfxbqfkf = new ExtensionVersionImpl();
            }
            gtknphoqwx gtknphoqwxVarDxjokdxxww = gtknphoqwx.dxjokdxxww(f4000ppxfxbqfkf.checkApiVersion(eablkybsjg.iobyxmoadg().eablkybsjg()));
            if (gtknphoqwxVarDxjokdxxww != null && eablkybsjg.iobyxmoadg().zoijcleaow().gxszxtbevo() == gtknphoqwxVarDxjokdxxww.gxszxtbevo()) {
                this.f4001zoijcleaow = gtknphoqwxVarDxjokdxxww;
            }
            sopmlzcsov.iobyxmoadg("ExtenderVersion", "Selected vendor runtime: " + this.f4001zoijcleaow);
        }

        @Override // androidx.camera.extensions.internal.gxszxtbevo
        boolean eablkybsjg() {
            try {
                return f4000ppxfxbqfkf.isAdvancedExtenderImplemented();
            } catch (NoSuchMethodError unused) {
                return false;
            }
        }

        @Override // androidx.camera.extensions.internal.gxszxtbevo
        gtknphoqwx ppxfxbqfkf() {
            return this.f4001zoijcleaow;
        }
    }

    public static boolean gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        return zoijcleaow().iobyxmoadg(gtknphoqwxVar.gxszxtbevo(), gtknphoqwxVar.lqeggnwhkg()) <= 0;
    }

    private static gxszxtbevo iobyxmoadg() {
        if (f3999iobyxmoadg != null) {
            return f3999iobyxmoadg;
        }
        synchronized (gxszxtbevo.class) {
            if (f3999iobyxmoadg == null) {
                try {
                    f3999iobyxmoadg = new zoijcleaow();
                } catch (NoClassDefFoundError unused) {
                    sopmlzcsov.iobyxmoadg("ExtenderVersion", "No versioning extender found. Falling back to default.");
                    f3999iobyxmoadg = new iobyxmoadg();
                }
            }
        }
        return f3999iobyxmoadg;
    }

    public static boolean lqeggnwhkg(gtknphoqwx gtknphoqwxVar) {
        return zoijcleaow().iobyxmoadg(gtknphoqwxVar.gxszxtbevo(), gtknphoqwxVar.lqeggnwhkg()) >= 0;
    }

    public static boolean wkgbmnqykc() {
        return iobyxmoadg().eablkybsjg();
    }

    public static gtknphoqwx zoijcleaow() {
        return iobyxmoadg().ppxfxbqfkf();
    }

    abstract boolean eablkybsjg();

    abstract gtknphoqwx ppxfxbqfkf();
}
