package rg0;

import gg.wwaezpbzkn;
import gk.cdpycssgdh;
import gk.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg implements draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final gk.zoijcleaow f82599yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final btonecajqb f82600zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f82601iobyxmoadg;

        static {
            int[] iArr = new int[j10.iobyxmoadg.values().length];
            try {
                iArr[j10.iobyxmoadg.PURCHASE_RATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j10.iobyxmoadg.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f82601iobyxmoadg = iArr;
        }
    }

    public eablkybsjg(btonecajqb dtoToDomainMapper) {
        zdlpuopuiu.btonecajqb(dtoToDomainMapper, "dtoToDomainMapper");
        this.f82600zdlpuopuiu = dtoToDomainMapper;
        this.f82599yggfygwlhe = jyumaefscl.zoijcleaow(null, new draadjrbmk() { // from class: rg0.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.eablkybsjg((gk.eablkybsjg) obj);
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

    private final tg0.zoijcleaow gxszxtbevo(cdpycssgdh cdpycssgdhVar, j10.iobyxmoadg iobyxmoadgVar) {
        gk.btonecajqb btonecajqbVar = (gk.btonecajqb) cdpycssgdhVar.get(iobyxmoadgVar.lqeggnwhkg());
        if (btonecajqbVar == null) {
            return null;
        }
        int i13 = iobyxmoadg.f82601iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        try {
            gk.zoijcleaow zoijcleaowVar = this.f82599yggfygwlhe;
            zoijcleaowVar.iobyxmoadg();
            return (tg0.zoijcleaow) zoijcleaowVar.wkgbmnqykc(ck.iobyxmoadg.yggfygwlhe(tg0.zoijcleaow.PurchaseRatingDto.INSTANCE.serializer()), btonecajqbVar);
        } catch (Throwable th2) {
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            return null;
        }
    }

    private final j10.iobyxmoadg zoijcleaow(cdpycssgdh cdpycssgdhVar) {
        return j10.iobyxmoadg.f50514yggfygwlhe.iobyxmoadg(kcexrzcfyt.hcddaimhww(String.valueOf(cdpycssgdhVar.get("type")), "\"", k30.draadjrbmk.ppxfxbqfkf(), false, 4, null));
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public j10.zoijcleaow invoke(cdpycssgdh jsonObject) {
        zdlpuopuiu.btonecajqb(jsonObject, "jsonObject");
        tg0.zoijcleaow zoijcleaowVarGxszxtbevo = gxszxtbevo(jsonObject, zoijcleaow(jsonObject));
        if (zoijcleaowVarGxszxtbevo != null) {
            return (j10.zoijcleaow) this.f82600zdlpuopuiu.invoke(zoijcleaowVarGxszxtbevo);
        }
        return null;
    }
}
