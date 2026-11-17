package fv0;

import gg.wwaezpbzkn;
import hv0.UnlockPromoCollectionProductRequest;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import kv0.ppxfxbqfkf;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import ru.myspar.proloyalty.components.promo_collection.api.models.PromoCollectionInfo;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import sj.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements dv0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gv0.iobyxmoadg f35179iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ppxfxbqfkf f35180zoijcleaow;

    /* JADX INFO: renamed from: fv0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0784iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f35182esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f35183iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f35184jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f35185yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f35186zdlpuopuiu;

        C0784iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f35183iwizpuwonk = obj;
            this.f35182esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, null, null, null, this);
        }
    }

    public iobyxmoadg(gv0.iobyxmoadg apiService, ppxfxbqfkf repository) {
        zdlpuopuiu.btonecajqb(apiService, "apiService");
        zdlpuopuiu.btonecajqb(repository, "repository");
        this.f35179iobyxmoadg = apiService;
        this.f35180zoijcleaow = repository;
    }

    @Override // dv0.iobyxmoadg
    public void eablkybsjg(String promoCollectionId, PromoCollectionInfo promoCollectionInfo, List items) {
        zdlpuopuiu.btonecajqb(promoCollectionId, "promoCollectionId");
        zdlpuopuiu.btonecajqb(items, "items");
        if (promoCollectionInfo != null) {
            this.f35180zoijcleaow.ppxfxbqfkf(promoCollectionInfo, items);
        } else {
            this.f35180zoijcleaow.gtknphoqwx(promoCollectionId, items);
        }
    }

    @Override // dv0.iobyxmoadg
    public PromoCollectionInfo iobyxmoadg(String promoCollectionId) {
        zdlpuopuiu.btonecajqb(promoCollectionId, "promoCollectionId");
        return this.f35180zoijcleaow.dxjokdxxww(promoCollectionId);
    }

    @Override // dv0.iobyxmoadg
    public void ppxfxbqfkf(String screenTag) {
        zdlpuopuiu.btonecajqb(screenTag, "screenTag");
        this.f35180zoijcleaow.gxszxtbevo(screenTag);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dv0.iobyxmoadg
    public Object wkgbmnqykc(String str, String str2, String str3, String str4, gxszxtbevo gxszxtbevoVar) throws Throwable {
        C0784iobyxmoadg c0784iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C0784iobyxmoadg) {
            c0784iobyxmoadg = (C0784iobyxmoadg) gxszxtbevoVar;
            int i13 = c0784iobyxmoadg.f35182esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0784iobyxmoadg.f35182esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                c0784iobyxmoadg = new C0784iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0784iobyxmoadg = new C0784iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c0784iobyxmoadg.f35183iwizpuwonk;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c0784iobyxmoadg.f35182esjtqupxsv;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            UnlockPromoCollectionProductRequest unlockPromoCollectionProductRequest = new UnlockPromoCollectionProductRequest(str2, str3, str4);
            gv0.iobyxmoadg iobyxmoadgVar2 = this.f35179iobyxmoadg;
            c0784iobyxmoadg.f35186zdlpuopuiu = this;
            c0784iobyxmoadg.f35185yggfygwlhe = str;
            c0784iobyxmoadg.f35184jyumaefscl = str4;
            c0784iobyxmoadg.f35182esjtqupxsv = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(unlockPromoCollectionProductRequest, c0784iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = (String) c0784iobyxmoadg.f35184jyumaefscl;
            str = (String) c0784iobyxmoadg.f35185yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) c0784iobyxmoadg.f35186zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null);
        iobyxmoadgVar.f35180zoijcleaow.eablkybsjg(str, str4);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // dv0.iobyxmoadg
    public lqeggnwhkg zoijcleaow(String promoCollectionId, String screenTag) {
        zdlpuopuiu.btonecajqb(promoCollectionId, "promoCollectionId");
        zdlpuopuiu.btonecajqb(screenTag, "screenTag");
        return this.f35180zoijcleaow.btonecajqb(promoCollectionId, screenTag);
    }
}
