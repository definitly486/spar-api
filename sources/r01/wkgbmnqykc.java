package r01;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogSection;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final l01.ppxfxbqfkf f81391ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l01.zoijcleaow f81392zoijcleaow;

    public static final class eablkybsjg implements Comparator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Comparator f81393zdlpuopuiu;

        public eablkybsjg(Comparator comparator) {
            this.f81393zdlpuopuiu = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f81393zdlpuopuiu.compare(obj, obj2);
            return iCompare != 0 ? iCompare : kg.iobyxmoadg.wkgbmnqykc(((CatalogSection) obj).getName(), ((CatalogSection) obj2).getName());
        }
    }

    public static final class gxszxtbevo implements Comparator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Comparator f81394zdlpuopuiu;

        public gxszxtbevo(Comparator comparator) {
            this.f81394zdlpuopuiu = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f81394zdlpuopuiu.compare(obj, obj2);
            return iCompare != 0 ? iCompare : kg.iobyxmoadg.wkgbmnqykc(((CatalogSection) obj).getId(), ((CatalogSection) obj2).getId());
        }
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f81395iobyxmoadg;

        public iobyxmoadg(String shopId) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f81395iobyxmoadg = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f81395iobyxmoadg, ((iobyxmoadg) obj).f81395iobyxmoadg);
        }

        public int hashCode() {
            return this.f81395iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f81395iobyxmoadg;
        }

        public String toString() {
            return "Params(shopId=" + this.f81395iobyxmoadg + ")";
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f81396iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f81398yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f81399zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f81398yggfygwlhe = obj;
            this.f81396iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.eablkybsjg(null, this);
        }
    }

    /* JADX INFO: renamed from: r01.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1813wkgbmnqykc implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(((CatalogSection) obj).getSortMain()), Integer.valueOf(((CatalogSection) obj2).getSortMain()));
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f81400iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f81402yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f81403zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f81402yggfygwlhe = obj;
            this.f81400iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(l01.zoijcleaow catalogLocalSource, l01.ppxfxbqfkf catalogRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(catalogLocalSource, "catalogLocalSource");
        zdlpuopuiu.btonecajqb(catalogRemoteSource, "catalogRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f81392zoijcleaow = catalogLocalSource;
        this.f81391ppxfxbqfkf = catalogRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f81396iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f81396iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f81398yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f81396iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            l01.ppxfxbqfkf ppxfxbqfkfVar2 = this.f81391ppxfxbqfkf;
            ppxfxbqfkfVar.f81399zdlpuopuiu = this;
            ppxfxbqfkfVar.f81396iwizpuwonk = 1;
            objIobyxmoadg = ppxfxbqfkfVar2.iobyxmoadg(str, ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wkgbmnqykcVar = this;
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) ppxfxbqfkfVar.f81399zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                return list;
            }
            wkgbmnqykcVar = (wkgbmnqykc) ppxfxbqfkfVar.f81399zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List list2 = (List) objIobyxmoadg;
        l01.zoijcleaow zoijcleaowVar = wkgbmnqykcVar.f81392zoijcleaow;
        ppxfxbqfkfVar.f81399zdlpuopuiu = list2;
        ppxfxbqfkfVar.f81396iwizpuwonk = 2;
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
        return jyumaefscl.d(arrayList, new gxszxtbevo(new eablkybsjg(new C1813wkgbmnqykc())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f81400iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f81400iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objEablkybsjg = zoijcleaowVar.f81402yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f81400iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            zoijcleaowVar.f81403zdlpuopuiu = this;
            zoijcleaowVar.f81400iwizpuwonk = 1;
            objEablkybsjg = eablkybsjg(strIobyxmoadg, zoijcleaowVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wkgbmnqykcVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wkgbmnqykcVar = (wkgbmnqykc) zoijcleaowVar.f81403zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        return wkgbmnqykcVar.gxszxtbevo((List) objEablkybsjg);
    }
}
