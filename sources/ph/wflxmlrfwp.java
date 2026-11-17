package ph;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class wflxmlrfwp extends yadqdtsiqt implements zh.gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f76609eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yadqdtsiqt f76610ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Collection f76611wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Type f76612zoijcleaow;

    public wflxmlrfwp(Type reflectType) {
        yadqdtsiqt yadqdtsiqtVarIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reflectType, "reflectType");
        this.f76612zoijcleaow = reflectType;
        Type typeStevsuqkhv = stevsuqkhv();
        if (!(typeStevsuqkhv instanceof GenericArrayType)) {
            if (typeStevsuqkhv instanceof Class) {
                Class cls = (Class) typeStevsuqkhv;
                if (cls.isArray()) {
                    yadqdtsiqt.iobyxmoadg iobyxmoadgVar = yadqdtsiqt.f76617iobyxmoadg;
                    Class<?> componentType = cls.getComponentType();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(componentType, "getComponentType(...)");
                    yadqdtsiqtVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + stevsuqkhv().getClass() + "): " + stevsuqkhv());
        }
        yadqdtsiqt.iobyxmoadg iobyxmoadgVar2 = yadqdtsiqt.f76617iobyxmoadg;
        Type genericComponentType = ((GenericArrayType) typeStevsuqkhv).getGenericComponentType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(genericComponentType, "getGenericComponentType(...)");
        yadqdtsiqtVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(genericComponentType);
        this.f76610ppxfxbqfkf = yadqdtsiqtVarIobyxmoadg;
        this.f76611wkgbmnqykc = hg.jyumaefscl.wflxmlrfwp();
    }

    @Override // zh.wkgbmnqykc
    public boolean cdpycssgdh() {
        return this.f76609eablkybsjg;
    }

    @Override // zh.wkgbmnqykc
    public Collection getAnnotations() {
        return this.f76611wkgbmnqykc;
    }

    @Override // zh.gxszxtbevo
    /* JADX INFO: renamed from: kegysxyocb, reason: merged with bridge method [inline-methods] */
    public yadqdtsiqt draadjrbmk() {
        return this.f76610ppxfxbqfkf;
    }

    @Override // ph.yadqdtsiqt
    protected Type stevsuqkhv() {
        return this.f76612zoijcleaow;
    }
}
