package sk1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.qr.domain.model.QrModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lqeggnwhkg {
    public static final List iobyxmoadg(QrsResponse qrsResponse) {
        zdlpuopuiu.btonecajqb(qrsResponse, "<this>");
        List<QrItemDto> qrs = qrsResponse.getQrs();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(qrs, 10));
        for (QrItemDto qrItemDto : qrs) {
            arrayList.add((qrItemDto.getLifeTime() == null || qrItemDto.getId() == null) ? new QrModel.Static(qrItemDto.getCode()) : new QrModel.Dynamic(qrItemDto.getId(), qrItemDto.getCode(), qrItemDto.getLifeTime().intValue()));
        }
        return arrayList;
    }
}
