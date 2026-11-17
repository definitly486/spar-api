package i7;

/* JADX INFO: loaded from: classes2.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final x6.btonecajqb f42074eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f42075iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f42076ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f42077wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f42078zoijcleaow;

    public rgvfuqvkyq(boolean z13, boolean z14, boolean z15, int i13, x6.btonecajqb btonecajqbVar) {
        this.f42075iobyxmoadg = z13;
        this.f42078zoijcleaow = z14;
        this.f42076ppxfxbqfkf = z15;
        this.f42077wkgbmnqykc = i13;
        this.f42074eablkybsjg = btonecajqbVar;
    }

    public final boolean eablkybsjg() {
        return this.f42076ppxfxbqfkf;
    }

    public final boolean iobyxmoadg() {
        return this.f42075iobyxmoadg;
    }

    public final int ppxfxbqfkf() {
        return this.f42077wkgbmnqykc;
    }

    public final boolean wkgbmnqykc() {
        return this.f42078zoijcleaow;
    }

    public final x6.btonecajqb zoijcleaow() {
        return this.f42074eablkybsjg;
    }

    public /* synthetic */ rgvfuqvkyq(boolean z13, boolean z14, boolean z15, int i13, x6.btonecajqb btonecajqbVar, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? true : z13, (i14 & 2) != 0 ? true : z14, (i14 & 4) == 0 ? z15 : true, (i14 & 8) != 0 ? 4 : i13, (i14 & 16) != 0 ? x6.btonecajqb.RESPECT_PERFORMANCE : btonecajqbVar);
    }
}
