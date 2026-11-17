package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class cqumvgiudr implements n8.ppxfxbqfkf, n8.zoijcleaow {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final n8.ppxfxbqfkf f21057yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Resources f21058zdlpuopuiu;

    private cqumvgiudr(Resources resources, n8.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f21058zdlpuopuiu = (Resources) g9.gtknphoqwx.eablkybsjg(resources);
        this.f21057yggfygwlhe = (n8.ppxfxbqfkf) g9.gtknphoqwx.eablkybsjg(ppxfxbqfkfVar);
    }

    public static n8.ppxfxbqfkf eablkybsjg(Resources resources, n8.ppxfxbqfkf ppxfxbqfkfVar) {
        if (ppxfxbqfkfVar == null) {
            return null;
        }
        return new cqumvgiudr(resources, ppxfxbqfkfVar);
    }

    @Override // n8.ppxfxbqfkf
    public int getSize() {
        return this.f21057yggfygwlhe.getSize();
    }

    @Override // n8.zoijcleaow
    public void iobyxmoadg() {
        n8.ppxfxbqfkf ppxfxbqfkfVar = this.f21057yggfygwlhe;
        if (ppxfxbqfkfVar instanceof n8.zoijcleaow) {
            ((n8.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg();
        }
    }

    @Override // n8.ppxfxbqfkf
    public Class ppxfxbqfkf() {
        return BitmapDrawable.class;
    }

    @Override // n8.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f21058zdlpuopuiu, (Bitmap) this.f21057yggfygwlhe.get());
    }

    @Override // n8.ppxfxbqfkf
    public void zoijcleaow() {
        this.f21057yggfygwlhe.zoijcleaow();
    }
}
