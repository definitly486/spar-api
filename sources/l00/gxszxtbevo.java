package l00;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends zoijcleaow {

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final o20.eablkybsjg f61232oxmwwwfdhm;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final w10.nufgyqmvbu f61233vdvldrhtss;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f61234iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f61236yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f61237zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f61236yggfygwlhe = obj;
            this.f61234iwizpuwonk |= Integer.MIN_VALUE;
            return gxszxtbevo.this.cdpycssgdh(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(w10.nufgyqmvbu orderLocalSource, o20.eablkybsjg changeOrderProductsUseCase, lqeggnwhkg changeProductAnalyticHelper, pkzmftpjix dispatcher) {
        super(orderLocalSource, changeProductAnalyticHelper, dispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(changeOrderProductsUseCase, "changeOrderProductsUseCase");
        zdlpuopuiu.btonecajqb(changeProductAnalyticHelper, "changeProductAnalyticHelper");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f61233vdvldrhtss = orderLocalSource;
        this.f61232oxmwwwfdhm = changeOrderProductsUseCase;
        kcexrzcfyt();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l00.iobyxmoadg
    public Object cdpycssgdh(List list, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        gxszxtbevo gxszxtbevoVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f61234iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f61234iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f61236yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f61234iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            String str = (String) pkzmftpjix().getValue();
            if (list.isEmpty()) {
                return nufgyqmvbu.ppxfxbqfkf.f61294iobyxmoadg;
            }
            o20.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = new o20.eablkybsjg.iobyxmoadg(str, list);
            o20.eablkybsjg eablkybsjgVar = this.f61232oxmwwwfdhm;
            iobyxmoadgVar.f61237zdlpuopuiu = this;
            iobyxmoadgVar.f61234iwizpuwonk = 1;
            objZoijcleaow = eablkybsjgVar.zoijcleaow(iobyxmoadgVar2, iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gxszxtbevoVar2 = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gxszxtbevoVar2 = (gxszxtbevo) iobyxmoadgVar.f61237zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        o20.eablkybsjg.zoijcleaow zoijcleaowVar = (o20.eablkybsjg.zoijcleaow) objZoijcleaow;
        return new nufgyqmvbu.zoijcleaow(gxszxtbevoVar2.ylkuphrtab(zoijcleaowVar.zoijcleaow()), zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.iobyxmoadg());
    }
}
