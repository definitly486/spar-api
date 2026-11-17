package x90;

import c52.dxjokdxxww;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import o90.zoijcleaow;
import ru.myspar.specialbanner.impl.presentation.xrmfcynszj;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final xrmfcynszj f121822iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ob0.iobyxmoadg f121823zoijcleaow;

    public iobyxmoadg(xrmfcynszj specialBannerUiMapper, ob0.iobyxmoadg colorsUiModelMapper) {
        zdlpuopuiu.btonecajqb(specialBannerUiMapper, "specialBannerUiMapper");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        this.f121822iobyxmoadg = specialBannerUiMapper;
        this.f121823zoijcleaow = colorsUiModelMapper;
    }

    public final zoijcleaow iobyxmoadg(u90.iobyxmoadg model) {
        zdlpuopuiu.btonecajqb(model, "model");
        String strWkgbmnqykc = model.wkgbmnqykc();
        List listPpxfxbqfkf = model.ppxfxbqfkf();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
        Iterator it = listPpxfxbqfkf.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f121822iobyxmoadg.eablkybsjg((dxjokdxxww.iobyxmoadg) it.next()));
        }
        return new zoijcleaow(strWkgbmnqykc, arrayList, this.f121822iobyxmoadg.ppxfxbqfkf(100, model.zoijcleaow(), null, this.f121823zoijcleaow.iobyxmoadg(model.iobyxmoadg().getColorModel())), model.iobyxmoadg());
    }
}
