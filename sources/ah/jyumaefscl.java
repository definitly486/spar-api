package ah;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jyumaefscl {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f1886iobyxmoadg;

        static {
            int[] iArr = new int[oxmwwwfdhm.values().length];
            try {
                iArr[oxmwwwfdhm.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oxmwwwfdhm.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oxmwwwfdhm.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1886iobyxmoadg = iArr;
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f1887zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Class invoke(Class p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return p13.getComponentType();
        }
    }

    private static final Type eablkybsjg(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(lqeggnwhkg((vdvldrhtss) it.next()));
            }
            return new zdlpuopuiu(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(lqeggnwhkg((vdvldrhtss) it2.next()));
            }
            return new zdlpuopuiu(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeEablkybsjg = eablkybsjg(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(lqeggnwhkg((vdvldrhtss) it3.next()));
        }
        return new zdlpuopuiu(cls, typeEablkybsjg, arrayList3);
    }

    public static final Type gxszxtbevo(ojitshcjhn ojitshcjhnVar) {
        Type typeLqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ojitshcjhnVar, "<this>");
        return (!(ojitshcjhnVar instanceof kotlin.jvm.internal.yggfygwlhe) || (typeLqeggnwhkg = ((kotlin.jvm.internal.yggfygwlhe) ojitshcjhnVar).lqeggnwhkg()) == null) ? wkgbmnqykc(ojitshcjhnVar, false, 1, null) : typeLqeggnwhkg;
    }

    private static final Type lqeggnwhkg(vdvldrhtss vdvldrhtssVar) {
        oxmwwwfdhm oxmwwwfdhmVarWkgbmnqykc = vdvldrhtssVar.wkgbmnqykc();
        if (oxmwwwfdhmVarWkgbmnqykc == null) {
            return iwizpuwonk.f1883jyumaefscl.iobyxmoadg();
        }
        ojitshcjhn ojitshcjhnVarPpxfxbqfkf = vdvldrhtssVar.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ojitshcjhnVarPpxfxbqfkf);
        int i13 = iobyxmoadg.f1886iobyxmoadg[oxmwwwfdhmVarWkgbmnqykc.ordinal()];
        if (i13 == 1) {
            return new iwizpuwonk(null, ppxfxbqfkf(ojitshcjhnVarPpxfxbqfkf, true));
        }
        if (i13 == 2) {
            return ppxfxbqfkf(ojitshcjhnVarPpxfxbqfkf, true);
        }
        if (i13 == 3) {
            return new iwizpuwonk(ppxfxbqfkf(ojitshcjhnVarPpxfxbqfkf, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nufgyqmvbu(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            return name;
        }
        lj.btonecajqb btonecajqbVarAgtfadlqog = lj.wflxmlrfwp.agtfadlqog(type, zoijcleaow.f1887zdlpuopuiu);
        return ((Class) lj.wflxmlrfwp.cllcsxoeiz(btonecajqbVarAgtfadlqog)).getName() + mj.kcexrzcfyt.lmojexxdyd("[]", lj.wflxmlrfwp.cqumvgiudr(btonecajqbVarAgtfadlqog));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type ppxfxbqfkf(ojitshcjhn ojitshcjhnVar, boolean z13) {
        eablkybsjg eablkybsjgVarAgtfadlqog = ojitshcjhnVar.agtfadlqog();
        if (eablkybsjgVarAgtfadlqog instanceof rgvfuqvkyq) {
            return new yggfygwlhe((rgvfuqvkyq) eablkybsjgVarAgtfadlqog);
        }
        if (!(eablkybsjgVarAgtfadlqog instanceof wkgbmnqykc)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + ojitshcjhnVar);
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) eablkybsjgVarAgtfadlqog;
        Class clsPpxfxbqfkf = z13 ? sg.iobyxmoadg.ppxfxbqfkf(wkgbmnqykcVar) : sg.iobyxmoadg.zoijcleaow(wkgbmnqykcVar);
        List listOjitshcjhn = ojitshcjhnVar.ojitshcjhn();
        if (listOjitshcjhn.isEmpty()) {
            return clsPpxfxbqfkf;
        }
        if (!clsPpxfxbqfkf.isArray()) {
            return eablkybsjg(clsPpxfxbqfkf, listOjitshcjhn);
        }
        if (clsPpxfxbqfkf.getComponentType().isPrimitive()) {
            return clsPpxfxbqfkf;
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) hg.jyumaefscl.krqnebusok(listOjitshcjhn);
        if (vdvldrhtssVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + ojitshcjhnVar);
        }
        oxmwwwfdhm oxmwwwfdhmVarIobyxmoadg = vdvldrhtssVar.iobyxmoadg();
        ojitshcjhn ojitshcjhnVarZoijcleaow = vdvldrhtssVar.zoijcleaow();
        int i13 = oxmwwwfdhmVarIobyxmoadg == null ? -1 : iobyxmoadg.f1886iobyxmoadg[oxmwwwfdhmVarIobyxmoadg.ordinal()];
        if (i13 == -1 || i13 == 1) {
            return clsPpxfxbqfkf;
        }
        if (i13 != 2 && i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ojitshcjhnVarZoijcleaow);
        Type typeWkgbmnqykc = wkgbmnqykc(ojitshcjhnVarZoijcleaow, false, 1, null);
        return typeWkgbmnqykc instanceof Class ? clsPpxfxbqfkf : new ah.iobyxmoadg(typeWkgbmnqykc);
    }

    static /* synthetic */ Type wkgbmnqykc(ojitshcjhn ojitshcjhnVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        return ppxfxbqfkf(ojitshcjhnVar, z13);
    }
}
