package t1;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final wflxmlrfwp f109249eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final wflxmlrfwp f109250gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final wflxmlrfwp f109252ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final wflxmlrfwp f109253wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wflxmlrfwp f109251iobyxmoadg = new eablkybsjg(null, false);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final wflxmlrfwp f109254zoijcleaow = new eablkybsjg(null, true);

    private static class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f109255zoijcleaow;

        eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
            super(ppxfxbqfkfVar);
            this.f109255zoijcleaow = z13;
        }

        @Override // t1.agtfadlqog.wkgbmnqykc
        protected boolean zoijcleaow() {
            return this.f109255zoijcleaow;
        }
    }

    private static class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final gxszxtbevo f109256zoijcleaow = new gxszxtbevo();

        gxszxtbevo() {
            super(null);
        }

        @Override // t1.agtfadlqog.wkgbmnqykc
        protected boolean zoijcleaow() {
            return ojitshcjhn.iobyxmoadg(Locale.getDefault()) == 1;
        }
    }

    private static class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final iobyxmoadg f109257zoijcleaow = new iobyxmoadg(true);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f109258iobyxmoadg;

        private iobyxmoadg(boolean z13) {
            this.f109258iobyxmoadg = z13;
        }

        @Override // t1.agtfadlqog.ppxfxbqfkf
        public int iobyxmoadg(CharSequence charSequence, int i13, int i14) {
            int i15 = i14 + i13;
            boolean z13 = false;
            while (i13 < i15) {
                int iIobyxmoadg = agtfadlqog.iobyxmoadg(Character.getDirectionality(charSequence.charAt(i13)));
                if (iIobyxmoadg != 0) {
                    if (iIobyxmoadg != 1) {
                        continue;
                    } else if (!this.f109258iobyxmoadg) {
                        return 1;
                    }
                    i13++;
                    z13 = z13;
                } else if (this.f109258iobyxmoadg) {
                    return 0;
                }
                z13 = true;
                i13++;
                z13 = z13;
            }
            if (z13) {
                return this.f109258iobyxmoadg ? 1 : 0;
            }
            return 2;
        }
    }

    private interface ppxfxbqfkf {
        int iobyxmoadg(CharSequence charSequence, int i13, int i14);
    }

    private static abstract class wkgbmnqykc implements wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ppxfxbqfkf f109259iobyxmoadg;

        wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f109259iobyxmoadg = ppxfxbqfkfVar;
        }

        private boolean ppxfxbqfkf(CharSequence charSequence, int i13, int i14) {
            int iIobyxmoadg = this.f109259iobyxmoadg.iobyxmoadg(charSequence, i13, i14);
            if (iIobyxmoadg == 0) {
                return true;
            }
            if (iIobyxmoadg != 1) {
                return zoijcleaow();
            }
            return false;
        }

        @Override // t1.wflxmlrfwp
        public boolean iobyxmoadg(CharSequence charSequence, int i13, int i14) {
            if (charSequence == null || i13 < 0 || i14 < 0 || charSequence.length() - i14 < i13) {
                throw new IllegalArgumentException();
            }
            return this.f109259iobyxmoadg == null ? zoijcleaow() : ppxfxbqfkf(charSequence, i13, i14);
        }

        protected abstract boolean zoijcleaow();
    }

    private static class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final zoijcleaow f109260iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        @Override // t1.agtfadlqog.ppxfxbqfkf
        public int iobyxmoadg(CharSequence charSequence, int i13, int i14) {
            int i15 = i14 + i13;
            int iZoijcleaow = 2;
            while (i13 < i15 && iZoijcleaow == 2) {
                iZoijcleaow = agtfadlqog.zoijcleaow(Character.getDirectionality(charSequence.charAt(i13)));
                i13++;
            }
            return iZoijcleaow;
        }
    }

    static {
        zoijcleaow zoijcleaowVar = zoijcleaow.f109260iobyxmoadg;
        f109252ppxfxbqfkf = new eablkybsjg(zoijcleaowVar, false);
        f109253wkgbmnqykc = new eablkybsjg(zoijcleaowVar, true);
        f109249eablkybsjg = new eablkybsjg(iobyxmoadg.f109257zoijcleaow, false);
        f109250gxszxtbevo = gxszxtbevo.f109256zoijcleaow;
    }

    static int iobyxmoadg(int i13) {
        if (i13 != 0) {
            return (i13 == 1 || i13 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int zoijcleaow(int i13) {
        if (i13 != 0) {
            if (i13 == 1 || i13 == 2) {
                return 0;
            }
            switch (i13) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
