package eh;

import dh.c;
import dh.n;
import gg.vdvldrhtss;
import hg.jyumaefscl;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jh.crxdokpmqz;
import jh.iyctptxqzt;
import jh.vipkmwdibw;
import jh.weqkydbzbr;
import jh.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import zi.ageimvtcrz;
import zi.ikoacuggdj;
import zi.kegysxyocb;
import zi.lxfrhoxuzk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ojitshcjhn {
    public static final List agtfadlqog(ikoacuggdj type) {
        zdlpuopuiu.btonecajqb(type, "type");
        List listOjitshcjhn = ojitshcjhn(lxfrhoxuzk.iobyxmoadg(type));
        if (listOjitshcjhn == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listOjitshcjhn, 10));
        Iterator it = listOjitshcjhn.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = type.grlcpdaxtj().ylkuphrtab();
        zdlpuopuiu.nufgyqmvbu(nufgyqmvbuVarWkgbmnqykc, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsVdvldrhtss = n.vdvldrhtss((jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc);
        zdlpuopuiu.lqeggnwhkg(clsVdvldrhtss);
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsVdvldrhtss.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    public static /* synthetic */ nufgyqmvbu btonecajqb(nufgyqmvbu nufgyqmvbuVar, jh.zoijcleaow zoijcleaowVar, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return dxjokdxxww(nufgyqmvbuVar, zoijcleaowVar, z13);
    }

    private static final kegysxyocb draadjrbmk(jh.zoijcleaow zoijcleaowVar) {
        vipkmwdibw vipkmwdibwVarHkdspvbjdz = zoijcleaowVar.hkdspvbjdz();
        vipkmwdibw vipkmwdibwVarHcddaimhww = zoijcleaowVar.hcddaimhww();
        if (vipkmwdibwVarHkdspvbjdz != null) {
            return vipkmwdibwVarHkdspvbjdz.getType();
        }
        if (vipkmwdibwVarHcddaimhww != null) {
            if (zoijcleaowVar instanceof jh.draadjrbmk) {
                return vipkmwdibwVarHcddaimhww.getType();
            }
            jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = zoijcleaowVar.zoijcleaow();
            jh.eablkybsjg eablkybsjgVar = wflxmlrfwpVarZoijcleaow instanceof jh.eablkybsjg ? (jh.eablkybsjg) wflxmlrfwpVarZoijcleaow : null;
            if (eablkybsjgVar != null) {
                return eablkybsjgVar.ojitshcjhn();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[LOOP:0: B:21:0x0058->B:37:?, LOOP_END, SYNTHETIC] */
    public static final nufgyqmvbu dxjokdxxww(nufgyqmvbu nufgyqmvbuVar, jh.zoijcleaow descriptor, boolean z13) {
        List listDxjokdxxww;
        Iterator it;
        kegysxyocb type;
        kegysxyocb returnType;
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (!li.gtknphoqwx.iobyxmoadg(descriptor)) {
            List listZeieaojujs = descriptor.zeieaojujs();
            zdlpuopuiu.dxjokdxxww(listZeieaojujs, "getContextReceiverParameters(...)");
            if (listZeieaojujs != null && listZeieaojujs.isEmpty()) {
                listDxjokdxxww = descriptor.dxjokdxxww();
                zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
                if (listDxjokdxxww == null) {
                    it = listDxjokdxxww.iterator();
                    while (it.hasNext()) {
                        type = ((iyctptxqzt) it.next()).getType();
                        zdlpuopuiu.dxjokdxxww(type, "getType(...)");
                        if (li.gtknphoqwx.nufgyqmvbu(type)) {
                        }
                    }
                    returnType = descriptor.getReturnType();
                    if (returnType != null) {
                    }
                }
                it = listDxjokdxxww.iterator();
                while (it.hasNext()) {
                    type = ((iyctptxqzt) it.next()).getType();
                    zdlpuopuiu.dxjokdxxww(type, "getType(...)");
                    if (li.gtknphoqwx.nufgyqmvbu(type)) {
                    }
                }
                returnType = descriptor.getReturnType();
                if (returnType != null) {
                }
            }
            Iterator it2 = listZeieaojujs.iterator();
            while (it2.hasNext()) {
                kegysxyocb type2 = ((vipkmwdibw) it2.next()).getType();
                zdlpuopuiu.dxjokdxxww(type2, "getType(...)");
                if (li.gtknphoqwx.nufgyqmvbu(type2)) {
                }
            }
            listDxjokdxxww = descriptor.dxjokdxxww();
            zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
            if (listDxjokdxxww == null && listDxjokdxxww.isEmpty()) {
                returnType = descriptor.getReturnType();
                return returnType != null ? nufgyqmvbuVar : nufgyqmvbuVar;
            }
            it = listDxjokdxxww.iterator();
            while (it.hasNext()) {
                type = ((iyctptxqzt) it.next()).getType();
                zdlpuopuiu.dxjokdxxww(type, "getType(...)");
                if (li.gtknphoqwx.nufgyqmvbu(type)) {
                }
            }
            returnType = descriptor.getReturnType();
            if ((returnType != null || !li.gtknphoqwx.ppxfxbqfkf(returnType)) && !vdvldrhtss(descriptor)) {
            }
        }
        return new agtfadlqog(descriptor, nufgyqmvbuVar, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method gtknphoqwx(Class cls, jh.zoijcleaow zoijcleaowVar) {
        try {
            return cls.getDeclaredMethod("box-impl", wflxmlrfwp(cls, zoijcleaowVar).getReturnType());
        } catch (NoSuchMethodException unused) {
            throw new c("No box method found in inline class: " + cls + " (calling " + zoijcleaowVar + ')');
        }
    }

    private static final boolean iobyxmoadg(Member member) {
        Class<?> declaringClass = member.getDeclaringClass();
        if (declaringClass == null) {
            return false;
        }
        return !sg.iobyxmoadg.eablkybsjg(declaringClass).kcexrzcfyt();
    }

    public static final Class kcexrzcfyt(jh.wflxmlrfwp wflxmlrfwpVar) {
        if (!(wflxmlrfwpVar instanceof jh.eablkybsjg) || !li.gtknphoqwx.zoijcleaow(wflxmlrfwpVar)) {
            return null;
        }
        jh.eablkybsjg eablkybsjgVar = (jh.eablkybsjg) wflxmlrfwpVar;
        Class clsVdvldrhtss = n.vdvldrhtss(eablkybsjgVar);
        if (clsVdvldrhtss != null) {
            return clsVdvldrhtss;
        }
        throw new c("Class object for the class " + eablkybsjgVar.getName() + " cannot be found (classId=" + pi.eablkybsjg.agtfadlqog((jh.nufgyqmvbu) wflxmlrfwpVar) + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lqeggnwhkg(nufgyqmvbu nufgyqmvbuVar, int i13, jh.zoijcleaow zoijcleaowVar, boolean z13) {
        if (btonecajqb.iobyxmoadg(nufgyqmvbuVar) == i13) {
            return;
        }
        throw new c("Inconsistent number of parameters in the descriptor and Java reflection object: " + btonecajqb.iobyxmoadg(nufgyqmvbuVar) + " != " + i13 + "\nCalling: " + zoijcleaowVar + "\nParameter types: " + nufgyqmvbuVar.iobyxmoadg() + ")\nDefault: " + z13);
    }

    public static final Object nufgyqmvbu(Object obj, jh.zoijcleaow descriptor) {
        kegysxyocb kegysxyocbVarDraadjrbmk;
        Class clsZdlpuopuiu;
        Method methodWflxmlrfwp;
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return (((descriptor instanceof crxdokpmqz) && li.gtknphoqwx.eablkybsjg((weqkydbzbr) descriptor)) || (kegysxyocbVarDraadjrbmk = draadjrbmk(descriptor)) == null || (clsZdlpuopuiu = zdlpuopuiu(kegysxyocbVarDraadjrbmk)) == null || (methodWflxmlrfwp = wflxmlrfwp(clsZdlpuopuiu, descriptor)) == null) ? obj : methodWflxmlrfwp.invoke(obj, null);
    }

    private static final List ojitshcjhn(ikoacuggdj ikoacuggdjVar) {
        Collection collectionEablkybsjg;
        if (!li.gtknphoqwx.dxjokdxxww(ikoacuggdjVar)) {
            return null;
        }
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = ikoacuggdjVar.grlcpdaxtj().ylkuphrtab();
        zdlpuopuiu.nufgyqmvbu(nufgyqmvbuVarWkgbmnqykc, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        wwaezpbzkn wwaezpbzknVarZdlpuopuiu = pi.eablkybsjg.zdlpuopuiu((jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc);
        zdlpuopuiu.lqeggnwhkg(wwaezpbzknVarZdlpuopuiu);
        List<vdvldrhtss> listPpxfxbqfkf = wwaezpbzknVarZdlpuopuiu.ppxfxbqfkf();
        ArrayList arrayList = new ArrayList();
        for (vdvldrhtss vdvldrhtssVar : listPpxfxbqfkf) {
            ii.gxszxtbevo gxszxtbevoVar = (ii.gxszxtbevo) vdvldrhtssVar.iobyxmoadg();
            List listOjitshcjhn = ojitshcjhn((ikoacuggdj) vdvldrhtssVar.wkgbmnqykc());
            if (listOjitshcjhn != null) {
                collectionEablkybsjg = new ArrayList(jyumaefscl.cqumvgiudr(listOjitshcjhn, 10));
                Iterator it = listOjitshcjhn.iterator();
                while (it.hasNext()) {
                    collectionEablkybsjg.add(gxszxtbevoVar.wkgbmnqykc() + '-' + ((String) it.next()));
                }
            } else {
                collectionEablkybsjg = jyumaefscl.eablkybsjg(gxszxtbevoVar.wkgbmnqykc());
            }
            jyumaefscl.istkbnxepw(arrayList, collectionEablkybsjg);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List oxmwwwfdhm(jh.zoijcleaow zoijcleaowVar, Member member, tg.draadjrbmk draadjrbmkVar) {
        ArrayList arrayList = new ArrayList();
        vipkmwdibw vipkmwdibwVarHkdspvbjdz = zoijcleaowVar.hkdspvbjdz();
        kegysxyocb type = vipkmwdibwVarHkdspvbjdz != null ? vipkmwdibwVarHkdspvbjdz.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (zoijcleaowVar instanceof jh.draadjrbmk) {
            jh.eablkybsjg eablkybsjgVarJhduphickx = ((jh.draadjrbmk) zoijcleaowVar).jhduphickx();
            zdlpuopuiu.dxjokdxxww(eablkybsjgVarJhduphickx, "getConstructedClass(...)");
            if (eablkybsjgVarJhduphickx.lereixgezr()) {
                jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = eablkybsjgVarJhduphickx.zoijcleaow();
                zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVarZoijcleaow, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((jh.eablkybsjg) wflxmlrfwpVarZoijcleaow).ojitshcjhn());
            }
        } else {
            jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow2 = zoijcleaowVar.zoijcleaow();
            zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow2, "getContainingDeclaration(...)");
            if ((wflxmlrfwpVarZoijcleaow2 instanceof jh.eablkybsjg) && ((Boolean) draadjrbmkVar.invoke(wflxmlrfwpVarZoijcleaow2)).booleanValue()) {
                if (member == null || !iobyxmoadg(member)) {
                    arrayList.add(((jh.eablkybsjg) wflxmlrfwpVarZoijcleaow2).ojitshcjhn());
                } else {
                    ikoacuggdj ikoacuggdjVarOjitshcjhn = ((jh.eablkybsjg) wflxmlrfwpVarZoijcleaow2).ojitshcjhn();
                    zdlpuopuiu.dxjokdxxww(ikoacuggdjVarOjitshcjhn, "getDefaultType(...)");
                    arrayList.add(ej.wkgbmnqykc.zynmafqrjb(ikoacuggdjVarOjitshcjhn));
                }
            }
        }
        List listDxjokdxxww = zoijcleaowVar.dxjokdxxww();
        zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
        Iterator it = listDxjokdxxww.iterator();
        while (it.hasNext()) {
            arrayList.add(((iyctptxqzt) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List rgvfuqvkyq(ikoacuggdj ikoacuggdjVar, jh.zoijcleaow zoijcleaowVar) {
        Method methodWflxmlrfwp;
        List listAgtfadlqog = agtfadlqog(ikoacuggdjVar);
        if (listAgtfadlqog != null) {
            return listAgtfadlqog;
        }
        Class clsZdlpuopuiu = zdlpuopuiu(ikoacuggdjVar);
        if (clsZdlpuopuiu == null || (methodWflxmlrfwp = wflxmlrfwp(clsZdlpuopuiu, zoijcleaowVar)) == null) {
            return null;
        }
        return jyumaefscl.eablkybsjg(methodWflxmlrfwp);
    }

    private static final boolean vdvldrhtss(jh.zoijcleaow zoijcleaowVar) {
        kegysxyocb kegysxyocbVarDraadjrbmk = draadjrbmk(zoijcleaowVar);
        return kegysxyocbVarDraadjrbmk != null && li.gtknphoqwx.nufgyqmvbu(kegysxyocbVarDraadjrbmk);
    }

    public static final Method wflxmlrfwp(Class cls, jh.zoijcleaow descriptor) {
        zdlpuopuiu.btonecajqb(cls, "<this>");
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        try {
            return cls.getDeclaredMethod("unbox-impl", null);
        } catch (NoSuchMethodException unused) {
            throw new c("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final String yggfygwlhe(jh.nufgyqmvbu nufgyqmvbuVar) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        ii.zoijcleaow zoijcleaowVarAgtfadlqog = pi.eablkybsjg.agtfadlqog(nufgyqmvbuVar);
        zdlpuopuiu.lqeggnwhkg(zoijcleaowVarAgtfadlqog);
        return hi.zoijcleaow.zoijcleaow(zoijcleaowVarAgtfadlqog.zoijcleaow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class zdlpuopuiu(kegysxyocb kegysxyocbVar) {
        Class clsKcexrzcfyt = kcexrzcfyt(kegysxyocbVar.grlcpdaxtj().ylkuphrtab());
        if (clsKcexrzcfyt == null) {
            return null;
        }
        if (!ageimvtcrz.draadjrbmk(kegysxyocbVar)) {
            return clsKcexrzcfyt;
        }
        kegysxyocb kegysxyocbVarGtknphoqwx = li.gtknphoqwx.gtknphoqwx(kegysxyocbVar);
        if (kegysxyocbVarGtknphoqwx == null || ageimvtcrz.draadjrbmk(kegysxyocbVarGtknphoqwx) || gh.dxjokdxxww.weqkydbzbr(kegysxyocbVarGtknphoqwx)) {
            return null;
        }
        return clsKcexrzcfyt;
    }
}
