package ih1;

import gg.wwaezpbzkn;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import hh1.eablkybsjg;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final m01.iobyxmoadg f44341eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final j01.zoijcleaow f44342ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final hz0.iobyxmoadg.InterfaceC0966iobyxmoadg f44343wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dh1.iobyxmoadg f44344zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f44346esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f44347iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f44348jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f44349yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f44350zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f44347iwizpuwonk = obj;
            this.f44346esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(dh1.iobyxmoadg popupRepository, j01.zoijcleaow sharedPreferencesRepository, hz0.iobyxmoadg.InterfaceC0966iobyxmoadg semiVersionBuilder, m01.iobyxmoadg getCurrentDeliveryDataUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(popupRepository, "popupRepository");
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(semiVersionBuilder, "semiVersionBuilder");
        zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f44344zoijcleaow = popupRepository;
        this.f44342ppxfxbqfkf = sharedPreferencesRepository;
        this.f44343wkgbmnqykc = semiVersionBuilder;
        this.f44341eablkybsjg = getCurrentDeliveryDataUseCase;
    }

    private final boolean dxjokdxxww(LocalDate localDate) {
        LocalTime localTimeNow = LocalTime.now(ZoneId.of("Europe/Moscow"));
        if (localDate == null || wkgbmnqykc().isAfter(localDate)) {
            zdlpuopuiu.lqeggnwhkg(localTimeNow);
            if (nufgyqmvbu(localTimeNow)) {
                return true;
            }
        }
        return false;
    }

    private final hh1.wkgbmnqykc eablkybsjg(List list) {
        Object next;
        Object next2;
        Iterator it = list.iterator();
        do {
            next = null;
            if (!it.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it.next();
        } while (((hh1.wkgbmnqykc) next2).zoijcleaow() == eablkybsjg.APP_UPDATE_TYPE);
        hh1.wkgbmnqykc wkgbmnqykcVar = (hh1.wkgbmnqykc) next2;
        if (wkgbmnqykcVar == null) {
            return null;
        }
        if (wkgbmnqykcVar.zoijcleaow() != eablkybsjg.TEXT_TYPE) {
            return wkgbmnqykcVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((hh1.wkgbmnqykc) obj).zoijcleaow() == eablkybsjg.TEXT_TYPE) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int iRgvfuqvkyq = ((hh1.wkgbmnqykc) next).iobyxmoadg().rgvfuqvkyq();
                do {
                    Object next3 = it2.next();
                    int iRgvfuqvkyq2 = ((hh1.wkgbmnqykc) next3).iobyxmoadg().rgvfuqvkyq();
                    if (iRgvfuqvkyq < iRgvfuqvkyq2) {
                        next = next3;
                        iRgvfuqvkyq = iRgvfuqvkyq2;
                    }
                } while (it2.hasNext());
            }
        }
        return (hh1.wkgbmnqykc) next;
    }

    private final List gxszxtbevo(List list) {
        if (dxjokdxxww(this.f44342ppxfxbqfkf.ntlheqmsrt())) {
            this.f44342ppxfxbqfkf.tzroggbefp(wkgbmnqykc());
            this.f44342ppxfxbqfkf.ylkuphrtab(ikoacuggdj.eablkybsjg());
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((hh1.wkgbmnqykc) it.next()).iobyxmoadg().btonecajqb());
        }
        Set setQ = jyumaefscl.q(jyumaefscl.e(arrayList, this.f44342ppxfxbqfkf.stevsuqkhv()));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (setQ.contains(((hh1.wkgbmnqykc) obj).iobyxmoadg().btonecajqb())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final hh1.wkgbmnqykc lqeggnwhkg(List list) {
        Object next;
        hz0.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((hh1.wkgbmnqykc) next).zoijcleaow() != eablkybsjg.APP_UPDATE_TYPE);
        hh1.wkgbmnqykc wkgbmnqykcVar = (hh1.wkgbmnqykc) next;
        if (wkgbmnqykcVar == null) {
            return null;
        }
        String strPpxfxbqfkf = this.f44342ppxfxbqfkf.ppxfxbqfkf();
        hh1.zoijcleaow zoijcleaowVarZoijcleaow = wkgbmnqykcVar.iobyxmoadg().zoijcleaow();
        if (zoijcleaowVarZoijcleaow == null || (iobyxmoadgVarIobyxmoadg = zoijcleaowVarZoijcleaow.zoijcleaow()) == null) {
            iobyxmoadgVarIobyxmoadg = hz0.iobyxmoadg.f41447iobyxmoadg.iobyxmoadg();
        }
        if (iobyxmoadgVarIobyxmoadg.iobyxmoadg(this.f44343wkgbmnqykc.iobyxmoadg(strPpxfxbqfkf).build())) {
            return wkgbmnqykcVar;
        }
        return null;
    }

    private final boolean nufgyqmvbu(LocalTime localTime) {
        return localTime.isAfter(LocalTime.of(6, 0));
    }

    private final LocalDate wkgbmnqykc() {
        return LocalDate.now();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        dh1.iobyxmoadg iobyxmoadgVar2;
        zoijcleaow zoijcleaowVar;
        zoijcleaow zoijcleaowVar2;
        zoijcleaow zoijcleaowVar3;
        zoijcleaow zoijcleaowVar4;
        List listGxszxtbevo;
        hh1.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f44346esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f44346esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f44347iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f44346esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (dh1.iobyxmoadg) iobyxmoadgVar.f44348jyumaefscl;
                zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f44349yggfygwlhe;
                zoijcleaowVar2 = (zoijcleaow) iobyxmoadgVar.f44350zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zoijcleaowVar3 = (zoijcleaow) iobyxmoadgVar.f44349yggfygwlhe;
                zoijcleaowVar4 = (zoijcleaow) iobyxmoadgVar.f44350zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            listGxszxtbevo = zoijcleaowVar3.gxszxtbevo((List) objZoijcleaow);
            wkgbmnqykcVarLqeggnwhkg = zoijcleaowVar4.lqeggnwhkg(listGxszxtbevo);
            if (wkgbmnqykcVarLqeggnwhkg == null) {
                return zoijcleaowVar4.eablkybsjg(listGxszxtbevo);
            }
            return wkgbmnqykcVarLqeggnwhkg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        iobyxmoadgVar2 = this.f44344zoijcleaow;
        m01.iobyxmoadg iobyxmoadgVar3 = this.f44341eablkybsjg;
        wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
        iobyxmoadgVar.f44350zdlpuopuiu = this;
        iobyxmoadgVar.f44349yggfygwlhe = this;
        iobyxmoadgVar.f44348jyumaefscl = iobyxmoadgVar2;
        iobyxmoadgVar.f44346esjtqupxsv = 1;
        objZoijcleaow = iobyxmoadgVar3.zoijcleaow(wwaezpbzknVar2, iobyxmoadgVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        zoijcleaowVar2 = zoijcleaowVar;
        String strWkgbmnqykc = ((pz0.iobyxmoadg) objZoijcleaow).wkgbmnqykc();
        iobyxmoadgVar.f44350zdlpuopuiu = zoijcleaowVar2;
        iobyxmoadgVar.f44349yggfygwlhe = zoijcleaowVar;
        iobyxmoadgVar.f44348jyumaefscl = null;
        iobyxmoadgVar.f44346esjtqupxsv = 2;
        objZoijcleaow = iobyxmoadgVar2.iobyxmoadg(strWkgbmnqykc, iobyxmoadgVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar3 = zoijcleaowVar;
        zoijcleaowVar4 = zoijcleaowVar2;
        listGxszxtbevo = zoijcleaowVar3.gxszxtbevo((List) objZoijcleaow);
        wkgbmnqykcVarLqeggnwhkg = zoijcleaowVar4.lqeggnwhkg(listGxszxtbevo);
        if (wkgbmnqykcVarLqeggnwhkg == null) {
            return zoijcleaowVar4.eablkybsjg(listGxszxtbevo);
        }
        return wkgbmnqykcVarLqeggnwhkg;
    }
}
