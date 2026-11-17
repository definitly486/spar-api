package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class zynmafqrjb implements l8.dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ojitshcjhn f21143iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final o8.zoijcleaow f21144zoijcleaow;

    static class iobyxmoadg implements ojitshcjhn.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lereixgezr f21145iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final g9.wkgbmnqykc f21146zoijcleaow;

        iobyxmoadg(lereixgezr lereixgezrVar, g9.wkgbmnqykc wkgbmnqykcVar) {
            this.f21145iobyxmoadg = lereixgezrVar;
            this.f21146zoijcleaow = wkgbmnqykcVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ojitshcjhn.zoijcleaow
        public void iobyxmoadg() {
            this.f21145iobyxmoadg.wkgbmnqykc();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ojitshcjhn.zoijcleaow
        public void zoijcleaow(o8.wkgbmnqykc wkgbmnqykcVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionIobyxmoadg = this.f21146zoijcleaow.iobyxmoadg();
            if (iOExceptionIobyxmoadg != null) {
                if (bitmap == null) {
                    throw iOExceptionIobyxmoadg;
                }
                wkgbmnqykcVar.ppxfxbqfkf(bitmap);
                throw iOExceptionIobyxmoadg;
            }
        }
    }

    public zynmafqrjb(ojitshcjhn ojitshcjhnVar, o8.zoijcleaow zoijcleaowVar) {
        this.f21143iobyxmoadg = ojitshcjhnVar;
        this.f21144zoijcleaow = zoijcleaowVar;
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public n8.ppxfxbqfkf zoijcleaow(InputStream inputStream, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        boolean z13;
        lereixgezr lereixgezrVar;
        if (inputStream instanceof lereixgezr) {
            lereixgezrVar = (lereixgezr) inputStream;
            z13 = false;
        } else {
            z13 = true;
            lereixgezrVar = new lereixgezr(inputStream, this.f21144zoijcleaow);
        }
        g9.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = g9.wkgbmnqykc.wkgbmnqykc(lereixgezrVar);
        try {
            return this.f21143iobyxmoadg.gxszxtbevo(new g9.dxjokdxxww(wkgbmnqykcVarWkgbmnqykc), i13, i14, lqeggnwhkgVar, new iobyxmoadg(lereixgezrVar, wkgbmnqykcVarWkgbmnqykc));
        } finally {
            wkgbmnqykcVarWkgbmnqykc.release();
            if (z13) {
                lereixgezrVar.release();
            }
        }
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(InputStream inputStream, l8.lqeggnwhkg lqeggnwhkgVar) {
        return this.f21143iobyxmoadg.rgvfuqvkyq(inputStream);
    }
}
