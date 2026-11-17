package dz0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww extends zoijcleaow {

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final w01.wkgbmnqykc f29974vdvldrhtss;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f29975iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f29977yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f29978zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f29977yggfygwlhe = obj;
            this.f29975iwizpuwonk |= Integer.MIN_VALUE;
            return dxjokdxxww.this.cdpycssgdh(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(k01.nufgyqmvbu orderLocalSource, lqeggnwhkg changeProductAnalyticHelper, w01.wkgbmnqykc changeOrderEditOrderUseCase, pkzmftpjix dispatcher) {
        super(orderLocalSource, changeProductAnalyticHelper, dispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(changeProductAnalyticHelper, "changeProductAnalyticHelper");
        zdlpuopuiu.btonecajqb(changeOrderEditOrderUseCase, "changeOrderEditOrderUseCase");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f29974vdvldrhtss = changeOrderEditOrderUseCase;
        kcexrzcfyt();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dz0.iobyxmoadg
    public Object cdpycssgdh(List list, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        dxjokdxxww dxjokdxxwwVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f29975iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f29975iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f29977yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f29975iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            String str = (String) pkzmftpjix().getValue();
            if (list.isEmpty()) {
                return nufgyqmvbu.ppxfxbqfkf.f30047iobyxmoadg;
            }
            w01.wkgbmnqykc.zoijcleaow.C2944zoijcleaow c2944zoijcleaow = new w01.wkgbmnqykc.zoijcleaow.C2944zoijcleaow(str, list);
            w01.wkgbmnqykc wkgbmnqykcVar = this.f29974vdvldrhtss;
            iobyxmoadgVar.f29978zdlpuopuiu = this;
            iobyxmoadgVar.f29975iwizpuwonk = 1;
            objZoijcleaow = wkgbmnqykcVar.zoijcleaow(c2944zoijcleaow, iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            dxjokdxxwwVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dxjokdxxwwVar = (dxjokdxxww) iobyxmoadgVar.f29978zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        w01.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = (w01.wkgbmnqykc.iobyxmoadg) objZoijcleaow;
        List listPpxfxbqfkf = iobyxmoadgVar2.iobyxmoadg().ppxfxbqfkf();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
        Iterator it = listPpxfxbqfkf.iterator();
        while (it.hasNext()) {
            arrayList.add(lz0.zoijcleaow.zoijcleaow((uz0.eablkybsjg) it.next()));
        }
        return new nufgyqmvbu.zoijcleaow(dxjokdxxwwVar.ylkuphrtab(arrayList), jyumaefscl.eablkybsjg(iobyxmoadgVar2.zoijcleaow()), jyumaefscl.wflxmlrfwp());
    }
}
