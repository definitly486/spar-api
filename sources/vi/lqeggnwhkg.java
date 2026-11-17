package vi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jh.iyctptxqzt;
import jh.xrmfcynszj;
import zi.ikoacuggdj;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jh.lmojexxdyd f116938iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jh.jpowsppfya f116939zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f116940iobyxmoadg;

        static {
            int[] iArr = new int[di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf.values().length];
            try {
                iArr[di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f116940iobyxmoadg = iArr;
        }
    }

    public lqeggnwhkg(jh.lmojexxdyd module, jh.jpowsppfya notFoundClasses) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(module, "module");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(notFoundClasses, "notFoundClasses");
        this.f116938iobyxmoadg = module;
        this.f116939zoijcleaow = notFoundClasses;
    }

    private final jh.eablkybsjg eablkybsjg(ii.zoijcleaow zoijcleaowVar) {
        return jh.esjtqupxsv.wkgbmnqykc(this.f116938iobyxmoadg, zoijcleaowVar, this.f116939zoijcleaow);
    }

    private final ni.lqeggnwhkg lqeggnwhkg(zi.kegysxyocb kegysxyocbVar, di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar, fi.ppxfxbqfkf ppxfxbqfkfVar2) {
        ni.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = gxszxtbevo(kegysxyocbVar, ppxfxbqfkfVar, ppxfxbqfkfVar2);
        if (!zoijcleaow(lqeggnwhkgVarGxszxtbevo, kegysxyocbVar, ppxfxbqfkfVar)) {
            lqeggnwhkgVarGxszxtbevo = null;
        }
        if (lqeggnwhkgVarGxszxtbevo != null) {
            return lqeggnwhkgVarGxszxtbevo;
        }
        return ni.draadjrbmk.f70088zoijcleaow.iobyxmoadg("Unexpected argument value: actual type " + ppxfxbqfkfVar.crxdokpmqz() + " != expected type " + kegysxyocbVar);
    }

    private final gh.dxjokdxxww ppxfxbqfkf() {
        return this.f116938iobyxmoadg.wflxmlrfwp();
    }

    private final gg.vdvldrhtss wkgbmnqykc(di.zoijcleaow.C0572zoijcleaow c0572zoijcleaow, Map map, fi.ppxfxbqfkf ppxfxbqfkfVar) {
        iyctptxqzt iyctptxqztVar = (iyctptxqzt) map.get(jpowsppfya.zoijcleaow(ppxfxbqfkfVar, c0572zoijcleaow.lereixgezr()));
        if (iyctptxqztVar == null) {
            return null;
        }
        ii.gxszxtbevo gxszxtbevoVarZoijcleaow = jpowsppfya.zoijcleaow(ppxfxbqfkfVar, c0572zoijcleaow.lereixgezr());
        zi.kegysxyocb type = iyctptxqztVar.getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf ppxfxbqfkfVarPmvmpeiblj = c0572zoijcleaow.pmvmpeiblj();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarPmvmpeiblj, "getValue(...)");
        return new gg.vdvldrhtss(gxszxtbevoVarZoijcleaow, lqeggnwhkg(type, ppxfxbqfkfVarPmvmpeiblj, ppxfxbqfkfVar));
    }

    private final boolean zoijcleaow(ni.lqeggnwhkg lqeggnwhkgVar, zi.kegysxyocb kegysxyocbVar, di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar) {
        di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf enumC0573ppxfxbqfkfCrxdokpmqz = ppxfxbqfkfVar.crxdokpmqz();
        int i13 = enumC0573ppxfxbqfkfCrxdokpmqz == null ? -1 : iobyxmoadg.f116940iobyxmoadg[enumC0573ppxfxbqfkfCrxdokpmqz.ordinal()];
        if (i13 == 10) {
            jh.nufgyqmvbu nufgyqmvbuVarYlkuphrtab = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
            jh.eablkybsjg eablkybsjgVar = nufgyqmvbuVarYlkuphrtab instanceof jh.eablkybsjg ? (jh.eablkybsjg) nufgyqmvbuVarYlkuphrtab : null;
            if (eablkybsjgVar != null && !gh.dxjokdxxww.ydmasvzmpa(eablkybsjgVar)) {
                return false;
            }
        } else {
            if (i13 != 13) {
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkgVar.iobyxmoadg(this.f116938iobyxmoadg), kegysxyocbVar);
            }
            if (!(lqeggnwhkgVar instanceof ni.zoijcleaow) || ((List) ((ni.zoijcleaow) lqeggnwhkgVar).zoijcleaow()).size() != ppxfxbqfkfVar.cllcsxoeiz().size()) {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + lqeggnwhkgVar).toString());
            }
            zi.kegysxyocb kegysxyocbVarGtknphoqwx = ppxfxbqfkf().gtknphoqwx(kegysxyocbVar);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kegysxyocbVarGtknphoqwx, "getArrayElementType(...)");
            ni.zoijcleaow zoijcleaowVar = (ni.zoijcleaow) lqeggnwhkgVar;
            Iterable iterableAgtfadlqog = hg.jyumaefscl.agtfadlqog((Collection) zoijcleaowVar.zoijcleaow());
            if (!(iterableAgtfadlqog instanceof Collection) || !((Collection) iterableAgtfadlqog).isEmpty()) {
                Iterator it = iterableAgtfadlqog.iterator();
                while (it.hasNext()) {
                    int iIobyxmoadg = ((hg.stevsuqkhv) it).iobyxmoadg();
                    ni.lqeggnwhkg lqeggnwhkgVar2 = (ni.lqeggnwhkg) ((List) zoijcleaowVar.zoijcleaow()).get(iIobyxmoadg);
                    di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf ppxfxbqfkfVarJpowsppfya = ppxfxbqfkfVar.jpowsppfya(iIobyxmoadg);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarJpowsppfya, "getArrayElement(...)");
                    if (!zoijcleaow(lqeggnwhkgVar2, kegysxyocbVarGtknphoqwx, ppxfxbqfkfVarJpowsppfya)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final ni.lqeggnwhkg gxszxtbevo(zi.kegysxyocb expectedType, di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf value, fi.ppxfxbqfkf nameResolver) {
        ni.lqeggnwhkg pmvmpeibljVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(expectedType, "expectedType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        Boolean boolWkgbmnqykc = fi.zoijcleaow.f33944wypolnanlu.wkgbmnqykc(value.mbcevpiqjq());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(boolWkgbmnqykc, "get(...)");
        boolean zBooleanValue = boolWkgbmnqykc.booleanValue();
        di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf.EnumC0573ppxfxbqfkf enumC0573ppxfxbqfkfCrxdokpmqz = value.crxdokpmqz();
        switch (enumC0573ppxfxbqfkfCrxdokpmqz == null ? -1 : iobyxmoadg.f116940iobyxmoadg[enumC0573ppxfxbqfkfCrxdokpmqz.ordinal()]) {
            case 1:
                byte bUlzqkzuiru = (byte) value.ulzqkzuiru();
                pmvmpeibljVar = zBooleanValue ? new ni.pmvmpeiblj(bUlzqkzuiru) : new ni.wkgbmnqykc(bUlzqkzuiru);
                break;
            case 2:
                return new ni.eablkybsjg((char) value.ulzqkzuiru());
            case 3:
                short sUlzqkzuiru = (short) value.ulzqkzuiru();
                pmvmpeibljVar = zBooleanValue ? new ni.cdpycssgdh(sUlzqkzuiru) : new ni.iwizpuwonk(sUlzqkzuiru);
                break;
            case 4:
                int iUlzqkzuiru = (int) value.ulzqkzuiru();
                pmvmpeibljVar = zBooleanValue ? new ni.zynmafqrjb(iUlzqkzuiru) : new ni.agtfadlqog(iUlzqkzuiru);
                break;
            case 5:
                long jUlzqkzuiru = value.ulzqkzuiru();
                return zBooleanValue ? new ni.istkbnxepw(jUlzqkzuiru) : new ni.zdlpuopuiu(jUlzqkzuiru);
            case 6:
                return new ni.wflxmlrfwp(value.ntlheqmsrt());
            case 7:
                return new ni.btonecajqb(value.stevsuqkhv());
            case 8:
                return new ni.ppxfxbqfkf(value.ulzqkzuiru() != 0);
            case 9:
                return new ni.cqumvgiudr(nameResolver.getString(value.sopmlzcsov()));
            case 10:
                return new ni.kcexrzcfyt(jpowsppfya.iobyxmoadg(nameResolver, value.dsvhmnatus()), value.hcddaimhww());
            case 11:
                return new ni.gtknphoqwx(jpowsppfya.iobyxmoadg(nameResolver, value.dsvhmnatus()), jpowsppfya.zoijcleaow(nameResolver, value.tzroggbefp()));
            case 12:
                di.zoijcleaow zoijcleaowVarPkzmftpjix = value.pkzmftpjix();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVarPkzmftpjix, "getAnnotation(...)");
                return new ni.iobyxmoadg(iobyxmoadg(zoijcleaowVarPkzmftpjix, nameResolver));
            case 13:
                ni.dxjokdxxww dxjokdxxwwVar = ni.dxjokdxxww.f70090iobyxmoadg;
                List<di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf> listCllcsxoeiz = value.cllcsxoeiz();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listCllcsxoeiz, "getArrayElementList(...)");
                ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listCllcsxoeiz, 10));
                for (di.zoijcleaow.C0572zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar : listCllcsxoeiz) {
                    ikoacuggdj ikoacuggdjVarDxjokdxxww = ppxfxbqfkf().dxjokdxxww();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarDxjokdxxww, "getAnyType(...)");
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ppxfxbqfkfVar);
                    arrayList.add(gxszxtbevo(ikoacuggdjVarDxjokdxxww, ppxfxbqfkfVar, nameResolver));
                }
                return dxjokdxxwwVar.ppxfxbqfkf(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.crxdokpmqz() + " (expected " + expectedType + ')').toString());
        }
        return pmvmpeibljVar;
    }

    public final kh.ppxfxbqfkf iobyxmoadg(di.zoijcleaow proto, fi.ppxfxbqfkf nameResolver) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        jh.eablkybsjg eablkybsjgVarEablkybsjg = eablkybsjg(jpowsppfya.iobyxmoadg(nameResolver, proto.cdpycssgdh()));
        Map mapDxjokdxxww = hg.tzroggbefp.dxjokdxxww();
        if (proto.pmvmpeiblj() != 0 && !bj.draadjrbmk.wflxmlrfwp(eablkybsjgVarEablkybsjg) && li.dxjokdxxww.zdlpuopuiu(eablkybsjgVarEablkybsjg)) {
            Collection collectionGtknphoqwx = eablkybsjgVarEablkybsjg.gtknphoqwx();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionGtknphoqwx, "getConstructors(...)");
            jh.wkgbmnqykc wkgbmnqykcVar = (jh.wkgbmnqykc) hg.jyumaefscl.eslsurpljm(collectionGtknphoqwx);
            if (wkgbmnqykcVar != null) {
                List listDxjokdxxww = wkgbmnqykcVar.dxjokdxxww();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
                LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(hg.jyumaefscl.cqumvgiudr(listDxjokdxxww, 10)), 16));
                for (Object obj : listDxjokdxxww) {
                    linkedHashMap.put(((iyctptxqzt) obj).getName(), obj);
                }
                List<di.zoijcleaow.C0572zoijcleaow> listZynmafqrjb = proto.zynmafqrjb();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listZynmafqrjb, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (di.zoijcleaow.C0572zoijcleaow c0572zoijcleaow : listZynmafqrjb) {
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(c0572zoijcleaow);
                    gg.vdvldrhtss vdvldrhtssVarWkgbmnqykc = wkgbmnqykc(c0572zoijcleaow, linkedHashMap, nameResolver);
                    if (vdvldrhtssVarWkgbmnqykc != null) {
                        arrayList.add(vdvldrhtssVarWkgbmnqykc);
                    }
                }
                mapDxjokdxxww = hg.tzroggbefp.kcexrzcfyt(arrayList);
            }
        }
        return new kh.wkgbmnqykc(eablkybsjgVarEablkybsjg.ojitshcjhn(), mapDxjokdxxww, xrmfcynszj.f51348iobyxmoadg);
    }
}
