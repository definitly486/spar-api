package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public class vdvldrhtss implements l8.gtknphoqwx {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f21125ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l8.gtknphoqwx f21126zoijcleaow;

    public vdvldrhtss(l8.gtknphoqwx gtknphoqwxVar, boolean z13) {
        this.f21126zoijcleaow = gtknphoqwxVar;
        this.f21125ppxfxbqfkf = z13;
    }

    private n8.ppxfxbqfkf wkgbmnqykc(Context context, n8.ppxfxbqfkf ppxfxbqfkfVar) {
        return cqumvgiudr.eablkybsjg(context.getResources(), ppxfxbqfkfVar);
    }

    @Override // l8.eablkybsjg
    public boolean equals(Object obj) {
        if (obj instanceof vdvldrhtss) {
            return this.f21126zoijcleaow.equals(((vdvldrhtss) obj).f21126zoijcleaow);
        }
        return false;
    }

    @Override // l8.eablkybsjg
    public int hashCode() {
        return this.f21126zoijcleaow.hashCode();
    }

    @Override // l8.gtknphoqwx
    public n8.ppxfxbqfkf iobyxmoadg(Context context, n8.ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14) {
        o8.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = com.bumptech.glide.zoijcleaow.ppxfxbqfkf(context).gxszxtbevo();
        Drawable drawable = (Drawable) ppxfxbqfkfVar.get();
        n8.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = rgvfuqvkyq.iobyxmoadg(wkgbmnqykcVarGxszxtbevo, drawable, i13, i14);
        if (ppxfxbqfkfVarIobyxmoadg != null) {
            n8.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg2 = this.f21126zoijcleaow.iobyxmoadg(context, ppxfxbqfkfVarIobyxmoadg, i13, i14);
            if (!ppxfxbqfkfVarIobyxmoadg2.equals(ppxfxbqfkfVarIobyxmoadg)) {
                return wkgbmnqykc(context, ppxfxbqfkfVarIobyxmoadg2);
            }
            ppxfxbqfkfVarIobyxmoadg2.zoijcleaow();
            return ppxfxbqfkfVar;
        }
        if (!this.f21125ppxfxbqfkf) {
            return ppxfxbqfkfVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    public l8.gtknphoqwx ppxfxbqfkf() {
        return this;
    }

    @Override // l8.eablkybsjg
    public void zoijcleaow(MessageDigest messageDigest) {
        this.f21126zoijcleaow.zoijcleaow(messageDigest);
    }
}
