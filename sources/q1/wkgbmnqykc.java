package q1;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f77649iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Object f77650ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f77651wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private iobyxmoadg f77652zoijcleaow;

    public interface iobyxmoadg {
        void onCancel();
    }

    private void wkgbmnqykc() {
        while (this.f77651wkgbmnqykc) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void iobyxmoadg() {
        synchronized (this) {
            try {
                if (this.f77649iobyxmoadg) {
                    return;
                }
                this.f77649iobyxmoadg = true;
                this.f77651wkgbmnqykc = true;
                iobyxmoadg iobyxmoadgVar = this.f77652zoijcleaow;
                Object obj = this.f77650ppxfxbqfkf;
                if (iobyxmoadgVar != null) {
                    try {
                        iobyxmoadgVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f77651wkgbmnqykc = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f77651wkgbmnqykc = false;
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        synchronized (this) {
            try {
                wkgbmnqykc();
                if (this.f77652zoijcleaow == iobyxmoadgVar) {
                    return;
                }
                this.f77652zoijcleaow = iobyxmoadgVar;
                if (this.f77649iobyxmoadg && iobyxmoadgVar != null) {
                    iobyxmoadgVar.onCancel();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object zoijcleaow() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f77650ppxfxbqfkf == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f77650ppxfxbqfkf = cancellationSignal;
                    if (this.f77649iobyxmoadg) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f77650ppxfxbqfkf;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
