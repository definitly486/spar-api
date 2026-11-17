package j11;

import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;
import l01.wkgbmnqykc;
import lg.gxszxtbevo;
import ow1.esjtqupxsv;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.recommendations.Recommendation;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final t81.iobyxmoadg f50523eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final esjtqupxsv f50524ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ir0.iobyxmoadg f50525wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f50526zoijcleaow;

    /* JADX INFO: renamed from: j11.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1081iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f50527iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f50528ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Set f50529wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f50530zoijcleaow;

        public C1081iobyxmoadg(String str, DeliveryCode deliveryCode, List list, Set types) {
            zdlpuopuiu.btonecajqb(types, "types");
            this.f50527iobyxmoadg = str;
            this.f50530zoijcleaow = deliveryCode;
            this.f50528ppxfxbqfkf = list;
            this.f50529wkgbmnqykc = types;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1081iobyxmoadg)) {
                return false;
            }
            C1081iobyxmoadg c1081iobyxmoadg = (C1081iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f50527iobyxmoadg, c1081iobyxmoadg.f50527iobyxmoadg) && this.f50530zoijcleaow == c1081iobyxmoadg.f50530zoijcleaow && zdlpuopuiu.eablkybsjg(this.f50528ppxfxbqfkf, c1081iobyxmoadg.f50528ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f50529wkgbmnqykc, c1081iobyxmoadg.f50529wkgbmnqykc);
        }

        public int hashCode() {
            String str = this.f50527iobyxmoadg;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DeliveryCode deliveryCode = this.f50530zoijcleaow;
            int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
            List list = this.f50528ppxfxbqfkf;
            return ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.f50529wkgbmnqykc.hashCode();
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f50530zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f50527iobyxmoadg;
        }

        public String toString() {
            return "Params(shopId=" + this.f50527iobyxmoadg + ", deliveryType=" + this.f50530zoijcleaow + ", productIds=" + this.f50528ppxfxbqfkf + ", types=" + this.f50529wkgbmnqykc + ")";
        }

        public final Set wkgbmnqykc() {
            return this.f50529wkgbmnqykc;
        }

        public final List zoijcleaow() {
            return this.f50528ppxfxbqfkf;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f50531cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f50533iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f50534jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f50535lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f50536yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f50537zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50531cqumvgiudr = obj;
            this.f50535lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(wkgbmnqykc recommendationsRemoteSource, esjtqupxsv isAuthUseCase, ir0.iobyxmoadg deviceIdManager, t81.iobyxmoadg featureManager, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(recommendationsRemoteSource, "recommendationsRemoteSource");
        zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        zdlpuopuiu.btonecajqb(deviceIdManager, "deviceIdManager");
        zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f50526zoijcleaow = recommendationsRemoteSource;
        this.f50524ppxfxbqfkf = isAuthUseCase;
        this.f50525wkgbmnqykc = deviceIdManager;
        this.f50523eablkybsjg = featureManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:102:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:38:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    /* JADX WARN: Code duplicated, block: B:44:0x012b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0134  */
    /* JADX WARN: Code duplicated, block: B:50:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0157  */
    /* JADX WARN: Code duplicated, block: B:57:0x0175  */
    /* JADX WARN: Code duplicated, block: B:59:0x0178  */
    /* JADX WARN: Code duplicated, block: B:62:0x0187  */
    /* JADX WARN: Code duplicated, block: B:66:0x019e  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x01df  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x0206  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:92:0x0227  */
    /* JADX WARN: Code duplicated, block: B:94:0x023b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0244  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C1081iobyxmoadg c1081iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        Set setEablkybsjg;
        List listPpxfxbqfkf;
        Object objPpxfxbqfkf;
        iobyxmoadg iobyxmoadgVar2;
        List list;
        C1081iobyxmoadg c1081iobyxmoadg2;
        List list2;
        Set set;
        List listWflxmlrfwp;
        List listIobyxmoadg;
        Set setWkgbmnqykc;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        Recommendation recommendation;
        vdvldrhtss vdvldrhtssVarIobyxmoadg;
        d01.iobyxmoadg type;
        Object arrayList3;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f50535lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f50535lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        Object objPpxfxbqfkf2 = zoijcleaowVar2.f50531cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        switch (zoijcleaowVar2.f50535lereixgezr) {
            case 0:
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf2);
                if (c1081iobyxmoadg.wkgbmnqykc().isEmpty()) {
                    setEablkybsjg = ikoacuggdj.eablkybsjg();
                    iobyxmoadgVar = this;
                } else {
                    t81.iobyxmoadg iobyxmoadgVar3 = this.f50523eablkybsjg;
                    s81.iobyxmoadg iobyxmoadgVar4 = s81.iobyxmoadg.f105745ulzqkzuiru;
                    zoijcleaowVar2.f50537zdlpuopuiu = this;
                    zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg;
                    zoijcleaowVar2.f50535lereixgezr = 1;
                    objPpxfxbqfkf2 = iobyxmoadgVar3.ppxfxbqfkf(iobyxmoadgVar4, zoijcleaowVar2);
                    if (objPpxfxbqfkf2 == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    iobyxmoadgVar = this;
                    if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                        setEablkybsjg = c1081iobyxmoadg.wkgbmnqykc();
                    } else {
                        listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
                        t81.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar.f50523eablkybsjg;
                        s81.iobyxmoadg iobyxmoadgVar6 = s81.iobyxmoadg.f105742sopmlzcsov;
                        zoijcleaowVar2.f50537zdlpuopuiu = iobyxmoadgVar;
                        zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg;
                        zoijcleaowVar2.f50534jyumaefscl = listPpxfxbqfkf;
                        zoijcleaowVar2.f50533iwizpuwonk = listPpxfxbqfkf;
                        zoijcleaowVar2.f50535lereixgezr = 2;
                        objPpxfxbqfkf = iobyxmoadgVar5.ppxfxbqfkf(iobyxmoadgVar6, zoijcleaowVar2);
                        if (objPpxfxbqfkf == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        iobyxmoadgVar2 = iobyxmoadgVar;
                        list = listPpxfxbqfkf;
                        objPpxfxbqfkf2 = objPpxfxbqfkf;
                        c1081iobyxmoadg2 = c1081iobyxmoadg;
                        list2 = list;
                        if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                            list2.add(d01.iobyxmoadg.ANALOGUE);
                        }
                        t81.iobyxmoadg iobyxmoadgVar7 = iobyxmoadgVar2.f50523eablkybsjg;
                        s81.iobyxmoadg iobyxmoadgVar8 = s81.iobyxmoadg.f105731jlmebxxoox;
                        zoijcleaowVar2.f50537zdlpuopuiu = iobyxmoadgVar2;
                        zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg2;
                        zoijcleaowVar2.f50534jyumaefscl = list;
                        zoijcleaowVar2.f50533iwizpuwonk = list2;
                        zoijcleaowVar2.f50535lereixgezr = 3;
                        objPpxfxbqfkf2 = iobyxmoadgVar7.ppxfxbqfkf(iobyxmoadgVar8, zoijcleaowVar2);
                        if (objPpxfxbqfkf2 == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                            list2.add(d01.iobyxmoadg.POPULAR);
                        }
                        t81.iobyxmoadg iobyxmoadgVar9 = iobyxmoadgVar2.f50523eablkybsjg;
                        s81.iobyxmoadg iobyxmoadgVar10 = s81.iobyxmoadg.f105722crxdokpmqz;
                        zoijcleaowVar2.f50537zdlpuopuiu = iobyxmoadgVar2;
                        zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg2;
                        zoijcleaowVar2.f50534jyumaefscl = list;
                        zoijcleaowVar2.f50533iwizpuwonk = list2;
                        zoijcleaowVar2.f50535lereixgezr = 4;
                        objPpxfxbqfkf2 = iobyxmoadgVar9.ppxfxbqfkf(iobyxmoadgVar10, zoijcleaowVar2);
                        if (objPpxfxbqfkf2 == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                            list2.add(d01.iobyxmoadg.RELATED);
                        }
                        t81.iobyxmoadg iobyxmoadgVar11 = iobyxmoadgVar2.f50523eablkybsjg;
                        s81.iobyxmoadg iobyxmoadgVar12 = s81.iobyxmoadg.f105741ribwqtqdhb;
                        zoijcleaowVar2.f50537zdlpuopuiu = iobyxmoadgVar2;
                        zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg2;
                        zoijcleaowVar2.f50534jyumaefscl = list;
                        zoijcleaowVar2.f50533iwizpuwonk = list2;
                        zoijcleaowVar2.f50535lereixgezr = 5;
                        objPpxfxbqfkf2 = iobyxmoadgVar11.ppxfxbqfkf(iobyxmoadgVar12, zoijcleaowVar2);
                        if (objPpxfxbqfkf2 == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                            list2.add(d01.iobyxmoadg.PERSONAL_COMPOSITE);
                        }
                        listIobyxmoadg = jyumaefscl.iobyxmoadg(list);
                        setWkgbmnqykc = c1081iobyxmoadg2.wkgbmnqykc();
                        if (!((Boolean) iobyxmoadgVar2.f50524ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                            setWkgbmnqykc = null;
                        }
                        if (setWkgbmnqykc != null) {
                            arrayList = new ArrayList();
                            for (Object obj : listIobyxmoadg) {
                                if (setWkgbmnqykc.contains((d01.iobyxmoadg) obj)) {
                                    arrayList.add(obj);
                                }
                            }
                            setEablkybsjg = jyumaefscl.r(arrayList);
                        } else {
                            setEablkybsjg = null;
                        }
                        if (setEablkybsjg == null) {
                            setEablkybsjg = ikoacuggdj.eablkybsjg();
                        }
                        c1081iobyxmoadg = c1081iobyxmoadg2;
                        iobyxmoadgVar = iobyxmoadgVar2;
                    }
                }
                if (setEablkybsjg.isEmpty()) {
                    set = null;
                } else {
                    set = setEablkybsjg;
                }
                if (set != null) {
                    wkgbmnqykc wkgbmnqykcVar = iobyxmoadgVar.f50526zoijcleaow;
                    String strIobyxmoadg = iobyxmoadgVar.f50525wkgbmnqykc.iobyxmoadg();
                    String strPpxfxbqfkf = c1081iobyxmoadg.ppxfxbqfkf();
                    DeliveryCode deliveryCodeIobyxmoadg = c1081iobyxmoadg.iobyxmoadg();
                    List listZoijcleaow = c1081iobyxmoadg.zoijcleaow();
                    zoijcleaowVar2.f50537zdlpuopuiu = null;
                    zoijcleaowVar2.f50536yggfygwlhe = null;
                    zoijcleaowVar2.f50534jyumaefscl = null;
                    zoijcleaowVar2.f50533iwizpuwonk = null;
                    zoijcleaowVar2.f50535lereixgezr = 6;
                    objPpxfxbqfkf2 = wkgbmnqykcVar.iobyxmoadg(strIobyxmoadg, strPpxfxbqfkf, deliveryCodeIobyxmoadg, listZoijcleaow, set, zoijcleaowVar2);
                    if (objPpxfxbqfkf2 == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    listWflxmlrfwp = (List) objPpxfxbqfkf2;
                } else {
                    listWflxmlrfwp = null;
                }
                if (listWflxmlrfwp == null) {
                    listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
                }
                linkedHashMap = new LinkedHashMap();
                for (Object obj2 : listWflxmlrfwp) {
                    type = ((Recommendation) obj2).getType();
                    arrayList3 = linkedHashMap.get(type);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(type, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                arrayList2 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    recommendation = (Recommendation) jyumaefscl.weqkydbzbr((List) entry.getValue());
                    if (recommendation != null) {
                        vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(entry.getKey(), recommendation);
                    } else {
                        vdvldrhtssVarIobyxmoadg = null;
                    }
                    if (vdvldrhtssVarIobyxmoadg != null) {
                        arrayList2.add(vdvldrhtssVarIobyxmoadg);
                    }
                }
                return tzroggbefp.kcexrzcfyt(arrayList2);
            case 1:
                c1081iobyxmoadg = (C1081iobyxmoadg) zoijcleaowVar2.f50536yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar2.f50537zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf2);
                if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                    setEablkybsjg = c1081iobyxmoadg.wkgbmnqykc();
                } else {
                    listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
                    t81.iobyxmoadg iobyxmoadgVar13 = iobyxmoadgVar.f50523eablkybsjg;
                    s81.iobyxmoadg iobyxmoadgVar14 = s81.iobyxmoadg.f105742sopmlzcsov;
                    zoijcleaowVar2.f50537zdlpuopuiu = iobyxmoadgVar;
                    zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg;
                    zoijcleaowVar2.f50534jyumaefscl = listPpxfxbqfkf;
                    zoijcleaowVar2.f50533iwizpuwonk = listPpxfxbqfkf;
                    zoijcleaowVar2.f50535lereixgezr = 2;
                    objPpxfxbqfkf = iobyxmoadgVar13.ppxfxbqfkf(iobyxmoadgVar14, zoijcleaowVar2);
                    if (objPpxfxbqfkf == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    iobyxmoadgVar2 = iobyxmoadgVar;
                    list = listPpxfxbqfkf;
                    objPpxfxbqfkf2 = objPpxfxbqfkf;
                    c1081iobyxmoadg2 = c1081iobyxmoadg;
                    list2 = list;
                    if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                        list2.add(d01.iobyxmoadg.ANALOGUE);
                    }
                    t81.iobyxmoadg iobyxmoadgVar15 = iobyxmoadgVar2.f50523eablkybsjg;
                    s81.iobyxmoadg iobyxmoadgVar16 = s81.iobyxmoadg.f105731jlmebxxoox;
                    zoijcleaowVar2.f50537zdlpuopuiu = iobyxmoadgVar2;
                    zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg2;
                    zoijcleaowVar2.f50534jyumaefscl = list;
                    zoijcleaowVar2.f50533iwizpuwonk = list2;
                    zoijcleaowVar2.f50535lereixgezr = 3;
                    objPpxfxbqfkf2 = iobyxmoadgVar15.ppxfxbqfkf(iobyxmoadgVar16, zoijcleaowVar2);
                    if (objPpxfxbqfkf2 == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                        list2.add(d01.iobyxmoadg.POPULAR);
                    }
                    t81.iobyxmoadg iobyxmoadgVar17 = iobyxmoadgVar2.f50523eablkybsjg;
                    s81.iobyxmoadg iobyxmoadgVar18 = s81.iobyxmoadg.f105722crxdokpmqz;
                    zoijcleaowVar2.f50537zdlpuopuiu = iobyxmoadgVar2;
                    zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg2;
                    zoijcleaowVar2.f50534jyumaefscl = list;
                    zoijcleaowVar2.f50533iwizpuwonk = list2;
                    zoijcleaowVar2.f50535lereixgezr = 4;
                    objPpxfxbqfkf2 = iobyxmoadgVar17.ppxfxbqfkf(iobyxmoadgVar18, zoijcleaowVar2);
                    if (objPpxfxbqfkf2 == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                        list2.add(d01.iobyxmoadg.RELATED);
                    }
                    t81.iobyxmoadg iobyxmoadgVar19 = iobyxmoadgVar2.f50523eablkybsjg;
                    s81.iobyxmoadg iobyxmoadgVar110 = s81.iobyxmoadg.f105741ribwqtqdhb;
                    zoijcleaowVar2.f50537zdlpuopuiu = iobyxmoadgVar2;
                    zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg2;
                    zoijcleaowVar2.f50534jyumaefscl = list;
                    zoijcleaowVar2.f50533iwizpuwonk = list2;
                    zoijcleaowVar2.f50535lereixgezr = 5;
                    objPpxfxbqfkf2 = iobyxmoadgVar19.ppxfxbqfkf(iobyxmoadgVar110, zoijcleaowVar2);
                    if (objPpxfxbqfkf2 == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                        list2.add(d01.iobyxmoadg.PERSONAL_COMPOSITE);
                    }
                    listIobyxmoadg = jyumaefscl.iobyxmoadg(list);
                    setWkgbmnqykc = c1081iobyxmoadg2.wkgbmnqykc();
                    if (!((Boolean) iobyxmoadgVar2.f50524ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                        setWkgbmnqykc = null;
                    }
                    if (setWkgbmnqykc != null) {
                        arrayList = new ArrayList();
                        while (r10.hasNext()) {
                            if (setWkgbmnqykc.contains((d01.iobyxmoadg) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        setEablkybsjg = jyumaefscl.r(arrayList);
                    } else {
                        setEablkybsjg = null;
                    }
                    if (setEablkybsjg == null) {
                        setEablkybsjg = ikoacuggdj.eablkybsjg();
                    }
                    c1081iobyxmoadg = c1081iobyxmoadg2;
                    iobyxmoadgVar = iobyxmoadgVar2;
                }
                if (setEablkybsjg.isEmpty()) {
                    set = setEablkybsjg;
                } else {
                    set = null;
                }
                if (set != null) {
                    wkgbmnqykc wkgbmnqykcVar2 = iobyxmoadgVar.f50526zoijcleaow;
                    String strIobyxmoadg2 = iobyxmoadgVar.f50525wkgbmnqykc.iobyxmoadg();
                    String strPpxfxbqfkf2 = c1081iobyxmoadg.ppxfxbqfkf();
                    DeliveryCode deliveryCodeIobyxmoadg2 = c1081iobyxmoadg.iobyxmoadg();
                    List listZoijcleaow2 = c1081iobyxmoadg.zoijcleaow();
                    zoijcleaowVar2.f50537zdlpuopuiu = null;
                    zoijcleaowVar2.f50536yggfygwlhe = null;
                    zoijcleaowVar2.f50534jyumaefscl = null;
                    zoijcleaowVar2.f50533iwizpuwonk = null;
                    zoijcleaowVar2.f50535lereixgezr = 6;
                    objPpxfxbqfkf2 = wkgbmnqykcVar2.iobyxmoadg(strIobyxmoadg2, strPpxfxbqfkf2, deliveryCodeIobyxmoadg2, listZoijcleaow2, set, zoijcleaowVar2);
                    if (objPpxfxbqfkf2 == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    listWflxmlrfwp = (List) objPpxfxbqfkf2;
                } else {
                    listWflxmlrfwp = null;
                }
                if (listWflxmlrfwp == null) {
                    listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
                }
                linkedHashMap = new LinkedHashMap();
                while (r11.hasNext()) {
                    type = ((Recommendation) obj2).getType();
                    arrayList3 = linkedHashMap.get(type);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(type, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                arrayList2 = new ArrayList();
                while (r10.hasNext()) {
                    recommendation = (Recommendation) jyumaefscl.weqkydbzbr((List) entry.getValue());
                    if (recommendation != null) {
                        vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(entry.getKey(), recommendation);
                    } else {
                        vdvldrhtssVarIobyxmoadg = null;
                    }
                    if (vdvldrhtssVarIobyxmoadg != null) {
                        arrayList2.add(vdvldrhtssVarIobyxmoadg);
                    }
                }
                return tzroggbefp.kcexrzcfyt(arrayList2);
            case 2:
                list2 = (List) zoijcleaowVar2.f50533iwizpuwonk;
                list = (List) zoijcleaowVar2.f50534jyumaefscl;
                c1081iobyxmoadg2 = (C1081iobyxmoadg) zoijcleaowVar2.f50536yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar2.f50537zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf2);
                if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                    list2.add(d01.iobyxmoadg.ANALOGUE);
                }
                t81.iobyxmoadg iobyxmoadgVar111 = iobyxmoadgVar2.f50523eablkybsjg;
                s81.iobyxmoadg iobyxmoadgVar112 = s81.iobyxmoadg.f105731jlmebxxoox;
                zoijcleaowVar2.f50537zdlpuopuiu = iobyxmoadgVar2;
                zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg2;
                zoijcleaowVar2.f50534jyumaefscl = list;
                zoijcleaowVar2.f50533iwizpuwonk = list2;
                zoijcleaowVar2.f50535lereixgezr = 3;
                objPpxfxbqfkf2 = iobyxmoadgVar111.ppxfxbqfkf(iobyxmoadgVar112, zoijcleaowVar2);
                if (objPpxfxbqfkf2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                    list2.add(d01.iobyxmoadg.POPULAR);
                }
                t81.iobyxmoadg iobyxmoadgVar113 = iobyxmoadgVar2.f50523eablkybsjg;
                s81.iobyxmoadg iobyxmoadgVar114 = s81.iobyxmoadg.f105722crxdokpmqz;
                zoijcleaowVar2.f50537zdlpuopuiu = iobyxmoadgVar2;
                zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg2;
                zoijcleaowVar2.f50534jyumaefscl = list;
                zoijcleaowVar2.f50533iwizpuwonk = list2;
                zoijcleaowVar2.f50535lereixgezr = 4;
                objPpxfxbqfkf2 = iobyxmoadgVar113.ppxfxbqfkf(iobyxmoadgVar114, zoijcleaowVar2);
                if (objPpxfxbqfkf2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                    list2.add(d01.iobyxmoadg.RELATED);
                }
                t81.iobyxmoadg iobyxmoadgVar115 = iobyxmoadgVar2.f50523eablkybsjg;
                s81.iobyxmoadg iobyxmoadgVar116 = s81.iobyxmoadg.f105741ribwqtqdhb;
                zoijcleaowVar2.f50537zdlpuopuiu = iobyxmoadgVar2;
                zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg2;
                zoijcleaowVar2.f50534jyumaefscl = list;
                zoijcleaowVar2.f50533iwizpuwonk = list2;
                zoijcleaowVar2.f50535lereixgezr = 5;
                objPpxfxbqfkf2 = iobyxmoadgVar115.ppxfxbqfkf(iobyxmoadgVar116, zoijcleaowVar2);
                if (objPpxfxbqfkf2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                    list2.add(d01.iobyxmoadg.PERSONAL_COMPOSITE);
                }
                listIobyxmoadg = jyumaefscl.iobyxmoadg(list);
                setWkgbmnqykc = c1081iobyxmoadg2.wkgbmnqykc();
                if (!((Boolean) iobyxmoadgVar2.f50524ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                    setWkgbmnqykc = null;
                }
                if (setWkgbmnqykc != null) {
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        if (setWkgbmnqykc.contains((d01.iobyxmoadg) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    setEablkybsjg = jyumaefscl.r(arrayList);
                } else {
                    setEablkybsjg = null;
                }
                if (setEablkybsjg == null) {
                    setEablkybsjg = ikoacuggdj.eablkybsjg();
                }
                c1081iobyxmoadg = c1081iobyxmoadg2;
                iobyxmoadgVar = iobyxmoadgVar2;
                if (setEablkybsjg.isEmpty()) {
                    set = setEablkybsjg;
                } else {
                    set = null;
                }
                if (set != null) {
                    wkgbmnqykc wkgbmnqykcVar3 = iobyxmoadgVar.f50526zoijcleaow;
                    String strIobyxmoadg3 = iobyxmoadgVar.f50525wkgbmnqykc.iobyxmoadg();
                    String strPpxfxbqfkf3 = c1081iobyxmoadg.ppxfxbqfkf();
                    DeliveryCode deliveryCodeIobyxmoadg3 = c1081iobyxmoadg.iobyxmoadg();
                    List listZoijcleaow3 = c1081iobyxmoadg.zoijcleaow();
                    zoijcleaowVar2.f50537zdlpuopuiu = null;
                    zoijcleaowVar2.f50536yggfygwlhe = null;
                    zoijcleaowVar2.f50534jyumaefscl = null;
                    zoijcleaowVar2.f50533iwizpuwonk = null;
                    zoijcleaowVar2.f50535lereixgezr = 6;
                    objPpxfxbqfkf2 = wkgbmnqykcVar3.iobyxmoadg(strIobyxmoadg3, strPpxfxbqfkf3, deliveryCodeIobyxmoadg3, listZoijcleaow3, set, zoijcleaowVar2);
                    if (objPpxfxbqfkf2 == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    listWflxmlrfwp = (List) objPpxfxbqfkf2;
                } else {
                    listWflxmlrfwp = null;
                }
                if (listWflxmlrfwp == null) {
                    listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
                }
                linkedHashMap = new LinkedHashMap();
                while (r11.hasNext()) {
                    type = ((Recommendation) obj2).getType();
                    arrayList3 = linkedHashMap.get(type);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(type, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                arrayList2 = new ArrayList();
                while (r10.hasNext()) {
                    recommendation = (Recommendation) jyumaefscl.weqkydbzbr((List) entry.getValue());
                    if (recommendation != null) {
                        vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(entry.getKey(), recommendation);
                    } else {
                        vdvldrhtssVarIobyxmoadg = null;
                    }
                    if (vdvldrhtssVarIobyxmoadg != null) {
                        arrayList2.add(vdvldrhtssVarIobyxmoadg);
                    }
                }
                return tzroggbefp.kcexrzcfyt(arrayList2);
            case 3:
                list2 = (List) zoijcleaowVar2.f50533iwizpuwonk;
                list = (List) zoijcleaowVar2.f50534jyumaefscl;
                c1081iobyxmoadg2 = (C1081iobyxmoadg) zoijcleaowVar2.f50536yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar2.f50537zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf2);
                if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                    list2.add(d01.iobyxmoadg.POPULAR);
                }
                t81.iobyxmoadg iobyxmoadgVar117 = iobyxmoadgVar2.f50523eablkybsjg;
                s81.iobyxmoadg iobyxmoadgVar118 = s81.iobyxmoadg.f105722crxdokpmqz;
                zoijcleaowVar2.f50537zdlpuopuiu = iobyxmoadgVar2;
                zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg2;
                zoijcleaowVar2.f50534jyumaefscl = list;
                zoijcleaowVar2.f50533iwizpuwonk = list2;
                zoijcleaowVar2.f50535lereixgezr = 4;
                objPpxfxbqfkf2 = iobyxmoadgVar117.ppxfxbqfkf(iobyxmoadgVar118, zoijcleaowVar2);
                if (objPpxfxbqfkf2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                    list2.add(d01.iobyxmoadg.RELATED);
                }
                t81.iobyxmoadg iobyxmoadgVar119 = iobyxmoadgVar2.f50523eablkybsjg;
                s81.iobyxmoadg iobyxmoadgVar1110 = s81.iobyxmoadg.f105741ribwqtqdhb;
                zoijcleaowVar2.f50537zdlpuopuiu = iobyxmoadgVar2;
                zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg2;
                zoijcleaowVar2.f50534jyumaefscl = list;
                zoijcleaowVar2.f50533iwizpuwonk = list2;
                zoijcleaowVar2.f50535lereixgezr = 5;
                objPpxfxbqfkf2 = iobyxmoadgVar119.ppxfxbqfkf(iobyxmoadgVar1110, zoijcleaowVar2);
                if (objPpxfxbqfkf2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                    list2.add(d01.iobyxmoadg.PERSONAL_COMPOSITE);
                }
                listIobyxmoadg = jyumaefscl.iobyxmoadg(list);
                setWkgbmnqykc = c1081iobyxmoadg2.wkgbmnqykc();
                if (!((Boolean) iobyxmoadgVar2.f50524ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                    setWkgbmnqykc = null;
                }
                if (setWkgbmnqykc != null) {
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        if (setWkgbmnqykc.contains((d01.iobyxmoadg) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    setEablkybsjg = jyumaefscl.r(arrayList);
                } else {
                    setEablkybsjg = null;
                }
                if (setEablkybsjg == null) {
                    setEablkybsjg = ikoacuggdj.eablkybsjg();
                }
                c1081iobyxmoadg = c1081iobyxmoadg2;
                iobyxmoadgVar = iobyxmoadgVar2;
                if (setEablkybsjg.isEmpty()) {
                    set = setEablkybsjg;
                } else {
                    set = null;
                }
                if (set != null) {
                    wkgbmnqykc wkgbmnqykcVar4 = iobyxmoadgVar.f50526zoijcleaow;
                    String strIobyxmoadg4 = iobyxmoadgVar.f50525wkgbmnqykc.iobyxmoadg();
                    String strPpxfxbqfkf4 = c1081iobyxmoadg.ppxfxbqfkf();
                    DeliveryCode deliveryCodeIobyxmoadg4 = c1081iobyxmoadg.iobyxmoadg();
                    List listZoijcleaow4 = c1081iobyxmoadg.zoijcleaow();
                    zoijcleaowVar2.f50537zdlpuopuiu = null;
                    zoijcleaowVar2.f50536yggfygwlhe = null;
                    zoijcleaowVar2.f50534jyumaefscl = null;
                    zoijcleaowVar2.f50533iwizpuwonk = null;
                    zoijcleaowVar2.f50535lereixgezr = 6;
                    objPpxfxbqfkf2 = wkgbmnqykcVar4.iobyxmoadg(strIobyxmoadg4, strPpxfxbqfkf4, deliveryCodeIobyxmoadg4, listZoijcleaow4, set, zoijcleaowVar2);
                    if (objPpxfxbqfkf2 == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    listWflxmlrfwp = (List) objPpxfxbqfkf2;
                } else {
                    listWflxmlrfwp = null;
                }
                if (listWflxmlrfwp == null) {
                    listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
                }
                linkedHashMap = new LinkedHashMap();
                while (r11.hasNext()) {
                    type = ((Recommendation) obj2).getType();
                    arrayList3 = linkedHashMap.get(type);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(type, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                arrayList2 = new ArrayList();
                while (r10.hasNext()) {
                    recommendation = (Recommendation) jyumaefscl.weqkydbzbr((List) entry.getValue());
                    if (recommendation != null) {
                        vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(entry.getKey(), recommendation);
                    } else {
                        vdvldrhtssVarIobyxmoadg = null;
                    }
                    if (vdvldrhtssVarIobyxmoadg != null) {
                        arrayList2.add(vdvldrhtssVarIobyxmoadg);
                    }
                }
                return tzroggbefp.kcexrzcfyt(arrayList2);
            case 4:
                list2 = (List) zoijcleaowVar2.f50533iwizpuwonk;
                list = (List) zoijcleaowVar2.f50534jyumaefscl;
                c1081iobyxmoadg2 = (C1081iobyxmoadg) zoijcleaowVar2.f50536yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar2.f50537zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf2);
                if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                    list2.add(d01.iobyxmoadg.RELATED);
                }
                t81.iobyxmoadg iobyxmoadgVar1111 = iobyxmoadgVar2.f50523eablkybsjg;
                s81.iobyxmoadg iobyxmoadgVar1112 = s81.iobyxmoadg.f105741ribwqtqdhb;
                zoijcleaowVar2.f50537zdlpuopuiu = iobyxmoadgVar2;
                zoijcleaowVar2.f50536yggfygwlhe = c1081iobyxmoadg2;
                zoijcleaowVar2.f50534jyumaefscl = list;
                zoijcleaowVar2.f50533iwizpuwonk = list2;
                zoijcleaowVar2.f50535lereixgezr = 5;
                objPpxfxbqfkf2 = iobyxmoadgVar1111.ppxfxbqfkf(iobyxmoadgVar1112, zoijcleaowVar2);
                if (objPpxfxbqfkf2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                    list2.add(d01.iobyxmoadg.PERSONAL_COMPOSITE);
                }
                listIobyxmoadg = jyumaefscl.iobyxmoadg(list);
                setWkgbmnqykc = c1081iobyxmoadg2.wkgbmnqykc();
                if (!((Boolean) iobyxmoadgVar2.f50524ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                    setWkgbmnqykc = null;
                }
                if (setWkgbmnqykc != null) {
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        if (setWkgbmnqykc.contains((d01.iobyxmoadg) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    setEablkybsjg = jyumaefscl.r(arrayList);
                } else {
                    setEablkybsjg = null;
                }
                if (setEablkybsjg == null) {
                    setEablkybsjg = ikoacuggdj.eablkybsjg();
                }
                c1081iobyxmoadg = c1081iobyxmoadg2;
                iobyxmoadgVar = iobyxmoadgVar2;
                if (setEablkybsjg.isEmpty()) {
                    set = setEablkybsjg;
                } else {
                    set = null;
                }
                if (set != null) {
                    wkgbmnqykc wkgbmnqykcVar5 = iobyxmoadgVar.f50526zoijcleaow;
                    String strIobyxmoadg5 = iobyxmoadgVar.f50525wkgbmnqykc.iobyxmoadg();
                    String strPpxfxbqfkf5 = c1081iobyxmoadg.ppxfxbqfkf();
                    DeliveryCode deliveryCodeIobyxmoadg5 = c1081iobyxmoadg.iobyxmoadg();
                    List listZoijcleaow5 = c1081iobyxmoadg.zoijcleaow();
                    zoijcleaowVar2.f50537zdlpuopuiu = null;
                    zoijcleaowVar2.f50536yggfygwlhe = null;
                    zoijcleaowVar2.f50534jyumaefscl = null;
                    zoijcleaowVar2.f50533iwizpuwonk = null;
                    zoijcleaowVar2.f50535lereixgezr = 6;
                    objPpxfxbqfkf2 = wkgbmnqykcVar5.iobyxmoadg(strIobyxmoadg5, strPpxfxbqfkf5, deliveryCodeIobyxmoadg5, listZoijcleaow5, set, zoijcleaowVar2);
                    if (objPpxfxbqfkf2 == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    listWflxmlrfwp = (List) objPpxfxbqfkf2;
                } else {
                    listWflxmlrfwp = null;
                }
                if (listWflxmlrfwp == null) {
                    listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
                }
                linkedHashMap = new LinkedHashMap();
                while (r11.hasNext()) {
                    type = ((Recommendation) obj2).getType();
                    arrayList3 = linkedHashMap.get(type);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(type, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                arrayList2 = new ArrayList();
                while (r10.hasNext()) {
                    recommendation = (Recommendation) jyumaefscl.weqkydbzbr((List) entry.getValue());
                    if (recommendation != null) {
                        vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(entry.getKey(), recommendation);
                    } else {
                        vdvldrhtssVarIobyxmoadg = null;
                    }
                    if (vdvldrhtssVarIobyxmoadg != null) {
                        arrayList2.add(vdvldrhtssVarIobyxmoadg);
                    }
                }
                return tzroggbefp.kcexrzcfyt(arrayList2);
            case 5:
                list2 = (List) zoijcleaowVar2.f50533iwizpuwonk;
                list = (List) zoijcleaowVar2.f50534jyumaefscl;
                c1081iobyxmoadg2 = (C1081iobyxmoadg) zoijcleaowVar2.f50536yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar2.f50537zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf2);
                if (((Boolean) objPpxfxbqfkf2).booleanValue()) {
                    list2.add(d01.iobyxmoadg.PERSONAL_COMPOSITE);
                }
                listIobyxmoadg = jyumaefscl.iobyxmoadg(list);
                setWkgbmnqykc = c1081iobyxmoadg2.wkgbmnqykc();
                if (!((Boolean) iobyxmoadgVar2.f50524ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                    setWkgbmnqykc = null;
                }
                if (setWkgbmnqykc != null) {
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        if (setWkgbmnqykc.contains((d01.iobyxmoadg) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    setEablkybsjg = jyumaefscl.r(arrayList);
                } else {
                    setEablkybsjg = null;
                }
                if (setEablkybsjg == null) {
                    setEablkybsjg = ikoacuggdj.eablkybsjg();
                }
                c1081iobyxmoadg = c1081iobyxmoadg2;
                iobyxmoadgVar = iobyxmoadgVar2;
                if (setEablkybsjg.isEmpty()) {
                    set = setEablkybsjg;
                } else {
                    set = null;
                }
                if (set != null) {
                    wkgbmnqykc wkgbmnqykcVar6 = iobyxmoadgVar.f50526zoijcleaow;
                    String strIobyxmoadg6 = iobyxmoadgVar.f50525wkgbmnqykc.iobyxmoadg();
                    String strPpxfxbqfkf6 = c1081iobyxmoadg.ppxfxbqfkf();
                    DeliveryCode deliveryCodeIobyxmoadg6 = c1081iobyxmoadg.iobyxmoadg();
                    List listZoijcleaow6 = c1081iobyxmoadg.zoijcleaow();
                    zoijcleaowVar2.f50537zdlpuopuiu = null;
                    zoijcleaowVar2.f50536yggfygwlhe = null;
                    zoijcleaowVar2.f50534jyumaefscl = null;
                    zoijcleaowVar2.f50533iwizpuwonk = null;
                    zoijcleaowVar2.f50535lereixgezr = 6;
                    objPpxfxbqfkf2 = wkgbmnqykcVar6.iobyxmoadg(strIobyxmoadg6, strPpxfxbqfkf6, deliveryCodeIobyxmoadg6, listZoijcleaow6, set, zoijcleaowVar2);
                    if (objPpxfxbqfkf2 == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    listWflxmlrfwp = (List) objPpxfxbqfkf2;
                } else {
                    listWflxmlrfwp = null;
                }
                if (listWflxmlrfwp == null) {
                    listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
                }
                linkedHashMap = new LinkedHashMap();
                while (r11.hasNext()) {
                    type = ((Recommendation) obj2).getType();
                    arrayList3 = linkedHashMap.get(type);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(type, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                arrayList2 = new ArrayList();
                while (r10.hasNext()) {
                    recommendation = (Recommendation) jyumaefscl.weqkydbzbr((List) entry.getValue());
                    if (recommendation != null) {
                        vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(entry.getKey(), recommendation);
                    } else {
                        vdvldrhtssVarIobyxmoadg = null;
                    }
                    if (vdvldrhtssVarIobyxmoadg != null) {
                        arrayList2.add(vdvldrhtssVarIobyxmoadg);
                    }
                }
                return tzroggbefp.kcexrzcfyt(arrayList2);
            case 6:
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf2);
                listWflxmlrfwp = (List) objPpxfxbqfkf2;
                if (listWflxmlrfwp == null) {
                    listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
                }
                linkedHashMap = new LinkedHashMap();
                while (r11.hasNext()) {
                    type = ((Recommendation) obj2).getType();
                    arrayList3 = linkedHashMap.get(type);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(type, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                arrayList2 = new ArrayList();
                while (r10.hasNext()) {
                    recommendation = (Recommendation) jyumaefscl.weqkydbzbr((List) entry.getValue());
                    if (recommendation != null) {
                        vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(entry.getKey(), recommendation);
                    } else {
                        vdvldrhtssVarIobyxmoadg = null;
                    }
                    if (vdvldrhtssVarIobyxmoadg != null) {
                        arrayList2.add(vdvldrhtssVarIobyxmoadg);
                    }
                }
                return tzroggbefp.kcexrzcfyt(arrayList2);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
