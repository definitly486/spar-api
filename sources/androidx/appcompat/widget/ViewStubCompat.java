package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private LayoutInflater f3247iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private WeakReference f3248jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f3249yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f3250zdlpuopuiu;

    public interface iobyxmoadg {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f3249yggfygwlhe;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f3247iwizpuwonk;
    }

    public int getLayoutResource() {
        return this.f3250zdlpuopuiu;
    }

    public View iobyxmoadg() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f3250zdlpuopuiu == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f3247iwizpuwonk;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f3250zdlpuopuiu, viewGroup, false);
        int i13 = this.f3249yggfygwlhe;
        if (i13 != -1) {
            viewInflate.setId(i13);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f3248jyumaefscl = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i13) {
        this.f3249yggfygwlhe = i13;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f3247iwizpuwonk = layoutInflater;
    }

    public void setLayoutResource(int i13) {
        this.f3250zdlpuopuiu = i13;
    }

    public void setOnInflateListener(iobyxmoadg iobyxmoadgVar) {
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        WeakReference weakReference = this.f3248jyumaefscl;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i13);
            return;
        }
        super.setVisibility(i13);
        if (i13 == 0 || i13 == 4) {
            iobyxmoadg();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f3250zdlpuopuiu = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lqeggnwhkg.btonecajqb.ViewStubCompat, i13, 0);
        this.f3249yggfygwlhe = typedArrayObtainStyledAttributes.getResourceId(lqeggnwhkg.btonecajqb.ViewStubCompat_android_inflatedId, -1);
        this.f3250zdlpuopuiu = typedArrayObtainStyledAttributes.getResourceId(lqeggnwhkg.btonecajqb.ViewStubCompat_android_layout, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(lqeggnwhkg.btonecajqb.ViewStubCompat_android_id, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
