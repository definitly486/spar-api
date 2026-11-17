package h20;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.catalog.CatalogSection;
import ru.myspar.core.domain.models.catalog.CatalogWithSubCatalogs;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final x10.ppxfxbqfkf f39190ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final x10.zoijcleaow f39191zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f39192iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f39193zoijcleaow;

        public iobyxmoadg(String parentId, String shopId) {
            zdlpuopuiu.btonecajqb(parentId, "parentId");
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f39192iobyxmoadg = parentId;
            this.f39193zoijcleaow = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f39192iobyxmoadg, iobyxmoadgVar.f39192iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39193zoijcleaow, iobyxmoadgVar.f39193zoijcleaow);
        }

        public int hashCode() {
            return (this.f39192iobyxmoadg.hashCode() * 31) + this.f39193zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f39192iobyxmoadg;
        }

        public String toString() {
            return "Params(parentId=" + this.f39192iobyxmoadg + ", shopId=" + this.f39193zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f39193zoijcleaow;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f39194iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f39196yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f39197zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f39196yggfygwlhe = obj;
            this.f39194iwizpuwonk |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.eablkybsjg(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f39198cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f39200jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f39201yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f39202zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f39200jyumaefscl = obj;
            this.f39198cqumvgiudr |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(x10.zoijcleaow catalogLocalSource, x10.ppxfxbqfkf catalogRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(catalogLocalSource, "catalogLocalSource");
        zdlpuopuiu.btonecajqb(catalogRemoteSource, "catalogRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f39191zoijcleaow = catalogLocalSource;
        this.f39190ppxfxbqfkf = catalogRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f39194iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f39194iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f39196yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f39194iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            x10.ppxfxbqfkf ppxfxbqfkfVar2 = this.f39190ppxfxbqfkf;
            ppxfxbqfkfVar.f39197zdlpuopuiu = this;
            ppxfxbqfkfVar.f39194iwizpuwonk = 1;
            objIobyxmoadg = ppxfxbqfkfVar2.iobyxmoadg(str, ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            nufgyqmvbuVar = this;
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) ppxfxbqfkfVar.f39197zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                return list;
            }
            nufgyqmvbuVar = (nufgyqmvbu) ppxfxbqfkfVar.f39197zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List list2 = (List) objIobyxmoadg;
        x10.zoijcleaow zoijcleaowVar = nufgyqmvbuVar.f39191zoijcleaow;
        ppxfxbqfkfVar.f39197zdlpuopuiu = list2;
        ppxfxbqfkfVar.f39194iwizpuwonk = 2;
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
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        nufgyqmvbu nufgyqmvbuVar;
        String str;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f39198cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f39198cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f39200jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f39198cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
            zoijcleaowVar.f39202zdlpuopuiu = this;
            zoijcleaowVar.f39201yggfygwlhe = strIobyxmoadg;
            zoijcleaowVar.f39198cqumvgiudr = 1;
            Object objEablkybsjg = eablkybsjg(strZoijcleaow, zoijcleaowVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            nufgyqmvbuVar = this;
            obj = objEablkybsjg;
            str = strIobyxmoadg;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) zoijcleaowVar.f39201yggfygwlhe;
            nufgyqmvbuVar = (nufgyqmvbu) zoijcleaowVar.f39202zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return nufgyqmvbuVar.gxszxtbevo(str, (List) obj);
    }
}
