package cw;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.components.payment.api.models.SbpRecurringBankAppModel;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cw.iobyxmoadg f25975ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f25976zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f25977iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f25977iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f25977iobyxmoadg, ((iobyxmoadg) obj).f25977iobyxmoadg);
        }

        public int hashCode() {
            return this.f25977iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f25977iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f25977iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: cw.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0458zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f25978iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f25980yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f25981zdlpuopuiu;

        C0458zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f25980yggfygwlhe = obj;
            this.f25978iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(wkgbmnqykc orderRemoteSource, cw.iobyxmoadg bankSchemeToSbpUri, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(bankSchemeToSbpUri, "bankSchemeToSbpUri");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f25976zoijcleaow = orderRemoteSource;
        this.f25975ppxfxbqfkf = bankSchemeToSbpUri;
    }

    private final ew.ppxfxbqfkf.iobyxmoadg wkgbmnqykc(ew.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        List<SbpRecurringBankAppModel> listPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        ArrayList arrayList = new ArrayList();
        for (SbpRecurringBankAppModel sbpRecurringBankAppModel : listPpxfxbqfkf) {
            String strInvoke = this.f25975ppxfxbqfkf.invoke(sbpRecurringBankAppModel.getSchema(), iobyxmoadgVar.wkgbmnqykc());
            SbpRecurringBankAppModel sbpRecurringBankAppModelPpxfxbqfkf = strInvoke != null ? SbpRecurringBankAppModel.ppxfxbqfkf(sbpRecurringBankAppModel, null, null, strInvoke, null, 11, null) : null;
            if (sbpRecurringBankAppModelPpxfxbqfkf != null) {
                arrayList.add(sbpRecurringBankAppModelPpxfxbqfkf);
            }
        }
        return ew.ppxfxbqfkf.iobyxmoadg.zoijcleaow(iobyxmoadgVar, null, false, arrayList, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        C0458zoijcleaow c0458zoijcleaow;
        zoijcleaow zoijcleaowVar;
        ew.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarWkgbmnqykc;
        if (gxszxtbevoVar instanceof C0458zoijcleaow) {
            c0458zoijcleaow = (C0458zoijcleaow) gxszxtbevoVar;
            int i13 = c0458zoijcleaow.f25978iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0458zoijcleaow.f25978iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c0458zoijcleaow = new C0458zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c0458zoijcleaow = new C0458zoijcleaow(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = c0458zoijcleaow.f25980yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0458zoijcleaow.f25978iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            wkgbmnqykc wkgbmnqykcVar = this.f25976zoijcleaow;
            String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            c0458zoijcleaow.f25981zdlpuopuiu = this;
            c0458zoijcleaow.f25978iwizpuwonk = 1;
            objPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf(strIobyxmoadg, c0458zoijcleaow);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) c0458zoijcleaow.f25981zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        ew.ppxfxbqfkf ppxfxbqfkfVar = (ew.ppxfxbqfkf) objPpxfxbqfkf;
        ew.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = ppxfxbqfkfVar instanceof ew.ppxfxbqfkf.iobyxmoadg ? (ew.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar : null;
        return (iobyxmoadgVar2 == null || (iobyxmoadgVarWkgbmnqykc = zoijcleaowVar.wkgbmnqykc(iobyxmoadgVar2)) == null) ? ppxfxbqfkfVar : iobyxmoadgVarWkgbmnqykc;
    }
}
