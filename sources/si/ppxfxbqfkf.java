package si;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f106727iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final int f106728zoijcleaow;

        static {
            wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f106753ppxfxbqfkf;
            f106728zoijcleaow = (~(iobyxmoadgVar.dxjokdxxww() | iobyxmoadgVar.wkgbmnqykc())) & iobyxmoadgVar.zoijcleaow();
        }

        private iobyxmoadg() {
        }

        @Override // si.ppxfxbqfkf
        public int iobyxmoadg() {
            return f106728zoijcleaow;
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f106729iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        @Override // si.ppxfxbqfkf
        public int iobyxmoadg() {
            return 0;
        }
    }

    public abstract int iobyxmoadg();

    public String toString() {
        return getClass().getSimpleName();
    }
}
