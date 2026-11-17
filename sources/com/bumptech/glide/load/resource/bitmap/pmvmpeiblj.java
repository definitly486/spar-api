package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public class pmvmpeiblj implements l8.dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final v8.wflxmlrfwp f21119iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final o8.wkgbmnqykc f21120zoijcleaow;

    public pmvmpeiblj(v8.wflxmlrfwp wflxmlrfwpVar, o8.wkgbmnqykc wkgbmnqykcVar) {
        this.f21119iobyxmoadg = wflxmlrfwpVar;
        this.f21120zoijcleaow = wkgbmnqykcVar;
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public n8.ppxfxbqfkf zoijcleaow(Uri uri, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        n8.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = this.f21119iobyxmoadg.zoijcleaow(uri, i13, i14, lqeggnwhkgVar);
        if (ppxfxbqfkfVarZoijcleaow == null) {
            return null;
        }
        return rgvfuqvkyq.iobyxmoadg(this.f21120zoijcleaow, (Drawable) ppxfxbqfkfVarZoijcleaow.get(), i13, i14);
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(Uri uri, l8.lqeggnwhkg lqeggnwhkgVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
