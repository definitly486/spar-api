package q7;

import com.airbnb.lottie.hcddaimhww;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class vdvldrhtss implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f78147iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f78148ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f78149zoijcleaow;

    public vdvldrhtss(String str, List list, boolean z13) {
        this.f78147iobyxmoadg = str;
        this.f78149zoijcleaow = list;
        this.f78148ppxfxbqfkf = z13;
    }

    @Override // q7.ppxfxbqfkf
    public k7.ppxfxbqfkf iobyxmoadg(hcddaimhww hcddaimhwwVar, com.airbnb.lottie.btonecajqb btonecajqbVar, r7.zoijcleaow zoijcleaowVar) {
        return new k7.wkgbmnqykc(hcddaimhwwVar, zoijcleaowVar, this, btonecajqbVar);
    }

    public String ppxfxbqfkf() {
        return this.f78147iobyxmoadg;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f78147iobyxmoadg + "' Shapes: " + Arrays.toString(this.f78149zoijcleaow.toArray()) + '}';
    }

    public boolean wkgbmnqykc() {
        return this.f78148ppxfxbqfkf;
    }

    public List zoijcleaow() {
        return this.f78149zoijcleaow;
    }
}
