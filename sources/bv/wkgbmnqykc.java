package bv;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.components.address.api.model.UserAddress;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final bv.ppxfxbqfkf f17140ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final av.iobyxmoadg f17141zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f17142iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f17144yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17145zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17144yggfygwlhe = obj;
            this.f17142iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.eablkybsjg(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f17146iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f17148yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17149zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17148yggfygwlhe = obj;
            this.f17146iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f17150cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f17152iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f17153jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f17154lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f17155yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17156zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17150cqumvgiudr = obj;
            this.f17154lereixgezr |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.gxszxtbevo(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(av.iobyxmoadg addressRemoteSource, bv.ppxfxbqfkf deleteAddressUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(addressRemoteSource, "addressRemoteSource");
        zdlpuopuiu.btonecajqb(deleteAddressUseCase, "deleteAddressUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f17141zoijcleaow = addressRemoteSource;
        this.f17140ppxfxbqfkf = deleteAddressUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(UserAddress.Delivery delivery, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        Throwable th2;
        rs.wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f17142iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f17142iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f17144yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f17142iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc wkgbmnqykcVar2 = rs.wkgbmnqykc.f83693iobyxmoadg;
            try {
                bv.ppxfxbqfkf.zoijcleaow zoijcleaowVar = new bv.ppxfxbqfkf.zoijcleaow(delivery.getShopId(), bv.ppxfxbqfkf.iobyxmoadg.DELIVERY);
                bv.ppxfxbqfkf ppxfxbqfkfVar = this.f17140ppxfxbqfkf;
                iobyxmoadgVar.f17145zdlpuopuiu = wkgbmnqykcVar2;
                iobyxmoadgVar.f17142iwizpuwonk = 1;
                if (ppxfxbqfkfVar.zoijcleaow(zoijcleaowVar, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } catch (Throwable th3) {
                th2 = th3;
                wkgbmnqykcVar = wkgbmnqykcVar2;
                wkgbmnqykcVar.gxszxtbevo(th2, new CrashlyticsKey[0]);
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wkgbmnqykcVar = (rs.wkgbmnqykc) iobyxmoadgVar.f17145zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th4) {
                th2 = th4;
                wkgbmnqykcVar.gxszxtbevo(th2, new CrashlyticsKey[0]);
            }
        }
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object gxszxtbevo(ru.myspar.components.address.api.model.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        List arrayList;
        wkgbmnqykc wkgbmnqykcVar;
        ru.myspar.components.address.api.model.iobyxmoadg iobyxmoadgVar2;
        Iterator it;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f17154lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f17154lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f17150cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f17154lereixgezr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            List listPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
            arrayList = new ArrayList();
            for (Object obj2 : listPpxfxbqfkf) {
                if (nufgyqmvbu((UserAddress.Delivery) obj2)) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList == null) {
                return iobyxmoadgVar;
            }
            wkgbmnqykcVar = this;
            iobyxmoadgVar2 = iobyxmoadgVar;
            it = arrayList.iterator();
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) zoijcleaowVar.f17152iwizpuwonk;
            arrayList = (List) zoijcleaowVar.f17153jyumaefscl;
            ru.myspar.components.address.api.model.iobyxmoadg iobyxmoadgVar3 = (ru.myspar.components.address.api.model.iobyxmoadg) zoijcleaowVar.f17155yggfygwlhe;
            wkgbmnqykcVar = (wkgbmnqykc) zoijcleaowVar.f17156zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar2 = iobyxmoadgVar3;
        }
        while (it.hasNext()) {
            UserAddress.Delivery delivery = (UserAddress.Delivery) it.next();
            zoijcleaowVar.f17156zdlpuopuiu = wkgbmnqykcVar;
            zoijcleaowVar.f17155yggfygwlhe = iobyxmoadgVar2;
            zoijcleaowVar.f17153jyumaefscl = arrayList;
            zoijcleaowVar.f17152iwizpuwonk = it;
            zoijcleaowVar.f17154lereixgezr = 1;
            if (wkgbmnqykcVar.eablkybsjg(delivery, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        List listPpxfxbqfkf2 = iobyxmoadgVar2.ppxfxbqfkf();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : listPpxfxbqfkf2) {
            if (!arrayList.contains((UserAddress.Delivery) obj3)) {
                arrayList2.add(obj3);
            }
        }
        return ru.myspar.components.address.api.model.iobyxmoadg.zoijcleaow(iobyxmoadgVar2, arrayList2, null, 2, null);
    }

    private final boolean nufgyqmvbu(UserAddress.Delivery delivery) {
        return delivery.getShortAddress().length() == 0 || delivery.getFullAddress().length() == 0 || (!delivery.getIsPrivateHouse() && delivery.getFlat().length() == 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f17146iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f17146iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f17148yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f17146iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                wkgbmnqykcVar = (wkgbmnqykc) ppxfxbqfkfVar.f17149zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            }
            return (ru.myspar.components.address.api.model.iobyxmoadg) objIobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        av.iobyxmoadg iobyxmoadgVar = this.f17141zoijcleaow;
        ppxfxbqfkfVar.f17149zdlpuopuiu = this;
        ppxfxbqfkfVar.f17146iwizpuwonk = 1;
        objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(ppxfxbqfkfVar);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        wkgbmnqykcVar = this;
        ppxfxbqfkfVar.f17149zdlpuopuiu = null;
        ppxfxbqfkfVar.f17146iwizpuwonk = 2;
        objIobyxmoadg = wkgbmnqykcVar.gxszxtbevo((ru.myspar.components.address.api.model.iobyxmoadg) objIobyxmoadg, ppxfxbqfkfVar);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return (ru.myspar.components.address.api.model.iobyxmoadg) objIobyxmoadg;
    }
}
