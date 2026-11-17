package dk;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f29086eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f29087gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f29088iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f29089lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f29090ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Set f29091wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private List f29092zoijcleaow;

    public iobyxmoadg(String serialName) {
        zdlpuopuiu.btonecajqb(serialName, "serialName");
        this.f29088iobyxmoadg = serialName;
        this.f29092zoijcleaow = jyumaefscl.wflxmlrfwp();
        this.f29090ppxfxbqfkf = new ArrayList();
        this.f29091wkgbmnqykc = new HashSet();
        this.f29086eablkybsjg = new ArrayList();
        this.f29087gxszxtbevo = new ArrayList();
        this.f29089lqeggnwhkg = new ArrayList();
    }

    public static /* synthetic */ void zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, gxszxtbevo gxszxtbevoVar, List list, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            list = jyumaefscl.wflxmlrfwp();
        }
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        iobyxmoadgVar.iobyxmoadg(str, gxszxtbevoVar, list, z13);
    }

    public final List eablkybsjg() {
        return this.f29086eablkybsjg;
    }

    public final List gxszxtbevo() {
        return this.f29090ppxfxbqfkf;
    }

    public final void iobyxmoadg(String elementName, gxszxtbevo descriptor, List annotations, boolean z13) {
        zdlpuopuiu.btonecajqb(elementName, "elementName");
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        zdlpuopuiu.btonecajqb(annotations, "annotations");
        if (this.f29091wkgbmnqykc.add(elementName)) {
            this.f29090ppxfxbqfkf.add(elementName);
            this.f29086eablkybsjg.add(descriptor);
            this.f29087gxszxtbevo.add(annotations);
            this.f29089lqeggnwhkg.add(Boolean.valueOf(z13));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f29088iobyxmoadg).toString());
    }

    public final List lqeggnwhkg() {
        return this.f29089lqeggnwhkg;
    }

    public final void nufgyqmvbu(List list) {
        zdlpuopuiu.btonecajqb(list, "<set-?>");
        this.f29092zoijcleaow = list;
    }

    public final List ppxfxbqfkf() {
        return this.f29092zoijcleaow;
    }

    public final List wkgbmnqykc() {
        return this.f29087gxszxtbevo;
    }
}
