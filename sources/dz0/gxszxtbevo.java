package dz0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends zoijcleaow {

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final w01.eablkybsjg f29985oxmwwwfdhm;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final k01.nufgyqmvbu f29986vdvldrhtss;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f29987iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f29989yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f29990zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f29989yggfygwlhe = obj;
            this.f29987iwizpuwonk |= Integer.MIN_VALUE;
            return gxszxtbevo.this.cdpycssgdh(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(k01.nufgyqmvbu orderLocalSource, w01.eablkybsjg changeOrderProductsUseCase, lqeggnwhkg changeProductAnalyticHelper, pkzmftpjix dispatcher) {
        super(orderLocalSource, changeProductAnalyticHelper, dispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(changeOrderProductsUseCase, "changeOrderProductsUseCase");
        zdlpuopuiu.btonecajqb(changeProductAnalyticHelper, "changeProductAnalyticHelper");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f29986vdvldrhtss = orderLocalSource;
        this.f29985oxmwwwfdhm = changeOrderProductsUseCase;
        kcexrzcfyt();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dz0.iobyxmoadg
    public Object cdpycssgdh(List list, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        gxszxtbevo gxszxtbevoVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f29987iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f29987iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f29989yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f29987iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            String str = (String) pkzmftpjix().getValue();
            if (list.isEmpty()) {
                return nufgyqmvbu.ppxfxbqfkf.f30047iobyxmoadg;
            }
            w01.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = new w01.eablkybsjg.iobyxmoadg(str, list);
            w01.eablkybsjg eablkybsjgVar = this.f29985oxmwwwfdhm;
            iobyxmoadgVar.f29990zdlpuopuiu = this;
            iobyxmoadgVar.f29987iwizpuwonk = 1;
            objZoijcleaow = eablkybsjgVar.zoijcleaow(iobyxmoadgVar2, iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gxszxtbevoVar2 = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gxszxtbevoVar2 = (gxszxtbevo) iobyxmoadgVar.f29990zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        w01.eablkybsjg.zoijcleaow zoijcleaowVar = (w01.eablkybsjg.zoijcleaow) objZoijcleaow;
        return new nufgyqmvbu.zoijcleaow(gxszxtbevoVar2.ylkuphrtab(zoijcleaowVar.zoijcleaow()), zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.iobyxmoadg());
    }
}
