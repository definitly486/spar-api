package dh;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pmvmpeiblj implements ah.ppxfxbqfkf, b {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final e.iobyxmoadg f28297cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final gg.gtknphoqwx f28298esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final e.iobyxmoadg f28299iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final e.iobyxmoadg f28300jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final e.iobyxmoadg f28301yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final e.iobyxmoadg f28302zdlpuopuiu;

    public static final class iobyxmoadg implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(((ah.btonecajqb) obj).getName(), ((ah.btonecajqb) obj2).getName());
        }
    }

    public pmvmpeiblj() {
        e.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = e.ppxfxbqfkf(new vdvldrhtss(this));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "lazySoft(...)");
        this.f28302zdlpuopuiu = iobyxmoadgVarPpxfxbqfkf;
        e.iobyxmoadg iobyxmoadgVarPpxfxbqfkf2 = e.ppxfxbqfkf(new oxmwwwfdhm(this));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf2, "lazySoft(...)");
        this.f28301yggfygwlhe = iobyxmoadgVarPpxfxbqfkf2;
        e.iobyxmoadg iobyxmoadgVarPpxfxbqfkf3 = e.ppxfxbqfkf(new kcexrzcfyt(this));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf3, "lazySoft(...)");
        this.f28300jyumaefscl = iobyxmoadgVarPpxfxbqfkf3;
        e.iobyxmoadg iobyxmoadgVarPpxfxbqfkf4 = e.ppxfxbqfkf(new zdlpuopuiu(this));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf4, "lazySoft(...)");
        this.f28299iwizpuwonk = iobyxmoadgVarPpxfxbqfkf4;
        e.iobyxmoadg iobyxmoadgVarPpxfxbqfkf5 = e.ppxfxbqfkf(new yggfygwlhe(this));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf5, "lazySoft(...)");
        this.f28297cqumvgiudr = iobyxmoadgVarPpxfxbqfkf5;
        this.f28298esjtqupxsv = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.PUBLICATION, new jyumaefscl(this));
    }

    private final Object[] cllcsxoeiz() {
        return (Object[]) ((Object[]) this.f28297cqumvgiudr.invoke()).clone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList eablkybsjg(pmvmpeiblj pmvmpeibljVar) {
        int i13;
        jh.zoijcleaow zoijcleaowVarSopmlzcsov = pmvmpeibljVar.sopmlzcsov();
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        if (pmvmpeibljVar.ntlheqmsrt()) {
            i13 = 0;
        } else {
            jh.vipkmwdibw vipkmwdibwVarDxjokdxxww = n.dxjokdxxww(zoijcleaowVarSopmlzcsov);
            if (vipkmwdibwVarDxjokdxxww != null) {
                arrayList.add(new roivzttewh(pmvmpeibljVar, 0, ah.btonecajqb.iobyxmoadg.INSTANCE, new iwizpuwonk(vipkmwdibwVarDxjokdxxww)));
                i13 = 1;
            } else {
                i13 = 0;
            }
            jh.vipkmwdibw vipkmwdibwVarHkdspvbjdz = zoijcleaowVarSopmlzcsov.hkdspvbjdz();
            if (vipkmwdibwVarHkdspvbjdz != null) {
                arrayList.add(new roivzttewh(pmvmpeibljVar, i13, ah.btonecajqb.iobyxmoadg.EXTENSION_RECEIVER, new cqumvgiudr(vipkmwdibwVarHkdspvbjdz)));
                i13++;
            }
        }
        int size = zoijcleaowVarSopmlzcsov.dxjokdxxww().size();
        while (i14 < size) {
            arrayList.add(new roivzttewh(pmvmpeibljVar, i13, ah.btonecajqb.iobyxmoadg.VALUE, new esjtqupxsv(zoijcleaowVarSopmlzcsov, i14)));
            i14++;
            i13++;
        }
        if (pmvmpeibljVar.mbcevpiqjq() && (zoijcleaowVarSopmlzcsov instanceof uh.iobyxmoadg) && arrayList.size() > 1) {
            hg.jyumaefscl.zynmafqrjb(arrayList, new iobyxmoadg());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List esjtqupxsv(pmvmpeiblj pmvmpeibljVar) {
        List<jh.yfnezrywwk> typeParameters = pmvmpeibljVar.sopmlzcsov().getTypeParameters();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(typeParameters, 10));
        for (jh.yfnezrywwk yfnezrywwkVar : typeParameters) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(yfnezrywwkVar);
            arrayList.add(new a(pmvmpeibljVar, yfnezrywwkVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.ntlheqmsrt gtknphoqwx(jh.vipkmwdibw vipkmwdibwVar) {
        return vipkmwdibwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.ntlheqmsrt gxszxtbevo(jh.vipkmwdibw vipkmwdibwVar) {
        return vipkmwdibwVar;
    }

    private final Type hkdspvbjdz() {
        Type[] lowerBounds;
        if (!isSuspend()) {
            return null;
        }
        Object objLxfrhoxuzk = hg.jyumaefscl.lxfrhoxuzk(dsvhmnatus().iobyxmoadg());
        ParameterizedType parameterizedType = objLxfrhoxuzk instanceof ParameterizedType ? (ParameterizedType) objLxfrhoxuzk : null;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(parameterizedType != null ? parameterizedType.getRawType() : null, lg.gxszxtbevo.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(actualTypeArguments, "getActualTypeArguments(...)");
        Object objIxidwrxhsl = hg.agtfadlqog.ixidwrxhsl(actualTypeArguments);
        WildcardType wildcardType = objIxidwrxhsl instanceof WildcardType ? (WildcardType) objIxidwrxhsl : null;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) hg.agtfadlqog.yfnezrywwk(lowerBounds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type iwizpuwonk(pmvmpeiblj pmvmpeibljVar) {
        Type typeHkdspvbjdz = pmvmpeibljVar.hkdspvbjdz();
        return typeHkdspvbjdz == null ? pmvmpeibljVar.dsvhmnatus().getReturnType() : typeHkdspvbjdz;
    }

    private final Object jpowsppfya(ah.ojitshcjhn ojitshcjhnVar) {
        Class clsZoijcleaow = sg.iobyxmoadg.zoijcleaow(ch.zoijcleaow.zoijcleaow(ojitshcjhnVar));
        if (clsZoijcleaow.isArray()) {
            Object objNewInstance = Array.newInstance(clsZoijcleaow.getComponentType(), 0);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new c("Cannot instantiate the default empty array of type " + clsZoijcleaow.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eslsurpljm oxmwwwfdhm(pmvmpeiblj pmvmpeibljVar) {
        zi.kegysxyocb returnType = pmvmpeibljVar.sopmlzcsov().getReturnType();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(returnType);
        return new eslsurpljm(returnType, new lereixgezr(pmvmpeibljVar));
    }

    private final Object pkzmftpjix(Map map) throws IllegalCallableAccessException {
        Object objJpowsppfya;
        List<ah.btonecajqb> parameters = getParameters();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(parameters, 10));
        for (ah.btonecajqb btonecajqbVar : parameters) {
            if (map.containsKey(btonecajqbVar)) {
                objJpowsppfya = map.get(btonecajqbVar);
                if (objJpowsppfya == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + btonecajqbVar + ')');
                }
            } else if (btonecajqbVar.cqumvgiudr()) {
                objJpowsppfya = null;
            } else {
                if (!btonecajqbVar.btonecajqb()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + btonecajqbVar);
                }
                objJpowsppfya = jpowsppfya(btonecajqbVar.getType());
            }
            arrayList.add(objJpowsppfya);
        }
        eh.nufgyqmvbu nufgyqmvbuVarStevsuqkhv = stevsuqkhv();
        if (nufgyqmvbuVarStevsuqkhv != null) {
            try {
                return nufgyqmvbuVarStevsuqkhv.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e13) {
                throw new IllegalCallableAccessException(e13);
            }
        }
        throw new c("This callable does not support a default call: " + sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar) {
        return n.eablkybsjg(pmvmpeibljVar.sopmlzcsov());
    }

    private final int tzroggbefp(ah.btonecajqb btonecajqbVar) {
        if (!((Boolean) this.f28298esjtqupxsv.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!n.gtknphoqwx(btonecajqbVar.getType())) {
            return 1;
        }
        ah.ojitshcjhn type = btonecajqbVar.getType();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List listAgtfadlqog = eh.ojitshcjhn.agtfadlqog(zi.lxfrhoxuzk.iobyxmoadg(((eslsurpljm) type).oxmwwwfdhm()));
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(listAgtfadlqog);
        return listAgtfadlqog.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ulzqkzuiru(pmvmpeiblj pmvmpeibljVar) {
        List parameters = pmvmpeibljVar.getParameters();
        if (parameters != null && parameters.isEmpty()) {
            return false;
        }
        Iterator it = parameters.iterator();
        while (it.hasNext()) {
            if (n.gtknphoqwx(((ah.btonecajqb) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.ntlheqmsrt wflxmlrfwp(jh.zoijcleaow zoijcleaowVar, int i13) {
        Object obj = zoijcleaowVar.dxjokdxxww().get(i13);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(obj, "get(...)");
        return (jh.ntlheqmsrt) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] zoijcleaow(pmvmpeiblj pmvmpeibljVar) {
        int iTzroggbefp;
        List<ah.btonecajqb> parameters = pmvmpeibljVar.getParameters();
        int size = parameters.size() + (pmvmpeibljVar.isSuspend() ? 1 : 0);
        if (((Boolean) pmvmpeibljVar.f28298esjtqupxsv.getValue()).booleanValue()) {
            iTzroggbefp = 0;
            for (ah.btonecajqb btonecajqbVar : parameters) {
                iTzroggbefp += btonecajqbVar.getKind() == ah.btonecajqb.iobyxmoadg.VALUE ? pmvmpeibljVar.tzroggbefp(btonecajqbVar) : 0;
            }
        } else if (parameters.isEmpty()) {
            iTzroggbefp = 0;
        } else {
            Iterator it = parameters.iterator();
            iTzroggbefp = 0;
            while (it.hasNext()) {
                if (((ah.btonecajqb) it.next()).getKind() == ah.btonecajqb.iobyxmoadg.VALUE && (iTzroggbefp = iTzroggbefp + 1) < 0) {
                    hg.jyumaefscl.jyumaefscl();
                }
            }
        }
        int i13 = (iTzroggbefp + 31) / 32;
        Object[] objArr = new Object[size + i13 + 1];
        for (ah.btonecajqb btonecajqbVar2 : parameters) {
            if (btonecajqbVar2.cqumvgiudr() && !n.draadjrbmk(btonecajqbVar2.getType())) {
                objArr[btonecajqbVar2.getIndex()] = n.lqeggnwhkg(ch.ppxfxbqfkf.gxszxtbevo(btonecajqbVar2.getType()));
            } else if (btonecajqbVar2.btonecajqb()) {
                objArr[btonecajqbVar2.getIndex()] = pmvmpeibljVar.jpowsppfya(btonecajqbVar2.getType());
            }
        }
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[size + i14] = 0;
        }
        return objArr;
    }

    @Override // ah.ppxfxbqfkf
    public Object call(Object... args) throws IllegalCallableAccessException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        try {
            return dsvhmnatus().call(args);
        } catch (IllegalAccessException e13) {
            throw new IllegalCallableAccessException(e13);
        }
    }

    @Override // ah.ppxfxbqfkf
    public Object callBy(Map args) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        return mbcevpiqjq() ? pkzmftpjix(args) : hcddaimhww(args, null);
    }

    public abstract eh.nufgyqmvbu dsvhmnatus();

    @Override // ah.zoijcleaow
    public List getAnnotations() {
        Object objInvoke = this.f28302zdlpuopuiu.invoke();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // ah.ppxfxbqfkf
    public List getParameters() {
        Object objInvoke = this.f28301yggfygwlhe.invoke();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // ah.ppxfxbqfkf
    public ah.ojitshcjhn getReturnType() {
        Object objInvoke = this.f28300jyumaefscl.invoke();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objInvoke, "invoke(...)");
        return (ah.ojitshcjhn) objInvoke;
    }

    @Override // ah.ppxfxbqfkf
    public List getTypeParameters() {
        Object objInvoke = this.f28299iwizpuwonk.invoke();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // ah.ppxfxbqfkf
    public ah.kcexrzcfyt getVisibility() {
        jh.yggfygwlhe visibility = sopmlzcsov().getVisibility();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(visibility, "getVisibility(...)");
        return n.oxmwwwfdhm(visibility);
    }

    public final Object hcddaimhww(Map args, lg.gxszxtbevo gxszxtbevoVar) throws IllegalCallableAccessException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        List<ah.btonecajqb> parameters = getParameters();
        boolean z13 = false;
        if (parameters.isEmpty()) {
            try {
                return dsvhmnatus().call(isSuspend() ? new lg.gxszxtbevo[]{gxszxtbevoVar} : new lg.gxszxtbevo[0]);
            } catch (IllegalAccessException e13) {
                throw new IllegalCallableAccessException(e13);
            }
        }
        int size = parameters.size() + (isSuspend() ? 1 : 0);
        Object[] objArrCllcsxoeiz = cllcsxoeiz();
        if (isSuspend()) {
            objArrCllcsxoeiz[parameters.size()] = gxszxtbevoVar;
        }
        boolean zBooleanValue = ((Boolean) this.f28298esjtqupxsv.getValue()).booleanValue();
        int i13 = 0;
        for (ah.btonecajqb btonecajqbVar : parameters) {
            int iTzroggbefp = zBooleanValue ? tzroggbefp(btonecajqbVar) : 1;
            if (args.containsKey(btonecajqbVar)) {
                objArrCllcsxoeiz[btonecajqbVar.getIndex()] = args.get(btonecajqbVar);
            } else if (btonecajqbVar.cqumvgiudr()) {
                if (zBooleanValue) {
                    int i14 = i13 + iTzroggbefp;
                    for (int i15 = i13; i15 < i14; i15++) {
                        int i16 = (i15 / 32) + size;
                        Object obj = objArrCllcsxoeiz[i16];
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Int");
                        objArrCllcsxoeiz[i16] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i15 % 32)));
                    }
                } else {
                    int i17 = (i13 / 32) + size;
                    Object obj2 = objArrCllcsxoeiz[i17];
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.Int");
                    objArrCllcsxoeiz[i17] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i13 % 32)));
                }
                z13 = true;
            } else if (!btonecajqbVar.btonecajqb()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + btonecajqbVar);
            }
            if (btonecajqbVar.getKind() == ah.btonecajqb.iobyxmoadg.VALUE) {
                i13 += iTzroggbefp;
            }
        }
        if (!z13) {
            try {
                eh.nufgyqmvbu nufgyqmvbuVarDsvhmnatus = dsvhmnatus();
                Object[] objArrCopyOf = Arrays.copyOf(objArrCllcsxoeiz, size);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
                return nufgyqmvbuVarDsvhmnatus.call(objArrCopyOf);
            } catch (IllegalAccessException e14) {
                throw new IllegalCallableAccessException(e14);
            }
        }
        eh.nufgyqmvbu nufgyqmvbuVarStevsuqkhv = stevsuqkhv();
        if (nufgyqmvbuVarStevsuqkhv != null) {
            try {
                return nufgyqmvbuVarStevsuqkhv.call(objArrCllcsxoeiz);
            } catch (IllegalAccessException e15) {
                throw new IllegalCallableAccessException(e15);
            }
        }
        throw new c("This callable does not support a default call: " + sopmlzcsov());
    }

    @Override // ah.ppxfxbqfkf
    public boolean isAbstract() {
        return sopmlzcsov().vdvldrhtss() == jh.cdpycssgdh.ABSTRACT;
    }

    @Override // ah.ppxfxbqfkf
    public boolean isFinal() {
        return sopmlzcsov().vdvldrhtss() == jh.cdpycssgdh.FINAL;
    }

    @Override // ah.ppxfxbqfkf
    public boolean isOpen() {
        return sopmlzcsov().vdvldrhtss() == jh.cdpycssgdh.OPEN;
    }

    /* JADX INFO: renamed from: kegysxyocb */
    public abstract jh.zoijcleaow sopmlzcsov();

    protected final boolean mbcevpiqjq() {
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getName(), "<init>") && wypolnanlu().zoijcleaow().isAnnotation();
    }

    public abstract boolean ntlheqmsrt();

    public abstract eh.nufgyqmvbu stevsuqkhv();

    public abstract ikoacuggdj wypolnanlu();
}
