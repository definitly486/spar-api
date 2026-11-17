package r01;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogSection;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogWithSubCatalogs;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final l01.ppxfxbqfkf f81359ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l01.zoijcleaow f81360zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f81361iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f81362zoijcleaow;

        public iobyxmoadg(String parentId, String shopId) {
            zdlpuopuiu.btonecajqb(parentId, "parentId");
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f81361iobyxmoadg = parentId;
            this.f81362zoijcleaow = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f81361iobyxmoadg, iobyxmoadgVar.f81361iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f81362zoijcleaow, iobyxmoadgVar.f81362zoijcleaow);
        }

        public int hashCode() {
            return (this.f81361iobyxmoadg.hashCode() * 31) + this.f81362zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f81361iobyxmoadg;
        }

        public String toString() {
            return "Params(parentId=" + this.f81361iobyxmoadg + ", shopId=" + this.f81362zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f81362zoijcleaow;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f81363iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f81365yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f81366zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f81365yggfygwlhe = obj;
            this.f81363iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.eablkybsjg(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f81367cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f81369jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f81370yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f81371zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f81369jyumaefscl = obj;
            this.f81367cqumvgiudr |= Integer.MIN_VALUE;
            return eablkybsjg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(l01.zoijcleaow catalogLocalSource, l01.ppxfxbqfkf catalogRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(catalogLocalSource, "catalogLocalSource");
        zdlpuopuiu.btonecajqb(catalogRemoteSource, "catalogRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f81360zoijcleaow = catalogLocalSource;
        this.f81359ppxfxbqfkf = catalogRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f81363iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f81363iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f81365yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f81363iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            l01.ppxfxbqfkf ppxfxbqfkfVar2 = this.f81359ppxfxbqfkf;
            ppxfxbqfkfVar.f81366zdlpuopuiu = this;
            ppxfxbqfkfVar.f81363iwizpuwonk = 1;
            objIobyxmoadg = ppxfxbqfkfVar2.iobyxmoadg(str, ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) ppxfxbqfkfVar.f81366zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                return list;
            }
            eablkybsjgVar = (eablkybsjg) ppxfxbqfkfVar.f81366zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List list2 = (List) objIobyxmoadg;
        l01.zoijcleaow zoijcleaowVar = eablkybsjgVar.f81360zoijcleaow;
        ppxfxbqfkfVar.f81366zdlpuopuiu = list2;
        ppxfxbqfkfVar.f81363iwizpuwonk = 2;
        return zoijcleaowVar.iobyxmoadg(list2, ppxfxbqfkfVar) == objGxszxtbevo ? objGxszxtbevo : list2;
    }

    private final CatalogWithSubCatalogs gxszxtbevo(String str, List list) {
        List listWflxmlrfwp;
        CatalogSection catalogSection = null;
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (zdlpuopuiu.eablkybsjg(((CatalogSection) obj2).getId(), str)) {
                    obj = obj2;
                    break;
                }
            }
            catalogSection = (CatalogSection) obj;
        }
        if (list != null) {
            listWflxmlrfwp = new ArrayList();
            for (Object obj3 : list) {
                if (zdlpuopuiu.eablkybsjg(((CatalogSection) obj3).getParentId(), str)) {
                    listWflxmlrfwp.add(obj3);
                }
            }
        } else {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        return new CatalogWithSubCatalogs(catalogSection, listWflxmlrfwp);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        eablkybsjg eablkybsjgVar;
        String str;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f81367cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f81367cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f81369jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f81367cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
            zoijcleaowVar.f81371zdlpuopuiu = this;
            zoijcleaowVar.f81370yggfygwlhe = strIobyxmoadg;
            zoijcleaowVar.f81367cqumvgiudr = 1;
            Object objEablkybsjg = eablkybsjg(strZoijcleaow, zoijcleaowVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
            obj = objEablkybsjg;
            str = strIobyxmoadg;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) zoijcleaowVar.f81370yggfygwlhe;
            eablkybsjgVar = (eablkybsjg) zoijcleaowVar.f81371zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return eablkybsjgVar.gxszxtbevo(str, (List) obj);
    }
}
