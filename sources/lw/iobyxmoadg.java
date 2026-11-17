package lw;

import gg.wwaezpbzkn;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import nw.UnlockPromoCollectionProductRequest;
import o40.eablkybsjg;
import qw.ppxfxbqfkf;
import ru.myspar.components.promo_collection.api.models.PromoCollectionInfo;
import ru.myspar.core.network.model.BasicResponse;
import sj.lqeggnwhkg;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements jw.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final mw.iobyxmoadg f64241iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ppxfxbqfkf f64242zoijcleaow;

    /* JADX INFO: renamed from: lw.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1326iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f64244esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f64245iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f64246jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f64247yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f64248zdlpuopuiu;

        C1326iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f64245iwizpuwonk = obj;
            this.f64244esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, null, null, null, this);
        }
    }

    public iobyxmoadg(mw.iobyxmoadg apiService, ppxfxbqfkf repository) {
        zdlpuopuiu.btonecajqb(apiService, "apiService");
        zdlpuopuiu.btonecajqb(repository, "repository");
        this.f64241iobyxmoadg = apiService;
        this.f64242zoijcleaow = repository;
    }

    @Override // jw.iobyxmoadg
    public void eablkybsjg(String promoCollectionId, PromoCollectionInfo promoCollectionInfo, List items) {
        zdlpuopuiu.btonecajqb(promoCollectionId, "promoCollectionId");
        zdlpuopuiu.btonecajqb(items, "items");
        if (promoCollectionInfo != null) {
            this.f64242zoijcleaow.ppxfxbqfkf(promoCollectionInfo, items);
        } else {
            this.f64242zoijcleaow.gtknphoqwx(promoCollectionId, items);
        }
    }

    @Override // jw.iobyxmoadg
    public PromoCollectionInfo iobyxmoadg(String promoCollectionId) {
        zdlpuopuiu.btonecajqb(promoCollectionId, "promoCollectionId");
        return this.f64242zoijcleaow.dxjokdxxww(promoCollectionId);
    }

    @Override // jw.iobyxmoadg
    public void ppxfxbqfkf(String screenTag) {
        zdlpuopuiu.btonecajqb(screenTag, "screenTag");
        this.f64242zoijcleaow.gxszxtbevo(screenTag);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw.iobyxmoadg
    public Object wkgbmnqykc(String str, String str2, String str3, String str4, gxszxtbevo gxszxtbevoVar) throws Throwable {
        C1326iobyxmoadg c1326iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C1326iobyxmoadg) {
            c1326iobyxmoadg = (C1326iobyxmoadg) gxszxtbevoVar;
            int i13 = c1326iobyxmoadg.f64244esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1326iobyxmoadg.f64244esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                c1326iobyxmoadg = new C1326iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1326iobyxmoadg = new C1326iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c1326iobyxmoadg.f64245iwizpuwonk;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c1326iobyxmoadg.f64244esjtqupxsv;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            UnlockPromoCollectionProductRequest unlockPromoCollectionProductRequest = new UnlockPromoCollectionProductRequest(str2, str3, str4);
            mw.iobyxmoadg iobyxmoadgVar2 = this.f64241iobyxmoadg;
            c1326iobyxmoadg.f64248zdlpuopuiu = this;
            c1326iobyxmoadg.f64247yggfygwlhe = str;
            c1326iobyxmoadg.f64246jyumaefscl = str4;
            c1326iobyxmoadg.f64244esjtqupxsv = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(unlockPromoCollectionProductRequest, c1326iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = (String) c1326iobyxmoadg.f64246jyumaefscl;
            str = (String) c1326iobyxmoadg.f64247yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) c1326iobyxmoadg.f64248zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        eablkybsjg.btonecajqb((BasicResponse) objIobyxmoadg, null, 1, null);
        iobyxmoadgVar.f64242zoijcleaow.eablkybsjg(str, str4);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // jw.iobyxmoadg
    public lqeggnwhkg zoijcleaow(String promoCollectionId, String screenTag) {
        zdlpuopuiu.btonecajqb(promoCollectionId, "promoCollectionId");
        zdlpuopuiu.btonecajqb(screenTag, "screenTag");
        return this.f64242zoijcleaow.btonecajqb(promoCollectionId, screenTag);
    }
}
