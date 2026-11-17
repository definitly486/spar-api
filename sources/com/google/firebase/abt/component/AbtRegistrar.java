package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import od.nufgyqmvbu;
import ub.lqeggnwhkg;
import ub.ppxfxbqfkf;
import ub.vdvldrhtss;
import ub.wkgbmnqykc;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ iobyxmoadg lambda$getComponents$0(wkgbmnqykc wkgbmnqykcVar) {
        return new iobyxmoadg((Context) wkgbmnqykcVar.iobyxmoadg(Context.class), wkgbmnqykcVar.gxszxtbevo(sb.iobyxmoadg.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ppxfxbqfkf> getComponents() {
        return Arrays.asList(ppxfxbqfkf.ppxfxbqfkf(iobyxmoadg.class).nufgyqmvbu(LIBRARY_NAME).zoijcleaow(vdvldrhtss.gtknphoqwx(Context.class)).zoijcleaow(vdvldrhtss.dxjokdxxww(sb.iobyxmoadg.class)).gxszxtbevo(new lqeggnwhkg() { // from class: rb.iobyxmoadg
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
                return AbtRegistrar.lambda$getComponents$0(wkgbmnqykcVar);
            }
        }).wkgbmnqykc(), nufgyqmvbu.zoijcleaow(LIBRARY_NAME, "21.1.1"));
    }
}
