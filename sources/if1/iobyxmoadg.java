package if1;

import hg.jyumaefscl;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf1.ppxfxbqfkf;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.push.NotificationModel;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final DateTimeFormatter f42485zdlpuopuiu = DateTimeFormatter.ofPattern("dd MMMM HH:mm");

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final DateTimeFormatter f42484yggfygwlhe = DateTimeFormatter.ofPattern("dd MMMM");

    private final ppxfxbqfkf zoijcleaow(NotificationModel notificationModel, boolean z13) {
        return new ppxfxbqfkf(notificationModel.getId(), notificationModel.getTitle(), notificationModel.getBody(), notificationModel.getAction(), notificationModel.getReference(), (z13 ? notificationModel.getDateFrom().format(this.f42485zdlpuopuiu) : notificationModel.getDateFrom().format(this.f42484yggfygwlhe)).toString(), notificationModel.getIsPromoCopyAction());
    }

    @Override // tg.rgvfuqvkyq
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public List invoke(List models, b01.iobyxmoadg type) {
        zdlpuopuiu.btonecajqb(models, "models");
        zdlpuopuiu.btonecajqb(type, "type");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(models, 10));
        Iterator it = models.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((NotificationModel) it.next(), type == b01.iobyxmoadg.ORDERS));
        }
        return arrayList;
    }
}
