package y2;

/* JADX INFO: loaded from: classes.dex */
public class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f123541iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f123542zoijcleaow;

    public draadjrbmk() {
        this(dxjokdxxww.f123544iobyxmoadg);
    }

    public synchronized boolean eablkybsjg() {
        if (this.f123542zoijcleaow) {
            return false;
        }
        this.f123542zoijcleaow = true;
        notifyAll();
        return true;
    }

    public synchronized void iobyxmoadg() {
        while (!this.f123542zoijcleaow) {
            wait();
        }
    }

    public synchronized boolean ppxfxbqfkf() {
        boolean z13;
        z13 = this.f123542zoijcleaow;
        this.f123542zoijcleaow = false;
        return z13;
    }

    public synchronized boolean wkgbmnqykc() {
        return this.f123542zoijcleaow;
    }

    public synchronized void zoijcleaow() {
        boolean z13 = false;
        while (!this.f123542zoijcleaow) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z13 = true;
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
    }

    public draadjrbmk(dxjokdxxww dxjokdxxwwVar) {
        this.f123541iobyxmoadg = dxjokdxxwwVar;
    }
}
