package androidx.core.os;

import u1.zoijcleaow;

/* JADX INFO: loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(zoijcleaow.eablkybsjg(str, "The operation has been canceled."));
    }
}
