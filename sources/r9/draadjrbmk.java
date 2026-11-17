package r9;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk implements s9.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fg.iobyxmoadg f82188iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final fg.iobyxmoadg f82189zoijcleaow;

    public draadjrbmk(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        this.f82188iobyxmoadg = iobyxmoadgVar;
        this.f82189zoijcleaow = iobyxmoadgVar2;
    }

    public static draadjrbmk iobyxmoadg(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        return new draadjrbmk(iobyxmoadgVar, iobyxmoadgVar2);
    }

    public static gtknphoqwx ppxfxbqfkf(Context context, Object obj) {
        return new gtknphoqwx(context, (dxjokdxxww) obj);
    }

    @Override // fg.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public gtknphoqwx get() {
        return ppxfxbqfkf((Context) this.f82188iobyxmoadg.get(), this.f82189zoijcleaow.get());
    }
}
