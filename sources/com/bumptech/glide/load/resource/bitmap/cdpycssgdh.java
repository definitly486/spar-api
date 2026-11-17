package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class cdpycssgdh implements l8.dxjokdxxww {

    private static final class iobyxmoadg implements n8.ppxfxbqfkf {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Bitmap f21056zdlpuopuiu;

        iobyxmoadg(Bitmap bitmap) {
            this.f21056zdlpuopuiu = bitmap;
        }

        @Override // n8.ppxfxbqfkf
        public int getSize() {
            return g9.draadjrbmk.nufgyqmvbu(this.f21056zdlpuopuiu);
        }

        @Override // n8.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f21056zdlpuopuiu;
        }

        @Override // n8.ppxfxbqfkf
        public Class ppxfxbqfkf() {
            return Bitmap.class;
        }

        @Override // n8.ppxfxbqfkf
        public void zoijcleaow() {
        }
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public n8.ppxfxbqfkf zoijcleaow(Bitmap bitmap, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return new iobyxmoadg(bitmap);
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(Bitmap bitmap, l8.lqeggnwhkg lqeggnwhkgVar) {
        return true;
    }
}
