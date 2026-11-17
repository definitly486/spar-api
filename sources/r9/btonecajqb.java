package r9;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class btonecajqb implements s9.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fg.iobyxmoadg f82185iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final fg.iobyxmoadg f82186ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final fg.iobyxmoadg f82187zoijcleaow;

    public btonecajqb(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3) {
        this.f82185iobyxmoadg = iobyxmoadgVar;
        this.f82187zoijcleaow = iobyxmoadgVar2;
        this.f82186ppxfxbqfkf = iobyxmoadgVar3;
    }

    public static btonecajqb iobyxmoadg(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3) {
        return new btonecajqb(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3);
    }

    public static dxjokdxxww ppxfxbqfkf(Context context, aa.iobyxmoadg iobyxmoadgVar, aa.iobyxmoadg iobyxmoadgVar2) {
        return new dxjokdxxww(context, iobyxmoadgVar, iobyxmoadgVar2);
    }

    @Override // fg.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww get() {
        return ppxfxbqfkf((Context) this.f82185iobyxmoadg.get(), (aa.iobyxmoadg) this.f82187zoijcleaow.get(), (aa.iobyxmoadg) this.f82186ppxfxbqfkf.get());
    }
}
