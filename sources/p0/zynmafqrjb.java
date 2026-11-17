package p0;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes.dex */
abstract class zynmafqrjb implements pmvmpeiblj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.draadjrbmk f75336iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private InputConnection f75337zoijcleaow;

    public zynmafqrjb(InputConnection inputConnection, tg.draadjrbmk draadjrbmkVar) {
        this.f75336iobyxmoadg = draadjrbmkVar;
        this.f75337zoijcleaow = inputConnection;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i13) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.f75337zoijcleaow != null) {
            iobyxmoadg();
            this.f75336iobyxmoadg.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i13) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i13, int i14) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i13, i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i13) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i13);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i13) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i13);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i13) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i13);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i13, int i14) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i13, i14);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i13, int i14) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i13, i14);
        }
        return null;
    }

    @Override // p0.pmvmpeiblj
    public final void iobyxmoadg() {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            zoijcleaow(inputConnection);
            this.f75337zoijcleaow = null;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i13) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i13) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    protected final InputConnection ppxfxbqfkf() {
        return this.f75337zoijcleaow;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z13) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i13) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i13, int i14) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i13, i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i13) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i13, int i14) {
        InputConnection inputConnection = this.f75337zoijcleaow;
        if (inputConnection != null) {
            return inputConnection.setSelection(i13, i14);
        }
        return false;
    }

    protected abstract void zoijcleaow(InputConnection inputConnection);
}
