package y9;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class sopmlzcsov implements s9.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fg.iobyxmoadg f124150iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final fg.iobyxmoadg f124151ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final fg.iobyxmoadg f124152zoijcleaow;

    public sopmlzcsov(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3) {
        this.f124150iobyxmoadg = iobyxmoadgVar;
        this.f124152zoijcleaow = iobyxmoadgVar2;
        this.f124151ppxfxbqfkf = iobyxmoadgVar3;
    }

    public static sopmlzcsov iobyxmoadg(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2, fg.iobyxmoadg iobyxmoadgVar3) {
        return new sopmlzcsov(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3);
    }

    public static ulzqkzuiru ppxfxbqfkf(Context context, String str, int i13) {
        return new ulzqkzuiru(context, str, i13);
    }

    @Override // fg.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ulzqkzuiru get() {
        return ppxfxbqfkf((Context) this.f124150iobyxmoadg.get(), (String) this.f124152zoijcleaow.get(), ((Integer) this.f124151ppxfxbqfkf.get()).intValue());
    }
}
