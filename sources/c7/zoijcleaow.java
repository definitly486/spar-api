package c7;

import android.net.Uri;
import e7.draadjrbmk;
import i7.gtknphoqwx;
import java.io.File;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements wkgbmnqykc {
    private final boolean zoijcleaow(Uri uri) {
        if (gtknphoqwx.vdvldrhtss(uri)) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && !zdlpuopuiu.eablkybsjg(scheme, "file")) {
            return false;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return kcexrzcfyt.ezmngbhpjk(path, '/', false, 2, null) && gtknphoqwx.nufgyqmvbu(uri) != null;
    }

    @Override // c7.wkgbmnqykc
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public File iobyxmoadg(Uri uri, draadjrbmk draadjrbmkVar) {
        if (!zoijcleaow(uri)) {
            return null;
        }
        if (!zdlpuopuiu.eablkybsjg(uri.getScheme(), "file")) {
            return new File(uri.toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        return null;
    }
}
