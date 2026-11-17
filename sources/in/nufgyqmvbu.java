package in;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.address.api.model.AddressDetailScreenArgs;
import ru.myspar.address.impl.detail.presentation.AddressDetailFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment ppxfxbqfkf(AddressDetailScreenArgs addressDetailScreenArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return b40.iobyxmoadg.zoijcleaow(new AddressDetailFragment(), addressDetailScreenArgs, false, 2, null);
    }

    public static final m9.wkgbmnqykc zoijcleaow(final AddressDetailScreenArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: in.lqeggnwhkg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return nufgyqmvbu.ppxfxbqfkf(args, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
