package o7;

import androidx.collection.pmvmpeiblj;
import com.airbnb.lottie.btonecajqb;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final lqeggnwhkg f72195zoijcleaow = new lqeggnwhkg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pmvmpeiblj f72196iobyxmoadg = new pmvmpeiblj(20);

    lqeggnwhkg() {
    }

    public static lqeggnwhkg ppxfxbqfkf() {
        return f72195zoijcleaow;
    }

    public void iobyxmoadg() {
        this.f72196iobyxmoadg.evictAll();
    }

    public void wkgbmnqykc(String str, btonecajqb btonecajqbVar) {
        if (str == null) {
            return;
        }
        this.f72196iobyxmoadg.put(str, btonecajqbVar);
    }

    public btonecajqb zoijcleaow(String str) {
        if (str == null) {
            return null;
        }
        return (btonecajqb) this.f72196iobyxmoadg.get(str);
    }
}
