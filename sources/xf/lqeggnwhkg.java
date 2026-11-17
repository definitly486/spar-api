package xf;

import androidx.lifecycle.pkzmftpjix;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private t2.iobyxmoadg f122274iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f122275ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private pkzmftpjix f122276zoijcleaow;

    lqeggnwhkg(t2.iobyxmoadg iobyxmoadgVar) {
        this.f122275ppxfxbqfkf = iobyxmoadgVar == null;
        this.f122274iobyxmoadg = iobyxmoadgVar;
    }

    public void iobyxmoadg() {
        this.f122274iobyxmoadg = null;
    }

    public void ppxfxbqfkf(t2.iobyxmoadg iobyxmoadgVar) {
        if (this.f122276zoijcleaow != null) {
            return;
        }
        this.f122274iobyxmoadg = iobyxmoadgVar;
    }

    public boolean zoijcleaow() {
        return this.f122276zoijcleaow == null && this.f122274iobyxmoadg == null;
    }
}
