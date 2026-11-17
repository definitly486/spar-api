package v0;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int eablkybsjg(int i13, int i14, int i15) {
        return i13 | (i14 << 8) | (i15 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int gxszxtbevo(int i13) {
        return i13 & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int lqeggnwhkg(int i13) {
        return (i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nufgyqmvbu(int i13) {
        return (i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
    }
}
