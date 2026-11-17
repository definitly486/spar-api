package k0;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class lmojexxdyd {
    public static final int iobyxmoadg(Layout layout, int i13, boolean z13) {
        if (i13 <= 0) {
            return 0;
        }
        if (i13 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i13);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i13 && lineEnd != i13) {
            return lineForOffset;
        }
        if (lineStart == i13) {
            return z13 ? lineForOffset - 1 : lineForOffset;
        }
        return z13 ? lineForOffset : lineForOffset + 1;
    }
}
