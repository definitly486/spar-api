package wd1;

import gg.wwaezpbzkn;
import gk.cdpycssgdh;
import gk.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final gk.zoijcleaow f119418yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final dxjokdxxww f119419zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f119420iobyxmoadg;

        static {
            int[] iArr = new int[zz0.iobyxmoadg.values().length];
            try {
                iArr[zz0.iobyxmoadg.PURCHASE_RATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zz0.iobyxmoadg.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f119420iobyxmoadg = iArr;
        }
    }

    public wkgbmnqykc(dxjokdxxww dtoToDomainMapper) {
        zdlpuopuiu.btonecajqb(dtoToDomainMapper, "dtoToDomainMapper");
        this.f119419zdlpuopuiu = dtoToDomainMapper;
        this.f119418yggfygwlhe = jyumaefscl.zoijcleaow(null, new draadjrbmk() { // from class: wd1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.eablkybsjg((gk.eablkybsjg) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(gk.eablkybsjg Json) {
        zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.eablkybsjg(true);
        Json.wkgbmnqykc(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final yd1.zoijcleaow gxszxtbevo(cdpycssgdh cdpycssgdhVar, zz0.iobyxmoadg iobyxmoadgVar) {
        gk.btonecajqb btonecajqbVar = (gk.btonecajqb) cdpycssgdhVar.get(iobyxmoadgVar.lqeggnwhkg());
        if (btonecajqbVar == null) {
            return null;
        }
        int i13 = iobyxmoadg.f119420iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        try {
            gk.zoijcleaow zoijcleaowVar = this.f119418yggfygwlhe;
            zoijcleaowVar.iobyxmoadg();
            return (yd1.zoijcleaow) zoijcleaowVar.wkgbmnqykc(ck.iobyxmoadg.yggfygwlhe(yd1.zoijcleaow.PurchaseRatingDto.INSTANCE.serializer()), btonecajqbVar);
        } catch (Throwable th2) {
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            return null;
        }
    }

    private final zz0.iobyxmoadg zoijcleaow(cdpycssgdh cdpycssgdhVar) {
        return zz0.iobyxmoadg.f131705yggfygwlhe.iobyxmoadg(kcexrzcfyt.hcddaimhww(String.valueOf(cdpycssgdhVar.get("type")), "\"", q11.dxjokdxxww.ppxfxbqfkf(), false, 4, null));
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public zz0.zoijcleaow invoke(cdpycssgdh jsonObject) {
        zdlpuopuiu.btonecajqb(jsonObject, "jsonObject");
        yd1.zoijcleaow zoijcleaowVarGxszxtbevo = gxszxtbevo(jsonObject, zoijcleaow(jsonObject));
        if (zoijcleaowVarGxszxtbevo != null) {
            return (zz0.zoijcleaow) this.f119419zdlpuopuiu.invoke(zoijcleaowVarGxszxtbevo);
        }
        return null;
    }
}
