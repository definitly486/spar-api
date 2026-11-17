package ih1;

import hh1.dxjokdxxww;
import hh1.nufgyqmvbu;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.components.geo.api.models.City;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final j01.iobyxmoadg f44328ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final t81.iobyxmoadg f44329wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dh1.iobyxmoadg f44330zoijcleaow;

    /* JADX INFO: renamed from: ih1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1029iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f44331iobyxmoadg;

        public C1029iobyxmoadg(String str) {
            this.f44331iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1029iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f44331iobyxmoadg, ((C1029iobyxmoadg) obj).f44331iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f44331iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f44331iobyxmoadg;
        }

        public String toString() {
            return "Params(shopId=" + this.f44331iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f44332iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f44334yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f44335zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f44334yggfygwlhe = obj;
            this.f44332iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dh1.iobyxmoadg popupRepository, j01.iobyxmoadg sharedPreferencesRepository2, t81.iobyxmoadg featureManager, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(popupRepository, "popupRepository");
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository2, "sharedPreferencesRepository2");
        zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f44330zoijcleaow = popupRepository;
        this.f44328ppxfxbqfkf = sharedPreferencesRepository2;
        this.f44329wkgbmnqykc = featureManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C1029iobyxmoadg c1029iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        List list;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f44332iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f44332iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = zoijcleaowVar.f44334yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f44332iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f44335zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) zoijcleaowVar.f44335zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            }
            return new dxjokdxxww(list, ((Boolean) objPpxfxbqfkf).booleanValue());
        }
        gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        String strIobyxmoadg = c1029iobyxmoadg.iobyxmoadg();
        if (strIobyxmoadg == null) {
            City cityVdvldrhtss = this.f44328ppxfxbqfkf.vdvldrhtss();
            strIobyxmoadg = cityVdvldrhtss != null ? cityVdvldrhtss.getDefaultShopId() : null;
        }
        dh1.iobyxmoadg iobyxmoadgVar2 = this.f44330zoijcleaow;
        zoijcleaowVar.f44335zdlpuopuiu = this;
        zoijcleaowVar.f44332iwizpuwonk = 1;
        objPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf(strIobyxmoadg, zoijcleaowVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        List listIobyxmoadg = ((nufgyqmvbu) objPpxfxbqfkf).iobyxmoadg();
        t81.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f44329wkgbmnqykc;
        s81.iobyxmoadg iobyxmoadgVar4 = s81.iobyxmoadg.f105728istkbnxepw;
        zoijcleaowVar.f44335zdlpuopuiu = listIobyxmoadg;
        zoijcleaowVar.f44332iwizpuwonk = 2;
        Object objPpxfxbqfkf2 = iobyxmoadgVar3.ppxfxbqfkf(iobyxmoadgVar4, zoijcleaowVar);
        if (objPpxfxbqfkf2 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        objPpxfxbqfkf = objPpxfxbqfkf2;
        list = listIobyxmoadg;
        return new dxjokdxxww(list, ((Boolean) objPpxfxbqfkf).booleanValue());
    }
}
