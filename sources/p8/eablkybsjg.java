package p8;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg implements iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private g8.iobyxmoadg f75994eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f75996ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final File f75998zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ppxfxbqfkf f75997wkgbmnqykc = new ppxfxbqfkf();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f75995iobyxmoadg = new btonecajqb();

    protected eablkybsjg(File file, long j13) {
        this.f75998zoijcleaow = file;
        this.f75996ppxfxbqfkf = j13;
    }

    public static iobyxmoadg ppxfxbqfkf(File file, long j13) {
        return new eablkybsjg(file, j13);
    }

    private synchronized g8.iobyxmoadg wkgbmnqykc() {
        try {
            if (this.f75994eablkybsjg == null) {
                this.f75994eablkybsjg = g8.iobyxmoadg.istkbnxepw(this.f75998zoijcleaow, 1, 1, this.f75996ppxfxbqfkf);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f75994eablkybsjg;
    }

    @Override // p8.iobyxmoadg
    public File iobyxmoadg(l8.eablkybsjg eablkybsjgVar) {
        String strZoijcleaow = this.f75995iobyxmoadg.zoijcleaow(eablkybsjgVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strZoijcleaow + " for for Key: " + eablkybsjgVar);
        }
        try {
            g8.iobyxmoadg.eablkybsjg eablkybsjgVarPmvmpeiblj = wkgbmnqykc().pmvmpeiblj(strZoijcleaow);
            if (eablkybsjgVarPmvmpeiblj != null) {
                return eablkybsjgVarPmvmpeiblj.iobyxmoadg(0);
            }
            return null;
        } catch (IOException e13) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e13);
            return null;
        }
    }

    @Override // p8.iobyxmoadg
    public void zoijcleaow(l8.eablkybsjg eablkybsjgVar, iobyxmoadg.zoijcleaow zoijcleaowVar) {
        String strZoijcleaow = this.f75995iobyxmoadg.zoijcleaow(eablkybsjgVar);
        this.f75997wkgbmnqykc.iobyxmoadg(strZoijcleaow);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strZoijcleaow + " for for Key: " + eablkybsjgVar);
            }
            try {
                g8.iobyxmoadg iobyxmoadgVarWkgbmnqykc = wkgbmnqykc();
                if (iobyxmoadgVarWkgbmnqykc.pmvmpeiblj(strZoijcleaow) != null) {
                    this.f75997wkgbmnqykc.zoijcleaow(strZoijcleaow);
                    return;
                }
                g8.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarJyumaefscl = iobyxmoadgVarWkgbmnqykc.jyumaefscl(strZoijcleaow);
                if (ppxfxbqfkfVarJyumaefscl == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: " + strZoijcleaow);
                }
                try {
                    if (zoijcleaowVar.iobyxmoadg(ppxfxbqfkfVarJyumaefscl.gxszxtbevo(0))) {
                        ppxfxbqfkfVarJyumaefscl.eablkybsjg();
                    }
                    ppxfxbqfkfVarJyumaefscl.zoijcleaow();
                    this.f75997wkgbmnqykc.zoijcleaow(strZoijcleaow);
                } catch (Throwable th2) {
                    ppxfxbqfkfVarJyumaefscl.zoijcleaow();
                    throw th2;
                }
            } catch (IOException e13) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e13);
                }
            }
        } catch (Throwable th3) {
            this.f75997wkgbmnqykc.zoijcleaow(strZoijcleaow);
            throw th3;
        }
    }
}
