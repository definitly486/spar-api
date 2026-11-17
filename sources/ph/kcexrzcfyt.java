package ph;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kcexrzcfyt extends yadqdtsiqt implements zh.btonecajqb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zh.dxjokdxxww f76586ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Type f76587zoijcleaow;

    public kcexrzcfyt(Type reflectType) {
        zh.dxjokdxxww vdvldrhtssVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reflectType, "reflectType");
        this.f76587zoijcleaow = reflectType;
        Type typeStevsuqkhv = stevsuqkhv();
        if (typeStevsuqkhv instanceof Class) {
            vdvldrhtssVar = new vdvldrhtss((Class) typeStevsuqkhv);
        } else if (typeStevsuqkhv instanceof TypeVariable) {
            vdvldrhtssVar = new iozdgvuglv((TypeVariable) typeStevsuqkhv);
        } else {
            if (!(typeStevsuqkhv instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeStevsuqkhv.getClass() + "): " + typeStevsuqkhv);
            }
            Type rawType = ((ParameterizedType) typeStevsuqkhv).getRawType();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            vdvldrhtssVar = new vdvldrhtss((Class) rawType);
        }
        this.f76586ppxfxbqfkf = vdvldrhtssVar;
    }

    @Override // zh.btonecajqb
    public zh.dxjokdxxww agtfadlqog() {
        return this.f76586ppxfxbqfkf;
    }

    @Override // zh.wkgbmnqykc
    public boolean cdpycssgdh() {
        return false;
    }

    @Override // zh.wkgbmnqykc
    public Collection getAnnotations() {
        return hg.jyumaefscl.wflxmlrfwp();
    }

    @Override // zh.btonecajqb
    public List lereixgezr() {
        List listNufgyqmvbu = gxszxtbevo.nufgyqmvbu(stevsuqkhv());
        yadqdtsiqt.iobyxmoadg iobyxmoadgVar = yadqdtsiqt.f76617iobyxmoadg;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listNufgyqmvbu, 10));
        Iterator it = listNufgyqmvbu.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadgVar.iobyxmoadg((Type) it.next()));
        }
        return arrayList;
    }

    @Override // zh.btonecajqb
    public String lmojexxdyd() {
        throw new UnsupportedOperationException("Type not found: " + stevsuqkhv());
    }

    @Override // ph.yadqdtsiqt, zh.wkgbmnqykc
    public zh.iobyxmoadg lqeggnwhkg(ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        return null;
    }

    @Override // ph.yadqdtsiqt
    public Type stevsuqkhv() {
        return this.f76587zoijcleaow;
    }

    @Override // zh.btonecajqb
    public String yadqdtsiqt() {
        return stevsuqkhv().toString();
    }

    @Override // zh.btonecajqb
    public boolean zdlpuopuiu() {
        Type typeStevsuqkhv = stevsuqkhv();
        if (!(typeStevsuqkhv instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) typeStevsuqkhv).getTypeParameters();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(typeParameters, "getTypeParameters(...)");
        return !(typeParameters.length == 0);
    }
}
