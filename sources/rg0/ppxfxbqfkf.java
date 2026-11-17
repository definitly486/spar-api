package rg0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import sg0.BrandDto;
import sg0.BrandsDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {
    public static final xg0.wkgbmnqykc iobyxmoadg(BrandDto brandDto) {
        zdlpuopuiu.btonecajqb(brandDto, "<this>");
        return new xg0.wkgbmnqykc(brandDto.getCode(), brandDto.getName(), brandDto.getPic());
    }

    public static final xg0.eablkybsjg zoijcleaow(BrandsDto brandsDto) {
        zdlpuopuiu.btonecajqb(brandsDto, "<this>");
        List items = brandsDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((BrandDto) it.next()));
        }
        return new xg0.eablkybsjg(arrayList);
    }
}
