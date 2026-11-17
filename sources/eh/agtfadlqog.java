package eh;

import dh.ikoacuggdj;
import dh.n;
import gg.vdvldrhtss;
import hg.jyumaefscl;
import hg.stevsuqkhv;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jh.iyctptxqzt;
import jh.lereixgezr;
import jh.ntlheqmsrt;
import jh.vipkmwdibw;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import zi.kegysxyocb;
import zi.lxfrhoxuzk;

/* JADX INFO: loaded from: classes3.dex */
public final class agtfadlqog implements nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zg.btonecajqb[] f31290eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f31291gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f31292iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Member f31293ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f31294wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f31295zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final zg.btonecajqb f31296iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Method f31297ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List[] f31298zoijcleaow;

        public iobyxmoadg(zg.btonecajqb argumentRange, List[] unboxParameters, Method method) {
            zdlpuopuiu.btonecajqb(argumentRange, "argumentRange");
            zdlpuopuiu.btonecajqb(unboxParameters, "unboxParameters");
            this.f31296iobyxmoadg = argumentRange;
            this.f31298zoijcleaow = unboxParameters;
            this.f31297ppxfxbqfkf = method;
        }

        public final zg.btonecajqb iobyxmoadg() {
            return this.f31296iobyxmoadg;
        }

        public final List[] ppxfxbqfkf() {
            return this.f31298zoijcleaow;
        }

        public final Method zoijcleaow() {
            return this.f31297ppxfxbqfkf;
        }
    }

    public static final class zoijcleaow implements nufgyqmvbu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final List f31299eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f31300iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f31301ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final List f31302wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Method f31303zoijcleaow;

        public zoijcleaow(lereixgezr descriptor, ikoacuggdj container, String constructorDesc, List originalParameters) {
            Collection collectionEablkybsjg;
            zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            zdlpuopuiu.btonecajqb(container, "container");
            zdlpuopuiu.btonecajqb(constructorDesc, "constructorDesc");
            zdlpuopuiu.btonecajqb(originalParameters, "originalParameters");
            Method methodPmvmpeiblj = container.pmvmpeiblj("constructor-impl", constructorDesc);
            zdlpuopuiu.lqeggnwhkg(methodPmvmpeiblj);
            this.f31300iobyxmoadg = methodPmvmpeiblj;
            Method methodPmvmpeiblj2 = container.pmvmpeiblj("box-impl", kcexrzcfyt.hszhottldk(constructorDesc, "V") + ph.gxszxtbevo.gxszxtbevo(container.zoijcleaow()));
            zdlpuopuiu.lqeggnwhkg(methodPmvmpeiblj2);
            this.f31303zoijcleaow = methodPmvmpeiblj2;
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(originalParameters, 10));
            Iterator it = originalParameters.iterator();
            while (it.hasNext()) {
                kegysxyocb type = ((ntlheqmsrt) it.next()).getType();
                zdlpuopuiu.dxjokdxxww(type, "getType(...)");
                arrayList.add(ojitshcjhn.rgvfuqvkyq(lxfrhoxuzk.iobyxmoadg(type), descriptor));
            }
            this.f31301ppxfxbqfkf = arrayList;
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(originalParameters, 10));
            int i13 = 0;
            for (Object obj : originalParameters) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    jyumaefscl.iwizpuwonk();
                }
                jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = ((ntlheqmsrt) obj).getType().grlcpdaxtj().ylkuphrtab();
                zdlpuopuiu.nufgyqmvbu(nufgyqmvbuVarWkgbmnqykc, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                jh.eablkybsjg eablkybsjgVar = (jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc;
                List list = (List) this.f31301ppxfxbqfkf.get(i13);
                if (list != null) {
                    collectionEablkybsjg = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        collectionEablkybsjg.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class clsVdvldrhtss = n.vdvldrhtss(eablkybsjgVar);
                    zdlpuopuiu.lqeggnwhkg(clsVdvldrhtss);
                    collectionEablkybsjg = jyumaefscl.eablkybsjg(clsVdvldrhtss);
                }
                arrayList2.add(collectionEablkybsjg);
                i13 = i14;
            }
            this.f31302wkgbmnqykc = arrayList2;
            this.f31299eablkybsjg = jyumaefscl.lereixgezr(arrayList2);
        }

        @Override // eh.nufgyqmvbu
        public Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
            Collection collectionEablkybsjg;
            zdlpuopuiu.btonecajqb(args, "args");
            List<vdvldrhtss> listY = hg.agtfadlqog.y(args, this.f31301ppxfxbqfkf);
            ArrayList arrayList = new ArrayList();
            for (vdvldrhtss vdvldrhtssVar : listY) {
                Object objIobyxmoadg = vdvldrhtssVar.iobyxmoadg();
                List list = (List) vdvldrhtssVar.wkgbmnqykc();
                if (list != null) {
                    collectionEablkybsjg = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        collectionEablkybsjg.add(((Method) it.next()).invoke(objIobyxmoadg, null));
                    }
                } else {
                    collectionEablkybsjg = jyumaefscl.eablkybsjg(objIobyxmoadg);
                }
                jyumaefscl.istkbnxepw(arrayList, collectionEablkybsjg);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.f31300iobyxmoadg.invoke(null, Arrays.copyOf(array, array.length));
            return this.f31303zoijcleaow.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Override // eh.nufgyqmvbu
        public Type getReturnType() {
            Class<?> returnType = this.f31303zoijcleaow.getReturnType();
            zdlpuopuiu.dxjokdxxww(returnType, "getReturnType(...)");
            return returnType;
        }

        @Override // eh.nufgyqmvbu
        public List iobyxmoadg() {
            return this.f31299eablkybsjg;
        }

        public Void ppxfxbqfkf() {
            return null;
        }

        public final List wkgbmnqykc() {
            return this.f31302wkgbmnqykc;
        }

        @Override // eh.nufgyqmvbu
        public /* bridge */ /* synthetic */ Member zoijcleaow() {
            return (Member) ppxfxbqfkf();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0079 A[LOOP:1: B:25:0x0073->B:27:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    public agtfadlqog(jh.zoijcleaow descriptor, nufgyqmvbu oldCaller, boolean z13) {
        Class clsZdlpuopuiu;
        int i13;
        iobyxmoadg iobyxmoadgVar;
        kegysxyocb kegysxyocbVarBtonecajqb;
        ArrayList arrayList;
        Iterator it;
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        zdlpuopuiu.btonecajqb(oldCaller, "oldCaller");
        this.f31292iobyxmoadg = z13;
        boolean z14 = false;
        if (oldCaller instanceof dxjokdxxww.nufgyqmvbu.ppxfxbqfkf) {
            vipkmwdibw vipkmwdibwVarHkdspvbjdz = descriptor.hkdspvbjdz();
            vipkmwdibwVarHkdspvbjdz = vipkmwdibwVarHkdspvbjdz == null ? descriptor.hcddaimhww() : vipkmwdibwVarHkdspvbjdz;
            kegysxyocb type = vipkmwdibwVarHkdspvbjdz != null ? vipkmwdibwVarHkdspvbjdz.getType() : null;
            if (type != null && li.gtknphoqwx.dxjokdxxww(type)) {
                if (z13) {
                    List listDxjokdxxww = descriptor.dxjokdxxww();
                    zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
                    if (listDxjokdxxww == null || !listDxjokdxxww.isEmpty()) {
                        Iterator it2 = listDxjokdxxww.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((iyctptxqzt) it2.next()).auzgnhcxok()) {
                                    List listAgtfadlqog = ojitshcjhn.agtfadlqog(lxfrhoxuzk.iobyxmoadg(type));
                                    zdlpuopuiu.lqeggnwhkg(listAgtfadlqog);
                                    arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listAgtfadlqog, 10));
                                    it = listAgtfadlqog.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Method) it.next()).invoke(((dxjokdxxww.nufgyqmvbu.ppxfxbqfkf) oldCaller).lqeggnwhkg(), null));
                                    }
                                    oldCaller = new dxjokdxxww.nufgyqmvbu.wkgbmnqykc((Method) ((dxjokdxxww.nufgyqmvbu) oldCaller).zoijcleaow(), arrayList.toArray(new Object[0]));
                                }
                            }
                        }
                    }
                } else {
                    List listAgtfadlqog2 = ojitshcjhn.agtfadlqog(lxfrhoxuzk.iobyxmoadg(type));
                    zdlpuopuiu.lqeggnwhkg(listAgtfadlqog2);
                    arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listAgtfadlqog2, 10));
                    it = listAgtfadlqog2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Method) it.next()).invoke(((dxjokdxxww.nufgyqmvbu.ppxfxbqfkf) oldCaller).lqeggnwhkg(), null));
                    }
                    oldCaller = new dxjokdxxww.nufgyqmvbu.wkgbmnqykc((Method) ((dxjokdxxww.nufgyqmvbu) oldCaller).zoijcleaow(), arrayList.toArray(new Object[0]));
                }
            }
        }
        this.f31295zoijcleaow = oldCaller;
        this.f31293ppxfxbqfkf = oldCaller.zoijcleaow();
        kegysxyocb returnType = descriptor.getReturnType();
        zdlpuopuiu.lqeggnwhkg(returnType);
        boolean z15 = descriptor instanceof lereixgezr;
        Method methodGtknphoqwx = ((z15 && ((lereixgezr) descriptor).isSuspend() && (kegysxyocbVarBtonecajqb = li.gtknphoqwx.btonecajqb(returnType)) != null && gh.dxjokdxxww.weqkydbzbr(kegysxyocbVarBtonecajqb)) || (clsZdlpuopuiu = ojitshcjhn.zdlpuopuiu(returnType)) == null) ? null : ojitshcjhn.gtknphoqwx(clsZdlpuopuiu, descriptor);
        if (li.gtknphoqwx.iobyxmoadg(descriptor)) {
            iobyxmoadgVar = new iobyxmoadg(zg.btonecajqb.f129919cqumvgiudr.iobyxmoadg(), new List[0], methodGtknphoqwx);
        } else {
            int i14 = -1;
            if (!(oldCaller instanceof dxjokdxxww.nufgyqmvbu.ppxfxbqfkf) && !(oldCaller instanceof dxjokdxxww.nufgyqmvbu.wkgbmnqykc)) {
                if (descriptor instanceof jh.draadjrbmk) {
                    if (!(oldCaller instanceof lqeggnwhkg)) {
                        i14 = 0;
                    }
                } else if (descriptor.hcddaimhww() == null || (oldCaller instanceof lqeggnwhkg)) {
                    i14 = 0;
                } else {
                    jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = descriptor.zoijcleaow();
                    zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow, "getContainingDeclaration(...)");
                    if (li.gtknphoqwx.lqeggnwhkg(wflxmlrfwpVarZoijcleaow)) {
                        i14 = 0;
                    } else {
                        i14 = 1;
                    }
                }
            }
            int i15 = oldCaller instanceof dxjokdxxww.nufgyqmvbu.wkgbmnqykc ? -((dxjokdxxww.nufgyqmvbu.wkgbmnqykc) oldCaller).nufgyqmvbu() : i14;
            List listOxmwwwfdhm = ojitshcjhn.oxmwwwfdhm(descriptor, oldCaller.zoijcleaow(), wflxmlrfwp.f31341zdlpuopuiu);
            if (this.f31292iobyxmoadg) {
                Iterator it3 = listOxmwwwfdhm.iterator();
                int iEablkybsjg = 0;
                while (it3.hasNext()) {
                    iEablkybsjg += eablkybsjg((kegysxyocb) it3.next());
                }
                i13 = ((iEablkybsjg + 31) / 32) + 1;
            } else {
                i13 = 0;
            }
            int i16 = i13 + ((z15 && ((lereixgezr) descriptor).isSuspend()) ? 1 : 0);
            Iterator it4 = listOxmwwwfdhm.iterator();
            int iEablkybsjg2 = 0;
            while (it4.hasNext()) {
                iEablkybsjg2 += eablkybsjg((kegysxyocb) it4.next());
            }
            int i17 = iEablkybsjg2 + i15 + i16;
            ojitshcjhn.lqeggnwhkg(this, i17, descriptor, this.f31292iobyxmoadg);
            zg.btonecajqb btonecajqbVarJyumaefscl = zg.gtknphoqwx.jyumaefscl(Math.max(i14, 0), listOxmwwwfdhm.size() + i14);
            List[] listArr = new List[i17];
            int i18 = 0;
            while (i18 < i17) {
                listArr[i18] = (i18 > btonecajqbVarJyumaefscl.eablkybsjg() || btonecajqbVarJyumaefscl.wkgbmnqykc() > i18) ? null : ojitshcjhn.rgvfuqvkyq(lxfrhoxuzk.iobyxmoadg((kegysxyocb) listOxmwwwfdhm.get(i18 - i14)), descriptor);
                i18++;
            }
            iobyxmoadgVar = new iobyxmoadg(btonecajqbVarJyumaefscl, listArr, methodGtknphoqwx);
        }
        this.f31294wkgbmnqykc = iobyxmoadgVar;
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        nufgyqmvbu nufgyqmvbuVar = this.f31295zoijcleaow;
        int length = nufgyqmvbuVar instanceof dxjokdxxww.nufgyqmvbu.wkgbmnqykc ? ((dxjokdxxww.nufgyqmvbu.wkgbmnqykc) nufgyqmvbuVar).lqeggnwhkg().length : nufgyqmvbuVar instanceof dxjokdxxww.nufgyqmvbu.ppxfxbqfkf ? 1 : 0;
        if (length > 0) {
            listPpxfxbqfkf.add(zg.gtknphoqwx.jyumaefscl(0, length));
        }
        List[] listArrPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        int length2 = listArrPpxfxbqfkf.length;
        int i19 = 0;
        while (i19 < length2) {
            List list = listArrPpxfxbqfkf[i19];
            int size = (list != null ? list.size() : 1) + length;
            listPpxfxbqfkf.add(zg.gtknphoqwx.jyumaefscl(length, size));
            i19++;
            length = size;
        }
        this.f31290eablkybsjg = (zg.btonecajqb[]) jyumaefscl.iobyxmoadg(listPpxfxbqfkf).toArray(new zg.btonecajqb[0]);
        Iterable iterableIobyxmoadg = this.f31294wkgbmnqykc.iobyxmoadg();
        if (!(iterableIobyxmoadg instanceof Collection) || !((Collection) iterableIobyxmoadg).isEmpty()) {
            Iterator it5 = iterableIobyxmoadg.iterator();
            while (it5.hasNext()) {
                List list2 = this.f31294wkgbmnqykc.ppxfxbqfkf()[((stevsuqkhv) it5).iobyxmoadg()];
                if (list2 != null && list2.size() > 1) {
                    z14 = true;
                    break;
                }
            }
        }
        this.f31291gxszxtbevo = z14;
    }

    private static final int eablkybsjg(kegysxyocb kegysxyocbVar) {
        List listAgtfadlqog = ojitshcjhn.agtfadlqog(lxfrhoxuzk.iobyxmoadg(kegysxyocbVar));
        if (listAgtfadlqog != null) {
            return listAgtfadlqog.size();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wkgbmnqykc(jh.eablkybsjg makeKotlinParameterTypes) {
        zdlpuopuiu.btonecajqb(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
        return li.gtknphoqwx.lqeggnwhkg(makeKotlinParameterTypes);
    }

    @Override // eh.nufgyqmvbu
    public Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objLqeggnwhkg;
        Object objLqeggnwhkg2;
        zdlpuopuiu.btonecajqb(args, "args");
        zg.btonecajqb btonecajqbVarIobyxmoadg = this.f31294wkgbmnqykc.iobyxmoadg();
        List[] listArrPpxfxbqfkf = this.f31294wkgbmnqykc.ppxfxbqfkf();
        Method methodZoijcleaow = this.f31294wkgbmnqykc.zoijcleaow();
        if (!btonecajqbVarIobyxmoadg.isEmpty()) {
            if (this.f31291gxszxtbevo) {
                List listWkgbmnqykc = jyumaefscl.wkgbmnqykc(args.length);
                int iWkgbmnqykc = btonecajqbVarIobyxmoadg.wkgbmnqykc();
                for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
                    listWkgbmnqykc.add(args[i13]);
                }
                int iWkgbmnqykc2 = btonecajqbVarIobyxmoadg.wkgbmnqykc();
                int iEablkybsjg = btonecajqbVarIobyxmoadg.eablkybsjg();
                if (iWkgbmnqykc2 <= iEablkybsjg) {
                    while (true) {
                        List<Method> list = listArrPpxfxbqfkf[iWkgbmnqykc2];
                        Object obj = args[iWkgbmnqykc2];
                        if (list != null) {
                            for (Method method : list) {
                                if (obj != null) {
                                    objLqeggnwhkg2 = method.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    zdlpuopuiu.dxjokdxxww(returnType, "getReturnType(...)");
                                    objLqeggnwhkg2 = n.lqeggnwhkg(returnType);
                                }
                                listWkgbmnqykc.add(objLqeggnwhkg2);
                            }
                        } else {
                            listWkgbmnqykc.add(obj);
                        }
                        if (iWkgbmnqykc2 == iEablkybsjg) {
                            break;
                        }
                        iWkgbmnqykc2++;
                    }
                }
                int iEablkybsjg2 = btonecajqbVarIobyxmoadg.eablkybsjg() + 1;
                int iOpjhrmiecq = hg.agtfadlqog.opjhrmiecq(args);
                if (iEablkybsjg2 <= iOpjhrmiecq) {
                    while (true) {
                        listWkgbmnqykc.add(args[iEablkybsjg2]);
                        if (iEablkybsjg2 == iOpjhrmiecq) {
                            break;
                        }
                        iEablkybsjg2++;
                    }
                }
                args = jyumaefscl.iobyxmoadg(listWkgbmnqykc).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i14 = 0; i14 < length; i14++) {
                    int iWkgbmnqykc3 = btonecajqbVarIobyxmoadg.wkgbmnqykc();
                    if (i14 > btonecajqbVarIobyxmoadg.eablkybsjg() || iWkgbmnqykc3 > i14) {
                        objLqeggnwhkg = args[i14];
                    } else {
                        List list2 = listArrPpxfxbqfkf[i14];
                        Method method2 = list2 != null ? (Method) jyumaefscl.yzdjzghtvl(list2) : null;
                        objLqeggnwhkg = args[i14];
                        if (method2 != null) {
                            if (objLqeggnwhkg != null) {
                                objLqeggnwhkg = method2.invoke(objLqeggnwhkg, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                zdlpuopuiu.dxjokdxxww(returnType2, "getReturnType(...)");
                                objLqeggnwhkg = n.lqeggnwhkg(returnType2);
                            }
                        }
                    }
                    objArr[i14] = objLqeggnwhkg;
                }
                args = objArr;
            }
        }
        Object objCall = this.f31295zoijcleaow.call(args);
        return (objCall == mg.zoijcleaow.gxszxtbevo() || methodZoijcleaow == null || (objInvoke = methodZoijcleaow.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // eh.nufgyqmvbu
    public Type getReturnType() {
        return this.f31295zoijcleaow.getReturnType();
    }

    public final zg.btonecajqb gxszxtbevo(int i13) {
        zg.btonecajqb btonecajqbVar;
        if (i13 >= 0) {
            zg.btonecajqb[] btonecajqbVarArr = this.f31290eablkybsjg;
            if (i13 < btonecajqbVarArr.length) {
                return btonecajqbVarArr[i13];
            }
        }
        zg.btonecajqb[] btonecajqbVarArr2 = this.f31290eablkybsjg;
        if (btonecajqbVarArr2.length == 0) {
            btonecajqbVar = new zg.btonecajqb(i13, i13);
        } else {
            int length = (i13 - btonecajqbVarArr2.length) + ((zg.btonecajqb) hg.agtfadlqog.hszhottldk(btonecajqbVarArr2)).eablkybsjg() + 1;
            btonecajqbVar = new zg.btonecajqb(length, length);
        }
        return btonecajqbVar;
    }

    @Override // eh.nufgyqmvbu
    public List iobyxmoadg() {
        return this.f31295zoijcleaow.iobyxmoadg();
    }

    @Override // eh.nufgyqmvbu
    public Member zoijcleaow() {
        return this.f31293ppxfxbqfkf;
    }
}
