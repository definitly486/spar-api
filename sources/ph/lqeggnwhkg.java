package ph;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends yggfygwlhe implements zh.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Annotation f76593iobyxmoadg;

    public lqeggnwhkg(Annotation annotation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotation, "annotation");
        this.f76593iobyxmoadg = annotation;
    }

    public boolean equals(Object obj) {
        return (obj instanceof lqeggnwhkg) && this.f76593iobyxmoadg == ((lqeggnwhkg) obj).f76593iobyxmoadg;
    }

    public int hashCode() {
        return System.identityHashCode(this.f76593iobyxmoadg);
    }

    @Override // zh.iobyxmoadg
    public boolean iobyxmoadg() {
        return false;
    }

    @Override // zh.iobyxmoadg
    public boolean iozdgvuglv() {
        return false;
    }

    @Override // zh.iobyxmoadg
    /* JADX INFO: renamed from: kegysxyocb, reason: merged with bridge method [inline-methods] */
    public vdvldrhtss yggfygwlhe() {
        return new vdvldrhtss(sg.iobyxmoadg.zoijcleaow(sg.iobyxmoadg.iobyxmoadg(this.f76593iobyxmoadg)));
    }

    @Override // zh.iobyxmoadg
    public Collection ojitshcjhn() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = sg.iobyxmoadg.zoijcleaow(sg.iobyxmoadg.iobyxmoadg(this.f76593iobyxmoadg)).getDeclaredMethods();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            nufgyqmvbu.iobyxmoadg iobyxmoadgVar = nufgyqmvbu.f76594zoijcleaow;
            Object objInvoke = method.invoke(this.f76593iobyxmoadg, null);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objInvoke, "invoke(...)");
            arrayList.add(iobyxmoadgVar.iobyxmoadg(objInvoke, ii.gxszxtbevo.gxszxtbevo(method.getName())));
        }
        return arrayList;
    }

    @Override // zh.iobyxmoadg
    public ii.zoijcleaow ppxfxbqfkf() {
        return gxszxtbevo.eablkybsjg(sg.iobyxmoadg.zoijcleaow(sg.iobyxmoadg.iobyxmoadg(this.f76593iobyxmoadg)));
    }

    public final Annotation stevsuqkhv() {
        return this.f76593iobyxmoadg;
    }

    public String toString() {
        return lqeggnwhkg.class.getName() + ": " + this.f76593iobyxmoadg;
    }
}
