package q7;

import com.airbnb.lottie.hcddaimhww;

/* JADX INFO: loaded from: classes2.dex */
public class btonecajqb implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f78029iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f78030ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f78031zoijcleaow;

    public enum iobyxmoadg {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static iobyxmoadg wkgbmnqykc(int i13) {
            if (i13 == 1) {
                return MERGE;
            }
            if (i13 == 2) {
                return ADD;
            }
            if (i13 == 3) {
                return SUBTRACT;
            }
            if (i13 != 4) {
                return i13 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public btonecajqb(String str, iobyxmoadg iobyxmoadgVar, boolean z13) {
        this.f78029iobyxmoadg = str;
        this.f78031zoijcleaow = iobyxmoadgVar;
        this.f78030ppxfxbqfkf = z13;
    }

    @Override // q7.ppxfxbqfkf
    public k7.ppxfxbqfkf iobyxmoadg(hcddaimhww hcddaimhwwVar, com.airbnb.lottie.btonecajqb btonecajqbVar, r7.zoijcleaow zoijcleaowVar) {
        if (hcddaimhwwVar.pmvmpeiblj()) {
            return new k7.draadjrbmk(this);
        }
        v7.wkgbmnqykc.ppxfxbqfkf("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String ppxfxbqfkf() {
        return this.f78029iobyxmoadg;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f78031zoijcleaow + '}';
    }

    public boolean wkgbmnqykc() {
        return this.f78030ppxfxbqfkf;
    }

    public iobyxmoadg zoijcleaow() {
        return this.f78031zoijcleaow;
    }
}
