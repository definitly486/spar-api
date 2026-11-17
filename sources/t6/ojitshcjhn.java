package t6;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class ojitshcjhn implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fg.iobyxmoadg f109857iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final fg.iobyxmoadg f109858zoijcleaow;

    public ojitshcjhn(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        this.f109857iobyxmoadg = iobyxmoadgVar;
        this.f109858zoijcleaow = iobyxmoadgVar2;
    }

    public static ojitshcjhn iobyxmoadg(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        return new ojitshcjhn(iobyxmoadgVar, iobyxmoadgVar2);
    }

    public static jhduphickx ppxfxbqfkf(Context context, mbcevpiqjq mbcevpiqjqVar) {
        return (jhduphickx) ag.dxjokdxxww.ppxfxbqfkf(r0.iobyxmoadg(context, mbcevpiqjqVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // fg.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public jhduphickx get() {
        return ppxfxbqfkf((Context) this.f109857iobyxmoadg.get(), (mbcevpiqjq) this.f109858zoijcleaow.get());
    }
}
