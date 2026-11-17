package dg0;

import gg.wwaezpbzkn;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final C0566iobyxmoadg f28102lqeggnwhkg = new C0566iobyxmoadg(null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final int f28103nufgyqmvbu = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f28104eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final z10.iobyxmoadg f28105gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final v10.zoijcleaow f28106ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final p00.iobyxmoadg.InterfaceC1646iobyxmoadg f28107wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final of0.ppxfxbqfkf f28108zoijcleaow;

    /* JADX INFO: renamed from: dg0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0566iobyxmoadg {
        public /* synthetic */ C0566iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0566iobyxmoadg() {
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f28109cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f28111iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f28112jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f28113lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f28114yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f28115zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f28109cqumvgiudr = obj;
            this.f28113lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(of0.ppxfxbqfkf mySparDialogsRepository, v10.zoijcleaow sharedPreferencesRepository, p00.iobyxmoadg.InterfaceC1646iobyxmoadg semiVersionBuilder, ca2.ppxfxbqfkf userRepository, z10.iobyxmoadg getCurrentDeliveryDataUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(mySparDialogsRepository, "mySparDialogsRepository");
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(semiVersionBuilder, "semiVersionBuilder");
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f28108zoijcleaow = mySparDialogsRepository;
        this.f28106ppxfxbqfkf = sharedPreferencesRepository;
        this.f28107wkgbmnqykc = semiVersionBuilder;
        this.f28104eablkybsjg = userRepository;
        this.f28105gxszxtbevo = getCurrentDeliveryDataUseCase;
    }

    private final List eablkybsjg(List list) {
        LocalDate localDateSopmlzcsov = this.f28106ppxfxbqfkf.sopmlzcsov();
        if (localDateSopmlzcsov == null || LocalDate.now().compareTo((ChronoLocalDate) localDateSopmlzcsov) >= 0) {
            this.f28106ppxfxbqfkf.ribwqtqdhb(LocalDate.now().plusDays(1L));
            this.f28106ppxfxbqfkf.ylkuphrtab(ikoacuggdj.eablkybsjg());
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((pf0.iobyxmoadg) it.next()).iobyxmoadg().btonecajqb());
        }
        Set setQ = jyumaefscl.q(jyumaefscl.e(arrayList, this.f28106ppxfxbqfkf.stevsuqkhv()));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (setQ.contains(((pf0.iobyxmoadg) obj).iobyxmoadg().btonecajqb())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final pf0.iobyxmoadg gxszxtbevo(List list) {
        Object next;
        p00.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((pf0.iobyxmoadg) next).zoijcleaow() != pf0.zoijcleaow.APP_UPDATE_TYPE);
        pf0.iobyxmoadg iobyxmoadgVar = (pf0.iobyxmoadg) next;
        if (iobyxmoadgVar == null) {
            return null;
        }
        String strPpxfxbqfkf = this.f28106ppxfxbqfkf.ppxfxbqfkf();
        q00.iobyxmoadg iobyxmoadgVarZoijcleaow = iobyxmoadgVar.iobyxmoadg().zoijcleaow();
        if (iobyxmoadgVarZoijcleaow == null || (iobyxmoadgVarIobyxmoadg = iobyxmoadgVarZoijcleaow.zoijcleaow()) == null) {
            iobyxmoadgVarIobyxmoadg = p00.iobyxmoadg.f75338iobyxmoadg.iobyxmoadg();
        }
        if (iobyxmoadgVarIobyxmoadg.iobyxmoadg(this.f28107wkgbmnqykc.iobyxmoadg(strPpxfxbqfkf).build())) {
            return iobyxmoadgVar;
        }
        return null;
    }

    private final pf0.iobyxmoadg wkgbmnqykc(List list) {
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
        } while (((pf0.iobyxmoadg) next2).zoijcleaow() == pf0.zoijcleaow.APP_UPDATE_TYPE);
        pf0.iobyxmoadg iobyxmoadgVar = (pf0.iobyxmoadg) next2;
        if (iobyxmoadgVar == null) {
            return null;
        }
        if (iobyxmoadgVar.zoijcleaow() != pf0.zoijcleaow.TEXT_TYPE) {
            return iobyxmoadgVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((pf0.iobyxmoadg) obj).zoijcleaow() == pf0.zoijcleaow.TEXT_TYPE) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int iRgvfuqvkyq = ((pf0.iobyxmoadg) next).iobyxmoadg().rgvfuqvkyq();
                do {
                    Object next3 = it2.next();
                    int iRgvfuqvkyq2 = ((pf0.iobyxmoadg) next3).iobyxmoadg().rgvfuqvkyq();
                    if (iRgvfuqvkyq < iRgvfuqvkyq2) {
                        next = next3;
                        iRgvfuqvkyq = iRgvfuqvkyq2;
                    }
                } while (it2.hasNext());
            }
        }
        return (pf0.iobyxmoadg) next;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        User user;
        of0.ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar2;
        List listWflxmlrfwp;
        iobyxmoadg iobyxmoadgVar3;
        iobyxmoadg iobyxmoadgVar4;
        List listEablkybsjg;
        pf0.iobyxmoadg iobyxmoadgVarGxszxtbevo;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f28113lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f28113lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = zoijcleaowVar.f28109cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f28113lereixgezr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f28115zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            } else if (i14 == 2) {
                of0.ppxfxbqfkf ppxfxbqfkfVar2 = (of0.ppxfxbqfkf) zoijcleaowVar.f28111iwizpuwonk;
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f28112jyumaefscl;
                User user2 = (User) zoijcleaowVar.f28114yggfygwlhe;
                iobyxmoadg iobyxmoadgVar5 = (iobyxmoadg) zoijcleaowVar.f28115zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                ppxfxbqfkfVar = ppxfxbqfkfVar2;
                iobyxmoadgVar = iobyxmoadgVar5;
                user = user2;
                String strWkgbmnqykc = ((y00.iobyxmoadg) objLqeggnwhkg).wkgbmnqykc();
                if (user != null) {
                    listWflxmlrfwp = user.getSegments();
                } else {
                    listWflxmlrfwp = null;
                }
                if (listWflxmlrfwp == null) {
                    listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
                }
                zoijcleaowVar.f28115zdlpuopuiu = iobyxmoadgVar;
                zoijcleaowVar.f28114yggfygwlhe = iobyxmoadgVar2;
                zoijcleaowVar.f28112jyumaefscl = null;
                zoijcleaowVar.f28111iwizpuwonk = null;
                zoijcleaowVar.f28113lereixgezr = 3;
                objLqeggnwhkg = ppxfxbqfkfVar.gxszxtbevo(strWkgbmnqykc, listWflxmlrfwp, zoijcleaowVar);
                if (objLqeggnwhkg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar3 = iobyxmoadgVar;
                iobyxmoadgVar4 = iobyxmoadgVar2;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar4 = (iobyxmoadg) zoijcleaowVar.f28114yggfygwlhe;
                iobyxmoadgVar3 = (iobyxmoadg) zoijcleaowVar.f28115zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            }
            listEablkybsjg = iobyxmoadgVar4.eablkybsjg((List) objLqeggnwhkg);
            iobyxmoadgVarGxszxtbevo = iobyxmoadgVar3.gxszxtbevo(listEablkybsjg);
            if (iobyxmoadgVarGxszxtbevo == null) {
                return iobyxmoadgVar3.wkgbmnqykc(listEablkybsjg);
            }
            return iobyxmoadgVarGxszxtbevo;
        }
        gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        ca2.ppxfxbqfkf ppxfxbqfkfVar3 = this.f28104eablkybsjg;
        zoijcleaowVar.f28115zdlpuopuiu = this;
        zoijcleaowVar.f28113lereixgezr = 1;
        objLqeggnwhkg = ppxfxbqfkfVar3.lqeggnwhkg(zoijcleaowVar);
        if (objLqeggnwhkg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        User user3 = (User) objLqeggnwhkg;
        of0.ppxfxbqfkf ppxfxbqfkfVar4 = iobyxmoadgVar.f28108zoijcleaow;
        z10.iobyxmoadg iobyxmoadgVar6 = iobyxmoadgVar.f28105gxszxtbevo;
        wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
        zoijcleaowVar.f28115zdlpuopuiu = iobyxmoadgVar;
        zoijcleaowVar.f28114yggfygwlhe = user3;
        zoijcleaowVar.f28112jyumaefscl = iobyxmoadgVar;
        zoijcleaowVar.f28111iwizpuwonk = ppxfxbqfkfVar4;
        zoijcleaowVar.f28113lereixgezr = 2;
        Object objZoijcleaow = iobyxmoadgVar6.zoijcleaow(wwaezpbzknVar2, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        user = user3;
        ppxfxbqfkfVar = ppxfxbqfkfVar4;
        objLqeggnwhkg = objZoijcleaow;
        iobyxmoadgVar2 = iobyxmoadgVar;
        String strWkgbmnqykc2 = ((y00.iobyxmoadg) objLqeggnwhkg).wkgbmnqykc();
        if (user != null) {
            listWflxmlrfwp = user.getSegments();
        } else {
            listWflxmlrfwp = null;
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        zoijcleaowVar.f28115zdlpuopuiu = iobyxmoadgVar;
        zoijcleaowVar.f28114yggfygwlhe = iobyxmoadgVar2;
        zoijcleaowVar.f28112jyumaefscl = null;
        zoijcleaowVar.f28111iwizpuwonk = null;
        zoijcleaowVar.f28113lereixgezr = 3;
        objLqeggnwhkg = ppxfxbqfkfVar.gxszxtbevo(strWkgbmnqykc2, listWflxmlrfwp, zoijcleaowVar);
        if (objLqeggnwhkg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar3 = iobyxmoadgVar;
        iobyxmoadgVar4 = iobyxmoadgVar2;
        listEablkybsjg = iobyxmoadgVar4.eablkybsjg((List) objLqeggnwhkg);
        iobyxmoadgVarGxszxtbevo = iobyxmoadgVar3.gxszxtbevo(listEablkybsjg);
        if (iobyxmoadgVarGxszxtbevo == null) {
            return iobyxmoadgVar3.wkgbmnqykc(listEablkybsjg);
        }
        return iobyxmoadgVarGxszxtbevo;
    }
}
