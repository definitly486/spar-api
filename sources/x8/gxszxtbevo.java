package x8;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import l8.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo implements gtknphoqwx {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gtknphoqwx f121435zoijcleaow;

    public gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this.f121435zoijcleaow = (gtknphoqwx) g9.gtknphoqwx.eablkybsjg(gtknphoqwxVar);
    }

    @Override // l8.eablkybsjg
    public boolean equals(Object obj) {
        if (obj instanceof gxszxtbevo) {
            return this.f121435zoijcleaow.equals(((gxszxtbevo) obj).f121435zoijcleaow);
        }
        return false;
    }

    @Override // l8.eablkybsjg
    public int hashCode() {
        return this.f121435zoijcleaow.hashCode();
    }

    @Override // l8.gtknphoqwx
    public n8.ppxfxbqfkf iobyxmoadg(Context context, n8.ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14) {
        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) ppxfxbqfkfVar.get();
        n8.ppxfxbqfkf lqeggnwhkgVar = new com.bumptech.glide.load.resource.bitmap.lqeggnwhkg(ppxfxbqfkfVar2.eablkybsjg(), com.bumptech.glide.zoijcleaow.ppxfxbqfkf(context).gxszxtbevo());
        n8.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = this.f121435zoijcleaow.iobyxmoadg(context, lqeggnwhkgVar, i13, i14);
        if (!lqeggnwhkgVar.equals(ppxfxbqfkfVarIobyxmoadg)) {
            lqeggnwhkgVar.zoijcleaow();
        }
        ppxfxbqfkfVar2.wflxmlrfwp(this.f121435zoijcleaow, (Bitmap) ppxfxbqfkfVarIobyxmoadg.get());
        return ppxfxbqfkfVar;
    }

    @Override // l8.eablkybsjg
    public void zoijcleaow(MessageDigest messageDigest) {
        this.f121435zoijcleaow.zoijcleaow(messageDigest);
    }
}
