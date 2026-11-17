package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f23196yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Rect f23197zdlpuopuiu;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, da.zoijcleaow.editTextStyle);
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean iobyxmoadg(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f23196yggfygwlhe;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!iobyxmoadg(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f23197zdlpuopuiu);
        rect.bottom = this.f23197zdlpuopuiu.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!iobyxmoadg(textInputLayout)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.kegysxyocb()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.kegysxyocb() && super.getHint() == null && com.google.android.material.internal.eablkybsjg.wkgbmnqykc()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!iobyxmoadg(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f23197zdlpuopuiu.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f23197zdlpuopuiu);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z13) {
        this.f23196yggfygwlhe = z13;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i13) {
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, 0), attributeSet, i13);
        this.f23197zdlpuopuiu = new Rect();
        TypedArray typedArrayDxjokdxxww = com.google.android.material.internal.draadjrbmk.dxjokdxxww(context, attributeSet, da.draadjrbmk.TextInputEditText, i13, da.gtknphoqwx.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        typedArrayDxjokdxxww.recycle();
    }
}
