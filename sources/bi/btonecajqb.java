package bi;

import jh.hkdspvbjdz;
import jh.jlmebxxoox;
import jh.uwvvkdfqfp;
import jh.yfnezrywwk;
import zi.ageimvtcrz;
import zi.iwxlajgraz;
import zi.kegysxyocb;
import zi.mhtqkkgtqm;
import zi.stevsuqkhv;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btonecajqb {
    public static /* synthetic */ Object eablkybsjg(kegysxyocb kegysxyocbVar, zdlpuopuiu zdlpuopuiuVar, ylkuphrtab ylkuphrtabVar, lmojexxdyd lmojexxdydVar, vdvldrhtss vdvldrhtssVar, tg.vdvldrhtss vdvldrhtssVar2, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            vdvldrhtssVar2 = jj.btonecajqb.draadjrbmk();
        }
        return wkgbmnqykc(kegysxyocbVar, zdlpuopuiuVar, ylkuphrtabVar, lmojexxdydVar, vdvldrhtssVar, vdvldrhtssVar2);
    }

    public static final String iobyxmoadg(jh.eablkybsjg klass, lmojexxdyd typeMappingConfiguration) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(klass, "klass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeMappingConfiguration, "typeMappingConfiguration");
        String strZoijcleaow = typeMappingConfiguration.zoijcleaow(klass);
        if (strZoijcleaow != null) {
            return strZoijcleaow;
        }
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = klass.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow, "getContainingDeclaration(...)");
        String strWkgbmnqykc = ii.nufgyqmvbu.zoijcleaow(klass.getName()).wkgbmnqykc();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strWkgbmnqykc, "getIdentifier(...)");
        if (wflxmlrfwpVarZoijcleaow instanceof hkdspvbjdz) {
            ii.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = ((hkdspvbjdz) wflxmlrfwpVarZoijcleaow).gxszxtbevo();
            if (ppxfxbqfkfVarGxszxtbevo.wkgbmnqykc()) {
                return strWkgbmnqykc;
            }
            StringBuilder sb3 = new StringBuilder();
            String strZoijcleaow2 = ppxfxbqfkfVarGxszxtbevo.zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow2, "asString(...)");
            sb3.append(mj.kcexrzcfyt.pkzmftpjix(strZoijcleaow2, '.', '/', false, 4, null));
            sb3.append('/');
            sb3.append(strWkgbmnqykc);
            return sb3.toString();
        }
        jh.eablkybsjg eablkybsjgVar = wflxmlrfwpVarZoijcleaow instanceof jh.eablkybsjg ? (jh.eablkybsjg) wflxmlrfwpVarZoijcleaow : null;
        if (eablkybsjgVar == null) {
            throw new IllegalArgumentException("Unexpected container: " + wflxmlrfwpVarZoijcleaow + " for " + klass);
        }
        String strGxszxtbevo = typeMappingConfiguration.gxszxtbevo(eablkybsjgVar);
        if (strGxszxtbevo == null) {
            strGxszxtbevo = iobyxmoadg(eablkybsjgVar, typeMappingConfiguration);
        }
        return strGxszxtbevo + '$' + strWkgbmnqykc;
    }

    public static final boolean ppxfxbqfkf(jh.iobyxmoadg descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (descriptor instanceof jh.draadjrbmk) {
            return true;
        }
        kegysxyocb returnType = descriptor.getReturnType();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(returnType);
        if (gh.dxjokdxxww.skhdrjzrfn(returnType)) {
            kegysxyocb returnType2 = descriptor.getReturnType();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(returnType2);
            if (!ageimvtcrz.draadjrbmk(returnType2) && !(descriptor instanceof jlmebxxoox)) {
                return true;
            }
        }
        return false;
    }

    public static final Object wkgbmnqykc(kegysxyocb kotlinType, zdlpuopuiu factory, ylkuphrtab mode, lmojexxdyd typeMappingConfiguration, vdvldrhtss vdvldrhtssVar, tg.vdvldrhtss writeGenericType) {
        Object objEablkybsjg;
        kegysxyocb kegysxyocbVar;
        Object objWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinType, "kotlinType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(factory, "factory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeMappingConfiguration, "typeMappingConfiguration");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(writeGenericType, "writeGenericType");
        kegysxyocb kegysxyocbVarEablkybsjg = typeMappingConfiguration.eablkybsjg(kotlinType);
        if (kegysxyocbVarEablkybsjg != null) {
            return wkgbmnqykc(kegysxyocbVarEablkybsjg, factory, mode, typeMappingConfiguration, vdvldrhtssVar, writeGenericType);
        }
        if (gh.nufgyqmvbu.oxmwwwfdhm(kotlinType)) {
            return wkgbmnqykc(gh.rgvfuqvkyq.iobyxmoadg(kotlinType), factory, mode, typeMappingConfiguration, vdvldrhtssVar, writeGenericType);
        }
        aj.kcexrzcfyt kcexrzcfytVar = aj.kcexrzcfyt.f2059iobyxmoadg;
        Object objZoijcleaow = pkzmftpjix.zoijcleaow(kcexrzcfytVar, kotlinType, factory, mode);
        if (objZoijcleaow != null) {
            Object objIobyxmoadg = pkzmftpjix.iobyxmoadg(factory, objZoijcleaow, mode.wkgbmnqykc());
            writeGenericType.invoke(kotlinType, objIobyxmoadg, mode);
            return objIobyxmoadg;
        }
        zeieaojujs zeieaojujsVarGrlcpdaxtj = kotlinType.grlcpdaxtj();
        if (zeieaojujsVarGrlcpdaxtj instanceof stevsuqkhv) {
            stevsuqkhv stevsuqkhvVar = (stevsuqkhv) zeieaojujsVarGrlcpdaxtj;
            kegysxyocb kegysxyocbVarDraadjrbmk = stevsuqkhvVar.draadjrbmk();
            if (kegysxyocbVarDraadjrbmk == null) {
                kegysxyocbVarDraadjrbmk = typeMappingConfiguration.wkgbmnqykc(stevsuqkhvVar.zoijcleaow());
            }
            return wkgbmnqykc(ej.wkgbmnqykc.cdpycssgdh(kegysxyocbVarDraadjrbmk), factory, mode, typeMappingConfiguration, vdvldrhtssVar, writeGenericType);
        }
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = zeieaojujsVarGrlcpdaxtj.ylkuphrtab();
        if (nufgyqmvbuVarWkgbmnqykc == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (bj.draadjrbmk.wflxmlrfwp(nufgyqmvbuVarWkgbmnqykc)) {
            Object objEablkybsjg2 = factory.eablkybsjg("error/NonExistentClass");
            typeMappingConfiguration.iobyxmoadg(kotlinType, (jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc);
            return objEablkybsjg2;
        }
        boolean z13 = nufgyqmvbuVarWkgbmnqykc instanceof jh.eablkybsjg;
        if (z13 && gh.dxjokdxxww.ikoacuggdj(kotlinType)) {
            if (kotlinType.fyldjkxazc().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            iwxlajgraz iwxlajgrazVar = (iwxlajgraz) kotlinType.fyldjkxazc().get(0);
            kegysxyocb type = iwxlajgrazVar.getType();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
            if (iwxlajgrazVar.ppxfxbqfkf() == mhtqkkgtqm.IN_VARIANCE) {
                objWkgbmnqykc = factory.eablkybsjg("java/lang/Object");
            } else {
                mhtqkkgtqm mhtqkkgtqmVarPpxfxbqfkf = iwxlajgrazVar.ppxfxbqfkf();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(mhtqkkgtqmVarPpxfxbqfkf, "getProjectionKind(...)");
                objWkgbmnqykc = wkgbmnqykc(type, factory, mode.gxszxtbevo(mhtqkkgtqmVarPpxfxbqfkf, true), typeMappingConfiguration, vdvldrhtssVar, writeGenericType);
            }
            return factory.iobyxmoadg('[' + factory.ppxfxbqfkf(objWkgbmnqykc));
        }
        if (!z13) {
            if (nufgyqmvbuVarWkgbmnqykc instanceof yfnezrywwk) {
                kegysxyocb kegysxyocbVarOjitshcjhn = ej.wkgbmnqykc.ojitshcjhn((yfnezrywwk) nufgyqmvbuVarWkgbmnqykc);
                if (kotlinType.mhtqkkgtqm()) {
                    kegysxyocbVarOjitshcjhn = ej.wkgbmnqykc.zynmafqrjb(kegysxyocbVarOjitshcjhn);
                }
                return wkgbmnqykc(kegysxyocbVarOjitshcjhn, factory, mode, typeMappingConfiguration, null, jj.btonecajqb.draadjrbmk());
            }
            if ((nufgyqmvbuVarWkgbmnqykc instanceof uwvvkdfqfp) && mode.zoijcleaow()) {
                return wkgbmnqykc(((uwvvkdfqfp) nufgyqmvbuVarWkgbmnqykc).lmojexxdyd(), factory, mode, typeMappingConfiguration, vdvldrhtssVar, writeGenericType);
            }
            throw new UnsupportedOperationException("Unknown type " + kotlinType);
        }
        if (li.gtknphoqwx.zoijcleaow(nufgyqmvbuVarWkgbmnqykc) && !mode.ppxfxbqfkf() && (kegysxyocbVar = (kegysxyocb) zi.wwaezpbzkn.iobyxmoadg(kcexrzcfytVar, kotlinType)) != null) {
            return wkgbmnqykc(kegysxyocbVar, factory, mode.lqeggnwhkg(), typeMappingConfiguration, vdvldrhtssVar, writeGenericType);
        }
        if (mode.eablkybsjg() && gh.dxjokdxxww.ydmasvzmpa((jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc)) {
            objEablkybsjg = factory.gxszxtbevo();
        } else {
            jh.eablkybsjg eablkybsjgVar = (jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc;
            jh.eablkybsjg eablkybsjgVarIobyxmoadg = eablkybsjgVar.iobyxmoadg();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(eablkybsjgVarIobyxmoadg, "getOriginal(...)");
            Object objPpxfxbqfkf = typeMappingConfiguration.ppxfxbqfkf(eablkybsjgVarIobyxmoadg);
            if (objPpxfxbqfkf == null) {
                if (eablkybsjgVar.getKind() == jh.gxszxtbevo.ENUM_ENTRY) {
                    jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = eablkybsjgVar.zoijcleaow();
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wflxmlrfwpVarZoijcleaow, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    eablkybsjgVar = (jh.eablkybsjg) wflxmlrfwpVarZoijcleaow;
                }
                jh.eablkybsjg eablkybsjgVarIobyxmoadg2 = eablkybsjgVar.iobyxmoadg();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(eablkybsjgVarIobyxmoadg2, "getOriginal(...)");
                objEablkybsjg = factory.eablkybsjg(iobyxmoadg(eablkybsjgVarIobyxmoadg2, typeMappingConfiguration));
            } else {
                objEablkybsjg = objPpxfxbqfkf;
            }
        }
        writeGenericType.invoke(kotlinType, objEablkybsjg, mode);
        return objEablkybsjg;
    }

    public static /* synthetic */ String zoijcleaow(jh.eablkybsjg eablkybsjgVar, lmojexxdyd lmojexxdydVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            lmojexxdydVar = wwaezpbzkn.f16342iobyxmoadg;
        }
        return iobyxmoadg(eablkybsjgVar, lmojexxdydVar);
    }
}
