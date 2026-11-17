package com.aitsuki.swipe;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import hg.agtfadlqog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00105\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u0013R\u0016\u00107\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010,R\u0016\u00109\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010,¨\u0006:"}, d2 = {"Lcom/aitsuki/swipe/SwipeMenuRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "x", "y", "", "pointerId", "Lgg/wwaezpbzkn;", "a0", "(FFI)V", "U", "(I)V", "", "Z", "(I)Z", "Y", "T", "S", "()V", "Landroid/view/View;", "X", "(II)Landroid/view/View;", "", "V", "()Ljava/util/List;", "view", "Lcom/aitsuki/swipe/SwipeLayout;", "W", "(Landroid/view/View;)Lcom/aitsuki/swipe/SwipeLayout;", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Rect;", "k", "Landroid/graphics/Rect;", "rect", "l", "I", "touchSlop", "", "m", "[F", "initMotionX", "n", "initMotionY", "o", "cancelUp", "p", "pointersDown", "q", "pastSlopPointerId", "library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SwipeMenuRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Rect rect;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int touchSlop;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float[] initMotionX;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float[] initMotionY;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean cancelUp;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int pointersDown;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int pastSlopPointerId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeMenuRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zdlpuopuiu.btonecajqb(context, "context");
        this.rect = new Rect();
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.initMotionX = new float[1];
        this.initMotionY = new float[1];
        this.pastSlopPointerId = -1;
    }

    private final void S() {
        float[] fArr = this.initMotionX;
        if (fArr.length == 0) {
            return;
        }
        agtfadlqog.pmvmpeiblj(fArr, 0.0f, 0, 0, 6, null);
        agtfadlqog.pmvmpeiblj(this.initMotionY, 0.0f, 0, 0, 6, null);
        this.pointersDown = 0;
    }

    private final void T(int pointerId) {
        if (this.initMotionX.length != 0 && Y(pointerId)) {
            this.initMotionX[pointerId] = 0.0f;
            this.initMotionY[pointerId] = 0.0f;
            this.pointersDown = (~(1 << pointerId)) & this.pointersDown;
        }
    }

    private final void U(int pointerId) {
        float[] fArr = this.initMotionX;
        if (fArr.length <= pointerId) {
            int i13 = pointerId + 1;
            this.initMotionX = agtfadlqog.rgvfuqvkyq(fArr, new float[i13], 0, 0, 0, 14, null);
            this.initMotionY = agtfadlqog.rgvfuqvkyq(this.initMotionY, new float[i13], 0, 0, 0, 14, null);
        }
    }

    private final List V() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            int i14 = i13 + 1;
            View child = getChildAt(i13);
            zdlpuopuiu.dxjokdxxww(child, "child");
            SwipeLayout swipeLayoutW = W(child);
            if (swipeLayoutW != null && swipeLayoutW.getOnScreen() > 0.0f) {
                arrayList.add(child);
            }
            i13 = i14;
        }
        return arrayList;
    }

    private final SwipeLayout W(View view) {
        if (view instanceof SwipeLayout) {
            return (SwipeLayout) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() <= 0) {
            return null;
        }
        View childAt = viewGroup.getChildAt(0);
        zdlpuopuiu.dxjokdxxww(childAt, "view.getChildAt(i)");
        return W(childAt);
    }

    private final View X(int x13, int y13) {
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            int i14 = i13 + 1;
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(this.rect);
                if (this.rect.contains(x13, y13)) {
                    return childAt;
                }
            }
            i13 = i14;
        }
        return null;
    }

    private final boolean Y(int pointerId) {
        return ((1 << pointerId) & this.pointersDown) != 0;
    }

    private final boolean Z(int pointerId) {
        if (Y(pointerId)) {
            return true;
        }
        Log.e("SwipeMenuRecyclerView", "Ignoring pointerId=" + pointerId + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  SwipeMenuRecyclerView did not receive all the events in the event stream.");
        return false;
    }

    private final void a0(float x13, float y13, int pointerId) {
        U(pointerId);
        this.initMotionX[pointerId] = x13;
        this.initMotionY[pointerId] = y13;
        this.pointersDown |= 1 << pointerId;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        zdlpuopuiu.btonecajqb(ev2, "ev");
        int actionMasked = ev2.getActionMasked();
        if (actionMasked == 0) {
            this.pastSlopPointerId = -1;
            a0(ev2.getX(), ev2.getY(), ev2.getPointerId(0));
            View viewX = X((int) ev2.getX(), (int) ev2.getY());
            for (View view : V()) {
                if (!zdlpuopuiu.eablkybsjg(view, viewX)) {
                    SwipeLayout swipeLayoutW = W(view);
                    if (swipeLayoutW != null) {
                        swipeLayoutW.ojitshcjhn(true);
                    }
                    this.cancelUp = true;
                }
            }
        } else if (actionMasked == 1) {
            S();
            if (this.cancelUp) {
                ev2.setAction(3);
                this.cancelUp = false;
            }
        } else if (actionMasked == 2) {
            if (!(this.initMotionX.length == 0)) {
                int pointerCount = ev2.getPointerCount();
                int i13 = 0;
                while (i13 < pointerCount) {
                    int i14 = i13 + 1;
                    int pointerId = ev2.getPointerId(i13);
                    if (Z(pointerId)) {
                        float x13 = ev2.getX(i13);
                        float y13 = ev2.getY(i13);
                        float f13 = x13 - this.initMotionX[pointerId];
                        float f14 = y13 - this.initMotionY[pointerId];
                        float f15 = (f13 * f13) + (f14 * f14);
                        int i15 = this.touchSlop;
                        if (f15 > i15 * i15) {
                            this.cancelUp = false;
                        }
                        int i16 = this.pastSlopPointerId;
                        if (i16 == -1) {
                            View viewX2 = X((int) x13, (int) y13);
                            SwipeLayout swipeLayoutW2 = viewX2 != null ? W(viewX2) : null;
                            if (swipeLayoutW2 != null && swipeLayoutW2.getSwipeEnable$library_release() && Math.abs(f13) > this.touchSlop && Math.abs(f13) > Math.abs(f14)) {
                                this.pastSlopPointerId = pointerId;
                            }
                        } else if (i16 != -1 && i16 != pointerId) {
                            ev2.setAction(3);
                        }
                    }
                    i13 = i14;
                }
            }
        } else if (actionMasked == 3) {
            S();
            if (this.cancelUp) {
                ev2.setAction(3);
                this.cancelUp = false;
            }
        } else if (actionMasked == 5) {
            a0(ev2.getX(ev2.getActionIndex()), ev2.getY(ev2.getActionIndex()), ev2.getPointerId(ev2.getActionIndex()));
            if (!V().isEmpty()) {
                return false;
            }
        } else if (actionMasked == 6) {
            T(ev2.getPointerId(ev2.getActionIndex()));
        }
        return super.dispatchTouchEvent(ev2);
    }
}
