package al1;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.qr.domain.model.QrModel;
import ru.myspar.proloyalty.qr.domain.model.QrStatusAction;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zk1.iobyxmoadg f2191ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zk1.zoijcleaow f2192zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f2193cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f2195jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f2196yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f2197zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f2195jyumaefscl = obj;
            this.f2193cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(zk1.zoijcleaow qrsRepository, zk1.iobyxmoadg qrStatusesRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(qrsRepository, "qrsRepository");
        zdlpuopuiu.btonecajqb(qrStatusesRepository, "qrStatusesRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f2192zoijcleaow = qrsRepository;
        this.f2191ppxfxbqfkf = qrStatusesRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:51:0x0128 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0135 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        List arrayList;
        zk1.zoijcleaow zoijcleaowVar;
        zk1.zoijcleaow zoijcleaowVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f2193cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f2193cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f2195jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f2193cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f2197zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else if (i14 == 2) {
                List list = (List) iobyxmoadgVar.f2196yggfygwlhe;
                ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) iobyxmoadgVar.f2197zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                arrayList = list;
                ppxfxbqfkfVar = ppxfxbqfkfVar2;
                zoijcleaowVar = ppxfxbqfkfVar.f2192zoijcleaow;
                iobyxmoadgVar.f2197zdlpuopuiu = ppxfxbqfkfVar;
                iobyxmoadgVar.f2196yggfygwlhe = null;
                iobyxmoadgVar.f2193cqumvgiudr = 3;
                if (zoijcleaowVar.wkgbmnqykc(arrayList, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar2 = ppxfxbqfkfVar.f2192zoijcleaow;
                iobyxmoadgVar.f2197zdlpuopuiu = null;
                iobyxmoadgVar.f2193cqumvgiudr = 4;
                if (zoijcleaowVar2.gxszxtbevo(iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else if (i14 == 3) {
                ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f2197zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                zoijcleaowVar2 = ppxfxbqfkfVar.f2192zoijcleaow;
                iobyxmoadgVar.f2197zdlpuopuiu = null;
                iobyxmoadgVar.f2193cqumvgiudr = 4;
                if (zoijcleaowVar2.gxszxtbevo(iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        zk1.zoijcleaow zoijcleaowVar3 = this.f2192zoijcleaow;
        iobyxmoadgVar.f2197zdlpuopuiu = this;
        iobyxmoadgVar.f2193cqumvgiudr = 1;
        objZoijcleaow = zoijcleaowVar3.zoijcleaow(iobyxmoadgVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (Iterable) objZoijcleaow) {
            if (obj instanceof QrModel.Dynamic) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((QrModel.Dynamic) obj2).getStatus() == xk1.iobyxmoadg.ACTIVATED) {
                arrayList3.add(obj2);
            }
        }
        arrayList = new ArrayList(jyumaefscl.cqumvgiudr(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList.add(QrModel.Dynamic.ppxfxbqfkf((QrModel.Dynamic) it.next(), null, null, 0, xk1.iobyxmoadg.ARCHIVED, 7, null));
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList4 = new ArrayList(jyumaefscl.cqumvgiudr(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new QrStatusAction(((QrModel.Dynamic) it2.next()).getId(), xk1.iobyxmoadg.ARCHIVED));
            }
            zk1.iobyxmoadg iobyxmoadgVar2 = ppxfxbqfkfVar.f2191ppxfxbqfkf;
            iobyxmoadgVar.f2197zdlpuopuiu = ppxfxbqfkfVar;
            iobyxmoadgVar.f2196yggfygwlhe = arrayList;
            iobyxmoadgVar.f2193cqumvgiudr = 2;
            if (iobyxmoadgVar2.wkgbmnqykc(arrayList4, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = ppxfxbqfkfVar.f2192zoijcleaow;
            iobyxmoadgVar.f2197zdlpuopuiu = ppxfxbqfkfVar;
            iobyxmoadgVar.f2196yggfygwlhe = null;
            iobyxmoadgVar.f2193cqumvgiudr = 3;
            if (zoijcleaowVar.wkgbmnqykc(arrayList, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        zoijcleaowVar2 = ppxfxbqfkfVar.f2192zoijcleaow;
        iobyxmoadgVar.f2197zdlpuopuiu = null;
        iobyxmoadgVar.f2193cqumvgiudr = 4;
        if (zoijcleaowVar2.gxszxtbevo(iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
