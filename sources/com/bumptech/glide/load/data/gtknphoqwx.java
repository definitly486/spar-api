package com.bumptech.glide.load.data;

import com.bumptech.glide.load.resource.bitmap.lereixgezr;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class gtknphoqwx implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lereixgezr f20784iobyxmoadg;

    public static final class iobyxmoadg implements eablkybsjg.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final o8.zoijcleaow f20785iobyxmoadg;

        public iobyxmoadg(o8.zoijcleaow zoijcleaowVar) {
            this.f20785iobyxmoadg = zoijcleaowVar;
        }

        @Override // com.bumptech.glide.load.data.eablkybsjg.iobyxmoadg
        public Class iobyxmoadg() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.eablkybsjg.iobyxmoadg
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public eablkybsjg zoijcleaow(InputStream inputStream) {
            return new gtknphoqwx(inputStream, this.f20785iobyxmoadg);
        }
    }

    public gtknphoqwx(InputStream inputStream, o8.zoijcleaow zoijcleaowVar) {
        lereixgezr lereixgezrVar = new lereixgezr(inputStream, zoijcleaowVar);
        this.f20784iobyxmoadg = lereixgezrVar;
        lereixgezrVar.mark(5242880);
    }

    public void ppxfxbqfkf() {
        this.f20784iobyxmoadg.wkgbmnqykc();
    }

    @Override // com.bumptech.glide.load.data.eablkybsjg
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public InputStream iobyxmoadg() {
        this.f20784iobyxmoadg.reset();
        return this.f20784iobyxmoadg;
    }

    @Override // com.bumptech.glide.load.data.eablkybsjg
    public void zoijcleaow() {
        this.f20784iobyxmoadg.release();
    }
}
