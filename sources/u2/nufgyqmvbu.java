package u2;

import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.ribwqtqdhb;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final nufgyqmvbu f112511iobyxmoadg = new nufgyqmvbu();

    private nufgyqmvbu() {
    }

    public final String eablkybsjg(ah.wkgbmnqykc modelClass) {
        zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        String strIobyxmoadg = iobyxmoadg.iobyxmoadg(modelClass);
        if (strIobyxmoadg == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strIobyxmoadg;
    }

    public final ntlheqmsrt gxszxtbevo() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public final crxdokpmqz.ppxfxbqfkf iobyxmoadg(Collection initializers) {
        zdlpuopuiu.btonecajqb(initializers, "initializers");
        t2.gxszxtbevo[] gxszxtbevoVarArr = (t2.gxszxtbevo[]) initializers.toArray(new t2.gxszxtbevo[0]);
        return new t2.zoijcleaow((t2.gxszxtbevo[]) Arrays.copyOf(gxszxtbevoVarArr, gxszxtbevoVarArr.length));
    }

    public final t2.iobyxmoadg ppxfxbqfkf(ribwqtqdhb owner) {
        zdlpuopuiu.btonecajqb(owner, "owner");
        return owner instanceof dxjokdxxww ? ((dxjokdxxww) owner).getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
    }

    public final crxdokpmqz.ppxfxbqfkf wkgbmnqykc(ribwqtqdhb owner) {
        zdlpuopuiu.btonecajqb(owner, "owner");
        return owner instanceof dxjokdxxww ? ((dxjokdxxww) owner).getDefaultViewModelProviderFactory() : wkgbmnqykc.f112512zoijcleaow;
    }

    public final ntlheqmsrt zoijcleaow(ah.wkgbmnqykc modelClass, t2.iobyxmoadg extras, t2.gxszxtbevo... initializers) {
        ntlheqmsrt ntlheqmsrtVar;
        t2.gxszxtbevo gxszxtbevoVar;
        draadjrbmk draadjrbmkVarZoijcleaow;
        zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        zdlpuopuiu.btonecajqb(extras, "extras");
        zdlpuopuiu.btonecajqb(initializers, "initializers");
        int length = initializers.length;
        int i13 = 0;
        while (true) {
            ntlheqmsrtVar = null;
            if (i13 >= length) {
                gxszxtbevoVar = null;
                break;
            }
            gxszxtbevoVar = initializers[i13];
            if (zdlpuopuiu.eablkybsjg(gxszxtbevoVar.iobyxmoadg(), modelClass)) {
                break;
            }
            i13++;
        }
        if (gxszxtbevoVar != null && (draadjrbmkVarZoijcleaow = gxszxtbevoVar.zoijcleaow()) != null) {
            ntlheqmsrtVar = (ntlheqmsrt) draadjrbmkVarZoijcleaow.invoke(extras);
        }
        if (ntlheqmsrtVar != null) {
            return ntlheqmsrtVar;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + iobyxmoadg.iobyxmoadg(modelClass)).toString());
    }
}
