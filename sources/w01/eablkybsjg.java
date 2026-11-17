package w01;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gtknphoqwx f118324eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k01.dxjokdxxww f118325ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final w01.ppxfxbqfkf f118326wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.nufgyqmvbu f118327zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118328iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f118329zoijcleaow;

        public iobyxmoadg(String orderId, List products) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(products, "products");
            this.f118328iobyxmoadg = orderId;
            this.f118329zoijcleaow = products;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f118328iobyxmoadg, iobyxmoadgVar.f118328iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118329zoijcleaow, iobyxmoadgVar.f118329zoijcleaow);
        }

        public int hashCode() {
            return (this.f118328iobyxmoadg.hashCode() * 31) + this.f118329zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118328iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f118328iobyxmoadg + ", products=" + this.f118329zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f118329zoijcleaow;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f118331esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f118332iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f118333jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118334yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118335zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118332iwizpuwonk = obj;
            this.f118331esjtqupxsv |= Integer.MIN_VALUE;
            return eablkybsjg.this.iobyxmoadg(null, this);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f118336iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f118337ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f118338zoijcleaow;

        public zoijcleaow(List warnings, List productSourceDaList, List limitedProductsIds) {
            zdlpuopuiu.btonecajqb(warnings, "warnings");
            zdlpuopuiu.btonecajqb(productSourceDaList, "productSourceDaList");
            zdlpuopuiu.btonecajqb(limitedProductsIds, "limitedProductsIds");
            this.f118336iobyxmoadg = warnings;
            this.f118338zoijcleaow = productSourceDaList;
            this.f118337ppxfxbqfkf = limitedProductsIds;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f118336iobyxmoadg, zoijcleaowVar.f118336iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118338zoijcleaow, zoijcleaowVar.f118338zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f118337ppxfxbqfkf, zoijcleaowVar.f118337ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f118336iobyxmoadg.hashCode() * 31) + this.f118338zoijcleaow.hashCode()) * 31) + this.f118337ppxfxbqfkf.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f118337ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f118336iobyxmoadg;
        }

        public String toString() {
            return "Result(warnings=" + this.f118336iobyxmoadg + ", productSourceDaList=" + this.f118338zoijcleaow + ", limitedProductsIds=" + this.f118337ppxfxbqfkf + ")";
        }

        public final List zoijcleaow() {
            return this.f118338zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(k01.nufgyqmvbu orderLocalSource, k01.dxjokdxxww orderRemoteSource, w01.ppxfxbqfkf changeOrderCompoundStateUseCase, gtknphoqwx getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(changeOrderCompoundStateUseCase, "changeOrderCompoundStateUseCase");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118327zoijcleaow = orderLocalSource;
        this.f118325ppxfxbqfkf = orderRemoteSource;
        this.f118326wkgbmnqykc = changeOrderCompoundStateUseCase;
        this.f118324eablkybsjg = getEditOrderUseCase;
    }

    private final List wkgbmnqykc(List list, List list2) {
        Object next;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(((uz0.eablkybsjg) it.next()).nufgyqmvbu());
        }
        ArrayList arrayList4 = new ArrayList(jyumaefscl.cqumvgiudr(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((uz0.eablkybsjg) it2.next()).nufgyqmvbu());
        }
        Set setTbqsvytpvh = jyumaefscl.tbqsvytpvh(arrayList3, jyumaefscl.r(arrayList4));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            uz0.eablkybsjg eablkybsjgVar = (uz0.eablkybsjg) it3.next();
            (setTbqsvytpvh.contains(eablkybsjgVar.nufgyqmvbu()) ? arrayList2 : arrayList).add(dz0.zoijcleaow.f30062rgvfuqvkyq.iobyxmoadg(eablkybsjgVar));
        }
        List listWkgbmnqykc = jyumaefscl.wkgbmnqykc(list.size() + list2.size());
        ArrayList arrayList5 = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            uz0.eablkybsjg eablkybsjgVar2 = (uz0.eablkybsjg) it4.next();
            Iterator it5 = arrayList2.iterator();
            do {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
            } while (!zdlpuopuiu.eablkybsjg(((uz0.eablkybsjg) next).nufgyqmvbu(), eablkybsjgVar2.nufgyqmvbu()));
            uz0.eablkybsjg eablkybsjgVar3 = (uz0.eablkybsjg) next;
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
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar2;
        eablkybsjg eablkybsjgVar;
        eablkybsjg eablkybsjgVar2;
        uz0.iobyxmoadg iobyxmoadgVar3;
        tz0.iobyxmoadg iobyxmoadgVar4;
        List listWkgbmnqykc;
        uz0.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        k01.nufgyqmvbu nufgyqmvbuVar;
        List list;
        eablkybsjg eablkybsjgVar3;
        ArrayList arrayList;
        Iterator it;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f118331esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f118331esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f118332iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f118331esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (iobyxmoadg) ppxfxbqfkfVar.f118334yggfygwlhe;
                eablkybsjgVar = (eablkybsjg) ppxfxbqfkfVar.f118335zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else if (i14 == 2) {
                uz0.iobyxmoadg iobyxmoadgVar5 = (uz0.iobyxmoadg) ppxfxbqfkfVar.f118334yggfygwlhe;
                eablkybsjgVar2 = (eablkybsjg) ppxfxbqfkfVar.f118335zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar3 = iobyxmoadgVar5;
                iobyxmoadgVar4 = (tz0.iobyxmoadg) objZoijcleaow;
                listWkgbmnqykc = eablkybsjgVar2.wkgbmnqykc(iobyxmoadgVar3.ppxfxbqfkf(), iobyxmoadgVar4.zoijcleaow());
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar3.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar3.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar3.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar3.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar3.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar3.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar3.f114831lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar3.f114832nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar3.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar3.f114824btonecajqb : null, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar3.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar3.f114825draadjrbmk : listWkgbmnqykc, (131007 & 4096) != 0 ? iobyxmoadgVar3.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar3.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar3.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar3.f114835rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar3.f114836vdvldrhtss : null);
                nufgyqmvbuVar = eablkybsjgVar2.f118327zoijcleaow;
                ppxfxbqfkfVar.f118335zdlpuopuiu = eablkybsjgVar2;
                ppxfxbqfkfVar.f118334yggfygwlhe = iobyxmoadgVar4;
                ppxfxbqfkfVar.f118333jyumaefscl = listWkgbmnqykc;
                ppxfxbqfkfVar.f118331esjtqupxsv = 3;
                if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                list = listWkgbmnqykc;
                eablkybsjgVar3 = eablkybsjgVar2;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) ppxfxbqfkfVar.f118333jyumaefscl;
                iobyxmoadgVar4 = (tz0.iobyxmoadg) ppxfxbqfkfVar.f118334yggfygwlhe;
                eablkybsjgVar3 = (eablkybsjg) ppxfxbqfkfVar.f118335zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(lz0.zoijcleaow.zoijcleaow((uz0.eablkybsjg) it.next()));
            }
            eablkybsjgVar3.f118326wkgbmnqykc.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
            return new zoijcleaow(iobyxmoadgVar4.ppxfxbqfkf(), arrayList, iobyxmoadgVar4.iobyxmoadg());
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        gtknphoqwx gtknphoqwxVar = this.f118324eablkybsjg;
        gtknphoqwx.iobyxmoadg iobyxmoadgVar6 = new gtknphoqwx.iobyxmoadg(iobyxmoadgVar.iobyxmoadg());
        ppxfxbqfkfVar.f118335zdlpuopuiu = this;
        ppxfxbqfkfVar.f118334yggfygwlhe = iobyxmoadgVar;
        ppxfxbqfkfVar.f118331esjtqupxsv = 1;
        objZoijcleaow = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar6, ppxfxbqfkfVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2 = iobyxmoadgVar;
        eablkybsjgVar = this;
        uz0.iobyxmoadg iobyxmoadgVar7 = (uz0.iobyxmoadg) objZoijcleaow;
        k01.dxjokdxxww dxjokdxxwwVar = eablkybsjgVar.f118325ppxfxbqfkf;
        String strIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
        List listZoijcleaow = iobyxmoadgVar2.zoijcleaow();
        ppxfxbqfkfVar.f118335zdlpuopuiu = eablkybsjgVar;
        ppxfxbqfkfVar.f118334yggfygwlhe = iobyxmoadgVar7;
        ppxfxbqfkfVar.f118331esjtqupxsv = 2;
        Object objPpxfxbqfkf = dxjokdxxwwVar.ppxfxbqfkf(strIobyxmoadg, listZoijcleaow, ppxfxbqfkfVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        eablkybsjgVar2 = eablkybsjgVar;
        iobyxmoadgVar3 = iobyxmoadgVar7;
        objZoijcleaow = objPpxfxbqfkf;
        iobyxmoadgVar4 = (tz0.iobyxmoadg) objZoijcleaow;
        listWkgbmnqykc = eablkybsjgVar2.wkgbmnqykc(iobyxmoadgVar3.ppxfxbqfkf(), iobyxmoadgVar4.zoijcleaow());
        iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar3.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar3.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar3.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar3.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar3.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar3.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar3.f114831lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar3.f114832nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar3.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar3.f114824btonecajqb : null, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar3.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar3.f114825draadjrbmk : listWkgbmnqykc, (131007 & 4096) != 0 ? iobyxmoadgVar3.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar3.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar3.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar3.f114835rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar3.f114836vdvldrhtss : null);
        nufgyqmvbuVar = eablkybsjgVar2.f118327zoijcleaow;
        ppxfxbqfkfVar.f118335zdlpuopuiu = eablkybsjgVar2;
        ppxfxbqfkfVar.f118334yggfygwlhe = iobyxmoadgVar4;
        ppxfxbqfkfVar.f118333jyumaefscl = listWkgbmnqykc;
        ppxfxbqfkfVar.f118331esjtqupxsv = 3;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        list = listWkgbmnqykc;
        eablkybsjgVar3 = eablkybsjgVar2;
        arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(lz0.zoijcleaow.zoijcleaow((uz0.eablkybsjg) it.next()));
        }
        eablkybsjgVar3.f118326wkgbmnqykc.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
        return new zoijcleaow(iobyxmoadgVar4.ppxfxbqfkf(), arrayList, iobyxmoadgVar4.iobyxmoadg());
    }
}
