package jx0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import oy0.PushDto;
import oy0.PushesDto;
import ru.myspar.proloyalty.core.domain.models.push.NotificationModel;

/* JADX INFO: loaded from: classes5.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final xr0.zoijcleaow f52479iobyxmoadg;

    public btonecajqb(xr0.zoijcleaow dateUtils) {
        zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        this.f52479iobyxmoadg = dateUtils;
    }

    private final NotificationModel ppxfxbqfkf(PushDto pushDto) {
        return new NotificationModel(pushDto.getId(), pushDto.getTitle(), pushDto.getDescription(), pushDto.getAction(), pushDto.getReference(), this.f52479iobyxmoadg.gxszxtbevo(pushDto.getDateFrom()));
    }

    private final List zoijcleaow(PushesDto pushesDto) {
        List items = pushesDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkf((PushDto) it.next()));
        }
        return arrayList;
    }

    public final List iobyxmoadg(PushesDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return zoijcleaow(dto);
    }
}
