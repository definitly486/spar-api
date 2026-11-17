package e30;

import ca2.wkgbmnqykc;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ma0.eablkybsjg;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.recommendations.Recommendation;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final na0.iobyxmoadg f30268eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final wkgbmnqykc f30269gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f30270ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ca2.iobyxmoadg f30271wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final x10.wkgbmnqykc f30272zoijcleaow;

    /* JADX INFO: renamed from: e30.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0635iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f30273iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f30274ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Set f30275wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f30276zoijcleaow;

        public C0635iobyxmoadg(String str, DeliveryCode deliveryCode, List list, Set types) {
            zdlpuopuiu.btonecajqb(types, "types");
            this.f30273iobyxmoadg = str;
            this.f30276zoijcleaow = deliveryCode;
            this.f30274ppxfxbqfkf = list;
            this.f30275wkgbmnqykc = types;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0635iobyxmoadg)) {
                return false;
            }
            C0635iobyxmoadg c0635iobyxmoadg = (C0635iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f30273iobyxmoadg, c0635iobyxmoadg.f30273iobyxmoadg) && this.f30276zoijcleaow == c0635iobyxmoadg.f30276zoijcleaow && zdlpuopuiu.eablkybsjg(this.f30274ppxfxbqfkf, c0635iobyxmoadg.f30274ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f30275wkgbmnqykc, c0635iobyxmoadg.f30275wkgbmnqykc);
        }

        public int hashCode() {
            String str = this.f30273iobyxmoadg;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DeliveryCode deliveryCode = this.f30276zoijcleaow;
            int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
            List list = this.f30274ppxfxbqfkf;
            return ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.f30275wkgbmnqykc.hashCode();
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f30276zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f30273iobyxmoadg;
        }

        public String toString() {
            return "Params(shopId=" + this.f30273iobyxmoadg + ", deliveryType=" + this.f30276zoijcleaow + ", productIds=" + this.f30274ppxfxbqfkf + ", types=" + this.f30275wkgbmnqykc + ")";
        }

        public final Set wkgbmnqykc() {
            return this.f30275wkgbmnqykc;
        }

        public final List zoijcleaow() {
            return this.f30274ppxfxbqfkf;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f30278esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f30279iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f30280jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f30281yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f30282zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f30279iwizpuwonk = obj;
            this.f30278esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f30283iobyxmoadg;

        static {
            int[] iArr = new int[eablkybsjg.values().length];
            try {
                iArr[eablkybsjg.RECOMMENDATIONS_ANALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eablkybsjg.RECOMMENDATIONS_ADDITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eablkybsjg.RECOMMENDATIONS_POPULAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[eablkybsjg.RECOMMENDATIONS_PERSONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f30283iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(x10.wkgbmnqykc recommendationsRemoteSource, ca2.ppxfxbqfkf userRepository, ca2.iobyxmoadg deviceUtils, na0.iobyxmoadg featureManager, wkgbmnqykc userSharedPreferences, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(recommendationsRemoteSource, "recommendationsRemoteSource");
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(deviceUtils, "deviceUtils");
        zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f30272zoijcleaow = recommendationsRemoteSource;
        this.f30270ppxfxbqfkf = userRepository;
        this.f30271wkgbmnqykc = deviceUtils;
        this.f30268eablkybsjg = featureManager;
        this.f30269gxszxtbevo = userSharedPreferences;
    }

    private final n10.iobyxmoadg wkgbmnqykc(eablkybsjg eablkybsjgVar) {
        int i13 = zoijcleaow.f30283iobyxmoadg[eablkybsjgVar.ordinal()];
        if (i13 == 1) {
            return n10.iobyxmoadg.ANALOGUE;
        }
        if (i13 == 2) {
            return n10.iobyxmoadg.RELATED;
        }
        if (i13 == 3) {
            return n10.iobyxmoadg.POPULAR;
        }
        if (i13 != 4) {
            return null;
        }
        return n10.iobyxmoadg.PERSONAL_COMPOSITE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:100:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0120  */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0131  */
    /* JADX WARN: Code duplicated, block: B:69:0x0143 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0144  */
    /* JADX WARN: Code duplicated, block: B:73:0x0167 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x016b  */
    /* JADX WARN: Code duplicated, block: B:77:0x016e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0181  */
    /* JADX WARN: Code duplicated, block: B:83:0x0192  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:98:0x019a A[SYNTHETIC] */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0635iobyxmoadg c0635iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        Set setEablkybsjg;
        C0635iobyxmoadg c0635iobyxmoadg2;
        Set set;
        iobyxmoadg iobyxmoadgVar2;
        List listWflxmlrfwp;
        x10.wkgbmnqykc wkgbmnqykcVar;
        Object objIobyxmoadg;
        C0635iobyxmoadg c0635iobyxmoadg3;
        Set set2;
        x10.wkgbmnqykc wkgbmnqykcVar2;
        User user;
        List listWflxmlrfwp2;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        n10.iobyxmoadg iobyxmoadgVarWkgbmnqykc;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList3;
        Recommendation recommendation;
        vdvldrhtss vdvldrhtssVarIobyxmoadg;
        n10.iobyxmoadg type;
        Object arrayList4;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f30278esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f30278esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkfVar;
        Object objZdlpuopuiu = ppxfxbqfkfVar2.f30279iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar2.f30278esjtqupxsv;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZdlpuopuiu);
            if (c0635iobyxmoadg.wkgbmnqykc().isEmpty()) {
                setEablkybsjg = ikoacuggdj.eablkybsjg();
                iobyxmoadgVar = this;
            } else {
                na0.iobyxmoadg iobyxmoadgVar3 = this.f30268eablkybsjg;
                ppxfxbqfkfVar2.f30282zdlpuopuiu = this;
                ppxfxbqfkfVar2.f30281yggfygwlhe = c0635iobyxmoadg;
                ppxfxbqfkfVar2.f30278esjtqupxsv = 1;
                objZdlpuopuiu = iobyxmoadgVar3.zdlpuopuiu(ppxfxbqfkfVar2);
                if (objZdlpuopuiu == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            }
            if (setEablkybsjg.isEmpty()) {
                setEablkybsjg = null;
            }
            if (setEablkybsjg != null) {
                wkgbmnqykcVar = iobyxmoadgVar.f30272zoijcleaow;
                ca2.iobyxmoadg iobyxmoadgVar4 = iobyxmoadgVar.f30271wkgbmnqykc;
                ppxfxbqfkfVar2.f30282zdlpuopuiu = c0635iobyxmoadg;
                ppxfxbqfkfVar2.f30281yggfygwlhe = setEablkybsjg;
                ppxfxbqfkfVar2.f30280jyumaefscl = wkgbmnqykcVar;
                ppxfxbqfkfVar2.f30278esjtqupxsv = 3;
                objIobyxmoadg = iobyxmoadgVar4.iobyxmoadg(ppxfxbqfkfVar2);
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                c0635iobyxmoadg3 = c0635iobyxmoadg;
                set2 = setEablkybsjg;
                objZdlpuopuiu = objIobyxmoadg;
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                String str = (String) objZdlpuopuiu;
                String strPpxfxbqfkf = c0635iobyxmoadg3.ppxfxbqfkf();
                DeliveryCode deliveryCodeIobyxmoadg = c0635iobyxmoadg3.iobyxmoadg();
                List listZoijcleaow = c0635iobyxmoadg3.zoijcleaow();
                ppxfxbqfkfVar2.f30282zdlpuopuiu = null;
                ppxfxbqfkfVar2.f30281yggfygwlhe = null;
                ppxfxbqfkfVar2.f30280jyumaefscl = null;
                ppxfxbqfkfVar2.f30278esjtqupxsv = 4;
                objZdlpuopuiu = wkgbmnqykcVar2.iobyxmoadg(str, strPpxfxbqfkf, deliveryCodeIobyxmoadg, listZoijcleaow, set2, ppxfxbqfkfVar2);
                if (objZdlpuopuiu == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                listWflxmlrfwp = (List) objZdlpuopuiu;
            } else {
                listWflxmlrfwp = null;
            }
            if (listWflxmlrfwp == null) {
                listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
            }
            linkedHashMap = new LinkedHashMap();
            for (Object obj : listWflxmlrfwp) {
                type = ((Recommendation) obj).getType();
                arrayList4 = linkedHashMap.get(type);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(type, arrayList4);
                }
                ((List) arrayList4).add(obj);
            }
            arrayList3 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                recommendation = (Recommendation) jyumaefscl.weqkydbzbr((List) entry.getValue());
                if (recommendation != null) {
                    vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(entry.getKey(), recommendation);
                } else {
                    vdvldrhtssVarIobyxmoadg = null;
                }
                if (vdvldrhtssVarIobyxmoadg != null) {
                    arrayList3.add(vdvldrhtssVarIobyxmoadg);
                }
            }
            return tzroggbefp.kcexrzcfyt(arrayList3);
        }
        if (i14 == 1) {
            c0635iobyxmoadg = (C0635iobyxmoadg) ppxfxbqfkfVar2.f30281yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar2.f30282zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZdlpuopuiu);
        } else {
            if (i14 == 2) {
                set = (Set) ppxfxbqfkfVar2.f30280jyumaefscl;
                c0635iobyxmoadg2 = (C0635iobyxmoadg) ppxfxbqfkfVar2.f30281yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) ppxfxbqfkfVar2.f30282zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZdlpuopuiu);
                user = (User) objZdlpuopuiu;
                if (user != null) {
                    listWflxmlrfwp2 = user.getTesterFunctions();
                } else {
                    listWflxmlrfwp2 = null;
                }
                if (listWflxmlrfwp2 == null) {
                    listWflxmlrfwp2 = jyumaefscl.wflxmlrfwp();
                }
                arrayList = new ArrayList();
                it = listWflxmlrfwp2.iterator();
                while (it.hasNext()) {
                    iobyxmoadgVarWkgbmnqykc = iobyxmoadgVar2.wkgbmnqykc((eablkybsjg) it.next());
                    if (iobyxmoadgVarWkgbmnqykc != null) {
                        arrayList.add(iobyxmoadgVarWkgbmnqykc);
                    }
                }
                arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (set.contains((n10.iobyxmoadg) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                setEablkybsjg = jyumaefscl.r(arrayList2);
                c0635iobyxmoadg = c0635iobyxmoadg2;
                iobyxmoadgVar = iobyxmoadgVar2;
                if (setEablkybsjg == null) {
                    setEablkybsjg = ikoacuggdj.eablkybsjg();
                }
                if (setEablkybsjg.isEmpty()) {
                    setEablkybsjg = null;
                }
                if (setEablkybsjg != null) {
                    wkgbmnqykcVar = iobyxmoadgVar.f30272zoijcleaow;
                    ca2.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar.f30271wkgbmnqykc;
                    ppxfxbqfkfVar2.f30282zdlpuopuiu = c0635iobyxmoadg;
                    ppxfxbqfkfVar2.f30281yggfygwlhe = setEablkybsjg;
                    ppxfxbqfkfVar2.f30280jyumaefscl = wkgbmnqykcVar;
                    ppxfxbqfkfVar2.f30278esjtqupxsv = 3;
                    objIobyxmoadg = iobyxmoadgVar5.iobyxmoadg(ppxfxbqfkfVar2);
                    if (objIobyxmoadg == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    c0635iobyxmoadg3 = c0635iobyxmoadg;
                    set2 = setEablkybsjg;
                    objZdlpuopuiu = objIobyxmoadg;
                    wkgbmnqykcVar2 = wkgbmnqykcVar;
                    String str2 = (String) objZdlpuopuiu;
                    String strPpxfxbqfkf2 = c0635iobyxmoadg3.ppxfxbqfkf();
                    DeliveryCode deliveryCodeIobyxmoadg2 = c0635iobyxmoadg3.iobyxmoadg();
                    List listZoijcleaow2 = c0635iobyxmoadg3.zoijcleaow();
                    ppxfxbqfkfVar2.f30282zdlpuopuiu = null;
                    ppxfxbqfkfVar2.f30281yggfygwlhe = null;
                    ppxfxbqfkfVar2.f30280jyumaefscl = null;
                    ppxfxbqfkfVar2.f30278esjtqupxsv = 4;
                    objZdlpuopuiu = wkgbmnqykcVar2.iobyxmoadg(str2, strPpxfxbqfkf2, deliveryCodeIobyxmoadg2, listZoijcleaow2, set2, ppxfxbqfkfVar2);
                    if (objZdlpuopuiu == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    listWflxmlrfwp = null;
                }
                if (listWflxmlrfwp == null) {
                    listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
                }
                linkedHashMap = new LinkedHashMap();
                while (r13.hasNext()) {
                    type = ((Recommendation) obj).getType();
                    arrayList4 = linkedHashMap.get(type);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap.put(type, arrayList4);
                    }
                    ((List) arrayList4).add(obj);
                }
                arrayList3 = new ArrayList();
                while (r12.hasNext()) {
                    recommendation = (Recommendation) jyumaefscl.weqkydbzbr((List) entry.getValue());
                    if (recommendation != null) {
                        vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(entry.getKey(), recommendation);
                    } else {
                        vdvldrhtssVarIobyxmoadg = null;
                    }
                    if (vdvldrhtssVarIobyxmoadg != null) {
                        arrayList3.add(vdvldrhtssVarIobyxmoadg);
                    }
                }
                return tzroggbefp.kcexrzcfyt(arrayList3);
            }
            if (i14 == 3) {
                x10.wkgbmnqykc wkgbmnqykcVar3 = (x10.wkgbmnqykc) ppxfxbqfkfVar2.f30280jyumaefscl;
                Set set3 = (Set) ppxfxbqfkfVar2.f30281yggfygwlhe;
                c0635iobyxmoadg3 = (C0635iobyxmoadg) ppxfxbqfkfVar2.f30282zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZdlpuopuiu);
                set2 = set3;
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
                String str3 = (String) objZdlpuopuiu;
                String strPpxfxbqfkf3 = c0635iobyxmoadg3.ppxfxbqfkf();
                DeliveryCode deliveryCodeIobyxmoadg3 = c0635iobyxmoadg3.iobyxmoadg();
                List listZoijcleaow3 = c0635iobyxmoadg3.zoijcleaow();
                ppxfxbqfkfVar2.f30282zdlpuopuiu = null;
                ppxfxbqfkfVar2.f30281yggfygwlhe = null;
                ppxfxbqfkfVar2.f30280jyumaefscl = null;
                ppxfxbqfkfVar2.f30278esjtqupxsv = 4;
                objZdlpuopuiu = wkgbmnqykcVar2.iobyxmoadg(str3, strPpxfxbqfkf3, deliveryCodeIobyxmoadg3, listZoijcleaow3, set2, ppxfxbqfkfVar2);
                if (objZdlpuopuiu == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objZdlpuopuiu);
            }
        }
        listWflxmlrfwp = (List) objZdlpuopuiu;
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        linkedHashMap = new LinkedHashMap();
        while (r13.hasNext()) {
            type = ((Recommendation) obj).getType();
            arrayList4 = linkedHashMap.get(type);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(type, arrayList4);
            }
            ((List) arrayList4).add(obj);
        }
        arrayList3 = new ArrayList();
        while (r12.hasNext()) {
            recommendation = (Recommendation) jyumaefscl.weqkydbzbr((List) entry.getValue());
            if (recommendation != null) {
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(entry.getKey(), recommendation);
            } else {
                vdvldrhtssVarIobyxmoadg = null;
            }
            if (vdvldrhtssVarIobyxmoadg != null) {
                arrayList3.add(vdvldrhtssVarIobyxmoadg);
            }
        }
        return tzroggbefp.kcexrzcfyt(arrayList3);
        if (((Boolean) objZdlpuopuiu).booleanValue()) {
            setEablkybsjg = c0635iobyxmoadg.wkgbmnqykc();
        } else {
            Set setWkgbmnqykc = c0635iobyxmoadg.wkgbmnqykc();
            if (!iobyxmoadgVar.f30269gxszxtbevo.nufgyqmvbu()) {
                setWkgbmnqykc = null;
            }
            if (setWkgbmnqykc != null) {
                ca2.ppxfxbqfkf ppxfxbqfkfVar3 = iobyxmoadgVar.f30270ppxfxbqfkf;
                ppxfxbqfkfVar2.f30282zdlpuopuiu = iobyxmoadgVar;
                ppxfxbqfkfVar2.f30281yggfygwlhe = c0635iobyxmoadg;
                ppxfxbqfkfVar2.f30280jyumaefscl = setWkgbmnqykc;
                ppxfxbqfkfVar2.f30278esjtqupxsv = 2;
                Object objLqeggnwhkg = ppxfxbqfkfVar3.lqeggnwhkg(ppxfxbqfkfVar2);
                if (objLqeggnwhkg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadg iobyxmoadgVar6 = iobyxmoadgVar;
                c0635iobyxmoadg2 = c0635iobyxmoadg;
                set = setWkgbmnqykc;
                objZdlpuopuiu = objLqeggnwhkg;
                iobyxmoadgVar2 = iobyxmoadgVar6;
                user = (User) objZdlpuopuiu;
                if (user != null) {
                    listWflxmlrfwp2 = user.getTesterFunctions();
                } else {
                    listWflxmlrfwp2 = null;
                }
                if (listWflxmlrfwp2 == null) {
                    listWflxmlrfwp2 = jyumaefscl.wflxmlrfwp();
                }
                arrayList = new ArrayList();
                it = listWflxmlrfwp2.iterator();
                while (it.hasNext()) {
                    iobyxmoadgVarWkgbmnqykc = iobyxmoadgVar2.wkgbmnqykc((eablkybsjg) it.next());
                    if (iobyxmoadgVarWkgbmnqykc != null) {
                        arrayList.add(iobyxmoadgVarWkgbmnqykc);
                    }
                }
                arrayList2 = new ArrayList();
                while (r5.hasNext()) {
                    if (set.contains((n10.iobyxmoadg) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                setEablkybsjg = jyumaefscl.r(arrayList2);
                c0635iobyxmoadg = c0635iobyxmoadg2;
                iobyxmoadgVar = iobyxmoadgVar2;
            } else {
                setEablkybsjg = null;
            }
            if (setEablkybsjg == null) {
                setEablkybsjg = ikoacuggdj.eablkybsjg();
            }
        }
        if (setEablkybsjg.isEmpty()) {
            setEablkybsjg = null;
        }
        if (setEablkybsjg != null) {
            wkgbmnqykcVar = iobyxmoadgVar.f30272zoijcleaow;
            ca2.iobyxmoadg iobyxmoadgVar7 = iobyxmoadgVar.f30271wkgbmnqykc;
            ppxfxbqfkfVar2.f30282zdlpuopuiu = c0635iobyxmoadg;
            ppxfxbqfkfVar2.f30281yggfygwlhe = setEablkybsjg;
            ppxfxbqfkfVar2.f30280jyumaefscl = wkgbmnqykcVar;
            ppxfxbqfkfVar2.f30278esjtqupxsv = 3;
            objIobyxmoadg = iobyxmoadgVar7.iobyxmoadg(ppxfxbqfkfVar2);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            c0635iobyxmoadg3 = c0635iobyxmoadg;
            set2 = setEablkybsjg;
            objZdlpuopuiu = objIobyxmoadg;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            String str4 = (String) objZdlpuopuiu;
            String strPpxfxbqfkf4 = c0635iobyxmoadg3.ppxfxbqfkf();
            DeliveryCode deliveryCodeIobyxmoadg4 = c0635iobyxmoadg3.iobyxmoadg();
            List listZoijcleaow4 = c0635iobyxmoadg3.zoijcleaow();
            ppxfxbqfkfVar2.f30282zdlpuopuiu = null;
            ppxfxbqfkfVar2.f30281yggfygwlhe = null;
            ppxfxbqfkfVar2.f30280jyumaefscl = null;
            ppxfxbqfkfVar2.f30278esjtqupxsv = 4;
            objZdlpuopuiu = wkgbmnqykcVar2.iobyxmoadg(str4, strPpxfxbqfkf4, deliveryCodeIobyxmoadg4, listZoijcleaow4, set2, ppxfxbqfkfVar2);
            if (objZdlpuopuiu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            listWflxmlrfwp = (List) objZdlpuopuiu;
        } else {
            listWflxmlrfwp = null;
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        linkedHashMap = new LinkedHashMap();
        while (r13.hasNext()) {
            type = ((Recommendation) obj).getType();
            arrayList4 = linkedHashMap.get(type);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(type, arrayList4);
            }
            ((List) arrayList4).add(obj);
        }
        arrayList3 = new ArrayList();
        while (r12.hasNext()) {
            recommendation = (Recommendation) jyumaefscl.weqkydbzbr((List) entry.getValue());
            if (recommendation != null) {
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(entry.getKey(), recommendation);
            } else {
                vdvldrhtssVarIobyxmoadg = null;
            }
            if (vdvldrhtssVarIobyxmoadg != null) {
                arrayList3.add(vdvldrhtssVarIobyxmoadg);
            }
        }
        return tzroggbefp.kcexrzcfyt(arrayList3);
    }
}
