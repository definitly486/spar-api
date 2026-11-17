package lm;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import lk.lereixgezr;

/* JADX INFO: loaded from: classes3.dex */
public final class zdlpuopuiu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    final List f63585eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    final Executor f63586gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f63587iobyxmoadg = new ConcurrentHashMap();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    final boolean f63588lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final lk.jyumaefscl f63589ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final List f63590wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final lk.eablkybsjg.iobyxmoadg f63591zoijcleaow;

    class iobyxmoadg implements InvocationHandler {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ Class f63593ppxfxbqfkf;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final rgvfuqvkyq f63592iobyxmoadg = rgvfuqvkyq.gxszxtbevo();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Object[] f63595zoijcleaow = new Object[0];

        iobyxmoadg(Class cls) {
            this.f63593ppxfxbqfkf = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f63595zoijcleaow;
            }
            return this.f63592iobyxmoadg.nufgyqmvbu(method) ? this.f63592iobyxmoadg.lqeggnwhkg(method, this.f63593ppxfxbqfkf, obj, objArr) : zdlpuopuiu.this.ppxfxbqfkf(method).iobyxmoadg(objArr);
        }
    }

    zdlpuopuiu(lk.eablkybsjg.iobyxmoadg iobyxmoadgVar, lk.jyumaefscl jyumaefsclVar, List list, List list2, Executor executor, boolean z13) {
        this.f63591zoijcleaow = iobyxmoadgVar;
        this.f63589ppxfxbqfkf = jyumaefsclVar;
        this.f63590wkgbmnqykc = list;
        this.f63585eablkybsjg = list2;
        this.f63586gxszxtbevo = executor;
        this.f63588lqeggnwhkg = z13;
    }

    private void btonecajqb(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb3 = new StringBuilder("Type parameters are unsupported on ");
                sb3.append(cls2.getName());
                if (cls2 != cls) {
                    sb3.append(" which is an interface of ");
                    sb3.append(cls.getName());
                }
                throw new IllegalArgumentException(sb3.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f63588lqeggnwhkg) {
            rgvfuqvkyq rgvfuqvkyqVarGxszxtbevo = rgvfuqvkyq.gxszxtbevo();
            for (Method method : cls.getDeclaredMethods()) {
                if (!rgvfuqvkyqVarGxszxtbevo.nufgyqmvbu(method) && !Modifier.isStatic(method.getModifiers())) {
                    ppxfxbqfkf(method);
                }
            }
        }
    }

    public gxszxtbevo dxjokdxxww(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f63590wkgbmnqykc.size();
        for (int i13 = 0; i13 < size; i13++) {
            gxszxtbevo gxszxtbevoVarEablkybsjg = ((gxszxtbevo.iobyxmoadg) this.f63590wkgbmnqykc.get(i13)).eablkybsjg(type, annotationArr, this);
            if (gxszxtbevoVarEablkybsjg != null) {
                return gxszxtbevoVarEablkybsjg;
            }
        }
        return lm.iobyxmoadg.wkgbmnqykc.f63452iobyxmoadg;
    }

    public gxszxtbevo eablkybsjg(gxszxtbevo.iobyxmoadg iobyxmoadgVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f63590wkgbmnqykc.indexOf(iobyxmoadgVar) + 1;
        int size = this.f63590wkgbmnqykc.size();
        for (int i13 = iIndexOf; i13 < size; i13++) {
            gxszxtbevo gxszxtbevoVarPpxfxbqfkf = ((gxszxtbevo.iobyxmoadg) this.f63590wkgbmnqykc.get(i13)).ppxfxbqfkf(type, annotationArr, annotationArr2, this);
            if (gxszxtbevoVarPpxfxbqfkf != null) {
                return gxszxtbevoVarPpxfxbqfkf;
            }
        }
        StringBuilder sb3 = new StringBuilder("Could not locate RequestBody converter for ");
        sb3.append(type);
        sb3.append(".\n");
        if (iobyxmoadgVar != null) {
            sb3.append("  Skipped:");
            for (int i14 = 0; i14 < iIndexOf; i14++) {
                sb3.append("\n   * ");
                sb3.append(((gxszxtbevo.iobyxmoadg) this.f63590wkgbmnqykc.get(i14)).getClass().getName());
            }
            sb3.append('\n');
        }
        sb3.append("  Tried:");
        int size2 = this.f63590wkgbmnqykc.size();
        while (iIndexOf < size2) {
            sb3.append("\n   * ");
            sb3.append(((gxszxtbevo.iobyxmoadg) this.f63590wkgbmnqykc.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb3.toString());
    }

    public gxszxtbevo gxszxtbevo(gxszxtbevo.iobyxmoadg iobyxmoadgVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f63590wkgbmnqykc.indexOf(iobyxmoadgVar) + 1;
        int size = this.f63590wkgbmnqykc.size();
        for (int i13 = iIndexOf; i13 < size; i13++) {
            gxszxtbevo gxszxtbevoVarWkgbmnqykc = ((gxszxtbevo.iobyxmoadg) this.f63590wkgbmnqykc.get(i13)).wkgbmnqykc(type, annotationArr, this);
            if (gxszxtbevoVarWkgbmnqykc != null) {
                return gxszxtbevoVarWkgbmnqykc;
            }
        }
        StringBuilder sb3 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb3.append(type);
        sb3.append(".\n");
        if (iobyxmoadgVar != null) {
            sb3.append("  Skipped:");
            for (int i14 = 0; i14 < iIndexOf; i14++) {
                sb3.append("\n   * ");
                sb3.append(((gxszxtbevo.iobyxmoadg) this.f63590wkgbmnqykc.get(i14)).getClass().getName());
            }
            sb3.append('\n');
        }
        sb3.append("  Tried:");
        int size2 = this.f63590wkgbmnqykc.size();
        while (iIndexOf < size2) {
            sb3.append("\n   * ");
            sb3.append(((gxszxtbevo.iobyxmoadg) this.f63590wkgbmnqykc.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb3.toString());
    }

    public ppxfxbqfkf iobyxmoadg(Type type, Annotation[] annotationArr) {
        return wkgbmnqykc(null, type, annotationArr);
    }

    public gxszxtbevo lqeggnwhkg(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return eablkybsjg(null, type, annotationArr, annotationArr2);
    }

    public gxszxtbevo nufgyqmvbu(Type type, Annotation[] annotationArr) {
        return gxszxtbevo(null, type, annotationArr);
    }

    yggfygwlhe ppxfxbqfkf(Method method) {
        yggfygwlhe yggfygwlheVarZoijcleaow;
        yggfygwlhe yggfygwlheVar = (yggfygwlhe) this.f63587iobyxmoadg.get(method);
        if (yggfygwlheVar != null) {
            return yggfygwlheVar;
        }
        synchronized (this.f63587iobyxmoadg) {
            try {
                yggfygwlheVarZoijcleaow = (yggfygwlhe) this.f63587iobyxmoadg.get(method);
                if (yggfygwlheVarZoijcleaow == null) {
                    yggfygwlheVarZoijcleaow = yggfygwlhe.zoijcleaow(this, method);
                    this.f63587iobyxmoadg.put(method, yggfygwlheVarZoijcleaow);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yggfygwlheVarZoijcleaow;
    }

    public ppxfxbqfkf wkgbmnqykc(ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f63585eablkybsjg.indexOf(iobyxmoadgVar) + 1;
        int size = this.f63585eablkybsjg.size();
        for (int i13 = iIndexOf; i13 < size; i13++) {
            ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ((ppxfxbqfkf.iobyxmoadg) this.f63585eablkybsjg.get(i13)).iobyxmoadg(type, annotationArr, this);
            if (ppxfxbqfkfVarIobyxmoadg != null) {
                return ppxfxbqfkfVarIobyxmoadg;
            }
        }
        StringBuilder sb3 = new StringBuilder("Could not locate call adapter for ");
        sb3.append(type);
        sb3.append(".\n");
        if (iobyxmoadgVar != null) {
            sb3.append("  Skipped:");
            for (int i14 = 0; i14 < iIndexOf; i14++) {
                sb3.append("\n   * ");
                sb3.append(((ppxfxbqfkf.iobyxmoadg) this.f63585eablkybsjg.get(i14)).getClass().getName());
            }
            sb3.append('\n');
        }
        sb3.append("  Tried:");
        int size2 = this.f63585eablkybsjg.size();
        while (iIndexOf < size2) {
            sb3.append("\n   * ");
            sb3.append(((ppxfxbqfkf.iobyxmoadg) this.f63585eablkybsjg.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb3.toString());
    }

    public Object zoijcleaow(Class cls) {
        btonecajqb(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new iobyxmoadg(cls));
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final List f63596eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private Executor f63597gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final rgvfuqvkyq f63598iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private boolean f63599lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private lk.jyumaefscl f63600ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final List f63601wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private lk.eablkybsjg.iobyxmoadg f63602zoijcleaow;

        zoijcleaow(rgvfuqvkyq rgvfuqvkyqVar) {
            this.f63601wkgbmnqykc = new ArrayList();
            this.f63596eablkybsjg = new ArrayList();
            this.f63598iobyxmoadg = rgvfuqvkyqVar;
        }

        public zoijcleaow eablkybsjg(lk.eablkybsjg.iobyxmoadg iobyxmoadgVar) {
            Objects.requireNonNull(iobyxmoadgVar, "factory == null");
            this.f63602zoijcleaow = iobyxmoadgVar;
            return this;
        }

        public zoijcleaow gxszxtbevo(lereixgezr lereixgezrVar) {
            Objects.requireNonNull(lereixgezrVar, "client == null");
            return eablkybsjg(lereixgezrVar);
        }

        public zoijcleaow iobyxmoadg(gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
            List list = this.f63601wkgbmnqykc;
            Objects.requireNonNull(iobyxmoadgVar, "factory == null");
            list.add(iobyxmoadgVar);
            return this;
        }

        public zoijcleaow ppxfxbqfkf(lk.jyumaefscl jyumaefsclVar) {
            Objects.requireNonNull(jyumaefsclVar, "baseUrl == null");
            List listAgtfadlqog = jyumaefsclVar.agtfadlqog();
            if ("".equals(listAgtfadlqog.get(listAgtfadlqog.size() - 1))) {
                this.f63600ppxfxbqfkf = jyumaefsclVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + jyumaefsclVar);
        }

        public zdlpuopuiu wkgbmnqykc() {
            if (this.f63600ppxfxbqfkf == null) {
                throw new IllegalStateException("Base URL required.");
            }
            lk.eablkybsjg.iobyxmoadg lereixgezrVar = this.f63602zoijcleaow;
            if (lereixgezrVar == null) {
                lereixgezrVar = new lereixgezr();
            }
            lk.eablkybsjg.iobyxmoadg iobyxmoadgVar = lereixgezrVar;
            Executor executorZoijcleaow = this.f63597gxszxtbevo;
            if (executorZoijcleaow == null) {
                executorZoijcleaow = this.f63598iobyxmoadg.zoijcleaow();
            }
            Executor executor = executorZoijcleaow;
            ArrayList arrayList = new ArrayList(this.f63596eablkybsjg);
            arrayList.addAll(this.f63598iobyxmoadg.iobyxmoadg(executor));
            ArrayList arrayList2 = new ArrayList(this.f63601wkgbmnqykc.size() + 1 + this.f63598iobyxmoadg.wkgbmnqykc());
            arrayList2.add(new lm.iobyxmoadg());
            arrayList2.addAll(this.f63601wkgbmnqykc);
            arrayList2.addAll(this.f63598iobyxmoadg.ppxfxbqfkf());
            return new zdlpuopuiu(iobyxmoadgVar, this.f63600ppxfxbqfkf, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.f63599lqeggnwhkg);
        }

        public zoijcleaow zoijcleaow(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return ppxfxbqfkf(lk.jyumaefscl.nufgyqmvbu(str));
        }

        public zoijcleaow() {
            this(rgvfuqvkyq.gxszxtbevo());
        }
    }
}
