package l00;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww extends zoijcleaow {

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final o20.wkgbmnqykc f61221vdvldrhtss;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f61222iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f61224yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f61225zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f61224yggfygwlhe = obj;
            this.f61222iwizpuwonk |= Integer.MIN_VALUE;
            return dxjokdxxww.this.cdpycssgdh(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(w10.nufgyqmvbu orderLocalSource, lqeggnwhkg changeProductAnalyticHelper, o20.wkgbmnqykc changeOrderEditOrderUseCase, pkzmftpjix dispatcher) {
        super(orderLocalSource, changeProductAnalyticHelper, dispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(changeProductAnalyticHelper, "changeProductAnalyticHelper");
        zdlpuopuiu.btonecajqb(changeOrderEditOrderUseCase, "changeOrderEditOrderUseCase");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f61221vdvldrhtss = changeOrderEditOrderUseCase;
        kcexrzcfyt();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l00.iobyxmoadg
    public Object cdpycssgdh(List list, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        dxjokdxxww dxjokdxxwwVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f61222iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f61222iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f61224yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f61222iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            String str = (String) pkzmftpjix().getValue();
            if (list.isEmpty()) {
                return nufgyqmvbu.ppxfxbqfkf.f61294iobyxmoadg;
            }
            o20.wkgbmnqykc.zoijcleaow.C1550zoijcleaow c1550zoijcleaow = new o20.wkgbmnqykc.zoijcleaow.C1550zoijcleaow(str, list);
            o20.wkgbmnqykc wkgbmnqykcVar = this.f61221vdvldrhtss;
            iobyxmoadgVar.f61225zdlpuopuiu = this;
            iobyxmoadgVar.f61222iwizpuwonk = 1;
            objZoijcleaow = wkgbmnqykcVar.zoijcleaow(c1550zoijcleaow, iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            dxjokdxxwwVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dxjokdxxwwVar = (dxjokdxxww) iobyxmoadgVar.f61225zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        o20.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = (o20.wkgbmnqykc.iobyxmoadg) objZoijcleaow;
        List listPpxfxbqfkf = iobyxmoadgVar2.iobyxmoadg().ppxfxbqfkf();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
        Iterator it = listPpxfxbqfkf.iterator();
        while (it.hasNext()) {
            arrayList.add(u00.zoijcleaow.iobyxmoadg((e10.eablkybsjg) it.next()));
        }
        return new nufgyqmvbu.zoijcleaow(dxjokdxxwwVar.ylkuphrtab(arrayList), jyumaefscl.eablkybsjg(iobyxmoadgVar2.zoijcleaow()), jyumaefscl.wflxmlrfwp());
    }
}
