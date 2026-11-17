package wd1;

import gg.draadjrbmk;
import gg.gtknphoqwx;
import java.time.format.DateTimeFormatter;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import xd1.NotRatedOrderDto;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f119416iobyxmoadg = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: wd1.eablkybsjg
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return lqeggnwhkg.lqeggnwhkg();
        }
    });

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gtknphoqwx f119417zoijcleaow = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: wd1.gxszxtbevo
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return lqeggnwhkg.ppxfxbqfkf();
        }
    });

    private final DateTimeFormatter eablkybsjg() {
        return (DateTimeFormatter) this.f119416iobyxmoadg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter lqeggnwhkg() {
        return DateTimeFormatter.ofPattern("dd.MM.yyyy");
    }

    private final tc1.ppxfxbqfkf nufgyqmvbu(NotRatedOrderDto notRatedOrderDto) {
        t11.iobyxmoadg iobyxmoadgVar = t11.iobyxmoadg.f109303iobyxmoadg;
        String sum = notRatedOrderDto.getSum();
        List listMhtqkkgtqm = kcexrzcfyt.mhtqkkgtqm(iobyxmoadgVar.lqeggnwhkg(Double.valueOf(sum != null ? Double.parseDouble(sum) : 0.0d)), new char[]{','}, false, 0, 6, null);
        String str = wkgbmnqykc().format(eablkybsjg().parse(notRatedOrderDto.getDate()));
        String id2 = notRatedOrderDto.getId();
        String str2 = id2 == null ? "" : id2;
        zdlpuopuiu.lqeggnwhkg(str);
        DeliveryCode deliveryCodeIobyxmoadg = DeliveryCode.INSTANCE.iobyxmoadg(notRatedOrderDto.getType());
        String address = notRatedOrderDto.getAddress();
        return new tc1.ppxfxbqfkf(str2, str, deliveryCodeIobyxmoadg, address == null ? "" : address, (String) listMhtqkkgtqm.get(0), (String) listMhtqkkgtqm.get(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter ppxfxbqfkf() {
        return DateTimeFormatter.ofPattern("dd MMMM yyyy");
    }

    private final DateTimeFormatter wkgbmnqykc() {
        return (DateTimeFormatter) this.f119417zoijcleaow.getValue();
    }

    public final tc1.ppxfxbqfkf gxszxtbevo(NotRatedOrderDto notRatedOrderDto) {
        if (notRatedOrderDto != null) {
            return nufgyqmvbu(notRatedOrderDto);
        }
        return null;
    }
}
