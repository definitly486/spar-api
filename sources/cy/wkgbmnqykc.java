package cy;

import gg.wwaezpbzkn;
import gk.jyumaefscl;
import gy.CartInfoItemEntity;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gk.zoijcleaow f26116iobyxmoadg = jyumaefscl.zoijcleaow(null, new tg.draadjrbmk() { // from class: cy.ppxfxbqfkf
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return wkgbmnqykc.zoijcleaow((gk.eablkybsjg) obj);
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zoijcleaow(gk.eablkybsjg Json) {
        zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.ppxfxbqfkf(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final String ppxfxbqfkf(List someObjects) {
        String strZoijcleaow;
        zdlpuopuiu.btonecajqb(someObjects, "someObjects");
        try {
            strZoijcleaow = this.f26116iobyxmoadg.zoijcleaow(ck.iobyxmoadg.nufgyqmvbu(CartInfoItemEntity.INSTANCE.serializer()), someObjects);
        } catch (Throwable th2) {
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            strZoijcleaow = null;
        }
        return strZoijcleaow == null ? "" : strZoijcleaow;
    }

    public final List wkgbmnqykc(String str) {
        List list;
        if (str == null || str.length() == 0) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        try {
            list = (List) this.f26116iobyxmoadg.ppxfxbqfkf(ck.iobyxmoadg.nufgyqmvbu(CartInfoItemEntity.INSTANCE.serializer()), str);
        } catch (Throwable th2) {
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            list = null;
        }
        return list == null ? hg.jyumaefscl.wflxmlrfwp() : list;
    }
}
