package ph;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lmojexxdyd extends yggfygwlhe implements zh.zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yadqdtsiqt f76589iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f76590ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f76591wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Annotation[] f76592zoijcleaow;

    public lmojexxdyd(yadqdtsiqt type, Annotation[] reflectAnnotations, String str, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reflectAnnotations, "reflectAnnotations");
        this.f76589iobyxmoadg = type;
        this.f76592zoijcleaow = reflectAnnotations;
        this.f76590ppxfxbqfkf = str;
        this.f76591wkgbmnqykc = z13;
    }

    @Override // zh.zynmafqrjb
    public boolean btonecajqb() {
        return this.f76591wkgbmnqykc;
    }

    @Override // zh.wkgbmnqykc
    public boolean cdpycssgdh() {
        return false;
    }

    @Override // zh.zynmafqrjb
    public ii.gxszxtbevo getName() {
        String str = this.f76590ppxfxbqfkf;
        if (str != null) {
            return ii.gxszxtbevo.eablkybsjg(str);
        }
        return null;
    }

    @Override // zh.zynmafqrjb
    /* JADX INFO: renamed from: stevsuqkhv, reason: merged with bridge method [inline-methods] */
    public yadqdtsiqt getType() {
        return this.f76589iobyxmoadg;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(lmojexxdyd.class.getName());
        sb3.append(": ");
        sb3.append(btonecajqb() ? "vararg " : "");
        sb3.append(getName());
        sb3.append(": ");
        sb3.append(getType());
        return sb3.toString();
    }

    @Override // zh.wkgbmnqykc
    public List getAnnotations() {
        return gtknphoqwx.zoijcleaow(this.f76592zoijcleaow);
    }

    @Override // zh.wkgbmnqykc
    public lqeggnwhkg lqeggnwhkg(ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        return gtknphoqwx.iobyxmoadg(this.f76592zoijcleaow, fqName);
    }
}
