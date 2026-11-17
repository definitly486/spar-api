package androidx.lifecycle;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class ntlheqmsrt {
    private final u2.lqeggnwhkg impl = new u2.lqeggnwhkg();

    public final void addCloseable(String key, AutoCloseable closeable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(closeable, "closeable");
        u2.lqeggnwhkg lqeggnwhkgVar = this.impl;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.eablkybsjg(key, closeable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        u2.lqeggnwhkg lqeggnwhkgVar = this.impl;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.gxszxtbevo();
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        u2.lqeggnwhkg lqeggnwhkgVar = this.impl;
        if (lqeggnwhkgVar != null) {
            return (T) lqeggnwhkgVar.nufgyqmvbu(key);
        }
        return null;
    }

    protected void onCleared() {
    }

    public void addCloseable(AutoCloseable closeable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(closeable, "closeable");
        u2.lqeggnwhkg lqeggnwhkgVar = this.impl;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.wkgbmnqykc(closeable);
        }
    }

    @gg.eablkybsjg
    public /* synthetic */ void addCloseable(Closeable closeable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(closeable, "closeable");
        u2.lqeggnwhkg lqeggnwhkgVar = this.impl;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.wkgbmnqykc(closeable);
        }
    }
}
