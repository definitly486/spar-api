package dh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class agtfadlqog {

    public static final class eablkybsjg extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final hi.wkgbmnqykc.zoijcleaow f28165iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f28166zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(hi.wkgbmnqykc.zoijcleaow signature) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signature, "signature");
            this.f28165iobyxmoadg = signature;
            this.f28166zoijcleaow = signature.iobyxmoadg();
        }

        @Override // dh.agtfadlqog
        public String iobyxmoadg() {
            return this.f28166zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f28165iobyxmoadg.eablkybsjg();
        }

        public final String zoijcleaow() {
            return this.f28165iobyxmoadg.wkgbmnqykc();
        }
    }

    public static final class iobyxmoadg extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Class f28167iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f28168zoijcleaow;

        /* JADX INFO: renamed from: dh.agtfadlqog$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0567iobyxmoadg implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return kg.iobyxmoadg.wkgbmnqykc(((Method) obj).getName(), ((Method) obj2).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Class jClass) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jClass, "jClass");
            this.f28167iobyxmoadg = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(declaredMethods, "getDeclaredMethods(...)");
            this.f28168zoijcleaow = hg.agtfadlqog.ezmngbhpjk(declaredMethods, new C0567iobyxmoadg());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence ppxfxbqfkf(Method method) {
            Class<?> returnType = method.getReturnType();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(returnType, "getReturnType(...)");
            return ph.gxszxtbevo.gxszxtbevo(returnType);
        }

        @Override // dh.agtfadlqog
        public String iobyxmoadg() {
            return hg.jyumaefscl.iwxlajgraz(this.f28168zoijcleaow, "", "<init>(", ")V", 0, null, wflxmlrfwp.f28369zdlpuopuiu, 24, null);
        }

        public final List wkgbmnqykc() {
            return this.f28168zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f28169iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Method method) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(method, "method");
            this.f28169iobyxmoadg = method;
        }

        @Override // dh.agtfadlqog
        public String iobyxmoadg() {
            return l.wkgbmnqykc(this.f28169iobyxmoadg);
        }

        public final Method zoijcleaow() {
            return this.f28169iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final hi.wkgbmnqykc.zoijcleaow f28170iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f28171zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(hi.wkgbmnqykc.zoijcleaow signature) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(signature, "signature");
            this.f28170iobyxmoadg = signature;
            this.f28171zoijcleaow = signature.iobyxmoadg();
        }

        @Override // dh.agtfadlqog
        public String iobyxmoadg() {
            return this.f28171zoijcleaow;
        }

        public final String zoijcleaow() {
            return this.f28170iobyxmoadg.wkgbmnqykc();
        }
    }

    public static final class zoijcleaow extends agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Constructor f28172iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Constructor constructor) {
            super(null);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constructor, "constructor");
            this.f28172iobyxmoadg = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence ppxfxbqfkf(Class cls) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(cls);
            return ph.gxszxtbevo.gxszxtbevo(cls);
        }

        @Override // dh.agtfadlqog
        public String iobyxmoadg() {
            Class<?>[] parameterTypes = this.f28172iobyxmoadg.getParameterTypes();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameterTypes, "getParameterTypes(...)");
            return hg.agtfadlqog.wizcaqwiak(parameterTypes, "", "<init>(", ")V", 0, null, ojitshcjhn.f28292zdlpuopuiu, 24, null);
        }

        public final Constructor wkgbmnqykc() {
            return this.f28172iobyxmoadg;
        }
    }

    public /* synthetic */ agtfadlqog(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public abstract String iobyxmoadg();

    private agtfadlqog() {
    }
}
