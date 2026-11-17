package al1;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.qr.domain.model.QrModel;
import ru.myspar.proloyalty.qr.domain.model.QrStatusAction;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zk1.iobyxmoadg f2174ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zk1.zoijcleaow f2175zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final QrModel.Dynamic f2176iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final xk1.iobyxmoadg f2177zoijcleaow;

        public iobyxmoadg(QrModel.Dynamic qrModel, xk1.iobyxmoadg status) {
            zdlpuopuiu.btonecajqb(qrModel, "qrModel");
            zdlpuopuiu.btonecajqb(status, "status");
            this.f2176iobyxmoadg = qrModel;
            this.f2177zoijcleaow = status;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f2176iobyxmoadg, iobyxmoadgVar.f2176iobyxmoadg) && this.f2177zoijcleaow == iobyxmoadgVar.f2177zoijcleaow;
        }

        public int hashCode() {
            return (this.f2176iobyxmoadg.hashCode() * 31) + this.f2177zoijcleaow.hashCode();
        }

        public final QrModel.Dynamic iobyxmoadg() {
            return this.f2176iobyxmoadg;
        }

        public String toString() {
            return "Params(qrModel=" + this.f2176iobyxmoadg + ", status=" + this.f2177zoijcleaow + ")";
        }

        public final xk1.iobyxmoadg zoijcleaow() {
            return this.f2177zoijcleaow;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f2178cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f2180iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f2181jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f2182lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f2183yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f2184zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f2178cqumvgiudr = obj;
            this.f2182lereixgezr |= Integer.MIN_VALUE;
            return gxszxtbevo.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(zk1.zoijcleaow qrsRepository, zk1.iobyxmoadg qrStatusesRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(qrsRepository, "qrsRepository");
        zdlpuopuiu.btonecajqb(qrStatusesRepository, "qrStatusesRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f2175zoijcleaow = qrsRepository;
        this.f2174ppxfxbqfkf = qrStatusesRepository;
    }

    private final boolean eablkybsjg(QrModel.Dynamic dynamic, xk1.iobyxmoadg iobyxmoadgVar) {
        return (dynamic.getStatus() == null && iobyxmoadgVar == xk1.iobyxmoadg.ACTIVATED) || (dynamic.getStatus() == xk1.iobyxmoadg.ACTIVATED && iobyxmoadgVar == xk1.iobyxmoadg.ARCHIVED);
    }

    private final Object ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objPpxfxbqfkf = this.f2174ppxfxbqfkf.ppxfxbqfkf(new QrStatusAction(iobyxmoadgVar.iobyxmoadg().getId(), iobyxmoadgVar.zoijcleaow()), gxszxtbevoVar);
        return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        gxszxtbevo gxszxtbevoVar2;
        iobyxmoadg iobyxmoadgVar2;
        QrModel qrModel;
        QrModel.Dynamic dynamic;
        gxszxtbevo gxszxtbevoVar3;
        iobyxmoadg iobyxmoadgVar3;
        QrModel qrModel2;
        iobyxmoadg iobyxmoadgVar4;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f2182lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f2182lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objEablkybsjg = zoijcleaowVar.f2178cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f2182lereixgezr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f2183yggfygwlhe;
                gxszxtbevoVar2 = (gxszxtbevo) zoijcleaowVar.f2184zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            } else if (i14 == 2) {
                QrModel.Dynamic dynamic2 = (QrModel.Dynamic) zoijcleaowVar.f2180iwizpuwonk;
                QrModel qrModel3 = (QrModel) zoijcleaowVar.f2181jyumaefscl;
                iobyxmoadgVar3 = (iobyxmoadg) zoijcleaowVar.f2183yggfygwlhe;
                gxszxtbevo gxszxtbevoVar4 = (gxszxtbevo) zoijcleaowVar.f2184zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
                dynamic = dynamic2;
                qrModel2 = qrModel3;
                gxszxtbevoVar3 = gxszxtbevoVar4;
                zoijcleaowVar.f2184zdlpuopuiu = gxszxtbevoVar3;
                zoijcleaowVar.f2183yggfygwlhe = iobyxmoadgVar3;
                zoijcleaowVar.f2181jyumaefscl = qrModel2;
                zoijcleaowVar.f2180iwizpuwonk = dynamic;
                zoijcleaowVar.f2182lereixgezr = 3;
                if (gxszxtbevoVar3.ppxfxbqfkf(iobyxmoadgVar3, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar4 = iobyxmoadgVar3;
                qrModel = qrModel2;
                iobyxmoadgVar2 = iobyxmoadgVar4;
                gxszxtbevoVar2 = gxszxtbevoVar3;
                if (qrModel != null) {
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zoijcleaowVar.f2184zdlpuopuiu = null;
                zoijcleaowVar.f2183yggfygwlhe = null;
                zoijcleaowVar.f2181jyumaefscl = null;
                zoijcleaowVar.f2180iwizpuwonk = null;
                zoijcleaowVar.f2182lereixgezr = 4;
                if (gxszxtbevoVar2.ppxfxbqfkf(iobyxmoadgVar2, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else if (i14 == 3) {
                qrModel2 = (QrModel) zoijcleaowVar.f2181jyumaefscl;
                iobyxmoadgVar4 = (iobyxmoadg) zoijcleaowVar.f2183yggfygwlhe;
                gxszxtbevoVar3 = (gxszxtbevo) zoijcleaowVar.f2184zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
                qrModel = qrModel2;
                iobyxmoadgVar2 = iobyxmoadgVar4;
                gxszxtbevoVar2 = gxszxtbevoVar3;
                if (qrModel != null) {
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zoijcleaowVar.f2184zdlpuopuiu = null;
                zoijcleaowVar.f2183yggfygwlhe = null;
                zoijcleaowVar.f2181jyumaefscl = null;
                zoijcleaowVar.f2180iwizpuwonk = null;
                zoijcleaowVar.f2182lereixgezr = 4;
                if (gxszxtbevoVar2.ppxfxbqfkf(iobyxmoadgVar2, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        zk1.zoijcleaow zoijcleaowVar2 = this.f2175zoijcleaow;
        String id2 = iobyxmoadgVar.iobyxmoadg().getId();
        zoijcleaowVar.f2184zdlpuopuiu = this;
        zoijcleaowVar.f2183yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f2182lereixgezr = 1;
        objEablkybsjg = zoijcleaowVar2.eablkybsjg(id2, zoijcleaowVar);
        if (objEablkybsjg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        gxszxtbevoVar2 = this;
        iobyxmoadgVar2 = iobyxmoadgVar;
        qrModel = (QrModel) objEablkybsjg;
        dynamic = qrModel instanceof QrModel.Dynamic ? (QrModel.Dynamic) qrModel : null;
        if (dynamic != null) {
            if (!gxszxtbevoVar2.eablkybsjg(dynamic, iobyxmoadgVar2.zoijcleaow())) {
                dynamic = null;
            }
            if (dynamic != null) {
                zk1.zoijcleaow zoijcleaowVar3 = gxszxtbevoVar2.f2175zoijcleaow;
                QrModel.Dynamic dynamicPpxfxbqfkf = QrModel.Dynamic.ppxfxbqfkf(dynamic, null, null, 0, iobyxmoadgVar2.zoijcleaow(), 7, null);
                zoijcleaowVar.f2184zdlpuopuiu = gxszxtbevoVar2;
                zoijcleaowVar.f2183yggfygwlhe = iobyxmoadgVar2;
                zoijcleaowVar.f2181jyumaefscl = qrModel;
                zoijcleaowVar.f2180iwizpuwonk = dynamic;
                zoijcleaowVar.f2182lereixgezr = 2;
                if (zoijcleaowVar3.lqeggnwhkg(dynamicPpxfxbqfkf, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                gxszxtbevoVar3 = gxszxtbevoVar2;
                iobyxmoadgVar3 = iobyxmoadgVar2;
                qrModel2 = qrModel;
                zoijcleaowVar.f2184zdlpuopuiu = gxszxtbevoVar3;
                zoijcleaowVar.f2183yggfygwlhe = iobyxmoadgVar3;
                zoijcleaowVar.f2181jyumaefscl = qrModel2;
                zoijcleaowVar.f2180iwizpuwonk = dynamic;
                zoijcleaowVar.f2182lereixgezr = 3;
                if (gxszxtbevoVar3.ppxfxbqfkf(iobyxmoadgVar3, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar4 = iobyxmoadgVar3;
                qrModel = qrModel2;
                iobyxmoadgVar2 = iobyxmoadgVar4;
                gxszxtbevoVar2 = gxszxtbevoVar3;
            }
        }
        if (qrModel != null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zoijcleaowVar.f2184zdlpuopuiu = null;
        zoijcleaowVar.f2183yggfygwlhe = null;
        zoijcleaowVar.f2181jyumaefscl = null;
        zoijcleaowVar.f2180iwizpuwonk = null;
        zoijcleaowVar.f2182lereixgezr = 4;
        if (gxszxtbevoVar2.ppxfxbqfkf(iobyxmoadgVar2, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
