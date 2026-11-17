package nf;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk implements jf.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f69876ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final zoijcleaow f69877wkgbmnqykc = zoijcleaow.MEDIUM;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f69878iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f69879zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public enum zoijcleaow {
        SMALL,
        MEDIUM,
        LARGE;


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f69880cqumvgiudr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public draadjrbmk(zoijcleaow size, String id2) {
        zdlpuopuiu.btonecajqb(size, "size");
        zdlpuopuiu.btonecajqb(id2, "id");
        this.f69878iobyxmoadg = size;
        this.f69879zoijcleaow = id2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f69878iobyxmoadg == draadjrbmkVar.f69878iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f69879zoijcleaow, draadjrbmkVar.f69879zoijcleaow);
    }

    public int hashCode() {
        return (this.f69878iobyxmoadg.hashCode() * 31) + this.f69879zoijcleaow.hashCode();
    }

    public String toString() {
        return "PaddingModule(size=" + this.f69878iobyxmoadg + ", id=" + this.f69879zoijcleaow + ")";
    }

    public /* synthetic */ draadjrbmk(zoijcleaow zoijcleaowVar, String str, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? zoijcleaow.MEDIUM : zoijcleaowVar, (i13 & 2) != 0 ? kf.ppxfxbqfkf.zoijcleaow() : str);
    }
}
