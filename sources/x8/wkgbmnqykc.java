package x8;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc implements l8.btonecajqb {
    @Override // l8.wkgbmnqykc
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(n8.ppxfxbqfkf ppxfxbqfkfVar, File file, l8.lqeggnwhkg lqeggnwhkgVar) throws Throwable {
        try {
            g9.iobyxmoadg.gxszxtbevo(((ppxfxbqfkf) ppxfxbqfkfVar.get()).ppxfxbqfkf(), file);
            return true;
        } catch (IOException e13) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e13);
            }
            return false;
        }
    }

    @Override // l8.btonecajqb
    public l8.ppxfxbqfkf zoijcleaow(l8.lqeggnwhkg lqeggnwhkgVar) {
        return l8.ppxfxbqfkf.SOURCE;
    }
}
