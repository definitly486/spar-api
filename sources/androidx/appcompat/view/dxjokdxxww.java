package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class dxjokdxxww implements Window.Callback {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final Window.Callback f2690zdlpuopuiu;

    static class iobyxmoadg {
        static boolean iobyxmoadg(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        static ActionMode zoijcleaow(Window.Callback callback, ActionMode.Callback callback2, int i13) {
            return callback.onWindowStartingActionMode(callback2, i13);
        }
    }

    static class ppxfxbqfkf {
        static void iobyxmoadg(Window.Callback callback, boolean z13) {
            callback.onPointerCaptureChanged(z13);
        }
    }

    static class zoijcleaow {
        static void iobyxmoadg(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i13) {
            callback.onProvideKeyboardShortcuts(list, menu, i13);
        }
    }

    public dxjokdxxww(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2690zdlpuopuiu = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2690zdlpuopuiu.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f2690zdlpuopuiu.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f2690zdlpuopuiu.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2690zdlpuopuiu.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2690zdlpuopuiu.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2690zdlpuopuiu.dispatchTrackballEvent(motionEvent);
    }

    public final Window.Callback iobyxmoadg() {
        return this.f2690zdlpuopuiu;
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f2690zdlpuopuiu.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f2690zdlpuopuiu.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f2690zdlpuopuiu.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i13, Menu menu) {
        return this.f2690zdlpuopuiu.onCreatePanelMenu(i13, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i13) {
        return this.f2690zdlpuopuiu.onCreatePanelView(i13);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f2690zdlpuopuiu.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i13, MenuItem menuItem) {
        return this.f2690zdlpuopuiu.onMenuItemSelected(i13, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i13, Menu menu) {
        return this.f2690zdlpuopuiu.onMenuOpened(i13, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i13, Menu menu) {
        this.f2690zdlpuopuiu.onPanelClosed(i13, menu);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z13) {
        ppxfxbqfkf.iobyxmoadg(this.f2690zdlpuopuiu, z13);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i13, View view, Menu menu) {
        return this.f2690zdlpuopuiu.onPreparePanel(i13, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List list, Menu menu, int i13) {
        zoijcleaow.iobyxmoadg(this.f2690zdlpuopuiu, list, menu, i13);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return iobyxmoadg.iobyxmoadg(this.f2690zdlpuopuiu, searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2690zdlpuopuiu.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z13) {
        this.f2690zdlpuopuiu.onWindowFocusChanged(z13);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i13) {
        return iobyxmoadg.zoijcleaow(this.f2690zdlpuopuiu, callback, i13);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f2690zdlpuopuiu.onSearchRequested();
    }
}
