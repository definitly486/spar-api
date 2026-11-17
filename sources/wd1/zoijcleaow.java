package wd1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import xd1.BrandDto;
import xd1.BrandsDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final ce1.iobyxmoadg iobyxmoadg(BrandDto brandDto) {
        zdlpuopuiu.btonecajqb(brandDto, "<this>");
        return new ce1.iobyxmoadg(brandDto.getCode(), brandDto.getName(), brandDto.getPic());
    }

    public static final ce1.zoijcleaow zoijcleaow(BrandsDto brandsDto) {
        zdlpuopuiu.btonecajqb(brandsDto, "<this>");
        List items = brandsDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((BrandDto) it.next()));
        }
        return new ce1.zoijcleaow(arrayList);
    }
}
