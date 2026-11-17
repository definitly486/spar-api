package o20;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final btonecajqb f71609eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w10.dxjokdxxww f71610ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final o20.ppxfxbqfkf f71611wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.nufgyqmvbu f71612zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f71613iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f71614zoijcleaow;

        public iobyxmoadg(String orderId, List products) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(products, "products");
            this.f71613iobyxmoadg = orderId;
            this.f71614zoijcleaow = products;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f71613iobyxmoadg, iobyxmoadgVar.f71613iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71614zoijcleaow, iobyxmoadgVar.f71614zoijcleaow);
        }

        public int hashCode() {
            return (this.f71613iobyxmoadg.hashCode() * 31) + this.f71614zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f71613iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f71613iobyxmoadg + ", products=" + this.f71614zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f71614zoijcleaow;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f71616esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f71617iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f71618jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71619yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71620zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71617iwizpuwonk = obj;
            this.f71616esjtqupxsv |= Integer.MIN_VALUE;
            return eablkybsjg.this.iobyxmoadg(null, this);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f71621iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f71622ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f71623zoijcleaow;

        public zoijcleaow(List warnings, List productSourceDaList, List limitedProductsIds) {
            zdlpuopuiu.btonecajqb(warnings, "warnings");
            zdlpuopuiu.btonecajqb(productSourceDaList, "productSourceDaList");
            zdlpuopuiu.btonecajqb(limitedProductsIds, "limitedProductsIds");
            this.f71621iobyxmoadg = warnings;
            this.f71623zoijcleaow = productSourceDaList;
            this.f71622ppxfxbqfkf = limitedProductsIds;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f71621iobyxmoadg, zoijcleaowVar.f71621iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71623zoijcleaow, zoijcleaowVar.f71623zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f71622ppxfxbqfkf, zoijcleaowVar.f71622ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f71621iobyxmoadg.hashCode() * 31) + this.f71623zoijcleaow.hashCode()) * 31) + this.f71622ppxfxbqfkf.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f71622ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f71621iobyxmoadg;
        }

        public String toString() {
            return "Result(warnings=" + this.f71621iobyxmoadg + ", productSourceDaList=" + this.f71623zoijcleaow + ", limitedProductsIds=" + this.f71622ppxfxbqfkf + ")";
        }

        public final List zoijcleaow() {
            return this.f71623zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(w10.nufgyqmvbu orderLocalSource, w10.dxjokdxxww orderRemoteSource, o20.ppxfxbqfkf changeOrderCompoundStateUseCase, btonecajqb getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(changeOrderCompoundStateUseCase, "changeOrderCompoundStateUseCase");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f71612zoijcleaow = orderLocalSource;
        this.f71610ppxfxbqfkf = orderRemoteSource;
        this.f71611wkgbmnqykc = changeOrderCompoundStateUseCase;
        this.f71609eablkybsjg = getEditOrderUseCase;
    }

    private final List wkgbmnqykc(List list, List list2) {
        Object next;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(((e10.eablkybsjg) it.next()).nufgyqmvbu());
        }
        ArrayList arrayList4 = new ArrayList(jyumaefscl.cqumvgiudr(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((e10.eablkybsjg) it2.next()).nufgyqmvbu());
        }
        Set setTbqsvytpvh = jyumaefscl.tbqsvytpvh(arrayList3, jyumaefscl.r(arrayList4));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            e10.eablkybsjg eablkybsjgVar = (e10.eablkybsjg) it3.next();
            (setTbqsvytpvh.contains(eablkybsjgVar.nufgyqmvbu()) ? arrayList2 : arrayList).add(l00.zoijcleaow.f61309rgvfuqvkyq.iobyxmoadg(eablkybsjgVar));
        }
        List listWkgbmnqykc = jyumaefscl.wkgbmnqykc(list.size() + list2.size());
        ArrayList arrayList5 = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            e10.eablkybsjg eablkybsjgVar2 = (e10.eablkybsjg) it4.next();
            Iterator it5 = arrayList2.iterator();
            do {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
            } while (!zdlpuopuiu.eablkybsjg(((e10.eablkybsjg) next).nufgyqmvbu(), eablkybsjgVar2.nufgyqmvbu()));
            e10.eablkybsjg eablkybsjgVar3 = (e10.eablkybsjg) next;
            if (eablkybsjgVar3 != null) {
                eablkybsjgVar2 = eablkybsjgVar3;
            }
            arrayList5.add(eablkybsjgVar2);
        }
        listWkgbmnqykc.addAll(arrayList5);
        listWkgbmnqykc.addAll(arrayList);
        return jyumaefscl.iobyxmoadg(listWkgbmnqykc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:28:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f7 A[LOOP:0: B:31:0x00f1->B:33:0x00f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar2;
        eablkybsjg eablkybsjgVar;
        eablkybsjg eablkybsjgVar2;
        e10.iobyxmoadg iobyxmoadgVar3;
        d10.iobyxmoadg iobyxmoadgVar4;
        List listWkgbmnqykc;
        e10.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        w10.nufgyqmvbu nufgyqmvbuVar;
        List list;
        eablkybsjg eablkybsjgVar3;
        ArrayList arrayList;
        Iterator it;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f71616esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f71616esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f71617iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f71616esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (iobyxmoadg) ppxfxbqfkfVar.f71619yggfygwlhe;
                eablkybsjgVar = (eablkybsjg) ppxfxbqfkfVar.f71620zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else if (i14 == 2) {
                e10.iobyxmoadg iobyxmoadgVar5 = (e10.iobyxmoadg) ppxfxbqfkfVar.f71619yggfygwlhe;
                eablkybsjgVar2 = (eablkybsjg) ppxfxbqfkfVar.f71620zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar3 = iobyxmoadgVar5;
                iobyxmoadgVar4 = (d10.iobyxmoadg) objZoijcleaow;
                listWkgbmnqykc = eablkybsjgVar2.wkgbmnqykc(iobyxmoadgVar3.ppxfxbqfkf(), iobyxmoadgVar4.zoijcleaow());
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar3.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar3.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar3.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar3.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar3.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar3.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar3.f30181lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar3.f30182nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar3.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar3.f30174btonecajqb : null, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar3.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar3.f30175draadjrbmk : listWkgbmnqykc, (131007 & 4096) != 0 ? iobyxmoadgVar3.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar3.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar3.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar3.f30185rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar3.f30186vdvldrhtss : null);
                nufgyqmvbuVar = eablkybsjgVar2.f71612zoijcleaow;
                ppxfxbqfkfVar.f71620zdlpuopuiu = eablkybsjgVar2;
                ppxfxbqfkfVar.f71619yggfygwlhe = iobyxmoadgVar4;
                ppxfxbqfkfVar.f71618jyumaefscl = listWkgbmnqykc;
                ppxfxbqfkfVar.f71616esjtqupxsv = 3;
                if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                list = listWkgbmnqykc;
                eablkybsjgVar3 = eablkybsjgVar2;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) ppxfxbqfkfVar.f71618jyumaefscl;
                iobyxmoadgVar4 = (d10.iobyxmoadg) ppxfxbqfkfVar.f71619yggfygwlhe;
                eablkybsjgVar3 = (eablkybsjg) ppxfxbqfkfVar.f71620zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(u00.zoijcleaow.iobyxmoadg((e10.eablkybsjg) it.next()));
            }
            eablkybsjgVar3.f71611wkgbmnqykc.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
            return new zoijcleaow(iobyxmoadgVar4.ppxfxbqfkf(), arrayList, iobyxmoadgVar4.iobyxmoadg());
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        btonecajqb btonecajqbVar = this.f71609eablkybsjg;
        btonecajqb.iobyxmoadg iobyxmoadgVar6 = new btonecajqb.iobyxmoadg(iobyxmoadgVar.iobyxmoadg());
        ppxfxbqfkfVar.f71620zdlpuopuiu = this;
        ppxfxbqfkfVar.f71619yggfygwlhe = iobyxmoadgVar;
        ppxfxbqfkfVar.f71616esjtqupxsv = 1;
        objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar6, ppxfxbqfkfVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2 = iobyxmoadgVar;
        eablkybsjgVar = this;
        e10.iobyxmoadg iobyxmoadgVar7 = (e10.iobyxmoadg) objZoijcleaow;
        w10.dxjokdxxww dxjokdxxwwVar = eablkybsjgVar.f71610ppxfxbqfkf;
        String strIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
        List listZoijcleaow = iobyxmoadgVar2.zoijcleaow();
        ppxfxbqfkfVar.f71620zdlpuopuiu = eablkybsjgVar;
        ppxfxbqfkfVar.f71619yggfygwlhe = iobyxmoadgVar7;
        ppxfxbqfkfVar.f71616esjtqupxsv = 2;
        Object objPpxfxbqfkf = dxjokdxxwwVar.ppxfxbqfkf(strIobyxmoadg, listZoijcleaow, ppxfxbqfkfVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        eablkybsjgVar2 = eablkybsjgVar;
        iobyxmoadgVar3 = iobyxmoadgVar7;
        objZoijcleaow = objPpxfxbqfkf;
        iobyxmoadgVar4 = (d10.iobyxmoadg) objZoijcleaow;
        listWkgbmnqykc = eablkybsjgVar2.wkgbmnqykc(iobyxmoadgVar3.ppxfxbqfkf(), iobyxmoadgVar4.zoijcleaow());
        iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar3.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar3.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar3.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar3.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar3.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar3.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar3.f30181lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar3.f30182nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar3.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar3.f30174btonecajqb : null, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar3.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar3.f30175draadjrbmk : listWkgbmnqykc, (131007 & 4096) != 0 ? iobyxmoadgVar3.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar3.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar3.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar3.f30185rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar3.f30186vdvldrhtss : null);
        nufgyqmvbuVar = eablkybsjgVar2.f71612zoijcleaow;
        ppxfxbqfkfVar.f71620zdlpuopuiu = eablkybsjgVar2;
        ppxfxbqfkfVar.f71619yggfygwlhe = iobyxmoadgVar4;
        ppxfxbqfkfVar.f71618jyumaefscl = listWkgbmnqykc;
        ppxfxbqfkfVar.f71616esjtqupxsv = 3;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        list = listWkgbmnqykc;
        eablkybsjgVar3 = eablkybsjgVar2;
        arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(u00.zoijcleaow.iobyxmoadg((e10.eablkybsjg) it.next()));
        }
        eablkybsjgVar3.f71611wkgbmnqykc.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
        return new zoijcleaow(iobyxmoadgVar4.ppxfxbqfkf(), arrayList, iobyxmoadgVar4.iobyxmoadg());
    }
}
