package wu0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.components.payment.api.models.SbpRecurringBankAppModel;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wu0.iobyxmoadg f120651ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f120652zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f120653iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f120653iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f120653iobyxmoadg, ((iobyxmoadg) obj).f120653iobyxmoadg);
        }

        public int hashCode() {
            return this.f120653iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f120653iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f120653iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: wu0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C3032zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f120654iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f120656yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f120657zdlpuopuiu;

        C3032zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f120656yggfygwlhe = obj;
            this.f120654iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(wkgbmnqykc orderRemoteSource, wu0.iobyxmoadg bankSchemeToSbpUri, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(bankSchemeToSbpUri, "bankSchemeToSbpUri");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f120652zoijcleaow = orderRemoteSource;
        this.f120651ppxfxbqfkf = bankSchemeToSbpUri;
    }

    private final yu0.ppxfxbqfkf.iobyxmoadg wkgbmnqykc(yu0.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        List<SbpRecurringBankAppModel> listPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        ArrayList arrayList = new ArrayList();
        for (SbpRecurringBankAppModel sbpRecurringBankAppModel : listPpxfxbqfkf) {
            String strInvoke = this.f120651ppxfxbqfkf.invoke(sbpRecurringBankAppModel.getSchema(), iobyxmoadgVar.wkgbmnqykc());
            SbpRecurringBankAppModel sbpRecurringBankAppModelPpxfxbqfkf = strInvoke != null ? SbpRecurringBankAppModel.ppxfxbqfkf(sbpRecurringBankAppModel, null, null, strInvoke, null, 11, null) : null;
            if (sbpRecurringBankAppModelPpxfxbqfkf != null) {
                arrayList.add(sbpRecurringBankAppModelPpxfxbqfkf);
            }
        }
        return yu0.ppxfxbqfkf.iobyxmoadg.zoijcleaow(iobyxmoadgVar, null, false, arrayList, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        C3032zoijcleaow c3032zoijcleaow;
        zoijcleaow zoijcleaowVar;
        yu0.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarWkgbmnqykc;
        if (gxszxtbevoVar instanceof C3032zoijcleaow) {
            c3032zoijcleaow = (C3032zoijcleaow) gxszxtbevoVar;
            int i13 = c3032zoijcleaow.f120654iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3032zoijcleaow.f120654iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c3032zoijcleaow = new C3032zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c3032zoijcleaow = new C3032zoijcleaow(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = c3032zoijcleaow.f120656yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c3032zoijcleaow.f120654iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            wkgbmnqykc wkgbmnqykcVar = this.f120652zoijcleaow;
            String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            c3032zoijcleaow.f120657zdlpuopuiu = this;
            c3032zoijcleaow.f120654iwizpuwonk = 1;
            objPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf(strIobyxmoadg, c3032zoijcleaow);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) c3032zoijcleaow.f120657zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        yu0.ppxfxbqfkf ppxfxbqfkfVar = (yu0.ppxfxbqfkf) objPpxfxbqfkf;
        yu0.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = ppxfxbqfkfVar instanceof yu0.ppxfxbqfkf.iobyxmoadg ? (yu0.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar : null;
        return (iobyxmoadgVar2 == null || (iobyxmoadgVarWkgbmnqykc = zoijcleaowVar.wkgbmnqykc(iobyxmoadgVar2)) == null) ? ppxfxbqfkfVar : iobyxmoadgVarWkgbmnqykc;
    }
}
