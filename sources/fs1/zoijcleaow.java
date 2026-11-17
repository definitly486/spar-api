package fs1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f34970iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f34971ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f34972zoijcleaow;

    public zoijcleaow(String title, String desc, iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(desc, "desc");
        this.f34970iobyxmoadg = title;
        this.f34972zoijcleaow = desc;
        this.f34971ppxfxbqfkf = iobyxmoadgVar;
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f34971ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f34970iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f34972zoijcleaow;
    }

    public /* synthetic */ zoijcleaow(String str, String str2, iobyxmoadg iobyxmoadgVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : iobyxmoadgVar);
    }
}
