package cy;

import gg.wwaezpbzkn;
import gk.jyumaefscl;
import hy.OrderTotalInfoItemEntity;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes4.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gk.zoijcleaow f26112iobyxmoadg = jyumaefscl.zoijcleaow(null, new tg.draadjrbmk() { // from class: cy.btonecajqb
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return gtknphoqwx.zoijcleaow((gk.eablkybsjg) obj);
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zoijcleaow(gk.eablkybsjg Json) {
        zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.ppxfxbqfkf(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final String ppxfxbqfkf(List someObjects) {
        zdlpuopuiu.btonecajqb(someObjects, "someObjects");
        try {
            return this.f26112iobyxmoadg.zoijcleaow(ck.iobyxmoadg.nufgyqmvbu(OrderTotalInfoItemEntity.INSTANCE.serializer()), someObjects);
        } catch (Exception e13) {
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(e13, new CrashlyticsKey[0]);
            return "";
        }
    }

    public final List wkgbmnqykc(String str) {
        List list;
        if (str == null || str.length() == 0) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        try {
            list = (List) this.f26112iobyxmoadg.ppxfxbqfkf(ck.iobyxmoadg.nufgyqmvbu(OrderTotalInfoItemEntity.INSTANCE.serializer()), str);
        } catch (Throwable th2) {
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            list = null;
        }
        return list == null ? hg.jyumaefscl.wflxmlrfwp() : list;
    }
}
