package ph;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iozdgvuglv extends yggfygwlhe implements btonecajqb, zh.esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TypeVariable f76580iobyxmoadg;

    public iozdgvuglv(TypeVariable typeVariable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeVariable, "typeVariable");
        this.f76580iobyxmoadg = typeVariable;
    }

    @Override // zh.wkgbmnqykc
    public boolean cdpycssgdh() {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof iozdgvuglv) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f76580iobyxmoadg, ((iozdgvuglv) obj).f76580iobyxmoadg);
    }

    @Override // zh.wkgbmnqykc
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // zh.zdlpuopuiu
    public ii.gxszxtbevo getName() {
        ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(this.f76580iobyxmoadg.getName());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
        return gxszxtbevoVarGxszxtbevo;
    }

    public int hashCode() {
        return this.f76580iobyxmoadg.hashCode();
    }

    @Override // ph.btonecajqb
    public AnnotatedElement kcexrzcfyt() {
        TypeVariable typeVariable = this.f76580iobyxmoadg;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // zh.wkgbmnqykc
    public /* bridge */ /* synthetic */ zh.iobyxmoadg lqeggnwhkg(ii.ppxfxbqfkf ppxfxbqfkfVar) {
        return lqeggnwhkg(ppxfxbqfkfVar);
    }

    @Override // zh.esjtqupxsv
    /* JADX INFO: renamed from: stevsuqkhv, reason: merged with bridge method [inline-methods] */
    public List getUpperBounds() {
        Type[] bounds = this.f76580iobyxmoadg.getBounds();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new kcexrzcfyt(type));
        }
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) hg.jyumaefscl.krqnebusok(arrayList);
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kcexrzcfytVar != null ? kcexrzcfytVar.stevsuqkhv() : null, Object.class) ? hg.jyumaefscl.wflxmlrfwp() : arrayList;
    }

    public String toString() {
        return iozdgvuglv.class.getName() + ": " + this.f76580iobyxmoadg;
    }

    @Override // ph.btonecajqb, zh.wkgbmnqykc
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listZoijcleaow;
        AnnotatedElement annotatedElementKcexrzcfyt = kcexrzcfyt();
        return (annotatedElementKcexrzcfyt == null || (declaredAnnotations = annotatedElementKcexrzcfyt.getDeclaredAnnotations()) == null || (listZoijcleaow = gtknphoqwx.zoijcleaow(declaredAnnotations)) == null) ? hg.jyumaefscl.wflxmlrfwp() : listZoijcleaow;
    }

    @Override // ph.btonecajqb, zh.wkgbmnqykc
    public lqeggnwhkg lqeggnwhkg(ii.ppxfxbqfkf fqName) {
        Annotation[] declaredAnnotations;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        AnnotatedElement annotatedElementKcexrzcfyt = kcexrzcfyt();
        if (annotatedElementKcexrzcfyt == null || (declaredAnnotations = annotatedElementKcexrzcfyt.getDeclaredAnnotations()) == null) {
            return null;
        }
        return gtknphoqwx.iobyxmoadg(declaredAnnotations, fqName);
    }
}
