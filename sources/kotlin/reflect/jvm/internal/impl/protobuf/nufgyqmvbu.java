package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu extends kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg implements Serializable {

    static final class eablkybsjg implements lqeggnwhkg.zoijcleaow {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final boolean f60129cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final boolean f60130iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final jyumaefscl.zoijcleaow f60131jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final int f60132yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final dxjokdxxww.zoijcleaow f60133zdlpuopuiu;

        eablkybsjg(dxjokdxxww.zoijcleaow zoijcleaowVar, int i13, jyumaefscl.zoijcleaow zoijcleaowVar2, boolean z13, boolean z14) {
            this.f60133zdlpuopuiu = zoijcleaowVar;
            this.f60132yggfygwlhe = i13;
            this.f60131jyumaefscl = zoijcleaowVar2;
            this.f60130iwizpuwonk = z13;
            this.f60129cqumvgiudr = z14;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.lqeggnwhkg.zoijcleaow
        public jyumaefscl.ppxfxbqfkf getLiteJavaType() {
            return this.f60131jyumaefscl.iobyxmoadg();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.lqeggnwhkg.zoijcleaow
        public jyumaefscl.zoijcleaow getLiteType() {
            return this.f60131jyumaefscl;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.lqeggnwhkg.zoijcleaow
        public int getNumber() {
            return this.f60132yggfygwlhe;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compareTo(eablkybsjg eablkybsjgVar) {
            return this.f60132yggfygwlhe - eablkybsjgVar.f60132yggfygwlhe;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.lqeggnwhkg.zoijcleaow
        public boolean isPacked() {
            return this.f60129cqumvgiudr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.lqeggnwhkg.zoijcleaow
        public boolean isRepeated() {
            return this.f60130iwizpuwonk;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.lqeggnwhkg.zoijcleaow
        public agtfadlqog.iobyxmoadg yggfygwlhe(agtfadlqog.iobyxmoadg iobyxmoadgVar, agtfadlqog agtfadlqogVar) {
            return ((zoijcleaow) iobyxmoadgVar).wkgbmnqykc((nufgyqmvbu) agtfadlqogVar);
        }

        public dxjokdxxww.zoijcleaow zoijcleaow() {
            return this.f60133zdlpuopuiu;
        }
    }

    public static class gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final Class f60134eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final Method f60135gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final agtfadlqog f60136iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final agtfadlqog f60137ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final eablkybsjg f60138wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Object f60139zoijcleaow;

        gxszxtbevo(agtfadlqog agtfadlqogVar, Object obj, agtfadlqog agtfadlqogVar2, eablkybsjg eablkybsjgVar, Class cls) {
            if (agtfadlqogVar == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eablkybsjgVar.getLiteType() == jyumaefscl.zoijcleaow.f60093iozdgvuglv && agtfadlqogVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f60136iobyxmoadg = agtfadlqogVar;
            this.f60139zoijcleaow = obj;
            this.f60137ppxfxbqfkf = agtfadlqogVar2;
            this.f60138wkgbmnqykc = eablkybsjgVar;
            this.f60134eablkybsjg = cls;
            if (dxjokdxxww.iobyxmoadg.class.isAssignableFrom(cls)) {
                this.f60135gxszxtbevo = nufgyqmvbu.dxjokdxxww(cls, "valueOf", Integer.TYPE);
            } else {
                this.f60135gxszxtbevo = null;
            }
        }

        Object eablkybsjg(Object obj) {
            return this.f60138wkgbmnqykc.getLiteJavaType() == jyumaefscl.ppxfxbqfkf.ENUM ? nufgyqmvbu.btonecajqb(this.f60135gxszxtbevo, null, (Integer) obj) : obj;
        }

        Object gxszxtbevo(Object obj) {
            return this.f60138wkgbmnqykc.getLiteJavaType() == jyumaefscl.ppxfxbqfkf.ENUM ? Integer.valueOf(((dxjokdxxww.iobyxmoadg) obj).getNumber()) : obj;
        }

        Object iobyxmoadg(Object obj) {
            if (!this.f60138wkgbmnqykc.isRepeated()) {
                return eablkybsjg(obj);
            }
            if (this.f60138wkgbmnqykc.getLiteJavaType() != jyumaefscl.ppxfxbqfkf.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(eablkybsjg(it.next()));
            }
            return arrayList;
        }

        public agtfadlqog ppxfxbqfkf() {
            return this.f60137ppxfxbqfkf;
        }

        public int wkgbmnqykc() {
            return this.f60138wkgbmnqykc.getNumber();
        }

        public agtfadlqog zoijcleaow() {
            return this.f60136iobyxmoadg;
        }
    }

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f60140iobyxmoadg;

        static {
            int[] iArr = new int[jyumaefscl.ppxfxbqfkf.values().length];
            f60140iobyxmoadg = iArr;
            try {
                iArr[jyumaefscl.ppxfxbqfkf.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60140iobyxmoadg[jyumaefscl.ppxfxbqfkf.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class ppxfxbqfkf extends zoijcleaow implements ojitshcjhn {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private boolean f60141jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private lqeggnwhkg f60142yggfygwlhe = lqeggnwhkg.lqeggnwhkg();

        protected ppxfxbqfkf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public lqeggnwhkg lqeggnwhkg() {
            this.f60142yggfygwlhe.vdvldrhtss();
            this.f60141jyumaefscl = false;
            return this.f60142yggfygwlhe;
        }

        private void nufgyqmvbu() {
            if (this.f60141jyumaefscl) {
                return;
            }
            this.f60142yggfygwlhe = this.f60142yggfygwlhe.clone();
            this.f60141jyumaefscl = true;
        }

        protected final void gtknphoqwx(wkgbmnqykc wkgbmnqykcVar) {
            nufgyqmvbu();
            this.f60142yggfygwlhe.oxmwwwfdhm(wkgbmnqykcVar.f60143yggfygwlhe);
        }
    }

    public static abstract class zoijcleaow extends kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg.AbstractC1196iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f60148zdlpuopuiu = kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.f60173zdlpuopuiu;

        protected zoijcleaow() {
        }

        public final zoijcleaow eablkybsjg(kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar) {
            this.f60148zdlpuopuiu = wkgbmnqykcVar;
            return this;
        }

        public final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc ppxfxbqfkf() {
            return this.f60148zdlpuopuiu;
        }

        public abstract zoijcleaow wkgbmnqykc(nufgyqmvbu nufgyqmvbuVar);
    }

    protected nufgyqmvbu() {
    }

    public static gxszxtbevo agtfadlqog(agtfadlqog agtfadlqogVar, agtfadlqog agtfadlqogVar2, dxjokdxxww.zoijcleaow zoijcleaowVar, int i13, jyumaefscl.zoijcleaow zoijcleaowVar2, boolean z13, Class cls) {
        return new gxszxtbevo(agtfadlqogVar, Collections.emptyList(), agtfadlqogVar2, new eablkybsjg(zoijcleaowVar, i13, zoijcleaowVar2, true, z13), cls);
    }

    static Object btonecajqb(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e13);
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    static Method dxjokdxxww(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e13) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb3 = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb3.append("Generated message class \"");
            sb3.append(name);
            sb3.append("\" missing method \"");
            sb3.append(strValueOf);
            sb3.append("\".");
            throw new RuntimeException(sb3.toString(), e13);
        }
    }

    public static gxszxtbevo ojitshcjhn(agtfadlqog agtfadlqogVar, Object obj, agtfadlqog agtfadlqogVar2, dxjokdxxww.zoijcleaow zoijcleaowVar, int i13, jyumaefscl.zoijcleaow zoijcleaowVar2, Class cls) {
        return new gxszxtbevo(agtfadlqogVar, obj, agtfadlqogVar2, new eablkybsjg(zoijcleaowVar, i13, zoijcleaowVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    public static boolean vdvldrhtss(lqeggnwhkg lqeggnwhkgVar, agtfadlqog agtfadlqogVar, kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar, int i13) throws IOException {
        boolean z13;
        boolean z14;
        Object objBuild;
        agtfadlqog agtfadlqogVar2;
        int iZoijcleaow = jyumaefscl.zoijcleaow(i13);
        gxszxtbevo gxszxtbevoVarZoijcleaow = gxszxtbevoVar.zoijcleaow(agtfadlqogVar, jyumaefscl.iobyxmoadg(i13));
        if (gxszxtbevoVarZoijcleaow == null) {
            z14 = true;
            z13 = false;
        } else if (iZoijcleaow == lqeggnwhkg.draadjrbmk(gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc.getLiteType(), false)) {
            z14 = false;
            z13 = false;
        } else {
            eablkybsjg eablkybsjgVar2 = gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc;
            if (eablkybsjgVar2.f60130iwizpuwonk && eablkybsjgVar2.f60131jyumaefscl.lqeggnwhkg() && iZoijcleaow == lqeggnwhkg.draadjrbmk(gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc.getLiteType(), true)) {
                z13 = true;
                z14 = false;
            } else {
                z14 = true;
                z13 = false;
            }
        }
        if (z14) {
            return eablkybsjgVar.dsvhmnatus(i13, codedOutputStream);
        }
        if (z13) {
            int iDxjokdxxww = eablkybsjgVar.dxjokdxxww(eablkybsjgVar.lereixgezr());
            if (gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc.getLiteType() == jyumaefscl.zoijcleaow.f60104ylkuphrtab) {
                while (eablkybsjgVar.eablkybsjg() > 0) {
                    dxjokdxxww.iobyxmoadg iobyxmoadgVarFindValueByNumber = gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc.zoijcleaow().findValueByNumber(eablkybsjgVar.wflxmlrfwp());
                    if (iobyxmoadgVarFindValueByNumber == null) {
                        return true;
                    }
                    lqeggnwhkgVar.iobyxmoadg(gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc, gxszxtbevoVarZoijcleaow.gxszxtbevo(iobyxmoadgVarFindValueByNumber));
                }
            } else {
                while (eablkybsjgVar.eablkybsjg() > 0) {
                    lqeggnwhkgVar.iobyxmoadg(gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc, lqeggnwhkg.yggfygwlhe(eablkybsjgVar, gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc.getLiteType(), false));
                }
            }
            eablkybsjgVar.nufgyqmvbu(iDxjokdxxww);
        } else {
            int i14 = iobyxmoadg.f60140iobyxmoadg[gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc.getLiteJavaType().ordinal()];
            if (i14 == 1) {
                agtfadlqog.iobyxmoadg builder = (gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc.isRepeated() || (agtfadlqogVar2 = (agtfadlqog) lqeggnwhkgVar.nufgyqmvbu(gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc)) == null) ? null : agtfadlqogVar2.toBuilder();
                if (builder == null) {
                    builder = gxszxtbevoVarZoijcleaow.ppxfxbqfkf().newBuilderForType();
                }
                if (gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc.getLiteType() == jyumaefscl.zoijcleaow.f60103yadqdtsiqt) {
                    eablkybsjgVar.vdvldrhtss(gxszxtbevoVarZoijcleaow.wkgbmnqykc(), builder, gxszxtbevoVar);
                } else {
                    eablkybsjgVar.yggfygwlhe(builder, gxszxtbevoVar);
                }
                objBuild = builder.build();
            } else if (i14 != 2) {
                objBuild = lqeggnwhkg.yggfygwlhe(eablkybsjgVar, gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc.getLiteType(), false);
            } else {
                int iWflxmlrfwp = eablkybsjgVar.wflxmlrfwp();
                dxjokdxxww.iobyxmoadg iobyxmoadgVarFindValueByNumber2 = gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc.zoijcleaow().findValueByNumber(iWflxmlrfwp);
                if (iobyxmoadgVarFindValueByNumber2 == null) {
                    codedOutputStream.zfvoamnweg(i13);
                    codedOutputStream.roivzttewh(iWflxmlrfwp);
                    return true;
                }
                objBuild = iobyxmoadgVarFindValueByNumber2;
            }
            if (gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc.isRepeated()) {
                lqeggnwhkgVar.iobyxmoadg(gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc, gxszxtbevoVarZoijcleaow.gxszxtbevo(objBuild));
            } else {
                lqeggnwhkgVar.jyumaefscl(gxszxtbevoVarZoijcleaow.f60138wkgbmnqykc, gxszxtbevoVarZoijcleaow.gxszxtbevo(objBuild));
            }
        }
        return true;
    }

    protected void draadjrbmk() {
    }

    protected boolean rgvfuqvkyq(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar, int i13) {
        return eablkybsjgVar.dsvhmnatus(i13, codedOutputStream);
    }

    public static abstract class wkgbmnqykc extends nufgyqmvbu implements ojitshcjhn {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final lqeggnwhkg f60143yggfygwlhe;

        protected class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final Iterator f60144iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final boolean f60145ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private Map.Entry f60147zoijcleaow;

            /* synthetic */ iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, boolean z13, iobyxmoadg iobyxmoadgVar) {
                this(z13);
            }

            public void iobyxmoadg(int i13, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry entry = this.f60147zoijcleaow;
                    if (entry == null || ((eablkybsjg) entry.getKey()).getNumber() >= i13) {
                        return;
                    }
                    eablkybsjg eablkybsjgVar = (eablkybsjg) this.f60147zoijcleaow.getKey();
                    if (this.f60145ppxfxbqfkf && eablkybsjgVar.getLiteJavaType() == jyumaefscl.ppxfxbqfkf.MESSAGE && !eablkybsjgVar.isRepeated()) {
                        codedOutputStream.jztzpxfvev(eablkybsjgVar.getNumber(), (agtfadlqog) this.f60147zoijcleaow.getValue());
                    } else {
                        lqeggnwhkg.lereixgezr(eablkybsjgVar, this.f60147zoijcleaow.getValue(), codedOutputStream);
                    }
                    if (this.f60144iobyxmoadg.hasNext()) {
                        this.f60147zoijcleaow = (Map.Entry) this.f60144iobyxmoadg.next();
                    } else {
                        this.f60147zoijcleaow = null;
                    }
                }
            }

            private iobyxmoadg(boolean z13) {
                Iterator itRgvfuqvkyq = wkgbmnqykc.this.f60143yggfygwlhe.rgvfuqvkyq();
                this.f60144iobyxmoadg = itRgvfuqvkyq;
                if (itRgvfuqvkyq.hasNext()) {
                    this.f60147zoijcleaow = (Map.Entry) itRgvfuqvkyq.next();
                }
                this.f60145ppxfxbqfkf = z13;
            }
        }

        protected wkgbmnqykc() {
            this.f60143yggfygwlhe = lqeggnwhkg.zdlpuopuiu();
        }

        private void istkbnxepw(gxszxtbevo gxszxtbevoVar) {
            if (gxszxtbevoVar.zoijcleaow() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final Object cqumvgiudr(gxszxtbevo gxszxtbevoVar, int i13) {
            istkbnxepw(gxszxtbevoVar);
            return gxszxtbevoVar.eablkybsjg(this.f60143yggfygwlhe.dxjokdxxww(gxszxtbevoVar.f60138wkgbmnqykc, i13));
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu
        protected void draadjrbmk() {
            this.f60143yggfygwlhe.vdvldrhtss();
        }

        public final Object jyumaefscl(gxszxtbevo gxszxtbevoVar) {
            istkbnxepw(gxszxtbevoVar);
            Object objNufgyqmvbu = this.f60143yggfygwlhe.nufgyqmvbu(gxszxtbevoVar.f60138wkgbmnqykc);
            return objNufgyqmvbu == null ? gxszxtbevoVar.f60139zoijcleaow : gxszxtbevoVar.iobyxmoadg(objNufgyqmvbu);
        }

        public final int lereixgezr(gxszxtbevo gxszxtbevoVar) {
            istkbnxepw(gxszxtbevoVar);
            return this.f60143yggfygwlhe.btonecajqb(gxszxtbevoVar.f60138wkgbmnqykc);
        }

        public final boolean pmvmpeiblj(gxszxtbevo gxszxtbevoVar) {
            istkbnxepw(gxszxtbevoVar);
            return this.f60143yggfygwlhe.wflxmlrfwp(gxszxtbevoVar.f60138wkgbmnqykc);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu
        protected boolean rgvfuqvkyq(kotlin.reflect.jvm.internal.impl.protobuf.eablkybsjg eablkybsjgVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.gxszxtbevo gxszxtbevoVar, int i13) {
            return nufgyqmvbu.vdvldrhtss(this.f60143yggfygwlhe, getDefaultInstanceForType(), eablkybsjgVar, codedOutputStream, gxszxtbevoVar, i13);
        }

        protected int yggfygwlhe() {
            return this.f60143yggfygwlhe.gtknphoqwx();
        }

        protected boolean zdlpuopuiu() {
            return this.f60143yggfygwlhe.agtfadlqog();
        }

        protected iobyxmoadg zynmafqrjb() {
            return new iobyxmoadg(this, false, null);
        }

        protected wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f60143yggfygwlhe = ppxfxbqfkfVar.lqeggnwhkg();
        }
    }

    protected nufgyqmvbu(zoijcleaow zoijcleaowVar) {
    }
}
