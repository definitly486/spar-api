package g0;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.iobyxmoadg f35603iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f35604ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.iobyxmoadg f35605zoijcleaow;

    public btonecajqb(tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, boolean z13) {
        this.f35603iobyxmoadg = iobyxmoadgVar;
        this.f35605zoijcleaow = iobyxmoadgVar2;
        this.f35604ppxfxbqfkf = z13;
    }

    public final tg.iobyxmoadg iobyxmoadg() {
        return this.f35605zoijcleaow;
    }

    public final tg.iobyxmoadg ppxfxbqfkf() {
        return this.f35603iobyxmoadg;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f35603iobyxmoadg.invoke()).floatValue() + ", maxValue=" + ((Number) this.f35605zoijcleaow.invoke()).floatValue() + ", reverseScrolling=" + this.f35604ppxfxbqfkf + ')';
    }

    public final boolean zoijcleaow() {
        return this.f35604ppxfxbqfkf;
    }
}
