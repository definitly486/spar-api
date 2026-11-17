package modern.payments.ecomAndroid.presentation.base;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/KeyboardState;", "", "isVisible", "", "keyBoardHeight", "", "(ZI)V", "<set-?>", "()Z", "getKeyBoardHeight", "()I", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KeyboardState {
    private boolean isVisible;
    private int keyBoardHeight;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardState() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public final int getKeyBoardHeight() {
        return this.keyBoardHeight;
    }

    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public String toString() {
        return "KeyboardState(isVisible=" + this.isVisible + ", keyBoardHeight=" + this.keyBoardHeight + ')';
    }

    public KeyboardState(boolean z13, int i13) {
        this.isVisible = z13;
        this.keyBoardHeight = i13;
    }

    public /* synthetic */ KeyboardState(boolean z13, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? false : z13, (i14 & 2) != 0 ? 0 : i13);
    }
}
