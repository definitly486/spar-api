package h20;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.catalog.CatalogSection;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final x10.ppxfxbqfkf f39177ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final x10.zoijcleaow f39178zoijcleaow;

    public static final class eablkybsjg implements Comparator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Comparator f39179zdlpuopuiu;

        public eablkybsjg(Comparator comparator) {
            this.f39179zdlpuopuiu = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f39179zdlpuopuiu.compare(obj, obj2);
            return iCompare != 0 ? iCompare : kg.iobyxmoadg.wkgbmnqykc(((CatalogSection) obj).getName(), ((CatalogSection) obj2).getName());
        }
    }

    public static final class gxszxtbevo implements Comparator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Comparator f39180zdlpuopuiu;

        public gxszxtbevo(Comparator comparator) {
            this.f39180zdlpuopuiu = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f39180zdlpuopuiu.compare(obj, obj2);
            return iCompare != 0 ? iCompare : kg.iobyxmoadg.wkgbmnqykc(((CatalogSection) obj).getId(), ((CatalogSection) obj2).getId());
        }
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f39181iobyxmoadg;

        public iobyxmoadg(String shopId) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f39181iobyxmoadg = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39181iobyxmoadg, ((iobyxmoadg) obj).f39181iobyxmoadg);
        }

        public int hashCode() {
            return this.f39181iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f39181iobyxmoadg;
        }

        public String toString() {
            return "Params(shopId=" + this.f39181iobyxmoadg + ")";
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f39182iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f39184yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f39185zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f39184yggfygwlhe = obj;
            this.f39182iwizpuwonk |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.eablkybsjg(null, this);
        }
    }

    public static final class wkgbmnqykc implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(((CatalogSection) obj).getSortMain()), Integer.valueOf(((CatalogSection) obj2).getSortMain()));
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f39186iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f39188yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f39189zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f39188yggfygwlhe = obj;
            this.f39186iwizpuwonk |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(x10.zoijcleaow catalogLocalSource, x10.ppxfxbqfkf catalogRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(catalogLocalSource, "catalogLocalSource");
        zdlpuopuiu.btonecajqb(catalogRemoteSource, "catalogRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f39178zoijcleaow = catalogLocalSource;
        this.f39177ppxfxbqfkf = catalogRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        lqeggnwhkg lqeggnwhkgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f39182iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f39182iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f39184yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f39182iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            x10.ppxfxbqfkf ppxfxbqfkfVar2 = this.f39177ppxfxbqfkf;
            ppxfxbqfkfVar.f39185zdlpuopuiu = this;
            ppxfxbqfkfVar.f39182iwizpuwonk = 1;
            objIobyxmoadg = ppxfxbqfkfVar2.iobyxmoadg(str, ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            lqeggnwhkgVar = this;
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) ppxfxbqfkfVar.f39185zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                return list;
            }
            lqeggnwhkgVar = (lqeggnwhkg) ppxfxbqfkfVar.f39185zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List list2 = (List) objIobyxmoadg;
        x10.zoijcleaow zoijcleaowVar = lqeggnwhkgVar.f39178zoijcleaow;
        ppxfxbqfkfVar.f39185zdlpuopuiu = list2;
        ppxfxbqfkfVar.f39182iwizpuwonk = 2;
        return zoijcleaowVar.iobyxmoadg(list2, ppxfxbqfkfVar) == objGxszxtbevo ? objGxszxtbevo : list2;
    }

    private final List gxszxtbevo(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CatalogSection catalogSection = (CatalogSection) obj;
            if (catalogSection.getParentId() == null || catalogSection.getShowOnMain()) {
                arrayList.add(obj);
            }
        }
        return jyumaefscl.d(arrayList, new gxszxtbevo(new eablkybsjg(new wkgbmnqykc())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        lqeggnwhkg lqeggnwhkgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f39186iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f39186iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objEablkybsjg = zoijcleaowVar.f39188yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f39186iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            zoijcleaowVar.f39189zdlpuopuiu = this;
            zoijcleaowVar.f39186iwizpuwonk = 1;
            objEablkybsjg = eablkybsjg(strIobyxmoadg, zoijcleaowVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            lqeggnwhkgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lqeggnwhkgVar = (lqeggnwhkg) zoijcleaowVar.f39189zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        return lqeggnwhkgVar.gxszxtbevo((List) objEablkybsjg);
    }
}
