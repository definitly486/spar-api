package b81;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.specialbanner.impl.presentation.jztzpxfvev;
import s71.zoijcleaow;
import vq1.dxjokdxxww;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jztzpxfvev f15527iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n91.iobyxmoadg f15528zoijcleaow;

    public iobyxmoadg(jztzpxfvev specialBannerUiMapper, n91.iobyxmoadg colorsUiModelMapper) {
        zdlpuopuiu.btonecajqb(specialBannerUiMapper, "specialBannerUiMapper");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        this.f15527iobyxmoadg = specialBannerUiMapper;
        this.f15528zoijcleaow = colorsUiModelMapper;
    }

    public final zoijcleaow iobyxmoadg(y71.iobyxmoadg model) {
        zdlpuopuiu.btonecajqb(model, "model");
        String strWkgbmnqykc = model.wkgbmnqykc();
        List listPpxfxbqfkf = model.ppxfxbqfkf();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
        Iterator it = listPpxfxbqfkf.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f15527iobyxmoadg.eablkybsjg((dxjokdxxww.iobyxmoadg) it.next()));
        }
        return new zoijcleaow(strWkgbmnqykc, arrayList, this.f15527iobyxmoadg.ppxfxbqfkf(100, model.zoijcleaow(), null, this.f15528zoijcleaow.iobyxmoadg(model.iobyxmoadg().getColorModel())), model.iobyxmoadg());
    }
}
