package jh;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bfopjjpdmp {
    public /* synthetic */ bfopjjpdmp(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public abstract boolean iobyxmoadg(ii.gxszxtbevo gxszxtbevoVar);

    public final bfopjjpdmp zoijcleaow(tg.draadjrbmk transform) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transform, "transform");
        if (this instanceof pmvmpeiblj) {
            pmvmpeiblj pmvmpeibljVar = (pmvmpeiblj) this;
            return new pmvmpeiblj(pmvmpeibljVar.ppxfxbqfkf(), (dj.btonecajqb) transform.invoke(pmvmpeibljVar.wkgbmnqykc()));
        }
        if (!(this instanceof wwaezpbzkn)) {
            throw new NoWhenBranchMatchedException();
        }
        List<gg.vdvldrhtss> listPpxfxbqfkf = ((wwaezpbzkn) this).ppxfxbqfkf();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
        for (gg.vdvldrhtss vdvldrhtssVar : listPpxfxbqfkf) {
            arrayList.add(gg.cqumvgiudr.iobyxmoadg((ii.gxszxtbevo) vdvldrhtssVar.iobyxmoadg(), transform.invoke((dj.btonecajqb) vdvldrhtssVar.wkgbmnqykc())));
        }
        return new wwaezpbzkn(arrayList);
    }

    private bfopjjpdmp() {
    }
}
