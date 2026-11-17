package oy;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import wz.PushDto;
import wz.PushesDto;

/* JADX INFO: loaded from: classes4.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dt.zoijcleaow f75079iobyxmoadg;

    public btonecajqb(dt.zoijcleaow dateUtils) {
        zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        this.f75079iobyxmoadg = dateUtils;
    }

    private final l10.zoijcleaow ppxfxbqfkf(PushesDto pushesDto) {
        List items = pushesDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((PushDto) it.next()));
        }
        return new l10.zoijcleaow(arrayList);
    }

    private final l10.iobyxmoadg zoijcleaow(PushDto pushDto) {
        return new l10.iobyxmoadg(pushDto.getId(), pushDto.getTitle(), pushDto.getDescription(), pushDto.getAction(), pushDto.getReference(), this.f75079iobyxmoadg.gxszxtbevo(pushDto.getDateFrom()));
    }

    public final List iobyxmoadg(PushesDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return ppxfxbqfkf(dto).iobyxmoadg();
    }
}
