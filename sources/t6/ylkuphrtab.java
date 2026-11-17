package t6;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ylkuphrtab implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fg.iobyxmoadg f109911iobyxmoadg;

    public ylkuphrtab(fg.iobyxmoadg iobyxmoadgVar) {
        this.f109911iobyxmoadg = iobyxmoadgVar;
    }

    public static ylkuphrtab iobyxmoadg(fg.iobyxmoadg iobyxmoadgVar) {
        return new ylkuphrtab(iobyxmoadgVar);
    }

    public static jztzpxfvev ppxfxbqfkf(Map map) {
        return (jztzpxfvev) ag.dxjokdxxww.ppxfxbqfkf(auzgnhcxok.iobyxmoadg(map), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // fg.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public jztzpxfvev get() {
        return ppxfxbqfkf((Map) this.f109911iobyxmoadg.get());
    }
}
