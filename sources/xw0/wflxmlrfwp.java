package xw0;

import dx0.ReferenceEntity;
import gg.wwaezpbzkn;
import gk.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes5.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gk.zoijcleaow f123285iobyxmoadg = jyumaefscl.zoijcleaow(null, new tg.draadjrbmk() { // from class: xw0.draadjrbmk
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return wflxmlrfwp.zoijcleaow((gk.eablkybsjg) obj);
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
            return this.f123285iobyxmoadg.zoijcleaow(ck.iobyxmoadg.nufgyqmvbu(ReferenceEntity.INSTANCE.serializer()), someObjects);
        } catch (Exception e13) {
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(e13, new CrashlyticsKey[0]);
            return "";
        }
    }

    public final List wkgbmnqykc(String str) {
        List list;
        if (str == null || str.length() == 0) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        try {
            list = (List) this.f123285iobyxmoadg.ppxfxbqfkf(ck.iobyxmoadg.nufgyqmvbu(ReferenceEntity.INSTANCE.serializer()), str);
        } catch (Throwable th2) {
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            list = null;
        }
        return list == null ? hg.jyumaefscl.wflxmlrfwp() : list;
    }
}
