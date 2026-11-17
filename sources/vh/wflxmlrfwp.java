package vh;

import java.util.Map;
import jh.yfnezrywwk;
import kotlin.jvm.internal.zdlpuopuiu;
import wh.jhduphickx;
import zh.esjtqupxsv;
import zh.lereixgezr;

/* JADX INFO: loaded from: classes3.dex */
public final class wflxmlrfwp implements rgvfuqvkyq {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yi.nufgyqmvbu f116762eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f116763iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f116764ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f116765wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jh.wflxmlrfwp f116766zoijcleaow;

    public wflxmlrfwp(gtknphoqwx c13, jh.wflxmlrfwp containingDeclaration, lereixgezr typeParameterOwner, int i13) {
        zdlpuopuiu.btonecajqb(c13, "c");
        zdlpuopuiu.btonecajqb(containingDeclaration, "containingDeclaration");
        zdlpuopuiu.btonecajqb(typeParameterOwner, "typeParameterOwner");
        this.f116763iobyxmoadg = c13;
        this.f116766zoijcleaow = containingDeclaration;
        this.f116764ppxfxbqfkf = i13;
        this.f116765wkgbmnqykc = jj.iobyxmoadg.wkgbmnqykc(typeParameterOwner.getTypeParameters());
        this.f116762eablkybsjg = c13.eablkybsjg().eablkybsjg(new draadjrbmk(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jhduphickx ppxfxbqfkf(wflxmlrfwp wflxmlrfwpVar, esjtqupxsv typeParameter) {
        zdlpuopuiu.btonecajqb(typeParameter, "typeParameter");
        Integer num = (Integer) wflxmlrfwpVar.f116765wkgbmnqykc.get(typeParameter);
        if (num == null) {
            return null;
        }
        return new jhduphickx(ppxfxbqfkf.gtknphoqwx(ppxfxbqfkf.wkgbmnqykc(wflxmlrfwpVar.f116763iobyxmoadg, wflxmlrfwpVar), wflxmlrfwpVar.f116766zoijcleaow.getAnnotations()), typeParameter, wflxmlrfwpVar.f116764ppxfxbqfkf + num.intValue(), wflxmlrfwpVar.f116766zoijcleaow);
    }

    @Override // vh.rgvfuqvkyq
    public yfnezrywwk iobyxmoadg(esjtqupxsv javaTypeParameter) {
        zdlpuopuiu.btonecajqb(javaTypeParameter, "javaTypeParameter");
        jhduphickx jhduphickxVar = (jhduphickx) this.f116762eablkybsjg.invoke(javaTypeParameter);
        return jhduphickxVar != null ? jhduphickxVar : this.f116763iobyxmoadg.gxszxtbevo().iobyxmoadg(javaTypeParameter);
    }
}
