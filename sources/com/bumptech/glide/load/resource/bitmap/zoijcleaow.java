package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow implements l8.btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final o8.wkgbmnqykc f21141iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l8.btonecajqb f21142zoijcleaow;

    public zoijcleaow(o8.wkgbmnqykc wkgbmnqykcVar, l8.btonecajqb btonecajqbVar) {
        this.f21141iobyxmoadg = wkgbmnqykcVar;
        this.f21142zoijcleaow = btonecajqbVar;
    }

    @Override // l8.wkgbmnqykc
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(n8.ppxfxbqfkf ppxfxbqfkfVar, File file, l8.lqeggnwhkg lqeggnwhkgVar) {
        return this.f21142zoijcleaow.iobyxmoadg(new lqeggnwhkg(((BitmapDrawable) ppxfxbqfkfVar.get()).getBitmap(), this.f21141iobyxmoadg), file, lqeggnwhkgVar);
    }

    @Override // l8.btonecajqb
    public l8.ppxfxbqfkf zoijcleaow(l8.lqeggnwhkg lqeggnwhkgVar) {
        return this.f21142zoijcleaow.zoijcleaow(lqeggnwhkgVar);
    }
}
