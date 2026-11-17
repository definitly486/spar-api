package i2;

import android.text.Editable;
import android.text.Selection;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes.dex */
abstract class zoijcleaow {

    private static final class iobyxmoadg {
        static int iobyxmoadg(CharSequence charSequence, int i13, int i14) {
            int length = charSequence.length();
            if (i13 < 0 || length < i13 || i14 < 0) {
                return -1;
            }
            while (true) {
                boolean z13 = false;
                while (i14 != 0) {
                    i13--;
                    if (i13 < 0) {
                        return z13 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i13);
                    if (z13) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i14--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i14--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z13 = true;
                    }
                }
                return i13;
            }
        }

        static int zoijcleaow(CharSequence charSequence, int i13, int i14) {
            int length = charSequence.length();
            if (i13 < 0 || length < i13 || i14 < 0) {
                return -1;
            }
            while (true) {
                boolean z13 = false;
                while (i14 != 0) {
                    if (i13 >= length) {
                        if (z13) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i13);
                    if (z13) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i14--;
                        i13++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i14--;
                        i13++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i13++;
                        z13 = true;
                    }
                }
                return i13;
            }
        }
    }

    private static boolean eablkybsjg(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private static boolean iobyxmoadg(Editable editable, KeyEvent keyEvent, boolean z13) {
        ppxfxbqfkf[] ppxfxbqfkfVarArr;
        if (eablkybsjg(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!wkgbmnqykc(selectionStart, selectionEnd) && (ppxfxbqfkfVarArr = (ppxfxbqfkf[]) editable.getSpans(selectionStart, selectionEnd, ppxfxbqfkf.class)) != null && ppxfxbqfkfVarArr.length > 0) {
            for (ppxfxbqfkf ppxfxbqfkfVar : ppxfxbqfkfVarArr) {
                int spanStart = editable.getSpanStart(null);
                int spanEnd = editable.getSpanEnd(null);
                if ((z13 && spanStart == selectionStart) || ((!z13 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean ppxfxbqfkf(Editable editable, int i13, KeyEvent keyEvent) {
        boolean zIobyxmoadg;
        if (i13 != 67) {
            zIobyxmoadg = i13 != 112 ? false : iobyxmoadg(editable, keyEvent, true);
        } else {
            zIobyxmoadg = iobyxmoadg(editable, keyEvent, false);
        }
        if (!zIobyxmoadg) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private static boolean wkgbmnqykc(int i13, int i14) {
        return i13 == -1 || i14 == -1 || i13 != i14;
    }

    static boolean zoijcleaow(InputConnection inputConnection, Editable editable, int i13, int i14, boolean z13) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i13 >= 0 && i14 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (wkgbmnqykc(selectionStart, selectionEnd)) {
                return false;
            }
            if (z13) {
                iMax = iobyxmoadg.iobyxmoadg(editable, selectionStart, Math.max(i13, 0));
                iMin = iobyxmoadg.zoijcleaow(editable, selectionEnd, Math.max(i14, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i13, 0);
                iMin = Math.min(selectionEnd + i14, editable.length());
            }
            ppxfxbqfkf[] ppxfxbqfkfVarArr = (ppxfxbqfkf[]) editable.getSpans(iMax, iMin, ppxfxbqfkf.class);
            if (ppxfxbqfkfVarArr != null && ppxfxbqfkfVarArr.length > 0) {
                for (ppxfxbqfkf ppxfxbqfkfVar : ppxfxbqfkfVarArr) {
                    int spanStart = editable.getSpanStart(null);
                    int spanEnd = editable.getSpanEnd(null);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }
}
