package eh;

import hg.jyumaefscl;
import hg.tzroggbefp;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f31324eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f31325gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Class f31326iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f31327lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final EnumC0664iobyxmoadg f31328ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f31329wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f31330zoijcleaow;

    /* JADX INFO: renamed from: eh.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public enum EnumC0664iobyxmoadg {
        CALL_BY_NAME,
        POSITIONAL_CALL;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f31331iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public enum zoijcleaow {
        JAVA,
        KOTLIN;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f31335iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public iobyxmoadg(Class jClass, List parameterNames, EnumC0664iobyxmoadg callMode, zoijcleaow origin, List methods) {
        zdlpuopuiu.btonecajqb(jClass, "jClass");
        zdlpuopuiu.btonecajqb(parameterNames, "parameterNames");
        zdlpuopuiu.btonecajqb(callMode, "callMode");
        zdlpuopuiu.btonecajqb(origin, "origin");
        zdlpuopuiu.btonecajqb(methods, "methods");
        this.f31326iobyxmoadg = jClass;
        this.f31330zoijcleaow = parameterNames;
        this.f31328ppxfxbqfkf = callMode;
        this.f31329wkgbmnqykc = methods;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(methods, 10));
        Iterator it = methods.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f31324eablkybsjg = arrayList;
        List list = this.f31329wkgbmnqykc;
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            zdlpuopuiu.lqeggnwhkg(returnType);
            Class<?> clsGtknphoqwx = ph.gxszxtbevo.gtknphoqwx(returnType);
            if (clsGtknphoqwx != null) {
                returnType = clsGtknphoqwx;
            }
            arrayList2.add(returnType);
        }
        this.f31325gxszxtbevo = arrayList2;
        List list2 = this.f31329wkgbmnqykc;
        ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.f31327lqeggnwhkg = arrayList3;
        if (this.f31328ppxfxbqfkf == EnumC0664iobyxmoadg.POSITIONAL_CALL && origin == zoijcleaow.JAVA && !jyumaefscl.ipoelvxyzq(this.f31330zoijcleaow, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // eh.nufgyqmvbu
    public Object call(Object[] args) {
        zdlpuopuiu.btonecajqb(args, "args");
        ppxfxbqfkf(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            Object obj = args[i13];
            int i15 = i14 + 1;
            Object objVdvldrhtss = (obj == null && this.f31328ppxfxbqfkf == EnumC0664iobyxmoadg.CALL_BY_NAME) ? this.f31327lqeggnwhkg.get(i14) : gxszxtbevo.vdvldrhtss(obj, (Class) this.f31325gxszxtbevo.get(i14));
            if (objVdvldrhtss == null) {
                gxszxtbevo.rgvfuqvkyq(i14, (String) this.f31330zoijcleaow.get(i14), (Class) this.f31325gxszxtbevo.get(i14));
                throw null;
            }
            arrayList.add(objVdvldrhtss);
            i13++;
            i14 = i15;
        }
        return gxszxtbevo.lqeggnwhkg(this.f31326iobyxmoadg, tzroggbefp.kcexrzcfyt(jyumaefscl.w(this.f31330zoijcleaow, arrayList)), this.f31329wkgbmnqykc);
    }

    @Override // eh.nufgyqmvbu
    public Type getReturnType() {
        return this.f31326iobyxmoadg;
    }

    @Override // eh.nufgyqmvbu
    public List iobyxmoadg() {
        return this.f31324eablkybsjg;
    }

    public void ppxfxbqfkf(Object[] objArr) {
        nufgyqmvbu.iobyxmoadg.iobyxmoadg(this, objArr);
    }

    public Void wkgbmnqykc() {
        return null;
    }

    @Override // eh.nufgyqmvbu
    public /* bridge */ /* synthetic */ Member zoijcleaow() {
        return (Member) wkgbmnqykc();
    }

    public /* synthetic */ iobyxmoadg(Class cls, List list, EnumC0664iobyxmoadg enumC0664iobyxmoadg, zoijcleaow zoijcleaowVar, List list2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        if ((i13 & 16) != 0) {
            list2 = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(cls.getDeclaredMethod((String) it.next(), null));
            }
        }
        this(cls, list, enumC0664iobyxmoadg, zoijcleaowVar, list2);
    }
}
