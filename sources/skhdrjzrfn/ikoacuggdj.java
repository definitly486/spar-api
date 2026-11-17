package skhdrjzrfn;

/* JADX INFO: loaded from: classes.dex */
public abstract class ikoacuggdj {
    public static final v0.dxjokdxxww iobyxmoadg(j0.f fVar, int i13) {
        return zoijcleaow(fVar, i13) ? fVar.esjtqupxsv(i13) : fVar.ppxfxbqfkf(i13);
    }

    private static final boolean zoijcleaow(j0.f fVar, int i13) {
        if (fVar.draadjrbmk().btonecajqb().length() == 0) {
            return true;
        }
        int iVdvldrhtss = fVar.vdvldrhtss(i13);
        return (i13 == 0 || iVdvldrhtss != fVar.vdvldrhtss(i13 + (-1))) && (i13 == fVar.draadjrbmk().btonecajqb().length() || iVdvldrhtss != fVar.vdvldrhtss(i13 + 1));
    }
}
