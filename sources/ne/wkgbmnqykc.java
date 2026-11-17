package ne;

import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final GmsLogger f69798iobyxmoadg = new GmsLogger("MLKitImageUtils", "");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final wkgbmnqykc f69799zoijcleaow = new wkgbmnqykc();

    private wkgbmnqykc() {
    }

    public static wkgbmnqykc zoijcleaow() {
        return f69799zoijcleaow;
    }

    public IObjectWrapper iobyxmoadg(me.iobyxmoadg iobyxmoadgVar) throws MlKitException {
        int iEablkybsjg = iobyxmoadgVar.eablkybsjg();
        if (iEablkybsjg == -1) {
            return ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(iobyxmoadgVar.zoijcleaow()));
        }
        if (iEablkybsjg != 17) {
            if (iEablkybsjg == 35) {
                return ObjectWrapper.wrap(iobyxmoadgVar.lqeggnwhkg());
            }
            if (iEablkybsjg != 842094169) {
                throw new MlKitException("Unsupported image format: " + iobyxmoadgVar.eablkybsjg(), 3);
            }
        }
        return ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(iobyxmoadgVar.ppxfxbqfkf()));
    }

    public int ppxfxbqfkf(me.iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar.eablkybsjg();
    }

    public int wkgbmnqykc(me.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.eablkybsjg() == -1) {
            return ((Bitmap) Preconditions.checkNotNull(iobyxmoadgVar.zoijcleaow())).getAllocationByteCount();
        }
        if (iobyxmoadgVar.eablkybsjg() == 17 || iobyxmoadgVar.eablkybsjg() == 842094169) {
            return ((ByteBuffer) Preconditions.checkNotNull(iobyxmoadgVar.ppxfxbqfkf())).limit();
        }
        if (iobyxmoadgVar.eablkybsjg() != 35) {
            return 0;
        }
        return (((Image.Plane[]) Preconditions.checkNotNull(iobyxmoadgVar.nufgyqmvbu()))[0].getBuffer().limit() * 3) / 2;
    }
}
