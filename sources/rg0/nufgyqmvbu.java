package rg0;

import gg.draadjrbmk;
import java.time.format.DateTimeFormatter;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.core.models.delivery.DeliveryCode;
import sg0.NotRatedOrderDto;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gg.gtknphoqwx f82603iobyxmoadg = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: rg0.gxszxtbevo
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return nufgyqmvbu.lqeggnwhkg();
        }
    });

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gg.gtknphoqwx f82604zoijcleaow = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: rg0.lqeggnwhkg
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return nufgyqmvbu.ppxfxbqfkf();
        }
    });

    private final DateTimeFormatter eablkybsjg() {
        return (DateTimeFormatter) this.f82603iobyxmoadg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter lqeggnwhkg() {
        return DateTimeFormatter.ofPattern("dd.MM.yyyy");
    }

    private final pf0.eablkybsjg nufgyqmvbu(NotRatedOrderDto notRatedOrderDto) {
        n30.iobyxmoadg iobyxmoadgVar = n30.iobyxmoadg.f68492iobyxmoadg;
        String sum = notRatedOrderDto.getSum();
        List listMhtqkkgtqm = kcexrzcfyt.mhtqkkgtqm(iobyxmoadgVar.lqeggnwhkg(Double.valueOf(sum != null ? Double.parseDouble(sum) : 0.0d)), new char[]{','}, false, 0, 6, null);
        String str = wkgbmnqykc().format(eablkybsjg().parse(notRatedOrderDto.getDate()));
        String id2 = notRatedOrderDto.getId();
        String str2 = id2 == null ? "" : id2;
        zdlpuopuiu.lqeggnwhkg(str);
        DeliveryCode deliveryCodeIobyxmoadg = DeliveryCode.INSTANCE.iobyxmoadg(notRatedOrderDto.getType());
        String address = notRatedOrderDto.getAddress();
        return new pf0.eablkybsjg(str2, str, deliveryCodeIobyxmoadg, address == null ? "" : address, (String) listMhtqkkgtqm.get(0), (String) listMhtqkkgtqm.get(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter ppxfxbqfkf() {
        return DateTimeFormatter.ofPattern("dd MMMM yyyy");
    }

    private final DateTimeFormatter wkgbmnqykc() {
        return (DateTimeFormatter) this.f82604zoijcleaow.getValue();
    }

    public final pf0.eablkybsjg gxszxtbevo(NotRatedOrderDto notRatedOrderDto) {
        if (notRatedOrderDto != null) {
            return nufgyqmvbu(notRatedOrderDto);
        }
        return null;
    }
}
