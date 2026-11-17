package n8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f69347iobyxmoadg = new C1489iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f69350zoijcleaow = new zoijcleaow();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f69348ppxfxbqfkf = new ppxfxbqfkf();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f69349wkgbmnqykc = new wkgbmnqykc();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f69346eablkybsjg = new eablkybsjg();

    class eablkybsjg extends iobyxmoadg {
        eablkybsjg() {
        }

        @Override // n8.iobyxmoadg
        public boolean iobyxmoadg() {
            return true;
        }

        @Override // n8.iobyxmoadg
        public boolean ppxfxbqfkf(l8.iobyxmoadg iobyxmoadgVar) {
            return iobyxmoadgVar == l8.iobyxmoadg.REMOTE;
        }

        @Override // n8.iobyxmoadg
        public boolean wkgbmnqykc(boolean z13, l8.iobyxmoadg iobyxmoadgVar, l8.ppxfxbqfkf ppxfxbqfkfVar) {
            return ((z13 && iobyxmoadgVar == l8.iobyxmoadg.DATA_DISK_CACHE) || iobyxmoadgVar == l8.iobyxmoadg.LOCAL) && ppxfxbqfkfVar == l8.ppxfxbqfkf.TRANSFORMED;
        }

        @Override // n8.iobyxmoadg
        public boolean zoijcleaow() {
            return true;
        }
    }

    /* JADX INFO: renamed from: n8.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C1489iobyxmoadg extends iobyxmoadg {
        C1489iobyxmoadg() {
        }

        @Override // n8.iobyxmoadg
        public boolean iobyxmoadg() {
            return true;
        }

        @Override // n8.iobyxmoadg
        public boolean ppxfxbqfkf(l8.iobyxmoadg iobyxmoadgVar) {
            return iobyxmoadgVar == l8.iobyxmoadg.REMOTE;
        }

        @Override // n8.iobyxmoadg
        public boolean wkgbmnqykc(boolean z13, l8.iobyxmoadg iobyxmoadgVar, l8.ppxfxbqfkf ppxfxbqfkfVar) {
            return (iobyxmoadgVar == l8.iobyxmoadg.RESOURCE_DISK_CACHE || iobyxmoadgVar == l8.iobyxmoadg.MEMORY_CACHE) ? false : true;
        }

        @Override // n8.iobyxmoadg
        public boolean zoijcleaow() {
            return true;
        }
    }

    class ppxfxbqfkf extends iobyxmoadg {
        ppxfxbqfkf() {
        }

        @Override // n8.iobyxmoadg
        public boolean iobyxmoadg() {
            return true;
        }

        @Override // n8.iobyxmoadg
        public boolean ppxfxbqfkf(l8.iobyxmoadg iobyxmoadgVar) {
            return (iobyxmoadgVar == l8.iobyxmoadg.DATA_DISK_CACHE || iobyxmoadgVar == l8.iobyxmoadg.MEMORY_CACHE) ? false : true;
        }

        @Override // n8.iobyxmoadg
        public boolean wkgbmnqykc(boolean z13, l8.iobyxmoadg iobyxmoadgVar, l8.ppxfxbqfkf ppxfxbqfkfVar) {
            return false;
        }

        @Override // n8.iobyxmoadg
        public boolean zoijcleaow() {
            return false;
        }
    }

    class wkgbmnqykc extends iobyxmoadg {
        wkgbmnqykc() {
        }

        @Override // n8.iobyxmoadg
        public boolean iobyxmoadg() {
            return false;
        }

        @Override // n8.iobyxmoadg
        public boolean ppxfxbqfkf(l8.iobyxmoadg iobyxmoadgVar) {
            return false;
        }

        @Override // n8.iobyxmoadg
        public boolean wkgbmnqykc(boolean z13, l8.iobyxmoadg iobyxmoadgVar, l8.ppxfxbqfkf ppxfxbqfkfVar) {
            return (iobyxmoadgVar == l8.iobyxmoadg.RESOURCE_DISK_CACHE || iobyxmoadgVar == l8.iobyxmoadg.MEMORY_CACHE) ? false : true;
        }

        @Override // n8.iobyxmoadg
        public boolean zoijcleaow() {
            return true;
        }
    }

    class zoijcleaow extends iobyxmoadg {
        zoijcleaow() {
        }

        @Override // n8.iobyxmoadg
        public boolean iobyxmoadg() {
            return false;
        }

        @Override // n8.iobyxmoadg
        public boolean ppxfxbqfkf(l8.iobyxmoadg iobyxmoadgVar) {
            return false;
        }

        @Override // n8.iobyxmoadg
        public boolean wkgbmnqykc(boolean z13, l8.iobyxmoadg iobyxmoadgVar, l8.ppxfxbqfkf ppxfxbqfkfVar) {
            return false;
        }

        @Override // n8.iobyxmoadg
        public boolean zoijcleaow() {
            return false;
        }
    }

    public abstract boolean iobyxmoadg();

    public abstract boolean ppxfxbqfkf(l8.iobyxmoadg iobyxmoadgVar);

    public abstract boolean wkgbmnqykc(boolean z13, l8.iobyxmoadg iobyxmoadgVar, l8.ppxfxbqfkf ppxfxbqfkfVar);

    public abstract boolean zoijcleaow();
}
