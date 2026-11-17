package vt0;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.components.address.api.model.UserAddress;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final vt0.ppxfxbqfkf f118033ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ut0.iobyxmoadg f118034zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f118035iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f118037yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118038zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118037yggfygwlhe = obj;
            this.f118035iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.eablkybsjg(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f118039iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f118041yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118042zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118041yggfygwlhe = obj;
            this.f118039iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f118043cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f118045iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f118046jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f118047lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118048yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118049zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118043cqumvgiudr = obj;
            this.f118047lereixgezr |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.gxszxtbevo(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(ut0.iobyxmoadg addressRemoteSource, vt0.ppxfxbqfkf deleteAddressUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(addressRemoteSource, "addressRemoteSource");
        zdlpuopuiu.btonecajqb(deleteAddressUseCase, "deleteAddressUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118034zoijcleaow = addressRemoteSource;
        this.f118033ppxfxbqfkf = deleteAddressUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(UserAddress.Delivery delivery, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        Throwable th2;
        kr0.wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f118035iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f118035iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f118037yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f118035iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc wkgbmnqykcVar2 = kr0.wkgbmnqykc.f60450iobyxmoadg;
            try {
                vt0.ppxfxbqfkf.zoijcleaow zoijcleaowVar = new vt0.ppxfxbqfkf.zoijcleaow(delivery.getShopId(), vt0.ppxfxbqfkf.iobyxmoadg.DELIVERY);
                vt0.ppxfxbqfkf ppxfxbqfkfVar = this.f118033ppxfxbqfkf;
                iobyxmoadgVar.f118038zdlpuopuiu = wkgbmnqykcVar2;
                iobyxmoadgVar.f118035iwizpuwonk = 1;
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
            wkgbmnqykcVar = (kr0.wkgbmnqykc) iobyxmoadgVar.f118038zdlpuopuiu;
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
    public final Object gxszxtbevo(ru.myspar.proloyalty.components.address.api.model.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        List arrayList;
        wkgbmnqykc wkgbmnqykcVar;
        ru.myspar.proloyalty.components.address.api.model.iobyxmoadg iobyxmoadgVar2;
        Iterator it;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f118047lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f118047lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f118043cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f118047lereixgezr;
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
            it = (Iterator) zoijcleaowVar.f118045iwizpuwonk;
            arrayList = (List) zoijcleaowVar.f118046jyumaefscl;
            ru.myspar.proloyalty.components.address.api.model.iobyxmoadg iobyxmoadgVar3 = (ru.myspar.proloyalty.components.address.api.model.iobyxmoadg) zoijcleaowVar.f118048yggfygwlhe;
            wkgbmnqykcVar = (wkgbmnqykc) zoijcleaowVar.f118049zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar2 = iobyxmoadgVar3;
        }
        while (it.hasNext()) {
            UserAddress.Delivery delivery = (UserAddress.Delivery) it.next();
            zoijcleaowVar.f118049zdlpuopuiu = wkgbmnqykcVar;
            zoijcleaowVar.f118048yggfygwlhe = iobyxmoadgVar2;
            zoijcleaowVar.f118046jyumaefscl = arrayList;
            zoijcleaowVar.f118045iwizpuwonk = it;
            zoijcleaowVar.f118047lereixgezr = 1;
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
        return ru.myspar.proloyalty.components.address.api.model.iobyxmoadg.zoijcleaow(iobyxmoadgVar2, arrayList2, null, 2, null);
    }

    private final boolean nufgyqmvbu(UserAddress.Delivery delivery) {
        return delivery.getShortAddress().length() == 0 || delivery.getFullAddress().length() == 0 || (!delivery.getIsPrivateHouse() && delivery.getFlat().length() == 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f118039iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f118039iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f118041yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f118039iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                wkgbmnqykcVar = (wkgbmnqykc) ppxfxbqfkfVar.f118042zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            }
            return (ru.myspar.proloyalty.components.address.api.model.iobyxmoadg) objIobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        ut0.iobyxmoadg iobyxmoadgVar = this.f118034zoijcleaow;
        ppxfxbqfkfVar.f118042zdlpuopuiu = this;
        ppxfxbqfkfVar.f118039iwizpuwonk = 1;
        objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(ppxfxbqfkfVar);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        wkgbmnqykcVar = this;
        ppxfxbqfkfVar.f118042zdlpuopuiu = null;
        ppxfxbqfkfVar.f118039iwizpuwonk = 2;
        objIobyxmoadg = wkgbmnqykcVar.gxszxtbevo((ru.myspar.proloyalty.components.address.api.model.iobyxmoadg) objIobyxmoadg, ppxfxbqfkfVar);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return (ru.myspar.proloyalty.components.address.api.model.iobyxmoadg) objIobyxmoadg;
    }
}
