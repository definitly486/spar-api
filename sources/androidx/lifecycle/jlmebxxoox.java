package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class jlmebxxoox {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f9487iobyxmoadg = new LinkedHashMap();

    public final void iobyxmoadg() {
        Iterator it = this.f9487iobyxmoadg.values().iterator();
        while (it.hasNext()) {
            ((ntlheqmsrt) it.next()).clear$lifecycle_viewmodel_release();
        }
        this.f9487iobyxmoadg.clear();
    }

    public final Set ppxfxbqfkf() {
        return new HashSet(this.f9487iobyxmoadg.keySet());
    }

    public final void wkgbmnqykc(String key, ntlheqmsrt viewModel) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(viewModel, "viewModel");
        ntlheqmsrt ntlheqmsrtVar = (ntlheqmsrt) this.f9487iobyxmoadg.put(key, viewModel);
        if (ntlheqmsrtVar != null) {
            ntlheqmsrtVar.clear$lifecycle_viewmodel_release();
        }
    }

    public final ntlheqmsrt zoijcleaow(String key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        return (ntlheqmsrt) this.f9487iobyxmoadg.get(key);
    }
}
