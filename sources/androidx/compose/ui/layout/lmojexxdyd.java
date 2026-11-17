package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
final class lmojexxdyd implements iozdgvuglv {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yggfygwlhe f6525ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yggfygwlhe f6526wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f6527zoijcleaow;

    public lmojexxdyd(String str) {
        this.f6527zoijcleaow = str;
        this.f6525ppxfxbqfkf = iwizpuwonk.iobyxmoadg(str);
        this.f6526wkgbmnqykc = iwizpuwonk.iobyxmoadg(str + " maximum");
    }

    @Override // androidx.compose.ui.layout.iozdgvuglv
    public yggfygwlhe iobyxmoadg() {
        return this.f6525ppxfxbqfkf;
    }

    public String toString() {
        return this.f6527zoijcleaow;
    }

    @Override // androidx.compose.ui.layout.iozdgvuglv
    public yggfygwlhe zoijcleaow() {
        return this.f6526wkgbmnqykc;
    }
}
